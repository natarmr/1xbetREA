.class public final synthetic La/km00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/km00;->a:B

    iput-object p1, p0, La/km00;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/km00;->a:B

    .line 4
    .line 5
    const-string v2, "LOYALTY_PROGRAM_CASHBACK_UPDATED_RESULT_KEY"

    .line 6
    .line 7
    const-string v3, "search_call"

    .line 8
    .line 9
    const-string v4, "market_set"

    .line 10
    .line 11
    const-string v5, "screen"

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    iget-object v0, v0, La/km00;->b:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v0, La/b230;

    .line 22
    .line 23
    move-object/from16 v9, p1

    .line 24
    .line 25
    check-cast v9, La/g7h;

    .line 26
    .line 27
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, v9, La/g7h;->c:Ljava/util/List;

    .line 31
    .line 32
    iget-object v2, v9, La/g7h;->d:La/th90;

    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/xum0;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iget-wide v3, v1, La/xum0;->b:J

    .line 43
    .line 44
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    :cond_0
    iget-wide v3, v0, La/b230;->a:J

    .line 49
    .line 50
    const-wide/16 v5, -0x1a

    .line 51
    .line 52
    cmp-long v1, v3, v5

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    if-eqz v8, :cond_1

    .line 57
    .line 58
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v2, v1, v8}, La/th90;->put(Ljava/lang/Object;Ljava/lang/Object;)La/th90;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    :cond_1
    move-object v13, v2

    .line 67
    iget-wide v0, v0, La/b230;->a:J

    .line 68
    .line 69
    const/16 v17, 0x0

    .line 70
    .line 71
    const/16 v20, 0xf7

    .line 72
    .line 73
    const/4 v10, 0x0

    .line 74
    const/4 v11, 0x0

    .line 75
    const/4 v12, 0x0

    .line 76
    const/4 v14, 0x0

    .line 77
    const/4 v15, 0x0

    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    move-wide/from16 v18, v0

    .line 81
    .line 82
    invoke-static/range {v9 .. v20}, La/g7h;->a(La/g7h;La/m9s;La/ms2;Ljava/util/List;La/th90;La/th90;La/th90;La/th90;Ljava/util/List;JI)La/g7h;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_0
    check-cast v0, La/j230;

    .line 88
    .line 89
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, La/g7h;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v2, v1, La/g7h;->e:La/th90;

    .line 97
    .line 98
    iget-wide v3, v0, La/j230;->c:J

    .line 99
    .line 100
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, La/th90;

    .line 109
    .line 110
    if-nez v3, :cond_2

    .line 111
    .line 112
    sget-object v3, La/uh90;->g:La/uh90;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    :cond_2
    iget-wide v4, v0, La/j230;->c:J

    .line 118
    .line 119
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    iget-wide v5, v0, La/j230;->a:J

    .line 124
    .line 125
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget-object v0, v0, La/j230;->b:La/dx7;

    .line 130
    .line 131
    invoke-interface {v3, v5, v0}, La/th90;->put(Ljava/lang/Object;Ljava/lang/Object;)La/th90;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-interface {v2, v4, v0}, La/th90;->put(Ljava/lang/Object;Ljava/lang/Object;)La/th90;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    const-wide/16 v10, 0x0

    .line 140
    .line 141
    const/16 v12, 0x1ef

    .line 142
    .line 143
    const/4 v2, 0x0

    .line 144
    const/4 v3, 0x0

    .line 145
    const/4 v4, 0x0

    .line 146
    const/4 v5, 0x0

    .line 147
    const/4 v7, 0x0

    .line 148
    const/4 v8, 0x0

    .line 149
    const/4 v9, 0x0

    .line 150
    invoke-static/range {v1 .. v12}, La/g7h;->a(La/g7h;La/m9s;La/ms2;Ljava/util/List;La/th90;La/th90;La/th90;La/th90;Ljava/util/List;JI)La/g7h;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    return-object v0

    .line 155
    :pswitch_1
    check-cast v0, La/uz20;

    .line 156
    .line 157
    move-object/from16 v1, p1

    .line 158
    .line 159
    check-cast v1, La/k0w0;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object v2, v0, La/uz20;->C:La/cl5;

    .line 165
    .line 166
    new-instance v3, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;

    .line 167
    .line 168
    iget-object v0, v0, La/uz20;->q:Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;

    .line 169
    .line 170
    iget-wide v4, v0, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->a:J

    .line 171
    .line 172
    iget-boolean v6, v0, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->b:Z

    .line 173
    .line 174
    iget-wide v7, v0, Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;->d:J

    .line 175
    .line 176
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;-><init>(JZJ)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v0, Lorg/xplatform/sportgame/bets_on_players/impl/navigation/BetsOnPlayersScreenFactoryImpl$getScreen$1;

    .line 183
    .line 184
    invoke-direct {v0, v3}, Lorg/xplatform/sportgame/bets_on_players/impl/navigation/BetsOnPlayersScreenFactoryImpl$getScreen$1;-><init>(Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_2
    check-cast v0, La/f730;

    .line 194
    .line 195
    move-object/from16 v1, p1

    .line 196
    .line 197
    check-cast v1, Ljava/lang/Boolean;

    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_3

    .line 204
    .line 205
    iget-object v0, v0, La/f730;->l:La/cyu;

    .line 206
    .line 207
    sget-object v1, La/wgh0;->b:La/wgh0;

    .line 208
    .line 209
    invoke-virtual {v0, v4}, La/cyu;->C(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_3
    iget-object v1, v0, La/f730;->o:La/p7m0;

    .line 214
    .line 215
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Ljava/lang/CharSequence;

    .line 220
    .line 221
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-lez v1, :cond_4

    .line 226
    .line 227
    iget-object v0, v0, La/f730;->k:La/s31;

    .line 228
    .line 229
    sget-object v1, La/wgh0;->b:La/wgh0;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    iget-object v0, v0, La/s31;->a:La/kt2;

    .line 235
    .line 236
    invoke-static {v5, v4, v0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :cond_4
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_3
    check-cast v0, La/e730;

    .line 243
    .line 244
    move-object/from16 v1, p1

    .line 245
    .line 246
    check-cast v1, Ljava/lang/Boolean;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-eqz v1, :cond_5

    .line 253
    .line 254
    iget-object v0, v0, La/e730;->m:La/cyu;

    .line 255
    .line 256
    sget-object v1, La/wgh0;->b:La/wgh0;

    .line 257
    .line 258
    invoke-virtual {v0, v4}, La/cyu;->C(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_5
    iget-object v1, v0, La/e730;->q:La/p7m0;

    .line 263
    .line 264
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    check-cast v1, Ljava/lang/CharSequence;

    .line 269
    .line 270
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-lez v1, :cond_6

    .line 275
    .line 276
    iget-object v0, v0, La/e730;->l:La/s31;

    .line 277
    .line 278
    sget-object v1, La/wgh0;->b:La/wgh0;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget-object v0, v0, La/s31;->a:La/kt2;

    .line 284
    .line 285
    invoke-static {v5, v4, v0, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    :cond_6
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_4
    check-cast v0, La/qil0;

    .line 292
    .line 293
    move-object/from16 v1, p1

    .line 294
    .line 295
    check-cast v1, Ljava/util/List;

    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    instance-of v1, v0, La/hil0;

    .line 308
    .line 309
    if-eqz v1, :cond_7

    .line 310
    .line 311
    new-instance v2, La/a4n;

    .line 312
    .line 313
    invoke-interface {v0}, La/qil0;->b()I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    invoke-interface {v0}, La/qil0;->e()La/y9q0;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-interface {v0}, La/qil0;->a()La/y9q0;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-interface {v0}, La/qil0;->c()La/ahl0;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    invoke-direct/range {v2 .. v7}, La/a4n;-><init>(La/a4x;ILa/y9q0;La/y9q0;La/ahl0;)V

    .line 330
    .line 331
    .line 332
    :goto_2
    move-object v8, v2

    .line 333
    goto :goto_3

    .line 334
    :cond_7
    instance-of v1, v0, La/eil0;

    .line 335
    .line 336
    if-eqz v1, :cond_8

    .line 337
    .line 338
    new-instance v9, La/z3n;

    .line 339
    .line 340
    invoke-interface {v0}, La/qil0;->b()I

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    invoke-interface {v0}, La/qil0;->e()La/y9q0;

    .line 345
    .line 346
    .line 347
    move-result-object v12

    .line 348
    invoke-interface {v0}, La/qil0;->a()La/y9q0;

    .line 349
    .line 350
    .line 351
    move-result-object v13

    .line 352
    invoke-interface {v0}, La/qil0;->c()La/ahl0;

    .line 353
    .line 354
    .line 355
    move-result-object v14

    .line 356
    move-object v15, v0

    .line 357
    check-cast v15, La/eil0;

    .line 358
    .line 359
    move-object v10, v3

    .line 360
    invoke-direct/range {v9 .. v15}, La/z3n;-><init>(La/a4x;ILa/y9q0;La/y9q0;La/ahl0;La/eil0;)V

    .line 361
    .line 362
    .line 363
    move-object v8, v9

    .line 364
    goto :goto_3

    .line 365
    :cond_8
    instance-of v1, v0, La/lil0;

    .line 366
    .line 367
    if-eqz v1, :cond_9

    .line 368
    .line 369
    new-instance v2, La/b4n;

    .line 370
    .line 371
    invoke-interface {v0}, La/qil0;->b()I

    .line 372
    .line 373
    .line 374
    move-result v4

    .line 375
    invoke-interface {v0}, La/qil0;->e()La/y9q0;

    .line 376
    .line 377
    .line 378
    move-result-object v5

    .line 379
    invoke-interface {v0}, La/qil0;->a()La/y9q0;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    invoke-interface {v0}, La/qil0;->c()La/ahl0;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    invoke-direct/range {v2 .. v7}, La/b4n;-><init>(La/a4x;ILa/y9q0;La/y9q0;La/ahl0;)V

    .line 388
    .line 389
    .line 390
    goto :goto_2

    .line 391
    :cond_9
    instance-of v1, v0, La/pil0;

    .line 392
    .line 393
    if-eqz v1, :cond_a

    .line 394
    .line 395
    new-instance v2, La/c4n;

    .line 396
    .line 397
    invoke-interface {v0}, La/qil0;->b()I

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    invoke-interface {v0}, La/qil0;->e()La/y9q0;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    invoke-interface {v0}, La/qil0;->a()La/y9q0;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    invoke-interface {v0}, La/qil0;->c()La/ahl0;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    invoke-direct/range {v2 .. v7}, La/c4n;-><init>(La/a4x;ILa/y9q0;La/y9q0;La/ahl0;)V

    .line 414
    .line 415
    .line 416
    goto :goto_2

    .line 417
    :cond_a
    instance-of v1, v0, La/bil0;

    .line 418
    .line 419
    if-eqz v1, :cond_b

    .line 420
    .line 421
    new-instance v8, La/y3n;

    .line 422
    .line 423
    check-cast v0, La/bil0;

    .line 424
    .line 425
    iget-object v1, v0, La/bil0;->a:La/y9q0;

    .line 426
    .line 427
    iget-object v2, v0, La/bil0;->b:La/y9q0;

    .line 428
    .line 429
    iget-object v0, v0, La/bil0;->c:La/zgl0;

    .line 430
    .line 431
    invoke-direct {v8, v3, v1, v2, v0}, La/y3n;-><init>(La/a4x;La/y9q0;La/y9q0;La/zgl0;)V

    .line 432
    .line 433
    .line 434
    goto :goto_3

    .line 435
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 436
    .line 437
    .line 438
    :goto_3
    return-object v8

    .line 439
    :pswitch_5
    check-cast v0, La/bu20;

    .line 440
    .line 441
    move-object/from16 v1, p1

    .line 442
    .line 443
    check-cast v1, Landroid/view/View;

    .line 444
    .line 445
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    iget-object v0, v0, La/bu20;->i:Lkotlin/jvm/functions/Function0;

    .line 449
    .line 450
    if-eqz v0, :cond_c

    .line 451
    .line 452
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object v0

    .line 458
    :pswitch_6
    check-cast v0, La/mn20;

    .line 459
    .line 460
    move-object/from16 v1, p1

    .line 461
    .line 462
    check-cast v1, La/k0w0;

    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    iget-object v0, v0, La/mn20;->f:La/y3j0;

    .line 468
    .line 469
    sget-object v2, La/bm5;->b:La/bm5;

    .line 470
    .line 471
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    new-instance v0, Lorg/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;

    .line 475
    .line 476
    invoke-direct {v0, v2}, Lorg/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;-><init>(La/bm5;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 480
    .line 481
    .line 482
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object v0

    .line 485
    :pswitch_7
    check-cast v0, La/kn20;

    .line 486
    .line 487
    move-object/from16 v1, p1

    .line 488
    .line 489
    check-cast v1, Ljava/lang/Throwable;

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    iget-object v0, v0, La/kn20;->j:La/p7m0;

    .line 495
    .line 496
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    sget-object v1, La/li20;->a:La/li20;

    .line 500
    .line 501
    invoke-virtual {v0, v8, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    return-object v0

    .line 507
    :pswitch_8
    check-cast v0, La/y920;

    .line 508
    .line 509
    move-object/from16 v1, p1

    .line 510
    .line 511
    check-cast v1, Ljava/lang/Throwable;

    .line 512
    .line 513
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    iget-object v2, v0, La/y920;->f:La/duj;

    .line 517
    .line 518
    new-instance v3, La/j920;

    .line 519
    .line 520
    invoke-direct {v3, v0, v6}, La/j920;-><init>(La/y920;B)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 524
    .line 525
    .line 526
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 527
    .line 528
    return-object v0

    .line 529
    :pswitch_9
    check-cast v0, La/z620;

    .line 530
    .line 531
    move-object/from16 v1, p1

    .line 532
    .line 533
    check-cast v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;

    .line 534
    .line 535
    sget-object v2, La/z620;->u2:La/uuz;

    .line 536
    .line 537
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0}, La/z620;->Q0()La/k3t0;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    new-instance v2, La/jdc0;

    .line 545
    .line 546
    iget-object v6, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->a:Ljava/lang/String;

    .line 547
    .line 548
    iget-wide v3, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->b:D

    .line 549
    .line 550
    iget-object v7, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->c:Ljava/lang/String;

    .line 551
    .line 552
    iget-object v8, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->d:Ljava/lang/String;

    .line 553
    .line 554
    iget v5, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->e:I

    .line 555
    .line 556
    invoke-direct/range {v2 .. v8}, La/jdc0;-><init>(DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    new-instance v1, La/k420;

    .line 560
    .line 561
    invoke-direct {v1, v2}, La/k420;-><init>(La/jdc0;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 568
    .line 569
    return-object v0

    .line 570
    :pswitch_a
    check-cast v0, La/c720;

    .line 571
    .line 572
    move-object/from16 v1, p1

    .line 573
    .line 574
    check-cast v1, Ljava/lang/Integer;

    .line 575
    .line 576
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    sget-object v2, La/c720;->p2:La/wsz;

    .line 581
    .line 582
    invoke-virtual {v0}, La/c720;->V0()La/c6q;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    iget-object v0, v0, La/c6q;->e:Landroidx/viewpager2/widget/ViewPager2;

    .line 587
    .line 588
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0

    .line 594
    :pswitch_b
    check-cast v0, La/b720;

    .line 595
    .line 596
    move-object/from16 v1, p1

    .line 597
    .line 598
    check-cast v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;

    .line 599
    .line 600
    sget-object v2, La/b720;->w2:La/evz;

    .line 601
    .line 602
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0}, La/b720;->Q0()La/k3t0;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    new-instance v2, La/jdc0;

    .line 610
    .line 611
    iget-object v6, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->a:Ljava/lang/String;

    .line 612
    .line 613
    iget-wide v3, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->b:D

    .line 614
    .line 615
    iget-object v7, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->c:Ljava/lang/String;

    .line 616
    .line 617
    iget-object v8, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->d:Ljava/lang/String;

    .line 618
    .line 619
    iget v5, v1, Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;->e:I

    .line 620
    .line 621
    invoke-direct/range {v2 .. v8}, La/jdc0;-><init>(DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    new-instance v1, La/k420;

    .line 625
    .line 626
    invoke-direct {v1, v2}, La/k420;-><init>(La/jdc0;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_c
    check-cast v0, Ljava/lang/Throwable;

    .line 636
    .line 637
    move-object/from16 v1, p1

    .line 638
    .line 639
    check-cast v1, Ljava/lang/Integer;

    .line 640
    .line 641
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 645
    .line 646
    .line 647
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 648
    .line 649
    return-object v0

    .line 650
    :pswitch_d
    check-cast v0, La/cx10;

    .line 651
    .line 652
    move-object/from16 v1, p1

    .line 653
    .line 654
    check-cast v1, Ljava/lang/Throwable;

    .line 655
    .line 656
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    iget-object v0, v0, La/cx10;->v:La/duj;

    .line 660
    .line 661
    new-instance v2, La/gm10;

    .line 662
    .line 663
    const/4 v3, 0x5

    .line 664
    invoke-direct {v2, v3}, La/gm10;-><init>(B)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 668
    .line 669
    .line 670
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 671
    .line 672
    return-object v0

    .line 673
    :pswitch_e
    check-cast v0, La/dw10;

    .line 674
    .line 675
    move-object/from16 v1, p1

    .line 676
    .line 677
    check-cast v1, Landroid/view/View;

    .line 678
    .line 679
    sget-object v2, La/dw10;->V1:La/uuz;

    .line 680
    .line 681
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0}, La/dw10;->I0()La/cx10;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    iget-boolean v1, v0, La/cx10;->J:Z

    .line 689
    .line 690
    if-nez v1, :cond_d

    .line 691
    .line 692
    goto :goto_6

    .line 693
    :cond_d
    iget-object v1, v0, La/cx10;->z:La/tzi;

    .line 694
    .line 695
    iget-object v2, v1, La/tzi;->j:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v2, La/zg;

    .line 698
    .line 699
    iget-object v2, v2, La/zg;->a:La/kt2;

    .line 700
    .line 701
    const-string v3, "acc_pers_data_move"

    .line 702
    .line 703
    const-string v4, "menu"

    .line 704
    .line 705
    invoke-static {v5, v4, v2, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    iget-object v1, v1, La/tzi;->g:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v1, La/au0;

    .line 711
    .line 712
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 713
    .line 714
    const-wide/16 v2, 0x2b04

    .line 715
    .line 716
    invoke-static {v4, v1, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 717
    .line 718
    .line 719
    iget-object v1, v0, La/cx10;->d:La/i1w0;

    .line 720
    .line 721
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    iget-object v0, v0, La/cx10;->j:La/jh70;

    .line 726
    .line 727
    invoke-static {v0, v7}, La/jh70;->j(La/jh70;Z)Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 732
    .line 733
    if-eqz v3, :cond_e

    .line 734
    .line 735
    new-instance v3, La/e1w0;

    .line 736
    .line 737
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 738
    .line 739
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 740
    .line 741
    .line 742
    new-instance v0, La/c8d;

    .line 743
    .line 744
    sget-object v4, La/y7d;->a:La/v7d;

    .line 745
    .line 746
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    goto :goto_4

    .line 753
    :cond_e
    new-instance v3, La/w0w0;

    .line 754
    .line 755
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 756
    .line 757
    .line 758
    new-instance v0, La/c8d;

    .line 759
    .line 760
    sget-object v4, La/y7d;->a:La/v7d;

    .line 761
    .line 762
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    :goto_4
    invoke-static {v1, v2, v7}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    :goto_5
    move-object v2, v0

    .line 773
    check-cast v2, La/paw;

    .line 774
    .line 775
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 776
    .line 777
    .line 778
    move-result v3

    .line 779
    if-eqz v3, :cond_f

    .line 780
    .line 781
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    check-cast v2, La/oe50;

    .line 786
    .line 787
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 788
    .line 789
    .line 790
    goto :goto_5

    .line 791
    :cond_f
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 792
    .line 793
    return-object v0

    .line 794
    :pswitch_f
    check-cast v0, La/l4b;

    .line 795
    .line 796
    move-object/from16 v1, p1

    .line 797
    .line 798
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 799
    .line 800
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    sget-object v2, La/l4b;->i:La/c0o;

    .line 804
    .line 805
    invoke-virtual {v2, v0}, La/c0o;->indexOf(Ljava/lang/Object;)I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    invoke-virtual {v1, v0, v7}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 810
    .line 811
    .line 812
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 813
    .line 814
    return-object v0

    .line 815
    :pswitch_10
    check-cast v0, La/nv10;

    .line 816
    .line 817
    move-object/from16 v1, p1

    .line 818
    .line 819
    check-cast v1, Landroid/content/Context;

    .line 820
    .line 821
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    new-instance v2, Landroidx/viewpager2/widget/ViewPager2;

    .line 825
    .line 826
    invoke-direct {v2, v1}, Landroidx/viewpager2/widget/ViewPager2;-><init>(Landroid/content/Context;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v2, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v2, v7}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 843
    .line 844
    sget-object v1, La/l4b;->i:La/c0o;

    .line 845
    .line 846
    invoke-virtual {v1}, La/u1;->b()I

    .line 847
    .line 848
    .line 849
    move-result v1

    .line 850
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    .line 851
    .line 852
    .line 853
    return-object v2

    .line 854
    :pswitch_11
    check-cast v0, La/hv10;

    .line 855
    .line 856
    move-object/from16 v1, p1

    .line 857
    .line 858
    check-cast v1, Ljava/lang/String;

    .line 859
    .line 860
    sget-object v2, La/hv10;->X1:La/atz;

    .line 861
    .line 862
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 866
    .line 867
    .line 868
    move-result v2

    .line 869
    sparse-switch v2, :sswitch_data_0

    .line 870
    .line 871
    .line 872
    goto :goto_7

    .line 873
    :sswitch_0
    const-string v2, "COUPON_TAG"

    .line 874
    .line 875
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    move-result v1

    .line 879
    if-nez v1, :cond_10

    .line 880
    .line 881
    goto :goto_7

    .line 882
    :cond_10
    new-instance v1, La/xa50;

    .line 883
    .line 884
    invoke-direct {v1}, La/xa50;-><init>()V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v0, v1}, La/hv10;->J0(La/cb50;)V

    .line 888
    .line 889
    .line 890
    goto :goto_7

    .line 891
    :sswitch_1
    const-string v2, "MENU_TAG"

    .line 892
    .line 893
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v1

    .line 897
    if-nez v1, :cond_11

    .line 898
    .line 899
    goto :goto_7

    .line 900
    :cond_11
    new-instance v1, La/ab50;

    .line 901
    .line 902
    invoke-direct {v1, v7}, La/ab50;-><init>(I)V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v0, v1}, La/hv10;->J0(La/cb50;)V

    .line 906
    .line 907
    .line 908
    goto :goto_7

    .line 909
    :sswitch_2
    const-string v2, "POPULAR_TAG"

    .line 910
    .line 911
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v1

    .line 915
    if-nez v1, :cond_12

    .line 916
    .line 917
    goto :goto_7

    .line 918
    :cond_12
    new-instance v1, La/bb50;

    .line 919
    .line 920
    invoke-direct {v1, v7}, La/bb50;-><init>(Z)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v0, v1}, La/hv10;->J0(La/cb50;)V

    .line 924
    .line 925
    .line 926
    goto :goto_7

    .line 927
    :sswitch_3
    const-string v2, "HISTORY_TAG"

    .line 928
    .line 929
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 930
    .line 931
    .line 932
    move-result v1

    .line 933
    if-nez v1, :cond_13

    .line 934
    .line 935
    goto :goto_7

    .line 936
    :cond_13
    new-instance v2, La/za50;

    .line 937
    .line 938
    const-wide/16 v7, 0x0

    .line 939
    .line 940
    const/4 v4, 0x7

    .line 941
    const/4 v3, 0x0

    .line 942
    const-wide/16 v5, 0x0

    .line 943
    .line 944
    invoke-direct/range {v2 .. v8}, La/za50;-><init>(IIJJ)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v0, v2}, La/hv10;->J0(La/cb50;)V

    .line 948
    .line 949
    .line 950
    goto :goto_7

    .line 951
    :sswitch_4
    const-string v2, "FAVORITES_TAG"

    .line 952
    .line 953
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v1

    .line 957
    if-nez v1, :cond_14

    .line 958
    .line 959
    goto :goto_7

    .line 960
    :cond_14
    new-instance v1, La/ya50;

    .line 961
    .line 962
    invoke-direct {v1, v7}, La/ya50;-><init>(I)V

    .line 963
    .line 964
    .line 965
    invoke-virtual {v0, v1}, La/hv10;->J0(La/cb50;)V

    .line 966
    .line 967
    .line 968
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 969
    .line 970
    return-object v0

    .line 971
    :pswitch_12
    check-cast v0, La/yr10;

    .line 972
    .line 973
    move-object/from16 v1, p1

    .line 974
    .line 975
    check-cast v1, Ljava/lang/Integer;

    .line 976
    .line 977
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 978
    .line 979
    .line 980
    move-result v1

    .line 981
    sget-object v2, La/yr10;->R1:La/wsz;

    .line 982
    .line 983
    iget-object v0, v0, La/yr10;->M1:La/kiu0;

    .line 984
    .line 985
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    check-cast v0, La/ds10;

    .line 990
    .line 991
    iget-object v2, v0, La/ds10;->d:La/j910;

    .line 992
    .line 993
    invoke-virtual {v2, v1}, La/j910;->w(I)V

    .line 994
    .line 995
    .line 996
    iget-object v2, v0, La/ds10;->e:La/p7m0;

    .line 997
    .line 998
    :cond_15
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    move-object v3, v0

    .line 1003
    check-cast v3, La/ru9;

    .line 1004
    .line 1005
    const/4 v4, 0x3

    .line 1006
    invoke-static {v3, v8, v1, v4}, La/ru9;->a(La/ru9;La/dxh0;II)La/ru9;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v3

    .line 1010
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v0

    .line 1014
    if-eqz v0, :cond_15

    .line 1015
    .line 1016
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1017
    .line 1018
    return-object v0

    .line 1019
    :pswitch_13
    check-cast v0, La/qr10;

    .line 1020
    .line 1021
    move-object/from16 v1, p1

    .line 1022
    .line 1023
    check-cast v1, La/iqt0;

    .line 1024
    .line 1025
    sget-object v2, La/qr10;->V1:La/evz;

    .line 1026
    .line 1027
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v0}, La/qr10;->I0()La/k3t0;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    new-instance v2, La/i780;

    .line 1035
    .line 1036
    invoke-direct {v2, v1}, La/i780;-><init>(La/iqt0;)V

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1040
    .line 1041
    .line 1042
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1043
    .line 1044
    return-object v0

    .line 1045
    :pswitch_14
    move-object v3, v0

    .line 1046
    check-cast v3, La/e000;

    .line 1047
    .line 1048
    move-object/from16 v2, p1

    .line 1049
    .line 1050
    check-cast v2, La/cp;

    .line 1051
    .line 1052
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1053
    .line 1054
    .line 1055
    new-instance v1, La/if6;

    .line 1056
    .line 1057
    const/4 v6, 0x6

    .line 1058
    move-object v4, v2

    .line 1059
    move-object v5, v3

    .line 1060
    invoke-direct/range {v1 .. v6}, La/if6;-><init>(La/cp;Ljava/lang/Object;La/cp;Ljava/lang/Object;B)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v2, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1064
    .line 1065
    .line 1066
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1067
    .line 1068
    return-object v0

    .line 1069
    :pswitch_15
    check-cast v0, La/zp10;

    .line 1070
    .line 1071
    move-object/from16 v1, p1

    .line 1072
    .line 1073
    check-cast v1, La/iqt0;

    .line 1074
    .line 1075
    sget-object v2, La/zp10;->U1:La/htz;

    .line 1076
    .line 1077
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v0}, La/zp10;->H0()La/vq10;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0

    .line 1084
    iget-object v0, v0, La/vq10;->k:La/z4w0;

    .line 1085
    .line 1086
    invoke-virtual {v0, v1}, La/z4w0;->a(La/iqt0;)V

    .line 1087
    .line 1088
    .line 1089
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1090
    .line 1091
    return-object v0

    .line 1092
    :pswitch_16
    check-cast v0, La/mg10;

    .line 1093
    .line 1094
    move-object/from16 v1, p1

    .line 1095
    .line 1096
    check-cast v1, La/fh10;

    .line 1097
    .line 1098
    sget-object v3, La/mg10;->Q1:La/uuz;

    .line 1099
    .line 1100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    instance-of v3, v1, La/dh10;

    .line 1104
    .line 1105
    const-string v4, "actionDialogManager"

    .line 1106
    .line 1107
    if-eqz v3, :cond_17

    .line 1108
    .line 1109
    check-cast v1, La/dh10;

    .line 1110
    .line 1111
    iget-object v1, v1, La/dh10;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1112
    .line 1113
    iget-object v2, v0, La/mg10;->L1:La/ii;

    .line 1114
    .line 1115
    if-eqz v2, :cond_16

    .line 1116
    .line 1117
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v3

    .line 1121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1125
    .line 1126
    .line 1127
    goto :goto_8

    .line 1128
    :cond_16
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1129
    .line 1130
    .line 1131
    throw v8

    .line 1132
    :cond_17
    instance-of v3, v1, La/eh10;

    .line 1133
    .line 1134
    if-eqz v3, :cond_19

    .line 1135
    .line 1136
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v3

    .line 1140
    invoke-virtual {v3}, La/kxq;->r()La/v1r;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v3

    .line 1144
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v5

    .line 1148
    invoke-virtual {v3, v5, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1149
    .line 1150
    .line 1151
    check-cast v1, La/eh10;

    .line 1152
    .line 1153
    iget-object v1, v1, La/eh10;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1154
    .line 1155
    iget-object v2, v0, La/mg10;->L1:La/ii;

    .line 1156
    .line 1157
    if-eqz v2, :cond_18

    .line 1158
    .line 1159
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v3

    .line 1163
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v2, v1, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1167
    .line 1168
    .line 1169
    goto :goto_8

    .line 1170
    :cond_18
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    throw v8

    .line 1174
    :cond_19
    :goto_8
    iget-object v0, v0, La/mg10;->M1:La/a8z;

    .line 1175
    .line 1176
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    check-cast v0, La/k3t0;

    .line 1181
    .line 1182
    sget-object v1, La/xf10;->a:La/xf10;

    .line 1183
    .line 1184
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1188
    .line 1189
    return-object v0

    .line 1190
    :pswitch_17
    check-cast v0, La/ze10;

    .line 1191
    .line 1192
    move-object/from16 v1, p1

    .line 1193
    .line 1194
    check-cast v1, La/kf10;

    .line 1195
    .line 1196
    sget-object v3, La/ze10;->Q1:La/htz;

    .line 1197
    .line 1198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    instance-of v3, v1, La/if10;

    .line 1202
    .line 1203
    if-eqz v3, :cond_1a

    .line 1204
    .line 1205
    check-cast v1, La/if10;

    .line 1206
    .line 1207
    iget-object v1, v1, La/if10;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1208
    .line 1209
    invoke-virtual {v0, v1}, La/ze10;->G0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 1210
    .line 1211
    .line 1212
    goto :goto_9

    .line 1213
    :cond_1a
    instance-of v3, v1, La/jf10;

    .line 1214
    .line 1215
    if-eqz v3, :cond_1b

    .line 1216
    .line 1217
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v3

    .line 1221
    invoke-virtual {v3}, La/kxq;->r()La/v1r;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v3

    .line 1225
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v4

    .line 1229
    invoke-virtual {v3, v4, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1230
    .line 1231
    .line 1232
    check-cast v1, La/jf10;

    .line 1233
    .line 1234
    iget-object v1, v1, La/jf10;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1235
    .line 1236
    invoke-virtual {v0, v1}, La/ze10;->G0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 1237
    .line 1238
    .line 1239
    goto :goto_9

    .line 1240
    :cond_1b
    instance-of v2, v1, La/hf10;

    .line 1241
    .line 1242
    if-eqz v2, :cond_1d

    .line 1243
    .line 1244
    check-cast v1, La/hf10;

    .line 1245
    .line 1246
    iget-object v1, v1, La/hf10;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1247
    .line 1248
    iget-object v2, v1, Lorg/xplatform/uikit/components/dialog/DialogFields;->f:Ljava/lang/String;

    .line 1249
    .line 1250
    if-nez v2, :cond_1c

    .line 1251
    .line 1252
    const-string v2, ""

    .line 1253
    .line 1254
    :cond_1c
    new-instance v3, La/xe10;

    .line 1255
    .line 1256
    invoke-direct {v3, v0, v6}, La/xe10;-><init>(La/ze10;B)V

    .line 1257
    .line 1258
    .line 1259
    invoke-static {v0, v2, v3}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v0, v1}, La/ze10;->G0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 1263
    .line 1264
    .line 1265
    :cond_1d
    :goto_9
    iget-object v0, v0, La/ze10;->M1:La/a8z;

    .line 1266
    .line 1267
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v0

    .line 1271
    check-cast v0, La/k3t0;

    .line 1272
    .line 1273
    sget-object v1, La/ie10;->a:La/ie10;

    .line 1274
    .line 1275
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1276
    .line 1277
    .line 1278
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1279
    .line 1280
    return-object v0

    .line 1281
    :pswitch_18
    move-object v1, v0

    .line 1282
    check-cast v1, La/u610;

    .line 1283
    .line 1284
    move-object/from16 v8, p1

    .line 1285
    .line 1286
    check-cast v8, La/xus;

    .line 1287
    .line 1288
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1289
    .line 1290
    .line 1291
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 1292
    .line 1293
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 1294
    .line 1295
    :goto_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v2

    .line 1299
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 1303
    .line 1304
    move-object v4, v2

    .line 1305
    move-object v2, v4

    .line 1306
    check-cast v2, La/m310;

    .line 1307
    .line 1308
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1309
    .line 1310
    .line 1311
    const/16 v18, 0x0

    .line 1312
    .line 1313
    const v19, 0x1ffffbf

    .line 1314
    .line 1315
    .line 1316
    const/4 v3, 0x0

    .line 1317
    move-object v5, v4

    .line 1318
    const/4 v4, 0x0

    .line 1319
    move-object v6, v5

    .line 1320
    const/4 v5, 0x0

    .line 1321
    move-object v7, v6

    .line 1322
    const/4 v6, 0x0

    .line 1323
    move-object v9, v7

    .line 1324
    const/4 v7, 0x0

    .line 1325
    move-object v10, v9

    .line 1326
    const/4 v9, 0x0

    .line 1327
    move-object v11, v10

    .line 1328
    const/4 v10, 0x0

    .line 1329
    move-object v12, v11

    .line 1330
    const/4 v11, 0x0

    .line 1331
    move-object v13, v12

    .line 1332
    const/4 v12, 0x0

    .line 1333
    move-object v14, v13

    .line 1334
    const/4 v13, 0x0

    .line 1335
    move-object v15, v14

    .line 1336
    const/4 v14, 0x0

    .line 1337
    move-object/from16 v16, v15

    .line 1338
    .line 1339
    const/4 v15, 0x0

    .line 1340
    move-object/from16 v17, v16

    .line 1341
    .line 1342
    const/16 v16, 0x0

    .line 1343
    .line 1344
    move-object/from16 v20, v17

    .line 1345
    .line 1346
    const/16 v17, 0x0

    .line 1347
    .line 1348
    move-object/from16 p0, v1

    .line 1349
    .line 1350
    move-object/from16 v1, v20

    .line 1351
    .line 1352
    invoke-static/range {v2 .. v19}, La/m310;->a(La/m310;La/gps;La/jlr;La/k4h;La/ypl0;La/bqr;La/xus;ZLa/g310;La/mz00;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/m310;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v2

    .line 1356
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1357
    .line 1358
    .line 1359
    move-result v1

    .line 1360
    if-eqz v1, :cond_1e

    .line 1361
    .line 1362
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1363
    .line 1364
    return-object v0

    .line 1365
    :cond_1e
    move-object/from16 v1, p0

    .line 1366
    .line 1367
    goto :goto_a

    .line 1368
    :pswitch_19
    check-cast v0, La/v310;

    .line 1369
    .line 1370
    move-object/from16 v1, p1

    .line 1371
    .line 1372
    check-cast v1, Ljava/lang/Long;

    .line 1373
    .line 1374
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1375
    .line 1376
    .line 1377
    move-result-wide v1

    .line 1378
    sget-object v3, La/x510;->b:La/x510;

    .line 1379
    .line 1380
    const-wide/16 v3, 0x1

    .line 1381
    .line 1382
    cmp-long v3, v1, v3

    .line 1383
    .line 1384
    if-nez v3, :cond_20

    .line 1385
    .line 1386
    invoke-static {v0}, La/ucx;->b0(La/v310;)Z

    .line 1387
    .line 1388
    .line 1389
    move-result v0

    .line 1390
    if-nez v0, :cond_1f

    .line 1391
    .line 1392
    goto :goto_b

    .line 1393
    :cond_1f
    move v6, v7

    .line 1394
    goto :goto_b

    .line 1395
    :cond_20
    const-wide/16 v3, 0x2

    .line 1396
    .line 1397
    cmp-long v3, v1, v3

    .line 1398
    .line 1399
    if-nez v3, :cond_21

    .line 1400
    .line 1401
    invoke-static {v0}, La/ucx;->Z(La/v310;)Z

    .line 1402
    .line 1403
    .line 1404
    move-result v0

    .line 1405
    if-nez v0, :cond_1f

    .line 1406
    .line 1407
    goto :goto_b

    .line 1408
    :cond_21
    const-wide/16 v3, 0xe

    .line 1409
    .line 1410
    cmp-long v1, v1, v3

    .line 1411
    .line 1412
    if-nez v1, :cond_1f

    .line 1413
    .line 1414
    invoke-static {v0}, La/ucx;->a0(La/v310;)Z

    .line 1415
    .line 1416
    .line 1417
    move-result v0

    .line 1418
    if-nez v0, :cond_1f

    .line 1419
    .line 1420
    :goto_b
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0

    .line 1424
    return-object v0

    .line 1425
    :pswitch_1a
    check-cast v0, Lorg/xplatform/localtimedif/impl/presentation/localtimediffworker/LocalTimeDiffWorker;

    .line 1426
    .line 1427
    move-object/from16 v1, p1

    .line 1428
    .line 1429
    check-cast v1, Ljava/lang/Throwable;

    .line 1430
    .line 1431
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1432
    .line 1433
    .line 1434
    iget-object v0, v0, Lorg/xplatform/localtimedif/impl/presentation/localtimediffworker/LocalTimeDiffWorker;->h:La/dpi0;

    .line 1435
    .line 1436
    if-eqz v0, :cond_22

    .line 1437
    .line 1438
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1439
    .line 1440
    .line 1441
    move-result-wide v1

    .line 1442
    iget-object v0, v0, La/dpi0;->a:Ljava/lang/Object;

    .line 1443
    .line 1444
    check-cast v0, La/ieu;

    .line 1445
    .line 1446
    iget-object v0, v0, La/ieu;->c:Ljava/lang/Object;

    .line 1447
    .line 1448
    check-cast v0, La/es00;

    .line 1449
    .line 1450
    iput-wide v1, v0, La/es00;->a:J

    .line 1451
    .line 1452
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1453
    .line 1454
    return-object v0

    .line 1455
    :cond_22
    const-string v0, "setLastTimeUpdatedUseCase"

    .line 1456
    .line 1457
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1458
    .line 1459
    .line 1460
    throw v8

    .line 1461
    :pswitch_1b
    check-cast v0, La/pzu;

    .line 1462
    .line 1463
    move-object/from16 v1, p1

    .line 1464
    .line 1465
    check-cast v1, Ljava/lang/Throwable;

    .line 1466
    .line 1467
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1468
    .line 1469
    .line 1470
    instance-of v2, v1, La/zhi0;

    .line 1471
    .line 1472
    if-eqz v2, :cond_23

    .line 1473
    .line 1474
    check-cast v1, La/zhi0;

    .line 1475
    .line 1476
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 1477
    .line 1478
    sget-object v2, La/i2o;->D2:La/i2o;

    .line 1479
    .line 1480
    if-ne v1, v2, :cond_23

    .line 1481
    .line 1482
    iget-object v0, v0, La/pzu;->d:Ljava/lang/Object;

    .line 1483
    .line 1484
    check-cast v0, La/ort;

    .line 1485
    .line 1486
    iget-object v0, v0, La/ort;->a:La/gst0;

    .line 1487
    .line 1488
    invoke-virtual {v0, v7, v7}, La/gst0;->h(ZZ)V

    .line 1489
    .line 1490
    .line 1491
    goto :goto_c

    .line 1492
    :cond_23
    move v6, v7

    .line 1493
    :goto_c
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    return-object v0

    .line 1498
    :pswitch_1c
    check-cast v0, La/xm00;

    .line 1499
    .line 1500
    move-object/from16 v1, p1

    .line 1501
    .line 1502
    check-cast v1, Ljava/lang/Throwable;

    .line 1503
    .line 1504
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1505
    .line 1506
    .line 1507
    iget-object v2, v0, La/xm00;->i:La/bby;

    .line 1508
    .line 1509
    if-eqz v2, :cond_24

    .line 1510
    .line 1511
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 1512
    .line 1513
    .line 1514
    :cond_24
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v9

    .line 1518
    sget-object v10, La/vm00;->a:La/vm00;

    .line 1519
    .line 1520
    iget-object v2, v0, La/xm00;->e:La/mne;

    .line 1521
    .line 1522
    iget-object v12, v2, La/mne;->a:La/rwj;

    .line 1523
    .line 1524
    new-instance v13, La/kaw;

    .line 1525
    .line 1526
    const/16 v2, 0x16

    .line 1527
    .line 1528
    invoke-direct {v13, v0, v1, v8, v2}, La/kaw;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1529
    .line 1530
    .line 1531
    const/16 v14, 0xa

    .line 1532
    .line 1533
    const/4 v11, 0x0

    .line 1534
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1535
    .line 1536
    .line 1537
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1538
    .line 1539
    return-object v0

    .line 1540
    nop

    .line 1541
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

    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    :sswitch_data_0
    .sparse-switch
        -0x796a068e -> :sswitch_4
        -0x6a9d76d1 -> :sswitch_3
        -0x1ac3130c -> :sswitch_2
        0xabcb89a -> :sswitch_1
        0x4153bbe1 -> :sswitch_0
    .end sparse-switch
.end method
