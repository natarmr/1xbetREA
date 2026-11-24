.class public final La/j400;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/f400;

.field public final b:La/btt0;

.field public final c:La/e400;

.field public final d:La/mne;

.field public final e:La/kuy;

.field public final f:La/sje;

.field public g:La/bby;

.field public h:La/bby;

.field public i:J

.field public j:J

.field public k:La/plq0;

.field public l:La/plq0;


# direct methods
.method public constructor <init>(La/f400;La/btt0;La/e400;La/mne;La/kuy;)V
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
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/j400;->a:La/f400;

    .line 17
    .line 18
    iput-object p2, p0, La/j400;->b:La/btt0;

    .line 19
    .line 20
    iput-object p3, p0, La/j400;->c:La/e400;

    .line 21
    .line 22
    iput-object p4, p0, La/j400;->d:La/mne;

    .line 23
    .line 24
    iput-object p5, p0, La/j400;->e:La/kuy;

    .line 25
    .line 26
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object p2, p4, La/mne;->b:La/dvj;

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, La/j400;->f:La/sje;

    .line 41
    .line 42
    sget-object p1, La/wen;->b:La/uen;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const-wide/16 p1, 0x0

    .line 48
    .line 49
    iput-wide p1, p0, La/j400;->i:J

    .line 50
    .line 51
    iput-wide p1, p0, La/j400;->j:J

    .line 52
    .line 53
    sget-object p1, La/qlq0;->a:La/qlq0;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object p1, La/rq40;->a:La/rq40;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {}, La/rq40;->b()J

    .line 64
    .line 65
    .line 66
    move-result-wide p1

    .line 67
    new-instance p3, La/plq0;

    .line 68
    .line 69
    invoke-direct {p3, p1, p2}, La/plq0;-><init>(J)V

    .line 70
    .line 71
    .line 72
    iput-object p3, p0, La/j400;->k:La/plq0;

    .line 73
    .line 74
    invoke-static {}, La/rq40;->b()J

    .line 75
    .line 76
    .line 77
    move-result-wide p1

    .line 78
    new-instance p3, La/plq0;

    .line 79
    .line 80
    invoke-direct {p3, p1, p2}, La/plq0;-><init>(J)V

    .line 81
    .line 82
    .line 83
    iput-object p3, p0, La/j400;->l:La/plq0;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, La/g400;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/g400;

    .line 11
    .line 12
    iget v3, v2, La/g400;->r:I

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
    iput v3, v2, La/g400;->r:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/g400;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/g400;-><init>(La/j400;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/g400;->p:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/g400;->r:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x1

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    if-eq v4, v9, :cond_3

    .line 42
    .line 43
    if-eq v4, v6, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    iget v4, v2, La/g400;->o:I

    .line 48
    .line 49
    iget v10, v2, La/g400;->n:I

    .line 50
    .line 51
    iget v11, v2, La/g400;->m:I

    .line 52
    .line 53
    iget-wide v12, v2, La/g400;->l:J

    .line 54
    .line 55
    iget-wide v14, v2, La/g400;->k:J

    .line 56
    .line 57
    const/16 p2, 0x0

    .line 58
    .line 59
    iget-object v7, v2, La/g400;->j:Ljava/lang/Throwable;

    .line 60
    .line 61
    iget-object v5, v2, La/g400;->i:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move v0, v4

    .line 67
    move v9, v6

    .line 68
    move v8, v11

    .line 69
    move-wide v11, v12

    .line 70
    move-wide v13, v14

    .line 71
    move-object v4, v2

    .line 72
    move-object v2, v5

    .line 73
    move v5, v10

    .line 74
    move-object v10, v7

    .line 75
    const/4 v7, 0x3

    .line 76
    goto/16 :goto_1e

    .line 77
    .line 78
    :cond_1
    const/16 p2, 0x0

    .line 79
    .line 80
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object p2

    .line 86
    :cond_2
    const/16 p2, 0x0

    .line 87
    .line 88
    iget v4, v2, La/g400;->o:I

    .line 89
    .line 90
    iget v5, v2, La/g400;->n:I

    .line 91
    .line 92
    iget v7, v2, La/g400;->m:I

    .line 93
    .line 94
    iget-wide v10, v2, La/g400;->l:J

    .line 95
    .line 96
    iget-wide v12, v2, La/g400;->k:J

    .line 97
    .line 98
    iget-object v14, v2, La/g400;->j:Ljava/lang/Throwable;

    .line 99
    .line 100
    iget-object v15, v2, La/g400;->i:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-wide/from16 v39, v10

    .line 106
    .line 107
    move-object v10, v14

    .line 108
    move-wide v13, v12

    .line 109
    move-wide/from16 v11, v39

    .line 110
    .line 111
    move v0, v4

    .line 112
    move v9, v6

    .line 113
    move-object v4, v2

    .line 114
    move-object v2, v15

    .line 115
    goto/16 :goto_1a

    .line 116
    .line 117
    :cond_3
    const/16 p2, 0x0

    .line 118
    .line 119
    iget v4, v2, La/g400;->n:I

    .line 120
    .line 121
    iget v5, v2, La/g400;->m:I

    .line 122
    .line 123
    iget-wide v10, v2, La/g400;->l:J

    .line 124
    .line 125
    iget-wide v12, v2, La/g400;->k:J

    .line 126
    .line 127
    iget-object v7, v2, La/g400;->j:Ljava/lang/Throwable;

    .line 128
    .line 129
    iget-object v14, v2, La/g400;->i:Ljava/lang/String;

    .line 130
    .line 131
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    .line 134
    goto/16 :goto_2

    .line 135
    .line 136
    :catchall_0
    move-exception v0

    .line 137
    move/from16 v39, v4

    .line 138
    .line 139
    move-object v4, v2

    .line 140
    move-object v2, v14

    .line 141
    move-wide v13, v12

    .line 142
    move-wide v11, v10

    .line 143
    move-object v10, v7

    .line 144
    move v7, v5

    .line 145
    move/from16 v5, v39

    .line 146
    .line 147
    goto/16 :goto_18

    .line 148
    .line 149
    :cond_4
    const/16 p2, 0x0

    .line 150
    .line 151
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    sget-wide v4, La/cag0;->a:J

    .line 155
    .line 156
    const-wide/16 v10, 0x3

    .line 157
    .line 158
    move v0, v9

    .line 159
    move v7, v0

    .line 160
    move-wide v13, v10

    .line 161
    move-object/from16 v10, p2

    .line 162
    .line 163
    move-wide v11, v4

    .line 164
    move v5, v8

    .line 165
    move-object v4, v2

    .line 166
    move-object/from16 v2, p1

    .line 167
    .line 168
    :goto_1
    if-eqz v0, :cond_38

    .line 169
    .line 170
    :try_start_1
    iget-object v15, v1, La/j400;->a:La/f400;

    .line 171
    .line 172
    iget-object v6, v1, La/j400;->b:La/btt0;

    .line 173
    .line 174
    invoke-virtual {v6}, La/btt0;->a()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    iput-object v2, v4, La/g400;->i:Ljava/lang/String;

    .line 179
    .line 180
    iput-object v10, v4, La/g400;->j:Ljava/lang/Throwable;

    .line 181
    .line 182
    iput-wide v13, v4, La/g400;->k:J

    .line 183
    .line 184
    iput-wide v11, v4, La/g400;->l:J

    .line 185
    .line 186
    iput v7, v4, La/g400;->m:I

    .line 187
    .line 188
    iput v5, v4, La/g400;->n:I

    .line 189
    .line 190
    iput v0, v4, La/g400;->o:I

    .line 191
    .line 192
    iput v9, v4, La/g400;->r:I

    .line 193
    .line 194
    iget-object v0, v15, La/f400;->a:La/tpv;

    .line 195
    .line 196
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, La/y300;

    .line 201
    .line 202
    invoke-interface {v0, v6, v2, v4}, La/y300;->a(Ljava/lang/String;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 206
    if-ne v0, v3, :cond_5

    .line 207
    .line 208
    goto/16 :goto_1d

    .line 209
    .line 210
    :cond_5
    move-wide/from16 v39, v13

    .line 211
    .line 212
    move-object v14, v2

    .line 213
    move-object v2, v4

    .line 214
    move v4, v5

    .line 215
    move v5, v7

    .line 216
    move-object v7, v10

    .line 217
    move-wide v10, v11

    .line 218
    move-wide/from16 v12, v39

    .line 219
    .line 220
    :goto_2
    :try_start_2
    check-cast v0, La/dx5;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 221
    .line 222
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, La/k300;

    .line 227
    .line 228
    iget-object v2, v0, La/k300;->a:Ljava/util/List;

    .line 229
    .line 230
    if-nez v2, :cond_6

    .line 231
    .line 232
    sget-object v2, La/iun;->a:La/iun;

    .line 233
    .line 234
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 235
    .line 236
    const/16 v4, 0xa

    .line 237
    .line 238
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 243
    .line 244
    .line 245
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-eqz v5, :cond_1e

    .line 254
    .line 255
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    check-cast v5, La/go40;

    .line 260
    .line 261
    iget-object v10, v5, La/go40;->a:Ljava/lang/Integer;

    .line 262
    .line 263
    if-eqz v10, :cond_1d

    .line 264
    .line 265
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    invoke-static {v10}, La/tlb;->T(I)La/xrz;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    instance-of v10, v13, La/uvj;

    .line 274
    .line 275
    if-nez v10, :cond_1c

    .line 276
    .line 277
    invoke-interface {v13}, La/xrz;->a()La/bnz;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    iget-object v14, v5, La/go40;->b:Ljava/lang/String;

    .line 282
    .line 283
    if-eqz v14, :cond_1b

    .line 284
    .line 285
    iget-object v10, v5, La/go40;->d:Ljava/lang/Double;

    .line 286
    .line 287
    if-eqz v10, :cond_7

    .line 288
    .line 289
    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    .line 290
    .line 291
    .line 292
    move-result-wide v10

    .line 293
    :goto_4
    move-wide v15, v10

    .line 294
    goto :goto_5

    .line 295
    :cond_7
    const-wide/16 v10, 0x0

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :goto_5
    iget-object v10, v5, La/go40;->e:Ljava/lang/Boolean;

    .line 299
    .line 300
    if-eqz v10, :cond_1a

    .line 301
    .line 302
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 303
    .line 304
    .line 305
    move-result v17

    .line 306
    iget-object v10, v5, La/go40;->f:Ljava/lang/Boolean;

    .line 307
    .line 308
    if-eqz v10, :cond_19

    .line 309
    .line 310
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 311
    .line 312
    .line 313
    move-result v18

    .line 314
    iget-object v10, v5, La/go40;->g:Ljava/lang/Boolean;

    .line 315
    .line 316
    if-eqz v10, :cond_18

    .line 317
    .line 318
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 319
    .line 320
    .line 321
    move-result v19

    .line 322
    sget-object v10, La/krz;->a:La/gst;

    .line 323
    .line 324
    iget-object v11, v5, La/go40;->h:Ljava/lang/String;

    .line 325
    .line 326
    if-eqz v11, :cond_17

    .line 327
    .line 328
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-static {v11}, La/gst;->g(Ljava/lang/String;)La/krz;

    .line 332
    .line 333
    .line 334
    move-result-object v20

    .line 335
    iget-object v10, v5, La/go40;->i:Ljava/lang/Long;

    .line 336
    .line 337
    if-eqz v10, :cond_8

    .line 338
    .line 339
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 340
    .line 341
    .line 342
    move-result-wide v10

    .line 343
    move-wide/from16 v21, v10

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_8
    const-wide/16 v21, 0x0

    .line 347
    .line 348
    :goto_6
    iget-object v10, v5, La/go40;->j:Ljava/lang/Long;

    .line 349
    .line 350
    if-eqz v10, :cond_9

    .line 351
    .line 352
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 353
    .line 354
    .line 355
    move-result-wide v10

    .line 356
    move-wide/from16 v23, v10

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_9
    const-wide/16 v23, 0x0

    .line 360
    .line 361
    :goto_7
    iget-object v10, v5, La/go40;->k:Ljava/lang/Long;

    .line 362
    .line 363
    if-eqz v10, :cond_a

    .line 364
    .line 365
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 366
    .line 367
    .line 368
    move-result-wide v10

    .line 369
    move-wide/from16 v25, v10

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_a
    const-wide/16 v25, 0x0

    .line 373
    .line 374
    :goto_8
    iget-object v10, v5, La/go40;->l:Ljava/lang/Long;

    .line 375
    .line 376
    if-eqz v10, :cond_b

    .line 377
    .line 378
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 379
    .line 380
    .line 381
    move-result-wide v10

    .line 382
    move-wide/from16 v27, v10

    .line 383
    .line 384
    goto :goto_9

    .line 385
    :cond_b
    const-wide/16 v27, 0x0

    .line 386
    .line 387
    :goto_9
    iget-object v10, v5, La/go40;->m:Ljava/lang/Long;

    .line 388
    .line 389
    if-eqz v10, :cond_c

    .line 390
    .line 391
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 392
    .line 393
    .line 394
    move-result-wide v10

    .line 395
    move-wide/from16 v29, v10

    .line 396
    .line 397
    goto :goto_a

    .line 398
    :cond_c
    const-wide/16 v29, 0x0

    .line 399
    .line 400
    :goto_a
    iget-object v10, v5, La/go40;->n:Ljava/lang/Boolean;

    .line 401
    .line 402
    if-eqz v10, :cond_d

    .line 403
    .line 404
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 405
    .line 406
    .line 407
    move-result v10

    .line 408
    move/from16 v31, v10

    .line 409
    .line 410
    goto :goto_b

    .line 411
    :cond_d
    move/from16 v31, v8

    .line 412
    .line 413
    :goto_b
    iget-object v10, v5, La/go40;->o:Ljava/lang/Long;

    .line 414
    .line 415
    if-eqz v10, :cond_e

    .line 416
    .line 417
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 418
    .line 419
    .line 420
    move-result-wide v10

    .line 421
    move-wide/from16 v32, v10

    .line 422
    .line 423
    goto :goto_c

    .line 424
    :cond_e
    const-wide/16 v32, 0x0

    .line 425
    .line 426
    :goto_c
    iget-object v10, v5, La/go40;->p:Ljava/lang/Long;

    .line 427
    .line 428
    if-eqz v10, :cond_f

    .line 429
    .line 430
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 431
    .line 432
    .line 433
    move-result-wide v6

    .line 434
    move-wide/from16 v34, v6

    .line 435
    .line 436
    goto :goto_d

    .line 437
    :cond_f
    const-wide/16 v34, 0x0

    .line 438
    .line 439
    :goto_d
    iget-object v6, v5, La/go40;->q:Ljava/util/List;

    .line 440
    .line 441
    if-eqz v6, :cond_12

    .line 442
    .line 443
    new-instance v7, Ljava/util/ArrayList;

    .line 444
    .line 445
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 446
    .line 447
    .line 448
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    :cond_10
    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v10

    .line 456
    if-eqz v10, :cond_13

    .line 457
    .line 458
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v10

    .line 462
    check-cast v10, La/o95;

    .line 463
    .line 464
    if-eqz v10, :cond_11

    .line 465
    .line 466
    invoke-static {v10, v8}, La/p7x;->J(La/o95;Z)La/v85;

    .line 467
    .line 468
    .line 469
    move-result-object v10

    .line 470
    goto :goto_f

    .line 471
    :cond_11
    move-object/from16 v10, p2

    .line 472
    .line 473
    :goto_f
    if-eqz v10, :cond_10

    .line 474
    .line 475
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    goto :goto_e

    .line 479
    :cond_12
    move-object/from16 v7, p2

    .line 480
    .line 481
    :cond_13
    if-nez v7, :cond_14

    .line 482
    .line 483
    sget-object v7, La/iun;->a:La/iun;

    .line 484
    .line 485
    :cond_14
    move-object/from16 v36, v7

    .line 486
    .line 487
    iget-object v6, v5, La/go40;->r:La/yl;

    .line 488
    .line 489
    if-eqz v6, :cond_15

    .line 490
    .line 491
    invoke-static {v6}, La/p7x;->I(La/yl;)La/sl;

    .line 492
    .line 493
    .line 494
    move-result-object v6

    .line 495
    move-object/from16 v37, v6

    .line 496
    .line 497
    goto :goto_10

    .line 498
    :cond_15
    move-object/from16 v37, p2

    .line 499
    .line 500
    :goto_10
    iget-object v5, v5, La/go40;->s:Ljava/lang/Boolean;

    .line 501
    .line 502
    if-eqz v5, :cond_16

    .line 503
    .line 504
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 505
    .line 506
    .line 507
    move-result v38

    .line 508
    new-instance v11, La/pcq;

    .line 509
    .line 510
    invoke-direct/range {v11 .. v38}, La/pcq;-><init>(La/bnz;La/xrz;Ljava/lang/String;DZZZLa/krz;JJJJJZJJLjava/util/List;La/sl;Z)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 514
    .line 515
    .line 516
    goto/16 :goto_3

    .line 517
    .line 518
    :cond_16
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    return-object p2

    .line 522
    :cond_17
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    return-object p2

    .line 526
    :cond_18
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    return-object p2

    .line 530
    :cond_19
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    return-object p2

    .line 534
    :cond_1a
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    return-object p2

    .line 538
    :cond_1b
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    return-object p2

    .line 542
    :cond_1c
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    return-object p2

    .line 546
    :cond_1d
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    return-object p2

    .line 550
    :cond_1e
    iget-object v0, v0, La/k300;->b:Ljava/util/List;

    .line 551
    .line 552
    if-nez v0, :cond_1f

    .line 553
    .line 554
    sget-object v0, La/iun;->a:La/iun;

    .line 555
    .line 556
    :cond_1f
    new-instance v2, Ljava/util/ArrayList;

    .line 557
    .line 558
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 563
    .line 564
    .line 565
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 570
    .line 571
    .line 572
    move-result v4

    .line 573
    if-eqz v4, :cond_2e

    .line 574
    .line 575
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    check-cast v4, La/fjq0;

    .line 580
    .line 581
    iget-object v5, v4, La/fjq0;->a:Ljava/lang/Integer;

    .line 582
    .line 583
    if-eqz v5, :cond_2d

    .line 584
    .line 585
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 586
    .line 587
    .line 588
    move-result v5

    .line 589
    invoke-static {v5}, La/tlb;->T(I)La/xrz;

    .line 590
    .line 591
    .line 592
    move-result-object v12

    .line 593
    invoke-interface {v12}, La/xrz;->a()La/bnz;

    .line 594
    .line 595
    .line 596
    move-result-object v11

    .line 597
    iget-object v5, v4, La/fjq0;->d:Ljava/lang/Long;

    .line 598
    .line 599
    if-eqz v5, :cond_20

    .line 600
    .line 601
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 602
    .line 603
    .line 604
    move-result-wide v13

    .line 605
    goto :goto_12

    .line 606
    :cond_20
    const-wide/16 v13, 0x0

    .line 607
    .line 608
    :goto_12
    iget-object v5, v4, La/fjq0;->e:Ljava/lang/Long;

    .line 609
    .line 610
    if-eqz v5, :cond_21

    .line 611
    .line 612
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 613
    .line 614
    .line 615
    move-result-wide v15

    .line 616
    goto :goto_13

    .line 617
    :cond_21
    const-wide/16 v15, 0x0

    .line 618
    .line 619
    :goto_13
    iget-object v5, v4, La/fjq0;->f:Ljava/lang/Boolean;

    .line 620
    .line 621
    if-eqz v5, :cond_22

    .line 622
    .line 623
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 624
    .line 625
    .line 626
    move-result v5

    .line 627
    move/from16 v17, v5

    .line 628
    .line 629
    goto :goto_14

    .line 630
    :cond_22
    move/from16 v17, v8

    .line 631
    .line 632
    :goto_14
    iget-object v5, v4, La/fjq0;->g:Ljava/lang/Boolean;

    .line 633
    .line 634
    if-eqz v5, :cond_2c

    .line 635
    .line 636
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 637
    .line 638
    .line 639
    move-result v18

    .line 640
    iget-object v5, v4, La/fjq0;->h:Ljava/lang/Boolean;

    .line 641
    .line 642
    if-eqz v5, :cond_2b

    .line 643
    .line 644
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 645
    .line 646
    .line 647
    move-result v19

    .line 648
    sget-object v5, La/krz;->a:La/gst;

    .line 649
    .line 650
    iget-object v10, v4, La/fjq0;->i:Ljava/lang/String;

    .line 651
    .line 652
    if-eqz v10, :cond_2a

    .line 653
    .line 654
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    invoke-static {v10}, La/gst;->g(Ljava/lang/String;)La/krz;

    .line 658
    .line 659
    .line 660
    move-result-object v20

    .line 661
    iget-object v5, v4, La/fjq0;->l:Ljava/util/List;

    .line 662
    .line 663
    if-eqz v5, :cond_25

    .line 664
    .line 665
    new-instance v10, Ljava/util/ArrayList;

    .line 666
    .line 667
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 668
    .line 669
    .line 670
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 671
    .line 672
    .line 673
    move-result-object v5

    .line 674
    :cond_23
    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 675
    .line 676
    .line 677
    move-result v21

    .line 678
    if-eqz v21, :cond_26

    .line 679
    .line 680
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v21

    .line 684
    move-object/from16 v6, v21

    .line 685
    .line 686
    check-cast v6, La/o95;

    .line 687
    .line 688
    if-eqz v6, :cond_24

    .line 689
    .line 690
    invoke-static {v6, v9}, La/p7x;->J(La/o95;Z)La/v85;

    .line 691
    .line 692
    .line 693
    move-result-object v6

    .line 694
    goto :goto_16

    .line 695
    :cond_24
    move-object/from16 v6, p2

    .line 696
    .line 697
    :goto_16
    if-eqz v6, :cond_23

    .line 698
    .line 699
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    goto :goto_15

    .line 703
    :cond_25
    move-object/from16 v10, p2

    .line 704
    .line 705
    :cond_26
    if-nez v10, :cond_27

    .line 706
    .line 707
    sget-object v10, La/iun;->a:La/iun;

    .line 708
    .line 709
    :cond_27
    move-object/from16 v21, v10

    .line 710
    .line 711
    iget-object v5, v4, La/fjq0;->m:La/yl;

    .line 712
    .line 713
    if-eqz v5, :cond_28

    .line 714
    .line 715
    invoke-static {v5}, La/p7x;->I(La/yl;)La/sl;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    move-object/from16 v22, v5

    .line 720
    .line 721
    goto :goto_17

    .line 722
    :cond_28
    move-object/from16 v22, p2

    .line 723
    .line 724
    :goto_17
    iget-object v4, v4, La/fjq0;->n:Ljava/lang/Boolean;

    .line 725
    .line 726
    if-eqz v4, :cond_29

    .line 727
    .line 728
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 729
    .line 730
    .line 731
    move-result v23

    .line 732
    new-instance v10, La/niq0;

    .line 733
    .line 734
    invoke-direct/range {v10 .. v23}, La/niq0;-><init>(La/bnz;La/xrz;JJZZZLa/krz;Ljava/util/List;La/sl;Z)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    goto/16 :goto_11

    .line 741
    .line 742
    :cond_29
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    return-object p2

    .line 746
    :cond_2a
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 747
    .line 748
    .line 749
    return-object p2

    .line 750
    :cond_2b
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    return-object p2

    .line 754
    :cond_2c
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    return-object p2

    .line 758
    :cond_2d
    invoke-static/range {p2 .. p2}, La/jf4;->k(Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    return-object p2

    .line 762
    :cond_2e
    new-instance v0, La/fzz;

    .line 763
    .line 764
    invoke-direct {v0, v3, v2}, La/fzz;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 765
    .line 766
    .line 767
    iget-object v1, v1, La/j400;->c:La/e400;

    .line 768
    .line 769
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    iput-object v0, v1, La/e400;->a:La/fzz;

    .line 773
    .line 774
    return-object v0

    .line 775
    :catchall_1
    move-exception v0

    .line 776
    :goto_18
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 777
    .line 778
    .line 779
    move-result v6

    .line 780
    if-eqz v6, :cond_33

    .line 781
    .line 782
    if-nez v7, :cond_2f

    .line 783
    .line 784
    new-instance v10, La/el50;

    .line 785
    .line 786
    invoke-direct {v10, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 787
    .line 788
    .line 789
    move v0, v8

    .line 790
    const/4 v6, 0x2

    .line 791
    goto/16 :goto_1

    .line 792
    .line 793
    :cond_2f
    int-to-long v8, v5

    .line 794
    cmp-long v8, v8, v13

    .line 795
    .line 796
    if-gez v8, :cond_30

    .line 797
    .line 798
    const/4 v8, 0x1

    .line 799
    goto :goto_19

    .line 800
    :cond_30
    const/4 v8, 0x0

    .line 801
    :goto_19
    add-int/lit8 v5, v5, 0x1

    .line 802
    .line 803
    if-eqz v8, :cond_31

    .line 804
    .line 805
    iput-object v2, v4, La/g400;->i:Ljava/lang/String;

    .line 806
    .line 807
    iput-object v10, v4, La/g400;->j:Ljava/lang/Throwable;

    .line 808
    .line 809
    iput-wide v13, v4, La/g400;->k:J

    .line 810
    .line 811
    iput-wide v11, v4, La/g400;->l:J

    .line 812
    .line 813
    iput v7, v4, La/g400;->m:I

    .line 814
    .line 815
    iput v5, v4, La/g400;->n:I

    .line 816
    .line 817
    iput v8, v4, La/g400;->o:I

    .line 818
    .line 819
    const/4 v9, 0x2

    .line 820
    iput v9, v4, La/g400;->r:I

    .line 821
    .line 822
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    if-ne v0, v3, :cond_32

    .line 827
    .line 828
    goto :goto_1d

    .line 829
    :goto_1a
    move v6, v9

    .line 830
    :goto_1b
    const/4 v8, 0x0

    .line 831
    const/4 v9, 0x1

    .line 832
    goto/16 :goto_1

    .line 833
    .line 834
    :cond_31
    const/4 v9, 0x2

    .line 835
    new-instance v10, La/el50;

    .line 836
    .line 837
    invoke-direct {v10, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 838
    .line 839
    .line 840
    :cond_32
    move v0, v8

    .line 841
    goto :goto_1a

    .line 842
    :cond_33
    const/4 v9, 0x2

    .line 843
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 844
    .line 845
    .line 846
    move-result v8

    .line 847
    if-eqz v8, :cond_37

    .line 848
    .line 849
    move v8, v7

    .line 850
    int-to-long v6, v5

    .line 851
    cmp-long v6, v6, v13

    .line 852
    .line 853
    if-gez v6, :cond_34

    .line 854
    .line 855
    const/4 v6, 0x1

    .line 856
    goto :goto_1c

    .line 857
    :cond_34
    const/4 v6, 0x0

    .line 858
    :goto_1c
    add-int/lit8 v5, v5, 0x1

    .line 859
    .line 860
    if-eqz v6, :cond_35

    .line 861
    .line 862
    iput-object v2, v4, La/g400;->i:Ljava/lang/String;

    .line 863
    .line 864
    iput-object v10, v4, La/g400;->j:Ljava/lang/Throwable;

    .line 865
    .line 866
    iput-wide v13, v4, La/g400;->k:J

    .line 867
    .line 868
    iput-wide v11, v4, La/g400;->l:J

    .line 869
    .line 870
    iput v8, v4, La/g400;->m:I

    .line 871
    .line 872
    iput v5, v4, La/g400;->n:I

    .line 873
    .line 874
    iput v6, v4, La/g400;->o:I

    .line 875
    .line 876
    const/4 v7, 0x3

    .line 877
    iput v7, v4, La/g400;->r:I

    .line 878
    .line 879
    invoke-static {v11, v12, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    if-ne v0, v3, :cond_36

    .line 884
    .line 885
    :goto_1d
    return-object v3

    .line 886
    :goto_1e
    move v7, v8

    .line 887
    goto :goto_1a

    .line 888
    :cond_35
    const/4 v7, 0x3

    .line 889
    new-instance v10, La/dag0;

    .line 890
    .line 891
    invoke-direct {v10, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 892
    .line 893
    .line 894
    :cond_36
    move v0, v6

    .line 895
    goto :goto_1e

    .line 896
    :cond_37
    move v8, v7

    .line 897
    const/4 v7, 0x3

    .line 898
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 899
    .line 900
    .line 901
    move-object v10, v0

    .line 902
    move v7, v8

    .line 903
    move v6, v9

    .line 904
    const/4 v0, 0x0

    .line 905
    goto :goto_1b

    .line 906
    :cond_38
    if-nez v10, :cond_39

    .line 907
    .line 908
    const-string v0, "Unexpected error"

    .line 909
    .line 910
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    return-object p2

    .line 914
    :cond_39
    throw v10
.end method

.method public final b(IJLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    instance-of v2, v0, La/h400;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/h400;

    .line 11
    .line 12
    iget v3, v2, La/h400;->t:I

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
    iput v3, v2, La/h400;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/h400;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/h400;-><init>(La/j400;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/h400;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/h400;->t:I

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
    iget v4, v2, La/h400;->o:I

    .line 47
    .line 48
    iget v10, v2, La/h400;->n:I

    .line 49
    .line 50
    iget v11, v2, La/h400;->m:I

    .line 51
    .line 52
    iget-wide v12, v2, La/h400;->k:J

    .line 53
    .line 54
    iget-wide v14, v2, La/h400;->j:J

    .line 55
    .line 56
    const/16 p4, 0x0

    .line 57
    .line 58
    iget v7, v2, La/h400;->l:I

    .line 59
    .line 60
    iget-wide v5, v2, La/h400;->i:J

    .line 61
    .line 62
    iget-object v8, v2, La/h400;->q:Ljava/lang/Throwable;

    .line 63
    .line 64
    iget-object v9, v2, La/h400;->p:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move v0, v7

    .line 70
    move-object v7, v2

    .line 71
    move v2, v0

    .line 72
    move-object v1, v3

    .line 73
    move v0, v4

    .line 74
    move-wide v4, v5

    .line 75
    move-object v6, v9

    .line 76
    move v9, v11

    .line 77
    move-wide/from16 v17, v14

    .line 78
    .line 79
    move-object v14, v8

    .line 80
    move v8, v10

    .line 81
    move-wide v10, v12

    .line 82
    move-wide/from16 v12, v17

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/16 p4, 0x0

    .line 86
    .line 87
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object p4

    .line 93
    :cond_2
    const/16 p4, 0x0

    .line 94
    .line 95
    iget v4, v2, La/h400;->o:I

    .line 96
    .line 97
    iget v5, v2, La/h400;->n:I

    .line 98
    .line 99
    iget v6, v2, La/h400;->m:I

    .line 100
    .line 101
    iget-wide v7, v2, La/h400;->k:J

    .line 102
    .line 103
    iget-wide v9, v2, La/h400;->j:J

    .line 104
    .line 105
    iget v11, v2, La/h400;->l:I

    .line 106
    .line 107
    iget-wide v12, v2, La/h400;->i:J

    .line 108
    .line 109
    iget-object v14, v2, La/h400;->q:Ljava/lang/Throwable;

    .line 110
    .line 111
    iget-object v15, v2, La/h400;->p:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v3

    .line 117
    move v0, v4

    .line 118
    move-wide/from16 v17, v7

    .line 119
    .line 120
    move-object v7, v2

    .line 121
    move v8, v5

    .line 122
    move v2, v11

    .line 123
    move-wide v4, v12

    .line 124
    move-wide v12, v9

    .line 125
    move v9, v6

    .line 126
    move-wide/from16 v10, v17

    .line 127
    .line 128
    move-object v6, v15

    .line 129
    :goto_1
    const/4 v15, 0x2

    .line 130
    goto/16 :goto_9

    .line 131
    .line 132
    :cond_3
    const/16 p4, 0x0

    .line 133
    .line 134
    iget v4, v2, La/h400;->n:I

    .line 135
    .line 136
    iget v5, v2, La/h400;->m:I

    .line 137
    .line 138
    iget-wide v6, v2, La/h400;->k:J

    .line 139
    .line 140
    iget-wide v8, v2, La/h400;->j:J

    .line 141
    .line 142
    iget v10, v2, La/h400;->l:I

    .line 143
    .line 144
    iget-wide v11, v2, La/h400;->i:J

    .line 145
    .line 146
    iget-object v13, v2, La/h400;->q:Ljava/lang/Throwable;

    .line 147
    .line 148
    iget-object v14, v2, La/h400;->p:Ljava/lang/String;

    .line 149
    .line 150
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    move-object v1, v3

    .line 154
    const/4 v3, 0x1

    .line 155
    goto/16 :goto_4

    .line 156
    .line 157
    :catchall_0
    move-exception v0

    .line 158
    move-object v1, v3

    .line 159
    const/4 v3, 0x1

    .line 160
    :goto_2
    move-wide/from16 v17, v6

    .line 161
    .line 162
    move-object v7, v2

    .line 163
    move v2, v10

    .line 164
    move-object v6, v14

    .line 165
    move-object v14, v13

    .line 166
    move-wide/from16 v19, v8

    .line 167
    .line 168
    move v8, v4

    .line 169
    move v9, v5

    .line 170
    move-wide v4, v11

    .line 171
    move-wide/from16 v10, v17

    .line 172
    .line 173
    move-wide/from16 v12, v19

    .line 174
    .line 175
    goto/16 :goto_6

    .line 176
    .line 177
    :cond_4
    const/16 p4, 0x0

    .line 178
    .line 179
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    sget-wide v4, La/cag0;->a:J

    .line 183
    .line 184
    const-wide/16 v6, 0x3

    .line 185
    .line 186
    move-object/from16 v14, p4

    .line 187
    .line 188
    move-wide v10, v4

    .line 189
    move-wide v12, v6

    .line 190
    const/4 v0, 0x1

    .line 191
    const/4 v8, 0x0

    .line 192
    const/4 v9, 0x1

    .line 193
    move-wide/from16 v4, p2

    .line 194
    .line 195
    move-object/from16 v6, p5

    .line 196
    .line 197
    move-object v7, v2

    .line 198
    move/from16 v2, p1

    .line 199
    .line 200
    :goto_3
    if-eqz v0, :cond_f

    .line 201
    .line 202
    :try_start_1
    iget-object v15, v1, La/j400;->a:La/f400;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 203
    .line 204
    move-object/from16 v16, v3

    .line 205
    .line 206
    :try_start_2
    iget-object v3, v1, La/j400;->b:La/btt0;

    .line 207
    .line 208
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    new-instance v1, La/qqi0;

    .line 213
    .line 214
    move-object/from16 p1, v3

    .line 215
    .line 216
    new-instance v3, La/lp40;

    .line 217
    .line 218
    invoke-direct {v3, v6, v2, v4, v5}, La/lp40;-><init>(Ljava/lang/String;IJ)V

    .line 219
    .line 220
    .line 221
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-direct {v1, v3}, La/qqi0;-><init>(Ljava/util/List;)V

    .line 226
    .line 227
    .line 228
    iput-object v6, v7, La/h400;->p:Ljava/lang/String;

    .line 229
    .line 230
    iput-object v14, v7, La/h400;->q:Ljava/lang/Throwable;

    .line 231
    .line 232
    iput-wide v4, v7, La/h400;->i:J

    .line 233
    .line 234
    iput v2, v7, La/h400;->l:I

    .line 235
    .line 236
    iput-wide v12, v7, La/h400;->j:J

    .line 237
    .line 238
    iput-wide v10, v7, La/h400;->k:J

    .line 239
    .line 240
    iput v9, v7, La/h400;->m:I

    .line 241
    .line 242
    iput v8, v7, La/h400;->n:I

    .line 243
    .line 244
    iput v0, v7, La/h400;->o:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 245
    .line 246
    const/4 v3, 0x1

    .line 247
    :try_start_3
    iput v3, v7, La/h400;->t:I

    .line 248
    .line 249
    iget-object v0, v15, La/f400;->a:La/tpv;

    .line 250
    .line 251
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    check-cast v0, La/y300;

    .line 256
    .line 257
    move-object/from16 v15, p1

    .line 258
    .line 259
    invoke-interface {v0, v15, v1, v7}, La/y300;->d(Ljava/lang/String;La/qqi0;La/yje;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 263
    move-object/from16 v1, v16

    .line 264
    .line 265
    if-ne v0, v1, :cond_5

    .line 266
    .line 267
    goto/16 :goto_b

    .line 268
    .line 269
    :cond_5
    move-wide/from16 v17, v10

    .line 270
    .line 271
    move v10, v2

    .line 272
    move-object v2, v7

    .line 273
    move-object/from16 v19, v14

    .line 274
    .line 275
    move-object v14, v6

    .line 276
    move-wide/from16 v6, v17

    .line 277
    .line 278
    move-wide/from16 v17, v4

    .line 279
    .line 280
    move v4, v8

    .line 281
    move v5, v9

    .line 282
    move-wide v8, v12

    .line 283
    move-object/from16 v13, v19

    .line 284
    .line 285
    move-wide/from16 v11, v17

    .line 286
    .line 287
    :goto_4
    :try_start_4
    check-cast v0, La/dx5;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 288
    .line 289
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object v0

    .line 295
    :catchall_1
    move-exception v0

    .line 296
    goto/16 :goto_2

    .line 297
    .line 298
    :catchall_2
    move-exception v0

    .line 299
    move-object/from16 v1, v16

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :catchall_3
    move-exception v0

    .line 303
    move-object/from16 v1, v16

    .line 304
    .line 305
    :goto_5
    const/4 v3, 0x1

    .line 306
    goto :goto_6

    .line 307
    :catchall_4
    move-exception v0

    .line 308
    move-object v1, v3

    .line 309
    goto :goto_5

    .line 310
    :goto_6
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 311
    .line 312
    .line 313
    move-result v15

    .line 314
    if-eqz v15, :cond_b

    .line 315
    .line 316
    if-nez v9, :cond_6

    .line 317
    .line 318
    new-instance v14, La/el50;

    .line 319
    .line 320
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    move-object v3, v1

    .line 324
    const/4 v0, 0x0

    .line 325
    :goto_7
    move-object/from16 v1, p0

    .line 326
    .line 327
    goto :goto_3

    .line 328
    :cond_6
    move-wide/from16 p1, v4

    .line 329
    .line 330
    int-to-long v3, v8

    .line 331
    cmp-long v3, v3, v12

    .line 332
    .line 333
    if-gez v3, :cond_7

    .line 334
    .line 335
    const/4 v3, 0x1

    .line 336
    goto :goto_8

    .line 337
    :cond_7
    const/4 v3, 0x0

    .line 338
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 339
    .line 340
    if-eqz v3, :cond_9

    .line 341
    .line 342
    iput-object v6, v7, La/h400;->p:Ljava/lang/String;

    .line 343
    .line 344
    iput-object v14, v7, La/h400;->q:Ljava/lang/Throwable;

    .line 345
    .line 346
    move-wide/from16 v4, p1

    .line 347
    .line 348
    iput-wide v4, v7, La/h400;->i:J

    .line 349
    .line 350
    iput v2, v7, La/h400;->l:I

    .line 351
    .line 352
    iput-wide v12, v7, La/h400;->j:J

    .line 353
    .line 354
    iput-wide v10, v7, La/h400;->k:J

    .line 355
    .line 356
    iput v9, v7, La/h400;->m:I

    .line 357
    .line 358
    iput v8, v7, La/h400;->n:I

    .line 359
    .line 360
    iput v3, v7, La/h400;->o:I

    .line 361
    .line 362
    const/4 v15, 0x2

    .line 363
    iput v15, v7, La/h400;->t:I

    .line 364
    .line 365
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-ne v0, v1, :cond_a

    .line 370
    .line 371
    goto :goto_b

    .line 372
    :cond_8
    :goto_9
    move-object v3, v1

    .line 373
    goto :goto_7

    .line 374
    :cond_9
    move-wide/from16 v4, p1

    .line 375
    .line 376
    const/4 v15, 0x2

    .line 377
    new-instance v14, La/el50;

    .line 378
    .line 379
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 380
    .line 381
    .line 382
    :cond_a
    move v0, v3

    .line 383
    goto :goto_9

    .line 384
    :cond_b
    const/4 v15, 0x2

    .line 385
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    if-eqz v3, :cond_e

    .line 390
    .line 391
    move-object/from16 p1, v0

    .line 392
    .line 393
    move-object/from16 v16, v1

    .line 394
    .line 395
    int-to-long v0, v8

    .line 396
    cmp-long v0, v0, v12

    .line 397
    .line 398
    if-gez v0, :cond_c

    .line 399
    .line 400
    const/4 v0, 0x1

    .line 401
    goto :goto_a

    .line 402
    :cond_c
    const/4 v0, 0x0

    .line 403
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 404
    .line 405
    if-eqz v0, :cond_d

    .line 406
    .line 407
    iput-object v6, v7, La/h400;->p:Ljava/lang/String;

    .line 408
    .line 409
    iput-object v14, v7, La/h400;->q:Ljava/lang/Throwable;

    .line 410
    .line 411
    iput-wide v4, v7, La/h400;->i:J

    .line 412
    .line 413
    iput v2, v7, La/h400;->l:I

    .line 414
    .line 415
    iput-wide v12, v7, La/h400;->j:J

    .line 416
    .line 417
    iput-wide v10, v7, La/h400;->k:J

    .line 418
    .line 419
    iput v9, v7, La/h400;->m:I

    .line 420
    .line 421
    iput v8, v7, La/h400;->n:I

    .line 422
    .line 423
    iput v0, v7, La/h400;->o:I

    .line 424
    .line 425
    const/4 v1, 0x3

    .line 426
    iput v1, v7, La/h400;->t:I

    .line 427
    .line 428
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    move-object/from16 v1, v16

    .line 433
    .line 434
    if-ne v3, v1, :cond_8

    .line 435
    .line 436
    :goto_b
    return-object v1

    .line 437
    :cond_d
    move-object/from16 v1, v16

    .line 438
    .line 439
    new-instance v14, La/dag0;

    .line 440
    .line 441
    move-object/from16 v3, p1

    .line 442
    .line 443
    invoke-direct {v14, v3}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    goto :goto_9

    .line 447
    :cond_e
    move-object v3, v0

    .line 448
    invoke-static {v3}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 449
    .line 450
    .line 451
    move-object v14, v3

    .line 452
    const/4 v0, 0x0

    .line 453
    goto :goto_9

    .line 454
    :cond_f
    if-nez v14, :cond_10

    .line 455
    .line 456
    const-string v0, "Unexpected error"

    .line 457
    .line 458
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    return-object p4

    .line 462
    :cond_10
    throw v14
.end method

.method public final c(IJLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    instance-of v2, v0, La/i400;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/i400;

    .line 11
    .line 12
    iget v3, v2, La/i400;->t:I

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
    iput v3, v2, La/i400;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/i400;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/i400;-><init>(La/j400;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/i400;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/i400;->t:I

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
    iget v4, v2, La/i400;->o:I

    .line 47
    .line 48
    iget v10, v2, La/i400;->n:I

    .line 49
    .line 50
    iget v11, v2, La/i400;->m:I

    .line 51
    .line 52
    iget-wide v12, v2, La/i400;->k:J

    .line 53
    .line 54
    iget-wide v14, v2, La/i400;->j:J

    .line 55
    .line 56
    const/16 p4, 0x0

    .line 57
    .line 58
    iget v7, v2, La/i400;->l:I

    .line 59
    .line 60
    iget-wide v5, v2, La/i400;->i:J

    .line 61
    .line 62
    iget-object v8, v2, La/i400;->q:Ljava/lang/Throwable;

    .line 63
    .line 64
    iget-object v9, v2, La/i400;->p:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move v0, v7

    .line 70
    move-object v7, v2

    .line 71
    move v2, v0

    .line 72
    move-object v1, v3

    .line 73
    move v0, v4

    .line 74
    move-wide v4, v5

    .line 75
    move-object v6, v9

    .line 76
    move v9, v11

    .line 77
    move-wide/from16 v17, v14

    .line 78
    .line 79
    move-object v14, v8

    .line 80
    move v8, v10

    .line 81
    move-wide v10, v12

    .line 82
    move-wide/from16 v12, v17

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const/16 p4, 0x0

    .line 86
    .line 87
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object p4

    .line 93
    :cond_2
    const/16 p4, 0x0

    .line 94
    .line 95
    iget v4, v2, La/i400;->o:I

    .line 96
    .line 97
    iget v5, v2, La/i400;->n:I

    .line 98
    .line 99
    iget v6, v2, La/i400;->m:I

    .line 100
    .line 101
    iget-wide v7, v2, La/i400;->k:J

    .line 102
    .line 103
    iget-wide v9, v2, La/i400;->j:J

    .line 104
    .line 105
    iget v11, v2, La/i400;->l:I

    .line 106
    .line 107
    iget-wide v12, v2, La/i400;->i:J

    .line 108
    .line 109
    iget-object v14, v2, La/i400;->q:Ljava/lang/Throwable;

    .line 110
    .line 111
    iget-object v15, v2, La/i400;->p:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v3

    .line 117
    move v0, v4

    .line 118
    move-wide/from16 v17, v7

    .line 119
    .line 120
    move-object v7, v2

    .line 121
    move v8, v5

    .line 122
    move v2, v11

    .line 123
    move-wide v4, v12

    .line 124
    move-wide v12, v9

    .line 125
    move v9, v6

    .line 126
    move-wide/from16 v10, v17

    .line 127
    .line 128
    move-object v6, v15

    .line 129
    :goto_1
    const/4 v15, 0x2

    .line 130
    goto/16 :goto_7

    .line 131
    .line 132
    :cond_3
    const/16 p4, 0x0

    .line 133
    .line 134
    iget v4, v2, La/i400;->n:I

    .line 135
    .line 136
    iget v5, v2, La/i400;->m:I

    .line 137
    .line 138
    iget-wide v6, v2, La/i400;->k:J

    .line 139
    .line 140
    iget-wide v8, v2, La/i400;->j:J

    .line 141
    .line 142
    iget v10, v2, La/i400;->l:I

    .line 143
    .line 144
    iget-wide v11, v2, La/i400;->i:J

    .line 145
    .line 146
    iget-object v13, v2, La/i400;->q:Ljava/lang/Throwable;

    .line 147
    .line 148
    iget-object v14, v2, La/i400;->p:Ljava/lang/String;

    .line 149
    .line 150
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    .line 152
    .line 153
    move-object v1, v3

    .line 154
    move-object v3, v13

    .line 155
    move-wide/from16 v17, v8

    .line 156
    .line 157
    move-object v8, v14

    .line 158
    move-wide v14, v11

    .line 159
    const/4 v9, 0x1

    .line 160
    move-wide/from16 v12, v17

    .line 161
    .line 162
    goto/16 :goto_3

    .line 163
    .line 164
    :catchall_0
    move-exception v0

    .line 165
    move-object v1, v3

    .line 166
    move v3, v5

    .line 167
    move-wide/from16 v17, v6

    .line 168
    .line 169
    move-object v7, v2

    .line 170
    move v2, v10

    .line 171
    move-object v6, v14

    .line 172
    move-object v14, v13

    .line 173
    move-wide/from16 v19, v8

    .line 174
    .line 175
    move v8, v4

    .line 176
    move-wide v4, v11

    .line 177
    const/4 v9, 0x1

    .line 178
    move-wide/from16 v10, v17

    .line 179
    .line 180
    move-wide/from16 v12, v19

    .line 181
    .line 182
    goto/16 :goto_6

    .line 183
    .line 184
    :cond_4
    const/16 p4, 0x0

    .line 185
    .line 186
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-wide v4, La/cag0;->a:J

    .line 190
    .line 191
    const-wide/16 v6, 0x3

    .line 192
    .line 193
    move-object/from16 v14, p4

    .line 194
    .line 195
    move-wide v10, v4

    .line 196
    move-wide v12, v6

    .line 197
    const/4 v0, 0x1

    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v9, 0x1

    .line 200
    move-wide/from16 v4, p2

    .line 201
    .line 202
    move-object/from16 v6, p5

    .line 203
    .line 204
    move-object v7, v2

    .line 205
    move/from16 v2, p1

    .line 206
    .line 207
    :goto_2
    if-eqz v0, :cond_f

    .line 208
    .line 209
    :try_start_1
    iget-object v15, v1, La/j400;->a:La/f400;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 210
    .line 211
    move-object/from16 v16, v3

    .line 212
    .line 213
    :try_start_2
    iget-object v3, v1, La/j400;->b:La/btt0;

    .line 214
    .line 215
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    new-instance v1, La/oti0;

    .line 220
    .line 221
    move-object/from16 p1, v3

    .line 222
    .line 223
    new-instance v3, La/skq0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 224
    .line 225
    move/from16 p2, v8

    .line 226
    .line 227
    move/from16 p3, v9

    .line 228
    .line 229
    long-to-double v8, v4

    .line 230
    :try_start_3
    invoke-direct {v3, v8, v9, v2, v6}, La/skq0;-><init>(DILjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-direct {v1, v3}, La/oti0;-><init>(Ljava/util/List;)V

    .line 238
    .line 239
    .line 240
    iput-object v6, v7, La/i400;->p:Ljava/lang/String;

    .line 241
    .line 242
    iput-object v14, v7, La/i400;->q:Ljava/lang/Throwable;

    .line 243
    .line 244
    iput-wide v4, v7, La/i400;->i:J

    .line 245
    .line 246
    iput v2, v7, La/i400;->l:I

    .line 247
    .line 248
    iput-wide v12, v7, La/i400;->j:J

    .line 249
    .line 250
    iput-wide v10, v7, La/i400;->k:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 251
    .line 252
    move/from16 v3, p3

    .line 253
    .line 254
    :try_start_4
    iput v3, v7, La/i400;->m:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 255
    .line 256
    move/from16 v8, p2

    .line 257
    .line 258
    :try_start_5
    iput v8, v7, La/i400;->n:I

    .line 259
    .line 260
    iput v0, v7, La/i400;->o:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 261
    .line 262
    const/4 v9, 0x1

    .line 263
    :try_start_6
    iput v9, v7, La/i400;->t:I

    .line 264
    .line 265
    iget-object v0, v15, La/f400;->a:La/tpv;

    .line 266
    .line 267
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    check-cast v0, La/y300;

    .line 272
    .line 273
    move-object/from16 v15, p1

    .line 274
    .line 275
    invoke-interface {v0, v15, v1, v7}, La/y300;->c(Ljava/lang/String;La/oti0;La/yje;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 279
    move-object/from16 v1, v16

    .line 280
    .line 281
    if-ne v0, v1, :cond_5

    .line 282
    .line 283
    goto/16 :goto_b

    .line 284
    .line 285
    :cond_5
    move-wide/from16 v17, v4

    .line 286
    .line 287
    move v5, v3

    .line 288
    move-object v3, v14

    .line 289
    move-wide/from16 v14, v17

    .line 290
    .line 291
    move v4, v8

    .line 292
    move-object v8, v6

    .line 293
    move-wide/from16 v17, v10

    .line 294
    .line 295
    move v10, v2

    .line 296
    move-object v2, v7

    .line 297
    move-wide/from16 v6, v17

    .line 298
    .line 299
    :goto_3
    :try_start_7
    check-cast v0, La/dx5;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 300
    .line 301
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0

    .line 304
    :catchall_1
    move-exception v0

    .line 305
    move-wide/from16 v17, v6

    .line 306
    .line 307
    move-object v7, v2

    .line 308
    move v2, v10

    .line 309
    move-wide/from16 v10, v17

    .line 310
    .line 311
    move-object v6, v8

    .line 312
    move v8, v4

    .line 313
    move-wide/from16 v17, v14

    .line 314
    .line 315
    move-object v14, v3

    .line 316
    move v3, v5

    .line 317
    move-wide/from16 v4, v17

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :catchall_2
    move-exception v0

    .line 321
    move-object/from16 v1, v16

    .line 322
    .line 323
    goto :goto_6

    .line 324
    :catchall_3
    move-exception v0

    .line 325
    :goto_4
    move-object/from16 v1, v16

    .line 326
    .line 327
    :goto_5
    const/4 v9, 0x1

    .line 328
    goto :goto_6

    .line 329
    :catchall_4
    move-exception v0

    .line 330
    move/from16 v8, p2

    .line 331
    .line 332
    goto :goto_4

    .line 333
    :catchall_5
    move-exception v0

    .line 334
    move/from16 v8, p2

    .line 335
    .line 336
    move/from16 v3, p3

    .line 337
    .line 338
    goto :goto_4

    .line 339
    :catchall_6
    move-exception v0

    .line 340
    move v3, v9

    .line 341
    goto :goto_4

    .line 342
    :catchall_7
    move-exception v0

    .line 343
    move-object v1, v3

    .line 344
    move v3, v9

    .line 345
    goto :goto_5

    .line 346
    :goto_6
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 347
    .line 348
    .line 349
    move-result v15

    .line 350
    if-eqz v15, :cond_b

    .line 351
    .line 352
    if-nez v3, :cond_6

    .line 353
    .line 354
    new-instance v14, La/el50;

    .line 355
    .line 356
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    move v9, v3

    .line 360
    const/4 v0, 0x0

    .line 361
    :goto_7
    move-object v3, v1

    .line 362
    move-object/from16 v1, p0

    .line 363
    .line 364
    goto/16 :goto_2

    .line 365
    .line 366
    :cond_6
    move-wide/from16 p1, v10

    .line 367
    .line 368
    int-to-long v9, v8

    .line 369
    cmp-long v9, v9, v12

    .line 370
    .line 371
    if-gez v9, :cond_7

    .line 372
    .line 373
    const/4 v9, 0x1

    .line 374
    goto :goto_8

    .line 375
    :cond_7
    const/4 v9, 0x0

    .line 376
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 377
    .line 378
    if-eqz v9, :cond_9

    .line 379
    .line 380
    iput-object v6, v7, La/i400;->p:Ljava/lang/String;

    .line 381
    .line 382
    iput-object v14, v7, La/i400;->q:Ljava/lang/Throwable;

    .line 383
    .line 384
    iput-wide v4, v7, La/i400;->i:J

    .line 385
    .line 386
    iput v2, v7, La/i400;->l:I

    .line 387
    .line 388
    iput-wide v12, v7, La/i400;->j:J

    .line 389
    .line 390
    move-wide/from16 v10, p1

    .line 391
    .line 392
    iput-wide v10, v7, La/i400;->k:J

    .line 393
    .line 394
    iput v3, v7, La/i400;->m:I

    .line 395
    .line 396
    iput v8, v7, La/i400;->n:I

    .line 397
    .line 398
    iput v9, v7, La/i400;->o:I

    .line 399
    .line 400
    const/4 v15, 0x2

    .line 401
    iput v15, v7, La/i400;->t:I

    .line 402
    .line 403
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    if-ne v0, v1, :cond_8

    .line 408
    .line 409
    goto :goto_b

    .line 410
    :cond_8
    move v0, v9

    .line 411
    goto :goto_9

    .line 412
    :cond_9
    move-wide/from16 v10, p1

    .line 413
    .line 414
    const/4 v15, 0x2

    .line 415
    new-instance v14, La/el50;

    .line 416
    .line 417
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 418
    .line 419
    .line 420
    move v0, v9

    .line 421
    :cond_a
    :goto_9
    move v9, v3

    .line 422
    goto :goto_7

    .line 423
    :cond_b
    const/4 v15, 0x2

    .line 424
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 425
    .line 426
    .line 427
    move-result v9

    .line 428
    if-eqz v9, :cond_e

    .line 429
    .line 430
    move-object/from16 p1, v0

    .line 431
    .line 432
    move-object/from16 v16, v1

    .line 433
    .line 434
    int-to-long v0, v8

    .line 435
    cmp-long v0, v0, v12

    .line 436
    .line 437
    if-gez v0, :cond_c

    .line 438
    .line 439
    const/4 v0, 0x1

    .line 440
    goto :goto_a

    .line 441
    :cond_c
    const/4 v0, 0x0

    .line 442
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 443
    .line 444
    if-eqz v0, :cond_d

    .line 445
    .line 446
    iput-object v6, v7, La/i400;->p:Ljava/lang/String;

    .line 447
    .line 448
    iput-object v14, v7, La/i400;->q:Ljava/lang/Throwable;

    .line 449
    .line 450
    iput-wide v4, v7, La/i400;->i:J

    .line 451
    .line 452
    iput v2, v7, La/i400;->l:I

    .line 453
    .line 454
    iput-wide v12, v7, La/i400;->j:J

    .line 455
    .line 456
    iput-wide v10, v7, La/i400;->k:J

    .line 457
    .line 458
    iput v3, v7, La/i400;->m:I

    .line 459
    .line 460
    iput v8, v7, La/i400;->n:I

    .line 461
    .line 462
    iput v0, v7, La/i400;->o:I

    .line 463
    .line 464
    const/4 v1, 0x3

    .line 465
    iput v1, v7, La/i400;->t:I

    .line 466
    .line 467
    invoke-static {v10, v11, v7}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    move-object/from16 v1, v16

    .line 472
    .line 473
    if-ne v9, v1, :cond_a

    .line 474
    .line 475
    :goto_b
    return-object v1

    .line 476
    :cond_d
    move-object/from16 v1, v16

    .line 477
    .line 478
    new-instance v14, La/dag0;

    .line 479
    .line 480
    move-object/from16 v9, p1

    .line 481
    .line 482
    invoke-direct {v14, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 483
    .line 484
    .line 485
    goto :goto_9

    .line 486
    :cond_e
    move-object v9, v0

    .line 487
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 488
    .line 489
    .line 490
    move-object v14, v9

    .line 491
    const/4 v0, 0x0

    .line 492
    goto :goto_9

    .line 493
    :cond_f
    if-nez v14, :cond_10

    .line 494
    .line 495
    const-string v0, "Unexpected error"

    .line 496
    .line 497
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    return-object p4

    .line 501
    :cond_10
    throw v14
.end method

.method public final d(Z)V
    .locals 14

    .line 1
    iget-object v0, p0, La/j400;->h:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object v0, La/qlq0;->a:La/qlq0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v0, La/rq40;->a:La/rq40;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {}, La/rq40;->b()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    new-instance v2, La/plq0;

    .line 28
    .line 29
    invoke-direct {v2, v0, v1}, La/plq0;-><init>(J)V

    .line 30
    .line 31
    .line 32
    iput-object v2, p0, La/j400;->l:La/plq0;

    .line 33
    .line 34
    const-class v0, La/oqt0;

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    iget-wide v0, p0, La/j400;->j:J

    .line 41
    .line 42
    sget-object v2, La/wen;->b:La/uen;

    .line 43
    .line 44
    sget-object v2, La/bfn;->e:La/bfn;

    .line 45
    .line 46
    const-wide/16 v3, 0x1e

    .line 47
    .line 48
    invoke-static {v3, v4, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    sget-object v5, La/wen;->b:La/uen;

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const-wide/16 v5, 0x0

    .line 58
    .line 59
    invoke-static {v0, v1, v5, v6}, La/wen;->d(JJ)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_1

    .line 64
    .line 65
    const-wide/16 v0, 0x5

    .line 66
    .line 67
    :goto_0
    move-wide v5, v0

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-static {v3, v4, v0, v1}, La/wen;->j(JJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-static {v0, v1, v2}, La/wen;->l(JLa/bfn;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    goto :goto_0

    .line 78
    :goto_1
    iget-object v0, p0, La/j400;->d:La/mne;

    .line 79
    .line 80
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 81
    .line 82
    new-instance v11, La/z8z;

    .line 83
    .line 84
    const/16 v0, 0x15

    .line 85
    .line 86
    invoke-direct {v11, v0}, La/z8z;-><init>(B)V

    .line 87
    .line 88
    .line 89
    new-instance v12, La/u88;

    .line 90
    .line 91
    const/4 v0, 0x0

    .line 92
    const/16 v1, 0x1a

    .line 93
    .line 94
    invoke-direct {v12, p0, p1, v0, v1}, La/u88;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 95
    .line 96
    .line 97
    const/16 v13, 0x10

    .line 98
    .line 99
    iget-object v1, p0, La/j400;->f:La/sje;

    .line 100
    .line 101
    const-string v2, "LimitsRsRepositoryImpl_sendPing"

    .line 102
    .line 103
    const-wide/16 v3, 0x1e

    .line 104
    .line 105
    const-wide/16 v8, 0x1e

    .line 106
    .line 107
    invoke-static/range {v1 .. v13}, La/sac;->d0(La/vne;Ljava/lang/String;JJLkotlin/coroutines/CoroutineContext;JLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, La/j400;->h:La/bby;

    .line 112
    .line 113
    return-void
.end method
