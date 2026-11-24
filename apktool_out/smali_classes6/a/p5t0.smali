.class public final La/p5t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/wqj0;

.field public final b:La/kd30;

.field public final c:La/knf0;


# direct methods
.method public constructor <init>(La/wqj0;La/kd30;La/knf0;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/p5t0;->a:La/wqj0;

    .line 11
    .line 12
    iput-object p2, p0, La/p5t0;->b:La/kd30;

    .line 13
    .line 14
    iput-object p3, p0, La/p5t0;->c:La/knf0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/o5t0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/o5t0;

    .line 11
    .line 12
    iget v3, v2, La/o5t0;->t:I

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
    iput v3, v2, La/o5t0;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/o5t0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/o5t0;-><init>(La/p5t0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/o5t0;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/o5t0;->t:I

    .line 34
    .line 35
    iget-object v5, v0, La/p5t0;->a:La/wqj0;

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v10, 0x1

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v10, :cond_3

    .line 44
    .line 45
    if-eq v4, v7, :cond_2

    .line 46
    .line 47
    if-ne v4, v6, :cond_1

    .line 48
    .line 49
    iget v0, v2, La/o5t0;->q:I

    .line 50
    .line 51
    iget v4, v2, La/o5t0;->p:I

    .line 52
    .line 53
    iget v8, v2, La/o5t0;->o:I

    .line 54
    .line 55
    iget-wide v11, v2, La/o5t0;->n:J

    .line 56
    .line 57
    iget-wide v13, v2, La/o5t0;->m:J

    .line 58
    .line 59
    iget-object v15, v2, La/o5t0;->l:Ljava/lang/Throwable;

    .line 60
    .line 61
    iget-object v9, v2, La/o5t0;->k:La/o5t0;

    .line 62
    .line 63
    iget-object v6, v2, La/o5t0;->j:La/p5t0;

    .line 64
    .line 65
    iget-object v7, v2, La/o5t0;->i:Ljava/lang/String;

    .line 66
    .line 67
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    move v1, v4

    .line 71
    move-object v4, v2

    .line 72
    move-object v2, v7

    .line 73
    move v7, v1

    .line 74
    move-object v1, v6

    .line 75
    move-object v6, v9

    .line 76
    move-object v9, v15

    .line 77
    const/4 v15, 0x2

    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto/16 :goto_b

    .line 82
    .line 83
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 84
    .line 85
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v8

    .line 89
    :cond_2
    iget v0, v2, La/o5t0;->q:I

    .line 90
    .line 91
    iget v4, v2, La/o5t0;->p:I

    .line 92
    .line 93
    iget v6, v2, La/o5t0;->o:I

    .line 94
    .line 95
    iget-wide v7, v2, La/o5t0;->n:J

    .line 96
    .line 97
    iget-wide v11, v2, La/o5t0;->m:J

    .line 98
    .line 99
    iget-object v9, v2, La/o5t0;->l:Ljava/lang/Throwable;

    .line 100
    .line 101
    iget-object v13, v2, La/o5t0;->k:La/o5t0;

    .line 102
    .line 103
    iget-object v14, v2, La/o5t0;->j:La/p5t0;

    .line 104
    .line 105
    iget-object v15, v2, La/o5t0;->i:Ljava/lang/String;

    .line 106
    .line 107
    :try_start_1
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    move-object v1, v14

    .line 111
    move/from16 v22, v4

    .line 112
    .line 113
    move-object v4, v2

    .line 114
    move-object v2, v15

    .line 115
    const/4 v15, 0x2

    .line 116
    move-wide/from16 v23, v7

    .line 117
    .line 118
    move/from16 v7, v22

    .line 119
    .line 120
    move v8, v6

    .line 121
    move-object v6, v13

    .line 122
    move-wide v13, v11

    .line 123
    move-wide/from16 v11, v23

    .line 124
    .line 125
    goto/16 :goto_7

    .line 126
    .line 127
    :cond_3
    iget v4, v2, La/o5t0;->p:I

    .line 128
    .line 129
    iget v6, v2, La/o5t0;->o:I

    .line 130
    .line 131
    iget-wide v7, v2, La/o5t0;->n:J

    .line 132
    .line 133
    iget-wide v11, v2, La/o5t0;->m:J

    .line 134
    .line 135
    iget-object v9, v2, La/o5t0;->l:Ljava/lang/Throwable;

    .line 136
    .line 137
    iget-object v13, v2, La/o5t0;->k:La/o5t0;

    .line 138
    .line 139
    iget-object v14, v2, La/o5t0;->j:La/p5t0;

    .line 140
    .line 141
    iget-object v15, v2, La/o5t0;->i:Ljava/lang/String;

    .line 142
    .line 143
    :try_start_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 144
    .line 145
    .line 146
    goto/16 :goto_2

    .line 147
    .line 148
    :catchall_1
    move-exception v0

    .line 149
    move-object v1, v9

    .line 150
    move-object v9, v0

    .line 151
    move-object v0, v1

    .line 152
    move-object v1, v14

    .line 153
    move/from16 v22, v4

    .line 154
    .line 155
    move-object v4, v2

    .line 156
    move-object v2, v15

    .line 157
    move-wide/from16 v23, v7

    .line 158
    .line 159
    move/from16 v7, v22

    .line 160
    .line 161
    move v8, v6

    .line 162
    move-object v6, v13

    .line 163
    move-wide v13, v11

    .line 164
    move-wide/from16 v11, v23

    .line 165
    .line 166
    goto/16 :goto_5

    .line 167
    .line 168
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object v1, v5, La/wqj0;->a:La/i6t0;

    .line 172
    .line 173
    if-eqz v1, :cond_5

    .line 174
    .line 175
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 176
    .line 177
    return-object v1

    .line 178
    :cond_5
    :try_start_3
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 179
    .line 180
    sget-wide v6, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 181
    .line 182
    const-wide/16 v11, 0x3

    .line 183
    .line 184
    move-object v1, v0

    .line 185
    move-object v4, v2

    .line 186
    move-object v9, v8

    .line 187
    move v0, v10

    .line 188
    move-wide v13, v11

    .line 189
    const/4 v8, 0x0

    .line 190
    move-object/from16 v2, p1

    .line 191
    .line 192
    move-wide v11, v6

    .line 193
    const/4 v7, 0x0

    .line 194
    move-object v6, v4

    .line 195
    :goto_1
    if-eqz v0, :cond_10

    .line 196
    .line 197
    :try_start_4
    iget-object v15, v1, La/p5t0;->b:La/kd30;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 198
    .line 199
    :try_start_5
    iget-object v10, v1, La/p5t0;->c:La/knf0;

    .line 200
    .line 201
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iget-object v10, v1, La/p5t0;->c:La/knf0;

    .line 205
    .line 206
    invoke-virtual {v10}, La/knf0;->b()I

    .line 207
    .line 208
    .line 209
    move-result v19

    .line 210
    iget-object v10, v1, La/p5t0;->c:La/knf0;

    .line 211
    .line 212
    invoke-virtual {v10}, La/knf0;->c()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v20

    .line 216
    iput-object v2, v4, La/o5t0;->i:Ljava/lang/String;

    .line 217
    .line 218
    iput-object v1, v4, La/o5t0;->j:La/p5t0;

    .line 219
    .line 220
    iput-object v6, v4, La/o5t0;->k:La/o5t0;

    .line 221
    .line 222
    iput-object v9, v4, La/o5t0;->l:Ljava/lang/Throwable;

    .line 223
    .line 224
    iput-wide v13, v4, La/o5t0;->m:J

    .line 225
    .line 226
    iput-wide v11, v4, La/o5t0;->n:J

    .line 227
    .line 228
    iput v8, v4, La/o5t0;->o:I

    .line 229
    .line 230
    iput v7, v4, La/o5t0;->p:I

    .line 231
    .line 232
    iput v0, v4, La/o5t0;->q:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 233
    .line 234
    const/4 v10, 0x1

    .line 235
    :try_start_6
    iput v10, v4, La/o5t0;->t:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 236
    .line 237
    :try_start_7
    iget-object v0, v15, La/kd30;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, La/goi0;

    .line 240
    .line 241
    invoke-virtual {v0}, La/goi0;->invoke()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    move-object/from16 v16, v0

    .line 246
    .line 247
    check-cast v16, La/sqj0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 248
    .line 249
    const/16 v18, 0x1

    .line 250
    .line 251
    move-object/from16 v17, v2

    .line 252
    .line 253
    move-object/from16 v21, v4

    .line 254
    .line 255
    :try_start_8
    invoke-interface/range {v16 .. v21}, La/sqj0;->a(Ljava/lang/String;IILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 259
    if-ne v0, v3, :cond_6

    .line 260
    .line 261
    goto/16 :goto_a

    .line 262
    .line 263
    :cond_6
    move v4, v7

    .line 264
    move-object/from16 v15, v17

    .line 265
    .line 266
    move-object/from16 v2, v21

    .line 267
    .line 268
    move-object/from16 v22, v1

    .line 269
    .line 270
    move-object v1, v0

    .line 271
    move-wide/from16 v23, v13

    .line 272
    .line 273
    move-object/from16 v14, v22

    .line 274
    .line 275
    move-object v13, v6

    .line 276
    move v6, v8

    .line 277
    move-wide v7, v11

    .line 278
    move-wide/from16 v11, v23

    .line 279
    .line 280
    :goto_2
    :try_start_9
    check-cast v1, La/dx5;

    .line 281
    .line 282
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, La/crj0;

    .line 287
    .line 288
    invoke-static {v0}, La/q5x;->b0(La/crj0;)La/i6t0;

    .line 289
    .line 290
    .line 291
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 292
    :try_start_a
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 293
    .line 294
    goto/16 :goto_c

    .line 295
    .line 296
    :catchall_2
    move-exception v0

    .line 297
    goto :goto_3

    .line 298
    :catchall_3
    move-exception v0

    .line 299
    move-object/from16 v17, v2

    .line 300
    .line 301
    move-object/from16 v21, v4

    .line 302
    .line 303
    :goto_3
    move-object v2, v9

    .line 304
    move-object v9, v0

    .line 305
    move-object v0, v2

    .line 306
    move-object/from16 v2, v17

    .line 307
    .line 308
    move-object/from16 v4, v21

    .line 309
    .line 310
    goto :goto_5

    .line 311
    :catchall_4
    move-exception v0

    .line 312
    move-object/from16 v17, v2

    .line 313
    .line 314
    move-object/from16 v21, v4

    .line 315
    .line 316
    :goto_4
    move-object v2, v9

    .line 317
    move-object v9, v0

    .line 318
    move-object v0, v2

    .line 319
    move-object/from16 v2, v17

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :catchall_5
    move-exception v0

    .line 323
    move-object/from16 v17, v2

    .line 324
    .line 325
    move-object/from16 v21, v4

    .line 326
    .line 327
    const/4 v10, 0x1

    .line 328
    goto :goto_4

    .line 329
    :goto_5
    invoke-static {v9}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 330
    .line 331
    .line 332
    move-result v15

    .line 333
    if-eqz v15, :cond_b

    .line 334
    .line 335
    if-nez v8, :cond_7

    .line 336
    .line 337
    new-instance v0, La/el50;

    .line 338
    .line 339
    invoke-direct {v0, v9}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 340
    .line 341
    .line 342
    move-object v9, v0

    .line 343
    const/4 v0, 0x0

    .line 344
    goto/16 :goto_1

    .line 345
    .line 346
    :cond_7
    move-wide/from16 v16, v11

    .line 347
    .line 348
    int-to-long v10, v7

    .line 349
    cmp-long v10, v10, v13

    .line 350
    .line 351
    if-gez v10, :cond_8

    .line 352
    .line 353
    const/4 v10, 0x1

    .line 354
    goto :goto_6

    .line 355
    :cond_8
    const/4 v10, 0x0

    .line 356
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 357
    .line 358
    if-eqz v10, :cond_9

    .line 359
    .line 360
    iput-object v2, v4, La/o5t0;->i:Ljava/lang/String;

    .line 361
    .line 362
    iput-object v1, v4, La/o5t0;->j:La/p5t0;

    .line 363
    .line 364
    iput-object v6, v4, La/o5t0;->k:La/o5t0;

    .line 365
    .line 366
    iput-object v0, v4, La/o5t0;->l:Ljava/lang/Throwable;

    .line 367
    .line 368
    iput-wide v13, v4, La/o5t0;->m:J

    .line 369
    .line 370
    move-wide/from16 v11, v16

    .line 371
    .line 372
    iput-wide v11, v4, La/o5t0;->n:J

    .line 373
    .line 374
    iput v8, v4, La/o5t0;->o:I

    .line 375
    .line 376
    iput v7, v4, La/o5t0;->p:I

    .line 377
    .line 378
    iput v10, v4, La/o5t0;->q:I

    .line 379
    .line 380
    const/4 v15, 0x2

    .line 381
    iput v15, v4, La/o5t0;->t:I

    .line 382
    .line 383
    invoke-static {v11, v12, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    if-ne v9, v3, :cond_a

    .line 388
    .line 389
    goto :goto_a

    .line 390
    :goto_7
    const/4 v10, 0x1

    .line 391
    goto/16 :goto_1

    .line 392
    .line 393
    :cond_9
    move-wide/from16 v11, v16

    .line 394
    .line 395
    const/4 v15, 0x2

    .line 396
    new-instance v0, La/el50;

    .line 397
    .line 398
    invoke-direct {v0, v9}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 399
    .line 400
    .line 401
    :cond_a
    :goto_8
    move-object v9, v0

    .line 402
    move v0, v10

    .line 403
    goto :goto_7

    .line 404
    :cond_b
    const/4 v15, 0x2

    .line 405
    invoke-static {v9}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    if-eqz v10, :cond_f

    .line 410
    .line 411
    move-object/from16 p0, v9

    .line 412
    .line 413
    int-to-long v9, v7

    .line 414
    cmp-long v9, v9, v13

    .line 415
    .line 416
    if-gez v9, :cond_c

    .line 417
    .line 418
    const/4 v9, 0x1

    .line 419
    goto :goto_9

    .line 420
    :cond_c
    const/4 v9, 0x0

    .line 421
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 422
    .line 423
    if-eqz v9, :cond_e

    .line 424
    .line 425
    iput-object v2, v4, La/o5t0;->i:Ljava/lang/String;

    .line 426
    .line 427
    iput-object v1, v4, La/o5t0;->j:La/p5t0;

    .line 428
    .line 429
    iput-object v6, v4, La/o5t0;->k:La/o5t0;

    .line 430
    .line 431
    iput-object v0, v4, La/o5t0;->l:Ljava/lang/Throwable;

    .line 432
    .line 433
    iput-wide v13, v4, La/o5t0;->m:J

    .line 434
    .line 435
    iput-wide v11, v4, La/o5t0;->n:J

    .line 436
    .line 437
    iput v8, v4, La/o5t0;->o:I

    .line 438
    .line 439
    iput v7, v4, La/o5t0;->p:I

    .line 440
    .line 441
    iput v9, v4, La/o5t0;->q:I

    .line 442
    .line 443
    const/4 v10, 0x3

    .line 444
    iput v10, v4, La/o5t0;->t:I

    .line 445
    .line 446
    invoke-static {v11, v12, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v10

    .line 450
    if-ne v10, v3, :cond_d

    .line 451
    .line 452
    :goto_a
    return-object v3

    .line 453
    :cond_d
    move/from16 v22, v9

    .line 454
    .line 455
    move-object v9, v0

    .line 456
    move/from16 v0, v22

    .line 457
    .line 458
    goto :goto_7

    .line 459
    :cond_e
    new-instance v0, La/dag0;

    .line 460
    .line 461
    move-object/from16 v10, p0

    .line 462
    .line 463
    invoke-direct {v0, v10}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 464
    .line 465
    .line 466
    move v10, v9

    .line 467
    goto :goto_8

    .line 468
    :cond_f
    move-object v10, v9

    .line 469
    invoke-static {v10}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 470
    .line 471
    .line 472
    move-object v9, v10

    .line 473
    const/4 v0, 0x0

    .line 474
    goto :goto_7

    .line 475
    :cond_10
    if-nez v9, :cond_11

    .line 476
    .line 477
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 478
    .line 479
    const-string v1, "Unexpected error"

    .line 480
    .line 481
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    throw v0

    .line 485
    :cond_11
    throw v9
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 486
    :goto_b
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 487
    .line 488
    new-instance v1, La/g0g0;

    .line 489
    .line 490
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 491
    .line 492
    .line 493
    move-object v0, v1

    .line 494
    :goto_c
    nop

    .line 495
    instance-of v1, v0, La/g0g0;

    .line 496
    .line 497
    if-nez v1, :cond_12

    .line 498
    .line 499
    move-object v1, v0

    .line 500
    check-cast v1, La/i6t0;

    .line 501
    .line 502
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    iput-object v1, v5, La/wqj0;->a:La/i6t0;

    .line 506
    .line 507
    :cond_12
    return-object v0
.end method
