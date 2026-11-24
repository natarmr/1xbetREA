.class public final La/dhc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/jhc0;

.field public j:Ljava/util/Collection;

.field public k:Ljava/util/Iterator;

.field public l:La/ctf0;

.field public m:La/afc0;

.field public n:La/qz40;

.field public o:Ljava/util/Collection;

.field public p:J

.field public q:B

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/jhc0;


# direct methods
.method public constructor <init>(La/jhc0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dhc0;->s:La/jhc0;

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
    .locals 1

    .line 1
    new-instance v0, La/dhc0;

    .line 2
    .line 3
    iget-object p0, p0, La/dhc0;->s:La/jhc0;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, La/dhc0;-><init>(La/jhc0;La/yje;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/dhc0;->r:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, La/dhc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/dhc0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/dhc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, v1, La/dhc0;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/vne;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v0, v1, La/dhc0;->q:B

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    const/4 v4, 0x2

    .line 14
    const/4 v5, 0x1

    .line 15
    iget-object v6, v1, La/dhc0;->s:La/jhc0;

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    if-eq v0, v5, :cond_1

    .line 21
    .line 22
    if-ne v0, v4, :cond_0

    .line 23
    .line 24
    iget-wide v5, v1, La/dhc0;->p:J

    .line 25
    .line 26
    iget-object v0, v1, La/dhc0;->o:Ljava/util/Collection;

    .line 27
    .line 28
    check-cast v0, Ljava/util/Collection;

    .line 29
    .line 30
    iget-object v3, v1, La/dhc0;->n:La/qz40;

    .line 31
    .line 32
    iget-object v8, v1, La/dhc0;->m:La/afc0;

    .line 33
    .line 34
    iget-object v9, v1, La/dhc0;->l:La/ctf0;

    .line 35
    .line 36
    iget-object v10, v1, La/dhc0;->k:Ljava/util/Iterator;

    .line 37
    .line 38
    iget-object v11, v1, La/dhc0;->j:Ljava/util/Collection;

    .line 39
    .line 40
    check-cast v11, Ljava/util/Collection;

    .line 41
    .line 42
    iget-object v12, v1, La/dhc0;->i:La/jhc0;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v13, v2

    .line 48
    move-object v2, v1

    .line 49
    move-object v1, v13

    .line 50
    move-object v13, v10

    .line 51
    move-object/from16 v24, v11

    .line 52
    .line 53
    move-object/from16 v11, p1

    .line 54
    .line 55
    move/from16 v25, v4

    .line 56
    .line 57
    move-object v4, v3

    .line 58
    move-object/from16 v3, v24

    .line 59
    .line 60
    move-object/from16 v24, v12

    .line 61
    .line 62
    move/from16 v12, v25

    .line 63
    .line 64
    move-wide/from16 v25, v5

    .line 65
    .line 66
    move-object v5, v7

    .line 67
    move-object v7, v9

    .line 68
    move-object/from16 v6, v24

    .line 69
    .line 70
    move-wide/from16 v9, v25

    .line 71
    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v7

    .line 80
    :cond_1
    iget-wide v8, v1, La/dhc0;->p:J

    .line 81
    .line 82
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v0, v2

    .line 86
    move-object v2, v1

    .line 87
    move-object v1, v0

    .line 88
    move-object/from16 v0, p1

    .line 89
    .line 90
    move-object/from16 v23, v6

    .line 91
    .line 92
    goto/16 :goto_2

    .line 93
    .line 94
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, v6, La/jhc0;->b:La/p4u;

    .line 98
    .line 99
    iget-object v0, v0, La/p4u;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, La/onv;

    .line 102
    .line 103
    iget-object v0, v0, La/onv;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, La/lgc0;

    .line 106
    .line 107
    iget-object v8, v0, La/lgc0;->a:La/ngc0;

    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v9, v8, La/ngc0;->a:Ljava/util/List;

    .line 113
    .line 114
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 115
    .line 116
    iget-object v0, v6, La/jhc0;->k:La/ort;

    .line 117
    .line 118
    invoke-virtual {v0}, La/ort;->b()J

    .line 119
    .line 120
    .line 121
    move-result-wide v10

    .line 122
    new-instance v0, Ljava/lang/Long;

    .line 123
    .line 124
    invoke-direct {v0, v10, v11}, Ljava/lang/Long;-><init>(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    sget-object v10, La/j0g0;->b:La/e0g0;

    .line 130
    .line 131
    new-instance v10, La/g0g0;

    .line 132
    .line 133
    invoke-direct {v10, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object v0, v10

    .line 137
    :goto_0
    new-instance v10, Ljava/lang/Long;

    .line 138
    .line 139
    const-wide/16 v11, -0x1

    .line 140
    .line 141
    invoke-direct {v10, v11, v12}, Ljava/lang/Long;-><init>(J)V

    .line 142
    .line 143
    .line 144
    instance-of v11, v0, La/g0g0;

    .line 145
    .line 146
    if-eqz v11, :cond_3

    .line 147
    .line 148
    move-object v0, v10

    .line 149
    :cond_3
    check-cast v0, Ljava/lang/Number;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 152
    .line 153
    .line 154
    move-result-wide v10

    .line 155
    move-object v12, v2

    .line 156
    iget-object v2, v6, La/jhc0;->e:La/fht0;

    .line 157
    .line 158
    new-instance v0, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-static {v9, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    invoke-direct {v0, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v14

    .line 175
    if-eqz v14, :cond_4

    .line 176
    .line 177
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v14

    .line 181
    check-cast v14, La/qu6;

    .line 182
    .line 183
    invoke-static {v14}, La/wha0;->Y(La/qu6;)La/ru6;

    .line 184
    .line 185
    .line 186
    move-result-object v14

    .line 187
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_4
    sget-object v13, La/iun;->a:La/iun;

    .line 192
    .line 193
    iget-object v14, v8, La/ngc0;->b:La/q4f;

    .line 194
    .line 195
    iget v8, v8, La/ngc0;->c:I

    .line 196
    .line 197
    iget-object v15, v6, La/jhc0;->g:La/rqt;

    .line 198
    .line 199
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-static {v9}, La/rqt;->d(Ljava/util/List;)J

    .line 203
    .line 204
    .line 205
    move-result-wide v15

    .line 206
    iget-object v9, v6, La/jhc0;->l:La/pru;

    .line 207
    .line 208
    invoke-virtual {v9}, La/pru;->a()La/sff0;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    iget-object v9, v9, La/sff0;->I1:La/oxk0;

    .line 213
    .line 214
    iget-byte v9, v9, La/oxk0;->a:B

    .line 215
    .line 216
    iput-object v7, v1, La/dhc0;->r:Ljava/lang/Object;

    .line 217
    .line 218
    iput-wide v10, v1, La/dhc0;->p:J

    .line 219
    .line 220
    iput-byte v5, v1, La/dhc0;->q:B

    .line 221
    .line 222
    move-object v5, v12

    .line 223
    move v12, v8

    .line 224
    move-object v8, v13

    .line 225
    const/4 v13, 0x0

    .line 226
    move/from16 v17, v4

    .line 227
    .line 228
    move-wide/from16 v24, v10

    .line 229
    .line 230
    move v10, v3

    .line 231
    move-wide/from16 v3, v24

    .line 232
    .line 233
    move-object v11, v14

    .line 234
    const/4 v14, 0x1

    .line 235
    move/from16 v18, v9

    .line 236
    .line 237
    move-wide/from16 v24, v15

    .line 238
    .line 239
    move/from16 v16, v10

    .line 240
    .line 241
    move-wide/from16 v9, v24

    .line 242
    .line 243
    const/4 v15, 0x0

    .line 244
    move/from16 v19, v16

    .line 245
    .line 246
    const/16 v16, 0x0

    .line 247
    .line 248
    move/from16 v20, v17

    .line 249
    .line 250
    const/16 v17, 0x0

    .line 251
    .line 252
    move/from16 v21, v19

    .line 253
    .line 254
    const/16 v19, 0x0

    .line 255
    .line 256
    move-object/from16 v22, v5

    .line 257
    .line 258
    move-object/from16 v23, v6

    .line 259
    .line 260
    move-wide v5, v3

    .line 261
    move-object v7, v0

    .line 262
    move-object/from16 v20, v1

    .line 263
    .line 264
    move-object/from16 v1, v22

    .line 265
    .line 266
    invoke-virtual/range {v2 .. v20}, La/fht0;->j(JJLjava/util/List;Ljava/util/List;JLa/q4f;IZZZLjava/lang/Boolean;Ljava/lang/String;IZLa/zje;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    move-object/from16 v2, v20

    .line 271
    .line 272
    if-ne v0, v1, :cond_5

    .line 273
    .line 274
    goto/16 :goto_5

    .line 275
    .line 276
    :cond_5
    move-wide v8, v3

    .line 277
    :goto_2
    check-cast v0, Ljava/util/List;

    .line 278
    .line 279
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    check-cast v0, La/cit0;

    .line 284
    .line 285
    if-eqz v0, :cond_6

    .line 286
    .line 287
    iget-object v7, v0, La/cit0;->O:Ljava/util/List;

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_6
    const/4 v7, 0x0

    .line 291
    :goto_3
    if-nez v7, :cond_7

    .line 292
    .line 293
    sget-object v7, La/iun;->a:La/iun;

    .line 294
    .line 295
    :cond_7
    move-object/from16 v3, v23

    .line 296
    .line 297
    iget-object v0, v3, La/jhc0;->i:La/epi0;

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    iget-object v0, v0, La/epi0;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, La/onv;

    .line 308
    .line 309
    iget-object v0, v0, La/onv;->a:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, La/lgc0;

    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    iget-object v0, v0, La/lgc0;->b:Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 322
    .line 323
    .line 324
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    iget-object v4, v3, La/jhc0;->n:La/p7m0;

    .line 329
    .line 330
    if-eqz v0, :cond_8

    .line 331
    .line 332
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    sget-object v0, La/ygc0;->a:La/ygc0;

    .line 336
    .line 337
    const/4 v5, 0x0

    .line 338
    invoke-virtual {v4, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    goto/16 :goto_a

    .line 342
    .line 343
    :cond_8
    const/4 v5, 0x0

    .line 344
    new-instance v0, Ljava/util/ArrayList;

    .line 345
    .line 346
    const/16 v10, 0xa

    .line 347
    .line 348
    invoke-static {v7, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 349
    .line 350
    .line 351
    move-result v6

    .line 352
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    move-object v10, v6

    .line 360
    move-object v6, v3

    .line 361
    :goto_4
    move-object v3, v4

    .line 362
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v4

    .line 366
    if-eqz v4, :cond_e

    .line 367
    .line 368
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    check-cast v4, La/afc0;

    .line 373
    .line 374
    iget-object v7, v6, La/jhc0;->c:La/ctf0;

    .line 375
    .line 376
    iget-object v11, v6, La/jhc0;->f:La/nou;

    .line 377
    .line 378
    iput-object v5, v2, La/dhc0;->r:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v6, v2, La/dhc0;->i:La/jhc0;

    .line 381
    .line 382
    move-object v12, v0

    .line 383
    check-cast v12, Ljava/util/Collection;

    .line 384
    .line 385
    iput-object v12, v2, La/dhc0;->j:Ljava/util/Collection;

    .line 386
    .line 387
    iput-object v10, v2, La/dhc0;->k:Ljava/util/Iterator;

    .line 388
    .line 389
    iput-object v7, v2, La/dhc0;->l:La/ctf0;

    .line 390
    .line 391
    iput-object v4, v2, La/dhc0;->m:La/afc0;

    .line 392
    .line 393
    iput-object v3, v2, La/dhc0;->n:La/qz40;

    .line 394
    .line 395
    iput-object v12, v2, La/dhc0;->o:Ljava/util/Collection;

    .line 396
    .line 397
    iput-wide v8, v2, La/dhc0;->p:J

    .line 398
    .line 399
    const/4 v12, 0x2

    .line 400
    iput-byte v12, v2, La/dhc0;->q:B

    .line 401
    .line 402
    invoke-static {v11, v2}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 403
    .line 404
    .line 405
    move-result-object v11

    .line 406
    if-ne v11, v1, :cond_9

    .line 407
    .line 408
    :goto_5
    return-object v1

    .line 409
    :cond_9
    move-object v13, v10

    .line 410
    move-wide v9, v8

    .line 411
    move-object v8, v4

    .line 412
    move-object v4, v3

    .line 413
    move-object v3, v0

    .line 414
    :goto_6
    check-cast v11, La/ql5;

    .line 415
    .line 416
    iget-object v11, v11, La/ql5;->f:Ljava/lang/String;

    .line 417
    .line 418
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    iget-object v14, v8, La/afc0;->i:La/cfc0;

    .line 428
    .line 429
    iget-object v15, v14, La/cfc0;->a:Ljava/lang/String;

    .line 430
    .line 431
    move-object/from16 p1, v13

    .line 432
    .line 433
    iget-wide v12, v8, La/afc0;->e:J

    .line 434
    .line 435
    iget-object v14, v14, La/cfc0;->b:Ljava/lang/String;

    .line 436
    .line 437
    invoke-static {v15}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 438
    .line 439
    .line 440
    move-result v16

    .line 441
    const-string v5, ": "

    .line 442
    .line 443
    const-string v18, ""

    .line 444
    .line 445
    if-nez v16, :cond_a

    .line 446
    .line 447
    invoke-static {v14}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 448
    .line 449
    .line 450
    move-result v16

    .line 451
    if-nez v16, :cond_a

    .line 452
    .line 453
    invoke-static {v15, v5, v14}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v14

    .line 457
    goto :goto_7

    .line 458
    :cond_a
    move-object/from16 v14, v18

    .line 459
    .line 460
    :goto_7
    iget-object v15, v8, La/afc0;->h:La/cfc0;

    .line 461
    .line 462
    move-object/from16 v22, v1

    .line 463
    .line 464
    iget-object v1, v15, La/cfc0;->a:Ljava/lang/String;

    .line 465
    .line 466
    iget-object v15, v15, La/cfc0;->b:Ljava/lang/String;

    .line 467
    .line 468
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 469
    .line 470
    .line 471
    move-result v16

    .line 472
    if-nez v16, :cond_b

    .line 473
    .line 474
    invoke-static {v15}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 475
    .line 476
    .line 477
    move-result v16

    .line 478
    if-nez v16, :cond_b

    .line 479
    .line 480
    invoke-static {v1, v5, v15}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    move-object v5, v1

    .line 485
    goto :goto_8

    .line 486
    :cond_b
    move-object/from16 v5, v18

    .line 487
    .line 488
    :goto_8
    iget-wide v1, v8, La/afc0;->b:D

    .line 489
    .line 490
    const-wide/16 v15, 0x0

    .line 491
    .line 492
    cmpl-double v15, v1, v15

    .line 493
    .line 494
    move-object/from16 v16, v3

    .line 495
    .line 496
    const/4 v3, 0x0

    .line 497
    if-lez v15, :cond_c

    .line 498
    .line 499
    new-array v15, v3, [Ljava/lang/Object;

    .line 500
    .line 501
    const v3, 0x7f131418

    .line 502
    .line 503
    .line 504
    invoke-virtual {v7, v3, v15}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    sget-object v15, La/pn40;->a:La/pn40;

    .line 509
    .line 510
    sget-object v15, La/p3u0;->c:La/p3u0;

    .line 511
    .line 512
    invoke-static {v1, v2, v11, v15}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    const-string v2, ": \u202d"

    .line 517
    .line 518
    const-string v11, "\u202c"

    .line 519
    .line 520
    invoke-static {v3, v2, v1, v11}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    goto :goto_9

    .line 525
    :cond_c
    move-object/from16 v1, v18

    .line 526
    .line 527
    :goto_9
    const-wide/16 v2, 0x0

    .line 528
    .line 529
    cmp-long v2, v12, v2

    .line 530
    .line 531
    if-eqz v2, :cond_d

    .line 532
    .line 533
    const/4 v2, 0x0

    .line 534
    new-array v3, v2, [Ljava/lang/Object;

    .line 535
    .line 536
    const v11, 0x7f1313f1    # 1.9550006E38f

    .line 537
    .line 538
    .line 539
    invoke-virtual {v7, v11, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    const v11, 0x7f131020

    .line 544
    .line 545
    .line 546
    new-array v15, v2, [Ljava/lang/Object;

    .line 547
    .line 548
    invoke-virtual {v7, v11, v15}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v11

    .line 552
    const-string v15, " "

    .line 553
    .line 554
    invoke-static {v3, v15, v11}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    sget-object v11, La/rdj;->a:La/rdj;

    .line 559
    .line 560
    invoke-virtual {v7}, La/ctf0;->h()Z

    .line 561
    .line 562
    .line 563
    move-result v7

    .line 564
    sget-object v11, La/efj;->c:La/efj;

    .line 565
    .line 566
    new-instance v2, La/znq0;

    .line 567
    .line 568
    invoke-direct {v2, v12, v13}, La/znq0;-><init>(J)V

    .line 569
    .line 570
    .line 571
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    const/16 v12, 0x38

    .line 576
    .line 577
    const/4 v13, 0x0

    .line 578
    invoke-static {v2, v11, v7, v13, v12}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-static {v3, v15, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v18

    .line 586
    :cond_d
    iget-object v2, v8, La/afc0;->j:Ljava/lang/String;

    .line 587
    .line 588
    invoke-static {v14}, La/xvw;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    invoke-static {v5}, La/xvw;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    invoke-static {v1}, La/xvw;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    invoke-static/range {v18 .. v18}, La/xvw;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    invoke-static {v2, v3, v5, v1, v7}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    new-instance v2, La/sfc0;

    .line 609
    .line 610
    iget-object v3, v8, La/afc0;->a:Ljava/lang/String;

    .line 611
    .line 612
    invoke-direct {v2, v3, v1}, La/sfc0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-object/from16 v2, p0

    .line 619
    .line 620
    move-wide v8, v9

    .line 621
    move-object/from16 v0, v16

    .line 622
    .line 623
    move-object/from16 v1, v22

    .line 624
    .line 625
    const/4 v5, 0x0

    .line 626
    move-object/from16 v10, p1

    .line 627
    .line 628
    goto/16 :goto_4

    .line 629
    .line 630
    :cond_e
    check-cast v0, Ljava/util/List;

    .line 631
    .line 632
    new-instance v1, La/bhc0;

    .line 633
    .line 634
    invoke-direct {v1, v0}, La/bhc0;-><init>(Ljava/util/List;)V

    .line 635
    .line 636
    .line 637
    check-cast v3, La/p7m0;

    .line 638
    .line 639
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    const/4 v5, 0x0

    .line 643
    invoke-virtual {v3, v5, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 647
    .line 648
    return-object v0
.end method
