.class public final synthetic La/t4c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/t4c0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/t4c0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/t4c0;->a:B

    .line 4
    .line 5
    const v1, 0x7f0a0fd7

    .line 6
    .line 7
    .line 8
    const v2, 0x7f0a0109

    .line 9
    .line 10
    .line 11
    const v3, 0x7f0a1165

    .line 12
    .line 13
    .line 14
    const v4, 0x7f0a105d

    .line 15
    .line 16
    .line 17
    const v5, 0x7f0a0bb0

    .line 18
    .line 19
    .line 20
    const v6, 0x7f0a0300

    .line 21
    .line 22
    .line 23
    const v7, 0x7f0a01e1

    .line 24
    .line 25
    .line 26
    const v8, 0x7f0a0653

    .line 27
    .line 28
    .line 29
    const v9, 0x7f0a0730

    .line 30
    .line 31
    .line 32
    const v10, 0x7f0a09a4

    .line 33
    .line 34
    .line 35
    const-string v11, "rootView"

    .line 36
    .line 37
    const v12, 0x7f0a06e3

    .line 38
    .line 39
    .line 40
    const-string v14, "Missing required view with ID: "

    .line 41
    .line 42
    const/4 v15, 0x0

    .line 43
    const/16 p0, 0x1

    .line 44
    .line 45
    const/4 v13, 0x0

    .line 46
    packed-switch v0, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    move-object/from16 v0, p1

    .line 50
    .line 51
    check-cast v0, La/fet;

    .line 52
    .line 53
    move-object/from16 v1, p2

    .line 54
    .line 55
    check-cast v1, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static/range {p0 .. p0}, La/x8x;->L(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {v1, v0}, La/hmw0;->b(ILa/fet;)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_0
    move-object/from16 v0, p1

    .line 71
    .line 72
    check-cast v0, La/fet;

    .line 73
    .line 74
    move-object/from16 v1, p2

    .line 75
    .line 76
    check-cast v1, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static/range {p0 .. p0}, La/x8x;->L(I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v1, v0}, La/hmw0;->o(ILa/fet;)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_1
    move-object/from16 v0, p1

    .line 92
    .line 93
    check-cast v0, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-object/from16 v1, p2

    .line 99
    .line 100
    check-cast v1, La/p6t0;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_2
    move-object/from16 v0, p1

    .line 107
    .line 108
    check-cast v0, Ljava/lang/Throwable;

    .line 109
    .line 110
    move-object/from16 v1, p2

    .line 111
    .line 112
    check-cast v1, Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_3
    move-object/from16 v0, p1

    .line 124
    .line 125
    check-cast v0, La/fet;

    .line 126
    .line 127
    move-object/from16 v1, p2

    .line 128
    .line 129
    check-cast v1, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static/range {p0 .. p0}, La/x8x;->L(I)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    invoke-static {v1, v0}, La/vbw0;->J(ILa/fet;)V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_4
    move-object/from16 v0, p1

    .line 145
    .line 146
    check-cast v0, La/fet;

    .line 147
    .line 148
    move-object/from16 v1, p2

    .line 149
    .line 150
    check-cast v1, Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static/range {p0 .. p0}, La/x8x;->L(I)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-static {v1, v0}, La/vbw0;->I(ILa/fet;)V

    .line 160
    .line 161
    .line 162
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_5
    move-object/from16 v0, p1

    .line 166
    .line 167
    check-cast v0, Landroid/view/LayoutInflater;

    .line 168
    .line 169
    move-object/from16 v1, p2

    .line 170
    .line 171
    check-cast v1, Landroid/view/ViewGroup;

    .line 172
    .line 173
    const v2, 0x7f0d039f

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    move-object v2, v0

    .line 181
    check-cast v2, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 182
    .line 183
    const v1, 0x7f0a0427

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    move-object v4, v3

    .line 191
    check-cast v4, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 192
    .line 193
    if-eqz v4, :cond_0

    .line 194
    .line 195
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    move-object v5, v1

    .line 200
    check-cast v5, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 201
    .line 202
    if-eqz v5, :cond_1

    .line 203
    .line 204
    const v9, 0x7f0a0fce

    .line 205
    .line 206
    .line 207
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    move-object v6, v1

    .line 212
    check-cast v6, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 213
    .line 214
    if-eqz v6, :cond_1

    .line 215
    .line 216
    new-instance v1, La/xtx;

    .line 217
    .line 218
    move-object v3, v2

    .line 219
    invoke-direct/range {v1 .. v6}, La/xtx;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 220
    .line 221
    .line 222
    move-object v15, v1

    .line 223
    goto :goto_0

    .line 224
    :cond_0
    move v9, v1

    .line 225
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v0, v9}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :goto_0
    return-object v15

    .line 241
    :pswitch_6
    move-object/from16 v0, p1

    .line 242
    .line 243
    check-cast v0, La/fet;

    .line 244
    .line 245
    move-object/from16 v1, p2

    .line 246
    .line 247
    check-cast v1, Ljava/lang/Integer;

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-static/range {p0 .. p0}, La/x8x;->L(I)I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    invoke-static {v1, v0}, La/i4w0;->C(ILa/fet;)V

    .line 257
    .line 258
    .line 259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_7
    move-object/from16 v0, p1

    .line 263
    .line 264
    check-cast v0, La/fet;

    .line 265
    .line 266
    move-object/from16 v1, p2

    .line 267
    .line 268
    check-cast v1, Ljava/lang/Integer;

    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-static/range {p0 .. p0}, La/x8x;->L(I)I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    invoke-static {v1, v0}, La/i4w0;->u(ILa/fet;)V

    .line 278
    .line 279
    .line 280
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :pswitch_8
    move-object/from16 v0, p1

    .line 284
    .line 285
    check-cast v0, La/fet;

    .line 286
    .line 287
    move-object/from16 v1, p2

    .line 288
    .line 289
    check-cast v1, Ljava/lang/Integer;

    .line 290
    .line 291
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-static/range {p0 .. p0}, La/x8x;->L(I)I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    invoke-static {v1, v0}, La/i4w0;->t(ILa/fet;)V

    .line 299
    .line 300
    .line 301
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_9
    move-object/from16 v0, p1

    .line 305
    .line 306
    check-cast v0, La/wim;

    .line 307
    .line 308
    move-object/from16 v1, p2

    .line 309
    .line 310
    check-cast v1, Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object v0

    .line 318
    :pswitch_a
    move-object/from16 v0, p1

    .line 319
    .line 320
    check-cast v0, La/fet;

    .line 321
    .line 322
    move-object/from16 v1, p2

    .line 323
    .line 324
    check-cast v1, Ljava/lang/Integer;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-static/range {p0 .. p0}, La/x8x;->L(I)I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    invoke-static {v1, v0}, La/i4w0;->A(ILa/fet;)V

    .line 334
    .line 335
    .line 336
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_b
    move-object/from16 v0, p1

    .line 340
    .line 341
    check-cast v0, Landroid/view/LayoutInflater;

    .line 342
    .line 343
    move-object/from16 v1, p2

    .line 344
    .line 345
    check-cast v1, Landroid/view/ViewGroup;

    .line 346
    .line 347
    const v2, 0x7f0d0405

    .line 348
    .line 349
    .line 350
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    const v1, 0x7f0a0896

    .line 355
    .line 356
    .line 357
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    check-cast v2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 362
    .line 363
    if-eqz v2, :cond_2

    .line 364
    .line 365
    const v1, 0x7f0a0baa

    .line 366
    .line 367
    .line 368
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    check-cast v3, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 373
    .line 374
    if-eqz v3, :cond_2

    .line 375
    .line 376
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 377
    .line 378
    new-instance v15, La/ywx;

    .line 379
    .line 380
    invoke-direct {v15, v0, v2, v3}, La/ywx;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 381
    .line 382
    .line 383
    goto :goto_1

    .line 384
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    :goto_1
    return-object v15

    .line 400
    :pswitch_c
    move-object/from16 v0, p1

    .line 401
    .line 402
    check-cast v0, Ljava/lang/Throwable;

    .line 403
    .line 404
    move-object/from16 v0, p2

    .line 405
    .line 406
    check-cast v0, Ljava/lang/String;

    .line 407
    .line 408
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object v0

    .line 411
    :pswitch_d
    move-object/from16 v0, p1

    .line 412
    .line 413
    check-cast v0, Ljava/lang/Integer;

    .line 414
    .line 415
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 416
    .line 417
    .line 418
    move-object/from16 v0, p2

    .line 419
    .line 420
    check-cast v0, La/aec0;

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    iget-wide v0, v0, La/aec0;->a:J

    .line 426
    .line 427
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    return-object v0

    .line 432
    :pswitch_e
    move-object/from16 v0, p1

    .line 433
    .line 434
    check-cast v0, Ljava/lang/Integer;

    .line 435
    .line 436
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    move-object/from16 v0, p2

    .line 440
    .line 441
    check-cast v0, La/yrc0;

    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-interface {v0}, La/yrc0;->getId()J

    .line 447
    .line 448
    .line 449
    move-result-wide v0

    .line 450
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    return-object v0

    .line 455
    :pswitch_f
    move-object/from16 v0, p1

    .line 456
    .line 457
    check-cast v0, Ljava/lang/Throwable;

    .line 458
    .line 459
    move-object/from16 v1, p2

    .line 460
    .line 461
    check-cast v1, Ljava/lang/String;

    .line 462
    .line 463
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 464
    .line 465
    .line 466
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 467
    .line 468
    return-object v0

    .line 469
    :pswitch_10
    move-object/from16 v0, p1

    .line 470
    .line 471
    check-cast v0, Landroid/view/LayoutInflater;

    .line 472
    .line 473
    move-object/from16 v1, p2

    .line 474
    .line 475
    check-cast v1, Landroid/view/ViewGroup;

    .line 476
    .line 477
    const v2, 0x7f0d0121

    .line 478
    .line 479
    .line 480
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v0, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    check-cast v1, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 489
    .line 490
    if-eqz v1, :cond_4

    .line 491
    .line 492
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    check-cast v2, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 497
    .line 498
    if-eqz v2, :cond_3

    .line 499
    .line 500
    new-instance v15, La/v2k;

    .line 501
    .line 502
    check-cast v0, Landroid/widget/LinearLayout;

    .line 503
    .line 504
    invoke-direct {v15, v0, v1, v2}, La/v2k;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 505
    .line 506
    .line 507
    goto :goto_2

    .line 508
    :cond_3
    move v8, v12

    .line 509
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    :goto_2
    return-object v15

    .line 525
    :pswitch_11
    move-object/from16 v0, p1

    .line 526
    .line 527
    check-cast v0, Landroid/view/LayoutInflater;

    .line 528
    .line 529
    move-object/from16 v1, p2

    .line 530
    .line 531
    check-cast v1, Landroid/view/ViewGroup;

    .line 532
    .line 533
    const v2, 0x7f0d0122

    .line 534
    .line 535
    .line 536
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-static {v0, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    check-cast v1, Landroid/widget/LinearLayout;

    .line 545
    .line 546
    if-eqz v1, :cond_5

    .line 547
    .line 548
    new-instance v15, La/w2k;

    .line 549
    .line 550
    check-cast v0, Landroid/widget/LinearLayout;

    .line 551
    .line 552
    invoke-direct {v15, v0}, La/w2k;-><init>(Landroid/widget/LinearLayout;)V

    .line 553
    .line 554
    .line 555
    goto :goto_3

    .line 556
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v0, v10}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    :goto_3
    return-object v15

    .line 572
    :pswitch_12
    move-object/from16 v0, p1

    .line 573
    .line 574
    check-cast v0, Landroid/view/LayoutInflater;

    .line 575
    .line 576
    move-object/from16 v1, p2

    .line 577
    .line 578
    check-cast v1, Landroid/view/ViewGroup;

    .line 579
    .line 580
    const v2, 0x7f0d011f

    .line 581
    .line 582
    .line 583
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-static {v0, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    check-cast v1, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 592
    .line 593
    if-eqz v1, :cond_7

    .line 594
    .line 595
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    check-cast v2, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 600
    .line 601
    if-eqz v2, :cond_6

    .line 602
    .line 603
    new-instance v15, La/t2k;

    .line 604
    .line 605
    check-cast v0, Landroidx/cardview/widget/CardView;

    .line 606
    .line 607
    invoke-direct {v15, v0, v1, v2}, La/t2k;-><init>(Landroidx/cardview/widget/CardView;Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 608
    .line 609
    .line 610
    goto :goto_4

    .line 611
    :cond_6
    move v8, v12

    .line 612
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    :goto_4
    return-object v15

    .line 628
    :pswitch_13
    move-object/from16 v0, p1

    .line 629
    .line 630
    check-cast v0, Landroid/view/LayoutInflater;

    .line 631
    .line 632
    move-object/from16 v1, p2

    .line 633
    .line 634
    check-cast v1, Landroid/view/ViewGroup;

    .line 635
    .line 636
    const v2, 0x7f0d0120

    .line 637
    .line 638
    .line 639
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    if-eqz v0, :cond_8

    .line 644
    .line 645
    new-instance v15, La/u2k;

    .line 646
    .line 647
    check-cast v0, Landroidx/cardview/widget/CardView;

    .line 648
    .line 649
    invoke-direct {v15, v0}, La/u2k;-><init>(Landroidx/cardview/widget/CardView;)V

    .line 650
    .line 651
    .line 652
    goto :goto_5

    .line 653
    :cond_8
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    :goto_5
    return-object v15

    .line 657
    :pswitch_14
    move-object/from16 v0, p1

    .line 658
    .line 659
    check-cast v0, Landroid/view/LayoutInflater;

    .line 660
    .line 661
    move-object/from16 v1, p2

    .line 662
    .line 663
    check-cast v1, Landroid/view/ViewGroup;

    .line 664
    .line 665
    const v2, 0x7f0d011d

    .line 666
    .line 667
    .line 668
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    move-object/from16 v18, v1

    .line 677
    .line 678
    check-cast v18, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 679
    .line 680
    if-eqz v18, :cond_d

    .line 681
    .line 682
    invoke-static {v0, v6}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    move-object/from16 v19, v1

    .line 687
    .line 688
    check-cast v19, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 689
    .line 690
    if-eqz v19, :cond_c

    .line 691
    .line 692
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    move-object/from16 v20, v1

    .line 697
    .line 698
    check-cast v20, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 699
    .line 700
    if-eqz v20, :cond_b

    .line 701
    .line 702
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    move-object/from16 v21, v1

    .line 707
    .line 708
    check-cast v21, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;

    .line 709
    .line 710
    if-eqz v21, :cond_a

    .line 711
    .line 712
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    move-object/from16 v22, v1

    .line 717
    .line 718
    check-cast v22, Landroid/widget/TextView;

    .line 719
    .line 720
    if-eqz v22, :cond_9

    .line 721
    .line 722
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    check-cast v1, Landroid/widget/TextView;

    .line 727
    .line 728
    if-eqz v1, :cond_e

    .line 729
    .line 730
    new-instance v16, La/r2k;

    .line 731
    .line 732
    move-object/from16 v17, v0

    .line 733
    .line 734
    check-cast v17, Landroid/widget/LinearLayout;

    .line 735
    .line 736
    invoke-direct/range {v16 .. v22}, La/r2k;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/buttons/DsButton;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;Landroid/widget/TextView;)V

    .line 737
    .line 738
    .line 739
    move-object/from16 v15, v16

    .line 740
    .line 741
    goto :goto_7

    .line 742
    :cond_9
    move v3, v4

    .line 743
    goto :goto_6

    .line 744
    :cond_a
    move v3, v5

    .line 745
    goto :goto_6

    .line 746
    :cond_b
    move v3, v12

    .line 747
    goto :goto_6

    .line 748
    :cond_c
    move v3, v6

    .line 749
    goto :goto_6

    .line 750
    :cond_d
    move v3, v7

    .line 751
    :cond_e
    :goto_6
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    :goto_7
    return-object v15

    .line 767
    :pswitch_15
    move-object/from16 v0, p1

    .line 768
    .line 769
    check-cast v0, Landroid/view/LayoutInflater;

    .line 770
    .line 771
    move-object/from16 v3, p2

    .line 772
    .line 773
    check-cast v3, Landroid/view/ViewGroup;

    .line 774
    .line 775
    const v4, 0x7f0d011e

    .line 776
    .line 777
    .line 778
    invoke-static {v0, v3, v4, v3, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    check-cast v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 787
    .line 788
    if-eqz v3, :cond_10

    .line 789
    .line 790
    invoke-static {v0, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    check-cast v2, Landroid/widget/LinearLayout;

    .line 795
    .line 796
    if-eqz v2, :cond_f

    .line 797
    .line 798
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 799
    .line 800
    .line 801
    move-result-object v4

    .line 802
    check-cast v4, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 803
    .line 804
    if-eqz v4, :cond_11

    .line 805
    .line 806
    new-instance v15, La/s2k;

    .line 807
    .line 808
    check-cast v0, Landroid/widget/LinearLayout;

    .line 809
    .line 810
    invoke-direct {v15, v0, v3, v2, v4}, La/s2k;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 811
    .line 812
    .line 813
    goto :goto_9

    .line 814
    :cond_f
    move v1, v10

    .line 815
    goto :goto_8

    .line 816
    :cond_10
    move v1, v2

    .line 817
    :cond_11
    :goto_8
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    :goto_9
    return-object v15

    .line 833
    :pswitch_16
    move-object/from16 v0, p1

    .line 834
    .line 835
    check-cast v0, Landroid/view/LayoutInflater;

    .line 836
    .line 837
    move-object/from16 v1, p2

    .line 838
    .line 839
    check-cast v1, Landroid/view/ViewGroup;

    .line 840
    .line 841
    const v2, 0x7f0d0119

    .line 842
    .line 843
    .line 844
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    const v1, 0x7f0a0116

    .line 849
    .line 850
    .line 851
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    check-cast v2, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 856
    .line 857
    if-eqz v2, :cond_12

    .line 858
    .line 859
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 860
    .line 861
    .line 862
    move-result-object v1

    .line 863
    check-cast v1, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 864
    .line 865
    if-eqz v1, :cond_13

    .line 866
    .line 867
    const v9, 0x7f0a0a2b

    .line 868
    .line 869
    .line 870
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 871
    .line 872
    .line 873
    move-result-object v1

    .line 874
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 875
    .line 876
    if-eqz v1, :cond_13

    .line 877
    .line 878
    const v9, 0x7f0a0f62

    .line 879
    .line 880
    .line 881
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 886
    .line 887
    if-eqz v2, :cond_13

    .line 888
    .line 889
    new-instance v15, La/n2k;

    .line 890
    .line 891
    check-cast v0, Landroid/widget/FrameLayout;

    .line 892
    .line 893
    invoke-direct {v15, v0, v1, v2}, La/n2k;-><init>(Landroid/widget/FrameLayout;Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 894
    .line 895
    .line 896
    goto :goto_a

    .line 897
    :cond_12
    move v9, v1

    .line 898
    :cond_13
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    invoke-virtual {v0, v9}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    :goto_a
    return-object v15

    .line 914
    :pswitch_17
    move-object/from16 v0, p1

    .line 915
    .line 916
    check-cast v0, Landroid/view/LayoutInflater;

    .line 917
    .line 918
    move-object/from16 v1, p2

    .line 919
    .line 920
    check-cast v1, Landroid/view/ViewGroup;

    .line 921
    .line 922
    const v2, 0x7f0d011a

    .line 923
    .line 924
    .line 925
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    if-eqz v0, :cond_14

    .line 930
    .line 931
    check-cast v0, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;

    .line 932
    .line 933
    new-instance v15, La/o2k;

    .line 934
    .line 935
    invoke-direct {v15, v0, v0}, La/o2k;-><init>(Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;)V

    .line 936
    .line 937
    .line 938
    goto :goto_b

    .line 939
    :cond_14
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    :goto_b
    return-object v15

    .line 943
    :pswitch_18
    move-object/from16 v0, p1

    .line 944
    .line 945
    check-cast v0, Landroid/view/LayoutInflater;

    .line 946
    .line 947
    move-object/from16 v1, p2

    .line 948
    .line 949
    check-cast v1, Landroid/view/ViewGroup;

    .line 950
    .line 951
    const v2, 0x7f0d0124

    .line 952
    .line 953
    .line 954
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    if-eqz v0, :cond_15

    .line 959
    .line 960
    new-instance v15, La/y2k;

    .line 961
    .line 962
    check-cast v0, Landroid/widget/FrameLayout;

    .line 963
    .line 964
    invoke-direct {v15, v0}, La/y2k;-><init>(Landroid/widget/FrameLayout;)V

    .line 965
    .line 966
    .line 967
    goto :goto_c

    .line 968
    :cond_15
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    :goto_c
    return-object v15

    .line 972
    :pswitch_19
    move-object/from16 v0, p1

    .line 973
    .line 974
    check-cast v0, Landroid/view/LayoutInflater;

    .line 975
    .line 976
    move-object/from16 v1, p2

    .line 977
    .line 978
    check-cast v1, Landroid/view/ViewGroup;

    .line 979
    .line 980
    const v2, 0x7f0d011b

    .line 981
    .line 982
    .line 983
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    move-object/from16 v18, v1

    .line 992
    .line 993
    check-cast v18, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 994
    .line 995
    if-eqz v18, :cond_1a

    .line 996
    .line 997
    invoke-static {v0, v6}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    move-object/from16 v19, v1

    .line 1002
    .line 1003
    check-cast v19, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1004
    .line 1005
    if-eqz v19, :cond_19

    .line 1006
    .line 1007
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v1

    .line 1011
    move-object/from16 v20, v1

    .line 1012
    .line 1013
    check-cast v20, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1014
    .line 1015
    if-eqz v20, :cond_18

    .line 1016
    .line 1017
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v1

    .line 1021
    move-object/from16 v21, v1

    .line 1022
    .line 1023
    check-cast v21, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;

    .line 1024
    .line 1025
    if-eqz v21, :cond_17

    .line 1026
    .line 1027
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    move-object/from16 v22, v1

    .line 1032
    .line 1033
    check-cast v22, Landroid/widget/TextView;

    .line 1034
    .line 1035
    if-eqz v22, :cond_16

    .line 1036
    .line 1037
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v1

    .line 1041
    check-cast v1, Landroid/widget/TextView;

    .line 1042
    .line 1043
    if-eqz v1, :cond_1b

    .line 1044
    .line 1045
    new-instance v16, La/p2k;

    .line 1046
    .line 1047
    move-object/from16 v17, v0

    .line 1048
    .line 1049
    check-cast v17, Landroid/widget/LinearLayout;

    .line 1050
    .line 1051
    invoke-direct/range {v16 .. v22}, La/p2k;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/buttons/DsButton;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/header/DsHeader;Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;Landroid/widget/TextView;)V

    .line 1052
    .line 1053
    .line 1054
    move-object/from16 v15, v16

    .line 1055
    .line 1056
    goto :goto_e

    .line 1057
    :cond_16
    move v3, v4

    .line 1058
    goto :goto_d

    .line 1059
    :cond_17
    move v3, v5

    .line 1060
    goto :goto_d

    .line 1061
    :cond_18
    move v3, v12

    .line 1062
    goto :goto_d

    .line 1063
    :cond_19
    move v3, v6

    .line 1064
    goto :goto_d

    .line 1065
    :cond_1a
    move v3, v7

    .line 1066
    :cond_1b
    :goto_d
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v0

    .line 1074
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1079
    .line 1080
    .line 1081
    :goto_e
    return-object v15

    .line 1082
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1083
    .line 1084
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1085
    .line 1086
    move-object/from16 v3, p2

    .line 1087
    .line 1088
    check-cast v3, Landroid/view/ViewGroup;

    .line 1089
    .line 1090
    const v4, 0x7f0d011c

    .line 1091
    .line 1092
    .line 1093
    invoke-static {v0, v3, v4, v3, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v3

    .line 1101
    check-cast v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 1102
    .line 1103
    if-eqz v3, :cond_1d

    .line 1104
    .line 1105
    invoke-static {v0, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v2

    .line 1109
    check-cast v2, Landroid/widget/LinearLayout;

    .line 1110
    .line 1111
    if-eqz v2, :cond_1c

    .line 1112
    .line 1113
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v4

    .line 1117
    check-cast v4, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1118
    .line 1119
    if-eqz v4, :cond_1e

    .line 1120
    .line 1121
    new-instance v15, La/q2k;

    .line 1122
    .line 1123
    check-cast v0, Landroid/widget/LinearLayout;

    .line 1124
    .line 1125
    invoke-direct {v15, v0, v3, v2, v4}, La/q2k;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 1126
    .line 1127
    .line 1128
    goto :goto_10

    .line 1129
    :cond_1c
    move v1, v10

    .line 1130
    goto :goto_f

    .line 1131
    :cond_1d
    move v1, v2

    .line 1132
    :cond_1e
    :goto_f
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v0

    .line 1140
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v0

    .line 1144
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1145
    .line 1146
    .line 1147
    :goto_10
    return-object v15

    .line 1148
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1149
    .line 1150
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1151
    .line 1152
    move-object/from16 v1, p2

    .line 1153
    .line 1154
    check-cast v1, Landroid/view/ViewGroup;

    .line 1155
    .line 1156
    const v2, 0x7f0d0117

    .line 1157
    .line 1158
    .line 1159
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    check-cast v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 1168
    .line 1169
    if-eqz v1, :cond_1f

    .line 1170
    .line 1171
    const v12, 0x7f0a0af5

    .line 1172
    .line 1173
    .line 1174
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v1

    .line 1178
    check-cast v1, Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 1179
    .line 1180
    if-eqz v1, :cond_1f

    .line 1181
    .line 1182
    new-instance v15, La/l2k;

    .line 1183
    .line 1184
    check-cast v0, Landroid/widget/LinearLayout;

    .line 1185
    .line 1186
    invoke-direct {v15, v0, v1}, La/l2k;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;)V

    .line 1187
    .line 1188
    .line 1189
    goto :goto_11

    .line 1190
    :cond_1f
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    invoke-virtual {v0, v12}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1203
    .line 1204
    .line 1205
    :goto_11
    return-object v15

    .line 1206
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1207
    .line 1208
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1209
    .line 1210
    move-object/from16 v1, p2

    .line 1211
    .line 1212
    check-cast v1, Landroid/view/ViewGroup;

    .line 1213
    .line 1214
    const v2, 0x7f0d0118

    .line 1215
    .line 1216
    .line 1217
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    if-eqz v0, :cond_20

    .line 1222
    .line 1223
    new-instance v15, La/m2k;

    .line 1224
    .line 1225
    check-cast v0, Landroid/widget/LinearLayout;

    .line 1226
    .line 1227
    invoke-direct {v15, v0}, La/m2k;-><init>(Landroid/widget/LinearLayout;)V

    .line 1228
    .line 1229
    .line 1230
    goto :goto_12

    .line 1231
    :cond_20
    invoke-static {v11}, La/hny;->u(Ljava/lang/String;)V

    .line 1232
    .line 1233
    .line 1234
    :goto_12
    return-object v15

    .line 1235
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
