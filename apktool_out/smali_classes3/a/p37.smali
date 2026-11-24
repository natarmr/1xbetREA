.class public final La/p37;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final h:La/q37;


# direct methods
.method public constructor <init>(La/q37;)V
    .locals 2

    .line 1
    new-instance v0, La/t07;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, La/t07;-><init>(B)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/p37;->h:La/q37;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/u1k;

    .line 2
    .line 3
    instance-of p2, p1, La/i1k;

    .line 4
    .line 5
    iget-object v0, p0, La/p37;->h:La/q37;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    check-cast p1, La/i1k;

    .line 10
    .line 11
    iget-object p0, p1, La/i1k;->a:La/n3w;

    .line 12
    .line 13
    iget-object p1, p1, La/i1k;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 14
    .line 15
    iget-object p2, p0, La/n3w;->g1:La/q4f;

    .line 16
    .line 17
    invoke-static {p2}, La/vfc;->R(La/q4f;)La/ozv;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object p2, p0, La/n3w;->l:La/e4f;

    .line 22
    .line 23
    invoke-static {p2}, La/bfb;->n0(La/e4f;)La/z5w;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {p1}, La/slb;->d0(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/r6w;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {p0}, La/xkb;->N(La/n3w;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {p0}, La/xkb;->f0(La/n3w;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual/range {v0 .. v5}, La/q37;->c(La/ozv;La/z5w;La/r6w;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_14

    .line 43
    .line 44
    :cond_0
    instance-of p0, p1, La/h1k;

    .line 45
    .line 46
    const-string p2, ""

    .line 47
    .line 48
    const/16 v1, 0xa

    .line 49
    .line 50
    if-eqz p0, :cond_9

    .line 51
    .line 52
    check-cast p1, La/h1k;

    .line 53
    .line 54
    iget-object p0, p1, La/h1k;->a:La/a5w;

    .line 55
    .line 56
    iget-object v2, p1, La/h1k;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 57
    .line 58
    iget-object p1, p1, La/h1k;->c:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {p0}, La/a5w;->c()La/q4f;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-static {v3}, La/vfc;->R(La/q4f;)La/ozv;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {p0}, La/a5w;->b()La/jvw;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v4}, La/nkb;->P(La/jvw;)La/z5w;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v2}, La/slb;->d0(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/r6w;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    move v5, v1

    .line 81
    move-object v1, v3

    .line 82
    move-object v3, v2

    .line 83
    move-object v2, v4

    .line 84
    invoke-interface {p0}, La/a5w;->d()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    instance-of v6, p0, La/kzv;

    .line 89
    .line 90
    if-eqz v6, :cond_8

    .line 91
    .line 92
    new-instance v6, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_2

    .line 106
    .line 107
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    move-object v8, v7

    .line 112
    check-cast v8, La/xco;

    .line 113
    .line 114
    iget-boolean v8, v8, La/xco;->e:Z

    .line 115
    .line 116
    if-eqz v8, :cond_1

    .line 117
    .line 118
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_3

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    if-eqz v6, :cond_8

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    check-cast v6, La/xco;

    .line 144
    .line 145
    iget-wide v6, v6, La/xco;->a:J

    .line 146
    .line 147
    move-object v8, p0

    .line 148
    check-cast v8, La/kzv;

    .line 149
    .line 150
    iget-wide v9, v8, La/kzv;->T:J

    .line 151
    .line 152
    cmp-long v6, v6, v9

    .line 153
    .line 154
    if-nez v6, :cond_4

    .line 155
    .line 156
    iget-object p0, v8, La/kzv;->Y:Ljava/util/List;

    .line 157
    .line 158
    new-instance p1, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-static {p0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-eqz p2, :cond_5

    .line 176
    .line 177
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    check-cast p2, La/z0w;

    .line 182
    .line 183
    iget-wide v5, p2, La/z0w;->G:J

    .line 184
    .line 185
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_5
    new-instance v5, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    :cond_6
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-eqz p1, :cond_7

    .line 207
    .line 208
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    move-object p2, p1

    .line 213
    check-cast p2, Ljava/lang/Number;

    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 216
    .line 217
    .line 218
    move-result-wide v6

    .line 219
    const-wide/16 v8, 0x0

    .line 220
    .line 221
    cmp-long p2, v6, v8

    .line 222
    .line 223
    if-eqz p2, :cond_6

    .line 224
    .line 225
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_7
    const/4 v9, 0x0

    .line 230
    const/16 v10, 0x3f

    .line 231
    .line 232
    const/4 v6, 0x0

    .line 233
    const/4 v7, 0x0

    .line 234
    const/4 v8, 0x0

    .line 235
    invoke-static/range {v5 .. v10}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    :cond_8
    :goto_3
    move-object v5, p2

    .line 240
    invoke-virtual/range {v0 .. v5}, La/q37;->c(La/ozv;La/z5w;La/r6w;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_14

    .line 244
    .line 245
    :cond_9
    move v5, v1

    .line 246
    instance-of p0, p1, La/y0k;

    .line 247
    .line 248
    const-string v1, "option"

    .line 249
    .line 250
    if-eqz p0, :cond_b

    .line 251
    .line 252
    check-cast p1, La/y0k;

    .line 253
    .line 254
    iget-boolean p0, p1, La/y0k;->a:Z

    .line 255
    .line 256
    if-eqz p0, :cond_a

    .line 257
    .line 258
    const-string p0, "all"

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_a
    const-string p0, "compact"

    .line 262
    .line 263
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 267
    .line 268
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 269
    .line 270
    const-string p2, "bet_history_select_view"

    .line 271
    .line 272
    invoke-static {v1, p0, p1, p2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iget-object p1, v0, La/q37;->c:La/au0;

    .line 276
    .line 277
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 278
    .line 279
    const-wide/16 v0, 0xc83

    .line 280
    .line 281
    :goto_5
    invoke-static {p0, p1, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_14

    .line 285
    .line 286
    :cond_b
    instance-of p0, p1, La/p1k;

    .line 287
    .line 288
    if-eqz p0, :cond_c

    .line 289
    .line 290
    check-cast p1, La/p1k;

    .line 291
    .line 292
    iget-object p0, p1, La/p1k;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 293
    .line 294
    sget-object p1, La/a1w;->f:La/a1w;

    .line 295
    .line 296
    invoke-static {p0}, La/slb;->d0(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/r6w;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    invoke-static {p0}, La/slb;->d0(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/r6w;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-virtual {p0}, La/r6w;->a()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    iget-object v1, v0, La/q37;->b:La/b4j;

    .line 312
    .line 313
    invoke-static {v1, p1, p2}, La/b4j;->h(La/b4j;La/a1w;La/r6w;)V

    .line 314
    .line 315
    .line 316
    iget-object p1, v0, La/q37;->c:La/au0;

    .line 317
    .line 318
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 319
    .line 320
    const-wide/16 v0, 0xc81

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_c
    instance-of p0, p1, La/g1k;

    .line 324
    .line 325
    const-wide/16 v2, 0xc7f

    .line 326
    .line 327
    const-string v4, "point"

    .line 328
    .line 329
    const/4 v6, 0x3

    .line 330
    const/4 v7, 0x2

    .line 331
    const/4 v8, 0x1

    .line 332
    if-eqz p0, :cond_13

    .line 333
    .line 334
    check-cast p1, La/g1k;

    .line 335
    .line 336
    iget-object p0, p1, La/g1k;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 337
    .line 338
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 339
    .line 340
    .line 341
    move-result p0

    .line 342
    if-eqz p0, :cond_12

    .line 343
    .line 344
    if-eq p0, v8, :cond_11

    .line 345
    .line 346
    if-eq p0, v7, :cond_10

    .line 347
    .line 348
    if-eq p0, v6, :cond_f

    .line 349
    .line 350
    const/4 p1, 0x5

    .line 351
    if-eq p0, p1, :cond_e

    .line 352
    .line 353
    const/4 p1, 0x6

    .line 354
    if-eq p0, p1, :cond_d

    .line 355
    .line 356
    goto/16 :goto_14

    .line 357
    .line 358
    :cond_d
    sget-object p0, La/f4w;->d:La/f4w;

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_e
    sget-object p0, La/f4w;->f:La/f4w;

    .line 362
    .line 363
    goto :goto_6

    .line 364
    :cond_f
    sget-object p0, La/f4w;->g:La/f4w;

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_10
    sget-object p0, La/f4w;->e:La/f4w;

    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_11
    sget-object p0, La/f4w;->c:La/f4w;

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_12
    sget-object p0, La/f4w;->b:La/f4w;

    .line 374
    .line 375
    :goto_6
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 376
    .line 377
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 378
    .line 379
    sget-object p2, La/f4w;->a:La/f4w;

    .line 380
    .line 381
    invoke-virtual {p2}, La/f4w;->a()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    invoke-virtual {p0}, La/f4w;->a()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-static {v4, v1, p1, p2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    iget-object p1, v0, La/q37;->c:La/au0;

    .line 393
    .line 394
    invoke-virtual {p0}, La/f4w;->a()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_13
    sget-object p0, La/f1k;->a:La/f1k;

    .line 402
    .line 403
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result p0

    .line 407
    if-eqz p0, :cond_14

    .line 408
    .line 409
    sget-object p0, La/f4w;->h:La/f4w;

    .line 410
    .line 411
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 412
    .line 413
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 414
    .line 415
    sget-object p2, La/f4w;->a:La/f4w;

    .line 416
    .line 417
    invoke-virtual {p2}, La/f4w;->a()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p2

    .line 421
    invoke-virtual {p0}, La/f4w;->a()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-static {v4, v1, p1, p2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    iget-object p1, v0, La/q37;->c:La/au0;

    .line 429
    .line 430
    invoke-virtual {p0}, La/f4w;->a()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object p0

    .line 434
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 435
    .line 436
    :goto_7
    invoke-static {p0, p1, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 437
    .line 438
    .line 439
    goto/16 :goto_14

    .line 440
    .line 441
    :cond_14
    instance-of p0, p1, La/s1k;

    .line 442
    .line 443
    if-eqz p0, :cond_15

    .line 444
    .line 445
    check-cast p1, La/s1k;

    .line 446
    .line 447
    iget-object p0, p1, La/s1k;->a:Ljava/lang/String;

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    iget-object p1, v0, La/q37;->c:La/au0;

    .line 456
    .line 457
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 458
    .line 459
    const-wide/16 v2, 0xc7a

    .line 460
    .line 461
    invoke-static {p0, p1, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 462
    .line 463
    .line 464
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 465
    .line 466
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 467
    .line 468
    const-string p2, "bet_history_winback_banner_click"

    .line 469
    .line 470
    :goto_8
    invoke-static {v1, p0, p1, p2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    goto/16 :goto_14

    .line 474
    .line 475
    :cond_15
    instance-of p0, p1, La/t1k;

    .line 476
    .line 477
    if-eqz p0, :cond_16

    .line 478
    .line 479
    check-cast p1, La/t1k;

    .line 480
    .line 481
    iget-object p0, p1, La/t1k;->a:Ljava/lang/String;

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    iget-object p1, v0, La/q37;->c:La/au0;

    .line 487
    .line 488
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 489
    .line 490
    const-wide/16 v2, 0x2987

    .line 491
    .line 492
    invoke-static {p0, p1, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 493
    .line 494
    .line 495
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 496
    .line 497
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 498
    .line 499
    const-string p2, "bet_history_winback_banner_shown"

    .line 500
    .line 501
    goto :goto_8

    .line 502
    :cond_16
    sget-object p0, La/z0k;->a:La/z0k;

    .line 503
    .line 504
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result p0

    .line 508
    if-eqz p0, :cond_17

    .line 509
    .line 510
    iget-object p0, v0, La/q37;->c:La/au0;

    .line 511
    .line 512
    iget-object p0, p0, La/au0;->a:La/s1p;

    .line 513
    .line 514
    const-wide/16 p1, 0xc80

    .line 515
    .line 516
    sget-object v1, La/xun;->a:La/xun;

    .line 517
    .line 518
    invoke-virtual {p0, v1, p1, p2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 519
    .line 520
    .line 521
    iget-object p0, v0, La/q37;->b:La/b4j;

    .line 522
    .line 523
    iget-object p0, p0, La/b4j;->a:La/kt2;

    .line 524
    .line 525
    const-string p1, "bet_history_date_filter"

    .line 526
    .line 527
    invoke-interface {p0, p1}, La/kt2;->c(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_14

    .line 531
    .line 532
    :cond_17
    instance-of p0, p1, La/e1k;

    .line 533
    .line 534
    if-eqz p0, :cond_19

    .line 535
    .line 536
    check-cast p1, La/e1k;

    .line 537
    .line 538
    iget-boolean p0, p1, La/e1k;->a:Z

    .line 539
    .line 540
    iget-object p1, p1, La/e1k;->b:Ljava/lang/String;

    .line 541
    .line 542
    if-eqz p0, :cond_18

    .line 543
    .line 544
    sget-object p0, La/a1w;->h:La/a1w;

    .line 545
    .line 546
    goto :goto_9

    .line 547
    :cond_18
    sget-object p0, La/a1w;->i:La/a1w;

    .line 548
    .line 549
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    iget-object p2, v0, La/q37;->b:La/b4j;

    .line 556
    .line 557
    invoke-virtual {p2, p0, p1}, La/b4j;->i(La/a1w;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    goto/16 :goto_14

    .line 561
    .line 562
    :cond_19
    instance-of p0, p1, La/q1k;

    .line 563
    .line 564
    if-eqz p0, :cond_1a

    .line 565
    .line 566
    check-cast p1, La/q1k;

    .line 567
    .line 568
    iget-object p0, p1, La/q1k;->a:Ljava/lang/String;

    .line 569
    .line 570
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    iget-object p1, v0, La/q37;->i:La/ix0;

    .line 577
    .line 578
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 579
    .line 580
    .line 581
    move-result-wide v0

    .line 582
    iget-object p0, p1, La/ix0;->a:La/s1p;

    .line 583
    .line 584
    const-wide/16 p1, 0xd26

    .line 585
    .line 586
    :goto_a
    invoke-static {v0, v1, p0, p1, p2}, La/h97;->r(JLa/s1p;J)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_14

    .line 590
    .line 591
    :cond_1a
    instance-of p0, p1, La/r1k;

    .line 592
    .line 593
    if-eqz p0, :cond_1b

    .line 594
    .line 595
    check-cast p1, La/r1k;

    .line 596
    .line 597
    iget-object p0, p1, La/r1k;->a:Ljava/lang/String;

    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    iget-object p1, v0, La/q37;->i:La/ix0;

    .line 606
    .line 607
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 608
    .line 609
    .line 610
    move-result-wide v0

    .line 611
    iget-object p0, p1, La/ix0;->a:La/s1p;

    .line 612
    .line 613
    const-wide/16 p1, 0xd27

    .line 614
    .line 615
    goto :goto_a

    .line 616
    :cond_1b
    sget-object p0, La/j1k;->a:La/j1k;

    .line 617
    .line 618
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    move-result p0

    .line 622
    const-string v2, "screen"

    .line 623
    .line 624
    const-string v3, "history_anonim"

    .line 625
    .line 626
    if-eqz p0, :cond_1c

    .line 627
    .line 628
    sget-object p0, La/y1p;->b:La/y1p;

    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    iget-object p0, v0, La/q37;->b:La/b4j;

    .line 634
    .line 635
    iget-object p0, p0, La/b4j;->a:La/kt2;

    .line 636
    .line 637
    const-string p1, "login_page_call"

    .line 638
    .line 639
    invoke-static {v2, v3, p0, p1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    iget-object p0, v0, La/q37;->d:La/s64;

    .line 643
    .line 644
    invoke-virtual {p0, v3}, La/s64;->c(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    goto/16 :goto_14

    .line 648
    .line 649
    :cond_1c
    instance-of p0, p1, La/m1k;

    .line 650
    .line 651
    if-eqz p0, :cond_1d

    .line 652
    .line 653
    check-cast p1, La/m1k;

    .line 654
    .line 655
    iget-object p0, p1, La/m1k;->a:Ljava/lang/String;

    .line 656
    .line 657
    sget-object p1, La/y1p;->i:La/y1p;

    .line 658
    .line 659
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    iget-object p2, v0, La/q37;->b:La/b4j;

    .line 663
    .line 664
    iget-object p2, p2, La/b4j;->a:La/kt2;

    .line 665
    .line 666
    const-string v1, "reg_page_call"

    .line 667
    .line 668
    invoke-static {v2, v3, p2, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    iget-object p2, v0, La/q37;->d:La/s64;

    .line 672
    .line 673
    invoke-virtual {p2, p1, p0}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    goto/16 :goto_14

    .line 677
    .line 678
    :cond_1d
    instance-of p0, p1, La/b1k;

    .line 679
    .line 680
    if-eqz p0, :cond_1e

    .line 681
    .line 682
    check-cast p1, La/b1k;

    .line 683
    .line 684
    iget-object p0, p1, La/b1k;->a:Ljava/lang/String;

    .line 685
    .line 686
    sget-object p1, La/y1p;->b:La/y1p;

    .line 687
    .line 688
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    iget-object p1, v0, La/q37;->e:La/ih5;

    .line 692
    .line 693
    iget-object p1, p1, La/ih5;->a:La/kt2;

    .line 694
    .line 695
    const-string p2, "deposit_call"

    .line 696
    .line 697
    const-string v1, "history_user"

    .line 698
    .line 699
    invoke-static {v2, v1, p1, p2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    iget-object p1, v0, La/q37;->f:La/l7k;

    .line 703
    .line 704
    invoke-virtual {p1, v1, p0}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    goto/16 :goto_14

    .line 708
    .line 709
    :cond_1e
    instance-of p0, p1, La/v0k;

    .line 710
    .line 711
    if-eqz p0, :cond_1f

    .line 712
    .line 713
    check-cast p1, La/v0k;

    .line 714
    .line 715
    iget-object p0, p1, La/v0k;->a:Ljava/lang/String;

    .line 716
    .line 717
    iget-boolean p2, p1, La/v0k;->b:Z

    .line 718
    .line 719
    iget-object p1, p1, La/v0k;->c:Ljava/lang/String;

    .line 720
    .line 721
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    iget-object v1, v0, La/q37;->g:La/qu;

    .line 728
    .line 729
    invoke-virtual {v1, p0, p1, p2}, La/qu;->a(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 730
    .line 731
    .line 732
    iget-object v0, v0, La/q37;->h:La/s64;

    .line 733
    .line 734
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 735
    .line 736
    .line 737
    move-result-wide v1

    .line 738
    invoke-virtual {v0, p1, v1, v2, p2}, La/s64;->a(Ljava/lang/String;JZ)V

    .line 739
    .line 740
    .line 741
    goto/16 :goto_14

    .line 742
    .line 743
    :cond_1f
    instance-of p0, p1, La/x0k;

    .line 744
    .line 745
    if-eqz p0, :cond_20

    .line 746
    .line 747
    check-cast p1, La/x0k;

    .line 748
    .line 749
    iget-object p0, p1, La/x0k;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 750
    .line 751
    iget-object p2, p1, La/x0k;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 752
    .line 753
    iget-object p1, p1, La/x0k;->c:La/e4f;

    .line 754
    .line 755
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 759
    .line 760
    .line 761
    move-result p0

    .line 762
    packed-switch p0, :pswitch_data_0

    .line 763
    .line 764
    .line 765
    sget-object p0, La/byv;->b:La/byv;

    .line 766
    .line 767
    goto :goto_b

    .line 768
    :pswitch_0
    sget-object p0, La/byv;->l:La/byv;

    .line 769
    .line 770
    goto :goto_b

    .line 771
    :pswitch_1
    sget-object p0, La/byv;->m:La/byv;

    .line 772
    .line 773
    goto :goto_b

    .line 774
    :pswitch_2
    sget-object p0, La/byv;->k:La/byv;

    .line 775
    .line 776
    goto :goto_b

    .line 777
    :pswitch_3
    sget-object p0, La/byv;->i:La/byv;

    .line 778
    .line 779
    goto :goto_b

    .line 780
    :pswitch_4
    sget-object p0, La/byv;->e:La/byv;

    .line 781
    .line 782
    goto :goto_b

    .line 783
    :pswitch_5
    sget-object p0, La/byv;->h:La/byv;

    .line 784
    .line 785
    goto :goto_b

    .line 786
    :pswitch_6
    sget-object p0, La/byv;->g:La/byv;

    .line 787
    .line 788
    goto :goto_b

    .line 789
    :pswitch_7
    sget-object p0, La/byv;->f:La/byv;

    .line 790
    .line 791
    goto :goto_b

    .line 792
    :pswitch_8
    sget-object p0, La/byv;->d:La/byv;

    .line 793
    .line 794
    goto :goto_b

    .line 795
    :pswitch_9
    sget-object p0, La/byv;->c:La/byv;

    .line 796
    .line 797
    goto :goto_b

    .line 798
    :pswitch_a
    sget-object p0, La/byv;->j:La/byv;

    .line 799
    .line 800
    :goto_b
    invoke-static {p1}, La/bfb;->n0(La/e4f;)La/z5w;

    .line 801
    .line 802
    .line 803
    move-result-object p1

    .line 804
    invoke-static {p2}, La/slb;->d0(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/r6w;

    .line 805
    .line 806
    .line 807
    move-result-object p2

    .line 808
    invoke-virtual {v0, p0, p1, p2}, La/q37;->a(La/byv;La/z5w;La/r6w;)V

    .line 809
    .line 810
    .line 811
    goto/16 :goto_14

    .line 812
    .line 813
    :cond_20
    sget-object p0, La/c1k;->a:La/c1k;

    .line 814
    .line 815
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result p0

    .line 819
    if-eqz p0, :cond_21

    .line 820
    .line 821
    sget-object p0, La/a1w;->j:La/a1w;

    .line 822
    .line 823
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 824
    .line 825
    .line 826
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 827
    .line 828
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 829
    .line 830
    invoke-virtual {p0}, La/a1w;->a()Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object p0

    .line 834
    invoke-interface {p1, p0}, La/kt2;->c(Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    iget-object p0, v0, La/q37;->c:La/au0;

    .line 838
    .line 839
    iget-object p0, p0, La/au0;->a:La/s1p;

    .line 840
    .line 841
    const-wide/16 p1, 0xc86

    .line 842
    .line 843
    sget-object v0, La/xun;->a:La/xun;

    .line 844
    .line 845
    invoke-virtual {p0, v0, p1, p2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 846
    .line 847
    .line 848
    goto/16 :goto_14

    .line 849
    .line 850
    :cond_21
    sget-object p0, La/w0k;->a:La/w0k;

    .line 851
    .line 852
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result p0

    .line 856
    if-eqz p0, :cond_22

    .line 857
    .line 858
    sget-object p0, La/a1w;->w:La/a1w;

    .line 859
    .line 860
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 864
    .line 865
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 866
    .line 867
    invoke-virtual {p0}, La/a1w;->a()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object p0

    .line 871
    invoke-interface {p1, p0}, La/kt2;->c(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    goto/16 :goto_14

    .line 875
    .line 876
    :cond_22
    sget-object p0, La/n1k;->a:La/n1k;

    .line 877
    .line 878
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result p0

    .line 882
    if-eqz p0, :cond_23

    .line 883
    .line 884
    iget-object p0, v0, La/q37;->c:La/au0;

    .line 885
    .line 886
    iget-object p0, p0, La/au0;->a:La/s1p;

    .line 887
    .line 888
    const-wide/16 p1, 0xc79

    .line 889
    .line 890
    sget-object v1, La/xun;->a:La/xun;

    .line 891
    .line 892
    invoke-virtual {p0, v1, p1, p2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 893
    .line 894
    .line 895
    iget-object p0, v0, La/q37;->b:La/b4j;

    .line 896
    .line 897
    sget-object p1, La/a1w;->g:La/a1w;

    .line 898
    .line 899
    iget-object p0, p0, La/b4j;->a:La/kt2;

    .line 900
    .line 901
    invoke-virtual {p1}, La/a1w;->a()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object p1

    .line 905
    invoke-interface {p0, p1}, La/kt2;->c(Ljava/lang/String;)V

    .line 906
    .line 907
    .line 908
    goto/16 :goto_14

    .line 909
    .line 910
    :cond_23
    instance-of p0, p1, La/a1k;

    .line 911
    .line 912
    if-eqz p0, :cond_28

    .line 913
    .line 914
    check-cast p1, La/a1k;

    .line 915
    .line 916
    iget-object p0, p1, La/a1k;->a:Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;

    .line 917
    .line 918
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 922
    .line 923
    .line 924
    move-result p0

    .line 925
    if-eqz p0, :cond_27

    .line 926
    .line 927
    if-eq p0, v8, :cond_26

    .line 928
    .line 929
    if-eq p0, v7, :cond_25

    .line 930
    .line 931
    if-ne p0, v6, :cond_24

    .line 932
    .line 933
    const-string p0, "email"

    .line 934
    .line 935
    goto :goto_c

    .line 936
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 937
    .line 938
    .line 939
    const/4 p0, 0x0

    .line 940
    return-object p0

    .line 941
    :cond_25
    const-string p0, "set"

    .line 942
    .line 943
    goto :goto_c

    .line 944
    :cond_26
    const-string p0, "month"

    .line 945
    .line 946
    goto :goto_c

    .line 947
    :cond_27
    const-string p0, "day"

    .line 948
    .line 949
    :goto_c
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 950
    .line 951
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 952
    .line 953
    const-string p2, "bet_history_period_click"

    .line 954
    .line 955
    invoke-static {v1, p0, p1, p2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    iget-object p1, v0, La/q37;->c:La/au0;

    .line 959
    .line 960
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 961
    .line 962
    const-wide/16 v0, 0x2b59

    .line 963
    .line 964
    goto/16 :goto_5

    .line 965
    .line 966
    :cond_28
    instance-of p0, p1, La/d1k;

    .line 967
    .line 968
    if-eqz p0, :cond_2a

    .line 969
    .line 970
    check-cast p1, La/d1k;

    .line 971
    .line 972
    iget-boolean p0, p1, La/d1k;->a:Z

    .line 973
    .line 974
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 975
    .line 976
    .line 977
    if-eqz p0, :cond_29

    .line 978
    .line 979
    const-string p0, "link"

    .line 980
    .line 981
    goto :goto_d

    .line 982
    :cond_29
    const-string p0, "cancel"

    .line 983
    .line 984
    :goto_d
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 985
    .line 986
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 987
    .line 988
    const-string p2, "bet_history_link_mail"

    .line 989
    .line 990
    const-string v1, "action"

    .line 991
    .line 992
    invoke-static {v1, p0, p1, p2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 993
    .line 994
    .line 995
    iget-object p1, v0, La/q37;->c:La/au0;

    .line 996
    .line 997
    iget-object p1, p1, La/au0;->a:La/s1p;

    .line 998
    .line 999
    const-wide/16 v0, 0x2b5a

    .line 1000
    .line 1001
    goto/16 :goto_5

    .line 1002
    .line 1003
    :cond_2a
    instance-of p0, p1, La/o1k;

    .line 1004
    .line 1005
    if-eqz p0, :cond_31

    .line 1006
    .line 1007
    check-cast p1, La/o1k;

    .line 1008
    .line 1009
    iget-object p0, p1, La/o1k;->a:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 1010
    .line 1011
    iget-object p1, p1, La/o1k;->b:Ljava/util/List;

    .line 1012
    .line 1013
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    invoke-static {p0}, La/slb;->d0(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/r6w;

    .line 1020
    .line 1021
    .line 1022
    move-result-object p0

    .line 1023
    new-instance p2, Ljava/util/ArrayList;

    .line 1024
    .line 1025
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1029
    .line 1030
    .line 1031
    move-result-object p1

    .line 1032
    :cond_2b
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1033
    .line 1034
    .line 1035
    move-result v1

    .line 1036
    if-eqz v1, :cond_2c

    .line 1037
    .line 1038
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v1

    .line 1042
    move-object v2, v1

    .line 1043
    check-cast v2, La/h0w;

    .line 1044
    .line 1045
    iget-boolean v2, v2, La/h0w;->b:Z

    .line 1046
    .line 1047
    if-eqz v2, :cond_2b

    .line 1048
    .line 1049
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1050
    .line 1051
    .line 1052
    goto :goto_e

    .line 1053
    :cond_2c
    new-instance p1, Ljava/util/ArrayList;

    .line 1054
    .line 1055
    invoke-static {p2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1056
    .line 1057
    .line 1058
    move-result v1

    .line 1059
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1063
    .line 1064
    .line 1065
    move-result-object p2

    .line 1066
    :goto_f
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 1067
    .line 1068
    .line 1069
    move-result v1

    .line 1070
    if-eqz v1, :cond_2d

    .line 1071
    .line 1072
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v1

    .line 1076
    check-cast v1, La/h0w;

    .line 1077
    .line 1078
    iget-object v1, v1, La/h0w;->a:La/jvw;

    .line 1079
    .line 1080
    invoke-static {v1}, La/nkb;->P(La/jvw;)La/z5w;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1085
    .line 1086
    .line 1087
    goto :goto_f

    .line 1088
    :cond_2d
    new-instance p2, Ljava/util/ArrayList;

    .line 1089
    .line 1090
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1094
    .line 1095
    .line 1096
    move-result-object p1

    .line 1097
    :cond_2e
    :goto_10
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1098
    .line 1099
    .line 1100
    move-result v1

    .line 1101
    if-eqz v1, :cond_2f

    .line 1102
    .line 1103
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v1

    .line 1107
    move-object v2, v1

    .line 1108
    check-cast v2, La/z5w;

    .line 1109
    .line 1110
    sget-object v3, La/z5w;->b:La/z5w;

    .line 1111
    .line 1112
    if-eq v2, v3, :cond_2e

    .line 1113
    .line 1114
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    goto :goto_10

    .line 1118
    :cond_2f
    iget-object p1, v0, La/q37;->b:La/b4j;

    .line 1119
    .line 1120
    invoke-virtual {p1, p0, p2}, La/b4j;->b(La/r6w;Ljava/util/List;)V

    .line 1121
    .line 1122
    .line 1123
    iget-object p1, v0, La/q37;->c:La/au0;

    .line 1124
    .line 1125
    invoke-virtual {p0}, La/r6w;->a()Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object p0

    .line 1129
    new-instance v0, Ljava/util/ArrayList;

    .line 1130
    .line 1131
    invoke-static {p2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1132
    .line 1133
    .line 1134
    move-result v1

    .line 1135
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1139
    .line 1140
    .line 1141
    move-result-object p2

    .line 1142
    :goto_11
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 1143
    .line 1144
    .line 1145
    move-result v1

    .line 1146
    if-eqz v1, :cond_30

    .line 1147
    .line 1148
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    check-cast v1, La/z5w;

    .line 1153
    .line 1154
    invoke-virtual {v1}, La/z5w;->a()Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v1

    .line 1158
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1159
    .line 1160
    .line 1161
    goto :goto_11

    .line 1162
    :cond_30
    invoke-virtual {p1, p0, v0}, La/au0;->c(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1163
    .line 1164
    .line 1165
    goto :goto_14

    .line 1166
    :cond_31
    instance-of p0, p1, La/k1k;

    .line 1167
    .line 1168
    const-string v1, "bet_history"

    .line 1169
    .line 1170
    const-string v2, "unsettled_bets"

    .line 1171
    .line 1172
    const-string v3, "bet_history_details"

    .line 1173
    .line 1174
    const-string v4, "bet_sell"

    .line 1175
    .line 1176
    if-eqz p0, :cond_32

    .line 1177
    .line 1178
    check-cast p1, La/k1k;

    .line 1179
    .line 1180
    iget-object p0, p1, La/k1k;->a:La/r6w;

    .line 1181
    .line 1182
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 1183
    .line 1184
    .line 1185
    move-result p0

    .line 1186
    packed-switch p0, :pswitch_data_1

    .line 1187
    .line 1188
    .line 1189
    :pswitch_b
    goto :goto_12

    .line 1190
    :pswitch_c
    move-object p2, v4

    .line 1191
    goto :goto_12

    .line 1192
    :pswitch_d
    move-object p2, v3

    .line 1193
    goto :goto_12

    .line 1194
    :pswitch_e
    move-object p2, v2

    .line 1195
    goto :goto_12

    .line 1196
    :pswitch_f
    move-object p2, v1

    .line 1197
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1198
    .line 1199
    .line 1200
    iget-object p0, v0, La/q37;->b:La/b4j;

    .line 1201
    .line 1202
    invoke-virtual {p0, p2}, La/b4j;->o(Ljava/lang/String;)V

    .line 1203
    .line 1204
    .line 1205
    iget-object p0, v0, La/q37;->c:La/au0;

    .line 1206
    .line 1207
    invoke-virtual {p0, p2}, La/au0;->m(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    goto :goto_14

    .line 1211
    :cond_32
    instance-of p0, p1, La/l1k;

    .line 1212
    .line 1213
    if-eqz p0, :cond_33

    .line 1214
    .line 1215
    check-cast p1, La/l1k;

    .line 1216
    .line 1217
    iget-object p0, p1, La/l1k;->a:La/r6w;

    .line 1218
    .line 1219
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 1220
    .line 1221
    .line 1222
    move-result p0

    .line 1223
    packed-switch p0, :pswitch_data_2

    .line 1224
    .line 1225
    .line 1226
    :pswitch_10
    goto :goto_13

    .line 1227
    :pswitch_11
    move-object p2, v4

    .line 1228
    goto :goto_13

    .line 1229
    :pswitch_12
    move-object p2, v3

    .line 1230
    goto :goto_13

    .line 1231
    :pswitch_13
    move-object p2, v2

    .line 1232
    goto :goto_13

    .line 1233
    :pswitch_14
    move-object p2, v1

    .line 1234
    :goto_13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    iget-object p0, v0, La/q37;->b:La/b4j;

    .line 1238
    .line 1239
    invoke-virtual {p0, p2}, La/b4j;->p(Ljava/lang/String;)V

    .line 1240
    .line 1241
    .line 1242
    iget-object p0, v0, La/q37;->c:La/au0;

    .line 1243
    .line 1244
    invoke-virtual {p0, p2}, La/au0;->n(Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    :cond_33
    :goto_14
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1248
    .line 1249
    return-object p0

    .line 1250
    nop

    .line 1251
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_d
        :pswitch_b
        :pswitch_c
    .end packed-switch

    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_14
        :pswitch_14
        :pswitch_14
        :pswitch_12
        :pswitch_10
        :pswitch_11
    .end packed-switch
.end method
