.class public final La/nru0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:J


# instance fields
.field public final a:La/nmt0;

.field public final b:La/jmb;

.field public final c:La/knf0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    const/16 v0, 0x1e

    .line 4
    .line 5
    sget-object v1, La/bfn;->e:La/bfn;

    .line 6
    .line 7
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sput-wide v0, La/nru0;->d:J

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/nmt0;La/jmb;La/knf0;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/nru0;->a:La/nmt0;

    .line 8
    .line 9
    iput-object p2, p0, La/nru0;->b:La/jmb;

    .line 10
    .line 11
    iput-object p3, p0, La/nru0;->c:La/knf0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/io/Serializable;
    .locals 19

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, La/mru0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/mru0;

    .line 9
    .line 10
    iget v2, v1, La/mru0;->u:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/mru0;->u:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/mru0;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/mru0;-><init>(La/nru0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, La/mru0;->s:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v1, La/mru0;->u:I

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    if-eq v4, v8, :cond_3

    .line 45
    .line 46
    if-eq v4, v6, :cond_2

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    iget v2, v1, La/mru0;->l:I

    .line 51
    .line 52
    iget v4, v1, La/mru0;->k:I

    .line 53
    .line 54
    iget v7, v1, La/mru0;->j:I

    .line 55
    .line 56
    iget-wide v10, v1, La/mru0;->r:J

    .line 57
    .line 58
    iget-wide v12, v1, La/mru0;->q:J

    .line 59
    .line 60
    iget v14, v1, La/mru0;->i:I

    .line 61
    .line 62
    iget-object v15, v1, La/mru0;->p:Ljava/lang/Throwable;

    .line 63
    .line 64
    iget-object v5, v1, La/mru0;->o:La/mru0;

    .line 65
    .line 66
    iget-object v6, v1, La/mru0;->n:La/nru0;

    .line 67
    .line 68
    iget-object v8, v1, La/mru0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 69
    .line 70
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 71
    .line 72
    .line 73
    move v0, v7

    .line 74
    move v7, v4

    .line 75
    move-object v4, v8

    .line 76
    move v8, v0

    .line 77
    move v0, v2

    .line 78
    move-object v2, v6

    .line 79
    move-object v6, v5

    .line 80
    move-object v5, v1

    .line 81
    move v1, v14

    .line 82
    move-wide v13, v12

    .line 83
    move-object v12, v15

    .line 84
    const/4 v15, 0x3

    .line 85
    goto/16 :goto_6

    .line 86
    .line 87
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v7

    .line 93
    :cond_2
    iget v2, v1, La/mru0;->l:I

    .line 94
    .line 95
    iget v4, v1, La/mru0;->k:I

    .line 96
    .line 97
    iget v5, v1, La/mru0;->j:I

    .line 98
    .line 99
    iget-wide v6, v1, La/mru0;->r:J

    .line 100
    .line 101
    iget-wide v10, v1, La/mru0;->q:J

    .line 102
    .line 103
    iget v8, v1, La/mru0;->i:I

    .line 104
    .line 105
    iget-object v12, v1, La/mru0;->p:Ljava/lang/Throwable;

    .line 106
    .line 107
    iget-object v13, v1, La/mru0;->o:La/mru0;

    .line 108
    .line 109
    iget-object v14, v1, La/mru0;->n:La/nru0;

    .line 110
    .line 111
    iget-object v15, v1, La/mru0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 112
    .line 113
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 114
    .line 115
    .line 116
    move v0, v5

    .line 117
    move-object v5, v1

    .line 118
    move v1, v8

    .line 119
    move v8, v0

    .line 120
    move v0, v2

    .line 121
    move-object v2, v14

    .line 122
    move-wide/from16 v17, v6

    .line 123
    .line 124
    move v7, v4

    .line 125
    move-object v6, v13

    .line 126
    move-object v4, v15

    .line 127
    const/4 v15, 0x2

    .line 128
    move-wide v13, v10

    .line 129
    move-wide/from16 v10, v17

    .line 130
    .line 131
    goto/16 :goto_6

    .line 132
    .line 133
    :cond_3
    iget v2, v1, La/mru0;->k:I

    .line 134
    .line 135
    iget v4, v1, La/mru0;->j:I

    .line 136
    .line 137
    iget-wide v5, v1, La/mru0;->r:J

    .line 138
    .line 139
    iget-wide v7, v1, La/mru0;->q:J

    .line 140
    .line 141
    iget v10, v1, La/mru0;->i:I

    .line 142
    .line 143
    iget-object v11, v1, La/mru0;->p:Ljava/lang/Throwable;

    .line 144
    .line 145
    iget-object v12, v1, La/mru0;->o:La/mru0;

    .line 146
    .line 147
    iget-object v13, v1, La/mru0;->n:La/nru0;

    .line 148
    .line 149
    iget-object v14, v1, La/mru0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 150
    .line 151
    :try_start_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 152
    .line 153
    .line 154
    const/4 v9, 0x1

    .line 155
    goto/16 :goto_2

    .line 156
    .line 157
    :catchall_0
    move-exception v0

    .line 158
    move-wide/from16 v17, v5

    .line 159
    .line 160
    move-object v5, v1

    .line 161
    move v1, v10

    .line 162
    move-object v6, v12

    .line 163
    move-object v12, v11

    .line 164
    move-wide/from16 v10, v17

    .line 165
    .line 166
    move-wide/from16 v17, v7

    .line 167
    .line 168
    move v7, v2

    .line 169
    move v8, v4

    .line 170
    move-object v2, v13

    .line 171
    move-object v4, v14

    .line 172
    move-wide/from16 v13, v17

    .line 173
    .line 174
    goto/16 :goto_4

    .line 175
    .line 176
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :try_start_3
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 180
    .line 181
    sget-wide v4, La/cag0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 182
    .line 183
    const-wide/16 v10, 0x3

    .line 184
    .line 185
    move-object v6, v1

    .line 186
    move-object v12, v7

    .line 187
    move v7, v9

    .line 188
    move v8, v7

    .line 189
    move-wide v13, v10

    .line 190
    const/4 v0, 0x1

    .line 191
    move/from16 v1, p1

    .line 192
    .line 193
    move-wide v10, v4

    .line 194
    move-object/from16 v4, p3

    .line 195
    .line 196
    move-object v5, v6

    .line 197
    :goto_1
    if-eqz v0, :cond_f

    .line 198
    .line 199
    :try_start_4
    iget-object v15, v2, La/nru0;->c:La/knf0;

    .line 200
    .line 201
    invoke-virtual {v15}, La/knf0;->d()La/lnf0;

    .line 202
    .line 203
    .line 204
    move-result-object v15
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 205
    move-object/from16 v16, v3

    .line 206
    .line 207
    :try_start_5
    iget-byte v3, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 208
    .line 209
    invoke-static {v15, v1, v3, v9}, La/egm0;->g(La/lnf0;IIZ)La/jo20;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    iget-object v15, v2, La/nru0;->a:La/nmt0;

    .line 214
    .line 215
    iput-object v4, v5, La/mru0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 216
    .line 217
    iput-object v2, v5, La/mru0;->n:La/nru0;

    .line 218
    .line 219
    iput-object v6, v5, La/mru0;->o:La/mru0;

    .line 220
    .line 221
    iput-object v12, v5, La/mru0;->p:Ljava/lang/Throwable;

    .line 222
    .line 223
    iput v1, v5, La/mru0;->i:I

    .line 224
    .line 225
    iput-wide v13, v5, La/mru0;->q:J

    .line 226
    .line 227
    iput-wide v10, v5, La/mru0;->r:J

    .line 228
    .line 229
    iput v8, v5, La/mru0;->j:I

    .line 230
    .line 231
    iput v7, v5, La/mru0;->k:I

    .line 232
    .line 233
    iput v0, v5, La/mru0;->l:I

    .line 234
    .line 235
    const/4 v9, 0x1

    .line 236
    iput v9, v5, La/mru0;->u:I

    .line 237
    .line 238
    invoke-virtual {v15, v3, v5}, La/nmt0;->b(La/jo20;La/zje;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 242
    move-object/from16 v3, v16

    .line 243
    .line 244
    if-ne v0, v3, :cond_5

    .line 245
    .line 246
    goto/16 :goto_a

    .line 247
    .line 248
    :cond_5
    move-wide/from16 v17, v10

    .line 249
    .line 250
    move v10, v1

    .line 251
    move-object v1, v5

    .line 252
    move-object v11, v12

    .line 253
    move-object v12, v6

    .line 254
    move-wide/from16 v5, v17

    .line 255
    .line 256
    move-wide/from16 v17, v13

    .line 257
    .line 258
    move-object v13, v2

    .line 259
    move-object v14, v4

    .line 260
    move v2, v7

    .line 261
    move v4, v8

    .line 262
    move-wide/from16 v7, v17

    .line 263
    .line 264
    :goto_2
    :try_start_6
    check-cast v0, Ljava/lang/Iterable;

    .line 265
    .line 266
    new-instance v15, Ljava/util/ArrayList;

    .line 267
    .line 268
    const/16 v9, 0xa

    .line 269
    .line 270
    invoke-static {v0, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    invoke-direct {v15, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    if-eqz v9, :cond_6

    .line 286
    .line 287
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    check-cast v9, La/rru0;

    .line 292
    .line 293
    invoke-static {v9}, La/wgm0;->v(La/rru0;)La/oru0;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 298
    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_6
    :try_start_7
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 302
    .line 303
    goto/16 :goto_b

    .line 304
    .line 305
    :catchall_1
    move-exception v0

    .line 306
    move-object/from16 v3, v16

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :catchall_2
    move-exception v0

    .line 310
    :goto_4
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 311
    .line 312
    .line 313
    move-result v9

    .line 314
    if-eqz v9, :cond_b

    .line 315
    .line 316
    if-nez v8, :cond_7

    .line 317
    .line 318
    new-instance v12, La/el50;

    .line 319
    .line 320
    invoke-direct {v12, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    :goto_5
    const/4 v0, 0x0

    .line 324
    :goto_6
    const/4 v9, 0x0

    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :cond_7
    move/from16 p0, v8

    .line 328
    .line 329
    int-to-long v8, v7

    .line 330
    cmp-long v8, v8, v13

    .line 331
    .line 332
    if-gez v8, :cond_8

    .line 333
    .line 334
    const/4 v8, 0x1

    .line 335
    goto :goto_7

    .line 336
    :cond_8
    const/4 v8, 0x0

    .line 337
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 338
    .line 339
    if-eqz v8, :cond_9

    .line 340
    .line 341
    iput-object v4, v5, La/mru0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 342
    .line 343
    iput-object v2, v5, La/mru0;->n:La/nru0;

    .line 344
    .line 345
    iput-object v6, v5, La/mru0;->o:La/mru0;

    .line 346
    .line 347
    iput-object v12, v5, La/mru0;->p:Ljava/lang/Throwable;

    .line 348
    .line 349
    iput v1, v5, La/mru0;->i:I

    .line 350
    .line 351
    iput-wide v13, v5, La/mru0;->q:J

    .line 352
    .line 353
    iput-wide v10, v5, La/mru0;->r:J

    .line 354
    .line 355
    move/from16 v9, p0

    .line 356
    .line 357
    iput v9, v5, La/mru0;->j:I

    .line 358
    .line 359
    iput v7, v5, La/mru0;->k:I

    .line 360
    .line 361
    iput v8, v5, La/mru0;->l:I

    .line 362
    .line 363
    const/4 v15, 0x2

    .line 364
    iput v15, v5, La/mru0;->u:I

    .line 365
    .line 366
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    if-ne v0, v3, :cond_a

    .line 371
    .line 372
    goto :goto_a

    .line 373
    :cond_9
    move/from16 v9, p0

    .line 374
    .line 375
    const/4 v15, 0x2

    .line 376
    new-instance v12, La/el50;

    .line 377
    .line 378
    invoke-direct {v12, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    :cond_a
    :goto_8
    move v0, v8

    .line 382
    move v8, v9

    .line 383
    goto :goto_6

    .line 384
    :cond_b
    move v9, v8

    .line 385
    const/4 v15, 0x2

    .line 386
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 387
    .line 388
    .line 389
    move-result v8

    .line 390
    if-eqz v8, :cond_e

    .line 391
    .line 392
    move/from16 p0, v9

    .line 393
    .line 394
    int-to-long v8, v7

    .line 395
    cmp-long v8, v8, v13

    .line 396
    .line 397
    if-gez v8, :cond_c

    .line 398
    .line 399
    const/4 v8, 0x1

    .line 400
    goto :goto_9

    .line 401
    :cond_c
    const/4 v8, 0x0

    .line 402
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 403
    .line 404
    if-eqz v8, :cond_d

    .line 405
    .line 406
    iput-object v4, v5, La/mru0;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 407
    .line 408
    iput-object v2, v5, La/mru0;->n:La/nru0;

    .line 409
    .line 410
    iput-object v6, v5, La/mru0;->o:La/mru0;

    .line 411
    .line 412
    iput-object v12, v5, La/mru0;->p:Ljava/lang/Throwable;

    .line 413
    .line 414
    iput v1, v5, La/mru0;->i:I

    .line 415
    .line 416
    iput-wide v13, v5, La/mru0;->q:J

    .line 417
    .line 418
    iput-wide v10, v5, La/mru0;->r:J

    .line 419
    .line 420
    move/from16 v9, p0

    .line 421
    .line 422
    iput v9, v5, La/mru0;->j:I

    .line 423
    .line 424
    iput v7, v5, La/mru0;->k:I

    .line 425
    .line 426
    iput v8, v5, La/mru0;->l:I

    .line 427
    .line 428
    const/4 v15, 0x3

    .line 429
    iput v15, v5, La/mru0;->u:I

    .line 430
    .line 431
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    if-ne v0, v3, :cond_a

    .line 436
    .line 437
    :goto_a
    return-object v3

    .line 438
    :cond_d
    move/from16 v9, p0

    .line 439
    .line 440
    const/4 v15, 0x3

    .line 441
    new-instance v12, La/dag0;

    .line 442
    .line 443
    invoke-direct {v12, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    goto :goto_8

    .line 447
    :cond_e
    const/4 v15, 0x3

    .line 448
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 449
    .line 450
    .line 451
    move-object v12, v0

    .line 452
    move v8, v9

    .line 453
    goto/16 :goto_5

    .line 454
    .line 455
    :cond_f
    if-nez v12, :cond_10

    .line 456
    .line 457
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 458
    .line 459
    const-string v1, "Unexpected error"

    .line 460
    .line 461
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    throw v0

    .line 465
    :cond_10
    throw v12
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 466
    :catchall_3
    move-exception v0

    .line 467
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 468
    .line 469
    new-instance v15, La/g0g0;

    .line 470
    .line 471
    invoke-direct {v15, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 472
    .line 473
    .line 474
    :goto_b
    return-object v15
.end method
