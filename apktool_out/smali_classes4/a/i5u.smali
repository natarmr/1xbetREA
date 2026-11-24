.class public final La/i5u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kmq;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JLa/q5u;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/i5u;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/i5u;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/i5u;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-wide p3, p0, La/i5u;->b:J

    .line 12
    .line 13
    iput-object p5, p0, La/i5u;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JB)V
    .locals 0

    .line 16
    iput-byte p6, p0, La/i5u;->a:B

    iput-object p1, p0, La/i5u;->c:Ljava/lang/Object;

    iput-object p2, p0, La/i5u;->d:Ljava/lang/Object;

    iput-object p3, p0, La/i5u;->e:Ljava/lang/Object;

    iput-wide p4, p0, La/i5u;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/i5u;->a:B

    .line 6
    .line 7
    iget-wide v3, v0, La/i5u;->b:J

    .line 8
    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/high16 v6, -0x80000000

    .line 12
    .line 13
    const/4 v7, 0x2

    .line 14
    iget-object v8, v0, La/i5u;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v9, v0, La/i5u;->d:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v10, v0, La/i5u;->c:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v11, 0x1

    .line 21
    const/4 v12, 0x0

    .line 22
    packed-switch v2, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    instance-of v2, v1, La/qd60;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v2, v1

    .line 30
    check-cast v2, La/qd60;

    .line 31
    .line 32
    iget v3, v2, La/qd60;->j:I

    .line 33
    .line 34
    and-int v4, v3, v6

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    sub-int/2addr v3, v6

    .line 39
    iput v3, v2, La/qd60;->j:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v2, La/qd60;

    .line 43
    .line 44
    invoke-direct {v2, v0, v1}, La/qd60;-><init>(La/i5u;La/yje;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iget-object v1, v2, La/qd60;->i:Ljava/lang/Object;

    .line 48
    .line 49
    sget-object v3, La/wne;->a:La/wne;

    .line 50
    .line 51
    iget v4, v2, La/qd60;->j:I

    .line 52
    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    if-eq v4, v11, :cond_2

    .line 56
    .line 57
    if-ne v4, v7, :cond_1

    .line 58
    .line 59
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_2
    iget-object v0, v2, La/qd60;->l:La/kmq;

    .line 68
    .line 69
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object v1, v10

    .line 77
    check-cast v1, La/kmq;

    .line 78
    .line 79
    move-object/from16 v18, p1

    .line 80
    .line 81
    check-cast v18, Ljava/util/List;

    .line 82
    .line 83
    check-cast v9, La/sd60;

    .line 84
    .line 85
    iget-object v4, v9, La/sd60;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v4, La/q530;

    .line 88
    .line 89
    check-cast v8, La/sgs;

    .line 90
    .line 91
    iget-wide v14, v8, La/sgs;->f:J

    .line 92
    .line 93
    iput-object v1, v2, La/qd60;->l:La/kmq;

    .line 94
    .line 95
    iput v11, v2, La/qd60;->j:I

    .line 96
    .line 97
    iget-object v13, v4, La/q530;->a:La/n530;

    .line 98
    .line 99
    iget-wide v4, v0, La/i5u;->b:J

    .line 100
    .line 101
    const-wide/16 v19, -0x1a

    .line 102
    .line 103
    move-object/from16 v21, v2

    .line 104
    .line 105
    move-wide/from16 v16, v4

    .line 106
    .line 107
    invoke-virtual/range {v13 .. v21}, La/n530;->d(JJLjava/util/List;JLa/zje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-ne v0, v3, :cond_4

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    :goto_1
    if-ne v0, v3, :cond_5

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_5
    move-object v0, v1

    .line 120
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    iput-object v12, v2, La/qd60;->l:La/kmq;

    .line 123
    .line 124
    iput v7, v2, La/qd60;->j:I

    .line 125
    .line 126
    invoke-interface {v0, v1, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-ne v0, v3, :cond_6

    .line 131
    .line 132
    :goto_3
    move-object v12, v3

    .line 133
    goto :goto_5

    .line 134
    :cond_6
    :goto_4
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    :goto_5
    return-object v12

    .line 137
    :pswitch_0
    move-object/from16 v0, p1

    .line 138
    .line 139
    check-cast v0, Ljava/lang/String;

    .line 140
    .line 141
    check-cast v10, La/a4x;

    .line 142
    .line 143
    new-instance v1, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    :cond_7
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_8

    .line 157
    .line 158
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    move-object v6, v5

    .line 163
    check-cast v6, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;

    .line 164
    .line 165
    iget-object v6, v6, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;->c:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v6, v0, v11}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_7

    .line 172
    .line 173
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 178
    .line 179
    const/16 v2, 0xa

    .line 180
    .line 181
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const/4 v6, 0x0

    .line 193
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    if-eqz v7, :cond_c

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    add-int/lit8 v10, v6, 0x1

    .line 204
    .line 205
    if-ltz v6, :cond_b

    .line 206
    .line 207
    check-cast v7, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;

    .line 208
    .line 209
    new-instance v13, La/fgz;

    .line 210
    .line 211
    iget-wide v14, v7, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;->a:J

    .line 212
    .line 213
    new-instance v16, La/oui0;

    .line 214
    .line 215
    new-instance v5, Ljava/lang/Integer;

    .line 216
    .line 217
    move/from16 v26, v11

    .line 218
    .line 219
    const v11, 0x7f0808bd

    .line 220
    .line 221
    .line 222
    invoke-direct {v5, v11}, Ljava/lang/Integer;-><init>(I)V

    .line 223
    .line 224
    .line 225
    new-instance v11, La/n0x;

    .line 226
    .line 227
    iget-object v12, v7, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;->b:Ljava/lang/String;

    .line 228
    .line 229
    invoke-direct {v11, v12}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const/16 v20, 0x0

    .line 233
    .line 234
    const/16 v21, 0x1a

    .line 235
    .line 236
    const/16 v18, 0x0

    .line 237
    .line 238
    move-object/from16 v17, v5

    .line 239
    .line 240
    move-object/from16 v19, v11

    .line 241
    .line 242
    invoke-direct/range {v16 .. v21}, La/oui0;-><init>(Ljava/lang/Integer;La/y3d;La/o0x;La/y3d;I)V

    .line 243
    .line 244
    .line 245
    new-instance v5, La/tui0;

    .line 246
    .line 247
    iget-object v11, v7, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;->c:Ljava/lang/String;

    .line 248
    .line 249
    const/4 v12, 0x0

    .line 250
    invoke-direct {v5, v11, v12}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 251
    .line 252
    .line 253
    new-instance v11, La/nvi0;

    .line 254
    .line 255
    move-object/from16 p1, v1

    .line 256
    .line 257
    move-object/from16 p2, v2

    .line 258
    .line 259
    iget-wide v1, v7, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/discipline_filter/model/LeaderboardDisciplineFilter;->a:J

    .line 260
    .line 261
    cmp-long v1, v1, v3

    .line 262
    .line 263
    if-nez v1, :cond_9

    .line 264
    .line 265
    move/from16 v1, v26

    .line 266
    .line 267
    goto :goto_8

    .line 268
    :cond_9
    const/4 v1, 0x0

    .line 269
    :goto_8
    invoke-direct {v11, v1}, La/nvi0;-><init>(Z)V

    .line 270
    .line 271
    .line 272
    move-object/from16 v18, v16

    .line 273
    .line 274
    new-instance v16, La/rqm;

    .line 275
    .line 276
    const/16 v24, 0x0

    .line 277
    .line 278
    const/16 v25, 0x1f8

    .line 279
    .line 280
    const/16 v20, 0x0

    .line 281
    .line 282
    const/16 v21, 0x0

    .line 283
    .line 284
    const/16 v22, 0x0

    .line 285
    .line 286
    const/16 v23, 0x0

    .line 287
    .line 288
    move-object/from16 v17, v5

    .line 289
    .line 290
    move-object/from16 v19, v11

    .line 291
    .line 292
    invoke-direct/range {v16 .. v25}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 293
    .line 294
    .line 295
    move-object/from16 v1, v16

    .line 296
    .line 297
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    add-int/lit8 v2, v2, -0x1

    .line 302
    .line 303
    if-ne v6, v2, :cond_a

    .line 304
    .line 305
    move/from16 v2, v26

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_a
    const/4 v2, 0x0

    .line 309
    :goto_9
    invoke-direct {v13, v14, v15, v1, v2}, La/fgz;-><init>(JLa/rqm;Z)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-object/from16 v1, p1

    .line 316
    .line 317
    move-object/from16 v2, p2

    .line 318
    .line 319
    move v6, v10

    .line 320
    move/from16 v11, v26

    .line 321
    .line 322
    const/4 v12, 0x0

    .line 323
    goto/16 :goto_7

    .line 324
    .line 325
    :cond_b
    invoke-static {}, La/q3d;->p()V

    .line 326
    .line 327
    .line 328
    const/16 v27, 0x0

    .line 329
    .line 330
    throw v27

    .line 331
    :cond_c
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    check-cast v9, La/pz40;

    .line 336
    .line 337
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-eqz v1, :cond_d

    .line 342
    .line 343
    new-instance v0, La/xfz;

    .line 344
    .line 345
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 346
    .line 347
    invoke-interface {v8}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    check-cast v1, La/mdm;

    .line 352
    .line 353
    invoke-direct {v0, v1}, La/xfz;-><init>(La/mdm;)V

    .line 354
    .line 355
    .line 356
    goto :goto_a

    .line 357
    :cond_d
    new-instance v1, La/wfz;

    .line 358
    .line 359
    invoke-direct {v1, v0}, La/wfz;-><init>(La/a4x;)V

    .line 360
    .line 361
    .line 362
    move-object v0, v1

    .line 363
    :goto_a
    invoke-interface {v9, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_1
    move/from16 v26, v11

    .line 370
    .line 371
    instance-of v2, v1, La/h5u;

    .line 372
    .line 373
    if-eqz v2, :cond_e

    .line 374
    .line 375
    move-object v2, v1

    .line 376
    check-cast v2, La/h5u;

    .line 377
    .line 378
    iget v11, v2, La/h5u;->j:I

    .line 379
    .line 380
    and-int v12, v11, v6

    .line 381
    .line 382
    if-eqz v12, :cond_e

    .line 383
    .line 384
    sub-int/2addr v11, v6

    .line 385
    iput v11, v2, La/h5u;->j:I

    .line 386
    .line 387
    goto :goto_b

    .line 388
    :cond_e
    new-instance v2, La/h5u;

    .line 389
    .line 390
    invoke-direct {v2, v0, v1}, La/h5u;-><init>(La/i5u;La/yje;)V

    .line 391
    .line 392
    .line 393
    :goto_b
    iget-object v0, v2, La/h5u;->i:Ljava/lang/Object;

    .line 394
    .line 395
    sget-object v1, La/wne;->a:La/wne;

    .line 396
    .line 397
    iget v6, v2, La/h5u;->j:I

    .line 398
    .line 399
    if-eqz v6, :cond_11

    .line 400
    .line 401
    move/from16 v11, v26

    .line 402
    .line 403
    if-eq v6, v11, :cond_10

    .line 404
    .line 405
    if-ne v6, v7, :cond_f

    .line 406
    .line 407
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    goto/16 :goto_e

    .line 411
    .line 412
    :cond_f
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    const/4 v12, 0x0

    .line 416
    goto :goto_f

    .line 417
    :cond_10
    iget-object v3, v2, La/h5u;->m:Ljava/util/List;

    .line 418
    .line 419
    iget-object v4, v2, La/h5u;->l:La/kmq;

    .line 420
    .line 421
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    move-object v5, v3

    .line 425
    move-object v3, v2

    .line 426
    goto :goto_c

    .line 427
    :cond_11
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    move-object v0, v10

    .line 431
    check-cast v0, La/kmq;

    .line 432
    .line 433
    move-object/from16 v5, p1

    .line 434
    .line 435
    check-cast v5, Ljava/util/List;

    .line 436
    .line 437
    check-cast v9, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 438
    .line 439
    invoke-static {v3, v4, v9}, Lorg/xplatform/cyber/section/api/domain/entity/d;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    check-cast v8, La/q5u;

    .line 444
    .line 445
    iget-object v11, v8, La/q5u;->f:La/j3c;

    .line 446
    .line 447
    iget-object v4, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v4, Ljava/lang/Number;

    .line 450
    .line 451
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 452
    .line 453
    .line 454
    move-result-wide v12

    .line 455
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v3, Ljava/lang/Number;

    .line 458
    .line 459
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 460
    .line 461
    .line 462
    move-result-wide v14

    .line 463
    iput-object v0, v2, La/h5u;->l:La/kmq;

    .line 464
    .line 465
    iput-object v5, v2, La/h5u;->m:Ljava/util/List;

    .line 466
    .line 467
    const/4 v3, 0x1

    .line 468
    iput v3, v2, La/h5u;->j:I

    .line 469
    .line 470
    move-object/from16 v16, v2

    .line 471
    .line 472
    invoke-virtual/range {v11 .. v16}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    move-object/from16 v3, v16

    .line 477
    .line 478
    if-ne v2, v1, :cond_12

    .line 479
    .line 480
    goto :goto_d

    .line 481
    :cond_12
    move-object v4, v0

    .line 482
    move-object v0, v2

    .line 483
    :goto_c
    check-cast v0, La/ypl0;

    .line 484
    .line 485
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 486
    .line 487
    new-instance v2, La/btk;

    .line 488
    .line 489
    iget-object v0, v0, La/ypl0;->c:La/lel0;

    .line 490
    .line 491
    iget-object v0, v0, La/lel0;->j:Ljava/lang/String;

    .line 492
    .line 493
    invoke-direct {v2, v5, v0}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    new-instance v0, La/j0g0;

    .line 497
    .line 498
    invoke-direct {v0, v2}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    const/4 v12, 0x0

    .line 502
    iput-object v12, v3, La/h5u;->l:La/kmq;

    .line 503
    .line 504
    iput-object v12, v3, La/h5u;->m:Ljava/util/List;

    .line 505
    .line 506
    iput v7, v3, La/h5u;->j:I

    .line 507
    .line 508
    invoke-interface {v4, v0, v3}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    if-ne v0, v1, :cond_13

    .line 513
    .line 514
    :goto_d
    move-object v12, v1

    .line 515
    goto :goto_f

    .line 516
    :cond_13
    :goto_e
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    :goto_f
    return-object v12

    .line 519
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
