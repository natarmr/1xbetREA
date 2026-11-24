.class public final La/z0s;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final h:La/hzg;

.field public final i:La/ih5;

.field public final j:La/zr1;


# direct methods
.method public constructor <init>(La/hzg;La/ih5;La/zr1;)V
    .locals 2

    .line 1
    new-instance v0, La/s9r;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/s9r;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/z0s;->h:La/hzg;

    .line 12
    .line 13
    iput-object p2, p0, La/z0s;->i:La/ih5;

    .line 14
    .line 15
    iput-object p3, p0, La/z0s;->j:La/zr1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/hdb;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/z0s;->i(La/hdb;La/zje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i(La/hdb;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/y0s;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/y0s;

    .line 13
    .line 14
    iget v4, v3, La/y0s;->l:I

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
    iput v4, v3, La/y0s;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/y0s;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/y0s;-><init>(La/z0s;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/y0s;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/y0s;->l:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/4 v7, 0x1

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    if-ne v5, v7, :cond_1

    .line 42
    .line 43
    iget-object v1, v3, La/y0s;->i:La/hdb;

    .line 44
    .line 45
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v6

    .line 55
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, v3, La/y0s;->i:La/hdb;

    .line 59
    .line 60
    iput v7, v3, La/y0s;->l:I

    .line 61
    .line 62
    invoke-static {v0, v1, v3}, La/x2t0;->f(La/x2t0;Ljava/lang/Object;La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-ne v2, v4, :cond_3

    .line 67
    .line 68
    return-object v4

    .line 69
    :cond_3
    :goto_1
    if-eqz v1, :cond_18

    .line 70
    .line 71
    instance-of v2, v1, La/edb;

    .line 72
    .line 73
    const-wide/16 v3, 0x0

    .line 74
    .line 75
    iget-object v5, v0, La/z0s;->h:La/hzg;

    .line 76
    .line 77
    if-eqz v2, :cond_a

    .line 78
    .line 79
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, La/jdb;

    .line 84
    .line 85
    iget-object v1, v1, La/jdb;->h:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    move-object v8, v2

    .line 102
    check-cast v8, La/lok0;

    .line 103
    .line 104
    iget v9, v8, La/lok0;->a:I

    .line 105
    .line 106
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    check-cast v10, La/jdb;

    .line 111
    .line 112
    iget v10, v10, La/jdb;->e:I

    .line 113
    .line 114
    if-ne v9, v10, :cond_4

    .line 115
    .line 116
    iget-object v8, v8, La/lok0;->t:Ljava/util/List;

    .line 117
    .line 118
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-eqz v8, :cond_4

    .line 127
    .line 128
    move-object v6, v2

    .line 129
    :cond_5
    check-cast v6, La/lok0;

    .line 130
    .line 131
    if-eqz v6, :cond_6

    .line 132
    .line 133
    iget v0, v6, La/lok0;->a:I

    .line 134
    .line 135
    int-to-long v0, v0

    .line 136
    iget-object v2, v6, La/lok0;->b:Ljava/lang/String;

    .line 137
    .line 138
    check-cast v5, La/uzg;

    .line 139
    .line 140
    invoke-virtual {v5, v0, v1, v2}, La/uzg;->o(JLjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_12

    .line 144
    .line 145
    :cond_6
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, La/jdb;

    .line 150
    .line 151
    iget-object v1, v1, La/jdb;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 152
    .line 153
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 154
    .line 155
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_7

    .line 160
    .line 161
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    check-cast v1, La/jdb;

    .line 166
    .line 167
    iget-wide v1, v1, La/jdb;->b:J

    .line 168
    .line 169
    :goto_2
    move-wide v8, v1

    .line 170
    goto :goto_3

    .line 171
    :cond_7
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, La/jdb;

    .line 176
    .line 177
    iget-wide v1, v1, La/jdb;->a:J

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :goto_3
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, La/jdb;

    .line 185
    .line 186
    iget-wide v1, v1, La/jdb;->c:J

    .line 187
    .line 188
    cmp-long v1, v1, v3

    .line 189
    .line 190
    if-nez v1, :cond_9

    .line 191
    .line 192
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    check-cast v1, La/jdb;

    .line 197
    .line 198
    iget-object v1, v1, La/jdb;->f:La/m9s;

    .line 199
    .line 200
    if-eqz v1, :cond_8

    .line 201
    .line 202
    iget-wide v3, v1, La/m9s;->A:J

    .line 203
    .line 204
    :cond_8
    :goto_4
    move-wide v10, v3

    .line 205
    goto :goto_5

    .line 206
    :cond_9
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, La/jdb;

    .line 211
    .line 212
    iget-wide v3, v1, La/jdb;->c:J

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :goto_5
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, La/jdb;

    .line 220
    .line 221
    iget-object v7, v1, La/jdb;->d:Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, La/jdb;

    .line 228
    .line 229
    iget-object v0, v0, La/jdb;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 230
    .line 231
    iget-byte v12, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 232
    .line 233
    sget-object v0, La/k1g;->b:La/k1g;

    .line 234
    .line 235
    move-object v6, v5

    .line 236
    check-cast v6, La/uzg;

    .line 237
    .line 238
    invoke-virtual/range {v6 .. v12}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_12

    .line 242
    .line 243
    :cond_a
    instance-of v2, v1, La/fdb;

    .line 244
    .line 245
    if-eqz v2, :cond_e

    .line 246
    .line 247
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, La/jdb;

    .line 252
    .line 253
    iget-boolean v1, v1, La/jdb;->k:Z

    .line 254
    .line 255
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, La/jdb;

    .line 260
    .line 261
    iget-wide v7, v2, La/jdb;->a:J

    .line 262
    .line 263
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    check-cast v2, La/jdb;

    .line 268
    .line 269
    iget-wide v9, v2, La/jdb;->b:J

    .line 270
    .line 271
    if-eqz v1, :cond_b

    .line 272
    .line 273
    sget-object v2, La/r1g;->n:La/r1g;

    .line 274
    .line 275
    :goto_6
    move-object v11, v2

    .line 276
    goto :goto_7

    .line 277
    :cond_b
    sget-object v2, La/r1g;->o:La/r1g;

    .line 278
    .line 279
    goto :goto_6

    .line 280
    :goto_7
    const/4 v12, 0x0

    .line 281
    const/4 v13, 0x0

    .line 282
    iget-object v6, v0, La/z0s;->i:La/ih5;

    .line 283
    .line 284
    invoke-virtual/range {v6 .. v13}, La/ih5;->l(JJLa/r1g;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 285
    .line 286
    .line 287
    if-eqz v1, :cond_c

    .line 288
    .line 289
    sget-object v1, La/r1g;->n:La/r1g;

    .line 290
    .line 291
    goto :goto_8

    .line 292
    :cond_c
    sget-object v1, La/r1g;->o:La/r1g;

    .line 293
    .line 294
    :goto_8
    iget-object v11, v1, La/r1g;->a:Ljava/lang/String;

    .line 295
    .line 296
    const/4 v12, 0x0

    .line 297
    const/4 v13, 0x0

    .line 298
    iget-object v6, v0, La/z0s;->j:La/zr1;

    .line 299
    .line 300
    invoke-virtual/range {v6 .. v13}, La/zr1;->m(JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    check-cast v1, La/jdb;

    .line 308
    .line 309
    iget-wide v1, v1, La/jdb;->a:J

    .line 310
    .line 311
    const-wide/16 v3, 0x28

    .line 312
    .line 313
    cmp-long v1, v1, v3

    .line 314
    .line 315
    if-nez v1, :cond_d

    .line 316
    .line 317
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    check-cast v1, La/jdb;

    .line 322
    .line 323
    iget-wide v1, v1, La/jdb;->b:J

    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_d
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    check-cast v1, La/jdb;

    .line 331
    .line 332
    iget-wide v1, v1, La/jdb;->a:J

    .line 333
    .line 334
    :goto_9
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, La/jdb;

    .line 339
    .line 340
    iget-object v0, v0, La/jdb;->j:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 341
    .line 342
    sget-object v3, La/k1g;->b:La/k1g;

    .line 343
    .line 344
    check-cast v5, La/uzg;

    .line 345
    .line 346
    invoke-virtual {v5, v1, v2, v0, v3}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_12

    .line 350
    .line 351
    :cond_e
    instance-of v2, v1, La/gdb;

    .line 352
    .line 353
    if-eqz v2, :cond_15

    .line 354
    .line 355
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    check-cast v1, La/jdb;

    .line 360
    .line 361
    iget-wide v1, v1, La/jdb;->a:J

    .line 362
    .line 363
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    check-cast v8, La/jdb;

    .line 368
    .line 369
    iget-wide v8, v8, La/jdb;->c:J

    .line 370
    .line 371
    cmp-long v8, v8, v3

    .line 372
    .line 373
    if-nez v8, :cond_f

    .line 374
    .line 375
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    check-cast v8, La/jdb;

    .line 380
    .line 381
    iget-object v8, v8, La/jdb;->f:La/m9s;

    .line 382
    .line 383
    if-eqz v8, :cond_10

    .line 384
    .line 385
    iget-wide v3, v8, La/m9s;->A:J

    .line 386
    .line 387
    goto :goto_a

    .line 388
    :cond_f
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    check-cast v3, La/jdb;

    .line 393
    .line 394
    iget-wide v3, v3, La/jdb;->c:J

    .line 395
    .line 396
    :cond_10
    :goto_a
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    check-cast v8, La/jdb;

    .line 401
    .line 402
    iget-object v8, v8, La/jdb;->f:La/m9s;

    .line 403
    .line 404
    const/4 v9, 0x0

    .line 405
    if-eqz v8, :cond_11

    .line 406
    .line 407
    iget-object v8, v8, La/m9s;->I:La/cqg;

    .line 408
    .line 409
    instance-of v8, v8, La/qz7;

    .line 410
    .line 411
    if-ne v8, v7, :cond_11

    .line 412
    .line 413
    goto :goto_b

    .line 414
    :cond_11
    move v7, v9

    .line 415
    :goto_b
    invoke-static {v1, v2, v7, v3, v4}, La/aem0;->q(JZJ)La/snu0;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    instance-of v2, v1, La/qnu0;

    .line 420
    .line 421
    if-eqz v2, :cond_17

    .line 422
    .line 423
    new-instance v10, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 424
    .line 425
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    check-cast v2, La/jdb;

    .line 430
    .line 431
    iget-wide v11, v2, La/jdb;->a:J

    .line 432
    .line 433
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    check-cast v2, La/jdb;

    .line 438
    .line 439
    iget-object v2, v2, La/jdb;->f:La/m9s;

    .line 440
    .line 441
    if-eqz v2, :cond_12

    .line 442
    .line 443
    iget-object v2, v2, La/m9s;->z:Ljava/lang/String;

    .line 444
    .line 445
    goto :goto_c

    .line 446
    :cond_12
    move-object v2, v6

    .line 447
    :goto_c
    const-string v3, ""

    .line 448
    .line 449
    if-nez v2, :cond_13

    .line 450
    .line 451
    move-object v13, v3

    .line 452
    goto :goto_d

    .line 453
    :cond_13
    move-object v13, v2

    .line 454
    :goto_d
    invoke-virtual {v0}, La/x2t0;->d()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    check-cast v0, La/jdb;

    .line 459
    .line 460
    iget-object v14, v0, La/jdb;->d:Ljava/lang/String;

    .line 461
    .line 462
    check-cast v1, La/qnu0;

    .line 463
    .line 464
    iget-object v0, v1, La/qnu0;->a:La/mqu0;

    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    packed-switch v0, :pswitch_data_0

    .line 471
    .line 472
    .line 473
    invoke-static {}, La/t9f;->b()V

    .line 474
    .line 475
    .line 476
    return-object v6

    .line 477
    :pswitch_0
    const-string v3, "cyber_rules_sette_e_mezzo_seven_and_a_half"

    .line 478
    .line 479
    :goto_e
    :pswitch_1
    move-object v15, v3

    .line 480
    goto :goto_f

    .line 481
    :pswitch_2
    const-string v3, "cyber_rules_sette_e_mezzo_royal_sette_e_mezzo"

    .line 482
    .line 483
    goto :goto_e

    .line 484
    :pswitch_3
    const-string v3, "cyber_rules_roulette_eu"

    .line 485
    .line 486
    goto :goto_e

    .line 487
    :pswitch_4
    const-string v3, "cyber_rules_roulette_us"

    .line 488
    .line 489
    goto :goto_e

    .line 490
    :pswitch_5
    const-string v3, "cyber_rules_card_cricket"

    .line 491
    .line 492
    goto :goto_e

    .line 493
    :pswitch_6
    const-string v3, "cyber_rules_crystal"

    .line 494
    .line 495
    goto :goto_e

    .line 496
    :pswitch_7
    const-string v3, "cyber_rules_power_of_power"

    .line 497
    .line 498
    goto :goto_e

    .line 499
    :pswitch_8
    const-string v3, "cyber_rules_power_of_power_doomsday"

    .line 500
    .line 501
    goto :goto_e

    .line 502
    :pswitch_9
    const-string v3, "cyber_rules_rock_paper_scissors"

    .line 503
    .line 504
    goto :goto_e

    .line 505
    :pswitch_a
    const-string v3, "cyber_rules_big_pig"

    .line 506
    .line 507
    goto :goto_e

    .line 508
    :pswitch_b
    const-string v3, "cyber_rules_numbers"

    .line 509
    .line 510
    goto :goto_e

    .line 511
    :pswitch_c
    const-string v3, "cyber_rules_card_basketball"

    .line 512
    .line 513
    goto :goto_e

    .line 514
    :pswitch_d
    const-string v3, "cyber_rules_tic_tac_toe"

    .line 515
    .line 516
    goto :goto_e

    .line 517
    :goto_f
    invoke-direct/range {v10 .. v15}, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    check-cast v5, La/uzg;

    .line 521
    .line 522
    iget-object v0, v5, La/uzg;->a:La/oeg0;

    .line 523
    .line 524
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    iget-object v2, v5, La/uzg;->b:La/vqc;

    .line 533
    .line 534
    new-instance v3, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1;

    .line 535
    .line 536
    invoke-direct {v3, v2, v10}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualSportRulesScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;)V

    .line 537
    .line 538
    .line 539
    instance-of v2, v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 540
    .line 541
    if-eqz v2, :cond_14

    .line 542
    .line 543
    new-instance v2, La/e1w0;

    .line 544
    .line 545
    check-cast v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 546
    .line 547
    invoke-direct {v2, v3}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 548
    .line 549
    .line 550
    new-instance v3, La/c8d;

    .line 551
    .line 552
    sget-object v4, La/y7d;->a:La/v7d;

    .line 553
    .line 554
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    goto :goto_10

    .line 561
    :cond_14
    new-instance v2, La/w0w0;

    .line 562
    .line 563
    invoke-direct {v2, v3}, La/w0w0;-><init>(La/m7h0;)V

    .line 564
    .line 565
    .line 566
    new-instance v3, La/c8d;

    .line 567
    .line 568
    sget-object v4, La/y7d;->a:La/v7d;

    .line 569
    .line 570
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    :goto_10
    invoke-static {v0, v1, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    :goto_11
    move-object v2, v1

    .line 581
    check-cast v2, La/paw;

    .line 582
    .line 583
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    if-eqz v3, :cond_17

    .line 588
    .line 589
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    check-cast v2, La/oe50;

    .line 594
    .line 595
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 596
    .line 597
    .line 598
    goto :goto_11

    .line 599
    :cond_15
    instance-of v2, v1, La/ddb;

    .line 600
    .line 601
    if-eqz v2, :cond_18

    .line 602
    .line 603
    iget-object v0, v0, La/x2t0;->b:La/ocj;

    .line 604
    .line 605
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 609
    .line 610
    :cond_16
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    move-object v3, v2

    .line 615
    check-cast v3, La/jdb;

    .line 616
    .line 617
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    move-object v3, v1

    .line 621
    check-cast v3, La/ddb;

    .line 622
    .line 623
    iget-wide v6, v3, La/ddb;->a:J

    .line 624
    .line 625
    iget-wide v8, v3, La/ddb;->b:J

    .line 626
    .line 627
    iget-wide v10, v3, La/ddb;->c:J

    .line 628
    .line 629
    iget-object v13, v3, La/ddb;->d:La/sff0;

    .line 630
    .line 631
    iget-object v14, v3, La/ddb;->f:La/ypl0;

    .line 632
    .line 633
    iget-object v4, v3, La/ddb;->g:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 634
    .line 635
    iget v5, v3, La/ddb;->h:I

    .line 636
    .line 637
    iget-object v12, v3, La/ddb;->e:Ljava/util/List;

    .line 638
    .line 639
    iget-boolean v15, v3, La/ddb;->i:Z

    .line 640
    .line 641
    move/from16 v18, v15

    .line 642
    .line 643
    iget-object v15, v3, La/ddb;->j:Ljava/lang/String;

    .line 644
    .line 645
    iget-object v3, v3, La/ddb;->k:La/m9s;

    .line 646
    .line 647
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    move-object/from16 v17, v4

    .line 654
    .line 655
    new-instance v4, La/jdb;

    .line 656
    .line 657
    move-object/from16 v16, v12

    .line 658
    .line 659
    move-object v12, v3

    .line 660
    invoke-direct/range {v4 .. v18}, La/jdb;-><init>(IJJJLa/m9s;La/sff0;La/ypl0;Ljava/lang/String;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v0, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v2

    .line 667
    if-eqz v2, :cond_16

    .line 668
    .line 669
    :cond_17
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 670
    .line 671
    return-object v0

    .line 672
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 673
    .line 674
    .line 675
    return-object v6

    .line 676
    nop

    .line 677
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
