.class public final La/f7q;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/h7q;

.field public j:La/f7q;

.field public k:Ljava/lang/Throwable;

.field public l:I

.field public m:I

.field public n:I

.field public o:J

.field public p:J

.field public q:B

.field public final synthetic r:La/h7q;


# direct methods
.method public constructor <init>(La/h7q;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/f7q;->r:La/h7q;

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
    new-instance p1, La/f7q;

    .line 2
    .line 3
    iget-object p0, p0, La/f7q;->r:La/h7q;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/f7q;-><init>(La/h7q;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/f7q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/f7q;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/f7q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v1, La/f7q;->q:B

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x1

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v7, :cond_2

    .line 14
    .line 15
    if-eq v0, v4, :cond_1

    .line 16
    .line 17
    if-ne v0, v3, :cond_0

    .line 18
    .line 19
    iget v0, v1, La/f7q;->n:I

    .line 20
    .line 21
    iget v8, v1, La/f7q;->m:I

    .line 22
    .line 23
    iget-wide v9, v1, La/f7q;->p:J

    .line 24
    .line 25
    iget-wide v11, v1, La/f7q;->o:J

    .line 26
    .line 27
    iget v13, v1, La/f7q;->l:I

    .line 28
    .line 29
    iget-object v14, v1, La/f7q;->k:Ljava/lang/Throwable;

    .line 30
    .line 31
    iget-object v15, v1, La/f7q;->j:La/f7q;

    .line 32
    .line 33
    iget-object v5, v1, La/f7q;->i:La/h7q;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v7, v15

    .line 39
    move-object v15, v5

    .line 40
    move v5, v8

    .line 41
    move-wide v8, v9

    .line 42
    move-wide v10, v11

    .line 43
    move v12, v13

    .line 44
    move-object v13, v14

    .line 45
    move-object v14, v7

    .line 46
    move v7, v3

    .line 47
    move-object/from16 v16, v6

    .line 48
    .line 49
    goto/16 :goto_9

    .line 50
    .line 51
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v6

    .line 57
    :cond_1
    iget v0, v1, La/f7q;->n:I

    .line 58
    .line 59
    iget v5, v1, La/f7q;->m:I

    .line 60
    .line 61
    iget-wide v8, v1, La/f7q;->p:J

    .line 62
    .line 63
    iget-wide v10, v1, La/f7q;->o:J

    .line 64
    .line 65
    iget v12, v1, La/f7q;->l:I

    .line 66
    .line 67
    iget-object v13, v1, La/f7q;->k:Ljava/lang/Throwable;

    .line 68
    .line 69
    iget-object v14, v1, La/f7q;->j:La/f7q;

    .line 70
    .line 71
    iget-object v15, v1, La/f7q;->i:La/h7q;

    .line 72
    .line 73
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object/from16 v16, v6

    .line 77
    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :cond_2
    iget v5, v1, La/f7q;->m:I

    .line 81
    .line 82
    iget-wide v8, v1, La/f7q;->p:J

    .line 83
    .line 84
    iget-wide v10, v1, La/f7q;->o:J

    .line 85
    .line 86
    iget v12, v1, La/f7q;->l:I

    .line 87
    .line 88
    iget-object v13, v1, La/f7q;->k:Ljava/lang/Throwable;

    .line 89
    .line 90
    iget-object v14, v1, La/f7q;->j:La/f7q;

    .line 91
    .line 92
    iget-object v15, v1, La/f7q;->i:La/h7q;

    .line 93
    .line 94
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    move-object/from16 v0, p1

    .line 98
    .line 99
    move-object/from16 v16, v6

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    move-object/from16 v16, v13

    .line 104
    .line 105
    move-object v13, v0

    .line 106
    move-object/from16 v0, v16

    .line 107
    .line 108
    move-object/from16 v16, v6

    .line 109
    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v1, La/f7q;->r:La/h7q;

    .line 116
    .line 117
    iget-object v5, v0, La/h7q;->c:La/q6q;

    .line 118
    .line 119
    iget-object v5, v5, La/q6q;->e:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_11

    .line 126
    .line 127
    sget-wide v8, La/cag0;->a:J

    .line 128
    .line 129
    const-wide/16 v10, 0x3

    .line 130
    .line 131
    move-object v15, v0

    .line 132
    move-object v14, v1

    .line 133
    move-object v13, v6

    .line 134
    move v0, v7

    .line 135
    move v12, v0

    .line 136
    const/4 v5, 0x0

    .line 137
    :goto_0
    if-eqz v0, :cond_f

    .line 138
    .line 139
    move-object/from16 v16, v6

    .line 140
    .line 141
    :try_start_1
    iget-object v6, v15, La/h7q;->b:La/a7q;

    .line 142
    .line 143
    iget-object v3, v15, La/h7q;->e:La/knf0;

    .line 144
    .line 145
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iput-object v15, v1, La/f7q;->i:La/h7q;

    .line 150
    .line 151
    iput-object v14, v1, La/f7q;->j:La/f7q;

    .line 152
    .line 153
    iput-object v13, v1, La/f7q;->k:Ljava/lang/Throwable;

    .line 154
    .line 155
    iput v12, v1, La/f7q;->l:I

    .line 156
    .line 157
    iput-wide v10, v1, La/f7q;->o:J

    .line 158
    .line 159
    iput-wide v8, v1, La/f7q;->p:J

    .line 160
    .line 161
    iput v5, v1, La/f7q;->m:I

    .line 162
    .line 163
    iput v0, v1, La/f7q;->n:I

    .line 164
    .line 165
    iput-byte v7, v1, La/f7q;->q:B

    .line 166
    .line 167
    iget-object v0, v6, La/a7q;->a:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, La/wgn;

    .line 170
    .line 171
    invoke-virtual {v0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, La/y5q;

    .line 176
    .line 177
    invoke-interface {v0, v3, v1}, La/y5q;->c(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-ne v0, v2, :cond_4

    .line 182
    .line 183
    goto/16 :goto_8

    .line 184
    .line 185
    :cond_4
    :goto_1
    check-cast v0, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 186
    .line 187
    new-instance v1, Ljava/util/ArrayList;

    .line 188
    .line 189
    const/16 v2, 0xa

    .line 190
    .line 191
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_5

    .line 207
    .line 208
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, La/jcq;

    .line 213
    .line 214
    invoke-static {v2}, La/plc;->O(La/jcq;)La/gcq;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_5
    iget-object v0, v15, La/h7q;->c:La/q6q;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    iput-object v1, v0, La/q6q;->e:Ljava/util/List;

    .line 228
    .line 229
    return-object v1

    .line 230
    :catchall_1
    move-exception v0

    .line 231
    move-object/from16 v19, v13

    .line 232
    .line 233
    move-object v13, v0

    .line 234
    move-object/from16 v0, v19

    .line 235
    .line 236
    :goto_3
    invoke-static {v13}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-eqz v3, :cond_a

    .line 241
    .line 242
    if-nez v12, :cond_6

    .line 243
    .line 244
    new-instance v0, La/el50;

    .line 245
    .line 246
    invoke-direct {v0, v13}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    move-object v13, v0

    .line 250
    move-object/from16 v6, v16

    .line 251
    .line 252
    const/4 v0, 0x0

    .line 253
    const/4 v3, 0x3

    .line 254
    goto :goto_0

    .line 255
    :cond_6
    move-wide/from16 v17, v8

    .line 256
    .line 257
    int-to-long v7, v5

    .line 258
    cmp-long v6, v7, v10

    .line 259
    .line 260
    if-gez v6, :cond_7

    .line 261
    .line 262
    const/4 v6, 0x1

    .line 263
    goto :goto_4

    .line 264
    :cond_7
    const/4 v6, 0x0

    .line 265
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 266
    .line 267
    if-eqz v6, :cond_8

    .line 268
    .line 269
    iput-object v15, v1, La/f7q;->i:La/h7q;

    .line 270
    .line 271
    iput-object v14, v1, La/f7q;->j:La/f7q;

    .line 272
    .line 273
    iput-object v0, v1, La/f7q;->k:Ljava/lang/Throwable;

    .line 274
    .line 275
    iput v12, v1, La/f7q;->l:I

    .line 276
    .line 277
    iput-wide v10, v1, La/f7q;->o:J

    .line 278
    .line 279
    move-wide/from16 v8, v17

    .line 280
    .line 281
    iput-wide v8, v1, La/f7q;->p:J

    .line 282
    .line 283
    iput v5, v1, La/f7q;->m:I

    .line 284
    .line 285
    iput v6, v1, La/f7q;->n:I

    .line 286
    .line 287
    iput-byte v4, v1, La/f7q;->q:B

    .line 288
    .line 289
    invoke-static {v8, v9, v14}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    if-ne v7, v2, :cond_9

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :goto_5
    move-object/from16 v6, v16

    .line 297
    .line 298
    const/4 v3, 0x3

    .line 299
    :goto_6
    const/4 v7, 0x1

    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_8
    move-wide/from16 v8, v17

    .line 303
    .line 304
    new-instance v0, La/el50;

    .line 305
    .line 306
    invoke-direct {v0, v13}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    :cond_9
    move-object v13, v0

    .line 310
    move v0, v6

    .line 311
    goto :goto_5

    .line 312
    :cond_a
    invoke-static {v13}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    if-eqz v6, :cond_e

    .line 317
    .line 318
    int-to-long v6, v5

    .line 319
    cmp-long v6, v6, v10

    .line 320
    .line 321
    if-gez v6, :cond_b

    .line 322
    .line 323
    const/4 v6, 0x1

    .line 324
    goto :goto_7

    .line 325
    :cond_b
    const/4 v6, 0x0

    .line 326
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 327
    .line 328
    if-eqz v6, :cond_c

    .line 329
    .line 330
    iput-object v15, v1, La/f7q;->i:La/h7q;

    .line 331
    .line 332
    iput-object v14, v1, La/f7q;->j:La/f7q;

    .line 333
    .line 334
    iput-object v0, v1, La/f7q;->k:Ljava/lang/Throwable;

    .line 335
    .line 336
    iput v12, v1, La/f7q;->l:I

    .line 337
    .line 338
    iput-wide v10, v1, La/f7q;->o:J

    .line 339
    .line 340
    iput-wide v8, v1, La/f7q;->p:J

    .line 341
    .line 342
    iput v5, v1, La/f7q;->m:I

    .line 343
    .line 344
    iput v6, v1, La/f7q;->n:I

    .line 345
    .line 346
    const/4 v7, 0x3

    .line 347
    iput-byte v7, v1, La/f7q;->q:B

    .line 348
    .line 349
    invoke-static {v8, v9, v14}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v13

    .line 353
    if-ne v13, v2, :cond_d

    .line 354
    .line 355
    :goto_8
    return-object v2

    .line 356
    :goto_9
    move v3, v7

    .line 357
    move-object/from16 v6, v16

    .line 358
    .line 359
    goto :goto_6

    .line 360
    :cond_c
    const/4 v7, 0x3

    .line 361
    new-instance v0, La/dag0;

    .line 362
    .line 363
    invoke-direct {v0, v13}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    :cond_d
    move-object v13, v0

    .line 367
    move v0, v6

    .line 368
    goto :goto_9

    .line 369
    :cond_e
    const/4 v7, 0x3

    .line 370
    invoke-static {v13}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 371
    .line 372
    .line 373
    move v3, v7

    .line 374
    move-object/from16 v6, v16

    .line 375
    .line 376
    const/4 v0, 0x0

    .line 377
    goto :goto_6

    .line 378
    :cond_f
    move-object/from16 v16, v6

    .line 379
    .line 380
    if-nez v13, :cond_10

    .line 381
    .line 382
    const-string v0, "Unexpected error"

    .line 383
    .line 384
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    return-object v16

    .line 388
    :cond_10
    throw v13

    .line 389
    :cond_11
    return-object v5
.end method
