.class public final La/nau;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/f4u;

.field public final b:La/pru;

.field public final c:La/iqt;

.field public final d:La/rou;

.field public final e:La/lbu;

.field public final f:La/bzt;

.field public final g:La/nou;

.field public final h:La/gxu;

.field public final i:La/epc;

.field public final j:La/yfu;

.field public final k:La/ahu;

.field public final l:La/r9u;

.field public final m:La/iqi;


# direct methods
.method public constructor <init>(La/f4u;La/pru;La/iqt;La/rou;La/lbu;La/bzt;La/nou;La/gxu;La/epc;La/yfu;La/ahu;La/r9u;La/iqi;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/nau;->a:La/f4u;

    .line 23
    .line 24
    iput-object p2, p0, La/nau;->b:La/pru;

    .line 25
    .line 26
    iput-object p3, p0, La/nau;->c:La/iqt;

    .line 27
    .line 28
    iput-object p4, p0, La/nau;->d:La/rou;

    .line 29
    .line 30
    iput-object p5, p0, La/nau;->e:La/lbu;

    .line 31
    .line 32
    iput-object p6, p0, La/nau;->f:La/bzt;

    .line 33
    .line 34
    iput-object p7, p0, La/nau;->g:La/nou;

    .line 35
    .line 36
    iput-object p8, p0, La/nau;->h:La/gxu;

    .line 37
    .line 38
    iput-object p9, p0, La/nau;->i:La/epc;

    .line 39
    .line 40
    iput-object p10, p0, La/nau;->j:La/yfu;

    .line 41
    .line 42
    iput-object p11, p0, La/nau;->k:La/ahu;

    .line 43
    .line 44
    iput-object p12, p0, La/nau;->l:La/r9u;

    .line 45
    .line 46
    iput-object p13, p0, La/nau;->m:La/iqi;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, La/mau;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/mau;

    .line 11
    .line 12
    iget v3, v2, La/mau;->t:I

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
    iput v3, v2, La/mau;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/mau;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/mau;-><init>(La/nau;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/mau;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/mau;->t:I

    .line 34
    .line 35
    const/4 v5, 0x5

    .line 36
    const/4 v6, 0x4

    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v8, 0x2

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x1

    .line 41
    const/4 v11, 0x0

    .line 42
    if-eqz v4, :cond_6

    .line 43
    .line 44
    if-eq v4, v10, :cond_5

    .line 45
    .line 46
    if-eq v4, v8, :cond_4

    .line 47
    .line 48
    if-eq v4, v7, :cond_3

    .line 49
    .line 50
    if-eq v4, v6, :cond_2

    .line 51
    .line 52
    if-ne v4, v5, :cond_1

    .line 53
    .line 54
    iget-boolean v3, v2, La/mau;->q:Z

    .line 55
    .line 56
    iget v4, v2, La/mau;->l:I

    .line 57
    .line 58
    iget v5, v2, La/mau;->j:I

    .line 59
    .line 60
    iget-wide v6, v2, La/mau;->o:J

    .line 61
    .line 62
    iget v8, v2, La/mau;->i:I

    .line 63
    .line 64
    iget-object v11, v2, La/mau;->n:La/v8d;

    .line 65
    .line 66
    iget-object v2, v2, La/mau;->m:La/sff0;

    .line 67
    .line 68
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move/from16 v16, v3

    .line 72
    .line 73
    move v14, v5

    .line 74
    move-object/from16 v22, v11

    .line 75
    .line 76
    move v11, v4

    .line 77
    move-wide v4, v6

    .line 78
    move-object/from16 v6, v22

    .line 79
    .line 80
    :goto_1
    move/from16 v21, v8

    .line 81
    .line 82
    goto/16 :goto_d

    .line 83
    .line 84
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 85
    .line 86
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object v11

    .line 90
    :cond_2
    iget v4, v2, La/mau;->k:I

    .line 91
    .line 92
    iget-boolean v6, v2, La/mau;->p:Z

    .line 93
    .line 94
    iget v7, v2, La/mau;->j:I

    .line 95
    .line 96
    iget-wide v11, v2, La/mau;->o:J

    .line 97
    .line 98
    iget v8, v2, La/mau;->i:I

    .line 99
    .line 100
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_a

    .line 104
    .line 105
    :cond_3
    iget-boolean v4, v2, La/mau;->p:Z

    .line 106
    .line 107
    iget v7, v2, La/mau;->j:I

    .line 108
    .line 109
    iget-wide v12, v2, La/mau;->o:J

    .line 110
    .line 111
    iget v8, v2, La/mau;->i:I

    .line 112
    .line 113
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_8

    .line 117
    .line 118
    :cond_4
    iget-wide v12, v2, La/mau;->o:J

    .line 119
    .line 120
    iget v4, v2, La/mau;->i:I

    .line 121
    .line 122
    iget-object v8, v2, La/mau;->m:La/sff0;

    .line 123
    .line 124
    check-cast v8, La/nau;

    .line 125
    .line 126
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :catchall_0
    move-exception v0

    .line 131
    goto/16 :goto_6

    .line 132
    .line 133
    :cond_5
    iget v4, v2, La/mau;->i:I

    .line 134
    .line 135
    iget-object v12, v2, La/mau;->m:La/sff0;

    .line 136
    .line 137
    check-cast v12, La/nau;

    .line 138
    .line 139
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :catchall_1
    move-exception v0

    .line 144
    goto :goto_3

    .line 145
    :cond_6
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 149
    .line 150
    iget-object v0, v1, La/nau;->k:La/ahu;

    .line 151
    .line 152
    iput-object v11, v2, La/mau;->m:La/sff0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 153
    .line 154
    move/from16 v4, p1

    .line 155
    .line 156
    :try_start_3
    iput v4, v2, La/mau;->i:I

    .line 157
    .line 158
    iput v10, v2, La/mau;->t:I

    .line 159
    .line 160
    invoke-static {v0, v2}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-ne v0, v3, :cond_7

    .line 165
    .line 166
    goto/16 :goto_c

    .line 167
    .line 168
    :cond_7
    :goto_2
    check-cast v0, La/ql5;

    .line 169
    .line 170
    iget-wide v12, v0, La/ql5;->e:J

    .line 171
    .line 172
    new-instance v0, Ljava/lang/Long;

    .line 173
    .line 174
    invoke-direct {v0, v12, v13}, Ljava/lang/Long;-><init>(J)V

    .line 175
    .line 176
    .line 177
    sget-object v12, La/j0g0;->b:La/e0g0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :catchall_2
    move-exception v0

    .line 181
    move/from16 v4, p1

    .line 182
    .line 183
    :goto_3
    sget-object v12, La/j0g0;->b:La/e0g0;

    .line 184
    .line 185
    new-instance v12, La/g0g0;

    .line 186
    .line 187
    invoke-direct {v12, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    move-object v0, v12

    .line 191
    :goto_4
    new-instance v12, Ljava/lang/Long;

    .line 192
    .line 193
    const-wide/16 v13, 0x0

    .line 194
    .line 195
    invoke-direct {v12, v13, v14}, Ljava/lang/Long;-><init>(J)V

    .line 196
    .line 197
    .line 198
    instance-of v13, v0, La/g0g0;

    .line 199
    .line 200
    if-eqz v13, :cond_8

    .line 201
    .line 202
    move-object v0, v12

    .line 203
    :cond_8
    check-cast v0, Ljava/lang/Number;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 206
    .line 207
    .line 208
    move-result-wide v12

    .line 209
    :try_start_4
    iget-object v0, v1, La/nau;->g:La/nou;

    .line 210
    .line 211
    iput-object v11, v2, La/mau;->m:La/sff0;

    .line 212
    .line 213
    iput v4, v2, La/mau;->i:I

    .line 214
    .line 215
    iput-wide v12, v2, La/mau;->o:J

    .line 216
    .line 217
    iput v8, v2, La/mau;->t:I

    .line 218
    .line 219
    invoke-static {v0, v2}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-ne v0, v3, :cond_9

    .line 224
    .line 225
    goto/16 :goto_c

    .line 226
    .line 227
    :cond_9
    :goto_5
    check-cast v0, La/ql5;

    .line 228
    .line 229
    iget v0, v0, La/ql5;->h:I

    .line 230
    .line 231
    new-instance v8, Ljava/lang/Integer;

    .line 232
    .line 233
    invoke-direct {v8, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 234
    .line 235
    .line 236
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :goto_6
    sget-object v8, La/j0g0;->b:La/e0g0;

    .line 240
    .line 241
    new-instance v8, La/g0g0;

    .line 242
    .line 243
    invoke-direct {v8, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    :goto_7
    new-instance v0, Ljava/lang/Integer;

    .line 247
    .line 248
    invoke-direct {v0, v9}, Ljava/lang/Integer;-><init>(I)V

    .line 249
    .line 250
    .line 251
    instance-of v14, v8, La/g0g0;

    .line 252
    .line 253
    if-eqz v14, :cond_a

    .line 254
    .line 255
    move-object v8, v0

    .line 256
    :cond_a
    check-cast v8, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    iget-object v8, v1, La/nau;->c:La/iqt;

    .line 263
    .line 264
    iget-object v8, v8, La/iqt;->a:La/gst0;

    .line 265
    .line 266
    invoke-virtual {v8}, La/gst0;->a()Z

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    if-eqz v8, :cond_c

    .line 271
    .line 272
    iput-object v11, v2, La/mau;->m:La/sff0;

    .line 273
    .line 274
    iput v4, v2, La/mau;->i:I

    .line 275
    .line 276
    iput-wide v12, v2, La/mau;->o:J

    .line 277
    .line 278
    iput v0, v2, La/mau;->j:I

    .line 279
    .line 280
    iput-boolean v8, v2, La/mau;->p:Z

    .line 281
    .line 282
    iput v7, v2, La/mau;->t:I

    .line 283
    .line 284
    iget-object v7, v1, La/nau;->d:La/rou;

    .line 285
    .line 286
    invoke-virtual {v7, v9, v2}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    if-ne v7, v3, :cond_b

    .line 291
    .line 292
    goto/16 :goto_c

    .line 293
    .line 294
    :cond_b
    move-object/from16 v22, v7

    .line 295
    .line 296
    move v7, v0

    .line 297
    move-object/from16 v0, v22

    .line 298
    .line 299
    move/from16 v22, v8

    .line 300
    .line 301
    move v8, v4

    .line 302
    move/from16 v4, v22

    .line 303
    .line 304
    :goto_8
    check-cast v0, La/m2c0;

    .line 305
    .line 306
    iget-boolean v0, v0, La/m2c0;->n0:Z

    .line 307
    .line 308
    move/from16 v22, v4

    .line 309
    .line 310
    move v4, v0

    .line 311
    move v0, v7

    .line 312
    move/from16 v7, v22

    .line 313
    .line 314
    goto :goto_9

    .line 315
    :cond_c
    move v7, v8

    .line 316
    move v8, v4

    .line 317
    move v4, v9

    .line 318
    :goto_9
    iput-object v11, v2, La/mau;->m:La/sff0;

    .line 319
    .line 320
    iput v8, v2, La/mau;->i:I

    .line 321
    .line 322
    iput-wide v12, v2, La/mau;->o:J

    .line 323
    .line 324
    iput v0, v2, La/mau;->j:I

    .line 325
    .line 326
    iput-boolean v7, v2, La/mau;->p:Z

    .line 327
    .line 328
    iput v4, v2, La/mau;->k:I

    .line 329
    .line 330
    iput v6, v2, La/mau;->t:I

    .line 331
    .line 332
    iget-object v6, v1, La/nau;->h:La/gxu;

    .line 333
    .line 334
    invoke-virtual {v6, v2}, La/gxu;->n(La/yje;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    if-ne v6, v3, :cond_d

    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_d
    move v11, v7

    .line 342
    move v7, v0

    .line 343
    move-object v0, v6

    .line 344
    move v6, v11

    .line 345
    move-wide v11, v12

    .line 346
    :goto_a
    check-cast v0, Ljava/lang/Boolean;

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-eqz v0, :cond_e

    .line 353
    .line 354
    if-eqz v4, :cond_e

    .line 355
    .line 356
    move v0, v10

    .line 357
    goto :goto_b

    .line 358
    :cond_e
    move v0, v9

    .line 359
    :goto_b
    iget-object v13, v1, La/nau;->b:La/pru;

    .line 360
    .line 361
    invoke-virtual {v13}, La/pru;->a()La/sff0;

    .line 362
    .line 363
    .line 364
    move-result-object v13

    .line 365
    iget-object v14, v1, La/nau;->e:La/lbu;

    .line 366
    .line 367
    invoke-virtual {v14}, La/lbu;->j()Z

    .line 368
    .line 369
    .line 370
    move-result v14

    .line 371
    iget-object v15, v1, La/nau;->f:La/bzt;

    .line 372
    .line 373
    iget-object v15, v15, La/bzt;->a:La/fsd;

    .line 374
    .line 375
    invoke-virtual {v15}, La/fsd;->a()La/v8d;

    .line 376
    .line 377
    .line 378
    move-result-object v15

    .line 379
    iput-object v13, v2, La/mau;->m:La/sff0;

    .line 380
    .line 381
    iput-object v15, v2, La/mau;->n:La/v8d;

    .line 382
    .line 383
    iput v8, v2, La/mau;->i:I

    .line 384
    .line 385
    iput-wide v11, v2, La/mau;->o:J

    .line 386
    .line 387
    iput v7, v2, La/mau;->j:I

    .line 388
    .line 389
    iput-boolean v6, v2, La/mau;->p:Z

    .line 390
    .line 391
    iput v4, v2, La/mau;->k:I

    .line 392
    .line 393
    iput v0, v2, La/mau;->l:I

    .line 394
    .line 395
    iput-boolean v14, v2, La/mau;->q:Z

    .line 396
    .line 397
    iput v5, v2, La/mau;->t:I

    .line 398
    .line 399
    iget-object v4, v1, La/nau;->m:La/iqi;

    .line 400
    .line 401
    invoke-virtual {v4, v2}, La/iqi;->g(La/zje;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    if-ne v2, v3, :cond_f

    .line 406
    .line 407
    :goto_c
    return-object v3

    .line 408
    :cond_f
    move-wide v4, v11

    .line 409
    move/from16 v16, v14

    .line 410
    .line 411
    move-object v6, v15

    .line 412
    move v11, v0

    .line 413
    move-object v0, v2

    .line 414
    move v14, v7

    .line 415
    move-object v2, v13

    .line 416
    goto/16 :goto_1

    .line 417
    .line 418
    :goto_d
    move-object/from16 v20, v0

    .line 419
    .line 420
    check-cast v20, La/vh0;

    .line 421
    .line 422
    iget-object v0, v1, La/nau;->j:La/yfu;

    .line 423
    .line 424
    invoke-virtual {v0}, La/yfu;->j()V

    .line 425
    .line 426
    .line 427
    iget-object v0, v1, La/nau;->a:La/f4u;

    .line 428
    .line 429
    invoke-virtual {v0}, La/f4u;->b()La/xv10;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    iget-object v0, v0, La/xv10;->b:Ljava/util/List;

    .line 434
    .line 435
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    move-object/from16 v18, v2

    .line 440
    .line 441
    new-instance v2, La/q71;

    .line 442
    .line 443
    const/4 v3, 0x4

    .line 444
    move/from16 v8, v16

    .line 445
    .line 446
    move-object/from16 v7, v18

    .line 447
    .line 448
    invoke-direct/range {v2 .. v8}, La/q71;-><init>(BJLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 449
    .line 450
    .line 451
    move-wide v12, v4

    .line 452
    move v5, v8

    .line 453
    invoke-static {v0, v2}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    new-instance v2, La/jno;

    .line 458
    .line 459
    invoke-direct {v2, v10, v5}, La/jno;-><init>(BZ)V

    .line 460
    .line 461
    .line 462
    invoke-static {v0, v2}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    sget-object v2, La/ygp;->E1:La/ygp;

    .line 467
    .line 468
    iget-object v3, v1, La/nau;->l:La/r9u;

    .line 469
    .line 470
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    iget-object v3, v3, La/r9u;->a:La/j1q0;

    .line 474
    .line 475
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 479
    .line 480
    invoke-virtual {v3, v2}, La/m1q0;->d(La/ygp;)Z

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    iget-object v1, v1, La/nau;->i:La/epc;

    .line 485
    .line 486
    invoke-virtual {v1}, La/epc;->a()La/hr4;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    iget-boolean v3, v1, La/hr4;->a:Z

    .line 491
    .line 492
    const/4 v7, 0x0

    .line 493
    const/16 v8, 0x30

    .line 494
    .line 495
    const/4 v6, 0x0

    .line 496
    move-object v1, v0

    .line 497
    move-object/from16 v2, v18

    .line 498
    .line 499
    invoke-static/range {v1 .. v8}, La/qbc;->N(Lkotlin/sequences/Sequence;La/sff0;ZZZZZI)La/c5q;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    sget-object v19, La/iun;->a:La/iun;

    .line 504
    .line 505
    sget-object v1, La/iz30;->k:La/iz30;

    .line 506
    .line 507
    iget-object v3, v2, La/sff0;->a:La/gx7;

    .line 508
    .line 509
    iget-object v3, v3, La/gx7;->f:Ljava/lang/String;

    .line 510
    .line 511
    new-instance v4, Lkotlin/Pair;

    .line 512
    .line 513
    invoke-direct {v4, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    invoke-static {v4}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 517
    .line 518
    .line 519
    move-result-object v15

    .line 520
    if-eqz v11, :cond_10

    .line 521
    .line 522
    move/from16 v17, v10

    .line 523
    .line 524
    :goto_e
    move-object v11, v0

    .line 525
    move-object/from16 v18, v2

    .line 526
    .line 527
    move/from16 v16, v5

    .line 528
    .line 529
    goto :goto_f

    .line 530
    :cond_10
    move/from16 v17, v9

    .line 531
    .line 532
    goto :goto_e

    .line 533
    :goto_f
    invoke-static/range {v11 .. v21}, La/hhm0;->D(La/c5q;JILjava/util/Map;ZZLa/sff0;Ljava/util/List;La/vh0;I)Ljava/util/ArrayList;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    new-instance v1, La/eu4;

    .line 538
    .line 539
    const/16 v2, 0xc

    .line 540
    .line 541
    invoke-direct {v1, v0, v2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 542
    .line 543
    .line 544
    return-object v1
.end method
