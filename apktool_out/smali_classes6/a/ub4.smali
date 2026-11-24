.class public final synthetic La/ub4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BIJLjava/lang/Object;)V
    .locals 0

    .line 3
    iput-byte p1, p0, La/ub4;->a:B

    iput-object p5, p0, La/ub4;->c:Ljava/lang/Object;

    iput-wide p3, p0, La/ub4;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/ub4;->a:B

    iput-wide p1, p0, La/ub4;->b:J

    iput-object p3, p0, La/ub4;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    const/4 p4, 0x2

    iput-byte p4, p0, La/ub4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/ub4;->b:J

    iput-object p3, p0, La/ub4;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JB)V
    .locals 0

    .line 4
    iput-byte p4, p0, La/ub4;->a:B

    iput-object p1, p0, La/ub4;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/ub4;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ub4;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-wide v5, v0, La/ub4;->b:J

    .line 9
    .line 10
    iget-object v0, v0, La/ub4;->c:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, La/ugd;

    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/fet;

    .line 20
    .line 21
    move-object/from16 v2, p2

    .line 22
    .line 23
    check-cast v2, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    and-int/lit8 v7, v2, 0x3

    .line 30
    .line 31
    const/4 v8, 0x2

    .line 32
    if-eq v7, v8, :cond_0

    .line 33
    .line 34
    move v7, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v7, v3

    .line 37
    :goto_0
    and-int/2addr v2, v4

    .line 38
    invoke-virtual {v1, v2, v7}, La/fet;->U(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    const/16 v2, 0x20

    .line 45
    .line 46
    shr-long v7, v5, v2

    .line 47
    .line 48
    long-to-int v2, v7

    .line 49
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const-wide v7, 0xffffffffL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long v4, v5, v7

    .line 63
    .line 64
    long-to-int v4, v4

    .line 65
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v0, v2, v4, v1, v3}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-virtual {v1}, La/fet;->X()V

    .line 82
    .line 83
    .line 84
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_0
    check-cast v0, La/r8l0;

    .line 88
    .line 89
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, La/fet;

    .line 92
    .line 93
    move-object/from16 v2, p2

    .line 94
    .line 95
    check-cast v2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {v4}, La/x8x;->L(I)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-static {v0, v5, v6, v1, v2}, La/cjx;->H(La/r8l0;JLa/fet;I)V

    .line 105
    .line 106
    .line 107
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object v0

    .line 110
    :pswitch_1
    check-cast v0, La/ilq;

    .line 111
    .line 112
    move-object/from16 v1, p1

    .line 113
    .line 114
    check-cast v1, La/fet;

    .line 115
    .line 116
    move-object/from16 v2, p2

    .line 117
    .line 118
    check-cast v2, Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {v4}, La/x8x;->L(I)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-static {v0, v5, v6, v1, v2}, La/idx;->a(La/ilq;JLa/fet;I)V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_2
    check-cast v0, Ljava/util/List;

    .line 134
    .line 135
    move-object/from16 v1, p1

    .line 136
    .line 137
    check-cast v1, La/oyg0;

    .line 138
    .line 139
    move-object/from16 v7, p2

    .line 140
    .line 141
    check-cast v7, La/u2b0;

    .line 142
    .line 143
    iget-object v1, v7, La/u2b0;->l:Ljava/util/List;

    .line 144
    .line 145
    new-instance v14, Ljava/util/ArrayList;

    .line 146
    .line 147
    const/16 v2, 0xa

    .line 148
    .line 149
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-direct {v14, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_4

    .line 165
    .line 166
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, La/df40;

    .line 171
    .line 172
    instance-of v3, v2, La/pe40;

    .line 173
    .line 174
    if-eqz v3, :cond_3

    .line 175
    .line 176
    move-object v3, v2

    .line 177
    check-cast v3, La/pe40;

    .line 178
    .line 179
    iget-object v3, v3, La/pe40;->a:La/w4t;

    .line 180
    .line 181
    instance-of v4, v3, La/q4t;

    .line 182
    .line 183
    if-eqz v4, :cond_3

    .line 184
    .line 185
    move-object v4, v3

    .line 186
    check-cast v4, La/q4t;

    .line 187
    .line 188
    iget-wide v8, v4, La/q4t;->a:J

    .line 189
    .line 190
    cmp-long v4, v8, v5

    .line 191
    .line 192
    if-nez v4, :cond_3

    .line 193
    .line 194
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-nez v2, :cond_2

    .line 199
    .line 200
    new-instance v2, La/cyx;

    .line 201
    .line 202
    invoke-direct {v2, v0}, La/cyx;-><init>(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_2
    sget-object v2, La/zxx;->a:La/zxx;

    .line 207
    .line 208
    :goto_3
    new-instance v4, La/pe40;

    .line 209
    .line 210
    invoke-direct {v4, v3, v2}, La/pe40;-><init>(La/w4t;La/fyx;)V

    .line 211
    .line 212
    .line 213
    move-object v2, v4

    .line 214
    :cond_3
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_4
    const/16 v15, 0x7ff

    .line 219
    .line 220
    const/4 v8, 0x0

    .line 221
    const/4 v9, 0x0

    .line 222
    const/4 v10, 0x0

    .line 223
    const/4 v11, 0x0

    .line 224
    const/4 v12, 0x0

    .line 225
    const/4 v13, 0x0

    .line 226
    invoke-static/range {v7 .. v15}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    return-object v0

    .line 231
    :pswitch_3
    check-cast v0, La/a4x;

    .line 232
    .line 233
    move-object/from16 v1, p1

    .line 234
    .line 235
    check-cast v1, La/fet;

    .line 236
    .line 237
    move-object/from16 v2, p2

    .line 238
    .line 239
    check-cast v2, Ljava/lang/Integer;

    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-static {v4}, La/x8x;->L(I)I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    invoke-static {v0, v5, v6, v1, v2}, La/bdx;->L(La/a4x;JLa/fet;I)V

    .line 249
    .line 250
    .line 251
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_4
    move-object/from16 v1, p1

    .line 255
    .line 256
    check-cast v1, La/oyg0;

    .line 257
    .line 258
    move-object/from16 v7, p2

    .line 259
    .line 260
    check-cast v7, La/ihz;

    .line 261
    .line 262
    new-instance v1, La/j0g0;

    .line 263
    .line 264
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    iget-object v8, v7, La/ihz;->k:Lkotlin/Pair;

    .line 268
    .line 269
    if-eqz v8, :cond_5

    .line 270
    .line 271
    iget-object v8, v8, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v8, Ljava/lang/Number;

    .line 274
    .line 275
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 276
    .line 277
    .line 278
    move-result-wide v8

    .line 279
    cmp-long v8, v8, v5

    .line 280
    .line 281
    if-nez v8, :cond_5

    .line 282
    .line 283
    iget-object v2, v7, La/ihz;->k:Lkotlin/Pair;

    .line 284
    .line 285
    move-object/from16 v18, v2

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_5
    new-instance v8, Lkotlin/Pair;

    .line 289
    .line 290
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    instance-of v6, v0, La/g0g0;

    .line 295
    .line 296
    if-eqz v6, :cond_6

    .line 297
    .line 298
    move-object v6, v2

    .line 299
    goto :goto_4

    .line 300
    :cond_6
    move-object v6, v0

    .line 301
    :goto_4
    check-cast v6, La/yyg;

    .line 302
    .line 303
    if-eqz v6, :cond_7

    .line 304
    .line 305
    iget-object v2, v6, La/yyg;->c:Ljava/util/List;

    .line 306
    .line 307
    :cond_7
    invoke-direct {v8, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    move-object/from16 v18, v8

    .line 311
    .line 312
    :goto_5
    iget-boolean v2, v7, La/ihz;->q:Z

    .line 313
    .line 314
    if-nez v2, :cond_9

    .line 315
    .line 316
    instance-of v0, v0, La/g0g0;

    .line 317
    .line 318
    if-nez v0, :cond_8

    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_8
    move/from16 v24, v3

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_9
    :goto_6
    move/from16 v24, v4

    .line 325
    .line 326
    :goto_7
    const v25, 0xf9ff

    .line 327
    .line 328
    .line 329
    const-wide/16 v8, 0x0

    .line 330
    .line 331
    const/4 v10, 0x0

    .line 332
    const/4 v11, 0x0

    .line 333
    const/4 v12, 0x0

    .line 334
    const/4 v13, 0x0

    .line 335
    const/4 v14, 0x0

    .line 336
    const/4 v15, 0x0

    .line 337
    const/16 v16, 0x0

    .line 338
    .line 339
    const/16 v19, 0x0

    .line 340
    .line 341
    const/16 v20, 0x0

    .line 342
    .line 343
    const/16 v21, 0x0

    .line 344
    .line 345
    const/16 v22, 0x0

    .line 346
    .line 347
    const/16 v23, 0x0

    .line 348
    .line 349
    move-object/from16 v17, v1

    .line 350
    .line 351
    invoke-static/range {v7 .. v25}, La/ihz;->a(La/ihz;JILa/xhz;La/qgz;La/epe;La/ypl0;Ljava/util/List;La/l2h;La/j0g0;Lkotlin/Pair;La/j0g0;La/j0g0;La/j0g0;ZZZI)La/ihz;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    return-object v0

    .line 356
    :pswitch_5
    check-cast v0, La/w9s;

    .line 357
    .line 358
    move-object/from16 v1, p1

    .line 359
    .line 360
    check-cast v1, Ljava/lang/String;

    .line 361
    .line 362
    move-object/from16 v3, p2

    .line 363
    .line 364
    check-cast v3, La/das;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    if-nez v3, :cond_a

    .line 370
    .line 371
    new-instance v3, La/das;

    .line 372
    .line 373
    invoke-direct {v3}, La/das;-><init>()V

    .line 374
    .line 375
    .line 376
    :cond_a
    iget-object v1, v3, La/das;->a:Ljava/util/Map;

    .line 377
    .line 378
    new-instance v4, La/bds;

    .line 379
    .line 380
    invoke-direct {v4, v5, v6}, La/bds;-><init>(J)V

    .line 381
    .line 382
    .line 383
    new-instance v5, Lkotlin/Pair;

    .line 384
    .line 385
    invoke-direct {v5, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    invoke-static {v1, v5}, La/xp20;->k(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    const/4 v1, 0x6

    .line 393
    invoke-static {v3, v0, v2, v2, v1}, La/das;->a(La/das;Ljava/util/Map;Ljava/util/Map;La/pas;I)La/das;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    return-object v0

    .line 398
    :pswitch_6
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 399
    .line 400
    move-object/from16 v1, p1

    .line 401
    .line 402
    check-cast v1, La/fet;

    .line 403
    .line 404
    move-object/from16 v2, p2

    .line 405
    .line 406
    check-cast v2, Ljava/lang/Integer;

    .line 407
    .line 408
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    invoke-static {v4}, La/x8x;->L(I)I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    invoke-static {v5, v6, v0, v1, v2}, La/mom;->a(JLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 416
    .line 417
    .line 418
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_7
    check-cast v0, La/fh4;

    .line 422
    .line 423
    move-object/from16 v1, p1

    .line 424
    .line 425
    check-cast v1, La/oyg0;

    .line 426
    .line 427
    move-object/from16 v7, p2

    .line 428
    .line 429
    check-cast v7, La/zf4;

    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    iget-object v0, v0, La/fh4;->s:La/b8u;

    .line 438
    .line 439
    iget-object v0, v0, La/b8u;->a:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v0, La/chf0;

    .line 442
    .line 443
    iget-object v0, v0, La/chf0;->b:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v0, La/zte0;

    .line 446
    .line 447
    iget-object v0, v0, La/zte0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    iget-object v1, v7, La/zf4;->m:La/pf4;

    .line 454
    .line 455
    if-eqz v0, :cond_c

    .line 456
    .line 457
    iget-object v0, v1, La/pf4;->h:Ljava/util/List;

    .line 458
    .line 459
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-nez v0, :cond_b

    .line 468
    .line 469
    move v9, v4

    .line 470
    goto :goto_9

    .line 471
    :cond_b
    :goto_8
    move v9, v3

    .line 472
    goto :goto_9

    .line 473
    :cond_c
    iget-object v0, v1, La/pf4;->i:Ljava/util/List;

    .line 474
    .line 475
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    goto :goto_8

    .line 484
    :goto_9
    const/16 v19, 0x0

    .line 485
    .line 486
    const/16 v20, 0x7ffd

    .line 487
    .line 488
    const/4 v8, 0x0

    .line 489
    const/4 v10, 0x0

    .line 490
    const/4 v11, 0x0

    .line 491
    const/4 v12, 0x0

    .line 492
    const/4 v13, 0x0

    .line 493
    const/4 v14, 0x0

    .line 494
    const/4 v15, 0x0

    .line 495
    const/16 v16, 0x0

    .line 496
    .line 497
    const/16 v17, 0x0

    .line 498
    .line 499
    const/16 v18, 0x0

    .line 500
    .line 501
    invoke-static/range {v7 .. v20}, La/zf4;->a(La/zf4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZZI)La/zf4;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    return-object v0

    .line 506
    :pswitch_8
    check-cast v0, La/kc4;

    .line 507
    .line 508
    move-object/from16 v1, p1

    .line 509
    .line 510
    check-cast v1, La/oyg0;

    .line 511
    .line 512
    move-object/from16 v7, p2

    .line 513
    .line 514
    check-cast v7, La/mb4;

    .line 515
    .line 516
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    iget-object v0, v0, La/kc4;->t:La/b8u;

    .line 523
    .line 524
    iget-object v0, v0, La/b8u;->a:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v0, La/chf0;

    .line 527
    .line 528
    iget-object v0, v0, La/chf0;->b:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v0, La/zte0;

    .line 531
    .line 532
    iget-object v0, v0, La/zte0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 533
    .line 534
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    iget-object v1, v7, La/mb4;->m:La/cb4;

    .line 539
    .line 540
    if-eqz v0, :cond_e

    .line 541
    .line 542
    iget-object v0, v1, La/cb4;->g:Ljava/util/List;

    .line 543
    .line 544
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-nez v0, :cond_d

    .line 553
    .line 554
    move v9, v4

    .line 555
    goto :goto_b

    .line 556
    :cond_d
    :goto_a
    move v9, v3

    .line 557
    goto :goto_b

    .line 558
    :cond_e
    iget-object v0, v1, La/cb4;->h:Ljava/util/List;

    .line 559
    .line 560
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v3

    .line 568
    goto :goto_a

    .line 569
    :goto_b
    const/16 v18, 0x0

    .line 570
    .line 571
    const/16 v19, 0x3ffd

    .line 572
    .line 573
    const/4 v8, 0x0

    .line 574
    const/4 v10, 0x0

    .line 575
    const/4 v11, 0x0

    .line 576
    const/4 v12, 0x0

    .line 577
    const/4 v13, 0x0

    .line 578
    const/4 v14, 0x0

    .line 579
    const/4 v15, 0x0

    .line 580
    const/16 v16, 0x0

    .line 581
    .line 582
    const/16 v17, 0x0

    .line 583
    .line 584
    invoke-static/range {v7 .. v19}, La/mb4;->a(La/mb4;ZZZLa/gd4;La/hd4;La/id4;IZLjava/util/List;Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;ZI)La/mb4;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    return-object v0

    .line 589
    :pswitch_data_0
    .packed-switch 0x0
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
