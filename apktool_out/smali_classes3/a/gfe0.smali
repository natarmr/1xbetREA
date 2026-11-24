.class public final La/gfe0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:La/kd30;

.field public k:La/gfe0;

.field public l:J

.field public m:J

.field public n:J

.field public o:J

.field public p:I

.field public q:I

.field public r:I

.field public s:B

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:La/kd30;

.field public final synthetic v:J

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/kd30;JLjava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gfe0;->u:La/kd30;

    .line 2
    .line 3
    iput-wide p2, p0, La/gfe0;->v:J

    .line 4
    .line 5
    iput-object p4, p0, La/gfe0;->w:Ljava/lang/String;

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
    new-instance v0, La/gfe0;

    .line 2
    .line 3
    iget-wide v2, p0, La/gfe0;->v:J

    .line 4
    .line 5
    iget-object v4, p0, La/gfe0;->w:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/gfe0;->u:La/kd30;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/gfe0;-><init>(La/kd30;JLjava/lang/String;La/yje;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, La/gfe0;->t:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/gfe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/gfe0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/gfe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/gfe0;->t:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v0

    .line 6
    check-cast v2, La/xe60;

    .line 7
    .line 8
    sget-object v3, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-byte v0, v1, La/gfe0;->s:B

    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x3

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
    if-eq v0, v5, :cond_2

    .line 22
    .line 23
    if-eq v0, v6, :cond_1

    .line 24
    .line 25
    if-eq v0, v4, :cond_0

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v9

    .line 33
    :cond_0
    iget-object v0, v1, La/gfe0;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Throwable;

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_20

    .line 41
    .line 42
    :cond_1
    iget-object v0, v1, La/gfe0;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/util/List;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_1d

    .line 50
    .line 51
    :cond_2
    iget v0, v1, La/gfe0;->r:I

    .line 52
    .line 53
    iget v10, v1, La/gfe0;->q:I

    .line 54
    .line 55
    iget-wide v11, v1, La/gfe0;->o:J

    .line 56
    .line 57
    iget v13, v1, La/gfe0;->p:I

    .line 58
    .line 59
    iget-wide v14, v1, La/gfe0;->n:J

    .line 60
    .line 61
    move/from16 v16, v10

    .line 62
    .line 63
    iget-wide v9, v1, La/gfe0;->m:J

    .line 64
    .line 65
    iget-wide v4, v1, La/gfe0;->l:J

    .line 66
    .line 67
    iget-object v7, v1, La/gfe0;->k:La/gfe0;

    .line 68
    .line 69
    iget-object v6, v1, La/gfe0;->j:La/kd30;

    .line 70
    .line 71
    iget-object v8, v1, La/gfe0;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, Ljava/lang/String;

    .line 74
    .line 75
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    move-wide/from16 v18, v4

    .line 79
    .line 80
    move-object v4, v6

    .line 81
    move/from16 v6, v16

    .line 82
    .line 83
    const/16 v17, 0x1

    .line 84
    .line 85
    move v5, v0

    .line 86
    move v0, v13

    .line 87
    move-wide/from16 v27, v14

    .line 88
    .line 89
    move-wide v13, v9

    .line 90
    move-wide/from16 v9, v27

    .line 91
    .line 92
    :goto_0
    move-object v15, v7

    .line 93
    goto/16 :goto_19

    .line 94
    .line 95
    :catchall_0
    move-exception v0

    .line 96
    goto/16 :goto_1e

    .line 97
    .line 98
    :cond_3
    iget v4, v1, La/gfe0;->r:I

    .line 99
    .line 100
    iget v5, v1, La/gfe0;->q:I

    .line 101
    .line 102
    iget-wide v6, v1, La/gfe0;->o:J

    .line 103
    .line 104
    iget v8, v1, La/gfe0;->p:I

    .line 105
    .line 106
    iget-wide v9, v1, La/gfe0;->n:J

    .line 107
    .line 108
    iget-wide v11, v1, La/gfe0;->m:J

    .line 109
    .line 110
    iget-wide v13, v1, La/gfe0;->l:J

    .line 111
    .line 112
    iget-object v15, v1, La/gfe0;->k:La/gfe0;

    .line 113
    .line 114
    move/from16 v16, v4

    .line 115
    .line 116
    iget-object v4, v1, La/gfe0;->j:La/kd30;

    .line 117
    .line 118
    iget-object v0, v1, La/gfe0;->i:Ljava/lang/Object;

    .line 119
    .line 120
    move-object/from16 v18, v0

    .line 121
    .line 122
    check-cast v18, Ljava/lang/String;

    .line 123
    .line 124
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    .line 126
    .line 127
    move-object/from16 v0, p1

    .line 128
    .line 129
    move-object/from16 v19, v2

    .line 130
    .line 131
    move-object v2, v3

    .line 132
    :goto_1
    move-object/from16 v3, v18

    .line 133
    .line 134
    goto/16 :goto_9

    .line 135
    .line 136
    :catchall_1
    move-exception v0

    .line 137
    move-object/from16 p1, v3

    .line 138
    .line 139
    move-object v3, v2

    .line 140
    move-object/from16 v2, p1

    .line 141
    .line 142
    move/from16 p1, v16

    .line 143
    .line 144
    move/from16 v16, v5

    .line 145
    .line 146
    move-wide/from16 v27, v6

    .line 147
    .line 148
    move-object v6, v4

    .line 149
    move-wide v4, v9

    .line 150
    move-wide v9, v11

    .line 151
    move-object v7, v15

    .line 152
    move-wide/from16 v11, v27

    .line 153
    .line 154
    move v15, v8

    .line 155
    move-object/from16 v8, v18

    .line 156
    .line 157
    goto/16 :goto_15

    .line 158
    .line 159
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget v0, v2, La/xe60;->b:I

    .line 163
    .line 164
    if-nez v0, :cond_5

    .line 165
    .line 166
    const-wide/16 v4, 0x3e8

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_5
    const-wide/16 v4, 0x0

    .line 170
    .line 171
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    iget-object v0, v1, La/gfe0;->u:La/kd30;

    .line 176
    .line 177
    iget-wide v8, v1, La/gfe0;->v:J

    .line 178
    .line 179
    const/16 v10, 0x1e

    .line 180
    .line 181
    iget-object v11, v1, La/gfe0;->w:Ljava/lang/String;

    .line 182
    .line 183
    move-object v15, v1

    .line 184
    move-object/from16 v16, v3

    .line 185
    .line 186
    move-wide v13, v4

    .line 187
    move/from16 v19, v10

    .line 188
    .line 189
    move-object v3, v11

    .line 190
    move-object v4, v0

    .line 191
    move-wide v11, v13

    .line 192
    move-wide v9, v8

    .line 193
    const/4 v5, 0x0

    .line 194
    move-wide v7, v6

    .line 195
    const/4 v6, 0x0

    .line 196
    :goto_3
    :try_start_2
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_13

    .line 197
    .line 198
    :try_start_3
    iget-object v0, v4, La/kd30;->a:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_12

    .line 199
    .line 200
    move/from16 p1, v5

    .line 201
    .line 202
    :try_start_4
    move-object v5, v0

    .line 203
    check-cast v5, La/xzp;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_11

    .line 204
    .line 205
    :try_start_5
    new-instance v0, Ljava/lang/Long;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_10

    .line 206
    .line 207
    move-object/from16 v26, v5

    .line 208
    .line 209
    move/from16 v25, v6

    .line 210
    .line 211
    const-wide/16 v5, 0x338

    .line 212
    .line 213
    :try_start_6
    invoke-direct {v0, v5, v6}, Ljava/lang/Long;-><init>(J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_f

    .line 214
    .line 215
    .line 216
    :try_start_7
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v20
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_d

    .line 220
    :try_start_8
    new-instance v0, Ljava/lang/Long;

    .line 221
    .line 222
    invoke-direct {v0, v9, v10}, Ljava/lang/Long;-><init>(J)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_e

    .line 223
    .line 224
    .line 225
    :try_start_9
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 226
    .line 227
    .line 228
    move-result-wide v5

    .line 229
    sget-object v18, La/nw80;->t:La/nw80;

    .line 230
    .line 231
    invoke-virtual/range {v18 .. v18}, La/nw80;->getId()J

    .line 232
    .line 233
    .line 234
    move-result-wide v21
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_d

    .line 235
    cmp-long v5, v5, v21

    .line 236
    .line 237
    if-eqz v5, :cond_6

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_6
    const/4 v0, 0x0

    .line 241
    :goto_4
    if-eqz v0, :cond_7

    .line 242
    .line 243
    :try_start_a
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 244
    .line 245
    .line 246
    move-result-wide v5

    .line 247
    new-instance v0, Ljava/lang/Long;

    .line 248
    .line 249
    invoke-direct {v0, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 250
    .line 251
    .line 252
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 256
    move-object/from16 v22, v0

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :catchall_2
    move-exception v0

    .line 260
    move-object v6, v4

    .line 261
    move-wide v4, v9

    .line 262
    move-wide v9, v11

    .line 263
    move-wide v11, v7

    .line 264
    move-object v7, v15

    .line 265
    move/from16 v15, v19

    .line 266
    .line 267
    :goto_5
    move-object v8, v3

    .line 268
    move-object v3, v2

    .line 269
    move-object/from16 v2, v16

    .line 270
    .line 271
    move/from16 v16, v25

    .line 272
    .line 273
    goto/16 :goto_15

    .line 274
    .line 275
    :cond_7
    const/16 v22, 0x0

    .line 276
    .line 277
    :goto_6
    :try_start_b
    iget v0, v2, La/xe60;->b:I

    .line 278
    .line 279
    const/16 v23, 0x0

    .line 280
    .line 281
    const/16 v24, 0xfd8

    .line 282
    .line 283
    const/16 v21, 0x0

    .line 284
    .line 285
    move/from16 v18, v0

    .line 286
    .line 287
    invoke-static/range {v18 .. v24}, La/phu0;->C(IILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;I)La/edy;

    .line 288
    .line 289
    .line 290
    move-result-object v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_d

    .line 291
    move/from16 v6, v19

    .line 292
    .line 293
    :try_start_c
    iget-object v0, v4, La/kd30;->b:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, La/btt0;

    .line 296
    .line 297
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 301
    move-object/from16 v18, v5

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :catchall_3
    move-exception v0

    .line 305
    :try_start_d
    sget-object v18, La/j0g0;->b:La/e0g0;

    .line 306
    .line 307
    move-object/from16 v18, v5

    .line 308
    .line 309
    new-instance v5, La/g0g0;

    .line 310
    .line 311
    invoke-direct {v5, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 312
    .line 313
    .line 314
    move-object v0, v5

    .line 315
    :goto_7
    nop

    .line 316
    instance-of v5, v0, La/g0g0;

    .line 317
    .line 318
    if-eqz v5, :cond_8

    .line 319
    .line 320
    const/4 v0, 0x0

    .line 321
    :cond_8
    check-cast v0, Ljava/lang/String;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 322
    .line 323
    if-eqz v0, :cond_9

    .line 324
    .line 325
    :try_start_e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 326
    .line 327
    .line 328
    move-result v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 329
    if-lez v5, :cond_9

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :catchall_4
    move-exception v0

    .line 333
    move/from16 v27, v6

    .line 334
    .line 335
    move-object v6, v4

    .line 336
    move-wide v4, v9

    .line 337
    move-wide v9, v11

    .line 338
    move-wide v11, v7

    .line 339
    move-object v7, v15

    .line 340
    move/from16 v15, v27

    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_9
    const/4 v0, 0x0

    .line 344
    :goto_8
    :try_start_f
    iput-object v2, v1, La/gfe0;->t:Ljava/lang/Object;

    .line 345
    .line 346
    iput-object v3, v1, La/gfe0;->i:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object v4, v1, La/gfe0;->j:La/kd30;

    .line 349
    .line 350
    iput-object v15, v1, La/gfe0;->k:La/gfe0;

    .line 351
    .line 352
    iput-wide v13, v1, La/gfe0;->l:J

    .line 353
    .line 354
    iput-wide v11, v1, La/gfe0;->m:J

    .line 355
    .line 356
    iput-wide v9, v1, La/gfe0;->n:J

    .line 357
    .line 358
    iput v6, v1, La/gfe0;->p:I

    .line 359
    .line 360
    iput-wide v7, v1, La/gfe0;->o:J
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_c

    .line 361
    .line 362
    move/from16 v5, v25

    .line 363
    .line 364
    :try_start_10
    iput v5, v1, La/gfe0;->q:I
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    .line 365
    .line 366
    move-object/from16 v19, v2

    .line 367
    .line 368
    move/from16 v2, p1

    .line 369
    .line 370
    :try_start_11
    iput v2, v1, La/gfe0;->r:I
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 371
    .line 372
    move/from16 p1, v2

    .line 373
    .line 374
    const/4 v2, 0x1

    .line 375
    :try_start_12
    iput-byte v2, v1, La/gfe0;->s:B
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 376
    .line 377
    move-object/from16 v2, v18

    .line 378
    .line 379
    move-object/from16 v18, v3

    .line 380
    .line 381
    move-object v3, v2

    .line 382
    move-object/from16 v2, v26

    .line 383
    .line 384
    :try_start_13
    invoke-virtual {v2, v3, v0, v1}, La/xzp;->W(La/edy;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 388
    move-object/from16 v2, v16

    .line 389
    .line 390
    if-ne v0, v2, :cond_a

    .line 391
    .line 392
    move-object v3, v2

    .line 393
    goto/16 :goto_1f

    .line 394
    .line 395
    :cond_a
    move-wide/from16 v27, v7

    .line 396
    .line 397
    move v8, v6

    .line 398
    move-wide/from16 v6, v27

    .line 399
    .line 400
    move/from16 v16, p1

    .line 401
    .line 402
    goto/16 :goto_1

    .line 403
    .line 404
    :goto_9
    :try_start_14
    check-cast v0, La/dx5;

    .line 405
    .line 406
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    check-cast v0, La/ty0;

    .line 411
    .line 412
    iget-object v0, v0, La/ty0;->a:Ljava/util/List;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 413
    .line 414
    if-eqz v0, :cond_b

    .line 415
    .line 416
    move-object/from16 p1, v4

    .line 417
    .line 418
    :try_start_15
    new-instance v4, Ljava/util/ArrayList;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 419
    .line 420
    move/from16 v18, v5

    .line 421
    .line 422
    const/16 v5, 0xa

    .line 423
    .line 424
    :try_start_16
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 429
    .line 430
    .line 431
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-eqz v5, :cond_c

    .line 440
    .line 441
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    check-cast v5, La/bw0;

    .line 446
    .line 447
    invoke-static {v5, v3}, La/saj;->h0(La/bw0;Ljava/lang/String;)La/mlr;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    goto :goto_a

    .line 455
    :catchall_5
    move-exception v0

    .line 456
    :goto_b
    move-wide v4, v9

    .line 457
    move-wide v9, v11

    .line 458
    move-wide v11, v6

    .line 459
    move-object v7, v15

    .line 460
    move-object/from16 v6, p1

    .line 461
    .line 462
    move v15, v8

    .line 463
    move/from16 p1, v16

    .line 464
    .line 465
    move/from16 v16, v18

    .line 466
    .line 467
    move-object v8, v3

    .line 468
    move-object/from16 v3, v19

    .line 469
    .line 470
    goto/16 :goto_15

    .line 471
    .line 472
    :catchall_6
    move-exception v0

    .line 473
    :goto_c
    move/from16 v18, v5

    .line 474
    .line 475
    goto :goto_b

    .line 476
    :cond_b
    move-object/from16 p1, v4

    .line 477
    .line 478
    move/from16 v18, v5

    .line 479
    .line 480
    const/4 v4, 0x0

    .line 481
    :cond_c
    if-nez v4, :cond_d

    .line 482
    .line 483
    sget-object v4, La/iun;->a:La/iun;

    .line 484
    .line 485
    :cond_d
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_5

    .line 486
    .line 487
    move-object v3, v2

    .line 488
    move-wide v9, v11

    .line 489
    move-wide v11, v6

    .line 490
    goto/16 :goto_1c

    .line 491
    .line 492
    :catchall_7
    move-exception v0

    .line 493
    move-object/from16 p1, v4

    .line 494
    .line 495
    goto :goto_c

    .line 496
    :catchall_8
    move-exception v0

    .line 497
    :goto_d
    move-object/from16 v2, v16

    .line 498
    .line 499
    :goto_e
    move/from16 v16, v5

    .line 500
    .line 501
    move-object/from16 v3, v19

    .line 502
    .line 503
    move/from16 v27, v6

    .line 504
    .line 505
    move-object v6, v4

    .line 506
    move-wide v4, v9

    .line 507
    move-wide v9, v11

    .line 508
    move-wide v11, v7

    .line 509
    move-object v7, v15

    .line 510
    move-object/from16 v8, v18

    .line 511
    .line 512
    move/from16 v15, v27

    .line 513
    .line 514
    goto :goto_15

    .line 515
    :catchall_9
    move-exception v0

    .line 516
    :goto_f
    move-object/from16 v18, v3

    .line 517
    .line 518
    goto :goto_d

    .line 519
    :catchall_a
    move-exception v0

    .line 520
    move/from16 p1, v2

    .line 521
    .line 522
    goto :goto_f

    .line 523
    :catchall_b
    move-exception v0

    .line 524
    move-object/from16 v19, v2

    .line 525
    .line 526
    goto :goto_f

    .line 527
    :catchall_c
    move-exception v0

    .line 528
    move-object/from16 v19, v2

    .line 529
    .line 530
    move-object/from16 v18, v3

    .line 531
    .line 532
    move-object/from16 v2, v16

    .line 533
    .line 534
    move/from16 v5, v25

    .line 535
    .line 536
    goto :goto_e

    .line 537
    :catchall_d
    move-exception v0

    .line 538
    move-object/from16 v18, v3

    .line 539
    .line 540
    move/from16 v6, v19

    .line 541
    .line 542
    move/from16 v5, v25

    .line 543
    .line 544
    :goto_10
    move-object/from16 v19, v2

    .line 545
    .line 546
    goto :goto_d

    .line 547
    :catchall_e
    move-exception v0

    .line 548
    move-object/from16 v18, v3

    .line 549
    .line 550
    move/from16 v6, v19

    .line 551
    .line 552
    move/from16 v5, v25

    .line 553
    .line 554
    :goto_11
    move-object/from16 v19, v2

    .line 555
    .line 556
    goto :goto_d

    .line 557
    :catchall_f
    move-exception v0

    .line 558
    move/from16 v5, v25

    .line 559
    .line 560
    :goto_12
    move-object/from16 v18, v3

    .line 561
    .line 562
    :goto_13
    move/from16 v6, v19

    .line 563
    .line 564
    goto :goto_11

    .line 565
    :catchall_10
    move-exception v0

    .line 566
    move v5, v6

    .line 567
    goto :goto_12

    .line 568
    :catchall_11
    move-exception v0

    .line 569
    :goto_14
    move-object/from16 v18, v3

    .line 570
    .line 571
    move v5, v6

    .line 572
    goto :goto_13

    .line 573
    :catchall_12
    move-exception v0

    .line 574
    move/from16 p1, v5

    .line 575
    .line 576
    goto :goto_14

    .line 577
    :catchall_13
    move-exception v0

    .line 578
    move-object/from16 v18, v3

    .line 579
    .line 580
    move/from16 p1, v5

    .line 581
    .line 582
    move v5, v6

    .line 583
    move/from16 v6, v19

    .line 584
    .line 585
    goto :goto_10

    .line 586
    :goto_15
    if-eqz v16, :cond_e

    .line 587
    .line 588
    move-object/from16 v18, v2

    .line 589
    .line 590
    :try_start_17
    instance-of v2, v0, La/zhi0;

    .line 591
    .line 592
    if-eqz v2, :cond_f

    .line 593
    .line 594
    move-object v2, v0

    .line 595
    check-cast v2, La/zhi0;

    .line 596
    .line 597
    iget-boolean v2, v2, La/zhi0;->e:Z
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_14

    .line 598
    .line 599
    if-eqz v2, :cond_f

    .line 600
    .line 601
    const/16 v19, 0x1

    .line 602
    .line 603
    goto :goto_16

    .line 604
    :catchall_14
    move-exception v0

    .line 605
    move-wide v4, v13

    .line 606
    move-object/from16 v3, v18

    .line 607
    .line 608
    goto/16 :goto_1e

    .line 609
    .line 610
    :cond_e
    move-object/from16 v18, v2

    .line 611
    .line 612
    :cond_f
    const/16 v19, 0x0

    .line 613
    .line 614
    :goto_16
    :try_start_18
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 615
    .line 616
    if-nez v2, :cond_17

    .line 617
    .line 618
    instance-of v2, v0, Ljava/net/ConnectException;

    .line 619
    .line 620
    if-nez v2, :cond_17

    .line 621
    .line 622
    if-nez v19, :cond_17

    .line 623
    .line 624
    instance-of v2, v0, La/zhi0;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_15

    .line 625
    .line 626
    if-eqz v2, :cond_12

    .line 627
    .line 628
    :try_start_19
    move-object v2, v0

    .line 629
    check-cast v2, La/zhi0;

    .line 630
    .line 631
    iget-boolean v2, v2, La/zhi0;->f:Z

    .line 632
    .line 633
    if-nez v2, :cond_11

    .line 634
    .line 635
    move-object v2, v0

    .line 636
    check-cast v2, La/zhi0;

    .line 637
    .line 638
    iget-boolean v2, v2, La/zhi0;->e:Z
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_14

    .line 639
    .line 640
    if-eqz v2, :cond_10

    .line 641
    .line 642
    goto :goto_17

    .line 643
    :cond_10
    const/16 v17, 0x1

    .line 644
    .line 645
    const/16 v19, 0x0

    .line 646
    .line 647
    goto :goto_18

    .line 648
    :cond_11
    :goto_17
    const/16 v17, 0x1

    .line 649
    .line 650
    const/16 v19, 0x1

    .line 651
    .line 652
    goto :goto_18

    .line 653
    :cond_12
    :try_start_1a
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 654
    .line 655
    .line 656
    move-result v2
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_15

    .line 657
    if-nez v2, :cond_10

    .line 658
    .line 659
    goto :goto_17

    .line 660
    :goto_18
    add-int/lit8 v2, p1, 0x1

    .line 661
    .line 662
    move-wide/from16 v20, v11

    .line 663
    .line 664
    const/4 v11, 0x3

    .line 665
    if-gt v2, v11, :cond_13

    .line 666
    .line 667
    if-eqz v19, :cond_14

    .line 668
    .line 669
    :cond_13
    move-object/from16 v3, v18

    .line 670
    .line 671
    move-wide/from16 v11, v20

    .line 672
    .line 673
    goto/16 :goto_1b

    .line 674
    .line 675
    :cond_14
    :try_start_1b
    new-instance v11, Ljava/lang/StringBuilder;

    .line 676
    .line 677
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 678
    .line 679
    .line 680
    const-string v12, "error ("

    .line 681
    .line 682
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    const-string v12, "): "

    .line 689
    .line 690
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 701
    .line 702
    invoke-virtual {v11, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    iput-object v3, v1, La/gfe0;->t:Ljava/lang/Object;

    .line 706
    .line 707
    iput-object v8, v1, La/gfe0;->i:Ljava/lang/Object;

    .line 708
    .line 709
    iput-object v6, v1, La/gfe0;->j:La/kd30;

    .line 710
    .line 711
    iput-object v7, v1, La/gfe0;->k:La/gfe0;

    .line 712
    .line 713
    iput-wide v13, v1, La/gfe0;->l:J

    .line 714
    .line 715
    iput-wide v9, v1, La/gfe0;->m:J

    .line 716
    .line 717
    iput-wide v4, v1, La/gfe0;->n:J

    .line 718
    .line 719
    iput v15, v1, La/gfe0;->p:I
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_16

    .line 720
    .line 721
    move-wide/from16 v11, v20

    .line 722
    .line 723
    :try_start_1c
    iput-wide v11, v1, La/gfe0;->o:J

    .line 724
    .line 725
    move/from16 v0, v16

    .line 726
    .line 727
    iput v0, v1, La/gfe0;->q:I

    .line 728
    .line 729
    iput v2, v1, La/gfe0;->r:I

    .line 730
    .line 731
    move/from16 p1, v2

    .line 732
    .line 733
    const/4 v2, 0x2

    .line 734
    iput-byte v2, v1, La/gfe0;->s:B

    .line 735
    .line 736
    move-object/from16 v16, v3

    .line 737
    .line 738
    const-wide/16 v2, 0xbb8

    .line 739
    .line 740
    invoke-static {v2, v3, v7}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v2
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_15

    .line 744
    move-object/from16 v3, v18

    .line 745
    .line 746
    if-ne v2, v3, :cond_15

    .line 747
    .line 748
    goto/16 :goto_1f

    .line 749
    .line 750
    :cond_15
    move-wide/from16 v18, v13

    .line 751
    .line 752
    move-object/from16 v2, v16

    .line 753
    .line 754
    move-wide v13, v9

    .line 755
    move-wide v9, v4

    .line 756
    move-object v4, v6

    .line 757
    move/from16 v5, p1

    .line 758
    .line 759
    move v6, v0

    .line 760
    move v0, v15

    .line 761
    goto/16 :goto_0

    .line 762
    .line 763
    :goto_19
    move-object/from16 v16, v3

    .line 764
    .line 765
    move-object v3, v8

    .line 766
    move-wide v7, v11

    .line 767
    move-wide v11, v13

    .line 768
    move-wide/from16 v13, v18

    .line 769
    .line 770
    move/from16 v19, v0

    .line 771
    .line 772
    goto/16 :goto_3

    .line 773
    .line 774
    :catchall_15
    move-exception v0

    .line 775
    move-object/from16 v3, v18

    .line 776
    .line 777
    :goto_1a
    move-wide v4, v13

    .line 778
    goto :goto_1e

    .line 779
    :catchall_16
    move-exception v0

    .line 780
    move-object/from16 v3, v18

    .line 781
    .line 782
    move-wide/from16 v11, v20

    .line 783
    .line 784
    goto :goto_1a

    .line 785
    :goto_1b
    :try_start_1d
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 786
    .line 787
    new-instance v4, La/g0g0;

    .line 788
    .line 789
    invoke-direct {v4, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 790
    .line 791
    .line 792
    :goto_1c
    invoke-static {v4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    move-object v0, v4

    .line 796
    check-cast v0, Ljava/util/List;
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_17

    .line 797
    .line 798
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 799
    .line 800
    .line 801
    move-result-wide v4

    .line 802
    sub-long v6, v4, v11

    .line 803
    .line 804
    cmp-long v2, v6, v9

    .line 805
    .line 806
    if-gez v2, :cond_16

    .line 807
    .line 808
    sub-long v6, v9, v6

    .line 809
    .line 810
    const/4 v2, 0x0

    .line 811
    iput-object v2, v1, La/gfe0;->t:Ljava/lang/Object;

    .line 812
    .line 813
    iput-object v0, v1, La/gfe0;->i:Ljava/lang/Object;

    .line 814
    .line 815
    iput-object v2, v1, La/gfe0;->j:La/kd30;

    .line 816
    .line 817
    iput-object v2, v1, La/gfe0;->k:La/gfe0;

    .line 818
    .line 819
    iput-wide v13, v1, La/gfe0;->l:J

    .line 820
    .line 821
    iput-wide v9, v1, La/gfe0;->m:J

    .line 822
    .line 823
    iput-wide v11, v1, La/gfe0;->n:J

    .line 824
    .line 825
    iput-wide v4, v1, La/gfe0;->o:J

    .line 826
    .line 827
    const/4 v11, 0x3

    .line 828
    iput-byte v11, v1, La/gfe0;->s:B

    .line 829
    .line 830
    invoke-static {v6, v7, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    if-ne v1, v3, :cond_16

    .line 835
    .line 836
    goto :goto_1f

    .line 837
    :cond_16
    :goto_1d
    return-object v0

    .line 838
    :catchall_17
    move-exception v0

    .line 839
    goto :goto_1a

    .line 840
    :cond_17
    move-object/from16 v3, v18

    .line 841
    .line 842
    :try_start_1e
    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_17

    .line 843
    :goto_1e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 844
    .line 845
    .line 846
    move-result-wide v6

    .line 847
    sub-long v13, v6, v11

    .line 848
    .line 849
    cmp-long v2, v13, v9

    .line 850
    .line 851
    if-gez v2, :cond_18

    .line 852
    .line 853
    sub-long v13, v9, v13

    .line 854
    .line 855
    const/4 v2, 0x0

    .line 856
    iput-object v2, v1, La/gfe0;->t:Ljava/lang/Object;

    .line 857
    .line 858
    iput-object v0, v1, La/gfe0;->i:Ljava/lang/Object;

    .line 859
    .line 860
    iput-object v2, v1, La/gfe0;->j:La/kd30;

    .line 861
    .line 862
    iput-object v2, v1, La/gfe0;->k:La/gfe0;

    .line 863
    .line 864
    iput-wide v4, v1, La/gfe0;->l:J

    .line 865
    .line 866
    iput-wide v9, v1, La/gfe0;->m:J

    .line 867
    .line 868
    iput-wide v11, v1, La/gfe0;->n:J

    .line 869
    .line 870
    iput-wide v6, v1, La/gfe0;->o:J

    .line 871
    .line 872
    const/4 v2, 0x4

    .line 873
    iput-byte v2, v1, La/gfe0;->s:B

    .line 874
    .line 875
    invoke-static {v13, v14, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    if-ne v1, v3, :cond_18

    .line 880
    .line 881
    :goto_1f
    return-object v3

    .line 882
    :cond_18
    :goto_20
    throw v0
.end method
