.class public final La/oou;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:La/pou;

.field public k:La/oou;

.field public l:J

.field public m:J

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public s:B

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:S

.field public final synthetic v:La/pou;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(JLa/pou;IILjava/lang/String;ZLa/yje;)V
    .locals 0

    .line 1
    long-to-int p1, p1

    .line 2
    iput-short p1, p0, La/oou;->u:S

    .line 3
    .line 4
    iput-object p3, p0, La/oou;->v:La/pou;

    .line 5
    .line 6
    iput p4, p0, La/oou;->w:I

    .line 7
    .line 8
    iput p5, p0, La/oou;->x:I

    .line 9
    .line 10
    iput-object p6, p0, La/oou;->y:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p7, p0, La/oou;->z:Z

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/oou;

    .line 2
    .line 3
    iget-short v1, p0, La/oou;->u:S

    .line 4
    .line 5
    int-to-long v1, v1

    .line 6
    iget-object v6, p0, La/oou;->y:Ljava/lang/String;

    .line 7
    .line 8
    iget-boolean v7, p0, La/oou;->z:Z

    .line 9
    .line 10
    iget-object v3, p0, La/oou;->v:La/pou;

    .line 11
    .line 12
    iget v4, p0, La/oou;->w:I

    .line 13
    .line 14
    iget v5, p0, La/oou;->x:I

    .line 15
    .line 16
    move-object v8, p2

    .line 17
    invoke-direct/range {v0 .. v8}, La/oou;-><init>(JLa/pou;IILjava/lang/String;ZLa/yje;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/oou;->t:Ljava/lang/Object;

    .line 21
    .line 22
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
    invoke-virtual {p0, p1, p2}, La/oou;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/oou;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/oou;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-object v0, v7, La/oou;->t:Ljava/lang/Object;

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
    iget-byte v0, v7, La/oou;->s:B

    .line 11
    .line 12
    const/4 v9, 0x4

    .line 13
    const/4 v10, 0x2

    .line 14
    const/4 v11, 0x3

    .line 15
    const/4 v13, 0x1

    .line 16
    const/4 v14, 0x0

    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    if-eq v0, v13, :cond_3

    .line 20
    .line 21
    if-eq v0, v10, :cond_2

    .line 22
    .line 23
    if-eq v0, v11, :cond_1

    .line 24
    .line 25
    if-eq v0, v9, :cond_0

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v14

    .line 33
    :cond_0
    iget-object v0, v7, La/oou;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Throwable;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_13

    .line 41
    .line 42
    :cond_1
    iget-object v0, v7, La/oou;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/util/List;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_10

    .line 50
    .line 51
    :cond_2
    iget v0, v7, La/oou;->q:I

    .line 52
    .line 53
    iget v2, v7, La/oou;->p:I

    .line 54
    .line 55
    iget-wide v3, v7, La/oou;->m:J

    .line 56
    .line 57
    iget-boolean v5, v7, La/oou;->r:Z

    .line 58
    .line 59
    iget v6, v7, La/oou;->o:I

    .line 60
    .line 61
    iget v15, v7, La/oou;->n:I

    .line 62
    .line 63
    move/from16 v16, v15

    .line 64
    .line 65
    iget-wide v14, v7, La/oou;->l:J

    .line 66
    .line 67
    iget-object v12, v7, La/oou;->k:La/oou;

    .line 68
    .line 69
    iget-object v9, v7, La/oou;->j:La/pou;

    .line 70
    .line 71
    iget-object v10, v7, La/oou;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Ljava/lang/String;

    .line 74
    .line 75
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    move v11, v2

    .line 79
    move-wide/from16 v17, v3

    .line 80
    .line 81
    move v2, v6

    .line 82
    move-object v3, v8

    .line 83
    move-object v6, v9

    .line 84
    move/from16 v19, v13

    .line 85
    .line 86
    move-object v9, v1

    .line 87
    move/from16 v1, v16

    .line 88
    .line 89
    :goto_0
    move-wide v13, v14

    .line 90
    goto/16 :goto_b

    .line 91
    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-wide v4, v3

    .line 94
    move-object v3, v8

    .line 95
    goto/16 :goto_11

    .line 96
    .line 97
    :cond_3
    iget v2, v7, La/oou;->q:I

    .line 98
    .line 99
    iget v3, v7, La/oou;->p:I

    .line 100
    .line 101
    iget-wide v4, v7, La/oou;->m:J

    .line 102
    .line 103
    iget-boolean v6, v7, La/oou;->r:Z

    .line 104
    .line 105
    iget v9, v7, La/oou;->o:I

    .line 106
    .line 107
    iget v10, v7, La/oou;->n:I

    .line 108
    .line 109
    iget-wide v14, v7, La/oou;->l:J

    .line 110
    .line 111
    iget-object v12, v7, La/oou;->k:La/oou;

    .line 112
    .line 113
    iget-object v11, v7, La/oou;->j:La/pou;

    .line 114
    .line 115
    iget-object v0, v7, La/oou;->i:Ljava/lang/Object;

    .line 116
    .line 117
    move-object/from16 v18, v0

    .line 118
    .line 119
    check-cast v18, Ljava/lang/String;

    .line 120
    .line 121
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    .line 123
    .line 124
    move-object/from16 v0, p1

    .line 125
    .line 126
    move-object/from16 v13, v18

    .line 127
    .line 128
    goto/16 :goto_3

    .line 129
    .line 130
    :catchall_1
    move-exception v0

    .line 131
    move v13, v10

    .line 132
    move v10, v2

    .line 133
    move v2, v3

    .line 134
    move-wide v3, v4

    .line 135
    move v5, v6

    .line 136
    move v6, v9

    .line 137
    move-object v9, v11

    .line 138
    move v11, v13

    .line 139
    move-object/from16 v13, v18

    .line 140
    .line 141
    goto/16 :goto_6

    .line 142
    .line 143
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iget v0, v1, La/xe60;->b:I

    .line 147
    .line 148
    if-nez v0, :cond_5

    .line 149
    .line 150
    iget-short v0, v7, La/oou;->u:S

    .line 151
    .line 152
    int-to-long v2, v0

    .line 153
    goto :goto_1

    .line 154
    :cond_5
    const-wide/16 v2, 0x0

    .line 155
    .line 156
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 157
    .line 158
    .line 159
    move-result-wide v4

    .line 160
    iget-object v0, v7, La/oou;->v:La/pou;

    .line 161
    .line 162
    iget v6, v7, La/oou;->w:I

    .line 163
    .line 164
    iget v9, v7, La/oou;->x:I

    .line 165
    .line 166
    iget-object v10, v7, La/oou;->y:Ljava/lang/String;

    .line 167
    .line 168
    iget-boolean v11, v7, La/oou;->z:Z

    .line 169
    .line 170
    move-object v12, v0

    .line 171
    move-wide v13, v2

    .line 172
    move-wide/from16 v19, v4

    .line 173
    .line 174
    move-object v5, v7

    .line 175
    move v2, v9

    .line 176
    move-object v3, v10

    .line 177
    move v4, v11

    .line 178
    const/4 v10, 0x0

    .line 179
    const/4 v11, 0x0

    .line 180
    move-object v9, v1

    .line 181
    move v1, v6

    .line 182
    :goto_2
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 183
    .line 184
    iget-object v0, v12, La/pou;->a:La/qgd;

    .line 185
    .line 186
    iget v6, v9, La/xe60;->b:I

    .line 187
    .line 188
    move v15, v6

    .line 189
    iget v6, v9, La/xe60;->a:I

    .line 190
    .line 191
    iput-object v9, v7, La/oou;->t:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v3, v7, La/oou;->i:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v12, v7, La/oou;->j:La/pou;

    .line 196
    .line 197
    iput-object v5, v7, La/oou;->k:La/oou;

    .line 198
    .line 199
    iput-wide v13, v7, La/oou;->l:J

    .line 200
    .line 201
    iput v1, v7, La/oou;->n:I

    .line 202
    .line 203
    iput v2, v7, La/oou;->o:I

    .line 204
    .line 205
    iput-boolean v4, v7, La/oou;->r:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 206
    .line 207
    move-object/from16 p1, v12

    .line 208
    .line 209
    move-wide/from16 v21, v13

    .line 210
    .line 211
    move-wide/from16 v12, v19

    .line 212
    .line 213
    :try_start_3
    iput-wide v12, v7, La/oou;->m:J

    .line 214
    .line 215
    iput v11, v7, La/oou;->p:I

    .line 216
    .line 217
    iput v10, v7, La/oou;->q:I

    .line 218
    .line 219
    const/4 v14, 0x1

    .line 220
    iput-byte v14, v7, La/oou;->s:B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 221
    .line 222
    move-object v14, v5

    .line 223
    move v5, v15

    .line 224
    :try_start_4
    invoke-virtual/range {v0 .. v7}, La/qgd;->F(IILjava/lang/String;ZIILa/zje;)Ljava/io/Serializable;

    .line 225
    .line 226
    .line 227
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 228
    if-ne v0, v8, :cond_6

    .line 229
    .line 230
    move-object v3, v8

    .line 231
    goto/16 :goto_12

    .line 232
    .line 233
    :cond_6
    move v5, v10

    .line 234
    move v10, v1

    .line 235
    move-object v1, v9

    .line 236
    move v9, v2

    .line 237
    move v2, v5

    .line 238
    move v6, v4

    .line 239
    move-wide v4, v12

    .line 240
    move-object v12, v14

    .line 241
    move-wide/from16 v14, v21

    .line 242
    .line 243
    move-object v13, v3

    .line 244
    move v3, v11

    .line 245
    move-object/from16 v11, p1

    .line 246
    .line 247
    :goto_3
    :try_start_5
    check-cast v0, Ljava/util/List;

    .line 248
    .line 249
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 250
    .line 251
    move-object v3, v8

    .line 252
    goto/16 :goto_f

    .line 253
    .line 254
    :catchall_2
    move-exception v0

    .line 255
    move/from16 v23, v10

    .line 256
    .line 257
    move v10, v2

    .line 258
    move v2, v3

    .line 259
    move-wide v3, v4

    .line 260
    move v5, v6

    .line 261
    move v6, v9

    .line 262
    move-object v9, v11

    .line 263
    move/from16 v11, v23

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :catchall_3
    move-exception v0

    .line 267
    :goto_4
    move v6, v2

    .line 268
    move v5, v4

    .line 269
    move v2, v11

    .line 270
    move v11, v1

    .line 271
    move-object v1, v9

    .line 272
    move-object/from16 v9, p1

    .line 273
    .line 274
    move-wide/from16 v23, v12

    .line 275
    .line 276
    move-object v13, v3

    .line 277
    move-wide/from16 v3, v23

    .line 278
    .line 279
    move-object v12, v14

    .line 280
    move-wide/from16 v14, v21

    .line 281
    .line 282
    goto :goto_6

    .line 283
    :catchall_4
    move-exception v0

    .line 284
    :goto_5
    move-object v14, v5

    .line 285
    goto :goto_4

    .line 286
    :catchall_5
    move-exception v0

    .line 287
    move-object/from16 p1, v12

    .line 288
    .line 289
    move-wide/from16 v21, v13

    .line 290
    .line 291
    move-wide/from16 v12, v19

    .line 292
    .line 293
    goto :goto_5

    .line 294
    :goto_6
    if-eqz v2, :cond_7

    .line 295
    .line 296
    move/from16 p1, v10

    .line 297
    .line 298
    :try_start_6
    instance-of v10, v0, La/zhi0;

    .line 299
    .line 300
    if-eqz v10, :cond_8

    .line 301
    .line 302
    move-object v10, v0

    .line 303
    check-cast v10, La/zhi0;

    .line 304
    .line 305
    iget-boolean v10, v10, La/zhi0;->e:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 306
    .line 307
    if-eqz v10, :cond_8

    .line 308
    .line 309
    const/16 v19, 0x1

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_7
    move/from16 p1, v10

    .line 313
    .line 314
    :cond_8
    const/16 v19, 0x0

    .line 315
    .line 316
    :goto_7
    :try_start_7
    instance-of v10, v0, Ljava/util/concurrent/CancellationException;

    .line 317
    .line 318
    if-nez v10, :cond_10

    .line 319
    .line 320
    instance-of v10, v0, Ljava/net/ConnectException;

    .line 321
    .line 322
    if-nez v10, :cond_10

    .line 323
    .line 324
    if-nez v19, :cond_10

    .line 325
    .line 326
    instance-of v10, v0, La/zhi0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_a

    .line 327
    .line 328
    if-eqz v10, :cond_b

    .line 329
    .line 330
    :try_start_8
    move-object v10, v0

    .line 331
    check-cast v10, La/zhi0;

    .line 332
    .line 333
    iget-boolean v10, v10, La/zhi0;->f:Z

    .line 334
    .line 335
    if-nez v10, :cond_a

    .line 336
    .line 337
    move-object v10, v0

    .line 338
    check-cast v10, La/zhi0;

    .line 339
    .line 340
    iget-boolean v10, v10, La/zhi0;->e:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 341
    .line 342
    if-eqz v10, :cond_9

    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_9
    const/16 v18, 0x0

    .line 346
    .line 347
    :goto_8
    const/16 v19, 0x1

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_a
    :goto_9
    const/16 v18, 0x1

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_b
    :try_start_9
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 354
    .line 355
    .line 356
    move-result v10
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    .line 357
    if-nez v10, :cond_9

    .line 358
    .line 359
    goto :goto_9

    .line 360
    :goto_a
    add-int/lit8 v10, p1, 0x1

    .line 361
    .line 362
    move-object/from16 v20, v8

    .line 363
    .line 364
    const/4 v8, 0x3

    .line 365
    if-gt v10, v8, :cond_c

    .line 366
    .line 367
    if-eqz v18, :cond_d

    .line 368
    .line 369
    :cond_c
    move-wide/from16 v17, v3

    .line 370
    .line 371
    move-object/from16 v3, v20

    .line 372
    .line 373
    goto/16 :goto_e

    .line 374
    .line 375
    :cond_d
    :try_start_a
    new-instance v8, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .line 379
    .line 380
    move/from16 p1, v2

    .line 381
    .line 382
    const-string v2, "error ("

    .line 383
    .line 384
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    const-string v2, "): "

    .line 391
    .line 392
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 403
    .line 404
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    iput-object v1, v7, La/oou;->t:Ljava/lang/Object;

    .line 408
    .line 409
    iput-object v13, v7, La/oou;->i:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v9, v7, La/oou;->j:La/pou;

    .line 412
    .line 413
    iput-object v12, v7, La/oou;->k:La/oou;

    .line 414
    .line 415
    iput-wide v14, v7, La/oou;->l:J

    .line 416
    .line 417
    iput v11, v7, La/oou;->n:I

    .line 418
    .line 419
    iput v6, v7, La/oou;->o:I

    .line 420
    .line 421
    iput-boolean v5, v7, La/oou;->r:Z

    .line 422
    .line 423
    iput-wide v3, v7, La/oou;->m:J

    .line 424
    .line 425
    move/from16 v0, p1

    .line 426
    .line 427
    iput v0, v7, La/oou;->p:I

    .line 428
    .line 429
    iput v10, v7, La/oou;->q:I

    .line 430
    .line 431
    const/4 v2, 0x2

    .line 432
    iput-byte v2, v7, La/oou;->s:B
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 433
    .line 434
    move-wide/from16 v17, v3

    .line 435
    .line 436
    const-wide/16 v2, 0xbb8

    .line 437
    .line 438
    :try_start_b
    invoke-static {v2, v3, v12}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 442
    move-object/from16 v3, v20

    .line 443
    .line 444
    if-ne v2, v3, :cond_e

    .line 445
    .line 446
    goto/16 :goto_12

    .line 447
    .line 448
    :cond_e
    move v2, v6

    .line 449
    move-object v6, v9

    .line 450
    move-object v9, v1

    .line 451
    move v1, v11

    .line 452
    move v11, v0

    .line 453
    move v0, v10

    .line 454
    move-object v10, v13

    .line 455
    goto/16 :goto_0

    .line 456
    .line 457
    :goto_b
    move-object v8, v3

    .line 458
    move v4, v5

    .line 459
    move-object v3, v10

    .line 460
    move-object v5, v12

    .line 461
    move-wide/from16 v19, v17

    .line 462
    .line 463
    move v10, v0

    .line 464
    move-object v12, v6

    .line 465
    goto/16 :goto_2

    .line 466
    .line 467
    :catchall_6
    move-exception v0

    .line 468
    :goto_c
    move-object/from16 v3, v20

    .line 469
    .line 470
    :goto_d
    move-wide/from16 v4, v17

    .line 471
    .line 472
    goto :goto_11

    .line 473
    :catchall_7
    move-exception v0

    .line 474
    move-wide/from16 v17, v3

    .line 475
    .line 476
    goto :goto_c

    .line 477
    :goto_e
    :try_start_c
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 478
    .line 479
    new-instance v1, La/g0g0;

    .line 480
    .line 481
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 482
    .line 483
    .line 484
    move-object v0, v1

    .line 485
    move-wide/from16 v4, v17

    .line 486
    .line 487
    :goto_f
    :try_start_d
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    check-cast v0, Ljava/util/List;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 491
    .line 492
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 493
    .line 494
    .line 495
    move-result-wide v1

    .line 496
    sub-long/2addr v1, v4

    .line 497
    cmp-long v6, v1, v14

    .line 498
    .line 499
    if-gez v6, :cond_f

    .line 500
    .line 501
    sub-long v1, v14, v1

    .line 502
    .line 503
    const/4 v6, 0x0

    .line 504
    iput-object v6, v7, La/oou;->t:Ljava/lang/Object;

    .line 505
    .line 506
    iput-object v0, v7, La/oou;->i:Ljava/lang/Object;

    .line 507
    .line 508
    iput-object v6, v7, La/oou;->j:La/pou;

    .line 509
    .line 510
    iput-object v6, v7, La/oou;->k:La/oou;

    .line 511
    .line 512
    iput-wide v14, v7, La/oou;->l:J

    .line 513
    .line 514
    iput-wide v4, v7, La/oou;->m:J

    .line 515
    .line 516
    const/4 v8, 0x3

    .line 517
    iput-byte v8, v7, La/oou;->s:B

    .line 518
    .line 519
    invoke-static {v1, v2, v7}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    if-ne v1, v3, :cond_f

    .line 524
    .line 525
    goto :goto_12

    .line 526
    :cond_f
    :goto_10
    return-object v0

    .line 527
    :catchall_8
    move-exception v0

    .line 528
    goto :goto_11

    .line 529
    :catchall_9
    move-exception v0

    .line 530
    goto :goto_d

    .line 531
    :catchall_a
    move-exception v0

    .line 532
    move-wide/from16 v17, v3

    .line 533
    .line 534
    move-object v3, v8

    .line 535
    goto :goto_d

    .line 536
    :cond_10
    move-wide/from16 v17, v3

    .line 537
    .line 538
    move-object v3, v8

    .line 539
    :try_start_e
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 540
    :goto_11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 541
    .line 542
    .line 543
    move-result-wide v1

    .line 544
    sub-long/2addr v1, v4

    .line 545
    cmp-long v6, v1, v14

    .line 546
    .line 547
    if-gez v6, :cond_11

    .line 548
    .line 549
    sub-long v1, v14, v1

    .line 550
    .line 551
    const/4 v6, 0x0

    .line 552
    iput-object v6, v7, La/oou;->t:Ljava/lang/Object;

    .line 553
    .line 554
    iput-object v0, v7, La/oou;->i:Ljava/lang/Object;

    .line 555
    .line 556
    iput-object v6, v7, La/oou;->j:La/pou;

    .line 557
    .line 558
    iput-object v6, v7, La/oou;->k:La/oou;

    .line 559
    .line 560
    iput-wide v14, v7, La/oou;->l:J

    .line 561
    .line 562
    iput-wide v4, v7, La/oou;->m:J

    .line 563
    .line 564
    const/4 v4, 0x4

    .line 565
    iput-byte v4, v7, La/oou;->s:B

    .line 566
    .line 567
    invoke-static {v1, v2, v7}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    if-ne v1, v3, :cond_11

    .line 572
    .line 573
    :goto_12
    return-object v3

    .line 574
    :cond_11
    :goto_13
    throw v0
.end method
