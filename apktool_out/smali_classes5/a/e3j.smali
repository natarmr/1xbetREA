.class public final synthetic La/e3j;
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
    iput-byte p2, p0, La/e3j;->a:B

    iput-object p1, p0, La/e3j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e3j;->a:B

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v0, v0, La/e3j;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, La/ebl;

    .line 16
    .line 17
    move-object/from16 v8, p1

    .line 18
    .line 19
    check-cast v8, La/xus;

    .line 20
    .line 21
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 25
    .line 26
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 36
    .line 37
    move-object v4, v2

    .line 38
    move-object v2, v4

    .line 39
    check-cast v2, La/f9l;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/16 v19, 0x0

    .line 45
    .line 46
    const v20, 0x3ffffbf

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    move-object v5, v4

    .line 51
    const/4 v4, 0x0

    .line 52
    move-object v6, v5

    .line 53
    const/4 v5, 0x0

    .line 54
    move-object v7, v6

    .line 55
    const/4 v6, 0x0

    .line 56
    move-object v9, v7

    .line 57
    const/4 v7, 0x0

    .line 58
    move-object v10, v9

    .line 59
    const/4 v9, 0x0

    .line 60
    move-object v11, v10

    .line 61
    const/4 v10, 0x0

    .line 62
    move-object v12, v11

    .line 63
    const/4 v11, 0x0

    .line 64
    move-object v13, v12

    .line 65
    const/4 v12, 0x0

    .line 66
    move-object v14, v13

    .line 67
    const/4 v13, 0x0

    .line 68
    move-object v15, v14

    .line 69
    const/4 v14, 0x0

    .line 70
    move-object/from16 v16, v15

    .line 71
    .line 72
    const/4 v15, 0x0

    .line 73
    move-object/from16 v17, v16

    .line 74
    .line 75
    const/16 v16, 0x0

    .line 76
    .line 77
    move-object/from16 v18, v17

    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    move-object/from16 v21, v18

    .line 82
    .line 83
    const/16 v18, 0x0

    .line 84
    .line 85
    move-object/from16 p0, v1

    .line 86
    .line 87
    move-object/from16 v1, v21

    .line 88
    .line 89
    invoke-static/range {v2 .. v20}, La/f9l;->a(La/f9l;La/gps;La/jlr;La/x9l;La/ypl0;La/bqr;La/xus;ZLa/z6l;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;IILa/szj0;I)La/f9l;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_0

    .line 98
    .line 99
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_0
    move-object/from16 v1, p0

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :pswitch_0
    check-cast v0, La/zlp0;

    .line 106
    .line 107
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v2, v0, La/zlp0;->b:La/xnp0;

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->setTeam(La/xnp0;)V

    .line 117
    .line 118
    .line 119
    iget-object v2, v0, La/zlp0;->d:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->setPlayerStatistics(Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, v0, La/zlp0;->c:Ljava/util/List;

    .line 125
    .line 126
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->setCellHeaders(Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_1
    check-cast v0, La/lal;

    .line 133
    .line 134
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, La/y6l;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v2, v0, La/lal;->b:La/y4l;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, La/y6l;->setFirstTeam(La/y4l;)V

    .line 144
    .line 145
    .line 146
    iget-object v0, v0, La/lal;->c:La/y4l;

    .line 147
    .line 148
    invoke-virtual {v1, v0}, La/y6l;->setSecondTeam(La/y4l;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_2
    check-cast v0, La/v2l;

    .line 155
    .line 156
    move-object/from16 v1, p1

    .line 157
    .line 158
    check-cast v1, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-object v2, v0, La/v2l;->b:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setFirstTeamLogo(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object v2, v0, La/v2l;->c:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setSecondTeamLogo(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iget-object v2, v0, La/v2l;->d:Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setHeroPick(Ljava/util/List;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, v0, La/v2l;->e:La/s2l;

    .line 179
    .line 180
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickItemView;->setScrollPosition(La/s2l;)V

    .line 181
    .line 182
    .line 183
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object v0

    .line 186
    :pswitch_3
    check-cast v0, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;

    .line 187
    .line 188
    move-object/from16 v1, p1

    .line 189
    .line 190
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 191
    .line 192
    invoke-static {v0, v1}, Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;->c(Lorg/xplatform/cyber/game/core/presentation/dota/banpick/view/DotaBanPickHeroItemView;Landroid/graphics/drawable/Drawable;)Lkotlin/Unit;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    return-object v0

    .line 197
    :pswitch_4
    check-cast v0, La/l0l;

    .line 198
    .line 199
    move-object/from16 v1, p1

    .line 200
    .line 201
    check-cast v1, Ljava/lang/Throwable;

    .line 202
    .line 203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    iget-object v1, v0, La/l0l;->c:La/mne;

    .line 211
    .line 212
    iget-object v9, v1, La/mne;->a:La/rwj;

    .line 213
    .line 214
    sget-object v7, La/d0l;->a:La/d0l;

    .line 215
    .line 216
    new-instance v10, La/e0l;

    .line 217
    .line 218
    invoke-direct {v10, v0, v3, v5}, La/e0l;-><init>(La/l0l;La/yje;B)V

    .line 219
    .line 220
    .line 221
    const/16 v11, 0xa

    .line 222
    .line 223
    const/4 v8, 0x0

    .line 224
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 225
    .line 226
    .line 227
    new-instance v2, La/xy5;

    .line 228
    .line 229
    invoke-direct {v2, v5}, La/xy5;-><init>(Z)V

    .line 230
    .line 231
    .line 232
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    iget-object v9, v1, La/mne;->a:La/rwj;

    .line 237
    .line 238
    sget-object v7, La/c0l;->a:La/c0l;

    .line 239
    .line 240
    new-instance v10, La/b1f;

    .line 241
    .line 242
    const/16 v1, 0x1d

    .line 243
    .line 244
    invoke-direct {v10, v0, v2, v3, v1}, La/b1f;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 245
    .line 246
    .line 247
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 248
    .line 249
    .line 250
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object v0

    .line 253
    :pswitch_5
    check-cast v0, Ljava/net/DatagramSocket;

    .line 254
    .line 255
    move-object/from16 v1, p1

    .line 256
    .line 257
    check-cast v1, Ljava/lang/Throwable;

    .line 258
    .line 259
    instance-of v1, v1, Ljava/util/concurrent/CancellationException;

    .line 260
    .line 261
    if-eqz v1, :cond_1

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/net/DatagramSocket;->isClosed()Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-nez v1, :cond_1

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V

    .line 270
    .line 271
    .line 272
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_6
    check-cast v0, La/v8;

    .line 276
    .line 277
    move-object/from16 v1, p1

    .line 278
    .line 279
    check-cast v1, La/cp;

    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 285
    .line 286
    check-cast v2, La/zvx;

    .line 287
    .line 288
    iget-object v2, v2, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    new-instance v3, La/ngh;

    .line 294
    .line 295
    const/16 v4, 0x12

    .line 296
    .line 297
    invoke-direct {v3, v0, v1, v4}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 298
    .line 299
    .line 300
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 301
    .line 302
    .line 303
    new-instance v0, La/kgh;

    .line 304
    .line 305
    const/16 v2, 0xb

    .line 306
    .line 307
    invoke-direct {v0, v1, v2}, La/kgh;-><init>(La/cp;B)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 311
    .line 312
    .line 313
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_7
    check-cast v0, La/hvk;

    .line 317
    .line 318
    move-object/from16 v1, p1

    .line 319
    .line 320
    check-cast v1, Ljava/io/IOException;

    .line 321
    .line 322
    iput-boolean v4, v0, La/hvk;->l:Z

    .line 323
    .line 324
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    return-object v0

    .line 327
    :pswitch_8
    check-cast v0, Lokhttp3/internal/cache/DiskLruCache;

    .line 328
    .line 329
    move-object/from16 v1, p1

    .line 330
    .line 331
    check-cast v1, Ljava/io/IOException;

    .line 332
    .line 333
    invoke-static {v0, v1}, Lokhttp3/internal/cache/DiskLruCache;->a(Lokhttp3/internal/cache/DiskLruCache;Ljava/io/IOException;)Lkotlin/Unit;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0

    .line 338
    :pswitch_9
    check-cast v0, La/wuk;

    .line 339
    .line 340
    move-object/from16 v1, p1

    .line 341
    .line 342
    check-cast v1, Ljava/lang/Throwable;

    .line 343
    .line 344
    sget-object v2, La/wuk;->j2:La/nek;

    .line 345
    .line 346
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    const v2, 0x7f1307f9

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    new-instance v3, Lkotlin/Pair;

    .line 361
    .line 362
    const-string v4, "ERROR_SOCIAL"

    .line 363
    .line 364
    invoke-direct {v3, v4, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-virtual {v1, v2, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, La/sik;->y0()V

    .line 379
    .line 380
    .line 381
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 382
    .line 383
    return-object v0

    .line 384
    :pswitch_a
    check-cast v0, La/yfg;

    .line 385
    .line 386
    move-object/from16 v1, p1

    .line 387
    .line 388
    check-cast v1, La/cp;

    .line 389
    .line 390
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 394
    .line 395
    check-cast v2, La/ktk;

    .line 396
    .line 397
    iget-object v2, v2, La/ktk;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 398
    .line 399
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    new-instance v3, La/ngh;

    .line 403
    .line 404
    const/16 v4, 0x10

    .line 405
    .line 406
    invoke-direct {v3, v0, v1, v4}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 407
    .line 408
    .line 409
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 410
    .line 411
    .line 412
    new-instance v0, La/kgh;

    .line 413
    .line 414
    const/16 v2, 0xa

    .line 415
    .line 416
    invoke-direct {v0, v1, v2}, La/kgh;-><init>(La/cp;B)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 420
    .line 421
    .line 422
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 423
    .line 424
    return-object v0

    .line 425
    :pswitch_b
    check-cast v0, La/guk;

    .line 426
    .line 427
    move-object/from16 v1, p1

    .line 428
    .line 429
    check-cast v1, Ljava/lang/Throwable;

    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 435
    .line 436
    .line 437
    iget-object v1, v0, La/guk;->h:La/p7m0;

    .line 438
    .line 439
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    move-object v4, v0

    .line 444
    check-cast v4, La/nuk;

    .line 445
    .line 446
    sget-object v5, La/iun;->a:La/iun;

    .line 447
    .line 448
    invoke-static {v4, v5, v3, v2}, La/nuk;->a(La/nuk;Ljava/util/List;Ljava/lang/String;I)La/nuk;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    invoke-virtual {v1, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v0

    .line 456
    if-eqz v0, :cond_2

    .line 457
    .line 458
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    return-object v0

    .line 461
    :pswitch_c
    check-cast v0, La/xtk;

    .line 462
    .line 463
    move-object/from16 v1, p1

    .line 464
    .line 465
    check-cast v1, Ljava/lang/Throwable;

    .line 466
    .line 467
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0}, La/xtk;->x()V

    .line 471
    .line 472
    .line 473
    iget-object v0, v0, La/xtk;->i:La/duj;

    .line 474
    .line 475
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 476
    .line 477
    .line 478
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_d
    check-cast v0, La/kbk;

    .line 482
    .line 483
    move-object/from16 v1, p1

    .line 484
    .line 485
    check-cast v1, Ljava/lang/Throwable;

    .line 486
    .line 487
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    iget-object v2, v0, La/kbk;->r:La/duj;

    .line 491
    .line 492
    new-instance v3, La/yfg;

    .line 493
    .line 494
    const/16 v4, 0x19

    .line 495
    .line 496
    invoke-direct {v3, v0, v4}, La/yfg;-><init>(Ljava/lang/Object;B)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 500
    .line 501
    .line 502
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 503
    .line 504
    return-object v0

    .line 505
    :pswitch_e
    check-cast v0, La/jbk;

    .line 506
    .line 507
    move-object/from16 v1, p1

    .line 508
    .line 509
    check-cast v1, Ljava/lang/Throwable;

    .line 510
    .line 511
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    iget-object v2, v0, La/jbk;->e:La/duj;

    .line 515
    .line 516
    new-instance v3, La/yfg;

    .line 517
    .line 518
    const/16 v4, 0x18

    .line 519
    .line 520
    invoke-direct {v3, v0, v4}, La/yfg;-><init>(Ljava/lang/Object;B)V

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
    :pswitch_f
    check-cast v0, La/pak;

    .line 530
    .line 531
    move-object/from16 v1, p1

    .line 532
    .line 533
    check-cast v1, Ljava/lang/Throwable;

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    iget-object v2, v0, La/pak;->e:La/duj;

    .line 539
    .line 540
    new-instance v3, La/yfg;

    .line 541
    .line 542
    const/16 v4, 0x16

    .line 543
    .line 544
    invoke-direct {v3, v0, v4}, La/yfg;-><init>(Ljava/lang/Object;B)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 548
    .line 549
    .line 550
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 551
    .line 552
    return-object v0

    .line 553
    :pswitch_10
    check-cast v0, La/y6h;

    .line 554
    .line 555
    move-object/from16 v1, p1

    .line 556
    .line 557
    check-cast v1, La/cp;

    .line 558
    .line 559
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    iget-object v3, v1, La/cp;->u:La/yfu0;

    .line 563
    .line 564
    check-cast v3, La/djj0;

    .line 565
    .line 566
    iget-object v3, v3, La/djj0;->a:Landroid/widget/FrameLayout;

    .line 567
    .line 568
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    new-instance v4, La/ngh;

    .line 572
    .line 573
    const/16 v5, 0xd

    .line 574
    .line 575
    invoke-direct {v4, v0, v1, v5}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 576
    .line 577
    .line 578
    invoke-static {v3, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 579
    .line 580
    .line 581
    new-instance v0, La/kgh;

    .line 582
    .line 583
    invoke-direct {v0, v1, v2}, La/kgh;-><init>(La/cp;B)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 587
    .line 588
    .line 589
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 590
    .line 591
    return-object v0

    .line 592
    :pswitch_11
    check-cast v0, La/y6h;

    .line 593
    .line 594
    move-object/from16 v1, p1

    .line 595
    .line 596
    check-cast v1, La/cp;

    .line 597
    .line 598
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 602
    .line 603
    check-cast v2, La/djj0;

    .line 604
    .line 605
    iget-object v2, v2, La/djj0;->a:Landroid/widget/FrameLayout;

    .line 606
    .line 607
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    new-instance v3, La/ngh;

    .line 611
    .line 612
    const/16 v4, 0xc

    .line 613
    .line 614
    invoke-direct {v3, v0, v1, v4}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 615
    .line 616
    .line 617
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 618
    .line 619
    .line 620
    new-instance v0, La/kgh;

    .line 621
    .line 622
    const/4 v2, 0x5

    .line 623
    invoke-direct {v0, v1, v2}, La/kgh;-><init>(La/cp;B)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 627
    .line 628
    .line 629
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 630
    .line 631
    return-object v0

    .line 632
    :pswitch_12
    check-cast v0, La/m8k;

    .line 633
    .line 634
    move-object/from16 v1, p1

    .line 635
    .line 636
    check-cast v1, Ljava/lang/Throwable;

    .line 637
    .line 638
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    iget-object v2, v0, La/m8k;->t:La/duj;

    .line 642
    .line 643
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    if-nez v3, :cond_3

    .line 648
    .line 649
    goto :goto_1

    .line 650
    :cond_3
    move-object v1, v3

    .line 651
    :goto_1
    new-instance v3, La/yfg;

    .line 652
    .line 653
    const/16 v4, 0x15

    .line 654
    .line 655
    invoke-direct {v3, v0, v4}, La/yfg;-><init>(Ljava/lang/Object;B)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 659
    .line 660
    .line 661
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 662
    .line 663
    return-object v0

    .line 664
    :pswitch_13
    check-cast v0, La/ysj;

    .line 665
    .line 666
    move-object/from16 v1, p1

    .line 667
    .line 668
    check-cast v1, Landroid/text/Editable;

    .line 669
    .line 670
    sget-object v2, La/ysj;->m2:La/qud;

    .line 671
    .line 672
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v0}, La/ysj;->V0()La/mhn0;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    iget-object v2, v2, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 680
    .line 681
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v1

    .line 685
    invoke-static {v1}, La/wvb;->O(Ljava/lang/String;)D

    .line 686
    .line 687
    .line 688
    move-result-wide v6

    .line 689
    const-wide/16 v8, 0x0

    .line 690
    .line 691
    cmpg-double v6, v6, v8

    .line 692
    .line 693
    if-nez v6, :cond_4

    .line 694
    .line 695
    invoke-virtual {v2}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->getText()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v6

    .line 699
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 700
    .line 701
    .line 702
    move-result v6

    .line 703
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setSelection(I)V

    .line 704
    .line 705
    .line 706
    :cond_4
    iget-object v0, v0, La/ysj;->l2:La/kiu0;

    .line 707
    .line 708
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    check-cast v0, La/btj;

    .line 713
    .line 714
    iget-object v2, v0, La/btj;->j:La/ctf0;

    .line 715
    .line 716
    iget-object v6, v0, La/btj;->k:La/p7m0;

    .line 717
    .line 718
    invoke-static {v1}, La/wvb;->O(Ljava/lang/String;)D

    .line 719
    .line 720
    .line 721
    move-result-wide v10

    .line 722
    iget-wide v12, v0, La/btj;->m:D

    .line 723
    .line 724
    cmpg-double v7, v10, v12

    .line 725
    .line 726
    iget-object v10, v0, La/btj;->l:La/ol60;

    .line 727
    .line 728
    const-string v11, ""

    .line 729
    .line 730
    if-gez v7, :cond_7

    .line 731
    .line 732
    new-instance v7, La/jrn;

    .line 733
    .line 734
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v14

    .line 738
    instance-of v15, v14, La/nrn;

    .line 739
    .line 740
    if-eqz v15, :cond_5

    .line 741
    .line 742
    check-cast v14, La/nrn;

    .line 743
    .line 744
    goto :goto_2

    .line 745
    :cond_5
    move-object v14, v3

    .line 746
    :goto_2
    if-eqz v14, :cond_6

    .line 747
    .line 748
    iget-object v14, v14, La/nrn;->g:Ljava/lang/String;

    .line 749
    .line 750
    if-eqz v14, :cond_6

    .line 751
    .line 752
    goto :goto_3

    .line 753
    :cond_6
    move-object v14, v11

    .line 754
    :goto_3
    invoke-static {v2, v12, v13, v14}, La/k9x;->E(La/ctf0;DLjava/lang/String;)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    invoke-direct {v7, v2}, La/jrn;-><init>(Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v10, v7}, La/ol60;->f(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    goto :goto_6

    .line 765
    :cond_7
    new-instance v7, La/krn;

    .line 766
    .line 767
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v14

    .line 771
    instance-of v15, v14, La/nrn;

    .line 772
    .line 773
    if-eqz v15, :cond_8

    .line 774
    .line 775
    check-cast v14, La/nrn;

    .line 776
    .line 777
    goto :goto_4

    .line 778
    :cond_8
    move-object v14, v3

    .line 779
    :goto_4
    if-eqz v14, :cond_9

    .line 780
    .line 781
    iget-object v14, v14, La/nrn;->g:Ljava/lang/String;

    .line 782
    .line 783
    if-eqz v14, :cond_9

    .line 784
    .line 785
    goto :goto_5

    .line 786
    :cond_9
    move-object v14, v11

    .line 787
    :goto_5
    invoke-static {v2, v12, v13, v14}, La/k9x;->E(La/ctf0;DLjava/lang/String;)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v2

    .line 791
    invoke-direct {v7, v2}, La/krn;-><init>(Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v10, v7}, La/ol60;->f(Ljava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    :goto_6
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    instance-of v7, v2, La/nrn;

    .line 802
    .line 803
    if-eqz v7, :cond_a

    .line 804
    .line 805
    check-cast v2, La/nrn;

    .line 806
    .line 807
    goto :goto_7

    .line 808
    :cond_a
    move-object v2, v3

    .line 809
    :goto_7
    if-eqz v2, :cond_f

    .line 810
    .line 811
    invoke-static {v1}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 812
    .line 813
    .line 814
    move-result-object v7

    .line 815
    if-eqz v7, :cond_b

    .line 816
    .line 817
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 818
    .line 819
    .line 820
    move-result-wide v8

    .line 821
    :cond_b
    iget-wide v12, v0, La/btj;->m:D

    .line 822
    .line 823
    cmpl-double v0, v8, v12

    .line 824
    .line 825
    if-ltz v0, :cond_c

    .line 826
    .line 827
    iget-wide v12, v2, La/nrn;->a:D

    .line 828
    .line 829
    cmpg-double v0, v8, v12

    .line 830
    .line 831
    if-nez v0, :cond_d

    .line 832
    .line 833
    :cond_c
    move v4, v5

    .line 834
    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 835
    .line 836
    .line 837
    move-result v0

    .line 838
    if-nez v0, :cond_e

    .line 839
    .line 840
    goto :goto_8

    .line 841
    :cond_e
    sget-object v0, La/pn40;->a:La/pn40;

    .line 842
    .line 843
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 844
    .line 845
    invoke-static {v8, v9, v0}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 846
    .line 847
    .line 848
    move-result-object v11

    .line 849
    :goto_8
    invoke-static {v2, v8, v9, v11, v4}, La/nrn;->a(La/nrn;DLjava/lang/String;Z)La/nrn;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    invoke-virtual {v6, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 857
    .line 858
    return-object v0

    .line 859
    :pswitch_14
    check-cast v0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoListScreen$1;

    .line 860
    .line 861
    move-object/from16 v1, p1

    .line 862
    .line 863
    check-cast v1, La/i1w0;

    .line 864
    .line 865
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v0, La/c8d;

    .line 876
    .line 877
    sget-object v3, La/cfx0;->o:La/bjk;

    .line 878
    .line 879
    new-instance v6, La/v7d;

    .line 880
    .line 881
    invoke-direct {v6, v4, v3, v3}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 882
    .line 883
    .line 884
    iput-object v6, v0, La/c8d;->a:La/w7d;

    .line 885
    .line 886
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 887
    .line 888
    invoke-static {v1, v0, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    :goto_9
    move-object v2, v0

    .line 893
    check-cast v2, La/paw;

    .line 894
    .line 895
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    if-eqz v3, :cond_10

    .line 900
    .line 901
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    check-cast v2, La/oe50;

    .line 906
    .line 907
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 908
    .line 909
    .line 910
    goto :goto_9

    .line 911
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 912
    .line 913
    return-object v0

    .line 914
    :pswitch_15
    check-cast v0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoCodesScreen$1;

    .line 915
    .line 916
    move-object/from16 v1, p1

    .line 917
    .line 918
    check-cast v1, La/i1w0;

    .line 919
    .line 920
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    invoke-virtual {v2, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast v0, La/c8d;

    .line 931
    .line 932
    sget-object v3, La/cfx0;->o:La/bjk;

    .line 933
    .line 934
    new-instance v6, La/v7d;

    .line 935
    .line 936
    invoke-direct {v6, v4, v3, v3}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 937
    .line 938
    .line 939
    iput-object v6, v0, La/c8d;->a:La/w7d;

    .line 940
    .line 941
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 942
    .line 943
    invoke-static {v1, v0, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    :goto_a
    move-object v2, v0

    .line 948
    check-cast v2, La/paw;

    .line 949
    .line 950
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 951
    .line 952
    .line 953
    move-result v3

    .line 954
    if-eqz v3, :cond_11

    .line 955
    .line 956
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    check-cast v2, La/oe50;

    .line 961
    .line 962
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 963
    .line 964
    .line 965
    goto :goto_a

    .line 966
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 967
    .line 968
    return-object v0

    .line 969
    :pswitch_16
    check-cast v0, La/inj;

    .line 970
    .line 971
    move-object/from16 v1, p1

    .line 972
    .line 973
    check-cast v1, La/n1g;

    .line 974
    .line 975
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    iget-wide v2, v0, La/inj;->c:J

    .line 979
    .line 980
    iput-wide v2, v1, La/n1g;->c:J

    .line 981
    .line 982
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 983
    .line 984
    return-object v0

    .line 985
    :pswitch_17
    move-object v3, v0

    .line 986
    check-cast v3, La/x2i;

    .line 987
    .line 988
    move-object/from16 v2, p1

    .line 989
    .line 990
    check-cast v2, La/cp;

    .line 991
    .line 992
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 996
    .line 997
    check-cast v0, La/uro;

    .line 998
    .line 999
    iget-object v0, v0, La/uro;->a:Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;

    .line 1000
    .line 1001
    new-instance v1, La/cgj;

    .line 1002
    .line 1003
    invoke-direct {v1, v3, v2, v5}, La/cgj;-><init>(La/x2i;La/cp;B)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardMiddleView;->setOnViewClicked(Landroid/view/View$OnClickListener;)V

    .line 1007
    .line 1008
    .line 1009
    new-instance v1, La/if6;

    .line 1010
    .line 1011
    const/4 v6, 0x3

    .line 1012
    move-object v4, v2

    .line 1013
    move-object v5, v3

    .line 1014
    invoke-direct/range {v1 .. v6}, La/if6;-><init>(La/cp;Ljava/lang/Object;La/cp;Ljava/lang/Object;B)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v2, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1018
    .line 1019
    .line 1020
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1021
    .line 1022
    return-object v0

    .line 1023
    :pswitch_18
    check-cast v0, La/ncj;

    .line 1024
    .line 1025
    iget-object v1, v0, La/ncj;->j:La/n0o0;

    .line 1026
    .line 1027
    move-object/from16 v2, p1

    .line 1028
    .line 1029
    check-cast v2, Ljava/lang/Throwable;

    .line 1030
    .line 1031
    if-eqz v2, :cond_12

    .line 1032
    .line 1033
    iget-object v0, v0, La/ncj;->h:La/ocj;

    .line 1034
    .line 1035
    new-instance v3, La/hbq;

    .line 1036
    .line 1037
    invoke-direct {v3, v2}, La/hbq;-><init>(Ljava/lang/Throwable;)V

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v0, v3}, La/ocj;->b(La/g7m0;)V

    .line 1041
    .line 1042
    .line 1043
    :cond_12
    invoke-virtual {v1}, La/n0o0;->a()Z

    .line 1044
    .line 1045
    .line 1046
    move-result v0

    .line 1047
    if-eqz v0, :cond_13

    .line 1048
    .line 1049
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    check-cast v0, La/vzp;

    .line 1054
    .line 1055
    invoke-virtual {v0}, La/vzp;->close()V

    .line 1056
    .line 1057
    .line 1058
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1059
    .line 1060
    return-object v0

    .line 1061
    :pswitch_19
    check-cast v0, La/xa9;

    .line 1062
    .line 1063
    iget-object v1, v0, La/xa9;->j:Ljava/lang/Object;

    .line 1064
    .line 1065
    check-cast v1, La/ctf0;

    .line 1066
    .line 1067
    move-object/from16 v2, p1

    .line 1068
    .line 1069
    check-cast v2, La/i6j;

    .line 1070
    .line 1071
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1072
    .line 1073
    .line 1074
    sget-object v4, La/f6j;->a:La/f6j;

    .line 1075
    .line 1076
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result v4

    .line 1080
    if-eqz v4, :cond_14

    .line 1081
    .line 1082
    new-instance v3, La/f4j;

    .line 1083
    .line 1084
    iget-object v0, v0, La/xa9;->i:Ljava/lang/Object;

    .line 1085
    .line 1086
    check-cast v0, La/n0o0;

    .line 1087
    .line 1088
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v0

    .line 1092
    check-cast v0, La/fee;

    .line 1093
    .line 1094
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    check-cast v0, La/mdm;

    .line 1099
    .line 1100
    invoke-direct {v3, v0}, La/f4j;-><init>(La/mdm;)V

    .line 1101
    .line 1102
    .line 1103
    goto :goto_c

    .line 1104
    :cond_14
    instance-of v0, v2, La/g6j;

    .line 1105
    .line 1106
    if-eqz v0, :cond_17

    .line 1107
    .line 1108
    check-cast v2, La/g6j;

    .line 1109
    .line 1110
    iget-object v0, v2, La/g6j;->b:La/m4j;

    .line 1111
    .line 1112
    iget-object v2, v2, La/g6j;->a:Ljava/util/List;

    .line 1113
    .line 1114
    if-eqz v2, :cond_15

    .line 1115
    .line 1116
    if-nez v0, :cond_15

    .line 1117
    .line 1118
    invoke-static {v1, v2}, La/feb;->J(La/ctf0;Ljava/util/List;)La/lc00;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v0

    .line 1122
    goto :goto_b

    .line 1123
    :cond_15
    if-eqz v0, :cond_16

    .line 1124
    .line 1125
    if-nez v2, :cond_16

    .line 1126
    .line 1127
    invoke-static {v0, v1}, La/feb;->j0(La/m4j;La/ctf0;)La/lc00;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    goto :goto_b

    .line 1132
    :cond_16
    sget-object v0, La/lak0;->c:La/lak0;

    .line 1133
    .line 1134
    :goto_b
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v0

    .line 1138
    new-instance v3, La/e4j;

    .line 1139
    .line 1140
    new-instance v2, La/rll;

    .line 1141
    .line 1142
    new-array v4, v5, [Ljava/lang/Object;

    .line 1143
    .line 1144
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 1145
    .line 1146
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v4

    .line 1150
    const v5, 0x7f130661

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v1, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    invoke-direct {v2, v0, v1}, La/rll;-><init>(La/i4;Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    invoke-direct {v3, v2}, La/e4j;-><init>(La/tll;)V

    .line 1161
    .line 1162
    .line 1163
    goto :goto_c

    .line 1164
    :cond_17
    sget-object v0, La/h6j;->a:La/h6j;

    .line 1165
    .line 1166
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1167
    .line 1168
    .line 1169
    move-result v0

    .line 1170
    if-eqz v0, :cond_18

    .line 1171
    .line 1172
    new-instance v3, La/e4j;

    .line 1173
    .line 1174
    sget-object v0, La/sll;->a:La/sll;

    .line 1175
    .line 1176
    invoke-direct {v3, v0}, La/e4j;-><init>(La/tll;)V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_c

    .line 1180
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 1181
    .line 1182
    .line 1183
    :goto_c
    return-object v3

    .line 1184
    :pswitch_1a
    check-cast v0, La/i5j;

    .line 1185
    .line 1186
    move-object/from16 v1, p1

    .line 1187
    .line 1188
    check-cast v1, La/l5j;

    .line 1189
    .line 1190
    sget-object v2, La/i5j;->O1:[La/iiy;

    .line 1191
    .line 1192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1193
    .line 1194
    .line 1195
    sget-object v2, La/l5j;->a:La/l5j;

    .line 1196
    .line 1197
    invoke-virtual {v1, v2}, La/l5j;->equals(Ljava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v1

    .line 1201
    if-eqz v1, :cond_19

    .line 1202
    .line 1203
    invoke-static {v0}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 1204
    .line 1205
    .line 1206
    iget-object v0, v0, La/i5j;->M1:La/a8z;

    .line 1207
    .line 1208
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    check-cast v0, La/k3t0;

    .line 1213
    .line 1214
    sget-object v1, La/d5j;->a:La/d5j;

    .line 1215
    .line 1216
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1217
    .line 1218
    .line 1219
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1220
    .line 1221
    goto :goto_d

    .line 1222
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 1223
    .line 1224
    .line 1225
    :goto_d
    return-object v3

    .line 1226
    :pswitch_1b
    check-cast v0, La/g3j;

    .line 1227
    .line 1228
    move-object/from16 v1, p1

    .line 1229
    .line 1230
    check-cast v1, La/k0w0;

    .line 1231
    .line 1232
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1233
    .line 1234
    .line 1235
    iget-object v0, v0, La/g3j;->m:Ljava/lang/Object;

    .line 1236
    .line 1237
    check-cast v0, La/q5j;

    .line 1238
    .line 1239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1240
    .line 1241
    .line 1242
    new-instance v0, Lorg/xplatform/aggregator/daily_tasks/impl/di/DailyTasksScreenFactoryImpl$dailyTasksScreen$1;

    .line 1243
    .line 1244
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1252
    .line 1253
    check-cast v0, La/c8d;

    .line 1254
    .line 1255
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1256
    .line 1257
    new-instance v2, La/v7d;

    .line 1258
    .line 1259
    invoke-direct {v2, v4, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1260
    .line 1261
    .line 1262
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 1263
    .line 1264
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1265
    .line 1266
    return-object v0

    .line 1267
    :pswitch_1c
    check-cast v0, La/f3j;

    .line 1268
    .line 1269
    move-object/from16 v1, p1

    .line 1270
    .line 1271
    check-cast v1, La/k0w0;

    .line 1272
    .line 1273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1274
    .line 1275
    .line 1276
    iget-object v0, v0, La/f3j;->g:Ljava/lang/Object;

    .line 1277
    .line 1278
    new-instance v0, Lorg/xplatform/aggregator/daily_tasks/impl/di/DailyTasksScreenFactoryImpl$dailyTasksScreen$1;

    .line 1279
    .line 1280
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1288
    .line 1289
    check-cast v0, La/c8d;

    .line 1290
    .line 1291
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1292
    .line 1293
    new-instance v2, La/v7d;

    .line 1294
    .line 1295
    invoke-direct {v2, v4, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1296
    .line 1297
    .line 1298
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 1299
    .line 1300
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1301
    .line 1302
    return-object v0

    .line 1303
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
