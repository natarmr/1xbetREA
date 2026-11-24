.class public final synthetic La/lph0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/lph0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lph0;->a:B

    .line 4
    .line 5
    const-string v2, "ev_place_bet_deposit"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/dzm0;

    .line 18
    .line 19
    iget-object v1, v0, La/dzm0;->d:La/i1w0;

    .line 20
    .line 21
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v0, v0, La/dzm0;->i:La/evz;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, Lorg/xplatform/sportgame/markets/display_settings/impl/navigation/MarketsDisplaySettingsScreenFactoryImpl$getScreen$1;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 36
    .line 37
    .line 38
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 39
    .line 40
    invoke-static {v1, v0, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    move-object v2, v0

    .line 45
    check-cast v2, La/paw;

    .line 46
    .line 47
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, La/oe50;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La/dzm0;

    .line 69
    .line 70
    iget-object v1, v0, La/dzm0;->k:La/vmr;

    .line 71
    .line 72
    iget-object v2, v0, La/dzm0;->c:Lorg/xplatform/sportgame/subgames/api/SubGamesParams;

    .line 73
    .line 74
    iget-wide v2, v2, Lorg/xplatform/sportgame/subgames/api/SubGamesParams;->d:J

    .line 75
    .line 76
    iget-object v4, v1, La/vmr;->a:La/bn6;

    .line 77
    .line 78
    iget-object v4, v4, La/bn6;->b:La/kt2;

    .line 79
    .line 80
    const-string v5, "sport_id"

    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    const-string v8, "bet_game_sub_call"

    .line 87
    .line 88
    invoke-static {v5, v6, v4, v8}, La/h97;->x(Ljava/lang/String;Ljava/lang/Long;La/kt2;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v1, v1, La/vmr;->b:La/je;

    .line 92
    .line 93
    iget-object v1, v1, La/je;->a:La/s1p;

    .line 94
    .line 95
    const-wide/16 v4, 0xc6f

    .line 96
    .line 97
    invoke-static {v2, v3, v1, v4, v5}, La/h97;->r(JLa/s1p;J)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, La/dzm0;->o:La/p7m0;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    sget-object v1, La/vwm0;->a:La/vwm0;

    .line 106
    .line 107
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_1
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, La/rqm0;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object v1, La/da10;->b:La/da10;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, La/rqm0;->z(La/da10;)V

    .line 123
    .line 124
    .line 125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_2
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, La/rqm0;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    sget-object v1, La/da10;->c:La/da10;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, La/rqm0;->z(La/da10;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, La/rqm0;->w()V

    .line 141
    .line 142
    .line 143
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object v0

    .line 146
    :pswitch_3
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, La/rqm0;

    .line 149
    .line 150
    iget-object v0, v0, La/rqm0;->c:La/hzg;

    .line 151
    .line 152
    check-cast v0, La/uzg;

    .line 153
    .line 154
    invoke-virtual {v0}, La/uzg;->a()V

    .line 155
    .line 156
    .line 157
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object v0

    .line 160
    :pswitch_4
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, La/tam0;

    .line 163
    .line 164
    invoke-virtual {v0}, La/tam0;->z()V

    .line 165
    .line 166
    .line 167
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_5
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, La/tam0;

    .line 173
    .line 174
    iget-object v1, v0, La/tam0;->n:Ljava/util/ArrayList;

    .line 175
    .line 176
    iget-object v2, v0, La/tam0;->o:Ljava/util/List;

    .line 177
    .line 178
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-nez v1, :cond_1

    .line 183
    .line 184
    iget-object v0, v0, La/tam0;->l:La/ol60;

    .line 185
    .line 186
    sget-object v1, La/k9m0;->a:La/k9m0;

    .line 187
    .line 188
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_1
    invoke-virtual {v0}, La/tam0;->x()V

    .line 193
    .line 194
    .line 195
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_6
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, La/mtl0;

    .line 201
    .line 202
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0

    .line 207
    :pswitch_7
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, La/ysl0;

    .line 210
    .line 211
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    return-object v0

    .line 216
    :pswitch_8
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, La/ndl0;

    .line 219
    .line 220
    iget-object v1, v0, La/ndl0;->l:La/c4m0;

    .line 221
    .line 222
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, La/ndl0;->y()V

    .line 226
    .line 227
    .line 228
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_9
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v0, La/ndl0;

    .line 234
    .line 235
    invoke-virtual {v0}, La/ndl0;->a()V

    .line 236
    .line 237
    .line 238
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, La/ndl0;

    .line 244
    .line 245
    iget-object v1, v0, La/ndl0;->j:La/z220;

    .line 246
    .line 247
    sget-object v2, La/iun;->a:La/iun;

    .line 248
    .line 249
    sget-object v3, La/j1i0;->c:La/j1i0;

    .line 250
    .line 251
    iget-object v4, v0, La/ndl0;->b:Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 252
    .line 253
    iget-object v5, v4, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;->c:La/ms2;

    .line 254
    .line 255
    iget v4, v4, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;->a:I

    .line 256
    .line 257
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-virtual {v1, v2, v3, v5, v4}, La/z220;->F(Ljava/util/List;La/j1i0;La/ms2;Ljava/lang/Integer;)V

    .line 262
    .line 263
    .line 264
    sget-object v1, La/vcl0;->a:La/vcl0;

    .line 265
    .line 266
    invoke-virtual {v0, v1}, La/ndl0;->A(La/ycl0;)V

    .line 267
    .line 268
    .line 269
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, La/wyj0;

    .line 275
    .line 276
    iget-object v1, v0, La/wyj0;->z:La/ih5;

    .line 277
    .line 278
    sget-object v2, La/k7k;->h1:La/k7k;

    .line 279
    .line 280
    invoke-virtual {v1, v2}, La/ih5;->f(La/k7k;)V

    .line 281
    .line 282
    .line 283
    iget-object v1, v0, La/wyj0;->A:La/l7k;

    .line 284
    .line 285
    sget-object v2, La/y1p;->b:La/y1p;

    .line 286
    .line 287
    iget-object v2, v0, La/wyj0;->B:La/cmt;

    .line 288
    .line 289
    invoke-virtual {v2}, La/cmt;->g()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    const-string v3, "toto"

    .line 294
    .line 295
    invoke-virtual {v1, v3, v2}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    new-instance v9, La/pyj0;

    .line 303
    .line 304
    invoke-direct {v9, v0, v4}, La/pyj0;-><init>(La/wyj0;B)V

    .line 305
    .line 306
    .line 307
    new-instance v12, La/myj0;

    .line 308
    .line 309
    invoke-direct {v12, v0, v7}, La/myj0;-><init>(La/wyj0;La/yje;)V

    .line 310
    .line 311
    .line 312
    const/16 v13, 0xe

    .line 313
    .line 314
    const/4 v10, 0x0

    .line 315
    const/4 v11, 0x0

    .line 316
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 317
    .line 318
    .line 319
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    :pswitch_c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, La/xxj0;

    .line 325
    .line 326
    invoke-virtual {v0}, La/xxj0;->J()V

    .line 327
    .line 328
    .line 329
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    return-object v0

    .line 332
    :pswitch_d
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, La/jvj0;

    .line 335
    .line 336
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    return-object v0

    .line 341
    :pswitch_e
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v0, La/yxj0;

    .line 344
    .line 345
    iget-object v1, v0, La/yxj0;->P:La/ih5;

    .line 346
    .line 347
    sget-object v4, La/k7k;->o1:La/k7k;

    .line 348
    .line 349
    invoke-virtual {v1, v4}, La/ih5;->f(La/k7k;)V

    .line 350
    .line 351
    .line 352
    iget-object v1, v0, La/yxj0;->Q:La/l7k;

    .line 353
    .line 354
    sget-object v4, La/y1p;->b:La/y1p;

    .line 355
    .line 356
    iget-object v4, v0, La/yxj0;->S:La/cmt;

    .line 357
    .line 358
    invoke-virtual {v4}, La/cmt;->g()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    const-string v5, "no_money_fin_bet"

    .line 363
    .line 364
    invoke-virtual {v1, v5, v4}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0}, La/yxj0;->D()La/ql5;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    if-nez v1, :cond_2

    .line 372
    .line 373
    goto :goto_2

    .line 374
    :cond_2
    iget-object v4, v0, La/yxj0;->t:La/mii0;

    .line 375
    .line 376
    iget-object v4, v4, La/mii0;->b:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v4, La/kt2;

    .line 379
    .line 380
    invoke-interface {v4, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    iget-object v2, v0, La/yxj0;->r:La/v88;

    .line 384
    .line 385
    iget-object v0, v0, La/yxj0;->z:La/i1w0;

    .line 386
    .line 387
    iget-wide v4, v1, La/ql5;->a:J

    .line 388
    .line 389
    invoke-virtual {v2, v0, v3, v4, v5}, La/v88;->a(La/i1w0;ZJ)V

    .line 390
    .line 391
    .line 392
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_f
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, La/yxj0;

    .line 398
    .line 399
    iget-object v1, v0, La/yxj0;->P:La/ih5;

    .line 400
    .line 401
    sget-object v4, La/k7k;->i1:La/k7k;

    .line 402
    .line 403
    invoke-virtual {v1, v4}, La/ih5;->f(La/k7k;)V

    .line 404
    .line 405
    .line 406
    iget-object v1, v0, La/yxj0;->Q:La/l7k;

    .line 407
    .line 408
    sget-object v4, La/y1p;->b:La/y1p;

    .line 409
    .line 410
    iget-object v4, v0, La/yxj0;->S:La/cmt;

    .line 411
    .line 412
    invoke-virtual {v4}, La/cmt;->g()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    const-string v5, "fin_bet"

    .line 417
    .line 418
    invoke-virtual {v1, v5, v4}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, La/yxj0;->D()La/ql5;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    if-nez v1, :cond_3

    .line 426
    .line 427
    goto :goto_3

    .line 428
    :cond_3
    iget-object v4, v0, La/yxj0;->t:La/mii0;

    .line 429
    .line 430
    iget-object v4, v4, La/mii0;->b:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v4, La/kt2;

    .line 433
    .line 434
    invoke-interface {v4, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    iget-object v2, v0, La/yxj0;->r:La/v88;

    .line 438
    .line 439
    iget-object v0, v0, La/yxj0;->z:La/i1w0;

    .line 440
    .line 441
    iget-wide v4, v1, La/ql5;->a:J

    .line 442
    .line 443
    invoke-virtual {v2, v0, v3, v4, v5}, La/v88;->a(La/i1w0;ZJ)V

    .line 444
    .line 445
    .line 446
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 447
    .line 448
    return-object v0

    .line 449
    :pswitch_10
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, La/yxj0;

    .line 452
    .line 453
    iget-object v1, v0, La/yxj0;->X:La/p7m0;

    .line 454
    .line 455
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    move-object v7, v0

    .line 460
    check-cast v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 461
    .line 462
    new-instance v2, Ljava/math/BigDecimal;

    .line 463
    .line 464
    iget-wide v3, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a:D

    .line 465
    .line 466
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    new-instance v3, Ljava/math/BigDecimal;

    .line 474
    .line 475
    iget-wide v8, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->c:D

    .line 476
    .line 477
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    new-instance v4, Ljava/math/BigDecimal;

    .line 485
    .line 486
    iget-wide v8, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->d:D

    .line 487
    .line 488
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v10

    .line 492
    invoke-direct {v4, v10}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    new-instance v10, Ljava/math/BigDecimal;

    .line 496
    .line 497
    iget-wide v11, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->e:D

    .line 498
    .line 499
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v13

    .line 503
    invoke-direct {v10, v13}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    iget-wide v13, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a:D

    .line 507
    .line 508
    cmpg-double v13, v13, v5

    .line 509
    .line 510
    if-nez v13, :cond_5

    .line 511
    .line 512
    iget-wide v8, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->b:D

    .line 513
    .line 514
    goto :goto_4

    .line 515
    :cond_5
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 516
    .line 517
    .line 518
    move-result-object v13

    .line 519
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v13, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    if-gez v4, :cond_6

    .line 527
    .line 528
    goto :goto_4

    .line 529
    :cond_6
    invoke-virtual {v2, v10}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    if-lez v4, :cond_7

    .line 534
    .line 535
    move-wide v8, v11

    .line 536
    goto :goto_4

    .line 537
    :cond_7
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2}, Ljava/math/BigDecimal;->doubleValue()D

    .line 545
    .line 546
    .line 547
    move-result-wide v8

    .line 548
    :goto_4
    const/16 v22, 0x0

    .line 549
    .line 550
    const/16 v23, 0x1dfe

    .line 551
    .line 552
    const-wide/16 v10, 0x0

    .line 553
    .line 554
    const-wide/16 v12, 0x0

    .line 555
    .line 556
    const-wide/16 v14, 0x0

    .line 557
    .line 558
    const/16 v16, 0x0

    .line 559
    .line 560
    const/16 v17, 0x0

    .line 561
    .line 562
    const/16 v18, 0x0

    .line 563
    .line 564
    const/16 v19, 0x0

    .line 565
    .line 566
    const/16 v20, 0x0

    .line 567
    .line 568
    const/16 v21, 0x0

    .line 569
    .line 570
    invoke-static/range {v7 .. v23}, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;DDDDLjava/lang/String;ZZZZZZI)Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-eqz v0, :cond_4

    .line 579
    .line 580
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 581
    .line 582
    return-object v0

    .line 583
    :pswitch_11
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, La/xxj0;

    .line 586
    .line 587
    iget-object v1, v0, La/xxj0;->C0:La/p7m0;

    .line 588
    .line 589
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    move-object v7, v0

    .line 594
    check-cast v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 595
    .line 596
    new-instance v2, Ljava/math/BigDecimal;

    .line 597
    .line 598
    iget-wide v3, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 599
    .line 600
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    new-instance v3, Ljava/math/BigDecimal;

    .line 608
    .line 609
    iget-wide v8, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->c:D

    .line 610
    .line 611
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    invoke-direct {v3, v4}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    new-instance v4, Ljava/math/BigDecimal;

    .line 619
    .line 620
    iget-wide v8, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->d:D

    .line 621
    .line 622
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v10

    .line 626
    invoke-direct {v4, v10}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    new-instance v10, Ljava/math/BigDecimal;

    .line 630
    .line 631
    invoke-virtual {v7}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 632
    .line 633
    .line 634
    move-result-wide v11

    .line 635
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v11

    .line 639
    invoke-direct {v10, v11}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    iget-wide v11, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 643
    .line 644
    cmpg-double v11, v11, v5

    .line 645
    .line 646
    if-nez v11, :cond_9

    .line 647
    .line 648
    iget-wide v8, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b:D

    .line 649
    .line 650
    goto :goto_5

    .line 651
    :cond_9
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 652
    .line 653
    .line 654
    move-result-object v11

    .line 655
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v11, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 659
    .line 660
    .line 661
    move-result v4

    .line 662
    if-gez v4, :cond_a

    .line 663
    .line 664
    goto :goto_5

    .line 665
    :cond_a
    invoke-virtual {v2, v10}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 666
    .line 667
    .line 668
    move-result v4

    .line 669
    if-lez v4, :cond_b

    .line 670
    .line 671
    invoke-virtual {v7}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 672
    .line 673
    .line 674
    move-result-wide v8

    .line 675
    goto :goto_5

    .line 676
    :cond_b
    invoke-virtual {v2, v3}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 677
    .line 678
    .line 679
    move-result-object v2

    .line 680
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2}, Ljava/math/BigDecimal;->doubleValue()D

    .line 684
    .line 685
    .line 686
    move-result-wide v8

    .line 687
    :goto_5
    const/16 v27, 0x0

    .line 688
    .line 689
    const v28, 0x1f7fe

    .line 690
    .line 691
    .line 692
    const-wide/16 v10, 0x0

    .line 693
    .line 694
    const-wide/16 v12, 0x0

    .line 695
    .line 696
    const-wide/16 v14, 0x0

    .line 697
    .line 698
    const-wide/16 v16, 0x0

    .line 699
    .line 700
    const/16 v18, 0x0

    .line 701
    .line 702
    const/16 v19, 0x0

    .line 703
    .line 704
    const/16 v20, 0x0

    .line 705
    .line 706
    const/16 v21, 0x0

    .line 707
    .line 708
    const/16 v22, 0x0

    .line 709
    .line 710
    const/16 v23, 0x0

    .line 711
    .line 712
    const/16 v24, 0x0

    .line 713
    .line 714
    const/16 v25, 0x0

    .line 715
    .line 716
    const/16 v26, 0x0

    .line 717
    .line 718
    invoke-static/range {v7 .. v28}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    move-result v0

    .line 726
    if-eqz v0, :cond_8

    .line 727
    .line 728
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_12
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 732
    .line 733
    check-cast v0, La/yxj0;

    .line 734
    .line 735
    iget-object v1, v0, La/yxj0;->X:La/p7m0;

    .line 736
    .line 737
    :cond_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    move-object v7, v0

    .line 742
    check-cast v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 743
    .line 744
    iget-wide v8, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a:D

    .line 745
    .line 746
    cmpg-double v2, v8, v5

    .line 747
    .line 748
    if-nez v2, :cond_e

    .line 749
    .line 750
    iget-boolean v2, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->h:Z

    .line 751
    .line 752
    iget-wide v8, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->b:D

    .line 753
    .line 754
    if-eqz v2, :cond_d

    .line 755
    .line 756
    goto :goto_6

    .line 757
    :cond_d
    iget-wide v10, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->c:D

    .line 758
    .line 759
    iget-wide v12, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->e:D

    .line 760
    .line 761
    invoke-static/range {v8 .. v13}, La/yxj0;->H(DDD)D

    .line 762
    .line 763
    .line 764
    move-result-wide v8

    .line 765
    goto :goto_6

    .line 766
    :cond_e
    iget-wide v10, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->c:D

    .line 767
    .line 768
    iget-wide v12, v7, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->e:D

    .line 769
    .line 770
    invoke-static/range {v8 .. v13}, La/yxj0;->H(DDD)D

    .line 771
    .line 772
    .line 773
    move-result-wide v8

    .line 774
    :goto_6
    const/16 v22, 0x0

    .line 775
    .line 776
    const/16 v23, 0x1dfe

    .line 777
    .line 778
    const-wide/16 v10, 0x0

    .line 779
    .line 780
    const-wide/16 v12, 0x0

    .line 781
    .line 782
    const-wide/16 v14, 0x0

    .line 783
    .line 784
    const/16 v16, 0x0

    .line 785
    .line 786
    const/16 v17, 0x0

    .line 787
    .line 788
    const/16 v18, 0x0

    .line 789
    .line 790
    const/16 v19, 0x0

    .line 791
    .line 792
    const/16 v20, 0x0

    .line 793
    .line 794
    const/16 v21, 0x0

    .line 795
    .line 796
    invoke-static/range {v7 .. v23}, Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;->a(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;DDDDLjava/lang/String;ZZZZZZI)Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/ui_model/StepInputUiModel;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    move-result v0

    .line 804
    if-eqz v0, :cond_c

    .line 805
    .line 806
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 807
    .line 808
    return-object v0

    .line 809
    :pswitch_13
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast v0, La/xxj0;

    .line 812
    .line 813
    iget-object v1, v0, La/xxj0;->C0:La/p7m0;

    .line 814
    .line 815
    :cond_f
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    move-object v7, v0

    .line 820
    check-cast v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 821
    .line 822
    iget-wide v8, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 823
    .line 824
    cmpg-double v2, v8, v5

    .line 825
    .line 826
    if-nez v2, :cond_11

    .line 827
    .line 828
    iget-boolean v2, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->h:Z

    .line 829
    .line 830
    iget-wide v8, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b:D

    .line 831
    .line 832
    if-eqz v2, :cond_10

    .line 833
    .line 834
    goto :goto_7

    .line 835
    :cond_10
    iget-wide v10, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->c:D

    .line 836
    .line 837
    invoke-virtual {v7}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 838
    .line 839
    .line 840
    move-result-wide v12

    .line 841
    iget-boolean v14, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->n:Z

    .line 842
    .line 843
    invoke-static/range {v8 .. v14}, La/xxj0;->T(DDDZ)D

    .line 844
    .line 845
    .line 846
    move-result-wide v8

    .line 847
    goto :goto_7

    .line 848
    :cond_11
    iget-wide v10, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->c:D

    .line 849
    .line 850
    invoke-virtual {v7}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->b()D

    .line 851
    .line 852
    .line 853
    move-result-wide v12

    .line 854
    iget-boolean v14, v7, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->n:Z

    .line 855
    .line 856
    invoke-static/range {v8 .. v14}, La/xxj0;->T(DDDZ)D

    .line 857
    .line 858
    .line 859
    move-result-wide v8

    .line 860
    :goto_7
    const/16 v27, 0x0

    .line 861
    .line 862
    const v28, 0x1f7fe

    .line 863
    .line 864
    .line 865
    const-wide/16 v10, 0x0

    .line 866
    .line 867
    const-wide/16 v12, 0x0

    .line 868
    .line 869
    const-wide/16 v14, 0x0

    .line 870
    .line 871
    const-wide/16 v16, 0x0

    .line 872
    .line 873
    const/16 v18, 0x0

    .line 874
    .line 875
    const/16 v19, 0x0

    .line 876
    .line 877
    const/16 v20, 0x0

    .line 878
    .line 879
    const/16 v21, 0x0

    .line 880
    .line 881
    const/16 v22, 0x0

    .line 882
    .line 883
    const/16 v23, 0x0

    .line 884
    .line 885
    const/16 v24, 0x0

    .line 886
    .line 887
    const/16 v25, 0x0

    .line 888
    .line 889
    const/16 v26, 0x0

    .line 890
    .line 891
    invoke-static/range {v7 .. v28}, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a(Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZZZI)Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    if-eqz v0, :cond_f

    .line 900
    .line 901
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 902
    .line 903
    return-object v0

    .line 904
    :pswitch_14
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 905
    .line 906
    check-cast v0, La/xxj0;

    .line 907
    .line 908
    iget-object v1, v0, La/xxj0;->V:La/ih5;

    .line 909
    .line 910
    iget-object v2, v0, La/xxj0;->O:La/ms2;

    .line 911
    .line 912
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    instance-of v2, v2, La/vq2;

    .line 916
    .line 917
    if-eqz v2, :cond_12

    .line 918
    .line 919
    sget-object v3, La/k7k;->q1:La/k7k;

    .line 920
    .line 921
    goto :goto_8

    .line 922
    :cond_12
    sget-object v3, La/k7k;->l1:La/k7k;

    .line 923
    .line 924
    :goto_8
    invoke-virtual {v1, v3}, La/ih5;->f(La/k7k;)V

    .line 925
    .line 926
    .line 927
    iget-object v1, v0, La/xxj0;->W:La/l7k;

    .line 928
    .line 929
    if-eqz v2, :cond_13

    .line 930
    .line 931
    sget-object v2, La/y1p;->F1:La/y1p;

    .line 932
    .line 933
    goto :goto_9

    .line 934
    :cond_13
    sget-object v2, La/y1p;->E1:La/y1p;

    .line 935
    .line 936
    :goto_9
    iget-object v2, v2, La/y1p;->a:Ljava/lang/String;

    .line 937
    .line 938
    iget-object v3, v0, La/xxj0;->i0:La/cmt;

    .line 939
    .line 940
    invoke-virtual {v3}, La/cmt;->g()Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v3

    .line 944
    invoke-virtual {v1, v2, v3}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 948
    .line 949
    .line 950
    move-result-object v8

    .line 951
    new-instance v9, La/iwj0;

    .line 952
    .line 953
    invoke-direct {v9, v0, v4}, La/iwj0;-><init>(La/xxj0;B)V

    .line 954
    .line 955
    .line 956
    iget-object v1, v0, La/xxj0;->d:La/mne;

    .line 957
    .line 958
    iget-object v11, v1, La/mne;->a:La/rwj;

    .line 959
    .line 960
    new-instance v12, La/zmj0;

    .line 961
    .line 962
    invoke-direct {v12, v0, v7}, La/zmj0;-><init>(La/xxj0;La/yje;)V

    .line 963
    .line 964
    .line 965
    const/16 v13, 0xa

    .line 966
    .line 967
    const/4 v10, 0x0

    .line 968
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 969
    .line 970
    .line 971
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 972
    .line 973
    return-object v0

    .line 974
    :pswitch_15
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 975
    .line 976
    check-cast v0, La/xxj0;

    .line 977
    .line 978
    iget-object v0, v0, La/xxj0;->w0:La/p7m0;

    .line 979
    .line 980
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 981
    .line 982
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 989
    .line 990
    return-object v0

    .line 991
    :pswitch_16
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 992
    .line 993
    check-cast v0, La/xxj0;

    .line 994
    .line 995
    invoke-virtual {v0}, La/xxj0;->K()V

    .line 996
    .line 997
    .line 998
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 999
    .line 1000
    return-object v0

    .line 1001
    :pswitch_17
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v0, La/imi0;

    .line 1004
    .line 1005
    invoke-virtual {v0}, La/imi0;->x()V

    .line 1006
    .line 1007
    .line 1008
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1009
    .line 1010
    return-object v0

    .line 1011
    :pswitch_18
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1012
    .line 1013
    check-cast v0, La/imi0;

    .line 1014
    .line 1015
    invoke-virtual {v0}, La/imi0;->x()V

    .line 1016
    .line 1017
    .line 1018
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1019
    .line 1020
    return-object v0

    .line 1021
    :pswitch_19
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1022
    .line 1023
    move-object v10, v0

    .line 1024
    check-cast v10, La/irh0;

    .line 1025
    .line 1026
    iget-object v0, v10, La/irh0;->G:La/bby;

    .line 1027
    .line 1028
    if-eqz v0, :cond_14

    .line 1029
    .line 1030
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 1031
    .line 1032
    .line 1033
    move-result v0

    .line 1034
    if-ne v0, v3, :cond_14

    .line 1035
    .line 1036
    goto :goto_a

    .line 1037
    :cond_14
    iget-object v0, v10, La/irh0;->D:La/p7m0;

    .line 1038
    .line 1039
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1040
    .line 1041
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1045
    .line 1046
    .line 1047
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    new-instance v8, La/jjh0;

    .line 1052
    .line 1053
    const/4 v14, 0x0

    .line 1054
    const/16 v15, 0x14

    .line 1055
    .line 1056
    const/4 v9, 0x1

    .line 1057
    const-class v11, La/irh0;

    .line 1058
    .line 1059
    const-string v12, "onError"

    .line 1060
    .line 1061
    const-string v13, "onError(Ljava/lang/Throwable;)V"

    .line 1062
    .line 1063
    invoke-direct/range {v8 .. v15}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1064
    .line 1065
    .line 1066
    iget-object v1, v10, La/irh0;->r:La/mne;

    .line 1067
    .line 1068
    iget-object v14, v1, La/mne;->a:La/rwj;

    .line 1069
    .line 1070
    new-instance v15, La/frh0;

    .line 1071
    .line 1072
    const/4 v1, 0x4

    .line 1073
    invoke-direct {v15, v10, v7, v1}, La/frh0;-><init>(La/irh0;La/yje;B)V

    .line 1074
    .line 1075
    .line 1076
    const/16 v16, 0xa

    .line 1077
    .line 1078
    const/4 v13, 0x0

    .line 1079
    move-object v11, v0

    .line 1080
    move-object v12, v8

    .line 1081
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    iput-object v0, v10, La/irh0;->G:La/bby;

    .line 1086
    .line 1087
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1088
    .line 1089
    return-object v0

    .line 1090
    :pswitch_1a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v0, La/irh0;

    .line 1093
    .line 1094
    invoke-virtual {v0}, La/irh0;->y()V

    .line 1095
    .line 1096
    .line 1097
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1098
    .line 1099
    return-object v0

    .line 1100
    :pswitch_1b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast v0, La/irh0;

    .line 1103
    .line 1104
    invoke-virtual {v0}, La/irh0;->y()V

    .line 1105
    .line 1106
    .line 1107
    iget-object v0, v0, La/irh0;->F:La/bby;

    .line 1108
    .line 1109
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 1110
    .line 1111
    .line 1112
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1113
    .line 1114
    return-object v0

    .line 1115
    :pswitch_1c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1116
    .line 1117
    check-cast v0, La/zuh0;

    .line 1118
    .line 1119
    invoke-virtual {v0}, La/zuh0;->y()V

    .line 1120
    .line 1121
    .line 1122
    iget-object v0, v0, La/zuh0;->K:La/bby;

    .line 1123
    .line 1124
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 1125
    .line 1126
    .line 1127
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1128
    .line 1129
    return-object v0

    .line 1130
    nop

    .line 1131
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
