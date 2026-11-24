.class public final synthetic La/bbl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gbl0;


# direct methods
.method public synthetic constructor <init>(La/gbl0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bbl0;->a:B

    iput-object p1, p0, La/bbl0;->b:La/gbl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bbl0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x21

    .line 6
    .line 7
    iget-object v0, v0, La/bbl0;->b:La/gbl0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    move-object/from16 v3, p2

    .line 17
    .line 18
    check-cast v3, Landroid/os/Bundle;

    .line 19
    .line 20
    sget-object v4, La/gbl0;->c2:La/lme0;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    if-gt v1, v2, :cond_0

    .line 31
    .line 32
    const-string v1, "KEY_LANDSCAPE_VIDEO_REQUEST"

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v3}, La/r6e;->x(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Landroid/os/Parcelable;

    .line 44
    .line 45
    :goto_0
    check-cast v1, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeVideoEvent;

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    instance-of v2, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeVideoEvent$Fullscreen;

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, La/gbl0;->J0()La/ncl0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sget-object v1, La/xqs;->b:La/xqs;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, La/ncl0;->C(La/xqs;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    instance-of v1, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeVideoEvent$Stop;

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, La/gbl0;->J0()La/ncl0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v1, La/xqs;->a:La/xqs;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, La/ncl0;->C(La/xqs;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_0
    move-object/from16 v1, p1

    .line 81
    .line 82
    check-cast v1, Ljava/lang/String;

    .line 83
    .line 84
    move-object/from16 v3, p2

    .line 85
    .line 86
    check-cast v3, Landroid/os/Bundle;

    .line 87
    .line 88
    sget-object v4, La/gbl0;->c2:La/lme0;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 97
    .line 98
    if-gt v1, v2, :cond_4

    .line 99
    .line 100
    const-string v1, "KEY_LANDSCAPE_ZONE_REQUEST"

    .line 101
    .line 102
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    invoke-static {v3}, La/e4e0;->l(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Landroid/os/Parcelable;

    .line 112
    .line 113
    :goto_2
    check-cast v1, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent;

    .line 114
    .line 115
    if-nez v1, :cond_5

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    instance-of v2, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Fullscreen;

    .line 119
    .line 120
    if-eqz v2, :cond_6

    .line 121
    .line 122
    invoke-virtual {v0}, La/gbl0;->J0()La/ncl0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget-object v1, La/xqs;->b:La/xqs;

    .line 127
    .line 128
    invoke-virtual {v0, v1}, La/ncl0;->C(La/xqs;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    instance-of v1, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingLandscapeZoneEvent$Stop;

    .line 133
    .line 134
    if-eqz v1, :cond_7

    .line 135
    .line 136
    invoke-virtual {v0}, La/gbl0;->J0()La/ncl0;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    sget-object v1, La/xqs;->a:La/xqs;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, La/ncl0;->C(La/xqs;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_1
    move-object/from16 v1, p1

    .line 149
    .line 150
    check-cast v1, Landroid/view/View;

    .line 151
    .line 152
    move-object/from16 v2, p2

    .line 153
    .line 154
    check-cast v2, Landroid/view/View;

    .line 155
    .line 156
    sget-object v3, La/gbl0;->c2:La/lme0;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, La/gbl0;->J0()La/ncl0;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    iget-object v4, v4, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 173
    .line 174
    invoke-virtual {v4}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBackgroundView()Landroid/widget/ImageView;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    iget-object v5, v5, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 187
    .line 188
    invoke-virtual {v5}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBackgroundView()Landroid/widget/ImageView;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    iget-object v6, v3, La/ncl0;->c:La/vzg0;

    .line 197
    .line 198
    iget-object v3, v3, La/ncl0;->S:La/p7m0;

    .line 199
    .line 200
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    check-cast v7, La/tcs;

    .line 205
    .line 206
    iget-object v7, v7, La/tcs;->f:Ljava/lang/Integer;

    .line 207
    .line 208
    if-nez v7, :cond_9

    .line 209
    .line 210
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    check-cast v7, La/tcs;

    .line 215
    .line 216
    iget-object v7, v7, La/tcs;->g:Ljava/lang/Integer;

    .line 217
    .line 218
    if-nez v7, :cond_9

    .line 219
    .line 220
    const-string v7, "KEY_BACKGROUND_HEIGHT"

    .line 221
    .line 222
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    invoke-virtual {v6, v7, v8}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    const-string v7, "KEY_BACKGROUND_WIDTH"

    .line 230
    .line 231
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    invoke-virtual {v6, v7, v8}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_8
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    move-object v7, v6

    .line 243
    check-cast v7, La/tcs;

    .line 244
    .line 245
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v14

    .line 249
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v15

    .line 253
    const/16 v16, 0x1f

    .line 254
    .line 255
    const/4 v8, 0x0

    .line 256
    const-wide/16 v9, 0x0

    .line 257
    .line 258
    const/4 v11, 0x0

    .line 259
    const/4 v12, 0x0

    .line 260
    const/4 v13, 0x0

    .line 261
    invoke-static/range {v7 .. v16}, La/tcs;->a(La/tcs;ZJLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)La/tcs;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    invoke-virtual {v3, v6, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    if-eqz v6, :cond_8

    .line 270
    .line 271
    :cond_9
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    iget-object v3, v3, La/z4r;->c:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 276
    .line 277
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    const v5, 0x7f070074

    .line 282
    .line 283
    .line 284
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    iget-object v6, v6, La/z4r;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 293
    .line 294
    sget-object v7, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 295
    .line 296
    invoke-static {v6}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    const/4 v7, 0x0

    .line 301
    const/4 v8, 0x2

    .line 302
    if-eqz v6, :cond_a

    .line 303
    .line 304
    iget-object v6, v6, La/xiv0;->a:La/uiv0;

    .line 305
    .line 306
    invoke-virtual {v6, v8}, La/uiv0;->i(I)La/pfx;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    if-eqz v6, :cond_a

    .line 311
    .line 312
    iget v6, v6, La/pfx;->d:I

    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_a
    move v6, v7

    .line 316
    :goto_4
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    invoke-virtual {v9, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    div-int/2addr v5, v8

    .line 325
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    iget-object v9, v8, La/z4r;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 330
    .line 331
    iget-object v8, v8, La/z4r;->e:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;

    .line 332
    .line 333
    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    sub-int/2addr v9, v10

    .line 342
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    instance-of v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 347
    .line 348
    if-eqz v10, :cond_b

    .line 349
    .line 350
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 351
    .line 352
    goto :goto_5

    .line 353
    :cond_b
    const/4 v8, 0x0

    .line 354
    :goto_5
    if-eqz v8, :cond_c

    .line 355
    .line 356
    iget v7, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 357
    .line 358
    :cond_c
    sub-int/2addr v9, v7

    .line 359
    sub-int/2addr v9, v4

    .line 360
    sub-int/2addr v9, v6

    .line 361
    sub-int/2addr v9, v5

    .line 362
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    iget-object v4, v4, La/z4r;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 367
    .line 368
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 369
    .line 370
    .line 371
    move-result v4

    .line 372
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    const v5, 0x7f0700a5

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    add-int/2addr v0, v4

    .line 384
    invoke-virtual {v3, v1, v2, v9, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->I(Landroid/view/View;Landroid/view/View;II)V

    .line 385
    .line 386
    .line 387
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    return-object v0

    .line 390
    :pswitch_2
    move-object/from16 v1, p1

    .line 391
    .line 392
    check-cast v1, Ljava/lang/Integer;

    .line 393
    .line 394
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v4

    .line 398
    move-object/from16 v5, p2

    .line 399
    .line 400
    check-cast v5, Ljava/util/List;

    .line 401
    .line 402
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 403
    .line 404
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0}, La/gbl0;->J0()La/ncl0;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    new-instance v2, La/mc0;

    .line 416
    .line 417
    const/16 v7, 0x8

    .line 418
    .line 419
    const/4 v6, 0x0

    .line 420
    invoke-direct/range {v2 .. v7}, La/mc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V

    .line 421
    .line 422
    .line 423
    const/4 v1, 0x3

    .line 424
    invoke-static {v0, v6, v6, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 425
    .line 426
    .line 427
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_3
    move-object/from16 v1, p1

    .line 431
    .line 432
    check-cast v1, Ljava/lang/Long;

    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 435
    .line 436
    .line 437
    move-result-wide v4

    .line 438
    move-object/from16 v1, p2

    .line 439
    .line 440
    check-cast v1, Ljava/lang/Boolean;

    .line 441
    .line 442
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 447
    .line 448
    invoke-virtual {v0}, La/gbl0;->J0()La/ncl0;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v3}, La/ncl0;->w()La/qz40;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    check-cast v0, La/p7m0;

    .line 457
    .line 458
    invoke-virtual {v0}, La/p7m0;->d()Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    check-cast v0, La/zqs;

    .line 467
    .line 468
    iget-object v1, v3, La/ncl0;->y:La/lhf0;

    .line 469
    .line 470
    if-eqz v0, :cond_d

    .line 471
    .line 472
    iget-wide v7, v0, La/zqs;->c:J

    .line 473
    .line 474
    goto :goto_6

    .line 475
    :cond_d
    const-wide/16 v7, 0x0

    .line 476
    .line 477
    :goto_6
    invoke-virtual {v1, v6, v7, v8}, La/lhf0;->N(ZJ)V

    .line 478
    .line 479
    .line 480
    iget-object v0, v3, La/ncl0;->i:La/i1w0;

    .line 481
    .line 482
    new-instance v2, La/sl1;

    .line 483
    .line 484
    const/16 v7, 0x10

    .line 485
    .line 486
    invoke-direct/range {v2 .. v7}, La/sl1;-><init>(Ljava/lang/Object;JZB)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v0, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 490
    .line 491
    .line 492
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 493
    .line 494
    return-object v0

    .line 495
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
