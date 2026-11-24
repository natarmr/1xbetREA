.class public final La/ihb0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/zx10;

.field public final b:La/wgb0;

.field public final c:La/knf0;

.field public final d:La/btt0;

.field public final e:La/rrt0;

.field public final f:La/qgb0;

.field public final g:La/j910;


# direct methods
.method public constructor <init>(La/zx10;La/wgb0;La/knf0;La/btt0;La/rrt0;La/qgb0;La/j910;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/ihb0;->a:La/zx10;

    .line 20
    .line 21
    iput-object p2, p0, La/ihb0;->b:La/wgb0;

    .line 22
    .line 23
    iput-object p3, p0, La/ihb0;->c:La/knf0;

    .line 24
    .line 25
    iput-object p4, p0, La/ihb0;->d:La/btt0;

    .line 26
    .line 27
    iput-object p5, p0, La/ihb0;->e:La/rrt0;

    .line 28
    .line 29
    iput-object p6, p0, La/ihb0;->f:La/qgb0;

    .line 30
    .line 31
    iput-object p7, p0, La/ihb0;->g:La/j910;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/ihb0;->a:La/zx10;

    .line 2
    .line 3
    iget-object v0, v0, La/zx10;->a:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v1, v0

    .line 6
    check-cast v1, La/rta0;

    .line 7
    .line 8
    instance-of v0, p1, La/chb0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move-object v0, p1

    .line 13
    check-cast v0, La/chb0;

    .line 14
    .line 15
    iget v2, v0, La/chb0;->l:I

    .line 16
    .line 17
    const/high16 v3, -0x80000000

    .line 18
    .line 19
    and-int v4, v2, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    sub-int/2addr v2, v3

    .line 24
    iput v2, v0, La/chb0;->l:I

    .line 25
    .line 26
    :goto_0
    move-object v7, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v0, La/chb0;

    .line 29
    .line 30
    invoke-direct {v0, p0, p1}, La/chb0;-><init>(La/ihb0;La/zje;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    iget-object p1, v7, La/chb0;->j:Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v8, La/wne;->a:La/wne;

    .line 37
    .line 38
    iget v0, v7, La/chb0;->l:I

    .line 39
    .line 40
    const/4 v9, 0x3

    .line 41
    const/4 v2, 0x2

    .line 42
    const/4 v3, 0x1

    .line 43
    const/4 v10, 0x0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    if-eq v0, v3, :cond_3

    .line 47
    .line 48
    if-eq v0, v2, :cond_2

    .line 49
    .line 50
    if-ne v0, v9, :cond_1

    .line 51
    .line 52
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_b

    .line 56
    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0

    .line 64
    :cond_2
    iget-boolean v0, v7, La/chb0;->i:Z

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v3, v10

    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_3
    iget-boolean v0, v7, La/chb0;->i:Z

    .line 73
    .line 74
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :try_start_0
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 82
    .line 83
    iget-object p1, p0, La/ihb0;->e:La/rrt0;

    .line 84
    .line 85
    invoke-virtual {p1}, La/rrt0;->a()La/krt0;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_2

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    move-object p1, v0

    .line 92
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 93
    .line 94
    new-instance v0, La/g0g0;

    .line 95
    .line 96
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    move-object p1, v0

    .line 100
    :goto_2
    instance-of p1, p1, La/g0g0;

    .line 101
    .line 102
    xor-int/lit8 v0, p1, 0x1

    .line 103
    .line 104
    iget-object v4, p0, La/ihb0;->c:La/knf0;

    .line 105
    .line 106
    if-nez p1, :cond_6

    .line 107
    .line 108
    iput-boolean v0, v7, La/chb0;->i:Z

    .line 109
    .line 110
    iput v3, v7, La/chb0;->l:I

    .line 111
    .line 112
    iget-object p1, p0, La/ihb0;->d:La/btt0;

    .line 113
    .line 114
    invoke-virtual {p1}, La/btt0;->a()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-virtual {v4}, La/knf0;->b()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    new-instance v4, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-direct {v4, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    move-object v2, p1

    .line 132
    check-cast v2, La/ogb0;

    .line 133
    .line 134
    const-string v6, "application/vnd.xenvelop+json"

    .line 135
    .line 136
    const/16 v5, 0x16

    .line 137
    .line 138
    invoke-interface/range {v2 .. v7}, La/ogb0;->a(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-ne p1, v8, :cond_5

    .line 143
    .line 144
    goto/16 :goto_a

    .line 145
    .line 146
    :cond_5
    :goto_3
    check-cast p1, La/dx5;

    .line 147
    .line 148
    move-object v3, v10

    .line 149
    goto :goto_5

    .line 150
    :cond_6
    iput-boolean v0, v7, La/chb0;->i:Z

    .line 151
    .line 152
    iput v2, v7, La/chb0;->l:I

    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    move-object v2, p1

    .line 162
    check-cast v2, La/ogb0;

    .line 163
    .line 164
    const-string v6, "application/vnd.xenvelop+json"

    .line 165
    .line 166
    const/16 v5, 0x16

    .line 167
    .line 168
    move-object v4, v10

    .line 169
    move-object v3, v10

    .line 170
    invoke-interface/range {v2 .. v7}, La/ogb0;->a(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-ne p1, v8, :cond_7

    .line 175
    .line 176
    goto/16 :goto_a

    .line 177
    .line 178
    :cond_7
    :goto_4
    check-cast p1, La/dx5;

    .line 179
    .line 180
    :goto_5
    invoke-virtual {p1}, La/dx5;->a()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_1f

    .line 191
    .line 192
    new-instance v1, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    :cond_8
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_1e

    .line 206
    .line 207
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    check-cast v2, La/zgb0;

    .line 212
    .line 213
    iget-object v2, v2, La/zgb0;->a:Ljava/lang/String;

    .line 214
    .line 215
    if-eqz v2, :cond_1d

    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    sparse-switch v4, :sswitch_data_0

    .line 222
    .line 223
    .line 224
    goto/16 :goto_7

    .line 225
    .line 226
    :sswitch_0
    const-string v4, "aggregatorSelected"

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    if-nez v2, :cond_9

    .line 233
    .line 234
    goto/16 :goto_7

    .line 235
    .line 236
    :cond_9
    sget-object v10, La/lhb0;->n:La/lhb0;

    .line 237
    .line 238
    goto/16 :goto_9

    .line 239
    .line 240
    :sswitch_1
    const-string v4, "popularLive"

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-nez v2, :cond_a

    .line 247
    .line 248
    goto/16 :goto_7

    .line 249
    .line 250
    :cond_a
    sget-object v10, La/lhb0;->e:La/lhb0;

    .line 251
    .line 252
    goto/16 :goto_9

    .line 253
    .line 254
    :sswitch_2
    const-string v4, "xgamesSpotlight"

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-nez v2, :cond_b

    .line 261
    .line 262
    goto/16 :goto_7

    .line 263
    .line 264
    :cond_b
    sget-object v10, La/lhb0;->k:La/lhb0;

    .line 265
    .line 266
    goto/16 :goto_9

    .line 267
    .line 268
    :sswitch_3
    const-string v4, "champsLive"

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-nez v2, :cond_c

    .line 275
    .line 276
    goto/16 :goto_7

    .line 277
    .line 278
    :cond_c
    sget-object v10, La/lhb0;->g:La/lhb0;

    .line 279
    .line 280
    goto/16 :goto_9

    .line 281
    .line 282
    :sswitch_4
    const-string v4, "esportsPopularLive"

    .line 283
    .line 284
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-nez v2, :cond_d

    .line 289
    .line 290
    goto/16 :goto_7

    .line 291
    .line 292
    :cond_d
    sget-object v10, La/lhb0;->q:La/lhb0;

    .line 293
    .line 294
    goto/16 :goto_9

    .line 295
    .line 296
    :sswitch_5
    const-string v4, "aggregatorTournaments"

    .line 297
    .line 298
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    if-nez v2, :cond_e

    .line 303
    .line 304
    goto/16 :goto_7

    .line 305
    .line 306
    :cond_e
    sget-object v10, La/lhb0;->l:La/lhb0;

    .line 307
    .line 308
    goto/16 :goto_9

    .line 309
    .line 310
    :sswitch_6
    const-string v4, "bannersSlider"

    .line 311
    .line 312
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    if-nez v2, :cond_f

    .line 317
    .line 318
    goto/16 :goto_7

    .line 319
    .line 320
    :cond_f
    sget-object v10, La/lhb0;->b:La/lhb0;

    .line 321
    .line 322
    goto/16 :goto_9

    .line 323
    .line 324
    :sswitch_7
    const-string v4, "esportsChampsPrematch"

    .line 325
    .line 326
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-nez v2, :cond_10

    .line 331
    .line 332
    goto/16 :goto_7

    .line 333
    .line 334
    :cond_10
    sget-object v10, La/lhb0;->t:La/lhb0;

    .line 335
    .line 336
    goto/16 :goto_9

    .line 337
    .line 338
    :sswitch_8
    const-string v4, "popularPrematch"

    .line 339
    .line 340
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v2

    .line 344
    if-nez v2, :cond_11

    .line 345
    .line 346
    goto/16 :goto_7

    .line 347
    .line 348
    :cond_11
    sget-object v10, La/lhb0;->f:La/lhb0;

    .line 349
    .line 350
    goto/16 :goto_9

    .line 351
    .line 352
    :sswitch_9
    const-string v4, "aggregatorCats"

    .line 353
    .line 354
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-nez v2, :cond_12

    .line 359
    .line 360
    goto/16 :goto_7

    .line 361
    .line 362
    :cond_12
    sget-object v10, La/lhb0;->m:La/lhb0;

    .line 363
    .line 364
    goto/16 :goto_9

    .line 365
    .line 366
    :sswitch_a
    const-string v4, "topeventsChamps"

    .line 367
    .line 368
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-nez v2, :cond_13

    .line 373
    .line 374
    goto/16 :goto_7

    .line 375
    .line 376
    :cond_13
    sget-object v10, La/lhb0;->d:La/lhb0;

    .line 377
    .line 378
    goto/16 :goto_9

    .line 379
    .line 380
    :sswitch_b
    const-string v4, "sportsSlider"

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-nez v2, :cond_14

    .line 387
    .line 388
    goto/16 :goto_7

    .line 389
    .line 390
    :cond_14
    sget-object v10, La/lhb0;->a:La/lhb0;

    .line 391
    .line 392
    goto/16 :goto_9

    .line 393
    .line 394
    :sswitch_c
    const-string v4, "gamesSlider"

    .line 395
    .line 396
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-nez v2, :cond_15

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_15
    sget-object v10, La/lhb0;->c:La/lhb0;

    .line 404
    .line 405
    goto :goto_9

    .line 406
    :sswitch_d
    const-string v4, "aggregatorProvider"

    .line 407
    .line 408
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-nez v2, :cond_16

    .line 413
    .line 414
    goto :goto_7

    .line 415
    :cond_16
    sget-object v10, La/lhb0;->i:La/lhb0;

    .line 416
    .line 417
    goto :goto_9

    .line 418
    :sswitch_e
    const-string v4, "esportsChampsLIVE"

    .line 419
    .line 420
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    if-nez v2, :cond_17

    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_17
    sget-object v10, La/lhb0;->s:La/lhb0;

    .line 428
    .line 429
    goto :goto_9

    .line 430
    :sswitch_f
    const-string v4, "aggregatorRecommended"

    .line 431
    .line 432
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-nez v2, :cond_18

    .line 437
    .line 438
    goto :goto_7

    .line 439
    :cond_18
    sget-object v10, La/lhb0;->h:La/lhb0;

    .line 440
    .line 441
    goto :goto_9

    .line 442
    :sswitch_10
    const-string v4, "virtualCats"

    .line 443
    .line 444
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-nez v2, :cond_19

    .line 449
    .line 450
    goto :goto_7

    .line 451
    :cond_19
    sget-object v10, La/lhb0;->o:La/lhb0;

    .line 452
    .line 453
    goto :goto_9

    .line 454
    :sswitch_11
    const-string v4, "xgamesCats"

    .line 455
    .line 456
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    if-nez v2, :cond_1a

    .line 461
    .line 462
    goto :goto_7

    .line 463
    :cond_1a
    sget-object v10, La/lhb0;->j:La/lhb0;

    .line 464
    .line 465
    goto :goto_9

    .line 466
    :sswitch_12
    const-string v4, "esportsCats"

    .line 467
    .line 468
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    if-nez v2, :cond_1b

    .line 473
    .line 474
    goto :goto_7

    .line 475
    :cond_1b
    sget-object v10, La/lhb0;->p:La/lhb0;

    .line 476
    .line 477
    goto :goto_9

    .line 478
    :sswitch_13
    const-string v4, "esportsPopularPrematch"

    .line 479
    .line 480
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    if-nez v2, :cond_1c

    .line 485
    .line 486
    :goto_7
    goto :goto_8

    .line 487
    :cond_1c
    sget-object v10, La/lhb0;->r:La/lhb0;

    .line 488
    .line 489
    goto :goto_9

    .line 490
    :cond_1d
    :goto_8
    move-object v10, v3

    .line 491
    :goto_9
    if-eqz v10, :cond_8

    .line 492
    .line 493
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    goto/16 :goto_6

    .line 497
    .line 498
    :cond_1e
    iput-boolean v0, v7, La/chb0;->i:Z

    .line 499
    .line 500
    iput v9, v7, La/chb0;->l:I

    .line 501
    .line 502
    iget-object p0, p0, La/ihb0;->b:La/wgb0;

    .line 503
    .line 504
    invoke-virtual {p0, v1, v7}, La/wgb0;->d(Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object p0

    .line 508
    if-ne p0, v8, :cond_1f

    .line 509
    .line 510
    :goto_a
    return-object v8

    .line 511
    :cond_1f
    :goto_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    return-object p0

    .line 514
    nop

    .line 515
    :sswitch_data_0
    .sparse-switch
        -0x56ef79c9 -> :sswitch_13
        -0x41479a5f -> :sswitch_12
        -0x40e31fba -> :sswitch_11
        -0x3b236ef8 -> :sswitch_10
        -0x35083d2e -> :sswitch_f
        -0x30c1c8bc -> :sswitch_e
        -0x1a82b326 -> :sswitch_d
        -0x13fc3cfe -> :sswitch_c
        -0xb98aec0 -> :sswitch_b
        0xe7c5162 -> :sswitch_a
        0x13099ec6 -> :sswitch_9
        0x3ae0c2fb -> :sswitch_8
        0x3f675b7a -> :sswitch_7
        0x42c35a88 -> :sswitch_6
        0x44ebc821 -> :sswitch_5
        0x54fcc4a1 -> :sswitch_4
        0x5c248c20 -> :sswitch_3
        0x6133d20b -> :sswitch_2
        0x64d20365 -> :sswitch_1
        0x675f3984 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, La/dhb0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/dhb0;

    .line 11
    .line 12
    iget v3, v2, La/dhb0;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/dhb0;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/dhb0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/dhb0;-><init>(La/ihb0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/dhb0;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/dhb0;->q:I

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x3

    .line 38
    const/4 v10, 0x1

    .line 39
    if-eqz v4, :cond_7

    .line 40
    .line 41
    if-eq v4, v10, :cond_6

    .line 42
    .line 43
    if-eq v4, v6, :cond_5

    .line 44
    .line 45
    if-eq v4, v7, :cond_3

    .line 46
    .line 47
    if-ne v4, v5, :cond_2

    .line 48
    .line 49
    iget v4, v2, La/dhb0;->m:I

    .line 50
    .line 51
    iget v11, v2, La/dhb0;->l:I

    .line 52
    .line 53
    iget v12, v2, La/dhb0;->k:I

    .line 54
    .line 55
    iget-wide v13, v2, La/dhb0;->j:J

    .line 56
    .line 57
    const/16 p1, 0x0

    .line 58
    .line 59
    iget-wide v8, v2, La/dhb0;->i:J

    .line 60
    .line 61
    iget-object v15, v2, La/dhb0;->n:Ljava/lang/Throwable;

    .line 62
    .line 63
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move v0, v4

    .line 67
    move v4, v11

    .line 68
    move-wide/from16 v16, v13

    .line 69
    .line 70
    move v14, v12

    .line 71
    move-wide v11, v8

    .line 72
    move-wide/from16 v8, v16

    .line 73
    .line 74
    :cond_1
    move-object v13, v15

    .line 75
    goto/16 :goto_7

    .line 76
    .line 77
    :cond_2
    const/16 p1, 0x0

    .line 78
    .line 79
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_3
    const/16 p1, 0x0

    .line 86
    .line 87
    iget v4, v2, La/dhb0;->m:I

    .line 88
    .line 89
    iget v8, v2, La/dhb0;->l:I

    .line 90
    .line 91
    iget v9, v2, La/dhb0;->k:I

    .line 92
    .line 93
    iget-wide v11, v2, La/dhb0;->j:J

    .line 94
    .line 95
    iget-wide v13, v2, La/dhb0;->i:J

    .line 96
    .line 97
    iget-object v15, v2, La/dhb0;->n:Ljava/lang/Throwable;

    .line 98
    .line 99
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move v0, v4

    .line 103
    move v4, v8

    .line 104
    move-wide/from16 v16, v13

    .line 105
    .line 106
    move v14, v9

    .line 107
    move-wide v8, v11

    .line 108
    move-wide/from16 v11, v16

    .line 109
    .line 110
    :cond_4
    move-object v13, v15

    .line 111
    goto/16 :goto_6

    .line 112
    .line 113
    :cond_5
    const/16 p1, 0x0

    .line 114
    .line 115
    iget v4, v2, La/dhb0;->l:I

    .line 116
    .line 117
    iget v8, v2, La/dhb0;->k:I

    .line 118
    .line 119
    iget-wide v11, v2, La/dhb0;->j:J

    .line 120
    .line 121
    iget-wide v13, v2, La/dhb0;->i:J

    .line 122
    .line 123
    iget-object v9, v2, La/dhb0;->n:Ljava/lang/Throwable;

    .line 124
    .line 125
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    move-object v15, v9

    .line 131
    move-wide/from16 v16, v13

    .line 132
    .line 133
    move-object v13, v0

    .line 134
    move v14, v8

    .line 135
    move-wide v8, v11

    .line 136
    move-wide/from16 v11, v16

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    const/16 p1, 0x0

    .line 140
    .line 141
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_7
    const/16 p1, 0x0

    .line 146
    .line 147
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    sget-object v0, La/wen;->b:La/uen;

    .line 151
    .line 152
    sget-object v0, La/bfn;->e:La/bfn;

    .line 153
    .line 154
    invoke-static {v7, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v8

    .line 158
    iput v10, v2, La/dhb0;->q:I

    .line 159
    .line 160
    invoke-static {v8, v9, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-ne v0, v3, :cond_8

    .line 165
    .line 166
    goto/16 :goto_9

    .line 167
    .line 168
    :cond_8
    :goto_1
    sget-wide v8, La/cag0;->a:J

    .line 169
    .line 170
    const-wide/16 v11, 0x2

    .line 171
    .line 172
    move-object/from16 v13, p1

    .line 173
    .line 174
    move v0, v10

    .line 175
    const/4 v4, 0x0

    .line 176
    const/4 v14, 0x0

    .line 177
    :goto_2
    if-eqz v0, :cond_11

    .line 178
    .line 179
    :try_start_1
    iput-object v13, v2, La/dhb0;->n:Ljava/lang/Throwable;

    .line 180
    .line 181
    iput-wide v11, v2, La/dhb0;->i:J

    .line 182
    .line 183
    iput-wide v8, v2, La/dhb0;->j:J

    .line 184
    .line 185
    iput v14, v2, La/dhb0;->k:I

    .line 186
    .line 187
    iput v4, v2, La/dhb0;->l:I

    .line 188
    .line 189
    iput v0, v2, La/dhb0;->m:I

    .line 190
    .line 191
    iput v6, v2, La/dhb0;->q:I

    .line 192
    .line 193
    invoke-virtual {v1, v2}, La/ihb0;->a(La/zje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 197
    if-ne v0, v3, :cond_9

    .line 198
    .line 199
    goto/16 :goto_9

    .line 200
    .line 201
    :cond_9
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object v0

    .line 204
    :catchall_1
    move-exception v0

    .line 205
    move-object v15, v13

    .line 206
    move-object v13, v0

    .line 207
    :goto_4
    invoke-static {v13}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_d

    .line 212
    .line 213
    if-nez v14, :cond_a

    .line 214
    .line 215
    new-instance v0, La/el50;

    .line 216
    .line 217
    invoke-direct {v0, v13}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    move-object v13, v0

    .line 221
    const/4 v0, 0x0

    .line 222
    goto :goto_2

    .line 223
    :cond_a
    int-to-long v5, v4

    .line 224
    cmp-long v0, v5, v11

    .line 225
    .line 226
    if-gez v0, :cond_b

    .line 227
    .line 228
    move v0, v10

    .line 229
    goto :goto_5

    .line 230
    :cond_b
    const/4 v0, 0x0

    .line 231
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 232
    .line 233
    if-eqz v0, :cond_c

    .line 234
    .line 235
    iput-object v15, v2, La/dhb0;->n:Ljava/lang/Throwable;

    .line 236
    .line 237
    iput-wide v11, v2, La/dhb0;->i:J

    .line 238
    .line 239
    iput-wide v8, v2, La/dhb0;->j:J

    .line 240
    .line 241
    iput v14, v2, La/dhb0;->k:I

    .line 242
    .line 243
    iput v4, v2, La/dhb0;->l:I

    .line 244
    .line 245
    iput v0, v2, La/dhb0;->m:I

    .line 246
    .line 247
    iput v7, v2, La/dhb0;->q:I

    .line 248
    .line 249
    invoke-static {v8, v9, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    if-ne v5, v3, :cond_4

    .line 254
    .line 255
    goto :goto_9

    .line 256
    :goto_6
    const/4 v5, 0x4

    .line 257
    :goto_7
    const/4 v6, 0x2

    .line 258
    goto :goto_2

    .line 259
    :cond_c
    new-instance v5, La/el50;

    .line 260
    .line 261
    invoke-direct {v5, v13}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 262
    .line 263
    .line 264
    move-object v13, v5

    .line 265
    goto :goto_6

    .line 266
    :cond_d
    invoke-static {v13}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_10

    .line 271
    .line 272
    int-to-long v5, v4

    .line 273
    cmp-long v0, v5, v11

    .line 274
    .line 275
    if-gez v0, :cond_e

    .line 276
    .line 277
    move v0, v10

    .line 278
    goto :goto_8

    .line 279
    :cond_e
    const/4 v0, 0x0

    .line 280
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 281
    .line 282
    if-eqz v0, :cond_f

    .line 283
    .line 284
    iput-object v15, v2, La/dhb0;->n:Ljava/lang/Throwable;

    .line 285
    .line 286
    iput-wide v11, v2, La/dhb0;->i:J

    .line 287
    .line 288
    iput-wide v8, v2, La/dhb0;->j:J

    .line 289
    .line 290
    iput v14, v2, La/dhb0;->k:I

    .line 291
    .line 292
    iput v4, v2, La/dhb0;->l:I

    .line 293
    .line 294
    iput v0, v2, La/dhb0;->m:I

    .line 295
    .line 296
    const/4 v5, 0x4

    .line 297
    iput v5, v2, La/dhb0;->q:I

    .line 298
    .line 299
    invoke-static {v8, v9, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    if-ne v6, v3, :cond_1

    .line 304
    .line 305
    :goto_9
    return-object v3

    .line 306
    :cond_f
    const/4 v5, 0x4

    .line 307
    new-instance v6, La/dag0;

    .line 308
    .line 309
    invoke-direct {v6, v13}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    move-object v13, v6

    .line 313
    goto :goto_7

    .line 314
    :cond_10
    const/4 v5, 0x4

    .line 315
    invoke-static {v13}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 316
    .line 317
    .line 318
    const/4 v0, 0x0

    .line 319
    goto :goto_7

    .line 320
    :cond_11
    if-nez v13, :cond_12

    .line 321
    .line 322
    const-string v0, "Unexpected error"

    .line 323
    .line 324
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    return-object p1

    .line 328
    :cond_12
    throw v13
.end method

.method public final c(La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, La/ehb0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/ehb0;

    .line 11
    .line 12
    iget v3, v2, La/ehb0;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/ehb0;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/ehb0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/ehb0;-><init>(La/ihb0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/ehb0;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/ehb0;->q:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/ehb0;->m:I

    .line 47
    .line 48
    iget v10, v2, La/ehb0;->l:I

    .line 49
    .line 50
    iget v11, v2, La/ehb0;->k:I

    .line 51
    .line 52
    iget-wide v12, v2, La/ehb0;->j:J

    .line 53
    .line 54
    iget-wide v14, v2, La/ehb0;->i:J

    .line 55
    .line 56
    const/16 p1, 0x0

    .line 57
    .line 58
    iget-object v7, v2, La/ehb0;->n:Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move v0, v4

    .line 64
    move v4, v10

    .line 65
    move-wide/from16 v16, v14

    .line 66
    .line 67
    move v14, v11

    .line 68
    move-wide v10, v12

    .line 69
    move-wide/from16 v12, v16

    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_1
    const/16 p1, 0x0

    .line 74
    .line 75
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_2
    const/16 p1, 0x0

    .line 82
    .line 83
    iget v4, v2, La/ehb0;->m:I

    .line 84
    .line 85
    iget v7, v2, La/ehb0;->l:I

    .line 86
    .line 87
    iget v10, v2, La/ehb0;->k:I

    .line 88
    .line 89
    iget-wide v11, v2, La/ehb0;->j:J

    .line 90
    .line 91
    iget-wide v13, v2, La/ehb0;->i:J

    .line 92
    .line 93
    iget-object v15, v2, La/ehb0;->n:Ljava/lang/Throwable;

    .line 94
    .line 95
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-wide/from16 v16, v13

    .line 99
    .line 100
    move v14, v10

    .line 101
    move-wide v10, v11

    .line 102
    move-wide/from16 v12, v16

    .line 103
    .line 104
    move v0, v4

    .line 105
    move v4, v7

    .line 106
    move-object v7, v15

    .line 107
    goto/16 :goto_5

    .line 108
    .line 109
    :cond_3
    const/16 p1, 0x0

    .line 110
    .line 111
    iget v4, v2, La/ehb0;->l:I

    .line 112
    .line 113
    iget v7, v2, La/ehb0;->k:I

    .line 114
    .line 115
    iget-wide v10, v2, La/ehb0;->j:J

    .line 116
    .line 117
    iget-wide v12, v2, La/ehb0;->i:J

    .line 118
    .line 119
    iget-object v14, v2, La/ehb0;->n:Ljava/lang/Throwable;

    .line 120
    .line 121
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :catchall_0
    move-exception v0

    .line 126
    move/from16 v16, v7

    .line 127
    .line 128
    move-object v7, v0

    .line 129
    move/from16 v0, v16

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    const/16 p1, 0x0

    .line 133
    .line 134
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    sget-wide v10, La/cag0;->a:J

    .line 138
    .line 139
    const-wide/16 v12, 0x3

    .line 140
    .line 141
    move-object/from16 v7, p1

    .line 142
    .line 143
    move v0, v9

    .line 144
    const/4 v4, 0x0

    .line 145
    const/4 v14, 0x0

    .line 146
    :goto_1
    if-eqz v0, :cond_e

    .line 147
    .line 148
    :try_start_1
    iput-object v7, v2, La/ehb0;->n:Ljava/lang/Throwable;

    .line 149
    .line 150
    iput-wide v12, v2, La/ehb0;->i:J

    .line 151
    .line 152
    iput-wide v10, v2, La/ehb0;->j:J

    .line 153
    .line 154
    iput v14, v2, La/ehb0;->k:I

    .line 155
    .line 156
    iput v4, v2, La/ehb0;->l:I

    .line 157
    .line 158
    iput v0, v2, La/ehb0;->m:I

    .line 159
    .line 160
    iput v9, v2, La/ehb0;->q:I

    .line 161
    .line 162
    invoke-virtual {v1, v2}, La/ihb0;->a(La/zje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 166
    if-ne v0, v3, :cond_5

    .line 167
    .line 168
    goto/16 :goto_8

    .line 169
    .line 170
    :cond_5
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :catchall_1
    move-exception v0

    .line 174
    move-object/from16 v16, v7

    .line 175
    .line 176
    move-object v7, v0

    .line 177
    move v0, v14

    .line 178
    move-object/from16 v14, v16

    .line 179
    .line 180
    :goto_3
    invoke-static {v7}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    if-eqz v15, :cond_a

    .line 185
    .line 186
    if-nez v0, :cond_6

    .line 187
    .line 188
    new-instance v14, La/el50;

    .line 189
    .line 190
    invoke-direct {v14, v7}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    move-object v7, v14

    .line 194
    move v14, v0

    .line 195
    const/4 v0, 0x0

    .line 196
    goto :goto_1

    .line 197
    :cond_6
    int-to-long v8, v4

    .line 198
    cmp-long v8, v8, v12

    .line 199
    .line 200
    if-gez v8, :cond_7

    .line 201
    .line 202
    const/4 v8, 0x1

    .line 203
    goto :goto_4

    .line 204
    :cond_7
    const/4 v8, 0x0

    .line 205
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 206
    .line 207
    if-eqz v8, :cond_9

    .line 208
    .line 209
    iput-object v14, v2, La/ehb0;->n:Ljava/lang/Throwable;

    .line 210
    .line 211
    iput-wide v12, v2, La/ehb0;->i:J

    .line 212
    .line 213
    iput-wide v10, v2, La/ehb0;->j:J

    .line 214
    .line 215
    iput v0, v2, La/ehb0;->k:I

    .line 216
    .line 217
    iput v4, v2, La/ehb0;->l:I

    .line 218
    .line 219
    iput v8, v2, La/ehb0;->m:I

    .line 220
    .line 221
    iput v6, v2, La/ehb0;->q:I

    .line 222
    .line 223
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    if-ne v7, v3, :cond_8

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_8
    move-object v7, v14

    .line 231
    move v14, v0

    .line 232
    move v0, v8

    .line 233
    :goto_5
    const/4 v9, 0x1

    .line 234
    goto :goto_1

    .line 235
    :cond_9
    new-instance v9, La/el50;

    .line 236
    .line 237
    invoke-direct {v9, v7}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    :goto_6
    move v14, v0

    .line 241
    move v0, v8

    .line 242
    move-object v7, v9

    .line 243
    goto :goto_5

    .line 244
    :cond_a
    invoke-static {v7}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    if-eqz v8, :cond_d

    .line 249
    .line 250
    int-to-long v8, v4

    .line 251
    cmp-long v8, v8, v12

    .line 252
    .line 253
    if-gez v8, :cond_b

    .line 254
    .line 255
    const/4 v8, 0x1

    .line 256
    goto :goto_7

    .line 257
    :cond_b
    const/4 v8, 0x0

    .line 258
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 259
    .line 260
    if-eqz v8, :cond_c

    .line 261
    .line 262
    iput-object v14, v2, La/ehb0;->n:Ljava/lang/Throwable;

    .line 263
    .line 264
    iput-wide v12, v2, La/ehb0;->i:J

    .line 265
    .line 266
    iput-wide v10, v2, La/ehb0;->j:J

    .line 267
    .line 268
    iput v0, v2, La/ehb0;->k:I

    .line 269
    .line 270
    iput v4, v2, La/ehb0;->l:I

    .line 271
    .line 272
    iput v8, v2, La/ehb0;->m:I

    .line 273
    .line 274
    iput v5, v2, La/ehb0;->q:I

    .line 275
    .line 276
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    if-ne v7, v3, :cond_8

    .line 281
    .line 282
    :goto_8
    return-object v3

    .line 283
    :cond_c
    new-instance v9, La/dag0;

    .line 284
    .line 285
    invoke-direct {v9, v7}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    goto :goto_6

    .line 289
    :cond_d
    invoke-static {v7}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 290
    .line 291
    .line 292
    move v14, v0

    .line 293
    const/4 v0, 0x0

    .line 294
    goto :goto_5

    .line 295
    :cond_e
    if-nez v7, :cond_f

    .line 296
    .line 297
    const-string v0, "Unexpected error"

    .line 298
    .line 299
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-object p1

    .line 303
    :cond_f
    throw v7
.end method

.method public final d(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/fhb0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/fhb0;

    .line 7
    .line 8
    iget v1, v0, La/fhb0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/fhb0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fhb0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/fhb0;-><init>(La/ihb0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/fhb0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fhb0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v3, v0, La/fhb0;->k:I

    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/ihb0;->c(La/zje;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-ne p1, v1, :cond_3

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3
    :goto_1
    invoke-virtual {p0}, La/ihb0;->f()V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/ghb0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ghb0;

    .line 7
    .line 8
    iget v1, v0, La/ghb0;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ghb0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ghb0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ghb0;-><init>(La/ihb0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ghb0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ghb0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, La/ghb0;->j:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_6

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_2
    iget-boolean v2, v0, La/ghb0;->i:Z

    .line 56
    .line 57
    iget-object v3, v0, La/ghb0;->j:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, La/ihb0;

    .line 60
    .line 61
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput v6, v0, La/ghb0;->m:I

    .line 75
    .line 76
    iget-object p1, p0, La/ihb0;->b:La/wgb0;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, La/wgb0;->c(La/zje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v1, :cond_5

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 92
    .line 93
    iput-object v3, v0, La/ghb0;->j:Ljava/lang/Object;

    .line 94
    .line 95
    iput-boolean v2, v0, La/ghb0;->i:Z

    .line 96
    .line 97
    iput v5, v0, La/ghb0;->m:I

    .line 98
    .line 99
    invoke-virtual {p0, v0}, La/ihb0;->a(La/zje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v1, :cond_6

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    sget-object v3, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :goto_3
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 112
    .line 113
    new-instance v3, La/g0g0;

    .line 114
    .line 115
    invoke-direct {v3, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    move-object p1, v3

    .line 119
    :goto_4
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    if-eqz v3, :cond_8

    .line 124
    .line 125
    if-eqz v2, :cond_8

    .line 126
    .line 127
    iput-object p1, v0, La/ghb0;->j:Ljava/lang/Object;

    .line 128
    .line 129
    iput-boolean v2, v0, La/ghb0;->i:Z

    .line 130
    .line 131
    iput v4, v0, La/ghb0;->m:I

    .line 132
    .line 133
    invoke-virtual {p0, v0}, La/ihb0;->b(La/zje;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-ne v0, v1, :cond_7

    .line 138
    .line 139
    :goto_5
    return-object v1

    .line 140
    :cond_7
    move-object v0, p1

    .line 141
    :goto_6
    move-object p1, v0

    .line 142
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, La/ihb0;->f()V

    .line 146
    .line 147
    .line 148
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0
.end method

.method public final f()V
    .locals 9

    .line 1
    new-instance v0, La/hhb0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, v2, v1}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/ihb0;->f:La/qgb0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, La/qgb0;->c:La/bby;

    .line 14
    .line 15
    invoke-static {v1}, La/e3c;->n(La/bby;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, La/qgb0;->b:La/sje;

    .line 19
    .line 20
    sget-object v4, La/pgb0;->a:La/pgb0;

    .line 21
    .line 22
    iget-object v1, p0, La/qgb0;->a:La/mne;

    .line 23
    .line 24
    iget-object v6, v1, La/mne;->a:La/rwj;

    .line 25
    .line 26
    new-instance v7, La/er60;

    .line 27
    .line 28
    const/16 v1, 0x13

    .line 29
    .line 30
    invoke-direct {v7, p0, v0, v2, v1}, La/er60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 31
    .line 32
    .line 33
    const/16 v8, 0xa

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/qgb0;->c:La/bby;

    .line 41
    .line 42
    return-void
.end method
