.class public final La/z07;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/mro;

.field public j:La/a17;

.field public k:La/z07;

.field public l:Ljava/lang/Throwable;

.field public m:J

.field public n:J

.field public o:J

.field public p:I

.field public q:I

.field public r:I

.field public s:B

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/util/List;

.field public final synthetic v:J

.field public final synthetic w:Z

.field public final synthetic x:La/a17;

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;JZLa/a17;Ljava/util/List;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/z07;->u:Ljava/util/List;

    .line 2
    .line 3
    iput-wide p2, p0, La/z07;->v:J

    .line 4
    .line 5
    iput-boolean p4, p0, La/z07;->w:Z

    .line 6
    .line 7
    iput-object p5, p0, La/z07;->x:La/a17;

    .line 8
    .line 9
    iput-object p6, p0, La/z07;->y:Ljava/util/List;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/z07;

    .line 2
    .line 3
    iget-object v5, p0, La/z07;->x:La/a17;

    .line 4
    .line 5
    iget-object v6, p0, La/z07;->y:Ljava/util/List;

    .line 6
    .line 7
    iget-object v1, p0, La/z07;->u:Ljava/util/List;

    .line 8
    .line 9
    iget-wide v2, p0, La/z07;->v:J

    .line 10
    .line 11
    iget-boolean v4, p0, La/z07;->w:Z

    .line 12
    .line 13
    move-object v7, p2

    .line 14
    invoke-direct/range {v0 .. v7}, La/z07;-><init>(Ljava/util/List;JZLa/a17;Ljava/util/List;La/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/z07;->t:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
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
    invoke-virtual {p0, p1, p2}, La/z07;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/z07;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/z07;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/z07;->x:La/a17;

    .line 4
    .line 5
    iget-object v2, v0, La/a17;->e:La/x07;

    .line 6
    .line 7
    iget-object v3, v1, La/z07;->t:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, La/vne;

    .line 10
    .line 11
    sget-object v3, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v4, v1, La/z07;->s:B

    .line 14
    .line 15
    const/4 v5, 0x2

    .line 16
    const/4 v6, 0x3

    .line 17
    const/4 v8, 0x1

    .line 18
    if-eqz v4, :cond_3

    .line 19
    .line 20
    if-eq v4, v8, :cond_2

    .line 21
    .line 22
    if-eq v4, v5, :cond_1

    .line 23
    .line 24
    if-ne v4, v6, :cond_0

    .line 25
    .line 26
    iget v0, v1, La/z07;->r:I

    .line 27
    .line 28
    iget v4, v1, La/z07;->q:I

    .line 29
    .line 30
    iget v10, v1, La/z07;->p:I

    .line 31
    .line 32
    iget-wide v11, v1, La/z07;->o:J

    .line 33
    .line 34
    iget-wide v13, v1, La/z07;->n:J

    .line 35
    .line 36
    iget-wide v6, v1, La/z07;->m:J

    .line 37
    .line 38
    iget-object v15, v1, La/z07;->l:Ljava/lang/Throwable;

    .line 39
    .line 40
    iget-object v5, v1, La/z07;->k:La/z07;

    .line 41
    .line 42
    iget-object v8, v1, La/z07;->j:La/a17;

    .line 43
    .line 44
    const/16 v19, 0x0

    .line 45
    .line 46
    iget-object v9, v1, La/z07;->i:La/mro;

    .line 47
    .line 48
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    move-object/from16 v20, v2

    .line 52
    .line 53
    move-object v1, v3

    .line 54
    move-object v2, v9

    .line 55
    const/16 v17, 0x2

    .line 56
    .line 57
    move-object/from16 v28, v5

    .line 58
    .line 59
    move v5, v4

    .line 60
    move-object v4, v8

    .line 61
    move-wide/from16 v29, v13

    .line 62
    .line 63
    move-object/from16 v13, v28

    .line 64
    .line 65
    const/4 v14, 0x3

    .line 66
    move-wide/from16 v31, v6

    .line 67
    .line 68
    move v6, v10

    .line 69
    move-wide v7, v11

    .line 70
    move-wide/from16 v9, v29

    .line 71
    .line 72
    move-wide/from16 v11, v31

    .line 73
    .line 74
    goto/16 :goto_18

    .line 75
    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object/from16 v20, v2

    .line 78
    .line 79
    goto/16 :goto_1a

    .line 80
    .line 81
    :cond_0
    const/16 v19, 0x0

    .line 82
    .line 83
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 84
    .line 85
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v19

    .line 89
    :cond_1
    const/16 v19, 0x0

    .line 90
    .line 91
    iget v0, v1, La/z07;->r:I

    .line 92
    .line 93
    iget v4, v1, La/z07;->q:I

    .line 94
    .line 95
    iget v5, v1, La/z07;->p:I

    .line 96
    .line 97
    iget-wide v6, v1, La/z07;->o:J

    .line 98
    .line 99
    iget-wide v8, v1, La/z07;->n:J

    .line 100
    .line 101
    iget-wide v10, v1, La/z07;->m:J

    .line 102
    .line 103
    iget-object v12, v1, La/z07;->l:Ljava/lang/Throwable;

    .line 104
    .line 105
    iget-object v13, v1, La/z07;->k:La/z07;

    .line 106
    .line 107
    iget-object v14, v1, La/z07;->j:La/a17;

    .line 108
    .line 109
    iget-object v15, v1, La/z07;->i:La/mro;

    .line 110
    .line 111
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    .line 113
    .line 114
    move/from16 v20, v5

    .line 115
    .line 116
    move v5, v4

    .line 117
    move-object v4, v14

    .line 118
    move-object v14, v12

    .line 119
    move-wide v11, v10

    .line 120
    move-wide v9, v8

    .line 121
    move-wide v7, v6

    .line 122
    move/from16 v6, v20

    .line 123
    .line 124
    move-object/from16 v20, v2

    .line 125
    .line 126
    move-object v2, v3

    .line 127
    goto/16 :goto_14

    .line 128
    .line 129
    :cond_2
    const/16 v19, 0x0

    .line 130
    .line 131
    iget v4, v1, La/z07;->q:I

    .line 132
    .line 133
    iget v5, v1, La/z07;->p:I

    .line 134
    .line 135
    iget-wide v6, v1, La/z07;->o:J

    .line 136
    .line 137
    iget-wide v8, v1, La/z07;->n:J

    .line 138
    .line 139
    iget-wide v10, v1, La/z07;->m:J

    .line 140
    .line 141
    iget-object v12, v1, La/z07;->l:Ljava/lang/Throwable;

    .line 142
    .line 143
    iget-object v13, v1, La/z07;->k:La/z07;

    .line 144
    .line 145
    iget-object v14, v1, La/z07;->j:La/a17;

    .line 146
    .line 147
    iget-object v15, v1, La/z07;->i:La/mro;

    .line 148
    .line 149
    :try_start_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 150
    .line 151
    .line 152
    move-object/from16 v0, p1

    .line 153
    .line 154
    move-object/from16 v20, v2

    .line 155
    .line 156
    move-object v2, v3

    .line 157
    const/4 v3, 0x1

    .line 158
    goto/16 :goto_c

    .line 159
    .line 160
    :catchall_1
    move-exception v0

    .line 161
    move-object/from16 v20, v14

    .line 162
    .line 163
    move-object v14, v0

    .line 164
    move-object v0, v12

    .line 165
    move-wide v11, v10

    .line 166
    move-wide v9, v8

    .line 167
    move-wide v7, v6

    .line 168
    move v6, v5

    .line 169
    move v5, v4

    .line 170
    move-object/from16 v4, v20

    .line 171
    .line 172
    move-object/from16 v20, v2

    .line 173
    .line 174
    move-object v2, v3

    .line 175
    const/4 v3, 0x1

    .line 176
    goto/16 :goto_11

    .line 177
    .line 178
    :cond_3
    const/16 v19, 0x0

    .line 179
    .line 180
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-object v4, v1, La/z07;->u:Ljava/util/List;

    .line 184
    .line 185
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    check-cast v5, La/xvm0;

    .line 190
    .line 191
    invoke-interface {v5}, La/xvm0;->a()J

    .line 192
    .line 193
    .line 194
    move-result-wide v9

    .line 195
    iget-object v5, v0, La/a17;->c:La/kuy;

    .line 196
    .line 197
    invoke-virtual {v5}, La/kuy;->a()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    iget-object v6, v0, La/a17;->b:La/knf0;

    .line 202
    .line 203
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    iget-object v6, v1, La/z07;->y:Ljava/util/List;

    .line 207
    .line 208
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    new-instance v7, La/cro;

    .line 212
    .line 213
    iget-wide v11, v1, La/z07;->v:J

    .line 214
    .line 215
    invoke-direct {v7, v11, v12}, La/cro;-><init>(J)V

    .line 216
    .line 217
    .line 218
    invoke-static {v7}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v14

    .line 222
    iget-boolean v7, v1, La/z07;->w:Z

    .line 223
    .line 224
    if-eqz v7, :cond_4

    .line 225
    .line 226
    sget-object v7, La/uoy;->b:La/tqt;

    .line 227
    .line 228
    move-wide v7, v11

    .line 229
    const/4 v11, 0x1

    .line 230
    goto :goto_0

    .line 231
    :cond_4
    sget-object v7, La/uoy;->b:La/tqt;

    .line 232
    .line 233
    move-wide v7, v11

    .line 234
    const/4 v11, 0x3

    .line 235
    :goto_0
    new-instance v12, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    if-eqz v13, :cond_e

    .line 249
    .line 250
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    check-cast v13, La/qu6;

    .line 255
    .line 256
    move-object/from16 p1, v6

    .line 257
    .line 258
    move-wide/from16 v20, v7

    .line 259
    .line 260
    iget-wide v6, v13, La/qu6;->c:J

    .line 261
    .line 262
    cmp-long v6, v6, v9

    .line 263
    .line 264
    if-nez v6, :cond_7

    .line 265
    .line 266
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    if-eqz v7, :cond_6

    .line 275
    .line 276
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    move-object v8, v7

    .line 281
    check-cast v8, La/xvm0;

    .line 282
    .line 283
    invoke-interface {v8}, La/xvm0;->getId()J

    .line 284
    .line 285
    .line 286
    move-result-wide v22

    .line 287
    move-object v8, v6

    .line 288
    move-object v15, v7

    .line 289
    iget-wide v6, v13, La/qu6;->b:J

    .line 290
    .line 291
    cmp-long v6, v22, v6

    .line 292
    .line 293
    if-nez v6, :cond_5

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_5
    move-object v6, v8

    .line 297
    goto :goto_2

    .line 298
    :cond_6
    move-object/from16 v15, v19

    .line 299
    .line 300
    :goto_3
    check-cast v15, La/xvm0;

    .line 301
    .line 302
    if-nez v15, :cond_8

    .line 303
    .line 304
    :cond_7
    :goto_4
    move-object/from16 v6, v19

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_8
    instance-of v6, v15, La/rvm0;

    .line 308
    .line 309
    if-eqz v6, :cond_9

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_9
    instance-of v6, v15, La/svm0;

    .line 313
    .line 314
    if-eqz v6, :cond_a

    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_a
    instance-of v6, v15, La/tvm0;

    .line 318
    .line 319
    if-eqz v6, :cond_b

    .line 320
    .line 321
    check-cast v15, La/tvm0;

    .line 322
    .line 323
    iget v6, v15, La/tvm0;->c:I

    .line 324
    .line 325
    new-instance v22, La/iro;

    .line 326
    .line 327
    iget-wide v7, v13, La/qu6;->b:J

    .line 328
    .line 329
    move/from16 v23, v6

    .line 330
    .line 331
    move-wide/from16 v24, v7

    .line 332
    .line 333
    iget-wide v6, v13, La/qu6;->x:J

    .line 334
    .line 335
    move-wide/from16 v26, v6

    .line 336
    .line 337
    invoke-direct/range {v22 .. v27}, La/iro;-><init>(IJJ)V

    .line 338
    .line 339
    .line 340
    :goto_5
    move-object/from16 v6, v22

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_b
    instance-of v6, v15, La/wvm0;

    .line 344
    .line 345
    if-eqz v6, :cond_c

    .line 346
    .line 347
    check-cast v15, La/wvm0;

    .line 348
    .line 349
    invoke-interface {v15}, La/wvm0;->b()I

    .line 350
    .line 351
    .line 352
    move-result v23

    .line 353
    new-instance v22, La/iro;

    .line 354
    .line 355
    iget-wide v6, v13, La/qu6;->b:J

    .line 356
    .line 357
    move-wide/from16 v24, v6

    .line 358
    .line 359
    iget-wide v6, v13, La/qu6;->x:J

    .line 360
    .line 361
    move-wide/from16 v26, v6

    .line 362
    .line 363
    invoke-direct/range {v22 .. v27}, La/iro;-><init>(IJJ)V

    .line 364
    .line 365
    .line 366
    goto :goto_5

    .line 367
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 368
    .line 369
    .line 370
    return-object v19

    .line 371
    :goto_6
    if-eqz v6, :cond_d

    .line 372
    .line 373
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    :cond_d
    move-object/from16 v6, p1

    .line 377
    .line 378
    move-wide/from16 v7, v20

    .line 379
    .line 380
    goto/16 :goto_1

    .line 381
    .line 382
    :cond_e
    move-wide/from16 v20, v7

    .line 383
    .line 384
    new-instance v13, Ljava/util/ArrayList;

    .line 385
    .line 386
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v6

    .line 397
    if-eqz v6, :cond_14

    .line 398
    .line 399
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    check-cast v6, La/xvm0;

    .line 404
    .line 405
    if-eqz v6, :cond_13

    .line 406
    .line 407
    instance-of v7, v6, La/rvm0;

    .line 408
    .line 409
    if-eqz v7, :cond_f

    .line 410
    .line 411
    :goto_8
    move-wide/from16 v22, v9

    .line 412
    .line 413
    move-object/from16 v7, v19

    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_f
    instance-of v7, v6, La/svm0;

    .line 417
    .line 418
    if-eqz v7, :cond_10

    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_10
    instance-of v7, v6, La/tvm0;

    .line 422
    .line 423
    if-eqz v7, :cond_11

    .line 424
    .line 425
    new-instance v7, La/lro;

    .line 426
    .line 427
    check-cast v6, La/tvm0;

    .line 428
    .line 429
    move-wide/from16 v22, v9

    .line 430
    .line 431
    iget-wide v8, v6, La/tvm0;->a:J

    .line 432
    .line 433
    iget v6, v6, La/tvm0;->c:I

    .line 434
    .line 435
    invoke-direct {v7, v8, v9, v6}, La/lro;-><init>(JI)V

    .line 436
    .line 437
    .line 438
    goto :goto_9

    .line 439
    :cond_11
    move-wide/from16 v22, v9

    .line 440
    .line 441
    instance-of v7, v6, La/wvm0;

    .line 442
    .line 443
    if-eqz v7, :cond_13

    .line 444
    .line 445
    new-instance v7, La/lro;

    .line 446
    .line 447
    check-cast v6, La/wvm0;

    .line 448
    .line 449
    invoke-interface {v6}, La/xvm0;->getId()J

    .line 450
    .line 451
    .line 452
    move-result-wide v8

    .line 453
    invoke-interface {v6}, La/wvm0;->b()I

    .line 454
    .line 455
    .line 456
    move-result v6

    .line 457
    invoke-direct {v7, v8, v9, v6}, La/lro;-><init>(JI)V

    .line 458
    .line 459
    .line 460
    :goto_9
    if-eqz v7, :cond_12

    .line 461
    .line 462
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    :cond_12
    move-wide/from16 v9, v22

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 469
    .line 470
    .line 471
    return-object v19

    .line 472
    :cond_14
    move-wide/from16 v22, v9

    .line 473
    .line 474
    new-instance v6, La/fro;

    .line 475
    .line 476
    move-wide/from16 v7, v20

    .line 477
    .line 478
    invoke-direct/range {v6 .. v13}, La/fro;-><init>(JJILjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 479
    .line 480
    .line 481
    invoke-static {v6}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    new-instance v6, La/mro;

    .line 486
    .line 487
    invoke-direct {v6, v5, v14, v4}, La/mro;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 488
    .line 489
    .line 490
    :try_start_3
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 491
    .line 492
    sget-wide v4, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 493
    .line 494
    const-wide/16 v7, 0x3

    .line 495
    .line 496
    move-object v13, v1

    .line 497
    move-object v15, v6

    .line 498
    move-wide v9, v7

    .line 499
    move-object/from16 v14, v19

    .line 500
    .line 501
    move-wide/from16 v11, v22

    .line 502
    .line 503
    const/4 v6, 0x0

    .line 504
    move-wide v7, v4

    .line 505
    const/4 v5, 0x0

    .line 506
    move-object v4, v0

    .line 507
    const/4 v0, 0x1

    .line 508
    :goto_a
    if-eqz v0, :cond_22

    .line 509
    .line 510
    move-object/from16 v20, v2

    .line 511
    .line 512
    :try_start_4
    iget-object v2, v4, La/a17;->a:La/r7v;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 513
    .line 514
    move-object/from16 v21, v3

    .line 515
    .line 516
    move-object/from16 v3, v19

    .line 517
    .line 518
    :try_start_5
    iput-object v3, v1, La/z07;->t:Ljava/lang/Object;

    .line 519
    .line 520
    iput-object v15, v1, La/z07;->i:La/mro;

    .line 521
    .line 522
    iput-object v4, v1, La/z07;->j:La/a17;

    .line 523
    .line 524
    iput-object v13, v1, La/z07;->k:La/z07;

    .line 525
    .line 526
    iput-object v14, v1, La/z07;->l:Ljava/lang/Throwable;

    .line 527
    .line 528
    iput-wide v11, v1, La/z07;->m:J

    .line 529
    .line 530
    iput-wide v9, v1, La/z07;->n:J

    .line 531
    .line 532
    iput-wide v7, v1, La/z07;->o:J

    .line 533
    .line 534
    iput v6, v1, La/z07;->p:I

    .line 535
    .line 536
    iput v5, v1, La/z07;->q:I

    .line 537
    .line 538
    iput v0, v1, La/z07;->r:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 539
    .line 540
    const/4 v3, 0x1

    .line 541
    :try_start_6
    iput-byte v3, v1, La/z07;->s:B

    .line 542
    .line 543
    iget-object v0, v2, La/r7v;->a:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v0, La/zm;

    .line 546
    .line 547
    invoke-virtual {v0}, La/zm;->invoke()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    check-cast v0, La/s07;

    .line 552
    .line 553
    invoke-interface {v0, v15, v1}, La/s07;->a(La/mro;La/yje;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 557
    move-object/from16 v2, v21

    .line 558
    .line 559
    if-ne v0, v2, :cond_15

    .line 560
    .line 561
    :goto_b
    move-object v1, v2

    .line 562
    goto/16 :goto_17

    .line 563
    .line 564
    :cond_15
    move-object/from16 v28, v14

    .line 565
    .line 566
    move-object v14, v4

    .line 567
    move v4, v5

    .line 568
    move v5, v6

    .line 569
    move-wide v6, v7

    .line 570
    move-wide v8, v9

    .line 571
    move-wide v10, v11

    .line 572
    move-object/from16 v12, v28

    .line 573
    .line 574
    :goto_c
    :try_start_7
    check-cast v0, La/dx5;

    .line 575
    .line 576
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    check-cast v0, La/w07;

    .line 581
    .line 582
    iget-object v0, v0, La/w07;->e:Ljava/util/List;

    .line 583
    .line 584
    if-nez v0, :cond_16

    .line 585
    .line 586
    sget-object v0, La/iun;->a:La/iun;

    .line 587
    .line 588
    goto :goto_d

    .line 589
    :catchall_2
    move-exception v0

    .line 590
    move-object/from16 v28, v14

    .line 591
    .line 592
    move-object v14, v0

    .line 593
    move-object v0, v12

    .line 594
    move-wide v11, v10

    .line 595
    move-wide v9, v8

    .line 596
    move-wide v7, v6

    .line 597
    move v6, v5

    .line 598
    move v5, v4

    .line 599
    move-object/from16 v4, v28

    .line 600
    .line 601
    goto :goto_11

    .line 602
    :cond_16
    :goto_d
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 607
    .line 608
    .line 609
    move-result v18

    .line 610
    if-eqz v18, :cond_18

    .line 611
    .line 612
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v18

    .line 616
    check-cast v18, La/g17;

    .line 617
    .line 618
    invoke-static/range {v18 .. v18}, La/aad;->f0(La/g17;)La/ycs;

    .line 619
    .line 620
    .line 621
    move-result-object v18
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 622
    if-eqz v18, :cond_17

    .line 623
    .line 624
    move-object/from16 v9, v18

    .line 625
    .line 626
    goto :goto_e

    .line 627
    :cond_18
    const/4 v9, 0x0

    .line 628
    :goto_e
    :try_start_8
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 629
    .line 630
    goto/16 :goto_1b

    .line 631
    .line 632
    :catchall_3
    move-exception v0

    .line 633
    goto/16 :goto_1a

    .line 634
    .line 635
    :goto_f
    move-object/from16 v28, v14

    .line 636
    .line 637
    move-object v14, v0

    .line 638
    move-object/from16 v0, v28

    .line 639
    .line 640
    goto :goto_11

    .line 641
    :catchall_4
    move-exception v0

    .line 642
    move-object/from16 v2, v21

    .line 643
    .line 644
    goto :goto_f

    .line 645
    :catchall_5
    move-exception v0

    .line 646
    move-object/from16 v2, v21

    .line 647
    .line 648
    :goto_10
    const/4 v3, 0x1

    .line 649
    goto :goto_f

    .line 650
    :catchall_6
    move-exception v0

    .line 651
    move-object v2, v3

    .line 652
    goto :goto_10

    .line 653
    :goto_11
    invoke-static {v14}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 654
    .line 655
    .line 656
    move-result v18

    .line 657
    if-eqz v18, :cond_1d

    .line 658
    .line 659
    if-nez v6, :cond_19

    .line 660
    .line 661
    new-instance v0, La/el50;

    .line 662
    .line 663
    invoke-direct {v0, v14}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 664
    .line 665
    .line 666
    move-object v14, v0

    .line 667
    move-object v3, v2

    .line 668
    move-object/from16 v2, v20

    .line 669
    .line 670
    const/4 v0, 0x0

    .line 671
    :goto_12
    const/16 v19, 0x0

    .line 672
    .line 673
    goto/16 :goto_a

    .line 674
    .line 675
    :cond_19
    move-object/from16 v21, v4

    .line 676
    .line 677
    int-to-long v3, v5

    .line 678
    cmp-long v3, v3, v9

    .line 679
    .line 680
    if-gez v3, :cond_1a

    .line 681
    .line 682
    const/4 v3, 0x1

    .line 683
    goto :goto_13

    .line 684
    :cond_1a
    const/4 v3, 0x0

    .line 685
    :goto_13
    add-int/lit8 v5, v5, 0x1

    .line 686
    .line 687
    if-eqz v3, :cond_1c

    .line 688
    .line 689
    const/4 v4, 0x0

    .line 690
    iput-object v4, v1, La/z07;->t:Ljava/lang/Object;

    .line 691
    .line 692
    iput-object v15, v1, La/z07;->i:La/mro;

    .line 693
    .line 694
    move-object/from16 v4, v21

    .line 695
    .line 696
    iput-object v4, v1, La/z07;->j:La/a17;

    .line 697
    .line 698
    iput-object v13, v1, La/z07;->k:La/z07;

    .line 699
    .line 700
    iput-object v0, v1, La/z07;->l:Ljava/lang/Throwable;

    .line 701
    .line 702
    iput-wide v11, v1, La/z07;->m:J

    .line 703
    .line 704
    iput-wide v9, v1, La/z07;->n:J

    .line 705
    .line 706
    iput-wide v7, v1, La/z07;->o:J

    .line 707
    .line 708
    iput v6, v1, La/z07;->p:I

    .line 709
    .line 710
    iput v5, v1, La/z07;->q:I

    .line 711
    .line 712
    iput v3, v1, La/z07;->r:I

    .line 713
    .line 714
    const/4 v14, 0x2

    .line 715
    iput-byte v14, v1, La/z07;->s:B

    .line 716
    .line 717
    invoke-static {v7, v8, v13}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v14

    .line 721
    if-ne v14, v2, :cond_1b

    .line 722
    .line 723
    goto/16 :goto_b

    .line 724
    .line 725
    :cond_1b
    move-object v14, v0

    .line 726
    move v0, v3

    .line 727
    :goto_14
    move-object v3, v2

    .line 728
    move-object/from16 v2, v20

    .line 729
    .line 730
    goto :goto_12

    .line 731
    :cond_1c
    move-object/from16 v4, v21

    .line 732
    .line 733
    const/16 v17, 0x2

    .line 734
    .line 735
    new-instance v0, La/el50;

    .line 736
    .line 737
    invoke-direct {v0, v14}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 738
    .line 739
    .line 740
    move-object v14, v0

    .line 741
    move v0, v3

    .line 742
    const/16 v19, 0x0

    .line 743
    .line 744
    move-object v3, v2

    .line 745
    :goto_15
    move-object/from16 v2, v20

    .line 746
    .line 747
    goto/16 :goto_a

    .line 748
    .line 749
    :cond_1d
    const/16 v17, 0x2

    .line 750
    .line 751
    invoke-static {v14}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 752
    .line 753
    .line 754
    move-result v3

    .line 755
    if-eqz v3, :cond_21

    .line 756
    .line 757
    move-object/from16 v21, v2

    .line 758
    .line 759
    int-to-long v2, v5

    .line 760
    cmp-long v2, v2, v9

    .line 761
    .line 762
    if-gez v2, :cond_1e

    .line 763
    .line 764
    const/4 v2, 0x1

    .line 765
    goto :goto_16

    .line 766
    :cond_1e
    const/4 v2, 0x0

    .line 767
    :goto_16
    add-int/lit8 v5, v5, 0x1

    .line 768
    .line 769
    if-eqz v2, :cond_20

    .line 770
    .line 771
    const/4 v3, 0x0

    .line 772
    iput-object v3, v1, La/z07;->t:Ljava/lang/Object;

    .line 773
    .line 774
    iput-object v15, v1, La/z07;->i:La/mro;

    .line 775
    .line 776
    iput-object v4, v1, La/z07;->j:La/a17;

    .line 777
    .line 778
    iput-object v13, v1, La/z07;->k:La/z07;

    .line 779
    .line 780
    iput-object v0, v1, La/z07;->l:Ljava/lang/Throwable;

    .line 781
    .line 782
    iput-wide v11, v1, La/z07;->m:J

    .line 783
    .line 784
    iput-wide v9, v1, La/z07;->n:J

    .line 785
    .line 786
    iput-wide v7, v1, La/z07;->o:J

    .line 787
    .line 788
    iput v6, v1, La/z07;->p:I

    .line 789
    .line 790
    iput v5, v1, La/z07;->q:I

    .line 791
    .line 792
    iput v2, v1, La/z07;->r:I

    .line 793
    .line 794
    const/4 v14, 0x3

    .line 795
    iput-byte v14, v1, La/z07;->s:B

    .line 796
    .line 797
    invoke-static {v7, v8, v13}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    move-object/from16 v1, v21

    .line 802
    .line 803
    if-ne v3, v1, :cond_1f

    .line 804
    .line 805
    :goto_17
    return-object v1

    .line 806
    :cond_1f
    move-object/from16 v28, v15

    .line 807
    .line 808
    move-object v15, v0

    .line 809
    move v0, v2

    .line 810
    move-object/from16 v2, v28

    .line 811
    .line 812
    :goto_18
    move-object v3, v1

    .line 813
    move-object v14, v15

    .line 814
    const/16 v19, 0x0

    .line 815
    .line 816
    move-object/from16 v1, p0

    .line 817
    .line 818
    move-object v15, v2

    .line 819
    goto :goto_15

    .line 820
    :cond_20
    move-object/from16 v1, v21

    .line 821
    .line 822
    const/16 v16, 0x3

    .line 823
    .line 824
    new-instance v0, La/dag0;

    .line 825
    .line 826
    invoke-direct {v0, v14}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 827
    .line 828
    .line 829
    move-object v14, v0

    .line 830
    move-object v3, v1

    .line 831
    move v0, v2

    .line 832
    move-object/from16 v2, v20

    .line 833
    .line 834
    :goto_19
    const/16 v19, 0x0

    .line 835
    .line 836
    move-object/from16 v1, p0

    .line 837
    .line 838
    goto/16 :goto_a

    .line 839
    .line 840
    :cond_21
    move-object v1, v2

    .line 841
    const/16 v16, 0x3

    .line 842
    .line 843
    invoke-static {v14}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 844
    .line 845
    .line 846
    move-object v3, v1

    .line 847
    move-object/from16 v2, v20

    .line 848
    .line 849
    const/4 v0, 0x0

    .line 850
    goto :goto_19

    .line 851
    :cond_22
    move-object/from16 v20, v2

    .line 852
    .line 853
    if-nez v14, :cond_23

    .line 854
    .line 855
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 856
    .line 857
    const-string v1, "Unexpected error"

    .line 858
    .line 859
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    throw v0

    .line 863
    :cond_23
    throw v14
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 864
    :goto_1a
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 865
    .line 866
    new-instance v9, La/g0g0;

    .line 867
    .line 868
    invoke-direct {v9, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 869
    .line 870
    .line 871
    :goto_1b
    instance-of v0, v9, La/g0g0;

    .line 872
    .line 873
    if-nez v0, :cond_26

    .line 874
    .line 875
    move-object v0, v9

    .line 876
    check-cast v0, La/ycs;

    .line 877
    .line 878
    if-eqz v0, :cond_25

    .line 879
    .line 880
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    move-object/from16 v1, v20

    .line 884
    .line 885
    iget-object v2, v1, La/x07;->a:La/p7m0;

    .line 886
    .line 887
    :cond_24
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 888
    .line 889
    .line 890
    move-result-object v3

    .line 891
    move-object v4, v3

    .line 892
    check-cast v4, La/ycs;

    .line 893
    .line 894
    invoke-virtual {v2, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    move-result v3

    .line 898
    if-eqz v3, :cond_24

    .line 899
    .line 900
    goto :goto_1c

    .line 901
    :cond_25
    move-object/from16 v1, v20

    .line 902
    .line 903
    invoke-virtual {v1}, La/x07;->a()V

    .line 904
    .line 905
    .line 906
    goto :goto_1c

    .line 907
    :cond_26
    move-object/from16 v1, v20

    .line 908
    .line 909
    :goto_1c
    invoke-static {v9}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    if-eqz v0, :cond_27

    .line 914
    .line 915
    invoke-virtual {v1}, La/x07;->a()V

    .line 916
    .line 917
    .line 918
    :cond_27
    new-instance v0, La/j0g0;

    .line 919
    .line 920
    invoke-direct {v0, v9}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 921
    .line 922
    .line 923
    return-object v0
.end method
