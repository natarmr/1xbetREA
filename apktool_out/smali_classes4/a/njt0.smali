.class public final La/njt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xr;

.field public final b:La/lhf0;

.field public final c:La/pru;

.field public final d:La/k9u;

.field public final e:La/rvt;

.field public final f:La/vpt;

.field public final g:La/z8u;

.field public final h:La/zoc;

.field public final i:La/m1e;


# direct methods
.method public constructor <init>(La/xr;La/lhf0;La/pru;La/k9u;La/rvt;La/vpt;La/z8u;La/zoc;La/m1e;)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/njt0;->a:La/xr;

    .line 8
    .line 9
    iput-object p2, p0, La/njt0;->b:La/lhf0;

    .line 10
    .line 11
    iput-object p3, p0, La/njt0;->c:La/pru;

    .line 12
    .line 13
    iput-object p4, p0, La/njt0;->d:La/k9u;

    .line 14
    .line 15
    iput-object p5, p0, La/njt0;->e:La/rvt;

    .line 16
    .line 17
    iput-object p6, p0, La/njt0;->f:La/vpt;

    .line 18
    .line 19
    iput-object p7, p0, La/njt0;->g:La/z8u;

    .line 20
    .line 21
    iput-object p8, p0, La/njt0;->h:La/zoc;

    .line 22
    .line 23
    iput-object p9, p0, La/njt0;->i:La/m1e;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(JJLa/zje;ZZZ)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    move/from16 v2, p6

    .line 6
    .line 7
    move/from16 v3, p7

    .line 8
    .line 9
    instance-of v4, v0, La/mjt0;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, La/mjt0;

    .line 15
    .line 16
    iget v5, v4, La/mjt0;->t:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/mjt0;->t:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/mjt0;

    .line 29
    .line 30
    invoke-direct {v4, v1, v0}, La/mjt0;-><init>(La/njt0;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v4, La/mjt0;->r:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/mjt0;->t:I

    .line 38
    .line 39
    const/4 v8, 0x1

    .line 40
    const/4 v9, 0x0

    .line 41
    packed-switch v6, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v9

    .line 50
    :pswitch_0
    iget-object v1, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_11

    .line 56
    .line 57
    :pswitch_1
    iget v2, v4, La/mjt0;->o:I

    .line 58
    .line 59
    iget v3, v4, La/mjt0;->n:I

    .line 60
    .line 61
    iget-boolean v6, v4, La/mjt0;->m:Z

    .line 62
    .line 63
    iget-boolean v7, v4, La/mjt0;->l:Z

    .line 64
    .line 65
    iget-boolean v8, v4, La/mjt0;->k:Z

    .line 66
    .line 67
    iget-wide v10, v4, La/mjt0;->j:J

    .line 68
    .line 69
    iget-wide v12, v4, La/mjt0;->i:J

    .line 70
    .line 71
    iget-object v14, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v14, La/njt0;

    .line 74
    .line 75
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto/16 :goto_c

    .line 79
    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto/16 :goto_e

    .line 82
    .line 83
    :pswitch_2
    iget v2, v4, La/mjt0;->o:I

    .line 84
    .line 85
    iget v3, v4, La/mjt0;->n:I

    .line 86
    .line 87
    iget-boolean v6, v4, La/mjt0;->m:Z

    .line 88
    .line 89
    iget-boolean v7, v4, La/mjt0;->l:Z

    .line 90
    .line 91
    iget-boolean v8, v4, La/mjt0;->k:Z

    .line 92
    .line 93
    iget-wide v10, v4, La/mjt0;->j:J

    .line 94
    .line 95
    iget-wide v12, v4, La/mjt0;->i:J

    .line 96
    .line 97
    iget-object v14, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v14, La/njt0;

    .line 100
    .line 101
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    .line 104
    goto/16 :goto_b

    .line 105
    .line 106
    :pswitch_3
    iget v2, v4, La/mjt0;->o:I

    .line 107
    .line 108
    iget v3, v4, La/mjt0;->n:I

    .line 109
    .line 110
    iget-boolean v6, v4, La/mjt0;->m:Z

    .line 111
    .line 112
    iget-boolean v10, v4, La/mjt0;->l:Z

    .line 113
    .line 114
    iget-boolean v11, v4, La/mjt0;->k:Z

    .line 115
    .line 116
    iget-wide v12, v4, La/mjt0;->j:J

    .line 117
    .line 118
    iget-wide v14, v4, La/mjt0;->i:J

    .line 119
    .line 120
    iget-object v7, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v7, La/njt0;

    .line 123
    .line 124
    :try_start_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    .line 126
    .line 127
    goto/16 :goto_9

    .line 128
    .line 129
    :catchall_1
    move-exception v0

    .line 130
    move v7, v10

    .line 131
    move v8, v11

    .line 132
    move-wide v10, v12

    .line 133
    move-wide v12, v14

    .line 134
    goto/16 :goto_e

    .line 135
    .line 136
    :pswitch_4
    iget v2, v4, La/mjt0;->o:I

    .line 137
    .line 138
    iget v3, v4, La/mjt0;->n:I

    .line 139
    .line 140
    iget-boolean v6, v4, La/mjt0;->m:Z

    .line 141
    .line 142
    iget-boolean v7, v4, La/mjt0;->l:Z

    .line 143
    .line 144
    iget-boolean v10, v4, La/mjt0;->k:Z

    .line 145
    .line 146
    iget-wide v11, v4, La/mjt0;->j:J

    .line 147
    .line 148
    iget-wide v13, v4, La/mjt0;->i:J

    .line 149
    .line 150
    iget-object v15, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v15, La/njt0;

    .line 153
    .line 154
    :try_start_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 155
    .line 156
    .line 157
    move v8, v10

    .line 158
    move-wide v10, v11

    .line 159
    move-wide v12, v13

    .line 160
    goto/16 :goto_8

    .line 161
    .line 162
    :catchall_2
    move-exception v0

    .line 163
    move v8, v10

    .line 164
    move-wide v10, v11

    .line 165
    move-wide v12, v13

    .line 166
    goto/16 :goto_e

    .line 167
    .line 168
    :pswitch_5
    iget v2, v4, La/mjt0;->n:I

    .line 169
    .line 170
    iget-boolean v3, v4, La/mjt0;->m:Z

    .line 171
    .line 172
    iget-boolean v6, v4, La/mjt0;->l:Z

    .line 173
    .line 174
    iget-boolean v7, v4, La/mjt0;->k:Z

    .line 175
    .line 176
    iget-wide v10, v4, La/mjt0;->j:J

    .line 177
    .line 178
    iget-wide v12, v4, La/mjt0;->i:J

    .line 179
    .line 180
    iget-object v14, v4, La/mjt0;->p:La/xvs;

    .line 181
    .line 182
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    move/from16 v16, v6

    .line 186
    .line 187
    move v6, v2

    .line 188
    move v2, v3

    .line 189
    move/from16 v3, v16

    .line 190
    .line 191
    move-wide/from16 v16, v12

    .line 192
    .line 193
    move-wide v12, v10

    .line 194
    move-wide/from16 v10, v16

    .line 195
    .line 196
    goto/16 :goto_4

    .line 197
    .line 198
    :pswitch_6
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iget-object v0, v1, La/njt0;->i:La/m1e;

    .line 202
    .line 203
    invoke-interface {v0}, La/m1e;->c()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-nez v0, :cond_1

    .line 208
    .line 209
    sget-object v0, La/pjt0;->a:La/pjt0;

    .line 210
    .line 211
    return-object v0

    .line 212
    :cond_1
    iget-object v0, v1, La/njt0;->f:La/vpt;

    .line 213
    .line 214
    invoke-virtual {v0}, La/vpt;->a()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_2

    .line 219
    .line 220
    if-eqz v3, :cond_2

    .line 221
    .line 222
    iget-object v0, v1, La/njt0;->d:La/k9u;

    .line 223
    .line 224
    invoke-virtual {v0}, La/k9u;->b()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_2

    .line 229
    .line 230
    iget-object v0, v1, La/njt0;->c:La/pru;

    .line 231
    .line 232
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    iget-boolean v0, v0, La/sff0;->C0:Z

    .line 237
    .line 238
    if-eqz v0, :cond_2

    .line 239
    .line 240
    move v0, v8

    .line 241
    goto :goto_1

    .line 242
    :cond_2
    const/4 v0, 0x0

    .line 243
    :goto_1
    if-eqz v2, :cond_3

    .line 244
    .line 245
    sget-object v6, La/xvs;->e:La/xvs;

    .line 246
    .line 247
    :goto_2
    move-object v14, v6

    .line 248
    goto :goto_3

    .line 249
    :cond_3
    sget-object v6, La/xvs;->d:La/xvs;

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :goto_3
    iget-object v6, v1, La/njt0;->g:La/z8u;

    .line 253
    .line 254
    iget-object v6, v6, La/z8u;->a:La/m0o0;

    .line 255
    .line 256
    invoke-virtual {v6}, La/m0o0;->d()La/gmq;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    iput-object v14, v4, La/mjt0;->p:La/xvs;

    .line 261
    .line 262
    move-wide/from16 v10, p1

    .line 263
    .line 264
    iput-wide v10, v4, La/mjt0;->i:J

    .line 265
    .line 266
    move-wide/from16 v12, p3

    .line 267
    .line 268
    iput-wide v12, v4, La/mjt0;->j:J

    .line 269
    .line 270
    iput-boolean v2, v4, La/mjt0;->k:Z

    .line 271
    .line 272
    iput-boolean v3, v4, La/mjt0;->l:Z

    .line 273
    .line 274
    move/from16 v7, p8

    .line 275
    .line 276
    iput-boolean v7, v4, La/mjt0;->m:Z

    .line 277
    .line 278
    iput v0, v4, La/mjt0;->n:I

    .line 279
    .line 280
    iput v8, v4, La/mjt0;->t:I

    .line 281
    .line 282
    invoke-static {v6, v4}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    if-ne v6, v5, :cond_4

    .line 287
    .line 288
    goto/16 :goto_10

    .line 289
    .line 290
    :cond_4
    move-object/from16 v16, v6

    .line 291
    .line 292
    move v6, v0

    .line 293
    move-object/from16 v0, v16

    .line 294
    .line 295
    move/from16 v16, v7

    .line 296
    .line 297
    move v7, v2

    .line 298
    move/from16 v2, v16

    .line 299
    .line 300
    :goto_4
    check-cast v0, Ljava/util/List;

    .line 301
    .line 302
    if-eqz v0, :cond_5

    .line 303
    .line 304
    invoke-static {v10, v11, v0}, La/axq;->y(JLjava/util/List;)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-ne v0, v8, :cond_5

    .line 309
    .line 310
    move v15, v8

    .line 311
    goto :goto_5

    .line 312
    :cond_5
    const/4 v15, 0x0

    .line 313
    :goto_5
    :try_start_4
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 314
    .line 315
    sget-object v0, La/g9n0;->a:La/g9n0;

    .line 316
    .line 317
    if-nez v15, :cond_b

    .line 318
    .line 319
    :try_start_5
    iget-object v8, v1, La/njt0;->a:La/xr;

    .line 320
    .line 321
    if-eqz v6, :cond_6

    .line 322
    .line 323
    new-instance v0, La/e9n0;

    .line 324
    .line 325
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 326
    .line 327
    .line 328
    goto :goto_7

    .line 329
    :catchall_3
    move-exception v0

    .line 330
    move-wide/from16 v16, v12

    .line 331
    .line 332
    move-wide v12, v10

    .line 333
    move-wide/from16 v10, v16

    .line 334
    .line 335
    :goto_6
    move v8, v7

    .line 336
    move v7, v3

    .line 337
    move v3, v6

    .line 338
    move v6, v2

    .line 339
    move v2, v15

    .line 340
    goto/16 :goto_e

    .line 341
    .line 342
    :cond_6
    :goto_7
    iput-object v9, v4, La/mjt0;->p:La/xvs;

    .line 343
    .line 344
    iput-object v1, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 345
    .line 346
    iput-wide v10, v4, La/mjt0;->i:J

    .line 347
    .line 348
    iput-wide v12, v4, La/mjt0;->j:J

    .line 349
    .line 350
    iput-boolean v7, v4, La/mjt0;->k:Z

    .line 351
    .line 352
    iput-boolean v3, v4, La/mjt0;->l:Z

    .line 353
    .line 354
    iput-boolean v2, v4, La/mjt0;->m:Z

    .line 355
    .line 356
    iput v6, v4, La/mjt0;->n:I

    .line 357
    .line 358
    iput v15, v4, La/mjt0;->o:I

    .line 359
    .line 360
    const/4 v9, 0x2

    .line 361
    iput v9, v4, La/mjt0;->t:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 362
    .line 363
    move-object/from16 p7, v0

    .line 364
    .line 365
    move-object/from16 p8, v4

    .line 366
    .line 367
    move-object/from16 p1, v8

    .line 368
    .line 369
    move-wide/from16 p2, v10

    .line 370
    .line 371
    move-wide/from16 p4, v12

    .line 372
    .line 373
    move-object/from16 p6, v14

    .line 374
    .line 375
    :try_start_6
    invoke-virtual/range {p1 .. p8}, La/xr;->l(JJLa/xvs;La/h9n0;La/zje;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 379
    move-wide/from16 v12, p2

    .line 380
    .line 381
    move-wide/from16 v10, p4

    .line 382
    .line 383
    move-object/from16 v4, p8

    .line 384
    .line 385
    if-ne v0, v5, :cond_7

    .line 386
    .line 387
    goto/16 :goto_10

    .line 388
    .line 389
    :cond_7
    move v8, v7

    .line 390
    move v7, v3

    .line 391
    move v3, v6

    .line 392
    move v6, v2

    .line 393
    move v2, v15

    .line 394
    move-object v15, v1

    .line 395
    :goto_8
    if-eqz v3, :cond_9

    .line 396
    .line 397
    :try_start_7
    iget-object v0, v15, La/njt0;->e:La/rvt;

    .line 398
    .line 399
    const/4 v9, 0x0

    .line 400
    iput-object v9, v4, La/mjt0;->p:La/xvs;

    .line 401
    .line 402
    iput-object v9, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 403
    .line 404
    iput-wide v12, v4, La/mjt0;->i:J

    .line 405
    .line 406
    iput-wide v10, v4, La/mjt0;->j:J

    .line 407
    .line 408
    iput-boolean v8, v4, La/mjt0;->k:Z

    .line 409
    .line 410
    iput-boolean v7, v4, La/mjt0;->l:Z

    .line 411
    .line 412
    iput-boolean v6, v4, La/mjt0;->m:Z

    .line 413
    .line 414
    iput v3, v4, La/mjt0;->n:I

    .line 415
    .line 416
    iput v2, v4, La/mjt0;->o:I

    .line 417
    .line 418
    const/4 v9, 0x3

    .line 419
    iput v9, v4, La/mjt0;->t:I

    .line 420
    .line 421
    iget-object v0, v0, La/rvt;->a:La/nvu;

    .line 422
    .line 423
    new-instance v9, La/ots;

    .line 424
    .line 425
    invoke-direct {v9, v8, v12, v13}, La/ots;-><init>(ZJ)V

    .line 426
    .line 427
    .line 428
    iget-object v0, v0, La/nvu;->b:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v0, La/g8n0;

    .line 431
    .line 432
    invoke-virtual {v0, v9}, La/g8n0;->a(La/ots;)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    if-ne v0, v5, :cond_8

    .line 441
    .line 442
    goto/16 :goto_10

    .line 443
    .line 444
    :cond_8
    move-wide v14, v12

    .line 445
    move-wide v12, v10

    .line 446
    move v10, v7

    .line 447
    move v11, v8

    .line 448
    :goto_9
    move v7, v10

    .line 449
    move v8, v11

    .line 450
    move-wide v10, v12

    .line 451
    move-wide v12, v14

    .line 452
    :cond_9
    new-instance v0, La/ojt0;

    .line 453
    .line 454
    if-eqz v3, :cond_a

    .line 455
    .line 456
    const/4 v9, 0x1

    .line 457
    goto :goto_a

    .line 458
    :cond_a
    const/4 v9, 0x0

    .line 459
    :goto_a
    invoke-direct {v0, v9}, La/ojt0;-><init>(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 460
    .line 461
    .line 462
    goto/16 :goto_d

    .line 463
    .line 464
    :catchall_4
    move-exception v0

    .line 465
    move-wide/from16 v12, p2

    .line 466
    .line 467
    move-wide/from16 v10, p4

    .line 468
    .line 469
    move-object/from16 v4, p8

    .line 470
    .line 471
    goto/16 :goto_6

    .line 472
    .line 473
    :cond_b
    move-wide/from16 v16, v12

    .line 474
    .line 475
    move-wide v12, v10

    .line 476
    move-wide/from16 v10, v16

    .line 477
    .line 478
    if-eqz v2, :cond_c

    .line 479
    .line 480
    if-eqz v15, :cond_c

    .line 481
    .line 482
    :try_start_8
    sget-object v0, La/qjt0;->a:La/qjt0;

    .line 483
    .line 484
    move v8, v7

    .line 485
    move v7, v3

    .line 486
    move v3, v6

    .line 487
    move v6, v2

    .line 488
    move v2, v15

    .line 489
    goto :goto_d

    .line 490
    :catchall_5
    move-exception v0

    .line 491
    goto/16 :goto_6

    .line 492
    .line 493
    :cond_c
    iget-object v8, v1, La/njt0;->b:La/lhf0;

    .line 494
    .line 495
    if-eqz v6, :cond_d

    .line 496
    .line 497
    new-instance v0, La/f9n0;

    .line 498
    .line 499
    const/4 v9, 0x1

    .line 500
    invoke-direct {v0, v9}, La/f9n0;-><init>(Z)V

    .line 501
    .line 502
    .line 503
    :cond_d
    const/4 v9, 0x0

    .line 504
    iput-object v9, v4, La/mjt0;->p:La/xvs;

    .line 505
    .line 506
    iput-object v1, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 507
    .line 508
    iput-wide v12, v4, La/mjt0;->i:J

    .line 509
    .line 510
    iput-wide v10, v4, La/mjt0;->j:J

    .line 511
    .line 512
    iput-boolean v7, v4, La/mjt0;->k:Z

    .line 513
    .line 514
    iput-boolean v3, v4, La/mjt0;->l:Z

    .line 515
    .line 516
    iput-boolean v2, v4, La/mjt0;->m:Z

    .line 517
    .line 518
    iput v6, v4, La/mjt0;->n:I

    .line 519
    .line 520
    iput v15, v4, La/mjt0;->o:I

    .line 521
    .line 522
    const/4 v9, 0x4

    .line 523
    iput v9, v4, La/mjt0;->t:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 524
    .line 525
    move-object/from16 p5, v0

    .line 526
    .line 527
    move-object/from16 p6, v4

    .line 528
    .line 529
    move-object/from16 p1, v8

    .line 530
    .line 531
    move-wide/from16 p2, v12

    .line 532
    .line 533
    move-object/from16 p4, v14

    .line 534
    .line 535
    :try_start_9
    invoke-virtual/range {p1 .. p6}, La/lhf0;->w(JLa/xvs;La/h9n0;La/zje;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 539
    move-wide/from16 v12, p2

    .line 540
    .line 541
    move-object/from16 v4, p6

    .line 542
    .line 543
    if-ne v0, v5, :cond_e

    .line 544
    .line 545
    goto :goto_10

    .line 546
    :cond_e
    move-object v14, v1

    .line 547
    move v8, v7

    .line 548
    move v7, v3

    .line 549
    move v3, v6

    .line 550
    move v6, v2

    .line 551
    move v2, v15

    .line 552
    :goto_b
    :try_start_a
    iget-object v0, v14, La/njt0;->h:La/zoc;

    .line 553
    .line 554
    const/4 v9, 0x0

    .line 555
    iput-object v9, v4, La/mjt0;->p:La/xvs;

    .line 556
    .line 557
    iput-object v9, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 558
    .line 559
    iput-wide v12, v4, La/mjt0;->i:J

    .line 560
    .line 561
    iput-wide v10, v4, La/mjt0;->j:J

    .line 562
    .line 563
    iput-boolean v8, v4, La/mjt0;->k:Z

    .line 564
    .line 565
    iput-boolean v7, v4, La/mjt0;->l:Z

    .line 566
    .line 567
    iput-boolean v6, v4, La/mjt0;->m:Z

    .line 568
    .line 569
    iput v3, v4, La/mjt0;->n:I

    .line 570
    .line 571
    iput v2, v4, La/mjt0;->o:I

    .line 572
    .line 573
    const/4 v9, 0x5

    .line 574
    iput v9, v4, La/mjt0;->t:I

    .line 575
    .line 576
    invoke-virtual {v0, v4}, La/zoc;->a(La/zje;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    if-ne v0, v5, :cond_f

    .line 581
    .line 582
    goto :goto_10

    .line 583
    :cond_f
    :goto_c
    sget-object v0, La/rjt0;->a:La/rjt0;

    .line 584
    .line 585
    :goto_d
    sget-object v9, La/j0g0;->b:La/e0g0;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 586
    .line 587
    move-object v9, v0

    .line 588
    goto :goto_f

    .line 589
    :catchall_6
    move-exception v0

    .line 590
    move-wide/from16 v12, p2

    .line 591
    .line 592
    move-object/from16 v4, p6

    .line 593
    .line 594
    goto/16 :goto_6

    .line 595
    .line 596
    :goto_e
    sget-object v9, La/j0g0;->b:La/e0g0;

    .line 597
    .line 598
    new-instance v9, La/g0g0;

    .line 599
    .line 600
    invoke-direct {v9, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 601
    .line 602
    .line 603
    :goto_f
    invoke-static {v9}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    if-eqz v0, :cond_11

    .line 608
    .line 609
    const/4 v14, 0x0

    .line 610
    iput-object v14, v4, La/mjt0;->p:La/xvs;

    .line 611
    .line 612
    iput-object v9, v4, La/mjt0;->q:Ljava/lang/Object;

    .line 613
    .line 614
    iput-wide v12, v4, La/mjt0;->i:J

    .line 615
    .line 616
    iput-wide v10, v4, La/mjt0;->j:J

    .line 617
    .line 618
    iput-boolean v8, v4, La/mjt0;->k:Z

    .line 619
    .line 620
    iput-boolean v7, v4, La/mjt0;->l:Z

    .line 621
    .line 622
    iput-boolean v6, v4, La/mjt0;->m:Z

    .line 623
    .line 624
    iput v3, v4, La/mjt0;->n:I

    .line 625
    .line 626
    iput v2, v4, La/mjt0;->o:I

    .line 627
    .line 628
    const/4 v0, 0x6

    .line 629
    iput v0, v4, La/mjt0;->t:I

    .line 630
    .line 631
    iget-object v0, v1, La/njt0;->h:La/zoc;

    .line 632
    .line 633
    invoke-virtual {v0, v4}, La/zoc;->a(La/zje;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    if-ne v0, v5, :cond_10

    .line 638
    .line 639
    :goto_10
    return-object v5

    .line 640
    :cond_10
    move-object v1, v9

    .line 641
    :goto_11
    move-object v9, v1

    .line 642
    :cond_11
    invoke-static {v9}, La/z1x;->P(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    return-object v9

    .line 646
    nop

    .line 647
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
