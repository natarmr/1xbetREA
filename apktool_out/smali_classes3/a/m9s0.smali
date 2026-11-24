.class public final La/m9s0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/vne;

.field public j:La/h0q0;

.field public k:Ljava/lang/Integer;

.field public l:La/vne;

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:B

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/h0q0;

.field public final synthetic t:Z

.field public final synthetic u:Ljava/lang/Integer;

.field public final synthetic v:I


# direct methods
.method public constructor <init>(La/h0q0;ZLjava/lang/Integer;ILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/m9s0;->s:La/h0q0;

    .line 2
    .line 3
    iput-boolean p2, p0, La/m9s0;->t:Z

    .line 4
    .line 5
    iput-object p3, p0, La/m9s0;->u:Ljava/lang/Integer;

    .line 6
    .line 7
    iput p4, p0, La/m9s0;->v:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/m9s0;

    .line 2
    .line 3
    iget-object v3, p0, La/m9s0;->u:Ljava/lang/Integer;

    .line 4
    .line 5
    iget v4, p0, La/m9s0;->v:I

    .line 6
    .line 7
    iget-object v1, p0, La/m9s0;->s:La/h0q0;

    .line 8
    .line 9
    iget-boolean v2, p0, La/m9s0;->t:Z

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/m9s0;-><init>(La/h0q0;ZLjava/lang/Integer;ILa/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/m9s0;->r:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/m9s0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/m9s0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/m9s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, La/m9s0;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/vne;

    .line 6
    .line 7
    sget-object v6, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v1, v5, La/m9s0;->q:B

    .line 10
    .line 11
    const/4 v7, 0x2

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    if-eq v1, v10, :cond_1

    .line 17
    .line 18
    if-ne v1, v7, :cond_0

    .line 19
    .line 20
    iget v0, v5, La/m9s0;->o:I

    .line 21
    .line 22
    iget v1, v5, La/m9s0;->n:I

    .line 23
    .line 24
    iget-boolean v2, v5, La/m9s0;->p:Z

    .line 25
    .line 26
    iget v3, v5, La/m9s0;->m:I

    .line 27
    .line 28
    iget-object v4, v5, La/m9s0;->l:La/vne;

    .line 29
    .line 30
    check-cast v4, Ljava/lang/Throwable;

    .line 31
    .line 32
    iget-object v4, v5, La/m9s0;->k:Ljava/lang/Integer;

    .line 33
    .line 34
    iget-object v11, v5, La/m9s0;->j:La/h0q0;

    .line 35
    .line 36
    iget-object v12, v5, La/m9s0;->i:La/vne;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move v14, v3

    .line 42
    move v3, v1

    .line 43
    move-object v1, v11

    .line 44
    move-object v11, v12

    .line 45
    move v13, v2

    .line 46
    move-object v15, v4

    .line 47
    goto/16 :goto_c

    .line 48
    .line 49
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v9

    .line 55
    :cond_1
    iget v1, v5, La/m9s0;->o:I

    .line 56
    .line 57
    iget v2, v5, La/m9s0;->n:I

    .line 58
    .line 59
    iget-boolean v3, v5, La/m9s0;->p:Z

    .line 60
    .line 61
    iget v4, v5, La/m9s0;->m:I

    .line 62
    .line 63
    iget-object v11, v5, La/m9s0;->k:Ljava/lang/Integer;

    .line 64
    .line 65
    iget-object v12, v5, La/m9s0;->j:La/h0q0;

    .line 66
    .line 67
    iget-object v13, v5, La/m9s0;->i:La/vne;

    .line 68
    .line 69
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    move-object/from16 v0, p1

    .line 73
    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move v14, v3

    .line 78
    move v3, v2

    .line 79
    move v2, v14

    .line 80
    move v14, v4

    .line 81
    move-object v4, v11

    .line 82
    move-object v11, v12

    .line 83
    goto/16 :goto_7

    .line 84
    .line 85
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v1, v5, La/m9s0;->s:La/h0q0;

    .line 89
    .line 90
    iget-boolean v2, v5, La/m9s0;->t:Z

    .line 91
    .line 92
    iget-object v3, v5, La/m9s0;->u:Ljava/lang/Integer;

    .line 93
    .line 94
    iget v4, v5, La/m9s0;->v:I

    .line 95
    .line 96
    move-object v11, v0

    .line 97
    move v13, v2

    .line 98
    move-object v15, v3

    .line 99
    move v3, v4

    .line 100
    const/4 v12, 0x0

    .line 101
    const/4 v14, 0x0

    .line 102
    :goto_0
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 103
    .line 104
    iget-object v0, v1, La/h0q0;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, La/l9s0;

    .line 107
    .line 108
    iget-object v2, v1, La/h0q0;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, La/knf0;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object v2, v1, La/h0q0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, La/knf0;

    .line 118
    .line 119
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget-object v4, v1, La/h0q0;->a:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, La/knf0;

    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 128
    .line 129
    .line 130
    if-eqz v13, :cond_3

    .line 131
    .line 132
    :try_start_2
    iget-object v4, v1, La/h0q0;->d:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, La/btt0;

    .line 135
    .line 136
    invoke-virtual {v4}, La/btt0;->a()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 140
    goto :goto_1

    .line 141
    :catchall_1
    move-exception v0

    .line 142
    move v2, v13

    .line 143
    move-object v4, v15

    .line 144
    move-object v13, v11

    .line 145
    move-object v11, v1

    .line 146
    move v1, v12

    .line 147
    goto/16 :goto_7

    .line 148
    .line 149
    :cond_3
    move-object v4, v9

    .line 150
    :goto_1
    move-object/from16 v16, v4

    .line 151
    .line 152
    if-eqz v13, :cond_4

    .line 153
    .line 154
    move-object v4, v15

    .line 155
    goto :goto_2

    .line 156
    :cond_4
    move-object v4, v9

    .line 157
    :goto_2
    :try_start_3
    iput-object v9, v5, La/m9s0;->r:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v11, v5, La/m9s0;->i:La/vne;

    .line 160
    .line 161
    iput-object v1, v5, La/m9s0;->j:La/h0q0;

    .line 162
    .line 163
    iput-object v15, v5, La/m9s0;->k:Ljava/lang/Integer;

    .line 164
    .line 165
    iput-object v11, v5, La/m9s0;->l:La/vne;

    .line 166
    .line 167
    iput v14, v5, La/m9s0;->m:I

    .line 168
    .line 169
    iput-boolean v13, v5, La/m9s0;->p:Z

    .line 170
    .line 171
    iput v3, v5, La/m9s0;->n:I

    .line 172
    .line 173
    iput v12, v5, La/m9s0;->o:I

    .line 174
    .line 175
    iput-byte v10, v5, La/m9s0;->q:B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 176
    .line 177
    move-object/from16 v17, v16

    .line 178
    .line 179
    move-object/from16 v16, v1

    .line 180
    .line 181
    move-object/from16 v1, v17

    .line 182
    .line 183
    :try_start_4
    invoke-static/range {v0 .. v5}, La/l9s0;->b(La/l9s0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;La/zje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 187
    if-ne v0, v6, :cond_5

    .line 188
    .line 189
    goto/16 :goto_b

    .line 190
    .line 191
    :cond_5
    move v2, v3

    .line 192
    move v1, v12

    .line 193
    move v3, v13

    .line 194
    move v4, v14

    .line 195
    move-object/from16 v12, v16

    .line 196
    .line 197
    move-object v13, v11

    .line 198
    move-object v11, v15

    .line 199
    :goto_3
    :try_start_5
    check-cast v0, La/dx5;

    .line 200
    .line 201
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, La/fzr0;

    .line 206
    .line 207
    iget-object v0, v0, La/fzr0;->a:Ljava/util/List;

    .line 208
    .line 209
    if-nez v0, :cond_6

    .line 210
    .line 211
    sget-object v0, La/iun;->a:La/iun;

    .line 212
    .line 213
    :cond_6
    new-instance v14, Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    :cond_7
    :goto_4
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_9

    .line 227
    .line 228
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, La/bzr0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 233
    .line 234
    :try_start_6
    sget-object v16, La/j0g0;->b:La/e0g0;

    .line 235
    .line 236
    invoke-static {v0}, La/eyr0;->a(La/bzr0;)La/myr0;

    .line 237
    .line 238
    .line 239
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 240
    goto :goto_5

    .line 241
    :catchall_2
    move-exception v0

    .line 242
    :try_start_7
    sget-object v16, La/j0g0;->b:La/e0g0;

    .line 243
    .line 244
    new-instance v8, La/g0g0;

    .line 245
    .line 246
    invoke-direct {v8, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    move-object v0, v8

    .line 250
    :goto_5
    nop

    .line 251
    instance-of v8, v0, La/g0g0;

    .line 252
    .line 253
    if-eqz v8, :cond_8

    .line 254
    .line 255
    move-object v0, v9

    .line 256
    :cond_8
    check-cast v0, La/myr0;

    .line 257
    .line 258
    if-eqz v0, :cond_7

    .line 259
    .line 260
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_9
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 265
    .line 266
    goto/16 :goto_e

    .line 267
    .line 268
    :catchall_3
    move-exception v0

    .line 269
    :goto_6
    move v1, v12

    .line 270
    move v2, v13

    .line 271
    move-object v4, v15

    .line 272
    move-object v13, v11

    .line 273
    move-object/from16 v11, v16

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :catchall_4
    move-exception v0

    .line 277
    move-object/from16 v16, v1

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :goto_7
    if-eqz v14, :cond_a

    .line 281
    .line 282
    instance-of v8, v0, La/zhi0;

    .line 283
    .line 284
    if-eqz v8, :cond_a

    .line 285
    .line 286
    move-object v8, v0

    .line 287
    check-cast v8, La/zhi0;

    .line 288
    .line 289
    iget-boolean v8, v8, La/zhi0;->e:Z

    .line 290
    .line 291
    if-eqz v8, :cond_a

    .line 292
    .line 293
    move v8, v10

    .line 294
    goto :goto_8

    .line 295
    :cond_a
    const/4 v8, 0x0

    .line 296
    :goto_8
    instance-of v12, v0, Ljava/util/concurrent/CancellationException;

    .line 297
    .line 298
    if-nez v12, :cond_11

    .line 299
    .line 300
    instance-of v12, v0, Ljava/net/ConnectException;

    .line 301
    .line 302
    if-nez v12, :cond_11

    .line 303
    .line 304
    if-nez v8, :cond_11

    .line 305
    .line 306
    instance-of v8, v0, La/zhi0;

    .line 307
    .line 308
    if-eqz v8, :cond_d

    .line 309
    .line 310
    move-object v8, v0

    .line 311
    check-cast v8, La/zhi0;

    .line 312
    .line 313
    iget-boolean v12, v8, La/zhi0;->f:Z

    .line 314
    .line 315
    if-nez v12, :cond_c

    .line 316
    .line 317
    iget-boolean v8, v8, La/zhi0;->e:Z

    .line 318
    .line 319
    if-eqz v8, :cond_b

    .line 320
    .line 321
    goto :goto_9

    .line 322
    :cond_b
    const/4 v8, 0x0

    .line 323
    goto :goto_a

    .line 324
    :cond_c
    :goto_9
    move v8, v10

    .line 325
    goto :goto_a

    .line 326
    :cond_d
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 327
    .line 328
    .line 329
    move-result v8

    .line 330
    if-nez v8, :cond_b

    .line 331
    .line 332
    goto :goto_9

    .line 333
    :goto_a
    add-int/2addr v1, v10

    .line 334
    const/4 v12, 0x3

    .line 335
    if-gt v1, v12, :cond_10

    .line 336
    .line 337
    if-eqz v8, :cond_e

    .line 338
    .line 339
    goto :goto_d

    .line 340
    :cond_e
    const-string v8, "error ("

    .line 341
    .line 342
    const-string v12, "): "

    .line 343
    .line 344
    invoke-static {v1, v8, v12, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    sget-object v8, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 349
    .line 350
    invoke-virtual {v8, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    iput-object v9, v5, La/m9s0;->r:Ljava/lang/Object;

    .line 354
    .line 355
    iput-object v13, v5, La/m9s0;->i:La/vne;

    .line 356
    .line 357
    iput-object v11, v5, La/m9s0;->j:La/h0q0;

    .line 358
    .line 359
    iput-object v4, v5, La/m9s0;->k:Ljava/lang/Integer;

    .line 360
    .line 361
    iput-object v9, v5, La/m9s0;->l:La/vne;

    .line 362
    .line 363
    iput v14, v5, La/m9s0;->m:I

    .line 364
    .line 365
    iput-boolean v2, v5, La/m9s0;->p:Z

    .line 366
    .line 367
    iput v3, v5, La/m9s0;->n:I

    .line 368
    .line 369
    iput v1, v5, La/m9s0;->o:I

    .line 370
    .line 371
    iput-byte v7, v5, La/m9s0;->q:B

    .line 372
    .line 373
    const-wide/16 v7, 0xbb8

    .line 374
    .line 375
    invoke-static {v7, v8, v5}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    if-ne v0, v6, :cond_f

    .line 380
    .line 381
    :goto_b
    return-object v6

    .line 382
    :cond_f
    move v0, v1

    .line 383
    move-object v1, v11

    .line 384
    move-object v11, v13

    .line 385
    move-object v15, v4

    .line 386
    move v13, v2

    .line 387
    :goto_c
    move v12, v0

    .line 388
    const/4 v7, 0x2

    .line 389
    goto/16 :goto_0

    .line 390
    .line 391
    :cond_10
    :goto_d
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 392
    .line 393
    new-instance v14, La/g0g0;

    .line 394
    .line 395
    invoke-direct {v14, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 396
    .line 397
    .line 398
    :goto_e
    invoke-static {v14}, La/z1x;->P(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    return-object v14

    .line 402
    :cond_11
    throw v0
.end method
