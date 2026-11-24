.class public final La/v1e0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/w1e0;

.field public j:La/v1e0;

.field public k:Ljava/lang/Throwable;

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:J

.field public q:J

.field public r:B

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/w1e0;

.field public final synthetic u:I


# direct methods
.method public constructor <init>(La/w1e0;ILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/v1e0;->t:La/w1e0;

    .line 2
    .line 3
    iput p2, p0, La/v1e0;->u:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/v1e0;

    .line 2
    .line 3
    iget-object v1, p0, La/v1e0;->t:La/w1e0;

    .line 4
    .line 5
    iget p0, p0, La/v1e0;->u:I

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, La/v1e0;-><init>(La/w1e0;ILa/yje;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/v1e0;->s:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, La/v1e0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/v1e0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/v1e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-object v0, v6, La/v1e0;->s:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/vne;

    .line 6
    .line 7
    sget-object v7, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v0, v6, La/v1e0;->r:B

    .line 10
    .line 11
    const/4 v8, 0x3

    .line 12
    const/4 v9, 0x2

    .line 13
    const/4 v11, 0x1

    .line 14
    const/4 v12, 0x0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    if-eq v0, v11, :cond_2

    .line 18
    .line 19
    if-eq v0, v9, :cond_1

    .line 20
    .line 21
    if-ne v0, v8, :cond_0

    .line 22
    .line 23
    iget v0, v6, La/v1e0;->o:I

    .line 24
    .line 25
    iget v1, v6, La/v1e0;->n:I

    .line 26
    .line 27
    iget v2, v6, La/v1e0;->m:I

    .line 28
    .line 29
    iget-wide v3, v6, La/v1e0;->q:J

    .line 30
    .line 31
    iget-wide v13, v6, La/v1e0;->p:J

    .line 32
    .line 33
    iget v5, v6, La/v1e0;->l:I

    .line 34
    .line 35
    iget-object v15, v6, La/v1e0;->k:Ljava/lang/Throwable;

    .line 36
    .line 37
    iget-object v10, v6, La/v1e0;->j:La/v1e0;

    .line 38
    .line 39
    iget-object v8, v6, La/v1e0;->i:La/w1e0;

    .line 40
    .line 41
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 42
    .line 43
    .line 44
    move-object v11, v8

    .line 45
    move v8, v1

    .line 46
    move v1, v5

    .line 47
    move-object v5, v11

    .line 48
    move-object v11, v10

    .line 49
    move v10, v2

    .line 50
    move-object v2, v11

    .line 51
    move-wide/from16 v18, v13

    .line 52
    .line 53
    move-wide v13, v3

    .line 54
    move-wide/from16 v3, v18

    .line 55
    .line 56
    move-object v11, v12

    .line 57
    const/4 v12, 0x3

    .line 58
    goto/16 :goto_a

    .line 59
    .line 60
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v12

    .line 66
    :cond_1
    iget v0, v6, La/v1e0;->o:I

    .line 67
    .line 68
    iget v1, v6, La/v1e0;->n:I

    .line 69
    .line 70
    iget v2, v6, La/v1e0;->m:I

    .line 71
    .line 72
    iget-wide v3, v6, La/v1e0;->q:J

    .line 73
    .line 74
    iget-wide v13, v6, La/v1e0;->p:J

    .line 75
    .line 76
    iget v5, v6, La/v1e0;->l:I

    .line 77
    .line 78
    iget-object v8, v6, La/v1e0;->k:Ljava/lang/Throwable;

    .line 79
    .line 80
    iget-object v10, v6, La/v1e0;->j:La/v1e0;

    .line 81
    .line 82
    iget-object v15, v6, La/v1e0;->i:La/w1e0;

    .line 83
    .line 84
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 85
    .line 86
    .line 87
    move-object v11, v8

    .line 88
    move v8, v1

    .line 89
    move v1, v5

    .line 90
    move-object v5, v15

    .line 91
    move-object v15, v11

    .line 92
    move-object v11, v10

    .line 93
    move v10, v2

    .line 94
    move-object v2, v11

    .line 95
    move-wide/from16 v18, v13

    .line 96
    .line 97
    move-wide v13, v3

    .line 98
    move-wide/from16 v3, v18

    .line 99
    .line 100
    move v11, v9

    .line 101
    goto/16 :goto_7

    .line 102
    .line 103
    :cond_2
    iget v1, v6, La/v1e0;->n:I

    .line 104
    .line 105
    iget v2, v6, La/v1e0;->m:I

    .line 106
    .line 107
    iget-wide v3, v6, La/v1e0;->q:J

    .line 108
    .line 109
    iget-wide v13, v6, La/v1e0;->p:J

    .line 110
    .line 111
    iget v5, v6, La/v1e0;->l:I

    .line 112
    .line 113
    iget-object v8, v6, La/v1e0;->k:Ljava/lang/Throwable;

    .line 114
    .line 115
    iget-object v10, v6, La/v1e0;->j:La/v1e0;

    .line 116
    .line 117
    iget-object v15, v6, La/v1e0;->i:La/w1e0;

    .line 118
    .line 119
    :try_start_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    .line 122
    move-object/from16 v0, p1

    .line 123
    .line 124
    goto/16 :goto_1

    .line 125
    .line 126
    :catchall_0
    move-exception v0

    .line 127
    move-object/from16 v18, v15

    .line 128
    .line 129
    move-object v15, v0

    .line 130
    move-object v0, v8

    .line 131
    move v8, v1

    .line 132
    move v1, v5

    .line 133
    move-object/from16 v5, v18

    .line 134
    .line 135
    move-object/from16 v18, v10

    .line 136
    .line 137
    move v10, v2

    .line 138
    move-object/from16 v2, v18

    .line 139
    .line 140
    move-wide/from16 v18, v13

    .line 141
    .line 142
    move-wide v13, v3

    .line 143
    move-wide/from16 v3, v18

    .line 144
    .line 145
    goto/16 :goto_4

    .line 146
    .line 147
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, v6, La/v1e0;->t:La/w1e0;

    .line 151
    .line 152
    iget-object v1, v0, La/w1e0;->d:La/yox;

    .line 153
    .line 154
    iget-object v1, v1, La/yox;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 157
    .line 158
    iget v2, v6, La/v1e0;->u:I

    .line 159
    .line 160
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Ljava/util/List;

    .line 169
    .line 170
    if-nez v1, :cond_4

    .line 171
    .line 172
    sget-object v1, La/iun;->a:La/iun;

    .line 173
    .line 174
    :cond_4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-nez v3, :cond_5

    .line 179
    .line 180
    new-instance v0, La/cqk0;

    .line 181
    .line 182
    invoke-direct {v0, v1}, La/cqk0;-><init>(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-object v0

    .line 186
    :cond_5
    :try_start_3
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 187
    .line 188
    sget-wide v3, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 189
    .line 190
    const-wide/16 v13, 0x3

    .line 191
    .line 192
    move-wide/from16 v18, v13

    .line 193
    .line 194
    move-wide v13, v3

    .line 195
    move-wide/from16 v3, v18

    .line 196
    .line 197
    move-object v5, v0

    .line 198
    move v1, v2

    .line 199
    move-object v2, v6

    .line 200
    move v0, v11

    .line 201
    move-object v15, v12

    .line 202
    const/4 v8, 0x0

    .line 203
    const/4 v10, 0x0

    .line 204
    :goto_0
    if-eqz v0, :cond_11

    .line 205
    .line 206
    :try_start_4
    iget-object v9, v5, La/w1e0;->c:La/dq00;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 207
    .line 208
    :try_start_5
    iget-object v11, v5, La/w1e0;->b:La/knf0;

    .line 209
    .line 210
    invoke-virtual {v11}, La/knf0;->c()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    iget-object v12, v5, La/w1e0;->b:La/knf0;

    .line 215
    .line 216
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iget-object v12, v5, La/w1e0;->b:La/knf0;

    .line 220
    .line 221
    invoke-virtual {v12}, La/knf0;->b()I

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    move-object/from16 p1, v11

    .line 226
    .line 227
    iget-object v11, v5, La/w1e0;->b:La/knf0;

    .line 228
    .line 229
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    const/4 v11, 0x0

    .line 233
    iput-object v11, v6, La/v1e0;->s:Ljava/lang/Object;

    .line 234
    .line 235
    iput-object v5, v6, La/v1e0;->i:La/w1e0;

    .line 236
    .line 237
    iput-object v2, v6, La/v1e0;->j:La/v1e0;

    .line 238
    .line 239
    iput-object v15, v6, La/v1e0;->k:Ljava/lang/Throwable;

    .line 240
    .line 241
    iput v1, v6, La/v1e0;->l:I

    .line 242
    .line 243
    iput-wide v3, v6, La/v1e0;->p:J

    .line 244
    .line 245
    iput-wide v13, v6, La/v1e0;->q:J

    .line 246
    .line 247
    iput v10, v6, La/v1e0;->m:I

    .line 248
    .line 249
    iput v8, v6, La/v1e0;->n:I

    .line 250
    .line 251
    iput v0, v6, La/v1e0;->o:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 252
    .line 253
    const/4 v11, 0x1

    .line 254
    :try_start_6
    iput-byte v11, v6, La/v1e0;->r:B
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 255
    .line 256
    :try_start_7
    iget-object v0, v9, La/dq00;->c:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, La/p7d0;

    .line 259
    .line 260
    invoke-virtual {v0}, La/p7d0;->invoke()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, La/q1e0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 265
    .line 266
    move-wide/from16 v16, v3

    .line 267
    .line 268
    const/4 v3, 0x1

    .line 269
    move-object v4, v5

    .line 270
    const/16 v5, 0x54d

    .line 271
    .line 272
    move-object v9, v4

    .line 273
    move v4, v12

    .line 274
    move-object v12, v2

    .line 275
    move-object/from16 v2, p1

    .line 276
    .line 277
    :try_start_8
    invoke-interface/range {v0 .. v6}, La/q1e0;->a(ILjava/lang/String;IIILa/yje;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 281
    if-ne v0, v7, :cond_6

    .line 282
    .line 283
    goto/16 :goto_9

    .line 284
    .line 285
    :cond_6
    move v5, v1

    .line 286
    move v1, v8

    .line 287
    move v2, v10

    .line 288
    move-object v10, v12

    .line 289
    move-wide v3, v13

    .line 290
    move-object v8, v15

    .line 291
    move-wide/from16 v13, v16

    .line 292
    .line 293
    move-object v15, v9

    .line 294
    :goto_1
    :try_start_9
    check-cast v0, La/dx5;

    .line 295
    .line 296
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, La/z1e0;

    .line 301
    .line 302
    invoke-static {v0}, La/q7x;->J(La/z1e0;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iget-object v9, v15, La/w1e0;->d:La/yox;

    .line 307
    .line 308
    iget-object v9, v9, La/yox;->a:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v9, Ljava/util/concurrent/ConcurrentHashMap;

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result v12

    .line 319
    if-nez v12, :cond_7

    .line 320
    .line 321
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    invoke-virtual {v9, v12}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v12

    .line 329
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v12

    .line 333
    if-nez v12, :cond_7

    .line 334
    .line 335
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v12

    .line 339
    invoke-virtual {v9, v12}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    invoke-virtual {v9, v12, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 347
    .line 348
    .line 349
    :cond_7
    :try_start_a
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 350
    .line 351
    goto/16 :goto_c

    .line 352
    .line 353
    :catchall_1
    move-exception v0

    .line 354
    goto :goto_2

    .line 355
    :catchall_2
    move-exception v0

    .line 356
    move-object v12, v2

    .line 357
    move-wide/from16 v16, v3

    .line 358
    .line 359
    move-object v9, v5

    .line 360
    :goto_2
    move-object v2, v15

    .line 361
    move-object v15, v0

    .line 362
    move-object v0, v2

    .line 363
    move-object v5, v9

    .line 364
    move-object v2, v12

    .line 365
    move-wide/from16 v3, v16

    .line 366
    .line 367
    goto :goto_4

    .line 368
    :catchall_3
    move-exception v0

    .line 369
    move-object v12, v2

    .line 370
    move-wide/from16 v16, v3

    .line 371
    .line 372
    move-object v9, v5

    .line 373
    :goto_3
    move-object v2, v15

    .line 374
    move-object v15, v0

    .line 375
    move-object v0, v2

    .line 376
    move-object v2, v12

    .line 377
    goto :goto_4

    .line 378
    :catchall_4
    move-exception v0

    .line 379
    move-object v12, v2

    .line 380
    move-wide/from16 v16, v3

    .line 381
    .line 382
    move-object v9, v5

    .line 383
    const/4 v11, 0x1

    .line 384
    goto :goto_3

    .line 385
    :goto_4
    invoke-static {v15}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 386
    .line 387
    .line 388
    move-result v9

    .line 389
    if-eqz v9, :cond_c

    .line 390
    .line 391
    if-nez v10, :cond_8

    .line 392
    .line 393
    new-instance v0, La/el50;

    .line 394
    .line 395
    invoke-direct {v0, v15}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 396
    .line 397
    .line 398
    move-object v15, v0

    .line 399
    const/4 v0, 0x0

    .line 400
    const/4 v9, 0x2

    .line 401
    :goto_5
    const/4 v12, 0x0

    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :cond_8
    int-to-long v11, v8

    .line 405
    cmp-long v9, v11, v3

    .line 406
    .line 407
    if-gez v9, :cond_9

    .line 408
    .line 409
    const/4 v9, 0x1

    .line 410
    goto :goto_6

    .line 411
    :cond_9
    const/4 v9, 0x0

    .line 412
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 413
    .line 414
    if-eqz v9, :cond_a

    .line 415
    .line 416
    const/4 v11, 0x0

    .line 417
    iput-object v11, v6, La/v1e0;->s:Ljava/lang/Object;

    .line 418
    .line 419
    iput-object v5, v6, La/v1e0;->i:La/w1e0;

    .line 420
    .line 421
    iput-object v2, v6, La/v1e0;->j:La/v1e0;

    .line 422
    .line 423
    iput-object v0, v6, La/v1e0;->k:Ljava/lang/Throwable;

    .line 424
    .line 425
    iput v1, v6, La/v1e0;->l:I

    .line 426
    .line 427
    iput-wide v3, v6, La/v1e0;->p:J

    .line 428
    .line 429
    iput-wide v13, v6, La/v1e0;->q:J

    .line 430
    .line 431
    iput v10, v6, La/v1e0;->m:I

    .line 432
    .line 433
    iput v8, v6, La/v1e0;->n:I

    .line 434
    .line 435
    iput v9, v6, La/v1e0;->o:I

    .line 436
    .line 437
    const/4 v11, 0x2

    .line 438
    iput-byte v11, v6, La/v1e0;->r:B

    .line 439
    .line 440
    invoke-static {v13, v14, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v12

    .line 444
    if-ne v12, v7, :cond_b

    .line 445
    .line 446
    goto :goto_9

    .line 447
    :goto_7
    move v9, v11

    .line 448
    const/4 v11, 0x1

    .line 449
    goto :goto_5

    .line 450
    :cond_a
    const/4 v11, 0x2

    .line 451
    new-instance v0, La/el50;

    .line 452
    .line 453
    invoke-direct {v0, v15}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 454
    .line 455
    .line 456
    :cond_b
    move-object v15, v0

    .line 457
    move v0, v9

    .line 458
    goto :goto_7

    .line 459
    :cond_c
    const/4 v11, 0x2

    .line 460
    invoke-static {v15}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 461
    .line 462
    .line 463
    move-result v9

    .line 464
    if-eqz v9, :cond_10

    .line 465
    .line 466
    int-to-long v11, v8

    .line 467
    cmp-long v9, v11, v3

    .line 468
    .line 469
    if-gez v9, :cond_d

    .line 470
    .line 471
    const/4 v9, 0x1

    .line 472
    goto :goto_8

    .line 473
    :cond_d
    const/4 v9, 0x0

    .line 474
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 475
    .line 476
    if-eqz v9, :cond_e

    .line 477
    .line 478
    const/4 v11, 0x0

    .line 479
    iput-object v11, v6, La/v1e0;->s:Ljava/lang/Object;

    .line 480
    .line 481
    iput-object v5, v6, La/v1e0;->i:La/w1e0;

    .line 482
    .line 483
    iput-object v2, v6, La/v1e0;->j:La/v1e0;

    .line 484
    .line 485
    iput-object v0, v6, La/v1e0;->k:Ljava/lang/Throwable;

    .line 486
    .line 487
    iput v1, v6, La/v1e0;->l:I

    .line 488
    .line 489
    iput-wide v3, v6, La/v1e0;->p:J

    .line 490
    .line 491
    iput-wide v13, v6, La/v1e0;->q:J

    .line 492
    .line 493
    iput v10, v6, La/v1e0;->m:I

    .line 494
    .line 495
    iput v8, v6, La/v1e0;->n:I

    .line 496
    .line 497
    iput v9, v6, La/v1e0;->o:I

    .line 498
    .line 499
    const/4 v12, 0x3

    .line 500
    iput-byte v12, v6, La/v1e0;->r:B

    .line 501
    .line 502
    invoke-static {v13, v14, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v15

    .line 506
    if-ne v15, v7, :cond_f

    .line 507
    .line 508
    :goto_9
    return-object v7

    .line 509
    :goto_a
    move-object v12, v11

    .line 510
    :goto_b
    const/4 v9, 0x2

    .line 511
    const/4 v11, 0x1

    .line 512
    goto/16 :goto_0

    .line 513
    .line 514
    :cond_e
    const/4 v11, 0x0

    .line 515
    const/4 v12, 0x3

    .line 516
    new-instance v0, La/dag0;

    .line 517
    .line 518
    invoke-direct {v0, v15}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 519
    .line 520
    .line 521
    :cond_f
    move-object v15, v0

    .line 522
    move v0, v9

    .line 523
    goto :goto_a

    .line 524
    :cond_10
    const/4 v11, 0x0

    .line 525
    const/4 v12, 0x3

    .line 526
    invoke-static {v15}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 527
    .line 528
    .line 529
    move-object v12, v11

    .line 530
    const/4 v0, 0x0

    .line 531
    goto :goto_b

    .line 532
    :cond_11
    if-nez v15, :cond_12

    .line 533
    .line 534
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 535
    .line 536
    const-string v1, "Unexpected error"

    .line 537
    .line 538
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    throw v0

    .line 542
    :cond_12
    throw v15
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 543
    :catchall_5
    move-exception v0

    .line 544
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 545
    .line 546
    new-instance v1, La/g0g0;

    .line 547
    .line 548
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 549
    .line 550
    .line 551
    move-object v0, v1

    .line 552
    :goto_c
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    if-nez v1, :cond_13

    .line 557
    .line 558
    check-cast v0, Ljava/util/List;

    .line 559
    .line 560
    new-instance v1, La/cqk0;

    .line 561
    .line 562
    invoke-direct {v1, v0}, La/cqk0;-><init>(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    goto :goto_d

    .line 566
    :cond_13
    new-instance v0, La/bqk0;

    .line 567
    .line 568
    invoke-direct {v0, v1}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 569
    .line 570
    .line 571
    move-object v1, v0

    .line 572
    :goto_d
    return-object v1
.end method
