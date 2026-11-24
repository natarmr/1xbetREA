.class public final La/mco;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:La/ctf0;

.field public final c:La/y78;

.field public final d:La/g2v;

.field public final e:La/zjw;

.field public final f:La/th90;

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
.method public constructor <init>(Lorg/xplatform/cyber/section/api/home/CyberHomeParams;La/ctf0;La/y78;La/g2v;La/zjw;B)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    move/from16 v5, p6

    .line 12
    .line 13
    iput-byte v5, v0, La/mco;->a:B

    .line 14
    .line 15
    sget-object v9, La/wiw;->a:La/wiw;

    .line 16
    .line 17
    const/4 v11, 0x3

    .line 18
    const/4 v13, 0x2

    .line 19
    const/4 v14, 0x1

    .line 20
    const/16 p1, 0x0

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    packed-switch v5, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, La/mco;->b:La/ctf0;

    .line 32
    .line 33
    iput-object v2, v0, La/mco;->c:La/y78;

    .line 34
    .line 35
    iput-object v3, v0, La/mco;->d:La/g2v;

    .line 36
    .line 37
    iput-object v4, v0, La/mco;->e:La/zjw;

    .line 38
    .line 39
    iget-object v1, v4, La/zjw;->a:Ljava/util/List;

    .line 40
    .line 41
    iget-boolean v2, v4, La/zjw;->f:Z

    .line 42
    .line 43
    new-instance v3, La/jo20;

    .line 44
    .line 45
    invoke-direct {v3}, La/jo20;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_7

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, La/ekw;

    .line 63
    .line 64
    iget-object v4, v4, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 65
    .line 66
    new-instance v5, La/hjw;

    .line 67
    .line 68
    iget-object v6, v0, La/mco;->e:La/zjw;

    .line 69
    .line 70
    iget-object v7, v6, La/zjw;->b:La/sff0;

    .line 71
    .line 72
    iget-object v7, v7, La/sff0;->g:La/mum0;

    .line 73
    .line 74
    iget-object v7, v7, La/mum0;->y:La/v5l0;

    .line 75
    .line 76
    iget-boolean v6, v6, La/zjw;->r:Z

    .line 77
    .line 78
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    new-instance v12, La/uqv;

    .line 83
    .line 84
    if-nez v2, :cond_0

    .line 85
    .line 86
    sget-object v16, La/rqv;->a:La/rqv;

    .line 87
    .line 88
    :goto_1
    move-object/from16 v15, v16

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_0
    sget-object v16, La/sqv;->a:La/sqv;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :goto_2
    new-instance v10, La/bev0;

    .line 95
    .line 96
    if-eqz v6, :cond_1

    .line 97
    .line 98
    sget-object v6, La/zdv0;->b:La/zdv0;

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_1
    sget-object v6, La/zdv0;->a:La/zdv0;

    .line 102
    .line 103
    :goto_3
    invoke-direct {v10, v6}, La/bev0;-><init>(La/zdv0;)V

    .line 104
    .line 105
    .line 106
    const-string v6, "HeaderContainerUiModel_Shimmer"

    .line 107
    .line 108
    invoke-direct {v12, v6, v15, v10}, La/uqv;-><init>(Ljava/lang/String;La/tqv;La/cev0;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    new-instance v6, La/wbo;

    .line 115
    .line 116
    const-string v10, "EventFocusDisciplineListUiModel_Shimmer"

    .line 117
    .line 118
    sget-object v12, La/j8m;->a:La/j8m;

    .line 119
    .line 120
    sget-object v15, La/l3g;->a:La/l3g;

    .line 121
    .line 122
    invoke-direct {v6, v10, v12, v15}, La/wbo;-><init>(Ljava/lang/String;La/k8m;La/m3g;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    sget-object v6, La/q0s;->a:La/q0s;

    .line 129
    .line 130
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-eqz v7, :cond_6

    .line 135
    .line 136
    if-eq v7, v14, :cond_5

    .line 137
    .line 138
    if-eq v7, v13, :cond_4

    .line 139
    .line 140
    if-eq v7, v11, :cond_3

    .line 141
    .line 142
    const/4 v10, 0x4

    .line 143
    if-ne v7, v10, :cond_2

    .line 144
    .line 145
    sget-object v7, La/h0l0;->a:La/h0l0;

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_3
    sget-object v7, La/i0l0;->a:La/i0l0;

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_4
    sget-object v7, La/j0l0;->a:La/j0l0;

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_5
    sget-object v7, La/k0l0;->a:La/k0l0;

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    sget-object v7, La/g0l0;->a:La/g0l0;

    .line 162
    .line 163
    :goto_4
    new-instance v10, La/vb90;

    .line 164
    .line 165
    new-instance v12, La/x56;

    .line 166
    .line 167
    invoke-direct {v12, v7}, La/x56;-><init>(La/l0l0;)V

    .line 168
    .line 169
    .line 170
    new-instance v11, La/x56;

    .line 171
    .line 172
    invoke-direct {v11, v7}, La/x56;-><init>(La/l0l0;)V

    .line 173
    .line 174
    .line 175
    new-instance v13, La/x56;

    .line 176
    .line 177
    invoke-direct {v13, v7}, La/x56;-><init>(La/l0l0;)V

    .line 178
    .line 179
    .line 180
    filled-new-array {v12, v11, v13}, [La/x56;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-static {v7}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    const/4 v11, 0x0

    .line 189
    invoke-direct {v10, v6, v7, v11, v14}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 190
    .line 191
    .line 192
    new-instance v17, La/hco;

    .line 193
    .line 194
    sget-object v19, La/sip;->c:La/sip;

    .line 195
    .line 196
    sget-object v20, La/w7m;->a:La/w7m;

    .line 197
    .line 198
    sget-object v21, La/gtk;->a:La/gtk;

    .line 199
    .line 200
    const-string v18, "EventFocusTopEventsUiModel_Shimmer"

    .line 201
    .line 202
    move-object/from16 v22, v10

    .line 203
    .line 204
    move-object/from16 v23, v15

    .line 205
    .line 206
    invoke-direct/range {v17 .. v23}, La/hco;-><init>(Ljava/lang/String;La/sip;La/b8m;La/htk;La/vb90;La/m3g;)V

    .line 207
    .line 208
    .line 209
    move-object/from16 v6, v17

    .line 210
    .line 211
    invoke-virtual {v8, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    invoke-static {v8}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-direct {v5, v9, v6, v14}, La/hjw;-><init>(La/yiw;La/a4x;Z)V

    .line 223
    .line 224
    .line 225
    invoke-static {v5}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-virtual {v3, v4, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    const/4 v11, 0x3

    .line 233
    const/4 v13, 0x2

    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_7
    invoke-virtual {v3}, La/jo20;->b()La/jo20;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-static {v1}, La/dyb;->p0(Ljava/util/Map;)La/th90;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    iput-object v1, v0, La/mco;->f:La/th90;

    .line 245
    .line 246
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 247
    .line 248
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 249
    .line 250
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    iput-object v1, v0, La/mco;->g:La/n0o0;

    .line 255
    .line 256
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 257
    .line 258
    iget-object v2, v1, La/zjw;->j:Ljava/util/Map;

    .line 259
    .line 260
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 261
    .line 262
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 263
    .line 264
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 269
    .line 270
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    iput-object v1, v0, La/mco;->h:La/n0o0;

    .line 283
    .line 284
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 285
    .line 286
    iget-boolean v1, v1, La/zjw;->k:Z

    .line 287
    .line 288
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    iput-object v1, v0, La/mco;->i:La/n0o0;

    .line 297
    .line 298
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    new-instance v2, La/lco;

    .line 303
    .line 304
    invoke-direct {v2, v0, v14}, La/lco;-><init>(La/mco;B)V

    .line 305
    .line 306
    .line 307
    new-instance v3, La/yw9;

    .line 308
    .line 309
    const/16 v4, 0x14

    .line 310
    .line 311
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 312
    .line 313
    .line 314
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    iput-object v1, v0, La/mco;->j:La/n0o0;

    .line 319
    .line 320
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 321
    .line 322
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 323
    .line 324
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 325
    .line 326
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 327
    .line 328
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    check-cast v1, La/jih;

    .line 333
    .line 334
    if-eqz v1, :cond_9

    .line 335
    .line 336
    iget-object v1, v1, La/jih;->c:Ljava/lang/Object;

    .line 337
    .line 338
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 339
    .line 340
    instance-of v2, v1, La/g0g0;

    .line 341
    .line 342
    if-eqz v2, :cond_8

    .line 343
    .line 344
    move-object/from16 v1, p1

    .line 345
    .line 346
    :cond_8
    check-cast v1, Ljava/util/List;

    .line 347
    .line 348
    if-nez v1, :cond_a

    .line 349
    .line 350
    :cond_9
    sget-object v1, La/iun;->a:La/iun;

    .line 351
    .line 352
    :cond_a
    iget-object v2, v0, La/mco;->e:La/zjw;

    .line 353
    .line 354
    iget-object v3, v2, La/zjw;->h:Ljava/util/Map;

    .line 355
    .line 356
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 357
    .line 358
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 359
    .line 360
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, La/jih;

    .line 365
    .line 366
    if-eqz v2, :cond_c

    .line 367
    .line 368
    iget-object v2, v2, La/jih;->d:Ljava/lang/Object;

    .line 369
    .line 370
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 371
    .line 372
    instance-of v3, v2, La/g0g0;

    .line 373
    .line 374
    if-eqz v3, :cond_b

    .line 375
    .line 376
    move-object/from16 v2, p1

    .line 377
    .line 378
    :cond_b
    check-cast v2, Ljava/util/List;

    .line 379
    .line 380
    if-eqz v2, :cond_c

    .line 381
    .line 382
    goto :goto_5

    .line 383
    :cond_c
    sget-object v2, La/iun;->a:La/iun;

    .line 384
    .line 385
    :goto_5
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    new-instance v2, La/lco;

    .line 390
    .line 391
    const/4 v3, 0x2

    .line 392
    invoke-direct {v2, v0, v3}, La/lco;-><init>(La/mco;B)V

    .line 393
    .line 394
    .line 395
    new-instance v3, La/yw9;

    .line 396
    .line 397
    const/16 v4, 0x14

    .line 398
    .line 399
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 400
    .line 401
    .line 402
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    iput-object v1, v0, La/mco;->k:La/n0o0;

    .line 407
    .line 408
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 409
    .line 410
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 411
    .line 412
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 413
    .line 414
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 415
    .line 416
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    check-cast v1, La/jih;

    .line 421
    .line 422
    if-eqz v1, :cond_e

    .line 423
    .line 424
    iget-object v1, v1, La/jih;->b:Ljava/lang/Object;

    .line 425
    .line 426
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 427
    .line 428
    instance-of v2, v1, La/g0g0;

    .line 429
    .line 430
    if-eqz v2, :cond_d

    .line 431
    .line 432
    move-object/from16 v1, p1

    .line 433
    .line 434
    :cond_d
    check-cast v1, Ljava/util/List;

    .line 435
    .line 436
    if-nez v1, :cond_f

    .line 437
    .line 438
    :cond_e
    sget-object v1, La/iun;->a:La/iun;

    .line 439
    .line 440
    :cond_f
    new-instance v2, La/lco;

    .line 441
    .line 442
    const/4 v3, 0x3

    .line 443
    invoke-direct {v2, v0, v3}, La/lco;-><init>(La/mco;B)V

    .line 444
    .line 445
    .line 446
    new-instance v3, La/yw9;

    .line 447
    .line 448
    const/16 v4, 0x14

    .line 449
    .line 450
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 451
    .line 452
    .line 453
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    iput-object v1, v0, La/mco;->l:La/n0o0;

    .line 458
    .line 459
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 460
    .line 461
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 462
    .line 463
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 464
    .line 465
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 466
    .line 467
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    check-cast v1, La/jih;

    .line 472
    .line 473
    if-eqz v1, :cond_10

    .line 474
    .line 475
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    check-cast v2, La/ekw;

    .line 484
    .line 485
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 486
    .line 487
    invoke-static {v1, v2, v14}, La/kih;->a(La/jih;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)Z

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    if-ne v1, v14, :cond_10

    .line 492
    .line 493
    move v1, v14

    .line 494
    goto :goto_6

    .line 495
    :cond_10
    const/4 v1, 0x0

    .line 496
    :goto_6
    xor-int/2addr v1, v14

    .line 497
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    new-instance v2, La/lco;

    .line 502
    .line 503
    const/4 v10, 0x4

    .line 504
    invoke-direct {v2, v0, v10}, La/lco;-><init>(La/mco;B)V

    .line 505
    .line 506
    .line 507
    new-instance v3, La/yw9;

    .line 508
    .line 509
    const/16 v4, 0x14

    .line 510
    .line 511
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 512
    .line 513
    .line 514
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    iput-object v1, v0, La/mco;->m:La/n0o0;

    .line 519
    .line 520
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 521
    .line 522
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 523
    .line 524
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 525
    .line 526
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 527
    .line 528
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    check-cast v1, La/jih;

    .line 533
    .line 534
    if-eqz v1, :cond_12

    .line 535
    .line 536
    iget-object v1, v1, La/jih;->e:Ljava/lang/Object;

    .line 537
    .line 538
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 539
    .line 540
    instance-of v2, v1, La/g0g0;

    .line 541
    .line 542
    if-eqz v2, :cond_11

    .line 543
    .line 544
    move-object/from16 v1, p1

    .line 545
    .line 546
    :cond_11
    check-cast v1, Ljava/util/List;

    .line 547
    .line 548
    if-nez v1, :cond_13

    .line 549
    .line 550
    :cond_12
    sget-object v1, La/iun;->a:La/iun;

    .line 551
    .line 552
    :cond_13
    new-instance v2, La/mmn;

    .line 553
    .line 554
    const/16 v3, 0x10

    .line 555
    .line 556
    invoke-direct {v2, v3}, La/mmn;-><init>(B)V

    .line 557
    .line 558
    .line 559
    new-instance v3, La/yw9;

    .line 560
    .line 561
    const/16 v4, 0x14

    .line 562
    .line 563
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 564
    .line 565
    .line 566
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    iput-object v1, v0, La/mco;->n:La/n0o0;

    .line 571
    .line 572
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 573
    .line 574
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 575
    .line 576
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 577
    .line 578
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 579
    .line 580
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    check-cast v1, La/jih;

    .line 585
    .line 586
    if-eqz v1, :cond_15

    .line 587
    .line 588
    iget-object v1, v1, La/jih;->i:Ljava/lang/Object;

    .line 589
    .line 590
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 591
    .line 592
    instance-of v2, v1, La/g0g0;

    .line 593
    .line 594
    if-eqz v2, :cond_14

    .line 595
    .line 596
    move-object/from16 v1, p1

    .line 597
    .line 598
    :cond_14
    check-cast v1, Ljava/util/List;

    .line 599
    .line 600
    if-nez v1, :cond_16

    .line 601
    .line 602
    :cond_15
    sget-object v1, La/iun;->a:La/iun;

    .line 603
    .line 604
    :cond_16
    invoke-static {v1}, La/cwr0;->S(Ljava/util/List;)La/n52;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    new-instance v2, La/lco;

    .line 609
    .line 610
    const/4 v3, 0x5

    .line 611
    invoke-direct {v2, v0, v3}, La/lco;-><init>(La/mco;B)V

    .line 612
    .line 613
    .line 614
    new-instance v3, La/yw9;

    .line 615
    .line 616
    const/16 v4, 0x14

    .line 617
    .line 618
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 619
    .line 620
    .line 621
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    iput-object v1, v0, La/mco;->o:La/n0o0;

    .line 626
    .line 627
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 628
    .line 629
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 630
    .line 631
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 632
    .line 633
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 634
    .line 635
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    check-cast v1, La/jih;

    .line 640
    .line 641
    invoke-static {v1}, La/phu0;->W(La/jih;)La/n52;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    new-instance v2, La/lco;

    .line 646
    .line 647
    const/4 v3, 0x6

    .line 648
    invoke-direct {v2, v0, v3}, La/lco;-><init>(La/mco;B)V

    .line 649
    .line 650
    .line 651
    new-instance v3, La/yw9;

    .line 652
    .line 653
    const/16 v4, 0x14

    .line 654
    .line 655
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 656
    .line 657
    .line 658
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    iput-object v1, v0, La/mco;->p:La/n0o0;

    .line 663
    .line 664
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 665
    .line 666
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 667
    .line 668
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 669
    .line 670
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 671
    .line 672
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    check-cast v1, La/jih;

    .line 677
    .line 678
    if-eqz v1, :cond_18

    .line 679
    .line 680
    iget-object v1, v1, La/jih;->h:Ljava/lang/Object;

    .line 681
    .line 682
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 683
    .line 684
    instance-of v2, v1, La/g0g0;

    .line 685
    .line 686
    if-eqz v2, :cond_17

    .line 687
    .line 688
    move-object/from16 v1, p1

    .line 689
    .line 690
    :cond_17
    check-cast v1, Ljava/util/List;

    .line 691
    .line 692
    if-nez v1, :cond_19

    .line 693
    .line 694
    :cond_18
    sget-object v1, La/iun;->a:La/iun;

    .line 695
    .line 696
    :cond_19
    new-instance v2, La/lco;

    .line 697
    .line 698
    const/4 v3, 0x7

    .line 699
    invoke-direct {v2, v0, v3}, La/lco;-><init>(La/mco;B)V

    .line 700
    .line 701
    .line 702
    new-instance v3, La/yw9;

    .line 703
    .line 704
    const/16 v4, 0x14

    .line 705
    .line 706
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 707
    .line 708
    .line 709
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    iput-object v1, v0, La/mco;->q:La/n0o0;

    .line 714
    .line 715
    new-instance v1, La/xbo;

    .line 716
    .line 717
    iget-object v2, v0, La/mco;->e:La/zjw;

    .line 718
    .line 719
    iget-object v3, v2, La/zjw;->h:Ljava/util/Map;

    .line 720
    .line 721
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 722
    .line 723
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 724
    .line 725
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    check-cast v2, La/jih;

    .line 730
    .line 731
    if-eqz v2, :cond_1b

    .line 732
    .line 733
    iget-object v2, v2, La/jih;->c:Ljava/lang/Object;

    .line 734
    .line 735
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 736
    .line 737
    instance-of v3, v2, La/g0g0;

    .line 738
    .line 739
    if-eqz v3, :cond_1a

    .line 740
    .line 741
    move-object/from16 v2, p1

    .line 742
    .line 743
    :cond_1a
    check-cast v2, Ljava/util/List;

    .line 744
    .line 745
    if-nez v2, :cond_1c

    .line 746
    .line 747
    :cond_1b
    sget-object v2, La/iun;->a:La/iun;

    .line 748
    .line 749
    :cond_1c
    iget-object v3, v0, La/mco;->e:La/zjw;

    .line 750
    .line 751
    iget-object v3, v3, La/zjw;->m:Ljava/util/Map;

    .line 752
    .line 753
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 754
    .line 755
    .line 756
    move-result-object v4

    .line 757
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    check-cast v4, La/ekw;

    .line 762
    .line 763
    iget-object v4, v4, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 764
    .line 765
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    check-cast v3, Ljava/lang/Long;

    .line 770
    .line 771
    const-wide/16 v4, 0x0

    .line 772
    .line 773
    if-eqz v3, :cond_1d

    .line 774
    .line 775
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 776
    .line 777
    .line 778
    move-result-wide v6

    .line 779
    goto :goto_7

    .line 780
    :cond_1d
    move-wide v6, v4

    .line 781
    :goto_7
    iget-object v3, v0, La/mco;->e:La/zjw;

    .line 782
    .line 783
    iget-object v3, v3, La/zjw;->o:Ljava/util/Map;

    .line 784
    .line 785
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 786
    .line 787
    .line 788
    move-result-object v8

    .line 789
    invoke-virtual {v8}, La/fee;->c()Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v8

    .line 793
    check-cast v8, La/ekw;

    .line 794
    .line 795
    iget-object v8, v8, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 796
    .line 797
    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    check-cast v3, Ljava/util/List;

    .line 802
    .line 803
    if-nez v3, :cond_1e

    .line 804
    .line 805
    sget-object v3, La/iun;->a:La/iun;

    .line 806
    .line 807
    :cond_1e
    invoke-direct {v1, v6, v7, v2, v3}, La/xbo;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 808
    .line 809
    .line 810
    new-instance v2, La/lco;

    .line 811
    .line 812
    const/16 v3, 0x8

    .line 813
    .line 814
    invoke-direct {v2, v0, v3}, La/lco;-><init>(La/mco;B)V

    .line 815
    .line 816
    .line 817
    new-instance v3, La/yw9;

    .line 818
    .line 819
    const/16 v6, 0x14

    .line 820
    .line 821
    invoke-direct {v3, v1, v2, v6}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 822
    .line 823
    .line 824
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 825
    .line 826
    .line 827
    move-result-object v1

    .line 828
    iput-object v1, v0, La/mco;->r:La/n0o0;

    .line 829
    .line 830
    new-instance v1, La/xbo;

    .line 831
    .line 832
    iget-object v2, v0, La/mco;->e:La/zjw;

    .line 833
    .line 834
    iget-object v3, v2, La/zjw;->h:Ljava/util/Map;

    .line 835
    .line 836
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 837
    .line 838
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 839
    .line 840
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    check-cast v2, La/jih;

    .line 845
    .line 846
    if-eqz v2, :cond_20

    .line 847
    .line 848
    iget-object v2, v2, La/jih;->d:Ljava/lang/Object;

    .line 849
    .line 850
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 851
    .line 852
    instance-of v3, v2, La/g0g0;

    .line 853
    .line 854
    if-eqz v3, :cond_1f

    .line 855
    .line 856
    move-object/from16 v12, p1

    .line 857
    .line 858
    goto :goto_8

    .line 859
    :cond_1f
    move-object v12, v2

    .line 860
    :goto_8
    check-cast v12, Ljava/util/List;

    .line 861
    .line 862
    if-nez v12, :cond_21

    .line 863
    .line 864
    :cond_20
    sget-object v12, La/iun;->a:La/iun;

    .line 865
    .line 866
    :cond_21
    iget-object v2, v0, La/mco;->e:La/zjw;

    .line 867
    .line 868
    iget-object v2, v2, La/zjw;->n:Ljava/util/Map;

    .line 869
    .line 870
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 871
    .line 872
    .line 873
    move-result-object v3

    .line 874
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v3

    .line 878
    check-cast v3, La/ekw;

    .line 879
    .line 880
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 881
    .line 882
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    check-cast v2, Ljava/lang/Long;

    .line 887
    .line 888
    if-eqz v2, :cond_22

    .line 889
    .line 890
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 891
    .line 892
    .line 893
    move-result-wide v4

    .line 894
    :cond_22
    iget-object v2, v0, La/mco;->e:La/zjw;

    .line 895
    .line 896
    iget-object v2, v2, La/zjw;->p:Ljava/util/Map;

    .line 897
    .line 898
    invoke-virtual {v0}, La/mco;->a()La/fee;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    check-cast v3, La/ekw;

    .line 907
    .line 908
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 909
    .line 910
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v2

    .line 914
    check-cast v2, Ljava/util/List;

    .line 915
    .line 916
    if-nez v2, :cond_23

    .line 917
    .line 918
    sget-object v2, La/iun;->a:La/iun;

    .line 919
    .line 920
    :cond_23
    invoke-direct {v1, v4, v5, v12, v2}, La/xbo;-><init>(JLjava/util/List;Ljava/util/List;)V

    .line 921
    .line 922
    .line 923
    new-instance v2, La/lco;

    .line 924
    .line 925
    const/4 v11, 0x0

    .line 926
    invoke-direct {v2, v0, v11}, La/lco;-><init>(La/mco;B)V

    .line 927
    .line 928
    .line 929
    new-instance v3, La/yw9;

    .line 930
    .line 931
    const/16 v4, 0x14

    .line 932
    .line 933
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 934
    .line 935
    .line 936
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    iput-object v1, v0, La/mco;->s:La/n0o0;

    .line 941
    .line 942
    return-void

    .line 943
    :pswitch_0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 944
    .line 945
    .line 946
    iput-object v1, v0, La/mco;->b:La/ctf0;

    .line 947
    .line 948
    iput-object v2, v0, La/mco;->c:La/y78;

    .line 949
    .line 950
    iput-object v3, v0, La/mco;->d:La/g2v;

    .line 951
    .line 952
    iput-object v4, v0, La/mco;->e:La/zjw;

    .line 953
    .line 954
    iget-object v1, v4, La/zjw;->a:Ljava/util/List;

    .line 955
    .line 956
    iget-object v2, v4, La/zjw;->b:La/sff0;

    .line 957
    .line 958
    iget-object v2, v2, La/sff0;->g:La/mum0;

    .line 959
    .line 960
    iget-object v2, v2, La/mum0;->y:La/v5l0;

    .line 961
    .line 962
    new-instance v3, La/jo20;

    .line 963
    .line 964
    invoke-direct {v3}, La/jo20;-><init>()V

    .line 965
    .line 966
    .line 967
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 972
    .line 973
    .line 974
    move-result v4

    .line 975
    if-eqz v4, :cond_29

    .line 976
    .line 977
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v4

    .line 981
    check-cast v4, La/ekw;

    .line 982
    .line 983
    iget-object v4, v4, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 984
    .line 985
    new-instance v5, La/hjw;

    .line 986
    .line 987
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 988
    .line 989
    .line 990
    move-result-object v6

    .line 991
    new-instance v7, La/fok;

    .line 992
    .line 993
    const-string v8, "DisciplineBlockUiModel_Shimmer"

    .line 994
    .line 995
    invoke-direct {v7, v8}, La/fok;-><init>(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 999
    .line 1000
    .line 1001
    new-instance v7, La/if9;

    .line 1002
    .line 1003
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1007
    .line 1008
    .line 1009
    sget-object v7, La/q0s;->b:La/q0s;

    .line 1010
    .line 1011
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1012
    .line 1013
    .line 1014
    move-result v8

    .line 1015
    if-eqz v8, :cond_28

    .line 1016
    .line 1017
    if-eq v8, v14, :cond_27

    .line 1018
    .line 1019
    const/4 v10, 0x2

    .line 1020
    if-eq v8, v10, :cond_26

    .line 1021
    .line 1022
    const/4 v10, 0x3

    .line 1023
    if-eq v8, v10, :cond_25

    .line 1024
    .line 1025
    const/4 v10, 0x4

    .line 1026
    if-ne v8, v10, :cond_24

    .line 1027
    .line 1028
    sget-object v8, La/h0l0;->a:La/h0l0;

    .line 1029
    .line 1030
    goto :goto_a

    .line 1031
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1032
    .line 1033
    .line 1034
    throw p1

    .line 1035
    :cond_25
    sget-object v8, La/i0l0;->a:La/i0l0;

    .line 1036
    .line 1037
    goto :goto_a

    .line 1038
    :cond_26
    sget-object v8, La/j0l0;->a:La/j0l0;

    .line 1039
    .line 1040
    goto :goto_a

    .line 1041
    :cond_27
    sget-object v8, La/k0l0;->a:La/k0l0;

    .line 1042
    .line 1043
    goto :goto_a

    .line 1044
    :cond_28
    sget-object v8, La/g0l0;->a:La/g0l0;

    .line 1045
    .line 1046
    :goto_a
    new-instance v10, La/vb90;

    .line 1047
    .line 1048
    new-instance v11, La/x56;

    .line 1049
    .line 1050
    invoke-direct {v11, v8}, La/x56;-><init>(La/l0l0;)V

    .line 1051
    .line 1052
    .line 1053
    new-instance v12, La/x56;

    .line 1054
    .line 1055
    invoke-direct {v12, v8}, La/x56;-><init>(La/l0l0;)V

    .line 1056
    .line 1057
    .line 1058
    filled-new-array {v11, v12}, [La/x56;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v8

    .line 1062
    invoke-static {v8}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v8

    .line 1066
    const/4 v11, 0x0

    .line 1067
    invoke-direct {v10, v7, v8, v11, v14}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 1068
    .line 1069
    .line 1070
    new-instance v17, La/vqv;

    .line 1071
    .line 1072
    new-instance v7, La/zqv;

    .line 1073
    .line 1074
    sget-object v8, La/z7m;->a:La/z7m;

    .line 1075
    .line 1076
    invoke-direct {v7, v8}, La/zqv;-><init>(La/b8m;)V

    .line 1077
    .line 1078
    .line 1079
    const-wide/16 v21, -0x1

    .line 1080
    .line 1081
    const-string v18, "HeaderFocusDisciplineGame_Shimmer"

    .line 1082
    .line 1083
    move-object/from16 v19, v7

    .line 1084
    .line 1085
    move-object/from16 v20, v10

    .line 1086
    .line 1087
    invoke-direct/range {v17 .. v22}, La/vqv;-><init>(Ljava/lang/String;La/brv;La/vb90;J)V

    .line 1088
    .line 1089
    .line 1090
    move-object/from16 v7, v17

    .line 1091
    .line 1092
    new-instance v8, La/yqv;

    .line 1093
    .line 1094
    new-instance v10, La/esv;

    .line 1095
    .line 1096
    sget-object v11, La/w7m;->a:La/w7m;

    .line 1097
    .line 1098
    sget-object v12, La/lak0;->c:La/lak0;

    .line 1099
    .line 1100
    const-string v13, ""

    .line 1101
    .line 1102
    invoke-direct {v10, v13, v11, v12}, La/esv;-><init>(Ljava/lang/String;La/b8m;La/a4x;)V

    .line 1103
    .line 1104
    .line 1105
    filled-new-array {v7, v7, v7}, [La/vqv;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v7

    .line 1109
    invoke-static {v7}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v7

    .line 1113
    sget-object v11, La/sip;->c:La/sip;

    .line 1114
    .line 1115
    const-string v12, "HeaderFocusAllEventsUiModel_Shimmer"

    .line 1116
    .line 1117
    invoke-direct {v8, v12, v10, v7, v11}, La/yqv;-><init>(Ljava/lang/String;La/esv;La/a4x;La/sip;)V

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1121
    .line 1122
    .line 1123
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v6

    .line 1127
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v6

    .line 1131
    invoke-direct {v5, v9, v6, v14}, La/hjw;-><init>(La/yiw;La/a4x;Z)V

    .line 1132
    .line 1133
    .line 1134
    invoke-static {v5}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v5

    .line 1138
    invoke-virtual {v3, v4, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    goto/16 :goto_9

    .line 1142
    .line 1143
    :cond_29
    invoke-virtual {v3}, La/jo20;->b()La/jo20;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    invoke-static {v1}, La/dyb;->p0(Ljava/util/Map;)La/th90;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    iput-object v1, v0, La/mco;->f:La/th90;

    .line 1152
    .line 1153
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1154
    .line 1155
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 1156
    .line 1157
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v1

    .line 1161
    iput-object v1, v0, La/mco;->g:La/n0o0;

    .line 1162
    .line 1163
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1164
    .line 1165
    iget-object v1, v1, La/zjw;->l:Ljava/util/Map;

    .line 1166
    .line 1167
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    iput-object v1, v0, La/mco;->h:La/n0o0;

    .line 1172
    .line 1173
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1174
    .line 1175
    iget-boolean v1, v1, La/zjw;->k:Z

    .line 1176
    .line 1177
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v1

    .line 1181
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v1

    .line 1185
    iput-object v1, v0, La/mco;->i:La/n0o0;

    .line 1186
    .line 1187
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1188
    .line 1189
    iget-object v2, v1, La/zjw;->j:Ljava/util/Map;

    .line 1190
    .line 1191
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 1192
    .line 1193
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1194
    .line 1195
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v1

    .line 1199
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1200
    .line 1201
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v1

    .line 1205
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v1

    .line 1209
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    iput-object v1, v0, La/mco;->j:La/n0o0;

    .line 1214
    .line 1215
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1216
    .line 1217
    iget-object v3, v1, La/zjw;->q:Ljava/util/Map;

    .line 1218
    .line 1219
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 1220
    .line 1221
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1222
    .line 1223
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v1

    .line 1227
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v1

    .line 1231
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v1

    .line 1235
    invoke-static {v1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v1

    .line 1239
    iput-object v1, v0, La/mco;->k:La/n0o0;

    .line 1240
    .line 1241
    invoke-virtual {v0}, La/mco;->b()La/fee;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v1

    .line 1245
    new-instance v2, La/irv;

    .line 1246
    .line 1247
    const/4 v11, 0x0

    .line 1248
    invoke-direct {v2, v0, v11}, La/irv;-><init>(La/mco;B)V

    .line 1249
    .line 1250
    .line 1251
    new-instance v3, La/yw9;

    .line 1252
    .line 1253
    const/16 v4, 0x14

    .line 1254
    .line 1255
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1256
    .line 1257
    .line 1258
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v1

    .line 1262
    iput-object v1, v0, La/mco;->l:La/n0o0;

    .line 1263
    .line 1264
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1265
    .line 1266
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 1267
    .line 1268
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 1269
    .line 1270
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1271
    .line 1272
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v1

    .line 1276
    check-cast v1, La/jih;

    .line 1277
    .line 1278
    invoke-static {v1}, La/jwb;->X(La/jih;)La/xqv;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v1

    .line 1282
    new-instance v2, La/irv;

    .line 1283
    .line 1284
    invoke-direct {v2, v0, v14}, La/irv;-><init>(La/mco;B)V

    .line 1285
    .line 1286
    .line 1287
    new-instance v3, La/yw9;

    .line 1288
    .line 1289
    const/16 v4, 0x14

    .line 1290
    .line 1291
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1292
    .line 1293
    .line 1294
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    iput-object v1, v0, La/mco;->m:La/n0o0;

    .line 1299
    .line 1300
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1301
    .line 1302
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 1303
    .line 1304
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 1305
    .line 1306
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1307
    .line 1308
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v1

    .line 1312
    check-cast v1, La/jih;

    .line 1313
    .line 1314
    if-eqz v1, :cond_2a

    .line 1315
    .line 1316
    invoke-virtual {v0}, La/mco;->b()La/fee;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v2

    .line 1320
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    check-cast v2, La/ekw;

    .line 1325
    .line 1326
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1327
    .line 1328
    invoke-static {v1, v2, v14}, La/kih;->a(La/jih;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)Z

    .line 1329
    .line 1330
    .line 1331
    move-result v1

    .line 1332
    if-ne v1, v14, :cond_2a

    .line 1333
    .line 1334
    move v15, v14

    .line 1335
    goto :goto_b

    .line 1336
    :cond_2a
    move v15, v11

    .line 1337
    :goto_b
    xor-int/lit8 v1, v15, 0x1

    .line 1338
    .line 1339
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v1

    .line 1343
    new-instance v2, La/irv;

    .line 1344
    .line 1345
    const/4 v10, 0x2

    .line 1346
    invoke-direct {v2, v0, v10}, La/irv;-><init>(La/mco;B)V

    .line 1347
    .line 1348
    .line 1349
    new-instance v3, La/yw9;

    .line 1350
    .line 1351
    const/16 v4, 0x14

    .line 1352
    .line 1353
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1354
    .line 1355
    .line 1356
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v1

    .line 1360
    iput-object v1, v0, La/mco;->n:La/n0o0;

    .line 1361
    .line 1362
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1363
    .line 1364
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 1365
    .line 1366
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 1367
    .line 1368
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1369
    .line 1370
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v1

    .line 1374
    check-cast v1, La/jih;

    .line 1375
    .line 1376
    if-eqz v1, :cond_2c

    .line 1377
    .line 1378
    iget-object v1, v1, La/jih;->e:Ljava/lang/Object;

    .line 1379
    .line 1380
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 1381
    .line 1382
    instance-of v2, v1, La/g0g0;

    .line 1383
    .line 1384
    if-eqz v2, :cond_2b

    .line 1385
    .line 1386
    move-object/from16 v1, p1

    .line 1387
    .line 1388
    :cond_2b
    check-cast v1, Ljava/util/List;

    .line 1389
    .line 1390
    goto :goto_c

    .line 1391
    :cond_2c
    move-object/from16 v1, p1

    .line 1392
    .line 1393
    :goto_c
    if-nez v1, :cond_2d

    .line 1394
    .line 1395
    sget-object v1, La/iun;->a:La/iun;

    .line 1396
    .line 1397
    :cond_2d
    new-instance v2, La/irv;

    .line 1398
    .line 1399
    const/4 v10, 0x3

    .line 1400
    invoke-direct {v2, v0, v10}, La/irv;-><init>(La/mco;B)V

    .line 1401
    .line 1402
    .line 1403
    new-instance v3, La/yw9;

    .line 1404
    .line 1405
    const/16 v4, 0x14

    .line 1406
    .line 1407
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1408
    .line 1409
    .line 1410
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v1

    .line 1414
    iput-object v1, v0, La/mco;->o:La/n0o0;

    .line 1415
    .line 1416
    invoke-virtual {v0}, La/mco;->b()La/fee;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    new-instance v2, La/irv;

    .line 1421
    .line 1422
    const/4 v10, 0x4

    .line 1423
    invoke-direct {v2, v0, v10}, La/irv;-><init>(La/mco;B)V

    .line 1424
    .line 1425
    .line 1426
    new-instance v3, La/yw9;

    .line 1427
    .line 1428
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1429
    .line 1430
    .line 1431
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v1

    .line 1435
    iput-object v1, v0, La/mco;->p:La/n0o0;

    .line 1436
    .line 1437
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1438
    .line 1439
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 1440
    .line 1441
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 1442
    .line 1443
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1444
    .line 1445
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v1

    .line 1449
    check-cast v1, La/jih;

    .line 1450
    .line 1451
    if-eqz v1, :cond_2f

    .line 1452
    .line 1453
    iget-object v1, v1, La/jih;->b:Ljava/lang/Object;

    .line 1454
    .line 1455
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 1456
    .line 1457
    instance-of v2, v1, La/g0g0;

    .line 1458
    .line 1459
    if-eqz v2, :cond_2e

    .line 1460
    .line 1461
    move-object/from16 v1, p1

    .line 1462
    .line 1463
    :cond_2e
    check-cast v1, Ljava/util/List;

    .line 1464
    .line 1465
    goto :goto_d

    .line 1466
    :cond_2f
    move-object/from16 v1, p1

    .line 1467
    .line 1468
    :goto_d
    if-nez v1, :cond_30

    .line 1469
    .line 1470
    sget-object v1, La/iun;->a:La/iun;

    .line 1471
    .line 1472
    :cond_30
    new-instance v2, La/irv;

    .line 1473
    .line 1474
    const/4 v3, 0x5

    .line 1475
    invoke-direct {v2, v0, v3}, La/irv;-><init>(La/mco;B)V

    .line 1476
    .line 1477
    .line 1478
    new-instance v3, La/yw9;

    .line 1479
    .line 1480
    const/16 v4, 0x14

    .line 1481
    .line 1482
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1483
    .line 1484
    .line 1485
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v1

    .line 1489
    iput-object v1, v0, La/mco;->q:La/n0o0;

    .line 1490
    .line 1491
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1492
    .line 1493
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 1494
    .line 1495
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 1496
    .line 1497
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1498
    .line 1499
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v1

    .line 1503
    check-cast v1, La/jih;

    .line 1504
    .line 1505
    if-eqz v1, :cond_32

    .line 1506
    .line 1507
    iget-object v1, v1, La/jih;->i:Ljava/lang/Object;

    .line 1508
    .line 1509
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 1510
    .line 1511
    instance-of v2, v1, La/g0g0;

    .line 1512
    .line 1513
    if-eqz v2, :cond_31

    .line 1514
    .line 1515
    move-object/from16 v12, p1

    .line 1516
    .line 1517
    goto :goto_e

    .line 1518
    :cond_31
    move-object v12, v1

    .line 1519
    :goto_e
    check-cast v12, Ljava/util/List;

    .line 1520
    .line 1521
    if-nez v12, :cond_33

    .line 1522
    .line 1523
    :cond_32
    sget-object v12, La/iun;->a:La/iun;

    .line 1524
    .line 1525
    :cond_33
    invoke-static {v12}, La/cwr0;->S(Ljava/util/List;)La/n52;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v1

    .line 1529
    new-instance v2, La/irv;

    .line 1530
    .line 1531
    const/4 v3, 0x6

    .line 1532
    invoke-direct {v2, v0, v3}, La/irv;-><init>(La/mco;B)V

    .line 1533
    .line 1534
    .line 1535
    new-instance v3, La/yw9;

    .line 1536
    .line 1537
    const/16 v4, 0x14

    .line 1538
    .line 1539
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1540
    .line 1541
    .line 1542
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v1

    .line 1546
    iput-object v1, v0, La/mco;->r:La/n0o0;

    .line 1547
    .line 1548
    iget-object v1, v0, La/mco;->e:La/zjw;

    .line 1549
    .line 1550
    iget-object v2, v1, La/zjw;->h:Ljava/util/Map;

    .line 1551
    .line 1552
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 1553
    .line 1554
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1555
    .line 1556
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v1

    .line 1560
    check-cast v1, La/jih;

    .line 1561
    .line 1562
    invoke-static {v1}, La/phu0;->W(La/jih;)La/n52;

    .line 1563
    .line 1564
    .line 1565
    move-result-object v1

    .line 1566
    new-instance v2, La/irv;

    .line 1567
    .line 1568
    const/4 v3, 0x7

    .line 1569
    invoke-direct {v2, v0, v3}, La/irv;-><init>(La/mco;B)V

    .line 1570
    .line 1571
    .line 1572
    new-instance v3, La/yw9;

    .line 1573
    .line 1574
    const/16 v4, 0x14

    .line 1575
    .line 1576
    invoke-direct {v3, v1, v2, v4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1577
    .line 1578
    .line 1579
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v1

    .line 1583
    iput-object v1, v0, La/mco;->s:La/n0o0;

    .line 1584
    .line 1585
    return-void

    .line 1586
    nop

    .line 1587
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()La/fee;
    .locals 0

    .line 1
    iget-object p0, p0, La/mco;->g:La/n0o0;

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

.method public b()La/fee;
    .locals 0

    .line 1
    iget-object p0, p0, La/mco;->g:La/n0o0;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/mco;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/mco;->f:La/th90;

    .line 4
    .line 5
    iget-object v2, p0, La/mco;->e:La/zjw;

    .line 6
    .line 7
    iget-object v3, p0, La/mco;->j:La/n0o0;

    .line 8
    .line 9
    iget-object v4, p0, La/mco;->i:La/n0o0;

    .line 10
    .line 11
    iget-object v5, p0, La/mco;->h:La/n0o0;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, La/zjw;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/mco;->b()La/fee;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v6, p1, La/zjw;->g:La/ekw;

    .line 26
    .line 27
    invoke-virtual {v0, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/fee;

    .line 35
    .line 36
    iget-object v5, p1, La/zjw;->l:Ljava/util/Map;

    .line 37
    .line 38
    invoke-virtual {v0, v5}, La/fee;->d(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/fee;

    .line 46
    .line 47
    iget-boolean v4, p1, La/zjw;->k:Z

    .line 48
    .line 49
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v0, v4}, La/fee;->d(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, La/fee;

    .line 61
    .line 62
    iget-object v3, p1, La/zjw;->j:Ljava/util/Map;

    .line 63
    .line 64
    iget-object v4, v6, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 65
    .line 66
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {v0, v3}, La/fee;->d(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, La/mco;->k:La/n0o0;

    .line 84
    .line 85
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/fee;

    .line 90
    .line 91
    iget-object v3, p1, La/zjw;->q:Ljava/util/Map;

    .line 92
    .line 93
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0, v3}, La/fee;->d(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, La/kkw;

    .line 109
    .line 110
    iget-object v3, v2, La/zjw;->b:La/sff0;

    .line 111
    .line 112
    iget-object v3, v3, La/sff0;->c:La/ech;

    .line 113
    .line 114
    iget-object v3, v3, La/ech;->o:La/g5h;

    .line 115
    .line 116
    iget-boolean v2, v2, La/zjw;->f:Z

    .line 117
    .line 118
    iget-object v5, p0, La/mco;->l:La/n0o0;

    .line 119
    .line 120
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    check-cast v5, La/fee;

    .line 125
    .line 126
    iget-object v5, v5, La/fee;->e:La/zbk;

    .line 127
    .line 128
    iget-object v7, p1, La/zjw;->h:Ljava/util/Map;

    .line 129
    .line 130
    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    move-object v10, v7

    .line 135
    check-cast v10, La/jih;

    .line 136
    .line 137
    if-nez v10, :cond_0

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_0
    invoke-static {v1, v4}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, La/pz40;

    .line 145
    .line 146
    iget-object v9, v6, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 147
    .line 148
    iget-boolean v11, p1, La/zjw;->i:Z

    .line 149
    .line 150
    new-instance v13, La/wqv;

    .line 151
    .line 152
    const/4 p1, 0x1

    .line 153
    invoke-direct {v13, p0, v10, p1}, La/wqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    iget-object v8, p0, La/mco;->d:La/g2v;

    .line 157
    .line 158
    const/4 v12, 0x1

    .line 159
    invoke-static/range {v8 .. v13}, La/u1c;->w(La/g2v;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jih;ZZLkotlin/jvm/functions/Function0;)La/hjw;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-interface {v4, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :goto_0
    invoke-direct {v0, v3, v2, v5, v1}, La/kkw;-><init>(La/g5h;ZLa/l7m0;La/th90;)V

    .line 167
    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_0
    check-cast p1, La/zjw;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, La/fee;

    .line 180
    .line 181
    iget-object v5, p1, La/zjw;->j:Ljava/util/Map;

    .line 182
    .line 183
    iget-object v6, p1, La/zjw;->g:La/ekw;

    .line 184
    .line 185
    iget-object v7, v6, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 186
    .line 187
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v0, v5}, La/fee;->d(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, La/fee;

    .line 209
    .line 210
    iget-boolean v4, p1, La/zjw;->k:Z

    .line 211
    .line 212
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v0, v4}, La/fee;->d(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, La/mco;->a()La/fee;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    new-instance v0, La/kkw;

    .line 227
    .line 228
    iget-object v4, v2, La/zjw;->b:La/sff0;

    .line 229
    .line 230
    iget-object v4, v4, La/sff0;->c:La/ech;

    .line 231
    .line 232
    iget-object v4, v4, La/ech;->o:La/g5h;

    .line 233
    .line 234
    iget-boolean v2, v2, La/zjw;->f:Z

    .line 235
    .line 236
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    check-cast v3, La/fee;

    .line 241
    .line 242
    iget-object v3, v3, La/fee;->e:La/zbk;

    .line 243
    .line 244
    iget-object v5, p1, La/zjw;->h:Ljava/util/Map;

    .line 245
    .line 246
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    move-object v10, v5

    .line 251
    check-cast v10, La/jih;

    .line 252
    .line 253
    if-nez v10, :cond_1

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_1
    invoke-static {v1, v7}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    check-cast v5, La/pz40;

    .line 261
    .line 262
    iget-object v9, v6, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 263
    .line 264
    iget-boolean v11, p1, La/zjw;->i:Z

    .line 265
    .line 266
    new-instance v13, La/g8l;

    .line 267
    .line 268
    const/16 v6, 0xb

    .line 269
    .line 270
    invoke-direct {v13, p0, v10, p1, v6}, La/g8l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 271
    .line 272
    .line 273
    iget-object v8, p0, La/mco;->d:La/g2v;

    .line 274
    .line 275
    const/4 v12, 0x1

    .line 276
    invoke-static/range {v8 .. v13}, La/u1c;->w(La/g2v;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/jih;ZZLkotlin/jvm/functions/Function0;)La/hjw;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    invoke-interface {v5, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :goto_1
    invoke-direct {v0, v4, v2, v3, v1}, La/kkw;-><init>(La/g5h;ZLa/l7m0;La/th90;)V

    .line 284
    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
