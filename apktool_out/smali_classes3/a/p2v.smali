.class public final La/p2v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/ieu;

.field public j:Ljava/lang/Long;

.field public k:Ljava/lang/Long;

.field public l:La/edu;

.field public m:I

.field public n:I

.field public o:J

.field public p:J

.field public q:B

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/ieu;

.field public final synthetic t:J

.field public final synthetic u:Ljava/lang/Long;


# direct methods
.method public constructor <init>(La/ieu;JLjava/lang/Long;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/p2v;->s:La/ieu;

    .line 2
    .line 3
    iput-wide p2, p0, La/p2v;->t:J

    .line 4
    .line 5
    iput-object p4, p0, La/p2v;->u:Ljava/lang/Long;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/p2v;

    .line 2
    .line 3
    iget-wide v2, p0, La/p2v;->t:J

    .line 4
    .line 5
    iget-object v4, p0, La/p2v;->u:Ljava/lang/Long;

    .line 6
    .line 7
    iget-object v1, p0, La/p2v;->s:La/ieu;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/p2v;-><init>(La/ieu;JLjava/lang/Long;La/yje;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, La/p2v;->r:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/xe60;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/p2v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/p2v;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/p2v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-object v0, v7, La/p2v;->r:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, La/xe60;

    .line 7
    .line 8
    sget-object v8, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, v7, La/p2v;->q:B

    .line 11
    .line 12
    const/4 v9, 0x2

    .line 13
    const/4 v10, 0x3

    .line 14
    const/4 v12, 0x1

    .line 15
    const/4 v13, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    if-eq v0, v12, :cond_2

    .line 19
    .line 20
    if-eq v0, v9, :cond_1

    .line 21
    .line 22
    if-ne v0, v10, :cond_0

    .line 23
    .line 24
    iget v0, v7, La/p2v;->n:I

    .line 25
    .line 26
    iget-wide v2, v7, La/p2v;->o:J

    .line 27
    .line 28
    iget v4, v7, La/p2v;->m:I

    .line 29
    .line 30
    iget-object v5, v7, La/p2v;->j:Ljava/lang/Long;

    .line 31
    .line 32
    iget-object v6, v7, La/p2v;->i:La/ieu;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-wide/from16 v21, v2

    .line 38
    .line 39
    move-object v2, v1

    .line 40
    move-object v1, v6

    .line 41
    move v6, v4

    .line 42
    move-wide/from16 v3, v21

    .line 43
    .line 44
    move-object v15, v13

    .line 45
    move v13, v9

    .line 46
    move-object v9, v15

    .line 47
    move-object v15, v5

    .line 48
    move/from16 v17, v12

    .line 49
    .line 50
    move v5, v0

    .line 51
    goto/16 :goto_b

    .line 52
    .line 53
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v13

    .line 59
    :cond_1
    iget v2, v7, La/p2v;->n:I

    .line 60
    .line 61
    iget-wide v3, v7, La/p2v;->o:J

    .line 62
    .line 63
    iget v5, v7, La/p2v;->m:I

    .line 64
    .line 65
    iget-object v6, v7, La/p2v;->j:Ljava/lang/Long;

    .line 66
    .line 67
    iget-object v14, v7, La/p2v;->i:La/ieu;

    .line 68
    .line 69
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    move-object/from16 v0, p1

    .line 73
    .line 74
    move v13, v9

    .line 75
    move/from16 v17, v12

    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :catchall_0
    move-exception v0

    .line 80
    move v15, v5

    .line 81
    move-object v5, v6

    .line 82
    move v13, v9

    .line 83
    move/from16 v17, v12

    .line 84
    .line 85
    :goto_0
    move-object v6, v14

    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :cond_2
    iget-wide v2, v7, La/p2v;->p:J

    .line 89
    .line 90
    iget v4, v7, La/p2v;->n:I

    .line 91
    .line 92
    iget-wide v5, v7, La/p2v;->o:J

    .line 93
    .line 94
    iget v14, v7, La/p2v;->m:I

    .line 95
    .line 96
    iget-object v0, v7, La/p2v;->l:La/edu;

    .line 97
    .line 98
    iget-object v15, v7, La/p2v;->k:Ljava/lang/Long;

    .line 99
    .line 100
    iget-object v11, v7, La/p2v;->j:Ljava/lang/Long;

    .line 101
    .line 102
    iget-object v10, v7, La/p2v;->i:La/ieu;

    .line 103
    .line 104
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    move-object/from16 v16, v15

    .line 108
    .line 109
    move v15, v14

    .line 110
    move v14, v4

    .line 111
    move-object/from16 v21, v10

    .line 112
    .line 113
    move-object/from16 v10, p1

    .line 114
    .line 115
    move-object/from16 v22, v11

    .line 116
    .line 117
    move-object v11, v1

    .line 118
    move-wide v1, v2

    .line 119
    move-wide v3, v5

    .line 120
    move-object/from16 v6, v21

    .line 121
    .line 122
    move-object/from16 v5, v22

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    move v2, v4

    .line 127
    move-wide v3, v5

    .line 128
    move v13, v9

    .line 129
    move-object v6, v10

    .line 130
    move-object v5, v11

    .line 131
    move/from16 v17, v12

    .line 132
    .line 133
    move v15, v14

    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, v7, La/p2v;->s:La/ieu;

    .line 140
    .line 141
    iget-wide v2, v7, La/p2v;->t:J

    .line 142
    .line 143
    iget-object v4, v7, La/p2v;->u:Ljava/lang/Long;

    .line 144
    .line 145
    move-object v15, v4

    .line 146
    const/4 v5, 0x0

    .line 147
    const/4 v6, 0x0

    .line 148
    move-wide v3, v2

    .line 149
    move-object v2, v1

    .line 150
    move-object v1, v0

    .line 151
    :goto_1
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 152
    .line 153
    iget-object v0, v1, La/ieu;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, La/edu;

    .line 156
    .line 157
    iget-object v10, v1, La/ieu;->c:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v10, La/x0u;

    .line 160
    .line 161
    iput-object v2, v7, La/p2v;->r:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v1, v7, La/p2v;->i:La/ieu;

    .line 164
    .line 165
    iput-object v15, v7, La/p2v;->j:Ljava/lang/Long;

    .line 166
    .line 167
    iput-object v15, v7, La/p2v;->k:Ljava/lang/Long;

    .line 168
    .line 169
    iput-object v0, v7, La/p2v;->l:La/edu;

    .line 170
    .line 171
    iput v6, v7, La/p2v;->m:I

    .line 172
    .line 173
    iput-wide v3, v7, La/p2v;->o:J

    .line 174
    .line 175
    iput v5, v7, La/p2v;->n:I

    .line 176
    .line 177
    iput-wide v3, v7, La/p2v;->p:J

    .line 178
    .line 179
    iput-byte v12, v7, La/p2v;->q:B

    .line 180
    .line 181
    invoke-virtual {v10, v7}, La/x0u;->c(La/yje;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    .line 185
    if-ne v10, v8, :cond_4

    .line 186
    .line 187
    goto/16 :goto_a

    .line 188
    .line 189
    :cond_4
    move-object v11, v2

    .line 190
    move v14, v5

    .line 191
    move-object v5, v15

    .line 192
    move-object/from16 v16, v5

    .line 193
    .line 194
    move v15, v6

    .line 195
    move-object v6, v1

    .line 196
    move-wide v1, v3

    .line 197
    :goto_2
    :try_start_3
    check-cast v10, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 203
    move/from16 v17, v12

    .line 204
    .line 205
    :try_start_4
    iget v12, v11, La/xe60;->a:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 206
    .line 207
    :try_start_5
    iget v9, v11, La/xe60;->b:I

    .line 208
    .line 209
    sget-object v18, La/k9s0;->a:[La/k9s0;

    .line 210
    .line 211
    iput-object v11, v7, La/p2v;->r:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v6, v7, La/p2v;->i:La/ieu;

    .line 214
    .line 215
    iput-object v5, v7, La/p2v;->j:Ljava/lang/Long;

    .line 216
    .line 217
    iput-object v13, v7, La/p2v;->k:Ljava/lang/Long;

    .line 218
    .line 219
    iput-object v13, v7, La/p2v;->l:La/edu;

    .line 220
    .line 221
    iput v15, v7, La/p2v;->m:I

    .line 222
    .line 223
    iput-wide v3, v7, La/p2v;->o:J

    .line 224
    .line 225
    iput v14, v7, La/p2v;->n:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 226
    .line 227
    const/4 v13, 0x2

    .line 228
    :try_start_6
    iput-byte v13, v7, La/p2v;->q:B
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 229
    .line 230
    move-wide/from16 v19, v3

    .line 231
    .line 232
    move v4, v10

    .line 233
    move-object/from16 v3, v16

    .line 234
    .line 235
    move-object v10, v6

    .line 236
    move v6, v9

    .line 237
    move-object v9, v5

    .line 238
    move v5, v12

    .line 239
    :try_start_7
    invoke-virtual/range {v0 .. v7}, La/edu;->l(JLjava/lang/Long;IIILa/zje;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 243
    if-ne v0, v8, :cond_5

    .line 244
    .line 245
    goto/16 :goto_a

    .line 246
    .line 247
    :cond_5
    move-object v6, v9

    .line 248
    move-object v1, v11

    .line 249
    move v2, v14

    .line 250
    move v5, v15

    .line 251
    move-wide/from16 v3, v19

    .line 252
    .line 253
    move-object v14, v10

    .line 254
    :goto_3
    :try_start_8
    check-cast v0, Ljava/util/List;

    .line 255
    .line 256
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 257
    .line 258
    goto/16 :goto_d

    .line 259
    .line 260
    :catchall_2
    move-exception v0

    .line 261
    move v15, v5

    .line 262
    move-object v5, v6

    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :catchall_3
    move-exception v0

    .line 266
    move-object v5, v9

    .line 267
    move-object v6, v10

    .line 268
    move-object v1, v11

    .line 269
    move v2, v14

    .line 270
    move-wide/from16 v3, v19

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :catchall_4
    move-exception v0

    .line 274
    move-wide/from16 v19, v3

    .line 275
    .line 276
    move-object v9, v5

    .line 277
    move-object v10, v6

    .line 278
    :goto_4
    move-object v1, v11

    .line 279
    move v2, v14

    .line 280
    goto :goto_6

    .line 281
    :catchall_5
    move-exception v0

    .line 282
    move-wide/from16 v19, v3

    .line 283
    .line 284
    move-object v9, v5

    .line 285
    move-object v10, v6

    .line 286
    const/4 v13, 0x2

    .line 287
    goto :goto_4

    .line 288
    :catchall_6
    move-exception v0

    .line 289
    move-wide/from16 v19, v3

    .line 290
    .line 291
    move-object v10, v6

    .line 292
    move v13, v9

    .line 293
    :goto_5
    move-object v9, v5

    .line 294
    goto :goto_4

    .line 295
    :catchall_7
    move-exception v0

    .line 296
    move-wide/from16 v19, v3

    .line 297
    .line 298
    move-object v10, v6

    .line 299
    move v13, v9

    .line 300
    move/from16 v17, v12

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :catchall_8
    move-exception v0

    .line 304
    move v13, v9

    .line 305
    move/from16 v17, v12

    .line 306
    .line 307
    move/from16 v21, v6

    .line 308
    .line 309
    move-object v6, v1

    .line 310
    move-object v1, v2

    .line 311
    move v2, v5

    .line 312
    move-object v5, v15

    .line 313
    move/from16 v15, v21

    .line 314
    .line 315
    :goto_6
    if-eqz v15, :cond_6

    .line 316
    .line 317
    instance-of v9, v0, La/zhi0;

    .line 318
    .line 319
    if-eqz v9, :cond_6

    .line 320
    .line 321
    move-object v9, v0

    .line 322
    check-cast v9, La/zhi0;

    .line 323
    .line 324
    iget-boolean v9, v9, La/zhi0;->e:Z

    .line 325
    .line 326
    if-eqz v9, :cond_6

    .line 327
    .line 328
    move/from16 v9, v17

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_6
    const/4 v9, 0x0

    .line 332
    :goto_7
    instance-of v10, v0, Ljava/util/concurrent/CancellationException;

    .line 333
    .line 334
    if-nez v10, :cond_d

    .line 335
    .line 336
    instance-of v10, v0, Ljava/net/ConnectException;

    .line 337
    .line 338
    if-nez v10, :cond_d

    .line 339
    .line 340
    if-nez v9, :cond_d

    .line 341
    .line 342
    instance-of v9, v0, La/zhi0;

    .line 343
    .line 344
    if-eqz v9, :cond_9

    .line 345
    .line 346
    move-object v9, v0

    .line 347
    check-cast v9, La/zhi0;

    .line 348
    .line 349
    iget-boolean v10, v9, La/zhi0;->f:Z

    .line 350
    .line 351
    if-nez v10, :cond_8

    .line 352
    .line 353
    iget-boolean v9, v9, La/zhi0;->e:Z

    .line 354
    .line 355
    if-eqz v9, :cond_7

    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_7
    const/4 v9, 0x0

    .line 359
    goto :goto_9

    .line 360
    :cond_8
    :goto_8
    move/from16 v9, v17

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_9
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 364
    .line 365
    .line 366
    move-result v9

    .line 367
    if-nez v9, :cond_7

    .line 368
    .line 369
    goto :goto_8

    .line 370
    :goto_9
    add-int/lit8 v2, v2, 0x1

    .line 371
    .line 372
    const/4 v10, 0x3

    .line 373
    if-gt v2, v10, :cond_c

    .line 374
    .line 375
    if-eqz v9, :cond_a

    .line 376
    .line 377
    goto :goto_c

    .line 378
    :cond_a
    const-string v9, "error ("

    .line 379
    .line 380
    const-string v10, "): "

    .line 381
    .line 382
    invoke-static {v2, v9, v10, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    sget-object v9, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 387
    .line 388
    invoke-virtual {v9, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    iput-object v1, v7, La/p2v;->r:Ljava/lang/Object;

    .line 392
    .line 393
    iput-object v6, v7, La/p2v;->i:La/ieu;

    .line 394
    .line 395
    iput-object v5, v7, La/p2v;->j:Ljava/lang/Long;

    .line 396
    .line 397
    const/4 v9, 0x0

    .line 398
    iput-object v9, v7, La/p2v;->k:Ljava/lang/Long;

    .line 399
    .line 400
    iput-object v9, v7, La/p2v;->l:La/edu;

    .line 401
    .line 402
    iput v15, v7, La/p2v;->m:I

    .line 403
    .line 404
    iput-wide v3, v7, La/p2v;->o:J

    .line 405
    .line 406
    iput v2, v7, La/p2v;->n:I

    .line 407
    .line 408
    const/4 v10, 0x3

    .line 409
    iput-byte v10, v7, La/p2v;->q:B

    .line 410
    .line 411
    const-wide/16 v11, 0xbb8

    .line 412
    .line 413
    invoke-static {v11, v12, v7}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    if-ne v0, v8, :cond_b

    .line 418
    .line 419
    :goto_a
    return-object v8

    .line 420
    :cond_b
    move/from16 v21, v2

    .line 421
    .line 422
    move-object v2, v1

    .line 423
    move-object v1, v6

    .line 424
    move v6, v15

    .line 425
    move-object v15, v5

    .line 426
    move/from16 v5, v21

    .line 427
    .line 428
    :goto_b
    move v12, v13

    .line 429
    move-object v13, v9

    .line 430
    move v9, v12

    .line 431
    move/from16 v12, v17

    .line 432
    .line 433
    goto/16 :goto_1

    .line 434
    .line 435
    :cond_c
    :goto_c
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 436
    .line 437
    new-instance v1, La/g0g0;

    .line 438
    .line 439
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 440
    .line 441
    .line 442
    move-object v0, v1

    .line 443
    :goto_d
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    return-object v0

    .line 447
    :cond_d
    throw v0
.end method
