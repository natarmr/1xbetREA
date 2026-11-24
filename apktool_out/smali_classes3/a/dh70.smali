.class public final La/dh70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/ql5;

.field public j:J

.field public k:D

.field public l:D

.field public m:D

.field public n:D

.field public o:I

.field public p:I

.field public q:I

.field public r:B

.field public final synthetic s:La/eh70;


# direct methods
.method public constructor <init>(La/eh70;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dh70;->s:La/eh70;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/dh70;

    .line 2
    .line 3
    iget-object p0, p0, La/dh70;->s:La/eh70;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/dh70;-><init>(La/eh70;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/dh70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/dh70;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/dh70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/dh70;->s:La/eh70;

    .line 4
    .line 5
    iget-object v2, v1, La/eh70;->u:La/y5s;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v4, v0, La/dh70;->r:B

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v4, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v7

    .line 22
    :pswitch_0
    iget v2, v0, La/dh70;->q:I

    .line 23
    .line 24
    iget v3, v0, La/dh70;->p:I

    .line 25
    .line 26
    iget-wide v7, v0, La/dh70;->l:D

    .line 27
    .line 28
    iget-wide v9, v0, La/dh70;->k:D

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object/from16 v0, p1

    .line 34
    .line 35
    move-object v5, v1

    .line 36
    move-wide/from16 v19, v9

    .line 37
    .line 38
    :goto_0
    move-wide/from16 v24, v7

    .line 39
    .line 40
    goto/16 :goto_10

    .line 41
    .line 42
    :pswitch_1
    iget-wide v8, v0, La/dh70;->n:D

    .line 43
    .line 44
    iget-wide v10, v0, La/dh70;->m:D

    .line 45
    .line 46
    iget-wide v12, v0, La/dh70;->l:D

    .line 47
    .line 48
    iget v2, v0, La/dh70;->o:I

    .line 49
    .line 50
    iget-wide v14, v0, La/dh70;->k:D

    .line 51
    .line 52
    move-wide/from16 v16, v8

    .line 53
    .line 54
    iget-wide v7, v0, La/dh70;->j:J

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object/from16 v19, v1

    .line 60
    .line 61
    move-wide v5, v7

    .line 62
    move-wide v7, v12

    .line 63
    move-object/from16 v1, p1

    .line 64
    .line 65
    move-wide v11, v10

    .line 66
    move-wide/from16 v9, v16

    .line 67
    .line 68
    goto/16 :goto_9

    .line 69
    .line 70
    :pswitch_2
    iget-wide v7, v0, La/dh70;->m:D

    .line 71
    .line 72
    iget-wide v9, v0, La/dh70;->l:D

    .line 73
    .line 74
    iget v2, v0, La/dh70;->o:I

    .line 75
    .line 76
    iget-wide v11, v0, La/dh70;->k:D

    .line 77
    .line 78
    iget-wide v13, v0, La/dh70;->j:J

    .line 79
    .line 80
    iget-object v15, v0, La/dh70;->i:La/ql5;

    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v4, v15

    .line 86
    move-wide/from16 v34, v13

    .line 87
    .line 88
    move-object/from16 v13, p1

    .line 89
    .line 90
    move-wide v14, v11

    .line 91
    move-wide v11, v7

    .line 92
    move-wide/from16 v7, v34

    .line 93
    .line 94
    goto/16 :goto_8

    .line 95
    .line 96
    :pswitch_3
    iget v2, v0, La/dh70;->o:I

    .line 97
    .line 98
    iget-wide v7, v0, La/dh70;->k:D

    .line 99
    .line 100
    iget-wide v9, v0, La/dh70;->j:J

    .line 101
    .line 102
    iget-object v11, v0, La/dh70;->i:La/ql5;

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    move v12, v2

    .line 108
    move-object/from16 v2, p1

    .line 109
    .line 110
    goto/16 :goto_6

    .line 111
    .line 112
    :pswitch_4
    iget-wide v7, v0, La/dh70;->j:J

    .line 113
    .line 114
    iget-object v9, v0, La/dh70;->i:La/ql5;

    .line 115
    .line 116
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-object/from16 v10, p1

    .line 120
    .line 121
    move-object v11, v9

    .line 122
    goto :goto_2

    .line 123
    :pswitch_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    move-object/from16 v7, p1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :pswitch_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object v7, v1, La/eh70;->i:La/gmt;

    .line 133
    .line 134
    invoke-virtual {v7}, La/gmt;->a()La/ql5;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    if-nez v7, :cond_1

    .line 139
    .line 140
    iput-byte v6, v0, La/dh70;->r:B

    .line 141
    .line 142
    invoke-virtual {v1, v0}, La/eh70;->A(La/zje;)Ljava/io/Serializable;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    if-ne v7, v3, :cond_0

    .line 147
    .line 148
    goto/16 :goto_f

    .line 149
    .line 150
    :cond_0
    :goto_1
    check-cast v7, La/ql5;

    .line 151
    .line 152
    :cond_1
    iget-object v8, v2, La/y5s;->a:La/s470;

    .line 153
    .line 154
    invoke-virtual {v8}, La/s470;->a()J

    .line 155
    .line 156
    .line 157
    move-result-wide v8

    .line 158
    iget-object v10, v1, La/eh70;->g:La/slu;

    .line 159
    .line 160
    iget-wide v11, v7, La/ql5;->a:J

    .line 161
    .line 162
    new-instance v13, Ljava/lang/Long;

    .line 163
    .line 164
    invoke-direct {v13, v11, v12}, Ljava/lang/Long;-><init>(J)V

    .line 165
    .line 166
    .line 167
    iput-object v7, v0, La/dh70;->i:La/ql5;

    .line 168
    .line 169
    iput-wide v8, v0, La/dh70;->j:J

    .line 170
    .line 171
    const/4 v11, 0x2

    .line 172
    iput-byte v11, v0, La/dh70;->r:B

    .line 173
    .line 174
    invoke-virtual {v10, v8, v9, v0, v13}, La/slu;->a(JLa/zje;Ljava/lang/Long;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    if-ne v10, v3, :cond_2

    .line 179
    .line 180
    goto/16 :goto_f

    .line 181
    .line 182
    :cond_2
    move-object v11, v7

    .line 183
    move-wide v7, v8

    .line 184
    :goto_2
    check-cast v10, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    .line 187
    .line 188
    .line 189
    move-result-wide v9

    .line 190
    iget-wide v12, v11, La/ql5;->b:D

    .line 191
    .line 192
    cmpg-double v14, v12, v9

    .line 193
    .line 194
    if-ltz v14, :cond_4

    .line 195
    .line 196
    const-wide/16 v14, 0x0

    .line 197
    .line 198
    cmpg-double v12, v12, v14

    .line 199
    .line 200
    if-nez v12, :cond_3

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_3
    const/4 v12, 0x0

    .line 204
    goto :goto_4

    .line 205
    :cond_4
    :goto_3
    move v12, v6

    .line 206
    :goto_4
    iget-boolean v2, v2, La/y5s;->d:Z

    .line 207
    .line 208
    if-eqz v2, :cond_5

    .line 209
    .line 210
    iget-object v2, v1, La/eh70;->t:La/k4v;

    .line 211
    .line 212
    iget-object v2, v2, La/k4v;->a:La/pbt;

    .line 213
    .line 214
    iget-object v2, v2, La/pbt;->a:La/j5t;

    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iget-wide v13, v1, La/eh70;->y:D

    .line 220
    .line 221
    move-object v15, v11

    .line 222
    move v2, v12

    .line 223
    move-wide v11, v9

    .line 224
    :goto_5
    move-wide v9, v13

    .line 225
    goto :goto_7

    .line 226
    :cond_5
    iget-object v2, v1, La/eh70;->j:La/itt;

    .line 227
    .line 228
    invoke-virtual {v2}, La/itt;->a()D

    .line 229
    .line 230
    .line 231
    move-result-wide v13

    .line 232
    iput-object v11, v0, La/dh70;->i:La/ql5;

    .line 233
    .line 234
    iput-wide v7, v0, La/dh70;->j:J

    .line 235
    .line 236
    iput-wide v9, v0, La/dh70;->k:D

    .line 237
    .line 238
    iput v12, v0, La/dh70;->o:I

    .line 239
    .line 240
    const/4 v2, 0x3

    .line 241
    iput-byte v2, v0, La/dh70;->r:B

    .line 242
    .line 243
    invoke-virtual {v1, v13, v14, v0}, La/eh70;->z(DLa/zje;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    if-ne v2, v3, :cond_6

    .line 248
    .line 249
    goto/16 :goto_f

    .line 250
    .line 251
    :cond_6
    move-wide/from16 v34, v9

    .line 252
    .line 253
    move-wide v9, v7

    .line 254
    move-wide/from16 v7, v34

    .line 255
    .line 256
    :goto_6
    check-cast v2, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 259
    .line 260
    .line 261
    move-result-wide v13

    .line 262
    move-object v15, v11

    .line 263
    move v2, v12

    .line 264
    move-wide v11, v7

    .line 265
    move-wide v7, v9

    .line 266
    goto :goto_5

    .line 267
    :goto_7
    iput-object v15, v0, La/dh70;->i:La/ql5;

    .line 268
    .line 269
    iput-wide v7, v0, La/dh70;->j:J

    .line 270
    .line 271
    iput-wide v11, v0, La/dh70;->k:D

    .line 272
    .line 273
    iput v2, v0, La/dh70;->o:I

    .line 274
    .line 275
    iput-wide v9, v0, La/dh70;->l:D

    .line 276
    .line 277
    iput-wide v9, v0, La/dh70;->m:D

    .line 278
    .line 279
    const/4 v13, 0x4

    .line 280
    iput-byte v13, v0, La/dh70;->r:B

    .line 281
    .line 282
    sget-object v13, La/eh70;->C:Lkotlin/text/Regex;

    .line 283
    .line 284
    invoke-virtual {v1, v0}, La/eh70;->A(La/zje;)Ljava/io/Serializable;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    if-ne v13, v3, :cond_7

    .line 289
    .line 290
    goto/16 :goto_f

    .line 291
    .line 292
    :cond_7
    move-object v4, v15

    .line 293
    move-wide v14, v11

    .line 294
    move-wide v11, v9

    .line 295
    :goto_8
    check-cast v13, La/ql5;

    .line 296
    .line 297
    iget-wide v5, v13, La/ql5;->b:D

    .line 298
    .line 299
    iget-object v13, v1, La/eh70;->h:La/yku;

    .line 300
    .line 301
    move-object/from16 v18, v3

    .line 302
    .line 303
    iget-wide v3, v4, La/ql5;->a:J

    .line 304
    .line 305
    move-object/from16 v19, v1

    .line 306
    .line 307
    new-instance v1, Ljava/lang/Long;

    .line 308
    .line 309
    invoke-direct {v1, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 310
    .line 311
    .line 312
    const/4 v4, 0x0

    .line 313
    iput-object v4, v0, La/dh70;->i:La/ql5;

    .line 314
    .line 315
    iput-wide v7, v0, La/dh70;->j:J

    .line 316
    .line 317
    iput-wide v14, v0, La/dh70;->k:D

    .line 318
    .line 319
    iput v2, v0, La/dh70;->o:I

    .line 320
    .line 321
    iput-wide v9, v0, La/dh70;->l:D

    .line 322
    .line 323
    iput-wide v11, v0, La/dh70;->m:D

    .line 324
    .line 325
    iput-wide v5, v0, La/dh70;->n:D

    .line 326
    .line 327
    const/4 v3, 0x5

    .line 328
    iput-byte v3, v0, La/dh70;->r:B

    .line 329
    .line 330
    invoke-virtual {v13, v7, v8, v0, v1}, La/yku;->a(JLa/zje;Ljava/lang/Long;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    move-object/from16 v3, v18

    .line 335
    .line 336
    if-ne v1, v3, :cond_8

    .line 337
    .line 338
    goto :goto_f

    .line 339
    :cond_8
    move-wide/from16 v34, v9

    .line 340
    .line 341
    move-wide v9, v5

    .line 342
    move-wide v5, v7

    .line 343
    move-wide/from16 v7, v34

    .line 344
    .line 345
    :goto_9
    check-cast v1, Ljava/lang/Number;

    .line 346
    .line 347
    move-wide/from16 v20, v5

    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 350
    .line 351
    .line 352
    move-result-wide v4

    .line 353
    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 354
    .line 355
    .line 356
    move-result-wide v4

    .line 357
    cmpl-double v1, v11, v4

    .line 358
    .line 359
    if-gez v1, :cond_a

    .line 360
    .line 361
    if-eqz v2, :cond_9

    .line 362
    .line 363
    goto :goto_a

    .line 364
    :cond_9
    const/4 v1, 0x0

    .line 365
    goto :goto_b

    .line 366
    :cond_a
    :goto_a
    const/4 v1, 0x1

    .line 367
    :goto_b
    cmpl-double v4, v14, v7

    .line 368
    .line 369
    if-gez v4, :cond_c

    .line 370
    .line 371
    if-eqz v2, :cond_b

    .line 372
    .line 373
    goto :goto_d

    .line 374
    :cond_b
    const/4 v4, 0x0

    .line 375
    :goto_c
    move-object/from16 v5, v19

    .line 376
    .line 377
    goto :goto_e

    .line 378
    :cond_c
    :goto_d
    const/4 v4, 0x1

    .line 379
    goto :goto_c

    .line 380
    :goto_e
    iget-object v6, v5, La/eh70;->r:La/t0u;

    .line 381
    .line 382
    const/4 v9, 0x0

    .line 383
    iput-object v9, v0, La/dh70;->i:La/ql5;

    .line 384
    .line 385
    move-wide/from16 v9, v20

    .line 386
    .line 387
    iput-wide v9, v0, La/dh70;->j:J

    .line 388
    .line 389
    iput-wide v14, v0, La/dh70;->k:D

    .line 390
    .line 391
    iput v2, v0, La/dh70;->o:I

    .line 392
    .line 393
    iput-wide v7, v0, La/dh70;->l:D

    .line 394
    .line 395
    iput v1, v0, La/dh70;->p:I

    .line 396
    .line 397
    iput v4, v0, La/dh70;->q:I

    .line 398
    .line 399
    const/4 v2, 0x6

    .line 400
    iput-byte v2, v0, La/dh70;->r:B

    .line 401
    .line 402
    invoke-virtual {v6, v0}, La/t0u;->a(La/yje;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    if-ne v0, v3, :cond_d

    .line 407
    .line 408
    :goto_f
    return-object v3

    .line 409
    :cond_d
    move v3, v1

    .line 410
    move v2, v4

    .line 411
    move-wide/from16 v19, v14

    .line 412
    .line 413
    goto/16 :goto_0

    .line 414
    .line 415
    :goto_10
    move-object/from16 v23, v0

    .line 416
    .line 417
    check-cast v23, Ljava/lang/String;

    .line 418
    .line 419
    sget-object v0, La/eh70;->C:Lkotlin/text/Regex;

    .line 420
    .line 421
    const/4 v0, 0x0

    .line 422
    invoke-virtual {v5, v0}, La/eh70;->y(Z)V

    .line 423
    .line 424
    .line 425
    iget-object v1, v5, La/eh70;->z:La/p7m0;

    .line 426
    .line 427
    :cond_e
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    move-object/from16 v18, v4

    .line 432
    .line 433
    check-cast v18, La/tg70;

    .line 434
    .line 435
    if-eqz v2, :cond_f

    .line 436
    .line 437
    const/16 v26, 0x1

    .line 438
    .line 439
    goto :goto_11

    .line 440
    :cond_f
    move/from16 v26, v0

    .line 441
    .line 442
    :goto_11
    if-eqz v3, :cond_10

    .line 443
    .line 444
    const/16 v27, 0x1

    .line 445
    .line 446
    goto :goto_12

    .line 447
    :cond_10
    move/from16 v27, v0

    .line 448
    .line 449
    :goto_12
    if-eqz v3, :cond_11

    .line 450
    .line 451
    const/16 v28, 0x1

    .line 452
    .line 453
    goto :goto_13

    .line 454
    :cond_11
    move/from16 v28, v0

    .line 455
    .line 456
    :goto_13
    if-eqz v2, :cond_12

    .line 457
    .line 458
    const/16 v29, 0x1

    .line 459
    .line 460
    goto :goto_14

    .line 461
    :cond_12
    move/from16 v29, v0

    .line 462
    .line 463
    :goto_14
    const/16 v32, 0x1

    .line 464
    .line 465
    const/16 v33, 0xe05

    .line 466
    .line 467
    const-wide/16 v21, 0x0

    .line 468
    .line 469
    const/16 v30, 0x0

    .line 470
    .line 471
    const/16 v31, 0x0

    .line 472
    .line 473
    invoke-static/range {v18 .. v33}, La/tg70;->a(La/tg70;DDLjava/lang/String;DZZZZZZZI)La/tg70;

    .line 474
    .line 475
    .line 476
    move-result-object v5

    .line 477
    invoke-virtual {v1, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v4

    .line 481
    if-eqz v4, :cond_e

    .line 482
    .line 483
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 484
    .line 485
    return-object v0

    .line 486
    nop

    .line 487
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
