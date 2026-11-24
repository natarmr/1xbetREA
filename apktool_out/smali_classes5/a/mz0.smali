.class public final synthetic La/mz0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V
    .locals 1

    .line 1
    const/16 v0, 0xe

    iput-byte v0, p0, La/mz0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/mz0;->b:J

    iput-object p3, p0, La/mz0;->c:Ljava/lang/Object;

    iput-object p4, p0, La/mz0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/mz0;->a:B

    iput-object p1, p0, La/mz0;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/mz0;->b:J

    iput-object p4, p0, La/mz0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JB)V
    .locals 0

    .line 3
    iput-byte p5, p0, La/mz0;->a:B

    iput-object p1, p0, La/mz0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/mz0;->d:Ljava/lang/Object;

    iput-wide p3, p0, La/mz0;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mz0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const-wide/16 v5, 0x0

    .line 8
    .line 9
    const/16 v7, 0xa

    .line 10
    .line 11
    const-string v8, ""

    .line 12
    .line 13
    const/4 v9, 0x2

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x1

    .line 16
    const/4 v12, 0x0

    .line 17
    iget-wide v13, v0, La/mz0;->b:J

    .line 18
    .line 19
    iget-object v15, v0, La/mz0;->d:Ljava/lang/Object;

    .line 20
    .line 21
    const-wide/16 v16, 0x2

    .line 22
    .line 23
    iget-object v3, v0, La/mz0;->c:Ljava/lang/Object;

    .line 24
    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    check-cast v3, La/a4x;

    .line 29
    .line 30
    move-object/from16 v22, v15

    .line 31
    .line 32
    check-cast v22, Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, La/hcz;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    new-instance v4, La/d1c0;

    .line 46
    .line 47
    invoke-direct {v4, v3, v10}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 48
    .line 49
    .line 50
    new-instance v18, La/a9m;

    .line 51
    .line 52
    const/16 v23, 0x1

    .line 53
    .line 54
    iget-wide v5, v0, La/mz0;->b:J

    .line 55
    .line 56
    move-object/from16 v19, v3

    .line 57
    .line 58
    move-wide/from16 v20, v5

    .line 59
    .line 60
    invoke-direct/range {v18 .. v23}, La/a9m;-><init>(Ljava/util/List;JLkotlin/jvm/functions/Function1;B)V

    .line 61
    .line 62
    .line 63
    move-object/from16 v0, v18

    .line 64
    .line 65
    new-instance v3, La/ugd;

    .line 66
    .line 67
    const v5, 0x2fd4df92

    .line 68
    .line 69
    .line 70
    invoke-direct {v3, v5, v11, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2, v12, v4, v3}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_0
    check-cast v3, La/v3b0;

    .line 80
    .line 81
    check-cast v15, Ljava/lang/String;

    .line 82
    .line 83
    move-object/from16 v1, p1

    .line 84
    .line 85
    check-cast v1, La/k0w0;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v2, v3, La/v3b0;->t:La/peg0;

    .line 91
    .line 92
    new-instance v3, La/fr1;

    .line 93
    .line 94
    new-instance v16, La/fs80;

    .line 95
    .line 96
    if-nez v15, :cond_0

    .line 97
    .line 98
    move-object/from16 v17, v8

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move-object/from16 v17, v15

    .line 102
    .line 103
    :goto_0
    sget-object v20, La/iun;->a:La/iun;

    .line 104
    .line 105
    const/16 v24, 0x1

    .line 106
    .line 107
    const/16 v25, 0x58

    .line 108
    .line 109
    iget-wide v4, v0, La/mz0;->b:J

    .line 110
    .line 111
    const/16 v21, 0x0

    .line 112
    .line 113
    const-wide/16 v22, 0x0

    .line 114
    .line 115
    move-wide/from16 v18, v4

    .line 116
    .line 117
    invoke-direct/range {v16 .. v25}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v0, v16

    .line 121
    .line 122
    invoke-direct {v3, v0, v12, v9}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v3}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 130
    .line 131
    .line 132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_1
    check-cast v3, La/xw30;

    .line 136
    .line 137
    move-object v5, v15

    .line 138
    check-cast v5, La/n3w;

    .line 139
    .line 140
    move-object/from16 v1, p1

    .line 141
    .line 142
    check-cast v1, La/k0w0;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v2, v3, La/xw30;->v:La/r9u;

    .line 148
    .line 149
    sget-object v4, La/ygp;->x:La/ygp;

    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 160
    .line 161
    invoke-virtual {v2, v4}, La/m1q0;->d(La/ygp;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    iget-wide v7, v0, La/mz0;->b:J

    .line 166
    .line 167
    if-eqz v2, :cond_1

    .line 168
    .line 169
    new-instance v0, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;

    .line 170
    .line 171
    new-instance v6, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;

    .line 172
    .line 173
    invoke-virtual {v3}, La/x2t0;->d()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, La/lx30;

    .line 178
    .line 179
    iget-object v2, v2, La/lx30;->a:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v3}, La/x2t0;->d()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, La/lx30;

    .line 186
    .line 187
    iget-object v12, v3, La/lx30;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 188
    .line 189
    move-wide v9, v7

    .line 190
    const/4 v8, 0x1

    .line 191
    const/4 v11, 0x1

    .line 192
    move-object v7, v2

    .line 193
    invoke-direct/range {v6 .. v12}, Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;-><init>(Ljava/lang/String;ZJZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 194
    .line 195
    .line 196
    invoke-direct {v0, v6}, Lorg/xplatform/bet_history/sale/presentation/SaleBetScreen;-><init>(Lorg/xplatform/bet_history/sale/presentation/model/SaleScreenModel;)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_1
    move-wide v9, v7

    .line 201
    new-instance v4, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;

    .line 202
    .line 203
    const/4 v6, 0x1

    .line 204
    const/4 v9, 0x1

    .line 205
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;-><init>(La/n3w;ZJZ)V

    .line 206
    .line 207
    .line 208
    move-object v0, v4

    .line 209
    :goto_1
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 210
    .line 211
    .line 212
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_2
    check-cast v3, La/ctf0;

    .line 216
    .line 217
    move-object v4, v15

    .line 218
    check-cast v4, La/ocl;

    .line 219
    .line 220
    move-object/from16 v2, p1

    .line 221
    .line 222
    check-cast v2, La/ma00;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    new-instance v1, La/fb00;

    .line 228
    .line 229
    iget-wide v5, v0, La/mz0;->b:J

    .line 230
    .line 231
    invoke-direct/range {v1 .. v6}, La/fb00;-><init>(La/ma00;La/ctf0;La/ocl;J)V

    .line 232
    .line 233
    .line 234
    return-object v1

    .line 235
    :pswitch_3
    check-cast v3, Ljava/util/ArrayList;

    .line 236
    .line 237
    check-cast v15, La/jbz;

    .line 238
    .line 239
    move-object/from16 v0, p1

    .line 240
    .line 241
    check-cast v0, La/ou90;

    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    move v2, v10

    .line 248
    :goto_2
    if-ge v2, v1, :cond_d

    .line 249
    .line 250
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    check-cast v4, La/hez;

    .line 255
    .line 256
    iget-object v5, v15, La/jbz;->b:La/c5n0;

    .line 257
    .line 258
    invoke-interface {v5}, La/cnx;->M()Z

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    iget-boolean v6, v4, La/hez;->d:Z

    .line 263
    .line 264
    iget v7, v4, La/hez;->r:I

    .line 265
    .line 266
    const/high16 v8, -0x80000000

    .line 267
    .line 268
    if-eq v7, v8, :cond_2

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_2
    const-string v7, "position() should be called first"

    .line 272
    .line 273
    invoke-static {v7}, La/adx;->a(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :goto_3
    iget-object v7, v4, La/hez;->c:Ljava/util/List;

    .line 277
    .line 278
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    move v9, v10

    .line 283
    :goto_4
    if-ge v9, v8, :cond_c

    .line 284
    .line 285
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    check-cast v11, La/pu90;

    .line 290
    .line 291
    iget v10, v4, La/hez;->s:I

    .line 292
    .line 293
    if-eqz v6, :cond_3

    .line 294
    .line 295
    iget v12, v11, La/pu90;->b:I

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_3
    iget v12, v11, La/pu90;->a:I

    .line 299
    .line 300
    :goto_5
    sub-int/2addr v10, v12

    .line 301
    iget v12, v4, La/hez;->t:I

    .line 302
    .line 303
    move/from16 p0, v1

    .line 304
    .line 305
    move/from16 v16, v2

    .line 306
    .line 307
    iget-wide v1, v4, La/hez;->w:J

    .line 308
    .line 309
    move-object/from16 v17, v3

    .line 310
    .line 311
    iget-object v3, v4, La/hez;->j:La/dbz;

    .line 312
    .line 313
    move/from16 p1, v5

    .line 314
    .line 315
    iget-object v5, v4, La/hez;->b:Ljava/lang/Object;

    .line 316
    .line 317
    invoke-virtual {v3, v9, v5}, La/dbz;->a(ILjava/lang/Object;)La/zaz;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    if-eqz v3, :cond_9

    .line 322
    .line 323
    if-eqz p1, :cond_4

    .line 324
    .line 325
    iput-wide v1, v3, La/zaz;->n:J

    .line 326
    .line 327
    move/from16 v20, v6

    .line 328
    .line 329
    move-object/from16 v21, v7

    .line 330
    .line 331
    move/from16 v22, v8

    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_4
    move/from16 v20, v6

    .line 335
    .line 336
    iget-wide v5, v3, La/zaz;->n:J

    .line 337
    .line 338
    move-object/from16 v21, v7

    .line 339
    .line 340
    move/from16 v22, v8

    .line 341
    .line 342
    const-wide v7, 0x7fffffff7fffffffL

    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    invoke-static {v5, v6, v7, v8}, La/ikx;->b(JJ)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    if-nez v5, :cond_5

    .line 352
    .line 353
    iget-wide v5, v3, La/zaz;->n:J

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_5
    move-wide v5, v1

    .line 357
    :goto_6
    iget-object v7, v3, La/zaz;->r:La/pz40;

    .line 358
    .line 359
    check-cast v7, La/hgk0;

    .line 360
    .line 361
    invoke-virtual {v7}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    check-cast v7, La/ikx;

    .line 366
    .line 367
    iget-wide v7, v7, La/ikx;->a:J

    .line 368
    .line 369
    invoke-static {v5, v6, v7, v8}, La/ikx;->d(JJ)J

    .line 370
    .line 371
    .line 372
    move-result-wide v5

    .line 373
    invoke-virtual {v4, v1, v2}, La/hez;->l(J)I

    .line 374
    .line 375
    .line 376
    move-result v7

    .line 377
    if-gt v7, v10, :cond_6

    .line 378
    .line 379
    invoke-virtual {v4, v5, v6}, La/hez;->l(J)I

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    if-le v7, v10, :cond_7

    .line 384
    .line 385
    :cond_6
    invoke-virtual {v4, v1, v2}, La/hez;->l(J)I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-lt v1, v12, :cond_8

    .line 390
    .line 391
    invoke-virtual {v4, v5, v6}, La/hez;->l(J)I

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-lt v1, v12, :cond_8

    .line 396
    .line 397
    :cond_7
    invoke-virtual {v3}, La/zaz;->b()V

    .line 398
    .line 399
    .line 400
    :cond_8
    move-wide v1, v5

    .line 401
    :goto_7
    iget-object v5, v3, La/zaz;->o:La/dfv;

    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_9
    move/from16 v20, v6

    .line 405
    .line 406
    move-object/from16 v21, v7

    .line 407
    .line 408
    move/from16 v22, v8

    .line 409
    .line 410
    const/4 v5, 0x0

    .line 411
    :goto_8
    invoke-static {v1, v2, v13, v14}, La/ikx;->d(JJ)J

    .line 412
    .line 413
    .line 414
    move-result-wide v1

    .line 415
    if-nez p1, :cond_a

    .line 416
    .line 417
    if-eqz v3, :cond_a

    .line 418
    .line 419
    iput-wide v1, v3, La/zaz;->m:J

    .line 420
    .line 421
    :cond_a
    if-eqz v5, :cond_b

    .line 422
    .line 423
    invoke-static {v0, v11, v1, v2, v5}, La/ou90;->C(La/ou90;La/pu90;JLa/dfv;)V

    .line 424
    .line 425
    .line 426
    goto :goto_9

    .line 427
    :cond_b
    invoke-static {v0, v11, v1, v2}, La/ou90;->y(La/ou90;La/pu90;J)V

    .line 428
    .line 429
    .line 430
    :goto_9
    add-int/lit8 v9, v9, 0x1

    .line 431
    .line 432
    move/from16 v1, p0

    .line 433
    .line 434
    move/from16 v5, p1

    .line 435
    .line 436
    move/from16 v2, v16

    .line 437
    .line 438
    move-object/from16 v3, v17

    .line 439
    .line 440
    move/from16 v6, v20

    .line 441
    .line 442
    move-object/from16 v7, v21

    .line 443
    .line 444
    move/from16 v8, v22

    .line 445
    .line 446
    const/4 v10, 0x0

    .line 447
    const/4 v12, 0x0

    .line 448
    goto/16 :goto_4

    .line 449
    .line 450
    :cond_c
    move/from16 p0, v1

    .line 451
    .line 452
    move/from16 v16, v2

    .line 453
    .line 454
    move-object/from16 v17, v3

    .line 455
    .line 456
    add-int/lit8 v2, v16, 0x1

    .line 457
    .line 458
    const/4 v10, 0x0

    .line 459
    const/4 v12, 0x0

    .line 460
    goto/16 :goto_2

    .line 461
    .line 462
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 463
    .line 464
    return-object v0

    .line 465
    :pswitch_4
    check-cast v3, La/r9u;

    .line 466
    .line 467
    move-object/from16 v20, v15

    .line 468
    .line 469
    check-cast v20, La/ocl;

    .line 470
    .line 471
    move-object/from16 v0, p1

    .line 472
    .line 473
    check-cast v0, La/rzy;

    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    sget-object v1, La/ygp;->t:La/ygp;

    .line 479
    .line 480
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    iget-object v2, v3, La/r9u;->a:La/j1q0;

    .line 484
    .line 485
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 489
    .line 490
    invoke-virtual {v2, v1}, La/m1q0;->d(La/ygp;)Z

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    iget-boolean v2, v0, La/rzy;->c:Z

    .line 495
    .line 496
    if-eqz v2, :cond_e

    .line 497
    .line 498
    sget-object v21, La/pb10;->g:La/pb10;

    .line 499
    .line 500
    const-wide/16 v29, 0x0

    .line 501
    .line 502
    const/16 v31, 0x3de

    .line 503
    .line 504
    const/16 v22, 0x0

    .line 505
    .line 506
    const/16 v23, 0x0

    .line 507
    .line 508
    const/16 v24, 0x0

    .line 509
    .line 510
    const v25, 0x7f130674

    .line 511
    .line 512
    .line 513
    const/16 v26, 0x0

    .line 514
    .line 515
    const-wide/16 v27, 0x0

    .line 516
    .line 517
    invoke-static/range {v20 .. v31}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    goto :goto_a

    .line 522
    :cond_e
    iget-boolean v2, v0, La/rzy;->b:Z

    .line 523
    .line 524
    if-eqz v2, :cond_f

    .line 525
    .line 526
    sget-object v21, La/pb10;->g:La/pb10;

    .line 527
    .line 528
    const-wide/16 v29, 0x0

    .line 529
    .line 530
    const/16 v31, 0x25e

    .line 531
    .line 532
    const/16 v22, 0x0

    .line 533
    .line 534
    const/16 v23, 0x0

    .line 535
    .line 536
    const/16 v24, 0x0

    .line 537
    .line 538
    const v25, 0x7f130677

    .line 539
    .line 540
    .line 541
    const v26, 0x7f131690

    .line 542
    .line 543
    .line 544
    const-wide/16 v27, 0x2710

    .line 545
    .line 546
    invoke-static/range {v20 .. v31}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    goto :goto_a

    .line 551
    :cond_f
    const/4 v2, 0x0

    .line 552
    :goto_a
    iget-boolean v3, v0, La/rzy;->a:Z

    .line 553
    .line 554
    if-eqz v3, :cond_10

    .line 555
    .line 556
    sget-object v20, La/tzy;->a:La/tzy;

    .line 557
    .line 558
    move-object/from16 v21, v20

    .line 559
    .line 560
    move-object/from16 v22, v20

    .line 561
    .line 562
    move-object/from16 v23, v20

    .line 563
    .line 564
    move-object/from16 v24, v20

    .line 565
    .line 566
    move-object/from16 v25, v20

    .line 567
    .line 568
    filled-new-array/range {v20 .. v25}, [La/tzy;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-static {v0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    goto/16 :goto_15

    .line 577
    .line 578
    :cond_10
    iget-object v0, v0, La/rzy;->d:Ljava/util/List;

    .line 579
    .line 580
    new-instance v3, Ljava/util/ArrayList;

    .line 581
    .line 582
    invoke-static {v0, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 583
    .line 584
    .line 585
    move-result v4

    .line 586
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 587
    .line 588
    .line 589
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 594
    .line 595
    .line 596
    move-result v4

    .line 597
    if-eqz v4, :cond_1d

    .line 598
    .line 599
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    check-cast v4, La/q4a0;

    .line 604
    .line 605
    iget-object v7, v4, La/q4a0;->a:La/znq0;

    .line 606
    .line 607
    iget-object v9, v4, La/q4a0;->g:La/ufp0;

    .line 608
    .line 609
    iget-object v10, v4, La/q4a0;->f:La/ufp0;

    .line 610
    .line 611
    invoke-interface {v7}, La/aoq0;->b()J

    .line 612
    .line 613
    .line 614
    move-result-wide v11

    .line 615
    cmp-long v7, v11, v5

    .line 616
    .line 617
    if-lez v7, :cond_11

    .line 618
    .line 619
    sget-object v7, La/rdj;->a:La/rdj;

    .line 620
    .line 621
    iget-object v7, v4, La/q4a0;->a:La/znq0;

    .line 622
    .line 623
    sget-object v11, La/sdj;->b:La/sdj;

    .line 624
    .line 625
    const/16 v12, 0x3c

    .line 626
    .line 627
    const/4 v15, 0x0

    .line 628
    invoke-static {v7, v11, v15, v12}, La/rdj;->f(La/aoq0;La/sdj;Ljava/util/Locale;I)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    goto :goto_c

    .line 633
    :cond_11
    move-object v7, v8

    .line 634
    :goto_c
    new-instance v20, La/szy;

    .line 635
    .line 636
    iget-object v11, v4, La/q4a0;->i:Ljava/lang/String;

    .line 637
    .line 638
    new-instance v12, Ljava/lang/StringBuilder;

    .line 639
    .line 640
    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    const-string v11, " "

    .line 644
    .line 645
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v7

    .line 655
    invoke-static {v7}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 656
    .line 657
    .line 658
    move-result-object v7

    .line 659
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v21

    .line 663
    iget v7, v4, La/q4a0;->b:I

    .line 664
    .line 665
    const/4 v11, -0x1

    .line 666
    if-le v7, v11, :cond_12

    .line 667
    .line 668
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v7

    .line 672
    move-object/from16 v22, v7

    .line 673
    .line 674
    goto :goto_d

    .line 675
    :cond_12
    move-object/from16 v22, v8

    .line 676
    .line 677
    :goto_d
    iget v7, v4, La/q4a0;->c:I

    .line 678
    .line 679
    if-le v7, v11, :cond_13

    .line 680
    .line 681
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v7

    .line 685
    move-object/from16 v23, v7

    .line 686
    .line 687
    goto :goto_e

    .line 688
    :cond_13
    move-object/from16 v23, v8

    .line 689
    .line 690
    :goto_e
    iget v7, v4, La/q4a0;->d:I

    .line 691
    .line 692
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v24

    .line 696
    iget v7, v4, La/q4a0;->e:I

    .line 697
    .line 698
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v25

    .line 702
    new-instance v7, La/t6n;

    .line 703
    .line 704
    sget-object v12, La/d4d;->t:La/d4d;

    .line 705
    .line 706
    sget-object v15, La/w6n;->h:La/w6n;

    .line 707
    .line 708
    move-wide/from16 v35, v5

    .line 709
    .line 710
    new-instance v5, La/c280;

    .line 711
    .line 712
    iget-object v6, v10, La/ufp0;->d:Ljava/lang/String;

    .line 713
    .line 714
    const v11, 0x7f0809ae

    .line 715
    .line 716
    .line 717
    invoke-direct {v5, v6, v11}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 718
    .line 719
    .line 720
    invoke-direct {v7, v12, v15, v5}, La/t6n;-><init>(La/d4d;La/w6n;La/c280;)V

    .line 721
    .line 722
    .line 723
    new-instance v5, La/t6n;

    .line 724
    .line 725
    new-instance v6, La/c280;

    .line 726
    .line 727
    move-object/from16 p1, v0

    .line 728
    .line 729
    iget-object v0, v9, La/ufp0;->d:Ljava/lang/String;

    .line 730
    .line 731
    invoke-direct {v6, v0, v11}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 732
    .line 733
    .line 734
    invoke-direct {v5, v12, v15, v6}, La/t6n;-><init>(La/d4d;La/w6n;La/c280;)V

    .line 735
    .line 736
    .line 737
    iget-object v0, v10, La/ufp0;->b:Ljava/lang/String;

    .line 738
    .line 739
    iget-object v6, v9, La/ufp0;->b:Ljava/lang/String;

    .line 740
    .line 741
    iget v9, v4, La/q4a0;->h:I

    .line 742
    .line 743
    const/4 v10, -0x1

    .line 744
    if-le v9, v10, :cond_14

    .line 745
    .line 746
    const-string v11, "\'"

    .line 747
    .line 748
    invoke-static {v9, v11}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v9

    .line 752
    move-object/from16 v30, v9

    .line 753
    .line 754
    goto :goto_f

    .line 755
    :cond_14
    move-object/from16 v30, v8

    .line 756
    .line 757
    :goto_f
    iget v9, v4, La/q4a0;->j:I

    .line 758
    .line 759
    if-le v9, v10, :cond_15

    .line 760
    .line 761
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v9

    .line 765
    move-object/from16 v31, v9

    .line 766
    .line 767
    goto :goto_10

    .line 768
    :cond_15
    move-object/from16 v31, v8

    .line 769
    .line 770
    :goto_10
    iget-object v4, v4, La/q4a0;->k:Ljava/lang/String;

    .line 771
    .line 772
    const-wide/16 v9, 0x1

    .line 773
    .line 774
    cmp-long v9, v13, v9

    .line 775
    .line 776
    if-nez v9, :cond_16

    .line 777
    .line 778
    const v9, 0x7f0807a7

    .line 779
    .line 780
    .line 781
    :goto_11
    move/from16 v33, v9

    .line 782
    .line 783
    goto :goto_12

    .line 784
    :cond_16
    cmp-long v9, v13, v16

    .line 785
    .line 786
    if-nez v9, :cond_17

    .line 787
    .line 788
    const v9, 0x7f080a6c

    .line 789
    .line 790
    .line 791
    goto :goto_11

    .line 792
    :cond_17
    const-wide/16 v9, 0x3

    .line 793
    .line 794
    cmp-long v9, v13, v9

    .line 795
    .line 796
    if-nez v9, :cond_18

    .line 797
    .line 798
    const v9, 0x7f08066a

    .line 799
    .line 800
    .line 801
    goto :goto_11

    .line 802
    :cond_18
    const-wide/16 v9, 0x8

    .line 803
    .line 804
    cmp-long v9, v13, v9

    .line 805
    .line 806
    if-nez v9, :cond_19

    .line 807
    .line 808
    const v9, 0x7f0807c3

    .line 809
    .line 810
    .line 811
    goto :goto_11

    .line 812
    :cond_19
    const-wide/16 v9, 0xd

    .line 813
    .line 814
    cmp-long v9, v13, v9

    .line 815
    .line 816
    if-nez v9, :cond_1a

    .line 817
    .line 818
    const v9, 0x7f080625

    .line 819
    .line 820
    .line 821
    goto :goto_11

    .line 822
    :cond_1a
    const-wide/16 v9, 0xf

    .line 823
    .line 824
    cmp-long v9, v13, v9

    .line 825
    .line 826
    if-nez v9, :cond_1b

    .line 827
    .line 828
    const v9, 0x7f0807a5

    .line 829
    .line 830
    .line 831
    goto :goto_11

    .line 832
    :cond_1b
    const v9, 0x7f080c98

    .line 833
    .line 834
    .line 835
    goto :goto_11

    .line 836
    :goto_12
    cmp-long v9, v13, v35

    .line 837
    .line 838
    if-eqz v9, :cond_1c

    .line 839
    .line 840
    const-string v9, "svg"

    .line 841
    .line 842
    const-string v10, "sports_v2"

    .line 843
    .line 844
    const-string v11, "static"

    .line 845
    .line 846
    invoke-static {v11, v9, v10}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 847
    .line 848
    .line 849
    move-result-object v9

    .line 850
    const-string v10, ".svg"

    .line 851
    .line 852
    invoke-static {v13, v14, v10, v9}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 853
    .line 854
    .line 855
    iget-object v9, v9, La/bzu;->b:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v9, Ljava/lang/StringBuilder;

    .line 858
    .line 859
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v9

    .line 863
    move-object/from16 v34, v9

    .line 864
    .line 865
    :goto_13
    move-object/from16 v28, v0

    .line 866
    .line 867
    move-object/from16 v32, v4

    .line 868
    .line 869
    move-object/from16 v27, v5

    .line 870
    .line 871
    move-object/from16 v29, v6

    .line 872
    .line 873
    move-object/from16 v26, v7

    .line 874
    .line 875
    goto :goto_14

    .line 876
    :cond_1c
    move-object/from16 v34, v8

    .line 877
    .line 878
    goto :goto_13

    .line 879
    :goto_14
    invoke-direct/range {v20 .. v34}, La/szy;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/t6n;La/t6n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 880
    .line 881
    .line 882
    move-object/from16 v0, v20

    .line 883
    .line 884
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 885
    .line 886
    .line 887
    move-object/from16 v0, p1

    .line 888
    .line 889
    move-wide/from16 v5, v35

    .line 890
    .line 891
    goto/16 :goto_b

    .line 892
    .line 893
    :cond_1d
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    :goto_15
    new-instance v3, La/vzy;

    .line 898
    .line 899
    invoke-direct {v3, v2, v0, v1}, La/vzy;-><init>(La/mdm;La/a4x;Z)V

    .line 900
    .line 901
    .line 902
    return-object v3

    .line 903
    :pswitch_5
    check-cast v3, La/q5w;

    .line 904
    .line 905
    check-cast v15, La/uv6;

    .line 906
    .line 907
    move-object/from16 v0, p1

    .line 908
    .line 909
    check-cast v0, La/k0w0;

    .line 910
    .line 911
    iget-object v1, v3, La/q5w;->x:La/gr00;

    .line 912
    .line 913
    new-instance v2, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 914
    .line 915
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    iget v4, v15, La/uv6;->I:I

    .line 920
    .line 921
    int-to-long v6, v4

    .line 922
    const/4 v4, 0x0

    .line 923
    iget v5, v15, La/uv6;->b:I

    .line 924
    .line 925
    invoke-direct/range {v2 .. v7}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 926
    .line 927
    .line 928
    new-instance v3, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 929
    .line 930
    invoke-direct {v3, v2, v1}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v0, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 934
    .line 935
    .line 936
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 937
    .line 938
    return-object v0

    .line 939
    :pswitch_6
    check-cast v3, [La/jwo;

    .line 940
    .line 941
    check-cast v15, La/l7m0;

    .line 942
    .line 943
    move-object/from16 v0, p1

    .line 944
    .line 945
    check-cast v0, La/g7z;

    .line 946
    .line 947
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    invoke-virtual {v0}, La/g7z;->a()V

    .line 951
    .line 952
    .line 953
    iget-object v1, v0, La/g7z;->a:La/a6a;

    .line 954
    .line 955
    invoke-static {v3}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    check-cast v2, Ljava/lang/Iterable;

    .line 960
    .line 961
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 966
    .line 967
    .line 968
    move-result v3

    .line 969
    if-eqz v3, :cond_21

    .line 970
    .line 971
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v3

    .line 975
    check-cast v3, La/jwo;

    .line 976
    .line 977
    invoke-interface {v1}, La/fhl;->d()J

    .line 978
    .line 979
    .line 980
    move-result-wide v4

    .line 981
    invoke-static {v4, v5, v3}, La/vcc;->L(JLa/jwo;)La/iwo;

    .line 982
    .line 983
    .line 984
    move-result-object v4

    .line 985
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v5

    .line 989
    check-cast v5, La/ycl;

    .line 990
    .line 991
    iget v5, v5, La/ycl;->a:F

    .line 992
    .line 993
    invoke-virtual {v0, v5}, La/g7z;->w0(F)F

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 998
    .line 999
    .line 1000
    move-result v3

    .line 1001
    if-eqz v3, :cond_20

    .line 1002
    .line 1003
    if-eq v3, v11, :cond_20

    .line 1004
    .line 1005
    if-eq v3, v9, :cond_1f

    .line 1006
    .line 1007
    const/4 v6, 0x3

    .line 1008
    if-ne v3, v6, :cond_1e

    .line 1009
    .line 1010
    goto :goto_17

    .line 1011
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 1012
    .line 1013
    .line 1014
    const/4 v12, 0x0

    .line 1015
    goto :goto_1a

    .line 1016
    :cond_1f
    :goto_17
    invoke-interface {v1}, La/fhl;->d()J

    .line 1017
    .line 1018
    .line 1019
    move-result-wide v6

    .line 1020
    const-wide v16, 0xffffffffL

    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    and-long v6, v6, v16

    .line 1026
    .line 1027
    long-to-int v3, v6

    .line 1028
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1029
    .line 1030
    .line 1031
    move-result v3

    .line 1032
    :goto_18
    div-float/2addr v5, v3

    .line 1033
    goto :goto_19

    .line 1034
    :cond_20
    invoke-interface {v1}, La/fhl;->d()J

    .line 1035
    .line 1036
    .line 1037
    move-result-wide v6

    .line 1038
    const/16 v3, 0x20

    .line 1039
    .line 1040
    shr-long/2addr v6, v3

    .line 1041
    long-to-int v3, v6

    .line 1042
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1043
    .line 1044
    .line 1045
    move-result v3

    .line 1046
    goto :goto_18

    .line 1047
    :goto_19
    const/4 v3, 0x0

    .line 1048
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v3

    .line 1052
    new-instance v6, La/y3d;

    .line 1053
    .line 1054
    invoke-direct {v6, v13, v14}, La/y3d;-><init>(J)V

    .line 1055
    .line 1056
    .line 1057
    new-instance v7, Lkotlin/Pair;

    .line 1058
    .line 1059
    invoke-direct {v7, v3, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1060
    .line 1061
    .line 1062
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v3

    .line 1066
    sget-wide v5, La/y3d;->f:J

    .line 1067
    .line 1068
    new-instance v8, La/y3d;

    .line 1069
    .line 1070
    invoke-direct {v8, v5, v6}, La/y3d;-><init>(J)V

    .line 1071
    .line 1072
    .line 1073
    new-instance v5, Lkotlin/Pair;

    .line 1074
    .line 1075
    invoke-direct {v5, v3, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1076
    .line 1077
    .line 1078
    filled-new-array {v7, v5}, [Lkotlin/Pair;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v20

    .line 1082
    iget-wide v5, v4, La/iwo;->a:J

    .line 1083
    .line 1084
    iget-wide v3, v4, La/iwo;->b:J

    .line 1085
    .line 1086
    const/16 v25, 0x8

    .line 1087
    .line 1088
    move-wide/from16 v23, v3

    .line 1089
    .line 1090
    move-wide/from16 v21, v5

    .line 1091
    .line 1092
    invoke-static/range {v20 .. v25}, La/yk5;->k([Lkotlin/Pair;JJI)La/e900;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v21

    .line 1096
    invoke-interface {v1}, La/fhl;->d()J

    .line 1097
    .line 1098
    .line 1099
    move-result-wide v24

    .line 1100
    const/16 v29, 0x0

    .line 1101
    .line 1102
    const/16 v30, 0x7a

    .line 1103
    .line 1104
    const-wide/16 v22, 0x0

    .line 1105
    .line 1106
    const/16 v26, 0x0

    .line 1107
    .line 1108
    const/16 v27, 0x0

    .line 1109
    .line 1110
    const/16 v28, 0x0

    .line 1111
    .line 1112
    move-object/from16 v20, v0

    .line 1113
    .line 1114
    invoke-static/range {v20 .. v30}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 1115
    .line 1116
    .line 1117
    goto/16 :goto_16

    .line 1118
    .line 1119
    :cond_21
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1120
    .line 1121
    :goto_1a
    return-object v12

    .line 1122
    :pswitch_7
    check-cast v3, Ljava/lang/String;

    .line 1123
    .line 1124
    check-cast v15, La/d4o;

    .line 1125
    .line 1126
    move-object/from16 v0, p1

    .line 1127
    .line 1128
    check-cast v0, La/n1g;

    .line 1129
    .line 1130
    invoke-virtual {v0, v3}, La/n1g;->b(Ljava/lang/String;)V

    .line 1131
    .line 1132
    .line 1133
    iput-wide v13, v0, La/n1g;->c:J

    .line 1134
    .line 1135
    new-instance v1, La/lq2;

    .line 1136
    .line 1137
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1138
    .line 1139
    .line 1140
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 1141
    .line 1142
    sget-object v1, La/j1g;->b:La/std;

    .line 1143
    .line 1144
    iget-object v2, v15, La/d4o;->o:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 1145
    .line 1146
    invoke-interface {v2}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;->I()I

    .line 1147
    .line 1148
    .line 1149
    move-result v2

    .line 1150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1151
    .line 1152
    .line 1153
    invoke-static {v2}, La/std;->e(I)La/j1g;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 1158
    .line 1159
    sget-object v1, La/l1g;->b:La/l1g;

    .line 1160
    .line 1161
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 1162
    .line 1163
    sget-object v1, La/k1g;->b:La/k1g;

    .line 1164
    .line 1165
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 1166
    .line 1167
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1168
    .line 1169
    return-object v0

    .line 1170
    :pswitch_8
    check-cast v3, La/f9m;

    .line 1171
    .line 1172
    move-object v8, v15

    .line 1173
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 1174
    .line 1175
    move-object/from16 v1, p1

    .line 1176
    .line 1177
    check-cast v1, La/hcz;

    .line 1178
    .line 1179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    check-cast v3, La/d9m;

    .line 1183
    .line 1184
    iget-object v5, v3, La/d9m;->a:La/a4x;

    .line 1185
    .line 1186
    new-instance v3, La/f4m;

    .line 1187
    .line 1188
    invoke-direct {v3, v2}, La/f4m;-><init>(B)V

    .line 1189
    .line 1190
    .line 1191
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1192
    .line 1193
    .line 1194
    move-result v2

    .line 1195
    new-instance v10, La/ctl;

    .line 1196
    .line 1197
    const/16 v4, 0x9

    .line 1198
    .line 1199
    invoke-direct {v10, v3, v5, v4}, La/ctl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1200
    .line 1201
    .line 1202
    new-instance v3, La/wl0;

    .line 1203
    .line 1204
    const/16 v4, 0x1c

    .line 1205
    .line 1206
    invoke-direct {v3, v5, v4}, La/wl0;-><init>(La/a4x;B)V

    .line 1207
    .line 1208
    .line 1209
    new-instance v4, La/a9m;

    .line 1210
    .line 1211
    const/4 v9, 0x0

    .line 1212
    iget-wide v6, v0, La/mz0;->b:J

    .line 1213
    .line 1214
    invoke-direct/range {v4 .. v9}, La/a9m;-><init>(Ljava/util/List;JLkotlin/jvm/functions/Function1;B)V

    .line 1215
    .line 1216
    .line 1217
    new-instance v0, La/ugd;

    .line 1218
    .line 1219
    const v5, 0x799532c4

    .line 1220
    .line 1221
    .line 1222
    invoke-direct {v0, v5, v11, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v1, v2, v10, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1226
    .line 1227
    .line 1228
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1229
    .line 1230
    return-object v0

    .line 1231
    :pswitch_9
    check-cast v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1232
    .line 1233
    check-cast v15, La/k1g;

    .line 1234
    .line 1235
    move-object/from16 v0, p1

    .line 1236
    .line 1237
    check-cast v0, La/n1g;

    .line 1238
    .line 1239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1240
    .line 1241
    .line 1242
    iput-wide v13, v0, La/n1g;->c:J

    .line 1243
    .line 1244
    sget-object v1, La/j1g;->b:La/std;

    .line 1245
    .line 1246
    iget-byte v2, v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1247
    .line 1248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    invoke-static {v2}, La/std;->e(I)La/j1g;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v1

    .line 1255
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 1256
    .line 1257
    new-instance v1, La/uq2;

    .line 1258
    .line 1259
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1260
    .line 1261
    .line 1262
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 1263
    .line 1264
    sget-object v1, La/l1g;->b:La/l1g;

    .line 1265
    .line 1266
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 1267
    .line 1268
    iput-object v15, v0, La/n1g;->g:La/k1g;

    .line 1269
    .line 1270
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1271
    .line 1272
    return-object v0

    .line 1273
    :pswitch_a
    check-cast v3, La/uzg;

    .line 1274
    .line 1275
    check-cast v15, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1276
    .line 1277
    move-object/from16 v0, p1

    .line 1278
    .line 1279
    check-cast v0, La/k0w0;

    .line 1280
    .line 1281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1282
    .line 1283
    .line 1284
    iget-object v1, v3, La/uzg;->b:La/vqc;

    .line 1285
    .line 1286
    new-instance v2, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 1287
    .line 1288
    invoke-direct {v2, v13, v14, v15}, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;-><init>(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 1289
    .line 1290
    .line 1291
    new-instance v3, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$disciplineDetails$1;

    .line 1292
    .line 1293
    invoke-direct {v3, v1, v2}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$disciplineDetails$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;)V

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v0, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1297
    .line 1298
    .line 1299
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1300
    .line 1301
    return-object v0

    .line 1302
    :pswitch_b
    check-cast v3, La/uzg;

    .line 1303
    .line 1304
    check-cast v15, Ljava/lang/String;

    .line 1305
    .line 1306
    move-object/from16 v0, p1

    .line 1307
    .line 1308
    check-cast v0, La/k0w0;

    .line 1309
    .line 1310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1311
    .line 1312
    .line 1313
    iget-object v1, v3, La/uzg;->b:La/vqc;

    .line 1314
    .line 1315
    new-instance v2, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;

    .line 1316
    .line 1317
    invoke-direct {v2, v13, v14, v15}, Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;-><init>(JLjava/lang/String;)V

    .line 1318
    .line 1319
    .line 1320
    new-instance v3, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$playerTransfersScreen$1;

    .line 1321
    .line 1322
    invoke-direct {v3, v1, v2}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$playerTransfersScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/player_transfers/PlayerTransfersScreenParams;)V

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v0, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1326
    .line 1327
    .line 1328
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1329
    .line 1330
    return-object v0

    .line 1331
    :pswitch_c
    check-cast v3, La/uzg;

    .line 1332
    .line 1333
    move-object v9, v15

    .line 1334
    check-cast v9, La/ggz;

    .line 1335
    .line 1336
    move-object/from16 v1, p1

    .line 1337
    .line 1338
    check-cast v1, La/k0w0;

    .line 1339
    .line 1340
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1341
    .line 1342
    .line 1343
    iget-object v2, v3, La/uzg;->b:La/vqc;

    .line 1344
    .line 1345
    new-instance v4, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;

    .line 1346
    .line 1347
    iget-wide v5, v0, La/mz0;->b:J

    .line 1348
    .line 1349
    const-wide/16 v7, 0x28

    .line 1350
    .line 1351
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;-><init>(JJLa/ggz;)V

    .line 1352
    .line 1353
    .line 1354
    new-instance v0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$leaderBoardScreen$1;

    .line 1355
    .line 1356
    invoke-direct {v0, v2, v4}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$leaderBoardScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/LeaderBoardScreenParams;)V

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1360
    .line 1361
    .line 1362
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1363
    .line 1364
    return-object v0

    .line 1365
    :pswitch_d
    move-object v2, v3

    .line 1366
    check-cast v2, La/xig;

    .line 1367
    .line 1368
    move-object v5, v15

    .line 1369
    check-cast v5, La/npn;

    .line 1370
    .line 1371
    move-object/from16 v8, p1

    .line 1372
    .line 1373
    check-cast v8, La/k0w0;

    .line 1374
    .line 1375
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1376
    .line 1377
    .line 1378
    new-instance v1, La/sr;

    .line 1379
    .line 1380
    const/4 v6, 0x0

    .line 1381
    const/4 v7, 0x5

    .line 1382
    iget-wide v3, v0, La/mz0;->b:J

    .line 1383
    .line 1384
    invoke-direct/range {v1 .. v7}, La/sr;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 1385
    .line 1386
    .line 1387
    new-instance v0, La/b1w0;

    .line 1388
    .line 1389
    invoke-direct {v0, v1}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v8, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1397
    .line 1398
    check-cast v0, La/c8d;

    .line 1399
    .line 1400
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1401
    .line 1402
    new-instance v2, La/v7d;

    .line 1403
    .line 1404
    invoke-direct {v2, v11, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1405
    .line 1406
    .line 1407
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 1408
    .line 1409
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1410
    .line 1411
    return-object v0

    .line 1412
    :pswitch_e
    check-cast v3, La/a3f;

    .line 1413
    .line 1414
    move-object v5, v15

    .line 1415
    check-cast v5, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 1416
    .line 1417
    move-object/from16 v1, p1

    .line 1418
    .line 1419
    check-cast v1, La/k0w0;

    .line 1420
    .line 1421
    new-instance v2, Lorg/xplatform/bet_history/bet_info/presentation/BetInfoScreen;

    .line 1422
    .line 1423
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v3

    .line 1427
    check-cast v3, La/l2f;

    .line 1428
    .line 1429
    iget-object v3, v3, La/l2f;->a:Ljava/lang/String;

    .line 1430
    .line 1431
    new-instance v4, Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;

    .line 1432
    .line 1433
    sget-object v8, La/f8w;->a:La/f8w;

    .line 1434
    .line 1435
    const/4 v9, 0x1

    .line 1436
    iget-wide v6, v0, La/mz0;->b:J

    .line 1437
    .line 1438
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;-><init>(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;JLa/f8w;Z)V

    .line 1439
    .line 1440
    .line 1441
    invoke-direct {v2, v3, v4}, Lorg/xplatform/bet_history/bet_info/presentation/BetInfoScreen;-><init>(Ljava/lang/String;Lorg/xplatform/bet_history/bet_info/presentation/model/BetInfoScreenModel;)V

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1445
    .line 1446
    .line 1447
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1448
    .line 1449
    return-object v0

    .line 1450
    :pswitch_f
    check-cast v3, La/ru7;

    .line 1451
    .line 1452
    iget-object v0, v3, La/ru7;->f:La/n0o0;

    .line 1453
    .line 1454
    iget-object v1, v3, La/ru7;->d:La/n0o0;

    .line 1455
    .line 1456
    check-cast v15, Ljava/lang/String;

    .line 1457
    .line 1458
    move-object/from16 v4, p1

    .line 1459
    .line 1460
    check-cast v4, La/qqp0;

    .line 1461
    .line 1462
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1463
    .line 1464
    .line 1465
    instance-of v5, v4, La/mqp0;

    .line 1466
    .line 1467
    if-eqz v5, :cond_22

    .line 1468
    .line 1469
    new-instance v12, La/je40;

    .line 1470
    .line 1471
    iget-object v0, v3, La/ru7;->c:La/n0o0;

    .line 1472
    .line 1473
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v0

    .line 1477
    check-cast v0, La/mdm;

    .line 1478
    .line 1479
    invoke-direct {v12, v0}, La/je40;-><init>(La/mdm;)V

    .line 1480
    .line 1481
    .line 1482
    goto/16 :goto_28

    .line 1483
    .line 1484
    :cond_22
    sget-object v5, La/nqp0;->a:La/nqp0;

    .line 1485
    .line 1486
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1487
    .line 1488
    .line 1489
    move-result v5

    .line 1490
    if-eqz v5, :cond_23

    .line 1491
    .line 1492
    new-instance v12, La/ke40;

    .line 1493
    .line 1494
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v0

    .line 1498
    check-cast v0, La/fee;

    .line 1499
    .line 1500
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0

    .line 1504
    check-cast v0, La/cu7;

    .line 1505
    .line 1506
    invoke-direct {v12, v0}, La/ke40;-><init>(La/cu7;)V

    .line 1507
    .line 1508
    .line 1509
    goto/16 :goto_28

    .line 1510
    .line 1511
    :cond_23
    instance-of v5, v4, La/oqp0;

    .line 1512
    .line 1513
    if-eqz v5, :cond_3b

    .line 1514
    .line 1515
    iget-object v3, v3, La/ru7;->h:La/n0o0;

    .line 1516
    .line 1517
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v3

    .line 1521
    check-cast v3, La/fee;

    .line 1522
    .line 1523
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v3

    .line 1527
    check-cast v3, La/a8h0;

    .line 1528
    .line 1529
    if-nez v3, :cond_24

    .line 1530
    .line 1531
    new-instance v12, La/ke40;

    .line 1532
    .line 1533
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v0

    .line 1537
    check-cast v0, La/fee;

    .line 1538
    .line 1539
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    check-cast v0, La/cu7;

    .line 1544
    .line 1545
    invoke-direct {v12, v0}, La/ke40;-><init>(La/cu7;)V

    .line 1546
    .line 1547
    .line 1548
    goto/16 :goto_28

    .line 1549
    .line 1550
    :cond_24
    iget-object v5, v3, La/a8h0;->b:La/z7h0;

    .line 1551
    .line 1552
    check-cast v4, La/oqp0;

    .line 1553
    .line 1554
    iget-object v4, v4, La/oqp0;->a:Ljava/util/List;

    .line 1555
    .line 1556
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v4

    .line 1560
    :cond_25
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1561
    .line 1562
    .line 1563
    move-result v6

    .line 1564
    if-eqz v6, :cond_26

    .line 1565
    .line 1566
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v6

    .line 1570
    move-object v8, v6

    .line 1571
    check-cast v8, La/sfp0;

    .line 1572
    .line 1573
    iget-object v8, v8, La/sfp0;->a:Ljava/lang/String;

    .line 1574
    .line 1575
    iget-object v9, v3, La/a8h0;->a:Ljava/lang/String;

    .line 1576
    .line 1577
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1578
    .line 1579
    .line 1580
    move-result v8

    .line 1581
    if-eqz v8, :cond_25

    .line 1582
    .line 1583
    goto :goto_1b

    .line 1584
    :cond_26
    const/4 v6, 0x0

    .line 1585
    :goto_1b
    check-cast v6, La/sfp0;

    .line 1586
    .line 1587
    if-eqz v6, :cond_3a

    .line 1588
    .line 1589
    iget-object v0, v6, La/sfp0;->d:Ljava/util/ArrayList;

    .line 1590
    .line 1591
    iget-object v3, v6, La/sfp0;->c:Ljava/util/ArrayList;

    .line 1592
    .line 1593
    if-nez v5, :cond_27

    .line 1594
    .line 1595
    new-instance v12, La/je40;

    .line 1596
    .line 1597
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v0

    .line 1601
    check-cast v0, La/mdm;

    .line 1602
    .line 1603
    invoke-direct {v12, v0}, La/je40;-><init>(La/mdm;)V

    .line 1604
    .line 1605
    .line 1606
    goto/16 :goto_28

    .line 1607
    .line 1608
    :cond_27
    instance-of v4, v5, La/y7h0;

    .line 1609
    .line 1610
    if-eqz v4, :cond_36

    .line 1611
    .line 1612
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1613
    .line 1614
    .line 1615
    move-result v0

    .line 1616
    if-eqz v0, :cond_28

    .line 1617
    .line 1618
    new-instance v12, La/je40;

    .line 1619
    .line 1620
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0

    .line 1624
    check-cast v0, La/mdm;

    .line 1625
    .line 1626
    invoke-direct {v12, v0}, La/je40;-><init>(La/mdm;)V

    .line 1627
    .line 1628
    .line 1629
    goto/16 :goto_28

    .line 1630
    .line 1631
    :cond_28
    new-instance v0, La/ie40;

    .line 1632
    .line 1633
    new-instance v1, La/ge40;

    .line 1634
    .line 1635
    check-cast v5, La/y7h0;

    .line 1636
    .line 1637
    iget-object v4, v5, La/y7h0;->a:Ljava/lang/Integer;

    .line 1638
    .line 1639
    new-instance v6, Ljava/util/ArrayList;

    .line 1640
    .line 1641
    invoke-static {v3, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1642
    .line 1643
    .line 1644
    move-result v8

    .line 1645
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v8

    .line 1652
    :goto_1c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1653
    .line 1654
    .line 1655
    move-result v9

    .line 1656
    if-eqz v9, :cond_2b

    .line 1657
    .line 1658
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v9

    .line 1662
    check-cast v9, La/v800;

    .line 1663
    .line 1664
    new-instance v10, La/mxl;

    .line 1665
    .line 1666
    iget-object v12, v9, La/v800;->a:Ljava/lang/String;

    .line 1667
    .line 1668
    iget v9, v9, La/v800;->b:I

    .line 1669
    .line 1670
    if-nez v4, :cond_29

    .line 1671
    .line 1672
    goto :goto_1d

    .line 1673
    :cond_29
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1674
    .line 1675
    .line 1676
    move-result v7

    .line 1677
    if-ne v9, v7, :cond_2a

    .line 1678
    .line 1679
    move v7, v11

    .line 1680
    goto :goto_1e

    .line 1681
    :cond_2a
    :goto_1d
    const/4 v7, 0x0

    .line 1682
    :goto_1e
    const v9, 0xfeffe

    .line 1683
    .line 1684
    .line 1685
    const/4 v2, 0x0

    .line 1686
    invoke-direct {v10, v12, v2, v7, v9}, La/mxl;-><init>(Ljava/lang/String;La/fxl;ZI)V

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1690
    .line 1691
    .line 1692
    const/16 v2, 0x8

    .line 1693
    .line 1694
    const/16 v7, 0xa

    .line 1695
    .line 1696
    goto :goto_1c

    .line 1697
    :cond_2b
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v2

    .line 1701
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1702
    .line 1703
    .line 1704
    move-result v6

    .line 1705
    if-le v6, v11, :cond_2c

    .line 1706
    .line 1707
    cmp-long v6, v13, v16

    .line 1708
    .line 1709
    if-nez v6, :cond_2c

    .line 1710
    .line 1711
    new-instance v6, La/rcc;

    .line 1712
    .line 1713
    invoke-direct {v6, v2}, La/rcc;-><init>(La/a4x;)V

    .line 1714
    .line 1715
    .line 1716
    goto :goto_1f

    .line 1717
    :cond_2c
    const/4 v6, 0x0

    .line 1718
    :goto_1f
    iget-object v2, v5, La/y7h0;->b:Ljava/lang/String;

    .line 1719
    .line 1720
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1721
    .line 1722
    .line 1723
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v3

    .line 1727
    :cond_2d
    :goto_20
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1728
    .line 1729
    .line 1730
    move-result v5

    .line 1731
    if-eqz v5, :cond_2f

    .line 1732
    .line 1733
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v5

    .line 1737
    move-object v7, v5

    .line 1738
    check-cast v7, La/v800;

    .line 1739
    .line 1740
    iget v7, v7, La/v800;->b:I

    .line 1741
    .line 1742
    if-nez v4, :cond_2e

    .line 1743
    .line 1744
    goto :goto_20

    .line 1745
    :cond_2e
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1746
    .line 1747
    .line 1748
    move-result v8

    .line 1749
    if-ne v7, v8, :cond_2d

    .line 1750
    .line 1751
    goto :goto_21

    .line 1752
    :cond_2f
    const/4 v5, 0x0

    .line 1753
    :goto_21
    check-cast v5, La/v800;

    .line 1754
    .line 1755
    if-eqz v5, :cond_30

    .line 1756
    .line 1757
    iget-object v12, v5, La/v800;->c:Ljava/util/List;

    .line 1758
    .line 1759
    goto :goto_22

    .line 1760
    :cond_30
    const/4 v12, 0x0

    .line 1761
    :goto_22
    if-nez v12, :cond_31

    .line 1762
    .line 1763
    sget-object v12, La/iun;->a:La/iun;

    .line 1764
    .line 1765
    :cond_31
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 1766
    .line 1767
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1768
    .line 1769
    .line 1770
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v4

    .line 1774
    :goto_23
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1775
    .line 1776
    .line 1777
    move-result v5

    .line 1778
    if-eqz v5, :cond_33

    .line 1779
    .line 1780
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v5

    .line 1784
    move-object v7, v5

    .line 1785
    check-cast v7, La/lu90;

    .line 1786
    .line 1787
    iget v7, v7, La/lu90;->d:I

    .line 1788
    .line 1789
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v7

    .line 1793
    invoke-virtual {v3, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v8

    .line 1797
    if-nez v8, :cond_32

    .line 1798
    .line 1799
    new-instance v8, Ljava/util/ArrayList;

    .line 1800
    .line 1801
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1802
    .line 1803
    .line 1804
    invoke-interface {v3, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1805
    .line 1806
    .line 1807
    :cond_32
    check-cast v8, Ljava/util/List;

    .line 1808
    .line 1809
    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1810
    .line 1811
    .line 1812
    goto :goto_23

    .line 1813
    :cond_33
    new-instance v4, La/vt5;

    .line 1814
    .line 1815
    const/4 v5, 0x7

    .line 1816
    invoke-direct {v4, v5}, La/vt5;-><init>(B)V

    .line 1817
    .line 1818
    .line 1819
    invoke-static {v3, v4}, La/wp20;->c(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/TreeMap;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v3

    .line 1823
    new-instance v4, Ljava/util/ArrayList;

    .line 1824
    .line 1825
    invoke-virtual {v3}, Ljava/util/TreeMap;->size()I

    .line 1826
    .line 1827
    .line 1828
    move-result v5

    .line 1829
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1830
    .line 1831
    .line 1832
    invoke-virtual {v3}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v3

    .line 1836
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v3

    .line 1840
    :goto_24
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1841
    .line 1842
    .line 1843
    move-result v5

    .line 1844
    if-eqz v5, :cond_35

    .line 1845
    .line 1846
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v5

    .line 1850
    check-cast v5, Ljava/util/Map$Entry;

    .line 1851
    .line 1852
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v5

    .line 1856
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1857
    .line 1858
    .line 1859
    check-cast v5, Ljava/lang/Iterable;

    .line 1860
    .line 1861
    new-instance v7, La/vt5;

    .line 1862
    .line 1863
    const/16 v8, 0x8

    .line 1864
    .line 1865
    invoke-direct {v7, v8}, La/vt5;-><init>(B)V

    .line 1866
    .line 1867
    .line 1868
    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v5

    .line 1872
    new-instance v7, Ljava/util/ArrayList;

    .line 1873
    .line 1874
    const/16 v9, 0xa

    .line 1875
    .line 1876
    invoke-static {v5, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1877
    .line 1878
    .line 1879
    move-result v10

    .line 1880
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 1881
    .line 1882
    .line 1883
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v5

    .line 1887
    :goto_25
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1888
    .line 1889
    .line 1890
    move-result v9

    .line 1891
    if-eqz v9, :cond_34

    .line 1892
    .line 1893
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v9

    .line 1897
    check-cast v9, La/lu90;

    .line 1898
    .line 1899
    iget-object v10, v9, La/lu90;->a:Ljava/lang/String;

    .line 1900
    .line 1901
    invoke-virtual {v10, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1902
    .line 1903
    .line 1904
    move-result v10

    .line 1905
    invoke-static {v9, v10, v15}, La/w9x;->P(La/a9a0;ZLjava/lang/String;)La/oea0;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v9

    .line 1909
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1910
    .line 1911
    .line 1912
    goto :goto_25

    .line 1913
    :cond_34
    invoke-static {v7}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v5

    .line 1917
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1918
    .line 1919
    .line 1920
    goto :goto_24

    .line 1921
    :cond_35
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v2

    .line 1925
    invoke-direct {v1, v6, v2}, La/ge40;-><init>(La/rcc;La/a4x;)V

    .line 1926
    .line 1927
    .line 1928
    invoke-direct {v0, v1}, La/ie40;-><init>(La/he40;)V

    .line 1929
    .line 1930
    .line 1931
    move-object v12, v0

    .line 1932
    goto/16 :goto_28

    .line 1933
    .line 1934
    :cond_36
    instance-of v2, v5, La/x7h0;

    .line 1935
    .line 1936
    if-eqz v2, :cond_39

    .line 1937
    .line 1938
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1939
    .line 1940
    .line 1941
    move-result v2

    .line 1942
    if-eqz v2, :cond_37

    .line 1943
    .line 1944
    new-instance v12, La/je40;

    .line 1945
    .line 1946
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v0

    .line 1950
    check-cast v0, La/mdm;

    .line 1951
    .line 1952
    invoke-direct {v12, v0}, La/je40;-><init>(La/mdm;)V

    .line 1953
    .line 1954
    .line 1955
    goto :goto_28

    .line 1956
    :cond_37
    new-instance v12, La/ie40;

    .line 1957
    .line 1958
    new-instance v1, La/fe40;

    .line 1959
    .line 1960
    check-cast v5, La/x7h0;

    .line 1961
    .line 1962
    iget-object v2, v5, La/x7h0;->a:Ljava/lang/String;

    .line 1963
    .line 1964
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1965
    .line 1966
    .line 1967
    new-instance v3, Ljava/util/ArrayList;

    .line 1968
    .line 1969
    const/16 v9, 0xa

    .line 1970
    .line 1971
    invoke-static {v0, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1972
    .line 1973
    .line 1974
    move-result v4

    .line 1975
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1976
    .line 1977
    .line 1978
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v0

    .line 1982
    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1983
    .line 1984
    .line 1985
    move-result v4

    .line 1986
    if-eqz v4, :cond_38

    .line 1987
    .line 1988
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v4

    .line 1992
    check-cast v4, La/zen0;

    .line 1993
    .line 1994
    iget-object v5, v4, La/zen0;->a:Ljava/lang/String;

    .line 1995
    .line 1996
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1997
    .line 1998
    .line 1999
    move-result v5

    .line 2000
    invoke-static {v4, v5, v15}, La/w9x;->P(La/a9a0;ZLjava/lang/String;)La/oea0;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v4

    .line 2004
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2005
    .line 2006
    .line 2007
    goto :goto_26

    .line 2008
    :cond_38
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v0

    .line 2012
    invoke-direct {v1, v0}, La/fe40;-><init>(La/a4x;)V

    .line 2013
    .line 2014
    .line 2015
    invoke-direct {v12, v1}, La/ie40;-><init>(La/he40;)V

    .line 2016
    .line 2017
    .line 2018
    goto :goto_28

    .line 2019
    :cond_39
    invoke-static {}, La/t9f;->b()V

    .line 2020
    .line 2021
    .line 2022
    :goto_27
    const/4 v12, 0x0

    .line 2023
    goto :goto_28

    .line 2024
    :cond_3a
    new-instance v12, La/ke40;

    .line 2025
    .line 2026
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v0

    .line 2030
    check-cast v0, La/fee;

    .line 2031
    .line 2032
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v0

    .line 2036
    check-cast v0, La/cu7;

    .line 2037
    .line 2038
    invoke-direct {v12, v0}, La/ke40;-><init>(La/cu7;)V

    .line 2039
    .line 2040
    .line 2041
    goto :goto_28

    .line 2042
    :cond_3b
    sget-object v0, La/pqp0;->a:La/pqp0;

    .line 2043
    .line 2044
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2045
    .line 2046
    .line 2047
    move-result v0

    .line 2048
    if-eqz v0, :cond_3c

    .line 2049
    .line 2050
    new-instance v12, La/je40;

    .line 2051
    .line 2052
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v0

    .line 2056
    check-cast v0, La/mdm;

    .line 2057
    .line 2058
    invoke-direct {v12, v0}, La/je40;-><init>(La/mdm;)V

    .line 2059
    .line 2060
    .line 2061
    goto :goto_28

    .line 2062
    :cond_3c
    invoke-static {}, La/t9f;->b()V

    .line 2063
    .line 2064
    .line 2065
    goto :goto_27

    .line 2066
    :goto_28
    return-object v12

    .line 2067
    :pswitch_10
    check-cast v3, La/kd7;

    .line 2068
    .line 2069
    check-cast v15, La/z0w;

    .line 2070
    .line 2071
    move-object/from16 v0, p1

    .line 2072
    .line 2073
    check-cast v0, La/k0w0;

    .line 2074
    .line 2075
    iget-object v1, v3, La/kd7;->T:La/gr00;

    .line 2076
    .line 2077
    new-instance v2, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 2078
    .line 2079
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v3

    .line 2083
    iget v4, v15, La/z0w;->I:I

    .line 2084
    .line 2085
    int-to-long v6, v4

    .line 2086
    const/4 v4, 0x0

    .line 2087
    iget v5, v15, La/z0w;->c:I

    .line 2088
    .line 2089
    invoke-direct/range {v2 .. v7}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 2090
    .line 2091
    .line 2092
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2093
    .line 2094
    .line 2095
    new-instance v3, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 2096
    .line 2097
    invoke-direct {v3, v2, v1}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 2098
    .line 2099
    .line 2100
    invoke-virtual {v0, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2101
    .line 2102
    .line 2103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2104
    .line 2105
    return-object v0

    .line 2106
    :pswitch_11
    check-cast v3, La/f47;

    .line 2107
    .line 2108
    check-cast v15, Ljava/lang/String;

    .line 2109
    .line 2110
    move-object/from16 v0, p1

    .line 2111
    .line 2112
    check-cast v0, La/k0w0;

    .line 2113
    .line 2114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2115
    .line 2116
    .line 2117
    iget-object v1, v3, La/f47;->s:Ljava/lang/Object;

    .line 2118
    .line 2119
    check-cast v1, La/r9u;

    .line 2120
    .line 2121
    sget-object v2, La/ygp;->f1:La/ygp;

    .line 2122
    .line 2123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2124
    .line 2125
    .line 2126
    iget-object v1, v1, La/r9u;->a:La/j1q0;

    .line 2127
    .line 2128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2129
    .line 2130
    .line 2131
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 2132
    .line 2133
    invoke-virtual {v1, v2}, La/m1q0;->d(La/ygp;)Z

    .line 2134
    .line 2135
    .line 2136
    move-result v1

    .line 2137
    if-eqz v1, :cond_3d

    .line 2138
    .line 2139
    new-instance v1, Lorg/xplatform/bet_history/powerbet/presentation/PowerBetScreen;

    .line 2140
    .line 2141
    invoke-direct {v1, v15, v13, v14}, Lorg/xplatform/bet_history/powerbet/presentation/PowerBetScreen;-><init>(Ljava/lang/String;J)V

    .line 2142
    .line 2143
    .line 2144
    goto :goto_29

    .line 2145
    :cond_3d
    new-instance v1, Lorg/xplatform/bethistory/powerbet/presentation/PowerbetOldScreen;

    .line 2146
    .line 2147
    invoke-direct {v1, v15, v13, v14}, Lorg/xplatform/bethistory/powerbet/presentation/PowerbetOldScreen;-><init>(Ljava/lang/String;J)V

    .line 2148
    .line 2149
    .line 2150
    :goto_29
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2151
    .line 2152
    .line 2153
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2154
    .line 2155
    return-object v0

    .line 2156
    :pswitch_12
    check-cast v3, La/v93;

    .line 2157
    .line 2158
    check-cast v15, La/l93;

    .line 2159
    .line 2160
    move-object/from16 v1, p1

    .line 2161
    .line 2162
    check-cast v1, La/k0w0;

    .line 2163
    .line 2164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2165
    .line 2166
    .line 2167
    iget-object v2, v3, La/v93;->r:La/vqc;

    .line 2168
    .line 2169
    new-instance v4, Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;

    .line 2170
    .line 2171
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v3

    .line 2175
    check-cast v3, La/s93;

    .line 2176
    .line 2177
    iget-wide v5, v3, La/s93;->c:J

    .line 2178
    .line 2179
    iget-wide v7, v15, La/l93;->a:J

    .line 2180
    .line 2181
    iget-wide v9, v0, La/mz0;->b:J

    .line 2182
    .line 2183
    invoke-direct/range {v4 .. v10}, Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;-><init>(JJJ)V

    .line 2184
    .line 2185
    .line 2186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2187
    .line 2188
    .line 2189
    new-instance v0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$selectAwardsScreen$1;

    .line 2190
    .line 2191
    invoke-direct {v0, v2, v4}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$selectAwardsScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;)V

    .line 2192
    .line 2193
    .line 2194
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2195
    .line 2196
    .line 2197
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2198
    .line 2199
    return-object v0

    .line 2200
    :pswitch_13
    check-cast v3, La/qi2;

    .line 2201
    .line 2202
    check-cast v15, La/xde0;

    .line 2203
    .line 2204
    move-object/from16 v1, p1

    .line 2205
    .line 2206
    check-cast v1, La/k0w0;

    .line 2207
    .line 2208
    iget-object v2, v3, La/qi2;->r:La/ifp;

    .line 2209
    .line 2210
    new-instance v3, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;

    .line 2211
    .line 2212
    iget-object v10, v15, La/xde0;->c:Ljava/lang/String;

    .line 2213
    .line 2214
    iget-object v4, v15, La/xde0;->b:Ljava/lang/Long;

    .line 2215
    .line 2216
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 2217
    .line 2218
    .line 2219
    move-result-wide v8

    .line 2220
    iget-wide v4, v0, La/mz0;->b:J

    .line 2221
    .line 2222
    const-wide/16 v6, 0x0

    .line 2223
    .line 2224
    invoke-direct/range {v3 .. v10}, Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState$Team;-><init>(JJJLjava/lang/String;)V

    .line 2225
    .line 2226
    .line 2227
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2228
    .line 2229
    .line 2230
    new-instance v0, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;

    .line 2231
    .line 2232
    invoke-direct {v0, v2, v3}, Lorg/xplatform/favorites/impl/FavoritesInternalNavigation$favoriteCategory$1;-><init>(La/ifp;Lorg/xplatform/favorites/impl/presentation/category/FavoriteCategoryUiState;)V

    .line 2233
    .line 2234
    .line 2235
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2236
    .line 2237
    .line 2238
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2239
    .line 2240
    return-object v0

    .line 2241
    :pswitch_14
    move-wide/from16 v35, v5

    .line 2242
    .line 2243
    check-cast v3, La/qi2;

    .line 2244
    .line 2245
    check-cast v15, La/xcp;

    .line 2246
    .line 2247
    move-object/from16 v1, p1

    .line 2248
    .line 2249
    check-cast v1, La/k0w0;

    .line 2250
    .line 2251
    iget-object v4, v3, La/qi2;->r:La/ifp;

    .line 2252
    .line 2253
    iget-object v8, v15, La/xcp;->c:Ljava/lang/String;

    .line 2254
    .line 2255
    iget-object v2, v15, La/xcp;->b:La/tnp0;

    .line 2256
    .line 2257
    invoke-interface {v2}, La/tnp0;->c()J

    .line 2258
    .line 2259
    .line 2260
    move-result-wide v9

    .line 2261
    iget-object v13, v15, La/xcp;->i:Ljava/lang/String;

    .line 2262
    .line 2263
    iget-object v7, v15, La/xcp;->b:La/tnp0;

    .line 2264
    .line 2265
    instance-of v2, v7, La/rnp0;

    .line 2266
    .line 2267
    if-eqz v2, :cond_3e

    .line 2268
    .line 2269
    move-object v12, v7

    .line 2270
    check-cast v12, La/rnp0;

    .line 2271
    .line 2272
    goto :goto_2a

    .line 2273
    :cond_3e
    const/4 v12, 0x0

    .line 2274
    :goto_2a
    if-eqz v12, :cond_3f

    .line 2275
    .line 2276
    iget-wide v5, v12, La/rnp0;->c:J

    .line 2277
    .line 2278
    move-wide v11, v5

    .line 2279
    goto :goto_2b

    .line 2280
    :cond_3f
    move-wide/from16 v11, v35

    .line 2281
    .line 2282
    :goto_2b
    iget-wide v5, v0, La/mz0;->b:J

    .line 2283
    .line 2284
    invoke-virtual/range {v4 .. v13}, La/ifp;->a(JLa/tnp0;Ljava/lang/String;JJLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v0

    .line 2288
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2289
    .line 2290
    .line 2291
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2292
    .line 2293
    return-object v0

    .line 2294
    :pswitch_15
    check-cast v3, La/s72;

    .line 2295
    .line 2296
    check-cast v15, Ljava/lang/String;

    .line 2297
    .line 2298
    move-object/from16 v0, p1

    .line 2299
    .line 2300
    check-cast v0, La/k0w0;

    .line 2301
    .line 2302
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2303
    .line 2304
    .line 2305
    iget-object v1, v3, La/s72;->x:La/gle0;

    .line 2306
    .line 2307
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2308
    .line 2309
    .line 2310
    move-result-object v2

    .line 2311
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v2

    .line 2315
    iget-object v3, v3, La/s72;->o:Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;

    .line 2316
    .line 2317
    iget-boolean v4, v3, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;->d:Z

    .line 2318
    .line 2319
    iget v3, v3, Lorg/xplatform/results/impl/presentation/alt_champs/ChampsResultsParams;->c:I

    .line 2320
    .line 2321
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2322
    .line 2323
    .line 2324
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2325
    .line 2326
    .line 2327
    new-instance v1, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getGamesScreen$1;

    .line 2328
    .line 2329
    invoke-direct {v1, v3, v15, v2, v4}, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getGamesScreen$1;-><init>(ILjava/lang/String;Ljava/util/List;Z)V

    .line 2330
    .line 2331
    .line 2332
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2333
    .line 2334
    .line 2335
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2336
    .line 2337
    return-object v0

    .line 2338
    :pswitch_16
    move-object v2, v3

    .line 2339
    check-cast v2, La/mh1;

    .line 2340
    .line 2341
    move-object v5, v15

    .line 2342
    check-cast v5, Ljava/lang/String;

    .line 2343
    .line 2344
    move-object/from16 v7, p1

    .line 2345
    .line 2346
    check-cast v7, La/k0w0;

    .line 2347
    .line 2348
    new-instance v1, La/pe1;

    .line 2349
    .line 2350
    const/4 v6, 0x1

    .line 2351
    iget-wide v3, v0, La/mz0;->b:J

    .line 2352
    .line 2353
    invoke-direct/range {v1 .. v6}, La/pe1;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 2354
    .line 2355
    .line 2356
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2357
    .line 2358
    .line 2359
    new-instance v0, La/a1w0;

    .line 2360
    .line 2361
    invoke-direct {v0, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 2362
    .line 2363
    .line 2364
    invoke-virtual {v7, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v0

    .line 2368
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 2369
    .line 2370
    check-cast v0, La/c8d;

    .line 2371
    .line 2372
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 2373
    .line 2374
    new-instance v2, La/v7d;

    .line 2375
    .line 2376
    invoke-direct {v2, v11, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 2377
    .line 2378
    .line 2379
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 2380
    .line 2381
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2382
    .line 2383
    return-object v0

    .line 2384
    :pswitch_17
    check-cast v3, La/a01;

    .line 2385
    .line 2386
    move-object/from16 v24, v15

    .line 2387
    .line 2388
    check-cast v24, Ljava/util/List;

    .line 2389
    .line 2390
    move-object/from16 v1, p1

    .line 2391
    .line 2392
    check-cast v1, La/k0w0;

    .line 2393
    .line 2394
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2395
    .line 2396
    .line 2397
    iget-object v2, v3, La/a01;->o:La/peg0;

    .line 2398
    .line 2399
    new-instance v3, La/fr1;

    .line 2400
    .line 2401
    new-instance v20, La/fs80;

    .line 2402
    .line 2403
    const/16 v28, 0x0

    .line 2404
    .line 2405
    const/16 v29, 0x79

    .line 2406
    .line 2407
    const/16 v21, 0x0

    .line 2408
    .line 2409
    iget-wide v4, v0, La/mz0;->b:J

    .line 2410
    .line 2411
    const/16 v25, 0x0

    .line 2412
    .line 2413
    const-wide/16 v26, 0x0

    .line 2414
    .line 2415
    move-wide/from16 v22, v4

    .line 2416
    .line 2417
    invoke-direct/range {v20 .. v29}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 2418
    .line 2419
    .line 2420
    move-object/from16 v0, v20

    .line 2421
    .line 2422
    const/4 v15, 0x0

    .line 2423
    invoke-direct {v3, v0, v15, v9}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 2424
    .line 2425
    .line 2426
    invoke-virtual {v2, v3}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v0

    .line 2430
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2431
    .line 2432
    .line 2433
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2434
    .line 2435
    return-object v0

    .line 2436
    nop

    .line 2437
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
