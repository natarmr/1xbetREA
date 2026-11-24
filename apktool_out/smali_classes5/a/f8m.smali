.class public final synthetic La/f8m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/f8m;->a:B

    iput-object p4, p0, La/f8m;->b:Ljava/lang/Object;

    iput-object p2, p0, La/f8m;->c:Ljava/lang/Object;

    iput-object p3, p0, La/f8m;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/f8m;->a:B

    iput-object p1, p0, La/f8m;->c:Ljava/lang/Object;

    iput-object p2, p0, La/f8m;->d:Ljava/lang/Object;

    iput-object p3, p0, La/f8m;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f8m;->a:B

    .line 4
    .line 5
    const-string v5, ""

    .line 6
    .line 7
    const/16 v6, 0xf

    .line 8
    .line 9
    const/16 v8, 0xd

    .line 10
    .line 11
    const v9, 0x799532c4

    .line 12
    .line 13
    .line 14
    const/16 v10, 0xa

    .line 15
    .line 16
    const-string v11, "rootView"

    .line 17
    .line 18
    const/4 v12, 0x3

    .line 19
    const/16 v13, 0xb

    .line 20
    .line 21
    const/16 v14, 0x8

    .line 22
    .line 23
    const/4 v15, 0x0

    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v3, 0x0

    .line 26
    iget-object v7, v0, La/f8m;->b:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v4, v0, La/f8m;->d:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v0, v0, La/f8m;->c:Ljava/lang/Object;

    .line 31
    .line 32
    packed-switch v1, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    check-cast v0, La/a4x;

    .line 36
    .line 37
    check-cast v4, La/xcz;

    .line 38
    .line 39
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 40
    .line 41
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, La/hcz;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v3, La/s3t;

    .line 49
    .line 50
    invoke-direct {v3, v14}, La/s3t;-><init>(B)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    new-instance v8, La/d2p;

    .line 58
    .line 59
    invoke-direct {v8, v3, v0, v6}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    new-instance v3, La/far;

    .line 63
    .line 64
    invoke-direct {v3, v0, v10}, La/far;-><init>(Ljava/util/List;B)V

    .line 65
    .line 66
    .line 67
    new-instance v6, La/c8;

    .line 68
    .line 69
    const/16 v10, 0x1a

    .line 70
    .line 71
    invoke-direct {v6, v0, v4, v7, v10}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 72
    .line 73
    .line 74
    new-instance v0, La/ugd;

    .line 75
    .line 76
    invoke-direct {v0, v9, v2, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v5, v8, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_0
    check-cast v0, La/ctf0;

    .line 86
    .line 87
    check-cast v4, Ljava/util/List;

    .line 88
    .line 89
    check-cast v7, La/ocl;

    .line 90
    .line 91
    move-object/from16 v1, p1

    .line 92
    .line 93
    check-cast v1, La/zht;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v2, La/pg4;

    .line 99
    .line 100
    invoke-direct {v2, v1, v0, v4, v7}, La/pg4;-><init>(La/zht;La/ctf0;Ljava/util/List;La/ocl;)V

    .line 101
    .line 102
    .line 103
    return-object v2

    .line 104
    :pswitch_1
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 105
    .line 106
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 107
    .line 108
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 109
    .line 110
    move-object/from16 v1, p1

    .line 111
    .line 112
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    instance-of v2, v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;

    .line 118
    .line 119
    if-eqz v2, :cond_0

    .line 120
    .line 121
    check-cast v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;

    .line 122
    .line 123
    iget-wide v0, v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;->a:J

    .line 124
    .line 125
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_0
    sget-object v2, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionBonusGamesUnderMaintenance;

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_1

    .line 140
    .line 141
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_1
    sget-object v0, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;

    .line 146
    .line 147
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_2

    .line 152
    .line 153
    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 160
    .line 161
    .line 162
    :goto_1
    return-object v3

    .line 163
    :pswitch_2
    check-cast v0, La/ov0;

    .line 164
    .line 165
    move-object/from16 v17, v4

    .line 166
    .line 167
    check-cast v17, La/ctf0;

    .line 168
    .line 169
    move-object/from16 v18, v7

    .line 170
    .line 171
    check-cast v18, La/y78;

    .line 172
    .line 173
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, Ljava/util/List;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    new-instance v2, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-static {v1, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_f

    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    check-cast v4, La/d0t;

    .line 204
    .line 205
    iget-object v6, v0, La/ov0;->b:La/n0o0;

    .line 206
    .line 207
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    check-cast v6, La/fee;

    .line 212
    .line 213
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    check-cast v6, La/bis;

    .line 218
    .line 219
    if-nez v6, :cond_3

    .line 220
    .line 221
    sget-object v0, La/lak0;->c:La/lak0;

    .line 222
    .line 223
    goto/16 :goto_e

    .line 224
    .line 225
    :cond_3
    iget-object v7, v6, La/bis;->e:Ljava/util/List;

    .line 226
    .line 227
    if-eqz v7, :cond_6

    .line 228
    .line 229
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    if-eqz v9, :cond_5

    .line 238
    .line 239
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    move-object v11, v9

    .line 244
    check-cast v11, La/lok0;

    .line 245
    .line 246
    iget v11, v11, La/lok0;->a:I

    .line 247
    .line 248
    iget v12, v4, La/d0t;->O:I

    .line 249
    .line 250
    if-ne v11, v12, :cond_4

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_5
    move-object v9, v3

    .line 254
    :goto_3
    check-cast v9, La/lok0;

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_6
    move-object v9, v3

    .line 258
    :goto_4
    iget-boolean v8, v6, La/bis;->a:Z

    .line 259
    .line 260
    iget-boolean v11, v6, La/bis;->b:Z

    .line 261
    .line 262
    iget-object v12, v6, La/bis;->d:La/wcb;

    .line 263
    .line 264
    if-eqz v12, :cond_8

    .line 265
    .line 266
    iget-wide v13, v4, La/d0t;->v:J

    .line 267
    .line 268
    move/from16 v20, v11

    .line 269
    .line 270
    iget-wide v10, v4, La/d0t;->u:J

    .line 271
    .line 272
    invoke-virtual {v12, v13, v14, v10, v11}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v10

    .line 276
    if-nez v10, :cond_7

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_7
    move-object/from16 v21, v10

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_8
    move/from16 v20, v11

    .line 283
    .line 284
    :goto_5
    move-object/from16 v21, v5

    .line 285
    .line 286
    :goto_6
    new-instance v10, Ljava/util/ArrayList;

    .line 287
    .line 288
    const/16 v11, 0xa

    .line 289
    .line 290
    invoke-static {v7, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 291
    .line 292
    .line 293
    move-result v12

    .line 294
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v11

    .line 305
    if-eqz v11, :cond_9

    .line 306
    .line 307
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v11

    .line 311
    check-cast v11, La/lok0;

    .line 312
    .line 313
    iget v11, v11, La/lok0;->a:I

    .line 314
    .line 315
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v11

    .line 319
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_9
    if-eqz v9, :cond_a

    .line 324
    .line 325
    iget-boolean v7, v9, La/lok0;->n:Z

    .line 326
    .line 327
    move/from16 v24, v7

    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_a
    move/from16 v24, v15

    .line 331
    .line 332
    :goto_8
    if-eqz v9, :cond_b

    .line 333
    .line 334
    iget-boolean v7, v9, La/lok0;->p:Z

    .line 335
    .line 336
    move/from16 v25, v7

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_b
    move/from16 v25, v15

    .line 340
    .line 341
    :goto_9
    iget-object v7, v6, La/bis;->f:La/v5l0;

    .line 342
    .line 343
    iget-object v11, v4, La/d0t;->K:Ljava/util/List;

    .line 344
    .line 345
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 346
    .line 347
    .line 348
    move-result v11

    .line 349
    if-eqz v11, :cond_c

    .line 350
    .line 351
    sget-object v11, La/i5l0;->a:La/i5l0;

    .line 352
    .line 353
    :goto_a
    move-object/from16 v28, v11

    .line 354
    .line 355
    goto :goto_b

    .line 356
    :cond_c
    sget-object v11, La/l5l0;->a:La/l5l0;

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :goto_b
    if-eqz v9, :cond_d

    .line 360
    .line 361
    iget-object v9, v9, La/lok0;->u:Ljava/lang/String;

    .line 362
    .line 363
    goto :goto_c

    .line 364
    :cond_d
    move-object v9, v3

    .line 365
    :goto_c
    if-nez v9, :cond_e

    .line 366
    .line 367
    move-object/from16 v29, v5

    .line 368
    .line 369
    goto :goto_d

    .line 370
    :cond_e
    move-object/from16 v29, v9

    .line 371
    .line 372
    :goto_d
    iget-boolean v6, v6, La/bis;->g:Z

    .line 373
    .line 374
    const/16 v22, 0x0

    .line 375
    .line 376
    const/16 v26, 0x0

    .line 377
    .line 378
    move-object/from16 v16, v4

    .line 379
    .line 380
    move/from16 v30, v6

    .line 381
    .line 382
    move-object/from16 v27, v7

    .line 383
    .line 384
    move/from16 v19, v8

    .line 385
    .line 386
    move-object/from16 v23, v10

    .line 387
    .line 388
    invoke-static/range {v16 .. v30}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    const/16 v10, 0xa

    .line 396
    .line 397
    goto/16 :goto_2

    .line 398
    .line 399
    :cond_f
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    :goto_e
    return-object v0

    .line 404
    :pswitch_3
    check-cast v0, La/a4x;

    .line 405
    .line 406
    check-cast v4, La/nek;

    .line 407
    .line 408
    check-cast v7, La/xak;

    .line 409
    .line 410
    move-object/from16 v1, p1

    .line 411
    .line 412
    check-cast v1, La/hcz;

    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    new-instance v3, La/gwr;

    .line 418
    .line 419
    invoke-direct {v3, v8}, La/gwr;-><init>(B)V

    .line 420
    .line 421
    .line 422
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    new-instance v6, La/d2p;

    .line 427
    .line 428
    invoke-direct {v6, v3, v0, v13}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 429
    .line 430
    .line 431
    new-instance v3, La/far;

    .line 432
    .line 433
    invoke-direct {v3, v0, v12}, La/far;-><init>(Ljava/util/List;B)V

    .line 434
    .line 435
    .line 436
    new-instance v8, La/c8;

    .line 437
    .line 438
    const/16 v10, 0x19

    .line 439
    .line 440
    invoke-direct {v8, v0, v4, v7, v10}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 441
    .line 442
    .line 443
    new-instance v0, La/ugd;

    .line 444
    .line 445
    invoke-direct {v0, v9, v2, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v1, v5, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 449
    .line 450
    .line 451
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    return-object v0

    .line 454
    :pswitch_4
    move-object v5, v0

    .line 455
    check-cast v5, La/hdz;

    .line 456
    .line 457
    move-object v6, v4

    .line 458
    check-cast v6, La/l4b;

    .line 459
    .line 460
    move-object v8, v7

    .line 461
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 462
    .line 463
    move-object/from16 v13, p1

    .line 464
    .line 465
    check-cast v13, La/hcz;

    .line 466
    .line 467
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v5}, La/hdz;->d()La/txx;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    invoke-virtual {v5}, La/hdz;->c()I

    .line 475
    .line 476
    .line 477
    move-result v14

    .line 478
    new-instance v4, La/g54;

    .line 479
    .line 480
    const/16 v9, 0x9

    .line 481
    .line 482
    invoke-direct/range {v4 .. v9}, La/g54;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 483
    .line 484
    .line 485
    new-instance v0, La/ugd;

    .line 486
    .line 487
    const v1, 0xdfefd21

    .line 488
    .line 489
    .line 490
    invoke-direct {v0, v1, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    const/16 v18, 0x6

    .line 494
    .line 495
    const/4 v15, 0x0

    .line 496
    const/16 v16, 0x0

    .line 497
    .line 498
    move-object/from16 v17, v0

    .line 499
    .line 500
    invoke-static/range {v13 .. v18}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v5}, La/hdz;->e()La/h7d;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    iget-object v0, v0, La/h7d;->c:La/mva;

    .line 508
    .line 509
    sget-object v1, La/ap00;->b:La/ap00;

    .line 510
    .line 511
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    if-eqz v0, :cond_10

    .line 516
    .line 517
    sget-object v0, La/ntr;->g:La/ugd;

    .line 518
    .line 519
    invoke-static {v13, v3, v3, v0, v12}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 520
    .line 521
    .line 522
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 523
    .line 524
    return-object v0

    .line 525
    :pswitch_5
    check-cast v0, La/nqq;

    .line 526
    .line 527
    check-cast v4, La/ypq;

    .line 528
    .line 529
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 530
    .line 531
    move-object/from16 v1, p1

    .line 532
    .line 533
    check-cast v1, La/nqq;

    .line 534
    .line 535
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v0

    .line 539
    if-eqz v0, :cond_11

    .line 540
    .line 541
    goto :goto_f

    .line 542
    :cond_11
    iget-object v0, v4, La/ypq;->c:La/nqq;

    .line 543
    .line 544
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    if-nez v0, :cond_12

    .line 549
    .line 550
    invoke-interface {v7, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    check-cast v0, Ljava/lang/Boolean;

    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 557
    .line 558
    .line 559
    move-result v15

    .line 560
    :goto_f
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    goto :goto_10

    .line 565
    :cond_12
    const-string v0, "Focus search landed at the root."

    .line 566
    .line 567
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    :goto_10
    return-object v3

    .line 571
    :pswitch_6
    move-object v1, v0

    .line 572
    check-cast v1, La/hgq;

    .line 573
    .line 574
    check-cast v4, Lcom/google/firebase/auth/AuthResult;

    .line 575
    .line 576
    check-cast v7, Lcom/google/firebase/auth/internal/zzad;

    .line 577
    .line 578
    move-object/from16 v0, p1

    .line 579
    .line 580
    check-cast v0, La/ezu;

    .line 581
    .line 582
    sget-object v6, La/hgq;->g2:La/nek;

    .line 583
    .line 584
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    iget-object v6, v1, La/hgq;->b2:La/zz2;

    .line 588
    .line 589
    sget-object v9, La/hgq;->h2:[La/iiy;

    .line 590
    .line 591
    aget-object v9, v9, v15

    .line 592
    .line 593
    invoke-virtual {v6, v1, v9}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 594
    .line 595
    .line 596
    move-result-object v9

    .line 597
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 598
    .line 599
    .line 600
    move-result v21

    .line 601
    iget-object v0, v0, La/ezu;->a:Ljava/lang/String;

    .line 602
    .line 603
    if-nez v0, :cond_13

    .line 604
    .line 605
    move-object/from16 v22, v5

    .line 606
    .line 607
    goto :goto_11

    .line 608
    :cond_13
    move-object/from16 v22, v0

    .line 609
    .line 610
    :goto_11
    check-cast v4, Lcom/google/firebase/auth/internal/zzx;

    .line 611
    .line 612
    iget-object v4, v4, Lcom/google/firebase/auth/internal/zzx;->c:Lcom/google/firebase/auth/zzc;

    .line 613
    .line 614
    if-eqz v4, :cond_14

    .line 615
    .line 616
    goto :goto_12

    .line 617
    :cond_14
    move-object v4, v3

    .line 618
    :goto_12
    if-eqz v4, :cond_15

    .line 619
    .line 620
    iget-object v4, v4, Lcom/google/firebase/auth/zzc;->f:Ljava/lang/String;

    .line 621
    .line 622
    goto :goto_13

    .line 623
    :cond_15
    move-object v4, v3

    .line 624
    :goto_13
    if-nez v4, :cond_16

    .line 625
    .line 626
    move-object/from16 v23, v5

    .line 627
    .line 628
    goto :goto_14

    .line 629
    :cond_16
    move-object/from16 v23, v4

    .line 630
    .line 631
    :goto_14
    if-eqz v0, :cond_1b

    .line 632
    .line 633
    iget-object v4, v1, La/hgq;->f2:La/vby;

    .line 634
    .line 635
    if-eqz v4, :cond_1a

    .line 636
    .line 637
    const-string v9, "."

    .line 638
    .line 639
    filled-new-array {v9}, [Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v9

    .line 643
    const/4 v10, 0x6

    .line 644
    invoke-static {v0, v9, v15, v10}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 649
    .line 650
    .line 651
    move-result v9

    .line 652
    if-ne v9, v12, :cond_19

    .line 653
    .line 654
    :try_start_0
    sget-object v9, La/j0g0;->b:La/e0g0;

    .line 655
    .line 656
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    check-cast v0, Ljava/lang/String;

    .line 661
    .line 662
    invoke-static {v0, v14}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    new-instance v2, Ljava/lang/String;

    .line 670
    .line 671
    sget-object v9, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 672
    .line 673
    invoke-direct {v2, v0, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 674
    .line 675
    .line 676
    sget-object v0, La/xfq;->Companion:La/wfq;

    .line 677
    .line 678
    invoke-virtual {v0}, La/wfq;->serializer()La/jiy;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    check-cast v0, La/jiy;

    .line 683
    .line 684
    invoke-virtual {v4, v0, v2}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    check-cast v0, La/xfq;

    .line 689
    .line 690
    iget-object v0, v0, La/xfq;->k:La/ffq;

    .line 691
    .line 692
    if-eqz v0, :cond_17

    .line 693
    .line 694
    iget-object v0, v0, La/ffq;->a:La/pxw;

    .line 695
    .line 696
    if-eqz v0, :cond_17

    .line 697
    .line 698
    iget-object v0, v0, La/pxw;->a:Ljava/util/List;

    .line 699
    .line 700
    if-eqz v0, :cond_17

    .line 701
    .line 702
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 707
    .line 708
    goto :goto_16

    .line 709
    :catchall_0
    move-exception v0

    .line 710
    goto :goto_15

    .line 711
    :cond_17
    move-object v0, v3

    .line 712
    goto :goto_16

    .line 713
    :goto_15
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 714
    .line 715
    new-instance v2, La/g0g0;

    .line 716
    .line 717
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 718
    .line 719
    .line 720
    move-object v0, v2

    .line 721
    :goto_16
    nop

    .line 722
    instance-of v2, v0, La/g0g0;

    .line 723
    .line 724
    if-eqz v2, :cond_18

    .line 725
    .line 726
    move-object v0, v3

    .line 727
    :cond_18
    check-cast v0, Ljava/lang/String;

    .line 728
    .line 729
    if-nez v0, :cond_1c

    .line 730
    .line 731
    :cond_19
    move-object v0, v5

    .line 732
    goto :goto_17

    .line 733
    :cond_1a
    const-string v0, "json"

    .line 734
    .line 735
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    throw v3

    .line 739
    :cond_1b
    move-object v0, v3

    .line 740
    :cond_1c
    :goto_17
    if-nez v0, :cond_1d

    .line 741
    .line 742
    move-object/from16 v24, v5

    .line 743
    .line 744
    goto :goto_18

    .line 745
    :cond_1d
    move-object/from16 v24, v0

    .line 746
    .line 747
    :goto_18
    iget-object v0, v7, Lcom/google/firebase/auth/internal/zzad;->b:Lcom/google/firebase/auth/internal/zzz;

    .line 748
    .line 749
    iget-object v2, v0, Lcom/google/firebase/auth/internal/zzz;->e:Ljava/lang/String;

    .line 750
    .line 751
    if-nez v2, :cond_1e

    .line 752
    .line 753
    move-object/from16 v27, v5

    .line 754
    .line 755
    goto :goto_19

    .line 756
    :cond_1e
    move-object/from16 v27, v2

    .line 757
    .line 758
    :goto_19
    iget-object v2, v0, Lcom/google/firebase/auth/internal/zzz;->f:Ljava/lang/String;

    .line 759
    .line 760
    if-nez v2, :cond_1f

    .line 761
    .line 762
    move-object/from16 v28, v5

    .line 763
    .line 764
    goto :goto_1a

    .line 765
    :cond_1f
    move-object/from16 v28, v2

    .line 766
    .line 767
    :goto_1a
    iget-object v0, v0, Lcom/google/firebase/auth/internal/zzz;->c:Ljava/lang/String;

    .line 768
    .line 769
    sget-object v2, La/hgq;->h2:[La/iiy;

    .line 770
    .line 771
    aget-object v2, v2, v15

    .line 772
    .line 773
    invoke-virtual {v6, v1, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 778
    .line 779
    .line 780
    move-result v2

    .line 781
    if-ne v2, v8, :cond_20

    .line 782
    .line 783
    move-object v3, v0

    .line 784
    :cond_20
    if-nez v3, :cond_21

    .line 785
    .line 786
    move-object/from16 v25, v5

    .line 787
    .line 788
    goto :goto_1b

    .line 789
    :cond_21
    move-object/from16 v25, v3

    .line 790
    .line 791
    :goto_1b
    new-instance v20, La/ghk0;

    .line 792
    .line 793
    const/16 v26, 0x0

    .line 794
    .line 795
    const/16 v29, 0x20

    .line 796
    .line 797
    invoke-direct/range {v20 .. v29}, La/ghk0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 798
    .line 799
    .line 800
    move-object/from16 v0, v20

    .line 801
    .line 802
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 803
    .line 804
    .line 805
    move-result v2

    .line 806
    if-eqz v2, :cond_22

    .line 807
    .line 808
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    new-instance v3, Lkotlin/Pair;

    .line 813
    .line 814
    const-string v4, "SUCCESS_SOCIAL"

    .line 815
    .line 816
    invoke-direct {v3, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-virtual {v2, v0, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    :cond_22
    invoke-virtual {v1}, La/sik;->y0()V

    .line 831
    .line 832
    .line 833
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 834
    .line 835
    return-object v0

    .line 836
    :pswitch_7
    check-cast v0, La/fpp;

    .line 837
    .line 838
    check-cast v4, Ljava/util/Set;

    .line 839
    .line 840
    move-object v12, v7

    .line 841
    check-cast v12, Ljava/util/Set;

    .line 842
    .line 843
    move-object/from16 v1, p1

    .line 844
    .line 845
    check-cast v1, La/k0w0;

    .line 846
    .line 847
    iget-object v8, v0, La/fpp;->u:La/vjp;

    .line 848
    .line 849
    iget-object v9, v0, La/fpp;->s:Ljava/lang/String;

    .line 850
    .line 851
    iget-object v10, v0, La/fpp;->z:La/j700;

    .line 852
    .line 853
    new-instance v11, La/d8h0;

    .line 854
    .line 855
    check-cast v4, Ljava/lang/Iterable;

    .line 856
    .line 857
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    const/4 v2, 0x2

    .line 862
    invoke-direct {v11, v2, v0}, La/d8h0;-><init>(ILjava/util/Set;)V

    .line 863
    .line 864
    .line 865
    const-string v15, ""

    .line 866
    .line 867
    const-wide/16 v13, -0x1

    .line 868
    .line 869
    invoke-virtual/range {v8 .. v15}, La/vjp;->c(Ljava/lang/String;La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 874
    .line 875
    .line 876
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 877
    .line 878
    return-object v0

    .line 879
    :pswitch_8
    check-cast v0, La/wji;

    .line 880
    .line 881
    check-cast v4, La/rop;

    .line 882
    .line 883
    check-cast v7, La/a8z;

    .line 884
    .line 885
    move-object/from16 v1, p1

    .line 886
    .line 887
    check-cast v1, La/pj00;

    .line 888
    .line 889
    sget-object v2, La/rop;->a2:La/nek;

    .line 890
    .line 891
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    iget-object v0, v0, La/wji;->c:La/itr;

    .line 895
    .line 896
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 901
    .line 902
    .line 903
    iget-object v1, v1, La/pj00;->a:La/sjd;

    .line 904
    .line 905
    invoke-virtual {v0, v4, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 906
    .line 907
    .line 908
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    check-cast v0, La/k3t0;

    .line 913
    .line 914
    sget-object v1, La/ci00;->a:La/ci00;

    .line 915
    .line 916
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 920
    .line 921
    return-object v0

    .line 922
    :pswitch_9
    check-cast v0, La/bhi;

    .line 923
    .line 924
    check-cast v4, La/rop;

    .line 925
    .line 926
    check-cast v7, La/a8z;

    .line 927
    .line 928
    move-object/from16 v1, p1

    .line 929
    .line 930
    check-cast v1, La/eis;

    .line 931
    .line 932
    sget-object v2, La/rop;->a2:La/nek;

    .line 933
    .line 934
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    iget-object v0, v0, La/bhi;->i:La/itr;

    .line 938
    .line 939
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 944
    .line 945
    .line 946
    iget-object v1, v1, La/eis;->a:La/sjd;

    .line 947
    .line 948
    invoke-virtual {v0, v4, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 949
    .line 950
    .line 951
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v0

    .line 955
    check-cast v0, La/k3t0;

    .line 956
    .line 957
    sget-object v1, La/ghs;->a:La/ghs;

    .line 958
    .line 959
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 960
    .line 961
    .line 962
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 963
    .line 964
    return-object v0

    .line 965
    :pswitch_a
    check-cast v0, La/rop;

    .line 966
    .line 967
    check-cast v4, La/ujd;

    .line 968
    .line 969
    check-cast v7, La/a8z;

    .line 970
    .line 971
    move-object/from16 v1, p1

    .line 972
    .line 973
    check-cast v1, La/wmp;

    .line 974
    .line 975
    sget-object v2, La/rop;->a2:La/nek;

    .line 976
    .line 977
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 978
    .line 979
    .line 980
    instance-of v2, v1, La/vmp;

    .line 981
    .line 982
    if-eqz v2, :cond_23

    .line 983
    .line 984
    check-cast v1, La/vmp;

    .line 985
    .line 986
    iget v1, v1, La/vmp;->a:I

    .line 987
    .line 988
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v18

    .line 992
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    invoke-virtual {v0}, La/rop;->M0()La/zgi;

    .line 996
    .line 997
    .line 998
    move-result-object v1

    .line 999
    iget-object v1, v1, La/zgi;->q:La/wdk0;

    .line 1000
    .line 1001
    new-instance v16, La/xdk0;

    .line 1002
    .line 1003
    sget-object v17, La/rek0;->b:La/rek0;

    .line 1004
    .line 1005
    const/16 v22, 0x0

    .line 1006
    .line 1007
    const/16 v23, 0x7c

    .line 1008
    .line 1009
    const/16 v19, 0x0

    .line 1010
    .line 1011
    const/16 v20, 0x0

    .line 1012
    .line 1013
    const/16 v21, 0x0

    .line 1014
    .line 1015
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1016
    .line 1017
    .line 1018
    iget-object v2, v0, La/rop;->M1:La/s0r;

    .line 1019
    .line 1020
    sget-object v3, La/rop;->b2:[La/iiy;

    .line 1021
    .line 1022
    aget-object v3, v3, v15

    .line 1023
    .line 1024
    invoke-virtual {v2, v3, v0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v2

    .line 1028
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    check-cast v2, La/yhp;

    .line 1032
    .line 1033
    iget-object v2, v2, La/yhp;->a:Landroid/widget/FrameLayout;

    .line 1034
    .line 1035
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v21

    .line 1039
    const/16 v26, 0x0

    .line 1040
    .line 1041
    const/16 v27, 0x78

    .line 1042
    .line 1043
    const/16 v23, 0x0

    .line 1044
    .line 1045
    const/16 v24, 0x0

    .line 1046
    .line 1047
    const/16 v25, 0x0

    .line 1048
    .line 1049
    move-object/from16 v19, v1

    .line 1050
    .line 1051
    move-object/from16 v22, v2

    .line 1052
    .line 1053
    move-object/from16 v20, v16

    .line 1054
    .line 1055
    invoke-static/range {v19 .. v27}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 1056
    .line 1057
    .line 1058
    goto :goto_1c

    .line 1059
    :cond_23
    instance-of v2, v1, La/ump;

    .line 1060
    .line 1061
    if-eqz v2, :cond_24

    .line 1062
    .line 1063
    check-cast v1, La/ump;

    .line 1064
    .line 1065
    iget-object v1, v1, La/ump;->a:La/sjd;

    .line 1066
    .line 1067
    invoke-virtual {v4, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 1068
    .line 1069
    .line 1070
    :goto_1c
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    check-cast v0, La/k3t0;

    .line 1075
    .line 1076
    sget-object v1, La/amp;->a:La/amp;

    .line 1077
    .line 1078
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1079
    .line 1080
    .line 1081
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1082
    .line 1083
    goto :goto_1d

    .line 1084
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1085
    .line 1086
    .line 1087
    :goto_1d
    return-object v3

    .line 1088
    :pswitch_b
    check-cast v0, La/pu90;

    .line 1089
    .line 1090
    check-cast v4, La/l7m0;

    .line 1091
    .line 1092
    check-cast v7, La/l7m0;

    .line 1093
    .line 1094
    move-object/from16 v1, p1

    .line 1095
    .line 1096
    check-cast v1, La/ou90;

    .line 1097
    .line 1098
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1099
    .line 1100
    .line 1101
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v2

    .line 1105
    check-cast v2, Ljava/lang/Number;

    .line 1106
    .line 1107
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 1108
    .line 1109
    .line 1110
    move-result v2

    .line 1111
    float-to-int v2, v2

    .line 1112
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v3

    .line 1116
    check-cast v3, Ljava/lang/Number;

    .line 1117
    .line 1118
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1119
    .line 1120
    .line 1121
    move-result v3

    .line 1122
    add-int/2addr v3, v2

    .line 1123
    const/4 v2, 0x0

    .line 1124
    invoke-virtual {v1, v0, v15, v3, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 1125
    .line 1126
    .line 1127
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1128
    .line 1129
    return-object v0

    .line 1130
    :pswitch_c
    check-cast v0, La/szj0;

    .line 1131
    .line 1132
    move-object v8, v4

    .line 1133
    check-cast v8, La/b7o;

    .line 1134
    .line 1135
    check-cast v7, Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1136
    .line 1137
    move-object/from16 v1, p1

    .line 1138
    .line 1139
    check-cast v1, La/k0w0;

    .line 1140
    .line 1141
    iget-object v0, v0, La/szj0;->e:La/rzj0;

    .line 1142
    .line 1143
    sget-object v4, La/pzj0;->a:La/pzj0;

    .line 1144
    .line 1145
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v4

    .line 1149
    if-eqz v4, :cond_25

    .line 1150
    .line 1151
    iget-object v9, v8, La/b7o;->I:La/xpr;

    .line 1152
    .line 1153
    new-instance v10, La/vpr;

    .line 1154
    .line 1155
    invoke-direct {v10, v15}, La/vpr;-><init>(Z)V

    .line 1156
    .line 1157
    .line 1158
    const/4 v12, 0x0

    .line 1159
    const/4 v13, 0x6

    .line 1160
    const/4 v11, 0x0

    .line 1161
    invoke-static/range {v8 .. v13}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v1, v7}, La/k0w0;->c(La/m7h0;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_1e

    .line 1168
    :cond_25
    sget-object v4, La/qzj0;->a:La/qzj0;

    .line 1169
    .line 1170
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1171
    .line 1172
    .line 1173
    move-result v0

    .line 1174
    if-eqz v0, :cond_26

    .line 1175
    .line 1176
    iget-object v9, v8, La/b7o;->I:La/xpr;

    .line 1177
    .line 1178
    new-instance v10, La/vpr;

    .line 1179
    .line 1180
    invoke-direct {v10, v2}, La/vpr;-><init>(Z)V

    .line 1181
    .line 1182
    .line 1183
    const/4 v12, 0x0

    .line 1184
    const/4 v13, 0x6

    .line 1185
    const/4 v11, 0x0

    .line 1186
    invoke-static/range {v8 .. v13}, La/i3t0;->A(La/i3t0;La/j3t0;Ljava/lang/Object;La/lne;Lkotlin/jvm/functions/Function1;I)V

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v1, v7}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1190
    .line 1191
    .line 1192
    :goto_1e
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1193
    .line 1194
    goto :goto_1f

    .line 1195
    :cond_26
    invoke-static {}, La/t9f;->b()V

    .line 1196
    .line 1197
    .line 1198
    :goto_1f
    return-object v3

    .line 1199
    :pswitch_d
    check-cast v0, Landroid/content/Context;

    .line 1200
    .line 1201
    check-cast v4, La/j8o0;

    .line 1202
    .line 1203
    check-cast v7, Ljava/util/List;

    .line 1204
    .line 1205
    move-object/from16 v1, p1

    .line 1206
    .line 1207
    check-cast v1, La/h8o0;

    .line 1208
    .line 1209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1210
    .line 1211
    .line 1212
    iget-object v2, v1, La/h8o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1213
    .line 1214
    iget v5, v4, La/j8o0;->e:I

    .line 1215
    .line 1216
    invoke-static {v5, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1221
    .line 1222
    .line 1223
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 1224
    .line 1225
    iget-object v0, v1, La/h8o0;->c:Landroid/widget/ImageView;

    .line 1226
    .line 1227
    sget-object v2, La/qzw;->a:La/qzw;

    .line 1228
    .line 1229
    iget-object v2, v4, La/j8o0;->c:Ljava/lang/String;

    .line 1230
    .line 1231
    const/16 v5, 0xa

    .line 1232
    .line 1233
    invoke-static {v0, v2, v15, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1234
    .line 1235
    .line 1236
    iget-object v0, v1, La/h8o0;->d:Landroid/widget/TextView;

    .line 1237
    .line 1238
    iget-object v2, v4, La/j8o0;->b:Ljava/lang/String;

    .line 1239
    .line 1240
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1241
    .line 1242
    .line 1243
    iget-object v0, v1, La/h8o0;->b:Landroid/widget/LinearLayout;

    .line 1244
    .line 1245
    iget-object v1, v4, La/j8o0;->d:Ljava/util/ArrayList;

    .line 1246
    .line 1247
    new-instance v2, La/ihu0;

    .line 1248
    .line 1249
    invoke-direct {v2, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v2}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v2

    .line 1256
    move v4, v15

    .line 1257
    :goto_20
    move-object v5, v2

    .line 1258
    check-cast v5, La/jhu0;

    .line 1259
    .line 1260
    invoke-virtual {v5}, La/jhu0;->hasNext()Z

    .line 1261
    .line 1262
    .line 1263
    move-result v6

    .line 1264
    if-eqz v6, :cond_29

    .line 1265
    .line 1266
    invoke-virtual {v5}, La/jhu0;->next()Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v5

    .line 1270
    add-int/lit8 v6, v4, 0x1

    .line 1271
    .line 1272
    if-ltz v4, :cond_28

    .line 1273
    .line 1274
    check-cast v5, Landroid/view/View;

    .line 1275
    .line 1276
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1277
    .line 1278
    .line 1279
    move-result v8

    .line 1280
    if-ge v4, v8, :cond_27

    .line 1281
    .line 1282
    move v4, v15

    .line 1283
    goto :goto_21

    .line 1284
    :cond_27
    move v4, v14

    .line 1285
    :goto_21
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1286
    .line 1287
    .line 1288
    move v4, v6

    .line 1289
    goto :goto_20

    .line 1290
    :cond_28
    invoke-static {}, La/q3d;->p()V

    .line 1291
    .line 1292
    .line 1293
    throw v3

    .line 1294
    :cond_29
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    move v2, v15

    .line 1299
    :goto_22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1300
    .line 1301
    .line 1302
    move-result v4

    .line 1303
    if-eqz v4, :cond_2d

    .line 1304
    .line 1305
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v4

    .line 1309
    add-int/lit8 v5, v2, 0x1

    .line 1310
    .line 1311
    if-ltz v2, :cond_2c

    .line 1312
    .line 1313
    check-cast v4, Ljava/lang/String;

    .line 1314
    .line 1315
    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v2

    .line 1319
    check-cast v2, La/i8o0;

    .line 1320
    .line 1321
    if-nez v2, :cond_2b

    .line 1322
    .line 1323
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v2

    .line 1327
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v2

    .line 1331
    const v6, 0x7f0d05ec

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v2, v6, v0, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v2

    .line 1338
    if-eqz v2, :cond_2a

    .line 1339
    .line 1340
    check-cast v2, Landroid/widget/TextView;

    .line 1341
    .line 1342
    new-instance v6, La/i8o0;

    .line 1343
    .line 1344
    invoke-direct {v6, v2, v2}, La/i8o0;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1348
    .line 1349
    .line 1350
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1351
    .line 1352
    .line 1353
    move-object v2, v6

    .line 1354
    goto :goto_23

    .line 1355
    :cond_2a
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 1356
    .line 1357
    .line 1358
    goto :goto_24

    .line 1359
    :cond_2b
    :goto_23
    iget-object v2, v2, La/i8o0;->b:Landroid/widget/TextView;

    .line 1360
    .line 1361
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1362
    .line 1363
    .line 1364
    move v2, v5

    .line 1365
    goto :goto_22

    .line 1366
    :cond_2c
    invoke-static {}, La/q3d;->p()V

    .line 1367
    .line 1368
    .line 1369
    throw v3

    .line 1370
    :cond_2d
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1371
    .line 1372
    :goto_24
    return-object v3

    .line 1373
    :pswitch_e
    check-cast v0, La/b8o0;

    .line 1374
    .line 1375
    check-cast v4, Landroid/content/Context;

    .line 1376
    .line 1377
    check-cast v7, Ljava/util/List;

    .line 1378
    .line 1379
    move-object/from16 v1, p1

    .line 1380
    .line 1381
    check-cast v1, La/z7o0;

    .line 1382
    .line 1383
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1384
    .line 1385
    .line 1386
    iget-object v2, v1, La/z7o0;->c:Landroid/widget/TextView;

    .line 1387
    .line 1388
    iget-object v5, v0, La/b8o0;->b:Ljava/lang/String;

    .line 1389
    .line 1390
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1391
    .line 1392
    .line 1393
    iget-object v2, v1, La/z7o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1394
    .line 1395
    iget v5, v0, La/b8o0;->d:I

    .line 1396
    .line 1397
    invoke-static {v5, v4}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v4

    .line 1401
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1402
    .line 1403
    .line 1404
    iget-object v1, v1, La/z7o0;->b:Landroid/widget/LinearLayout;

    .line 1405
    .line 1406
    iget-object v0, v0, La/b8o0;->c:Ljava/util/ArrayList;

    .line 1407
    .line 1408
    new-instance v2, La/ihu0;

    .line 1409
    .line 1410
    invoke-direct {v2, v1}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v2}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v2

    .line 1417
    move v4, v15

    .line 1418
    :goto_25
    move-object v5, v2

    .line 1419
    check-cast v5, La/jhu0;

    .line 1420
    .line 1421
    invoke-virtual {v5}, La/jhu0;->hasNext()Z

    .line 1422
    .line 1423
    .line 1424
    move-result v6

    .line 1425
    if-eqz v6, :cond_30

    .line 1426
    .line 1427
    invoke-virtual {v5}, La/jhu0;->next()Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v5

    .line 1431
    add-int/lit8 v6, v4, 0x1

    .line 1432
    .line 1433
    if-ltz v4, :cond_2f

    .line 1434
    .line 1435
    check-cast v5, Landroid/view/View;

    .line 1436
    .line 1437
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1438
    .line 1439
    .line 1440
    move-result v8

    .line 1441
    if-ge v4, v8, :cond_2e

    .line 1442
    .line 1443
    move v4, v15

    .line 1444
    goto :goto_26

    .line 1445
    :cond_2e
    move v4, v14

    .line 1446
    :goto_26
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1447
    .line 1448
    .line 1449
    move v4, v6

    .line 1450
    goto :goto_25

    .line 1451
    :cond_2f
    invoke-static {}, La/q3d;->p()V

    .line 1452
    .line 1453
    .line 1454
    throw v3

    .line 1455
    :cond_30
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    move v2, v15

    .line 1460
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1461
    .line 1462
    .line 1463
    move-result v4

    .line 1464
    if-eqz v4, :cond_34

    .line 1465
    .line 1466
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v4

    .line 1470
    add-int/lit8 v5, v2, 0x1

    .line 1471
    .line 1472
    if-ltz v2, :cond_33

    .line 1473
    .line 1474
    check-cast v4, Ljava/lang/String;

    .line 1475
    .line 1476
    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v2

    .line 1480
    check-cast v2, La/a8o0;

    .line 1481
    .line 1482
    if-nez v2, :cond_32

    .line 1483
    .line 1484
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v2

    .line 1488
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v2

    .line 1492
    const v6, 0x7f0d05e6

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v2, v6, v1, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v2

    .line 1499
    if-eqz v2, :cond_31

    .line 1500
    .line 1501
    check-cast v2, Landroid/widget/TextView;

    .line 1502
    .line 1503
    new-instance v6, La/a8o0;

    .line 1504
    .line 1505
    invoke-direct {v6, v2, v2}, La/a8o0;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1506
    .line 1507
    .line 1508
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1509
    .line 1510
    .line 1511
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1512
    .line 1513
    .line 1514
    move-object v2, v6

    .line 1515
    goto :goto_28

    .line 1516
    :cond_31
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 1517
    .line 1518
    .line 1519
    goto :goto_29

    .line 1520
    :cond_32
    :goto_28
    iget-object v2, v2, La/a8o0;->b:Landroid/widget/TextView;

    .line 1521
    .line 1522
    const/4 v6, 0x2

    .line 1523
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1524
    .line 1525
    .line 1526
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1527
    .line 1528
    .line 1529
    move v2, v5

    .line 1530
    goto :goto_27

    .line 1531
    :cond_33
    invoke-static {}, La/q3d;->p()V

    .line 1532
    .line 1533
    .line 1534
    throw v3

    .line 1535
    :cond_34
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1536
    .line 1537
    :goto_29
    return-object v3

    .line 1538
    :pswitch_f
    check-cast v0, Landroid/content/Context;

    .line 1539
    .line 1540
    check-cast v4, La/m6o0;

    .line 1541
    .line 1542
    check-cast v7, Ljava/util/List;

    .line 1543
    .line 1544
    move-object/from16 v1, p1

    .line 1545
    .line 1546
    check-cast v1, La/k6o0;

    .line 1547
    .line 1548
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1549
    .line 1550
    .line 1551
    iget-object v2, v1, La/k6o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1552
    .line 1553
    iget v5, v4, La/m6o0;->d:I

    .line 1554
    .line 1555
    invoke-static {v5, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v0

    .line 1559
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1560
    .line 1561
    .line 1562
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 1563
    .line 1564
    iget-object v0, v1, La/k6o0;->c:Landroid/widget/ImageView;

    .line 1565
    .line 1566
    iget-object v2, v4, La/m6o0;->c:Ljava/lang/String;

    .line 1567
    .line 1568
    invoke-static {v0, v2, v15, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1569
    .line 1570
    .line 1571
    iget-object v0, v1, La/k6o0;->d:Landroid/widget/TextView;

    .line 1572
    .line 1573
    iget-object v2, v4, La/m6o0;->b:Ljava/lang/String;

    .line 1574
    .line 1575
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1576
    .line 1577
    .line 1578
    iget-object v0, v1, La/k6o0;->b:Landroid/widget/LinearLayout;

    .line 1579
    .line 1580
    iget-object v1, v4, La/m6o0;->e:Ljava/util/ArrayList;

    .line 1581
    .line 1582
    new-instance v2, La/ihu0;

    .line 1583
    .line 1584
    invoke-direct {v2, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 1585
    .line 1586
    .line 1587
    invoke-virtual {v2}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v2

    .line 1591
    move v4, v15

    .line 1592
    :goto_2a
    move-object v5, v2

    .line 1593
    check-cast v5, La/jhu0;

    .line 1594
    .line 1595
    invoke-virtual {v5}, La/jhu0;->hasNext()Z

    .line 1596
    .line 1597
    .line 1598
    move-result v6

    .line 1599
    if-eqz v6, :cond_37

    .line 1600
    .line 1601
    invoke-virtual {v5}, La/jhu0;->next()Ljava/lang/Object;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v5

    .line 1605
    add-int/lit8 v6, v4, 0x1

    .line 1606
    .line 1607
    if-ltz v4, :cond_36

    .line 1608
    .line 1609
    check-cast v5, Landroid/view/View;

    .line 1610
    .line 1611
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1612
    .line 1613
    .line 1614
    move-result v8

    .line 1615
    if-ge v4, v8, :cond_35

    .line 1616
    .line 1617
    move v4, v15

    .line 1618
    goto :goto_2b

    .line 1619
    :cond_35
    move v4, v14

    .line 1620
    :goto_2b
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1621
    .line 1622
    .line 1623
    move v4, v6

    .line 1624
    goto :goto_2a

    .line 1625
    :cond_36
    invoke-static {}, La/q3d;->p()V

    .line 1626
    .line 1627
    .line 1628
    throw v3

    .line 1629
    :cond_37
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v1

    .line 1633
    :goto_2c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1634
    .line 1635
    .line 1636
    move-result v2

    .line 1637
    if-eqz v2, :cond_3a

    .line 1638
    .line 1639
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v2

    .line 1643
    add-int/lit8 v4, v15, 0x1

    .line 1644
    .line 1645
    if-ltz v15, :cond_39

    .line 1646
    .line 1647
    check-cast v2, Ljava/lang/String;

    .line 1648
    .line 1649
    invoke-static {v15, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v5

    .line 1653
    check-cast v5, La/sth;

    .line 1654
    .line 1655
    if-nez v5, :cond_38

    .line 1656
    .line 1657
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v5

    .line 1661
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v5

    .line 1665
    invoke-static {v5, v0}, La/sth;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/sth;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v5

    .line 1669
    iget-object v6, v5, La/sth;->a:Landroid/widget/TextView;

    .line 1670
    .line 1671
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1672
    .line 1673
    .line 1674
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1675
    .line 1676
    .line 1677
    :cond_38
    iget-object v5, v5, La/sth;->b:Landroid/widget/TextView;

    .line 1678
    .line 1679
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1680
    .line 1681
    .line 1682
    move v15, v4

    .line 1683
    goto :goto_2c

    .line 1684
    :cond_39
    invoke-static {}, La/q3d;->p()V

    .line 1685
    .line 1686
    .line 1687
    throw v3

    .line 1688
    :cond_3a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1689
    .line 1690
    return-object v0

    .line 1691
    :pswitch_10
    check-cast v0, Landroid/content/Context;

    .line 1692
    .line 1693
    check-cast v4, La/l6o0;

    .line 1694
    .line 1695
    check-cast v7, Ljava/util/List;

    .line 1696
    .line 1697
    move-object/from16 v1, p1

    .line 1698
    .line 1699
    check-cast v1, La/i6o0;

    .line 1700
    .line 1701
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1702
    .line 1703
    .line 1704
    iget-object v2, v1, La/i6o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1705
    .line 1706
    const v5, 0x7f080430

    .line 1707
    .line 1708
    .line 1709
    invoke-static {v5, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v0

    .line 1713
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1714
    .line 1715
    .line 1716
    iget-object v0, v1, La/i6o0;->b:Landroid/widget/LinearLayout;

    .line 1717
    .line 1718
    iget-object v1, v4, La/l6o0;->a:Ljava/util/ArrayList;

    .line 1719
    .line 1720
    new-instance v2, La/ihu0;

    .line 1721
    .line 1722
    invoke-direct {v2, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 1723
    .line 1724
    .line 1725
    invoke-virtual {v2}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v2

    .line 1729
    move v4, v15

    .line 1730
    :goto_2d
    move-object v5, v2

    .line 1731
    check-cast v5, La/jhu0;

    .line 1732
    .line 1733
    invoke-virtual {v5}, La/jhu0;->hasNext()Z

    .line 1734
    .line 1735
    .line 1736
    move-result v6

    .line 1737
    if-eqz v6, :cond_3d

    .line 1738
    .line 1739
    invoke-virtual {v5}, La/jhu0;->next()Ljava/lang/Object;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v5

    .line 1743
    add-int/lit8 v6, v4, 0x1

    .line 1744
    .line 1745
    if-ltz v4, :cond_3c

    .line 1746
    .line 1747
    check-cast v5, Landroid/view/View;

    .line 1748
    .line 1749
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1750
    .line 1751
    .line 1752
    move-result v8

    .line 1753
    if-ge v4, v8, :cond_3b

    .line 1754
    .line 1755
    move v4, v15

    .line 1756
    goto :goto_2e

    .line 1757
    :cond_3b
    move v4, v14

    .line 1758
    :goto_2e
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1759
    .line 1760
    .line 1761
    move v4, v6

    .line 1762
    goto :goto_2d

    .line 1763
    :cond_3c
    invoke-static {}, La/q3d;->p()V

    .line 1764
    .line 1765
    .line 1766
    throw v3

    .line 1767
    :cond_3d
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v1

    .line 1771
    move v2, v15

    .line 1772
    :goto_2f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1773
    .line 1774
    .line 1775
    move-result v4

    .line 1776
    if-eqz v4, :cond_41

    .line 1777
    .line 1778
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v4

    .line 1782
    add-int/lit8 v5, v2, 0x1

    .line 1783
    .line 1784
    if-ltz v2, :cond_40

    .line 1785
    .line 1786
    check-cast v4, Ljava/lang/String;

    .line 1787
    .line 1788
    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v2

    .line 1792
    check-cast v2, La/j6o0;

    .line 1793
    .line 1794
    if-nez v2, :cond_3f

    .line 1795
    .line 1796
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v2

    .line 1800
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v2

    .line 1804
    const v6, 0x7f0d05d4

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {v2, v6, v0, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v2

    .line 1811
    if-eqz v2, :cond_3e

    .line 1812
    .line 1813
    check-cast v2, Landroid/widget/TextView;

    .line 1814
    .line 1815
    new-instance v6, La/j6o0;

    .line 1816
    .line 1817
    invoke-direct {v6, v2, v2}, La/j6o0;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1818
    .line 1819
    .line 1820
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1821
    .line 1822
    .line 1823
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1824
    .line 1825
    .line 1826
    move-object v2, v6

    .line 1827
    goto :goto_30

    .line 1828
    :cond_3e
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 1829
    .line 1830
    .line 1831
    goto :goto_31

    .line 1832
    :cond_3f
    :goto_30
    iget-object v2, v2, La/j6o0;->b:Landroid/widget/TextView;

    .line 1833
    .line 1834
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1835
    .line 1836
    .line 1837
    move v2, v5

    .line 1838
    goto :goto_2f

    .line 1839
    :cond_40
    invoke-static {}, La/q3d;->p()V

    .line 1840
    .line 1841
    .line 1842
    throw v3

    .line 1843
    :cond_41
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1844
    .line 1845
    :goto_31
    return-object v3

    .line 1846
    :pswitch_11
    check-cast v0, La/qq20;

    .line 1847
    .line 1848
    check-cast v4, Ljava/util/List;

    .line 1849
    .line 1850
    check-cast v7, Landroid/content/Context;

    .line 1851
    .line 1852
    move-object/from16 v1, p1

    .line 1853
    .line 1854
    check-cast v1, La/h6o0;

    .line 1855
    .line 1856
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1857
    .line 1858
    .line 1859
    iget-object v2, v1, La/h6o0;->b:Landroid/widget/LinearLayout;

    .line 1860
    .line 1861
    iget-object v3, v0, La/qq20;->d:Ljava/util/ArrayList;

    .line 1862
    .line 1863
    invoke-static {v2, v3, v4}, La/mbc;->O(Landroid/widget/LinearLayout;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 1864
    .line 1865
    .line 1866
    iget-object v2, v1, La/h6o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1867
    .line 1868
    iget v3, v0, La/qq20;->c:I

    .line 1869
    .line 1870
    invoke-static {v3, v7}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v3

    .line 1874
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1875
    .line 1876
    .line 1877
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1878
    .line 1879
    iget-object v2, v1, La/h6o0;->c:Landroid/widget/ImageView;

    .line 1880
    .line 1881
    iget-object v3, v0, La/qq20;->f:Ljava/lang/String;

    .line 1882
    .line 1883
    invoke-static {v2, v3, v15, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1884
    .line 1885
    .line 1886
    iget-object v1, v1, La/h6o0;->d:Landroid/widget/TextView;

    .line 1887
    .line 1888
    iget-object v0, v0, La/qq20;->e:Ljava/lang/String;

    .line 1889
    .line 1890
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1891
    .line 1892
    .line 1893
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1894
    .line 1895
    return-object v0

    .line 1896
    :pswitch_12
    check-cast v0, La/kq20;

    .line 1897
    .line 1898
    check-cast v4, Ljava/util/List;

    .line 1899
    .line 1900
    check-cast v7, Landroid/content/Context;

    .line 1901
    .line 1902
    move-object/from16 v1, p1

    .line 1903
    .line 1904
    check-cast v1, La/g6o0;

    .line 1905
    .line 1906
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1907
    .line 1908
    .line 1909
    iget-object v2, v1, La/g6o0;->b:Landroid/widget/LinearLayout;

    .line 1910
    .line 1911
    iget-object v3, v0, La/kq20;->b:Ljava/util/ArrayList;

    .line 1912
    .line 1913
    invoke-static {v2, v3, v4}, La/kbc;->M(Landroid/widget/LinearLayout;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 1914
    .line 1915
    .line 1916
    iget-object v1, v1, La/g6o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1917
    .line 1918
    iget v0, v0, La/kq20;->a:I

    .line 1919
    .line 1920
    invoke-static {v0, v7}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v0

    .line 1924
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1925
    .line 1926
    .line 1927
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1928
    .line 1929
    return-object v0

    .line 1930
    :pswitch_13
    check-cast v0, Landroid/content/Context;

    .line 1931
    .line 1932
    check-cast v4, La/m8o0;

    .line 1933
    .line 1934
    check-cast v7, Ljava/util/List;

    .line 1935
    .line 1936
    move-object/from16 v1, p1

    .line 1937
    .line 1938
    check-cast v1, La/l8o0;

    .line 1939
    .line 1940
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1941
    .line 1942
    .line 1943
    iget-object v2, v1, La/l8o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1944
    .line 1945
    const v5, 0x7f080446

    .line 1946
    .line 1947
    .line 1948
    invoke-static {v5, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 1949
    .line 1950
    .line 1951
    move-result-object v0

    .line 1952
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1953
    .line 1954
    .line 1955
    iget-object v0, v1, La/l8o0;->b:Landroid/widget/LinearLayout;

    .line 1956
    .line 1957
    iget-object v1, v4, La/m8o0;->a:Ljava/util/ArrayList;

    .line 1958
    .line 1959
    new-instance v2, La/ihu0;

    .line 1960
    .line 1961
    invoke-direct {v2, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 1962
    .line 1963
    .line 1964
    invoke-virtual {v2}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v2

    .line 1968
    move v4, v15

    .line 1969
    :goto_32
    move-object v5, v2

    .line 1970
    check-cast v5, La/jhu0;

    .line 1971
    .line 1972
    invoke-virtual {v5}, La/jhu0;->hasNext()Z

    .line 1973
    .line 1974
    .line 1975
    move-result v6

    .line 1976
    if-eqz v6, :cond_44

    .line 1977
    .line 1978
    invoke-virtual {v5}, La/jhu0;->next()Ljava/lang/Object;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v5

    .line 1982
    add-int/lit8 v6, v4, 0x1

    .line 1983
    .line 1984
    if-ltz v4, :cond_43

    .line 1985
    .line 1986
    check-cast v5, Landroid/view/View;

    .line 1987
    .line 1988
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1989
    .line 1990
    .line 1991
    move-result v8

    .line 1992
    if-ge v4, v8, :cond_42

    .line 1993
    .line 1994
    move v4, v15

    .line 1995
    goto :goto_33

    .line 1996
    :cond_42
    move v4, v14

    .line 1997
    :goto_33
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1998
    .line 1999
    .line 2000
    move v4, v6

    .line 2001
    goto :goto_32

    .line 2002
    :cond_43
    invoke-static {}, La/q3d;->p()V

    .line 2003
    .line 2004
    .line 2005
    throw v3

    .line 2006
    :cond_44
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v1

    .line 2010
    :goto_34
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2011
    .line 2012
    .line 2013
    move-result v2

    .line 2014
    if-eqz v2, :cond_47

    .line 2015
    .line 2016
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v2

    .line 2020
    add-int/lit8 v4, v15, 0x1

    .line 2021
    .line 2022
    if-ltz v15, :cond_46

    .line 2023
    .line 2024
    check-cast v2, Ljava/lang/String;

    .line 2025
    .line 2026
    invoke-static {v15, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v5

    .line 2030
    check-cast v5, La/sth;

    .line 2031
    .line 2032
    if-nez v5, :cond_45

    .line 2033
    .line 2034
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v5

    .line 2038
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v5

    .line 2042
    invoke-static {v5, v0}, La/sth;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/sth;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v5

    .line 2046
    iget-object v6, v5, La/sth;->a:Landroid/widget/TextView;

    .line 2047
    .line 2048
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2049
    .line 2050
    .line 2051
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2052
    .line 2053
    .line 2054
    :cond_45
    iget-object v5, v5, La/sth;->b:Landroid/widget/TextView;

    .line 2055
    .line 2056
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2057
    .line 2058
    .line 2059
    move v15, v4

    .line 2060
    goto :goto_34

    .line 2061
    :cond_46
    invoke-static {}, La/q3d;->p()V

    .line 2062
    .line 2063
    .line 2064
    throw v3

    .line 2065
    :cond_47
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2066
    .line 2067
    return-object v0

    .line 2068
    :pswitch_14
    check-cast v0, Landroid/content/Context;

    .line 2069
    .line 2070
    check-cast v4, La/w5o0;

    .line 2071
    .line 2072
    check-cast v7, Ljava/util/List;

    .line 2073
    .line 2074
    move-object/from16 v1, p1

    .line 2075
    .line 2076
    check-cast v1, La/u5o0;

    .line 2077
    .line 2078
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2079
    .line 2080
    .line 2081
    iget-object v2, v1, La/u5o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2082
    .line 2083
    iget v5, v4, La/w5o0;->d:I

    .line 2084
    .line 2085
    invoke-static {v5, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2086
    .line 2087
    .line 2088
    move-result-object v0

    .line 2089
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2090
    .line 2091
    .line 2092
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 2093
    .line 2094
    iget-object v0, v1, La/u5o0;->c:Landroid/widget/ImageView;

    .line 2095
    .line 2096
    iget-object v2, v4, La/w5o0;->c:Ljava/lang/String;

    .line 2097
    .line 2098
    invoke-static {v0, v2, v15, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2099
    .line 2100
    .line 2101
    iget-object v0, v1, La/u5o0;->d:Landroid/widget/TextView;

    .line 2102
    .line 2103
    iget-object v2, v4, La/w5o0;->b:Ljava/lang/String;

    .line 2104
    .line 2105
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2106
    .line 2107
    .line 2108
    iget-object v0, v1, La/u5o0;->b:Landroid/widget/LinearLayout;

    .line 2109
    .line 2110
    iget-object v1, v4, La/w5o0;->e:Ljava/util/ArrayList;

    .line 2111
    .line 2112
    new-instance v2, La/ihu0;

    .line 2113
    .line 2114
    invoke-direct {v2, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 2115
    .line 2116
    .line 2117
    invoke-virtual {v2}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v2

    .line 2121
    move v4, v15

    .line 2122
    :goto_35
    move-object v5, v2

    .line 2123
    check-cast v5, La/jhu0;

    .line 2124
    .line 2125
    invoke-virtual {v5}, La/jhu0;->hasNext()Z

    .line 2126
    .line 2127
    .line 2128
    move-result v6

    .line 2129
    if-eqz v6, :cond_4a

    .line 2130
    .line 2131
    invoke-virtual {v5}, La/jhu0;->next()Ljava/lang/Object;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v5

    .line 2135
    add-int/lit8 v6, v4, 0x1

    .line 2136
    .line 2137
    if-ltz v4, :cond_49

    .line 2138
    .line 2139
    check-cast v5, Landroid/view/View;

    .line 2140
    .line 2141
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2142
    .line 2143
    .line 2144
    move-result v8

    .line 2145
    if-ge v4, v8, :cond_48

    .line 2146
    .line 2147
    move v4, v15

    .line 2148
    goto :goto_36

    .line 2149
    :cond_48
    move v4, v14

    .line 2150
    :goto_36
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2151
    .line 2152
    .line 2153
    move v4, v6

    .line 2154
    goto :goto_35

    .line 2155
    :cond_49
    invoke-static {}, La/q3d;->p()V

    .line 2156
    .line 2157
    .line 2158
    throw v3

    .line 2159
    :cond_4a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v1

    .line 2163
    :goto_37
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2164
    .line 2165
    .line 2166
    move-result v2

    .line 2167
    if-eqz v2, :cond_4d

    .line 2168
    .line 2169
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v2

    .line 2173
    add-int/lit8 v4, v15, 0x1

    .line 2174
    .line 2175
    if-ltz v15, :cond_4c

    .line 2176
    .line 2177
    check-cast v2, Ljava/lang/String;

    .line 2178
    .line 2179
    invoke-static {v15, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v5

    .line 2183
    check-cast v5, La/sth;

    .line 2184
    .line 2185
    if-nez v5, :cond_4b

    .line 2186
    .line 2187
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v5

    .line 2191
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v5

    .line 2195
    invoke-static {v5, v0}, La/sth;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/sth;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v5

    .line 2199
    iget-object v6, v5, La/sth;->a:Landroid/widget/TextView;

    .line 2200
    .line 2201
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2202
    .line 2203
    .line 2204
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2205
    .line 2206
    .line 2207
    :cond_4b
    iget-object v5, v5, La/sth;->b:Landroid/widget/TextView;

    .line 2208
    .line 2209
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2210
    .line 2211
    .line 2212
    move v15, v4

    .line 2213
    goto :goto_37

    .line 2214
    :cond_4c
    invoke-static {}, La/q3d;->p()V

    .line 2215
    .line 2216
    .line 2217
    throw v3

    .line 2218
    :cond_4d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2219
    .line 2220
    return-object v0

    .line 2221
    :pswitch_15
    check-cast v0, Landroid/content/Context;

    .line 2222
    .line 2223
    check-cast v4, La/v5o0;

    .line 2224
    .line 2225
    check-cast v7, Ljava/util/List;

    .line 2226
    .line 2227
    move-object/from16 v1, p1

    .line 2228
    .line 2229
    check-cast v1, La/t5o0;

    .line 2230
    .line 2231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2232
    .line 2233
    .line 2234
    iget-object v2, v1, La/t5o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2235
    .line 2236
    iget v5, v4, La/v5o0;->a:I

    .line 2237
    .line 2238
    invoke-static {v5, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v0

    .line 2242
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2243
    .line 2244
    .line 2245
    iget-object v0, v1, La/t5o0;->b:Landroid/widget/LinearLayout;

    .line 2246
    .line 2247
    iget-object v1, v4, La/v5o0;->b:Ljava/util/ArrayList;

    .line 2248
    .line 2249
    new-instance v2, La/ihu0;

    .line 2250
    .line 2251
    invoke-direct {v2, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 2252
    .line 2253
    .line 2254
    invoke-virtual {v2}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v2

    .line 2258
    move v4, v15

    .line 2259
    :goto_38
    move-object v5, v2

    .line 2260
    check-cast v5, La/jhu0;

    .line 2261
    .line 2262
    invoke-virtual {v5}, La/jhu0;->hasNext()Z

    .line 2263
    .line 2264
    .line 2265
    move-result v6

    .line 2266
    if-eqz v6, :cond_50

    .line 2267
    .line 2268
    invoke-virtual {v5}, La/jhu0;->next()Ljava/lang/Object;

    .line 2269
    .line 2270
    .line 2271
    move-result-object v5

    .line 2272
    add-int/lit8 v6, v4, 0x1

    .line 2273
    .line 2274
    if-ltz v4, :cond_4f

    .line 2275
    .line 2276
    check-cast v5, Landroid/view/View;

    .line 2277
    .line 2278
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2279
    .line 2280
    .line 2281
    move-result v8

    .line 2282
    if-ge v4, v8, :cond_4e

    .line 2283
    .line 2284
    move v4, v15

    .line 2285
    goto :goto_39

    .line 2286
    :cond_4e
    move v4, v14

    .line 2287
    :goto_39
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2288
    .line 2289
    .line 2290
    move v4, v6

    .line 2291
    goto :goto_38

    .line 2292
    :cond_4f
    invoke-static {}, La/q3d;->p()V

    .line 2293
    .line 2294
    .line 2295
    throw v3

    .line 2296
    :cond_50
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v1

    .line 2300
    :goto_3a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2301
    .line 2302
    .line 2303
    move-result v2

    .line 2304
    if-eqz v2, :cond_53

    .line 2305
    .line 2306
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v2

    .line 2310
    add-int/lit8 v4, v15, 0x1

    .line 2311
    .line 2312
    if-ltz v15, :cond_52

    .line 2313
    .line 2314
    check-cast v2, Ljava/lang/String;

    .line 2315
    .line 2316
    invoke-static {v15, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v5

    .line 2320
    check-cast v5, La/sth;

    .line 2321
    .line 2322
    if-nez v5, :cond_51

    .line 2323
    .line 2324
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v5

    .line 2328
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v5

    .line 2332
    invoke-static {v5, v0}, La/sth;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/sth;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v5

    .line 2336
    iget-object v6, v5, La/sth;->a:Landroid/widget/TextView;

    .line 2337
    .line 2338
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2339
    .line 2340
    .line 2341
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2342
    .line 2343
    .line 2344
    :cond_51
    iget-object v5, v5, La/sth;->b:Landroid/widget/TextView;

    .line 2345
    .line 2346
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2347
    .line 2348
    .line 2349
    move v15, v4

    .line 2350
    goto :goto_3a

    .line 2351
    :cond_52
    invoke-static {}, La/q3d;->p()V

    .line 2352
    .line 2353
    .line 2354
    throw v3

    .line 2355
    :cond_53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2356
    .line 2357
    return-object v0

    .line 2358
    :pswitch_16
    check-cast v0, Landroid/content/Context;

    .line 2359
    .line 2360
    check-cast v4, La/r0o0;

    .line 2361
    .line 2362
    check-cast v7, Ljava/util/List;

    .line 2363
    .line 2364
    move-object/from16 v1, p1

    .line 2365
    .line 2366
    check-cast v1, La/p0o0;

    .line 2367
    .line 2368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2369
    .line 2370
    .line 2371
    iget-object v2, v1, La/p0o0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2372
    .line 2373
    const v5, 0x7f080415

    .line 2374
    .line 2375
    .line 2376
    invoke-static {v5, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2377
    .line 2378
    .line 2379
    move-result-object v0

    .line 2380
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2381
    .line 2382
    .line 2383
    iget-object v0, v1, La/p0o0;->b:Landroid/widget/LinearLayout;

    .line 2384
    .line 2385
    iget-object v1, v4, La/r0o0;->a:Ljava/util/ArrayList;

    .line 2386
    .line 2387
    new-instance v2, La/ihu0;

    .line 2388
    .line 2389
    invoke-direct {v2, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 2390
    .line 2391
    .line 2392
    invoke-virtual {v2}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 2393
    .line 2394
    .line 2395
    move-result-object v2

    .line 2396
    move v4, v15

    .line 2397
    :goto_3b
    move-object v5, v2

    .line 2398
    check-cast v5, La/jhu0;

    .line 2399
    .line 2400
    invoke-virtual {v5}, La/jhu0;->hasNext()Z

    .line 2401
    .line 2402
    .line 2403
    move-result v6

    .line 2404
    if-eqz v6, :cond_56

    .line 2405
    .line 2406
    invoke-virtual {v5}, La/jhu0;->next()Ljava/lang/Object;

    .line 2407
    .line 2408
    .line 2409
    move-result-object v5

    .line 2410
    add-int/lit8 v6, v4, 0x1

    .line 2411
    .line 2412
    if-ltz v4, :cond_55

    .line 2413
    .line 2414
    check-cast v5, Landroid/view/View;

    .line 2415
    .line 2416
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2417
    .line 2418
    .line 2419
    move-result v8

    .line 2420
    if-ge v4, v8, :cond_54

    .line 2421
    .line 2422
    move v4, v15

    .line 2423
    goto :goto_3c

    .line 2424
    :cond_54
    move v4, v14

    .line 2425
    :goto_3c
    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2426
    .line 2427
    .line 2428
    move v4, v6

    .line 2429
    goto :goto_3b

    .line 2430
    :cond_55
    invoke-static {}, La/q3d;->p()V

    .line 2431
    .line 2432
    .line 2433
    throw v3

    .line 2434
    :cond_56
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v1

    .line 2438
    move v2, v15

    .line 2439
    :goto_3d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2440
    .line 2441
    .line 2442
    move-result v4

    .line 2443
    if-eqz v4, :cond_5a

    .line 2444
    .line 2445
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v4

    .line 2449
    add-int/lit8 v5, v2, 0x1

    .line 2450
    .line 2451
    if-ltz v2, :cond_59

    .line 2452
    .line 2453
    check-cast v4, Ljava/lang/String;

    .line 2454
    .line 2455
    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v2

    .line 2459
    check-cast v2, La/q0o0;

    .line 2460
    .line 2461
    if-nez v2, :cond_58

    .line 2462
    .line 2463
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2464
    .line 2465
    .line 2466
    move-result-object v2

    .line 2467
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v2

    .line 2471
    const v6, 0x7f0d05ac

    .line 2472
    .line 2473
    .line 2474
    invoke-virtual {v2, v6, v0, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 2475
    .line 2476
    .line 2477
    move-result-object v2

    .line 2478
    if-eqz v2, :cond_57

    .line 2479
    .line 2480
    check-cast v2, Landroid/widget/TextView;

    .line 2481
    .line 2482
    new-instance v6, La/q0o0;

    .line 2483
    .line 2484
    invoke-direct {v6, v2, v2}, La/q0o0;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 2485
    .line 2486
    .line 2487
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2488
    .line 2489
    .line 2490
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2491
    .line 2492
    .line 2493
    move-object v2, v6

    .line 2494
    goto :goto_3e

    .line 2495
    :cond_57
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 2496
    .line 2497
    .line 2498
    goto :goto_3f

    .line 2499
    :cond_58
    :goto_3e
    iget-object v2, v2, La/q0o0;->b:Landroid/widget/TextView;

    .line 2500
    .line 2501
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2502
    .line 2503
    .line 2504
    move v2, v5

    .line 2505
    goto :goto_3d

    .line 2506
    :cond_59
    invoke-static {}, La/q3d;->p()V

    .line 2507
    .line 2508
    .line 2509
    throw v3

    .line 2510
    :cond_5a
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2511
    .line 2512
    :goto_3f
    return-object v3

    .line 2513
    :pswitch_17
    check-cast v0, La/i43;

    .line 2514
    .line 2515
    check-cast v4, La/k43;

    .line 2516
    .line 2517
    check-cast v7, La/o43;

    .line 2518
    .line 2519
    move-object/from16 v1, p1

    .line 2520
    .line 2521
    check-cast v1, La/ou90;

    .line 2522
    .line 2523
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2524
    .line 2525
    .line 2526
    iget-object v2, v7, La/o43;->a:La/j43;

    .line 2527
    .line 2528
    iget-object v2, v2, La/j43;->c:La/c0d;

    .line 2529
    .line 2530
    iget v3, v0, La/i43;->a:I

    .line 2531
    .line 2532
    iget v5, v0, La/i43;->j:I

    .line 2533
    .line 2534
    iget-object v6, v0, La/i43;->e:La/pu90;

    .line 2535
    .line 2536
    iget v7, v0, La/i43;->b:I

    .line 2537
    .line 2538
    iget v8, v0, La/i43;->g:I

    .line 2539
    .line 2540
    sub-int v8, v3, v8

    .line 2541
    .line 2542
    iget-object v9, v0, La/i43;->c:La/pu90;

    .line 2543
    .line 2544
    if-eqz v9, :cond_5b

    .line 2545
    .line 2546
    div-int/lit8 v10, v7, 0x2

    .line 2547
    .line 2548
    iget v11, v0, La/i43;->k:I

    .line 2549
    .line 2550
    const/16 v18, 0x2

    .line 2551
    .line 2552
    div-int/lit8 v11, v11, 0x2

    .line 2553
    .line 2554
    sub-int/2addr v10, v11

    .line 2555
    const/4 v11, 0x0

    .line 2556
    invoke-virtual {v1, v9, v8, v10, v11}, La/ou90;->m(La/pu90;IIF)V

    .line 2557
    .line 2558
    .line 2559
    :cond_5b
    invoke-interface {v4}, La/k43;->k()F

    .line 2560
    .line 2561
    .line 2562
    move-result v9

    .line 2563
    invoke-interface {v1}, La/w6k;->getDensity()F

    .line 2564
    .line 2565
    .line 2566
    move-result v10

    .line 2567
    mul-float/2addr v10, v9

    .line 2568
    float-to-int v9, v10

    .line 2569
    sub-int v9, v8, v9

    .line 2570
    .line 2571
    iget v10, v0, La/i43;->i:I

    .line 2572
    .line 2573
    sub-int/2addr v9, v10

    .line 2574
    if-eqz v6, :cond_5c

    .line 2575
    .line 2576
    div-int/lit8 v10, v7, 0x2

    .line 2577
    .line 2578
    iget v11, v0, La/i43;->m:I

    .line 2579
    .line 2580
    const/16 v18, 0x2

    .line 2581
    .line 2582
    div-int/lit8 v11, v11, 0x2

    .line 2583
    .line 2584
    sub-int/2addr v10, v11

    .line 2585
    const/4 v11, 0x0

    .line 2586
    invoke-virtual {v1, v6, v9, v10, v11}, La/ou90;->m(La/pu90;IIF)V

    .line 2587
    .line 2588
    .line 2589
    :cond_5c
    sget-object v10, La/c0d;->f:La/c0d;

    .line 2590
    .line 2591
    if-ne v2, v10, :cond_5d

    .line 2592
    .line 2593
    sub-int/2addr v3, v5

    .line 2594
    goto :goto_40

    .line 2595
    :cond_5d
    invoke-interface {v4}, La/k43;->k()F

    .line 2596
    .line 2597
    .line 2598
    move-result v2

    .line 2599
    invoke-interface {v1}, La/w6k;->getDensity()F

    .line 2600
    .line 2601
    .line 2602
    move-result v3

    .line 2603
    mul-float/2addr v3, v2

    .line 2604
    float-to-int v2, v3

    .line 2605
    sub-int/2addr v8, v2

    .line 2606
    sub-int v3, v8, v5

    .line 2607
    .line 2608
    :goto_40
    iget-object v2, v0, La/i43;->f:La/pu90;

    .line 2609
    .line 2610
    if-eqz v2, :cond_5e

    .line 2611
    .line 2612
    div-int/lit8 v5, v7, 0x2

    .line 2613
    .line 2614
    iget v8, v0, La/i43;->n:I

    .line 2615
    .line 2616
    const/16 v18, 0x2

    .line 2617
    .line 2618
    div-int/lit8 v8, v8, 0x2

    .line 2619
    .line 2620
    sub-int/2addr v5, v8

    .line 2621
    const/4 v11, 0x0

    .line 2622
    invoke-virtual {v1, v2, v3, v5, v11}, La/ou90;->m(La/pu90;IIF)V

    .line 2623
    .line 2624
    .line 2625
    :cond_5e
    if-eqz v6, :cond_5f

    .line 2626
    .line 2627
    goto :goto_41

    .line 2628
    :cond_5f
    move v9, v3

    .line 2629
    :goto_41
    invoke-interface {v4}, La/k43;->h()F

    .line 2630
    .line 2631
    .line 2632
    move-result v2

    .line 2633
    invoke-interface {v1}, La/w6k;->getDensity()F

    .line 2634
    .line 2635
    .line 2636
    move-result v3

    .line 2637
    mul-float/2addr v3, v2

    .line 2638
    float-to-int v2, v3

    .line 2639
    sub-int/2addr v9, v2

    .line 2640
    iget v2, v0, La/i43;->h:I

    .line 2641
    .line 2642
    sub-int/2addr v9, v2

    .line 2643
    iget-object v2, v0, La/i43;->d:La/pu90;

    .line 2644
    .line 2645
    if-eqz v2, :cond_60

    .line 2646
    .line 2647
    const/16 v18, 0x2

    .line 2648
    .line 2649
    div-int/lit8 v7, v7, 0x2

    .line 2650
    .line 2651
    iget v0, v0, La/i43;->l:I

    .line 2652
    .line 2653
    div-int/lit8 v0, v0, 0x2

    .line 2654
    .line 2655
    sub-int/2addr v7, v0

    .line 2656
    const/4 v11, 0x0

    .line 2657
    invoke-virtual {v1, v2, v9, v7, v11}, La/ou90;->m(La/pu90;IIF)V

    .line 2658
    .line 2659
    .line 2660
    :cond_60
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2661
    .line 2662
    return-object v0

    .line 2663
    :pswitch_18
    check-cast v0, La/htr;

    .line 2664
    .line 2665
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 2666
    .line 2667
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2668
    .line 2669
    move-object/from16 v1, p1

    .line 2670
    .line 2671
    check-cast v1, La/hcz;

    .line 2672
    .line 2673
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2674
    .line 2675
    .line 2676
    instance-of v5, v0, La/ftr;

    .line 2677
    .line 2678
    if-eqz v5, :cond_61

    .line 2679
    .line 2680
    check-cast v0, La/ftr;

    .line 2681
    .line 2682
    iget-object v0, v0, La/ftr;->a:La/a4x;

    .line 2683
    .line 2684
    new-instance v3, La/aim;

    .line 2685
    .line 2686
    const/16 v5, 0x13

    .line 2687
    .line 2688
    invoke-direct {v3, v5}, La/aim;-><init>(B)V

    .line 2689
    .line 2690
    .line 2691
    new-instance v5, La/aim;

    .line 2692
    .line 2693
    const/16 v8, 0x14

    .line 2694
    .line 2695
    invoke-direct {v5, v8}, La/aim;-><init>(B)V

    .line 2696
    .line 2697
    .line 2698
    invoke-static {v0, v3}, La/xdx;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 2699
    .line 2700
    .line 2701
    move-result-object v3

    .line 2702
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2703
    .line 2704
    .line 2705
    move-result v8

    .line 2706
    new-instance v9, La/v2m;

    .line 2707
    .line 2708
    invoke-direct {v9, v3, v6}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 2709
    .line 2710
    .line 2711
    new-instance v3, La/ctl;

    .line 2712
    .line 2713
    const/16 v6, 0x10

    .line 2714
    .line 2715
    invoke-direct {v3, v5, v0, v6}, La/ctl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2716
    .line 2717
    .line 2718
    new-instance v5, La/c8;

    .line 2719
    .line 2720
    const/16 v6, 0x16

    .line 2721
    .line 2722
    invoke-direct {v5, v0, v4, v7, v6}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 2723
    .line 2724
    .line 2725
    new-instance v0, La/ugd;

    .line 2726
    .line 2727
    const v4, -0x4e295cff

    .line 2728
    .line 2729
    .line 2730
    invoke-direct {v0, v4, v2, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2731
    .line 2732
    .line 2733
    invoke-virtual {v1, v8, v9, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2734
    .line 2735
    .line 2736
    goto :goto_42

    .line 2737
    :cond_61
    instance-of v0, v0, La/gtr;

    .line 2738
    .line 2739
    if-eqz v0, :cond_63

    .line 2740
    .line 2741
    invoke-static {}, La/uzb;->i0()I

    .line 2742
    .line 2743
    .line 2744
    move-result v0

    .line 2745
    if-ne v0, v12, :cond_62

    .line 2746
    .line 2747
    const/16 v14, 0xc

    .line 2748
    .line 2749
    :cond_62
    move/from16 v18, v14

    .line 2750
    .line 2751
    sget-object v21, La/jd8;->c:La/ugd;

    .line 2752
    .line 2753
    const/16 v22, 0x6

    .line 2754
    .line 2755
    const/16 v19, 0x0

    .line 2756
    .line 2757
    const/16 v20, 0x0

    .line 2758
    .line 2759
    move-object/from16 v17, v1

    .line 2760
    .line 2761
    invoke-static/range {v17 .. v22}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 2762
    .line 2763
    .line 2764
    :goto_42
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2765
    .line 2766
    goto :goto_43

    .line 2767
    :cond_63
    invoke-static {}, La/t9f;->b()V

    .line 2768
    .line 2769
    .line 2770
    :goto_43
    return-object v3

    .line 2771
    :pswitch_19
    check-cast v0, La/e2d;

    .line 2772
    .line 2773
    check-cast v4, La/pm80;

    .line 2774
    .line 2775
    check-cast v7, La/pm80;

    .line 2776
    .line 2777
    move-object/from16 v8, p1

    .line 2778
    .line 2779
    check-cast v8, La/g7z;

    .line 2780
    .line 2781
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2782
    .line 2783
    .line 2784
    iget-object v0, v0, La/e2d;->a:La/oyq0;

    .line 2785
    .line 2786
    invoke-virtual {v0}, La/oyq0;->a()F

    .line 2787
    .line 2788
    .line 2789
    move-result v0

    .line 2790
    const/high16 v1, 0x3f800000    # 1.0f

    .line 2791
    .line 2792
    cmpg-float v0, v0, v1

    .line 2793
    .line 2794
    if-nez v0, :cond_64

    .line 2795
    .line 2796
    goto :goto_44

    .line 2797
    :cond_64
    iget-object v0, v8, La/g7z;->a:La/a6a;

    .line 2798
    .line 2799
    invoke-interface {v0}, La/fhl;->d()J

    .line 2800
    .line 2801
    .line 2802
    move-result-wide v1

    .line 2803
    invoke-static {v4, v8, v1, v2}, La/pm80;->h(La/pm80;La/fhl;J)V

    .line 2804
    .line 2805
    .line 2806
    invoke-virtual {v8}, La/g7z;->a()V

    .line 2807
    .line 2808
    .line 2809
    invoke-interface {v0}, La/fhl;->d()J

    .line 2810
    .line 2811
    .line 2812
    move-result-wide v1

    .line 2813
    invoke-static {v7, v8, v1, v2}, La/pm80;->h(La/pm80;La/fhl;J)V

    .line 2814
    .line 2815
    .line 2816
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 2817
    .line 2818
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 2819
    .line 2820
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack20-0d7_KjU()J

    .line 2821
    .line 2822
    .line 2823
    move-result-wide v9

    .line 2824
    invoke-interface {v0}, La/fhl;->d()J

    .line 2825
    .line 2826
    .line 2827
    move-result-wide v13

    .line 2828
    const/16 v18, 0x0

    .line 2829
    .line 2830
    const/16 v19, 0x7a

    .line 2831
    .line 2832
    const-wide/16 v11, 0x0

    .line 2833
    .line 2834
    const/4 v15, 0x0

    .line 2835
    const/16 v16, 0x0

    .line 2836
    .line 2837
    const/16 v17, 0x0

    .line 2838
    .line 2839
    invoke-static/range {v8 .. v19}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 2840
    .line 2841
    .line 2842
    :goto_44
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2843
    .line 2844
    return-object v0

    .line 2845
    :pswitch_1a
    check-cast v0, La/a4x;

    .line 2846
    .line 2847
    check-cast v4, La/r3n;

    .line 2848
    .line 2849
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2850
    .line 2851
    move-object/from16 v1, p1

    .line 2852
    .line 2853
    check-cast v1, La/hcz;

    .line 2854
    .line 2855
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2856
    .line 2857
    .line 2858
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2859
    .line 2860
    .line 2861
    move-result v5

    .line 2862
    new-instance v6, La/v2m;

    .line 2863
    .line 2864
    invoke-direct {v6, v0, v8}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 2865
    .line 2866
    .line 2867
    new-instance v8, La/c8;

    .line 2868
    .line 2869
    const/16 v9, 0x15

    .line 2870
    .line 2871
    invoke-direct {v8, v0, v4, v7, v9}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 2872
    .line 2873
    .line 2874
    new-instance v0, La/ugd;

    .line 2875
    .line 2876
    const v4, 0x2fd4df92

    .line 2877
    .line 2878
    .line 2879
    invoke-direct {v0, v4, v2, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2880
    .line 2881
    .line 2882
    invoke-virtual {v1, v5, v3, v6, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2883
    .line 2884
    .line 2885
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2886
    .line 2887
    return-object v0

    .line 2888
    :pswitch_1b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2889
    .line 2890
    check-cast v0, La/n0x;

    .line 2891
    .line 2892
    check-cast v4, La/pz40;

    .line 2893
    .line 2894
    move-object/from16 v1, p1

    .line 2895
    .line 2896
    check-cast v1, La/lz3;

    .line 2897
    .line 2898
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2899
    .line 2900
    .line 2901
    invoke-interface {v4, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 2902
    .line 2903
    .line 2904
    instance-of v1, v1, La/kz3;

    .line 2905
    .line 2906
    if-eqz v1, :cond_65

    .line 2907
    .line 2908
    if-eqz v7, :cond_65

    .line 2909
    .line 2910
    iget-object v0, v0, La/n0x;->a:Ljava/lang/String;

    .line 2911
    .line 2912
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2913
    .line 2914
    .line 2915
    :cond_65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2916
    .line 2917
    return-object v0

    .line 2918
    :pswitch_1c
    check-cast v0, La/k8m;

    .line 2919
    .line 2920
    check-cast v4, La/uzb;

    .line 2921
    .line 2922
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2923
    .line 2924
    move-object/from16 v1, p1

    .line 2925
    .line 2926
    check-cast v1, La/hcz;

    .line 2927
    .line 2928
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2929
    .line 2930
    .line 2931
    check-cast v0, La/i8m;

    .line 2932
    .line 2933
    iget-object v0, v0, La/i8m;->a:La/a4x;

    .line 2934
    .line 2935
    new-instance v3, La/f4m;

    .line 2936
    .line 2937
    const/4 v10, 0x6

    .line 2938
    invoke-direct {v3, v10}, La/f4m;-><init>(B)V

    .line 2939
    .line 2940
    .line 2941
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 2942
    .line 2943
    .line 2944
    move-result v5

    .line 2945
    new-instance v6, La/ctl;

    .line 2946
    .line 2947
    invoke-direct {v6, v3, v0, v14}, La/ctl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2948
    .line 2949
    .line 2950
    new-instance v3, La/wl0;

    .line 2951
    .line 2952
    const/16 v8, 0x1b

    .line 2953
    .line 2954
    invoke-direct {v3, v0, v8}, La/wl0;-><init>(La/a4x;B)V

    .line 2955
    .line 2956
    .line 2957
    new-instance v8, La/c8;

    .line 2958
    .line 2959
    const/16 v10, 0x13

    .line 2960
    .line 2961
    invoke-direct {v8, v0, v4, v7, v10}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 2962
    .line 2963
    .line 2964
    new-instance v0, La/ugd;

    .line 2965
    .line 2966
    invoke-direct {v0, v9, v2, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2967
    .line 2968
    .line 2969
    invoke-virtual {v1, v5, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2970
    .line 2971
    .line 2972
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2973
    .line 2974
    return-object v0

    .line 2975
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
