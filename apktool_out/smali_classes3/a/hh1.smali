.class public final La/hh1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:J

.field public j:J

.field public k:J

.field public l:Ljava/lang/Object;

.field public m:La/hl;

.field public n:I

.field public o:I

.field public p:B

.field public final synthetic q:La/mh1;


# direct methods
.method public constructor <init>(La/mh1;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hh1;->q:La/mh1;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/hh1;

    .line 2
    .line 3
    iget-object p0, p0, La/hh1;->q:La/mh1;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/hh1;-><init>(La/mh1;La/yje;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, La/hh1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/hh1;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/hh1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/hh1;->q:La/mh1;

    .line 4
    .line 5
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v4, v1, La/hh1;->p:B

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x4

    .line 13
    const/4 v7, 0x3

    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, 0x1

    .line 16
    if-eqz v4, :cond_4

    .line 17
    .line 18
    if-eq v4, v9, :cond_3

    .line 19
    .line 20
    if-eq v4, v8, :cond_2

    .line 21
    .line 22
    if-eq v4, v7, :cond_1

    .line 23
    .line 24
    if-ne v4, v6, :cond_0

    .line 25
    .line 26
    iget v0, v1, La/hh1;->o:I

    .line 27
    .line 28
    iget v3, v1, La/hh1;->n:I

    .line 29
    .line 30
    iget-object v4, v1, La/hh1;->m:La/hl;

    .line 31
    .line 32
    iget-object v1, v1, La/hh1;->l:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, La/dlc0;

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move v5, v0

    .line 40
    move-object/from16 v0, p1

    .line 41
    .line 42
    goto/16 :goto_3

    .line 43
    .line 44
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v5

    .line 50
    :cond_1
    iget-object v0, v1, La/hh1;->l:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_c

    .line 58
    .line 59
    :cond_2
    iget-wide v7, v1, La/hh1;->i:J

    .line 60
    .line 61
    iget-object v4, v1, La/hh1;->l:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v4, La/dlc0;

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    iget-wide v9, v1, La/hh1;->k:J

    .line 70
    .line 71
    iget-wide v11, v1, La/hh1;->j:J

    .line 72
    .line 73
    iget-wide v13, v1, La/hh1;->i:J

    .line 74
    .line 75
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    move-wide v6, v11

    .line 79
    move-wide v10, v9

    .line 80
    move-object/from16 v9, p1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto/16 :goto_a

    .line 85
    .line 86
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, La/pf1;

    .line 94
    .line 95
    iget-wide v13, v4, La/pf1;->s:J

    .line 96
    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 98
    .line 99
    .line 100
    move-result-wide v10

    .line 101
    const-wide/16 v6, 0x3e8

    .line 102
    .line 103
    :try_start_1
    iget-object v15, v0, La/mh1;->F:La/edu;

    .line 104
    .line 105
    iput-wide v13, v1, La/hh1;->i:J

    .line 106
    .line 107
    iput-wide v6, v1, La/hh1;->j:J

    .line 108
    .line 109
    iput-wide v10, v1, La/hh1;->k:J

    .line 110
    .line 111
    iput-byte v9, v1, La/hh1;->p:B

    .line 112
    .line 113
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v9, La/bpu;

    .line 117
    .line 118
    invoke-direct {v9, v13, v14, v5, v15}, La/bpu;-><init>(JLa/yje;La/edu;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v9}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 125
    if-ne v9, v3, :cond_5

    .line 126
    .line 127
    goto/16 :goto_b

    .line 128
    .line 129
    :cond_5
    :goto_0
    :try_start_2
    check-cast v9, La/dlc0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 130
    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 132
    .line 133
    .line 134
    move-result-wide v15

    .line 135
    sub-long/2addr v15, v10

    .line 136
    cmp-long v4, v15, v6

    .line 137
    .line 138
    if-gez v4, :cond_7

    .line 139
    .line 140
    move-wide/from16 v18, v6

    .line 141
    .line 142
    sub-long v5, v18, v15

    .line 143
    .line 144
    iput-object v9, v1, La/hh1;->l:Ljava/lang/Object;

    .line 145
    .line 146
    iput-wide v13, v1, La/hh1;->i:J

    .line 147
    .line 148
    move-wide v15, v13

    .line 149
    move-wide/from16 v12, v18

    .line 150
    .line 151
    iput-wide v12, v1, La/hh1;->j:J

    .line 152
    .line 153
    iput-wide v10, v1, La/hh1;->k:J

    .line 154
    .line 155
    iput-byte v8, v1, La/hh1;->p:B

    .line 156
    .line 157
    invoke-static {v5, v6, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    if-ne v4, v3, :cond_6

    .line 162
    .line 163
    goto/16 :goto_b

    .line 164
    .line 165
    :cond_6
    move-object v4, v9

    .line 166
    move-wide v7, v15

    .line 167
    :goto_1
    move-object v9, v4

    .line 168
    move-wide v13, v7

    .line 169
    goto :goto_2

    .line 170
    :cond_7
    move-wide v15, v13

    .line 171
    :goto_2
    iget-object v4, v9, La/dlc0;->a:La/toe;

    .line 172
    .line 173
    iget v4, v4, La/toe;->a:I

    .line 174
    .line 175
    iget-object v5, v9, La/dlc0;->b:La/toe;

    .line 176
    .line 177
    iget v5, v5, La/toe;->a:I

    .line 178
    .line 179
    iget-object v6, v9, La/dlc0;->c:La/hl;

    .line 180
    .line 181
    iget-object v7, v6, La/hl;->c:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-lez v7, :cond_9

    .line 188
    .line 189
    iget-object v0, v0, La/mh1;->q:La/q0u;

    .line 190
    .line 191
    iget-object v7, v6, La/hl;->c:Ljava/lang/String;

    .line 192
    .line 193
    const/4 v8, 0x0

    .line 194
    iput-object v8, v1, La/hh1;->l:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v6, v1, La/hh1;->m:La/hl;

    .line 197
    .line 198
    iput-wide v13, v1, La/hh1;->i:J

    .line 199
    .line 200
    iput v4, v1, La/hh1;->n:I

    .line 201
    .line 202
    iput v5, v1, La/hh1;->o:I

    .line 203
    .line 204
    const/4 v12, 0x4

    .line 205
    iput-byte v12, v1, La/hh1;->p:B

    .line 206
    .line 207
    invoke-virtual {v0, v7, v1}, La/q0u;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-ne v0, v3, :cond_8

    .line 212
    .line 213
    goto/16 :goto_b

    .line 214
    .line 215
    :cond_8
    move v3, v4

    .line 216
    move-object v4, v6

    .line 217
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 218
    .line 219
    move v9, v3

    .line 220
    move-object v6, v4

    .line 221
    :goto_4
    move-object v8, v0

    .line 222
    move v10, v5

    .line 223
    goto :goto_5

    .line 224
    :cond_9
    const-string v0, ""

    .line 225
    .line 226
    move v9, v4

    .line 227
    goto :goto_4

    .line 228
    :goto_5
    sget-object v0, La/mh1;->E0:Ljava/lang/String;

    .line 229
    .line 230
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 231
    .line 232
    :goto_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-object v7, v1

    .line 240
    check-cast v7, La/pf1;

    .line 241
    .line 242
    const v25, -0x30002

    .line 243
    .line 244
    .line 245
    const/16 v26, 0xf

    .line 246
    .line 247
    const/4 v11, 0x0

    .line 248
    const-wide/16 v12, 0x0

    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    const/4 v15, 0x0

    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    const/16 v17, 0x0

    .line 255
    .line 256
    const/16 v18, 0x0

    .line 257
    .line 258
    const/16 v19, 0x0

    .line 259
    .line 260
    const/16 v20, 0x0

    .line 261
    .line 262
    const/16 v21, 0x0

    .line 263
    .line 264
    const/16 v22, 0x0

    .line 265
    .line 266
    const/16 v23, 0x0

    .line 267
    .line 268
    const/16 v24, 0x0

    .line 269
    .line 270
    invoke-static/range {v7 .. v26}, La/pf1;->a(La/pf1;Ljava/lang/String;IIZJLa/a4x;ZLa/klc0;La/yuc0;La/c6c0;La/vtc0;La/w2j;La/th90;ZLa/ql5;ZII)La/pf1;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    move v5, v10

    .line 275
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_d

    .line 280
    .line 281
    add-int/2addr v9, v5

    .line 282
    iget-wide v0, v6, La/hl;->a:J

    .line 283
    .line 284
    const-wide/16 v3, 0x0

    .line 285
    .line 286
    cmp-long v0, v0, v3

    .line 287
    .line 288
    if-eqz v0, :cond_a

    .line 289
    .line 290
    iget-wide v0, v6, La/hl;->b:D

    .line 291
    .line 292
    const-wide/16 v3, 0x0

    .line 293
    .line 294
    cmpl-double v3, v0, v3

    .line 295
    .line 296
    if-lez v3, :cond_a

    .line 297
    .line 298
    new-instance v3, La/elc0;

    .line 299
    .line 300
    invoke-direct {v3, v8, v0, v1}, La/elc0;-><init>(Ljava/lang/String;D)V

    .line 301
    .line 302
    .line 303
    :goto_7
    move-object v13, v3

    .line 304
    goto :goto_8

    .line 305
    :cond_a
    if-lez v9, :cond_b

    .line 306
    .line 307
    new-instance v3, La/glc0;

    .line 308
    .line 309
    invoke-direct {v3, v9}, La/glc0;-><init>(I)V

    .line 310
    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_b
    sget-object v3, La/ilc0;->a:La/ilc0;

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :goto_8
    iget-object v1, v2, La/ocj;->a:La/p7m0;

    .line 317
    .line 318
    :cond_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-object v4, v0

    .line 326
    check-cast v4, La/pf1;

    .line 327
    .line 328
    const v22, -0x1000001

    .line 329
    .line 330
    .line 331
    const/16 v23, 0xf

    .line 332
    .line 333
    const/4 v5, 0x0

    .line 334
    const/4 v6, 0x0

    .line 335
    const/4 v7, 0x0

    .line 336
    const/4 v8, 0x0

    .line 337
    const-wide/16 v9, 0x0

    .line 338
    .line 339
    const/4 v11, 0x0

    .line 340
    const/4 v12, 0x0

    .line 341
    const/4 v14, 0x0

    .line 342
    const/4 v15, 0x0

    .line 343
    const/16 v16, 0x0

    .line 344
    .line 345
    const/16 v17, 0x0

    .line 346
    .line 347
    const/16 v18, 0x0

    .line 348
    .line 349
    const/16 v19, 0x0

    .line 350
    .line 351
    const/16 v20, 0x0

    .line 352
    .line 353
    const/16 v21, 0x0

    .line 354
    .line 355
    invoke-static/range {v4 .. v23}, La/pf1;->a(La/pf1;Ljava/lang/String;IIZJLa/a4x;ZLa/klc0;La/yuc0;La/c6c0;La/vtc0;La/w2j;La/th90;ZLa/ql5;ZII)La/pf1;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-eqz v0, :cond_c

    .line 364
    .line 365
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object v0

    .line 368
    :cond_d
    move v10, v5

    .line 369
    goto/16 :goto_6

    .line 370
    .line 371
    :catchall_1
    move-exception v0

    .line 372
    move-wide v15, v13

    .line 373
    move-wide v12, v6

    .line 374
    move-wide v9, v10

    .line 375
    move-wide v11, v12

    .line 376
    move-wide v13, v15

    .line 377
    goto :goto_a

    .line 378
    :goto_9
    move-wide v9, v10

    .line 379
    move-wide v11, v6

    .line 380
    goto :goto_a

    .line 381
    :catchall_2
    move-exception v0

    .line 382
    goto :goto_9

    .line 383
    :goto_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 384
    .line 385
    .line 386
    move-result-wide v5

    .line 387
    sub-long/2addr v5, v9

    .line 388
    cmp-long v2, v5, v11

    .line 389
    .line 390
    if-gez v2, :cond_e

    .line 391
    .line 392
    sub-long v5, v11, v5

    .line 393
    .line 394
    iput-object v0, v1, La/hh1;->l:Ljava/lang/Object;

    .line 395
    .line 396
    iput-wide v13, v1, La/hh1;->i:J

    .line 397
    .line 398
    iput-wide v11, v1, La/hh1;->j:J

    .line 399
    .line 400
    iput-wide v9, v1, La/hh1;->k:J

    .line 401
    .line 402
    const/4 v4, 0x3

    .line 403
    iput-byte v4, v1, La/hh1;->p:B

    .line 404
    .line 405
    invoke-static {v5, v6, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    if-ne v1, v3, :cond_e

    .line 410
    .line 411
    :goto_b
    return-object v3

    .line 412
    :cond_e
    :goto_c
    throw v0
.end method
