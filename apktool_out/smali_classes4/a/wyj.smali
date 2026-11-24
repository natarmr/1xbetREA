.class public final La/wyj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/ctf0;

.field public final b:La/y78;

.field public final c:La/g2v;

.field public final d:La/zjw;

.field public final e:La/th90;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:La/n0o0;

.field public final j:La/n0o0;

.field public final k:La/n0o0;

.field public final l:La/n0o0;

.field public final m:La/n0o0;

.field public final n:La/n0o0;

.field public final o:La/n0o0;

.field public final p:La/n0o0;

.field public final q:La/n0o0;

.field public final r:La/n0o0;

.field public final s:La/n0o0;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/home/CyberHomeParams;La/ctf0;La/y78;La/g2v;La/zjw;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p5

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v2, p2

    .line 12
    .line 13
    iput-object v2, v0, La/wyj;->a:La/ctf0;

    .line 14
    .line 15
    move-object/from16 v2, p3

    .line 16
    .line 17
    iput-object v2, v0, La/wyj;->b:La/y78;

    .line 18
    .line 19
    move-object/from16 v2, p4

    .line 20
    .line 21
    iput-object v2, v0, La/wyj;->c:La/g2v;

    .line 22
    .line 23
    iput-object v1, v0, La/wyj;->d:La/zjw;

    .line 24
    .line 25
    iget-object v2, v1, La/zjw;->a:Ljava/util/List;

    .line 26
    .line 27
    move-object/from16 v3, p1

    .line 28
    .line 29
    iget-object v3, v3, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 30
    .line 31
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 32
    .line 33
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v1, v1, La/zjw;->c:Ljava/util/List;

    .line 38
    .line 39
    const/4 v4, 0x5

    .line 40
    const/4 v5, 0x4

    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    if-eqz v8, :cond_1

    .line 49
    .line 50
    :cond_0
    const/4 v1, 0x0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_0

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    check-cast v8, La/lok0;

    .line 67
    .line 68
    iget-object v9, v0, La/wyj;->d:La/zjw;

    .line 69
    .line 70
    iget-boolean v9, v9, La/zjw;->f:Z

    .line 71
    .line 72
    if-eqz v9, :cond_3

    .line 73
    .line 74
    iget-object v8, v8, La/lok0;->t:Ljava/util/List;

    .line 75
    .line 76
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    goto :goto_0

    .line 85
    :cond_3
    iget-object v8, v8, La/lok0;->t:Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    :goto_0
    if-eqz v8, :cond_2

    .line 96
    .line 97
    move v1, v6

    .line 98
    :goto_1
    iget-object v8, v0, La/wyj;->d:La/zjw;

    .line 99
    .line 100
    iget-object v9, v8, La/zjw;->b:La/sff0;

    .line 101
    .line 102
    new-instance v10, La/jo20;

    .line 103
    .line 104
    invoke-direct {v10}, La/jo20;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-eqz v11, :cond_7

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    check-cast v11, La/ekw;

    .line 122
    .line 123
    iget-object v11, v11, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 124
    .line 125
    new-instance v12, La/hjw;

    .line 126
    .line 127
    iget-boolean v13, v8, La/zjw;->f:Z

    .line 128
    .line 129
    invoke-static {v9, v11, v13}, La/wyj;->a(La/sff0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    invoke-static {v13}, La/ujn;->i(Ljava/lang/String;)La/lq5;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    iget-object v14, v9, La/sff0;->g:La/mum0;

    .line 138
    .line 139
    iget-object v15, v14, La/mum0;->y:La/v5l0;

    .line 140
    .line 141
    iget-object v14, v14, La/mum0;->l:La/rhb0;

    .line 142
    .line 143
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 151
    .line 152
    invoke-virtual {v11, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-nez v4, :cond_4

    .line 157
    .line 158
    sget-object v4, La/rhb0;->b:La/rhb0;

    .line 159
    .line 160
    if-eq v14, v4, :cond_4

    .line 161
    .line 162
    new-instance v4, La/aiw;

    .line 163
    .line 164
    invoke-direct {v4, v13}, La/aiw;-><init>(La/lq5;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    :cond_4
    if-eqz v1, :cond_5

    .line 171
    .line 172
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 173
    .line 174
    invoke-virtual {v11, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_5

    .line 179
    .line 180
    new-instance v4, La/nuj;

    .line 181
    .line 182
    new-instance v13, La/ijm;

    .line 183
    .line 184
    invoke-direct {v13}, La/ijm;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v14, "shimmer_header_6"

    .line 188
    .line 189
    invoke-direct {v4, v14, v13}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    new-instance v4, La/ojw;

    .line 196
    .line 197
    const-string v13, "shimmer_top_event"

    .line 198
    .line 199
    sget-object v14, La/pjw;->b:La/pjw;

    .line 200
    .line 201
    invoke-direct {v4, v13, v14}, La/ojw;-><init>(Ljava/lang/String;La/pjw;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    :cond_5
    new-instance v4, La/nuj;

    .line 208
    .line 209
    new-instance v13, La/ijm;

    .line 210
    .line 211
    invoke-direct {v13}, La/ijm;-><init>()V

    .line 212
    .line 213
    .line 214
    const-string v14, "shimmer_header_1"

    .line 215
    .line 216
    invoke-direct {v4, v14, v13}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    new-instance v4, La/diw;

    .line 223
    .line 224
    const-string v13, "shimmer_category_card_collection"

    .line 225
    .line 226
    sget-object v14, La/avl;->a:La/avl;

    .line 227
    .line 228
    invoke-direct {v4, v13, v14}, La/diw;-><init>(Ljava/lang/String;La/bvl;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    new-instance v4, La/nuj;

    .line 235
    .line 236
    new-instance v13, La/ijm;

    .line 237
    .line 238
    invoke-direct {v13}, La/ijm;-><init>()V

    .line 239
    .line 240
    .line 241
    const-string v14, "shimmer_header_2"

    .line 242
    .line 243
    invoke-direct {v4, v14, v13}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    new-instance v4, La/ojw;

    .line 250
    .line 251
    sget-object v13, La/pjw;->a:La/pjw;

    .line 252
    .line 253
    const-string v14, "shimmer_sub_header_1"

    .line 254
    .line 255
    invoke-direct {v4, v14, v13}, La/ojw;-><init>(Ljava/lang/String;La/pjw;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    const-string v4, "shimmer_games_1"

    .line 262
    .line 263
    invoke-static {v15, v4}, La/axj;->a(La/v5l0;Ljava/lang/String;)La/kuj;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    new-instance v4, La/ojw;

    .line 271
    .line 272
    const-string v14, "shimmer_sub_header_2"

    .line 273
    .line 274
    invoke-direct {v4, v14, v13}, La/ojw;-><init>(Ljava/lang/String;La/pjw;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    const-string v4, "shimmer_games_2"

    .line 281
    .line 282
    invoke-static {v15, v4}, La/axj;->a(La/v5l0;Ljava/lang/String;)La/kuj;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    new-instance v4, La/ojw;

    .line 290
    .line 291
    const-string v14, "shimmer_sub_header_3"

    .line 292
    .line 293
    invoke-direct {v4, v14, v13}, La/ojw;-><init>(Ljava/lang/String;La/pjw;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    const-string v4, "shimmer_games_3"

    .line 300
    .line 301
    invoke-static {v15, v4}, La/axj;->a(La/v5l0;Ljava/lang/String;)La/kuj;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    new-instance v4, La/nuj;

    .line 309
    .line 310
    new-instance v14, La/ijm;

    .line 311
    .line 312
    invoke-direct {v14}, La/ijm;-><init>()V

    .line 313
    .line 314
    .line 315
    const-string v5, "shimmer_header_3"

    .line 316
    .line 317
    invoke-direct {v4, v5, v14}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    new-instance v4, La/ojw;

    .line 324
    .line 325
    const-string v5, "shimmer_sub_header_4"

    .line 326
    .line 327
    invoke-direct {v4, v5, v13}, La/ojw;-><init>(Ljava/lang/String;La/pjw;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    const-string v4, "shimmer_games_4"

    .line 334
    .line 335
    invoke-static {v15, v4}, La/axj;->a(La/v5l0;Ljava/lang/String;)La/kuj;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    new-instance v4, La/ojw;

    .line 343
    .line 344
    const-string v5, "shimmer_sub_header_5"

    .line 345
    .line 346
    invoke-direct {v4, v5, v13}, La/ojw;-><init>(Ljava/lang/String;La/pjw;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    const-string v4, "shimmer_games_5"

    .line 353
    .line 354
    invoke-static {v15, v4}, La/axj;->a(La/v5l0;Ljava/lang/String;)La/kuj;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    new-instance v4, La/ojw;

    .line 362
    .line 363
    const-string v5, "shimmer_sub_header_6"

    .line 364
    .line 365
    invoke-direct {v4, v5, v13}, La/ojw;-><init>(Ljava/lang/String;La/pjw;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    const-string v4, "shimmer_games_6"

    .line 372
    .line 373
    invoke-static {v15, v4}, La/axj;->a(La/v5l0;Ljava/lang/String;)La/kuj;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    if-eqz v3, :cond_6

    .line 381
    .line 382
    new-instance v4, La/nuj;

    .line 383
    .line 384
    new-instance v5, La/ijm;

    .line 385
    .line 386
    invoke-direct {v5}, La/ijm;-><init>()V

    .line 387
    .line 388
    .line 389
    const-string v13, "shimmer_header_4"

    .line 390
    .line 391
    invoke-direct {v4, v13, v5}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    new-instance v4, La/ztj;

    .line 398
    .line 399
    new-instance v5, La/z2m;

    .line 400
    .line 401
    const v13, 0x3f666666    # 0.9f

    .line 402
    .line 403
    .line 404
    invoke-direct {v5, v13}, La/z2m;-><init>(F)V

    .line 405
    .line 406
    .line 407
    new-instance v14, La/z2m;

    .line 408
    .line 409
    invoke-direct {v14, v13}, La/z2m;-><init>(F)V

    .line 410
    .line 411
    .line 412
    new-instance v15, La/z2m;

    .line 413
    .line 414
    invoke-direct {v15, v13}, La/z2m;-><init>(F)V

    .line 415
    .line 416
    .line 417
    filled-new-array {v5, v14, v15}, [La/z2m;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    invoke-static {v5}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    const-string v14, "shimmer_banner_champs_1"

    .line 426
    .line 427
    invoke-direct {v4, v5, v14}, La/ztj;-><init>(La/i4;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    new-instance v4, La/nuj;

    .line 434
    .line 435
    new-instance v5, La/ijm;

    .line 436
    .line 437
    invoke-direct {v5}, La/ijm;-><init>()V

    .line 438
    .line 439
    .line 440
    const-string v14, "shimmer_header_5"

    .line 441
    .line 442
    invoke-direct {v4, v14, v5}, La/nuj;-><init>(Ljava/lang/String;La/jjm;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    new-instance v4, La/ztj;

    .line 449
    .line 450
    new-instance v5, La/z2m;

    .line 451
    .line 452
    invoke-direct {v5, v13}, La/z2m;-><init>(F)V

    .line 453
    .line 454
    .line 455
    new-instance v14, La/z2m;

    .line 456
    .line 457
    invoke-direct {v14, v13}, La/z2m;-><init>(F)V

    .line 458
    .line 459
    .line 460
    new-instance v15, La/z2m;

    .line 461
    .line 462
    invoke-direct {v15, v13}, La/z2m;-><init>(F)V

    .line 463
    .line 464
    .line 465
    filled-new-array {v5, v14, v15}, [La/z2m;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    invoke-static {v5}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    const-string v13, "shimmer_banner_champs_2"

    .line 474
    .line 475
    invoke-direct {v4, v5, v13}, La/ztj;-><init>(La/i4;Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v7, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    :cond_6
    invoke-static {v7}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 486
    .line 487
    .line 488
    move-result-object v4

    .line 489
    sget-object v5, La/wiw;->a:La/wiw;

    .line 490
    .line 491
    invoke-direct {v12, v5, v4, v6}, La/hjw;-><init>(La/yiw;La/a4x;Z)V

    .line 492
    .line 493
    .line 494
    invoke-static {v12}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    invoke-virtual {v10, v11, v4}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    const/4 v4, 0x5

    .line 502
    const/4 v5, 0x4

    .line 503
    goto/16 :goto_2

    .line 504
    .line 505
    :cond_7
    invoke-virtual {v10}, La/jo20;->b()La/jo20;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-static {v1}, La/dyb;->p0(Ljava/util/Map;)La/th90;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    iput-object v1, v0, La/wyj;->e:La/th90;

    .line 514
    .line 515
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 516
    .line 517
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 518
    .line 519
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    iput-object v1, v0, La/wyj;->f:La/n0o0;

    .line 524
    .line 525
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 526
    .line 527
    iget-object v2, v1, La/zjw;->j:Ljava/util/Map;

    .line 528
    .line 529
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 530
    .line 531
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 532
    .line 533
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 538
    .line 539
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    iput-object v1, v0, La/wyj;->g:La/n0o0;

    .line 552
    .line 553
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 554
    .line 555
    iget-boolean v1, v1, La/zjw;->k:Z

    .line 556
    .line 557
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    iput-object v1, v0, La/wyj;->h:La/n0o0;

    .line 566
    .line 567
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 568
    .line 569
    iget-object v1, v1, La/zjw;->d:Ljava/util/List;

    .line 570
    .line 571
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    iput-object v1, v0, La/wyj;->i:La/n0o0;

    .line 576
    .line 577
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    new-instance v2, La/vyj;

    .line 582
    .line 583
    invoke-direct {v2, v0, v6}, La/vyj;-><init>(La/wyj;B)V

    .line 584
    .line 585
    .line 586
    new-instance v3, La/yw9;

    .line 587
    .line 588
    const/16 v4, 0x14

    .line 589
    .line 590
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 591
    .line 592
    .line 593
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    iput-object v1, v0, La/wyj;->j:La/n0o0;

    .line 598
    .line 599
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 600
    .line 601
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 602
    .line 603
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 604
    .line 605
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 606
    .line 607
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    check-cast v1, La/jih;

    .line 612
    .line 613
    const/4 v2, 0x0

    .line 614
    if-eqz v1, :cond_9

    .line 615
    .line 616
    iget-object v1, v1, La/jih;->a:Ljava/lang/Object;

    .line 617
    .line 618
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 619
    .line 620
    instance-of v3, v1, La/g0g0;

    .line 621
    .line 622
    if-eqz v3, :cond_8

    .line 623
    .line 624
    move-object v1, v2

    .line 625
    :cond_8
    check-cast v1, Ljava/util/List;

    .line 626
    .line 627
    if-nez v1, :cond_a

    .line 628
    .line 629
    :cond_9
    sget-object v1, La/iun;->a:La/iun;

    .line 630
    .line 631
    :cond_a
    new-instance v3, La/vyj;

    .line 632
    .line 633
    const/4 v5, 0x2

    .line 634
    invoke-direct {v3, v0, v5}, La/vyj;-><init>(La/wyj;B)V

    .line 635
    .line 636
    .line 637
    new-instance v5, La/yw9;

    .line 638
    .line 639
    invoke-direct {v5, v1, v3, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 640
    .line 641
    .line 642
    invoke-static {v5}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    iput-object v1, v0, La/wyj;->k:La/n0o0;

    .line 647
    .line 648
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 649
    .line 650
    iget-object v3, v1, La/zjw;->h:Ljava/util/Map;

    .line 651
    .line 652
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 653
    .line 654
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 655
    .line 656
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    check-cast v1, La/jih;

    .line 661
    .line 662
    if-eqz v1, :cond_c

    .line 663
    .line 664
    iget-object v1, v1, La/jih;->c:Ljava/lang/Object;

    .line 665
    .line 666
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 667
    .line 668
    instance-of v3, v1, La/g0g0;

    .line 669
    .line 670
    if-eqz v3, :cond_b

    .line 671
    .line 672
    move-object v1, v2

    .line 673
    :cond_b
    check-cast v1, Ljava/util/List;

    .line 674
    .line 675
    if-nez v1, :cond_d

    .line 676
    .line 677
    :cond_c
    sget-object v1, La/iun;->a:La/iun;

    .line 678
    .line 679
    :cond_d
    new-instance v3, La/vyj;

    .line 680
    .line 681
    const/4 v5, 0x3

    .line 682
    invoke-direct {v3, v0, v5}, La/vyj;-><init>(La/wyj;B)V

    .line 683
    .line 684
    .line 685
    new-instance v5, La/yw9;

    .line 686
    .line 687
    invoke-direct {v5, v1, v3, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 688
    .line 689
    .line 690
    invoke-static {v5}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    iput-object v1, v0, La/wyj;->l:La/n0o0;

    .line 695
    .line 696
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 697
    .line 698
    iget-object v3, v1, La/zjw;->h:Ljava/util/Map;

    .line 699
    .line 700
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 701
    .line 702
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 703
    .line 704
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    check-cast v1, La/jih;

    .line 709
    .line 710
    if-eqz v1, :cond_f

    .line 711
    .line 712
    iget-object v1, v1, La/jih;->d:Ljava/lang/Object;

    .line 713
    .line 714
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 715
    .line 716
    instance-of v3, v1, La/g0g0;

    .line 717
    .line 718
    if-eqz v3, :cond_e

    .line 719
    .line 720
    move-object v1, v2

    .line 721
    :cond_e
    check-cast v1, Ljava/util/List;

    .line 722
    .line 723
    if-nez v1, :cond_10

    .line 724
    .line 725
    :cond_f
    sget-object v1, La/iun;->a:La/iun;

    .line 726
    .line 727
    :cond_10
    new-instance v3, La/vyj;

    .line 728
    .line 729
    const/4 v5, 0x4

    .line 730
    invoke-direct {v3, v0, v5}, La/vyj;-><init>(La/wyj;B)V

    .line 731
    .line 732
    .line 733
    new-instance v5, La/yw9;

    .line 734
    .line 735
    invoke-direct {v5, v1, v3, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 736
    .line 737
    .line 738
    invoke-static {v5}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    iput-object v1, v0, La/wyj;->m:La/n0o0;

    .line 743
    .line 744
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 745
    .line 746
    iget-object v3, v1, La/zjw;->h:Ljava/util/Map;

    .line 747
    .line 748
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 749
    .line 750
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 751
    .line 752
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    check-cast v1, La/jih;

    .line 757
    .line 758
    if-eqz v1, :cond_12

    .line 759
    .line 760
    iget-object v1, v1, La/jih;->b:Ljava/lang/Object;

    .line 761
    .line 762
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 763
    .line 764
    instance-of v3, v1, La/g0g0;

    .line 765
    .line 766
    if-eqz v3, :cond_11

    .line 767
    .line 768
    move-object v1, v2

    .line 769
    :cond_11
    check-cast v1, Ljava/util/List;

    .line 770
    .line 771
    if-nez v1, :cond_13

    .line 772
    .line 773
    :cond_12
    sget-object v1, La/iun;->a:La/iun;

    .line 774
    .line 775
    :cond_13
    new-instance v3, La/vyj;

    .line 776
    .line 777
    const/4 v5, 0x5

    .line 778
    invoke-direct {v3, v0, v5}, La/vyj;-><init>(La/wyj;B)V

    .line 779
    .line 780
    .line 781
    new-instance v5, La/yw9;

    .line 782
    .line 783
    invoke-direct {v5, v1, v3, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 784
    .line 785
    .line 786
    invoke-static {v5}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 787
    .line 788
    .line 789
    move-result-object v1

    .line 790
    iput-object v1, v0, La/wyj;->n:La/n0o0;

    .line 791
    .line 792
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 793
    .line 794
    iget-object v3, v1, La/zjw;->h:Ljava/util/Map;

    .line 795
    .line 796
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 797
    .line 798
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 799
    .line 800
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    check-cast v1, La/jih;

    .line 805
    .line 806
    if-eqz v1, :cond_15

    .line 807
    .line 808
    iget-object v1, v1, La/jih;->e:Ljava/lang/Object;

    .line 809
    .line 810
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 811
    .line 812
    instance-of v3, v1, La/g0g0;

    .line 813
    .line 814
    if-eqz v3, :cond_14

    .line 815
    .line 816
    move-object v1, v2

    .line 817
    :cond_14
    check-cast v1, Ljava/util/List;

    .line 818
    .line 819
    if-nez v1, :cond_16

    .line 820
    .line 821
    :cond_15
    sget-object v1, La/iun;->a:La/iun;

    .line 822
    .line 823
    :cond_16
    new-instance v3, La/vyj;

    .line 824
    .line 825
    const/4 v5, 0x6

    .line 826
    invoke-direct {v3, v0, v5}, La/vyj;-><init>(La/wyj;B)V

    .line 827
    .line 828
    .line 829
    new-instance v5, La/yw9;

    .line 830
    .line 831
    invoke-direct {v5, v1, v3, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 832
    .line 833
    .line 834
    invoke-static {v5}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    iput-object v1, v0, La/wyj;->o:La/n0o0;

    .line 839
    .line 840
    new-instance v1, La/fiw;

    .line 841
    .line 842
    sget-object v3, La/iun;->a:La/iun;

    .line 843
    .line 844
    invoke-direct {v1, v3, v3}, La/fiw;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 845
    .line 846
    .line 847
    new-instance v5, La/vyj;

    .line 848
    .line 849
    const/4 v7, 0x7

    .line 850
    invoke-direct {v5, v0, v7}, La/vyj;-><init>(La/wyj;B)V

    .line 851
    .line 852
    .line 853
    new-instance v7, La/yw9;

    .line 854
    .line 855
    invoke-direct {v7, v1, v5, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 856
    .line 857
    .line 858
    invoke-static {v7}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    iput-object v1, v0, La/wyj;->p:La/n0o0;

    .line 863
    .line 864
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 865
    .line 866
    iget-object v5, v1, La/zjw;->h:Ljava/util/Map;

    .line 867
    .line 868
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 869
    .line 870
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 871
    .line 872
    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    check-cast v1, La/jih;

    .line 877
    .line 878
    if-eqz v1, :cond_19

    .line 879
    .line 880
    iget-object v1, v1, La/jih;->i:Ljava/lang/Object;

    .line 881
    .line 882
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 883
    .line 884
    instance-of v5, v1, La/g0g0;

    .line 885
    .line 886
    if-eqz v5, :cond_17

    .line 887
    .line 888
    goto :goto_3

    .line 889
    :cond_17
    move-object v2, v1

    .line 890
    :goto_3
    check-cast v2, Ljava/util/List;

    .line 891
    .line 892
    if-nez v2, :cond_18

    .line 893
    .line 894
    goto :goto_4

    .line 895
    :cond_18
    move-object v3, v2

    .line 896
    :cond_19
    :goto_4
    new-instance v1, La/vyj;

    .line 897
    .line 898
    const/16 v2, 0x8

    .line 899
    .line 900
    invoke-direct {v1, v0, v2}, La/vyj;-><init>(La/wyj;B)V

    .line 901
    .line 902
    .line 903
    new-instance v2, La/yw9;

    .line 904
    .line 905
    invoke-direct {v2, v3, v1, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 906
    .line 907
    .line 908
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 909
    .line 910
    .line 911
    move-result-object v1

    .line 912
    iput-object v1, v0, La/wyj;->q:La/n0o0;

    .line 913
    .line 914
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 915
    .line 916
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 917
    .line 918
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 919
    .line 920
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 921
    .line 922
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    check-cast v1, La/jih;

    .line 927
    .line 928
    if-eqz v1, :cond_1a

    .line 929
    .line 930
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    check-cast v2, La/ekw;

    .line 939
    .line 940
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 941
    .line 942
    const/4 v3, 0x0

    .line 943
    invoke-static {v1, v2, v3}, La/kih;->a(La/jih;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)Z

    .line 944
    .line 945
    .line 946
    move-result v1

    .line 947
    if-ne v1, v6, :cond_1a

    .line 948
    .line 949
    move v3, v6

    .line 950
    goto :goto_5

    .line 951
    :cond_1a
    const/4 v3, 0x0

    .line 952
    :goto_5
    xor-int/lit8 v1, v3, 0x1

    .line 953
    .line 954
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    new-instance v2, La/vyj;

    .line 959
    .line 960
    const/16 v3, 0x9

    .line 961
    .line 962
    invoke-direct {v2, v0, v3}, La/vyj;-><init>(La/wyj;B)V

    .line 963
    .line 964
    .line 965
    new-instance v3, La/yw9;

    .line 966
    .line 967
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 968
    .line 969
    .line 970
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    iput-object v1, v0, La/wyj;->r:La/n0o0;

    .line 975
    .line 976
    iget-object v1, v0, La/wyj;->d:La/zjw;

    .line 977
    .line 978
    iget-object v1, v1, La/zjw;->c:Ljava/util/List;

    .line 979
    .line 980
    new-instance v2, La/vyj;

    .line 981
    .line 982
    const/4 v3, 0x0

    .line 983
    invoke-direct {v2, v0, v3}, La/vyj;-><init>(La/wyj;B)V

    .line 984
    .line 985
    .line 986
    new-instance v3, La/yw9;

    .line 987
    .line 988
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 989
    .line 990
    .line 991
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    iput-object v1, v0, La/wyj;->s:La/n0o0;

    .line 996
    .line 997
    return-void
.end method

.method public static a(La/sff0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/sff0;->c:La/ech;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/ech;->k:La/vbb0;

    .line 6
    .line 7
    iget-object p0, p0, La/vbb0;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 11
    .line 12
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, La/ech;->l:La/cbe0;

    .line 19
    .line 20
    iget-object p0, p0, La/cbe0;->a:Ljava/lang/String;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object p2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object p0, p0, La/ech;->m:La/nnu0;

    .line 32
    .line 33
    iget-object p0, p0, La/nnu0;->a:Ljava/lang/String;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    const-string p0, ""

    .line 37
    .line 38
    return-object p0
.end method


# virtual methods
.method public final b()La/fee;
    .locals 0

    .line 1
    iget-object p0, p0, La/wyj;->f:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fee;

    .line 8
    .line 9
    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, La/zjw;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/wyj;->g:La/n0o0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/fee;

    .line 13
    .line 14
    iget-object v1, p1, La/zjw;->j:Ljava/util/Map;

    .line 15
    .line 16
    iget-object v2, p1, La/zjw;->g:La/ekw;

    .line 17
    .line 18
    iget-object v3, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 19
    .line 20
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La/wyj;->h:La/n0o0;

    .line 38
    .line 39
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/fee;

    .line 44
    .line 45
    iget-boolean v1, p1, La/zjw;->k:Z

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, La/wyj;->b()La/fee;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, La/wyj;->i:La/n0o0;

    .line 62
    .line 63
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, La/fee;

    .line 68
    .line 69
    iget-object v1, p1, La/zjw;->d:Ljava/util/List;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, La/kkw;

    .line 75
    .line 76
    iget-object v1, p0, La/wyj;->d:La/zjw;

    .line 77
    .line 78
    iget-object v4, v1, La/zjw;->b:La/sff0;

    .line 79
    .line 80
    iget-object v4, v4, La/sff0;->c:La/ech;

    .line 81
    .line 82
    iget-object v4, v4, La/ech;->o:La/g5h;

    .line 83
    .line 84
    iget-boolean v1, v1, La/zjw;->f:Z

    .line 85
    .line 86
    iget-object v5, p0, La/wyj;->j:La/n0o0;

    .line 87
    .line 88
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, La/fee;

    .line 93
    .line 94
    iget-object v5, v5, La/fee;->e:La/zbk;

    .line 95
    .line 96
    iget-object v6, p1, La/zjw;->h:Ljava/util/Map;

    .line 97
    .line 98
    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    move-object v9, v6

    .line 103
    check-cast v9, La/jih;

    .line 104
    .line 105
    iget-object v6, p0, La/wyj;->e:La/th90;

    .line 106
    .line 107
    if-nez v9, :cond_0

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    invoke-static {v6, v3}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, La/pz40;

    .line 115
    .line 116
    iget-object v8, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 117
    .line 118
    iget-boolean v10, p1, La/zjw;->i:Z

    .line 119
    .line 120
    new-instance v12, La/kk0;

    .line 121
    .line 122
    const/16 v2, 0x1c

    .line 123
    .line 124
    invoke-direct {v12, p0, v9, p1, v2}, La/kk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    iget-object v7, p0, La/wyj;->c:La/g2v;

    .line 128
    .line 129
    const/4 v11, 0x0

    .line 130
    invoke-static/range {v7 .. v12}, La/u1c;->w(La/g2v;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jih;ZZLkotlin/jvm/functions/Function0;)La/hjw;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-interface {v3, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :goto_0
    invoke-direct {v0, v4, v1, v5, v6}, La/kkw;-><init>(La/g5h;ZLa/l7m0;La/th90;)V

    .line 138
    .line 139
    .line 140
    return-object v0
.end method
