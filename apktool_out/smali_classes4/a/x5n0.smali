.class public final La/x5n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/pzu;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/pzu;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/x5n0;->a:B

    iput-object p1, p0, La/x5n0;->b:La/kmq;

    iput-object p2, p0, La/x5n0;->c:La/pzu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/x5n0;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/x5n0;->c:La/pzu;

    .line 8
    .line 9
    iget-object v4, v0, La/x5n0;->b:La/kmq;

    .line 10
    .line 11
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/high16 v6, -0x80000000

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v2, v1, La/a6n0;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, La/a6n0;

    .line 26
    .line 27
    iget v9, v2, La/a6n0;->j:I

    .line 28
    .line 29
    and-int v10, v9, v6

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v6

    .line 34
    iput v9, v2, La/a6n0;->j:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v2, La/a6n0;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, La/a6n0;-><init>(La/x5n0;La/yje;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v0, v2, La/a6n0;->i:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v1, La/wne;->a:La/wne;

    .line 45
    .line 46
    iget v6, v2, La/a6n0;->j:I

    .line 47
    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    if-ne v6, v7, :cond_1

    .line 51
    .line 52
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v0, p1

    .line 66
    .line 67
    check-cast v0, Ljava/util/List;

    .line 68
    .line 69
    iget-object v5, v3, La/pzu;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v5, La/vpt;

    .line 72
    .line 73
    invoke-virtual {v5}, La/vpt;->a()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_b

    .line 78
    .line 79
    iget-object v5, v3, La/pzu;->f:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v5, La/k9u;

    .line 82
    .line 83
    invoke-virtual {v5}, La/k9u;->b()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_b

    .line 88
    .line 89
    iget-object v3, v3, La/pzu;->e:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, La/hru;

    .line 92
    .line 93
    invoke-virtual {v3}, La/hru;->i()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_b

    .line 98
    .line 99
    new-instance v3, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_4

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    move-object v6, v5

    .line 119
    check-cast v6, La/k8p;

    .line 120
    .line 121
    iget-object v6, v6, La/k8p;->g:La/xvs;

    .line 122
    .line 123
    sget-object v9, La/xvs;->d:La/xvs;

    .line 124
    .line 125
    if-ne v6, v9, :cond_3

    .line 126
    .line 127
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    const-wide/32 v9, 0x1b7740

    .line 145
    .line 146
    .line 147
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 148
    .line 149
    if-eqz v5, :cond_6

    .line 150
    .line 151
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    move-object v11, v5

    .line 156
    check-cast v11, La/k8p;

    .line 157
    .line 158
    iget-wide v11, v11, La/k8p;->f:J

    .line 159
    .line 160
    invoke-virtual {v6, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v11

    .line 164
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 165
    .line 166
    .line 167
    move-result-wide v13

    .line 168
    sub-long/2addr v11, v13

    .line 169
    cmp-long v6, v11, v9

    .line 170
    .line 171
    if-ltz v6, :cond_5

    .line 172
    .line 173
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-nez v3, :cond_7

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, La/k8p;

    .line 193
    .line 194
    iget-wide v11, v3, La/k8p;->f:J

    .line 195
    .line 196
    invoke-virtual {v6, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v11

    .line 200
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 201
    .line 202
    .line 203
    move-result-wide v13

    .line 204
    sub-long/2addr v11, v13

    .line 205
    sub-long/2addr v11, v9

    .line 206
    const-wide/16 v13, 0x0

    .line 207
    .line 208
    cmp-long v3, v11, v13

    .line 209
    .line 210
    if-gez v3, :cond_8

    .line 211
    .line 212
    move-wide v11, v13

    .line 213
    :cond_8
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    :goto_3
    move-object v8, v3

    .line 218
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_b

    .line 223
    .line 224
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    check-cast v3, La/k8p;

    .line 229
    .line 230
    iget-wide v11, v3, La/k8p;->f:J

    .line 231
    .line 232
    invoke-virtual {v6, v11, v12}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 233
    .line 234
    .line 235
    move-result-wide v11

    .line 236
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 237
    .line 238
    .line 239
    move-result-wide v15

    .line 240
    sub-long/2addr v11, v15

    .line 241
    sub-long/2addr v11, v9

    .line 242
    cmp-long v3, v11, v13

    .line 243
    .line 244
    if-gez v3, :cond_a

    .line 245
    .line 246
    move-wide v11, v13

    .line 247
    :cond_a
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {v8, v3}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-lez v5, :cond_9

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_b
    :goto_4
    if-eqz v8, :cond_c

    .line 259
    .line 260
    new-instance v0, La/zr00;

    .line 261
    .line 262
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 263
    .line 264
    .line 265
    move-result-wide v5

    .line 266
    invoke-direct {v0, v5, v6}, La/zr00;-><init>(J)V

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_c
    sget-object v0, La/yr00;->a:La/yr00;

    .line 271
    .line 272
    :goto_5
    iput v7, v2, La/a6n0;->j:I

    .line 273
    .line 274
    invoke-interface {v4, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-ne v0, v1, :cond_d

    .line 279
    .line 280
    move-object v8, v1

    .line 281
    goto :goto_7

    .line 282
    :cond_d
    :goto_6
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    :goto_7
    return-object v8

    .line 285
    :pswitch_0
    instance-of v2, v1, La/w5n0;

    .line 286
    .line 287
    if-eqz v2, :cond_e

    .line 288
    .line 289
    move-object v2, v1

    .line 290
    check-cast v2, La/w5n0;

    .line 291
    .line 292
    iget v9, v2, La/w5n0;->j:I

    .line 293
    .line 294
    and-int v10, v9, v6

    .line 295
    .line 296
    if-eqz v10, :cond_e

    .line 297
    .line 298
    sub-int/2addr v9, v6

    .line 299
    iput v9, v2, La/w5n0;->j:I

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_e
    new-instance v2, La/w5n0;

    .line 303
    .line 304
    invoke-direct {v2, v0, v1}, La/w5n0;-><init>(La/x5n0;La/yje;)V

    .line 305
    .line 306
    .line 307
    :goto_8
    iget-object v0, v2, La/w5n0;->i:Ljava/lang/Object;

    .line 308
    .line 309
    sget-object v1, La/wne;->a:La/wne;

    .line 310
    .line 311
    iget v6, v2, La/w5n0;->j:I

    .line 312
    .line 313
    const/4 v9, 0x2

    .line 314
    const/4 v14, 0x0

    .line 315
    if-eqz v6, :cond_11

    .line 316
    .line 317
    if-eq v6, v7, :cond_10

    .line 318
    .line 319
    if-ne v6, v9, :cond_f

    .line 320
    .line 321
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_10

    .line 325
    .line 326
    :cond_f
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_11

    .line 330
    .line 331
    :cond_10
    iget-object v4, v2, La/w5n0;->l:La/kmq;

    .line 332
    .line 333
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_e

    .line 337
    .line 338
    :cond_11
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    move-object/from16 v0, p1

    .line 342
    .line 343
    check-cast v0, La/as00;

    .line 344
    .line 345
    iget-object v3, v3, La/pzu;->b:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v3, La/roi0;

    .line 348
    .line 349
    iput-object v4, v2, La/w5n0;->l:La/kmq;

    .line 350
    .line 351
    iput v7, v2, La/w5n0;->j:I

    .line 352
    .line 353
    iget-object v3, v3, La/roi0;->a:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v3, La/nmo;

    .line 356
    .line 357
    iget-object v3, v3, La/nmo;->a:Ljava/lang/Object;

    .line 358
    .line 359
    move-object v11, v3

    .line 360
    check-cast v11, La/ptc;

    .line 361
    .line 362
    if-eqz v0, :cond_1b

    .line 363
    .line 364
    instance-of v3, v0, La/yr00;

    .line 365
    .line 366
    if-eqz v3, :cond_15

    .line 367
    .line 368
    sget-object v0, La/tvk;->a:La/rwj;

    .line 369
    .line 370
    sget-object v0, La/ys10;->a:La/vs10;

    .line 371
    .line 372
    new-instance v3, La/cin;

    .line 373
    .line 374
    invoke-direct {v3, v11, v14, v9}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 375
    .line 376
    .line 377
    invoke-static {v0, v3, v2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    if-ne v0, v1, :cond_12

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    :goto_9
    if-ne v0, v1, :cond_13

    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    :goto_a
    if-ne v0, v1, :cond_14

    .line 392
    .line 393
    goto :goto_d

    .line 394
    :cond_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 395
    .line 396
    goto :goto_d

    .line 397
    :cond_15
    instance-of v3, v0, La/zr00;

    .line 398
    .line 399
    if-eqz v3, :cond_1b

    .line 400
    .line 401
    check-cast v0, La/zr00;

    .line 402
    .line 403
    iget-wide v12, v0, La/zr00;->a:J

    .line 404
    .line 405
    sget-object v0, La/tvk;->a:La/rwj;

    .line 406
    .line 407
    sget-object v0, La/ys10;->a:La/vs10;

    .line 408
    .line 409
    new-instance v10, La/yg1;

    .line 410
    .line 411
    const/16 v15, 0xd

    .line 412
    .line 413
    invoke-direct/range {v10 .. v15}, La/yg1;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 414
    .line 415
    .line 416
    invoke-static {v0, v10, v2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    if-ne v0, v1, :cond_16

    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    :goto_b
    if-ne v0, v1, :cond_17

    .line 426
    .line 427
    goto :goto_c

    .line 428
    :cond_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    :goto_c
    if-ne v0, v1, :cond_18

    .line 431
    .line 432
    goto :goto_d

    .line 433
    :cond_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    :goto_d
    if-ne v0, v1, :cond_19

    .line 436
    .line 437
    goto :goto_f

    .line 438
    :cond_19
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    iput-object v14, v2, La/w5n0;->l:La/kmq;

    .line 441
    .line 442
    iput v9, v2, La/w5n0;->j:I

    .line 443
    .line 444
    invoke-interface {v4, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    if-ne v0, v1, :cond_1a

    .line 449
    .line 450
    :goto_f
    move-object v8, v1

    .line 451
    goto :goto_11

    .line 452
    :cond_1a
    :goto_10
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 453
    .line 454
    goto :goto_11

    .line 455
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 456
    .line 457
    .line 458
    :goto_11
    return-object v8

    .line 459
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
