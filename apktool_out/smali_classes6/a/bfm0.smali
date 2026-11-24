.class public final La/bfm0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/util/Map;

.field public j:La/ywu;

.field public k:Ljava/lang/Throwable;

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public p:I

.field public q:B

.field public final synthetic r:La/ywu;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Z


# direct methods
.method public constructor <init>(La/ywu;Ljava/lang/String;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/bfm0;->r:La/ywu;

    .line 2
    .line 3
    iput-object p2, p0, La/bfm0;->s:Ljava/lang/String;

    .line 4
    .line 5
    iput-boolean p3, p0, La/bfm0;->t:Z

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance p1, La/bfm0;

    .line 2
    .line 3
    iget-object v0, p0, La/bfm0;->s:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v1, p0, La/bfm0;->t:Z

    .line 6
    .line 7
    iget-object p0, p0, La/bfm0;->r:La/ywu;

    .line 8
    .line 9
    invoke-direct {p1, p0, v0, v1, p2}, La/bfm0;-><init>(La/ywu;Ljava/lang/String;ZLa/yje;)V

    .line 10
    .line 11
    .line 12
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/bfm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/bfm0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/bfm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/bfm0;->r:La/ywu;

    .line 4
    .line 5
    iget-object v2, v0, La/ywu;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v4, v1, La/bfm0;->q:B

    .line 12
    .line 13
    const-string v5, "application/vnd.xenvelop+json"

    .line 14
    .line 15
    const/4 v6, 0x4

    .line 16
    const/4 v7, 0x3

    .line 17
    const/4 v8, 0x2

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v11, 0x1

    .line 20
    if-eqz v4, :cond_4

    .line 21
    .line 22
    if-eq v4, v11, :cond_3

    .line 23
    .line 24
    if-eq v4, v8, :cond_2

    .line 25
    .line 26
    if-eq v4, v7, :cond_1

    .line 27
    .line 28
    if-ne v4, v6, :cond_0

    .line 29
    .line 30
    iget-object v0, v1, La/bfm0;->i:Ljava/util/Map;

    .line 31
    .line 32
    check-cast v0, Ljava/util/Map;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v0, p1

    .line 38
    .line 39
    goto/16 :goto_9

    .line 40
    .line 41
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v9

    .line 47
    :cond_1
    iget v0, v1, La/bfm0;->p:I

    .line 48
    .line 49
    iget v2, v1, La/bfm0;->o:I

    .line 50
    .line 51
    iget v4, v1, La/bfm0;->n:I

    .line 52
    .line 53
    iget-wide v12, v1, La/bfm0;->m:J

    .line 54
    .line 55
    iget-wide v14, v1, La/bfm0;->l:J

    .line 56
    .line 57
    iget-object v6, v1, La/bfm0;->k:Ljava/lang/Throwable;

    .line 58
    .line 59
    iget-object v10, v1, La/bfm0;->j:La/ywu;

    .line 60
    .line 61
    move-object/from16 v16, v9

    .line 62
    .line 63
    iget-object v9, v1, La/bfm0;->i:Ljava/util/Map;

    .line 64
    .line 65
    check-cast v9, Ljava/util/Map;

    .line 66
    .line 67
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move v8, v7

    .line 71
    move/from16 v20, v4

    .line 72
    .line 73
    move v4, v2

    .line 74
    move-object v2, v10

    .line 75
    move-object/from16 v21, v6

    .line 76
    .line 77
    move/from16 v6, v20

    .line 78
    .line 79
    move-wide/from16 v22, v14

    .line 80
    .line 81
    move-object/from16 v14, v21

    .line 82
    .line 83
    move-object v15, v9

    .line 84
    move-wide v9, v12

    .line 85
    move-wide/from16 v12, v22

    .line 86
    .line 87
    goto/16 :goto_7

    .line 88
    .line 89
    :cond_2
    move-object/from16 v16, v9

    .line 90
    .line 91
    iget v0, v1, La/bfm0;->p:I

    .line 92
    .line 93
    iget v2, v1, La/bfm0;->o:I

    .line 94
    .line 95
    iget v4, v1, La/bfm0;->n:I

    .line 96
    .line 97
    iget-wide v9, v1, La/bfm0;->m:J

    .line 98
    .line 99
    iget-wide v12, v1, La/bfm0;->l:J

    .line 100
    .line 101
    iget-object v6, v1, La/bfm0;->k:Ljava/lang/Throwable;

    .line 102
    .line 103
    iget-object v14, v1, La/bfm0;->j:La/ywu;

    .line 104
    .line 105
    iget-object v15, v1, La/bfm0;->i:Ljava/util/Map;

    .line 106
    .line 107
    check-cast v15, Ljava/util/Map;

    .line 108
    .line 109
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    move/from16 v20, v4

    .line 113
    .line 114
    move v4, v2

    .line 115
    move-object v2, v14

    .line 116
    move-object v14, v6

    .line 117
    move/from16 v6, v20

    .line 118
    .line 119
    goto/16 :goto_5

    .line 120
    .line 121
    :cond_3
    move-object/from16 v16, v9

    .line 122
    .line 123
    iget v2, v1, La/bfm0;->o:I

    .line 124
    .line 125
    iget v4, v1, La/bfm0;->n:I

    .line 126
    .line 127
    iget-wide v9, v1, La/bfm0;->m:J

    .line 128
    .line 129
    iget-wide v12, v1, La/bfm0;->l:J

    .line 130
    .line 131
    iget-object v6, v1, La/bfm0;->k:Ljava/lang/Throwable;

    .line 132
    .line 133
    iget-object v14, v1, La/bfm0;->j:La/ywu;

    .line 134
    .line 135
    iget-object v0, v1, La/bfm0;->i:Ljava/util/Map;

    .line 136
    .line 137
    move-object v15, v0

    .line 138
    check-cast v15, Ljava/util/Map;

    .line 139
    .line 140
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    .line 142
    .line 143
    move-object/from16 v0, p1

    .line 144
    .line 145
    goto/16 :goto_1

    .line 146
    .line 147
    :catchall_0
    move-exception v0

    .line 148
    move/from16 v20, v4

    .line 149
    .line 150
    move v4, v2

    .line 151
    move-object v2, v14

    .line 152
    move-object v14, v6

    .line 153
    move/from16 v6, v20

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    move-object/from16 v16, v9

    .line 157
    .line 158
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, La/knf0;->b()I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    iget-object v9, v1, La/bfm0;->s:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {v4, v9, v2}, La/ofm0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    iget-boolean v4, v1, La/bfm0;->t:Z

    .line 179
    .line 180
    if-eqz v4, :cond_11

    .line 181
    .line 182
    sget-wide v9, La/cag0;->a:J

    .line 183
    .line 184
    const-wide/16 v12, 0x3

    .line 185
    .line 186
    move-object v15, v2

    .line 187
    move v6, v11

    .line 188
    move-object/from16 v14, v16

    .line 189
    .line 190
    const/4 v4, 0x0

    .line 191
    move-object v2, v0

    .line 192
    move v0, v6

    .line 193
    :goto_0
    if-eqz v0, :cond_f

    .line 194
    .line 195
    :try_start_1
    iget-object v7, v2, La/ywu;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v7, La/afm0;

    .line 198
    .line 199
    move-object v8, v15

    .line 200
    check-cast v8, Ljava/util/Map;

    .line 201
    .line 202
    iput-object v8, v1, La/bfm0;->i:Ljava/util/Map;

    .line 203
    .line 204
    iput-object v2, v1, La/bfm0;->j:La/ywu;

    .line 205
    .line 206
    iput-object v14, v1, La/bfm0;->k:Ljava/lang/Throwable;

    .line 207
    .line 208
    iput-wide v12, v1, La/bfm0;->l:J

    .line 209
    .line 210
    iput-wide v9, v1, La/bfm0;->m:J

    .line 211
    .line 212
    iput v6, v1, La/bfm0;->n:I

    .line 213
    .line 214
    iput v4, v1, La/bfm0;->o:I

    .line 215
    .line 216
    iput v0, v1, La/bfm0;->p:I

    .line 217
    .line 218
    iput-byte v11, v1, La/bfm0;->q:B

    .line 219
    .line 220
    iget-object v0, v7, La/afm0;->c:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, La/goi0;

    .line 223
    .line 224
    invoke-virtual {v0}, La/goi0;->invoke()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, La/zem0;

    .line 229
    .line 230
    invoke-interface {v0, v15, v5, v1}, La/zem0;->a(Ljava/util/Map;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 234
    if-ne v0, v3, :cond_5

    .line 235
    .line 236
    goto/16 :goto_8

    .line 237
    .line 238
    :cond_5
    move-object/from16 v20, v14

    .line 239
    .line 240
    move-object v14, v2

    .line 241
    move v2, v4

    .line 242
    move v4, v6

    .line 243
    move-object/from16 v6, v20

    .line 244
    .line 245
    :goto_1
    :try_start_2
    check-cast v0, La/dx5;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 246
    .line 247
    goto/16 :goto_a

    .line 248
    .line 249
    :catchall_1
    move-exception v0

    .line 250
    :goto_2
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-eqz v7, :cond_a

    .line 255
    .line 256
    if-nez v6, :cond_6

    .line 257
    .line 258
    new-instance v14, La/el50;

    .line 259
    .line 260
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    const/4 v0, 0x0

    .line 264
    const/4 v7, 0x3

    .line 265
    :goto_3
    const/4 v8, 0x2

    .line 266
    goto :goto_0

    .line 267
    :cond_6
    int-to-long v7, v4

    .line 268
    cmp-long v7, v7, v12

    .line 269
    .line 270
    if-gez v7, :cond_7

    .line 271
    .line 272
    move v7, v11

    .line 273
    goto :goto_4

    .line 274
    :cond_7
    const/4 v7, 0x0

    .line 275
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 276
    .line 277
    if-eqz v7, :cond_8

    .line 278
    .line 279
    move-object v0, v15

    .line 280
    check-cast v0, Ljava/util/Map;

    .line 281
    .line 282
    iput-object v0, v1, La/bfm0;->i:Ljava/util/Map;

    .line 283
    .line 284
    iput-object v2, v1, La/bfm0;->j:La/ywu;

    .line 285
    .line 286
    iput-object v14, v1, La/bfm0;->k:Ljava/lang/Throwable;

    .line 287
    .line 288
    iput-wide v12, v1, La/bfm0;->l:J

    .line 289
    .line 290
    iput-wide v9, v1, La/bfm0;->m:J

    .line 291
    .line 292
    iput v6, v1, La/bfm0;->n:I

    .line 293
    .line 294
    iput v4, v1, La/bfm0;->o:I

    .line 295
    .line 296
    iput v7, v1, La/bfm0;->p:I

    .line 297
    .line 298
    const/4 v8, 0x2

    .line 299
    iput-byte v8, v1, La/bfm0;->q:B

    .line 300
    .line 301
    invoke-static {v9, v10, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    if-ne v0, v3, :cond_9

    .line 306
    .line 307
    goto/16 :goto_8

    .line 308
    .line 309
    :goto_5
    const/4 v7, 0x3

    .line 310
    goto :goto_0

    .line 311
    :cond_8
    const/4 v8, 0x2

    .line 312
    new-instance v14, La/el50;

    .line 313
    .line 314
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 315
    .line 316
    .line 317
    :cond_9
    move v0, v7

    .line 318
    goto :goto_5

    .line 319
    :cond_a
    const/4 v8, 0x2

    .line 320
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 321
    .line 322
    .line 323
    move-result v7

    .line 324
    if-eqz v7, :cond_e

    .line 325
    .line 326
    move-wide/from16 v18, v9

    .line 327
    .line 328
    int-to-long v8, v4

    .line 329
    cmp-long v7, v8, v12

    .line 330
    .line 331
    if-gez v7, :cond_b

    .line 332
    .line 333
    move v7, v11

    .line 334
    goto :goto_6

    .line 335
    :cond_b
    const/4 v7, 0x0

    .line 336
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 337
    .line 338
    if-eqz v7, :cond_c

    .line 339
    .line 340
    move-object v0, v15

    .line 341
    check-cast v0, Ljava/util/Map;

    .line 342
    .line 343
    iput-object v0, v1, La/bfm0;->i:Ljava/util/Map;

    .line 344
    .line 345
    iput-object v2, v1, La/bfm0;->j:La/ywu;

    .line 346
    .line 347
    iput-object v14, v1, La/bfm0;->k:Ljava/lang/Throwable;

    .line 348
    .line 349
    iput-wide v12, v1, La/bfm0;->l:J

    .line 350
    .line 351
    move-wide/from16 v9, v18

    .line 352
    .line 353
    iput-wide v9, v1, La/bfm0;->m:J

    .line 354
    .line 355
    iput v6, v1, La/bfm0;->n:I

    .line 356
    .line 357
    iput v4, v1, La/bfm0;->o:I

    .line 358
    .line 359
    iput v7, v1, La/bfm0;->p:I

    .line 360
    .line 361
    const/4 v8, 0x3

    .line 362
    iput-byte v8, v1, La/bfm0;->q:B

    .line 363
    .line 364
    invoke-static {v9, v10, v1}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-ne v0, v3, :cond_d

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :goto_7
    move v7, v8

    .line 372
    goto :goto_3

    .line 373
    :cond_c
    move-wide/from16 v9, v18

    .line 374
    .line 375
    const/4 v8, 0x3

    .line 376
    new-instance v14, La/dag0;

    .line 377
    .line 378
    invoke-direct {v14, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    :cond_d
    move v0, v7

    .line 382
    goto :goto_7

    .line 383
    :cond_e
    const/4 v8, 0x3

    .line 384
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 385
    .line 386
    .line 387
    move-object v14, v0

    .line 388
    move v7, v8

    .line 389
    const/4 v0, 0x0

    .line 390
    goto :goto_3

    .line 391
    :cond_f
    if-nez v14, :cond_10

    .line 392
    .line 393
    const-string v0, "Unexpected error"

    .line 394
    .line 395
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    return-object v16

    .line 399
    :cond_10
    throw v14

    .line 400
    :cond_11
    iget-object v0, v0, La/ywu;->c:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v0, La/afm0;

    .line 403
    .line 404
    move-object/from16 v4, v16

    .line 405
    .line 406
    iput-object v4, v1, La/bfm0;->i:Ljava/util/Map;

    .line 407
    .line 408
    iput-byte v6, v1, La/bfm0;->q:B

    .line 409
    .line 410
    iget-object v0, v0, La/afm0;->c:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v0, La/goi0;

    .line 413
    .line 414
    invoke-virtual {v0}, La/goi0;->invoke()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    check-cast v0, La/zem0;

    .line 419
    .line 420
    invoke-interface {v0, v2, v5, v1}, La/zem0;->a(Ljava/util/Map;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    if-ne v0, v3, :cond_12

    .line 425
    .line 426
    :goto_8
    return-object v3

    .line 427
    :cond_12
    :goto_9
    check-cast v0, La/dx5;

    .line 428
    .line 429
    :goto_a
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    check-cast v0, La/s800;

    .line 434
    .line 435
    iget-object v1, v0, La/s800;->a:Ljava/util/List;

    .line 436
    .line 437
    const/16 v2, 0xa

    .line 438
    .line 439
    if-eqz v1, :cond_13

    .line 440
    .line 441
    new-instance v4, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-eqz v3, :cond_14

    .line 459
    .line 460
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    check-cast v3, La/gip0;

    .line 465
    .line 466
    invoke-static {v3}, La/dnm0;->q(La/gip0;)La/ufp0;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    goto :goto_b

    .line 474
    :cond_13
    const/4 v4, 0x0

    .line 475
    :cond_14
    if-nez v4, :cond_15

    .line 476
    .line 477
    sget-object v4, La/iun;->a:La/iun;

    .line 478
    .line 479
    :cond_15
    iget-object v1, v0, La/s800;->b:Ljava/util/List;

    .line 480
    .line 481
    if-eqz v1, :cond_16

    .line 482
    .line 483
    new-instance v3, Ljava/util/ArrayList;

    .line 484
    .line 485
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 490
    .line 491
    .line 492
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v5

    .line 500
    if-eqz v5, :cond_17

    .line 501
    .line 502
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    check-cast v5, La/haa0;

    .line 507
    .line 508
    invoke-static {v5}, La/q0x;->S(La/haa0;)La/b9a0;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    goto :goto_c

    .line 516
    :cond_16
    const/4 v3, 0x0

    .line 517
    :cond_17
    if-nez v3, :cond_18

    .line 518
    .line 519
    sget-object v3, La/iun;->a:La/iun;

    .line 520
    .line 521
    :cond_18
    iget-object v1, v0, La/s800;->c:Ljava/lang/Integer;

    .line 522
    .line 523
    if-eqz v1, :cond_19

    .line 524
    .line 525
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    goto :goto_d

    .line 530
    :cond_19
    const/4 v1, 0x0

    .line 531
    :goto_d
    iget-object v0, v0, La/s800;->d:Ljava/util/List;

    .line 532
    .line 533
    if-eqz v0, :cond_2d

    .line 534
    .line 535
    new-instance v5, Ljava/util/ArrayList;

    .line 536
    .line 537
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 538
    .line 539
    .line 540
    move-result v6

    .line 541
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 542
    .line 543
    .line 544
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 549
    .line 550
    .line 551
    move-result v6

    .line 552
    if-eqz v6, :cond_2c

    .line 553
    .line 554
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v6

    .line 558
    check-cast v6, La/g800;

    .line 559
    .line 560
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    iget-object v7, v6, La/g800;->a:Ljava/lang/String;

    .line 564
    .line 565
    const-string v8, ""

    .line 566
    .line 567
    if-nez v7, :cond_1a

    .line 568
    .line 569
    move-object v7, v8

    .line 570
    :cond_1a
    iget-object v9, v6, La/g800;->b:Ljava/util/List;

    .line 571
    .line 572
    if-eqz v9, :cond_24

    .line 573
    .line 574
    new-instance v10, Ljava/util/ArrayList;

    .line 575
    .line 576
    invoke-static {v9, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 581
    .line 582
    .line 583
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 584
    .line 585
    .line 586
    move-result-object v9

    .line 587
    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 588
    .line 589
    .line 590
    move-result v11

    .line 591
    if-eqz v11, :cond_23

    .line 592
    .line 593
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v11

    .line 597
    check-cast v11, La/a900;

    .line 598
    .line 599
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    iget-object v12, v11, La/a900;->a:Ljava/lang/String;

    .line 603
    .line 604
    if-nez v12, :cond_1b

    .line 605
    .line 606
    move-object v12, v8

    .line 607
    :cond_1b
    iget-object v11, v11, La/a900;->b:Ljava/util/List;

    .line 608
    .line 609
    if-eqz v11, :cond_21

    .line 610
    .line 611
    new-instance v13, Ljava/util/ArrayList;

    .line 612
    .line 613
    invoke-static {v11, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 614
    .line 615
    .line 616
    move-result v14

    .line 617
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 618
    .line 619
    .line 620
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 621
    .line 622
    .line 623
    move-result-object v11

    .line 624
    :goto_10
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 625
    .line 626
    .line 627
    move-result v14

    .line 628
    if-eqz v14, :cond_20

    .line 629
    .line 630
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v14

    .line 634
    check-cast v14, La/p800;

    .line 635
    .line 636
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    new-instance v15, La/m800;

    .line 640
    .line 641
    iget-object v2, v14, La/p800;->a:Ljava/lang/String;

    .line 642
    .line 643
    if-nez v2, :cond_1c

    .line 644
    .line 645
    move-object v2, v8

    .line 646
    :cond_1c
    move-object/from16 p1, v0

    .line 647
    .line 648
    iget-object v0, v14, La/p800;->b:Ljava/lang/Integer;

    .line 649
    .line 650
    if-eqz v0, :cond_1d

    .line 651
    .line 652
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    :goto_11
    move-object/from16 v17, v8

    .line 657
    .line 658
    goto :goto_12

    .line 659
    :cond_1d
    const/4 v0, 0x0

    .line 660
    goto :goto_11

    .line 661
    :goto_12
    iget-object v8, v14, La/p800;->c:Ljava/lang/Integer;

    .line 662
    .line 663
    if-eqz v8, :cond_1e

    .line 664
    .line 665
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 666
    .line 667
    .line 668
    move-result v8

    .line 669
    goto :goto_13

    .line 670
    :cond_1e
    const/4 v8, 0x0

    .line 671
    :goto_13
    iget-object v14, v14, La/p800;->d:Ljava/lang/Integer;

    .line 672
    .line 673
    if-eqz v14, :cond_1f

    .line 674
    .line 675
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 676
    .line 677
    .line 678
    move-result v14

    .line 679
    goto :goto_14

    .line 680
    :cond_1f
    const/4 v14, 0x0

    .line 681
    :goto_14
    invoke-direct {v15, v0, v8, v14, v2}, La/m800;-><init>(IIILjava/lang/String;)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-object/from16 v0, p1

    .line 688
    .line 689
    move-object/from16 v8, v17

    .line 690
    .line 691
    const/16 v2, 0xa

    .line 692
    .line 693
    goto :goto_10

    .line 694
    :cond_20
    :goto_15
    move-object/from16 p1, v0

    .line 695
    .line 696
    move-object/from16 v17, v8

    .line 697
    .line 698
    goto :goto_16

    .line 699
    :cond_21
    const/4 v13, 0x0

    .line 700
    goto :goto_15

    .line 701
    :goto_16
    if-nez v13, :cond_22

    .line 702
    .line 703
    sget-object v13, La/iun;->a:La/iun;

    .line 704
    .line 705
    :cond_22
    new-instance v0, La/u800;

    .line 706
    .line 707
    invoke-direct {v0, v12, v13}, La/u800;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-object/from16 v0, p1

    .line 714
    .line 715
    move-object/from16 v8, v17

    .line 716
    .line 717
    const/16 v2, 0xa

    .line 718
    .line 719
    goto/16 :goto_f

    .line 720
    .line 721
    :cond_23
    :goto_17
    move-object/from16 p1, v0

    .line 722
    .line 723
    move-object/from16 v17, v8

    .line 724
    .line 725
    goto :goto_18

    .line 726
    :cond_24
    const/4 v10, 0x0

    .line 727
    goto :goto_17

    .line 728
    :goto_18
    if-nez v10, :cond_25

    .line 729
    .line 730
    sget-object v10, La/iun;->a:La/iun;

    .line 731
    .line 732
    :cond_25
    iget-object v0, v6, La/g800;->c:Ljava/util/List;

    .line 733
    .line 734
    if-eqz v0, :cond_29

    .line 735
    .line 736
    new-instance v2, Ljava/util/ArrayList;

    .line 737
    .line 738
    const/16 v6, 0xa

    .line 739
    .line 740
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 741
    .line 742
    .line 743
    move-result v8

    .line 744
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 745
    .line 746
    .line 747
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 752
    .line 753
    .line 754
    move-result v8

    .line 755
    if-eqz v8, :cond_2a

    .line 756
    .line 757
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v8

    .line 761
    check-cast v8, La/k800;

    .line 762
    .line 763
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    new-instance v9, La/h800;

    .line 767
    .line 768
    iget-object v11, v8, La/k800;->a:Ljava/lang/String;

    .line 769
    .line 770
    if-nez v11, :cond_26

    .line 771
    .line 772
    move-object/from16 v11, v17

    .line 773
    .line 774
    :cond_26
    iget-object v12, v8, La/k800;->b:Ljava/lang/String;

    .line 775
    .line 776
    if-nez v12, :cond_27

    .line 777
    .line 778
    move-object/from16 v12, v17

    .line 779
    .line 780
    :cond_27
    iget-object v8, v8, La/k800;->c:Ljava/lang/String;

    .line 781
    .line 782
    if-nez v8, :cond_28

    .line 783
    .line 784
    move-object/from16 v8, v17

    .line 785
    .line 786
    :cond_28
    invoke-direct {v9, v11, v12, v8}, La/h800;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    goto :goto_19

    .line 793
    :cond_29
    const/16 v6, 0xa

    .line 794
    .line 795
    const/4 v2, 0x0

    .line 796
    :cond_2a
    if-nez v2, :cond_2b

    .line 797
    .line 798
    sget-object v2, La/iun;->a:La/iun;

    .line 799
    .line 800
    :cond_2b
    new-instance v0, La/d800;

    .line 801
    .line 802
    invoke-direct {v0, v7, v10, v2}, La/d800;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-object/from16 v0, p1

    .line 809
    .line 810
    move v2, v6

    .line 811
    goto/16 :goto_e

    .line 812
    .line 813
    :cond_2c
    new-instance v0, La/l800;

    .line 814
    .line 815
    invoke-direct {v0, v1, v4, v3, v5}, La/l800;-><init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 816
    .line 817
    .line 818
    return-object v0

    .line 819
    :cond_2d
    const/16 v16, 0x0

    .line 820
    .line 821
    invoke-static/range {v16 .. v16}, La/jf4;->k(Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    return-object v16
.end method
