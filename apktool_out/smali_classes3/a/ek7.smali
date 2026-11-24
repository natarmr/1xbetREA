.class public final synthetic La/ek7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gk7;


# direct methods
.method public synthetic constructor <init>(La/gk7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ek7;->a:B

    iput-object p1, p0, La/ek7;->b:La/gk7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ek7;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, ""

    .line 7
    .line 8
    const-string v4, "BUNDLE_BET_ID"

    .line 9
    .line 10
    iget-object v5, v0, La/ek7;->b:La/gk7;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v0, p1

    .line 16
    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    move-object/from16 v1, p2

    .line 20
    .line 21
    check-cast v1, Landroid/os/Bundle;

    .line 22
    .line 23
    sget-object v6, La/gk7;->U1:La/kl5;

    .line 24
    .line 25
    const-string v6, "REQUEST_KEY_SUCCESS_SALE"

    .line 26
    .line 27
    invoke-static {v1, v0, v6}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v3, "REQUEST_KEY_HIDE_COUPON"

    .line 41
    .line 42
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v5}, La/gk7;->I0()La/k3t0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, La/fj7;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-direct {v3, v0, v1}, La/fj7;-><init>(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    :goto_0
    return-object v0

    .line 64
    :pswitch_0
    move-object/from16 v0, p1

    .line 65
    .line 66
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    move-object/from16 v1, p2

    .line 69
    .line 70
    check-cast v1, Landroid/os/Bundle;

    .line 71
    .line 72
    sget-object v2, La/gk7;->U1:La/kl5;

    .line 73
    .line 74
    const-string v2, "REQUEST_BET_UPDATE_BY_ID"

    .line 75
    .line 76
    invoke-static {v1, v0, v2}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_1

    .line 81
    .line 82
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v5}, La/gk7;->I0()La/k3t0;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v2, La/si7;

    .line 97
    .line 98
    invoke-direct {v2, v0}, La/si7;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    :goto_1
    return-object v0

    .line 107
    :pswitch_1
    move-object/from16 v0, p1

    .line 108
    .line 109
    check-cast v0, Ljava/lang/String;

    .line 110
    .line 111
    move-object/from16 v1, p2

    .line 112
    .line 113
    check-cast v1, Landroid/os/Bundle;

    .line 114
    .line 115
    sget-object v2, La/gk7;->U1:La/kl5;

    .line 116
    .line 117
    const-string v2, "REQUEST_EDIT_COUPON_DIALOG"

    .line 118
    .line 119
    invoke-static {v1, v0, v2}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_2

    .line 124
    .line 125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    invoke-virtual {v5}, La/gk7;->I0()La/k3t0;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sget-object v1, La/qi7;->a:La/qi7;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_2
    return-object v0

    .line 140
    :pswitch_2
    move-object/from16 v1, p1

    .line 141
    .line 142
    check-cast v1, La/fet;

    .line 143
    .line 144
    move-object/from16 v3, p2

    .line 145
    .line 146
    check-cast v3, Ljava/lang/Integer;

    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    sget-object v4, La/gk7;->U1:La/kl5;

    .line 153
    .line 154
    and-int/lit8 v4, v3, 0x3

    .line 155
    .line 156
    const/4 v5, 0x1

    .line 157
    const/4 v6, 0x2

    .line 158
    if-eq v4, v6, :cond_3

    .line 159
    .line 160
    move v4, v5

    .line 161
    goto :goto_3

    .line 162
    :cond_3
    move v4, v2

    .line 163
    :goto_3
    and-int/2addr v3, v5

    .line 164
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_16

    .line 169
    .line 170
    iget-object v9, v0, La/ek7;->b:La/gk7;

    .line 171
    .line 172
    invoke-virtual {v9}, La/gk7;->I0()La/k3t0;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, La/i3t0;

    .line 177
    .line 178
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v9}, La/gk7;->I0()La/k3t0;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    sget-object v15, La/ukd;->a:La/cl5;

    .line 195
    .line 196
    if-nez v4, :cond_4

    .line 197
    .line 198
    if-ne v7, v15, :cond_5

    .line 199
    .line 200
    :cond_4
    new-instance v7, La/ye7;

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const/4 v14, 0x3

    .line 204
    const/4 v8, 0x1

    .line 205
    const-class v10, La/gk7;

    .line 206
    .line 207
    const-string v11, "collectSideEffect"

    .line 208
    .line 209
    const-string v12, "collectSideEffect(Lorg/xplatform/bet_history/bet_sale/presentation/model/BetSaleSideEffect;)V"

    .line 210
    .line 211
    invoke-direct/range {v7 .. v14}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_5
    check-cast v7, La/jhy;

    .line 218
    .line 219
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 220
    .line 221
    sget-object v4, La/lkz;->a:La/lkz;

    .line 222
    .line 223
    invoke-static {v7, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    or-int/2addr v4, v7

    .line 236
    const/4 v13, 0x3

    .line 237
    invoke-virtual {v1, v13}, La/fet;->e(I)Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    or-int/2addr v4, v7

    .line 242
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    or-int/2addr v4, v7

    .line 247
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    if-nez v4, :cond_6

    .line 252
    .line 253
    if-ne v7, v15, :cond_7

    .line 254
    .line 255
    :cond_6
    new-instance v7, La/ua7;

    .line 256
    .line 257
    const/4 v11, 0x0

    .line 258
    const/4 v12, 0x1

    .line 259
    move-object v8, v3

    .line 260
    invoke-direct/range {v7 .. v12}, La/ua7;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 267
    .line 268
    invoke-static {v1, v9, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 269
    .line 270
    .line 271
    iget-object v3, v9, La/gk7;->L1:La/khf0;

    .line 272
    .line 273
    sget-object v4, La/gk7;->V1:[La/iiy;

    .line 274
    .line 275
    aget-object v4, v4, v5

    .line 276
    .line 277
    invoke-virtual {v3, v9, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 282
    .line 283
    invoke-interface {v3}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;->p0()La/k77;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    const/4 v4, 0x6

    .line 292
    if-eqz v3, :cond_13

    .line 293
    .line 294
    if-eq v3, v5, :cond_10

    .line 295
    .line 296
    if-eq v3, v6, :cond_d

    .line 297
    .line 298
    if-eq v3, v13, :cond_a

    .line 299
    .line 300
    const v3, 0x5f20b194

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 304
    .line 305
    .line 306
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 307
    .line 308
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, La/pl7;

    .line 313
    .line 314
    invoke-virtual {v9}, La/gk7;->I0()La/k3t0;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    if-nez v6, :cond_8

    .line 327
    .line 328
    if-ne v7, v15, :cond_9

    .line 329
    .line 330
    :cond_8
    new-instance v16, La/ye7;

    .line 331
    .line 332
    const/16 v22, 0x0

    .line 333
    .line 334
    const/16 v23, 0x8

    .line 335
    .line 336
    const/16 v17, 0x1

    .line 337
    .line 338
    const-class v19, La/k3t0;

    .line 339
    .line 340
    const-string v20, "onAction"

    .line 341
    .line 342
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 343
    .line 344
    move-object/from16 v18, v5

    .line 345
    .line 346
    invoke-direct/range {v16 .. v23}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 347
    .line 348
    .line 349
    move-object/from16 v7, v16

    .line 350
    .line 351
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_9
    check-cast v7, La/jhy;

    .line 355
    .line 356
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 357
    .line 358
    invoke-static {v3, v0, v7, v1, v4}, La/l7x;->y(La/mm40;La/pl7;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 362
    .line 363
    .line 364
    goto/16 :goto_4

    .line 365
    .line 366
    :cond_a
    const v3, 0x5f0e940d

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 370
    .line 371
    .line 372
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 373
    .line 374
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    check-cast v0, La/pl7;

    .line 379
    .line 380
    invoke-virtual {v9}, La/gk7;->I0()La/k3t0;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    if-nez v6, :cond_b

    .line 393
    .line 394
    if-ne v7, v15, :cond_c

    .line 395
    .line 396
    :cond_b
    new-instance v16, La/ye7;

    .line 397
    .line 398
    const/16 v22, 0x0

    .line 399
    .line 400
    const/16 v23, 0x4

    .line 401
    .line 402
    const/16 v17, 0x1

    .line 403
    .line 404
    const-class v19, La/k3t0;

    .line 405
    .line 406
    const-string v20, "onAction"

    .line 407
    .line 408
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 409
    .line 410
    move-object/from16 v18, v5

    .line 411
    .line 412
    invoke-direct/range {v16 .. v23}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 413
    .line 414
    .line 415
    move-object/from16 v7, v16

    .line 416
    .line 417
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    :cond_c
    check-cast v7, La/jhy;

    .line 421
    .line 422
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 423
    .line 424
    invoke-static {v3, v0, v7, v1, v4}, La/kkb;->e(La/mm40;La/pl7;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 428
    .line 429
    .line 430
    goto/16 :goto_4

    .line 431
    .line 432
    :cond_d
    const v3, 0x5f1c6ec4

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 436
    .line 437
    .line 438
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 439
    .line 440
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    check-cast v0, La/pl7;

    .line 445
    .line 446
    invoke-virtual {v9}, La/gk7;->I0()La/k3t0;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v6

    .line 454
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v7

    .line 458
    if-nez v6, :cond_e

    .line 459
    .line 460
    if-ne v7, v15, :cond_f

    .line 461
    .line 462
    :cond_e
    new-instance v16, La/ye7;

    .line 463
    .line 464
    const/16 v22, 0x0

    .line 465
    .line 466
    const/16 v23, 0x7

    .line 467
    .line 468
    const/16 v17, 0x1

    .line 469
    .line 470
    const-class v19, La/k3t0;

    .line 471
    .line 472
    const-string v20, "onAction"

    .line 473
    .line 474
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 475
    .line 476
    move-object/from16 v18, v5

    .line 477
    .line 478
    invoke-direct/range {v16 .. v23}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 479
    .line 480
    .line 481
    move-object/from16 v7, v16

    .line 482
    .line 483
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    :cond_f
    check-cast v7, La/jhy;

    .line 487
    .line 488
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 489
    .line 490
    invoke-static {v3, v0, v7, v1, v4}, La/r7x;->e(La/mm40;La/pl7;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 494
    .line 495
    .line 496
    goto/16 :goto_4

    .line 497
    .line 498
    :cond_10
    const v3, 0x5f17a606

    .line 499
    .line 500
    .line 501
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 502
    .line 503
    .line 504
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 505
    .line 506
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    check-cast v0, La/pl7;

    .line 511
    .line 512
    invoke-virtual {v9}, La/gk7;->I0()La/k3t0;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v6

    .line 520
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    if-nez v6, :cond_11

    .line 525
    .line 526
    if-ne v7, v15, :cond_12

    .line 527
    .line 528
    :cond_11
    new-instance v16, La/ye7;

    .line 529
    .line 530
    const/16 v22, 0x0

    .line 531
    .line 532
    const/16 v23, 0x6

    .line 533
    .line 534
    const/16 v17, 0x1

    .line 535
    .line 536
    const-class v19, La/k3t0;

    .line 537
    .line 538
    const-string v20, "onAction"

    .line 539
    .line 540
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 541
    .line 542
    move-object/from16 v18, v5

    .line 543
    .line 544
    invoke-direct/range {v16 .. v23}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 545
    .line 546
    .line 547
    move-object/from16 v7, v16

    .line 548
    .line 549
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    :cond_12
    check-cast v7, La/jhy;

    .line 553
    .line 554
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 555
    .line 556
    invoke-static {v3, v0, v7, v1, v4}, La/aem0;->h(La/mm40;La/pl7;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 560
    .line 561
    .line 562
    goto :goto_4

    .line 563
    :cond_13
    const v3, 0x5f131db4

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 567
    .line 568
    .line 569
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 570
    .line 571
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    check-cast v0, La/pl7;

    .line 576
    .line 577
    invoke-virtual {v9}, La/gk7;->I0()La/k3t0;

    .line 578
    .line 579
    .line 580
    move-result-object v5

    .line 581
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v6

    .line 585
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v7

    .line 589
    if-nez v6, :cond_14

    .line 590
    .line 591
    if-ne v7, v15, :cond_15

    .line 592
    .line 593
    :cond_14
    new-instance v16, La/ye7;

    .line 594
    .line 595
    const/16 v22, 0x0

    .line 596
    .line 597
    const/16 v23, 0x5

    .line 598
    .line 599
    const/16 v17, 0x1

    .line 600
    .line 601
    const-class v19, La/k3t0;

    .line 602
    .line 603
    const-string v20, "onAction"

    .line 604
    .line 605
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 606
    .line 607
    move-object/from16 v18, v5

    .line 608
    .line 609
    invoke-direct/range {v16 .. v23}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 610
    .line 611
    .line 612
    move-object/from16 v7, v16

    .line 613
    .line 614
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    :cond_15
    check-cast v7, La/jhy;

    .line 618
    .line 619
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 620
    .line 621
    invoke-static {v3, v0, v7, v1, v4}, La/l7x;->y(La/mm40;La/pl7;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 625
    .line 626
    .line 627
    goto :goto_4

    .line 628
    :cond_16
    invoke-virtual {v1}, La/fet;->X()V

    .line 629
    .line 630
    .line 631
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    return-object v0

    .line 634
    nop

    .line 635
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
