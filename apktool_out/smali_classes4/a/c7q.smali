.class public final La/c7q;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:J

.field public j:J

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:La/h7q;

.field public r:La/ocq;

.field public s:Ljava/lang/Throwable;

.field public t:B

.field public final synthetic u:La/h7q;

.field public final synthetic v:I

.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public constructor <init>(La/h7q;IIILa/yje;)V
    .locals 1

    .line 1
    sget-object v0, La/ocq;->a:La/ocq;

    .line 2
    .line 3
    iput-object p1, p0, La/c7q;->u:La/h7q;

    .line 4
    .line 5
    iput p2, p0, La/c7q;->v:I

    .line 6
    .line 7
    iput p3, p0, La/c7q;->w:I

    .line 8
    .line 9
    iput p4, p0, La/c7q;->x:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/c7q;

    .line 2
    .line 3
    sget-object p1, La/ocq;->a:La/ocq;

    .line 4
    .line 5
    iget v3, p0, La/c7q;->w:I

    .line 6
    .line 7
    iget v4, p0, La/c7q;->x:I

    .line 8
    .line 9
    iget-object v1, p0, La/c7q;->u:La/h7q;

    .line 10
    .line 11
    iget v2, p0, La/c7q;->v:I

    .line 12
    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v0 .. v5}, La/c7q;-><init>(La/h7q;IIILa/yje;)V

    .line 15
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
    invoke-virtual {p0, p1, p2}, La/c7q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/c7q;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c7q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    sget-object v7, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v6, La/c7q;->t:B

    .line 6
    .line 7
    const/4 v8, 0x3

    .line 8
    const/4 v9, 0x2

    .line 9
    const/4 v12, 0x1

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-eq v0, v12, :cond_2

    .line 13
    .line 14
    if-eq v0, v9, :cond_1

    .line 15
    .line 16
    if-ne v0, v8, :cond_0

    .line 17
    .line 18
    iget v0, v6, La/c7q;->p:I

    .line 19
    .line 20
    iget v1, v6, La/c7q;->o:I

    .line 21
    .line 22
    iget v2, v6, La/c7q;->n:I

    .line 23
    .line 24
    iget v3, v6, La/c7q;->m:I

    .line 25
    .line 26
    iget v4, v6, La/c7q;->l:I

    .line 27
    .line 28
    iget v5, v6, La/c7q;->k:I

    .line 29
    .line 30
    iget-wide v13, v6, La/c7q;->j:J

    .line 31
    .line 32
    const/4 v15, 0x0

    .line 33
    iget-wide v10, v6, La/c7q;->i:J

    .line 34
    .line 35
    move-object/from16 v16, v15

    .line 36
    .line 37
    iget-object v15, v6, La/c7q;->s:Ljava/lang/Throwable;

    .line 38
    .line 39
    iget-object v8, v6, La/c7q;->r:La/ocq;

    .line 40
    .line 41
    iget-object v9, v6, La/c7q;->q:La/h7q;

    .line 42
    .line 43
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object/from16 v26, v8

    .line 47
    .line 48
    move v8, v1

    .line 49
    move v1, v4

    .line 50
    move-object v4, v7

    .line 51
    move v7, v2

    .line 52
    move v2, v3

    .line 53
    move-object/from16 v3, v26

    .line 54
    .line 55
    move-object/from16 v26, v9

    .line 56
    .line 57
    move v9, v5

    .line 58
    move-object/from16 v5, v26

    .line 59
    .line 60
    move-wide/from16 v26, v13

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/16 v16, 0x0

    .line 64
    .line 65
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v16

    .line 71
    :cond_1
    const/16 v16, 0x0

    .line 72
    .line 73
    iget v0, v6, La/c7q;->p:I

    .line 74
    .line 75
    iget v1, v6, La/c7q;->o:I

    .line 76
    .line 77
    iget v2, v6, La/c7q;->n:I

    .line 78
    .line 79
    iget v3, v6, La/c7q;->m:I

    .line 80
    .line 81
    iget v4, v6, La/c7q;->l:I

    .line 82
    .line 83
    iget v5, v6, La/c7q;->k:I

    .line 84
    .line 85
    iget-wide v8, v6, La/c7q;->j:J

    .line 86
    .line 87
    iget-wide v10, v6, La/c7q;->i:J

    .line 88
    .line 89
    iget-object v13, v6, La/c7q;->s:Ljava/lang/Throwable;

    .line 90
    .line 91
    iget-object v14, v6, La/c7q;->r:La/ocq;

    .line 92
    .line 93
    iget-object v15, v6, La/c7q;->q:La/h7q;

    .line 94
    .line 95
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-wide/from16 v26, v8

    .line 99
    .line 100
    move v8, v1

    .line 101
    move v1, v4

    .line 102
    move v9, v5

    .line 103
    move-object v4, v7

    .line 104
    move-object v5, v15

    .line 105
    move v7, v2

    .line 106
    move v2, v3

    .line 107
    move-object v15, v13

    .line 108
    move-object v3, v14

    .line 109
    :goto_0
    move-wide v13, v10

    .line 110
    move-wide/from16 v10, v26

    .line 111
    .line 112
    goto/16 :goto_15

    .line 113
    .line 114
    :cond_2
    const/16 v16, 0x0

    .line 115
    .line 116
    iget v1, v6, La/c7q;->o:I

    .line 117
    .line 118
    iget v2, v6, La/c7q;->n:I

    .line 119
    .line 120
    iget v3, v6, La/c7q;->m:I

    .line 121
    .line 122
    iget v4, v6, La/c7q;->l:I

    .line 123
    .line 124
    iget v5, v6, La/c7q;->k:I

    .line 125
    .line 126
    iget-wide v8, v6, La/c7q;->j:J

    .line 127
    .line 128
    iget-wide v10, v6, La/c7q;->i:J

    .line 129
    .line 130
    iget-object v13, v6, La/c7q;->s:Ljava/lang/Throwable;

    .line 131
    .line 132
    iget-object v14, v6, La/c7q;->r:La/ocq;

    .line 133
    .line 134
    iget-object v15, v6, La/c7q;->q:La/h7q;

    .line 135
    .line 136
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    .line 138
    .line 139
    move-object/from16 v0, p1

    .line 140
    .line 141
    move-object v12, v14

    .line 142
    move/from16 v26, v4

    .line 143
    .line 144
    move v4, v3

    .line 145
    move-object v3, v7

    .line 146
    move-object v7, v15

    .line 147
    move-object v15, v13

    .line 148
    move-wide v13, v10

    .line 149
    move-wide v10, v8

    .line 150
    move v9, v5

    .line 151
    move/from16 v5, v26

    .line 152
    .line 153
    goto/16 :goto_3

    .line 154
    .line 155
    :catchall_0
    move-exception v0

    .line 156
    move-object v12, v14

    .line 157
    move-object/from16 v26, v15

    .line 158
    .line 159
    move-object v15, v0

    .line 160
    move-object v0, v13

    .line 161
    move-wide v13, v10

    .line 162
    move-wide v10, v8

    .line 163
    move v8, v1

    .line 164
    move v1, v4

    .line 165
    move v9, v5

    .line 166
    move-object/from16 v5, v26

    .line 167
    .line 168
    move v4, v2

    .line 169
    move v2, v3

    .line 170
    move-object v3, v7

    .line 171
    goto/16 :goto_11

    .line 172
    .line 173
    :cond_3
    const/16 v16, 0x0

    .line 174
    .line 175
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    sget-object v0, La/wen;->b:La/uen;

    .line 179
    .line 180
    const-wide/16 v0, 0x1

    .line 181
    .line 182
    sget-object v2, La/bfn;->e:La/bfn;

    .line 183
    .line 184
    invoke-static {v0, v1, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v0

    .line 188
    sget-object v2, La/ocq;->a:La/ocq;

    .line 189
    .line 190
    iget-object v3, v6, La/c7q;->u:La/h7q;

    .line 191
    .line 192
    iget v4, v6, La/c7q;->v:I

    .line 193
    .line 194
    iget v5, v6, La/c7q;->w:I

    .line 195
    .line 196
    iget v8, v6, La/c7q;->x:I

    .line 197
    .line 198
    const-wide/16 v9, 0x3

    .line 199
    .line 200
    move-object v11, v3

    .line 201
    move-object v3, v2

    .line 202
    move v2, v5

    .line 203
    move-object v5, v11

    .line 204
    move-wide v13, v9

    .line 205
    move v9, v12

    .line 206
    move-object/from16 v15, v16

    .line 207
    .line 208
    move-wide v10, v0

    .line 209
    move v1, v4

    .line 210
    move v4, v8

    .line 211
    move v0, v9

    .line 212
    const/4 v8, 0x0

    .line 213
    :goto_1
    if-eqz v0, :cond_28

    .line 214
    .line 215
    :try_start_1
    iget-object v12, v5, La/h7q;->b:La/a7q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 216
    .line 217
    move-object/from16 v20, v7

    .line 218
    .line 219
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-eqz v7, :cond_5

    .line 224
    .line 225
    move-object/from16 p1, v12

    .line 226
    .line 227
    const/4 v12, 0x1

    .line 228
    if-ne v7, v12, :cond_4

    .line 229
    .line 230
    const/4 v12, 0x2

    .line 231
    goto :goto_2

    .line 232
    :cond_4
    new-instance v0, La/m460;

    .line 233
    .line 234
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 235
    .line 236
    .line 237
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 238
    :cond_5
    move-object/from16 p1, v12

    .line 239
    .line 240
    const/4 v12, 0x1

    .line 241
    :goto_2
    :try_start_3
    iget-object v7, v5, La/h7q;->e:La/knf0;

    .line 242
    .line 243
    invoke-virtual {v7}, La/knf0;->c()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    iput-object v5, v6, La/c7q;->q:La/h7q;

    .line 248
    .line 249
    iput-object v3, v6, La/c7q;->r:La/ocq;

    .line 250
    .line 251
    iput-object v15, v6, La/c7q;->s:Ljava/lang/Throwable;

    .line 252
    .line 253
    iput-wide v13, v6, La/c7q;->i:J

    .line 254
    .line 255
    iput-wide v10, v6, La/c7q;->j:J

    .line 256
    .line 257
    iput v9, v6, La/c7q;->k:I

    .line 258
    .line 259
    iput v1, v6, La/c7q;->l:I

    .line 260
    .line 261
    iput v2, v6, La/c7q;->m:I

    .line 262
    .line 263
    iput v4, v6, La/c7q;->n:I

    .line 264
    .line 265
    iput v8, v6, La/c7q;->o:I

    .line 266
    .line 267
    iput v0, v6, La/c7q;->p:I

    .line 268
    .line 269
    move-object v0, v7

    .line 270
    const/4 v7, 0x1

    .line 271
    iput-byte v7, v6, La/c7q;->t:B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 272
    .line 273
    move-object/from16 v7, p1

    .line 274
    .line 275
    :try_start_4
    iget-object v7, v7, La/a7q;->a:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v7, La/wgn;

    .line 278
    .line 279
    invoke-virtual {v7}, La/wgn;->invoke()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    check-cast v7, La/y5q;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 284
    .line 285
    move-object/from16 v26, v5

    .line 286
    .line 287
    move-object v5, v0

    .line 288
    move-object v0, v7

    .line 289
    move-object/from16 v7, v26

    .line 290
    .line 291
    move/from16 v26, v12

    .line 292
    .line 293
    move-object v12, v3

    .line 294
    move/from16 v3, v26

    .line 295
    .line 296
    :try_start_5
    invoke-interface/range {v0 .. v6}, La/y5q;->b(IIIILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 300
    move-object/from16 v3, v20

    .line 301
    .line 302
    if-ne v0, v3, :cond_6

    .line 303
    .line 304
    move-object v4, v3

    .line 305
    goto/16 :goto_18

    .line 306
    .line 307
    :cond_6
    move v5, v4

    .line 308
    move v4, v2

    .line 309
    move v2, v5

    .line 310
    move v5, v1

    .line 311
    move v1, v8

    .line 312
    :goto_3
    :try_start_6
    check-cast v0, La/rbq;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    iget-object v1, v0, La/rbq;->a:La/ecq;

    .line 318
    .line 319
    if-eqz v1, :cond_1f

    .line 320
    .line 321
    iget-object v2, v1, La/ecq;->a:La/jcq;

    .line 322
    .line 323
    if-eqz v2, :cond_1e

    .line 324
    .line 325
    invoke-static {v2}, La/plc;->O(La/jcq;)La/gcq;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    iget-object v2, v1, La/ecq;->b:Ljava/util/List;

    .line 330
    .line 331
    if-eqz v2, :cond_1d

    .line 332
    .line 333
    new-instance v5, Ljava/util/ArrayList;

    .line 334
    .line 335
    const/16 v15, 0xa

    .line 336
    .line 337
    invoke-static {v2, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-eqz v3, :cond_7

    .line 353
    .line 354
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    check-cast v3, La/bcq;

    .line 359
    .line 360
    invoke-static {v3}, La/vic;->I(La/bcq;)La/ybq;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    goto :goto_4

    .line 368
    :cond_7
    iget-object v2, v1, La/ecq;->c:Ljava/lang/Integer;

    .line 369
    .line 370
    if-eqz v2, :cond_1c

    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    int-to-long v6, v2

    .line 377
    iget-object v2, v1, La/ecq;->d:Ljava/lang/Integer;

    .line 378
    .line 379
    if-eqz v2, :cond_1b

    .line 380
    .line 381
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    int-to-long v8, v2

    .line 386
    iget-object v2, v1, La/ecq;->e:Ljava/lang/Integer;

    .line 387
    .line 388
    if-eqz v2, :cond_1a

    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    int-to-long v10, v2

    .line 395
    iget-object v2, v1, La/ecq;->f:Ljava/lang/Integer;

    .line 396
    .line 397
    if-eqz v2, :cond_19

    .line 398
    .line 399
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    int-to-long v12, v2

    .line 404
    iget-object v1, v1, La/ecq;->g:Ljava/lang/Float;

    .line 405
    .line 406
    if-eqz v1, :cond_18

    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 409
    .line 410
    .line 411
    move-result v14

    .line 412
    new-instance v3, La/xbq;

    .line 413
    .line 414
    invoke-direct/range {v3 .. v14}, La/xbq;-><init>(La/gcq;Ljava/util/List;JJJJF)V

    .line 415
    .line 416
    .line 417
    iget-object v1, v0, La/rbq;->b:La/ncq;

    .line 418
    .line 419
    if-eqz v1, :cond_17

    .line 420
    .line 421
    iget-object v2, v1, La/ncq;->a:Ljava/lang/Float;

    .line 422
    .line 423
    if-eqz v2, :cond_8

    .line 424
    .line 425
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    goto :goto_5

    .line 430
    :cond_8
    const/4 v2, 0x0

    .line 431
    :goto_5
    iget-object v4, v1, La/ncq;->c:La/jcq;

    .line 432
    .line 433
    if-eqz v4, :cond_16

    .line 434
    .line 435
    invoke-static {v4}, La/plc;->O(La/jcq;)La/gcq;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    iget-object v5, v1, La/ncq;->d:Ljava/lang/Boolean;

    .line 440
    .line 441
    if-eqz v5, :cond_9

    .line 442
    .line 443
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    goto :goto_6

    .line 448
    :cond_9
    const/4 v11, 0x0

    .line 449
    :goto_6
    iget-object v1, v1, La/ncq;->b:Ljava/util/List;

    .line 450
    .line 451
    if-eqz v1, :cond_15

    .line 452
    .line 453
    new-instance v5, Ljava/util/ArrayList;

    .line 454
    .line 455
    invoke-static {v1, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 456
    .line 457
    .line 458
    move-result v6

    .line 459
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 460
    .line 461
    .line 462
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    if-eqz v6, :cond_12

    .line 471
    .line 472
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    check-cast v6, La/vbq;

    .line 477
    .line 478
    new-instance v17, La/sbq;

    .line 479
    .line 480
    iget-object v7, v6, La/vbq;->a:Ljava/lang/String;

    .line 481
    .line 482
    iget-object v8, v6, La/vbq;->b:Ljava/lang/Double;

    .line 483
    .line 484
    if-nez v7, :cond_a

    .line 485
    .line 486
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v7

    .line 490
    :cond_a
    move-object/from16 v18, v7

    .line 491
    .line 492
    if-eqz v8, :cond_11

    .line 493
    .line 494
    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    .line 495
    .line 496
    .line 497
    move-result-wide v19

    .line 498
    iget-object v7, v6, La/vbq;->c:Ljava/lang/Double;

    .line 499
    .line 500
    if-eqz v7, :cond_10

    .line 501
    .line 502
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 503
    .line 504
    .line 505
    move-result-wide v21

    .line 506
    iget-object v7, v6, La/vbq;->d:Ljava/lang/Long;

    .line 507
    .line 508
    if-eqz v7, :cond_f

    .line 509
    .line 510
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 511
    .line 512
    .line 513
    move-result-wide v23

    .line 514
    iget-object v6, v6, La/vbq;->f:Ljava/lang/Integer;

    .line 515
    .line 516
    if-nez v6, :cond_b

    .line 517
    .line 518
    goto :goto_9

    .line 519
    :cond_b
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result v7

    .line 523
    const/16 v8, 0x60a

    .line 524
    .line 525
    if-ne v7, v8, :cond_c

    .line 526
    .line 527
    sget-object v6, La/wbq;->a:La/wbq;

    .line 528
    .line 529
    :goto_8
    move-object/from16 v25, v6

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :cond_c
    :goto_9
    if-nez v6, :cond_d

    .line 533
    .line 534
    goto :goto_a

    .line 535
    :cond_d
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 536
    .line 537
    .line 538
    move-result v6

    .line 539
    const/16 v7, 0x60b

    .line 540
    .line 541
    if-ne v6, v7, :cond_e

    .line 542
    .line 543
    sget-object v6, La/wbq;->b:La/wbq;

    .line 544
    .line 545
    goto :goto_8

    .line 546
    :cond_e
    :goto_a
    sget-object v6, La/wbq;->c:La/wbq;

    .line 547
    .line 548
    goto :goto_8

    .line 549
    :goto_b
    invoke-direct/range {v17 .. v25}, La/sbq;-><init>(Ljava/lang/String;DDJLa/wbq;)V

    .line 550
    .line 551
    .line 552
    move-object/from16 v6, v17

    .line 553
    .line 554
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    goto :goto_7

    .line 558
    :cond_f
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    return-object v16

    .line 562
    :cond_10
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    return-object v16

    .line 566
    :cond_11
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    return-object v16

    .line 570
    :cond_12
    new-instance v1, La/kcq;

    .line 571
    .line 572
    invoke-direct {v1, v2, v5, v4, v11}, La/kcq;-><init>(FLjava/util/List;La/gcq;Z)V

    .line 573
    .line 574
    .line 575
    iget-object v0, v0, La/rbq;->c:Ljava/util/List;

    .line 576
    .line 577
    if-eqz v0, :cond_14

    .line 578
    .line 579
    new-instance v2, Ljava/util/ArrayList;

    .line 580
    .line 581
    invoke-static {v0, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 586
    .line 587
    .line 588
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    if-eqz v4, :cond_13

    .line 597
    .line 598
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v4

    .line 602
    check-cast v4, La/jcq;

    .line 603
    .line 604
    invoke-static {v4}, La/plc;->O(La/jcq;)La/gcq;

    .line 605
    .line 606
    .line 607
    move-result-object v4

    .line 608
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    goto :goto_c

    .line 612
    :cond_13
    new-instance v0, La/obq;

    .line 613
    .line 614
    invoke-direct {v0, v3, v1, v2}, La/obq;-><init>(La/xbq;La/kcq;Ljava/util/List;)V

    .line 615
    .line 616
    .line 617
    return-object v0

    .line 618
    :cond_14
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    return-object v16

    .line 622
    :cond_15
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    return-object v16

    .line 626
    :cond_16
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    return-object v16

    .line 630
    :cond_17
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    return-object v16

    .line 634
    :cond_18
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    return-object v16

    .line 638
    :cond_19
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    return-object v16

    .line 642
    :cond_1a
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    return-object v16

    .line 646
    :cond_1b
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    return-object v16

    .line 650
    :cond_1c
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    return-object v16

    .line 654
    :cond_1d
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    return-object v16

    .line 658
    :cond_1e
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    return-object v16

    .line 662
    :cond_1f
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    return-object v16

    .line 666
    :catchall_1
    move-exception v0

    .line 667
    move-object v8, v15

    .line 668
    move-object v15, v0

    .line 669
    move-object v0, v8

    .line 670
    move v8, v4

    .line 671
    move v4, v2

    .line 672
    move v2, v8

    .line 673
    move v8, v1

    .line 674
    move v1, v5

    .line 675
    :goto_d
    move-object v5, v7

    .line 676
    goto :goto_11

    .line 677
    :catchall_2
    move-exception v0

    .line 678
    goto :goto_10

    .line 679
    :catchall_3
    move-exception v0

    .line 680
    move-object v12, v3

    .line 681
    move-object v7, v5

    .line 682
    goto :goto_10

    .line 683
    :goto_e
    move-object v5, v15

    .line 684
    move-object v15, v0

    .line 685
    move-object v0, v5

    .line 686
    goto :goto_d

    .line 687
    :catchall_4
    move-exception v0

    .line 688
    :goto_f
    move-object v12, v3

    .line 689
    move-object v7, v5

    .line 690
    :goto_10
    move-object/from16 v3, v20

    .line 691
    .line 692
    goto :goto_e

    .line 693
    :catchall_5
    move-exception v0

    .line 694
    goto :goto_f

    .line 695
    :catchall_6
    move-exception v0

    .line 696
    move-object v12, v3

    .line 697
    move-object v3, v7

    .line 698
    move-object v7, v5

    .line 699
    goto :goto_e

    .line 700
    :goto_11
    invoke-static {v15}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 701
    .line 702
    .line 703
    move-result v7

    .line 704
    if-eqz v7, :cond_24

    .line 705
    .line 706
    if-nez v9, :cond_20

    .line 707
    .line 708
    new-instance v0, La/el50;

    .line 709
    .line 710
    invoke-direct {v0, v15}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 711
    .line 712
    .line 713
    move-object v15, v0

    .line 714
    move-object v7, v3

    .line 715
    :goto_12
    move-object v3, v12

    .line 716
    const/4 v0, 0x0

    .line 717
    :goto_13
    const/4 v12, 0x1

    .line 718
    goto/16 :goto_1

    .line 719
    .line 720
    :cond_20
    move-object/from16 v20, v3

    .line 721
    .line 722
    move v7, v4

    .line 723
    int-to-long v3, v8

    .line 724
    cmp-long v3, v3, v13

    .line 725
    .line 726
    if-gez v3, :cond_21

    .line 727
    .line 728
    const/4 v3, 0x1

    .line 729
    goto :goto_14

    .line 730
    :cond_21
    const/4 v3, 0x0

    .line 731
    :goto_14
    add-int/lit8 v8, v8, 0x1

    .line 732
    .line 733
    if-eqz v3, :cond_23

    .line 734
    .line 735
    iput-object v5, v6, La/c7q;->q:La/h7q;

    .line 736
    .line 737
    iput-object v12, v6, La/c7q;->r:La/ocq;

    .line 738
    .line 739
    iput-object v0, v6, La/c7q;->s:Ljava/lang/Throwable;

    .line 740
    .line 741
    iput-wide v13, v6, La/c7q;->i:J

    .line 742
    .line 743
    iput-wide v10, v6, La/c7q;->j:J

    .line 744
    .line 745
    iput v9, v6, La/c7q;->k:I

    .line 746
    .line 747
    iput v1, v6, La/c7q;->l:I

    .line 748
    .line 749
    iput v2, v6, La/c7q;->m:I

    .line 750
    .line 751
    iput v7, v6, La/c7q;->n:I

    .line 752
    .line 753
    iput v8, v6, La/c7q;->o:I

    .line 754
    .line 755
    iput v3, v6, La/c7q;->p:I

    .line 756
    .line 757
    const/4 v4, 0x2

    .line 758
    iput-byte v4, v6, La/c7q;->t:B

    .line 759
    .line 760
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object v15

    .line 764
    move-object/from16 v4, v20

    .line 765
    .line 766
    if-ne v15, v4, :cond_22

    .line 767
    .line 768
    goto :goto_18

    .line 769
    :cond_22
    move-object v15, v0

    .line 770
    move v0, v3

    .line 771
    move-object v3, v12

    .line 772
    :goto_15
    move v12, v7

    .line 773
    move-object v7, v4

    .line 774
    move v4, v12

    .line 775
    goto :goto_13

    .line 776
    :cond_23
    move-object/from16 v4, v20

    .line 777
    .line 778
    new-instance v0, La/el50;

    .line 779
    .line 780
    invoke-direct {v0, v15}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 781
    .line 782
    .line 783
    :goto_16
    move v15, v7

    .line 784
    move-object v7, v4

    .line 785
    move v4, v15

    .line 786
    move-object v15, v0

    .line 787
    move v0, v3

    .line 788
    move-object v3, v12

    .line 789
    goto :goto_13

    .line 790
    :cond_24
    move v7, v4

    .line 791
    move-object v4, v3

    .line 792
    invoke-static {v15}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 793
    .line 794
    .line 795
    move-result v3

    .line 796
    if-eqz v3, :cond_27

    .line 797
    .line 798
    move-object/from16 v20, v4

    .line 799
    .line 800
    int-to-long v3, v8

    .line 801
    cmp-long v3, v3, v13

    .line 802
    .line 803
    if-gez v3, :cond_25

    .line 804
    .line 805
    const/4 v3, 0x1

    .line 806
    goto :goto_17

    .line 807
    :cond_25
    const/4 v3, 0x0

    .line 808
    :goto_17
    add-int/lit8 v8, v8, 0x1

    .line 809
    .line 810
    if-eqz v3, :cond_26

    .line 811
    .line 812
    iput-object v5, v6, La/c7q;->q:La/h7q;

    .line 813
    .line 814
    iput-object v12, v6, La/c7q;->r:La/ocq;

    .line 815
    .line 816
    iput-object v0, v6, La/c7q;->s:Ljava/lang/Throwable;

    .line 817
    .line 818
    iput-wide v13, v6, La/c7q;->i:J

    .line 819
    .line 820
    iput-wide v10, v6, La/c7q;->j:J

    .line 821
    .line 822
    iput v9, v6, La/c7q;->k:I

    .line 823
    .line 824
    iput v1, v6, La/c7q;->l:I

    .line 825
    .line 826
    iput v2, v6, La/c7q;->m:I

    .line 827
    .line 828
    iput v7, v6, La/c7q;->n:I

    .line 829
    .line 830
    iput v8, v6, La/c7q;->o:I

    .line 831
    .line 832
    iput v3, v6, La/c7q;->p:I

    .line 833
    .line 834
    const/4 v4, 0x3

    .line 835
    iput-byte v4, v6, La/c7q;->t:B

    .line 836
    .line 837
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v15

    .line 841
    move-object/from16 v4, v20

    .line 842
    .line 843
    if-ne v15, v4, :cond_22

    .line 844
    .line 845
    :goto_18
    return-object v4

    .line 846
    :cond_26
    move-object/from16 v4, v20

    .line 847
    .line 848
    new-instance v0, La/dag0;

    .line 849
    .line 850
    invoke-direct {v0, v15}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 851
    .line 852
    .line 853
    goto :goto_16

    .line 854
    :cond_27
    invoke-static {v15}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 855
    .line 856
    .line 857
    move v0, v7

    .line 858
    move-object v7, v4

    .line 859
    move v4, v0

    .line 860
    goto/16 :goto_12

    .line 861
    .line 862
    :cond_28
    if-nez v15, :cond_29

    .line 863
    .line 864
    const-string v0, "Unexpected error"

    .line 865
    .line 866
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    return-object v16

    .line 870
    :cond_29
    throw v15
.end method
