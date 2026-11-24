.class public abstract La/stp0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/gmp0;

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, La/jmp0;-><init>(J)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/hmp0;

    .line 9
    .line 10
    const-wide/16 v2, 0x2

    .line 11
    .line 12
    invoke-direct {v1, v2, v3}, La/jmp0;-><init>(J)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/imp0;

    .line 16
    .line 17
    const-wide/16 v3, 0x3

    .line 18
    .line 19
    invoke-direct {v2, v3, v4}, La/jmp0;-><init>(J)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    new-array v3, v3, [La/jmp0;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    aput-object v0, v3, v4

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    aput-object v1, v3, v0

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    aput-object v2, v3, v0

    .line 33
    .line 34
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, La/stp0;->a:Ljava/util/List;

    .line 39
    .line 40
    return-void
.end method

.method public static final a(La/lc00;La/r2s0;JLa/m9s;La/ctf0;Z)V
    .locals 36

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, La/r2s0;->a:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    goto/16 :goto_4

    .line 25
    .line 26
    :cond_0
    iget-object v4, v1, La/m9s;->j:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, v1, La/m9s;->i:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v5, La/stp0;->a:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_b

    .line 48
    .line 49
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    check-cast v7, La/jmp0;

    .line 54
    .line 55
    if-eqz v7, :cond_a

    .line 56
    .line 57
    instance-of v9, v7, La/gmp0;

    .line 58
    .line 59
    if-eqz v9, :cond_4

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    :cond_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-eqz v10, :cond_3

    .line 70
    .line 71
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    move-object v11, v10

    .line 76
    check-cast v11, La/cmp0;

    .line 77
    .line 78
    iget-object v11, v11, La/cmp0;->a:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v11, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_2

    .line 85
    .line 86
    move-object v8, v10

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const/4 v8, 0x0

    .line 89
    :goto_1
    check-cast v8, La/cmp0;

    .line 90
    .line 91
    invoke-static {v8}, La/vbc;->a0(La/cmp0;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_1

    .line 96
    .line 97
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    instance-of v9, v7, La/hmp0;

    .line 102
    .line 103
    if-eqz v9, :cond_7

    .line 104
    .line 105
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eqz v10, :cond_6

    .line 114
    .line 115
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    move-object v11, v10

    .line 120
    check-cast v11, La/cmp0;

    .line 121
    .line 122
    iget-object v11, v11, La/cmp0;->a:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v11, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    if-eqz v11, :cond_5

    .line 129
    .line 130
    move-object v8, v10

    .line 131
    goto :goto_2

    .line 132
    :cond_6
    const/4 v8, 0x0

    .line 133
    :goto_2
    check-cast v8, La/cmp0;

    .line 134
    .line 135
    invoke-static {v8}, La/vbc;->a0(La/cmp0;)Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-eqz v8, :cond_1

    .line 140
    .line 141
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_7
    instance-of v8, v7, La/imp0;

    .line 146
    .line 147
    if-eqz v8, :cond_a

    .line 148
    .line 149
    if-eqz v3, :cond_8

    .line 150
    .line 151
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eqz v8, :cond_8

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_8
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    :cond_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_1

    .line 167
    .line 168
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    check-cast v9, La/cmp0;

    .line 173
    .line 174
    invoke-static {v9}, La/vbc;->S(La/cmp0;)Z

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    if-eqz v9, :cond_9

    .line 179
    .line 180
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto/16 :goto_0

    .line 184
    .line 185
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_b
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    const/4 v6, 0x0

    .line 194
    invoke-virtual {v5, v6}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    :cond_c
    move-object v9, v7

    .line 199
    check-cast v9, La/paw;

    .line 200
    .line 201
    invoke-virtual {v9}, La/paw;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_d

    .line 206
    .line 207
    invoke-virtual {v9}, La/paw;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    move-object v10, v9

    .line 212
    check-cast v10, La/jmp0;

    .line 213
    .line 214
    iget-byte v10, v10, La/jmp0;->a:B

    .line 215
    .line 216
    int-to-long v10, v10

    .line 217
    cmp-long v10, v10, p2

    .line 218
    .line 219
    if-nez v10, :cond_c

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_d
    const/4 v9, 0x0

    .line 223
    :goto_3
    check-cast v9, La/jmp0;

    .line 224
    .line 225
    if-nez v9, :cond_e

    .line 226
    .line 227
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    move-object v9, v7

    .line 232
    check-cast v9, La/jmp0;

    .line 233
    .line 234
    :cond_e
    move-object v13, v9

    .line 235
    if-nez v13, :cond_f

    .line 236
    .line 237
    :goto_4
    return-void

    .line 238
    :cond_f
    new-instance v11, La/psv;

    .line 239
    .line 240
    const-string v7, "TEAM_STATISTICS_HEADER_KEY"

    .line 241
    .line 242
    const v9, 0x7f1313e0

    .line 243
    .line 244
    .line 245
    invoke-direct {v11, v7, v9}, La/psv;-><init>(Ljava/lang/String;I)V

    .line 246
    .line 247
    .line 248
    new-instance v10, La/m52;

    .line 249
    .line 250
    sget-wide v14, La/ijg;->B0:J

    .line 251
    .line 252
    new-instance v7, Ljava/util/ArrayList;

    .line 253
    .line 254
    const/16 v9, 0xa

    .line 255
    .line 256
    invoke-static {v5, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 257
    .line 258
    .line 259
    move-result v12

    .line 260
    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v5, v6}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    :goto_5
    move-object v12, v5

    .line 268
    check-cast v12, La/paw;

    .line 269
    .line 270
    invoke-virtual {v12}, La/paw;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v16

    .line 274
    if-eqz v16, :cond_14

    .line 275
    .line 276
    invoke-virtual {v12}, La/paw;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v12

    .line 280
    check-cast v12, La/jmp0;

    .line 281
    .line 282
    new-instance v16, La/lxl;

    .line 283
    .line 284
    iget-byte v9, v12, La/jmp0;->a:B

    .line 285
    .line 286
    int-to-long v8, v9

    .line 287
    new-instance v6, La/xxl;

    .line 288
    .line 289
    move-object/from16 v24, v3

    .line 290
    .line 291
    instance-of v3, v12, La/gmp0;

    .line 292
    .line 293
    if-eqz v3, :cond_10

    .line 294
    .line 295
    move-object v3, v1

    .line 296
    :goto_6
    move-object/from16 p3, v5

    .line 297
    .line 298
    move-wide/from16 v17, v8

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_10
    instance-of v3, v12, La/hmp0;

    .line 302
    .line 303
    if-eqz v3, :cond_11

    .line 304
    .line 305
    move-object v3, v4

    .line 306
    goto :goto_6

    .line 307
    :cond_11
    instance-of v3, v12, La/imp0;

    .line 308
    .line 309
    if-eqz v3, :cond_13

    .line 310
    .line 311
    move-object/from16 p3, v5

    .line 312
    .line 313
    const/4 v3, 0x0

    .line 314
    new-array v5, v3, [Ljava/lang/Object;

    .line 315
    .line 316
    move-wide/from16 v17, v8

    .line 317
    .line 318
    iget-object v8, v2, La/ctf0;->b:La/lsm0;

    .line 319
    .line 320
    invoke-static {v5, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    const v3, 0x7f131361

    .line 325
    .line 326
    .line 327
    invoke-virtual {v8, v3, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    :goto_7
    invoke-direct {v6, v3}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    iget-byte v3, v12, La/jmp0;->a:B

    .line 335
    .line 336
    int-to-long v8, v3

    .line 337
    iget-byte v3, v13, La/jmp0;->a:B

    .line 338
    .line 339
    move-object/from16 v19, v6

    .line 340
    .line 341
    int-to-long v5, v3

    .line 342
    cmp-long v3, v8, v5

    .line 343
    .line 344
    if-nez v3, :cond_12

    .line 345
    .line 346
    sget-object v3, La/uxl;->b:La/uxl;

    .line 347
    .line 348
    :goto_8
    move-object/from16 v21, v3

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_12
    sget-object v3, La/uxl;->a:La/uxl;

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :goto_9
    const/16 v22, 0x0

    .line 355
    .line 356
    const/16 v23, 0x6c

    .line 357
    .line 358
    const/16 v20, 0x0

    .line 359
    .line 360
    invoke-direct/range {v16 .. v23}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 361
    .line 362
    .line 363
    move-object/from16 v3, v16

    .line 364
    .line 365
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-object/from16 v5, p3

    .line 369
    .line 370
    move-object/from16 v3, v24

    .line 371
    .line 372
    const/4 v6, 0x0

    .line 373
    const/16 v9, 0xa

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :cond_14
    move-object/from16 v24, v3

    .line 381
    .line 382
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 383
    .line 384
    .line 385
    move-result-object v17

    .line 386
    new-instance v12, La/boo0;

    .line 387
    .line 388
    new-instance v16, La/fyl;

    .line 389
    .line 390
    iget-object v3, v2, La/ctf0;->b:La/lsm0;

    .line 391
    .line 392
    invoke-virtual {v2}, La/ctf0;->j()Z

    .line 393
    .line 394
    .line 395
    move-result v5

    .line 396
    invoke-static {v5}, La/xfn;->b(Z)La/wfn;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    iget v5, v5, La/wfn;->e:F

    .line 401
    .line 402
    const/4 v6, 0x0

    .line 403
    const/4 v7, 0x2

    .line 404
    invoke-static {v5, v6, v7}, La/s5x0;->t(FFI)La/lh80;

    .line 405
    .line 406
    .line 407
    move-result-object v20

    .line 408
    new-instance v5, La/jyl;

    .line 409
    .line 410
    new-instance v6, La/y3d;

    .line 411
    .line 412
    invoke-direct {v6, v14, v15}, La/y3d;-><init>(J)V

    .line 413
    .line 414
    .line 415
    const/16 v8, 0x7e

    .line 416
    .line 417
    const/4 v9, 0x0

    .line 418
    invoke-direct {v5, v6, v9, v9, v8}, La/jyl;-><init>(La/y3d;La/y3d;La/y3d;I)V

    .line 419
    .line 420
    .line 421
    const/16 v22, 0x6

    .line 422
    .line 423
    const/16 v18, 0x0

    .line 424
    .line 425
    const/16 v19, 0x0

    .line 426
    .line 427
    move-object/from16 v21, v5

    .line 428
    .line 429
    invoke-direct/range {v16 .. v22}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 430
    .line 431
    .line 432
    move-object/from16 v5, v16

    .line 433
    .line 434
    sget-object v6, La/pno0;->a:La/pno0;

    .line 435
    .line 436
    const-string v8, "TEAM_STATISTICS_KEY"

    .line 437
    .line 438
    invoke-direct {v12, v8, v5, v6}, La/boo0;-><init>(Ljava/lang/String;La/fyl;La/pno0;)V

    .line 439
    .line 440
    .line 441
    invoke-static {v0, v1, v2}, La/stp0;->b(La/r2s0;Ljava/lang/String;La/ctf0;)La/kmp0;

    .line 442
    .line 443
    .line 444
    move-result-object v14

    .line 445
    invoke-static {v0, v4, v2}, La/stp0;->b(La/r2s0;Ljava/lang/String;La/ctf0;)La/kmp0;

    .line 446
    .line 447
    .line 448
    move-result-object v15

    .line 449
    new-instance v0, Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 452
    .line 453
    .line 454
    new-instance v1, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 457
    .line 458
    .line 459
    new-instance v2, Ljava/util/ArrayList;

    .line 460
    .line 461
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-interface/range {v24 .. v24}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    :cond_15
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 469
    .line 470
    .line 471
    move-result v5

    .line 472
    if-eqz v5, :cond_16

    .line 473
    .line 474
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    move-object v6, v5

    .line 479
    check-cast v6, La/cmp0;

    .line 480
    .line 481
    iget-object v6, v6, La/cmp0;->a:Ljava/lang/String;

    .line 482
    .line 483
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    if-lez v6, :cond_15

    .line 488
    .line 489
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    goto :goto_a

    .line 493
    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 494
    .line 495
    .line 496
    move-result-object v4

    .line 497
    const/4 v5, 0x0

    .line 498
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 499
    .line 500
    .line 501
    move-result v6

    .line 502
    const-string v8, "%s/playerlogo/%s"

    .line 503
    .line 504
    const-string v9, "%s/%s"

    .line 505
    .line 506
    const-string v7, "playerlogo/"

    .line 507
    .line 508
    move-object/from16 p1, v2

    .line 509
    .line 510
    const-string v2, ""

    .line 511
    .line 512
    move-object/from16 p5, v4

    .line 513
    .line 514
    if-eqz v6, :cond_1e

    .line 515
    .line 516
    invoke-interface/range {p5 .. p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v6

    .line 520
    add-int/lit8 v16, v5, 0x1

    .line 521
    .line 522
    if-ltz v5, :cond_1d

    .line 523
    .line 524
    check-cast v6, La/cmp0;

    .line 525
    .line 526
    new-instance v4, La/k4m0;

    .line 527
    .line 528
    iget-object v6, v6, La/cmp0;->b:Ljava/lang/String;

    .line 529
    .line 530
    move-object/from16 v23, v8

    .line 531
    .line 532
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 533
    .line 534
    move-object/from16 v25, v9

    .line 535
    .line 536
    const/4 v9, 0x0

    .line 537
    invoke-static {v6, v8, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 538
    .line 539
    .line 540
    move-result v8

    .line 541
    if-eqz v8, :cond_17

    .line 542
    .line 543
    goto :goto_e

    .line 544
    :cond_17
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 545
    .line 546
    .line 547
    move-result v8

    .line 548
    if-nez v8, :cond_18

    .line 549
    .line 550
    goto :goto_c

    .line 551
    :cond_18
    sget-object v8, La/u0d;->a:Ljava/util/List;

    .line 552
    .line 553
    invoke-static {v6}, La/u0d;->c(Ljava/lang/String;)Z

    .line 554
    .line 555
    .line 556
    move-result v8

    .line 557
    if-eqz v8, :cond_19

    .line 558
    .line 559
    :goto_c
    move-object v6, v2

    .line 560
    goto :goto_e

    .line 561
    :cond_19
    const/4 v8, 0x1

    .line 562
    invoke-static {v6, v7, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 563
    .line 564
    .line 565
    move-result v7

    .line 566
    if-eqz v7, :cond_1a

    .line 567
    .line 568
    move-object/from16 v8, v25

    .line 569
    .line 570
    goto :goto_d

    .line 571
    :cond_1a
    move-object/from16 v8, v23

    .line 572
    .line 573
    :goto_d
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 574
    .line 575
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 576
    .line 577
    filled-new-array {v9, v6}, [Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v6

    .line 581
    const/4 v9, 0x2

    .line 582
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v6

    .line 586
    invoke-static {v7, v8, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    :goto_e
    sget-object v7, La/qmk;->a:La/zcl;

    .line 591
    .line 592
    const/high16 v7, 0x40c00000    # 6.0f

    .line 593
    .line 594
    const/high16 v8, 0x42100000    # 36.0f

    .line 595
    .line 596
    invoke-direct {v4, v2, v6, v7, v8}, La/k4m0;-><init>(Ljava/lang/String;Ljava/lang/String;FF)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    if-eqz v4, :cond_1c

    .line 611
    .line 612
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v4

    .line 616
    check-cast v4, La/cmp0;

    .line 617
    .line 618
    iget-object v4, v4, La/cmp0;->c:Ljava/util/List;

    .line 619
    .line 620
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    check-cast v4, Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 630
    .line 631
    .line 632
    move-result v6

    .line 633
    if-nez v6, :cond_1b

    .line 634
    .line 635
    const-string v4, "-"

    .line 636
    .line 637
    :cond_1b
    move-object/from16 v26, v4

    .line 638
    .line 639
    sget-wide v27, La/kkg;->D:J

    .line 640
    .line 641
    sget-wide v29, La/qmk;->q:J

    .line 642
    .line 643
    new-instance v25, La/l4m0;

    .line 644
    .line 645
    const/high16 v31, 0x42100000    # 36.0f

    .line 646
    .line 647
    const/16 v32, 0x3

    .line 648
    .line 649
    const/16 v33, 0x0

    .line 650
    .line 651
    const/high16 v34, 0x41400000    # 12.0f

    .line 652
    .line 653
    invoke-direct/range {v25 .. v34}, La/l4m0;-><init>(Ljava/lang/String;JJFIFF)V

    .line 654
    .line 655
    .line 656
    move-object/from16 v4, v25

    .line 657
    .line 658
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    goto :goto_f

    .line 662
    :cond_1c
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 670
    .line 671
    .line 672
    move-object/from16 v2, p1

    .line 673
    .line 674
    move-object/from16 v4, p5

    .line 675
    .line 676
    move/from16 v5, v16

    .line 677
    .line 678
    const/4 v7, 0x2

    .line 679
    goto/16 :goto_b

    .line 680
    .line 681
    :cond_1d
    invoke-static {}, La/q3d;->p()V

    .line 682
    .line 683
    .line 684
    const/4 v9, 0x0

    .line 685
    throw v9

    .line 686
    :cond_1e
    move-object/from16 v23, v8

    .line 687
    .line 688
    move-object/from16 v25, v9

    .line 689
    .line 690
    sget-wide v4, La/qmk;->o:J

    .line 691
    .line 692
    sget-wide v19, La/qmk;->q:J

    .line 693
    .line 694
    new-instance v1, Ljava/util/ArrayList;

    .line 695
    .line 696
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 697
    .line 698
    .line 699
    invoke-interface/range {v24 .. v24}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 700
    .line 701
    .line 702
    move-result-object v6

    .line 703
    :cond_1f
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 704
    .line 705
    .line 706
    move-result v8

    .line 707
    if-eqz v8, :cond_20

    .line 708
    .line 709
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v8

    .line 713
    move-object v9, v8

    .line 714
    check-cast v9, La/cmp0;

    .line 715
    .line 716
    iget-object v9, v9, La/cmp0;->a:Ljava/lang/String;

    .line 717
    .line 718
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 719
    .line 720
    .line 721
    move-result v9

    .line 722
    if-lez v9, :cond_1f

    .line 723
    .line 724
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    goto :goto_10

    .line 728
    :cond_20
    const/4 v9, 0x0

    .line 729
    new-array v6, v9, [Ljava/lang/Object;

    .line 730
    .line 731
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v6

    .line 735
    const v8, 0x7f13136e    # 1.954974E38f

    .line 736
    .line 737
    .line 738
    invoke-virtual {v3, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v17

    .line 742
    new-instance v6, Ljava/util/ArrayList;

    .line 743
    .line 744
    const/16 v8, 0xa

    .line 745
    .line 746
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 747
    .line 748
    .line 749
    move-result v9

    .line 750
    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 754
    .line 755
    .line 756
    move-result-object v8

    .line 757
    :goto_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 758
    .line 759
    .line 760
    move-result v9

    .line 761
    if-eqz v9, :cond_21

    .line 762
    .line 763
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v9

    .line 767
    check-cast v9, La/cmp0;

    .line 768
    .line 769
    iget-object v9, v9, La/cmp0;->d:Ljava/lang/String;

    .line 770
    .line 771
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    goto :goto_11

    .line 775
    :cond_21
    sget-object v8, La/qmk;->a:La/zcl;

    .line 776
    .line 777
    const/high16 v21, 0x41400000    # 12.0f

    .line 778
    .line 779
    move-object/from16 v16, v0

    .line 780
    .line 781
    move-object/from16 v18, v6

    .line 782
    .line 783
    invoke-static/range {v16 .. v21}, La/ihm0;->f(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;JF)V

    .line 784
    .line 785
    .line 786
    const/4 v9, 0x0

    .line 787
    new-array v0, v9, [Ljava/lang/Object;

    .line 788
    .line 789
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    const v6, 0x7f13136d

    .line 794
    .line 795
    .line 796
    invoke-virtual {v3, v6, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v17

    .line 800
    new-instance v0, Ljava/util/ArrayList;

    .line 801
    .line 802
    const/16 v8, 0xa

    .line 803
    .line 804
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 805
    .line 806
    .line 807
    move-result v6

    .line 808
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 812
    .line 813
    .line 814
    move-result-object v6

    .line 815
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 816
    .line 817
    .line 818
    move-result v8

    .line 819
    if-eqz v8, :cond_22

    .line 820
    .line 821
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v8

    .line 825
    check-cast v8, La/cmp0;

    .line 826
    .line 827
    iget-object v8, v8, La/cmp0;->e:Ljava/lang/String;

    .line 828
    .line 829
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    goto :goto_12

    .line 833
    :cond_22
    sget-object v6, La/qmk;->a:La/zcl;

    .line 834
    .line 835
    const/high16 v21, 0x41400000    # 12.0f

    .line 836
    .line 837
    move-object/from16 v18, v0

    .line 838
    .line 839
    invoke-static/range {v16 .. v21}, La/ihm0;->f(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;JF)V

    .line 840
    .line 841
    .line 842
    const/4 v9, 0x0

    .line 843
    new-array v0, v9, [Ljava/lang/Object;

    .line 844
    .line 845
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    const v6, 0x7f13136b

    .line 850
    .line 851
    .line 852
    invoke-virtual {v3, v6, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v17

    .line 856
    new-instance v0, Ljava/util/ArrayList;

    .line 857
    .line 858
    const/16 v8, 0xa

    .line 859
    .line 860
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 861
    .line 862
    .line 863
    move-result v6

    .line 864
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 868
    .line 869
    .line 870
    move-result-object v6

    .line 871
    :goto_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 872
    .line 873
    .line 874
    move-result v8

    .line 875
    if-eqz v8, :cond_23

    .line 876
    .line 877
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v8

    .line 881
    check-cast v8, La/cmp0;

    .line 882
    .line 883
    iget-object v8, v8, La/cmp0;->f:Ljava/lang/String;

    .line 884
    .line 885
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    goto :goto_13

    .line 889
    :cond_23
    sget-object v6, La/qmk;->a:La/zcl;

    .line 890
    .line 891
    const/high16 v21, 0x41400000    # 12.0f

    .line 892
    .line 893
    move-object/from16 v18, v0

    .line 894
    .line 895
    invoke-static/range {v16 .. v21}, La/ihm0;->f(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;JF)V

    .line 896
    .line 897
    .line 898
    const/4 v9, 0x0

    .line 899
    new-array v0, v9, [Ljava/lang/Object;

    .line 900
    .line 901
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    const v6, 0x7f13136c

    .line 906
    .line 907
    .line 908
    invoke-virtual {v3, v6, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v17

    .line 912
    new-instance v0, Ljava/util/ArrayList;

    .line 913
    .line 914
    const/16 v8, 0xa

    .line 915
    .line 916
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 917
    .line 918
    .line 919
    move-result v6

    .line 920
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 924
    .line 925
    .line 926
    move-result-object v6

    .line 927
    :goto_14
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 928
    .line 929
    .line 930
    move-result v8

    .line 931
    if-eqz v8, :cond_24

    .line 932
    .line 933
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v8

    .line 937
    check-cast v8, La/cmp0;

    .line 938
    .line 939
    iget-object v8, v8, La/cmp0;->g:Ljava/lang/String;

    .line 940
    .line 941
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    goto :goto_14

    .line 945
    :cond_24
    sget-object v6, La/qmk;->a:La/zcl;

    .line 946
    .line 947
    const/high16 v21, 0x41400000    # 12.0f

    .line 948
    .line 949
    move-object/from16 v18, v0

    .line 950
    .line 951
    invoke-static/range {v16 .. v21}, La/ihm0;->f(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;JF)V

    .line 952
    .line 953
    .line 954
    move-wide/from16 v8, v19

    .line 955
    .line 956
    const/4 v0, 0x0

    .line 957
    new-array v6, v0, [Ljava/lang/Object;

    .line 958
    .line 959
    invoke-static {v6, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v6

    .line 963
    const v0, 0x7f13136f

    .line 964
    .line 965
    .line 966
    invoke-virtual {v3, v0, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v17

    .line 970
    new-instance v0, Ljava/util/ArrayList;

    .line 971
    .line 972
    move-object/from16 p1, v2

    .line 973
    .line 974
    const/16 v6, 0xa

    .line 975
    .line 976
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 977
    .line 978
    .line 979
    move-result v2

    .line 980
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 988
    .line 989
    .line 990
    move-result v6

    .line 991
    if-eqz v6, :cond_25

    .line 992
    .line 993
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v6

    .line 997
    check-cast v6, La/cmp0;

    .line 998
    .line 999
    iget-object v6, v6, La/cmp0;->h:Ljava/lang/String;

    .line 1000
    .line 1001
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    goto :goto_15

    .line 1005
    :cond_25
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1006
    .line 1007
    const/high16 v21, 0x41600000    # 14.0f

    .line 1008
    .line 1009
    move-object/from16 v18, v0

    .line 1010
    .line 1011
    move-wide/from16 v19, v4

    .line 1012
    .line 1013
    invoke-static/range {v16 .. v21}, La/ihm0;->f(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;JF)V

    .line 1014
    .line 1015
    .line 1016
    const/4 v0, 0x0

    .line 1017
    new-array v2, v0, [Ljava/lang/Object;

    .line 1018
    .line 1019
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    const v0, 0x7f131372

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v3, v0, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v17

    .line 1030
    new-instance v0, Ljava/util/ArrayList;

    .line 1031
    .line 1032
    const/16 v6, 0xa

    .line 1033
    .line 1034
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1035
    .line 1036
    .line 1037
    move-result v2

    .line 1038
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v1

    .line 1045
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1046
    .line 1047
    .line 1048
    move-result v2

    .line 1049
    if-eqz v2, :cond_26

    .line 1050
    .line 1051
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v2

    .line 1055
    check-cast v2, La/cmp0;

    .line 1056
    .line 1057
    iget-object v2, v2, La/cmp0;->i:Ljava/lang/String;

    .line 1058
    .line 1059
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    goto :goto_16

    .line 1063
    :cond_26
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1064
    .line 1065
    const/high16 v21, 0x41400000    # 12.0f

    .line 1066
    .line 1067
    move-object/from16 v18, v0

    .line 1068
    .line 1069
    move-wide/from16 v19, v8

    .line 1070
    .line 1071
    invoke-static/range {v16 .. v21}, La/ihm0;->f(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;JF)V

    .line 1072
    .line 1073
    .line 1074
    move-object/from16 v0, v16

    .line 1075
    .line 1076
    new-instance v1, Ljava/util/ArrayList;

    .line 1077
    .line 1078
    const/16 v8, 0xa

    .line 1079
    .line 1080
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1081
    .line 1082
    .line 1083
    move-result v2

    .line 1084
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    const/4 v2, 0x0

    .line 1092
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v4

    .line 1096
    if-eqz v4, :cond_28

    .line 1097
    .line 1098
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v4

    .line 1102
    add-int/lit8 v5, v2, 0x1

    .line 1103
    .line 1104
    if-ltz v2, :cond_27

    .line 1105
    .line 1106
    check-cast v4, La/a4x;

    .line 1107
    .line 1108
    new-instance v6, La/jhm0;

    .line 1109
    .line 1110
    invoke-direct {v6, v2, v4}, La/jhm0;-><init>(ILa/a4x;)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    move v2, v5

    .line 1117
    goto :goto_17

    .line 1118
    :cond_27
    invoke-static {}, La/q3d;->p()V

    .line 1119
    .line 1120
    .line 1121
    const/4 v9, 0x0

    .line 1122
    throw v9

    .line 1123
    :cond_28
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    new-instance v1, La/o4m0;

    .line 1132
    .line 1133
    new-instance v2, Ljava/util/ArrayList;

    .line 1134
    .line 1135
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1136
    .line 1137
    .line 1138
    const/4 v9, 0x0

    .line 1139
    new-array v4, v9, [Ljava/lang/Object;

    .line 1140
    .line 1141
    invoke-static {v4, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v4

    .line 1145
    const v5, 0x7f13149e

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v3, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v27

    .line 1152
    sget-wide v28, La/kkg;->E:J

    .line 1153
    .line 1154
    sget-wide v30, La/qmk;->q:J

    .line 1155
    .line 1156
    new-instance v26, La/l4m0;

    .line 1157
    .line 1158
    const/high16 v32, 0x42a80000    # 84.0f

    .line 1159
    .line 1160
    const/16 v33, 0x5

    .line 1161
    .line 1162
    const/high16 v34, 0x41000000    # 8.0f

    .line 1163
    .line 1164
    const/high16 v35, 0x41400000    # 12.0f

    .line 1165
    .line 1166
    invoke-direct/range {v26 .. v35}, La/l4m0;-><init>(Ljava/lang/String;JJFIFF)V

    .line 1167
    .line 1168
    .line 1169
    move-object/from16 v3, v26

    .line 1170
    .line 1171
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1172
    .line 1173
    .line 1174
    new-instance v3, Ljava/util/ArrayList;

    .line 1175
    .line 1176
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1177
    .line 1178
    .line 1179
    invoke-interface/range {v24 .. v24}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v4

    .line 1183
    :cond_29
    :goto_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1184
    .line 1185
    .line 1186
    move-result v5

    .line 1187
    if-eqz v5, :cond_2a

    .line 1188
    .line 1189
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v5

    .line 1193
    move-object v6, v5

    .line 1194
    check-cast v6, La/cmp0;

    .line 1195
    .line 1196
    iget-object v6, v6, La/cmp0;->a:Ljava/lang/String;

    .line 1197
    .line 1198
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1199
    .line 1200
    .line 1201
    move-result v6

    .line 1202
    if-lez v6, :cond_29

    .line 1203
    .line 1204
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1205
    .line 1206
    .line 1207
    goto :goto_18

    .line 1208
    :cond_2a
    new-instance v4, Ljava/util/ArrayList;

    .line 1209
    .line 1210
    const/16 v8, 0xa

    .line 1211
    .line 1212
    invoke-static {v3, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1213
    .line 1214
    .line 1215
    move-result v5

    .line 1216
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v3

    .line 1223
    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v5

    .line 1227
    if-eqz v5, :cond_2f

    .line 1228
    .line 1229
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v5

    .line 1233
    check-cast v5, La/cmp0;

    .line 1234
    .line 1235
    new-instance v6, La/k4m0;

    .line 1236
    .line 1237
    iget-object v8, v5, La/cmp0;->a:Ljava/lang/String;

    .line 1238
    .line 1239
    const/4 v9, 0x3

    .line 1240
    invoke-static {v9, v8}, La/ttm0;->L(ILjava/lang/String;)Ljava/lang/String;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v8

    .line 1244
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1245
    .line 1246
    invoke-virtual {v8, v9}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v8

    .line 1250
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1251
    .line 1252
    .line 1253
    iget-object v5, v5, La/cmp0;->b:Ljava/lang/String;

    .line 1254
    .line 1255
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 1256
    .line 1257
    move-object/from16 p2, v3

    .line 1258
    .line 1259
    const/4 v3, 0x0

    .line 1260
    invoke-static {v5, v9, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1261
    .line 1262
    .line 1263
    move-result v9

    .line 1264
    if-eqz v9, :cond_2b

    .line 1265
    .line 1266
    :goto_1a
    move-object/from16 p4, v7

    .line 1267
    .line 1268
    const/4 v7, 0x2

    .line 1269
    goto :goto_1d

    .line 1270
    :cond_2b
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1271
    .line 1272
    .line 1273
    move-result v9

    .line 1274
    if-nez v9, :cond_2c

    .line 1275
    .line 1276
    goto :goto_1b

    .line 1277
    :cond_2c
    sget-object v9, La/u0d;->a:Ljava/util/List;

    .line 1278
    .line 1279
    invoke-static {v5}, La/u0d;->c(Ljava/lang/String;)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v9

    .line 1283
    if-eqz v9, :cond_2d

    .line 1284
    .line 1285
    :goto_1b
    move-object/from16 v5, p1

    .line 1286
    .line 1287
    goto :goto_1a

    .line 1288
    :cond_2d
    const/4 v9, 0x1

    .line 1289
    invoke-static {v5, v7, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1290
    .line 1291
    .line 1292
    move-result v16

    .line 1293
    if-eqz v16, :cond_2e

    .line 1294
    .line 1295
    move-object/from16 v3, v25

    .line 1296
    .line 1297
    goto :goto_1c

    .line 1298
    :cond_2e
    move-object/from16 v3, v23

    .line 1299
    .line 1300
    :goto_1c
    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1301
    .line 1302
    move-object/from16 p4, v7

    .line 1303
    .line 1304
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 1305
    .line 1306
    filled-new-array {v7, v5}, [Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v5

    .line 1310
    const/4 v7, 0x2

    .line 1311
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v5

    .line 1315
    invoke-static {v9, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v5

    .line 1319
    :goto_1d
    sget-object v3, La/qmk;->a:La/zcl;

    .line 1320
    .line 1321
    const/high16 v3, 0x41000000    # 8.0f

    .line 1322
    .line 1323
    const/high16 v9, 0x42a80000    # 84.0f

    .line 1324
    .line 1325
    invoke-direct {v6, v8, v5, v3, v9}, La/k4m0;-><init>(Ljava/lang/String;Ljava/lang/String;FF)V

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1329
    .line 1330
    .line 1331
    move-object/from16 v3, p2

    .line 1332
    .line 1333
    move-object/from16 v7, p4

    .line 1334
    .line 1335
    goto :goto_19

    .line 1336
    :cond_2f
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1337
    .line 1338
    .line 1339
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v2

    .line 1343
    move/from16 v3, p6

    .line 1344
    .line 1345
    invoke-direct {v1, v2, v0, v3}, La/o4m0;-><init>(La/i4;La/i4;Z)V

    .line 1346
    .line 1347
    .line 1348
    move-object/from16 v16, v1

    .line 1349
    .line 1350
    invoke-direct/range {v10 .. v16}, La/m52;-><init>(La/psv;La/boo0;La/jmp0;La/kmp0;La/kmp0;La/o4m0;)V

    .line 1351
    .line 1352
    .line 1353
    move-object/from16 v0, p0

    .line 1354
    .line 1355
    invoke-virtual {v0, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1356
    .line 1357
    .line 1358
    return-void
.end method

.method public static final b(La/r2s0;Ljava/lang/String;La/ctf0;)La/kmp0;
    .locals 11

    .line 1
    iget-object p0, p0, La/r2s0;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, La/cmp0;

    .line 20
    .line 21
    iget-object v2, v2, La/cmp0;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v0, v1

    .line 31
    :goto_0
    check-cast v0, La/cmp0;

    .line 32
    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    new-instance p0, La/bmp0;

    .line 36
    .line 37
    sget-wide v2, La/kkg;->B:J

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    new-array v4, p1, [Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v5, p2, La/ctf0;->b:La/lsm0;

    .line 43
    .line 44
    iget-object p2, p2, La/ctf0;->b:La/lsm0;

    .line 45
    .line 46
    invoke-static {v4, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const v6, 0x7f13088b

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget-object v5, v0, La/cmp0;->e:Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {p0, v2, v3, v4, v5}, La/bmp0;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, La/bmp0;

    .line 63
    .line 64
    sget-object v3, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 65
    .line 66
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getYellow-0d7_KjU()J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    new-array v5, p1, [Ljava/lang/Object;

    .line 71
    .line 72
    invoke-static {v5, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    const v6, 0x7f130886

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iget-object v6, v0, La/cmp0;->f:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {v2, v3, v4, v5, v6}, La/bmp0;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v3, La/bmp0;

    .line 89
    .line 90
    sget-wide v4, La/kkg;->C:J

    .line 91
    .line 92
    new-array v6, p1, [Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v6, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    const v7, 0x7f130889

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    iget-object v7, v0, La/cmp0;->g:Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {v3, v4, v5, v6, v7}, La/bmp0;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    filled-new-array {p0, v2, v3}, [La/bmp0;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iget-object v2, v0, La/cmp0;->h:Ljava/lang/String;

    .line 119
    .line 120
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const/4 v3, 0x1

    .line 125
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    const v4, 0x7f130887

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    iget-object v2, v0, La/cmp0;->i:Ljava/lang/String;

    .line 137
    .line 138
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const v3, 0x7f13088a

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    iget-object v8, v0, La/cmp0;->d:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {p0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    new-instance p2, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_5

    .line 173
    .line 174
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, La/bmp0;

    .line 179
    .line 180
    iget-object v2, v0, La/bmp0;->c:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    if-eqz v2, :cond_3

    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    goto :goto_2

    .line 193
    :cond_3
    move v2, p1

    .line 194
    :goto_2
    if-eqz v2, :cond_4

    .line 195
    .line 196
    new-instance v3, La/vt90;

    .line 197
    .line 198
    iget-wide v4, v0, La/bmp0;->a:J

    .line 199
    .line 200
    invoke-direct {v3, v2, v4, v5}, La/vt90;-><init>(IJ)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_4
    move-object v3, v1

    .line 205
    :goto_3
    if-eqz v3, :cond_2

    .line 206
    .line 207
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_5
    invoke-static {p2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    new-instance v9, La/b1l;

    .line 216
    .line 217
    sget-object p1, La/qmk;->a:La/zcl;

    .line 218
    .line 219
    invoke-direct {v9, p0}, La/b1l;-><init>(La/i4;)V

    .line 220
    .line 221
    .line 222
    new-instance v5, La/kmp0;

    .line 223
    .line 224
    invoke-direct/range {v5 .. v10}, La/kmp0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/b1l;La/i4;)V

    .line 225
    .line 226
    .line 227
    return-object v5

    .line 228
    :cond_6
    return-object v1
.end method
