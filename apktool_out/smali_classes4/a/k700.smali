.class public final La/k700;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/util/List;

.field public j:B

.field public final synthetic k:La/w5z;

.field public final synthetic l:Z

.field public final synthetic m:La/j700;

.field public final synthetic n:I

.field public final synthetic o:Ljava/util/Set;


# direct methods
.method public constructor <init>(La/w5z;ZLa/j700;ILjava/util/Set;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/k700;->k:La/w5z;

    .line 2
    .line 3
    iput-boolean p2, p0, La/k700;->l:Z

    .line 4
    .line 5
    iput-object p3, p0, La/k700;->m:La/j700;

    .line 6
    .line 7
    iput p4, p0, La/k700;->n:I

    .line 8
    .line 9
    iput-object p5, p0, La/k700;->o:Ljava/util/Set;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/k700;

    .line 2
    .line 3
    iget v4, p0, La/k700;->n:I

    .line 4
    .line 5
    iget-object v5, p0, La/k700;->o:Ljava/util/Set;

    .line 6
    .line 7
    iget-object v1, p0, La/k700;->k:La/w5z;

    .line 8
    .line 9
    iget-boolean v2, p0, La/k700;->l:Z

    .line 10
    .line 11
    iget-object v3, p0, La/k700;->m:La/j700;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/k700;-><init>(La/w5z;ZLa/j700;ILjava/util/Set;La/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/k700;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/k700;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/k700;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/k700;->k:La/w5z;

    .line 4
    .line 5
    iget-object v2, v1, La/w5z;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v4, v0, La/k700;->j:B

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x1

    .line 16
    if-eqz v4, :cond_2

    .line 17
    .line 18
    if-eq v4, v7, :cond_1

    .line 19
    .line 20
    if-ne v4, v6, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, La/k700;->i:Ljava/util/List;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object v4, v0

    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v5

    .line 38
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object/from16 v4, p1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v4, v1, La/w5z;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, La/sjl0;

    .line 50
    .line 51
    iput-byte v7, v0, La/k700;->j:B

    .line 52
    .line 53
    invoke-virtual {v4, v0}, La/sjl0;->d(La/zje;)Ljava/io/Serializable;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-ne v4, v3, :cond_3

    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_3
    :goto_0
    check-cast v4, Ljava/util/List;

    .line 62
    .line 63
    iget-object v1, v1, La/w5z;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, La/roi0;

    .line 66
    .line 67
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, La/knf0;->b()I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v10, v0, La/k700;->o:Ljava/util/Set;

    .line 82
    .line 83
    check-cast v10, Ljava/lang/Iterable;

    .line 84
    .line 85
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    const/4 v15, 0x0

    .line 90
    const/16 v16, 0x3e

    .line 91
    .line 92
    const-string v12, ","

    .line 93
    .line 94
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x0

    .line 96
    invoke-static/range {v11 .. v16}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v2, v0, La/k700;->m:La/j700;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 113
    .line 114
    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v13, "country"

    .line 118
    .line 119
    iget v14, v0, La/k700;->n:I

    .line 120
    .line 121
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    invoke-virtual {v12, v13, v14}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    if-lez v13, :cond_4

    .line 133
    .line 134
    const-string v13, "countryIds"

    .line 135
    .line 136
    invoke-virtual {v12, v13, v10}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    const-string v10, "cyberFlag"

    .line 144
    .line 145
    const/4 v13, 0x3

    .line 146
    if-eq v2, v7, :cond_6

    .line 147
    .line 148
    if-eq v2, v13, :cond_5

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_5
    invoke-virtual {v12, v10, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v12, v10, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :goto_1
    const-string v2, "fcountry"

    .line 163
    .line 164
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    invoke-virtual {v12, v2, v9}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    const-string v2, "gr"

    .line 172
    .line 173
    const/16 v9, 0x54d

    .line 174
    .line 175
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-virtual {v12, v2, v9}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    iget-boolean v2, v0, La/k700;->l:Z

    .line 183
    .line 184
    if-eqz v2, :cond_7

    .line 185
    .line 186
    const-string v2, "hasVideo"

    .line 187
    .line 188
    invoke-virtual {v12, v2, v11}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    :cond_7
    const-string v2, "lng"

    .line 192
    .line 193
    invoke-virtual {v12, v2, v8}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    invoke-static {v12}, La/tlb;->a0(Ljava/util/LinkedHashMap;)V

    .line 197
    .line 198
    .line 199
    const/16 v2, 0x16

    .line 200
    .line 201
    invoke-static {v2, v12}, La/tlb;->m0(ILjava/util/Map;)V

    .line 202
    .line 203
    .line 204
    iput-object v4, v0, La/k700;->i:Ljava/util/List;

    .line 205
    .line 206
    iput-byte v6, v0, La/k700;->j:B

    .line 207
    .line 208
    iget-object v1, v1, La/roi0;->a:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v1, La/enj0;

    .line 211
    .line 212
    invoke-virtual {v1}, La/enj0;->invoke()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, La/atl0;

    .line 217
    .line 218
    invoke-interface {v1, v12, v0}, La/atl0;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-ne v0, v3, :cond_8

    .line 223
    .line 224
    :goto_2
    return-object v3

    .line 225
    :cond_8
    :goto_3
    check-cast v0, La/dx5;

    .line 226
    .line 227
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    check-cast v0, Ljava/lang/Iterable;

    .line 232
    .line 233
    new-instance v1, Ljava/util/ArrayList;

    .line 234
    .line 235
    const/16 v2, 0xa

    .line 236
    .line 237
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_1a

    .line 253
    .line 254
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    check-cast v3, La/yu10;

    .line 259
    .line 260
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    iget-object v8, v3, La/yu10;->a:Ljava/lang/Long;

    .line 267
    .line 268
    if-eqz v8, :cond_19

    .line 269
    .line 270
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 271
    .line 272
    .line 273
    move-result-wide v11

    .line 274
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    :cond_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    if-eqz v10, :cond_a

    .line 283
    .line 284
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    move-object v13, v10

    .line 289
    check-cast v13, La/ril0;

    .line 290
    .line 291
    iget-wide v13, v13, La/ril0;->a:J

    .line 292
    .line 293
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 294
    .line 295
    .line 296
    move-result-wide v15

    .line 297
    cmp-long v13, v13, v15

    .line 298
    .line 299
    if-nez v13, :cond_9

    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_a
    move-object v10, v5

    .line 303
    :goto_5
    check-cast v10, La/ril0;

    .line 304
    .line 305
    if-eqz v10, :cond_c

    .line 306
    .line 307
    iget-object v9, v10, La/ril0;->b:Ljava/lang/String;

    .line 308
    .line 309
    if-nez v9, :cond_b

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_b
    :goto_6
    move-object v15, v9

    .line 313
    goto :goto_8

    .line 314
    :cond_c
    :goto_7
    const-string v9, "-"

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :goto_8
    iget-object v9, v3, La/yu10;->b:Ljava/lang/Long;

    .line 318
    .line 319
    if-eqz v9, :cond_d

    .line 320
    .line 321
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 322
    .line 323
    .line 324
    move-result-wide v9

    .line 325
    :goto_9
    move-wide v13, v9

    .line 326
    goto :goto_a

    .line 327
    :cond_d
    const-wide/16 v9, 0x0

    .line 328
    .line 329
    goto :goto_9

    .line 330
    :goto_a
    iget-object v9, v3, La/yu10;->c:Ljava/lang/Boolean;

    .line 331
    .line 332
    const/4 v10, 0x0

    .line 333
    if-eqz v9, :cond_e

    .line 334
    .line 335
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 336
    .line 337
    .line 338
    move-result v9

    .line 339
    move/from16 v17, v9

    .line 340
    .line 341
    goto :goto_b

    .line 342
    :cond_e
    move/from16 v17, v10

    .line 343
    .line 344
    :goto_b
    iget-object v3, v3, La/yu10;->d:Ljava/util/List;

    .line 345
    .line 346
    if-eqz v3, :cond_18

    .line 347
    .line 348
    new-instance v9, Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 351
    .line 352
    .line 353
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 358
    .line 359
    .line 360
    move-result v16

    .line 361
    if-eqz v16, :cond_10

    .line 362
    .line 363
    move-object/from16 v18, v5

    .line 364
    .line 365
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v5

    .line 369
    move-object/from16 v16, v5

    .line 370
    .line 371
    check-cast v16, Ljava/util/List;

    .line 372
    .line 373
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    .line 374
    .line 375
    .line 376
    move-result v7

    .line 377
    if-ne v7, v6, :cond_f

    .line 378
    .line 379
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    :cond_f
    move-object/from16 v5, v18

    .line 383
    .line 384
    const/4 v7, 0x1

    .line 385
    goto :goto_c

    .line 386
    :cond_10
    move-object/from16 v18, v5

    .line 387
    .line 388
    new-instance v3, Ljava/util/ArrayList;

    .line 389
    .line 390
    invoke-static {v9, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    if-eqz v7, :cond_14

    .line 406
    .line 407
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v7

    .line 411
    check-cast v7, Ljava/util/List;

    .line 412
    .line 413
    new-instance v9, La/eql0;

    .line 414
    .line 415
    invoke-static {v10, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v16

    .line 419
    check-cast v16, Ljava/lang/Integer;

    .line 420
    .line 421
    if-eqz v16, :cond_11

    .line 422
    .line 423
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 424
    .line 425
    .line 426
    move-result v16

    .line 427
    move/from16 v6, v16

    .line 428
    .line 429
    goto :goto_e

    .line 430
    :cond_11
    move v6, v10

    .line 431
    :goto_e
    sget-object v16, La/dql0;->a:La/lme0;

    .line 432
    .line 433
    const/4 v10, 0x1

    .line 434
    invoke-static {v10, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    check-cast v7, Ljava/lang/Integer;

    .line 439
    .line 440
    if-eqz v7, :cond_12

    .line 441
    .line 442
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    goto :goto_f

    .line 447
    :cond_12
    const/4 v7, -0x1

    .line 448
    :goto_f
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    if-nez v7, :cond_13

    .line 452
    .line 453
    sget-object v7, La/dql0;->b:La/dql0;

    .line 454
    .line 455
    goto :goto_10

    .line 456
    :cond_13
    sget-object v7, La/dql0;->c:La/dql0;

    .line 457
    .line 458
    :goto_10
    invoke-direct {v9, v6, v7}, La/eql0;-><init>(ILa/dql0;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    const/4 v6, 0x2

    .line 465
    const/4 v10, 0x0

    .line 466
    goto :goto_d

    .line 467
    :cond_14
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 468
    .line 469
    .line 470
    move-result-wide v5

    .line 471
    new-instance v7, Ljava/util/ArrayList;

    .line 472
    .line 473
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 474
    .line 475
    .line 476
    move-result v8

    .line 477
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 485
    .line 486
    .line 487
    move-result v8

    .line 488
    if-eqz v8, :cond_17

    .line 489
    .line 490
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v8

    .line 494
    check-cast v8, La/eql0;

    .line 495
    .line 496
    new-instance v9, La/bql0;

    .line 497
    .line 498
    iget v10, v8, La/eql0;->a:I

    .line 499
    .line 500
    iget-object v8, v8, La/eql0;->b:La/dql0;

    .line 501
    .line 502
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 503
    .line 504
    .line 505
    move-result v8

    .line 506
    if-eqz v8, :cond_16

    .line 507
    .line 508
    const/4 v2, 0x1

    .line 509
    if-ne v8, v2, :cond_15

    .line 510
    .line 511
    sget-object v8, La/cql0;->b:La/cql0;

    .line 512
    .line 513
    goto :goto_12

    .line 514
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 515
    .line 516
    .line 517
    return-object v18

    .line 518
    :cond_16
    const/4 v2, 0x1

    .line 519
    sget-object v8, La/cql0;->a:La/cql0;

    .line 520
    .line 521
    :goto_12
    invoke-direct {v9, v5, v6, v10, v8}, La/bql0;-><init>(JILa/cql0;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    const/16 v2, 0xa

    .line 528
    .line 529
    goto :goto_11

    .line 530
    :cond_17
    const/4 v2, 0x1

    .line 531
    :goto_13
    move-object/from16 v16, v7

    .line 532
    .line 533
    goto :goto_14

    .line 534
    :cond_18
    move-object/from16 v18, v5

    .line 535
    .line 536
    move v2, v7

    .line 537
    sget-object v7, La/iun;->a:La/iun;

    .line 538
    .line 539
    goto :goto_13

    .line 540
    :goto_14
    new-instance v9, La/jkp;

    .line 541
    .line 542
    const/16 v10, 0x10

    .line 543
    .line 544
    invoke-direct/range {v9 .. v17}, La/jkp;-><init>(IJJLjava/lang/String;Ljava/util/List;Z)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move v7, v2

    .line 551
    move-object/from16 v5, v18

    .line 552
    .line 553
    const/16 v2, 0xa

    .line 554
    .line 555
    const/4 v6, 0x2

    .line 556
    goto/16 :goto_4

    .line 557
    .line 558
    :cond_19
    move-object/from16 v18, v5

    .line 559
    .line 560
    invoke-static/range {v18 .. v18}, La/jf4;->k(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    return-object v18

    .line 564
    :cond_1a
    return-object v1
.end method
