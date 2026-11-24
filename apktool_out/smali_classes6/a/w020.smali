.class public final synthetic La/w020;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f120;


# direct methods
.method public synthetic constructor <init>(La/f120;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w020;->a:B

    iput-object p1, p0, La/w020;->b:La/f120;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/w020;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v0, v0, La/w020;->b:La/f120;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/k0w0;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, v0, La/f120;->J:La/s2m0;

    .line 26
    .line 27
    check-cast v2, La/v020;

    .line 28
    .line 29
    iget-object v2, v2, La/v020;->i:La/ixs0;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, La/ixs0;->a:La/znp0;

    .line 34
    .line 35
    iget-boolean v2, v2, La/znp0;->f:Z

    .line 36
    .line 37
    if-ne v2, v4, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, La/v020;

    .line 44
    .line 45
    iget-object v2, v2, La/v020;->i:La/ixs0;

    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    iget-object v2, v2, La/ixs0;->b:La/znp0;

    .line 50
    .line 51
    iget-boolean v2, v2, La/znp0;->f:Z

    .line 52
    .line 53
    if-ne v2, v4, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, La/v020;

    .line 60
    .line 61
    iget-object v0, v0, La/v020;->f:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v2, Lorg/xplatform/statistic/tennis/impl/player_menu/presentation/screen/PlayersMenuScreen;

    .line 67
    .line 68
    invoke-direct {v2, v0}, Lorg/xplatform/statistic/tennis/impl/player_menu/presentation/screen/PlayersMenuScreen;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/v020;

    .line 77
    .line 78
    iget-object v0, v0, La/v020;->f:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v2, Lorg/xplatform/statistic/tennis/impl/player_menu/presentation/screen/PlayersStatisticScreen;

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-direct {v2, v0, v3}, Lorg/xplatform/statistic/tennis/impl/player_menu/presentation/screen/PlayersStatisticScreen;-><init>(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    :goto_0
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 90
    .line 91
    .line 92
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_0
    move-object/from16 v1, p1

    .line 96
    .line 97
    check-cast v1, Ljava/lang/Throwable;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    instance-of v1, v1, La/ff5;

    .line 103
    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    new-instance v1, La/gm10;

    .line 107
    .line 108
    const/16 v2, 0x12

    .line 109
    .line 110
    invoke-direct {v1, v2}, La/gm10;-><init>(B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    sget-object v1, La/jam0;->c:La/jam0;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, La/f120;->M(La/jam0;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v1

    .line 123
    new-instance v3, La/a21;

    .line 124
    .line 125
    const/16 v4, 0x1c

    .line 126
    .line 127
    invoke-direct {v3, v4, v1, v2}, La/a21;-><init>(BJ)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_1
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, Ljava/lang/Throwable;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    instance-of v1, v1, La/ff5;

    .line 144
    .line 145
    if-eqz v1, :cond_2

    .line 146
    .line 147
    new-instance v1, La/vam0;

    .line 148
    .line 149
    iget-object v2, v0, La/f120;->e0:La/ocl;

    .line 150
    .line 151
    sget-object v4, La/pdm;->c:La/pdm;

    .line 152
    .line 153
    sget-object v3, La/pb10;->r1:La/pb10;

    .line 154
    .line 155
    const-wide/16 v11, 0x0

    .line 156
    .line 157
    const/16 v13, 0x3dc

    .line 158
    .line 159
    const/4 v5, 0x0

    .line 160
    const/4 v6, 0x0

    .line 161
    const v7, 0x7f130674

    .line 162
    .line 163
    .line 164
    const/4 v8, 0x0

    .line 165
    const-wide/16 v9, 0x0

    .line 166
    .line 167
    invoke-static/range {v2 .. v13}, La/ocl;->b(La/ocl;La/pb10;La/pdm;IIIIJJI)La/mdm;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-direct {v1, v2}, La/vam0;-><init>(La/mdm;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_2
    sget-object v1, La/jam0;->a:La/jam0;

    .line 176
    .line 177
    invoke-virtual {v0, v1}, La/f120;->O(La/jam0;)La/vam0;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    :goto_2
    new-instance v2, La/x020;

    .line 182
    .line 183
    const/16 v3, 0x9

    .line 184
    .line 185
    invoke-direct {v2, v1, v3}, La/x020;-><init>(La/vam0;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 189
    .line 190
    .line 191
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object v0

    .line 194
    :pswitch_2
    move-object/from16 v1, p1

    .line 195
    .line 196
    check-cast v1, Ljava/lang/Throwable;

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    sget-object v1, La/jam0;->e:La/jam0;

    .line 202
    .line 203
    invoke-virtual {v0, v1}, La/f120;->O(La/jam0;)La/vam0;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    new-instance v2, La/x020;

    .line 208
    .line 209
    invoke-direct {v2, v1, v3}, La/x020;-><init>(La/vam0;B)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 213
    .line 214
    .line 215
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_3
    move-object/from16 v1, p1

    .line 219
    .line 220
    check-cast v1, La/k0w0;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object v2, v0, La/f120;->v:La/rl70;

    .line 226
    .line 227
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    check-cast v5, La/v020;

    .line 232
    .line 233
    iget-object v5, v5, La/v020;->h:La/xqj0;

    .line 234
    .line 235
    iget-object v5, v5, La/xqj0;->l:Ljava/util/List;

    .line 236
    .line 237
    new-instance v6, Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-static {v5, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 244
    .line 245
    .line 246
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-eqz v5, :cond_3

    .line 255
    .line 256
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    check-cast v5, La/b9a0;

    .line 261
    .line 262
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    new-instance v7, La/e9a0;

    .line 266
    .line 267
    iget-object v8, v5, La/b9a0;->a:Ljava/lang/String;

    .line 268
    .line 269
    iget-object v9, v5, La/b9a0;->f:Ljava/lang/String;

    .line 270
    .line 271
    iget-object v5, v5, La/b9a0;->b:Ljava/lang/String;

    .line 272
    .line 273
    invoke-direct {v7, v8, v9, v5}, La/e9a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_3
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    check-cast v3, La/v020;

    .line 285
    .line 286
    iget-object v11, v3, La/v020;->f:Ljava/lang/String;

    .line 287
    .line 288
    iget-wide v9, v0, La/f120;->p:J

    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-ne v0, v4, :cond_4

    .line 298
    .line 299
    new-instance v7, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 300
    .line 301
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    check-cast v0, La/e9a0;

    .line 306
    .line 307
    iget-object v8, v0, La/e9a0;->a:Ljava/lang/String;

    .line 308
    .line 309
    sget-object v12, La/oaa0;->b:La/oaa0;

    .line 310
    .line 311
    invoke-direct/range {v7 .. v12}, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;-><init>(Ljava/lang/String;JLjava/lang/String;La/oaa0;)V

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_4
    new-instance v7, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/RefereesListScreen;

    .line 316
    .line 317
    invoke-direct {v7, v11, v9, v10}, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/RefereesListScreen;-><init>(Ljava/lang/String;J)V

    .line 318
    .line 319
    .line 320
    :goto_4
    invoke-virtual {v1, v7}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 321
    .line 322
    .line 323
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object v0

    .line 326
    :pswitch_4
    move-object/from16 v1, p1

    .line 327
    .line 328
    check-cast v1, Ljava/lang/Throwable;

    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    iget-object v2, v0, La/f120;->t:La/duj;

    .line 334
    .line 335
    new-instance v3, La/k110;

    .line 336
    .line 337
    const/16 v4, 0xc

    .line 338
    .line 339
    invoke-direct {v3, v0, v1, v4}, La/k110;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 343
    .line 344
    .line 345
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    return-object v0

    .line 348
    :pswitch_5
    move-object/from16 v1, p1

    .line 349
    .line 350
    check-cast v1, La/k0w0;

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    iget-object v2, v0, La/f120;->T:La/atz;

    .line 356
    .line 357
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    check-cast v3, La/v020;

    .line 362
    .line 363
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 364
    .line 365
    iget-wide v4, v0, La/f120;->p:J

    .line 366
    .line 367
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    new-instance v0, Lorg/xplatform/statistic/news/presenation/screens/StatisticsNewsScreen;

    .line 371
    .line 372
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/news/presenation/screens/StatisticsNewsScreen;-><init>(Ljava/lang/String;J)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 376
    .line 377
    .line 378
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_6
    move-object/from16 v1, p1

    .line 382
    .line 383
    check-cast v1, La/k0w0;

    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    iget-object v2, v0, La/f120;->Y:La/uuz;

    .line 389
    .line 390
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    check-cast v3, La/v020;

    .line 395
    .line 396
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 397
    .line 398
    iget-wide v4, v0, La/f120;->p:J

    .line 399
    .line 400
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    check-cast v0, La/v020;

    .line 405
    .line 406
    iget-object v0, v0, La/v020;->o:La/na00;

    .line 407
    .line 408
    iget v0, v0, La/na00;->b:I

    .line 409
    .line 410
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    new-instance v2, Lorg/xplatform/statistic/lineup/presentation/LineUpScreen;

    .line 414
    .line 415
    invoke-direct {v2, v3, v4, v5, v0}, Lorg/xplatform/statistic/lineup/presentation/LineUpScreen;-><init>(Ljava/lang/String;JI)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 419
    .line 420
    .line 421
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 422
    .line 423
    return-object v0

    .line 424
    :pswitch_7
    move-object/from16 v1, p1

    .line 425
    .line 426
    check-cast v1, La/k0w0;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    iget-object v2, v0, La/f120;->W:La/ddk;

    .line 432
    .line 433
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    check-cast v3, La/v020;

    .line 438
    .line 439
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 440
    .line 441
    iget-wide v4, v0, La/f120;->p:J

    .line 442
    .line 443
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    new-instance v0, Lorg/xplatform/statistic/game_events/presentation/screen/GameEventsScreen;

    .line 447
    .line 448
    invoke-direct {v0, v4, v5, v3}, Lorg/xplatform/statistic/game_events/presentation/screen/GameEventsScreen;-><init>(JLjava/lang/String;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 452
    .line 453
    .line 454
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 455
    .line 456
    return-object v0

    .line 457
    :pswitch_8
    move-object/from16 v1, p1

    .line 458
    .line 459
    check-cast v1, La/k0w0;

    .line 460
    .line 461
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    iget-object v2, v0, La/f120;->V:La/nek;

    .line 465
    .line 466
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    check-cast v3, La/v020;

    .line 471
    .line 472
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 473
    .line 474
    iget-wide v4, v0, La/f120;->p:J

    .line 475
    .line 476
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    new-instance v0, Lorg/xplatform/statistic/forecast/presentation/screen/ForecastStatisticScreen;

    .line 480
    .line 481
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/forecast/presentation/screen/ForecastStatisticScreen;-><init>(Ljava/lang/String;J)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 485
    .line 486
    .line 487
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 488
    .line 489
    return-object v0

    .line 490
    :pswitch_9
    move-object/from16 v1, p1

    .line 491
    .line 492
    check-cast v1, La/k0w0;

    .line 493
    .line 494
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    iget-object v2, v0, La/f120;->v:La/rl70;

    .line 498
    .line 499
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    check-cast v3, La/v020;

    .line 504
    .line 505
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 506
    .line 507
    iget-wide v4, v0, La/f120;->p:J

    .line 508
    .line 509
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    new-instance v0, Lorg/xplatform/statistic/player/impl/player/top_players/presentation/screens/TopPlayersStatisticScreen;

    .line 513
    .line 514
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/player/impl/player/top_players/presentation/screens/TopPlayersStatisticScreen;-><init>(Ljava/lang/String;J)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 518
    .line 519
    .line 520
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 521
    .line 522
    return-object v0

    .line 523
    :pswitch_a
    move-object/from16 v1, p1

    .line 524
    .line 525
    check-cast v1, Ljava/lang/Throwable;

    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    sget-object v1, La/jam0;->b:La/jam0;

    .line 531
    .line 532
    invoke-virtual {v0, v1}, La/f120;->O(La/jam0;)La/vam0;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    new-instance v2, La/x020;

    .line 537
    .line 538
    const/16 v3, 0x8

    .line 539
    .line 540
    invoke-direct {v2, v1, v3}, La/x020;-><init>(La/vam0;B)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 544
    .line 545
    .line 546
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object v0

    .line 549
    :pswitch_b
    move-object/from16 v1, p1

    .line 550
    .line 551
    check-cast v1, La/k0w0;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    iget-object v2, v0, La/f120;->R:La/gl5;

    .line 557
    .line 558
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    check-cast v3, La/v020;

    .line 563
    .line 564
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 565
    .line 566
    iget-wide v4, v0, La/f120;->p:J

    .line 567
    .line 568
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    new-instance v0, Lorg/xplatform/statistic/champ_statistic/presentation/screens/ChampStatisticScreen;

    .line 572
    .line 573
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/champ_statistic/presentation/screens/ChampStatisticScreen;-><init>(Ljava/lang/String;J)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 577
    .line 578
    .line 579
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 580
    .line 581
    return-object v0

    .line 582
    :pswitch_c
    move-object/from16 v1, p1

    .line 583
    .line 584
    check-cast v1, Ljava/lang/Throwable;

    .line 585
    .line 586
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    instance-of v1, v1, La/el50;

    .line 590
    .line 591
    if-eqz v1, :cond_6

    .line 592
    .line 593
    iget-object v1, v0, La/f120;->h0:La/bby;

    .line 594
    .line 595
    if-eqz v1, :cond_5

    .line 596
    .line 597
    invoke-interface {v1, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 598
    .line 599
    .line 600
    :cond_5
    iget-object v1, v0, La/f120;->i0:La/c4m0;

    .line 601
    .line 602
    if-eqz v1, :cond_6

    .line 603
    .line 604
    invoke-virtual {v1, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 605
    .line 606
    .line 607
    :cond_6
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 608
    .line 609
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 610
    .line 611
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 619
    .line 620
    move-object v4, v2

    .line 621
    check-cast v4, La/v020;

    .line 622
    .line 623
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    const/16 v25, 0x0

    .line 627
    .line 628
    const v26, 0x7ffffc

    .line 629
    .line 630
    .line 631
    const/4 v5, 0x0

    .line 632
    const/4 v6, 0x1

    .line 633
    const-wide/16 v7, 0x0

    .line 634
    .line 635
    const/4 v9, 0x0

    .line 636
    const/4 v10, 0x0

    .line 637
    const/4 v11, 0x0

    .line 638
    const/4 v12, 0x0

    .line 639
    const/4 v13, 0x0

    .line 640
    const/4 v14, 0x0

    .line 641
    const/4 v15, 0x0

    .line 642
    const/16 v16, 0x0

    .line 643
    .line 644
    const/16 v17, 0x0

    .line 645
    .line 646
    const/16 v18, 0x0

    .line 647
    .line 648
    const/16 v19, 0x0

    .line 649
    .line 650
    const/16 v20, 0x0

    .line 651
    .line 652
    const/16 v21, 0x0

    .line 653
    .line 654
    const/16 v22, 0x0

    .line 655
    .line 656
    const/16 v23, 0x0

    .line 657
    .line 658
    const/16 v24, 0x0

    .line 659
    .line 660
    invoke-static/range {v4 .. v26}, La/v020;->a(La/v020;ZZJZILa/xqj0;La/ixs0;La/zdm0;La/nc5;Ljava/util/Set;La/ehm0;La/ehm0;La/na00;La/ehm0;Ljava/util/List;La/ehm0;La/ehm0;La/ehm0;La/ehm0;La/uaq0;I)La/v020;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    if-eqz v2, :cond_7

    .line 669
    .line 670
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 671
    .line 672
    return-object v0

    .line 673
    :pswitch_d
    move-object/from16 v1, p1

    .line 674
    .line 675
    check-cast v1, La/k0w0;

    .line 676
    .line 677
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    iget-object v2, v0, La/f120;->v:La/rl70;

    .line 681
    .line 682
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v3

    .line 686
    check-cast v3, La/v020;

    .line 687
    .line 688
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 689
    .line 690
    iget-wide v4, v0, La/f120;->p:J

    .line 691
    .line 692
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    new-instance v0, Lorg/xplatform/statistic/player/impl/player/kabaddi_top_players/presentation/screens/TopPlayersStatisticKabaddiScreen;

    .line 696
    .line 697
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/player/impl/player/kabaddi_top_players/presentation/screens/TopPlayersStatisticKabaddiScreen;-><init>(Ljava/lang/String;J)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 701
    .line 702
    .line 703
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 704
    .line 705
    return-object v0

    .line 706
    :pswitch_e
    move-object/from16 v1, p1

    .line 707
    .line 708
    check-cast v1, La/k0w0;

    .line 709
    .line 710
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    iget-object v2, v0, La/f120;->G:La/y2m0;

    .line 714
    .line 715
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    check-cast v3, La/v020;

    .line 720
    .line 721
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 722
    .line 723
    iget-wide v4, v0, La/f120;->p:J

    .line 724
    .line 725
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    new-instance v0, Lorg/xplatform/statistic/team/impl/team_champ_statistic/presentation/screen/TeamsChampStatisticScreen;

    .line 729
    .line 730
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/team/impl/team_champ_statistic/presentation/screen/TeamsChampStatisticScreen;-><init>(Ljava/lang/String;J)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 734
    .line 735
    .line 736
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 737
    .line 738
    return-object v0

    .line 739
    :pswitch_f
    move-object/from16 v1, p1

    .line 740
    .line 741
    check-cast v1, La/k0w0;

    .line 742
    .line 743
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    .line 745
    .line 746
    iget-object v2, v0, La/f120;->F:La/g9m0;

    .line 747
    .line 748
    new-instance v3, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;

    .line 749
    .line 750
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v4

    .line 754
    check-cast v4, La/v020;

    .line 755
    .line 756
    iget-object v4, v4, La/v020;->f:Ljava/lang/String;

    .line 757
    .line 758
    iget-wide v5, v0, La/f120;->p:J

    .line 759
    .line 760
    invoke-direct {v3, v4, v5, v6}, Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams$GameParamsStatistic;-><init>(Ljava/lang/String;J)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    new-instance v0, Lorg/xplatform/statistic/rating/impl/rating_statistic/presentation/screen/RatingStatisticScreen;

    .line 767
    .line 768
    invoke-direct {v0, v3}, Lorg/xplatform/statistic/rating/impl/rating_statistic/presentation/screen/RatingStatisticScreen;-><init>(Lorg/xplatform/statistic/rating/api/di/RatingStatisticScreenParams;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 772
    .line 773
    .line 774
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 775
    .line 776
    return-object v0

    .line 777
    :pswitch_10
    move-object/from16 v1, p1

    .line 778
    .line 779
    check-cast v1, La/k0w0;

    .line 780
    .line 781
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    iget-object v2, v0, La/f120;->H:La/nai;

    .line 785
    .line 786
    new-instance v3, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;

    .line 787
    .line 788
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v4

    .line 792
    check-cast v4, La/v020;

    .line 793
    .line 794
    iget-object v4, v4, La/v020;->f:Ljava/lang/String;

    .line 795
    .line 796
    invoke-direct {v3, v4}, Lorg/xplatform/statistic/stage/api/domain/TypeStageId$Game;-><init>(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    iget-wide v4, v0, La/f120;->p:J

    .line 800
    .line 801
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    check-cast v0, La/v020;

    .line 806
    .line 807
    iget-object v0, v0, La/v020;->h:La/xqj0;

    .line 808
    .line 809
    iget-wide v8, v0, La/xqj0;->s:J

    .line 810
    .line 811
    const-wide/16 v6, -0x1

    .line 812
    .line 813
    invoke-virtual/range {v2 .. v9}, La/nai;->a(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JJJ)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 818
    .line 819
    .line 820
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 821
    .line 822
    return-object v0

    .line 823
    :pswitch_11
    move-object/from16 v1, p1

    .line 824
    .line 825
    check-cast v1, La/k0w0;

    .line 826
    .line 827
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    iget-object v2, v0, La/f120;->C:La/bst;

    .line 831
    .line 832
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v3

    .line 836
    check-cast v3, La/v020;

    .line 837
    .line 838
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 839
    .line 840
    iget-wide v4, v0, La/f120;->p:J

    .line 841
    .line 842
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    new-instance v0, Lorg/xplatform/statistic/heat_map/impl/presentation/screen/HeatMapStatisticScreen;

    .line 846
    .line 847
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/heat_map/impl/presentation/screen/HeatMapStatisticScreen;-><init>(Ljava/lang/String;J)V

    .line 848
    .line 849
    .line 850
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 851
    .line 852
    .line 853
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 854
    .line 855
    return-object v0

    .line 856
    :pswitch_12
    move-object/from16 v1, p1

    .line 857
    .line 858
    check-cast v1, La/k0w0;

    .line 859
    .line 860
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    iget-object v2, v0, La/f120;->U:La/ddk;

    .line 864
    .line 865
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    check-cast v3, La/v020;

    .line 870
    .line 871
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 872
    .line 873
    iget-wide v4, v0, La/f120;->p:J

    .line 874
    .line 875
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 876
    .line 877
    .line 878
    new-instance v0, Lorg/xplatform/statistic/facts/presentation/screen/FactsStatisticScreen;

    .line 879
    .line 880
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/facts/presentation/screen/FactsStatisticScreen;-><init>(Ljava/lang/String;J)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 884
    .line 885
    .line 886
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 887
    .line 888
    return-object v0

    .line 889
    :pswitch_13
    move-object/from16 v1, p1

    .line 890
    .line 891
    check-cast v1, La/k0w0;

    .line 892
    .line 893
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    iget-object v2, v0, La/f120;->S:La/g9m0;

    .line 897
    .line 898
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    check-cast v3, La/v020;

    .line 903
    .line 904
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 905
    .line 906
    iget-wide v4, v0, La/f120;->p:J

    .line 907
    .line 908
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    new-instance v0, Lorg/xplatform/statistic/text_broadcast/presentation/screens/TextBroadcastScreen;

    .line 912
    .line 913
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/text_broadcast/presentation/screens/TextBroadcastScreen;-><init>(Ljava/lang/String;J)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 917
    .line 918
    .line 919
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 920
    .line 921
    return-object v0

    .line 922
    :pswitch_14
    move-object/from16 v1, p1

    .line 923
    .line 924
    check-cast v1, La/k0w0;

    .line 925
    .line 926
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    iget-object v2, v0, La/f120;->G:La/y2m0;

    .line 930
    .line 931
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    check-cast v3, La/v020;

    .line 936
    .line 937
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 938
    .line 939
    iget-wide v4, v0, La/f120;->p:J

    .line 940
    .line 941
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 942
    .line 943
    .line 944
    new-instance v0, Lorg/xplatform/statistic/team/impl/team_statistic/presentation/screen/TeamsStatisticFragmentScreen;

    .line 945
    .line 946
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/team/impl/team_statistic/presentation/screen/TeamsStatisticFragmentScreen;-><init>(Ljava/lang/String;J)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 950
    .line 951
    .line 952
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 953
    .line 954
    return-object v0

    .line 955
    :pswitch_15
    move-object/from16 v1, p1

    .line 956
    .line 957
    check-cast v1, La/k0w0;

    .line 958
    .line 959
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 960
    .line 961
    .line 962
    iget-object v2, v0, La/f120;->Y:La/uuz;

    .line 963
    .line 964
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v3

    .line 968
    check-cast v3, La/v020;

    .line 969
    .line 970
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 971
    .line 972
    iget-wide v4, v0, La/f120;->p:J

    .line 973
    .line 974
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    check-cast v0, La/v020;

    .line 979
    .line 980
    iget-object v0, v0, La/v020;->o:La/na00;

    .line 981
    .line 982
    iget v0, v0, La/na00;->b:I

    .line 983
    .line 984
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 985
    .line 986
    .line 987
    new-instance v2, Lorg/xplatform/statistic/lineup/presentation/LineUpScreen;

    .line 988
    .line 989
    invoke-direct {v2, v3, v4, v5, v0}, Lorg/xplatform/statistic/lineup/presentation/LineUpScreen;-><init>(Ljava/lang/String;JI)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 993
    .line 994
    .line 995
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 996
    .line 997
    return-object v0

    .line 998
    :pswitch_16
    move-object/from16 v1, p1

    .line 999
    .line 1000
    check-cast v1, La/k0w0;

    .line 1001
    .line 1002
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    iget-object v2, v0, La/f120;->Z:La/tqt;

    .line 1006
    .line 1007
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v3

    .line 1011
    check-cast v3, La/v020;

    .line 1012
    .line 1013
    iget-object v5, v3, La/v020;->f:Ljava/lang/String;

    .line 1014
    .line 1015
    iget-wide v6, v0, La/f120;->p:J

    .line 1016
    .line 1017
    sget-object v8, La/n3q;->a:La/n3q;

    .line 1018
    .line 1019
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    check-cast v0, La/v020;

    .line 1024
    .line 1025
    iget v9, v0, La/v020;->g:I

    .line 1026
    .line 1027
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    new-instance v4, Lorg/xplatform/statistic/lastgames/presentation/screen/LastGamesScreen;

    .line 1031
    .line 1032
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/statistic/lastgames/presentation/screen/LastGamesScreen;-><init>(Ljava/lang/String;JLa/n3q;I)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v1, v4}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1036
    .line 1037
    .line 1038
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1039
    .line 1040
    return-object v0

    .line 1041
    :pswitch_17
    move-object/from16 v1, p1

    .line 1042
    .line 1043
    check-cast v1, La/k0w0;

    .line 1044
    .line 1045
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1046
    .line 1047
    .line 1048
    iget-object v2, v0, La/f120;->V:La/nek;

    .line 1049
    .line 1050
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v3

    .line 1054
    check-cast v3, La/v020;

    .line 1055
    .line 1056
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 1057
    .line 1058
    iget-wide v4, v0, La/f120;->p:J

    .line 1059
    .line 1060
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    new-instance v0, Lorg/xplatform/statistic/forecast/presentation/screen/ForecastStatisticScreen;

    .line 1064
    .line 1065
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/forecast/presentation/screen/ForecastStatisticScreen;-><init>(Ljava/lang/String;J)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1069
    .line 1070
    .line 1071
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1072
    .line 1073
    return-object v0

    .line 1074
    :pswitch_18
    move-object/from16 v1, p1

    .line 1075
    .line 1076
    check-cast v1, La/k0w0;

    .line 1077
    .line 1078
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    iget-object v2, v0, La/f120;->W:La/ddk;

    .line 1082
    .line 1083
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v3

    .line 1087
    check-cast v3, La/v020;

    .line 1088
    .line 1089
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 1090
    .line 1091
    iget-wide v4, v0, La/f120;->p:J

    .line 1092
    .line 1093
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    new-instance v0, Lorg/xplatform/statistic/game_events/presentation/screen/GameEventsScreen;

    .line 1097
    .line 1098
    invoke-direct {v0, v4, v5, v3}, Lorg/xplatform/statistic/game_events/presentation/screen/GameEventsScreen;-><init>(JLjava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1102
    .line 1103
    .line 1104
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1105
    .line 1106
    return-object v0

    .line 1107
    :pswitch_19
    move-object/from16 v1, p1

    .line 1108
    .line 1109
    check-cast v1, La/k0w0;

    .line 1110
    .line 1111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    iget-object v2, v0, La/f120;->K:La/s9m0;

    .line 1115
    .line 1116
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v3

    .line 1120
    check-cast v3, La/v020;

    .line 1121
    .line 1122
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 1123
    .line 1124
    iget-wide v4, v0, La/f120;->p:J

    .line 1125
    .line 1126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1127
    .line 1128
    .line 1129
    new-instance v0, Lorg/xplatform/statistic/stat_results/impl/results_grid/presentation/screen/ResultsGridScreen;

    .line 1130
    .line 1131
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/stat_results/impl/results_grid/presentation/screen/ResultsGridScreen;-><init>(Ljava/lang/String;J)V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1135
    .line 1136
    .line 1137
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1138
    .line 1139
    return-object v0

    .line 1140
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1141
    .line 1142
    check-cast v1, La/k0w0;

    .line 1143
    .line 1144
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1145
    .line 1146
    .line 1147
    iget-object v2, v0, La/f120;->X:La/xak;

    .line 1148
    .line 1149
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v3

    .line 1153
    check-cast v3, La/v020;

    .line 1154
    .line 1155
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 1156
    .line 1157
    iget-wide v4, v0, La/f120;->p:J

    .line 1158
    .line 1159
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1160
    .line 1161
    .line 1162
    new-instance v0, Lorg/xplatform/statistic/fight_statistic/presentatiton/screen/FightStatisticScreen;

    .line 1163
    .line 1164
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/fight_statistic/presentatiton/screen/FightStatisticScreen;-><init>(Ljava/lang/String;J)V

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1168
    .line 1169
    .line 1170
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1171
    .line 1172
    return-object v0

    .line 1173
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1174
    .line 1175
    check-cast v1, La/k0w0;

    .line 1176
    .line 1177
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    iget-object v3, v0, La/f120;->D:La/cge0;

    .line 1181
    .line 1182
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v4

    .line 1186
    check-cast v4, La/v020;

    .line 1187
    .line 1188
    iget-object v4, v4, La/v020;->i:La/ixs0;

    .line 1189
    .line 1190
    if-eqz v4, :cond_8

    .line 1191
    .line 1192
    iget-object v2, v4, La/ixs0;->e:La/dgs;

    .line 1193
    .line 1194
    iget v2, v2, La/dgs;->c:I

    .line 1195
    .line 1196
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v2

    .line 1200
    :cond_8
    if-nez v2, :cond_9

    .line 1201
    .line 1202
    const-string v2, ""

    .line 1203
    .line 1204
    :cond_9
    iget-wide v4, v0, La/f120;->p:J

    .line 1205
    .line 1206
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1207
    .line 1208
    .line 1209
    new-instance v0, Lorg/xplatform/statistic/stadium/impl/stadium/screen/StadiumScreen;

    .line 1210
    .line 1211
    const v3, 0x7f1313b2

    .line 1212
    .line 1213
    .line 1214
    invoke-direct {v0, v2, v4, v5, v3}, Lorg/xplatform/statistic/stadium/impl/stadium/screen/StadiumScreen;-><init>(Ljava/lang/String;JI)V

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1218
    .line 1219
    .line 1220
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1221
    .line 1222
    return-object v0

    .line 1223
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1224
    .line 1225
    check-cast v1, La/k0w0;

    .line 1226
    .line 1227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1228
    .line 1229
    .line 1230
    iget-object v2, v0, La/f120;->G:La/y2m0;

    .line 1231
    .line 1232
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v3

    .line 1236
    check-cast v3, La/v020;

    .line 1237
    .line 1238
    iget-object v3, v3, La/v020;->f:Ljava/lang/String;

    .line 1239
    .line 1240
    iget-wide v4, v0, La/f120;->p:J

    .line 1241
    .line 1242
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1243
    .line 1244
    .line 1245
    new-instance v0, Lorg/xplatform/statistic/team/impl/team_characterstic_statistic/presentation/screen/TeamsCharacteristicsFragmentScreen;

    .line 1246
    .line 1247
    invoke-direct {v0, v3, v4, v5}, Lorg/xplatform/statistic/team/impl/team_characterstic_statistic/presentation/screen/TeamsCharacteristicsFragmentScreen;-><init>(Ljava/lang/String;J)V

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1251
    .line 1252
    .line 1253
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1254
    .line 1255
    return-object v0

    .line 1256
    nop

    .line 1257
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
