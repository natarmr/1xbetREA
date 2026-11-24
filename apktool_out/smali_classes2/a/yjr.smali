.class public final La/yjr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ojo;

.field public final b:La/njo;

.field public final c:La/btt0;


# direct methods
.method public constructor <init>(La/ojo;La/njo;La/btt0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/yjr;->a:La/ojo;

    .line 14
    .line 15
    iput-object p2, p0, La/yjr;->b:La/njo;

    .line 16
    .line 17
    iput-object p3, p0, La/yjr;->c:La/btt0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, La/xjr;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/xjr;

    .line 11
    .line 12
    iget v3, v2, La/xjr;->s:I

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
    iput v3, v2, La/xjr;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/xjr;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/xjr;-><init>(La/yjr;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/xjr;->q:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/xjr;->s:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/xjr;->p:I

    .line 47
    .line 48
    iget v10, v2, La/xjr;->o:I

    .line 49
    .line 50
    iget v11, v2, La/xjr;->n:I

    .line 51
    .line 52
    iget-wide v12, v2, La/xjr;->m:J

    .line 53
    .line 54
    iget-wide v14, v2, La/xjr;->l:J

    .line 55
    .line 56
    iget-object v7, v2, La/xjr;->k:Ljava/lang/Throwable;

    .line 57
    .line 58
    const/16 v16, 0x0

    .line 59
    .line 60
    iget-object v8, v2, La/xjr;->j:La/fjo;

    .line 61
    .line 62
    iget-object v5, v2, La/xjr;->i:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move v0, v4

    .line 68
    const/4 v9, 0x3

    .line 69
    move-object v4, v2

    .line 70
    move-object v2, v5

    .line 71
    move v5, v10

    .line 72
    move-wide/from16 v17, v14

    .line 73
    .line 74
    move v15, v6

    .line 75
    move-object v14, v8

    .line 76
    move-object v8, v7

    .line 77
    move v7, v11

    .line 78
    move-wide v10, v12

    .line 79
    move-wide/from16 v12, v17

    .line 80
    .line 81
    goto/16 :goto_6

    .line 82
    .line 83
    :cond_1
    const/16 v16, 0x0

    .line 84
    .line 85
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 86
    .line 87
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v16

    .line 91
    :cond_2
    const/16 v16, 0x0

    .line 92
    .line 93
    iget v4, v2, La/xjr;->p:I

    .line 94
    .line 95
    iget v5, v2, La/xjr;->o:I

    .line 96
    .line 97
    iget v7, v2, La/xjr;->n:I

    .line 98
    .line 99
    iget-wide v10, v2, La/xjr;->m:J

    .line 100
    .line 101
    iget-wide v12, v2, La/xjr;->l:J

    .line 102
    .line 103
    iget-object v8, v2, La/xjr;->k:Ljava/lang/Throwable;

    .line 104
    .line 105
    iget-object v14, v2, La/xjr;->j:La/fjo;

    .line 106
    .line 107
    iget-object v15, v2, La/xjr;->i:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move v0, v4

    .line 113
    move-object v4, v2

    .line 114
    move-object v2, v15

    .line 115
    move v15, v6

    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_3
    const/16 v16, 0x0

    .line 119
    .line 120
    iget v4, v2, La/xjr;->o:I

    .line 121
    .line 122
    iget v5, v2, La/xjr;->n:I

    .line 123
    .line 124
    iget-wide v7, v2, La/xjr;->m:J

    .line 125
    .line 126
    iget-wide v10, v2, La/xjr;->l:J

    .line 127
    .line 128
    iget-object v12, v2, La/xjr;->k:Ljava/lang/Throwable;

    .line 129
    .line 130
    iget-object v13, v2, La/xjr;->j:La/fjo;

    .line 131
    .line 132
    iget-object v14, v2, La/xjr;->i:Ljava/lang/String;

    .line 133
    .line 134
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    .line 137
    goto/16 :goto_3

    .line 138
    .line 139
    :catchall_0
    move-exception v0

    .line 140
    move/from16 v17, v4

    .line 141
    .line 142
    move-object v4, v2

    .line 143
    move-object v2, v14

    .line 144
    move-object v14, v13

    .line 145
    move/from16 v18, v5

    .line 146
    .line 147
    move/from16 v5, v17

    .line 148
    .line 149
    move-wide/from16 v19, v7

    .line 150
    .line 151
    move/from16 v7, v18

    .line 152
    .line 153
    move-object v8, v12

    .line 154
    move-wide v12, v10

    .line 155
    move-wide/from16 v10, v19

    .line 156
    .line 157
    goto/16 :goto_4

    .line 158
    .line 159
    :cond_4
    const/16 v16, 0x0

    .line 160
    .line 161
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v1, La/yjr;->b:La/njo;

    .line 165
    .line 166
    iget-object v0, v0, La/njo;->a:Ljava/lang/String;

    .line 167
    .line 168
    new-instance v4, Ljava/util/ArrayList;

    .line 169
    .line 170
    const/16 v5, 0xa

    .line 171
    .line 172
    move-object/from16 v7, p2

    .line 173
    .line 174
    invoke-static {v7, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    if-eqz v7, :cond_5

    .line 190
    .line 191
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    check-cast v7, La/qio;

    .line 196
    .line 197
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    new-instance v8, La/wio;

    .line 201
    .line 202
    iget v10, v7, La/qio;->a:I

    .line 203
    .line 204
    iget-boolean v7, v7, La/qio;->b:Z

    .line 205
    .line 206
    invoke-direct {v8, v10, v7}, La/wio;-><init>(IZ)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_5
    new-instance v5, La/fjo;

    .line 214
    .line 215
    invoke-direct {v5, v0, v4}, La/fjo;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 216
    .line 217
    .line 218
    sget-wide v7, La/cag0;->a:J

    .line 219
    .line 220
    const-wide/16 v10, 0x3

    .line 221
    .line 222
    move-object v4, v2

    .line 223
    move-object v14, v5

    .line 224
    move v0, v9

    .line 225
    move-wide v12, v10

    .line 226
    const/4 v5, 0x0

    .line 227
    move-object/from16 v2, p1

    .line 228
    .line 229
    move-wide v10, v7

    .line 230
    move v7, v0

    .line 231
    move-object/from16 v8, v16

    .line 232
    .line 233
    :goto_2
    if-eqz v0, :cond_12

    .line 234
    .line 235
    :try_start_1
    iget-object v15, v1, La/yjr;->a:La/ojo;

    .line 236
    .line 237
    iget-object v6, v1, La/yjr;->c:La/btt0;

    .line 238
    .line 239
    invoke-virtual {v6}, La/btt0;->a()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    iput-object v2, v4, La/xjr;->i:Ljava/lang/String;

    .line 244
    .line 245
    iput-object v14, v4, La/xjr;->j:La/fjo;

    .line 246
    .line 247
    iput-object v8, v4, La/xjr;->k:Ljava/lang/Throwable;

    .line 248
    .line 249
    iput-wide v12, v4, La/xjr;->l:J

    .line 250
    .line 251
    iput-wide v10, v4, La/xjr;->m:J

    .line 252
    .line 253
    iput v7, v4, La/xjr;->n:I

    .line 254
    .line 255
    iput v5, v4, La/xjr;->o:I

    .line 256
    .line 257
    iput v0, v4, La/xjr;->p:I

    .line 258
    .line 259
    iput v9, v4, La/xjr;->s:I

    .line 260
    .line 261
    iget-object v0, v15, La/ojo;->a:La/wgn;

    .line 262
    .line 263
    invoke-virtual {v0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, La/mjo;

    .line 268
    .line 269
    invoke-interface {v0, v6, v2, v14, v4}, La/mjo;->a(Ljava/lang/String;Ljava/lang/String;La/fjo;La/yje;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 273
    if-ne v0, v3, :cond_6

    .line 274
    .line 275
    goto/16 :goto_9

    .line 276
    .line 277
    :cond_6
    move-object/from16 v17, v14

    .line 278
    .line 279
    move-object v14, v2

    .line 280
    move-object v2, v4

    .line 281
    move v4, v5

    .line 282
    move v5, v7

    .line 283
    move-wide/from16 v18, v12

    .line 284
    .line 285
    move-object v12, v8

    .line 286
    move-wide v7, v10

    .line 287
    move-wide/from16 v10, v18

    .line 288
    .line 289
    move-object/from16 v13, v17

    .line 290
    .line 291
    :goto_3
    :try_start_2
    check-cast v0, La/dx5;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 292
    .line 293
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    check-cast v0, La/ljo;

    .line 298
    .line 299
    new-instance v1, La/zio;

    .line 300
    .line 301
    iget-object v2, v0, La/ljo;->a:Ljava/lang/Boolean;

    .line 302
    .line 303
    if-eqz v2, :cond_8

    .line 304
    .line 305
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    iget-object v0, v0, La/ljo;->b:Ljava/lang/String;

    .line 310
    .line 311
    if-nez v0, :cond_7

    .line 312
    .line 313
    const-string v0, ""

    .line 314
    .line 315
    :cond_7
    invoke-direct {v1, v0, v2}, La/zio;-><init>(Ljava/lang/String;Z)V

    .line 316
    .line 317
    .line 318
    return-object v1

    .line 319
    :cond_8
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    return-object v16

    .line 323
    :catchall_1
    move-exception v0

    .line 324
    :goto_4
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    if-eqz v6, :cond_d

    .line 329
    .line 330
    if-nez v7, :cond_9

    .line 331
    .line 332
    new-instance v8, La/el50;

    .line 333
    .line 334
    invoke-direct {v8, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 335
    .line 336
    .line 337
    const/4 v0, 0x0

    .line 338
    const/4 v6, 0x2

    .line 339
    goto :goto_2

    .line 340
    :cond_9
    move-wide/from16 p1, v10

    .line 341
    .line 342
    int-to-long v9, v5

    .line 343
    cmp-long v9, v9, v12

    .line 344
    .line 345
    if-gez v9, :cond_a

    .line 346
    .line 347
    const/4 v9, 0x1

    .line 348
    goto :goto_5

    .line 349
    :cond_a
    const/4 v9, 0x0

    .line 350
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 351
    .line 352
    if-eqz v9, :cond_b

    .line 353
    .line 354
    iput-object v2, v4, La/xjr;->i:Ljava/lang/String;

    .line 355
    .line 356
    iput-object v14, v4, La/xjr;->j:La/fjo;

    .line 357
    .line 358
    iput-object v8, v4, La/xjr;->k:Ljava/lang/Throwable;

    .line 359
    .line 360
    iput-wide v12, v4, La/xjr;->l:J

    .line 361
    .line 362
    move-wide/from16 v10, p1

    .line 363
    .line 364
    iput-wide v10, v4, La/xjr;->m:J

    .line 365
    .line 366
    iput v7, v4, La/xjr;->n:I

    .line 367
    .line 368
    iput v5, v4, La/xjr;->o:I

    .line 369
    .line 370
    iput v9, v4, La/xjr;->p:I

    .line 371
    .line 372
    const/4 v15, 0x2

    .line 373
    iput v15, v4, La/xjr;->s:I

    .line 374
    .line 375
    invoke-static {v10, v11, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    if-ne v0, v3, :cond_c

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :goto_6
    move v6, v15

    .line 383
    :goto_7
    const/4 v9, 0x1

    .line 384
    goto/16 :goto_2

    .line 385
    .line 386
    :cond_b
    move-wide/from16 v10, p1

    .line 387
    .line 388
    const/4 v15, 0x2

    .line 389
    new-instance v8, La/el50;

    .line 390
    .line 391
    invoke-direct {v8, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 392
    .line 393
    .line 394
    :cond_c
    move v0, v9

    .line 395
    goto :goto_6

    .line 396
    :cond_d
    const/4 v15, 0x2

    .line 397
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 398
    .line 399
    .line 400
    move-result v9

    .line 401
    if-eqz v9, :cond_11

    .line 402
    .line 403
    move/from16 p2, v7

    .line 404
    .line 405
    int-to-long v6, v5

    .line 406
    cmp-long v6, v6, v12

    .line 407
    .line 408
    if-gez v6, :cond_e

    .line 409
    .line 410
    const/4 v6, 0x1

    .line 411
    goto :goto_8

    .line 412
    :cond_e
    const/4 v6, 0x0

    .line 413
    :goto_8
    add-int/lit8 v5, v5, 0x1

    .line 414
    .line 415
    if-eqz v6, :cond_f

    .line 416
    .line 417
    iput-object v2, v4, La/xjr;->i:Ljava/lang/String;

    .line 418
    .line 419
    iput-object v14, v4, La/xjr;->j:La/fjo;

    .line 420
    .line 421
    iput-object v8, v4, La/xjr;->k:Ljava/lang/Throwable;

    .line 422
    .line 423
    iput-wide v12, v4, La/xjr;->l:J

    .line 424
    .line 425
    iput-wide v10, v4, La/xjr;->m:J

    .line 426
    .line 427
    move/from16 v7, p2

    .line 428
    .line 429
    iput v7, v4, La/xjr;->n:I

    .line 430
    .line 431
    iput v5, v4, La/xjr;->o:I

    .line 432
    .line 433
    iput v6, v4, La/xjr;->p:I

    .line 434
    .line 435
    const/4 v9, 0x3

    .line 436
    iput v9, v4, La/xjr;->s:I

    .line 437
    .line 438
    invoke-static {v10, v11, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    if-ne v0, v3, :cond_10

    .line 443
    .line 444
    :goto_9
    return-object v3

    .line 445
    :cond_f
    move/from16 v7, p2

    .line 446
    .line 447
    const/4 v9, 0x3

    .line 448
    new-instance v8, La/dag0;

    .line 449
    .line 450
    invoke-direct {v8, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 451
    .line 452
    .line 453
    :cond_10
    move v0, v6

    .line 454
    goto :goto_6

    .line 455
    :cond_11
    const/4 v9, 0x3

    .line 456
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 457
    .line 458
    .line 459
    move-object v8, v0

    .line 460
    move v6, v15

    .line 461
    const/4 v0, 0x0

    .line 462
    goto :goto_7

    .line 463
    :cond_12
    if-nez v8, :cond_13

    .line 464
    .line 465
    const-string v0, "Unexpected error"

    .line 466
    .line 467
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    return-object v16

    .line 471
    :cond_13
    throw v8
.end method
