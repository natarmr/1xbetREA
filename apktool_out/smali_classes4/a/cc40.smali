.class public final La/cc40;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public final synthetic j:La/z220;

.field public final synthetic k:La/jvn;

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:J

.field public final synthetic o:Z

.field public final synthetic p:La/c3c0;


# direct methods
.method public constructor <init>(La/z220;La/jvn;ILjava/lang/String;JZLa/c3c0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cc40;->j:La/z220;

    .line 2
    .line 3
    iput-object p2, p0, La/cc40;->k:La/jvn;

    .line 4
    .line 5
    iput p3, p0, La/cc40;->l:I

    .line 6
    .line 7
    iput-object p4, p0, La/cc40;->m:Ljava/lang/String;

    .line 8
    .line 9
    iput-wide p5, p0, La/cc40;->n:J

    .line 10
    .line 11
    iput-boolean p7, p0, La/cc40;->o:Z

    .line 12
    .line 13
    iput-object p8, p0, La/cc40;->p:La/c3c0;

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/cc40;

    .line 2
    .line 3
    iget-boolean v7, p0, La/cc40;->o:Z

    .line 4
    .line 5
    iget-object v8, p0, La/cc40;->p:La/c3c0;

    .line 6
    .line 7
    iget-object v1, p0, La/cc40;->j:La/z220;

    .line 8
    .line 9
    iget-object v2, p0, La/cc40;->k:La/jvn;

    .line 10
    .line 11
    iget v3, p0, La/cc40;->l:I

    .line 12
    .line 13
    iget-object v4, p0, La/cc40;->m:Ljava/lang/String;

    .line 14
    .line 15
    iget-wide v5, p0, La/cc40;->n:J

    .line 16
    .line 17
    move-object v9, p1

    .line 18
    invoke-direct/range {v0 .. v9}, La/cc40;-><init>(La/z220;La/jvn;ILjava/lang/String;JZLa/c3c0;La/yje;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/cc40;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cc40;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/cc40;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/cc40;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, La/cc40;->j:La/z220;

    .line 29
    .line 30
    iget-object v5, v2, La/z220;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, La/knf0;

    .line 33
    .line 34
    invoke-virtual {v5}, La/knf0;->d()La/lnf0;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v6, v0, La/cc40;->p:La/c3c0;

    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 46
    .line 47
    .line 48
    iget-object v8, v0, La/cc40;->k:La/jvn;

    .line 49
    .line 50
    invoke-static {v7, v8}, La/qbt;->a(Ljava/util/Map;La/jvn;)V

    .line 51
    .line 52
    .line 53
    iget v8, v0, La/cc40;->l:I

    .line 54
    .line 55
    iget-boolean v9, v0, La/cc40;->o:Z

    .line 56
    .line 57
    invoke-static {v7, v8, v9}, La/qbt;->d(Ljava/util/Map;IZ)V

    .line 58
    .line 59
    .line 60
    iget v8, v5, La/lnf0;->b:I

    .line 61
    .line 62
    invoke-static {v8, v7}, La/qbt;->g(ILjava/util/Map;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v7}, La/qbt;->h(Ljava/util/Map;)V

    .line 66
    .line 67
    .line 68
    const-string v8, "heroIds"

    .line 69
    .line 70
    iget-object v9, v0, La/cc40;->m:Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {v7, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iget-object v5, v5, La/lnf0;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v5, v7}, La/qbt;->j(Ljava/lang/String;Ljava/util/Map;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v7}, La/qbt;->l(Ljava/util/Map;)V

    .line 81
    .line 82
    .line 83
    iget-wide v8, v0, La/cc40;->n:J

    .line 84
    .line 85
    invoke-static {v8, v9, v7}, La/qbt;->n(JLjava/util/Map;)V

    .line 86
    .line 87
    .line 88
    iget-boolean v5, v6, La/c3c0;->b:Z

    .line 89
    .line 90
    iget-wide v8, v6, La/c3c0;->c:J

    .line 91
    .line 92
    invoke-static {v7, v5, v8, v9}, La/qbt;->o(Ljava/util/Map;ZJ)V

    .line 93
    .line 94
    .line 95
    invoke-static {v7}, La/qbt;->p(Ljava/util/Map;)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v2, La/z220;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, La/pyu;

    .line 101
    .line 102
    iput-boolean v4, v0, La/cc40;->i:Z

    .line 103
    .line 104
    iget-object v2, v2, La/pyu;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, La/tpv;

    .line 107
    .line 108
    invoke-virtual {v2}, La/tpv;->invoke()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, La/cb40;

    .line 113
    .line 114
    invoke-interface {v2, v7, v0}, La/cb40;->b(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-ne v0, v1, :cond_2

    .line 119
    .line 120
    return-object v1

    .line 121
    :cond_2
    :goto_0
    check-cast v0, La/dx5;

    .line 122
    .line 123
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Ljava/util/List;

    .line 128
    .line 129
    new-instance v1, Ljava/util/ArrayList;

    .line 130
    .line 131
    const/16 v2, 0xa

    .line 132
    .line 133
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_1a

    .line 149
    .line 150
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    check-cast v4, La/pb40;

    .line 155
    .line 156
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v5, v4, La/pb40;->G:Ljava/util/List;

    .line 160
    .line 161
    iget-object v6, v4, La/pb40;->E:La/j380;

    .line 162
    .line 163
    iget-object v7, v4, La/pb40;->D:La/j380;

    .line 164
    .line 165
    iget-object v8, v4, La/pb40;->K:La/h6h0;

    .line 166
    .line 167
    if-eqz v5, :cond_3

    .line 168
    .line 169
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    check-cast v9, La/tdo;

    .line 174
    .line 175
    if-eqz v9, :cond_3

    .line 176
    .line 177
    iget-object v9, v9, La/tdo;->c:Ljava/util/List;

    .line 178
    .line 179
    if-eqz v9, :cond_3

    .line 180
    .line 181
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    check-cast v9, Ljava/util/List;

    .line 186
    .line 187
    if-eqz v9, :cond_3

    .line 188
    .line 189
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    check-cast v9, La/ygo;

    .line 194
    .line 195
    if-eqz v9, :cond_3

    .line 196
    .line 197
    iget-object v9, v9, La/ygo;->f:Ljava/lang/String;

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_3
    move-object v9, v3

    .line 201
    :goto_2
    const-string v10, ""

    .line 202
    .line 203
    if-nez v9, :cond_4

    .line 204
    .line 205
    move-object/from16 v16, v10

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_4
    move-object/from16 v16, v9

    .line 209
    .line 210
    :goto_3
    if-eqz v5, :cond_5

    .line 211
    .line 212
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    check-cast v5, La/tdo;

    .line 217
    .line 218
    if-eqz v5, :cond_5

    .line 219
    .line 220
    iget-object v5, v5, La/tdo;->c:Ljava/util/List;

    .line 221
    .line 222
    if-eqz v5, :cond_5

    .line 223
    .line 224
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    check-cast v5, Ljava/util/List;

    .line 229
    .line 230
    if-eqz v5, :cond_5

    .line 231
    .line 232
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    check-cast v5, La/ygo;

    .line 237
    .line 238
    if-eqz v5, :cond_5

    .line 239
    .line 240
    iget-object v5, v5, La/ygo;->f:Ljava/lang/String;

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_5
    move-object v5, v3

    .line 244
    :goto_4
    if-nez v5, :cond_6

    .line 245
    .line 246
    move-object/from16 v22, v10

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_6
    move-object/from16 v22, v5

    .line 250
    .line 251
    :goto_5
    iget-object v5, v4, La/pb40;->a:Ljava/util/List;

    .line 252
    .line 253
    if-nez v5, :cond_7

    .line 254
    .line 255
    sget-object v5, La/iun;->a:La/iun;

    .line 256
    .line 257
    :cond_7
    move-object/from16 v24, v5

    .line 258
    .line 259
    iget-object v5, v4, La/pb40;->b:Ljava/lang/Long;

    .line 260
    .line 261
    if-eqz v5, :cond_8

    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 264
    .line 265
    .line 266
    move-result-wide v11

    .line 267
    :goto_6
    move-wide/from16 v25, v11

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_8
    const-wide/16 v11, -0x1

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :goto_7
    iget-object v4, v4, La/pb40;->B:La/hmz;

    .line 274
    .line 275
    if-eqz v4, :cond_9

    .line 276
    .line 277
    iget-object v4, v4, La/hmz;->b:Ljava/lang/String;

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_9
    move-object v4, v3

    .line 281
    :goto_8
    if-nez v4, :cond_a

    .line 282
    .line 283
    move-object/from16 v27, v10

    .line 284
    .line 285
    goto :goto_9

    .line 286
    :cond_a
    move-object/from16 v27, v4

    .line 287
    .line 288
    :goto_9
    const-wide/16 v4, 0x0

    .line 289
    .line 290
    if-eqz v7, :cond_b

    .line 291
    .line 292
    iget-object v9, v7, La/j380;->c:Ljava/util/List;

    .line 293
    .line 294
    if-eqz v9, :cond_b

    .line 295
    .line 296
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v9

    .line 300
    check-cast v9, La/c680;

    .line 301
    .line 302
    if-eqz v9, :cond_b

    .line 303
    .line 304
    iget-object v9, v9, La/c680;->a:Ljava/lang/Long;

    .line 305
    .line 306
    if-eqz v9, :cond_b

    .line 307
    .line 308
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 309
    .line 310
    .line 311
    move-result-wide v11

    .line 312
    move-wide v14, v11

    .line 313
    goto :goto_a

    .line 314
    :cond_b
    move-wide v14, v4

    .line 315
    :goto_a
    if-eqz v7, :cond_d

    .line 316
    .line 317
    iget-object v7, v7, La/j380;->c:Ljava/util/List;

    .line 318
    .line 319
    if-eqz v7, :cond_d

    .line 320
    .line 321
    new-instance v9, Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-static {v7, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v11

    .line 338
    if-eqz v11, :cond_e

    .line 339
    .line 340
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v11

    .line 344
    check-cast v11, La/c680;

    .line 345
    .line 346
    iget-object v11, v11, La/c680;->c:Ljava/lang/String;

    .line 347
    .line 348
    if-nez v11, :cond_c

    .line 349
    .line 350
    move-object v11, v10

    .line 351
    :cond_c
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    goto :goto_b

    .line 355
    :cond_d
    move-object v9, v3

    .line 356
    :cond_e
    if-nez v9, :cond_f

    .line 357
    .line 358
    sget-object v9, La/iun;->a:La/iun;

    .line 359
    .line 360
    :cond_f
    move-object/from16 v17, v9

    .line 361
    .line 362
    const/4 v7, 0x0

    .line 363
    if-eqz v8, :cond_10

    .line 364
    .line 365
    iget-object v9, v8, La/h6h0;->b:Ljava/util/List;

    .line 366
    .line 367
    if-eqz v9, :cond_10

    .line 368
    .line 369
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v9

    .line 373
    check-cast v9, La/bf90;

    .line 374
    .line 375
    if-eqz v9, :cond_10

    .line 376
    .line 377
    iget-object v9, v9, La/bf90;->b:Ljava/lang/Integer;

    .line 378
    .line 379
    if-eqz v9, :cond_10

    .line 380
    .line 381
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result v9

    .line 385
    move v12, v9

    .line 386
    goto :goto_c

    .line 387
    :cond_10
    move v12, v7

    .line 388
    :goto_c
    if-eqz v8, :cond_11

    .line 389
    .line 390
    iget-object v9, v8, La/h6h0;->f:Ljava/lang/Integer;

    .line 391
    .line 392
    if-eqz v9, :cond_11

    .line 393
    .line 394
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v9

    .line 398
    move v13, v9

    .line 399
    goto :goto_d

    .line 400
    :cond_11
    move v13, v7

    .line 401
    :goto_d
    new-instance v11, La/hb40;

    .line 402
    .line 403
    invoke-direct/range {v11 .. v17}, La/hb40;-><init>(IIJLjava/lang/String;Ljava/util/List;)V

    .line 404
    .line 405
    .line 406
    if-eqz v6, :cond_12

    .line 407
    .line 408
    iget-object v9, v6, La/j380;->c:Ljava/util/List;

    .line 409
    .line 410
    if-eqz v9, :cond_12

    .line 411
    .line 412
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    check-cast v9, La/c680;

    .line 417
    .line 418
    if-eqz v9, :cond_12

    .line 419
    .line 420
    iget-object v9, v9, La/c680;->a:Ljava/lang/Long;

    .line 421
    .line 422
    if-eqz v9, :cond_12

    .line 423
    .line 424
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 425
    .line 426
    .line 427
    move-result-wide v4

    .line 428
    :cond_12
    move-wide/from16 v20, v4

    .line 429
    .line 430
    if-eqz v6, :cond_14

    .line 431
    .line 432
    iget-object v4, v6, La/j380;->c:Ljava/util/List;

    .line 433
    .line 434
    if-eqz v4, :cond_14

    .line 435
    .line 436
    new-instance v5, Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-static {v4, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 439
    .line 440
    .line 441
    move-result v6

    .line 442
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 443
    .line 444
    .line 445
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 450
    .line 451
    .line 452
    move-result v6

    .line 453
    if-eqz v6, :cond_15

    .line 454
    .line 455
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    check-cast v6, La/c680;

    .line 460
    .line 461
    iget-object v6, v6, La/c680;->c:Ljava/lang/String;

    .line 462
    .line 463
    if-nez v6, :cond_13

    .line 464
    .line 465
    move-object v6, v10

    .line 466
    :cond_13
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    goto :goto_e

    .line 470
    :cond_14
    move-object v5, v3

    .line 471
    :cond_15
    if-nez v5, :cond_16

    .line 472
    .line 473
    sget-object v5, La/iun;->a:La/iun;

    .line 474
    .line 475
    :cond_16
    move-object/from16 v23, v5

    .line 476
    .line 477
    if-eqz v8, :cond_17

    .line 478
    .line 479
    iget-object v4, v8, La/h6h0;->b:Ljava/util/List;

    .line 480
    .line 481
    if-eqz v4, :cond_17

    .line 482
    .line 483
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    check-cast v4, La/bf90;

    .line 488
    .line 489
    if-eqz v4, :cond_17

    .line 490
    .line 491
    iget-object v4, v4, La/bf90;->c:Ljava/lang/Integer;

    .line 492
    .line 493
    if-eqz v4, :cond_17

    .line 494
    .line 495
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 496
    .line 497
    .line 498
    move-result v4

    .line 499
    move/from16 v18, v4

    .line 500
    .line 501
    goto :goto_f

    .line 502
    :cond_17
    move/from16 v18, v7

    .line 503
    .line 504
    :goto_f
    if-eqz v8, :cond_18

    .line 505
    .line 506
    iget-object v4, v8, La/h6h0;->g:Ljava/lang/Integer;

    .line 507
    .line 508
    if-eqz v4, :cond_18

    .line 509
    .line 510
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    move/from16 v19, v4

    .line 515
    .line 516
    goto :goto_10

    .line 517
    :cond_18
    move/from16 v19, v7

    .line 518
    .line 519
    :goto_10
    new-instance v17, La/hb40;

    .line 520
    .line 521
    invoke-direct/range {v17 .. v23}, La/hb40;-><init>(IIJLjava/lang/String;Ljava/util/List;)V

    .line 522
    .line 523
    .line 524
    if-eqz v8, :cond_19

    .line 525
    .line 526
    iget-object v4, v8, La/h6h0;->r:Ljava/lang/Integer;

    .line 527
    .line 528
    if-eqz v4, :cond_19

    .line 529
    .line 530
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 531
    .line 532
    .line 533
    move-result v7

    .line 534
    :cond_19
    move/from16 v30, v7

    .line 535
    .line 536
    new-instance v23, La/gb40;

    .line 537
    .line 538
    move-object/from16 v28, v11

    .line 539
    .line 540
    move-object/from16 v29, v17

    .line 541
    .line 542
    invoke-direct/range {v23 .. v30}, La/gb40;-><init>(Ljava/util/List;JLjava/lang/String;La/hb40;La/hb40;I)V

    .line 543
    .line 544
    .line 545
    move-object/from16 v4, v23

    .line 546
    .line 547
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    goto/16 :goto_1

    .line 551
    .line 552
    :cond_1a
    return-object v1
.end method
