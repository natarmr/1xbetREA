.class public final synthetic La/p240;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j340;


# direct methods
.method public synthetic constructor <init>(La/j340;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p240;->a:B

    iput-object p1, p0, La/p240;->b:La/j340;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/p240;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/p240;->b:La/j340;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/k0w0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/q240;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-direct {v0, p0, v1}, La/q240;-><init>(La/j340;B)V

    .line 19
    .line 20
    .line 21
    new-instance p0, La/a1w0;

    .line 22
    .line 23
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, La/c8d;

    .line 33
    .line 34
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 35
    .line 36
    new-instance v0, La/v7d;

    .line 37
    .line 38
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, La/j340;->S0:La/lk5;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance p0, Lorg/xplatform/favorites/impl/di/FavoritesScreenFactoryImpl$getTeamBetTeamsScreen$1;

    .line 57
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, La/c8d;

    .line 68
    .line 69
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 70
    .line 71
    new-instance v0, La/v7d;

    .line 72
    .line 73
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, La/j340;->T0:La/eke0;

    .line 87
    .line 88
    sget-object v0, La/bhh0;->c:La/bhh0;

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance p0, Lorg/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;

    .line 94
    .line 95
    invoke-direct {p0, v0}, Lorg/xplatform/search/impl/navigation/SearchScreenFactoryImpl$getSectionSearchFragmentScreen$1;-><init>(La/bhh0;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, La/c8d;

    .line 105
    .line 106
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 107
    .line 108
    new-instance v0, La/v7d;

    .line 109
    .line 110
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object p0, p0, La/j340;->e0:La/g9m0;

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance p0, Lorg/xplatform/swipex/impl/navigation/SwipexScreenFactoryImpl$getSwipexScreen$1;

    .line 129
    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p0, La/c8d;

    .line 140
    .line 141
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 142
    .line 143
    new-instance v0, La/v7d;

    .line 144
    .line 145
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object p0, p0, La/j340;->I:La/duj;

    .line 159
    .line 160
    new-instance v0, La/o240;

    .line 161
    .line 162
    invoke-direct {v0, v1}, La/o240;-><init>(B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_4
    check-cast p1, La/k0w0;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v0, La/ffd;

    .line 177
    .line 178
    const/4 v1, 0x0

    .line 179
    const/16 v3, 0x1b

    .line 180
    .line 181
    invoke-direct {v0, p0, v1, v3}, La/ffd;-><init>(La/diu0;La/yje;B)V

    .line 182
    .line 183
    .line 184
    new-instance p0, La/b1w0;

    .line 185
    .line 186
    invoke-direct {p0, v0}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast p0, La/c8d;

    .line 196
    .line 197
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 198
    .line 199
    new-instance v0, La/v7d;

    .line 200
    .line 201
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 202
    .line 203
    .line 204
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 205
    .line 206
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_5
    check-cast p1, La/k0w0;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    iget-object p0, p0, La/j340;->U:La/vjp;

    .line 215
    .line 216
    sget-object v0, La/j700;->b:La/j700;

    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance p0, Lorg/xplatform/feed/navigation/FeedScreenFactoryImpl$getBetOnYourScreen$1;

    .line 222
    .line 223
    invoke-direct {p0, v0}, Lorg/xplatform/feed/navigation/FeedScreenFactoryImpl$getBetOnYourScreen$1;-><init>(La/j700;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p0, La/c8d;

    .line 233
    .line 234
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 235
    .line 236
    new-instance v0, La/v7d;

    .line 237
    .line 238
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 239
    .line 240
    .line 241
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 242
    .line 243
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_6
    check-cast p1, La/k0w0;

    .line 247
    .line 248
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object p0, p0, La/j340;->W:La/peg0;

    .line 252
    .line 253
    invoke-virtual {p0}, La/peg0;->k()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p0, La/c8d;

    .line 264
    .line 265
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 266
    .line 267
    new-instance v0, La/v7d;

    .line 268
    .line 269
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 270
    .line 271
    .line 272
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 273
    .line 274
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    iget-object p0, p0, La/j340;->I:La/duj;

    .line 283
    .line 284
    new-instance v0, La/o240;

    .line 285
    .line 286
    invoke-direct {v0, v2}, La/o240;-><init>(B)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 290
    .line 291
    .line 292
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object p0

    .line 295
    :pswitch_8
    check-cast p1, La/k0w0;

    .line 296
    .line 297
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    iget-object p0, p0, La/j340;->p0:Lorg/xplatform/toto_bet/core/navigation/a;

    .line 301
    .line 302
    invoke-virtual {p0}, Lorg/xplatform/toto_bet/core/navigation/a;->a()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast p0, La/c8d;

    .line 313
    .line 314
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 315
    .line 316
    new-instance v0, La/v7d;

    .line 317
    .line 318
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 319
    .line 320
    .line 321
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 322
    .line 323
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object p0

    .line 326
    :pswitch_9
    check-cast p1, La/k0w0;

    .line 327
    .line 328
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    iget-object p0, p0, La/j340;->Z:La/jh70;

    .line 332
    .line 333
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    new-instance p0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoCodesScreen$1;

    .line 337
    .line 338
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast p0, La/c8d;

    .line 348
    .line 349
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 350
    .line 351
    new-instance v0, La/v7d;

    .line 352
    .line 353
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 354
    .line 355
    .line 356
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 357
    .line 358
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 359
    .line 360
    return-object p0

    .line 361
    :pswitch_a
    check-cast p1, La/k0w0;

    .line 362
    .line 363
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    iget-object p0, p0, La/j340;->J0:La/atz;

    .line 367
    .line 368
    sget-object v0, La/fd10;->a:La/fd10;

    .line 369
    .line 370
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    new-instance p0, Lorg/xplatform/lotto/impl/navigation/LottoScreenFactoryImpl$getLottoScreen$1;

    .line 374
    .line 375
    invoke-direct {p0, v0}, Lorg/xplatform/lotto/impl/navigation/LottoScreenFactoryImpl$getLottoScreen$1;-><init>(La/fd10;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast p0, La/c8d;

    .line 385
    .line 386
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 387
    .line 388
    new-instance v0, La/v7d;

    .line 389
    .line 390
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 391
    .line 392
    .line 393
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 394
    .line 395
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object p0

    .line 398
    :pswitch_b
    check-cast p1, La/k0w0;

    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    iget-object p0, p0, La/j340;->z0:La/kl5;

    .line 404
    .line 405
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    new-instance p0, Lorg/xplatform/coinplay_sport_cashback_impl/navigation/CoinplaySportCashbackScreenFactoryImpl$getScreen$1;

    .line 409
    .line 410
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 411
    .line 412
    .line 413
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast p0, La/c8d;

    .line 420
    .line 421
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 422
    .line 423
    new-instance v0, La/v7d;

    .line 424
    .line 425
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 426
    .line 427
    .line 428
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 429
    .line 430
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 431
    .line 432
    return-object p0

    .line 433
    :pswitch_c
    check-cast p1, La/k0w0;

    .line 434
    .line 435
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object p0, p0, La/j340;->m0:La/lk5;

    .line 439
    .line 440
    invoke-static {p0}, La/lk5;->b(La/lk5;)Lorg/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast p0, La/c8d;

    .line 451
    .line 452
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 453
    .line 454
    new-instance v0, La/v7d;

    .line 455
    .line 456
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 457
    .line 458
    .line 459
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 460
    .line 461
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object p0

    .line 464
    :pswitch_d
    check-cast p1, La/k0w0;

    .line 465
    .line 466
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    iget-object v0, p0, La/j340;->Z:La/jh70;

    .line 470
    .line 471
    iget-object p0, p0, La/j340;->Z0:La/sff0;

    .line 472
    .line 473
    iget-object p0, p0, La/sff0;->V0:La/zuc0;

    .line 474
    .line 475
    invoke-static {v0, p0}, La/jh70;->i(La/jh70;La/zuc0;)Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast p0, La/c8d;

    .line 486
    .line 487
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 488
    .line 489
    new-instance v0, La/v7d;

    .line 490
    .line 491
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 492
    .line 493
    .line 494
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 495
    .line 496
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    return-object p0

    .line 499
    :pswitch_e
    check-cast p1, La/k0w0;

    .line 500
    .line 501
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    iget-object v0, p0, La/j340;->Z0:La/sff0;

    .line 505
    .line 506
    iget-boolean v0, v0, La/sff0;->B0:Z

    .line 507
    .line 508
    if-eqz v0, :cond_0

    .line 509
    .line 510
    iget-object v0, p0, La/j340;->O:La/r9u;

    .line 511
    .line 512
    sget-object v3, La/ygp;->u:La/ygp;

    .line 513
    .line 514
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 523
    .line 524
    invoke-virtual {v0, v3}, La/m1q0;->d(La/ygp;)Z

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    if-eqz v0, :cond_0

    .line 529
    .line 530
    move v1, v2

    .line 531
    :cond_0
    iget-object p0, p0, La/j340;->r0:La/m6m0;

    .line 532
    .line 533
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    new-instance p0, Lorg/xplatform/feed/navigation/SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1;

    .line 537
    .line 538
    invoke-direct {p0, v1}, Lorg/xplatform/feed/navigation/SubscriptionsScreenFactoryImpl$getSubscriptionsScreen$1;-><init>(Z)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 542
    .line 543
    .line 544
    move-result-object p0

    .line 545
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast p0, La/c8d;

    .line 548
    .line 549
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 550
    .line 551
    new-instance v0, La/v7d;

    .line 552
    .line 553
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 554
    .line 555
    .line 556
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 557
    .line 558
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 559
    .line 560
    return-object p0

    .line 561
    :pswitch_f
    check-cast p1, La/k0w0;

    .line 562
    .line 563
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    iget-object p0, p0, La/j340;->s0:La/xr;

    .line 567
    .line 568
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    invoke-static {}, La/xr;->s()Lorg/xplatform/bethistory/coupon_scanner/presentation/CouponScannerScreen;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast p0, La/c8d;

    .line 582
    .line 583
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 584
    .line 585
    new-instance v0, La/v7d;

    .line 586
    .line 587
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 588
    .line 589
    .line 590
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 591
    .line 592
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 593
    .line 594
    return-object p0

    .line 595
    :pswitch_10
    check-cast p1, La/k0w0;

    .line 596
    .line 597
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    iget-object v0, p0, La/j340;->o0:La/kj5;

    .line 601
    .line 602
    iget-object p0, p0, La/j340;->O:La/r9u;

    .line 603
    .line 604
    sget-object v1, La/ygp;->k1:La/ygp;

    .line 605
    .line 606
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 610
    .line 611
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 615
    .line 616
    invoke-virtual {p0, v1}, La/m1q0;->d(La/ygp;)Z

    .line 617
    .line 618
    .line 619
    move-result p0

    .line 620
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    invoke-static {p0}, La/kj5;->g(Z)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 624
    .line 625
    .line 626
    move-result-object p0

    .line 627
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 628
    .line 629
    .line 630
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    return-object p0

    .line 633
    :pswitch_data_0
    .packed-switch 0x0
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
