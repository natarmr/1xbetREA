.class public final La/gm0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/vne;

.field public j:La/dn0;

.field public k:La/mlr;

.field public l:La/lu0;

.field public m:I

.field public n:I

.field public o:I

.field public p:B

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La/dn0;

.field public final synthetic s:La/mlr;

.field public final synthetic t:I

.field public final synthetic u:La/lu0;


# direct methods
.method public constructor <init>(La/dn0;La/mlr;ILa/lu0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gm0;->r:La/dn0;

    .line 2
    .line 3
    iput-object p2, p0, La/gm0;->s:La/mlr;

    .line 4
    .line 5
    iput p3, p0, La/gm0;->t:I

    .line 6
    .line 7
    iput-object p4, p0, La/gm0;->u:La/lu0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/gm0;

    .line 2
    .line 3
    iget v3, p0, La/gm0;->t:I

    .line 4
    .line 5
    iget-object v4, p0, La/gm0;->u:La/lu0;

    .line 6
    .line 7
    iget-object v1, p0, La/gm0;->r:La/dn0;

    .line 8
    .line 9
    iget-object v2, p0, La/gm0;->s:La/mlr;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/gm0;-><init>(La/dn0;La/mlr;ILa/lu0;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/gm0;->q:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, La/gm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/gm0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/gm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-object v0, v6, La/gm0;->r:La/dn0;

    .line 4
    .line 5
    iget-object v7, v0, La/dn0;->c:La/xk0;

    .line 6
    .line 7
    iget-object v1, v6, La/gm0;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/vne;

    .line 10
    .line 11
    sget-object v8, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v2, v6, La/gm0;->p:B

    .line 14
    .line 15
    iget-object v9, v6, La/gm0;->s:La/mlr;

    .line 16
    .line 17
    const/4 v10, 0x2

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v13, 0x1

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    if-eq v2, v13, :cond_1

    .line 23
    .line 24
    if-ne v2, v10, :cond_0

    .line 25
    .line 26
    iget v0, v6, La/gm0;->o:I

    .line 27
    .line 28
    iget v1, v6, La/gm0;->n:I

    .line 29
    .line 30
    iget v2, v6, La/gm0;->m:I

    .line 31
    .line 32
    iget-object v3, v6, La/gm0;->l:La/lu0;

    .line 33
    .line 34
    iget-object v4, v6, La/gm0;->k:La/mlr;

    .line 35
    .line 36
    iget-object v5, v6, La/gm0;->j:La/dn0;

    .line 37
    .line 38
    iget-object v14, v6, La/gm0;->i:La/vne;

    .line 39
    .line 40
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move v15, v1

    .line 44
    move v1, v0

    .line 45
    move-object v0, v3

    .line 46
    move-object v3, v4

    .line 47
    move v4, v15

    .line 48
    move-object v15, v14

    .line 49
    move-object v14, v5

    .line 50
    move-object v5, v11

    .line 51
    goto/16 :goto_9

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
    return-object v11

    .line 59
    :cond_1
    iget v1, v6, La/gm0;->o:I

    .line 60
    .line 61
    iget v2, v6, La/gm0;->n:I

    .line 62
    .line 63
    iget v3, v6, La/gm0;->m:I

    .line 64
    .line 65
    iget-object v4, v6, La/gm0;->l:La/lu0;

    .line 66
    .line 67
    iget-object v5, v6, La/gm0;->k:La/mlr;

    .line 68
    .line 69
    iget-object v14, v6, La/gm0;->j:La/dn0;

    .line 70
    .line 71
    iget-object v15, v6, La/gm0;->i:La/vne;

    .line 72
    .line 73
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto/16 :goto_1

    .line 77
    .line 78
    :catchall_0
    move-exception v0

    .line 79
    move-object v11, v4

    .line 80
    move v4, v2

    .line 81
    move v2, v3

    .line 82
    move-object v3, v11

    .line 83
    move-object v11, v5

    .line 84
    goto/16 :goto_3

    .line 85
    .line 86
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iput-boolean v13, v7, La/xk0;->g:Z

    .line 90
    .line 91
    iget v2, v6, La/gm0;->t:I

    .line 92
    .line 93
    iget-object v3, v6, La/gm0;->u:La/lu0;

    .line 94
    .line 95
    move-object v14, v0

    .line 96
    move-object v15, v1

    .line 97
    move v4, v2

    .line 98
    move-object v5, v3

    .line 99
    move-object v3, v9

    .line 100
    const/4 v1, 0x0

    .line 101
    const/4 v2, 0x0

    .line 102
    :goto_0
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 103
    .line 104
    iget-object v0, v14, La/dn0;->a:La/xzp;

    .line 105
    .line 106
    iget-object v12, v14, La/dn0;->f:La/btt0;

    .line 107
    .line 108
    invoke-virtual {v12}, La/btt0;->a()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 112
    move-object/from16 p1, v14

    .line 113
    .line 114
    :try_start_2
    iget-wide v13, v3, La/mlr;->a:J

    .line 115
    .line 116
    iput-object v11, v6, La/gm0;->q:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v15, v6, La/gm0;->i:La/vne;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 119
    .line 120
    move-object/from16 v10, p1

    .line 121
    .line 122
    :try_start_3
    iput-object v10, v6, La/gm0;->j:La/dn0;

    .line 123
    .line 124
    iput-object v3, v6, La/gm0;->k:La/mlr;

    .line 125
    .line 126
    iput-object v5, v6, La/gm0;->l:La/lu0;

    .line 127
    .line 128
    iput v2, v6, La/gm0;->m:I

    .line 129
    .line 130
    iput v4, v6, La/gm0;->n:I

    .line 131
    .line 132
    iput v1, v6, La/gm0;->o:I

    .line 133
    .line 134
    const/4 v11, 0x1

    .line 135
    iput-byte v11, v6, La/gm0;->p:B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 136
    .line 137
    move-object v11, v3

    .line 138
    move-wide/from16 v17, v13

    .line 139
    .line 140
    move v13, v1

    .line 141
    move-object v1, v12

    .line 142
    move v12, v2

    .line 143
    move-wide/from16 v2, v17

    .line 144
    .line 145
    :try_start_4
    invoke-virtual/range {v0 .. v6}, La/xzp;->d(Ljava/lang/String;JILa/lu0;La/zje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 149
    if-ne v0, v8, :cond_3

    .line 150
    .line 151
    goto/16 :goto_8

    .line 152
    .line 153
    :cond_3
    move v2, v4

    .line 154
    move-object v4, v5

    .line 155
    move-object v14, v10

    .line 156
    move-object v5, v11

    .line 157
    move v3, v12

    .line 158
    move v1, v13

    .line 159
    :goto_1
    :try_start_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 162
    .line 163
    goto/16 :goto_b

    .line 164
    .line 165
    :catchall_1
    move-exception v0

    .line 166
    move-object v3, v5

    .line 167
    move-object v14, v10

    .line 168
    move v2, v12

    .line 169
    move v1, v13

    .line 170
    goto :goto_3

    .line 171
    :catchall_2
    move-exception v0

    .line 172
    :goto_2
    move v13, v1

    .line 173
    move v12, v2

    .line 174
    move-object v11, v3

    .line 175
    move-object v3, v5

    .line 176
    move-object v14, v10

    .line 177
    goto :goto_3

    .line 178
    :catchall_3
    move-exception v0

    .line 179
    move-object/from16 v10, p1

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :catchall_4
    move-exception v0

    .line 183
    move v13, v1

    .line 184
    move v12, v2

    .line 185
    move-object v11, v3

    .line 186
    move-object v10, v14

    .line 187
    move-object v3, v5

    .line 188
    :goto_3
    if-eqz v2, :cond_4

    .line 189
    .line 190
    instance-of v5, v0, La/zhi0;

    .line 191
    .line 192
    if-eqz v5, :cond_4

    .line 193
    .line 194
    move-object v5, v0

    .line 195
    check-cast v5, La/zhi0;

    .line 196
    .line 197
    iget-boolean v5, v5, La/zhi0;->e:Z

    .line 198
    .line 199
    if-eqz v5, :cond_4

    .line 200
    .line 201
    const/4 v5, 0x1

    .line 202
    goto :goto_4

    .line 203
    :cond_4
    const/4 v5, 0x0

    .line 204
    :goto_4
    instance-of v10, v0, Ljava/util/concurrent/CancellationException;

    .line 205
    .line 206
    if-nez v10, :cond_11

    .line 207
    .line 208
    instance-of v10, v0, Ljava/net/ConnectException;

    .line 209
    .line 210
    if-nez v10, :cond_11

    .line 211
    .line 212
    if-nez v5, :cond_11

    .line 213
    .line 214
    instance-of v5, v0, La/zhi0;

    .line 215
    .line 216
    if-eqz v5, :cond_7

    .line 217
    .line 218
    move-object v5, v0

    .line 219
    check-cast v5, La/zhi0;

    .line 220
    .line 221
    iget-boolean v10, v5, La/zhi0;->f:Z

    .line 222
    .line 223
    if-nez v10, :cond_6

    .line 224
    .line 225
    iget-boolean v5, v5, La/zhi0;->e:Z

    .line 226
    .line 227
    if-eqz v5, :cond_5

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_5
    const/4 v5, 0x0

    .line 231
    :goto_5
    const/16 v16, 0x1

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_6
    :goto_6
    const/4 v5, 0x1

    .line 235
    goto :goto_5

    .line 236
    :cond_7
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-nez v5, :cond_5

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 244
    .line 245
    const/4 v10, 0x3

    .line 246
    if-gt v1, v10, :cond_a

    .line 247
    .line 248
    if-eqz v5, :cond_8

    .line 249
    .line 250
    goto :goto_a

    .line 251
    :cond_8
    const-string v5, "error ("

    .line 252
    .line 253
    const-string v10, "): "

    .line 254
    .line 255
    invoke-static {v1, v5, v10, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 260
    .line 261
    invoke-virtual {v5, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    const/4 v5, 0x0

    .line 265
    iput-object v5, v6, La/gm0;->q:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v15, v6, La/gm0;->i:La/vne;

    .line 268
    .line 269
    iput-object v14, v6, La/gm0;->j:La/dn0;

    .line 270
    .line 271
    iput-object v11, v6, La/gm0;->k:La/mlr;

    .line 272
    .line 273
    iput-object v3, v6, La/gm0;->l:La/lu0;

    .line 274
    .line 275
    iput v2, v6, La/gm0;->m:I

    .line 276
    .line 277
    iput v4, v6, La/gm0;->n:I

    .line 278
    .line 279
    iput v1, v6, La/gm0;->o:I

    .line 280
    .line 281
    const/4 v10, 0x2

    .line 282
    iput-byte v10, v6, La/gm0;->p:B

    .line 283
    .line 284
    const-wide/16 v12, 0xbb8

    .line 285
    .line 286
    invoke-static {v12, v13, v6}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    if-ne v0, v8, :cond_9

    .line 291
    .line 292
    :goto_8
    return-object v8

    .line 293
    :cond_9
    move-object v0, v3

    .line 294
    move-object v3, v11

    .line 295
    :goto_9
    move-object v11, v5

    .line 296
    const/4 v13, 0x1

    .line 297
    move-object v5, v0

    .line 298
    goto/16 :goto_0

    .line 299
    .line 300
    :cond_a
    :goto_a
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 301
    .line 302
    new-instance v1, La/g0g0;

    .line 303
    .line 304
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    move-object v0, v1

    .line 308
    :goto_b
    nop

    .line 309
    instance-of v1, v0, La/g0g0;

    .line 310
    .line 311
    if-nez v1, :cond_e

    .line 312
    .line 313
    move-object v1, v0

    .line 314
    check-cast v1, Lkotlin/Unit;

    .line 315
    .line 316
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    iget-object v1, v7, La/xk0;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-eqz v2, :cond_b

    .line 329
    .line 330
    goto :goto_c

    .line 331
    :cond_b
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-eqz v3, :cond_d

    .line 340
    .line 341
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    check-cast v3, La/mlr;

    .line 346
    .line 347
    iget-wide v3, v3, La/mlr;->a:J

    .line 348
    .line 349
    iget-wide v5, v9, La/mlr;->a:J

    .line 350
    .line 351
    cmp-long v3, v3, v5

    .line 352
    .line 353
    if-nez v3, :cond_c

    .line 354
    .line 355
    goto :goto_d

    .line 356
    :cond_d
    :goto_c
    invoke-virtual {v1, v9}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7}, La/xk0;->c()V

    .line 360
    .line 361
    .line 362
    const/4 v11, 0x1

    .line 363
    iput-boolean v11, v7, La/xk0;->a:Z

    .line 364
    .line 365
    :cond_e
    :goto_d
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    if-eqz v1, :cond_10

    .line 370
    .line 371
    instance-of v2, v1, La/zhi0;

    .line 372
    .line 373
    if-eqz v2, :cond_10

    .line 374
    .line 375
    check-cast v1, La/zhi0;

    .line 376
    .line 377
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 378
    .line 379
    sget-object v2, La/i2o;->N1:La/i2o;

    .line 380
    .line 381
    if-eq v1, v2, :cond_f

    .line 382
    .line 383
    goto :goto_e

    .line 384
    :cond_f
    new-instance v0, La/jfp;

    .line 385
    .line 386
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 387
    .line 388
    .line 389
    throw v0

    .line 390
    :cond_10
    :goto_e
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    return-object v0

    .line 396
    :cond_11
    throw v0
.end method
