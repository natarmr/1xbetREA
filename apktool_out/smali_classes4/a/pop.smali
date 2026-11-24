.class public final synthetic La/pop;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/pop;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pop;->a:B

    .line 4
    .line 5
    const-string v2, "tipsDialogFeature"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const-string v4, "OnboardingBottomSheetContainerFragment"

    .line 9
    .line 10
    const-string v5, ""

    .line 11
    .line 12
    const/16 v6, 0x8

    .line 13
    .line 14
    const v7, 0x7f130e86

    .line 15
    .line 16
    .line 17
    const-string v8, "BUNDLE_KEY_GAME_ID"

    .line 18
    .line 19
    const-string v9, "REQUEST_KEY_UPDATE_GAME_ID"

    .line 20
    .line 21
    const-string v10, "snackbarManager"

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    const/4 v12, 0x0

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/y2s;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v15, v0

    .line 38
    check-cast v15, La/j2s;

    .line 39
    .line 40
    sget-object v0, La/j2s;->b2:La/xak;

    .line 41
    .line 42
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    instance-of v0, v1, La/r2s;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v13, v15, La/j2s;->U1:La/wdk0;

    .line 50
    .line 51
    if-eqz v13, :cond_0

    .line 52
    .line 53
    new-instance v14, La/xdk0;

    .line 54
    .line 55
    sget-object v3, La/rek0;->b:La/rek0;

    .line 56
    .line 57
    check-cast v1, La/r2s;

    .line 58
    .line 59
    iget v0, v1, La/r2s;->a:I

    .line 60
    .line 61
    invoke-virtual {v15, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const/4 v8, 0x0

    .line 69
    const/16 v9, 0x7c

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    move-object v2, v14

    .line 75
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 76
    .line 77
    .line 78
    const/16 v19, 0x0

    .line 79
    .line 80
    const/16 v20, 0x3fc

    .line 81
    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    const/16 v17, 0x0

    .line 85
    .line 86
    const/16 v18, 0x0

    .line 87
    .line 88
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 89
    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_0
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v12

    .line 97
    :cond_1
    instance-of v0, v1, La/s2s;

    .line 98
    .line 99
    if-eqz v0, :cond_2

    .line 100
    .line 101
    new-instance v0, La/c0x;

    .line 102
    .line 103
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v1, La/s2s;

    .line 108
    .line 109
    iget-object v3, v1, La/s2s;->b:Ljava/util/List;

    .line 110
    .line 111
    iget v1, v1, La/s2s;->a:I

    .line 112
    .line 113
    invoke-direct {v0, v1, v2, v3}, La/c0x;-><init>(ILandroid/content/Context;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_0

    .line 120
    .line 121
    :cond_2
    instance-of v0, v1, La/x2s;

    .line 122
    .line 123
    if-eqz v0, :cond_3

    .line 124
    .line 125
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v1, La/x2s;

    .line 130
    .line 131
    iget-wide v1, v1, La/x2s;->a:J

    .line 132
    .line 133
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    new-instance v2, Lkotlin/Pair;

    .line 138
    .line 139
    invoke-direct {v2, v8, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v0, v1, v9}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_3
    instance-of v0, v1, La/t2s;

    .line 156
    .line 157
    if-eqz v0, :cond_5

    .line 158
    .line 159
    iget-object v0, v15, La/j2s;->O1:La/gfk0;

    .line 160
    .line 161
    if-eqz v0, :cond_4

    .line 162
    .line 163
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    check-cast v1, La/t2s;

    .line 171
    .line 172
    iget-object v1, v1, La/t2s;->a:Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;

    .line 173
    .line 174
    invoke-static {v0, v1}, La/gfk0;->h(Landroidx/fragment/app/e;Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_4
    const-string v0, "actionMenuDialogFactory"

    .line 180
    .line 181
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v12

    .line 185
    :cond_5
    sget-object v0, La/v2s;->a:La/v2s;

    .line 186
    .line 187
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_7

    .line 192
    .line 193
    iget-object v0, v15, La/j2s;->S1:La/xi70;

    .line 194
    .line 195
    if-eqz v0, :cond_6

    .line 196
    .line 197
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-static {v0}, La/xi70;->h(Landroidx/fragment/app/e;)V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_6
    const-string v0, "quickBetDialogNavigator"

    .line 209
    .line 210
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v12

    .line 214
    :cond_7
    sget-object v0, La/w2s;->a:La/w2s;

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_9

    .line 221
    .line 222
    iget-object v13, v15, La/j2s;->U1:La/wdk0;

    .line 223
    .line 224
    if-eqz v13, :cond_8

    .line 225
    .line 226
    new-instance v14, La/xdk0;

    .line 227
    .line 228
    sget-object v17, La/qek0;->a:La/qek0;

    .line 229
    .line 230
    invoke-virtual {v15, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v18

    .line 234
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    const/16 v22, 0x0

    .line 238
    .line 239
    const/16 v23, 0x7c

    .line 240
    .line 241
    const/16 v19, 0x0

    .line 242
    .line 243
    const/16 v20, 0x0

    .line 244
    .line 245
    const/16 v21, 0x0

    .line 246
    .line 247
    move-object/from16 v16, v14

    .line 248
    .line 249
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 250
    .line 251
    .line 252
    const/16 v20, 0x3fc

    .line 253
    .line 254
    const/16 v16, 0x0

    .line 255
    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    const/16 v18, 0x0

    .line 259
    .line 260
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 261
    .line 262
    .line 263
    goto :goto_0

    .line 264
    :cond_8
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v12

    .line 268
    :cond_9
    sget-object v0, La/u2s;->a:La/u2s;

    .line 269
    .line 270
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_c

    .line 275
    .line 276
    iget-object v0, v15, La/j2s;->V1:La/poq0;

    .line 277
    .line 278
    if-eqz v0, :cond_b

    .line 279
    .line 280
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    sget-object v1, La/fk60;->b:La/uuz;

    .line 288
    .line 289
    sget-object v1, La/ki60;->q2:La/htz;

    .line 290
    .line 291
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, v4}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    if-nez v1, :cond_a

    .line 299
    .line 300
    new-instance v1, La/ki60;

    .line 301
    .line 302
    invoke-direct {v1}, La/ki60;-><init>()V

    .line 303
    .line 304
    .line 305
    sget-object v2, La/ki60;->r2:[La/iiy;

    .line 306
    .line 307
    aget-object v7, v2, v11

    .line 308
    .line 309
    iget-object v8, v1, La/ki60;->n2:La/zz2;

    .line 310
    .line 311
    invoke-virtual {v8, v1, v7, v6}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 312
    .line 313
    .line 314
    iget-object v6, v1, La/ki60;->o2:La/phf0;

    .line 315
    .line 316
    aget-object v2, v2, v3

    .line 317
    .line 318
    invoke-virtual {v6, v1, v2, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-static {v1, v0, v4}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_a
    :goto_0
    invoke-virtual {v15}, La/j2s;->J0()La/k3t0;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    sget-object v1, La/k1s;->a:La/k1s;

    .line 329
    .line 330
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    goto :goto_1

    .line 336
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw v12

    .line 340
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 341
    .line 342
    .line 343
    :goto_1
    return-object v12

    .line 344
    :pswitch_0
    move-object/from16 v1, p1

    .line 345
    .line 346
    check-cast v1, Ljava/lang/Throwable;

    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, La/spr;

    .line 354
    .line 355
    iget-object v2, v0, La/spr;->t:La/ivn;

    .line 356
    .line 357
    new-instance v3, La/znr;

    .line 358
    .line 359
    invoke-direct {v3, v0, v11}, La/znr;-><init>(La/spr;B)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 363
    .line 364
    .line 365
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_1
    move-object/from16 v1, p1

    .line 369
    .line 370
    check-cast v1, La/umr;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, La/k3t0;

    .line 378
    .line 379
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object v0

    .line 385
    :pswitch_2
    move-object/from16 v1, p1

    .line 386
    .line 387
    check-cast v1, La/pnr;

    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 393
    .line 394
    move-object v15, v0

    .line 395
    check-cast v15, La/dnr;

    .line 396
    .line 397
    sget-object v0, La/dnr;->c2:La/ddk;

    .line 398
    .line 399
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    instance-of v0, v1, La/mnr;

    .line 403
    .line 404
    if-eqz v0, :cond_d

    .line 405
    .line 406
    new-instance v0, La/gmo;

    .line 407
    .line 408
    const/16 v2, 0x11

    .line 409
    .line 410
    invoke-direct {v0, v15, v1, v2}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 411
    .line 412
    .line 413
    invoke-static {v15, v0}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 414
    .line 415
    .line 416
    goto/16 :goto_2

    .line 417
    .line 418
    :cond_d
    sget-object v0, La/nnr;->b:La/nnr;

    .line 419
    .line 420
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-eqz v0, :cond_e

    .line 425
    .line 426
    new-instance v0, La/ymr;

    .line 427
    .line 428
    invoke-direct {v0, v15, v11}, La/ymr;-><init>(La/dnr;B)V

    .line 429
    .line 430
    .line 431
    invoke-static {v15, v0}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 432
    .line 433
    .line 434
    goto/16 :goto_2

    .line 435
    .line 436
    :cond_e
    sget-object v0, La/nnr;->c:La/nnr;

    .line 437
    .line 438
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v0

    .line 442
    if-eqz v0, :cond_10

    .line 443
    .line 444
    iget-object v13, v15, La/dnr;->O1:La/wdk0;

    .line 445
    .line 446
    if-eqz v13, :cond_f

    .line 447
    .line 448
    new-instance v14, La/xdk0;

    .line 449
    .line 450
    sget-object v17, La/qek0;->a:La/qek0;

    .line 451
    .line 452
    invoke-virtual {v15, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v18

    .line 456
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    const/16 v22, 0x0

    .line 460
    .line 461
    const/16 v23, 0x7c

    .line 462
    .line 463
    const/16 v19, 0x0

    .line 464
    .line 465
    const/16 v20, 0x0

    .line 466
    .line 467
    const/16 v21, 0x0

    .line 468
    .line 469
    move-object/from16 v16, v14

    .line 470
    .line 471
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 472
    .line 473
    .line 474
    const/16 v20, 0x3fc

    .line 475
    .line 476
    const/16 v16, 0x0

    .line 477
    .line 478
    const/16 v17, 0x0

    .line 479
    .line 480
    const/16 v18, 0x0

    .line 481
    .line 482
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 483
    .line 484
    .line 485
    goto/16 :goto_2

    .line 486
    .line 487
    :cond_f
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    throw v12

    .line 491
    :cond_10
    instance-of v0, v1, La/onr;

    .line 492
    .line 493
    if-eqz v0, :cond_11

    .line 494
    .line 495
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    check-cast v1, La/onr;

    .line 500
    .line 501
    iget-wide v1, v1, La/onr;->a:J

    .line 502
    .line 503
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    new-instance v2, Lkotlin/Pair;

    .line 508
    .line 509
    invoke-direct {v2, v8, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-virtual {v0, v1, v9}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    goto/16 :goto_2

    .line 524
    .line 525
    :cond_11
    instance-of v0, v1, La/knr;

    .line 526
    .line 527
    if-eqz v0, :cond_13

    .line 528
    .line 529
    iget-object v13, v15, La/dnr;->O1:La/wdk0;

    .line 530
    .line 531
    if-eqz v13, :cond_12

    .line 532
    .line 533
    new-instance v14, La/xdk0;

    .line 534
    .line 535
    sget-object v3, La/rek0;->b:La/rek0;

    .line 536
    .line 537
    check-cast v1, La/knr;

    .line 538
    .line 539
    iget v0, v1, La/knr;->a:I

    .line 540
    .line 541
    invoke-virtual {v15, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    const/4 v8, 0x0

    .line 549
    const/16 v9, 0x7c

    .line 550
    .line 551
    const/4 v5, 0x0

    .line 552
    const/4 v6, 0x0

    .line 553
    const/4 v7, 0x0

    .line 554
    move-object v2, v14

    .line 555
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 556
    .line 557
    .line 558
    const/16 v19, 0x0

    .line 559
    .line 560
    const/16 v20, 0x3fc

    .line 561
    .line 562
    const/16 v16, 0x0

    .line 563
    .line 564
    const/16 v17, 0x0

    .line 565
    .line 566
    const/16 v18, 0x0

    .line 567
    .line 568
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 569
    .line 570
    .line 571
    goto :goto_2

    .line 572
    :cond_12
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v12

    .line 576
    :cond_13
    instance-of v0, v1, La/lnr;

    .line 577
    .line 578
    if-eqz v0, :cond_14

    .line 579
    .line 580
    new-instance v0, La/c0x;

    .line 581
    .line 582
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    check-cast v1, La/lnr;

    .line 587
    .line 588
    iget-object v3, v1, La/lnr;->b:Ljava/util/List;

    .line 589
    .line 590
    iget v1, v1, La/lnr;->a:I

    .line 591
    .line 592
    invoke-direct {v0, v1, v2, v3}, La/c0x;-><init>(ILandroid/content/Context;Ljava/util/List;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 596
    .line 597
    .line 598
    goto :goto_2

    .line 599
    :cond_14
    sget-object v0, La/nnr;->a:La/nnr;

    .line 600
    .line 601
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-eqz v0, :cond_17

    .line 606
    .line 607
    iget-object v0, v15, La/dnr;->V1:La/poq0;

    .line 608
    .line 609
    if-eqz v0, :cond_16

    .line 610
    .line 611
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    sget-object v1, La/fk60;->b:La/uuz;

    .line 619
    .line 620
    sget-object v1, La/ki60;->q2:La/htz;

    .line 621
    .line 622
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0, v4}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    if-nez v1, :cond_15

    .line 630
    .line 631
    new-instance v1, La/ki60;

    .line 632
    .line 633
    invoke-direct {v1}, La/ki60;-><init>()V

    .line 634
    .line 635
    .line 636
    sget-object v2, La/ki60;->r2:[La/iiy;

    .line 637
    .line 638
    aget-object v7, v2, v11

    .line 639
    .line 640
    iget-object v8, v1, La/ki60;->n2:La/zz2;

    .line 641
    .line 642
    invoke-virtual {v8, v1, v7, v6}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 643
    .line 644
    .line 645
    iget-object v6, v1, La/ki60;->o2:La/phf0;

    .line 646
    .line 647
    aget-object v2, v2, v3

    .line 648
    .line 649
    invoke-virtual {v6, v1, v2, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    invoke-static {v1, v0, v4}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    :cond_15
    :goto_2
    invoke-virtual {v15}, La/dnr;->I0()La/k3t0;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    sget-object v1, La/lmr;->b:La/lmr;

    .line 660
    .line 661
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 665
    .line 666
    goto :goto_3

    .line 667
    :cond_16
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    throw v12

    .line 671
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 672
    .line 673
    .line 674
    :goto_3
    return-object v12

    .line 675
    :pswitch_3
    move-object/from16 v1, p1

    .line 676
    .line 677
    check-cast v1, La/sjr;

    .line 678
    .line 679
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v0, La/k3t0;

    .line 685
    .line 686
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 690
    .line 691
    return-object v0

    .line 692
    :pswitch_4
    move-object/from16 v1, p1

    .line 693
    .line 694
    check-cast v1, La/ncr;

    .line 695
    .line 696
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v0, La/k3t0;

    .line 702
    .line 703
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 707
    .line 708
    return-object v0

    .line 709
    :pswitch_5
    move-object/from16 v1, p1

    .line 710
    .line 711
    check-cast v1, La/dar;

    .line 712
    .line 713
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast v0, La/k3t0;

    .line 719
    .line 720
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 724
    .line 725
    return-object v0

    .line 726
    :pswitch_6
    move-object/from16 v1, p1

    .line 727
    .line 728
    check-cast v1, Ljava/lang/Throwable;

    .line 729
    .line 730
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 734
    .line 735
    check-cast v0, La/ebq;

    .line 736
    .line 737
    invoke-virtual {v0, v1}, La/ebq;->P(Ljava/lang/Throwable;)V

    .line 738
    .line 739
    .line 740
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 741
    .line 742
    return-object v0

    .line 743
    :pswitch_7
    move-object/from16 v1, p1

    .line 744
    .line 745
    check-cast v1, Ljava/lang/Throwable;

    .line 746
    .line 747
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v0, La/ebq;

    .line 753
    .line 754
    invoke-virtual {v0, v1}, La/ebq;->P(Ljava/lang/Throwable;)V

    .line 755
    .line 756
    .line 757
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 758
    .line 759
    return-object v0

    .line 760
    :pswitch_8
    move-object/from16 v1, p1

    .line 761
    .line 762
    check-cast v1, Ljava/lang/Throwable;

    .line 763
    .line 764
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v0, La/ebq;

    .line 770
    .line 771
    invoke-virtual {v0, v1}, La/ebq;->P(Ljava/lang/Throwable;)V

    .line 772
    .line 773
    .line 774
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 775
    .line 776
    return-object v0

    .line 777
    :pswitch_9
    move-object/from16 v1, p1

    .line 778
    .line 779
    check-cast v1, Ljava/lang/Throwable;

    .line 780
    .line 781
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v0, La/ebq;

    .line 787
    .line 788
    invoke-virtual {v0, v1}, La/ebq;->P(Ljava/lang/Throwable;)V

    .line 789
    .line 790
    .line 791
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 792
    .line 793
    return-object v0

    .line 794
    :pswitch_a
    move-object/from16 v1, p1

    .line 795
    .line 796
    check-cast v1, Ljava/lang/Throwable;

    .line 797
    .line 798
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 799
    .line 800
    .line 801
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 802
    .line 803
    check-cast v0, La/ebq;

    .line 804
    .line 805
    invoke-virtual {v0, v1}, La/ebq;->P(Ljava/lang/Throwable;)V

    .line 806
    .line 807
    .line 808
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 809
    .line 810
    return-object v0

    .line 811
    :pswitch_b
    move-object/from16 v1, p1

    .line 812
    .line 813
    check-cast v1, Ljava/lang/Throwable;

    .line 814
    .line 815
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 819
    .line 820
    check-cast v0, La/ebq;

    .line 821
    .line 822
    sget v2, La/ebq;->f0:I

    .line 823
    .line 824
    invoke-virtual {v0, v1}, La/ebq;->P(Ljava/lang/Throwable;)V

    .line 825
    .line 826
    .line 827
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 828
    .line 829
    return-object v0

    .line 830
    :pswitch_c
    move-object/from16 v1, p1

    .line 831
    .line 832
    check-cast v1, Ljava/lang/Throwable;

    .line 833
    .line 834
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v0, La/ebq;

    .line 840
    .line 841
    invoke-virtual {v0, v1}, La/ebq;->P(Ljava/lang/Throwable;)V

    .line 842
    .line 843
    .line 844
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 845
    .line 846
    return-object v0

    .line 847
    :pswitch_d
    move-object/from16 v1, p1

    .line 848
    .line 849
    check-cast v1, Ljava/lang/Throwable;

    .line 850
    .line 851
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v0, La/ebq;

    .line 857
    .line 858
    invoke-virtual {v0, v1}, La/ebq;->P(Ljava/lang/Throwable;)V

    .line 859
    .line 860
    .line 861
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_e
    move-object/from16 v1, p1

    .line 865
    .line 866
    check-cast v1, Ljava/lang/Throwable;

    .line 867
    .line 868
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v0, La/ebq;

    .line 874
    .line 875
    invoke-virtual {v0, v1}, La/ebq;->P(Ljava/lang/Throwable;)V

    .line 876
    .line 877
    .line 878
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 879
    .line 880
    return-object v0

    .line 881
    :pswitch_f
    move-object/from16 v1, p1

    .line 882
    .line 883
    check-cast v1, La/r9q;

    .line 884
    .line 885
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v0, La/k3t0;

    .line 891
    .line 892
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 896
    .line 897
    return-object v0

    .line 898
    :pswitch_10
    move-object/from16 v1, p1

    .line 899
    .line 900
    check-cast v1, La/s9q;

    .line 901
    .line 902
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, La/q9q;

    .line 908
    .line 909
    sget v1, La/q9q;->m2:I

    .line 910
    .line 911
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 912
    .line 913
    .line 914
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 915
    .line 916
    return-object v0

    .line 917
    :pswitch_11
    move-object/from16 v1, p1

    .line 918
    .line 919
    check-cast v1, La/f9q;

    .line 920
    .line 921
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v0, La/k3t0;

    .line 927
    .line 928
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 929
    .line 930
    .line 931
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 932
    .line 933
    return-object v0

    .line 934
    :pswitch_12
    move-object/from16 v1, p1

    .line 935
    .line 936
    check-cast v1, La/i4q;

    .line 937
    .line 938
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast v0, La/k3t0;

    .line 944
    .line 945
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 946
    .line 947
    .line 948
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 949
    .line 950
    return-object v0

    .line 951
    :pswitch_13
    move-object/from16 v1, p1

    .line 952
    .line 953
    check-cast v1, La/s4q;

    .line 954
    .line 955
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast v0, La/n4q;

    .line 961
    .line 962
    sget-object v2, La/n4q;->R1:La/bek;

    .line 963
    .line 964
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    iget-object v2, v0, La/n4q;->L1:La/phf0;

    .line 968
    .line 969
    instance-of v3, v1, La/r4q;

    .line 970
    .line 971
    const/4 v4, 0x0

    .line 972
    if-eqz v3, :cond_18

    .line 973
    .line 974
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 975
    .line 976
    .line 977
    move-result-object v1

    .line 978
    const-string v3, "SeasonsBottomSheet"

    .line 979
    .line 980
    invoke-virtual {v1, v3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 981
    .line 982
    .line 983
    move-result-object v1

    .line 984
    if-nez v1, :cond_1b

    .line 985
    .line 986
    sget-object v1, La/kjh0;->o2:La/gle0;

    .line 987
    .line 988
    sget-object v5, La/n4q;->S1:[La/iiy;

    .line 989
    .line 990
    aget-object v5, v5, v4

    .line 991
    .line 992
    invoke-virtual {v2, v0, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v2

    .line 996
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    new-instance v1, La/kjh0;

    .line 1003
    .line 1004
    invoke-direct {v1}, La/kjh0;-><init>()V

    .line 1005
    .line 1006
    .line 1007
    sget-object v5, La/kjh0;->p2:[La/iiy;

    .line 1008
    .line 1009
    aget-object v4, v5, v4

    .line 1010
    .line 1011
    iget-object v6, v1, La/kjh0;->m2:La/phf0;

    .line 1012
    .line 1013
    const-string v7, "REQUEST_SEASONS_DIALOG_KEY"

    .line 1014
    .line 1015
    invoke-virtual {v6, v1, v4, v7}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    iget-object v4, v1, La/kjh0;->n2:La/phf0;

    .line 1019
    .line 1020
    aget-object v5, v5, v11

    .line 1021
    .line 1022
    invoke-virtual {v4, v1, v5, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    invoke-virtual {v1, v2, v3}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1030
    .line 1031
    .line 1032
    goto/16 :goto_4

    .line 1033
    .line 1034
    :cond_18
    instance-of v3, v1, La/q4q;

    .line 1035
    .line 1036
    if-eqz v3, :cond_19

    .line 1037
    .line 1038
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v1

    .line 1042
    const-string v3, "SelectMatch"

    .line 1043
    .line 1044
    invoke-virtual {v1, v3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    if-nez v1, :cond_1b

    .line 1049
    .line 1050
    sget-object v1, La/qg30;->o2:La/evz;

    .line 1051
    .line 1052
    sget-object v5, La/n4q;->S1:[La/iiy;

    .line 1053
    .line 1054
    aget-object v5, v5, v4

    .line 1055
    .line 1056
    invoke-virtual {v2, v0, v5}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v2

    .line 1060
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1064
    .line 1065
    .line 1066
    new-instance v1, La/qg30;

    .line 1067
    .line 1068
    invoke-direct {v1}, La/qg30;-><init>()V

    .line 1069
    .line 1070
    .line 1071
    sget-object v5, La/qg30;->p2:[La/iiy;

    .line 1072
    .line 1073
    aget-object v4, v5, v4

    .line 1074
    .line 1075
    iget-object v6, v1, La/qg30;->m2:La/phf0;

    .line 1076
    .line 1077
    const-string v7, "REQUEST_MATCH_TYPES_DIALOG_KEY"

    .line 1078
    .line 1079
    invoke-virtual {v6, v1, v4, v7}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1080
    .line 1081
    .line 1082
    iget-object v4, v1, La/qg30;->n2:La/phf0;

    .line 1083
    .line 1084
    aget-object v5, v5, v11

    .line 1085
    .line 1086
    invoke-virtual {v4, v1, v5, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v2

    .line 1093
    invoke-virtual {v1, v2, v3}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    goto :goto_4

    .line 1097
    :cond_19
    instance-of v1, v1, La/p4q;

    .line 1098
    .line 1099
    if-eqz v1, :cond_1b

    .line 1100
    .line 1101
    iget-object v1, v0, La/n4q;->O1:La/ii;

    .line 1102
    .line 1103
    if-eqz v1, :cond_1a

    .line 1104
    .line 1105
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1106
    .line 1107
    const v2, 0x7f1303fb

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v14

    .line 1114
    const v2, 0x7f131169

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v15

    .line 1121
    const v2, 0x7f130e5d

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v16

    .line 1128
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1129
    .line 1130
    .line 1131
    const v2, 0x7f13032f

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v17

    .line 1138
    sget-object v22, La/n12;->a:La/n12;

    .line 1139
    .line 1140
    const/16 v23, 0x0

    .line 1141
    .line 1142
    const/16 v24, 0x5d0

    .line 1143
    .line 1144
    const/16 v18, 0x0

    .line 1145
    .line 1146
    const-string v19, "REQUEST_RESET_DIALOG_KEY"

    .line 1147
    .line 1148
    const/16 v20, 0x0

    .line 1149
    .line 1150
    const/16 v21, 0x0

    .line 1151
    .line 1152
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v2

    .line 1159
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v1, v13, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1163
    .line 1164
    .line 1165
    goto :goto_4

    .line 1166
    :cond_1a
    const-string v0, "actionDialogManager"

    .line 1167
    .line 1168
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1169
    .line 1170
    .line 1171
    throw v12

    .line 1172
    :cond_1b
    :goto_4
    invoke-virtual {v0}, La/n4q;->G0()La/k3t0;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v0

    .line 1176
    sget-object v1, La/z3q;->a:La/z3q;

    .line 1177
    .line 1178
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1179
    .line 1180
    .line 1181
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1182
    .line 1183
    return-object v0

    .line 1184
    :pswitch_14
    move-object/from16 v1, p1

    .line 1185
    .line 1186
    check-cast v1, La/lvp;

    .line 1187
    .line 1188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1189
    .line 1190
    .line 1191
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1192
    .line 1193
    check-cast v0, La/k3t0;

    .line 1194
    .line 1195
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1196
    .line 1197
    .line 1198
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1199
    .line 1200
    return-object v0

    .line 1201
    :pswitch_15
    move-object/from16 v1, p1

    .line 1202
    .line 1203
    check-cast v1, La/jxp;

    .line 1204
    .line 1205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1206
    .line 1207
    .line 1208
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1209
    .line 1210
    move-object v4, v0

    .line 1211
    check-cast v4, La/svp;

    .line 1212
    .line 1213
    sget-object v0, La/svp;->S1:La/ddk;

    .line 1214
    .line 1215
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1216
    .line 1217
    .line 1218
    instance-of v0, v1, La/hxp;

    .line 1219
    .line 1220
    if-eqz v0, :cond_1d

    .line 1221
    .line 1222
    check-cast v1, La/hxp;

    .line 1223
    .line 1224
    iget-object v0, v4, La/svp;->N1:La/ujd;

    .line 1225
    .line 1226
    if-eqz v0, :cond_1c

    .line 1227
    .line 1228
    iget-object v1, v1, La/hxp;->a:La/sjd;

    .line 1229
    .line 1230
    invoke-virtual {v0, v4, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 1231
    .line 1232
    .line 1233
    goto :goto_5

    .line 1234
    :cond_1c
    const-string v0, "composeGameCardFragmentDelegate"

    .line 1235
    .line 1236
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    throw v12

    .line 1240
    :cond_1d
    instance-of v0, v1, La/ixp;

    .line 1241
    .line 1242
    if-eqz v0, :cond_1f

    .line 1243
    .line 1244
    check-cast v1, La/ixp;

    .line 1245
    .line 1246
    iget-object v2, v4, La/svp;->O1:La/wdk0;

    .line 1247
    .line 1248
    if-eqz v2, :cond_1e

    .line 1249
    .line 1250
    new-instance v3, La/xdk0;

    .line 1251
    .line 1252
    sget-object v14, La/rek0;->b:La/rek0;

    .line 1253
    .line 1254
    iget-object v15, v1, La/ixp;->a:Ljava/lang/String;

    .line 1255
    .line 1256
    const/16 v19, 0x0

    .line 1257
    .line 1258
    const/16 v20, 0x7c

    .line 1259
    .line 1260
    const/16 v16, 0x0

    .line 1261
    .line 1262
    const/16 v17, 0x0

    .line 1263
    .line 1264
    const/16 v18, 0x0

    .line 1265
    .line 1266
    move-object v13, v3

    .line 1267
    invoke-direct/range {v13 .. v20}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1268
    .line 1269
    .line 1270
    const/4 v8, 0x0

    .line 1271
    const/16 v9, 0x3fc

    .line 1272
    .line 1273
    const/4 v5, 0x0

    .line 1274
    const/4 v6, 0x0

    .line 1275
    const/4 v7, 0x0

    .line 1276
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1277
    .line 1278
    .line 1279
    :goto_5
    invoke-virtual {v4}, La/svp;->G0()La/k3t0;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v0

    .line 1283
    sget-object v1, La/yup;->a:La/yup;

    .line 1284
    .line 1285
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1286
    .line 1287
    .line 1288
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1289
    .line 1290
    goto :goto_6

    .line 1291
    :cond_1e
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    throw v12

    .line 1295
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 1296
    .line 1297
    .line 1298
    :goto_6
    return-object v12

    .line 1299
    :pswitch_16
    move-object/from16 v1, p1

    .line 1300
    .line 1301
    check-cast v1, Ljava/lang/Throwable;

    .line 1302
    .line 1303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1304
    .line 1305
    .line 1306
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1307
    .line 1308
    check-cast v0, La/pup;

    .line 1309
    .line 1310
    iget-object v2, v0, La/pup;->A:La/bby;

    .line 1311
    .line 1312
    if-eqz v2, :cond_20

    .line 1313
    .line 1314
    invoke-interface {v2, v12}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 1315
    .line 1316
    .line 1317
    :cond_20
    iget-object v2, v0, La/pup;->w:La/duj;

    .line 1318
    .line 1319
    new-instance v3, La/gup;

    .line 1320
    .line 1321
    invoke-direct {v3, v1, v0, v11}, La/gup;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1325
    .line 1326
    .line 1327
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1328
    .line 1329
    return-object v0

    .line 1330
    :pswitch_17
    move-object/from16 v1, p1

    .line 1331
    .line 1332
    check-cast v1, La/mtp;

    .line 1333
    .line 1334
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1335
    .line 1336
    .line 1337
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1338
    .line 1339
    check-cast v0, La/k3t0;

    .line 1340
    .line 1341
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1342
    .line 1343
    .line 1344
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1345
    .line 1346
    return-object v0

    .line 1347
    :pswitch_18
    move-object/from16 v1, p1

    .line 1348
    .line 1349
    check-cast v1, Ljava/lang/Throwable;

    .line 1350
    .line 1351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1352
    .line 1353
    .line 1354
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1355
    .line 1356
    check-cast v0, La/fpp;

    .line 1357
    .line 1358
    invoke-virtual {v0, v1}, La/fpp;->P(Ljava/lang/Throwable;)V

    .line 1359
    .line 1360
    .line 1361
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1362
    .line 1363
    return-object v0

    .line 1364
    :pswitch_19
    move-object/from16 v1, p1

    .line 1365
    .line 1366
    check-cast v1, La/ujp;

    .line 1367
    .line 1368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1369
    .line 1370
    .line 1371
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1372
    .line 1373
    check-cast v0, La/k3t0;

    .line 1374
    .line 1375
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1376
    .line 1377
    .line 1378
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1379
    .line 1380
    return-object v0

    .line 1381
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1382
    .line 1383
    check-cast v1, La/ekp;

    .line 1384
    .line 1385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1386
    .line 1387
    .line 1388
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1389
    .line 1390
    move-object v4, v0

    .line 1391
    check-cast v4, La/rop;

    .line 1392
    .line 1393
    sget-object v0, La/rop;->a2:La/nek;

    .line 1394
    .line 1395
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1396
    .line 1397
    .line 1398
    instance-of v0, v1, La/ckp;

    .line 1399
    .line 1400
    if-eqz v0, :cond_21

    .line 1401
    .line 1402
    check-cast v1, La/ckp;

    .line 1403
    .line 1404
    iget-object v0, v1, La/ckp;->a:La/ghq0;

    .line 1405
    .line 1406
    iget-object v6, v0, La/ghq0;->a:La/ygq0;

    .line 1407
    .line 1408
    iget-object v0, v0, La/ghq0;->b:La/wgq0;

    .line 1409
    .line 1410
    iget-wide v7, v0, La/wgq0;->a:J

    .line 1411
    .line 1412
    iget-wide v9, v0, La/wgq0;->b:J

    .line 1413
    .line 1414
    sget-object v0, La/d3i0;->n2:La/gle0;

    .line 1415
    .line 1416
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v2

    .line 1420
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1421
    .line 1422
    .line 1423
    new-instance v13, Ljava/util/Date;

    .line 1424
    .line 1425
    invoke-direct {v13}, Ljava/util/Date;-><init>()V

    .line 1426
    .line 1427
    .line 1428
    iget-object v15, v1, La/ckp;->b:La/jhq0;

    .line 1429
    .line 1430
    new-instance v5, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 1431
    .line 1432
    const/4 v12, 0x0

    .line 1433
    const/4 v14, 0x0

    .line 1434
    const/4 v11, 0x1

    .line 1435
    invoke-direct/range {v5 .. v15}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;-><init>(La/ygq0;JJZZLjava/util/Date;ZLa/jhq0;)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1439
    .line 1440
    .line 1441
    invoke-static {v2, v5}, La/gle0;->i(Landroidx/fragment/app/e;Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;)V

    .line 1442
    .line 1443
    .line 1444
    goto/16 :goto_8

    .line 1445
    .line 1446
    :cond_21
    instance-of v0, v1, La/bkp;

    .line 1447
    .line 1448
    if-eqz v0, :cond_22

    .line 1449
    .line 1450
    check-cast v1, La/bkp;

    .line 1451
    .line 1452
    invoke-virtual {v4}, La/rop;->M0()La/zgi;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v0

    .line 1456
    iget-object v2, v0, La/zgi;->q:La/wdk0;

    .line 1457
    .line 1458
    iget-object v3, v1, La/bkp;->a:La/xdk0;

    .line 1459
    .line 1460
    const/4 v8, 0x0

    .line 1461
    const/16 v9, 0x3fc

    .line 1462
    .line 1463
    const/4 v5, 0x0

    .line 1464
    const/4 v6, 0x0

    .line 1465
    const/4 v7, 0x0

    .line 1466
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1467
    .line 1468
    .line 1469
    goto :goto_8

    .line 1470
    :cond_22
    instance-of v0, v1, La/akp;

    .line 1471
    .line 1472
    if-eqz v0, :cond_23

    .line 1473
    .line 1474
    check-cast v1, La/akp;

    .line 1475
    .line 1476
    iget-object v0, v1, La/akp;->a:Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;

    .line 1477
    .line 1478
    sget-object v1, La/y3i0;->n2:La/lme0;

    .line 1479
    .line 1480
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v2

    .line 1484
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    new-instance v3, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;

    .line 1488
    .line 1489
    const-string v5, "SELECT_DATE_TIME_REQUEST_KEY"

    .line 1490
    .line 1491
    invoke-direct {v3, v0, v5}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;-><init>(Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;Ljava/lang/String;)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    invoke-static {v2, v3}, La/lme0;->c(Landroidx/fragment/app/e;Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;)V

    .line 1498
    .line 1499
    .line 1500
    goto :goto_8

    .line 1501
    :cond_23
    instance-of v0, v1, La/zjp;

    .line 1502
    .line 1503
    if-eqz v0, :cond_24

    .line 1504
    .line 1505
    invoke-static {v4}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 1506
    .line 1507
    .line 1508
    goto :goto_8

    .line 1509
    :cond_24
    instance-of v0, v1, La/dkp;

    .line 1510
    .line 1511
    if-eqz v0, :cond_28

    .line 1512
    .line 1513
    check-cast v1, La/dkp;

    .line 1514
    .line 1515
    iget-object v0, v1, La/dkp;->a:Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;

    .line 1516
    .line 1517
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    iget-object v1, v1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 1522
    .line 1523
    invoke-virtual {v1}, La/pmi;->p()Ljava/util/List;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v1

    .line 1527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1528
    .line 1529
    .line 1530
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1531
    .line 1532
    .line 1533
    move-result v2

    .line 1534
    if-eqz v2, :cond_25

    .line 1535
    .line 1536
    goto :goto_7

    .line 1537
    :cond_25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v1

    .line 1541
    :cond_26
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1542
    .line 1543
    .line 1544
    move-result v2

    .line 1545
    if-eqz v2, :cond_27

    .line 1546
    .line 1547
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v2

    .line 1551
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 1552
    .line 1553
    instance-of v2, v2, La/sik;

    .line 1554
    .line 1555
    if-eqz v2, :cond_26

    .line 1556
    .line 1557
    goto :goto_8

    .line 1558
    :cond_27
    :goto_7
    sget-object v1, La/b5r0;->t2:La/j6m0;

    .line 1559
    .line 1560
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v2

    .line 1564
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1568
    .line 1569
    .line 1570
    invoke-static {v2, v0}, La/j6m0;->f(Landroidx/fragment/app/e;Lorg/xplatform/feed/topgamesbystat/presentation/params/TopGamesByStatBottomSheetScreenParams;)V

    .line 1571
    .line 1572
    .line 1573
    :goto_8
    invoke-virtual {v4}, La/rop;->N0()La/k3t0;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v0

    .line 1577
    sget-object v1, La/hjp;->a:La/hjp;

    .line 1578
    .line 1579
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1580
    .line 1581
    .line 1582
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1583
    .line 1584
    goto :goto_9

    .line 1585
    :cond_28
    invoke-static {}, La/t9f;->b()V

    .line 1586
    .line 1587
    .line 1588
    :goto_9
    return-object v12

    .line 1589
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1590
    .line 1591
    check-cast v1, La/dgl0;

    .line 1592
    .line 1593
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1594
    .line 1595
    .line 1596
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1597
    .line 1598
    check-cast v0, La/k3t0;

    .line 1599
    .line 1600
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1601
    .line 1602
    .line 1603
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1604
    .line 1605
    return-object v0

    .line 1606
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1607
    .line 1608
    check-cast v1, La/ki00;

    .line 1609
    .line 1610
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1611
    .line 1612
    .line 1613
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1614
    .line 1615
    check-cast v0, La/k3t0;

    .line 1616
    .line 1617
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1618
    .line 1619
    .line 1620
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1621
    .line 1622
    return-object v0

    .line 1623
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
