.class public final La/sb6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/knf0;

.field public final b:La/yzn0;

.field public final c:La/wsf0;

.field public final d:La/rrt0;


# direct methods
.method public constructor <init>(La/knf0;La/yzn0;La/wsf0;La/rrt0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/sb6;->a:La/knf0;

    .line 11
    .line 12
    iput-object p2, p0, La/sb6;->b:La/yzn0;

    .line 13
    .line 14
    iput-object p3, p0, La/sb6;->c:La/wsf0;

    .line 15
    .line 16
    iput-object p4, p0, La/sb6;->d:La/rrt0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;ILa/jvn;ZLa/zje;)Ljava/io/Serializable;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p6

    .line 6
    .line 7
    instance-of v3, v0, La/qb6;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, La/qb6;

    .line 13
    .line 14
    iget v4, v3, La/qb6;->m:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/qb6;->m:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/qb6;

    .line 27
    .line 28
    invoke-direct {v3, v1, v0}, La/qb6;-><init>(La/sb6;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v3, La/qb6;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/qb6;->m:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    if-ne v5, v7, :cond_1

    .line 43
    .line 44
    iget-object v2, v3, La/qb6;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 45
    .line 46
    iget-object v3, v3, La/qb6;->i:La/sip;

    .line 47
    .line 48
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v5, v2

    .line 52
    move-object v2, v3

    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v8

    .line 61
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 65
    .line 66
    iget-object v0, v1, La/sb6;->d:La/rrt0;

    .line 67
    .line 68
    invoke-virtual {v0}, La/rrt0;->a()La/krt0;

    .line 69
    .line 70
    .line 71
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 75
    .line 76
    new-instance v5, La/g0g0;

    .line 77
    .line 78
    invoke-direct {v5, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    move-object v0, v5

    .line 82
    :goto_1
    nop

    .line 83
    instance-of v5, v0, La/g0g0;

    .line 84
    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    move-object v0, v8

    .line 88
    :cond_3
    check-cast v0, La/krt0;

    .line 89
    .line 90
    sget-object v5, La/sip;->c:La/sip;

    .line 91
    .line 92
    if-ne v2, v5, :cond_5

    .line 93
    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    iget-boolean v5, v0, La/krt0;->c:Z

    .line 97
    .line 98
    if-ne v5, v7, :cond_4

    .line 99
    .line 100
    :goto_2
    move v5, v7

    .line 101
    goto :goto_3

    .line 102
    :cond_4
    move v5, v6

    .line 103
    goto :goto_3

    .line 104
    :cond_5
    if-eqz v0, :cond_4

    .line 105
    .line 106
    iget-boolean v5, v0, La/krt0;->b:Z

    .line 107
    .line 108
    if-ne v5, v7, :cond_4

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :goto_3
    if-eqz v0, :cond_6

    .line 112
    .line 113
    iget-wide v9, v0, La/krt0;->a:J

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    const-wide/16 v9, 0x0

    .line 117
    .line 118
    :goto_4
    iget-object v0, v1, La/sb6;->a:La/knf0;

    .line 119
    .line 120
    invoke-virtual {v0}, La/knf0;->d()La/lnf0;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v11, La/jo20;

    .line 128
    .line 129
    invoke-direct {v11}, La/jo20;-><init>()V

    .line 130
    .line 131
    .line 132
    move-object/from16 v12, p4

    .line 133
    .line 134
    invoke-static {v11, v12}, La/qbt;->a(Ljava/util/Map;La/jvn;)V

    .line 135
    .line 136
    .line 137
    move/from16 v12, p3

    .line 138
    .line 139
    move/from16 v13, p5

    .line 140
    .line 141
    invoke-static {v11, v12, v13}, La/qbt;->d(Ljava/util/Map;IZ)V

    .line 142
    .line 143
    .line 144
    iget v12, v0, La/lnf0;->b:I

    .line 145
    .line 146
    invoke-static {v12, v11}, La/qbt;->g(ILjava/util/Map;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v11}, La/qbt;->h(Ljava/util/Map;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, v0, La/lnf0;->a:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v0, v11}, La/qbt;->j(Ljava/lang/String;Ljava/util/Map;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v11}, La/qbt;->l(Ljava/util/Map;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v11, v5, v9, v10}, La/qbt;->o(Ljava/util/Map;ZJ)V

    .line 161
    .line 162
    .line 163
    invoke-static {v11}, La/qbt;->p(Ljava/util/Map;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v11}, La/jo20;->b()La/jo20;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iput-object v2, v3, La/qb6;->i:La/sip;

    .line 171
    .line 172
    move-object/from16 v5, p2

    .line 173
    .line 174
    iput-object v5, v3, La/qb6;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 175
    .line 176
    iput v7, v3, La/qb6;->m:I

    .line 177
    .line 178
    iget-object v9, v1, La/sb6;->c:La/wsf0;

    .line 179
    .line 180
    invoke-virtual {v9, v2, v0, v3}, La/wsf0;->h(La/sip;La/jo20;La/zje;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    if-ne v0, v4, :cond_7

    .line 185
    .line 186
    return-object v4

    .line 187
    :cond_7
    :goto_5
    check-cast v0, Ljava/lang/Iterable;

    .line 188
    .line 189
    new-instance v3, Ljava/util/ArrayList;

    .line 190
    .line 191
    const/16 v4, 0xa

    .line 192
    .line 193
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_16

    .line 209
    .line 210
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, La/f5h;

    .line 215
    .line 216
    sget-object v9, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 217
    .line 218
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    const-string v10, ""

    .line 223
    .line 224
    if-eqz v9, :cond_a

    .line 225
    .line 226
    iget-object v9, v4, La/f5h;->y:La/k2g;

    .line 227
    .line 228
    if-eqz v9, :cond_8

    .line 229
    .line 230
    iget-object v9, v9, La/k2g;->b:Ljava/lang/String;

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_8
    move-object v9, v8

    .line 234
    :goto_7
    if-nez v9, :cond_9

    .line 235
    .line 236
    :goto_8
    move-object/from16 v16, v10

    .line 237
    .line 238
    goto :goto_a

    .line 239
    :cond_9
    move-object/from16 v16, v9

    .line 240
    .line 241
    goto :goto_a

    .line 242
    :cond_a
    iget-object v9, v4, La/f5h;->x:La/gdh;

    .line 243
    .line 244
    if-eqz v9, :cond_b

    .line 245
    .line 246
    iget-object v9, v9, La/gdh;->b:Ljava/lang/String;

    .line 247
    .line 248
    goto :goto_9

    .line 249
    :cond_b
    move-object v9, v8

    .line 250
    :goto_9
    if-nez v9, :cond_9

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :goto_a
    iget-object v9, v4, La/f5h;->z:La/e2g;

    .line 254
    .line 255
    iget-object v11, v4, La/f5h;->y:La/k2g;

    .line 256
    .line 257
    iget-object v12, v4, La/f5h;->x:La/gdh;

    .line 258
    .line 259
    if-eqz v9, :cond_c

    .line 260
    .line 261
    iget-object v9, v9, La/e2g;->c:Ljava/lang/String;

    .line 262
    .line 263
    goto :goto_b

    .line 264
    :cond_c
    move-object v9, v8

    .line 265
    :goto_b
    if-nez v9, :cond_d

    .line 266
    .line 267
    goto :goto_c

    .line 268
    :cond_d
    move-object v10, v9

    .line 269
    :goto_c
    const-wide/16 v13, -0x1

    .line 270
    .line 271
    if-eqz v12, :cond_e

    .line 272
    .line 273
    iget-object v9, v12, La/gdh;->a:Ljava/lang/Long;

    .line 274
    .line 275
    if-eqz v9, :cond_e

    .line 276
    .line 277
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 278
    .line 279
    .line 280
    move-result-wide v17

    .line 281
    goto :goto_d

    .line 282
    :cond_e
    move-wide/from16 v17, v13

    .line 283
    .line 284
    :goto_d
    if-eqz v11, :cond_f

    .line 285
    .line 286
    iget-object v9, v11, La/k2g;->a:Ljava/lang/Long;

    .line 287
    .line 288
    if-eqz v9, :cond_f

    .line 289
    .line 290
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 291
    .line 292
    .line 293
    move-result-wide v19

    .line 294
    goto :goto_e

    .line 295
    :cond_f
    move-wide/from16 v19, v13

    .line 296
    .line 297
    :goto_e
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-object/from16 p2, v2

    .line 301
    .line 302
    move-object/from16 p1, v4

    .line 303
    .line 304
    move-wide/from16 p3, v17

    .line 305
    .line 306
    move-wide/from16 p5, v19

    .line 307
    .line 308
    invoke-static/range {p1 .. p6}, La/pzb;->E(La/f5h;La/sip;JJ)La/nas;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    move-object/from16 v4, p2

    .line 313
    .line 314
    if-eqz v12, :cond_10

    .line 315
    .line 316
    iget-object v9, v12, La/gdh;->a:Ljava/lang/Long;

    .line 317
    .line 318
    if-eqz v9, :cond_10

    .line 319
    .line 320
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 321
    .line 322
    .line 323
    move-result-wide v17

    .line 324
    goto :goto_f

    .line 325
    :cond_10
    move-wide/from16 v17, v13

    .line 326
    .line 327
    :goto_f
    if-eqz v11, :cond_11

    .line 328
    .line 329
    iget-object v9, v11, La/k2g;->a:Ljava/lang/Long;

    .line 330
    .line 331
    if-eqz v9, :cond_11

    .line 332
    .line 333
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 334
    .line 335
    .line 336
    move-result-wide v13

    .line 337
    :cond_11
    move-wide v14, v13

    .line 338
    new-instance v9, Ljava/lang/StringBuilder;

    .line 339
    .line 340
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 341
    .line 342
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 346
    .line 347
    .line 348
    move-result v11

    .line 349
    if-nez v11, :cond_12

    .line 350
    .line 351
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 352
    .line 353
    .line 354
    goto :goto_11

    .line 355
    :cond_12
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 356
    .line 357
    invoke-static {v10, v11, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 358
    .line 359
    .line 360
    move-result v11

    .line 361
    if-nez v11, :cond_15

    .line 362
    .line 363
    const-string v11, "https://"

    .line 364
    .line 365
    invoke-static {v10, v11, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 366
    .line 367
    .line 368
    move-result v11

    .line 369
    if-eqz v11, :cond_13

    .line 370
    .line 371
    goto :goto_10

    .line 372
    :cond_13
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 373
    .line 374
    .line 375
    move-result v11

    .line 376
    const/16 v12, 0x2f

    .line 377
    .line 378
    if-lez v11, :cond_14

    .line 379
    .line 380
    const-string v11, "/"

    .line 381
    .line 382
    invoke-static {v9, v11}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 383
    .line 384
    .line 385
    move-result v11

    .line 386
    if-nez v11, :cond_14

    .line 387
    .line 388
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    :cond_14
    new-array v11, v7, [C

    .line 392
    .line 393
    aput-char v12, v11, v6

    .line 394
    .line 395
    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v10

    .line 399
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    goto :goto_11

    .line 403
    :cond_15
    :goto_10
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    :goto_11
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    new-instance v11, La/b4r0;

    .line 418
    .line 419
    move-wide/from16 v12, v17

    .line 420
    .line 421
    move-object/from16 v18, v2

    .line 422
    .line 423
    move-object/from16 v17, v9

    .line 424
    .line 425
    invoke-direct/range {v11 .. v18}, La/b4r0;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-object v2, v4

    .line 432
    goto/16 :goto_6

    .line 433
    .line 434
    :cond_16
    move-object v4, v2

    .line 435
    iget-object v0, v1, La/sb6;->b:La/yzn0;

    .line 436
    .line 437
    invoke-virtual {v0, v5, v4}, La/yzn0;->h(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;)La/or30;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0, v3}, La/or30;->d(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    return-object v3
.end method
