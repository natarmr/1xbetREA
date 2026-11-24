.class public final La/y5v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/b6v;

.field public j:Ljava/util/List;

.field public k:La/y5v;

.field public l:Ljava/lang/Throwable;

.field public m:J

.field public n:J

.field public o:I

.field public p:I

.field public q:I

.field public r:B

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/b6v;

.field public final synthetic u:Ljava/util/List;


# direct methods
.method public constructor <init>(La/b6v;Ljava/util/List;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/y5v;->t:La/b6v;

    .line 2
    .line 3
    iput-object p2, p0, La/y5v;->u:Ljava/util/List;

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
    new-instance v0, La/y5v;

    .line 2
    .line 3
    iget-object v1, p0, La/y5v;->t:La/b6v;

    .line 4
    .line 5
    iget-object p0, p0, La/y5v;->u:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p2}, La/y5v;-><init>(La/b6v;Ljava/util/List;La/yje;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, La/y5v;->s:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/y5v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/y5v;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/y5v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/y5v;->s:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, La/kmq;

    .line 7
    .line 8
    sget-object v3, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, v1, La/y5v;->r:B

    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    if-eq v0, v8, :cond_3

    .line 20
    .line 21
    if-eq v0, v6, :cond_2

    .line 22
    .line 23
    if-eq v0, v5, :cond_1

    .line 24
    .line 25
    if-ne v0, v4, :cond_0

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_c

    .line 31
    .line 32
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v9

    .line 38
    :cond_1
    iget v0, v1, La/y5v;->q:I

    .line 39
    .line 40
    iget v10, v1, La/y5v;->p:I

    .line 41
    .line 42
    iget v11, v1, La/y5v;->o:I

    .line 43
    .line 44
    iget-wide v12, v1, La/y5v;->n:J

    .line 45
    .line 46
    iget-wide v14, v1, La/y5v;->m:J

    .line 47
    .line 48
    iget-object v7, v1, La/y5v;->l:Ljava/lang/Throwable;

    .line 49
    .line 50
    iget-object v4, v1, La/y5v;->k:La/y5v;

    .line 51
    .line 52
    iget-object v9, v1, La/y5v;->j:Ljava/util/List;

    .line 53
    .line 54
    iget-object v5, v1, La/y5v;->i:La/b6v;

    .line 55
    .line 56
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    move/from16 v16, v6

    .line 60
    .line 61
    move-object v6, v7

    .line 62
    const/4 v7, 0x3

    .line 63
    move-wide/from16 v19, v12

    .line 64
    .line 65
    move-object v13, v4

    .line 66
    move v4, v10

    .line 67
    move-wide/from16 v21, v14

    .line 68
    .line 69
    move-object v15, v5

    .line 70
    move-object v14, v9

    .line 71
    move v5, v11

    .line 72
    move-wide/from16 v9, v19

    .line 73
    .line 74
    move-wide/from16 v11, v21

    .line 75
    .line 76
    goto/16 :goto_8

    .line 77
    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto/16 :goto_9

    .line 80
    .line 81
    :cond_2
    iget v0, v1, La/y5v;->q:I

    .line 82
    .line 83
    iget v4, v1, La/y5v;->p:I

    .line 84
    .line 85
    iget v5, v1, La/y5v;->o:I

    .line 86
    .line 87
    iget-wide v9, v1, La/y5v;->n:J

    .line 88
    .line 89
    iget-wide v11, v1, La/y5v;->m:J

    .line 90
    .line 91
    iget-object v7, v1, La/y5v;->l:Ljava/lang/Throwable;

    .line 92
    .line 93
    iget-object v13, v1, La/y5v;->k:La/y5v;

    .line 94
    .line 95
    iget-object v14, v1, La/y5v;->j:Ljava/util/List;

    .line 96
    .line 97
    iget-object v15, v1, La/y5v;->i:La/b6v;

    .line 98
    .line 99
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    move-object/from16 v19, v7

    .line 103
    .line 104
    move v7, v6

    .line 105
    move-object/from16 v6, v19

    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :cond_3
    iget v4, v1, La/y5v;->p:I

    .line 110
    .line 111
    iget v5, v1, La/y5v;->o:I

    .line 112
    .line 113
    iget-wide v9, v1, La/y5v;->n:J

    .line 114
    .line 115
    iget-wide v11, v1, La/y5v;->m:J

    .line 116
    .line 117
    iget-object v7, v1, La/y5v;->l:Ljava/lang/Throwable;

    .line 118
    .line 119
    iget-object v13, v1, La/y5v;->k:La/y5v;

    .line 120
    .line 121
    iget-object v14, v1, La/y5v;->j:Ljava/util/List;

    .line 122
    .line 123
    iget-object v15, v1, La/y5v;->i:La/b6v;

    .line 124
    .line 125
    :try_start_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 126
    .line 127
    .line 128
    move-object/from16 v0, p1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    move-object/from16 v19, v7

    .line 133
    .line 134
    move-object v7, v0

    .line 135
    move-object/from16 v0, v19

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 142
    .line 143
    sget-wide v4, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 144
    .line 145
    iget-object v0, v1, La/y5v;->t:La/b6v;

    .line 146
    .line 147
    iget-object v7, v1, La/y5v;->u:Ljava/util/List;

    .line 148
    .line 149
    const-wide/16 v9, 0x3

    .line 150
    .line 151
    move-object v15, v0

    .line 152
    move-object v13, v1

    .line 153
    move-object v14, v7

    .line 154
    move v0, v8

    .line 155
    move-wide v11, v9

    .line 156
    const/4 v7, 0x0

    .line 157
    move-wide v9, v4

    .line 158
    const/4 v4, 0x0

    .line 159
    const/4 v5, 0x0

    .line 160
    :goto_0
    if-eqz v0, :cond_f

    .line 161
    .line 162
    :try_start_4
    iget-object v6, v15, La/b6v;->b:La/r2u;

    .line 163
    .line 164
    iput-object v2, v1, La/y5v;->s:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v15, v1, La/y5v;->i:La/b6v;

    .line 167
    .line 168
    iput-object v14, v1, La/y5v;->j:Ljava/util/List;

    .line 169
    .line 170
    iput-object v13, v1, La/y5v;->k:La/y5v;

    .line 171
    .line 172
    iput-object v7, v1, La/y5v;->l:Ljava/lang/Throwable;

    .line 173
    .line 174
    iput-wide v11, v1, La/y5v;->m:J

    .line 175
    .line 176
    iput-wide v9, v1, La/y5v;->n:J

    .line 177
    .line 178
    iput v5, v1, La/y5v;->o:I

    .line 179
    .line 180
    iput v4, v1, La/y5v;->p:I

    .line 181
    .line 182
    iput v0, v1, La/y5v;->q:I

    .line 183
    .line 184
    iput-byte v8, v1, La/y5v;->r:B

    .line 185
    .line 186
    invoke-virtual {v6, v14, v1}, La/r2u;->a(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-ne v0, v3, :cond_5

    .line 191
    .line 192
    goto/16 :goto_b

    .line 193
    .line 194
    :cond_5
    :goto_1
    check-cast v0, Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 195
    .line 196
    :try_start_5
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 197
    .line 198
    goto/16 :goto_a

    .line 199
    .line 200
    :goto_2
    invoke-static {v7}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    if-eqz v6, :cond_a

    .line 205
    .line 206
    if-nez v5, :cond_6

    .line 207
    .line 208
    new-instance v0, La/el50;

    .line 209
    .line 210
    invoke-direct {v0, v7}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    move-object v7, v0

    .line 214
    const/4 v0, 0x0

    .line 215
    const/4 v6, 0x2

    .line 216
    goto :goto_0

    .line 217
    :cond_6
    move-wide/from16 v17, v9

    .line 218
    .line 219
    int-to-long v8, v4

    .line 220
    cmp-long v8, v8, v11

    .line 221
    .line 222
    if-gez v8, :cond_7

    .line 223
    .line 224
    const/4 v8, 0x1

    .line 225
    goto :goto_3

    .line 226
    :cond_7
    const/4 v8, 0x0

    .line 227
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 228
    .line 229
    if-eqz v8, :cond_9

    .line 230
    .line 231
    iput-object v2, v1, La/y5v;->s:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object v15, v1, La/y5v;->i:La/b6v;

    .line 234
    .line 235
    iput-object v14, v1, La/y5v;->j:Ljava/util/List;

    .line 236
    .line 237
    iput-object v13, v1, La/y5v;->k:La/y5v;

    .line 238
    .line 239
    iput-object v0, v1, La/y5v;->l:Ljava/lang/Throwable;

    .line 240
    .line 241
    iput-wide v11, v1, La/y5v;->m:J

    .line 242
    .line 243
    move-wide/from16 v9, v17

    .line 244
    .line 245
    iput-wide v9, v1, La/y5v;->n:J

    .line 246
    .line 247
    iput v5, v1, La/y5v;->o:I

    .line 248
    .line 249
    iput v4, v1, La/y5v;->p:I

    .line 250
    .line 251
    iput v8, v1, La/y5v;->q:I

    .line 252
    .line 253
    const/4 v7, 0x2

    .line 254
    iput-byte v7, v1, La/y5v;->r:B

    .line 255
    .line 256
    invoke-static {v9, v10, v13}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    if-ne v6, v3, :cond_8

    .line 261
    .line 262
    goto/16 :goto_b

    .line 263
    .line 264
    :cond_8
    move-object v6, v0

    .line 265
    move v0, v8

    .line 266
    :goto_4
    move v8, v7

    .line 267
    move-object v7, v6

    .line 268
    move v6, v8

    .line 269
    :goto_5
    const/4 v8, 0x1

    .line 270
    goto :goto_0

    .line 271
    :cond_9
    move-wide/from16 v9, v17

    .line 272
    .line 273
    const/16 v16, 0x2

    .line 274
    .line 275
    new-instance v0, La/el50;

    .line 276
    .line 277
    invoke-direct {v0, v7}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    move-object v7, v0

    .line 281
    move v0, v8

    .line 282
    :goto_6
    move/from16 v6, v16

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_a
    const/16 v16, 0x2

    .line 286
    .line 287
    invoke-static {v7}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    if-eqz v6, :cond_e

    .line 292
    .line 293
    move-object v8, v7

    .line 294
    int-to-long v6, v4

    .line 295
    cmp-long v6, v6, v11

    .line 296
    .line 297
    if-gez v6, :cond_b

    .line 298
    .line 299
    const/4 v6, 0x1

    .line 300
    goto :goto_7

    .line 301
    :cond_b
    const/4 v6, 0x0

    .line 302
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 303
    .line 304
    if-eqz v6, :cond_d

    .line 305
    .line 306
    iput-object v2, v1, La/y5v;->s:Ljava/lang/Object;

    .line 307
    .line 308
    iput-object v15, v1, La/y5v;->i:La/b6v;

    .line 309
    .line 310
    iput-object v14, v1, La/y5v;->j:Ljava/util/List;

    .line 311
    .line 312
    iput-object v13, v1, La/y5v;->k:La/y5v;

    .line 313
    .line 314
    iput-object v0, v1, La/y5v;->l:Ljava/lang/Throwable;

    .line 315
    .line 316
    iput-wide v11, v1, La/y5v;->m:J

    .line 317
    .line 318
    iput-wide v9, v1, La/y5v;->n:J

    .line 319
    .line 320
    iput v5, v1, La/y5v;->o:I

    .line 321
    .line 322
    iput v4, v1, La/y5v;->p:I

    .line 323
    .line 324
    iput v6, v1, La/y5v;->q:I

    .line 325
    .line 326
    const/4 v7, 0x3

    .line 327
    iput-byte v7, v1, La/y5v;->r:B

    .line 328
    .line 329
    invoke-static {v9, v10, v13}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    if-ne v8, v3, :cond_c

    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_c
    move/from16 v19, v6

    .line 337
    .line 338
    move-object v6, v0

    .line 339
    move/from16 v0, v19

    .line 340
    .line 341
    :goto_8
    move-object v7, v6

    .line 342
    goto :goto_6

    .line 343
    :cond_d
    const/4 v7, 0x3

    .line 344
    new-instance v0, La/dag0;

    .line 345
    .line 346
    invoke-direct {v0, v8}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 347
    .line 348
    .line 349
    move-object v7, v0

    .line 350
    move v0, v6

    .line 351
    goto :goto_6

    .line 352
    :cond_e
    move-object v8, v7

    .line 353
    const/4 v7, 0x3

    .line 354
    invoke-static {v8}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 355
    .line 356
    .line 357
    move-object v7, v8

    .line 358
    move/from16 v6, v16

    .line 359
    .line 360
    const/4 v0, 0x0

    .line 361
    goto :goto_5

    .line 362
    :cond_f
    if-nez v7, :cond_10

    .line 363
    .line 364
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 365
    .line 366
    const-string v4, "Unexpected error"

    .line 367
    .line 368
    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v0

    .line 372
    :cond_10
    throw v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 373
    :goto_9
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 374
    .line 375
    new-instance v4, La/g0g0;

    .line 376
    .line 377
    invoke-direct {v4, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 378
    .line 379
    .line 380
    move-object v0, v4

    .line 381
    :goto_a
    new-instance v4, La/j0g0;

    .line 382
    .line 383
    invoke-direct {v4, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    const/4 v5, 0x0

    .line 387
    iput-object v5, v1, La/y5v;->s:Ljava/lang/Object;

    .line 388
    .line 389
    iput-object v5, v1, La/y5v;->i:La/b6v;

    .line 390
    .line 391
    iput-object v5, v1, La/y5v;->j:Ljava/util/List;

    .line 392
    .line 393
    iput-object v5, v1, La/y5v;->k:La/y5v;

    .line 394
    .line 395
    iput-object v5, v1, La/y5v;->l:Ljava/lang/Throwable;

    .line 396
    .line 397
    const/4 v5, 0x4

    .line 398
    iput-byte v5, v1, La/y5v;->r:B

    .line 399
    .line 400
    invoke-interface {v2, v4, v1}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    if-ne v0, v3, :cond_11

    .line 405
    .line 406
    :goto_b
    return-object v3

    .line 407
    :cond_11
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    return-object v0
.end method
