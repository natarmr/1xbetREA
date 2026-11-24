.class public final synthetic La/ejd;
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
    iput-byte p2, p0, La/ejd;->a:B

    iput-object p1, p0, La/ejd;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ejd;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/16 v4, 0xe

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v0, v0, La/ejd;->b:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v0, La/ecg;

    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Throwable;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, La/ecg;->d:La/duj;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    check-cast v0, La/dcg;

    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Landroid/view/View;

    .line 40
    .line 41
    sget-object v2, La/dcg;->P1:La/nwd;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v0, v0, La/dcg;->N1:La/kiu0;

    .line 47
    .line 48
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, La/ecg;

    .line 53
    .line 54
    iget-object v0, v0, La/ecg;->f:La/p7m0;

    .line 55
    .line 56
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    xor-int/2addr v1, v6

    .line 67
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_1
    check-cast v0, La/mhc;

    .line 78
    .line 79
    move-object/from16 v1, p1

    .line 80
    .line 81
    check-cast v1, La/cp;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 87
    .line 88
    check-cast v2, La/k7g;

    .line 89
    .line 90
    iget-object v3, v2, La/k7g;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v5, La/v4f;

    .line 96
    .line 97
    invoke-direct {v5, v0, v1, v4}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {v3, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 101
    .line 102
    .line 103
    iget-object v2, v2, La/k7g;->b:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 104
    .line 105
    new-instance v3, La/wg;

    .line 106
    .line 107
    const/16 v4, 0xc

    .line 108
    .line 109
    invoke-direct {v3, v1, v0, v4}, La/wg;-><init>(La/cp;La/rer;B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    .line 114
    .line 115
    new-instance v0, La/ok;

    .line 116
    .line 117
    const/16 v2, 0x13

    .line 118
    .line 119
    invoke-direct {v0, v1, v1, v2}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 123
    .line 124
    .line 125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_2
    check-cast v0, La/n5g;

    .line 129
    .line 130
    move-object/from16 v1, p1

    .line 131
    .line 132
    check-cast v1, Ljava/lang/Integer;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    sget-object v2, La/n5g;->S1:La/qud;

    .line 139
    .line 140
    invoke-virtual {v0}, La/n5g;->H0()La/e5g;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iget-object v0, v0, La/zz3;->e:La/yz3;

    .line 145
    .line 146
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 147
    .line 148
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    instance-of v1, v0, La/w5g;

    .line 153
    .line 154
    if-eqz v1, :cond_0

    .line 155
    .line 156
    move-object v7, v0

    .line 157
    check-cast v7, La/w5g;

    .line 158
    .line 159
    :cond_0
    if-eqz v7, :cond_1

    .line 160
    .line 161
    iget-object v0, v7, La/w5g;->d:La/r5g;

    .line 162
    .line 163
    iget-boolean v0, v0, La/r5g;->b:Z

    .line 164
    .line 165
    if-ne v0, v6, :cond_1

    .line 166
    .line 167
    move v5, v6

    .line 168
    :cond_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    return-object v0

    .line 173
    :pswitch_3
    check-cast v0, La/jwd;

    .line 174
    .line 175
    move-object/from16 v1, p1

    .line 176
    .line 177
    check-cast v1, Ljava/lang/Throwable;

    .line 178
    .line 179
    sget-object v1, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->A:Ljava/util/LinkedHashMap;

    .line 180
    .line 181
    invoke-virtual {v0}, La/jwd;->invoke()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_4
    move-object v1, v0

    .line 188
    check-cast v1, La/rnf;

    .line 189
    .line 190
    move-object/from16 v13, p1

    .line 191
    .line 192
    check-cast v13, La/xus;

    .line 193
    .line 194
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 198
    .line 199
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 200
    .line 201
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 209
    .line 210
    move-object v4, v2

    .line 211
    move-object v2, v4

    .line 212
    check-cast v2, La/wmf;

    .line 213
    .line 214
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    const/16 v17, 0x0

    .line 218
    .line 219
    const v18, 0xfdffff

    .line 220
    .line 221
    .line 222
    const/4 v3, 0x0

    .line 223
    move-object v5, v4

    .line 224
    const/4 v4, 0x0

    .line 225
    move-object v6, v5

    .line 226
    const/4 v5, 0x0

    .line 227
    move-object v7, v6

    .line 228
    const/4 v6, 0x0

    .line 229
    move-object v8, v7

    .line 230
    const/4 v7, 0x0

    .line 231
    move-object v9, v8

    .line 232
    const/4 v8, 0x0

    .line 233
    move-object v10, v9

    .line 234
    const/4 v9, 0x0

    .line 235
    move-object v11, v10

    .line 236
    const/4 v10, 0x0

    .line 237
    move-object v12, v11

    .line 238
    const/4 v11, 0x0

    .line 239
    move-object v14, v12

    .line 240
    const/4 v12, 0x0

    .line 241
    move-object v15, v14

    .line 242
    const/4 v14, 0x0

    .line 243
    move-object/from16 v16, v15

    .line 244
    .line 245
    const/4 v15, 0x0

    .line 246
    move-object/from16 v19, v16

    .line 247
    .line 248
    const/16 v16, 0x0

    .line 249
    .line 250
    move-object/from16 p0, v1

    .line 251
    .line 252
    move-object/from16 v1, v19

    .line 253
    .line 254
    invoke-static/range {v2 .. v18}, La/wmf;->a(La/wmf;La/jlr;La/bqr;ZLa/mrf;Ljava/util/List;La/ypl0;ZZLjava/util/ArrayList;ZLa/xus;La/gps;La/qmf;La/yws;La/szj0;I)La/wmf;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-eqz v1, :cond_2

    .line 263
    .line 264
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object v0

    .line 267
    :cond_2
    move-object/from16 v1, p0

    .line 268
    .line 269
    goto :goto_0

    .line 270
    :pswitch_5
    check-cast v0, La/hnf;

    .line 271
    .line 272
    move-object/from16 v1, p1

    .line 273
    .line 274
    check-cast v1, La/eth;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    iget-object v1, v1, La/eth;->a:Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;

    .line 280
    .line 281
    iget-object v2, v0, La/hnf;->c:La/enf;

    .line 282
    .line 283
    iget-object v3, v2, La/enf;->a:Ljava/lang/String;

    .line 284
    .line 285
    iget-object v2, v2, La/enf;->b:Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual {v1, v3, v2}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    iget-object v2, v0, La/hnf;->d:La/srf;

    .line 291
    .line 292
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->setFirstPlayer(La/srf;)V

    .line 293
    .line 294
    .line 295
    iget-object v2, v0, La/hnf;->e:La/srf;

    .line 296
    .line 297
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->setSecondPlayer(La/srf;)V

    .line 298
    .line 299
    .line 300
    iget-object v2, v0, La/hnf;->f:La/srf;

    .line 301
    .line 302
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->setThirdPlayer(La/srf;)V

    .line 303
    .line 304
    .line 305
    iget-object v2, v0, La/hnf;->g:La/srf;

    .line 306
    .line 307
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->setFourPlayer(La/srf;)V

    .line 308
    .line 309
    .line 310
    iget-object v2, v0, La/hnf;->h:La/srf;

    .line 311
    .line 312
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->setFivePlayer(La/srf;)V

    .line 313
    .line 314
    .line 315
    iget-boolean v2, v0, La/hnf;->k:Z

    .line 316
    .line 317
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->setExtraMargin(Z)V

    .line 318
    .line 319
    .line 320
    iget v2, v0, La/hnf;->i:I

    .line 321
    .line 322
    invoke-virtual {v1, v2}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->setBackground(I)V

    .line 323
    .line 324
    .line 325
    iget-object v0, v0, La/hnf;->j:Ljava/lang/String;

    .line 326
    .line 327
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->setTotalCash(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    return-object v0

    .line 333
    :pswitch_6
    check-cast v0, La/icf;

    .line 334
    .line 335
    move-object/from16 v1, p1

    .line 336
    .line 337
    check-cast v1, La/e0u;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, La/icf;->e()Ljava/util/concurrent/Executor;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    new-instance v4, La/hcf;

    .line 347
    .line 348
    invoke-direct {v4, v0, v1, v3}, La/hcf;-><init>(La/icf;La/e0u;B)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 352
    .line 353
    .line 354
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 355
    .line 356
    return-object v0

    .line 357
    :pswitch_7
    check-cast v0, La/dcf;

    .line 358
    .line 359
    move-object/from16 v1, p1

    .line 360
    .line 361
    check-cast v1, La/e0u;

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0}, La/dcf;->e()Ljava/util/concurrent/Executor;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    new-instance v3, La/bcf;

    .line 371
    .line 372
    invoke-direct {v3, v0, v1, v6}, La/bcf;-><init>(La/dcf;La/e0u;B)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 376
    .line 377
    .line 378
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_8
    check-cast v0, La/n4f;

    .line 382
    .line 383
    move-object/from16 v1, p1

    .line 384
    .line 385
    check-cast v1, Ljava/lang/Integer;

    .line 386
    .line 387
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    sget-object v2, La/n4f;->k2:La/kwd;

    .line 391
    .line 392
    iget-object v2, v0, La/n4f;->i2:La/phf0;

    .line 393
    .line 394
    sget-object v4, La/n4f;->l2:[La/iiy;

    .line 395
    .line 396
    aget-object v5, v4, v3

    .line 397
    .line 398
    invoke-virtual {v2, v0, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-lez v5, :cond_3

    .line 407
    .line 408
    aget-object v3, v4, v3

    .line 409
    .line 410
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    new-instance v3, Lkotlin/Pair;

    .line 415
    .line 416
    const-string v4, "RESULT_POSITION"

    .line 417
    .line 418
    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    :cond_3
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 433
    .line 434
    .line 435
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 436
    .line 437
    return-object v0

    .line 438
    :pswitch_9
    check-cast v0, La/ejd;

    .line 439
    .line 440
    move-object/from16 v1, p1

    .line 441
    .line 442
    check-cast v1, La/cp;

    .line 443
    .line 444
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    new-instance v2, La/l4f;

    .line 448
    .line 449
    invoke-direct {v2, v1, v0}, La/l4f;-><init>(La/cp;La/ejd;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 453
    .line 454
    .line 455
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object v0

    .line 458
    :pswitch_a
    check-cast v0, La/pw4;

    .line 459
    .line 460
    move-object/from16 v1, p1

    .line 461
    .line 462
    check-cast v1, Landroid/view/View;

    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0}, La/pw4;->invoke()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 471
    .line 472
    return-object v0

    .line 473
    :pswitch_b
    check-cast v0, La/pw4;

    .line 474
    .line 475
    move-object/from16 v1, p1

    .line 476
    .line 477
    check-cast v1, Landroid/view/View;

    .line 478
    .line 479
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0}, La/pw4;->invoke()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 486
    .line 487
    return-object v0

    .line 488
    :pswitch_c
    check-cast v0, La/wze;

    .line 489
    .line 490
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
    iget-object v0, v0, La/wze;->s:La/y3j0;

    .line 498
    .line 499
    sget-object v2, La/bm5;->i:La/bm5;

    .line 500
    .line 501
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    new-instance v0, Lorg/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;

    .line 505
    .line 506
    invoke-direct {v0, v2}, Lorg/xplatform/make_bet_settings/impl/navigation/SettingsMakeBetFactoryImpl$getSettingsMakeBetScreen$1;-><init>(La/bm5;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 510
    .line 511
    .line 512
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object v0

    .line 515
    :pswitch_d
    check-cast v0, La/lya;

    .line 516
    .line 517
    move-object/from16 v1, p1

    .line 518
    .line 519
    check-cast v1, La/cp;

    .line 520
    .line 521
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    iget-object v2, v1, La/xhe0;->a:Landroid/view/View;

    .line 525
    .line 526
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    new-instance v3, La/h6c;

    .line 530
    .line 531
    const/16 v4, 0x1a

    .line 532
    .line 533
    invoke-direct {v3, v0, v1, v4}, La/h6c;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 534
    .line 535
    .line 536
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 537
    .line 538
    .line 539
    new-instance v0, La/rn5;

    .line 540
    .line 541
    const/16 v2, 0x15

    .line 542
    .line 543
    invoke-direct {v0, v1, v2}, La/rn5;-><init>(La/cp;B)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 547
    .line 548
    .line 549
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object v0

    .line 552
    :pswitch_e
    check-cast v0, La/tu9;

    .line 553
    .line 554
    move-object/from16 v1, p1

    .line 555
    .line 556
    check-cast v1, Ljava/lang/Throwable;

    .line 557
    .line 558
    if-eqz v1, :cond_5

    .line 559
    .line 560
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 561
    .line 562
    if-eqz v2, :cond_4

    .line 563
    .line 564
    invoke-virtual {v0}, La/tu9;->c()V

    .line 565
    .line 566
    .line 567
    goto :goto_1

    .line 568
    :cond_4
    invoke-virtual {v0, v1}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 569
    .line 570
    .line 571
    goto :goto_1

    .line 572
    :cond_5
    invoke-virtual {v0, v7}, La/tu9;->b(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 576
    .line 577
    return-object v0

    .line 578
    :pswitch_f
    check-cast v0, La/pce;

    .line 579
    .line 580
    move-object/from16 v1, p1

    .line 581
    .line 582
    check-cast v1, Ljava/lang/Throwable;

    .line 583
    .line 584
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    iget-object v1, v0, La/pce;->k:La/p7m0;

    .line 588
    .line 589
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    move-object v2, v0

    .line 594
    check-cast v2, La/gce;

    .line 595
    .line 596
    const/4 v3, 0x3

    .line 597
    invoke-static {v2, v7, v5, v6, v3}, La/gce;->a(La/gce;Ljava/lang/String;ZZI)La/gce;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-eqz v0, :cond_6

    .line 606
    .line 607
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 608
    .line 609
    return-object v0

    .line 610
    :pswitch_10
    check-cast v0, La/dce;

    .line 611
    .line 612
    move-object/from16 v1, p1

    .line 613
    .line 614
    check-cast v1, Landroid/net/Uri;

    .line 615
    .line 616
    sget-object v2, La/dce;->Q1:La/kwd;

    .line 617
    .line 618
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    iget-object v0, v0, La/dce;->N1:La/kiu0;

    .line 622
    .line 623
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    check-cast v0, La/pce;

    .line 628
    .line 629
    new-instance v2, La/vbe;

    .line 630
    .line 631
    invoke-direct {v2, v1}, La/vbe;-><init>(Landroid/net/Uri;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0, v2}, La/pce;->w(La/xbe;)V

    .line 635
    .line 636
    .line 637
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 638
    .line 639
    return-object v0

    .line 640
    :pswitch_11
    check-cast v0, La/vae;

    .line 641
    .line 642
    move-object/from16 v1, p1

    .line 643
    .line 644
    check-cast v1, Ljava/lang/Throwable;

    .line 645
    .line 646
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v0}, La/vae;->a()V

    .line 650
    .line 651
    .line 652
    iget-object v0, v0, La/vae;->f:La/qoj0;

    .line 653
    .line 654
    invoke-virtual {v0, v1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 658
    .line 659
    return-object v0

    .line 660
    :pswitch_12
    check-cast v0, La/fae;

    .line 661
    .line 662
    move-object/from16 v1, p1

    .line 663
    .line 664
    check-cast v1, La/k0w0;

    .line 665
    .line 666
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    iget-object v0, v0, La/fae;->d:La/nhf0;

    .line 670
    .line 671
    iget-object v0, v0, La/nhf0;->b:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, La/pru;

    .line 674
    .line 675
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    iget-boolean v0, v0, La/sff0;->A0:Z

    .line 680
    .line 681
    if-eqz v0, :cond_7

    .line 682
    .line 683
    new-instance v0, Lorg/xplatform/client1/features/appactivity/AppScreens$ContactsFragmentScreen;

    .line 684
    .line 685
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 686
    .line 687
    .line 688
    goto :goto_2

    .line 689
    :cond_7
    new-instance v0, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 690
    .line 691
    sget-object v2, La/y9x;->e:La/y9x;

    .line 692
    .line 693
    invoke-virtual {v2}, La/y9x;->a()Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    invoke-direct {v0, v3, v4, v7, v7}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 698
    .line 699
    .line 700
    invoke-static {v2}, La/x9x;->T(La/y9x;)I

    .line 701
    .line 702
    .line 703
    move-result v2

    .line 704
    new-instance v3, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;

    .line 705
    .line 706
    invoke-direct {v3, v0, v2, v6}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZ)V

    .line 707
    .line 708
    .line 709
    move-object v0, v3

    .line 710
    :goto_2
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 711
    .line 712
    .line 713
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 714
    .line 715
    return-object v0

    .line 716
    :pswitch_13
    check-cast v0, La/e7e;

    .line 717
    .line 718
    move-object/from16 v1, p1

    .line 719
    .line 720
    check-cast v1, Landroid/view/View;

    .line 721
    .line 722
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 723
    .line 724
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v0}, La/e7e;->J0()La/fae;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    iget-object v1, v0, La/fae;->b:La/i1w0;

    .line 732
    .line 733
    new-instance v2, La/ejd;

    .line 734
    .line 735
    const/16 v3, 0xa

    .line 736
    .line 737
    invoke-direct {v2, v0, v3}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual {v0, v5}, La/fae;->A(Z)V

    .line 744
    .line 745
    .line 746
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 747
    .line 748
    return-object v0

    .line 749
    :pswitch_14
    check-cast v0, La/xyd;

    .line 750
    .line 751
    move-object/from16 v1, p1

    .line 752
    .line 753
    check-cast v1, La/iqt0;

    .line 754
    .line 755
    sget-object v2, La/xyd;->U1:La/kud;

    .line 756
    .line 757
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v0}, La/xyd;->H0()La/kzd;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    iget-object v0, v0, La/kzd;->l:La/z4w0;

    .line 765
    .line 766
    invoke-virtual {v0, v1}, La/z4w0;->a(La/iqt0;)V

    .line 767
    .line 768
    .line 769
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 770
    .line 771
    return-object v0

    .line 772
    :pswitch_15
    check-cast v0, La/kyd;

    .line 773
    .line 774
    move-object/from16 v1, p1

    .line 775
    .line 776
    check-cast v1, Ljava/lang/Throwable;

    .line 777
    .line 778
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    iget-object v1, v0, La/kyd;->B:La/p7m0;

    .line 782
    .line 783
    :cond_8
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    move-object v2, v0

    .line 788
    check-cast v2, La/wxd;

    .line 789
    .line 790
    const/4 v7, 0x0

    .line 791
    const/16 v8, 0xde

    .line 792
    .line 793
    const/4 v3, 0x0

    .line 794
    const/4 v4, 0x0

    .line 795
    const/4 v5, 0x0

    .line 796
    const/4 v6, 0x1

    .line 797
    invoke-static/range {v2 .. v8}, La/wxd;->a(La/wxd;ZLjava/lang/String;ZZZI)La/wxd;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    move-result v0

    .line 805
    if-eqz v0, :cond_8

    .line 806
    .line 807
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 808
    .line 809
    return-object v0

    .line 810
    :pswitch_16
    check-cast v0, La/exd;

    .line 811
    .line 812
    move-object/from16 v1, p1

    .line 813
    .line 814
    check-cast v1, Landroid/text/Editable;

    .line 815
    .line 816
    sget-object v3, La/exd;->U1:La/usd;

    .line 817
    .line 818
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v0}, La/exd;->I0()La/kyd;

    .line 822
    .line 823
    .line 824
    move-result-object v3

    .line 825
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    if-nez v0, :cond_9

    .line 830
    .line 831
    move-object v9, v2

    .line 832
    goto :goto_3

    .line 833
    :cond_9
    move-object v9, v0

    .line 834
    :goto_3
    iget-object v1, v3, La/kyd;->B:La/p7m0;

    .line 835
    .line 836
    :cond_a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    move-object v7, v0

    .line 841
    check-cast v7, La/wxd;

    .line 842
    .line 843
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 844
    .line 845
    .line 846
    move-result v4

    .line 847
    if-lez v4, :cond_b

    .line 848
    .line 849
    move v12, v6

    .line 850
    goto :goto_4

    .line 851
    :cond_b
    move v12, v5

    .line 852
    :goto_4
    const/16 v13, 0xbd

    .line 853
    .line 854
    const/4 v8, 0x0

    .line 855
    const/4 v10, 0x0

    .line 856
    const/4 v11, 0x0

    .line 857
    invoke-static/range {v7 .. v13}, La/wxd;->a(La/wxd;ZLjava/lang/String;ZZZI)La/wxd;

    .line 858
    .line 859
    .line 860
    move-result-object v4

    .line 861
    invoke-virtual {v1, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    move-result v0

    .line 865
    if-eqz v0, :cond_a

    .line 866
    .line 867
    invoke-virtual {v3, v2}, La/kyd;->I(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 871
    .line 872
    return-object v0

    .line 873
    :pswitch_17
    check-cast v0, La/mwd;

    .line 874
    .line 875
    move-object/from16 v1, p1

    .line 876
    .line 877
    check-cast v1, La/fwd;

    .line 878
    .line 879
    sget-object v2, La/mwd;->k2:La/kwd;

    .line 880
    .line 881
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    sget-object v2, La/ewd;->a:La/ewd;

    .line 885
    .line 886
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    move-result v2

    .line 890
    if-eqz v2, :cond_d

    .line 891
    .line 892
    iget-object v1, v0, La/mwd;->i2:La/ii;

    .line 893
    .line 894
    if-eqz v1, :cond_c

    .line 895
    .line 896
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 897
    .line 898
    const v2, 0x7f1303fb

    .line 899
    .line 900
    .line 901
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v9

    .line 905
    const v2, 0x7f130ab3

    .line 906
    .line 907
    .line 908
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v10

    .line 912
    const v2, 0x7f130e5c

    .line 913
    .line 914
    .line 915
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v11

    .line 919
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    sget-object v17, La/n12;->a:La/n12;

    .line 923
    .line 924
    const/16 v18, 0x0

    .line 925
    .line 926
    const/16 v19, 0x5f8

    .line 927
    .line 928
    const/4 v12, 0x0

    .line 929
    const/4 v13, 0x0

    .line 930
    const/4 v14, 0x0

    .line 931
    const/4 v15, 0x0

    .line 932
    const/16 v16, 0x0

    .line 933
    .line 934
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 938
    .line 939
    .line 940
    move-result-object v2

    .line 941
    invoke-virtual {v2}, La/kxq;->r()La/v1r;

    .line 942
    .line 943
    .line 944
    move-result-object v2

    .line 945
    invoke-virtual {v1, v8, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 949
    .line 950
    .line 951
    goto :goto_5

    .line 952
    :cond_c
    const-string v0, "actionDialogManager"

    .line 953
    .line 954
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    throw v7

    .line 958
    :cond_d
    sget-object v2, La/dwd;->a:La/dwd;

    .line 959
    .line 960
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    move-result v1

    .line 964
    if-eqz v1, :cond_f

    .line 965
    .line 966
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    if-eqz v1, :cond_e

    .line 971
    .line 972
    invoke-static {v1}, La/j120;->h0(Landroid/content/Context;)V

    .line 973
    .line 974
    .line 975
    :cond_e
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 976
    .line 977
    .line 978
    :goto_5
    iget-object v0, v0, La/mwd;->j2:La/a8z;

    .line 979
    .line 980
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    check-cast v0, La/k3t0;

    .line 985
    .line 986
    sget-object v1, La/yvd;->a:La/yvd;

    .line 987
    .line 988
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 989
    .line 990
    .line 991
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 992
    .line 993
    goto :goto_6

    .line 994
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 995
    .line 996
    .line 997
    :goto_6
    return-object v7

    .line 998
    :pswitch_18
    check-cast v0, La/nud;

    .line 999
    .line 1000
    move-object/from16 v1, p1

    .line 1001
    .line 1002
    check-cast v1, Landroid/text/Editable;

    .line 1003
    .line 1004
    sget-object v3, La/nud;->b2:La/kud;

    .line 1005
    .line 1006
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v0}, La/nud;->I0()La/svd;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    if-nez v1, :cond_10

    .line 1018
    .line 1019
    goto :goto_7

    .line 1020
    :cond_10
    move-object v2, v1

    .line 1021
    :goto_7
    invoke-virtual {v0, v2}, La/svd;->y(Ljava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1025
    .line 1026
    return-object v0

    .line 1027
    :pswitch_19
    check-cast v0, La/wlu0;

    .line 1028
    .line 1029
    move-object/from16 v1, p1

    .line 1030
    .line 1031
    check-cast v1, La/bh90;

    .line 1032
    .line 1033
    sget-object v2, La/wrw;->a:La/zfn;

    .line 1034
    .line 1035
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1036
    .line 1037
    .line 1038
    invoke-static {v1, v2}, La/qbc;->V(La/bh90;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v1

    .line 1042
    check-cast v1, La/xlu0;

    .line 1043
    .line 1044
    iget-object v1, v1, La/xlu0;->a:Landroid/view/View;

    .line 1045
    .line 1046
    :goto_8
    if-eqz v1, :cond_13

    .line 1047
    .line 1048
    invoke-interface {v0}, La/wlu0;->a()I

    .line 1049
    .line 1050
    .line 1051
    move-result v2

    .line 1052
    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    if-eqz v2, :cond_11

    .line 1057
    .line 1058
    move-object v7, v2

    .line 1059
    goto :goto_9

    .line 1060
    :cond_11
    invoke-static {v1}, La/k7n0;->v(Landroid/view/View;)Landroid/view/ViewParent;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    instance-of v2, v1, Landroid/view/View;

    .line 1065
    .line 1066
    if-eqz v2, :cond_12

    .line 1067
    .line 1068
    check-cast v1, Landroid/view/View;

    .line 1069
    .line 1070
    goto :goto_8

    .line 1071
    :cond_12
    move-object v1, v7

    .line 1072
    goto :goto_8

    .line 1073
    :cond_13
    :goto_9
    return-object v7

    .line 1074
    :pswitch_1a
    check-cast v0, La/skd;

    .line 1075
    .line 1076
    move-object/from16 v1, p1

    .line 1077
    .line 1078
    check-cast v1, La/bh90;

    .line 1079
    .line 1080
    iget-object v1, v0, La/skd;->x:La/a23;

    .line 1081
    .line 1082
    if-nez v1, :cond_14

    .line 1083
    .line 1084
    new-instance v1, La/a23;

    .line 1085
    .line 1086
    iget-object v2, v0, La/skd;->a:Landroid/view/View;

    .line 1087
    .line 1088
    invoke-direct {v1, v2}, La/a23;-><init>(Landroid/view/View;)V

    .line 1089
    .line 1090
    .line 1091
    iput-object v1, v0, La/skd;->x:La/a23;

    .line 1092
    .line 1093
    :cond_14
    return-object v1

    .line 1094
    :pswitch_1b
    check-cast v0, Landroid/os/CancellationSignal;

    .line 1095
    .line 1096
    move-object/from16 v1, p1

    .line 1097
    .line 1098
    check-cast v1, Ljava/lang/Throwable;

    .line 1099
    .line 1100
    if-eqz v1, :cond_15

    .line 1101
    .line 1102
    invoke-virtual {v0}, Landroid/os/CancellationSignal;->cancel()V

    .line 1103
    .line 1104
    .line 1105
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1106
    .line 1107
    return-object v0

    .line 1108
    :pswitch_1c
    check-cast v0, La/hjd;

    .line 1109
    .line 1110
    move-object/from16 v1, p1

    .line 1111
    .line 1112
    check-cast v1, Ljava/lang/Integer;

    .line 1113
    .line 1114
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1115
    .line 1116
    .line 1117
    move-result v1

    .line 1118
    new-instance v2, La/rjd;

    .line 1119
    .line 1120
    invoke-direct {v2, v1}, La/rjd;-><init>(I)V

    .line 1121
    .line 1122
    .line 1123
    sget v1, La/hjd;->E:I

    .line 1124
    .line 1125
    invoke-virtual {v0, v2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 1126
    .line 1127
    .line 1128
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1129
    .line 1130
    return-object v0

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
