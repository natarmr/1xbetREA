.class public final La/h7q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/btt0;

.field public final b:La/a7q;

.field public final c:La/q6q;

.field public final d:La/dev;

.field public final e:La/knf0;

.field public final f:La/mne;


# direct methods
.method public constructor <init>(La/btt0;La/a7q;La/q6q;La/dev;La/knf0;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/h7q;->a:La/btt0;

    .line 17
    .line 18
    iput-object p2, p0, La/h7q;->b:La/a7q;

    .line 19
    .line 20
    iput-object p3, p0, La/h7q;->c:La/q6q;

    .line 21
    .line 22
    iput-object p4, p0, La/h7q;->d:La/dev;

    .line 23
    .line 24
    iput-object p5, p0, La/h7q;->e:La/knf0;

    .line 25
    .line 26
    iput-object p6, p0, La/h7q;->f:La/mne;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(IILa/ocq;ILa/zje;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    instance-of v2, v1, La/b7q;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/b7q;

    .line 11
    .line 12
    iget v3, v2, La/b7q;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/b7q;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/b7q;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/b7q;-><init>(La/h7q;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v9, La/b7q;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v9, La/b7q;->k:I

    .line 36
    .line 37
    const/4 v10, 0x0

    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    if-ne v3, v4, :cond_1

    .line 42
    .line 43
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v10

    .line 53
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    if-ne v1, v4, :cond_3

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    move v6, v1

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 68
    .line 69
    .line 70
    return-object v10

    .line 71
    :cond_4
    move v6, v4

    .line 72
    :goto_2
    iget-object v1, v0, La/h7q;->e:La/knf0;

    .line 73
    .line 74
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    iput v4, v9, La/b7q;->k:I

    .line 79
    .line 80
    iget-object v0, v0, La/h7q;->b:La/a7q;

    .line 81
    .line 82
    iget-object v0, v0, La/a7q;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, La/wgn;

    .line 85
    .line 86
    invoke-virtual {v0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    move-object v3, v0

    .line 91
    check-cast v3, La/y5q;

    .line 92
    .line 93
    move/from16 v4, p1

    .line 94
    .line 95
    move/from16 v5, p2

    .line 96
    .line 97
    move/from16 v7, p4

    .line 98
    .line 99
    invoke-interface/range {v3 .. v9}, La/y5q;->b(IIIILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-ne v1, v2, :cond_5

    .line 104
    .line 105
    return-object v2

    .line 106
    :cond_5
    :goto_3
    check-cast v1, La/rbq;

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v0, v1, La/rbq;->a:La/ecq;

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    iget-object v2, v0, La/ecq;->a:La/jcq;

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move-object v2, v10

    .line 119
    :goto_4
    invoke-static {v2}, La/plc;->P(La/jcq;)La/gcq;

    .line 120
    .line 121
    .line 122
    move-result-object v12

    .line 123
    const/16 v2, 0xa

    .line 124
    .line 125
    if-eqz v0, :cond_8

    .line 126
    .line 127
    iget-object v3, v0, La/ecq;->b:Ljava/util/List;

    .line 128
    .line 129
    if-eqz v3, :cond_8

    .line 130
    .line 131
    new-instance v4, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_7

    .line 149
    .line 150
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    check-cast v5, La/bcq;

    .line 155
    .line 156
    invoke-static {v5}, La/vic;->I(La/bcq;)La/ybq;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_7
    :goto_6
    move-object v13, v4

    .line 165
    goto :goto_7

    .line 166
    :cond_8
    sget-object v4, La/iun;->a:La/iun;

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :goto_7
    const-wide/16 v3, 0x0

    .line 170
    .line 171
    if-eqz v0, :cond_9

    .line 172
    .line 173
    iget-object v5, v0, La/ecq;->c:Ljava/lang/Integer;

    .line 174
    .line 175
    if-eqz v5, :cond_9

    .line 176
    .line 177
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    int-to-long v5, v5

    .line 182
    move-wide v14, v5

    .line 183
    goto :goto_8

    .line 184
    :cond_9
    move-wide v14, v3

    .line 185
    :goto_8
    if-eqz v0, :cond_a

    .line 186
    .line 187
    iget-object v5, v0, La/ecq;->d:Ljava/lang/Integer;

    .line 188
    .line 189
    if-eqz v5, :cond_a

    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    int-to-long v5, v5

    .line 196
    move-wide/from16 v16, v5

    .line 197
    .line 198
    goto :goto_9

    .line 199
    :cond_a
    move-wide/from16 v16, v3

    .line 200
    .line 201
    :goto_9
    if-eqz v0, :cond_b

    .line 202
    .line 203
    iget-object v5, v0, La/ecq;->e:Ljava/lang/Integer;

    .line 204
    .line 205
    if-eqz v5, :cond_b

    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    int-to-long v5, v5

    .line 212
    move-wide/from16 v18, v5

    .line 213
    .line 214
    goto :goto_a

    .line 215
    :cond_b
    move-wide/from16 v18, v3

    .line 216
    .line 217
    :goto_a
    if-eqz v0, :cond_c

    .line 218
    .line 219
    iget-object v5, v0, La/ecq;->f:Ljava/lang/Integer;

    .line 220
    .line 221
    if-eqz v5, :cond_c

    .line 222
    .line 223
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    int-to-long v5, v5

    .line 228
    move-wide/from16 v20, v5

    .line 229
    .line 230
    goto :goto_b

    .line 231
    :cond_c
    move-wide/from16 v20, v3

    .line 232
    .line 233
    :goto_b
    const/4 v5, 0x0

    .line 234
    if-eqz v0, :cond_d

    .line 235
    .line 236
    iget-object v0, v0, La/ecq;->g:Ljava/lang/Float;

    .line 237
    .line 238
    if-eqz v0, :cond_d

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    move/from16 v22, v0

    .line 245
    .line 246
    goto :goto_c

    .line 247
    :cond_d
    move/from16 v22, v5

    .line 248
    .line 249
    :goto_c
    new-instance v11, La/xbq;

    .line 250
    .line 251
    invoke-direct/range {v11 .. v22}, La/xbq;-><init>(La/gcq;Ljava/util/List;JJJJF)V

    .line 252
    .line 253
    .line 254
    iget-object v0, v1, La/rbq;->b:La/ncq;

    .line 255
    .line 256
    if-eqz v0, :cond_e

    .line 257
    .line 258
    iget-object v6, v0, La/ncq;->a:Ljava/lang/Float;

    .line 259
    .line 260
    if-eqz v6, :cond_e

    .line 261
    .line 262
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    :cond_e
    if-eqz v0, :cond_f

    .line 267
    .line 268
    iget-object v6, v0, La/ncq;->c:La/jcq;

    .line 269
    .line 270
    goto :goto_d

    .line 271
    :cond_f
    move-object v6, v10

    .line 272
    :goto_d
    invoke-static {v6}, La/plc;->P(La/jcq;)La/gcq;

    .line 273
    .line 274
    .line 275
    move-result-object v6

    .line 276
    if-eqz v0, :cond_10

    .line 277
    .line 278
    iget-object v7, v0, La/ncq;->d:Ljava/lang/Boolean;

    .line 279
    .line 280
    if-eqz v7, :cond_10

    .line 281
    .line 282
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    goto :goto_e

    .line 287
    :cond_10
    const/4 v7, 0x0

    .line 288
    :goto_e
    if-eqz v0, :cond_1b

    .line 289
    .line 290
    iget-object v0, v0, La/ncq;->b:Ljava/util/List;

    .line 291
    .line 292
    if-eqz v0, :cond_1b

    .line 293
    .line 294
    new-instance v8, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    if-eqz v9, :cond_1c

    .line 312
    .line 313
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    check-cast v9, La/vbq;

    .line 318
    .line 319
    const-wide/16 v12, 0x0

    .line 320
    .line 321
    if-eqz v9, :cond_11

    .line 322
    .line 323
    iget-object v14, v9, La/vbq;->b:Ljava/lang/Double;

    .line 324
    .line 325
    if-eqz v14, :cond_11

    .line 326
    .line 327
    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    .line 328
    .line 329
    .line 330
    move-result-wide v14

    .line 331
    move-wide/from16 v18, v14

    .line 332
    .line 333
    goto :goto_10

    .line 334
    :cond_11
    move-wide/from16 v18, v12

    .line 335
    .line 336
    :goto_10
    new-instance v16, La/sbq;

    .line 337
    .line 338
    if-eqz v9, :cond_13

    .line 339
    .line 340
    iget-object v14, v9, La/vbq;->a:Ljava/lang/String;

    .line 341
    .line 342
    if-nez v14, :cond_12

    .line 343
    .line 344
    goto :goto_12

    .line 345
    :cond_12
    :goto_11
    move-object/from16 v17, v14

    .line 346
    .line 347
    goto :goto_13

    .line 348
    :cond_13
    :goto_12
    invoke-static/range {v18 .. v19}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v14

    .line 352
    goto :goto_11

    .line 353
    :goto_13
    if-eqz v9, :cond_14

    .line 354
    .line 355
    iget-object v14, v9, La/vbq;->c:Ljava/lang/Double;

    .line 356
    .line 357
    if-eqz v14, :cond_14

    .line 358
    .line 359
    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    .line 360
    .line 361
    .line 362
    move-result-wide v12

    .line 363
    :cond_14
    move-wide/from16 v20, v12

    .line 364
    .line 365
    if-eqz v9, :cond_15

    .line 366
    .line 367
    iget-object v12, v9, La/vbq;->d:Ljava/lang/Long;

    .line 368
    .line 369
    if-eqz v12, :cond_15

    .line 370
    .line 371
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 372
    .line 373
    .line 374
    move-result-wide v12

    .line 375
    move-wide/from16 v22, v12

    .line 376
    .line 377
    goto :goto_14

    .line 378
    :cond_15
    move-wide/from16 v22, v3

    .line 379
    .line 380
    :goto_14
    if-eqz v9, :cond_16

    .line 381
    .line 382
    iget-object v9, v9, La/vbq;->f:Ljava/lang/Integer;

    .line 383
    .line 384
    goto :goto_15

    .line 385
    :cond_16
    move-object v9, v10

    .line 386
    :goto_15
    if-nez v9, :cond_17

    .line 387
    .line 388
    goto :goto_17

    .line 389
    :cond_17
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 390
    .line 391
    .line 392
    move-result v12

    .line 393
    const/16 v13, 0x60a

    .line 394
    .line 395
    if-ne v12, v13, :cond_18

    .line 396
    .line 397
    sget-object v9, La/wbq;->a:La/wbq;

    .line 398
    .line 399
    :goto_16
    move-object/from16 v24, v9

    .line 400
    .line 401
    goto :goto_19

    .line 402
    :cond_18
    :goto_17
    if-nez v9, :cond_19

    .line 403
    .line 404
    goto :goto_18

    .line 405
    :cond_19
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result v9

    .line 409
    const/16 v12, 0x60b

    .line 410
    .line 411
    if-ne v9, v12, :cond_1a

    .line 412
    .line 413
    sget-object v9, La/wbq;->b:La/wbq;

    .line 414
    .line 415
    goto :goto_16

    .line 416
    :cond_1a
    :goto_18
    sget-object v9, La/wbq;->c:La/wbq;

    .line 417
    .line 418
    goto :goto_16

    .line 419
    :goto_19
    invoke-direct/range {v16 .. v24}, La/sbq;-><init>(Ljava/lang/String;DDJLa/wbq;)V

    .line 420
    .line 421
    .line 422
    move-object/from16 v9, v16

    .line 423
    .line 424
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    goto :goto_f

    .line 428
    :cond_1b
    sget-object v8, La/iun;->a:La/iun;

    .line 429
    .line 430
    :cond_1c
    new-instance v0, La/kcq;

    .line 431
    .line 432
    invoke-direct {v0, v5, v8, v6, v7}, La/kcq;-><init>(FLjava/util/List;La/gcq;Z)V

    .line 433
    .line 434
    .line 435
    iget-object v1, v1, La/rbq;->c:Ljava/util/List;

    .line 436
    .line 437
    if-eqz v1, :cond_1d

    .line 438
    .line 439
    new-instance v3, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 446
    .line 447
    .line 448
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    if-eqz v2, :cond_1e

    .line 457
    .line 458
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    check-cast v2, La/jcq;

    .line 463
    .line 464
    invoke-static {v2}, La/plc;->P(La/jcq;)La/gcq;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    goto :goto_1a

    .line 472
    :cond_1d
    sget-object v3, La/iun;->a:La/iun;

    .line 473
    .line 474
    :cond_1e
    new-instance v1, La/obq;

    .line 475
    .line 476
    invoke-direct {v1, v11, v0, v3}, La/obq;-><init>(La/xbq;La/kcq;Ljava/util/List;)V

    .line 477
    .line 478
    .line 479
    return-object v1
.end method

.method public final b(La/zje;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p1, La/e7q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/e7q;

    .line 7
    .line 8
    iget v1, v0, La/e7q;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/e7q;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/e7q;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/e7q;-><init>(La/h7q;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/e7q;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/e7q;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/h7q;->e:La/knf0;

    .line 51
    .line 52
    invoke-virtual {p1}, La/knf0;->c()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput v3, v0, La/e7q;->k:I

    .line 57
    .line 58
    iget-object p0, p0, La/h7q;->b:La/a7q;

    .line 59
    .line 60
    iget-object p0, p0, La/a7q;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, La/wgn;

    .line 63
    .line 64
    invoke-virtual {p0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/y5q;

    .line 69
    .line 70
    invoke-interface {p0, p1, v0}, La/y5q;->c(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 78
    .line 79
    new-instance p0, Ljava/util/ArrayList;

    .line 80
    .line 81
    const/16 v0, 0xa

    .line 82
    .line 83
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, La/jcq;

    .line 105
    .line 106
    invoke-static {v0}, La/plc;->P(La/jcq;)La/gcq;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    return-object p0
.end method

.method public final c(JDDDZIJDLjava/lang/String;JZZLa/ql5;JLa/ezc;IZILa/zje;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p27

    .line 4
    .line 5
    instance-of v2, v1, La/g7q;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/g7q;

    .line 11
    .line 12
    iget v3, v2, La/g7q;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/g7q;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/g7q;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/g7q;-><init>(La/h7q;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/g7q;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/g7q;->k:I

    .line 34
    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    if-ne v4, v7, :cond_1

    .line 41
    .line 42
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    return-object v0

    .line 54
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    cmp-long v1, p16, v5

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    move-wide/from16 v8, p16

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    move-object/from16 v1, p20

    .line 65
    .line 66
    iget-wide v8, v1, La/ql5;->a:J

    .line 67
    .line 68
    :goto_1
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v10, La/kbq;

    .line 72
    .line 73
    invoke-static/range {p1 .. p2}, La/znq0;->g(J)J

    .line 74
    .line 75
    .line 76
    move-result-wide v11

    .line 77
    invoke-static/range {p11 .. p12}, La/znq0;->g(J)J

    .line 78
    .line 79
    .line 80
    move-result-wide v13

    .line 81
    if-eqz p9, :cond_4

    .line 82
    .line 83
    move-wide/from16 v15, p5

    .line 84
    .line 85
    :goto_2
    move/from16 v1, p10

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move-wide/from16 v15, p7

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :goto_3
    int-to-long v5, v1

    .line 92
    if-eqz p9, :cond_5

    .line 93
    .line 94
    const/16 v1, 0x60a

    .line 95
    .line 96
    :goto_4
    move/from16 v23, v1

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    const/16 v1, 0x60b

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :goto_5
    move-wide/from16 v21, v5

    .line 103
    .line 104
    move-wide/from16 v19, p3

    .line 105
    .line 106
    move-wide/from16 v17, v5

    .line 107
    .line 108
    invoke-direct/range {v10 .. v23}, La/kbq;-><init>(JJDJDJI)V

    .line 109
    .line 110
    .line 111
    invoke-static {v10}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v28

    .line 115
    iget-object v1, v0, La/h7q;->e:La/knf0;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v31

    .line 124
    invoke-virtual {v1}, La/knf0;->a()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v36

    .line 128
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {p23 .. p23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-object/from16 v1, p23

    .line 138
    .line 139
    iget-byte v1, v1, La/ezc;->a:B

    .line 140
    .line 141
    if-eqz p25, :cond_6

    .line 142
    .line 143
    move/from16 v39, v7

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_6
    const/4 v4, 0x2

    .line 147
    move/from16 v39, v4

    .line 148
    .line 149
    :goto_6
    new-instance v26, La/nbq;

    .line 150
    .line 151
    invoke-static/range {p13 .. p14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 152
    .line 153
    .line 154
    move-result-object v27

    .line 155
    const/16 v4, 0x16

    .line 156
    .line 157
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v29

    .line 161
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v30

    .line 165
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v32

    .line 169
    invoke-static/range {p21 .. p22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 170
    .line 171
    .line 172
    move-result-object v34

    .line 173
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object v35

    .line 177
    invoke-static/range {p24 .. p24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v37

    .line 181
    invoke-static/range {p18 .. p18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object v38

    .line 185
    move-object/from16 v33, p15

    .line 186
    .line 187
    move/from16 v40, p26

    .line 188
    .line 189
    invoke-direct/range {v26 .. v40}, La/nbq;-><init>(Ljava/lang/Double;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;II)V

    .line 190
    .line 191
    .line 192
    move-object/from16 v1, v26

    .line 193
    .line 194
    iget-object v4, v0, La/h7q;->a:La/btt0;

    .line 195
    .line 196
    invoke-virtual {v4}, La/btt0;->a()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    iput v7, v2, La/g7q;->k:I

    .line 201
    .line 202
    iget-object v0, v0, La/h7q;->b:La/a7q;

    .line 203
    .line 204
    invoke-virtual {v0, v4, v1, v2}, La/a7q;->f(Ljava/lang/String;La/nbq;La/zje;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-ne v1, v3, :cond_7

    .line 209
    .line 210
    return-object v3

    .line 211
    :cond_7
    :goto_7
    check-cast v1, La/fi7;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object v0, v1, La/fi7;->a:Ljava/lang/Double;

    .line 217
    .line 218
    iget-object v2, v1, La/fi7;->c:La/o1f;

    .line 219
    .line 220
    const-wide/16 v3, 0x0

    .line 221
    .line 222
    if-eqz v0, :cond_8

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 225
    .line 226
    .line 227
    move-result-wide v5

    .line 228
    goto :goto_8

    .line 229
    :cond_8
    move-wide v5, v3

    .line 230
    :goto_8
    iget-object v0, v1, La/fi7;->b:Ljava/lang/Long;

    .line 231
    .line 232
    if-eqz v0, :cond_9

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v0

    .line 238
    move-wide/from16 v24, v0

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_9
    const-wide/16 v24, 0x0

    .line 242
    .line 243
    :goto_9
    if-eqz v2, :cond_a

    .line 244
    .line 245
    iget-object v0, v2, La/o1f;->a:Ljava/lang/String;

    .line 246
    .line 247
    if-nez v0, :cond_b

    .line 248
    .line 249
    :cond_a
    const-string v0, "0.0"

    .line 250
    .line 251
    :cond_b
    if-eqz v2, :cond_c

    .line 252
    .line 253
    iget-object v1, v2, La/o1f;->b:Ljava/lang/Double;

    .line 254
    .line 255
    if-eqz v1, :cond_c

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 258
    .line 259
    .line 260
    move-result-wide v7

    .line 261
    goto :goto_a

    .line 262
    :cond_c
    move-wide v7, v3

    .line 263
    :goto_a
    if-eqz v2, :cond_d

    .line 264
    .line 265
    iget-object v1, v2, La/o1f;->c:Ljava/lang/Double;

    .line 266
    .line 267
    if-eqz v1, :cond_d

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 270
    .line 271
    .line 272
    move-result-wide v3

    .line 273
    :cond_d
    new-instance v1, La/yh7;

    .line 274
    .line 275
    move-object/from16 p7, v0

    .line 276
    .line 277
    move-object/from16 p0, v1

    .line 278
    .line 279
    move-wide/from16 p8, v3

    .line 280
    .line 281
    move-wide/from16 p1, v5

    .line 282
    .line 283
    move-wide/from16 p5, v7

    .line 284
    .line 285
    move-wide/from16 p3, v24

    .line 286
    .line 287
    invoke-direct/range {p0 .. p9}, La/yh7;-><init>(DJDLjava/lang/String;D)V

    .line 288
    .line 289
    .line 290
    move-object/from16 v0, p0

    .line 291
    .line 292
    return-object v0
.end method
