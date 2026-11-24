.class public final La/q0v0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public j:Ljava/util/ArrayList;

.field public k:Ljava/util/LinkedHashMap;

.field public l:B

.field public final synthetic m:La/u0v0;

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(La/u0v0;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/q0v0;->m:La/u0v0;

    .line 2
    .line 3
    iput-boolean p2, p0, La/q0v0;->n:Z

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/q0v0;

    .line 2
    .line 3
    iget-object v1, p0, La/q0v0;->m:La/u0v0;

    .line 4
    .line 5
    iget-boolean p0, p0, La/q0v0;->n:Z

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, La/q0v0;-><init>(La/u0v0;ZLa/yje;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/q0v0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/q0v0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/q0v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/q0v0;->l:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/q0v0;->m:La/u0v0;

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-eq v2, v5, :cond_1

    .line 15
    .line 16
    if-ne v2, v4, :cond_0

    .line 17
    .line 18
    iget-boolean v1, v0, La/q0v0;->i:Z

    .line 19
    .line 20
    iget-object v2, v0, La/q0v0;->k:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    iget-object v4, v0, La/q0v0;->j:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object/from16 v25, v3

    .line 28
    .line 29
    move-object/from16 v3, p1

    .line 30
    .line 31
    goto/16 :goto_a

    .line 32
    .line 33
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v3

    .line 39
    :cond_1
    iget-boolean v2, v0, La/q0v0;->i:Z

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v7, p1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v6, La/u0v0;->I:La/eqx;

    .line 51
    .line 52
    iget-object v2, v2, La/eqx;->a:La/b3c0;

    .line 53
    .line 54
    invoke-virtual {v2}, La/b3c0;->c()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iget-object v7, v6, La/u0v0;->w:La/dq00;

    .line 59
    .line 60
    iput-boolean v2, v0, La/q0v0;->i:Z

    .line 61
    .line 62
    iput-byte v5, v0, La/q0v0;->l:B

    .line 63
    .line 64
    invoke-virtual {v7, v0}, La/dq00;->e(La/zje;)Ljava/io/Serializable;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    if-ne v7, v1, :cond_3

    .line 69
    .line 70
    goto/16 :goto_9

    .line 71
    .line 72
    :cond_3
    :goto_0
    check-cast v7, Ljava/util/List;

    .line 73
    .line 74
    invoke-static {v7}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_c

    .line 87
    .line 88
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    check-cast v10, La/xe;

    .line 93
    .line 94
    iget-object v11, v10, La/xe;->b:La/ql5;

    .line 95
    .line 96
    iget-object v12, v10, La/xe;->a:La/pg;

    .line 97
    .line 98
    iget-boolean v13, v10, La/xe;->d:Z

    .line 99
    .line 100
    if-nez v11, :cond_8

    .line 101
    .line 102
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    if-eqz v10, :cond_6

    .line 107
    .line 108
    if-eq v10, v5, :cond_5

    .line 109
    .line 110
    if-eq v10, v4, :cond_4

    .line 111
    .line 112
    const/4 v10, 0x0

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    const v10, 0x7f1315c1

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    const v10, 0x7f1315c4

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    const v10, 0x7f1315be

    .line 123
    .line 124
    .line 125
    :goto_2
    if-eqz v10, :cond_7

    .line 126
    .line 127
    new-instance v11, La/zzu0;

    .line 128
    .line 129
    invoke-direct {v11, v10, v12, v3}, La/zzu0;-><init>(ILa/pg;La/jjm;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_7
    move-object/from16 v25, v3

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_8
    iget-boolean v14, v10, La/xe;->e:Z

    .line 139
    .line 140
    if-eqz v14, :cond_9

    .line 141
    .line 142
    if-eqz v13, :cond_9

    .line 143
    .line 144
    sget-object v14, La/wui0;->a:La/wui0;

    .line 145
    .line 146
    :goto_3
    move-object/from16 v20, v12

    .line 147
    .line 148
    move-object/from16 v22, v14

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_9
    if-eqz v14, :cond_a

    .line 152
    .line 153
    sget-object v14, La/wui0;->b:La/wui0;

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_a
    if-eqz v13, :cond_b

    .line 157
    .line 158
    sget-object v14, La/wui0;->d:La/wui0;

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_b
    sget-object v14, La/wui0;->c:La/wui0;

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :goto_4
    new-instance v12, La/yzu0;

    .line 165
    .line 166
    move v15, v13

    .line 167
    iget-wide v13, v11, La/ql5;->a:J

    .line 168
    .line 169
    move/from16 v16, v15

    .line 170
    .line 171
    iget-object v15, v11, La/ql5;->m:Ljava/lang/String;

    .line 172
    .line 173
    sget-object v17, La/pn40;->a:La/pn40;

    .line 174
    .line 175
    move-object/from16 v25, v3

    .line 176
    .line 177
    iget-wide v3, v11, La/ql5;->b:D

    .line 178
    .line 179
    iget-object v11, v11, La/ql5;->f:Ljava/lang/String;

    .line 180
    .line 181
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 182
    .line 183
    invoke-static {v3, v4, v11, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    iget-boolean v4, v10, La/xe;->c:Z

    .line 188
    .line 189
    iget-object v5, v10, La/xe;->b:La/ql5;

    .line 190
    .line 191
    iget-wide v10, v5, La/ql5;->e:J

    .line 192
    .line 193
    iget-object v5, v5, La/ql5;->f:Ljava/lang/String;

    .line 194
    .line 195
    xor-int/lit8 v23, v16, 0x1

    .line 196
    .line 197
    const/16 v24, 0x0

    .line 198
    .line 199
    move-object/from16 v16, v3

    .line 200
    .line 201
    move/from16 v17, v4

    .line 202
    .line 203
    move-object/from16 v21, v5

    .line 204
    .line 205
    move-wide/from16 v18, v10

    .line 206
    .line 207
    invoke-direct/range {v12 .. v24}, La/yzu0;-><init>(JLjava/lang/String;Ljava/lang/String;ZJLa/pg;Ljava/lang/String;La/wui0;ZLa/rqm;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    :goto_5
    move-object/from16 v3, v25

    .line 214
    .line 215
    const/4 v4, 0x2

    .line 216
    const/4 v5, 0x1

    .line 217
    goto/16 :goto_1

    .line 218
    .line 219
    :cond_c
    move-object/from16 v25, v3

    .line 220
    .line 221
    new-instance v3, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    :cond_d
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-eqz v5, :cond_e

    .line 235
    .line 236
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    check-cast v5, La/xe;

    .line 241
    .line 242
    iget-object v5, v5, La/xe;->b:La/ql5;

    .line 243
    .line 244
    if-eqz v5, :cond_d

    .line 245
    .line 246
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_e
    const/16 v4, 0xa

    .line 251
    .line 252
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    invoke-static {v4}, La/wp20;->a(I)I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    const/16 v5, 0x10

    .line 261
    .line 262
    if-ge v4, v5, :cond_f

    .line 263
    .line 264
    move v4, v5

    .line 265
    :cond_f
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 266
    .line 267
    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-eqz v4, :cond_10

    .line 279
    .line 280
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    move-object v9, v4

    .line 285
    check-cast v9, La/ql5;

    .line 286
    .line 287
    iget-wide v9, v9, La/ql5;->a:J

    .line 288
    .line 289
    new-instance v11, Ljava/lang/Long;

    .line 290
    .line 291
    invoke-direct {v11, v9, v10}, Ljava/lang/Long;-><init>(J)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v5, v11, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_10
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    :cond_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-eqz v4, :cond_12

    .line 307
    .line 308
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    move-object v7, v4

    .line 313
    check-cast v7, La/xe;

    .line 314
    .line 315
    iget-boolean v7, v7, La/xe;->d:Z

    .line 316
    .line 317
    if-eqz v7, :cond_11

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_12
    move-object/from16 v4, v25

    .line 321
    .line 322
    :goto_8
    check-cast v4, La/xe;

    .line 323
    .line 324
    if-eqz v4, :cond_13

    .line 325
    .line 326
    iget-object v3, v4, La/xe;->b:La/ql5;

    .line 327
    .line 328
    if-eqz v3, :cond_13

    .line 329
    .line 330
    iget-wide v3, v3, La/ql5;->e:J

    .line 331
    .line 332
    move v12, v2

    .line 333
    move-wide/from16 v19, v3

    .line 334
    .line 335
    move-object v15, v5

    .line 336
    move-object v14, v8

    .line 337
    goto :goto_b

    .line 338
    :cond_13
    iget-object v3, v6, La/u0v0;->x:La/cmt;

    .line 339
    .line 340
    iput-object v8, v0, La/q0v0;->j:Ljava/util/ArrayList;

    .line 341
    .line 342
    iput-object v5, v0, La/q0v0;->k:Ljava/util/LinkedHashMap;

    .line 343
    .line 344
    iput-boolean v2, v0, La/q0v0;->i:Z

    .line 345
    .line 346
    const/4 v4, 0x2

    .line 347
    iput-byte v4, v0, La/q0v0;->l:B

    .line 348
    .line 349
    invoke-virtual {v3, v0}, La/cmt;->d(La/zje;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    if-ne v3, v1, :cond_14

    .line 354
    .line 355
    :goto_9
    return-object v1

    .line 356
    :cond_14
    move v1, v2

    .line 357
    move-object v2, v5

    .line 358
    move-object v4, v8

    .line 359
    :goto_a
    check-cast v3, Ljava/lang/Number;

    .line 360
    .line 361
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 362
    .line 363
    .line 364
    move-result-wide v7

    .line 365
    move v12, v1

    .line 366
    move-object v15, v2

    .line 367
    move-object v14, v4

    .line 368
    move-wide/from16 v19, v7

    .line 369
    .line 370
    :goto_b
    sget v1, La/u0v0;->P:I

    .line 371
    .line 372
    iget-object v1, v6, La/i3t0;->i:La/ocj;

    .line 373
    .line 374
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 375
    .line 376
    :cond_15
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    move-object v9, v2

    .line 384
    check-cast v9, La/j0v0;

    .line 385
    .line 386
    const/16 v21, 0x0

    .line 387
    .line 388
    const/16 v22, 0x1c0

    .line 389
    .line 390
    const/4 v10, 0x0

    .line 391
    const/4 v11, 0x0

    .line 392
    iget-boolean v13, v0, La/q0v0;->n:Z

    .line 393
    .line 394
    const/16 v16, 0x0

    .line 395
    .line 396
    const/16 v17, 0x0

    .line 397
    .line 398
    const/16 v18, 0x0

    .line 399
    .line 400
    invoke-static/range {v9 .. v22}, La/j0v0;->a(La/j0v0;ZZZZLjava/util/List;Ljava/util/Map;La/ql5;La/ql5;La/ql5;JZI)La/j0v0;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-eqz v2, :cond_15

    .line 409
    .line 410
    sget-object v0, La/p0v0;->a:La/kys0;

    .line 411
    .line 412
    iget-object v1, v6, La/u0v0;->J:Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    const-string v0, "addbalance"

    .line 421
    .line 422
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    if-eqz v0, :cond_16

    .line 427
    .line 428
    sget-object v0, La/p0v0;->c:La/p0v0;

    .line 429
    .line 430
    goto :goto_c

    .line 431
    :cond_16
    sget-object v0, La/p0v0;->b:La/p0v0;

    .line 432
    .line 433
    :goto_c
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-eqz v0, :cond_18

    .line 438
    .line 439
    const/4 v2, 0x1

    .line 440
    if-ne v0, v2, :cond_17

    .line 441
    .line 442
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    check-cast v0, La/j0v0;

    .line 447
    .line 448
    iget-boolean v0, v0, La/j0v0;->c:Z

    .line 449
    .line 450
    if-eqz v0, :cond_18

    .line 451
    .line 452
    invoke-virtual {v6}, La/u0v0;->P()V

    .line 453
    .line 454
    .line 455
    goto :goto_d

    .line 456
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 457
    .line 458
    .line 459
    return-object v25

    .line 460
    :cond_18
    :goto_d
    const-string v0, ""

    .line 461
    .line 462
    iput-object v0, v6, La/u0v0;->J:Ljava/lang/String;

    .line 463
    .line 464
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 465
    .line 466
    return-object v0
.end method
