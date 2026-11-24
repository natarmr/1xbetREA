.class public final synthetic La/fv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gv1;


# direct methods
.method public synthetic constructor <init>(La/gv1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fv1;->a:B

    iput-object p1, p0, La/fv1;->b:La/gv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/dt1;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, La/ct1;->a:La/ct1;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    move-object/from16 v3, p0

    .line 16
    .line 17
    iget-object v3, v3, La/fv1;->b:La/gv1;

    .line 18
    .line 19
    sget-object v4, La/xll;->a:La/xll;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v0, La/aml;

    .line 24
    .line 25
    invoke-virtual {v3}, La/gv1;->a()La/fee;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, La/ot0;

    .line 34
    .line 35
    invoke-static {v1}, La/x4d0;->g0(La/ot0;)La/pt0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {v0, v1, v4, v2}, La/aml;-><init>(La/pt0;La/yll;Z)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    sget-object v1, La/at1;->a:La/at1;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v5, 0x0

    .line 50
    if-eqz v1, :cond_1b

    .line 51
    .line 52
    iget-object v0, v3, La/gv1;->l:La/n0o0;

    .line 53
    .line 54
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, La/fee;

    .line 59
    .line 60
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/util/Map;

    .line 65
    .line 66
    iget-object v1, v3, La/gv1;->b:La/ctf0;

    .line 67
    .line 68
    iget-object v6, v3, La/gv1;->f:La/n0o0;

    .line 69
    .line 70
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    check-cast v6, La/fee;

    .line 75
    .line 76
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    check-cast v6, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    iget-object v7, v3, La/gv1;->g:La/n0o0;

    .line 87
    .line 88
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, La/fee;

    .line 93
    .line 94
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    check-cast v7, Ljava/util/Set;

    .line 99
    .line 100
    iget-object v8, v3, La/gv1;->i:La/n0o0;

    .line 101
    .line 102
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, La/fee;

    .line 107
    .line 108
    invoke-virtual {v8}, La/fee;->c()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    check-cast v8, Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    invoke-virtual {v3}, La/gv1;->a()La/fee;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, La/ot0;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_5

    .line 145
    .line 146
    if-eq v3, v2, :cond_4

    .line 147
    .line 148
    const/4 v2, 0x2

    .line 149
    if-eq v3, v2, :cond_3

    .line 150
    .line 151
    const/4 v2, 0x3

    .line 152
    if-eq v3, v2, :cond_2

    .line 153
    .line 154
    const/4 v2, 0x4

    .line 155
    if-ne v3, v2, :cond_1

    .line 156
    .line 157
    sget-object v2, La/pt0;->e:La/pt0;

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 161
    .line 162
    .line 163
    return-object v5

    .line 164
    :cond_2
    sget-object v2, La/pt0;->d:La/pt0;

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_3
    sget-object v2, La/pt0;->c:La/pt0;

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_4
    sget-object v2, La/pt0;->b:La/pt0;

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_5
    sget-object v2, La/pt0;->a:La/pt0;

    .line 174
    .line 175
    :goto_0
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, Ljava/lang/Iterable;

    .line 180
    .line 181
    new-instance v3, Ljava/util/ArrayList;

    .line 182
    .line 183
    const/16 v9, 0xa

    .line 184
    .line 185
    invoke-static {v0, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v9

    .line 200
    if-eqz v9, :cond_1a

    .line 201
    .line 202
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    check-cast v9, La/mlr;

    .line 207
    .line 208
    iget-wide v10, v9, La/mlr;->a:J

    .line 209
    .line 210
    iget-boolean v12, v9, La/mlr;->k:Z

    .line 211
    .line 212
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    invoke-interface {v7, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    if-eqz v8, :cond_6

    .line 221
    .line 222
    const v11, 0x7f0807c1

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_6
    const v11, 0x7f08061a

    .line 227
    .line 228
    .line 229
    :goto_2
    iget-boolean v13, v9, La/mlr;->j:Z

    .line 230
    .line 231
    const/4 v14, 0x0

    .line 232
    if-eqz v12, :cond_7

    .line 233
    .line 234
    new-array v15, v14, [Ljava/lang/Object;

    .line 235
    .line 236
    iget-object v5, v1, La/ctf0;->b:La/lsm0;

    .line 237
    .line 238
    invoke-static {v15, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v15

    .line 242
    const v14, 0x7f1303e6

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v14, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    goto :goto_3

    .line 250
    :cond_7
    if-eqz v13, :cond_8

    .line 251
    .line 252
    const/4 v5, 0x0

    .line 253
    new-array v14, v5, [Ljava/lang/Object;

    .line 254
    .line 255
    iget-object v15, v1, La/ctf0;->b:La/lsm0;

    .line 256
    .line 257
    invoke-static {v14, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v14

    .line 261
    const v5, 0x7f1303e2

    .line 262
    .line 263
    .line 264
    invoke-virtual {v15, v5, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    goto :goto_3

    .line 269
    :cond_8
    const-string v5, ""

    .line 270
    .line 271
    :goto_3
    new-instance v14, La/st0;

    .line 272
    .line 273
    move-object/from16 v25, v0

    .line 274
    .line 275
    move-object/from16 v24, v1

    .line 276
    .line 277
    iget-wide v0, v9, La/mlr;->a:J

    .line 278
    .line 279
    iget-object v15, v9, La/mlr;->f:Ljava/lang/String;

    .line 280
    .line 281
    move-wide/from16 v16, v0

    .line 282
    .line 283
    iget-object v0, v9, La/mlr;->e:Ljava/lang/String;

    .line 284
    .line 285
    if-nez v6, :cond_9

    .line 286
    .line 287
    move-object/from16 v18, v0

    .line 288
    .line 289
    const/4 v1, 0x0

    .line 290
    goto :goto_5

    .line 291
    :cond_9
    if-eqz v10, :cond_a

    .line 292
    .line 293
    const v1, 0x7f080797

    .line 294
    .line 295
    .line 296
    :goto_4
    move-object/from16 v18, v0

    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_a
    const v1, 0x7f080798

    .line 300
    .line 301
    .line 302
    goto :goto_4

    .line 303
    :goto_5
    new-instance v0, La/mtr;

    .line 304
    .line 305
    invoke-direct {v0, v1, v10}, La/mtr;-><init>(IZ)V

    .line 306
    .line 307
    .line 308
    new-instance v1, La/n0x;

    .line 309
    .line 310
    iget-object v9, v9, La/mlr;->g:Ljava/lang/String;

    .line 311
    .line 312
    invoke-direct {v1, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    new-instance v9, La/m0x;

    .line 316
    .line 317
    const/4 v10, 0x6

    .line 318
    move-object/from16 v19, v0

    .line 319
    .line 320
    const/4 v0, 0x0

    .line 321
    invoke-direct {v9, v11, v0, v10}, La/m0x;-><init>(ILa/bzw;I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-nez v0, :cond_b

    .line 329
    .line 330
    sget-object v0, La/lur;->a:La/lur;

    .line 331
    .line 332
    move-object/from16 v20, v1

    .line 333
    .line 334
    :goto_6
    move-object/from16 v23, v0

    .line 335
    .line 336
    goto/16 :goto_a

    .line 337
    .line 338
    :cond_b
    new-instance v0, La/mur;

    .line 339
    .line 340
    sget-object v10, La/pt0;->a:La/pt0;

    .line 341
    .line 342
    if-ne v2, v10, :cond_d

    .line 343
    .line 344
    if-nez v12, :cond_c

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :cond_c
    move-object/from16 v20, v1

    .line 348
    .line 349
    goto :goto_8

    .line 350
    :cond_d
    :goto_7
    sget-object v11, La/pt0;->c:La/pt0;

    .line 351
    .line 352
    if-ne v2, v11, :cond_e

    .line 353
    .line 354
    if-nez v12, :cond_c

    .line 355
    .line 356
    :cond_e
    move-object/from16 v20, v1

    .line 357
    .line 358
    sget-object v1, La/pt0;->d:La/pt0;

    .line 359
    .line 360
    if-ne v2, v1, :cond_f

    .line 361
    .line 362
    if-eqz v12, :cond_f

    .line 363
    .line 364
    :goto_8
    new-instance v1, La/lro0;

    .line 365
    .line 366
    sget-object v10, La/d4d;->a:La/d4d;

    .line 367
    .line 368
    invoke-direct {v1}, La/lro0;-><init>()V

    .line 369
    .line 370
    .line 371
    goto :goto_9

    .line 372
    :cond_f
    if-ne v2, v10, :cond_10

    .line 373
    .line 374
    if-nez v13, :cond_12

    .line 375
    .line 376
    :cond_10
    if-ne v2, v11, :cond_11

    .line 377
    .line 378
    if-nez v13, :cond_12

    .line 379
    .line 380
    :cond_11
    if-ne v2, v1, :cond_13

    .line 381
    .line 382
    if-eqz v13, :cond_13

    .line 383
    .line 384
    :cond_12
    new-instance v1, La/eqo0;

    .line 385
    .line 386
    sget-object v10, La/d4d;->a:La/d4d;

    .line 387
    .line 388
    invoke-direct {v1}, La/eqo0;-><init>()V

    .line 389
    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_13
    sget-object v1, La/pt0;->b:La/pt0;

    .line 393
    .line 394
    if-ne v2, v1, :cond_14

    .line 395
    .line 396
    if-nez v12, :cond_15

    .line 397
    .line 398
    :cond_14
    sget-object v10, La/pt0;->e:La/pt0;

    .line 399
    .line 400
    if-ne v2, v10, :cond_16

    .line 401
    .line 402
    if-eqz v12, :cond_16

    .line 403
    .line 404
    :cond_15
    sget-object v1, La/kro0;->a:La/kro0;

    .line 405
    .line 406
    goto :goto_9

    .line 407
    :cond_16
    if-ne v2, v1, :cond_17

    .line 408
    .line 409
    if-nez v13, :cond_18

    .line 410
    .line 411
    :cond_17
    if-ne v2, v10, :cond_19

    .line 412
    .line 413
    if-eqz v13, :cond_19

    .line 414
    .line 415
    :cond_18
    sget-object v1, La/dqo0;->a:La/dqo0;

    .line 416
    .line 417
    goto :goto_9

    .line 418
    :cond_19
    new-instance v1, La/uqo0;

    .line 419
    .line 420
    sget-object v10, La/d4d;->a:La/d4d;

    .line 421
    .line 422
    invoke-direct {v1, v10}, La/uqo0;-><init>(La/d4d;)V

    .line 423
    .line 424
    .line 425
    :goto_9
    invoke-direct {v0, v5, v1}, La/mur;-><init>(Ljava/lang/String;La/sso0;)V

    .line 426
    .line 427
    .line 428
    goto :goto_6

    .line 429
    :goto_a
    const/16 v22, 0x0

    .line 430
    .line 431
    move-wide/from16 v26, v16

    .line 432
    .line 433
    move-object/from16 v17, v15

    .line 434
    .line 435
    move-wide/from16 v15, v26

    .line 436
    .line 437
    move-object/from16 v21, v9

    .line 438
    .line 439
    invoke-direct/range {v14 .. v23}, La/st0;-><init>(JLjava/lang/String;Ljava/lang/String;La/mtr;La/o0x;La/o0x;Ljava/lang/Integer;La/nur;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-object/from16 v1, v24

    .line 446
    .line 447
    move-object/from16 v0, v25

    .line 448
    .line 449
    const/4 v5, 0x0

    .line 450
    goto/16 :goto_1

    .line 451
    .line 452
    :cond_1a
    new-instance v0, La/zll;

    .line 453
    .line 454
    invoke-direct {v0, v2, v4, v3}, La/zll;-><init>(La/pt0;La/yll;Ljava/util/List;)V

    .line 455
    .line 456
    .line 457
    return-object v0

    .line 458
    :cond_1b
    sget-object v1, La/bt1;->a:La/bt1;

    .line 459
    .line 460
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_1c

    .line 465
    .line 466
    new-instance v0, La/zll;

    .line 467
    .line 468
    invoke-virtual {v3}, La/gv1;->a()La/fee;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    check-cast v1, La/ot0;

    .line 477
    .line 478
    invoke-static {v1}, La/x4d0;->g0(La/ot0;)La/pt0;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    sget-object v2, La/lak0;->c:La/lak0;

    .line 483
    .line 484
    invoke-direct {v0, v1, v4, v2}, La/zll;-><init>(La/pt0;La/yll;Ljava/util/List;)V

    .line 485
    .line 486
    .line 487
    return-object v0

    .line 488
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 489
    .line 490
    .line 491
    const/4 v0, 0x0

    .line 492
    return-object v0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/fv1;->b:La/gv1;

    .line 4
    .line 5
    iget-object v1, v0, La/gv1;->e:La/n0o0;

    .line 6
    .line 7
    move-object/from16 v2, p1

    .line 8
    .line 9
    check-cast v2, La/dt1;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v3, La/ct1;->a:La/ct1;

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/fee;

    .line 27
    .line 28
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/gu1;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v1, v0, La/gu1;->b:La/z1s0;

    .line 37
    .line 38
    sget-object v2, La/z1s0;->a:La/z1s0;

    .line 39
    .line 40
    if-eq v1, v2, :cond_0

    .line 41
    .line 42
    iget-boolean v0, v0, La/gu1;->d:Z

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    new-instance v0, La/ys1;

    .line 47
    .line 48
    new-instance v1, La/mw1;

    .line 49
    .line 50
    sget-object v2, La/uw1;->a:La/uw1;

    .line 51
    .line 52
    invoke-direct {v1, v2}, La/mw1;-><init>(La/vw1;)V

    .line 53
    .line 54
    .line 55
    filled-new-array {v1}, [La/mw1;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {v0, v1}, La/ys1;-><init>(La/a4x;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_0
    new-instance v0, La/xs1;

    .line 68
    .line 69
    new-instance v1, La/pu1;

    .line 70
    .line 71
    sget-object v2, La/hrl;->a:La/hrl;

    .line 72
    .line 73
    sget-object v2, La/jrl;->a:La/jrl;

    .line 74
    .line 75
    invoke-direct {v1, v2}, La/pu1;-><init>(La/krl;)V

    .line 76
    .line 77
    .line 78
    filled-new-array {v1}, [La/pu1;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v0, v1}, La/xs1;-><init>(La/a4x;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_1
    sget-object v3, La/at1;->a:La/at1;

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const/4 v4, 0x0

    .line 97
    if-eqz v3, :cond_13

    .line 98
    .line 99
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, La/fee;

    .line 104
    .line 105
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, La/gu1;

    .line 110
    .line 111
    if-eqz v1, :cond_12

    .line 112
    .line 113
    iget-object v2, v0, La/gv1;->m:La/n0o0;

    .line 114
    .line 115
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, La/fee;

    .line 120
    .line 121
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/util/List;

    .line 126
    .line 127
    iget-object v3, v0, La/gv1;->n:La/n0o0;

    .line 128
    .line 129
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, La/fee;

    .line 134
    .line 135
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, Ljava/util/Map;

    .line 140
    .line 141
    iget-object v0, v0, La/gv1;->p:La/n0o0;

    .line 142
    .line 143
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, La/fee;

    .line 148
    .line 149
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Ljava/util/Set;

    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object v5, v1, La/gu1;->b:La/z1s0;

    .line 165
    .line 166
    sget-object v6, La/z1s0;->a:La/z1s0;

    .line 167
    .line 168
    const-string v7, ""

    .line 169
    .line 170
    if-eq v5, v6, :cond_d

    .line 171
    .line 172
    iget-boolean v5, v1, La/gu1;->d:Z

    .line 173
    .line 174
    if-nez v5, :cond_2

    .line 175
    .line 176
    goto/16 :goto_6

    .line 177
    .line 178
    :cond_2
    new-instance v5, La/ys1;

    .line 179
    .line 180
    iget-object v1, v1, La/gu1;->k:La/o98;

    .line 181
    .line 182
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    iget-object v8, v1, La/o98;->a:Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v8}, La/q8a;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    iget-object v9, v1, La/o98;->b:Ljava/util/List;

    .line 193
    .line 194
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    check-cast v10, La/jng0;

    .line 199
    .line 200
    if-eqz v10, :cond_3

    .line 201
    .line 202
    iget-object v10, v10, La/jng0;->e:Ljava/lang/String;

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_3
    move-object v10, v4

    .line 206
    :goto_0
    if-nez v10, :cond_4

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_4
    move-object v7, v10

    .line 210
    :goto_1
    invoke-static {v7}, La/q8a;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    if-lez v10, :cond_5

    .line 219
    .line 220
    invoke-static {v2}, La/q8a;->S(Ljava/util/List;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    new-instance v10, La/mw1;

    .line 225
    .line 226
    new-instance v11, La/tw1;

    .line 227
    .line 228
    iget-object v1, v1, La/o98;->c:Ljava/lang/String;

    .line 229
    .line 230
    new-instance v12, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v12, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-static {v2}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    new-instance v7, La/ow1;

    .line 254
    .line 255
    new-instance v8, La/m0x;

    .line 256
    .line 257
    const v12, 0x7f080a2c

    .line 258
    .line 259
    .line 260
    const/4 v13, 0x6

    .line 261
    invoke-direct {v8, v12, v4, v13}, La/m0x;-><init>(ILa/bzw;I)V

    .line 262
    .line 263
    .line 264
    invoke-direct {v7, v8}, La/ow1;-><init>(La/m0x;)V

    .line 265
    .line 266
    .line 267
    sget-object v8, La/xr1;->a:La/xr1;

    .line 268
    .line 269
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v8

    .line 273
    invoke-direct {v11, v1, v2, v7, v8}, La/tw1;-><init>(Ljava/lang/String;Ljava/lang/String;La/qw1;Z)V

    .line 274
    .line 275
    .line 276
    invoke-direct {v10, v11}, La/mw1;-><init>(La/vw1;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v7

    .line 295
    if-eqz v7, :cond_a

    .line 296
    .line 297
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    check-cast v7, La/jng0;

    .line 302
    .line 303
    iget-object v8, v7, La/jng0;->a:Ljava/lang/String;

    .line 304
    .line 305
    invoke-static {v8}, La/q8a;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    iget-object v9, v7, La/jng0;->e:Ljava/lang/String;

    .line 310
    .line 311
    invoke-static {v9}, La/q8a;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    if-nez v10, :cond_7

    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_7
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    if-nez v10, :cond_8

    .line 327
    .line 328
    :goto_3
    move-object v11, v4

    .line 329
    goto :goto_4

    .line 330
    :cond_8
    iget-wide v10, v7, La/jng0;->b:J

    .line 331
    .line 332
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 333
    .line 334
    .line 335
    move-result-object v10

    .line 336
    invoke-interface {v3, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    check-cast v10, Ljava/util/List;

    .line 341
    .line 342
    if-nez v10, :cond_9

    .line 343
    .line 344
    sget-object v10, La/iun;->a:La/iun;

    .line 345
    .line 346
    :cond_9
    invoke-static {v10}, La/q8a;->S(Ljava/util/List;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    new-instance v11, La/xw1;

    .line 351
    .line 352
    iget-wide v12, v7, La/jng0;->b:J

    .line 353
    .line 354
    iget-object v14, v7, La/jng0;->d:Ljava/util/Date;

    .line 355
    .line 356
    iget-object v15, v7, La/jng0;->c:Ljava/util/Date;

    .line 357
    .line 358
    new-instance v7, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    invoke-static {v7}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v16

    .line 381
    invoke-direct/range {v11 .. v16}, La/xw1;-><init>(JLjava/util/Date;Ljava/util/Date;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    :goto_4
    if-eqz v11, :cond_6

    .line 385
    .line 386
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    goto :goto_2

    .line 390
    :cond_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    const/4 v2, 0x0

    .line 395
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-eqz v3, :cond_c

    .line 400
    .line 401
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    add-int/lit8 v7, v2, 0x1

    .line 406
    .line 407
    if-ltz v2, :cond_b

    .line 408
    .line 409
    check-cast v3, La/xw1;

    .line 410
    .line 411
    new-instance v2, La/wr1;

    .line 412
    .line 413
    iget-wide v8, v3, La/xw1;->a:J

    .line 414
    .line 415
    invoke-direct {v2, v8, v9}, La/wr1;-><init>(J)V

    .line 416
    .line 417
    .line 418
    new-instance v10, La/lw1;

    .line 419
    .line 420
    new-instance v11, La/tw1;

    .line 421
    .line 422
    iget-object v12, v3, La/xw1;->b:Ljava/util/Date;

    .line 423
    .line 424
    iget-object v13, v3, La/xw1;->c:Ljava/util/Date;

    .line 425
    .line 426
    sget-object v14, La/rdj;->a:La/rdj;

    .line 427
    .line 428
    sget-object v15, La/sdj;->d:La/sdj;

    .line 429
    .line 430
    move-object/from16 p0, v1

    .line 431
    .line 432
    const/16 v1, 0x3c

    .line 433
    .line 434
    invoke-static {v14, v15, v12, v4, v1}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v12

    .line 438
    invoke-static {v14, v15, v13, v4, v1}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    const-string v13, " - "

    .line 443
    .line 444
    invoke-static {v12, v13, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    iget-object v3, v3, La/xw1;->d:Ljava/lang/String;

    .line 449
    .line 450
    new-instance v12, La/pw1;

    .line 451
    .line 452
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v13

    .line 456
    invoke-direct {v12, v13}, La/pw1;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    invoke-direct {v11, v1, v3, v12, v2}, La/tw1;-><init>(Ljava/lang/String;Ljava/lang/String;La/qw1;Z)V

    .line 464
    .line 465
    .line 466
    invoke-direct {v10, v8, v9, v11}, La/lw1;-><init>(JLa/tw1;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v6, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-object/from16 v1, p0

    .line 473
    .line 474
    move v2, v7

    .line 475
    goto :goto_5

    .line 476
    :cond_b
    invoke-static {}, La/q3d;->p()V

    .line 477
    .line 478
    .line 479
    throw v4

    .line 480
    :cond_c
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-direct {v5, v0}, La/ys1;-><init>(La/a4x;)V

    .line 489
    .line 490
    .line 491
    return-object v5

    .line 492
    :cond_d
    :goto_6
    new-instance v0, La/xs1;

    .line 493
    .line 494
    iget-object v1, v1, La/gu1;->j:La/z78;

    .line 495
    .line 496
    iget-boolean v3, v1, La/z78;->a:Z

    .line 497
    .line 498
    if-eqz v3, :cond_e

    .line 499
    .line 500
    sget-object v1, La/iun;->a:La/iun;

    .line 501
    .line 502
    goto :goto_8

    .line 503
    :cond_e
    iget-object v3, v1, La/z78;->c:Ljava/lang/String;

    .line 504
    .line 505
    const-string v5, "\n"

    .line 506
    .line 507
    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    invoke-static {v3}, La/q8a;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    iget-object v5, v1, La/z78;->d:Ljava/lang/String;

    .line 516
    .line 517
    invoke-static {v5}, La/q8a;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v5

    .line 521
    invoke-static {v3}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 522
    .line 523
    .line 524
    move-result-object v6

    .line 525
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v6

    .line 529
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 530
    .line 531
    .line 532
    move-result v6

    .line 533
    if-nez v6, :cond_f

    .line 534
    .line 535
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 536
    .line 537
    .line 538
    move-result v6

    .line 539
    if-nez v6, :cond_f

    .line 540
    .line 541
    sget-object v1, La/iun;->a:La/iun;

    .line 542
    .line 543
    goto :goto_8

    .line 544
    :cond_f
    invoke-static {v2}, La/q8a;->S(Ljava/util/List;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    iget-boolean v6, v1, La/z78;->e:Z

    .line 549
    .line 550
    if-eqz v6, :cond_10

    .line 551
    .line 552
    move-object v4, v2

    .line 553
    :cond_10
    if-nez v4, :cond_11

    .line 554
    .line 555
    goto :goto_7

    .line 556
    :cond_11
    move-object v7, v4

    .line 557
    :goto_7
    new-instance v2, La/pu1;

    .line 558
    .line 559
    sget-object v4, La/hrl;->a:La/hrl;

    .line 560
    .line 561
    new-instance v4, La/irl;

    .line 562
    .line 563
    iget-object v1, v1, La/z78;->b:Ljava/lang/String;

    .line 564
    .line 565
    new-instance v6, Ljava/lang/StringBuilder;

    .line 566
    .line 567
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    invoke-static {v3}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    invoke-direct {v4, v1, v3}, La/irl;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-direct {v2, v4}, La/pu1;-><init>(La/krl;)V

    .line 592
    .line 593
    .line 594
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    :goto_8
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    invoke-direct {v0, v1}, La/xs1;-><init>(La/a4x;)V

    .line 603
    .line 604
    .line 605
    return-object v0

    .line 606
    :cond_12
    new-instance v0, La/xs1;

    .line 607
    .line 608
    sget-object v1, La/lak0;->c:La/lak0;

    .line 609
    .line 610
    invoke-direct {v0, v1}, La/xs1;-><init>(La/a4x;)V

    .line 611
    .line 612
    .line 613
    return-object v0

    .line 614
    :cond_13
    sget-object v0, La/bt1;->a:La/bt1;

    .line 615
    .line 616
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    if-eqz v0, :cond_14

    .line 621
    .line 622
    new-instance v0, La/xs1;

    .line 623
    .line 624
    sget-object v1, La/lak0;->c:La/lak0;

    .line 625
    .line 626
    invoke-direct {v0, v1}, La/xs1;-><init>(La/a4x;)V

    .line 627
    .line 628
    .line 629
    return-object v0

    .line 630
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 631
    .line 632
    .line 633
    return-object v4
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 65

    move-object/from16 v0, p0

    iget-byte v1, v0, La/fv1;->a:B

    sget-object v2, La/bt1;->a:La/bt1;

    sget-object v5, La/at1;->a:La/at1;

    sget-object v6, La/arl;->a:La/arl;

    sget-object v7, La/ct1;->a:La/ct1;

    const/16 v8, 0xa

    const/4 v10, 0x1

    iget-object v11, v0, La/fv1;->b:La/gv1;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, La/gu1;

    .line 1
    sget-object v1, La/s9s0;->c:La/s9s0;

    .line 2
    iget-object v2, v11, La/gv1;->o:La/n0o0;

    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/fee;

    .line 3
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 4
    iget-object v3, v11, La/gv1;->b:La/ctf0;

    .line 5
    invoke-static {v0, v1, v2, v3}, La/p8a;->d0(La/gu1;La/s9s0;ZLa/ctf0;)La/mtl;

    move-result-object v0

    return-object v0

    .line 6
    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, La/gu1;

    .line 7
    sget-object v1, La/s9s0;->b:La/s9s0;

    .line 8
    iget-object v2, v11, La/gv1;->o:La/n0o0;

    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/fee;

    .line 9
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 10
    iget-object v3, v11, La/gv1;->b:La/ctf0;

    .line 11
    invoke-static {v0, v1, v2, v3}, La/p8a;->d0(La/gu1;La/s9s0;ZLa/ctf0;)La/mtl;

    move-result-object v0

    return-object v0

    .line 12
    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, La/gu1;

    .line 13
    sget-object v1, La/s9s0;->a:La/s9s0;

    .line 14
    iget-object v2, v11, La/gv1;->o:La/n0o0;

    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/fee;

    .line 15
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 16
    iget-object v3, v11, La/gv1;->b:La/ctf0;

    .line 17
    invoke-static {v0, v1, v2, v3}, La/p8a;->d0(La/gu1;La/s9s0;ZLa/ctf0;)La/mtl;

    move-result-object v0

    return-object v0

    .line 18
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/fv1;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, v11, La/gv1;->q:La/n0o0;

    move-object/from16 v1, p1

    check-cast v1, La/dt1;

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 21
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    move-result-object v1

    .line 22
    new-instance v2, La/ju1;

    .line 23
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/fee;

    .line 24
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/zu1;

    .line 25
    iget-object v0, v0, La/zu1;->c:La/vql;

    .line 26
    invoke-direct {v2, v0, v6}, La/ju1;-><init>(La/vql;La/brl;)V

    .line 27
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_0

    .line 28
    new-instance v0, La/ku1;

    .line 29
    sget-object v2, La/ur1;->a:La/ur1;

    .line 30
    invoke-direct {v0, v2}, La/ku1;-><init>(La/vr1;)V

    .line 31
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    move-result-object v0

    .line 33
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    move-result-object v0

    .line 34
    new-instance v12, La/mu1;

    invoke-direct {v12, v0}, La/mu1;-><init>(La/a4x;)V

    goto/16 :goto_a

    .line 35
    :cond_1
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 36
    iget-object v1, v11, La/gv1;->e:La/n0o0;

    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/fee;

    .line 37
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/gu1;

    if-eqz v1, :cond_8

    .line 38
    iget-object v2, v11, La/gv1;->b:La/ctf0;

    .line 39
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/fee;

    .line 40
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/zu1;

    .line 41
    iget-object v5, v11, La/gv1;->r:La/n0o0;

    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/fee;

    .line 42
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    iget-object v0, v0, La/zu1;->c:La/vql;

    .line 45
    invoke-static {v1, v2, v0}, La/ntr;->t0(La/gu1;La/ctf0;La/vql;)La/gt1;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 46
    new-instance v12, La/ju1;

    .line 47
    iget-object v6, v0, La/gt1;->a:La/vql;

    .line 48
    iget-object v0, v0, La/gt1;->b:La/brl;

    .line 49
    invoke-direct {v12, v6, v0}, La/ju1;-><init>(La/vql;La/brl;)V

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    .line 50
    :goto_1
    iget-object v0, v1, La/gu1;->h:La/k98;

    .line 51
    iget-object v0, v0, La/k98;->a:Ljava/util/List;

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 54
    check-cast v6, La/o2g0;

    .line 55
    new-instance v7, La/ku1;

    .line 56
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v6, La/o2g0;->a:Ljava/lang/String;

    .line 57
    new-instance v13, La/tr1;

    .line 58
    invoke-static {v8}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    goto :goto_3

    :cond_3
    const-wide/16 v14, 0x0

    .line 59
    :goto_3
    iget v9, v6, La/o2g0;->d:I

    .line 60
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    .line 61
    iget-object v11, v2, La/ctf0;->b:La/lsm0;

    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    const-wide/16 v21, 0x0

    const v3, 0x7f13164d

    invoke-virtual {v11, v3, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    .line 62
    iget-boolean v3, v6, La/o2g0;->b:Z

    .line 63
    iget v4, v6, La/o2g0;->c:I

    packed-switch v4, :pswitch_data_1

    .line 64
    new-instance v6, La/qr1;

    .line 65
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_4

    .line 66
    sget-object v9, La/czr0;->b:La/czr0;

    goto :goto_4

    .line 67
    :cond_4
    sget-object v9, La/czr0;->a:La/czr0;

    .line 68
    :goto_4
    invoke-direct {v6, v4, v9}, La/qr1;-><init>(Ljava/lang/String;La/czr0;)V

    :goto_5
    move-object/from16 v20, v6

    goto :goto_6

    :pswitch_4
    const v4, 0x7f080c86

    .line 69
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :pswitch_5
    const v4, 0x7f080c82

    .line 70
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :pswitch_6
    const v4, 0x7f080c7f

    .line 71
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :pswitch_7
    const v4, 0x7f080c84

    .line 72
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :pswitch_8
    const v4, 0x7f080c85

    .line 73
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :pswitch_9
    const v4, 0x7f080c80

    .line 74
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :pswitch_a
    const v4, 0x7f080c81

    .line 75
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :pswitch_b
    const v4, 0x7f080c87

    .line 76
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :pswitch_c
    const v4, 0x7f080c88

    .line 77
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :pswitch_d
    const v4, 0x7f080c83

    .line 78
    invoke-static {v4}, La/rq8;->P(I)La/or1;

    move-result-object v6

    goto :goto_5

    :goto_6
    const/16 v19, 0x0

    move/from16 v18, v3

    move-object/from16 v17, v8

    .line 79
    invoke-direct/range {v13 .. v20}, La/tr1;-><init>(JLjava/lang/String;Ljava/lang/String;ZZLa/rr1;)V

    .line 80
    invoke-direct {v7, v13}, La/ku1;-><init>(La/vr1;)V

    .line 81
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 82
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 83
    new-instance v0, La/nu1;

    .line 84
    new-instance v13, La/mdm;

    .line 85
    sget-object v1, La/pb10;->c:La/xuz;

    sget-object v2, La/pb10;->i:La/pb10;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v5}, La/xuz;->a(La/pb10;I)I

    move-result v14

    if-nez v12, :cond_6

    .line 86
    sget-object v1, La/pdm;->a:La/pdm;

    :goto_7
    move-object v15, v1

    goto :goto_8

    .line 87
    :cond_6
    sget-object v1, La/pdm;->c:La/pdm;

    goto :goto_7

    :goto_8
    const-wide/16 v24, 0x0

    const/16 v26, 0x3dc

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v19, 0x7f131651

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    .line 88
    invoke-direct/range {v13 .. v26}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 89
    invoke-direct {v0, v13, v12}, La/nu1;-><init>(La/mdm;La/ju1;)V

    :goto_9
    move-object v12, v0

    goto :goto_a

    .line 90
    :cond_7
    new-instance v0, La/mu1;

    .line 91
    invoke-static {v12}, La/q3d;->k(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    move-result-object v1

    .line 92
    invoke-direct {v0, v1}, La/mu1;-><init>(La/a4x;)V

    goto :goto_9

    .line 93
    :cond_8
    new-instance v12, La/mu1;

    .line 94
    sget-object v0, La/lak0;->c:La/lak0;

    .line 95
    invoke-direct {v12, v0}, La/mu1;-><init>(La/a4x;)V

    goto :goto_a

    .line 96
    :cond_9
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 97
    new-instance v12, La/mu1;

    .line 98
    sget-object v0, La/lak0;->c:La/lak0;

    .line 99
    invoke-direct {v12, v0}, La/mu1;-><init>(La/a4x;)V

    goto :goto_a

    .line 100
    :cond_a
    invoke-static {}, La/t9f;->b()V

    const/4 v12, 0x0

    :goto_a
    return-object v12

    .line 101
    :pswitch_e
    invoke-direct/range {p0 .. p1}, La/fv1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_f
    const-wide/16 v21, 0x0

    iget-object v0, v11, La/gv1;->j:La/n0o0;

    iget-object v1, v11, La/gv1;->q:La/n0o0;

    move-object/from16 v3, p1

    check-cast v3, La/dt1;

    .line 102
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/16 v16, 0x0

    const/16 p0, 0x6

    const/16 p1, 0x8

    .line 104
    sget-object v7, La/o0s;->a:La/o0s;

    if-eqz v4, :cond_b

    .line 105
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/fee;

    .line 106
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/zu1;

    .line 107
    new-instance v2, La/et1;

    .line 108
    iget-object v3, v1, La/zu1;->a:La/cw1;

    .line 109
    sget-object v4, La/ew1;->a:La/ew1;

    .line 110
    invoke-direct {v2, v3, v4}, La/et1;-><init>(La/cw1;La/fw1;)V

    .line 111
    new-instance v3, La/lt1;

    .line 112
    iget-object v4, v1, La/zu1;->b:La/gx1;

    .line 113
    sget-object v5, La/zrl;->a:La/zrl;

    .line 114
    invoke-direct {v3, v4, v5}, La/lt1;-><init>(La/gx1;La/asl;)V

    .line 115
    new-instance v4, La/gt1;

    .line 116
    iget-object v5, v1, La/zu1;->c:La/vql;

    .line 117
    invoke-direct {v4, v5, v6}, La/gt1;-><init>(La/vql;La/brl;)V

    .line 118
    new-instance v5, La/ft1;

    .line 119
    iget-object v6, v1, La/zu1;->d:La/gw1;

    const/16 v17, 0x4

    .line 120
    sget-object v15, La/jw1;->a:La/jw1;

    .line 121
    invoke-direct {v5, v6, v15}, La/ft1;-><init>(La/gw1;La/kw1;)V

    .line 122
    new-instance v6, La/mt1;

    .line 123
    new-instance v15, La/ijm;

    invoke-direct {v15}, La/ijm;-><init>()V

    .line 124
    invoke-direct {v6, v15}, La/mt1;-><init>(La/jjm;)V

    .line 125
    new-instance v15, La/nt1;

    const/16 v18, 0x5

    .line 126
    new-instance v14, La/aml;

    .line 127
    invoke-virtual {v11}, La/gv1;->a()La/fee;

    move-result-object v11

    invoke-virtual {v11}, La/fee;->c()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/ot0;

    invoke-static {v11}, La/x4d0;->g0(La/ot0;)La/pt0;

    move-result-object v11

    const/16 v19, 0x0

    .line 128
    new-instance v9, La/wll;

    invoke-direct {v9, v7}, La/wll;-><init>(La/p0s;)V

    .line 129
    invoke-direct {v14, v11, v9, v10}, La/aml;-><init>(La/pt0;La/yll;Z)V

    .line 130
    invoke-direct {v15, v14}, La/nt1;-><init>(La/bml;)V

    .line 131
    new-instance v7, La/kt1;

    .line 132
    iget-object v9, v1, La/zu1;->e:La/l5i;

    .line 133
    sget-object v11, La/mrl;->a:La/mrl;

    .line 134
    invoke-direct {v7, v9, v11}, La/kt1;-><init>(La/l5i;La/nrl;)V

    .line 135
    new-instance v9, La/jt1;

    .line 136
    iget-object v1, v1, La/zu1;->f:La/hrl;

    .line 137
    sget-object v11, La/jrl;->a:La/jrl;

    .line 138
    invoke-direct {v9, v1, v11}, La/jt1;-><init>(La/hrl;La/krl;)V

    .line 139
    new-instance v1, La/ht1;

    .line 140
    new-instance v11, La/ijm;

    invoke-direct {v11}, La/ijm;-><init>()V

    .line 141
    invoke-direct {v1, v11}, La/ht1;-><init>(La/jjm;)V

    .line 142
    new-instance v11, La/it1;

    .line 143
    new-instance v14, La/col;

    .line 144
    sget-object v16, La/rh1;->a:La/jdk0;

    .line 145
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/fee;

    .line 146
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 147
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, La/jdk0;->e(Ljava/lang/String;)La/rh1;

    move-result-object v0

    const/16 v20, 0x3

    .line 148
    sget-object v12, La/sh1;->b:La/sh1;

    const/16 v23, 0x2

    .line 149
    new-instance v13, La/b0i;

    invoke-direct {v13, v12, v0}, La/b0i;-><init>(La/sh1;La/rh1;)V

    .line 150
    invoke-direct {v14, v13}, La/col;-><init>(La/b0i;)V

    .line 151
    invoke-direct {v11, v14}, La/it1;-><init>(La/dol;)V

    new-array v0, v8, [La/ot1;

    aput-object v2, v0, v19

    aput-object v3, v0, v10

    aput-object v4, v0, v23

    aput-object v5, v0, v20

    aput-object v6, v0, v17

    aput-object v15, v0, v18

    aput-object v7, v0, p0

    const/4 v2, 0x7

    aput-object v9, v0, v2

    aput-object v1, v0, p1

    const/16 v1, 0x9

    aput-object v11, v0, v1

    .line 152
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    move-result-object v12

    goto/16 :goto_65

    :cond_b
    const/16 v17, 0x4

    const/16 v18, 0x5

    const/16 v19, 0x0

    const/16 v20, 0x3

    const/16 v23, 0x2

    .line 153
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9b

    .line 154
    iget-object v2, v11, La/gv1;->e:La/n0o0;

    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/fee;

    .line 155
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/gu1;

    if-eqz v2, :cond_9a

    .line 156
    iget-object v3, v11, La/gv1;->b:La/ctf0;

    .line 157
    iget-object v4, v11, La/gv1;->B:Ljava/lang/Object;

    check-cast v4, Ljava/util/Locale;

    .line 158
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/fee;

    .line 159
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/zu1;

    .line 160
    iget-object v5, v11, La/gv1;->h:La/n0o0;

    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/fee;

    .line 161
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 162
    iget-object v6, v11, La/gv1;->i:La/n0o0;

    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/fee;

    .line 163
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 164
    invoke-virtual {v11}, La/gv1;->a()La/fee;

    move-result-object v9

    invoke-virtual {v9}, La/fee;->c()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/ot0;

    .line 165
    iget-object v12, v11, La/gv1;->f:La/n0o0;

    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/fee;

    .line 166
    invoke-virtual {v12}, La/fee;->c()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    .line 167
    iget-object v11, v11, La/gv1;->g:La/n0o0;

    invoke-virtual {v11}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, La/fee;

    .line 168
    invoke-virtual {v11}, La/fee;->c()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Set;

    .line 169
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/fee;

    .line 170
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    move-result-object v13

    .line 173
    iget-object v14, v1, La/zu1;->a:La/cw1;

    .line 174
    iget-object v15, v2, La/gu1;->b:La/z1s0;

    .line 175
    new-instance v8, La/et1;

    .line 176
    sget-object v25, La/rdj;->a:La/rdj;

    .line 177
    iget-object v10, v2, La/gu1;->e:La/j88;

    move-object/from16 v27, v11

    move/from16 v26, v12

    iget-wide v11, v10, La/j88;->e:J

    move-wide/from16 v28, v11

    iget-wide v11, v10, La/j88;->i:J

    move-object/from16 v30, v0

    .line 178
    iget-object v0, v10, La/j88;->a:La/zoe;

    move/from16 v31, v6

    .line 179
    invoke-static {v11, v12}, La/rdj;->k(J)Ljava/util/Date;

    move-result-object v6

    move-object/from16 v32, v9

    .line 180
    invoke-static/range {v28 .. v29}, La/rdj;->k(J)Ljava/util/Date;

    move-result-object v9

    move-wide/from16 v33, v11

    .line 181
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    .line 182
    invoke-virtual {v11, v6}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-virtual {v11, v9}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_b

    .line 183
    :cond_c
    new-instance v11, Ljava/util/Date;

    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    invoke-virtual {v11, v6}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v11

    if-eqz v11, :cond_d

    .line 184
    :goto_b
    sget-object v11, La/bw1;->a:La/bw1;

    goto :goto_c

    .line 185
    :cond_d
    sget-object v11, La/bw1;->b:La/bw1;

    :goto_c
    sub-long v28, v28, v33

    const-wide/16 v33, 0x3e8

    mul-long v28, v28, v33

    const-wide/32 v35, 0x5265c00

    .line 186
    div-long v28, v28, v35

    .line 187
    new-instance v35, La/dw1;

    .line 188
    iget-object v12, v10, La/j88;->g:Ljava/lang/String;

    move-object/from16 v37, v12

    .line 189
    iget-object v12, v10, La/j88;->h:Ljava/lang/String;

    move-object/from16 v38, v12

    .line 190
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    const-string v48, ""

    move-object/from16 v49, v10

    if-eqz v12, :cond_10

    const/4 v10, 0x1

    if-eq v12, v10, :cond_10

    move/from16 v10, v23

    if-eq v12, v10, :cond_f

    move/from16 v10, v20

    if-ne v12, v10, :cond_e

    .line 191
    invoke-virtual {v3}, La/ctf0;->h()Z

    move-result v10

    const/4 v12, 0x1

    .line 192
    invoke-static {v6, v12, v10, v14, v4}, La/eeq;->R(Ljava/util/Date;ZZLa/cw1;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v50, v7

    :goto_d
    move-object/from16 v39, v10

    goto :goto_f

    .line 193
    :cond_e
    invoke-static {}, La/t9f;->b()V

    :goto_e
    move-object/from16 v12, v16

    goto/16 :goto_65

    :cond_f
    move/from16 v10, v19

    .line 194
    new-array v12, v10, [Ljava/lang/Object;

    move-object/from16 v50, v7

    .line 195
    iget-object v7, v3, La/ctf0;->b:La/lsm0;

    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    const v10, 0x7f131650

    invoke-virtual {v7, v10, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    goto :goto_d

    :cond_10
    move-object/from16 v50, v7

    move-object/from16 v39, v48

    .line 196
    :goto_f
    invoke-static {v6, v3, v14, v4}, La/eeq;->S(Ljava/util/Date;La/ctf0;La/cw1;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v40

    .line 197
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_13

    const/4 v10, 0x1

    if-eq v6, v10, :cond_13

    const/4 v7, 0x2

    if-eq v6, v7, :cond_12

    const/4 v7, 0x3

    if-ne v6, v7, :cond_11

    .line 198
    invoke-virtual {v3}, La/ctf0;->h()Z

    move-result v6

    .line 199
    invoke-static {v9, v10, v6, v14, v4}, La/eeq;->R(Ljava/util/Date;ZZLa/cw1;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    :goto_10
    move-object/from16 v41, v6

    goto :goto_11

    .line 200
    :cond_11
    invoke-static {}, La/t9f;->b()V

    goto :goto_e

    :cond_12
    const/4 v10, 0x0

    .line 201
    new-array v6, v10, [Ljava/lang/Object;

    .line 202
    iget-object v7, v3, La/ctf0;->b:La/lsm0;

    invoke-static {v6, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    const v10, 0x7f13165a

    invoke-virtual {v7, v10, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_10

    :cond_13
    move-object/from16 v41, v48

    .line 203
    :goto_11
    invoke-static {v9, v3, v14, v4}, La/eeq;->S(Ljava/util/Date;La/ctf0;La/cw1;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v42

    .line 204
    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    iget-object v7, v3, La/ctf0;->b:La/lsm0;

    const/4 v10, 0x1

    .line 205
    invoke-static {v6, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    const v9, 0x7f130686

    invoke-virtual {v7, v9, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v43

    .line 206
    sget-object v6, La/bw1;->b:La/bw1;

    if-ne v11, v6, :cond_14

    const/4 v10, 0x0

    .line 207
    new-array v6, v10, [Ljava/lang/Object;

    .line 208
    invoke-static {v6, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    const v9, 0x7f130799

    invoke-virtual {v7, v9, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v44, v6

    goto :goto_12

    :cond_14
    move-object/from16 v44, v48

    .line 209
    :goto_12
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_18

    const/4 v10, 0x1

    if-eq v6, v10, :cond_17

    const/4 v10, 0x2

    if-eq v6, v10, :cond_16

    const/4 v10, 0x3

    if-ne v6, v10, :cond_15

    move-object/from16 v6, v48

    goto :goto_13

    :cond_15
    invoke-static {}, La/t9f;->b()V

    goto/16 :goto_e

    .line 210
    :cond_16
    const-string v6, "Dates.webp"

    goto :goto_13

    .line 211
    :cond_17
    const-string v6, "Picture S.webp"

    goto :goto_13

    .line 212
    :cond_18
    const-string v6, "Background Picture.webp"

    .line 213
    :goto_13
    new-instance v9, La/n0x;

    .line 214
    sget-object v10, La/u0d;->a:Ljava/util/List;

    const-string v10, "/static/img/android/casino/alt_design/aggregator_tournament_prize_pool/"

    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 215
    invoke-direct {v9, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 216
    sget-object v6, La/iu1;->a:[I

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v12, v6, v12

    move-object/from16 v28, v6

    const/4 v6, 0x2

    if-ne v12, v6, :cond_19

    .line 217
    const-string v12, "Background Illustration_Left.webp"

    goto :goto_14

    :cond_19
    move-object/from16 v12, v48

    .line 218
    :goto_14
    new-instance v6, La/n0x;

    .line 219
    invoke-virtual {v10, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 220
    invoke-direct {v6, v12}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 221
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v12, v28, v12

    move-object/from16 v46, v6

    const/4 v6, 0x2

    if-ne v12, v6, :cond_1a

    .line 222
    const-string v6, "Background Illustration_Right.webp"

    goto :goto_15

    :cond_1a
    move-object/from16 v6, v48

    .line 223
    :goto_15
    new-instance v12, La/n0x;

    .line 224
    invoke-virtual {v10, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 225
    invoke-direct {v12, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    move-object/from16 v45, v9

    move-object/from16 v36, v11

    move-object/from16 v47, v12

    .line 226
    invoke-direct/range {v35 .. v47}, La/dw1;-><init>(La/bw1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/n0x;La/n0x;La/n0x;)V

    move-object/from16 v6, v35

    .line 227
    invoke-direct {v8, v14, v6}, La/et1;-><init>(La/cw1;La/fw1;)V

    .line 228
    invoke-virtual {v13, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 229
    iget-object v6, v1, La/zu1;->b:La/gx1;

    .line 230
    iget-object v8, v0, La/zoe;->d:La/qpe;

    .line 231
    sget-object v9, La/qpe;->c:La/qpe;

    if-ne v8, v9, :cond_1b

    move-object/from16 v8, v16

    goto/16 :goto_1d

    .line 232
    :cond_1b
    new-instance v8, La/lt1;

    .line 233
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eqz v9, :cond_1f

    const/4 v10, 0x1

    if-eq v9, v10, :cond_1e

    const/4 v10, 0x2

    if-eq v9, v10, :cond_1d

    const/4 v10, 0x3

    if-ne v9, v10, :cond_1c

    .line 234
    sget-object v9, La/gx1;->d:La/gx1;

    goto :goto_16

    .line 235
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    goto/16 :goto_e

    .line 236
    :cond_1d
    sget-object v9, La/gx1;->c:La/gx1;

    goto :goto_16

    .line 237
    :cond_1e
    sget-object v9, La/gx1;->b:La/gx1;

    goto :goto_16

    .line 238
    :cond_1f
    sget-object v9, La/gx1;->a:La/gx1;

    .line 239
    :goto_16
    iget-object v10, v0, La/zoe;->c:Ljava/lang/String;

    .line 240
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eqz v11, :cond_22

    const/4 v12, 0x1

    if-eq v11, v12, :cond_22

    const/4 v12, 0x2

    if-eq v11, v12, :cond_21

    const/4 v12, 0x3

    if-ne v11, v12, :cond_20

    const v11, 0x7f130683

    :goto_17
    const/4 v12, 0x0

    goto :goto_18

    :cond_20
    invoke-static {}, La/t9f;->b()V

    goto/16 :goto_e

    :cond_21
    const v11, 0x7f130685

    goto :goto_17

    :cond_22
    const v11, 0x7f130682

    goto :goto_17

    :goto_18
    new-array v14, v12, [Ljava/lang/Object;

    .line 241
    invoke-static {v14, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v7, v11, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v37

    .line 242
    sget-object v11, La/gx1;->c:La/gx1;

    if-ne v6, v11, :cond_23

    .line 243
    new-array v14, v12, [Ljava/lang/Object;

    .line 244
    invoke-static {v14, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    const v12, 0x7f130a12

    invoke-virtual {v7, v12, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v38, v12

    goto :goto_19

    :cond_23
    move-object/from16 v38, v48

    :goto_19
    if-ne v6, v11, :cond_24

    const/4 v12, 0x0

    .line 245
    new-array v14, v12, [Ljava/lang/Object;

    .line 246
    invoke-static {v14, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    const v12, 0x7f130d31

    invoke-virtual {v7, v12, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v39, v12

    goto :goto_1a

    :cond_24
    move-object/from16 v39, v48

    :goto_1a
    if-ne v6, v11, :cond_25

    const/4 v12, 0x0

    .line 247
    new-array v6, v12, [Ljava/lang/Object;

    .line 248
    invoke-static {v6, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    const v11, 0x7f1311da

    invoke-virtual {v7, v11, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v40, v6

    goto :goto_1b

    :cond_25
    move-object/from16 v40, v48

    .line 249
    :goto_1b
    iget-wide v11, v0, La/zoe;->a:J

    .line 250
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v28

    sub-long v11, v11, v28

    cmp-long v0, v11, v21

    if-gez v0, :cond_26

    move-wide/from16 v41, v21

    goto :goto_1c

    :cond_26
    move-wide/from16 v41, v11

    .line 251
    :goto_1c
    new-instance v35, La/yrl;

    move-object/from16 v36, v10

    .line 252
    invoke-direct/range {v35 .. v42}, La/yrl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    move-object/from16 v0, v35

    .line 253
    invoke-direct {v8, v9, v0}, La/lt1;-><init>(La/gx1;La/asl;)V

    :goto_1d
    if-eqz v8, :cond_27

    .line 254
    invoke-virtual {v13, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 255
    :cond_27
    iget-object v0, v1, La/zu1;->c:La/vql;

    .line 256
    invoke-static {v2, v3, v0}, La/ntr;->t0(La/gu1;La/ctf0;La/vql;)La/gt1;

    move-result-object v0

    if-eqz v0, :cond_28

    .line 257
    invoke-virtual {v13, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 258
    :cond_28
    iget-object v0, v1, La/zu1;->d:La/gw1;

    .line 259
    iget-object v6, v2, La/gu1;->f:La/w88;

    .line 260
    iget-boolean v8, v6, La/w88;->a:Z

    iget-object v9, v6, La/w88;->c:Ljava/util/List;

    if-nez v8, :cond_29

    .line 261
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2a

    :cond_29
    move-object/from16 v29, v1

    move-object/from16 v37, v2

    move-object/from16 v28, v4

    move-object/from16 v36, v7

    move-object/from16 v38, v13

    goto/16 :goto_2c

    .line 262
    :cond_2a
    new-instance v8, La/ft1;

    .line 263
    new-instance v11, La/iw1;

    .line 264
    iget-object v12, v6, La/w88;->e:Ljava/lang/String;

    .line 265
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v14

    const v10, 0x7f1313f6

    if-nez v14, :cond_2b

    const/4 v14, 0x0

    .line 266
    new-array v12, v14, [Ljava/lang/Object;

    .line 267
    invoke-static {v12, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v7, v10, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    goto :goto_1e

    :cond_2b
    const/4 v14, 0x0

    .line 268
    :goto_1e
    new-array v10, v14, [Ljava/lang/Object;

    .line 269
    invoke-static {v10, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    const v14, 0x7f1300e4

    invoke-virtual {v7, v14, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 270
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v14

    move-object/from16 v28, v10

    move/from16 v10, v18

    if-le v14, v10, :cond_2c

    goto :goto_1f

    :cond_2c
    move-object/from16 v28, v16

    :goto_1f
    if-nez v28, :cond_2d

    move-object/from16 v10, v48

    goto :goto_20

    :cond_2d
    move-object/from16 v10, v28

    .line 271
    :goto_20
    iget-object v6, v6, La/w88;->b:La/xxb0;

    .line 272
    sget-object v14, La/xxb0;->a:La/xxb0;

    if-ne v6, v14, :cond_2e

    const/4 v6, 0x1

    goto :goto_21

    :cond_2e
    const/4 v6, 0x0

    :goto_21
    const v14, 0x7f130917

    move-object/from16 v28, v4

    move/from16 v18, v6

    const/4 v6, 0x0

    .line 273
    new-array v4, v6, [Ljava/lang/Object;

    invoke-virtual {v3, v14, v4}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 274
    new-instance v6, Ljava/util/ArrayList;

    move-object/from16 v29, v1

    const/16 v14, 0xa

    invoke-static {v9, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 275
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v9, 0x0

    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v35, v1

    add-int/lit8 v1, v9, 0x1

    if-ltz v9, :cond_3c

    .line 276
    check-cast v14, La/pxb0;

    .line 277
    const-string v9, " "

    if-eqz v18, :cond_30

    move-object/from16 v36, v7

    const v7, 0x7f130f7c

    move-object/from16 v37, v2

    move-object/from16 v38, v13

    const/4 v2, 0x0

    .line 278
    new-array v13, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v7, v13}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 279
    iget v7, v14, La/pxb0;->b:I

    .line 280
    iget v13, v14, La/pxb0;->c:I

    if-ne v7, v13, :cond_2f

    .line 281
    invoke-static {v7, v9, v2}, La/dw9;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v43, v2

    move-object/from16 v39, v8

    :goto_23
    const v2, 0x7f1313f6

    goto :goto_24

    :cond_2f
    move-object/from16 v39, v8

    .line 282
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "-"

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v43, v2

    goto :goto_23

    :cond_30
    move-object/from16 v37, v2

    move-object/from16 v36, v7

    move-object/from16 v39, v8

    move-object/from16 v38, v13

    const/4 v2, 0x0

    .line 283
    new-array v7, v2, [Ljava/lang/Object;

    const v2, 0x7f1313f6

    invoke-virtual {v3, v2, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 284
    iget-object v8, v14, La/pxb0;->h:Ljava/lang/String;

    .line 285
    const-string v13, ": "

    .line 286
    invoke-static {v7, v13, v8}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v43, v7

    .line 287
    :goto_24
    iget v7, v14, La/pxb0;->i:I

    if-lez v7, :cond_31

    .line 288
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v45, v7

    goto :goto_25

    :cond_31
    move-object/from16 v45, v48

    .line 289
    :goto_25
    sget-object v7, La/z1s0;->a:La/z1s0;

    if-eq v15, v7, :cond_32

    .line 290
    iget-object v7, v14, La/pxb0;->d:Ljava/lang/String;

    :goto_26
    move-object/from16 v44, v7

    goto :goto_27

    .line 291
    :cond_32
    sget-object v7, La/pn40;->a:La/pn40;

    .line 292
    iget-wide v7, v14, La/pxb0;->f:D

    .line 293
    sget-object v13, La/p3u0;->c:La/p3u0;

    .line 294
    invoke-static {v7, v8}, La/pn40;->l(D)Ljava/lang/String;

    move-result-object v7

    .line 295
    const-string v8, "\u202a"

    const-string v13, "\u202c"

    .line 296
    invoke-static {v8, v5, v9, v7, v13}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_26

    .line 297
    :goto_27
    new-instance v40, La/vv1;

    .line 298
    iget-object v7, v14, La/pxb0;->a:Ljava/lang/String;

    .line 299
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_37

    if-eq v8, v9, :cond_37

    const/4 v13, 0x2

    if-eq v8, v13, :cond_37

    const/4 v14, 0x3

    if-ne v8, v14, :cond_36

    if-eq v1, v9, :cond_35

    if-eq v1, v13, :cond_34

    if-eq v1, v14, :cond_33

    .line 300
    const-string v8, "Illustration_Other.webp"

    goto :goto_28

    .line 301
    :cond_33
    const-string v8, "Illustration_Bronze.webp"

    goto :goto_28

    .line 302
    :cond_34
    const-string v8, "Illustration_Silver.webp"

    goto :goto_28

    .line 303
    :cond_35
    const-string v8, "Illustration_Gold.webp"

    .line 304
    :goto_28
    new-instance v9, La/n0x;

    sget-object v13, La/u0d;->a:Ljava/util/List;

    const-string v13, "/static/img/android/casino/alt_design/aggregator_tournament_prize/illustration/"

    invoke-virtual {v13, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    :goto_29
    move-object/from16 v41, v7

    move-object/from16 v42, v9

    goto :goto_2b

    .line 305
    :cond_36
    invoke-static {}, La/t9f;->b()V

    goto/16 :goto_e

    :cond_37
    if-eq v1, v9, :cond_3b

    const/4 v13, 0x2

    if-eq v1, v13, :cond_3a

    const/4 v14, 0x3

    if-eq v1, v14, :cond_39

    .line 306
    sget-object v8, La/gw1;->c:La/gw1;

    if-ne v0, v8, :cond_38

    .line 307
    const-string v8, "Number_Other_Star.webp"

    goto :goto_2a

    .line 308
    :cond_38
    const-string v8, "Number_Other.webp"

    goto :goto_2a

    .line 309
    :cond_39
    const-string v8, "Number_Bronze.webp"

    goto :goto_2a

    .line 310
    :cond_3a
    const-string v8, "Number_Silver.webp"

    goto :goto_2a

    .line 311
    :cond_3b
    const-string v8, "Number_Gold.webp"

    .line 312
    :goto_2a
    new-instance v9, La/n0x;

    sget-object v13, La/u0d;->a:Ljava/util/List;

    const-string v13, "/static/img/android/casino/alt_design/aggregator_tournament_prize/icon_s_icon_l_number/"

    invoke-virtual {v13, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, La/u0d;->q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    goto :goto_29

    .line 313
    :goto_2b
    invoke-direct/range {v40 .. v45}, La/vv1;-><init>(Ljava/lang/String;La/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v7, v40

    .line 314
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v9, v1

    move-object/from16 v1, v35

    move-object/from16 v7, v36

    move-object/from16 v2, v37

    move-object/from16 v13, v38

    move-object/from16 v8, v39

    goto/16 :goto_22

    :cond_3c
    invoke-static {}, La/q3d;->p()V

    throw v16

    :cond_3d
    move-object/from16 v37, v2

    move-object/from16 v36, v7

    move-object/from16 v39, v8

    move-object/from16 v38, v13

    .line 315
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    move-result-object v1

    .line 316
    invoke-direct {v11, v1, v12, v10}, La/iw1;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v39

    .line 317
    invoke-direct {v1, v0, v11}, La/ft1;-><init>(La/gw1;La/kw1;)V

    goto :goto_2d

    :goto_2c
    move-object/from16 v1, v16

    :goto_2d
    move-object/from16 v0, v38

    if-eqz v1, :cond_3e

    .line 318
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    :cond_3e
    move-object/from16 v2, v37

    .line 319
    iget-object v1, v2, La/gu1;->r:Ljava/util/List;

    .line 320
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3f

    .line 321
    sget-object v1, La/iun;->a:La/iun;

    move-object/from16 v7, v36

    goto/16 :goto_3b

    .line 322
    :cond_3f
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_44

    const/4 v10, 0x1

    if-eq v3, v10, :cond_43

    const/4 v10, 0x2

    if-eq v3, v10, :cond_42

    const/4 v10, 0x3

    if-eq v3, v10, :cond_41

    move/from16 v4, v17

    if-ne v3, v4, :cond_40

    .line 323
    sget-object v3, La/pt0;->e:La/pt0;

    goto :goto_2e

    .line 324
    :cond_40
    invoke-static {}, La/t9f;->b()V

    goto/16 :goto_e

    .line 325
    :cond_41
    sget-object v3, La/pt0;->d:La/pt0;

    goto :goto_2e

    .line 326
    :cond_42
    sget-object v3, La/pt0;->c:La/pt0;

    goto :goto_2e

    .line 327
    :cond_43
    sget-object v3, La/pt0;->b:La/pt0;

    goto :goto_2e

    .line 328
    :cond_44
    sget-object v3, La/pt0;->a:La/pt0;

    .line 329
    :goto_2e
    new-instance v4, La/mt1;

    .line 330
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    .line 331
    new-instance v51, La/hjm;

    const/4 v10, 0x1

    if-ne v5, v10, :cond_45

    const/4 v10, 0x0

    .line 332
    new-array v5, v10, [Ljava/lang/Object;

    .line 333
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const v6, 0x7f13165c

    move-object/from16 v7, v36

    invoke-virtual {v7, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :goto_2f
    move-object/from16 v52, v5

    goto :goto_30

    :cond_45
    move-object/from16 v7, v36

    const/4 v10, 0x0

    .line 334
    new-array v5, v10, [Ljava/lang/Object;

    .line 335
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const v6, 0x7f13165d

    invoke-virtual {v7, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2f

    :goto_30
    const/16 v63, 0x0

    const/16 v64, 0x1bfe

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    .line 336
    invoke-direct/range {v51 .. v64}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    move-object/from16 v5, v51

    .line 337
    invoke-direct {v4, v5}, La/mt1;-><init>(La/jjm;)V

    .line 338
    new-instance v5, La/nt1;

    .line 339
    new-instance v6, La/zll;

    .line 340
    new-instance v8, La/wll;

    move-object/from16 v9, v50

    invoke-direct {v8, v9}, La/wll;-><init>(La/p0s;)V

    move/from16 v9, p1

    .line 341
    invoke-static {v1, v9}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    .line 342
    new-instance v9, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v1, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 343
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_31
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 344
    check-cast v10, La/mlr;

    .line 345
    iget-wide v11, v10, La/mlr;->a:J

    iget-boolean v13, v10, La/mlr;->k:Z

    .line 346
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    move-object/from16 v12, v27

    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v31, :cond_46

    const v14, 0x7f0807c1

    :goto_32
    move-object/from16 v17, v1

    goto :goto_33

    :cond_46
    const v14, 0x7f08061a

    goto :goto_32

    .line 347
    :goto_33
    iget-boolean v1, v10, La/mlr;->j:Z

    if-eqz v13, :cond_47

    move/from16 v18, v1

    move-object/from16 v22, v4

    const/4 v1, 0x0

    .line 348
    new-array v4, v1, [Ljava/lang/Object;

    .line 349
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const v1, 0x7f1303e6

    invoke-virtual {v7, v1, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_34

    :cond_47
    move/from16 v18, v1

    move-object/from16 v22, v4

    if-eqz v18, :cond_48

    const/4 v1, 0x0

    .line 350
    new-array v4, v1, [Ljava/lang/Object;

    .line 351
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const v1, 0x7f1303e2

    invoke-virtual {v7, v1, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_34

    :cond_48
    move-object/from16 v1, v48

    .line 352
    :goto_34
    new-instance v35, La/st0;

    move-object/from16 v27, v12

    move v4, v13

    .line 353
    iget-wide v12, v10, La/mlr;->a:J

    move/from16 v32, v4

    .line 354
    iget-object v4, v10, La/mlr;->f:Ljava/lang/String;

    move-object/from16 v38, v4

    .line 355
    iget-object v4, v10, La/mlr;->e:Ljava/lang/String;

    if-nez v26, :cond_49

    move-object/from16 v39, v4

    move-wide/from16 v36, v12

    const/4 v4, 0x0

    goto :goto_36

    :cond_49
    if-eqz v11, :cond_4a

    const v36, 0x7f080797

    :goto_35
    move-object/from16 v39, v4

    move/from16 v4, v36

    move-wide/from16 v36, v12

    goto :goto_36

    :cond_4a
    const v36, 0x7f080798

    goto :goto_35

    .line 356
    :goto_36
    new-instance v12, La/mtr;

    invoke-direct {v12, v4, v11}, La/mtr;-><init>(IZ)V

    .line 357
    new-instance v4, La/n0x;

    .line 358
    iget-object v10, v10, La/mlr;->g:Ljava/lang/String;

    .line 359
    invoke-direct {v4, v10}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 360
    new-instance v10, La/m0x;

    move/from16 v11, p0

    move-object/from16 v13, v16

    invoke-direct {v10, v14, v13, v11}, La/m0x;-><init>(ILa/bzw;I)V

    .line 361
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v13

    if-nez v13, :cond_4b

    .line 362
    sget-object v1, La/lur;->a:La/lur;

    move-object/from16 v44, v1

    move-object/from16 v41, v4

    goto/16 :goto_3a

    .line 363
    :cond_4b
    new-instance v13, La/mur;

    .line 364
    sget-object v14, La/pt0;->a:La/pt0;

    if-ne v3, v14, :cond_4d

    if-nez v32, :cond_4c

    goto :goto_37

    :cond_4c
    move-object/from16 v41, v4

    goto :goto_38

    .line 365
    :cond_4d
    :goto_37
    sget-object v11, La/pt0;->c:La/pt0;

    if-ne v3, v11, :cond_4e

    if-nez v32, :cond_4c

    :cond_4e
    move-object/from16 v41, v4

    .line 366
    sget-object v4, La/pt0;->d:La/pt0;

    if-ne v3, v4, :cond_4f

    if-eqz v32, :cond_4f

    .line 367
    :goto_38
    new-instance v4, La/lro0;

    sget-object v11, La/d4d;->a:La/d4d;

    invoke-direct {v4}, La/lro0;-><init>()V

    goto :goto_39

    :cond_4f
    if-ne v3, v14, :cond_50

    if-nez v18, :cond_52

    :cond_50
    if-ne v3, v11, :cond_51

    if-nez v18, :cond_52

    :cond_51
    if-ne v3, v4, :cond_53

    if-eqz v18, :cond_53

    .line 368
    :cond_52
    new-instance v4, La/eqo0;

    sget-object v11, La/d4d;->a:La/d4d;

    invoke-direct {v4}, La/eqo0;-><init>()V

    goto :goto_39

    .line 369
    :cond_53
    sget-object v4, La/pt0;->b:La/pt0;

    if-ne v3, v4, :cond_54

    if-nez v32, :cond_55

    .line 370
    :cond_54
    sget-object v11, La/pt0;->e:La/pt0;

    if-ne v3, v11, :cond_56

    if-eqz v32, :cond_56

    .line 371
    :cond_55
    sget-object v4, La/kro0;->a:La/kro0;

    goto :goto_39

    :cond_56
    if-ne v3, v4, :cond_57

    if-nez v18, :cond_58

    :cond_57
    if-ne v3, v11, :cond_59

    if-eqz v18, :cond_59

    :cond_58
    sget-object v4, La/dqo0;->a:La/dqo0;

    goto :goto_39

    .line 372
    :cond_59
    new-instance v4, La/uqo0;

    sget-object v11, La/d4d;->a:La/d4d;

    invoke-direct {v4, v11}, La/uqo0;-><init>(La/d4d;)V

    .line 373
    :goto_39
    invoke-direct {v13, v1, v4}, La/mur;-><init>(Ljava/lang/String;La/sso0;)V

    move-object/from16 v44, v13

    :goto_3a
    const/16 v43, 0x0

    move-object/from16 v42, v10

    move-object/from16 v40, v12

    .line 374
    invoke-direct/range {v35 .. v44}, La/st0;-><init>(JLjava/lang/String;Ljava/lang/String;La/mtr;La/o0x;La/o0x;Ljava/lang/Integer;La/nur;)V

    move-object/from16 v1, v35

    .line 375
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v17

    move-object/from16 v4, v22

    const/16 p0, 0x6

    const/16 v16, 0x0

    goto/16 :goto_31

    :cond_5a
    move-object/from16 v22, v4

    .line 376
    invoke-direct {v6, v3, v8, v9}, La/zll;-><init>(La/pt0;La/yll;Ljava/util/List;)V

    .line 377
    invoke-direct {v5, v6}, La/nt1;-><init>(La/bml;)V

    const/4 v10, 0x2

    new-array v1, v10, [La/ot1;

    const/16 v19, 0x0

    aput-object v22, v1, v19

    const/16 v25, 0x1

    aput-object v5, v1, v25

    .line 378
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 379
    :goto_3b
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v1, v29

    .line 380
    iget-object v3, v1, La/zu1;->e:La/l5i;

    .line 381
    iget-object v4, v2, La/gu1;->l:La/w98;

    iget-object v13, v4, La/w98;->a:Ljava/util/List;

    iget-wide v4, v2, La/gu1;->q:J

    iget-object v6, v2, La/gu1;->k:La/o98;

    iget-object v6, v6, La/o98;->b:Ljava/util/List;

    .line 382
    sget-object v8, La/z1s0;->b:La/z1s0;

    sget-object v9, La/url;->a:La/url;

    sget-object v10, La/vrl;->a:La/vrl;

    const/4 v11, -0x1

    if-ne v15, v8, :cond_79

    .line 383
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_5b

    .line 384
    sget-object v4, La/iun;->a:La/iun;

    goto/16 :goto_48

    .line 385
    :cond_5b
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    const/4 v14, 0x3

    if-gt v8, v14, :cond_5d

    :cond_5c
    move-object v4, v6

    goto/16 :goto_48

    .line 386
    :cond_5d
    invoke-static {v2}, La/plc;->z(La/gu1;)Z

    move-result v8

    if-eqz v8, :cond_66

    .line 387
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    .line 388
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 389
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    invoke-interface {v6, v8}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v8

    .line 390
    :cond_5e
    invoke-interface {v8}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v12

    if-eqz v12, :cond_5f

    .line 391
    invoke-interface {v8}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/jng0;

    .line 392
    iget-object v12, v12, La/jng0;->c:Ljava/util/Date;

    .line 393
    invoke-virtual {v12, v5}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v12

    if-eqz v12, :cond_5e

    .line 394
    invoke-interface {v8}, Ljava/util/ListIterator;->nextIndex()I

    move-result v5

    goto :goto_3c

    :cond_5f
    move v5, v11

    :goto_3c
    if-ne v5, v11, :cond_60

    const/4 v14, 0x3

    .line 395
    invoke-static {v6, v14}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    goto/16 :goto_48

    :cond_60
    const/4 v14, 0x3

    add-int/lit8 v8, v5, 0x1

    .line 396
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 397
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3d
    if-ge v8, v4, :cond_61

    .line 398
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v11, v14, :cond_61

    .line 399
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3d

    .line 400
    :cond_61
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v8, v14, :cond_63

    const/16 v25, 0x1

    add-int/lit8 v5, v5, -0x1

    const/4 v8, -0x1

    :goto_3e
    if-ge v8, v5, :cond_62

    .line 401
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v4, v14, :cond_62

    .line 402
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    const/4 v14, 0x0

    invoke-virtual {v12, v14, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, -0x1

    const/4 v14, 0x3

    goto :goto_3e

    :cond_62
    move-object v4, v12

    const/4 v14, 0x3

    goto/16 :goto_48

    :cond_63
    add-int/lit8 v8, v4, -0x2

    if-lt v5, v8, :cond_64

    const/4 v14, 0x3

    sub-int/2addr v4, v14

    goto :goto_3f

    :cond_64
    const/4 v14, 0x3

    if-lez v5, :cond_65

    move v4, v5

    goto :goto_3f

    :cond_65
    const/4 v4, 0x0

    :goto_3f
    add-int/lit8 v5, v4, 0x3

    .line 403
    invoke-interface {v6, v4, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    goto/16 :goto_48

    :cond_66
    move v8, v11

    const/4 v14, 0x3

    .line 404
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v11

    if-le v11, v14, :cond_5c

    move-object/from16 v11, v49

    .line 405
    iget-object v11, v11, La/j88;->j:La/t7s0;

    .line 406
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eqz v11, :cond_73

    const/4 v12, 0x1

    if-eq v11, v12, :cond_68

    const/4 v12, 0x2

    if-ne v11, v12, :cond_67

    .line 407
    invoke-static {v14, v6}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    move-result-object v4

    goto/16 :goto_48

    .line 408
    :cond_67
    invoke-static {}, La/t9f;->b()V

    const/4 v12, 0x0

    goto/16 :goto_65

    .line 409
    :cond_68
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v11

    .line 410
    new-instance v12, Ljava/util/Date;

    invoke-direct {v12}, Ljava/util/Date;-><init>()V

    .line 411
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    const/16 v17, 0x0

    :goto_40
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_6a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 412
    move-object/from16 v8, v18

    check-cast v8, La/jng0;

    move/from16 v18, v11

    .line 413
    iget-object v11, v8, La/jng0;->d:Ljava/util/Date;

    .line 414
    iget-object v8, v8, La/jng0;->c:Ljava/util/Date;

    .line 415
    invoke-virtual {v12, v11}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v11

    if-eqz v11, :cond_69

    invoke-virtual {v12, v8}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v8

    if-eqz v8, :cond_69

    goto :goto_41

    :cond_69
    add-int/lit8 v17, v17, 0x1

    move/from16 v11, v18

    const/4 v8, -0x1

    goto :goto_40

    :cond_6a
    move/from16 v18, v11

    const/16 v17, -0x1

    .line 416
    :goto_41
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    if-ltz v17, :cond_6b

    goto :goto_42

    :cond_6b
    const/4 v8, 0x0

    :goto_42
    if-eqz v8, :cond_6c

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_46

    .line 417
    :cond_6c
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v11, 0x0

    :goto_43
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6e

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 418
    check-cast v12, La/jng0;

    move v14, v11

    .line 419
    iget-wide v11, v12, La/jng0;->b:J

    cmp-long v11, v11, v4

    if-nez v11, :cond_6d

    move v11, v14

    goto :goto_44

    :cond_6d
    add-int/lit8 v11, v14, 0x1

    goto :goto_43

    :cond_6e
    const/4 v11, -0x1

    .line 420
    :goto_44
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-ltz v11, :cond_6f

    goto :goto_45

    :cond_6f
    const/4 v4, 0x0

    :goto_45
    if-eqz v4, :cond_70

    .line 421
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_46

    :cond_70
    const/4 v4, 0x0

    :goto_46
    add-int/lit8 v11, v18, -0x2

    if-lt v4, v11, :cond_71

    const/4 v14, 0x3

    add-int/lit8 v4, v18, -0x3

    goto :goto_47

    :cond_71
    const/4 v14, 0x3

    if-lez v4, :cond_72

    goto :goto_47

    :cond_72
    const/4 v4, 0x0

    :goto_47
    add-int/lit8 v5, v4, 0x3

    .line 422
    invoke-interface {v6, v4, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    goto :goto_48

    .line 423
    :cond_73
    invoke-static {v6, v14}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    .line 424
    :goto_48
    new-instance v5, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v4, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 425
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v8, 0x0

    :goto_49
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_78

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v8, 0x1

    if-ltz v8, :cond_77

    .line 426
    check-cast v11, La/jng0;

    .line 427
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    .line 428
    iget-object v14, v11, La/jng0;->d:Ljava/util/Date;

    move-object/from16 p0, v4

    iget-object v4, v11, La/jng0;->c:Ljava/util/Date;

    move-object/from16 v17, v6

    .line 429
    sget-object v6, La/rdj;->a:La/rdj;

    move/from16 v18, v12

    .line 430
    sget-object v12, La/sdj;->d:La/sdj;

    move-object/from16 v22, v13

    const/16 v13, 0x1c

    move-object/from16 v38, v0

    move-object/from16 v29, v1

    move-object/from16 v1, v28

    .line 431
    invoke-static {v6, v12, v14, v1, v13}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    move-result-object v0

    .line 432
    invoke-static {v6, v12, v4, v1, v13}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    move-result-object v6

    const-string v12, " - "

    .line 433
    invoke-static {v0, v12, v6}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 434
    iget-wide v12, v11, La/jng0;->b:J

    .line 435
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    .line 436
    iget-object v12, v11, La/jng0;->d:Ljava/util/Date;

    .line 437
    invoke-virtual {v12}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    .line 438
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v26

    .line 439
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v31

    sub-long v26, v26, v12

    move-wide/from16 v35, v12

    .line 440
    div-long v12, v26, v33

    sub-long v31, v31, v35

    move-object/from16 v37, v2

    .line 441
    div-long v1, v31, v33

    long-to-double v1, v1

    long-to-double v12, v12

    div-double/2addr v1, v12

    const-wide/high16 v12, 0x4059000000000000L    # 100.0

    mul-double/2addr v1, v12

    const-wide/16 v12, 0x0

    cmpl-double v12, v1, v12

    if-lez v12, :cond_74

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    cmpg-double v12, v1, v12

    if-gez v12, :cond_74

    const/4 v1, 0x1

    goto :goto_4a

    :cond_74
    double-to-int v1, v1

    .line 442
    :goto_4a
    invoke-virtual {v8, v14}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_75

    new-instance v1, La/rrl;

    .line 443
    iget-object v2, v11, La/jng0;->a:Ljava/lang/String;

    .line 444
    invoke-direct {v1, v6, v0, v2, v9}, La/rrl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/xrl;)V

    const/4 v13, 0x0

    goto :goto_4b

    .line 445
    :cond_75
    invoke-virtual {v8, v14}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_76

    invoke-virtual {v8, v4}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_76

    .line 446
    new-instance v2, La/rrl;

    .line 447
    new-instance v4, La/wrl;

    const/16 v8, 0x64

    invoke-direct {v4, v1, v8}, La/wrl;-><init>(II)V

    const/4 v13, 0x0

    .line 448
    invoke-direct {v2, v6, v0, v13, v4}, La/rrl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/xrl;)V

    move-object v1, v2

    goto :goto_4b

    :cond_76
    const/4 v13, 0x0

    .line 449
    new-instance v1, La/rrl;

    invoke-direct {v1, v6, v0, v13, v10}, La/rrl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/xrl;)V

    .line 450
    :goto_4b
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, p0

    move-object/from16 v6, v17

    move/from16 v8, v18

    move-object/from16 v13, v22

    move-object/from16 v1, v29

    move-object/from16 v2, v37

    move-object/from16 v0, v38

    goto/16 :goto_49

    :cond_77
    const/4 v13, 0x0

    invoke-static {}, La/q3d;->p()V

    throw v13

    :cond_78
    move-object/from16 v38, v0

    move-object/from16 v29, v1

    move-object/from16 v17, v6

    move-object/from16 v22, v13

    move-object v12, v2

    move-object v13, v5

    :goto_4c
    const/4 v6, 0x0

    goto/16 :goto_5c

    :cond_79
    move-object/from16 v38, v0

    move-object/from16 v29, v1

    move-object/from16 v37, v2

    move-object/from16 v17, v6

    move-object/from16 v22, v13

    .line 451
    invoke-interface/range {v22 .. v22}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7a

    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    move-result v0

    const/4 v14, 0x3

    if-le v0, v14, :cond_7a

    move-object/from16 v13, v22

    goto :goto_4d

    :cond_7a
    const/4 v13, 0x0

    :goto_4d
    if-eqz v13, :cond_82

    .line 452
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_4e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 453
    check-cast v2, La/fzl0;

    .line 454
    iget-wide v11, v2, La/fzl0;->c:J

    cmp-long v2, v11, v4

    if-nez v2, :cond_7b

    move v11, v1

    goto :goto_4f

    :cond_7b
    add-int/lit8 v1, v1, 0x1

    goto :goto_4e

    :cond_7c
    const/4 v11, -0x1

    .line 455
    :goto_4f
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ltz v11, :cond_7d

    goto :goto_50

    :cond_7d
    const/4 v0, 0x0

    :goto_50
    if-eqz v0, :cond_7e

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_51

    :cond_7e
    const/4 v0, 0x0

    :goto_51
    if-nez v0, :cond_7f

    const/4 v0, 0x0

    goto :goto_52

    .line 456
    :cond_7f
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v1

    const/16 v23, 0x2

    add-int/lit8 v1, v1, -0x2

    if-lt v0, v1, :cond_80

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    const/16 v20, 0x3

    add-int/lit8 v0, v0, -0x3

    goto :goto_52

    :cond_80
    const/16 v25, 0x1

    add-int/lit8 v0, v0, -0x1

    :goto_52
    add-int/lit8 v1, v0, 0x3

    .line 457
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    if-le v1, v2, :cond_81

    move v1, v2

    :cond_81
    invoke-interface {v13, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_82

    goto :goto_53

    :cond_82
    move-object/from16 v0, v22

    .line 458
    :goto_53
    new-instance v1, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v0, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 459
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v6, 0x0

    :goto_54
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v11, v6, 0x1

    if-ltz v6, :cond_8b

    .line 460
    check-cast v8, La/fzl0;

    move-object/from16 v12, v37

    .line 461
    iget-object v13, v12, La/gu1;->h:La/k98;

    .line 462
    iget-object v13, v13, La/k98;->a:Ljava/util/List;

    .line 463
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_55
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_84

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 p0, v2

    move-object v2, v14

    check-cast v2, La/o2g0;

    .line 464
    iget-boolean v2, v2, La/o2g0;->b:Z

    if-eqz v2, :cond_83

    move-object v13, v14

    goto :goto_56

    :cond_83
    move-object/from16 v2, p0

    goto :goto_55

    :cond_84
    move-object/from16 p0, v2

    const/4 v13, 0x0

    .line 465
    :goto_56
    check-cast v13, La/o2g0;

    if-eqz v13, :cond_85

    .line 466
    iget v2, v13, La/o2g0;->d:I

    goto :goto_57

    :cond_85
    const/4 v2, 0x0

    .line 467
    :goto_57
    iget v13, v8, La/fzl0;->b:I

    if-lt v2, v13, :cond_86

    const/16 v26, 0x1

    :goto_58
    move/from16 v18, v13

    goto :goto_59

    :cond_86
    const/16 v26, 0x0

    goto :goto_58

    .line 468
    :goto_59
    iget-wide v13, v8, La/fzl0;->c:J

    long-to-int v8, v13

    long-to-int v13, v4

    add-int/lit8 v6, v6, -0x1

    .line 469
    invoke-static {v6, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/fzl0;

    if-eqz v6, :cond_87

    .line 470
    iget v6, v6, La/fzl0;->b:I

    goto :goto_5a

    :cond_87
    const/4 v6, 0x0

    :goto_5a
    if-ne v8, v13, :cond_89

    .line 471
    iget-boolean v14, v12, La/gu1;->c:Z

    if-eqz v14, :cond_89

    if-nez v26, :cond_88

    .line 472
    new-instance v13, La/rrl;

    .line 473
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    .line 474
    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v26, v0

    const/4 v0, 0x1

    .line 475
    invoke-static {v14, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    const v0, 0x7f130fb9

    invoke-virtual {v7, v0, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sub-int v14, v18, v2

    .line 476
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v14

    move/from16 v27, v2

    const/4 v2, 0x1

    .line 477
    invoke-static {v14, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v14

    const v2, 0x7f131653

    invoke-virtual {v7, v2, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 478
    new-instance v14, La/wrl;

    move-wide/from16 v31, v4

    sub-int v4, v27, v6

    sub-int v5, v18, v6

    invoke-direct {v14, v4, v5}, La/wrl;-><init>(II)V

    .line 479
    invoke-direct {v13, v8, v0, v2, v14}, La/rrl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/xrl;)V

    const/4 v6, 0x0

    goto :goto_5b

    :cond_88
    move-object/from16 v26, v0

    move-wide/from16 v31, v4

    .line 480
    new-instance v13, La/rrl;

    .line 481
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 482
    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x1

    .line 483
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const v5, 0x7f130fb9

    invoke-virtual {v7, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    .line 484
    invoke-direct {v13, v0, v2, v6, v10}, La/rrl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/xrl;)V

    goto :goto_5b

    :cond_89
    move-object/from16 v26, v0

    move-wide/from16 v31, v4

    const/4 v4, 0x1

    const v5, 0x7f130fb9

    const/4 v6, 0x0

    if-le v13, v8, :cond_8a

    .line 485
    new-instance v13, La/rrl;

    .line 486
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 487
    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 488
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 489
    invoke-direct {v13, v0, v2, v6, v10}, La/rrl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/xrl;)V

    goto :goto_5b

    .line 490
    :cond_8a
    new-instance v13, La/rrl;

    .line 491
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 492
    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 493
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v7, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 494
    invoke-direct {v13, v0, v2, v6, v9}, La/rrl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/xrl;)V

    .line 495
    :goto_5b
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p0

    move v6, v11

    move-object/from16 v37, v12

    move-object/from16 v0, v26

    move-wide/from16 v4, v31

    goto/16 :goto_54

    :cond_8b
    const/4 v6, 0x0

    invoke-static {}, La/q3d;->p()V

    throw v6

    :cond_8c
    move-object/from16 v12, v37

    move-object v13, v1

    goto/16 :goto_4c

    .line 496
    :goto_5c
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8d

    goto :goto_5d

    :cond_8d
    move-object v13, v6

    :goto_5d
    if-eqz v13, :cond_91

    const/4 v10, 0x0

    .line 497
    new-array v0, v10, [Ljava/lang/Object;

    .line 498
    invoke-static {v0, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const v1, 0x7f131654

    invoke-virtual {v7, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 499
    new-array v1, v10, [Ljava/lang/Object;

    .line 500
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const v14, 0x7f1300e4

    invoke-virtual {v7, v14, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 501
    sget-object v2, La/z1s0;->b:La/z1s0;

    if-ne v15, v2, :cond_8e

    .line 502
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->size()I

    move-result v2

    const/4 v14, 0x3

    if-le v2, v14, :cond_8f

    goto :goto_5e

    :cond_8e
    const/4 v14, 0x3

    .line 503
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v14, :cond_8f

    goto :goto_5e

    :cond_8f
    move-object v1, v6

    :goto_5e
    if-nez v1, :cond_90

    move-object/from16 v1, v48

    .line 504
    :cond_90
    invoke-static {v13}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    move-result-object v2

    .line 505
    new-instance v4, La/lrl;

    invoke-direct {v4, v2, v0, v1}, La/lrl;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    new-instance v13, La/kt1;

    invoke-direct {v13, v3, v4}, La/kt1;-><init>(La/l5i;La/nrl;)V

    goto :goto_5f

    :cond_91
    move-object v13, v6

    :goto_5f
    move-object/from16 v0, v38

    if-eqz v13, :cond_92

    .line 507
    invoke-virtual {v0, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    :cond_92
    move-object/from16 v1, v29

    .line 508
    iget-object v1, v1, La/zu1;->f:La/hrl;

    .line 509
    iget-object v2, v12, La/gu1;->i:La/s98;

    .line 510
    iget-object v3, v2, La/s98;->a:Ljava/util/List;

    .line 511
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_93

    move-object v13, v6

    goto :goto_60

    .line 512
    :cond_93
    iget-object v3, v2, La/s98;->b:Ljava/lang/String;

    .line 513
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_94

    const/4 v10, 0x0

    .line 514
    new-array v3, v10, [Ljava/lang/Object;

    .line 515
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const v4, 0x7f1311a4

    invoke-virtual {v7, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 516
    :cond_94
    iget-object v13, v2, La/s98;->a:Ljava/util/List;

    const/16 v17, 0x0

    const/16 v18, 0x3e

    .line 517
    const-string v14, "\n"

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    .line 518
    new-instance v4, La/irl;

    invoke-direct {v4, v3, v2}, La/irl;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    new-instance v13, La/jt1;

    invoke-direct {v13, v1, v4}, La/jt1;-><init>(La/hrl;La/krl;)V

    :goto_60
    if-eqz v13, :cond_95

    .line 520
    invoke-virtual {v0, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 521
    :cond_95
    new-instance v1, La/b0i;

    .line 522
    sget-object v2, La/sh1;->b:La/sh1;

    .line 523
    sget-object v3, La/rh1;->a:La/jdk0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {v30 .. v30}, La/jdk0;->e(Ljava/lang/String;)La/rh1;

    move-result-object v3

    .line 524
    invoke-direct {v1, v2, v3}, La/b0i;-><init>(La/sh1;La/rh1;)V

    .line 525
    iget-object v2, v12, La/gu1;->g:Ljava/util/List;

    .line 526
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_96

    .line 527
    sget-object v1, La/iun;->a:La/iun;

    goto/16 :goto_64

    .line 528
    :cond_96
    new-instance v3, La/ht1;

    .line 529
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/16 v9, 0x8

    if-le v4, v9, :cond_97

    const/4 v10, 0x0

    .line 530
    new-array v4, v10, [Ljava/lang/Object;

    .line 531
    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const v14, 0x7f1300e4

    invoke-virtual {v7, v14, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    goto :goto_61

    :cond_97
    const/4 v10, 0x0

    move-object v13, v6

    .line 532
    :goto_61
    new-array v4, v10, [Ljava/lang/Object;

    .line 533
    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const v5, 0x7f131070

    invoke-virtual {v7, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v27

    if-eqz v13, :cond_98

    .line 534
    new-instance v12, La/ue9;

    invoke-direct {v12, v13}, La/ue9;-><init>(Ljava/lang/String;)V

    move-object/from16 v37, v12

    goto :goto_62

    :cond_98
    move-object/from16 v37, v6

    .line 535
    :goto_62
    new-instance v26, La/hjm;

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x1bfe

    invoke-direct/range {v26 .. v39}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    move-object/from16 v4, v26

    .line 536
    invoke-direct {v3, v4}, La/ht1;-><init>(La/jjm;)V

    const/16 v9, 0x8

    .line 537
    invoke-static {v2, v9}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    .line 538
    new-instance v4, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v2, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 539
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_63
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_99

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 540
    check-cast v5, La/izb0;

    .line 541
    iget v6, v5, La/izb0;->c:I

    .line 542
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    .line 543
    new-instance v10, La/n0x;

    .line 544
    iget-object v6, v5, La/izb0;->a:Ljava/lang/String;

    .line 545
    invoke-direct {v10, v6}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 546
    iget-object v12, v5, La/izb0;->b:Ljava/lang/String;

    const/4 v14, 0x0

    .line 547
    new-array v5, v14, [Ljava/lang/Object;

    .line 548
    invoke-static {v5, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    const v6, 0x7f1303ec

    invoke-virtual {v7, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 549
    new-instance v8, La/eol;

    const/4 v11, 0x0

    .line 550
    const-string v13, "-"

    const/4 v15, 0x0

    .line 551
    invoke-direct/range {v8 .. v15}, La/eol;-><init>(Ljava/lang/String;La/n0x;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/m0x;)V

    .line 552
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_63

    .line 553
    :cond_99
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    move-result-object v2

    .line 554
    new-instance v4, La/bol;

    invoke-direct {v4, v2, v1}, La/bol;-><init>(La/a4x;La/b0i;)V

    .line 555
    new-instance v1, La/it1;

    invoke-direct {v1, v4}, La/it1;-><init>(La/dol;)V

    const/4 v10, 0x2

    new-array v2, v10, [La/ot1;

    const/16 v19, 0x0

    aput-object v3, v2, v19

    const/16 v25, 0x1

    aput-object v1, v2, v25

    .line 556
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 557
    :goto_64
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 558
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    move-result-object v0

    .line 559
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    move-result-object v12

    if-eqz v12, :cond_9a

    goto :goto_65

    .line 560
    :cond_9a
    sget-object v12, La/lak0;->c:La/lak0;

    goto :goto_65

    :cond_9b
    move-object/from16 v6, v16

    .line 561
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9c

    .line 562
    sget-object v12, La/lak0;->c:La/lak0;

    goto :goto_65

    .line 563
    :cond_9c
    invoke-static {}, La/t9f;->b()V

    move-object v12, v6

    :goto_65
    return-object v12

    .line 564
    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, La/gu1;

    .line 565
    sget-object v1, La/s9s0;->d:La/s9s0;

    .line 566
    iget-object v2, v11, La/gv1;->o:La/n0o0;

    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/fee;

    .line 567
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 568
    iget-object v3, v11, La/gv1;->b:La/ctf0;

    .line 569
    invoke-static {v0, v1, v2, v3}, La/p8a;->d0(La/gu1;La/s9s0;ZLa/ctf0;)La/mtl;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method
