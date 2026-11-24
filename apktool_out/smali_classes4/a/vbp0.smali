.class public final La/vbp0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:La/o9p0;

.field public j:B

.field public final synthetic k:La/wbp0;


# direct methods
.method public constructor <init>(La/wbp0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vbp0;->k:La/wbp0;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/vbp0;

    .line 2
    .line 3
    iget-object p0, p0, La/vbp0;->k:La/wbp0;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, La/vbp0;-><init>(La/wbp0;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/vbp0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vbp0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/vbp0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/vbp0;->j:B

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x2

    .line 10
    iget-object v6, v0, La/vbp0;->k:La/wbp0;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v2, :cond_4

    .line 14
    .line 15
    if-eq v2, v4, :cond_3

    .line 16
    .line 17
    if-eq v2, v5, :cond_1

    .line 18
    .line 19
    if-ne v2, v3, :cond_0

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_a

    .line 25
    .line 26
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v7

    .line 32
    :cond_1
    iget-object v2, v0, La/vbp0;->i:La/o9p0;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v8, p1

    .line 38
    .line 39
    :cond_2
    move-object v11, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v2, p1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    new-instance v8, La/ubp0;

    .line 55
    .line 56
    invoke-direct {v8, v6, v7, v4}, La/ubp0;-><init>(La/wbp0;La/yje;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v7, v8, v3}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-byte v4, v0, La/vbp0;->j:B

    .line 64
    .line 65
    invoke-virtual {v2, v0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-ne v2, v1, :cond_5

    .line 70
    .line 71
    goto/16 :goto_9

    .line 72
    .line 73
    :cond_5
    :goto_0
    check-cast v2, La/o9p0;

    .line 74
    .line 75
    iget-object v8, v6, La/wbp0;->t:La/gvu;

    .line 76
    .line 77
    sget-object v9, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 78
    .line 79
    iget-byte v9, v9, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 80
    .line 81
    iput-object v2, v0, La/vbp0;->i:La/o9p0;

    .line 82
    .line 83
    iput-byte v5, v0, La/vbp0;->j:B

    .line 84
    .line 85
    check-cast v8, La/ivu;

    .line 86
    .line 87
    invoke-virtual {v8, v9, v0}, La/ivu;->a(ILa/zje;)Ljava/io/Serializable;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    if-ne v8, v1, :cond_2

    .line 92
    .line 93
    goto/16 :goto_9

    .line 94
    .line 95
    :goto_1
    move-object v12, v8

    .line 96
    check-cast v12, Ljava/util/Map;

    .line 97
    .line 98
    const/4 v2, 0x5

    .line 99
    new-array v2, v2, [La/yxg;

    .line 100
    .line 101
    sget-object v8, La/ttg;->d:La/ttg;

    .line 102
    .line 103
    const/4 v9, 0x0

    .line 104
    aput-object v8, v2, v9

    .line 105
    .line 106
    sget-object v8, La/trg;->d:La/trg;

    .line 107
    .line 108
    aput-object v8, v2, v4

    .line 109
    .line 110
    sget-object v8, La/oxg;->d:La/oxg;

    .line 111
    .line 112
    aput-object v8, v2, v5

    .line 113
    .line 114
    sget-object v5, La/pug;->d:La/pug;

    .line 115
    .line 116
    aput-object v5, v2, v3

    .line 117
    .line 118
    sget-object v5, La/yvg;->d:La/yvg;

    .line 119
    .line 120
    const/4 v8, 0x4

    .line 121
    aput-object v5, v2, v8

    .line 122
    .line 123
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    new-instance v5, Ljava/util/ArrayList;

    .line 128
    .line 129
    const/16 v8, 0xa

    .line 130
    .line 131
    invoke-static {v2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    invoke-direct {v5, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v10

    .line 146
    if-eqz v10, :cond_6

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    check-cast v10, La/yxg;

    .line 153
    .line 154
    iget-wide v13, v10, La/yxg;->a:J

    .line 155
    .line 156
    invoke-static {v13, v14, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_6
    iget-object v2, v11, La/o9p0;->k:Ljava/util/List;

    .line 161
    .line 162
    new-instance v10, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    if-eqz v13, :cond_9

    .line 176
    .line 177
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v13

    .line 181
    check-cast v13, Ljava/lang/Number;

    .line 182
    .line 183
    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    .line 184
    .line 185
    .line 186
    move-result-wide v13

    .line 187
    new-instance v15, Ljava/lang/Long;

    .line 188
    .line 189
    invoke-direct {v15, v13, v14}, Ljava/lang/Long;-><init>(J)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    if-eqz v15, :cond_8

    .line 197
    .line 198
    new-instance v15, Ljava/lang/Long;

    .line 199
    .line 200
    invoke-direct {v15, v13, v14}, Ljava/lang/Long;-><init>(J)V

    .line 201
    .line 202
    .line 203
    invoke-interface {v12, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    check-cast v13, La/ypl0;

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_8
    move-object v13, v7

    .line 211
    :goto_4
    if-eqz v13, :cond_7

    .line 212
    .line 213
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_9
    new-instance v2, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-static {v10, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v8

    .line 234
    if-eqz v8, :cond_e

    .line 235
    .line 236
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    check-cast v8, La/ypl0;

    .line 241
    .line 242
    new-instance v10, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;

    .line 243
    .line 244
    iget-wide v13, v8, La/ypl0;->a:J

    .line 245
    .line 246
    new-instance v15, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 249
    .line 250
    invoke-direct {v15, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    iget-object v3, v8, La/ypl0;->c:La/lel0;

    .line 254
    .line 255
    iget-object v3, v3, La/lel0;->a:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 261
    .line 262
    .line 263
    move-result v16

    .line 264
    if-nez v16, :cond_a

    .line 265
    .line 266
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 267
    .line 268
    .line 269
    move v7, v9

    .line 270
    goto :goto_7

    .line 271
    :cond_a
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 272
    .line 273
    invoke-static {v3, v7, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    if-nez v7, :cond_b

    .line 278
    .line 279
    const-string v7, "https://"

    .line 280
    .line 281
    invoke-static {v3, v7, v9}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 282
    .line 283
    .line 284
    move-result v7

    .line 285
    if-eqz v7, :cond_c

    .line 286
    .line 287
    :cond_b
    move v7, v9

    .line 288
    goto :goto_6

    .line 289
    :cond_c
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->length()I

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    move/from16 p1, v9

    .line 294
    .line 295
    const/16 v9, 0x2f

    .line 296
    .line 297
    if-lez v7, :cond_d

    .line 298
    .line 299
    const-string v7, "/"

    .line 300
    .line 301
    invoke-static {v15, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    if-nez v7, :cond_d

    .line 306
    .line 307
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    :cond_d
    new-array v7, v4, [C

    .line 311
    .line 312
    aput-char v9, v7, p1

    .line 313
    .line 314
    invoke-static {v3, v7}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    move/from16 v7, p1

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :goto_6
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    :goto_7
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    iget-object v8, v8, La/ypl0;->b:Ljava/lang/String;

    .line 335
    .line 336
    invoke-direct {v10, v13, v14, v3, v8}, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move v9, v7

    .line 343
    const/4 v3, 0x3

    .line 344
    const/4 v7, 0x0

    .line 345
    goto :goto_5

    .line 346
    :cond_e
    sget v3, La/wbp0;->L:I

    .line 347
    .line 348
    iget-object v3, v6, La/i3t0;->i:La/ocj;

    .line 349
    .line 350
    iget-object v3, v3, La/ocj;->a:La/p7m0;

    .line 351
    .line 352
    :goto_8
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    move-object v9, v5

    .line 360
    check-cast v9, La/mbp0;

    .line 361
    .line 362
    const/16 v16, 0x0

    .line 363
    .line 364
    const/16 v18, 0x5ff3

    .line 365
    .line 366
    const/4 v10, 0x0

    .line 367
    const/4 v13, 0x0

    .line 368
    const/4 v14, 0x0

    .line 369
    const/4 v15, 0x0

    .line 370
    move-object/from16 v17, v2

    .line 371
    .line 372
    invoke-static/range {v9 .. v18}, La/mbp0;->a(La/mbp0;ZLa/o9p0;Ljava/util/Map;La/fbp0;La/e9p0;La/obp0;Ljava/lang/Integer;Ljava/util/ArrayList;I)La/mbp0;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v3, v5, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-eqz v2, :cond_10

    .line 381
    .line 382
    iget-object v2, v6, La/wbp0;->s:La/xzp;

    .line 383
    .line 384
    iget-object v3, v6, La/wbp0;->p:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 385
    .line 386
    iget-wide v7, v3, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 387
    .line 388
    iget-wide v9, v3, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->b:J

    .line 389
    .line 390
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    check-cast v3, La/mbp0;

    .line 395
    .line 396
    iget-object v3, v3, La/mbp0;->f:La/sff0;

    .line 397
    .line 398
    iget-boolean v3, v3, La/sff0;->J1:Z

    .line 399
    .line 400
    iget-object v5, v2, La/xzp;->d:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v5, La/luu;

    .line 403
    .line 404
    iget-object v5, v5, La/luu;->a:La/nok0;

    .line 405
    .line 406
    invoke-virtual {v5}, La/nok0;->a()Ljava/util/List;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    sget-object v20, La/sip;->c:La/sip;

    .line 411
    .line 412
    move-object/from16 v19, v2

    .line 413
    .line 414
    move/from16 v25, v3

    .line 415
    .line 416
    move-wide/from16 v21, v7

    .line 417
    .line 418
    move-wide/from16 v23, v9

    .line 419
    .line 420
    invoke-virtual/range {v19 .. v25}, La/xzp;->x(La/sip;JJZ)La/gmq;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    sget-object v20, La/sip;->b:La/sip;

    .line 425
    .line 426
    invoke-virtual/range {v19 .. v25}, La/xzp;->x(La/sip;JJZ)La/gmq;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    new-instance v7, La/jc1;

    .line 431
    .line 432
    const/16 v25, 0x0

    .line 433
    .line 434
    const/16 v26, 0x4

    .line 435
    .line 436
    move-object/from16 v20, v19

    .line 437
    .line 438
    move-object/from16 v19, v7

    .line 439
    .line 440
    invoke-direct/range {v19 .. v26}, La/jc1;-><init>(Ljava/lang/Object;JJLa/yje;B)V

    .line 441
    .line 442
    .line 443
    move-object/from16 v8, v19

    .line 444
    .line 445
    move-object/from16 v7, v20

    .line 446
    .line 447
    new-instance v9, La/vsg0;

    .line 448
    .line 449
    invoke-direct {v9, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 450
    .line 451
    .line 452
    new-instance v8, La/r7u;

    .line 453
    .line 454
    const/4 v10, 0x0

    .line 455
    invoke-direct {v8, v5, v10, v4}, La/r7u;-><init>(Ljava/util/List;La/yje;B)V

    .line 456
    .line 457
    .line 458
    invoke-static {v2, v3, v9, v8}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    iget-object v3, v7, La/xzp;->a:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v3, La/mne;

    .line 465
    .line 466
    iget-object v3, v3, La/mne;->a:La/rwj;

    .line 467
    .line 468
    invoke-static {v2, v3}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    new-instance v3, La/ssl0;

    .line 473
    .line 474
    const/16 v4, 0xe

    .line 475
    .line 476
    invoke-direct {v3, v6, v10, v4}, La/ssl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 477
    .line 478
    .line 479
    iput-object v10, v0, La/vbp0;->i:La/o9p0;

    .line 480
    .line 481
    const/4 v5, 0x3

    .line 482
    iput-byte v5, v0, La/vbp0;->j:B

    .line 483
    .line 484
    invoke-static {v2, v3, v0}, La/slb;->O(La/gmq;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    if-ne v0, v1, :cond_f

    .line 489
    .line 490
    :goto_9
    return-object v1

    .line 491
    :cond_f
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    return-object v0

    .line 494
    :cond_10
    move-object/from16 v2, v17

    .line 495
    .line 496
    goto/16 :goto_8
.end method
