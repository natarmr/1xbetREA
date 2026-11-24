.class public final synthetic La/pe1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/pe1;->a:B

    iput-object p1, p0, La/pe1;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/pe1;->b:J

    iput-object p4, p0, La/pe1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/pe1;->a:B

    iput-object p1, p0, La/pe1;->d:Ljava/lang/Object;

    iput-object p2, p0, La/pe1;->c:Ljava/lang/Object;

    iput-wide p3, p0, La/pe1;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pe1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-wide v3, v0, La/pe1;->b:J

    .line 7
    .line 8
    iget-object v5, v0, La/pe1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, v0, La/pe1;->d:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v6, La/pru;

    .line 16
    .line 17
    check-cast v5, La/bzt;

    .line 18
    .line 19
    sget-object v14, La/g3s0;->b:La/g3s0;

    .line 20
    .line 21
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 26
    .line 27
    iget-object v1, v1, La/mum0;->x:La/zvh0;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    if-eq v1, v3, :cond_1

    .line 40
    .line 41
    const/4 v3, 0x3

    .line 42
    if-ne v1, v3, :cond_0

    .line 43
    .line 44
    sget-object v1, La/bxh0;->a:La/bxh0;

    .line 45
    .line 46
    :goto_0
    move-object v15, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    sget-object v1, La/cxh0;->a:La/cxh0;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    sget-object v1, La/zwh0;->a:La/zwh0;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    sget-object v1, La/axh0;->a:La/axh0;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :goto_1
    sget-object v16, La/gqt0;->h:La/gqt0;

    .line 62
    .line 63
    iget-object v1, v5, La/bzt;->a:La/fsd;

    .line 64
    .line 65
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget v1, v1, La/v8d;->r:I

    .line 70
    .line 71
    new-instance v7, La/a4s0;

    .line 72
    .line 73
    const/4 v13, 0x0

    .line 74
    const/16 v18, 0x0

    .line 75
    .line 76
    iget-wide v8, v0, La/pe1;->b:J

    .line 77
    .line 78
    const-string v10, ""

    .line 79
    .line 80
    const-string v11, ""

    .line 81
    .line 82
    sget-object v12, La/r7s0;->a:La/r7s0;

    .line 83
    .line 84
    move/from16 v17, v1

    .line 85
    .line 86
    invoke-direct/range {v7 .. v18}, La/a4s0;-><init>(JLjava/lang/String;Ljava/lang/String;La/s7s0;ZLa/g3s0;La/dxh0;La/gqt0;IZ)V

    .line 87
    .line 88
    .line 89
    move-object v2, v7

    .line 90
    :goto_2
    return-object v2

    .line 91
    :pswitch_0
    check-cast v6, La/ibu;

    .line 92
    .line 93
    check-cast v5, La/hbu;

    .line 94
    .line 95
    iget-object v0, v6, La/ibu;->a:La/ien;

    .line 96
    .line 97
    iget-object v0, v0, La/ien;->a:La/gen;

    .line 98
    .line 99
    iget-object v0, v0, La/gen;->b:La/qoj0;

    .line 100
    .line 101
    invoke-static {v0}, La/ebc;->k0(La/mz40;)La/hen;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, La/hen;->a:Ljava/util/List;

    .line 106
    .line 107
    iget-object v1, v5, La/hbu;->a:La/ien;

    .line 108
    .line 109
    iget-object v1, v1, La/ien;->a:La/gen;

    .line 110
    .line 111
    iget-object v1, v1, La/gen;->b:La/qoj0;

    .line 112
    .line 113
    invoke-static {v1}, La/ebc;->k0(La/mz40;)La/hen;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v1, v1, La/hen;->b:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_5

    .line 128
    .line 129
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    move-object v7, v6

    .line 134
    check-cast v7, La/tdn;

    .line 135
    .line 136
    iget-wide v7, v7, La/tdn;->a:J

    .line 137
    .line 138
    cmp-long v7, v7, v3

    .line 139
    .line 140
    if-nez v7, :cond_4

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    move-object v6, v2

    .line 144
    :goto_3
    check-cast v6, La/tdn;

    .line 145
    .line 146
    if-eqz v6, :cond_6

    .line 147
    .line 148
    new-instance v2, La/vnn0;

    .line 149
    .line 150
    sget-object v3, La/wdn;->c:La/wdn;

    .line 151
    .line 152
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-direct {v2, v6, v3, v1}, La/vnn0;-><init>(La/tdn;La/wdn;I)V

    .line 157
    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    if-eqz v5, :cond_8

    .line 169
    .line 170
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    move-object v6, v5

    .line 175
    check-cast v6, La/tdn;

    .line 176
    .line 177
    iget-wide v6, v6, La/tdn;->a:J

    .line 178
    .line 179
    cmp-long v6, v6, v3

    .line 180
    .line 181
    if-nez v6, :cond_7

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_8
    move-object v5, v2

    .line 185
    :goto_4
    check-cast v5, La/tdn;

    .line 186
    .line 187
    if-eqz v5, :cond_9

    .line 188
    .line 189
    new-instance v2, La/vnn0;

    .line 190
    .line 191
    sget-object v1, La/wdn;->d:La/wdn;

    .line 192
    .line 193
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-direct {v2, v5, v1, v3}, La/vnn0;-><init>(La/tdn;La/wdn;I)V

    .line 198
    .line 199
    .line 200
    :cond_9
    :goto_5
    if-nez v2, :cond_a

    .line 201
    .line 202
    new-instance v2, La/vnn0;

    .line 203
    .line 204
    new-instance v3, La/tdn;

    .line 205
    .line 206
    const/4 v1, -0x1

    .line 207
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    const-wide/16 v4, -0x1

    .line 212
    .line 213
    const-string v7, ""

    .line 214
    .line 215
    const-string v8, ""

    .line 216
    .line 217
    invoke-direct/range {v3 .. v8}, La/tdn;-><init>(JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    sget-object v1, La/wdn;->c:La/wdn;

    .line 221
    .line 222
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    invoke-direct {v2, v3, v1, v0}, La/vnn0;-><init>(La/tdn;La/wdn;I)V

    .line 227
    .line 228
    .line 229
    :cond_a
    return-object v2

    .line 230
    :pswitch_1
    move-object v3, v6

    .line 231
    check-cast v3, La/vne;

    .line 232
    .line 233
    move-object v7, v5

    .line 234
    check-cast v7, La/nff0;

    .line 235
    .line 236
    iget-object v1, v7, La/nff0;->f:La/mne;

    .line 237
    .line 238
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 239
    .line 240
    new-instance v6, La/wn10;

    .line 241
    .line 242
    const/4 v10, 0x0

    .line 243
    const/16 v11, 0xd

    .line 244
    .line 245
    iget-wide v8, v0, La/pe1;->b:J

    .line 246
    .line 247
    invoke-direct/range {v6 .. v11}, La/wn10;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 248
    .line 249
    .line 250
    const/16 v8, 0xb

    .line 251
    .line 252
    const/4 v4, 0x0

    .line 253
    const/4 v5, 0x0

    .line 254
    move-object v7, v6

    .line 255
    move-object v6, v1

    .line 256
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 257
    .line 258
    .line 259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_2
    check-cast v6, La/cr;

    .line 263
    .line 264
    check-cast v5, La/n85;

    .line 265
    .line 266
    iget-object v0, v6, La/cr;->k:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, La/b4j;

    .line 269
    .line 270
    const-string v1, "alert_rush"

    .line 271
    .line 272
    const-string v2, "progress"

    .line 273
    .line 274
    invoke-virtual {v0, v1, v2}, La/b4j;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    iget-object v0, v6, La/cr;->m:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, La/je;

    .line 280
    .line 281
    invoke-virtual {v0, v1, v2}, La/je;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    iget-object v2, v6, La/cr;->k:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v2, La/b4j;

    .line 287
    .line 288
    iget-wide v7, v5, La/n85;->j:D

    .line 289
    .line 290
    double-to-int v5, v7

    .line 291
    invoke-virtual {v2, v5, v1}, La/b4j;->e(ILjava/lang/String;)V

    .line 292
    .line 293
    .line 294
    double-to-int v5, v7

    .line 295
    invoke-virtual {v0, v5, v1}, La/je;->c(ILjava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v1, v2, La/b4j;->a:La/kt2;

    .line 299
    .line 300
    const-string v2, "dchallenge_alert_playrush"

    .line 301
    .line 302
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    iget-object v0, v0, La/je;->a:La/s1p;

    .line 306
    .line 307
    const-wide/16 v1, 0x2ac3

    .line 308
    .line 309
    sget-object v5, La/xun;->a:La/xun;

    .line 310
    .line 311
    invoke-virtual {v0, v5, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 312
    .line 313
    .line 314
    iget-object v0, v6, La/cr;->g:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, La/oeg0;

    .line 317
    .line 318
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    new-instance v1, La/qi4;

    .line 323
    .line 324
    const/4 v2, 0x6

    .line 325
    invoke-direct {v1, v6, v3, v4, v2}, La/qi4;-><init>(Ljava/lang/Object;JB)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object v0

    .line 334
    :pswitch_3
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 335
    .line 336
    check-cast v5, La/shh;

    .line 337
    .line 338
    new-instance v7, La/qqk0;

    .line 339
    .line 340
    iget-wide v10, v5, La/shh;->b:J

    .line 341
    .line 342
    iget-object v12, v5, La/shh;->d:Ljava/lang/String;

    .line 343
    .line 344
    iget-wide v8, v0, La/pe1;->b:J

    .line 345
    .line 346
    invoke-direct/range {v7 .. v12}, La/qqk0;-><init>(JJLjava/lang/String;)V

    .line 347
    .line 348
    .line 349
    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_4
    check-cast v6, Ljava/util/ArrayList;

    .line 356
    .line 357
    check-cast v5, La/c5c;

    .line 358
    .line 359
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    :cond_b
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_d

    .line 368
    .line 369
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    check-cast v1, La/fzs0;

    .line 374
    .line 375
    iget-object v2, v5, La/c5c;->a:La/on4;

    .line 376
    .line 377
    invoke-virtual {v2, v1}, La/on4;->c(La/fzs0;)Z

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    if-nez v6, :cond_b

    .line 382
    .line 383
    invoke-virtual {v1}, La/fzs0;->b()I

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    mul-int/lit16 v6, v6, 0xe10

    .line 388
    .line 389
    int-to-long v6, v6

    .line 390
    const-wide/16 v8, 0x3e8

    .line 391
    .line 392
    mul-long/2addr v6, v8

    .line 393
    add-long/2addr v6, v3

    .line 394
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 395
    .line 396
    .line 397
    move-result-wide v8

    .line 398
    cmp-long v8, v6, v8

    .line 399
    .line 400
    if-lez v8, :cond_c

    .line 401
    .line 402
    invoke-virtual {v2, v1, v6, v7}, La/on4;->d(La/fzs0;J)V

    .line 403
    .line 404
    .line 405
    goto :goto_6

    .line 406
    :cond_c
    invoke-virtual {v2, v1}, La/on4;->e(La/fzs0;)V

    .line 407
    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_5
    check-cast v6, La/mh1;

    .line 414
    .line 415
    move-object v11, v5

    .line 416
    check-cast v11, Ljava/lang/String;

    .line 417
    .line 418
    iget-object v1, v6, La/mh1;->C:La/s91;

    .line 419
    .line 420
    new-instance v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 421
    .line 422
    new-instance v17, La/qm1;

    .line 423
    .line 424
    sget-object v10, La/s9s0;->a:La/s9s0;

    .line 425
    .line 426
    const/4 v12, 0x0

    .line 427
    iget-wide v8, v0, La/pe1;->b:J

    .line 428
    .line 429
    move-object/from16 v7, v17

    .line 430
    .line 431
    invoke-direct/range {v7 .. v12}, La/qm1;-><init>(JLa/s9s0;Ljava/lang/String;Z)V

    .line 432
    .line 433
    .line 434
    const/16 v24, 0x0

    .line 435
    .line 436
    const/16 v25, 0x1f7

    .line 437
    .line 438
    const/4 v13, 0x0

    .line 439
    const/4 v14, 0x0

    .line 440
    const-wide/16 v15, 0x0

    .line 441
    .line 442
    const/16 v18, 0x0

    .line 443
    .line 444
    const-wide/16 v19, 0x0

    .line 445
    .line 446
    const-wide/16 v21, 0x0

    .line 447
    .line 448
    const/16 v23, 0x0

    .line 449
    .line 450
    move-object v12, v2

    .line 451
    invoke-direct/range {v12 .. v25}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1, v12}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 455
    .line 456
    .line 457
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 458
    .line 459
    return-object v0

    .line 460
    :pswitch_6
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 461
    .line 462
    check-cast v5, Ljava/lang/String;

    .line 463
    .line 464
    new-instance v0, La/td1;

    .line 465
    .line 466
    invoke-direct {v0, v3, v4, v5}, La/td1;-><init>(JLjava/lang/String;)V

    .line 467
    .line 468
    .line 469
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object v0

    .line 475
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
