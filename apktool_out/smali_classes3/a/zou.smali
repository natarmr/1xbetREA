.class public final La/zou;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/vne;

.field public k:La/edu;

.field public l:I

.field public m:I

.field public n:J

.field public o:B

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/edu;

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(La/edu;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/zou;->i:B

    iput-object p1, p0, La/zou;->q:La/edu;

    iput-wide p2, p0, La/zou;->r:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/zou;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/zou;

    .line 7
    .line 8
    iget-wide v3, p0, La/zou;->r:J

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v2, p0, La/zou;->q:La/edu;

    .line 12
    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, La/zou;-><init>(La/edu;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v1, La/zou;->p:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    move-object v5, p2

    .line 21
    new-instance v2, La/zou;

    .line 22
    .line 23
    move-object v6, v5

    .line 24
    iget-wide v4, p0, La/zou;->r:J

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    iget-object v3, p0, La/zou;->q:La/edu;

    .line 28
    .line 29
    invoke-direct/range {v2 .. v7}, La/zou;-><init>(La/edu;JLa/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v2, La/zou;->p:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v2

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zou;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/zou;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zou;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zou;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/zou;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/zou;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/zou;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/zou;->i:B

    .line 4
    .line 5
    const-string v4, "): "

    .line 6
    .line 7
    const-string v5, "error ("

    .line 8
    .line 9
    const/4 v6, 0x3

    .line 10
    iget-wide v7, v1, La/zou;->r:J

    .line 11
    .line 12
    iget-object v9, v1, La/zou;->q:La/edu;

    .line 13
    .line 14
    const-string v10, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    const/4 v11, 0x1

    .line 17
    const/4 v13, 0x2

    .line 18
    const/4 v14, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object v0, v1, La/zou;->p:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/vne;

    .line 25
    .line 26
    sget-object v15, La/wne;->a:La/wne;

    .line 27
    .line 28
    iget-byte v12, v1, La/zou;->o:B

    .line 29
    .line 30
    if-eqz v12, :cond_2

    .line 31
    .line 32
    if-eq v12, v11, :cond_1

    .line 33
    .line 34
    if-ne v12, v13, :cond_0

    .line 35
    .line 36
    iget v0, v1, La/zou;->m:I

    .line 37
    .line 38
    iget-wide v7, v1, La/zou;->n:J

    .line 39
    .line 40
    iget v9, v1, La/zou;->l:I

    .line 41
    .line 42
    iget-object v10, v1, La/zou;->k:La/edu;

    .line 43
    .line 44
    iget-object v12, v1, La/zou;->j:La/vne;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v2, v10

    .line 50
    move v10, v9

    .line 51
    move-object v9, v2

    .line 52
    move/from16 v16, v11

    .line 53
    .line 54
    move-object v2, v12

    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_0
    invoke-static {v10}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_b

    .line 61
    .line 62
    :cond_1
    iget v7, v1, La/zou;->m:I

    .line 63
    .line 64
    iget-wide v8, v1, La/zou;->n:J

    .line 65
    .line 66
    iget v10, v1, La/zou;->l:I

    .line 67
    .line 68
    iget-object v12, v1, La/zou;->k:La/edu;

    .line 69
    .line 70
    iget-object v2, v1, La/zou;->j:La/vne;

    .line 71
    .line 72
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    move-object/from16 v0, p1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object v2, v0

    .line 84
    const/4 v3, 0x0

    .line 85
    const/4 v10, 0x0

    .line 86
    :goto_0
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 87
    .line 88
    iput-object v14, v1, La/zou;->p:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v2, v1, La/zou;->j:La/vne;

    .line 91
    .line 92
    iput-object v9, v1, La/zou;->k:La/edu;

    .line 93
    .line 94
    iput v10, v1, La/zou;->l:I

    .line 95
    .line 96
    iput-wide v7, v1, La/zou;->n:J

    .line 97
    .line 98
    iput v3, v1, La/zou;->m:I

    .line 99
    .line 100
    iput-byte v11, v1, La/zou;->o:B

    .line 101
    .line 102
    iget-object v0, v9, La/edu;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, La/qgd;

    .line 105
    .line 106
    invoke-virtual {v0, v7, v8, v1}, La/qgd;->z(JLa/zje;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    if-ne v0, v15, :cond_3

    .line 111
    .line 112
    goto/16 :goto_7

    .line 113
    .line 114
    :cond_3
    move-object v12, v9

    .line 115
    move-wide v8, v7

    .line 116
    move v7, v3

    .line 117
    :goto_1
    :try_start_2
    check-cast v0, La/toe;

    .line 118
    .line 119
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    move-object v14, v0

    .line 122
    goto/16 :goto_a

    .line 123
    .line 124
    :goto_2
    move-object v12, v9

    .line 125
    move-wide v8, v7

    .line 126
    move v7, v3

    .line 127
    goto :goto_3

    .line 128
    :catchall_1
    move-exception v0

    .line 129
    goto :goto_2

    .line 130
    :goto_3
    if-eqz v10, :cond_4

    .line 131
    .line 132
    instance-of v3, v0, La/zhi0;

    .line 133
    .line 134
    if-eqz v3, :cond_4

    .line 135
    .line 136
    move-object v3, v0

    .line 137
    check-cast v3, La/zhi0;

    .line 138
    .line 139
    iget-boolean v3, v3, La/zhi0;->e:Z

    .line 140
    .line 141
    if-eqz v3, :cond_4

    .line 142
    .line 143
    move v3, v11

    .line 144
    move/from16 v16, v3

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_4
    move/from16 v16, v11

    .line 148
    .line 149
    const/4 v3, 0x0

    .line 150
    :goto_4
    instance-of v11, v0, Ljava/util/concurrent/CancellationException;

    .line 151
    .line 152
    if-nez v11, :cond_b

    .line 153
    .line 154
    instance-of v11, v0, Ljava/net/ConnectException;

    .line 155
    .line 156
    if-nez v11, :cond_b

    .line 157
    .line 158
    if-nez v3, :cond_b

    .line 159
    .line 160
    instance-of v3, v0, La/zhi0;

    .line 161
    .line 162
    if-eqz v3, :cond_7

    .line 163
    .line 164
    move-object v3, v0

    .line 165
    check-cast v3, La/zhi0;

    .line 166
    .line 167
    iget-boolean v11, v3, La/zhi0;->f:Z

    .line 168
    .line 169
    if-nez v11, :cond_6

    .line 170
    .line 171
    iget-boolean v3, v3, La/zhi0;->e:Z

    .line 172
    .line 173
    if-eqz v3, :cond_5

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_5
    const/4 v3, 0x0

    .line 177
    goto :goto_6

    .line 178
    :cond_6
    :goto_5
    move/from16 v3, v16

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_7
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-nez v3, :cond_5

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 189
    .line 190
    if-gt v7, v6, :cond_a

    .line 191
    .line 192
    if-eqz v3, :cond_8

    .line 193
    .line 194
    goto :goto_9

    .line 195
    :cond_8
    invoke-static {v7, v5, v4, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 200
    .line 201
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iput-object v14, v1, La/zou;->p:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object v2, v1, La/zou;->j:La/vne;

    .line 207
    .line 208
    iput-object v12, v1, La/zou;->k:La/edu;

    .line 209
    .line 210
    iput v10, v1, La/zou;->l:I

    .line 211
    .line 212
    iput-wide v8, v1, La/zou;->n:J

    .line 213
    .line 214
    iput v7, v1, La/zou;->m:I

    .line 215
    .line 216
    iput-byte v13, v1, La/zou;->o:B

    .line 217
    .line 218
    move/from16 p1, v7

    .line 219
    .line 220
    const-wide/16 v6, 0xbb8

    .line 221
    .line 222
    invoke-static {v6, v7, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-ne v0, v15, :cond_9

    .line 227
    .line 228
    :goto_7
    move-object v14, v15

    .line 229
    goto :goto_b

    .line 230
    :cond_9
    move/from16 v0, p1

    .line 231
    .line 232
    move-wide v7, v8

    .line 233
    move-object v9, v12

    .line 234
    :goto_8
    move v3, v0

    .line 235
    move/from16 v11, v16

    .line 236
    .line 237
    const/4 v6, 0x3

    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_a
    :goto_9
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 241
    .line 242
    new-instance v1, La/g0g0;

    .line 243
    .line 244
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    move-object v14, v1

    .line 248
    :goto_a
    invoke-static {v14}, La/z1x;->P(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    :goto_b
    return-object v14

    .line 252
    :cond_b
    throw v0

    .line 253
    :pswitch_0
    move/from16 v16, v11

    .line 254
    .line 255
    iget-object v0, v1, La/zou;->p:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, La/vne;

    .line 258
    .line 259
    sget-object v2, La/wne;->a:La/wne;

    .line 260
    .line 261
    iget-byte v6, v1, La/zou;->o:B

    .line 262
    .line 263
    if-eqz v6, :cond_e

    .line 264
    .line 265
    move/from16 v11, v16

    .line 266
    .line 267
    if-eq v6, v11, :cond_d

    .line 268
    .line 269
    if-ne v6, v13, :cond_c

    .line 270
    .line 271
    iget v0, v1, La/zou;->m:I

    .line 272
    .line 273
    iget-wide v6, v1, La/zou;->n:J

    .line 274
    .line 275
    iget v8, v1, La/zou;->l:I

    .line 276
    .line 277
    iget-object v9, v1, La/zou;->k:La/edu;

    .line 278
    .line 279
    iget-object v10, v1, La/zou;->j:La/vne;

    .line 280
    .line 281
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    move-object v15, v4

    .line 285
    move v11, v8

    .line 286
    const-wide/16 v3, 0xbb8

    .line 287
    .line 288
    const/4 v12, 0x1

    .line 289
    move-wide/from16 v17, v6

    .line 290
    .line 291
    move v7, v0

    .line 292
    move-object v6, v10

    .line 293
    move-object v10, v9

    .line 294
    :goto_c
    move-wide/from16 v8, v17

    .line 295
    .line 296
    goto/16 :goto_15

    .line 297
    .line 298
    :cond_c
    invoke-static {v10}, La/jf4;->n(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_18

    .line 302
    .line 303
    :cond_d
    iget v6, v1, La/zou;->m:I

    .line 304
    .line 305
    iget-wide v7, v1, La/zou;->n:J

    .line 306
    .line 307
    iget v9, v1, La/zou;->l:I

    .line 308
    .line 309
    iget-object v10, v1, La/zou;->k:La/edu;

    .line 310
    .line 311
    iget-object v11, v1, La/zou;->j:La/vne;

    .line 312
    .line 313
    :try_start_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 314
    .line 315
    .line 316
    move-object/from16 v0, p1

    .line 317
    .line 318
    goto :goto_e

    .line 319
    :catchall_2
    move-exception v0

    .line 320
    move-object/from16 v17, v11

    .line 321
    .line 322
    move v11, v9

    .line 323
    move-object/from16 v9, v17

    .line 324
    .line 325
    goto :goto_10

    .line 326
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    move-object v6, v0

    .line 330
    move-object v10, v9

    .line 331
    const/4 v11, 0x0

    .line 332
    move-wide v8, v7

    .line 333
    const/4 v7, 0x0

    .line 334
    :goto_d
    :try_start_4
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 335
    .line 336
    iput-object v14, v1, La/zou;->p:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object v6, v1, La/zou;->j:La/vne;

    .line 339
    .line 340
    iput-object v10, v1, La/zou;->k:La/edu;

    .line 341
    .line 342
    iput v11, v1, La/zou;->l:I

    .line 343
    .line 344
    iput-wide v8, v1, La/zou;->n:J

    .line 345
    .line 346
    iput v7, v1, La/zou;->m:I

    .line 347
    .line 348
    const/4 v12, 0x1

    .line 349
    iput-byte v12, v1, La/zou;->o:B

    .line 350
    .line 351
    iget-object v0, v10, La/edu;->c:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, La/qgd;

    .line 354
    .line 355
    iget-object v12, v0, La/qgd;->f:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v12, La/btt0;

    .line 358
    .line 359
    invoke-virtual {v12}, La/btt0;->a()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v12

    .line 363
    invoke-virtual {v0, v8, v9, v1, v12}, La/qgd;->w(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 367
    if-ne v0, v2, :cond_f

    .line 368
    .line 369
    goto/16 :goto_14

    .line 370
    .line 371
    :cond_f
    move/from16 v17, v11

    .line 372
    .line 373
    move-object v11, v6

    .line 374
    move v6, v7

    .line 375
    move-wide v7, v8

    .line 376
    move/from16 v9, v17

    .line 377
    .line 378
    :goto_e
    :try_start_5
    check-cast v0, La/hl;

    .line 379
    .line 380
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 381
    .line 382
    move-object v14, v0

    .line 383
    goto/16 :goto_17

    .line 384
    .line 385
    :goto_f
    move-wide/from16 v17, v8

    .line 386
    .line 387
    move-object v9, v6

    .line 388
    move v6, v7

    .line 389
    move-wide/from16 v7, v17

    .line 390
    .line 391
    goto :goto_10

    .line 392
    :catchall_3
    move-exception v0

    .line 393
    goto :goto_f

    .line 394
    :goto_10
    if-eqz v11, :cond_10

    .line 395
    .line 396
    instance-of v12, v0, La/zhi0;

    .line 397
    .line 398
    if-eqz v12, :cond_10

    .line 399
    .line 400
    move-object v12, v0

    .line 401
    check-cast v12, La/zhi0;

    .line 402
    .line 403
    iget-boolean v12, v12, La/zhi0;->e:Z

    .line 404
    .line 405
    if-eqz v12, :cond_10

    .line 406
    .line 407
    const/4 v12, 0x1

    .line 408
    goto :goto_11

    .line 409
    :cond_10
    const/4 v12, 0x0

    .line 410
    :goto_11
    instance-of v15, v0, Ljava/util/concurrent/CancellationException;

    .line 411
    .line 412
    if-nez v15, :cond_17

    .line 413
    .line 414
    instance-of v15, v0, Ljava/net/ConnectException;

    .line 415
    .line 416
    if-nez v15, :cond_17

    .line 417
    .line 418
    if-nez v12, :cond_17

    .line 419
    .line 420
    instance-of v12, v0, La/zhi0;

    .line 421
    .line 422
    if-eqz v12, :cond_13

    .line 423
    .line 424
    move-object v12, v0

    .line 425
    check-cast v12, La/zhi0;

    .line 426
    .line 427
    iget-boolean v15, v12, La/zhi0;->f:Z

    .line 428
    .line 429
    if-nez v15, :cond_12

    .line 430
    .line 431
    iget-boolean v12, v12, La/zhi0;->e:Z

    .line 432
    .line 433
    if-eqz v12, :cond_11

    .line 434
    .line 435
    goto :goto_12

    .line 436
    :cond_11
    const/4 v12, 0x1

    .line 437
    const/16 v16, 0x0

    .line 438
    .line 439
    goto :goto_13

    .line 440
    :cond_12
    :goto_12
    const/4 v12, 0x1

    .line 441
    const/16 v16, 0x1

    .line 442
    .line 443
    goto :goto_13

    .line 444
    :cond_13
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 445
    .line 446
    .line 447
    move-result v12

    .line 448
    if-nez v12, :cond_11

    .line 449
    .line 450
    goto :goto_12

    .line 451
    :goto_13
    add-int/2addr v6, v12

    .line 452
    const/4 v3, 0x3

    .line 453
    if-gt v6, v3, :cond_16

    .line 454
    .line 455
    if-eqz v16, :cond_14

    .line 456
    .line 457
    goto :goto_16

    .line 458
    :cond_14
    invoke-static {v6, v5, v4, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    sget-object v15, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 463
    .line 464
    invoke-virtual {v15, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    iput-object v14, v1, La/zou;->p:Ljava/lang/Object;

    .line 468
    .line 469
    iput-object v9, v1, La/zou;->j:La/vne;

    .line 470
    .line 471
    iput-object v10, v1, La/zou;->k:La/edu;

    .line 472
    .line 473
    iput v11, v1, La/zou;->l:I

    .line 474
    .line 475
    iput-wide v7, v1, La/zou;->n:J

    .line 476
    .line 477
    iput v6, v1, La/zou;->m:I

    .line 478
    .line 479
    iput-byte v13, v1, La/zou;->o:B

    .line 480
    .line 481
    move-object v15, v4

    .line 482
    const-wide/16 v3, 0xbb8

    .line 483
    .line 484
    invoke-static {v3, v4, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    if-ne v0, v2, :cond_15

    .line 489
    .line 490
    :goto_14
    move-object v14, v2

    .line 491
    goto :goto_18

    .line 492
    :cond_15
    move-wide/from16 v17, v7

    .line 493
    .line 494
    move v7, v6

    .line 495
    move-object v6, v9

    .line 496
    goto/16 :goto_c

    .line 497
    .line 498
    :goto_15
    move-object v4, v15

    .line 499
    goto/16 :goto_d

    .line 500
    .line 501
    :cond_16
    :goto_16
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 502
    .line 503
    new-instance v1, La/g0g0;

    .line 504
    .line 505
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 506
    .line 507
    .line 508
    move-object v14, v1

    .line 509
    :goto_17
    invoke-static {v14}, La/z1x;->P(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    :goto_18
    return-object v14

    .line 513
    :cond_17
    throw v0

    .line 514
    nop

    .line 515
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
