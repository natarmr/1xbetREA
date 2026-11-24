.class public final synthetic La/v1x;
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
    iput-byte p1, p0, La/v1x;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/v1x;->a:B

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
    iget-byte v0, v0, La/v1x;->a:B

    .line 4
    .line 5
    const v1, 0x7f0a0bed

    .line 6
    .line 7
    .line 8
    const v2, 0x7f0a07a8

    .line 9
    .line 10
    .line 11
    const v3, 0x7f0a0fce

    .line 12
    .line 13
    .line 14
    const v4, 0x7f0a0730

    .line 15
    .line 16
    .line 17
    const-string v5, "rootView"

    .line 18
    .line 19
    const v6, 0x7f0a1302

    .line 20
    .line 21
    .line 22
    const v7, 0x7f0a0a34

    .line 23
    .line 24
    .line 25
    const v8, 0x7f0a0a33

    .line 26
    .line 27
    .line 28
    const v9, 0x7f0a0783

    .line 29
    .line 30
    .line 31
    const/4 v10, 0x1

    .line 32
    const-string v11, "Missing required view with ID: "

    .line 33
    .line 34
    const/4 v12, 0x0

    .line 35
    const/4 v13, 0x0

    .line 36
    packed-switch v0, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    move-object/from16 v0, p1

    .line 40
    .line 41
    check-cast v0, Landroid/view/LayoutInflater;

    .line 42
    .line 43
    move-object/from16 v1, p2

    .line 44
    .line 45
    check-cast v1, Landroid/view/ViewGroup;

    .line 46
    .line 47
    const v2, 0x7f0d0517

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const v1, 0x7f0a0119

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesCollection;

    .line 62
    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    const v1, 0x7f0a06e3

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 73
    .line 74
    if-eqz v3, :cond_0

    .line 75
    .line 76
    new-instance v12, La/r7b0;

    .line 77
    .line 78
    check-cast v0, Landroid/widget/LinearLayout;

    .line 79
    .line 80
    invoke-direct {v12, v0, v2, v3}, La/r7b0;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/ui_core/viewcomponents/views/large_banner_games_collection/LargeBannerGamesCollection;Lorg/xplatform/uikit/components/header/DsHeader;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    return-object v12

    .line 100
    :pswitch_0
    move-object/from16 v0, p1

    .line 101
    .line 102
    check-cast v0, La/rvy;

    .line 103
    .line 104
    move-object/from16 v1, p2

    .line 105
    .line 106
    check-cast v1, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_1
    move-object/from16 v0, p1

    .line 115
    .line 116
    check-cast v0, Landroid/view/LayoutInflater;

    .line 117
    .line 118
    move-object/from16 v1, p2

    .line 119
    .line 120
    check-cast v1, Landroid/view/ViewGroup;

    .line 121
    .line 122
    const v2, 0x7f0d03d3

    .line 123
    .line 124
    .line 125
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const v1, 0x7f0a0347

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 137
    .line 138
    if-eqz v2, :cond_1

    .line 139
    .line 140
    const v1, 0x7f0a03cb

    .line 141
    .line 142
    .line 143
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 148
    .line 149
    if-eqz v3, :cond_1

    .line 150
    .line 151
    const v1, 0x7f0a0d78

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 159
    .line 160
    if-eqz v4, :cond_1

    .line 161
    .line 162
    new-instance v12, La/vvx;

    .line 163
    .line 164
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 165
    .line 166
    invoke-direct {v12, v0, v2, v3}, La/vvx;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;)V

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :goto_1
    return-object v12

    .line 186
    :pswitch_2
    move-object/from16 v0, p1

    .line 187
    .line 188
    check-cast v0, La/fet;

    .line 189
    .line 190
    move-object/from16 v1, p2

    .line 191
    .line 192
    check-cast v1, Ljava/lang/Integer;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-static {v10}, La/x8x;->L(I)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-static {v1, v0}, La/zgc;->x(ILa/fet;)V

    .line 202
    .line 203
    .line 204
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_3
    move-object/from16 v0, p1

    .line 208
    .line 209
    check-cast v0, Ljava/lang/Throwable;

    .line 210
    .line 211
    move-object/from16 v1, p2

    .line 212
    .line 213
    check-cast v1, Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object v0

    .line 224
    :pswitch_4
    move-object/from16 v0, p1

    .line 225
    .line 226
    check-cast v0, Ljava/lang/Throwable;

    .line 227
    .line 228
    move-object/from16 v1, p2

    .line 229
    .line 230
    check-cast v1, Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_5
    move-object/from16 v0, p1

    .line 242
    .line 243
    check-cast v0, Ljava/lang/Throwable;

    .line 244
    .line 245
    move-object/from16 v1, p2

    .line 246
    .line 247
    check-cast v1, Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_6
    move-object/from16 v0, p1

    .line 259
    .line 260
    check-cast v0, La/ql5;

    .line 261
    .line 262
    move-object/from16 v1, p2

    .line 263
    .line 264
    check-cast v1, La/ql5;

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-wide v2, v0, La/ql5;->a:J

    .line 273
    .line 274
    iget-wide v0, v1, La/ql5;->a:J

    .line 275
    .line 276
    cmp-long v0, v2, v0

    .line 277
    .line 278
    if-nez v0, :cond_2

    .line 279
    .line 280
    goto :goto_2

    .line 281
    :cond_2
    move v10, v13

    .line 282
    :goto_2
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    return-object v0

    .line 287
    :pswitch_7
    move-object/from16 v0, p1

    .line 288
    .line 289
    check-cast v0, Ljava/lang/Throwable;

    .line 290
    .line 291
    move-object/from16 v1, p2

    .line 292
    .line 293
    check-cast v1, Ljava/lang/String;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object v0

    .line 304
    :pswitch_8
    move-object/from16 v0, p1

    .line 305
    .line 306
    check-cast v0, La/ql5;

    .line 307
    .line 308
    move-object/from16 v1, p2

    .line 309
    .line 310
    check-cast v1, La/ql5;

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iget-wide v2, v0, La/ql5;->a:J

    .line 319
    .line 320
    iget-wide v0, v1, La/ql5;->a:J

    .line 321
    .line 322
    cmp-long v0, v2, v0

    .line 323
    .line 324
    if-nez v0, :cond_3

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_3
    move v10, v13

    .line 328
    :goto_3
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    return-object v0

    .line 333
    :pswitch_9
    move-object/from16 v0, p1

    .line 334
    .line 335
    check-cast v0, Landroid/view/LayoutInflater;

    .line 336
    .line 337
    move-object/from16 v1, p2

    .line 338
    .line 339
    check-cast v1, Landroid/view/ViewGroup;

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-static {v0, v1}, La/vjd;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/vjd;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    return-object v0

    .line 352
    :pswitch_a
    move-object/from16 v0, p1

    .line 353
    .line 354
    check-cast v0, Landroid/view/LayoutInflater;

    .line 355
    .line 356
    move-object/from16 v1, p2

    .line 357
    .line 358
    check-cast v1, Landroid/view/ViewGroup;

    .line 359
    .line 360
    const v2, 0x7f0d0454

    .line 361
    .line 362
    .line 363
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    if-eqz v0, :cond_4

    .line 368
    .line 369
    check-cast v0, Landroid/widget/TextView;

    .line 370
    .line 371
    new-instance v12, La/yxx;

    .line 372
    .line 373
    invoke-direct {v12, v0, v0}, La/yxx;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 374
    .line 375
    .line 376
    goto :goto_4

    .line 377
    :cond_4
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :goto_4
    return-object v12

    .line 381
    :pswitch_b
    move-object/from16 v0, p1

    .line 382
    .line 383
    check-cast v0, Landroid/view/LayoutInflater;

    .line 384
    .line 385
    move-object/from16 v1, p2

    .line 386
    .line 387
    check-cast v1, Landroid/view/ViewGroup;

    .line 388
    .line 389
    const v2, 0x7f0d03d2

    .line 390
    .line 391
    .line 392
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    const v1, 0x7f0a07e2

    .line 397
    .line 398
    .line 399
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    check-cast v2, Landroid/widget/TextView;

    .line 404
    .line 405
    if-eqz v2, :cond_5

    .line 406
    .line 407
    new-instance v12, La/uvx;

    .line 408
    .line 409
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 410
    .line 411
    invoke-direct {v12, v0, v2}, La/uvx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V

    .line 412
    .line 413
    .line 414
    goto :goto_5

    .line 415
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    :goto_5
    return-object v12

    .line 431
    :pswitch_c
    move-object/from16 v0, p1

    .line 432
    .line 433
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 434
    .line 435
    move-object/from16 v1, p2

    .line 436
    .line 437
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 438
    .line 439
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    new-instance v2, La/h7w;

    .line 446
    .line 447
    const/16 v3, 0x1b

    .line 448
    .line 449
    invoke-direct {v2, v3}, La/h7w;-><init>(B)V

    .line 450
    .line 451
    .line 452
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    new-instance v0, La/qgx;

    .line 456
    .line 457
    invoke-direct {v0, v10}, La/qgx;-><init>(B)V

    .line 458
    .line 459
    .line 460
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    return-object v0

    .line 466
    :pswitch_d
    move-object/from16 v0, p1

    .line 467
    .line 468
    check-cast v0, Ljava/lang/Integer;

    .line 469
    .line 470
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    move-object/from16 v0, p2

    .line 474
    .line 475
    check-cast v0, La/zgx;

    .line 476
    .line 477
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    iget-object v0, v0, La/zgx;->c:Ljava/lang/String;

    .line 481
    .line 482
    return-object v0

    .line 483
    :pswitch_e
    move-object/from16 v0, p1

    .line 484
    .line 485
    check-cast v0, La/fet;

    .line 486
    .line 487
    move-object/from16 v1, p2

    .line 488
    .line 489
    check-cast v1, Ljava/lang/Integer;

    .line 490
    .line 491
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    invoke-static {v10}, La/x8x;->L(I)I

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    invoke-static {v1, v0}, La/uc9;->H(ILa/fet;)V

    .line 499
    .line 500
    .line 501
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 502
    .line 503
    return-object v0

    .line 504
    :pswitch_f
    move-object/from16 v0, p1

    .line 505
    .line 506
    check-cast v0, Ljava/lang/Throwable;

    .line 507
    .line 508
    move-object/from16 v0, p2

    .line 509
    .line 510
    check-cast v0, Ljava/lang/String;

    .line 511
    .line 512
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object v0

    .line 515
    :pswitch_10
    move-object/from16 v0, p1

    .line 516
    .line 517
    check-cast v0, Ljava/lang/Throwable;

    .line 518
    .line 519
    move-object/from16 v1, p2

    .line 520
    .line 521
    check-cast v1, Ljava/lang/String;

    .line 522
    .line 523
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    return-object v0

    .line 532
    :pswitch_11
    move-object/from16 v0, p1

    .line 533
    .line 534
    check-cast v0, Ljava/lang/Throwable;

    .line 535
    .line 536
    move-object/from16 v1, p2

    .line 537
    .line 538
    check-cast v1, Ljava/lang/String;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object v0

    .line 549
    :pswitch_12
    move-object/from16 v0, p1

    .line 550
    .line 551
    check-cast v0, Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    move-object/from16 v1, p2

    .line 557
    .line 558
    check-cast v1, La/jax;

    .line 559
    .line 560
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    invoke-interface {v1}, La/jax;->getType()La/dja;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    new-instance v2, Lkotlin/Pair;

    .line 568
    .line 569
    invoke-direct {v2, v1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 570
    .line 571
    .line 572
    return-object v2

    .line 573
    :pswitch_13
    move-object/from16 v0, p1

    .line 574
    .line 575
    check-cast v0, Landroid/view/LayoutInflater;

    .line 576
    .line 577
    move-object/from16 v1, p2

    .line 578
    .line 579
    check-cast v1, Landroid/view/ViewGroup;

    .line 580
    .line 581
    const v2, 0x7f0d03d0

    .line 582
    .line 583
    .line 584
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    move-object v1, v0

    .line 589
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 590
    .line 591
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    check-cast v2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 596
    .line 597
    if-eqz v2, :cond_6

    .line 598
    .line 599
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 600
    .line 601
    .line 602
    move-result-object v4

    .line 603
    check-cast v4, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 604
    .line 605
    if-eqz v4, :cond_7

    .line 606
    .line 607
    new-instance v12, La/rvx;

    .line 608
    .line 609
    invoke-direct {v12, v1, v2, v4}, La/rvx;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 610
    .line 611
    .line 612
    goto :goto_6

    .line 613
    :cond_6
    move v3, v4

    .line 614
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    :goto_6
    return-object v12

    .line 630
    :pswitch_14
    move-object/from16 v0, p1

    .line 631
    .line 632
    check-cast v0, Landroid/view/LayoutInflater;

    .line 633
    .line 634
    move-object/from16 v1, p2

    .line 635
    .line 636
    check-cast v1, Landroid/view/ViewGroup;

    .line 637
    .line 638
    const v2, 0x7f0d03d1

    .line 639
    .line 640
    .line 641
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    if-eqz v0, :cond_8

    .line 646
    .line 647
    check-cast v0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 648
    .line 649
    new-instance v12, La/svx;

    .line 650
    .line 651
    invoke-direct {v12, v0, v0}, La/svx;-><init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;)V

    .line 652
    .line 653
    .line 654
    goto :goto_7

    .line 655
    :cond_8
    invoke-static {v5}, La/hny;->u(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    :goto_7
    return-object v12

    .line 659
    :pswitch_15
    move-object/from16 v0, p1

    .line 660
    .line 661
    check-cast v0, Landroid/view/LayoutInflater;

    .line 662
    .line 663
    move-object/from16 v1, p2

    .line 664
    .line 665
    check-cast v1, Landroid/view/ViewGroup;

    .line 666
    .line 667
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    invoke-static {v0, v1}, La/bzx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/bzx;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    return-object v0

    .line 678
    :pswitch_16
    move-object/from16 v0, p1

    .line 679
    .line 680
    check-cast v0, Landroid/view/LayoutInflater;

    .line 681
    .line 682
    move-object/from16 v1, p2

    .line 683
    .line 684
    check-cast v1, Landroid/view/ViewGroup;

    .line 685
    .line 686
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-static {v0, v1}, La/wxx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/wxx;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    return-object v0

    .line 697
    :pswitch_17
    move-object/from16 v0, p1

    .line 698
    .line 699
    check-cast v0, Landroid/view/LayoutInflater;

    .line 700
    .line 701
    move-object/from16 v1, p2

    .line 702
    .line 703
    check-cast v1, Landroid/view/ViewGroup;

    .line 704
    .line 705
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    invoke-static {v0, v1}, La/bwx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/bwx;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    return-object v0

    .line 716
    :pswitch_18
    move-object/from16 v0, p1

    .line 717
    .line 718
    check-cast v0, Landroid/view/LayoutInflater;

    .line 719
    .line 720
    move-object/from16 v1, p2

    .line 721
    .line 722
    check-cast v1, Landroid/view/ViewGroup;

    .line 723
    .line 724
    const v2, 0x7f0d03a8

    .line 725
    .line 726
    .line 727
    invoke-static {v0, v1, v2, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    move-object v1, v0

    .line 732
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 733
    .line 734
    const v2, 0x7f0a0427

    .line 735
    .line 736
    .line 737
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    check-cast v5, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 742
    .line 743
    if-eqz v5, :cond_a

    .line 744
    .line 745
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    check-cast v2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 750
    .line 751
    if-eqz v2, :cond_9

    .line 752
    .line 753
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 754
    .line 755
    .line 756
    move-result-object v4

    .line 757
    check-cast v4, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 758
    .line 759
    if-eqz v4, :cond_b

    .line 760
    .line 761
    new-instance v12, La/eux;

    .line 762
    .line 763
    invoke-direct {v12, v1, v5, v2, v4}, La/eux;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 764
    .line 765
    .line 766
    goto :goto_9

    .line 767
    :cond_9
    move v3, v4

    .line 768
    goto :goto_8

    .line 769
    :cond_a
    move v3, v2

    .line 770
    :cond_b
    :goto_8
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    :goto_9
    return-object v12

    .line 786
    :pswitch_19
    move-object/from16 v0, p1

    .line 787
    .line 788
    check-cast v0, Landroid/view/LayoutInflater;

    .line 789
    .line 790
    move-object/from16 v1, p2

    .line 791
    .line 792
    check-cast v1, Landroid/view/ViewGroup;

    .line 793
    .line 794
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    invoke-static {v0, v1}, La/wtx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/wtx;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    return-object v0

    .line 805
    :pswitch_1a
    move-object/from16 v0, p1

    .line 806
    .line 807
    check-cast v0, Landroid/view/LayoutInflater;

    .line 808
    .line 809
    move-object/from16 v3, p2

    .line 810
    .line 811
    check-cast v3, Landroid/view/ViewGroup;

    .line 812
    .line 813
    const v4, 0x7f0d010c

    .line 814
    .line 815
    .line 816
    invoke-static {v0, v3, v4, v3, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    move-object v15, v3

    .line 825
    check-cast v15, Landroid/widget/ImageView;

    .line 826
    .line 827
    if-eqz v15, :cond_10

    .line 828
    .line 829
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 830
    .line 831
    .line 832
    move-result-object v3

    .line 833
    move-object/from16 v16, v3

    .line 834
    .line 835
    check-cast v16, Landroidx/appcompat/widget/AppCompatImageView;

    .line 836
    .line 837
    if-eqz v16, :cond_f

    .line 838
    .line 839
    invoke-static {v0, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    move-object/from16 v17, v2

    .line 844
    .line 845
    check-cast v17, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 846
    .line 847
    if-eqz v17, :cond_e

    .line 848
    .line 849
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    move-object/from16 v18, v2

    .line 854
    .line 855
    check-cast v18, Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 856
    .line 857
    if-eqz v18, :cond_d

    .line 858
    .line 859
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 860
    .line 861
    .line 862
    move-result-object v2

    .line 863
    move-object/from16 v19, v2

    .line 864
    .line 865
    check-cast v19, Landroidx/recyclerview/widget/RecyclerView;

    .line 866
    .line 867
    if-eqz v19, :cond_11

    .line 868
    .line 869
    invoke-static {v0, v6}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    move-object/from16 v20, v1

    .line 874
    .line 875
    check-cast v20, Landroid/widget/TextView;

    .line 876
    .line 877
    if-eqz v20, :cond_c

    .line 878
    .line 879
    new-instance v13, La/e2k;

    .line 880
    .line 881
    move-object v14, v0

    .line 882
    check-cast v14, Landroid/widget/LinearLayout;

    .line 883
    .line 884
    invoke-direct/range {v13 .. v20}, La/e2k;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;)V

    .line 885
    .line 886
    .line 887
    move-object v12, v13

    .line 888
    goto :goto_b

    .line 889
    :cond_c
    move v1, v6

    .line 890
    goto :goto_a

    .line 891
    :cond_d
    move v1, v7

    .line 892
    goto :goto_a

    .line 893
    :cond_e
    move v1, v8

    .line 894
    goto :goto_a

    .line 895
    :cond_f
    move v1, v2

    .line 896
    goto :goto_a

    .line 897
    :cond_10
    move v1, v9

    .line 898
    :cond_11
    :goto_a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    :goto_b
    return-object v12

    .line 914
    :pswitch_1b
    move-object/from16 v0, p1

    .line 915
    .line 916
    check-cast v0, Landroid/view/LayoutInflater;

    .line 917
    .line 918
    move-object/from16 v2, p2

    .line 919
    .line 920
    check-cast v2, Landroid/view/ViewGroup;

    .line 921
    .line 922
    const v3, 0x7f0d010b

    .line 923
    .line 924
    .line 925
    invoke-static {v0, v2, v3, v2, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    const v2, 0x7f0a0777

    .line 930
    .line 931
    .line 932
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    move-object v15, v3

    .line 937
    check-cast v15, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 938
    .line 939
    if-eqz v15, :cond_16

    .line 940
    .line 941
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 942
    .line 943
    .line 944
    move-result-object v2

    .line 945
    move-object/from16 v16, v2

    .line 946
    .line 947
    check-cast v16, Landroid/widget/ImageView;

    .line 948
    .line 949
    if-eqz v16, :cond_15

    .line 950
    .line 951
    invoke-static {v0, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 952
    .line 953
    .line 954
    move-result-object v2

    .line 955
    move-object/from16 v17, v2

    .line 956
    .line 957
    check-cast v17, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 958
    .line 959
    if-eqz v17, :cond_14

    .line 960
    .line 961
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    move-object/from16 v18, v2

    .line 966
    .line 967
    check-cast v18, Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 968
    .line 969
    if-eqz v18, :cond_13

    .line 970
    .line 971
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    move-object/from16 v19, v2

    .line 976
    .line 977
    check-cast v19, Landroidx/recyclerview/widget/RecyclerView;

    .line 978
    .line 979
    if-eqz v19, :cond_17

    .line 980
    .line 981
    const v1, 0x7f0a12f3

    .line 982
    .line 983
    .line 984
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 985
    .line 986
    .line 987
    move-result-object v2

    .line 988
    move-object/from16 v20, v2

    .line 989
    .line 990
    check-cast v20, Landroid/widget/TextView;

    .line 991
    .line 992
    if-eqz v20, :cond_17

    .line 993
    .line 994
    const v1, 0x7f0a12f7

    .line 995
    .line 996
    .line 997
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    move-object/from16 v21, v2

    .line 1002
    .line 1003
    check-cast v21, Landroid/widget/TextView;

    .line 1004
    .line 1005
    if-eqz v21, :cond_17

    .line 1006
    .line 1007
    invoke-static {v0, v6}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v1

    .line 1011
    move-object/from16 v22, v1

    .line 1012
    .line 1013
    check-cast v22, Landroid/widget/TextView;

    .line 1014
    .line 1015
    if-eqz v22, :cond_12

    .line 1016
    .line 1017
    new-instance v13, La/d2k;

    .line 1018
    .line 1019
    move-object v14, v0

    .line 1020
    check-cast v14, Landroid/widget/LinearLayout;

    .line 1021
    .line 1022
    invoke-direct/range {v13 .. v22}, La/d2k;-><init>(Landroid/widget/LinearLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1023
    .line 1024
    .line 1025
    move-object v12, v13

    .line 1026
    goto :goto_d

    .line 1027
    :cond_12
    move v1, v6

    .line 1028
    goto :goto_c

    .line 1029
    :cond_13
    move v1, v7

    .line 1030
    goto :goto_c

    .line 1031
    :cond_14
    move v1, v8

    .line 1032
    goto :goto_c

    .line 1033
    :cond_15
    move v1, v9

    .line 1034
    goto :goto_c

    .line 1035
    :cond_16
    move v1, v2

    .line 1036
    :cond_17
    :goto_c
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    :goto_d
    return-object v12

    .line 1052
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1053
    .line 1054
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1055
    .line 1056
    move-object/from16 v1, p2

    .line 1057
    .line 1058
    check-cast v1, Landroid/view/ViewGroup;

    .line 1059
    .line 1060
    const v3, 0x7f0d010a

    .line 1061
    .line 1062
    .line 1063
    invoke-static {v0, v1, v3, v1, v13}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    move-object v15, v1

    .line 1072
    check-cast v15, Landroid/widget/ImageView;

    .line 1073
    .line 1074
    if-eqz v15, :cond_1c

    .line 1075
    .line 1076
    const v1, 0x7f0a079c

    .line 1077
    .line 1078
    .line 1079
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v3

    .line 1083
    move-object/from16 v16, v3

    .line 1084
    .line 1085
    check-cast v16, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1086
    .line 1087
    if-eqz v16, :cond_1b

    .line 1088
    .line 1089
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v1

    .line 1093
    move-object/from16 v17, v1

    .line 1094
    .line 1095
    check-cast v17, Landroidx/appcompat/widget/AppCompatImageView;

    .line 1096
    .line 1097
    if-eqz v17, :cond_1d

    .line 1098
    .line 1099
    invoke-static {v0, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v1

    .line 1103
    move-object/from16 v18, v1

    .line 1104
    .line 1105
    check-cast v18, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1106
    .line 1107
    if-eqz v18, :cond_1a

    .line 1108
    .line 1109
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v1

    .line 1113
    move-object/from16 v19, v1

    .line 1114
    .line 1115
    check-cast v19, Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 1116
    .line 1117
    if-eqz v19, :cond_19

    .line 1118
    .line 1119
    const v2, 0x7f0a0b99

    .line 1120
    .line 1121
    .line 1122
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v1

    .line 1126
    move-object/from16 v20, v1

    .line 1127
    .line 1128
    check-cast v20, Landroid/widget/ImageView;

    .line 1129
    .line 1130
    if-eqz v20, :cond_1d

    .line 1131
    .line 1132
    invoke-static {v0, v6}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v1

    .line 1136
    move-object/from16 v21, v1

    .line 1137
    .line 1138
    check-cast v21, Landroid/widget/TextView;

    .line 1139
    .line 1140
    if-eqz v21, :cond_18

    .line 1141
    .line 1142
    new-instance v13, La/c2k;

    .line 1143
    .line 1144
    move-object v14, v0

    .line 1145
    check-cast v14, Landroid/widget/LinearLayout;

    .line 1146
    .line 1147
    invoke-direct/range {v13 .. v21}, La/c2k;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Lcom/google/android/material/imageview/ShapeableImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 1148
    .line 1149
    .line 1150
    move-object v12, v13

    .line 1151
    goto :goto_f

    .line 1152
    :cond_18
    move v2, v6

    .line 1153
    goto :goto_e

    .line 1154
    :cond_19
    move v2, v7

    .line 1155
    goto :goto_e

    .line 1156
    :cond_1a
    move v2, v8

    .line 1157
    goto :goto_e

    .line 1158
    :cond_1b
    move v2, v1

    .line 1159
    goto :goto_e

    .line 1160
    :cond_1c
    move v2, v9

    .line 1161
    :cond_1d
    :goto_e
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1174
    .line 1175
    .line 1176
    :goto_f
    return-object v12

    .line 1177
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
