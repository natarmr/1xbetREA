.class public final synthetic La/twe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/axe;


# direct methods
.method public synthetic constructor <init>(La/axe;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/twe;->a:B

    iput-object p1, p0, La/twe;->b:La/axe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/twe;->a:B

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    iget-object v7, v0, La/twe;->b:La/axe;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/axe;->e2:La/kud;

    .line 16
    .line 17
    invoke-virtual {v7}, La/axe;->G0()Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    sget-object v8, La/f6f;->a:La/f6f;

    .line 29
    .line 30
    iget-object v1, v0, La/r7f;->Y0:La/mne;

    .line 31
    .line 32
    iget-object v10, v1, La/mne;->b:La/dvj;

    .line 33
    .line 34
    new-instance v11, La/a6f;

    .line 35
    .line 36
    invoke-direct {v11, v0, v6, v3}, La/a6f;-><init>(La/r7f;La/yje;B)V

    .line 37
    .line 38
    .line 39
    const/16 v12, 0xa

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    sget-object v0, La/axe;->e2:La/kud;

    .line 49
    .line 50
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    new-instance v2, Lkotlin/Pair;

    .line 57
    .line 58
    const-string v3, "CHANGE_BALANCE_CLICK_REQUEST_KEY"

    .line 59
    .line 60
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    new-instance v8, La/vzd;

    .line 83
    .line 84
    const/16 v1, 0x18

    .line 85
    .line 86
    invoke-direct {v8, v1}, La/vzd;-><init>(B)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v0, La/r7f;->Y0:La/mne;

    .line 90
    .line 91
    iget-object v10, v1, La/mne;->b:La/dvj;

    .line 92
    .line 93
    new-instance v11, La/u6f;

    .line 94
    .line 95
    invoke-direct {v11, v0, v6, v4}, La/u6f;-><init>(La/r7f;La/yje;B)V

    .line 96
    .line 97
    .line 98
    const/16 v12, 0xa

    .line 99
    .line 100
    const/4 v9, 0x0

    .line 101
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 102
    .line 103
    .line 104
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_1
    sget-object v0, La/axe;->e2:La/kud;

    .line 108
    .line 109
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    new-instance v1, La/yld;

    .line 114
    .line 115
    const/16 v2, 0x1b

    .line 116
    .line 117
    invoke-direct {v1, v2}, La/yld;-><init>(B)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v4, v4, v1}, La/r7f;->h0(ZZLkotlin/jvm/functions/Function0;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, La/r7f;->X()V

    .line 124
    .line 125
    .line 126
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_2
    sget-object v0, La/axe;->e2:La/kud;

    .line 130
    .line 131
    invoke-virtual {v7}, La/axe;->G0()Z

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iget-object v1, v0, La/r7f;->I0:La/qu;

    .line 139
    .line 140
    iget-object v1, v1, La/qu;->a:La/kt2;

    .line 141
    .line 142
    const-string v2, "coupon_point_call"

    .line 143
    .line 144
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, v0, La/r7f;->K0:La/x20;

    .line 148
    .line 149
    iget-object v1, v1, La/x20;->a:La/s1p;

    .line 150
    .line 151
    const-wide/16 v2, 0xc8d

    .line 152
    .line 153
    sget-object v4, La/xun;->a:La/xun;

    .line 154
    .line 155
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 156
    .line 157
    .line 158
    iget-boolean v1, v0, La/r7f;->U1:Z

    .line 159
    .line 160
    invoke-virtual {v0}, La/r7f;->N()La/b3f;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iget-boolean v2, v2, La/b3f;->b:Z

    .line 165
    .line 166
    invoke-virtual {v0}, La/r7f;->N()La/b3f;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    iget-boolean v3, v3, La/b3f;->d:Z

    .line 171
    .line 172
    invoke-virtual {v0}, La/r7f;->N()La/b3f;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    iget-boolean v4, v4, La/b3f;->h:Z

    .line 177
    .line 178
    new-instance v5, La/k3f;

    .line 179
    .line 180
    invoke-direct {v5, v2, v3, v1, v4}, La/k3f;-><init>(ZZZZ)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v5}, La/r7f;->R(La/c4f;)V

    .line 184
    .line 185
    .line 186
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_3
    sget-object v0, La/axe;->e2:La/kud;

    .line 190
    .line 191
    invoke-virtual {v7}, La/axe;->G0()Z

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    sget-object v1, La/m3f;->a:La/m3f;

    .line 199
    .line 200
    invoke-virtual {v0, v1}, La/r7f;->R(La/c4f;)V

    .line 201
    .line 202
    .line 203
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_4
    sget-object v0, La/axe;->e2:La/kud;

    .line 207
    .line 208
    invoke-virtual {v7}, La/axe;->G0()Z

    .line 209
    .line 210
    .line 211
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iget-object v1, v0, La/r7f;->J0:La/ag3;

    .line 216
    .line 217
    iget-object v1, v1, La/ag3;->a:La/kt2;

    .line 218
    .line 219
    const-string v3, "bet_place_settings"

    .line 220
    .line 221
    invoke-interface {v1, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    iget-object v1, v0, La/r7f;->L0:La/x20;

    .line 225
    .line 226
    iget-object v1, v1, La/x20;->a:La/s1p;

    .line 227
    .line 228
    const-wide/16 v3, 0xc66

    .line 229
    .line 230
    sget-object v5, La/xun;->a:La/xun;

    .line 231
    .line 232
    invoke-virtual {v1, v5, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 233
    .line 234
    .line 235
    iget-object v1, v0, La/r7f;->V0:La/i1w0;

    .line 236
    .line 237
    new-instance v3, La/t4f;

    .line 238
    .line 239
    invoke-direct {v3, v0, v2}, La/t4f;-><init>(La/r7f;B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 243
    .line 244
    .line 245
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_5
    sget-object v0, La/axe;->e2:La/kud;

    .line 249
    .line 250
    new-instance v0, La/gw5;

    .line 251
    .line 252
    invoke-direct {v0, v7, v3}, La/gw5;-><init>(Ljava/lang/Object;B)V

    .line 253
    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_6
    sget-object v1, La/axe;->e2:La/kud;

    .line 257
    .line 258
    new-instance v3, La/xwe;

    .line 259
    .line 260
    const-string v8, "clickCoupon(JJJJZ)V"

    .line 261
    .line 262
    const/4 v9, 0x0

    .line 263
    const/4 v4, 0x5

    .line 264
    iget-object v12, v0, La/twe;->b:La/axe;

    .line 265
    .line 266
    const-class v13, La/axe;

    .line 267
    .line 268
    const-string v7, "clickCoupon"

    .line 269
    .line 270
    move-object v5, v12

    .line 271
    move-object v6, v13

    .line 272
    invoke-direct/range {v3 .. v9}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 273
    .line 274
    .line 275
    new-instance v4, La/z6e;

    .line 276
    .line 277
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    const/4 v10, 0x0

    .line 282
    const/16 v11, 0x13

    .line 283
    .line 284
    const/4 v5, 0x1

    .line 285
    const-class v17, La/r7f;

    .line 286
    .line 287
    const-string v8, "onCloseCouponEventClicked"

    .line 288
    .line 289
    const-string v9, "onCloseCouponEventClicked(J)V"

    .line 290
    .line 291
    move-object/from16 v7, v17

    .line 292
    .line 293
    invoke-direct/range {v4 .. v11}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 294
    .line 295
    .line 296
    new-instance v6, La/mhc;

    .line 297
    .line 298
    const/16 v16, 0x0

    .line 299
    .line 300
    const/16 v17, 0xa

    .line 301
    .line 302
    const/4 v11, 0x2

    .line 303
    const-string v14, "showBlockListWithSingleChoiceDialog"

    .line 304
    .line 305
    const-string v15, "showBlockListWithSingleChoiceDialog(IJ)V"

    .line 306
    .line 307
    move-object v10, v6

    .line 308
    invoke-direct/range {v10 .. v17}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 309
    .line 310
    .line 311
    new-instance v14, La/mhc;

    .line 312
    .line 313
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 314
    .line 315
    .line 316
    move-result-object v16

    .line 317
    const/16 v20, 0x0

    .line 318
    .line 319
    const/16 v21, 0xb

    .line 320
    .line 321
    const/4 v15, 0x2

    .line 322
    const-string v18, "onCloseBlockCouponEventClicked"

    .line 323
    .line 324
    const-string v19, "onCloseBlockCouponEventClicked(IJ)V"

    .line 325
    .line 326
    move-object/from16 v17, v7

    .line 327
    .line 328
    invoke-direct/range {v14 .. v21}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 329
    .line 330
    .line 331
    move-object v7, v14

    .line 332
    new-instance v8, La/z6e;

    .line 333
    .line 334
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 335
    .line 336
    .line 337
    move-result-object v16

    .line 338
    const/16 v21, 0x14

    .line 339
    .line 340
    const/4 v15, 0x1

    .line 341
    const-string v18, "onCheckAuthForMakeBlockBet"

    .line 342
    .line 343
    const-string v19, "onCheckAuthForMakeBlockBet(I)V"

    .line 344
    .line 345
    move-object v14, v8

    .line 346
    invoke-direct/range {v14 .. v21}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 347
    .line 348
    .line 349
    new-instance v9, La/pw4;

    .line 350
    .line 351
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 352
    .line 353
    .line 354
    move-result-object v16

    .line 355
    const/16 v21, 0x18

    .line 356
    .line 357
    const/4 v15, 0x0

    .line 358
    const-string v18, "onClickExpressBoostInfo"

    .line 359
    .line 360
    const-string v19, "onClickExpressBoostInfo()V"

    .line 361
    .line 362
    move-object v14, v9

    .line 363
    invoke-direct/range {v14 .. v21}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 364
    .line 365
    .line 366
    new-instance v10, La/mhc;

    .line 367
    .line 368
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 369
    .line 370
    .line 371
    move-result-object v16

    .line 372
    const/16 v21, 0xc

    .line 373
    .line 374
    const/4 v15, 0x2

    .line 375
    const-string v18, "onClickBetOnFavoriteEvent"

    .line 376
    .line 377
    const-string v19, "onClickBetOnFavoriteEvent(IJ)V"

    .line 378
    .line 379
    move-object v14, v10

    .line 380
    invoke-direct/range {v14 .. v21}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 381
    .line 382
    .line 383
    move-object v0, v14

    .line 384
    new-instance v11, La/pw4;

    .line 385
    .line 386
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 387
    .line 388
    .line 389
    move-result-object v16

    .line 390
    const/16 v21, 0x19

    .line 391
    .line 392
    const/4 v15, 0x0

    .line 393
    const-string v18, "onClickBetOnFavoriteExpand"

    .line 394
    .line 395
    const-string v19, "onClickBetOnFavoriteExpand()V"

    .line 396
    .line 397
    move-object v14, v11

    .line 398
    invoke-direct/range {v14 .. v21}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 399
    .line 400
    .line 401
    move-object v1, v14

    .line 402
    new-instance v14, La/pw4;

    .line 403
    .line 404
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 405
    .line 406
    .line 407
    move-result-object v16

    .line 408
    const/16 v21, 0x1a

    .line 409
    .line 410
    const-string v18, "onClickCloseExpressBoost"

    .line 411
    .line 412
    const-string v19, "onClickCloseExpressBoost()V"

    .line 413
    .line 414
    invoke-direct/range {v14 .. v21}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 415
    .line 416
    .line 417
    move-object v5, v14

    .line 418
    move-object/from16 v18, v17

    .line 419
    .line 420
    new-instance v10, La/pw4;

    .line 421
    .line 422
    const/16 v16, 0x0

    .line 423
    .line 424
    const/16 v17, 0x14

    .line 425
    .line 426
    const/4 v11, 0x0

    .line 427
    const-string v14, "showAutoSubInfoSnackBar"

    .line 428
    .line 429
    const-string v15, "showAutoSubInfoSnackBar()V"

    .line 430
    .line 431
    invoke-direct/range {v10 .. v17}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 432
    .line 433
    .line 434
    new-instance v14, La/z6e;

    .line 435
    .line 436
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 437
    .line 438
    .line 439
    move-result-object v16

    .line 440
    const/16 v21, 0x12

    .line 441
    .line 442
    const/4 v15, 0x1

    .line 443
    move-object/from16 v17, v18

    .line 444
    .line 445
    const-string v18, "onClickOptionBet"

    .line 446
    .line 447
    const-string v19, "onClickOptionBet(J)V"

    .line 448
    .line 449
    invoke-direct/range {v14 .. v21}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 450
    .line 451
    .line 452
    move-object v11, v14

    .line 453
    new-instance v15, La/pw4;

    .line 454
    .line 455
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 456
    .line 457
    .line 458
    move-result-object v16

    .line 459
    const/16 v21, 0x15

    .line 460
    .line 461
    move-object v14, v15

    .line 462
    const/4 v15, 0x0

    .line 463
    const-string v18, "onClickEachWay"

    .line 464
    .line 465
    const-string v19, "onClickEachWay()V"

    .line 466
    .line 467
    invoke-direct/range {v14 .. v21}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 468
    .line 469
    .line 470
    move-object v13, v14

    .line 471
    new-instance v16, La/pw4;

    .line 472
    .line 473
    move-object/from16 v14, v16

    .line 474
    .line 475
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 476
    .line 477
    .line 478
    move-result-object v16

    .line 479
    const/16 v21, 0x16

    .line 480
    .line 481
    const-string v18, "onRemoveCouponClicked"

    .line 482
    .line 483
    const-string v19, "onRemoveCouponClicked()V"

    .line 484
    .line 485
    invoke-direct/range {v14 .. v21}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 486
    .line 487
    .line 488
    move-object/from16 v22, v14

    .line 489
    .line 490
    new-instance v19, La/pw4;

    .line 491
    .line 492
    invoke-virtual {v12}, La/axe;->M0()La/r7f;

    .line 493
    .line 494
    .line 495
    move-result-object v16

    .line 496
    const/16 v21, 0x17

    .line 497
    .line 498
    const-string v18, "onItemMoving"

    .line 499
    .line 500
    move-object/from16 v14, v19

    .line 501
    .line 502
    const-string v19, "onItemMoving()V"

    .line 503
    .line 504
    invoke-direct/range {v14 .. v21}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 505
    .line 506
    .line 507
    move-object v15, v5

    .line 508
    move-object v5, v4

    .line 509
    move-object v4, v3

    .line 510
    new-instance v3, La/tre;

    .line 511
    .line 512
    new-instance v2, La/uwe;

    .line 513
    .line 514
    move-object/from16 p0, v0

    .line 515
    .line 516
    const/4 v0, 0x6

    .line 517
    invoke-direct {v2, v12, v0}, La/uwe;-><init>(La/axe;B)V

    .line 518
    .line 519
    .line 520
    new-instance v0, La/uwe;

    .line 521
    .line 522
    move-object/from16 v17, v1

    .line 523
    .line 524
    const/4 v1, 0x7

    .line 525
    invoke-direct {v0, v12, v1}, La/uwe;-><init>(La/axe;B)V

    .line 526
    .line 527
    .line 528
    new-instance v1, La/cnc;

    .line 529
    .line 530
    move-object/from16 v18, v0

    .line 531
    .line 532
    const/16 v0, 0x12

    .line 533
    .line 534
    invoke-direct {v1, v12, v0}, La/cnc;-><init>(Ljava/lang/Object;B)V

    .line 535
    .line 536
    .line 537
    move-object/from16 v20, v1

    .line 538
    .line 539
    move-object/from16 v19, v14

    .line 540
    .line 541
    move-object v12, v15

    .line 542
    move-object/from16 v16, v22

    .line 543
    .line 544
    move-object v14, v11

    .line 545
    move-object v15, v13

    .line 546
    move-object/from16 v11, v17

    .line 547
    .line 548
    move-object/from16 v17, v2

    .line 549
    .line 550
    move-object v13, v10

    .line 551
    move-object/from16 v10, p0

    .line 552
    .line 553
    invoke-direct/range {v3 .. v20}, La/tre;-><init>(La/xwe;La/z6e;La/mhc;La/mhc;La/z6e;La/pw4;La/mhc;La/pw4;La/pw4;La/pw4;La/z6e;La/pw4;La/pw4;La/uwe;La/uwe;La/pw4;La/cnc;)V

    .line 554
    .line 555
    .line 556
    return-object v3

    .line 557
    :pswitch_7
    sget-object v0, La/axe;->e2:La/kud;

    .line 558
    .line 559
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    const v1, 0x7f070074

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    return-object v0

    .line 575
    :pswitch_8
    iget-object v0, v7, La/axe;->P1:La/fiu0;

    .line 576
    .line 577
    if-eqz v0, :cond_0

    .line 578
    .line 579
    return-object v0

    .line 580
    :cond_0
    const-string v0, "viewModelFactory"

    .line 581
    .line 582
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    throw v6

    .line 586
    :pswitch_9
    sget-object v0, La/axe;->e2:La/kud;

    .line 587
    .line 588
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    sget-object v1, La/q4f;->d:La/q4f;

    .line 593
    .line 594
    invoke-virtual {v1}, La/q4f;->a()I

    .line 595
    .line 596
    .line 597
    move-result v1

    .line 598
    invoke-virtual {v0, v1, v5}, La/r7f;->q0(IZ)V

    .line 599
    .line 600
    .line 601
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 602
    .line 603
    return-object v0

    .line 604
    :pswitch_a
    sget-object v0, La/axe;->e2:La/kud;

    .line 605
    .line 606
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 611
    .line 612
    .line 613
    move-result-object v7

    .line 614
    iget-object v1, v0, La/r7f;->Y0:La/mne;

    .line 615
    .line 616
    iget-object v10, v1, La/mne;->b:La/dvj;

    .line 617
    .line 618
    sget-object v8, La/i6f;->a:La/i6f;

    .line 619
    .line 620
    new-instance v11, La/d5f;

    .line 621
    .line 622
    const/4 v1, 0x3

    .line 623
    invoke-direct {v11, v0, v6, v1}, La/d5f;-><init>(La/r7f;La/yje;B)V

    .line 624
    .line 625
    .line 626
    const/16 v12, 0xa

    .line 627
    .line 628
    const/4 v9, 0x0

    .line 629
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 630
    .line 631
    .line 632
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    return-object v0

    .line 635
    :pswitch_b
    sget-object v0, La/axe;->e2:La/kud;

    .line 636
    .line 637
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 642
    .line 643
    .line 644
    move-result-object v7

    .line 645
    new-instance v8, La/vzd;

    .line 646
    .line 647
    const/16 v1, 0x16

    .line 648
    .line 649
    invoke-direct {v8, v1}, La/vzd;-><init>(B)V

    .line 650
    .line 651
    .line 652
    iget-object v1, v0, La/r7f;->Y0:La/mne;

    .line 653
    .line 654
    iget-object v10, v1, La/mne;->b:La/dvj;

    .line 655
    .line 656
    new-instance v11, La/u6f;

    .line 657
    .line 658
    invoke-direct {v11, v0, v6, v5}, La/u6f;-><init>(La/r7f;La/yje;B)V

    .line 659
    .line 660
    .line 661
    const/16 v12, 0xa

    .line 662
    .line 663
    const/4 v9, 0x0

    .line 664
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 665
    .line 666
    .line 667
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 668
    .line 669
    return-object v0

    .line 670
    :pswitch_c
    sget-object v0, La/axe;->e2:La/kud;

    .line 671
    .line 672
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 673
    .line 674
    .line 675
    move-result-object v10

    .line 676
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    iget-object v1, v10, La/r7f;->Y0:La/mne;

    .line 681
    .line 682
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 683
    .line 684
    new-instance v8, La/z6e;

    .line 685
    .line 686
    const/4 v14, 0x0

    .line 687
    const/16 v15, 0x1a

    .line 688
    .line 689
    const/4 v9, 0x1

    .line 690
    const-class v11, La/r7f;

    .line 691
    .line 692
    const-string v12, "showLoginOrIgnore"

    .line 693
    .line 694
    const-string v13, "showLoginOrIgnore(Ljava/lang/Throwable;)V"

    .line 695
    .line 696
    invoke-direct/range {v8 .. v15}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 697
    .line 698
    .line 699
    new-instance v15, La/g5f;

    .line 700
    .line 701
    invoke-direct {v15, v10, v6, v4}, La/g5f;-><init>(La/r7f;La/yje;B)V

    .line 702
    .line 703
    .line 704
    const/16 v16, 0xa

    .line 705
    .line 706
    const/4 v13, 0x0

    .line 707
    move-object v11, v0

    .line 708
    move-object v14, v1

    .line 709
    move-object v12, v8

    .line 710
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 711
    .line 712
    .line 713
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 714
    .line 715
    return-object v0

    .line 716
    :pswitch_d
    sget-object v0, La/axe;->e2:La/kud;

    .line 717
    .line 718
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    iget-object v1, v7, La/axe;->M1:La/phf0;

    .line 723
    .line 724
    sget-object v2, La/axe;->f2:[La/iiy;

    .line 725
    .line 726
    aget-object v2, v2, v5

    .line 727
    .line 728
    invoke-virtual {v1, v7, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    invoke-virtual {v0, v1}, La/r7f;->S(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 736
    .line 737
    return-object v0

    .line 738
    :pswitch_e
    sget-object v0, La/axe;->e2:La/kud;

    .line 739
    .line 740
    iget-object v0, v7, La/axe;->M1:La/phf0;

    .line 741
    .line 742
    sget-object v1, La/axe;->f2:[La/iiy;

    .line 743
    .line 744
    aget-object v1, v1, v5

    .line 745
    .line 746
    const-string v2, ""

    .line 747
    .line 748
    invoke-virtual {v0, v7, v1, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 752
    .line 753
    return-object v0

    .line 754
    :pswitch_f
    sget-object v0, La/axe;->e2:La/kud;

    .line 755
    .line 756
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 761
    .line 762
    new-instance v2, Lkotlin/Pair;

    .line 763
    .line 764
    const-string v3, "PAYMENT_CLICK_REQUEST_KEY"

    .line 765
    .line 766
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-virtual {v0, v1, v3}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v7}, La/axe;->M0()La/r7f;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    iget-object v1, v0, La/r7f;->D0:La/v88;

    .line 785
    .line 786
    iget-object v0, v0, La/r7f;->V0:La/i1w0;

    .line 787
    .line 788
    const-wide/16 v2, 0x0

    .line 789
    .line 790
    const/4 v4, 0x4

    .line 791
    invoke-static {v1, v0, v2, v3, v4}, La/v88;->b(La/v88;La/i1w0;JI)V

    .line 792
    .line 793
    .line 794
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 795
    .line 796
    return-object v0

    .line 797
    :pswitch_data_0
    .packed-switch 0x0
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
