.class public final synthetic La/wyb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/wyb0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/tac0;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/wyb0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/wyb0;->a:B

    .line 6
    .line 7
    const/16 v2, 0xc

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v0, v1

    .line 15
    check-cast v0, Ljava/lang/Throwable;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    move-object v0, v1

    .line 27
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    sget-object v1, La/kjc0;->P1:[La/iiy;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 36
    .line 37
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v1, La/sx3;

    .line 45
    .line 46
    invoke-direct {v1, v0, v4}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_1
    move-object v0, v1

    .line 51
    check-cast v0, Ljava/lang/Throwable;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_2
    move-object v0, v1

    .line 63
    check-cast v0, Ljava/lang/Throwable;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_3
    move-object v0, v1

    .line 75
    check-cast v0, Ljava/lang/Throwable;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 81
    .line 82
    .line 83
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_4
    move-object v0, v1

    .line 87
    check-cast v0, Ljava/lang/Throwable;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 93
    .line 94
    .line 95
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_5
    move-object v0, v1

    .line 99
    check-cast v0, Ljava/lang/Throwable;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 105
    .line 106
    .line 107
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object v0

    .line 110
    :pswitch_6
    move-object v0, v1

    .line 111
    check-cast v0, La/kgc0;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v1, La/wgc0;

    .line 117
    .line 118
    iget-object v2, v0, La/kgc0;->a:La/vgc0;

    .line 119
    .line 120
    iget-boolean v3, v0, La/kgc0;->b:Z

    .line 121
    .line 122
    iget-boolean v4, v0, La/kgc0;->c:Z

    .line 123
    .line 124
    iget-object v5, v0, La/kgc0;->d:Ljava/lang/String;

    .line 125
    .line 126
    iget-object v6, v0, La/kgc0;->e:La/dxh0;

    .line 127
    .line 128
    iget-object v7, v0, La/kgc0;->f:La/a4x;

    .line 129
    .line 130
    iget-object v8, v0, La/kgc0;->g:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v9, v0, La/kgc0;->h:Ljava/lang/String;

    .line 133
    .line 134
    invoke-direct/range {v1 .. v9}, La/wgc0;-><init>(La/vgc0;ZZLjava/lang/String;La/dxh0;La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v1

    .line 138
    :pswitch_7
    move-object v0, v1

    .line 139
    check-cast v0, La/bec0;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v1, v0, La/bec0;->a:La/a4x;

    .line 145
    .line 146
    iget-boolean v2, v0, La/bec0;->d:Z

    .line 147
    .line 148
    new-instance v5, Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_2

    .line 162
    .line 163
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    move-object v7, v6

    .line 168
    check-cast v7, La/aec0;

    .line 169
    .line 170
    iget-object v7, v7, La/aec0;->d:La/ydc0;

    .line 171
    .line 172
    sget-object v8, La/ydc0;->c:La/ydc0;

    .line 173
    .line 174
    if-eq v7, v8, :cond_0

    .line 175
    .line 176
    iget-object v9, v0, La/bec0;->b:La/ydc0;

    .line 177
    .line 178
    if-eq v7, v9, :cond_1

    .line 179
    .line 180
    if-ne v9, v8, :cond_0

    .line 181
    .line 182
    :cond_1
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_2
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 187
    .line 188
    .line 189
    move-result-object v13

    .line 190
    iget-boolean v1, v0, La/bec0;->e:Z

    .line 191
    .line 192
    if-nez v1, :cond_4

    .line 193
    .line 194
    iget-boolean v1, v0, La/bec0;->o:Z

    .line 195
    .line 196
    if-nez v1, :cond_3

    .line 197
    .line 198
    if-nez v2, :cond_3

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_3
    move v1, v3

    .line 202
    goto :goto_2

    .line 203
    :cond_4
    :goto_1
    move v1, v4

    .line 204
    :goto_2
    iget-object v5, v0, La/bec0;->p:La/kdc0;

    .line 205
    .line 206
    iget-boolean v6, v5, La/kdc0;->a:Z

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    if-eqz v6, :cond_6

    .line 210
    .line 211
    new-instance v3, La/ldc0;

    .line 212
    .line 213
    new-instance v6, La/se;

    .line 214
    .line 215
    iget-object v8, v5, La/kdc0;->e:Ljava/lang/String;

    .line 216
    .line 217
    new-instance v9, La/oe;

    .line 218
    .line 219
    iget v10, v5, La/kdc0;->c:I

    .line 220
    .line 221
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    iget-object v11, v5, La/kdc0;->f:Ljava/lang/String;

    .line 226
    .line 227
    invoke-direct {v9, v10, v11}, La/oe;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    iget-boolean v10, v5, La/kdc0;->b:Z

    .line 231
    .line 232
    if-eqz v10, :cond_5

    .line 233
    .line 234
    new-instance v7, La/le;

    .line 235
    .line 236
    new-instance v10, La/ue9;

    .line 237
    .line 238
    iget-object v11, v5, La/kdc0;->g:Ljava/lang/String;

    .line 239
    .line 240
    invoke-direct {v10, v11}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    sget-object v11, La/lul;->e:La/lul;

    .line 244
    .line 245
    iget-boolean v5, v5, La/kdc0;->d:Z

    .line 246
    .line 247
    invoke-direct {v7, v10, v11, v5}, La/le;-><init>(La/xe9;La/sul;Z)V

    .line 248
    .line 249
    .line 250
    :cond_5
    invoke-direct {v6, v8, v9, v7}, La/se;-><init>(Ljava/lang/String;La/oe;La/le;)V

    .line 251
    .line 252
    .line 253
    invoke-direct {v3, v4, v6}, La/ldc0;-><init>(ZLa/se;)V

    .line 254
    .line 255
    .line 256
    move-object/from16 v18, v3

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_6
    new-instance v4, La/ldc0;

    .line 260
    .line 261
    invoke-direct {v4, v3, v7}, La/ldc0;-><init>(ZLa/se;)V

    .line 262
    .line 263
    .line 264
    move-object/from16 v18, v4

    .line 265
    .line 266
    :goto_3
    if-eqz v2, :cond_7

    .line 267
    .line 268
    sget-object v0, La/mec0;->a:La/mec0;

    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_7
    if-eqz v1, :cond_8

    .line 272
    .line 273
    new-instance v1, La/lec0;

    .line 274
    .line 275
    iget-object v0, v0, La/bec0;->i:La/mdm;

    .line 276
    .line 277
    invoke-direct {v1, v0}, La/lec0;-><init>(La/mdm;)V

    .line 278
    .line 279
    .line 280
    move-object v0, v1

    .line 281
    goto :goto_5

    .line 282
    :cond_8
    iget-object v11, v0, La/bec0;->c:La/a4x;

    .line 283
    .line 284
    iget-boolean v12, v0, La/bec0;->f:Z

    .line 285
    .line 286
    iget-object v14, v0, La/bec0;->j:La/mdm;

    .line 287
    .line 288
    iget-object v1, v0, La/bec0;->l:Ljava/util/List;

    .line 289
    .line 290
    new-instance v2, Ljava/util/ArrayList;

    .line 291
    .line 292
    const/16 v3, 0xa

    .line 293
    .line 294
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    if-eqz v3, :cond_9

    .line 310
    .line 311
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    check-cast v3, La/vrc0;

    .line 316
    .line 317
    invoke-static {v3}, La/s0x;->e0(La/vrc0;)La/yrc0;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_9
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 326
    .line 327
    .line 328
    move-result-object v15

    .line 329
    iget-object v1, v0, La/bec0;->m:Ljava/lang/String;

    .line 330
    .line 331
    iget-boolean v0, v0, La/bec0;->n:Z

    .line 332
    .line 333
    new-instance v10, La/kec0;

    .line 334
    .line 335
    move/from16 v17, v0

    .line 336
    .line 337
    move-object/from16 v16, v1

    .line 338
    .line 339
    invoke-direct/range {v10 .. v18}, La/kec0;-><init>(La/a4x;ZLa/a4x;La/mdm;La/a4x;Ljava/lang/String;ZLa/ldc0;)V

    .line 340
    .line 341
    .line 342
    move-object v0, v10

    .line 343
    :goto_5
    return-object v0

    .line 344
    :pswitch_8
    move-object v0, v1

    .line 345
    check-cast v0, La/k0w0;

    .line 346
    .line 347
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    new-instance v1, Lorg/xplatform/coinplay_sport_cashback_impl/navigation/CoinplaySportCashbackScreenFactoryImpl$getScreen$1;

    .line 351
    .line 352
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, La/c8d;

    .line 362
    .line 363
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 364
    .line 365
    new-instance v2, La/v7d;

    .line 366
    .line 367
    invoke-direct {v2, v4, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 368
    .line 369
    .line 370
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 371
    .line 372
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 373
    .line 374
    return-object v0

    .line 375
    :pswitch_9
    move-object v0, v1

    .line 376
    check-cast v0, La/k0w0;

    .line 377
    .line 378
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    new-instance v1, Lorg/xplatform/cashback/impl/navigation/CashbackScreenFactoryImpl$getCashbackScreen$1;

    .line 382
    .line 383
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v0, La/c8d;

    .line 393
    .line 394
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 395
    .line 396
    new-instance v2, La/v7d;

    .line 397
    .line 398
    invoke-direct {v2, v4, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 399
    .line 400
    .line 401
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 402
    .line 403
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 404
    .line 405
    return-object v0

    .line 406
    :pswitch_a
    move-object v0, v1

    .line 407
    check-cast v0, La/k0w0;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    new-instance v1, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoCheckScreen$1;

    .line 413
    .line 414
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, La/c8d;

    .line 424
    .line 425
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 426
    .line 427
    new-instance v2, La/v7d;

    .line 428
    .line 429
    invoke-direct {v2, v4, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 430
    .line 431
    .line 432
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 433
    .line 434
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object v0

    .line 437
    :pswitch_b
    move-object v0, v1

    .line 438
    check-cast v0, La/k0w0;

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    new-instance v1, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoCodesScreen$1;

    .line 444
    .line 445
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v0, La/c8d;

    .line 455
    .line 456
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 457
    .line 458
    new-instance v2, La/v7d;

    .line 459
    .line 460
    invoke-direct {v2, v4, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 461
    .line 462
    .line 463
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 464
    .line 465
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 466
    .line 467
    return-object v0

    .line 468
    :pswitch_c
    move-object v0, v1

    .line 469
    check-cast v0, Ljava/lang/Throwable;

    .line 470
    .line 471
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 475
    .line 476
    .line 477
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 478
    .line 479
    return-object v0

    .line 480
    :pswitch_d
    move-object v0, v1

    .line 481
    check-cast v0, La/cp;

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 487
    .line 488
    check-cast v0, La/w2k;

    .line 489
    .line 490
    iget-object v0, v0, La/w2k;->a:Landroid/widget/LinearLayout;

    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 496
    .line 497
    .line 498
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_e
    move-object v0, v1

    .line 502
    check-cast v0, La/cp;

    .line 503
    .line 504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 508
    .line 509
    check-cast v0, La/u2k;

    .line 510
    .line 511
    iget-object v0, v0, La/u2k;->a:Landroidx/cardview/widget/CardView;

    .line 512
    .line 513
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 514
    .line 515
    .line 516
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_f
    move-object v0, v1

    .line 520
    check-cast v0, Ljava/lang/Throwable;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 526
    .line 527
    .line 528
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 529
    .line 530
    return-object v0

    .line 531
    :pswitch_10
    move-object v0, v1

    .line 532
    check-cast v0, La/cp;

    .line 533
    .line 534
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 538
    .line 539
    check-cast v1, La/s2k;

    .line 540
    .line 541
    iget-object v1, v1, La/s2k;->a:Landroid/widget/LinearLayout;

    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-static {v1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 547
    .line 548
    .line 549
    new-instance v1, La/ctv;

    .line 550
    .line 551
    const/16 v2, 0x10

    .line 552
    .line 553
    invoke-direct {v1, v0, v0, v2}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 557
    .line 558
    .line 559
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    return-object v0

    .line 562
    :pswitch_11
    move-object v0, v1

    .line 563
    check-cast v0, La/cp;

    .line 564
    .line 565
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 569
    .line 570
    check-cast v0, La/y2k;

    .line 571
    .line 572
    iget-object v0, v0, La/y2k;->a:Landroid/widget/FrameLayout;

    .line 573
    .line 574
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 575
    .line 576
    .line 577
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_12
    move-object v0, v1

    .line 581
    check-cast v0, La/cp;

    .line 582
    .line 583
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 587
    .line 588
    check-cast v1, La/q2k;

    .line 589
    .line 590
    iget-object v1, v1, La/q2k;->a:Landroid/widget/LinearLayout;

    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    invoke-static {v1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 596
    .line 597
    .line 598
    new-instance v1, La/ctv;

    .line 599
    .line 600
    invoke-direct {v1, v0, v0, v2}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 604
    .line 605
    .line 606
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 607
    .line 608
    return-object v0

    .line 609
    :pswitch_13
    move-object v0, v1

    .line 610
    check-cast v0, La/cp;

    .line 611
    .line 612
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 616
    .line 617
    check-cast v0, La/m2k;

    .line 618
    .line 619
    iget-object v0, v0, La/m2k;->a:Landroid/widget/LinearLayout;

    .line 620
    .line 621
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 622
    .line 623
    .line 624
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_14
    move-object v0, v1

    .line 628
    check-cast v0, La/cp;

    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 634
    .line 635
    check-cast v0, La/k2k;

    .line 636
    .line 637
    iget-object v1, v0, La/k2k;->a:Landroidx/cardview/widget/CardView;

    .line 638
    .line 639
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    invoke-static {v1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 643
    .line 644
    .line 645
    iget-object v0, v0, La/k2k;->b:Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;

    .line 646
    .line 647
    new-instance v1, Ljava/util/ArrayList;

    .line 648
    .line 649
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 650
    .line 651
    .line 652
    iget v2, v0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->s2:I

    .line 653
    .line 654
    invoke-static {v3, v2}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->M(Ljava/lang/Iterable;)I

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    :goto_6
    if-ge v3, v2, :cond_a

    .line 663
    .line 664
    sget-object v4, La/bqj0;->a:La/bqj0;

    .line 665
    .line 666
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    add-int/lit8 v3, v3, 0x1

    .line 670
    .line 671
    goto :goto_6

    .line 672
    :cond_a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    check-cast v0, La/j4c0;

    .line 680
    .line 681
    invoke-virtual {v0, v1}, La/q4;->G(Ljava/util/List;)V

    .line 682
    .line 683
    .line 684
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 685
    .line 686
    return-object v0

    .line 687
    :pswitch_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    move-object v0, v1

    .line 691
    check-cast v0, Ljava/util/Set;

    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_16
    move-object v0, v1

    .line 695
    check-cast v0, La/abi0;

    .line 696
    .line 697
    sget-object v1, La/g3c0;->c:La/g3c0;

    .line 698
    .line 699
    invoke-static {v0, v1}, La/yai0;->d(La/abi0;La/g3c0;)V

    .line 700
    .line 701
    .line 702
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 703
    .line 704
    return-object v0

    .line 705
    :pswitch_17
    move-object v0, v1

    .line 706
    check-cast v0, La/imy;

    .line 707
    .line 708
    const/16 v1, 0x1770

    .line 709
    .line 710
    iput v1, v0, La/imy;->a:I

    .line 711
    .line 712
    const/high16 v2, 0x42b40000    # 90.0f

    .line 713
    .line 714
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    const/16 v3, 0x12c

    .line 719
    .line 720
    invoke-virtual {v0, v3, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    sget-object v4, La/bu40;->a:La/zsf;

    .line 725
    .line 726
    iput-object v4, v3, La/hmy;->b:La/ghn;

    .line 727
    .line 728
    const/16 v3, 0x5dc

    .line 729
    .line 730
    invoke-virtual {v0, v3, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 731
    .line 732
    .line 733
    const/high16 v2, 0x43340000    # 180.0f

    .line 734
    .line 735
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    const/16 v3, 0x708

    .line 740
    .line 741
    invoke-virtual {v0, v3, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 742
    .line 743
    .line 744
    const/16 v3, 0xbb8

    .line 745
    .line 746
    invoke-virtual {v0, v3, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 747
    .line 748
    .line 749
    const/high16 v2, 0x43870000    # 270.0f

    .line 750
    .line 751
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    const/16 v3, 0xce4

    .line 756
    .line 757
    invoke-virtual {v0, v3, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 758
    .line 759
    .line 760
    const/16 v3, 0x1194

    .line 761
    .line 762
    invoke-virtual {v0, v3, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 763
    .line 764
    .line 765
    const/high16 v2, 0x43b40000    # 360.0f

    .line 766
    .line 767
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    const/16 v3, 0x12c0

    .line 772
    .line 773
    invoke-virtual {v0, v3, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v0, v1, v2}, La/imy;->a(ILjava/lang/Object;)La/hmy;

    .line 777
    .line 778
    .line 779
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 780
    .line 781
    return-object v0

    .line 782
    :pswitch_18
    move-object v0, v1

    .line 783
    check-cast v0, La/cp;

    .line 784
    .line 785
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    new-instance v1, La/ui80;

    .line 789
    .line 790
    invoke-direct {v1, v0, v2}, La/ui80;-><init>(La/cp;B)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 794
    .line 795
    .line 796
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 797
    .line 798
    return-object v0

    .line 799
    :pswitch_19
    sget-object v0, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 800
    .line 801
    instance-of v0, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelTitle;

    .line 802
    .line 803
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    return-object v0

    .line 808
    :pswitch_1a
    sget-object v0, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 809
    .line 810
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    instance-of v0, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 814
    .line 815
    if-nez v0, :cond_b

    .line 816
    .line 817
    instance-of v0, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 818
    .line 819
    if-eqz v0, :cond_c

    .line 820
    .line 821
    :cond_b
    move v3, v4

    .line 822
    :cond_c
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    return-object v0

    .line 827
    :pswitch_1b
    sget-object v0, Lorg/xplatform/personal/impl/presentation/edit/a;->X1:La/fl70;

    .line 828
    .line 829
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    instance-of v0, v1, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModel;

    .line 833
    .line 834
    if-eqz v0, :cond_d

    .line 835
    .line 836
    move-object v0, v1

    .line 837
    check-cast v0, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModel;

    .line 838
    .line 839
    invoke-virtual {v0}, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModel;->p()Z

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    if-eqz v0, :cond_d

    .line 844
    .line 845
    move v3, v4

    .line 846
    :cond_d
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    return-object v0

    .line 851
    :pswitch_1c
    move-object v0, v1

    .line 852
    check-cast v0, Landroid/content/Context;

    .line 853
    .line 854
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    new-instance v2, Landroid/content/Intent;

    .line 859
    .line 860
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 861
    .line 862
    .line 863
    const-string v4, "android.intent.action.PROCESS_TEXT"

    .line 864
    .line 865
    invoke-virtual {v2, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    const-string v4, "text/plain"

    .line 870
    .line 871
    invoke-virtual {v2, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    new-instance v2, Ljava/util/ArrayList;

    .line 880
    .line 881
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 882
    .line 883
    .line 884
    move-result v4

    .line 885
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 886
    .line 887
    .line 888
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 889
    .line 890
    .line 891
    move-result v4

    .line 892
    :goto_7
    if-ge v3, v4, :cond_10

    .line 893
    .line 894
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v5

    .line 898
    move-object v6, v5

    .line 899
    check-cast v6, Landroid/content/pm/ResolveInfo;

    .line 900
    .line 901
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v7

    .line 905
    iget-object v8, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 906
    .line 907
    iget-object v8, v8, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 908
    .line 909
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    move-result v7

    .line 913
    if-nez v7, :cond_e

    .line 914
    .line 915
    iget-object v6, v6, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 916
    .line 917
    iget-boolean v7, v6, Landroid/content/pm/ActivityInfo;->exported:Z

    .line 918
    .line 919
    if-eqz v7, :cond_f

    .line 920
    .line 921
    iget-object v6, v6, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    .line 922
    .line 923
    if-eqz v6, :cond_e

    .line 924
    .line 925
    invoke-virtual {v0, v6}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 926
    .line 927
    .line 928
    move-result v6

    .line 929
    if-nez v6, :cond_f

    .line 930
    .line 931
    :cond_e
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 935
    .line 936
    goto :goto_7

    .line 937
    :cond_10
    return-object v2

    .line 938
    nop

    .line 939
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
