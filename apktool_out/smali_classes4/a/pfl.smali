.class public final synthetic La/pfl;
.super La/xo;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/pfl;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pfl;->h:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/high16 v3, 0x10000000

    .line 7
    .line 8
    const-string v4, "package:"

    .line 9
    .line 10
    const-string v5, "android.settings.action.MANAGE_OVERLAY_PERMISSION"

    .line 11
    .line 12
    const/16 v6, 0x8

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v0, v0, La/xo;->a:Ljava/lang/Object;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/om00;

    .line 25
    .line 26
    move-object/from16 v2, p2

    .line 27
    .line 28
    check-cast v2, La/yje;

    .line 29
    .line 30
    check-cast v0, La/yl00;

    .line 31
    .line 32
    sget-object v2, La/yl00;->n2:La/htz;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, La/yl00;->j2:La/phf0;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    instance-of v3, v1, La/lm00;

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    sget-object v1, La/yl00;->o2:[La/iiy;

    .line 46
    .line 47
    aget-object v3, v1, v8

    .line 48
    .line 49
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    aget-object v1, v1, v8

    .line 54
    .line 55
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    new-instance v4, Lkotlin/Pair;

    .line 62
    .line 63
    invoke-direct {v4, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {v1, v0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    instance-of v2, v1, La/nm00;

    .line 82
    .line 83
    if-eqz v2, :cond_1

    .line 84
    .line 85
    invoke-virtual {v0, v7}, La/yl00;->W0(Z)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    instance-of v2, v1, La/mm00;

    .line 90
    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 94
    .line 95
    .line 96
    iget-object v2, v0, La/yl00;->h2:La/ii;

    .line 97
    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 101
    .line 102
    const v3, 0x7f130162

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    check-cast v1, La/mm00;

    .line 110
    .line 111
    iget-object v12, v1, La/mm00;->a:Ljava/lang/String;

    .line 112
    .line 113
    const v1, 0x7f130e5d

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v13

    .line 120
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v19, La/n12;->b:La/n12;

    .line 124
    .line 125
    const/16 v20, 0x0

    .line 126
    .line 127
    const/16 v21, 0x5f8

    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/4 v15, 0x0

    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/16 v18, 0x0

    .line 136
    .line 137
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v2, v10, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 145
    .line 146
    .line 147
    :goto_0
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_2
    const-string v0, "actionDialogManager"

    .line 151
    .line 152
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v9

    .line 156
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 157
    .line 158
    .line 159
    :goto_1
    return-object v9

    .line 160
    :pswitch_0
    move-object/from16 v1, p1

    .line 161
    .line 162
    check-cast v1, Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    move-object/from16 v2, p2

    .line 169
    .line 170
    check-cast v2, La/yje;

    .line 171
    .line 172
    check-cast v0, La/uvz;

    .line 173
    .line 174
    sget-object v2, La/uvz;->P1:[La/iiy;

    .line 175
    .line 176
    invoke-virtual {v0}, La/uvz;->G0()La/y0r;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iget-object v0, v0, La/y0r;->c:La/nq8;

    .line 181
    .line 182
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 183
    .line 184
    check-cast v0, Landroid/widget/FrameLayout;

    .line 185
    .line 186
    if-eqz v1, :cond_4

    .line 187
    .line 188
    move v6, v8

    .line 189
    :cond_4
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object v0

    .line 195
    :pswitch_1
    move-object/from16 v1, p1

    .line 196
    .line 197
    check-cast v1, La/d500;

    .line 198
    .line 199
    move-object/from16 v2, p2

    .line 200
    .line 201
    check-cast v2, La/yje;

    .line 202
    .line 203
    check-cast v0, La/uvz;

    .line 204
    .line 205
    sget-object v2, La/uvz;->P1:[La/iiy;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    sget-object v2, La/b500;->a:La/b500;

    .line 211
    .line 212
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_5

    .line 217
    .line 218
    invoke-virtual {v0}, La/uvz;->G0()La/y0r;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    iget-object v1, v1, La/y0r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 223
    .line 224
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, La/uvz;->G0()La/y0r;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-object v0, v0, La/y0r;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 232
    .line 233
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_5
    instance-of v2, v1, La/c500;

    .line 238
    .line 239
    if-eqz v2, :cond_6

    .line 240
    .line 241
    invoke-virtual {v0}, La/uvz;->G0()La/y0r;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    iget-object v2, v2, La/y0r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 246
    .line 247
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0}, La/uvz;->G0()La/y0r;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    iget-object v0, v0, La/y0r;->b:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 255
    .line 256
    check-cast v1, La/c500;

    .line 257
    .line 258
    iget-object v1, v1, La/c500;->a:La/ra10;

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 264
    .line 265
    .line 266
    :goto_2
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 270
    .line 271
    .line 272
    :goto_3
    return-object v9

    .line 273
    :pswitch_2
    move-object/from16 v1, p1

    .line 274
    .line 275
    check-cast v1, Ljava/util/List;

    .line 276
    .line 277
    move-object/from16 v2, p2

    .line 278
    .line 279
    check-cast v2, La/yje;

    .line 280
    .line 281
    check-cast v0, La/uvz;

    .line 282
    .line 283
    sget-object v2, La/uvz;->P1:[La/iiy;

    .line 284
    .line 285
    iget-object v0, v0, La/uvz;->O1:La/n0o0;

    .line 286
    .line 287
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    check-cast v0, La/ezz;

    .line 292
    .line 293
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 294
    .line 295
    .line 296
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    return-object v0

    .line 299
    :pswitch_3
    move-object/from16 v1, p1

    .line 300
    .line 301
    check-cast v1, La/abx;

    .line 302
    .line 303
    move-object/from16 v2, p2

    .line 304
    .line 305
    check-cast v2, La/yje;

    .line 306
    .line 307
    check-cast v0, La/yax;

    .line 308
    .line 309
    sget-object v2, La/yax;->S1:La/art;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    if-eqz v1, :cond_7

    .line 315
    .line 316
    iget-boolean v0, v1, La/abx;->a:Z

    .line 317
    .line 318
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 319
    .line 320
    .line 321
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 325
    .line 326
    .line 327
    :goto_4
    return-object v9

    .line 328
    :pswitch_4
    move-object/from16 v1, p1

    .line 329
    .line 330
    check-cast v1, Ljava/lang/Throwable;

    .line 331
    .line 332
    move-object/from16 v2, p2

    .line 333
    .line 334
    check-cast v2, La/yje;

    .line 335
    .line 336
    check-cast v0, La/naw;

    .line 337
    .line 338
    invoke-virtual {v0, v1}, La/naw;->y(Ljava/lang/Throwable;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_5
    move-object/from16 v1, p1

    .line 345
    .line 346
    check-cast v1, La/p9w;

    .line 347
    .line 348
    move-object/from16 v2, p2

    .line 349
    .line 350
    check-cast v2, La/yje;

    .line 351
    .line 352
    check-cast v0, La/s1w;

    .line 353
    .line 354
    sget-object v2, La/s1w;->d2:La/bst;

    .line 355
    .line 356
    instance-of v1, v1, La/f9w;

    .line 357
    .line 358
    if-eqz v1, :cond_8

    .line 359
    .line 360
    invoke-virtual {v0}, La/s1w;->H0()La/ii;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 365
    .line 366
    const v3, 0x7f1304dc

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    const v4, 0x7f131087

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    const v5, 0x7f130042

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    const v6, 0x7f13032f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    sget-object v11, La/n12;->a:La/n12;

    .line 398
    .line 399
    const/4 v12, 0x0

    .line 400
    const/16 v13, 0x5d0

    .line 401
    .line 402
    const/4 v7, 0x0

    .line 403
    const-string v8, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY"

    .line 404
    .line 405
    const/4 v9, 0x0

    .line 406
    const/4 v10, 0x0

    .line 407
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v2, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 418
    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    return-object v0

    .line 427
    :pswitch_6
    move-object/from16 v1, p1

    .line 428
    .line 429
    check-cast v1, Ljava/lang/Throwable;

    .line 430
    .line 431
    move-object/from16 v2, p2

    .line 432
    .line 433
    check-cast v2, La/yje;

    .line 434
    .line 435
    move-object v2, v0

    .line 436
    check-cast v2, La/vuv;

    .line 437
    .line 438
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 442
    .line 443
    .line 444
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 445
    .line 446
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 447
    .line 448
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    iget-object v3, v2, La/i3t0;->f:La/oyg0;

    .line 456
    .line 457
    move-object v4, v0

    .line 458
    check-cast v4, La/guv;

    .line 459
    .line 460
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    const/4 v9, 0x0

    .line 464
    const/16 v10, 0x39

    .line 465
    .line 466
    const/4 v5, 0x0

    .line 467
    const/4 v6, 0x1

    .line 468
    const/4 v7, 0x0

    .line 469
    const/4 v8, 0x0

    .line 470
    invoke-static/range {v4 .. v10}, La/guv;->a(La/guv;ZZLjava/util/ArrayList;La/zdm0;La/nc5;I)La/guv;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    if-eqz v0, :cond_9

    .line 479
    .line 480
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    return-object v0

    .line 483
    :pswitch_7
    move-object/from16 v2, p1

    .line 484
    .line 485
    check-cast v2, Ljava/lang/String;

    .line 486
    .line 487
    move-object/from16 v1, p2

    .line 488
    .line 489
    check-cast v1, La/yje;

    .line 490
    .line 491
    check-cast v0, La/jgv;

    .line 492
    .line 493
    sget-object v1, La/jgv;->h2:La/gst;

    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 499
    .line 500
    invoke-virtual {v0}, La/jgv;->T0()La/kgv;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    iget-object v1, v0, La/kgv;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 505
    .line 506
    const/4 v7, 0x0

    .line 507
    const/16 v8, 0x1fe

    .line 508
    .line 509
    const/4 v3, 0x0

    .line 510
    const/4 v4, 0x0

    .line 511
    const/4 v5, 0x0

    .line 512
    const/4 v6, 0x0

    .line 513
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 514
    .line 515
    .line 516
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_8
    move-object/from16 v2, p1

    .line 520
    .line 521
    check-cast v2, Ljava/lang/String;

    .line 522
    .line 523
    move-object/from16 v1, p2

    .line 524
    .line 525
    check-cast v1, La/yje;

    .line 526
    .line 527
    check-cast v0, La/igv;

    .line 528
    .line 529
    sget-object v1, La/igv;->e2:La/bst;

    .line 530
    .line 531
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 535
    .line 536
    invoke-virtual {v0}, La/igv;->Q0()La/m7b0;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    iget-object v1, v0, La/m7b0;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 541
    .line 542
    const/4 v7, 0x0

    .line 543
    const/16 v8, 0x1fe

    .line 544
    .line 545
    const/4 v3, 0x0

    .line 546
    const/4 v4, 0x0

    .line 547
    const/4 v5, 0x0

    .line 548
    const/4 v6, 0x0

    .line 549
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 550
    .line 551
    .line 552
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 553
    .line 554
    return-object v0

    .line 555
    :pswitch_9
    move-object/from16 v1, p1

    .line 556
    .line 557
    check-cast v1, La/n1t;

    .line 558
    .line 559
    move-object/from16 v2, p2

    .line 560
    .line 561
    check-cast v2, La/yje;

    .line 562
    .line 563
    check-cast v0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;

    .line 564
    .line 565
    sget v2, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->g:I

    .line 566
    .line 567
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    if-eqz v1, :cond_10

    .line 571
    .line 572
    instance-of v2, v1, La/k1t;

    .line 573
    .line 574
    if-eqz v2, :cond_b

    .line 575
    .line 576
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-virtual {v2, v8}, La/ctr;->setProgressVisible(Z)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    invoke-virtual {v2}, La/ctr;->d()V

    .line 595
    .line 596
    .line 597
    check-cast v1, La/k1t;

    .line 598
    .line 599
    iget-boolean v1, v1, La/k1t;->a:Z

    .line 600
    .line 601
    if-eqz v1, :cond_a

    .line 602
    .line 603
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, La/ctr;->c()V

    .line 608
    .line 609
    .line 610
    goto/16 :goto_8

    .line 611
    .line 612
    :cond_a
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v0}, La/ctr;->b()V

    .line 617
    .line 618
    .line 619
    goto/16 :goto_8

    .line 620
    .line 621
    :cond_b
    instance-of v2, v1, La/m1t;

    .line 622
    .line 623
    if-eqz v2, :cond_d

    .line 624
    .line 625
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 633
    .line 634
    .line 635
    move-result-object v2

    .line 636
    check-cast v1, La/m1t;

    .line 637
    .line 638
    iget-object v3, v1, La/m1t;->a:Ljava/lang/String;

    .line 639
    .line 640
    invoke-virtual {v2, v3}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setBroadcastingUrl(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-virtual {v2}, La/ctr;->d()V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    invoke-virtual {v2, v7}, La/ctr;->setProgressVisible(Z)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    invoke-virtual {v2, v7}, La/ctr;->setPlayDrawable(Z)V

    .line 662
    .line 663
    .line 664
    iget-boolean v1, v1, La/m1t;->b:Z

    .line 665
    .line 666
    if-eqz v1, :cond_c

    .line 667
    .line 668
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-virtual {v0}, La/ctr;->c()V

    .line 673
    .line 674
    .line 675
    goto/16 :goto_8

    .line 676
    .line 677
    :cond_c
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-virtual {v0}, La/ctr;->b()V

    .line 682
    .line 683
    .line 684
    goto :goto_8

    .line 685
    :cond_d
    instance-of v2, v1, La/l1t;

    .line 686
    .line 687
    if-eqz v2, :cond_10

    .line 688
    .line 689
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    invoke-virtual {v2, v8}, La/ctr;->setProgressVisible(Z)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    invoke-virtual {v2}, La/ctr;->d()V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    check-cast v1, La/l1t;

    .line 715
    .line 716
    iget-boolean v3, v1, La/l1t;->c:Z

    .line 717
    .line 718
    iget-object v4, v1, La/l1t;->e:La/w3w0;

    .line 719
    .line 720
    iget-boolean v5, v1, La/l1t;->f:Z

    .line 721
    .line 722
    invoke-virtual {v2, v5}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setZoneFormatIsVisible(Z)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    invoke-virtual {v2, v4}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setZoneFormatDrawable(La/w3w0;)V

    .line 730
    .line 731
    .line 732
    iget-boolean v2, v1, La/l1t;->d:Z

    .line 733
    .line 734
    if-eqz v2, :cond_e

    .line 735
    .line 736
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    invoke-virtual {v2}, La/ctr;->c()V

    .line 741
    .line 742
    .line 743
    goto :goto_6

    .line 744
    :cond_e
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    invoke-virtual {v2}, La/ctr;->b()V

    .line 749
    .line 750
    .line 751
    :goto_6
    if-eqz v3, :cond_f

    .line 752
    .line 753
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    iget-object v5, v1, La/l1t;->a:Ljava/lang/String;

    .line 758
    .line 759
    invoke-virtual {v2, v5}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setPlayZoneCommand(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->f()V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    iget-object v1, v1, La/l1t;->b:Ljava/lang/String;

    .line 774
    .line 775
    invoke-virtual {v2, v1, v4}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->g(Ljava/lang/String;La/w3w0;)V

    .line 776
    .line 777
    .line 778
    goto :goto_7

    .line 779
    :cond_f
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->e()V

    .line 784
    .line 785
    .line 786
    :goto_7
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    invoke-virtual {v0, v3}, La/ctr;->setPlayDrawable(Z)V

    .line 791
    .line 792
    .line 793
    :goto_8
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 794
    .line 795
    goto :goto_9

    .line 796
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 797
    .line 798
    .line 799
    :goto_9
    return-object v9

    .line 800
    :pswitch_a
    move-object/from16 v1, p1

    .line 801
    .line 802
    check-cast v1, La/m0t;

    .line 803
    .line 804
    move-object/from16 v2, p2

    .line 805
    .line 806
    check-cast v2, La/yje;

    .line 807
    .line 808
    check-cast v0, La/p0t;

    .line 809
    .line 810
    sget-object v2, La/p0t;->P1:La/ddk;

    .line 811
    .line 812
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    instance-of v2, v1, La/k0t;

    .line 816
    .line 817
    sget-object v6, La/j0t;->a:La/j0t;

    .line 818
    .line 819
    if-eqz v2, :cond_11

    .line 820
    .line 821
    new-instance v1, Lkotlin/Pair;

    .line 822
    .line 823
    const-string v2, "KEY_ZONE_REQUEST"

    .line 824
    .line 825
    sget-object v3, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingZoneEvent$Fullscreen;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingZoneEvent$Fullscreen;

    .line 826
    .line 827
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v0}, La/p0t;->H0()La/e1t;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    iget-object v0, v0, La/e1t;->o:La/p7m0;

    .line 846
    .line 847
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0, v9, v6}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    goto :goto_b

    .line 854
    :cond_11
    instance-of v2, v1, La/l0t;

    .line 855
    .line 856
    if-eqz v2, :cond_14

    .line 857
    .line 858
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    invoke-static {v2}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    if-eqz v2, :cond_12

    .line 867
    .line 868
    check-cast v1, La/l0t;

    .line 869
    .line 870
    iget-object v1, v1, La/l0t;->a:La/jcs;

    .line 871
    .line 872
    invoke-virtual {v1}, La/jcs;->invoke()Ljava/lang/Object;

    .line 873
    .line 874
    .line 875
    goto :goto_a

    .line 876
    :cond_12
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    new-instance v2, Landroid/content/Intent;

    .line 881
    .line 882
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v7

    .line 886
    new-instance v10, Ljava/lang/StringBuilder;

    .line 887
    .line 888
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 899
    .line 900
    .line 901
    move-result-object v4

    .line 902
    invoke-direct {v2, v5, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 906
    .line 907
    .line 908
    move-result-object v4

    .line 909
    invoke-virtual {v4, v2, v8}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 910
    .line 911
    .line 912
    move-result-object v4

    .line 913
    if-eqz v4, :cond_13

    .line 914
    .line 915
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 916
    .line 917
    .line 918
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 919
    .line 920
    .line 921
    :cond_13
    :goto_a
    invoke-virtual {v0}, La/p0t;->H0()La/e1t;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    iget-object v0, v0, La/e1t;->o:La/p7m0;

    .line 926
    .line 927
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    invoke-virtual {v0, v9, v6}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    goto :goto_b

    .line 934
    :cond_14
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    if-eqz v0, :cond_15

    .line 939
    .line 940
    :goto_b
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 941
    .line 942
    goto :goto_c

    .line 943
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 944
    .line 945
    .line 946
    :goto_c
    return-object v9

    .line 947
    :pswitch_b
    move-object/from16 v1, p1

    .line 948
    .line 949
    check-cast v1, La/w0t;

    .line 950
    .line 951
    move-object/from16 v2, p2

    .line 952
    .line 953
    check-cast v2, La/yje;

    .line 954
    .line 955
    check-cast v0, La/p0t;

    .line 956
    .line 957
    sget-object v2, La/p0t;->P1:La/ddk;

    .line 958
    .line 959
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 960
    .line 961
    .line 962
    if-eqz v1, :cond_19

    .line 963
    .line 964
    instance-of v2, v1, La/t0t;

    .line 965
    .line 966
    if-eqz v2, :cond_16

    .line 967
    .line 968
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 973
    .line 974
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    iget-object v2, v2, La/g0r;->c:Landroid/widget/TextView;

    .line 982
    .line 983
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 984
    .line 985
    .line 986
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 987
    .line 988
    .line 989
    move-result-object v2

    .line 990
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 991
    .line 992
    invoke-virtual {v2, v8}, La/ctr;->setProgressVisible(Z)V

    .line 993
    .line 994
    .line 995
    check-cast v1, La/t0t;

    .line 996
    .line 997
    iget-boolean v1, v1, La/t0t;->a:Z

    .line 998
    .line 999
    invoke-virtual {v0, v1}, La/p0t;->I0(Z)V

    .line 1000
    .line 1001
    .line 1002
    goto/16 :goto_e

    .line 1003
    .line 1004
    :cond_16
    instance-of v2, v1, La/v0t;

    .line 1005
    .line 1006
    if-eqz v2, :cond_17

    .line 1007
    .line 1008
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v2

    .line 1012
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1013
    .line 1014
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    iget-object v2, v2, La/g0r;->c:Landroid/widget/TextView;

    .line 1022
    .line 1023
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1031
    .line 1032
    check-cast v1, La/v0t;

    .line 1033
    .line 1034
    iget-object v3, v1, La/v0t;->a:Ljava/lang/String;

    .line 1035
    .line 1036
    invoke-virtual {v2, v3}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setBroadcastingUrl(Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v2

    .line 1043
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1044
    .line 1045
    invoke-virtual {v2, v7}, La/ctr;->setProgressVisible(Z)V

    .line 1046
    .line 1047
    .line 1048
    iget-boolean v1, v1, La/v0t;->b:Z

    .line 1049
    .line 1050
    invoke-virtual {v0, v1}, La/p0t;->I0(Z)V

    .line 1051
    .line 1052
    .line 1053
    goto :goto_e

    .line 1054
    :cond_17
    instance-of v2, v1, La/u0t;

    .line 1055
    .line 1056
    if-eqz v2, :cond_19

    .line 1057
    .line 1058
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v2

    .line 1062
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1063
    .line 1064
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v2

    .line 1071
    iget-object v2, v2, La/g0r;->c:Landroid/widget/TextView;

    .line 1072
    .line 1073
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v2

    .line 1080
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1081
    .line 1082
    invoke-virtual {v2, v8}, La/ctr;->setProgressVisible(Z)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1090
    .line 1091
    check-cast v1, La/u0t;

    .line 1092
    .line 1093
    iget-boolean v3, v1, La/u0t;->c:Z

    .line 1094
    .line 1095
    iget-object v4, v1, La/u0t;->e:La/w3w0;

    .line 1096
    .line 1097
    iget-boolean v5, v1, La/u0t;->f:Z

    .line 1098
    .line 1099
    invoke-virtual {v2, v5}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setZoneFormatIsVisible(Z)V

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v2

    .line 1106
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1107
    .line 1108
    invoke-virtual {v2, v4}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setZoneFormatDrawable(La/w3w0;)V

    .line 1109
    .line 1110
    .line 1111
    iget-boolean v2, v1, La/u0t;->d:Z

    .line 1112
    .line 1113
    invoke-virtual {v0, v2}, La/p0t;->I0(Z)V

    .line 1114
    .line 1115
    .line 1116
    if-eqz v3, :cond_18

    .line 1117
    .line 1118
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v2

    .line 1122
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1123
    .line 1124
    iget-object v5, v1, La/u0t;->a:Ljava/lang/String;

    .line 1125
    .line 1126
    invoke-virtual {v2, v5}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setPlayZoneCommand(Ljava/lang/String;)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v2

    .line 1133
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1134
    .line 1135
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->f()V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v2

    .line 1142
    iget-object v2, v2, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1143
    .line 1144
    iget-object v1, v1, La/u0t;->b:Ljava/lang/String;

    .line 1145
    .line 1146
    invoke-virtual {v2, v1, v4}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->g(Ljava/lang/String;La/w3w0;)V

    .line 1147
    .line 1148
    .line 1149
    goto :goto_d

    .line 1150
    :cond_18
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v1

    .line 1154
    iget-object v1, v1, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1155
    .line 1156
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->e()V

    .line 1157
    .line 1158
    .line 1159
    :goto_d
    invoke-virtual {v0}, La/p0t;->G0()La/g0r;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    iget-object v0, v0, La/g0r;->b:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;

    .line 1164
    .line 1165
    invoke-virtual {v0, v3}, La/ctr;->setPlayDrawable(Z)V

    .line 1166
    .line 1167
    .line 1168
    :goto_e
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1169
    .line 1170
    goto :goto_f

    .line 1171
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 1172
    .line 1173
    .line 1174
    :goto_f
    return-object v9

    .line 1175
    :pswitch_c
    move-object/from16 v1, p1

    .line 1176
    .line 1177
    check-cast v1, La/hzs;

    .line 1178
    .line 1179
    move-object/from16 v2, p2

    .line 1180
    .line 1181
    check-cast v2, La/yje;

    .line 1182
    .line 1183
    check-cast v0, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;

    .line 1184
    .line 1185
    sget v2, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 1186
    .line 1187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1188
    .line 1189
    .line 1190
    iget-object v2, v0, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->f:La/a8z;

    .line 1191
    .line 1192
    iget-object v3, v0, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->h:La/a8z;

    .line 1193
    .line 1194
    sget-object v4, La/dzs;->a:La/dzs;

    .line 1195
    .line 1196
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1197
    .line 1198
    .line 1199
    move-result v4

    .line 1200
    if-eqz v4, :cond_1b

    .line 1201
    .line 1202
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v1

    .line 1206
    check-cast v1, Landroid/widget/FrameLayout;

    .line 1207
    .line 1208
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1209
    .line 1210
    .line 1211
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    check-cast v1, Landroid/view/View;

    .line 1216
    .line 1217
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1218
    .line 1219
    .line 1220
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->b()Landroid/widget/FrameLayout;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v1

    .line 1224
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1225
    .line 1226
    .line 1227
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v1

    .line 1231
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->g()V

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v1

    .line 1238
    invoke-virtual {v1}, La/ctr;->b()V

    .line 1239
    .line 1240
    .line 1241
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->b()Landroid/widget/FrameLayout;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v1

    .line 1245
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v2

    .line 1249
    iget-object v2, v2, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->l:Landroid/graphics/Bitmap;

    .line 1250
    .line 1251
    if-eqz v2, :cond_1a

    .line 1252
    .line 1253
    goto :goto_10

    .line 1254
    :cond_1a
    const v2, 0x7f06069d

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v0, v2}, Landroid/content/Context;->getColor(I)I

    .line 1258
    .line 1259
    .line 1260
    move-result v8

    .line 1261
    :goto_10
    invoke-virtual {v1, v8}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1262
    .line 1263
    .line 1264
    goto/16 :goto_13

    .line 1265
    .line 1266
    :cond_1b
    instance-of v4, v1, La/gzs;

    .line 1267
    .line 1268
    if-eqz v4, :cond_1d

    .line 1269
    .line 1270
    check-cast v1, La/gzs;

    .line 1271
    .line 1272
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v2

    .line 1276
    check-cast v2, Landroid/view/View;

    .line 1277
    .line 1278
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->b()Landroid/widget/FrameLayout;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v2

    .line 1285
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1286
    .line 1287
    .line 1288
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v2

    .line 1292
    check-cast v2, Landroid/widget/FrameLayout;

    .line 1293
    .line 1294
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v2

    .line 1308
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->p()V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v2

    .line 1315
    invoke-virtual {v2}, La/ctr;->d()V

    .line 1316
    .line 1317
    .line 1318
    iget-boolean v1, v1, La/gzs;->a:Z

    .line 1319
    .line 1320
    if-eqz v1, :cond_1c

    .line 1321
    .line 1322
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    invoke-virtual {v0}, La/ctr;->c()V

    .line 1327
    .line 1328
    .line 1329
    goto/16 :goto_13

    .line 1330
    .line 1331
    :cond_1c
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v0

    .line 1335
    invoke-virtual {v0}, La/ctr;->b()V

    .line 1336
    .line 1337
    .line 1338
    goto/16 :goto_13

    .line 1339
    .line 1340
    :cond_1d
    instance-of v4, v1, La/fzs;

    .line 1341
    .line 1342
    if-eqz v4, :cond_1f

    .line 1343
    .line 1344
    check-cast v1, La/fzs;

    .line 1345
    .line 1346
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v2

    .line 1350
    check-cast v2, Landroid/view/View;

    .line 1351
    .line 1352
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->b()Landroid/widget/FrameLayout;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v2

    .line 1359
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1360
    .line 1361
    .line 1362
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v2

    .line 1366
    check-cast v2, Landroid/widget/FrameLayout;

    .line 1367
    .line 1368
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v2

    .line 1375
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v2

    .line 1382
    iget-object v3, v1, La/fzs;->a:Ljava/lang/String;

    .line 1383
    .line 1384
    invoke-virtual {v2, v3}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setBroadcastingUrl(Ljava/lang/String;)V

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v2

    .line 1391
    invoke-virtual {v2}, La/ctr;->d()V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v2

    .line 1398
    invoke-virtual {v2, v7}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 1399
    .line 1400
    .line 1401
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v2

    .line 1405
    invoke-virtual {v2, v7}, La/ctr;->setPlayDrawable(Z)V

    .line 1406
    .line 1407
    .line 1408
    iget-boolean v1, v1, La/fzs;->b:Z

    .line 1409
    .line 1410
    if-eqz v1, :cond_1e

    .line 1411
    .line 1412
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v0

    .line 1416
    invoke-virtual {v0}, La/ctr;->c()V

    .line 1417
    .line 1418
    .line 1419
    goto/16 :goto_13

    .line 1420
    .line 1421
    :cond_1e
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v0

    .line 1425
    invoke-virtual {v0}, La/ctr;->b()V

    .line 1426
    .line 1427
    .line 1428
    goto/16 :goto_13

    .line 1429
    .line 1430
    :cond_1f
    instance-of v4, v1, La/ezs;

    .line 1431
    .line 1432
    if-eqz v4, :cond_24

    .line 1433
    .line 1434
    check-cast v1, La/ezs;

    .line 1435
    .line 1436
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v2

    .line 1440
    check-cast v2, Landroid/view/View;

    .line 1441
    .line 1442
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->b()Landroid/widget/FrameLayout;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v2

    .line 1449
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1450
    .line 1451
    .line 1452
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v2

    .line 1456
    check-cast v2, Landroid/widget/FrameLayout;

    .line 1457
    .line 1458
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v2

    .line 1465
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1466
    .line 1467
    .line 1468
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v2

    .line 1472
    invoke-virtual {v2, v8}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v2

    .line 1479
    invoke-virtual {v2}, La/ctr;->d()V

    .line 1480
    .line 1481
    .line 1482
    iget-boolean v2, v1, La/ezs;->b:Z

    .line 1483
    .line 1484
    if-eqz v2, :cond_20

    .line 1485
    .line 1486
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v2

    .line 1490
    invoke-virtual {v2}, La/ctr;->c()V

    .line 1491
    .line 1492
    .line 1493
    goto :goto_11

    .line 1494
    :cond_20
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v2

    .line 1498
    invoke-virtual {v2}, La/ctr;->b()V

    .line 1499
    .line 1500
    .line 1501
    :goto_11
    iget-boolean v2, v1, La/ezs;->a:Z

    .line 1502
    .line 1503
    if-eqz v2, :cond_22

    .line 1504
    .line 1505
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v3

    .line 1509
    iget-boolean v1, v1, La/ezs;->c:Z

    .line 1510
    .line 1511
    invoke-virtual {v3, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setSoundEnable(Z)V

    .line 1512
    .line 1513
    .line 1514
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v1

    .line 1518
    iget-object v3, v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 1519
    .line 1520
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1521
    .line 1522
    .line 1523
    move-result v3

    .line 1524
    if-nez v3, :cond_21

    .line 1525
    .line 1526
    goto :goto_12

    .line 1527
    :cond_21
    iput-boolean v7, v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->o:Z

    .line 1528
    .line 1529
    iget-object v1, v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 1530
    .line 1531
    if-eqz v1, :cond_23

    .line 1532
    .line 1533
    invoke-virtual {v1, v7}, La/ulo;->P(Z)V

    .line 1534
    .line 1535
    .line 1536
    goto :goto_12

    .line 1537
    :cond_22
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v1

    .line 1541
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->f()V

    .line 1542
    .line 1543
    .line 1544
    :cond_23
    :goto_12
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->a()Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v0

    .line 1548
    invoke-virtual {v0, v2}, La/ctr;->setPlayDrawable(Z)V

    .line 1549
    .line 1550
    .line 1551
    :goto_13
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1552
    .line 1553
    goto :goto_14

    .line 1554
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1555
    .line 1556
    .line 1557
    :goto_14
    return-object v9

    .line 1558
    :pswitch_d
    move-object/from16 v1, p1

    .line 1559
    .line 1560
    check-cast v1, Ljava/lang/Boolean;

    .line 1561
    .line 1562
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1563
    .line 1564
    .line 1565
    move-result v1

    .line 1566
    move-object/from16 v2, p2

    .line 1567
    .line 1568
    check-cast v2, La/yje;

    .line 1569
    .line 1570
    check-cast v0, La/wws;

    .line 1571
    .line 1572
    sget-object v2, La/wws;->S1:La/pek;

    .line 1573
    .line 1574
    if-eqz v1, :cond_25

    .line 1575
    .line 1576
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v0

    .line 1580
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1581
    .line 1582
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->l()V

    .line 1583
    .line 1584
    .line 1585
    goto :goto_15

    .line 1586
    :cond_25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1587
    .line 1588
    .line 1589
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1590
    .line 1591
    return-object v0

    .line 1592
    :pswitch_e
    sget-object v1, La/nws;->a:La/nws;

    .line 1593
    .line 1594
    move-object/from16 v2, p1

    .line 1595
    .line 1596
    check-cast v2, La/pws;

    .line 1597
    .line 1598
    move-object/from16 v6, p2

    .line 1599
    .line 1600
    check-cast v6, La/yje;

    .line 1601
    .line 1602
    check-cast v0, La/wws;

    .line 1603
    .line 1604
    sget-object v6, La/wws;->S1:La/pek;

    .line 1605
    .line 1606
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1607
    .line 1608
    .line 1609
    sget-object v6, La/nws;->b:La/nws;

    .line 1610
    .line 1611
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1612
    .line 1613
    .line 1614
    move-result v6

    .line 1615
    if-eqz v6, :cond_26

    .line 1616
    .line 1617
    new-instance v2, Lkotlin/Pair;

    .line 1618
    .line 1619
    const-string v3, "KEY_VIDEO_REQUEST"

    .line 1620
    .line 1621
    sget-object v4, Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingVideoEvent$Fullscreen;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/events/BroadcastingVideoEvent$Fullscreen;

    .line 1622
    .line 1623
    invoke-direct {v2, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1624
    .line 1625
    .line 1626
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v2

    .line 1630
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v2

    .line 1634
    invoke-static {v2, v0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual {v0}, La/wws;->H0()La/yys;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v0

    .line 1641
    iget-object v0, v0, La/yys;->C:La/p7m0;

    .line 1642
    .line 1643
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {v0, v9, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1647
    .line 1648
    .line 1649
    goto :goto_17

    .line 1650
    :cond_26
    instance-of v6, v2, La/ows;

    .line 1651
    .line 1652
    if-eqz v6, :cond_29

    .line 1653
    .line 1654
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v6

    .line 1658
    invoke-static {v6}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    .line 1659
    .line 1660
    .line 1661
    move-result v6

    .line 1662
    if-eqz v6, :cond_27

    .line 1663
    .line 1664
    check-cast v2, La/ows;

    .line 1665
    .line 1666
    iget-object v2, v2, La/ows;->a:La/jcs;

    .line 1667
    .line 1668
    invoke-virtual {v2}, La/jcs;->invoke()Ljava/lang/Object;

    .line 1669
    .line 1670
    .line 1671
    goto :goto_16

    .line 1672
    :cond_27
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v2

    .line 1676
    new-instance v6, Landroid/content/Intent;

    .line 1677
    .line 1678
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v7

    .line 1682
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1683
    .line 1684
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1685
    .line 1686
    .line 1687
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1688
    .line 1689
    .line 1690
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v4

    .line 1694
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v4

    .line 1698
    invoke-direct {v6, v5, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v4

    .line 1705
    invoke-virtual {v4, v6, v8}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v4

    .line 1709
    if-eqz v4, :cond_28

    .line 1710
    .line 1711
    invoke-virtual {v6, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {v2, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1715
    .line 1716
    .line 1717
    :cond_28
    :goto_16
    invoke-virtual {v0}, La/wws;->H0()La/yys;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v0

    .line 1721
    iget-object v0, v0, La/yys;->C:La/p7m0;

    .line 1722
    .line 1723
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1724
    .line 1725
    .line 1726
    invoke-virtual {v0, v9, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1727
    .line 1728
    .line 1729
    goto :goto_17

    .line 1730
    :cond_29
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1731
    .line 1732
    .line 1733
    move-result v0

    .line 1734
    if-eqz v0, :cond_2a

    .line 1735
    .line 1736
    :goto_17
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1737
    .line 1738
    goto :goto_18

    .line 1739
    :cond_2a
    invoke-static {}, La/t9f;->b()V

    .line 1740
    .line 1741
    .line 1742
    :goto_18
    return-object v9

    .line 1743
    :pswitch_f
    move-object/from16 v1, p1

    .line 1744
    .line 1745
    check-cast v1, La/txs;

    .line 1746
    .line 1747
    move-object/from16 v3, p2

    .line 1748
    .line 1749
    check-cast v3, La/yje;

    .line 1750
    .line 1751
    check-cast v0, La/wws;

    .line 1752
    .line 1753
    sget-object v3, La/wws;->S1:La/pek;

    .line 1754
    .line 1755
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v3

    .line 1759
    iget-object v4, v0, La/wws;->Q1:La/khf0;

    .line 1760
    .line 1761
    iget-object v3, v3, La/e0r;->i:Landroidx/constraintlayout/widget/Group;

    .line 1762
    .line 1763
    invoke-virtual {v3, v6}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1764
    .line 1765
    .line 1766
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v3

    .line 1770
    iget-object v3, v3, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1771
    .line 1772
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1773
    .line 1774
    .line 1775
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v3

    .line 1779
    iget-object v3, v3, La/e0r;->l:Landroid/widget/TextView;

    .line 1780
    .line 1781
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1782
    .line 1783
    .line 1784
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v3

    .line 1788
    iget-object v3, v3, La/e0r;->e:La/qk;

    .line 1789
    .line 1790
    iget-object v3, v3, La/qk;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1791
    .line 1792
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1793
    .line 1794
    .line 1795
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v3

    .line 1799
    iget-object v3, v3, La/e0r;->b:La/qk;

    .line 1800
    .line 1801
    iget-object v3, v3, La/qk;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1802
    .line 1803
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1804
    .line 1805
    .line 1806
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v3

    .line 1810
    iget-object v3, v3, La/e0r;->m:Landroid/view/View;

    .line 1811
    .line 1812
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1813
    .line 1814
    .line 1815
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v3

    .line 1819
    iget-object v3, v3, La/e0r;->f:Landroid/view/View;

    .line 1820
    .line 1821
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1822
    .line 1823
    .line 1824
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v3

    .line 1828
    iget-object v3, v3, La/e0r;->g:Landroidx/constraintlayout/helper/widget/Flow;

    .line 1829
    .line 1830
    invoke-virtual {v3, v6}, La/yru0;->setVisibility(I)V

    .line 1831
    .line 1832
    .line 1833
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v3

    .line 1837
    iget-object v3, v3, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1838
    .line 1839
    invoke-virtual {v3, v8}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 1840
    .line 1841
    .line 1842
    instance-of v3, v1, La/mxs;

    .line 1843
    .line 1844
    if-eqz v3, :cond_2b

    .line 1845
    .line 1846
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v2

    .line 1850
    iget-object v2, v2, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1851
    .line 1852
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->m()V

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v2

    .line 1859
    iget-object v2, v2, La/e0r;->f:Landroid/view/View;

    .line 1860
    .line 1861
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1862
    .line 1863
    .line 1864
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v2

    .line 1868
    iget-object v2, v2, La/e0r;->c:Landroid/widget/TextView;

    .line 1869
    .line 1870
    check-cast v1, La/mxs;

    .line 1871
    .line 1872
    iget-object v1, v1, La/mxs;->a:Ljava/lang/String;

    .line 1873
    .line 1874
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1875
    .line 1876
    .line 1877
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v1

    .line 1881
    iget-object v1, v1, La/e0r;->i:Landroidx/constraintlayout/widget/Group;

    .line 1882
    .line 1883
    invoke-virtual {v1, v8}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v1

    .line 1890
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1891
    .line 1892
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1893
    .line 1894
    .line 1895
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v0

    .line 1899
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1900
    .line 1901
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBroadcastingContainerView()Landroid/view/View;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v0

    .line 1905
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1906
    .line 1907
    .line 1908
    goto/16 :goto_1e

    .line 1909
    .line 1910
    :cond_2b
    sget-object v3, La/pxs;->a:La/pxs;

    .line 1911
    .line 1912
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1913
    .line 1914
    .line 1915
    move-result v3

    .line 1916
    const v5, 0x7f0606da

    .line 1917
    .line 1918
    .line 1919
    if-eqz v3, :cond_2f

    .line 1920
    .line 1921
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v1

    .line 1925
    iget-object v1, v1, La/e0r;->b:La/qk;

    .line 1926
    .line 1927
    iget-object v1, v1, La/qk;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1928
    .line 1929
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1930
    .line 1931
    .line 1932
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v1

    .line 1936
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1937
    .line 1938
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->g()V

    .line 1939
    .line 1940
    .line 1941
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v1

    .line 1945
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1946
    .line 1947
    iget-object v1, v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->l:Landroid/graphics/Bitmap;

    .line 1948
    .line 1949
    if-eqz v1, :cond_2c

    .line 1950
    .line 1951
    goto :goto_19

    .line 1952
    :cond_2c
    move v7, v8

    .line 1953
    :goto_19
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v1

    .line 1957
    iget-object v1, v1, La/e0r;->m:Landroid/view/View;

    .line 1958
    .line 1959
    if-eqz v7, :cond_2d

    .line 1960
    .line 1961
    move v6, v8

    .line 1962
    :cond_2d
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1963
    .line 1964
    .line 1965
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v1

    .line 1969
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 1970
    .line 1971
    invoke-virtual {v1}, La/ctr;->b()V

    .line 1972
    .line 1973
    .line 1974
    if-eqz v7, :cond_2e

    .line 1975
    .line 1976
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v1

    .line 1980
    sget-object v2, La/m5d;->a:Landroid/util/TypedValue;

    .line 1981
    .line 1982
    invoke-virtual {v1, v5}, Landroid/content/Context;->getColor(I)I

    .line 1983
    .line 1984
    .line 1985
    move-result v1

    .line 1986
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v2

    .line 1990
    iget-object v2, v2, La/e0r;->b:La/qk;

    .line 1991
    .line 1992
    iget-object v2, v2, La/qk;->e:Landroid/widget/TextView;

    .line 1993
    .line 1994
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1995
    .line 1996
    .line 1997
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v0

    .line 2001
    iget-object v0, v0, La/e0r;->b:La/qk;

    .line 2002
    .line 2003
    iget-object v0, v0, La/qk;->d:Landroid/widget/ImageView;

    .line 2004
    .line 2005
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v1

    .line 2009
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 2010
    .line 2011
    .line 2012
    goto/16 :goto_1e

    .line 2013
    .line 2014
    :cond_2e
    sget-object v1, La/wws;->U1:[La/iiy;

    .line 2015
    .line 2016
    aget-object v1, v1, v2

    .line 2017
    .line 2018
    invoke-virtual {v4, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 2019
    .line 2020
    .line 2021
    move-result-object v1

    .line 2022
    check-cast v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 2023
    .line 2024
    iget-object v1, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;->e:Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;

    .line 2025
    .line 2026
    invoke-static {v1}, La/axs;->a(Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;)La/zws;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v1

    .line 2030
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v2

    .line 2034
    iget-object v2, v2, La/e0r;->b:La/qk;

    .line 2035
    .line 2036
    iget-object v2, v2, La/qk;->e:Landroid/widget/TextView;

    .line 2037
    .line 2038
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 2039
    .line 2040
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v3

    .line 2044
    iget v4, v1, La/zws;->b:I

    .line 2045
    .line 2046
    invoke-static {v3, v4, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2047
    .line 2048
    .line 2049
    move-result v3

    .line 2050
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2051
    .line 2052
    .line 2053
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v2

    .line 2057
    iget-object v2, v2, La/e0r;->b:La/qk;

    .line 2058
    .line 2059
    iget-object v2, v2, La/qk;->d:Landroid/widget/ImageView;

    .line 2060
    .line 2061
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v0

    .line 2065
    iget v1, v1, La/zws;->c:I

    .line 2066
    .line 2067
    invoke-static {v0, v1, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2068
    .line 2069
    .line 2070
    move-result v0

    .line 2071
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v0

    .line 2075
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 2076
    .line 2077
    .line 2078
    goto/16 :goto_1e

    .line 2079
    .line 2080
    :cond_2f
    sget-object v3, La/qxs;->a:La/qxs;

    .line 2081
    .line 2082
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2083
    .line 2084
    .line 2085
    move-result v3

    .line 2086
    if-eqz v3, :cond_33

    .line 2087
    .line 2088
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v1

    .line 2092
    iget-object v1, v1, La/e0r;->e:La/qk;

    .line 2093
    .line 2094
    iget-object v1, v1, La/qk;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2095
    .line 2096
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 2097
    .line 2098
    .line 2099
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v1

    .line 2103
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2104
    .line 2105
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->g()V

    .line 2106
    .line 2107
    .line 2108
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v1

    .line 2112
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2113
    .line 2114
    iget-object v1, v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->l:Landroid/graphics/Bitmap;

    .line 2115
    .line 2116
    if-eqz v1, :cond_30

    .line 2117
    .line 2118
    goto :goto_1a

    .line 2119
    :cond_30
    move v7, v8

    .line 2120
    :goto_1a
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v1

    .line 2124
    iget-object v1, v1, La/e0r;->m:Landroid/view/View;

    .line 2125
    .line 2126
    if-eqz v7, :cond_31

    .line 2127
    .line 2128
    move v6, v8

    .line 2129
    :cond_31
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2130
    .line 2131
    .line 2132
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v1

    .line 2136
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2137
    .line 2138
    invoke-virtual {v1}, La/ctr;->b()V

    .line 2139
    .line 2140
    .line 2141
    if-eqz v7, :cond_32

    .line 2142
    .line 2143
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2144
    .line 2145
    .line 2146
    move-result-object v1

    .line 2147
    sget-object v2, La/m5d;->a:Landroid/util/TypedValue;

    .line 2148
    .line 2149
    invoke-virtual {v1, v5}, Landroid/content/Context;->getColor(I)I

    .line 2150
    .line 2151
    .line 2152
    move-result v1

    .line 2153
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2154
    .line 2155
    .line 2156
    move-result-object v2

    .line 2157
    iget-object v2, v2, La/e0r;->e:La/qk;

    .line 2158
    .line 2159
    iget-object v2, v2, La/qk;->e:Landroid/widget/TextView;

    .line 2160
    .line 2161
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2162
    .line 2163
    .line 2164
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v0

    .line 2168
    iget-object v0, v0, La/e0r;->e:La/qk;

    .line 2169
    .line 2170
    iget-object v0, v0, La/qk;->d:Landroid/widget/ImageView;

    .line 2171
    .line 2172
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v1

    .line 2176
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 2177
    .line 2178
    .line 2179
    goto/16 :goto_1e

    .line 2180
    .line 2181
    :cond_32
    sget-object v1, La/wws;->U1:[La/iiy;

    .line 2182
    .line 2183
    aget-object v1, v1, v2

    .line 2184
    .line 2185
    invoke-virtual {v4, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v1

    .line 2189
    check-cast v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 2190
    .line 2191
    iget-object v1, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;->e:Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;

    .line 2192
    .line 2193
    invoke-static {v1}, La/axs;->a(Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;)La/zws;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v1

    .line 2197
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v2

    .line 2201
    iget-object v2, v2, La/e0r;->e:La/qk;

    .line 2202
    .line 2203
    iget-object v2, v2, La/qk;->e:Landroid/widget/TextView;

    .line 2204
    .line 2205
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 2206
    .line 2207
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v3

    .line 2211
    iget v4, v1, La/zws;->b:I

    .line 2212
    .line 2213
    invoke-static {v3, v4, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2214
    .line 2215
    .line 2216
    move-result v3

    .line 2217
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2218
    .line 2219
    .line 2220
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v2

    .line 2224
    iget-object v2, v2, La/e0r;->e:La/qk;

    .line 2225
    .line 2226
    iget-object v2, v2, La/qk;->d:Landroid/widget/ImageView;

    .line 2227
    .line 2228
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2229
    .line 2230
    .line 2231
    move-result-object v0

    .line 2232
    iget v1, v1, La/zws;->c:I

    .line 2233
    .line 2234
    invoke-static {v0, v1, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2235
    .line 2236
    .line 2237
    move-result v0

    .line 2238
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v0

    .line 2242
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 2243
    .line 2244
    .line 2245
    goto/16 :goto_1e

    .line 2246
    .line 2247
    :cond_33
    instance-of v2, v1, La/nxs;

    .line 2248
    .line 2249
    if-eqz v2, :cond_34

    .line 2250
    .line 2251
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2252
    .line 2253
    .line 2254
    move-result-object v2

    .line 2255
    iget-object v2, v2, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2256
    .line 2257
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->m()V

    .line 2258
    .line 2259
    .line 2260
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2261
    .line 2262
    .line 2263
    move-result-object v2

    .line 2264
    iget-object v2, v2, La/e0r;->f:Landroid/view/View;

    .line 2265
    .line 2266
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 2267
    .line 2268
    .line 2269
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2270
    .line 2271
    .line 2272
    move-result-object v2

    .line 2273
    iget-object v2, v2, La/e0r;->l:Landroid/widget/TextView;

    .line 2274
    .line 2275
    check-cast v1, La/nxs;

    .line 2276
    .line 2277
    iget-object v1, v1, La/nxs;->a:Ljava/lang/String;

    .line 2278
    .line 2279
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2280
    .line 2281
    .line 2282
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v1

    .line 2286
    iget-object v1, v1, La/e0r;->l:Landroid/widget/TextView;

    .line 2287
    .line 2288
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 2289
    .line 2290
    .line 2291
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v1

    .line 2295
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2296
    .line 2297
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2298
    .line 2299
    .line 2300
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2301
    .line 2302
    .line 2303
    move-result-object v0

    .line 2304
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2305
    .line 2306
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBroadcastingContainerView()Landroid/view/View;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v0

    .line 2310
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2311
    .line 2312
    .line 2313
    goto/16 :goto_1e

    .line 2314
    .line 2315
    :cond_34
    instance-of v2, v1, La/lxs;

    .line 2316
    .line 2317
    if-eqz v2, :cond_35

    .line 2318
    .line 2319
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2320
    .line 2321
    .line 2322
    move-result-object v2

    .line 2323
    iget-object v2, v2, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2324
    .line 2325
    invoke-virtual {v2}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->m()V

    .line 2326
    .line 2327
    .line 2328
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v2

    .line 2332
    iget-object v2, v2, La/e0r;->f:Landroid/view/View;

    .line 2333
    .line 2334
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    .line 2335
    .line 2336
    .line 2337
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2338
    .line 2339
    .line 2340
    move-result-object v2

    .line 2341
    iget-object v2, v2, La/e0r;->c:Landroid/widget/TextView;

    .line 2342
    .line 2343
    check-cast v1, La/lxs;

    .line 2344
    .line 2345
    iget-object v1, v1, La/lxs;->a:Ljava/lang/String;

    .line 2346
    .line 2347
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2348
    .line 2349
    .line 2350
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v1

    .line 2354
    iget-object v1, v1, La/e0r;->g:Landroidx/constraintlayout/helper/widget/Flow;

    .line 2355
    .line 2356
    invoke-virtual {v1, v8}, La/yru0;->setVisibility(I)V

    .line 2357
    .line 2358
    .line 2359
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2360
    .line 2361
    .line 2362
    move-result-object v1

    .line 2363
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2364
    .line 2365
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2366
    .line 2367
    .line 2368
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2369
    .line 2370
    .line 2371
    move-result-object v0

    .line 2372
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2373
    .line 2374
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBroadcastingContainerView()Landroid/view/View;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v0

    .line 2378
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2379
    .line 2380
    .line 2381
    goto/16 :goto_1e

    .line 2382
    .line 2383
    :cond_35
    sget-object v2, La/oxs;->a:La/oxs;

    .line 2384
    .line 2385
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2386
    .line 2387
    .line 2388
    move-result v2

    .line 2389
    if-eqz v2, :cond_36

    .line 2390
    .line 2391
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v1

    .line 2395
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2396
    .line 2397
    invoke-virtual {v1, v7}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 2398
    .line 2399
    .line 2400
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2401
    .line 2402
    .line 2403
    move-result-object v0

    .line 2404
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2405
    .line 2406
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBroadcastingContainerView()Landroid/view/View;

    .line 2407
    .line 2408
    .line 2409
    move-result-object v0

    .line 2410
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2411
    .line 2412
    .line 2413
    goto/16 :goto_1e

    .line 2414
    .line 2415
    :cond_36
    instance-of v2, v1, La/sxs;

    .line 2416
    .line 2417
    if-eqz v2, :cond_38

    .line 2418
    .line 2419
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2420
    .line 2421
    .line 2422
    move-result-object v2

    .line 2423
    iget-object v2, v2, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2424
    .line 2425
    check-cast v1, La/sxs;

    .line 2426
    .line 2427
    iget-object v3, v1, La/sxs;->a:Ljava/lang/String;

    .line 2428
    .line 2429
    invoke-virtual {v2, v3}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setBroadcastingUrl(Ljava/lang/String;)V

    .line 2430
    .line 2431
    .line 2432
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v2

    .line 2436
    iget-object v2, v2, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2437
    .line 2438
    invoke-virtual {v2, v7}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 2439
    .line 2440
    .line 2441
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2442
    .line 2443
    .line 2444
    move-result-object v2

    .line 2445
    iget-object v2, v2, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2446
    .line 2447
    invoke-virtual {v2}, La/ctr;->d()V

    .line 2448
    .line 2449
    .line 2450
    iget-boolean v1, v1, La/sxs;->b:Z

    .line 2451
    .line 2452
    if-eqz v1, :cond_37

    .line 2453
    .line 2454
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2455
    .line 2456
    .line 2457
    move-result-object v1

    .line 2458
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2459
    .line 2460
    invoke-virtual {v1}, La/ctr;->c()V

    .line 2461
    .line 2462
    .line 2463
    goto :goto_1b

    .line 2464
    :cond_37
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2465
    .line 2466
    .line 2467
    move-result-object v1

    .line 2468
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2469
    .line 2470
    invoke-virtual {v1}, La/ctr;->b()V

    .line 2471
    .line 2472
    .line 2473
    :goto_1b
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v0

    .line 2477
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2478
    .line 2479
    invoke-virtual {v0, v7}, La/ctr;->setPlayDrawable(Z)V

    .line 2480
    .line 2481
    .line 2482
    goto :goto_1e

    .line 2483
    :cond_38
    instance-of v2, v1, La/rxs;

    .line 2484
    .line 2485
    if-eqz v2, :cond_3d

    .line 2486
    .line 2487
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v2

    .line 2491
    iget-object v2, v2, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2492
    .line 2493
    invoke-virtual {v2}, La/ctr;->d()V

    .line 2494
    .line 2495
    .line 2496
    check-cast v1, La/rxs;

    .line 2497
    .line 2498
    iget-boolean v2, v1, La/rxs;->a:Z

    .line 2499
    .line 2500
    iget-boolean v3, v1, La/rxs;->b:Z

    .line 2501
    .line 2502
    if-eqz v3, :cond_39

    .line 2503
    .line 2504
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2505
    .line 2506
    .line 2507
    move-result-object v3

    .line 2508
    iget-object v3, v3, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2509
    .line 2510
    invoke-virtual {v3}, La/ctr;->c()V

    .line 2511
    .line 2512
    .line 2513
    goto :goto_1c

    .line 2514
    :cond_39
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2515
    .line 2516
    .line 2517
    move-result-object v3

    .line 2518
    iget-object v3, v3, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2519
    .line 2520
    invoke-virtual {v3}, La/ctr;->b()V

    .line 2521
    .line 2522
    .line 2523
    :goto_1c
    if-eqz v2, :cond_3b

    .line 2524
    .line 2525
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v3

    .line 2529
    iget-object v3, v3, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2530
    .line 2531
    iget-boolean v1, v1, La/rxs;->c:Z

    .line 2532
    .line 2533
    invoke-virtual {v3, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setSoundEnable(Z)V

    .line 2534
    .line 2535
    .line 2536
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2537
    .line 2538
    .line 2539
    move-result-object v1

    .line 2540
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2541
    .line 2542
    iget-object v3, v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 2543
    .line 2544
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 2545
    .line 2546
    .line 2547
    move-result v3

    .line 2548
    if-nez v3, :cond_3a

    .line 2549
    .line 2550
    goto :goto_1d

    .line 2551
    :cond_3a
    iput-boolean v7, v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->o:Z

    .line 2552
    .line 2553
    iget-object v1, v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 2554
    .line 2555
    if-eqz v1, :cond_3c

    .line 2556
    .line 2557
    invoke-virtual {v1, v7}, La/ulo;->P(Z)V

    .line 2558
    .line 2559
    .line 2560
    goto :goto_1d

    .line 2561
    :cond_3b
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2562
    .line 2563
    .line 2564
    move-result-object v1

    .line 2565
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2566
    .line 2567
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->f()V

    .line 2568
    .line 2569
    .line 2570
    :cond_3c
    :goto_1d
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v0

    .line 2574
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 2575
    .line 2576
    invoke-virtual {v0, v2}, La/ctr;->setPlayDrawable(Z)V

    .line 2577
    .line 2578
    .line 2579
    :goto_1e
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2580
    .line 2581
    goto :goto_1f

    .line 2582
    :cond_3d
    invoke-static {}, La/t9f;->b()V

    .line 2583
    .line 2584
    .line 2585
    :goto_1f
    return-object v9

    .line 2586
    :pswitch_10
    move-object/from16 v1, p1

    .line 2587
    .line 2588
    check-cast v1, La/g4z;

    .line 2589
    .line 2590
    move-object/from16 v3, p2

    .line 2591
    .line 2592
    check-cast v3, La/yje;

    .line 2593
    .line 2594
    check-cast v0, La/yks;

    .line 2595
    .line 2596
    sget v3, La/yks;->m0:I

    .line 2597
    .line 2598
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2599
    .line 2600
    .line 2601
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v10

    .line 2605
    sget-object v11, La/aks;->a:La/aks;

    .line 2606
    .line 2607
    iget-object v3, v0, La/yks;->q:La/mne;

    .line 2608
    .line 2609
    iget-object v13, v3, La/mne;->c:La/vs10;

    .line 2610
    .line 2611
    new-instance v14, La/o3s;

    .line 2612
    .line 2613
    invoke-direct {v14, v0, v1, v9, v2}, La/o3s;-><init>(La/i3t0;La/g4z;La/yje;B)V

    .line 2614
    .line 2615
    .line 2616
    const/16 v15, 0xa

    .line 2617
    .line 2618
    const/4 v12, 0x0

    .line 2619
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2620
    .line 2621
    .line 2622
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2623
    .line 2624
    return-object v0

    .line 2625
    :pswitch_11
    move-object/from16 v1, p1

    .line 2626
    .line 2627
    check-cast v1, La/g4z;

    .line 2628
    .line 2629
    move-object/from16 v2, p2

    .line 2630
    .line 2631
    check-cast v2, La/yje;

    .line 2632
    .line 2633
    check-cast v0, La/g9s;

    .line 2634
    .line 2635
    sget v2, La/g9s;->n0:I

    .line 2636
    .line 2637
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2638
    .line 2639
    .line 2640
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2641
    .line 2642
    .line 2643
    move-result-object v10

    .line 2644
    sget-object v11, La/i8s;->a:La/i8s;

    .line 2645
    .line 2646
    iget-object v2, v0, La/g9s;->q:La/mne;

    .line 2647
    .line 2648
    iget-object v13, v2, La/mne;->c:La/vs10;

    .line 2649
    .line 2650
    new-instance v14, La/o3s;

    .line 2651
    .line 2652
    invoke-direct {v14, v0, v1, v9, v7}, La/o3s;-><init>(La/i3t0;La/g4z;La/yje;B)V

    .line 2653
    .line 2654
    .line 2655
    const/16 v15, 0xa

    .line 2656
    .line 2657
    const/4 v12, 0x0

    .line 2658
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2659
    .line 2660
    .line 2661
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2662
    .line 2663
    return-object v0

    .line 2664
    :pswitch_12
    move-object/from16 v1, p1

    .line 2665
    .line 2666
    check-cast v1, La/g4z;

    .line 2667
    .line 2668
    move-object/from16 v2, p2

    .line 2669
    .line 2670
    check-cast v2, La/yje;

    .line 2671
    .line 2672
    check-cast v0, La/k4s;

    .line 2673
    .line 2674
    sget v2, La/k4s;->c0:I

    .line 2675
    .line 2676
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2677
    .line 2678
    .line 2679
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2680
    .line 2681
    .line 2682
    move-result-object v10

    .line 2683
    sget-object v11, La/n3s;->a:La/n3s;

    .line 2684
    .line 2685
    iget-object v2, v0, La/k4s;->p:La/mne;

    .line 2686
    .line 2687
    iget-object v13, v2, La/mne;->c:La/vs10;

    .line 2688
    .line 2689
    new-instance v14, La/o3s;

    .line 2690
    .line 2691
    invoke-direct {v14, v0, v1, v9, v8}, La/o3s;-><init>(La/i3t0;La/g4z;La/yje;B)V

    .line 2692
    .line 2693
    .line 2694
    const/16 v15, 0xa

    .line 2695
    .line 2696
    const/4 v12, 0x0

    .line 2697
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2698
    .line 2699
    .line 2700
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2701
    .line 2702
    return-object v0

    .line 2703
    :pswitch_13
    move-object/from16 v1, p1

    .line 2704
    .line 2705
    check-cast v1, Ljava/lang/Throwable;

    .line 2706
    .line 2707
    move-object/from16 v2, p2

    .line 2708
    .line 2709
    check-cast v2, La/yje;

    .line 2710
    .line 2711
    check-cast v0, La/abr;

    .line 2712
    .line 2713
    iget-object v2, v0, La/abr;->q:La/duj;

    .line 2714
    .line 2715
    new-instance v3, La/gup;

    .line 2716
    .line 2717
    const/16 v4, 0xd

    .line 2718
    .line 2719
    invoke-direct {v3, v1, v0, v4}, La/gup;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2720
    .line 2721
    .line 2722
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2723
    .line 2724
    .line 2725
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2726
    .line 2727
    return-object v0

    .line 2728
    :pswitch_14
    move-object/from16 v1, p1

    .line 2729
    .line 2730
    check-cast v1, Ljava/lang/Throwable;

    .line 2731
    .line 2732
    move-object/from16 v2, p2

    .line 2733
    .line 2734
    check-cast v2, La/yje;

    .line 2735
    .line 2736
    check-cast v0, La/gfp;

    .line 2737
    .line 2738
    invoke-virtual {v0, v1}, La/gfp;->O(Ljava/lang/Throwable;)V

    .line 2739
    .line 2740
    .line 2741
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2742
    .line 2743
    return-object v0

    .line 2744
    :pswitch_15
    move-object/from16 v1, p1

    .line 2745
    .line 2746
    check-cast v1, Ljava/lang/Throwable;

    .line 2747
    .line 2748
    move-object/from16 v2, p2

    .line 2749
    .line 2750
    check-cast v2, La/yje;

    .line 2751
    .line 2752
    move-object v2, v0

    .line 2753
    check-cast v2, La/bep;

    .line 2754
    .line 2755
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2756
    .line 2757
    .line 2758
    if-nez v1, :cond_3e

    .line 2759
    .line 2760
    goto :goto_21

    .line 2761
    :cond_3e
    instance-of v0, v1, Ljava/net/SocketTimeoutException;

    .line 2762
    .line 2763
    if-eqz v0, :cond_3f

    .line 2764
    .line 2765
    goto :goto_20

    .line 2766
    :cond_3f
    instance-of v0, v1, Ljava/net/ConnectException;

    .line 2767
    .line 2768
    if-eqz v0, :cond_40

    .line 2769
    .line 2770
    goto :goto_20

    .line 2771
    :cond_40
    instance-of v0, v1, Ljava/net/UnknownHostException;

    .line 2772
    .line 2773
    if-eqz v0, :cond_41

    .line 2774
    .line 2775
    :goto_20
    move v13, v7

    .line 2776
    goto :goto_22

    .line 2777
    :cond_41
    :goto_21
    move v13, v8

    .line 2778
    :goto_22
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 2779
    .line 2780
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 2781
    .line 2782
    :cond_42
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v0

    .line 2786
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2787
    .line 2788
    .line 2789
    iget-object v3, v2, La/i3t0;->f:La/oyg0;

    .line 2790
    .line 2791
    move-object v9, v0

    .line 2792
    check-cast v9, La/e2p;

    .line 2793
    .line 2794
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2795
    .line 2796
    .line 2797
    xor-int/lit8 v14, v13, 0x1

    .line 2798
    .line 2799
    const/16 v19, 0x0

    .line 2800
    .line 2801
    const v20, 0xff39

    .line 2802
    .line 2803
    .line 2804
    const/4 v10, 0x0

    .line 2805
    const/4 v11, 0x0

    .line 2806
    const/4 v12, 0x0

    .line 2807
    const/4 v15, 0x0

    .line 2808
    const/16 v16, 0x0

    .line 2809
    .line 2810
    const/16 v17, 0x0

    .line 2811
    .line 2812
    const/16 v18, 0x0

    .line 2813
    .line 2814
    invoke-static/range {v9 .. v20}, La/e2p;->a(La/e2p;ZZZZZZLjava/util/List;Ljava/util/List;La/ot0;ZI)La/e2p;

    .line 2815
    .line 2816
    .line 2817
    move-result-object v3

    .line 2818
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2819
    .line 2820
    .line 2821
    move-result v0

    .line 2822
    if-eqz v0, :cond_42

    .line 2823
    .line 2824
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2825
    .line 2826
    return-object v0

    .line 2827
    :pswitch_16
    move-object/from16 v1, p1

    .line 2828
    .line 2829
    check-cast v1, Ljava/lang/Throwable;

    .line 2830
    .line 2831
    move-object/from16 v2, p2

    .line 2832
    .line 2833
    check-cast v2, La/yje;

    .line 2834
    .line 2835
    check-cast v0, Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 2836
    .line 2837
    iget-object v2, v0, Lorg/xplatform/favorites/impl/presentation/category/a;->B:La/duj;

    .line 2838
    .line 2839
    new-instance v3, La/q4p;

    .line 2840
    .line 2841
    invoke-direct {v3, v0, v7}, La/q4p;-><init>(Lorg/xplatform/favorites/impl/presentation/category/a;B)V

    .line 2842
    .line 2843
    .line 2844
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2845
    .line 2846
    .line 2847
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2848
    .line 2849
    return-object v0

    .line 2850
    :pswitch_17
    move-object/from16 v1, p1

    .line 2851
    .line 2852
    check-cast v1, Ljava/lang/Throwable;

    .line 2853
    .line 2854
    move-object/from16 v2, p2

    .line 2855
    .line 2856
    check-cast v2, La/yje;

    .line 2857
    .line 2858
    check-cast v0, La/duj;

    .line 2859
    .line 2860
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 2861
    .line 2862
    .line 2863
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2864
    .line 2865
    return-object v0

    .line 2866
    :pswitch_18
    move-object/from16 v1, p1

    .line 2867
    .line 2868
    check-cast v1, Ljava/lang/Throwable;

    .line 2869
    .line 2870
    move-object/from16 v2, p2

    .line 2871
    .line 2872
    check-cast v2, La/yje;

    .line 2873
    .line 2874
    check-cast v0, La/kin;

    .line 2875
    .line 2876
    invoke-virtual {v0, v1}, La/kin;->z(Ljava/lang/Throwable;)V

    .line 2877
    .line 2878
    .line 2879
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2880
    .line 2881
    return-object v0

    .line 2882
    :pswitch_19
    move-object/from16 v1, p1

    .line 2883
    .line 2884
    check-cast v1, Ljava/lang/Boolean;

    .line 2885
    .line 2886
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2887
    .line 2888
    .line 2889
    move-result v1

    .line 2890
    move-object/from16 v2, p2

    .line 2891
    .line 2892
    check-cast v2, La/yje;

    .line 2893
    .line 2894
    check-cast v0, La/whn;

    .line 2895
    .line 2896
    sget-object v2, La/whn;->O1:[La/iiy;

    .line 2897
    .line 2898
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 2899
    .line 2900
    .line 2901
    move-result-object v0

    .line 2902
    iget-object v0, v0, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 2903
    .line 2904
    invoke-virtual {v0, v1}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->v(Z)V

    .line 2905
    .line 2906
    .line 2907
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2908
    .line 2909
    return-object v0

    .line 2910
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2911
    .line 2912
    check-cast v1, La/bjn;

    .line 2913
    .line 2914
    move-object/from16 v2, p2

    .line 2915
    .line 2916
    check-cast v2, La/yje;

    .line 2917
    .line 2918
    check-cast v0, La/whn;

    .line 2919
    .line 2920
    sget-object v2, La/whn;->O1:[La/iiy;

    .line 2921
    .line 2922
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2923
    .line 2924
    .line 2925
    if-eqz v1, :cond_48

    .line 2926
    .line 2927
    instance-of v2, v1, La/ajn;

    .line 2928
    .line 2929
    if-eqz v2, :cond_43

    .line 2930
    .line 2931
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 2932
    .line 2933
    .line 2934
    move-result-object v1

    .line 2935
    iget-object v1, v1, La/uzq;->c:Landroid/widget/FrameLayout;

    .line 2936
    .line 2937
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2938
    .line 2939
    .line 2940
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 2941
    .line 2942
    .line 2943
    move-result-object v0

    .line 2944
    iget-object v0, v0, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 2945
    .line 2946
    invoke-virtual {v0}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->y()V

    .line 2947
    .line 2948
    .line 2949
    invoke-virtual {v0, v8}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->v(Z)V

    .line 2950
    .line 2951
    .line 2952
    goto/16 :goto_23

    .line 2953
    .line 2954
    :cond_43
    instance-of v2, v1, La/yin;

    .line 2955
    .line 2956
    if-eqz v2, :cond_44

    .line 2957
    .line 2958
    check-cast v1, La/yin;

    .line 2959
    .line 2960
    iget-object v1, v1, La/yin;->a:La/xhn;

    .line 2961
    .line 2962
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 2963
    .line 2964
    .line 2965
    move-result-object v2

    .line 2966
    iget-object v2, v2, La/uzq;->c:Landroid/widget/FrameLayout;

    .line 2967
    .line 2968
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 2969
    .line 2970
    .line 2971
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 2972
    .line 2973
    .line 2974
    move-result-object v0

    .line 2975
    iget-object v0, v0, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 2976
    .line 2977
    invoke-virtual {v0}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->u()V

    .line 2978
    .line 2979
    .line 2980
    invoke-virtual {v0, v1}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->z(La/xhn;)V

    .line 2981
    .line 2982
    .line 2983
    invoke-virtual {v0, v7}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->v(Z)V

    .line 2984
    .line 2985
    .line 2986
    goto :goto_23

    .line 2987
    :cond_44
    instance-of v2, v1, La/vin;

    .line 2988
    .line 2989
    if-eqz v2, :cond_45

    .line 2990
    .line 2991
    check-cast v1, La/vin;

    .line 2992
    .line 2993
    iget-object v1, v1, La/vin;->a:La/xhn;

    .line 2994
    .line 2995
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 2996
    .line 2997
    .line 2998
    move-result-object v0

    .line 2999
    iget-object v2, v0, La/uzq;->c:Landroid/widget/FrameLayout;

    .line 3000
    .line 3001
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3002
    .line 3003
    .line 3004
    iget-object v0, v0, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 3005
    .line 3006
    iget-object v2, v0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->s:Landroid/widget/Button;

    .line 3007
    .line 3008
    invoke-virtual {v2, v8}, Landroid/view/View;->setEnabled(Z)V

    .line 3009
    .line 3010
    .line 3011
    invoke-virtual {v0, v1}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->A(La/xhn;)V

    .line 3012
    .line 3013
    .line 3014
    goto :goto_23

    .line 3015
    :cond_45
    instance-of v2, v1, La/win;

    .line 3016
    .line 3017
    if-eqz v2, :cond_46

    .line 3018
    .line 3019
    check-cast v1, La/win;

    .line 3020
    .line 3021
    iget-object v1, v1, La/win;->a:La/xhn;

    .line 3022
    .line 3023
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 3024
    .line 3025
    .line 3026
    move-result-object v0

    .line 3027
    iget-object v2, v0, La/uzq;->c:Landroid/widget/FrameLayout;

    .line 3028
    .line 3029
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3030
    .line 3031
    .line 3032
    iget-object v0, v0, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 3033
    .line 3034
    iget-object v2, v0, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->s:Landroid/widget/Button;

    .line 3035
    .line 3036
    invoke-virtual {v2, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 3037
    .line 3038
    .line 3039
    invoke-virtual {v0, v7}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->v(Z)V

    .line 3040
    .line 3041
    .line 3042
    invoke-virtual {v0, v1}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->D(La/xhn;)V

    .line 3043
    .line 3044
    .line 3045
    goto :goto_23

    .line 3046
    :cond_46
    instance-of v2, v1, La/xin;

    .line 3047
    .line 3048
    if-eqz v2, :cond_47

    .line 3049
    .line 3050
    check-cast v1, La/xin;

    .line 3051
    .line 3052
    iget-object v1, v1, La/xin;->a:La/xhn;

    .line 3053
    .line 3054
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 3055
    .line 3056
    .line 3057
    move-result-object v2

    .line 3058
    iget-object v2, v2, La/uzq;->c:Landroid/widget/FrameLayout;

    .line 3059
    .line 3060
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3061
    .line 3062
    .line 3063
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 3064
    .line 3065
    .line 3066
    move-result-object v0

    .line 3067
    iget-object v0, v0, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 3068
    .line 3069
    invoke-virtual {v0, v1}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->D(La/xhn;)V

    .line 3070
    .line 3071
    .line 3072
    invoke-virtual {v0, v8}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->C(Z)V

    .line 3073
    .line 3074
    .line 3075
    invoke-virtual {v0, v8}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->v(Z)V

    .line 3076
    .line 3077
    .line 3078
    invoke-virtual {v0, v1}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->B(La/xhn;)V

    .line 3079
    .line 3080
    .line 3081
    goto :goto_23

    .line 3082
    :cond_47
    instance-of v1, v1, La/zin;

    .line 3083
    .line 3084
    if-eqz v1, :cond_48

    .line 3085
    .line 3086
    invoke-virtual {v0}, La/whn;->G0()La/uzq;

    .line 3087
    .line 3088
    .line 3089
    move-result-object v0

    .line 3090
    iget-object v0, v0, La/uzq;->c:Landroid/widget/FrameLayout;

    .line 3091
    .line 3092
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 3093
    .line 3094
    .line 3095
    :goto_23
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3096
    .line 3097
    goto :goto_24

    .line 3098
    :cond_48
    invoke-static {}, La/t9f;->b()V

    .line 3099
    .line 3100
    .line 3101
    :goto_24
    return-object v9

    .line 3102
    :pswitch_1b
    move-object/from16 v1, p1

    .line 3103
    .line 3104
    check-cast v1, Ljava/lang/Throwable;

    .line 3105
    .line 3106
    move-object/from16 v2, p2

    .line 3107
    .line 3108
    check-cast v2, La/yje;

    .line 3109
    .line 3110
    check-cast v0, La/cgl;

    .line 3111
    .line 3112
    invoke-virtual {v0, v1}, La/cgl;->B(Ljava/lang/Throwable;)V

    .line 3113
    .line 3114
    .line 3115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3116
    .line 3117
    return-object v0

    .line 3118
    :pswitch_1c
    move-object/from16 v1, p1

    .line 3119
    .line 3120
    check-cast v1, La/tgl;

    .line 3121
    .line 3122
    move-object/from16 v2, p2

    .line 3123
    .line 3124
    check-cast v2, La/yje;

    .line 3125
    .line 3126
    check-cast v0, La/qfl;

    .line 3127
    .line 3128
    sget-object v2, La/qfl;->O1:[La/iiy;

    .line 3129
    .line 3130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3131
    .line 3132
    .line 3133
    if-eqz v1, :cond_4f

    .line 3134
    .line 3135
    instance-of v2, v1, La/sgl;

    .line 3136
    .line 3137
    if-eqz v2, :cond_49

    .line 3138
    .line 3139
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 3140
    .line 3141
    .line 3142
    move-result-object v0

    .line 3143
    iget-object v1, v0, La/tzq;->c:Landroid/widget/FrameLayout;

    .line 3144
    .line 3145
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3146
    .line 3147
    .line 3148
    iget-object v0, v0, La/tzq;->b:Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    .line 3149
    .line 3150
    invoke-virtual {v0}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->y()V

    .line 3151
    .line 3152
    .line 3153
    invoke-virtual {v0, v8}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->v(Z)V

    .line 3154
    .line 3155
    .line 3156
    goto/16 :goto_25

    .line 3157
    .line 3158
    :cond_49
    instance-of v2, v1, La/qgl;

    .line 3159
    .line 3160
    if-eqz v2, :cond_4a

    .line 3161
    .line 3162
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 3163
    .line 3164
    .line 3165
    move-result-object v0

    .line 3166
    iget-object v0, v0, La/tzq;->c:Landroid/widget/FrameLayout;

    .line 3167
    .line 3168
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 3169
    .line 3170
    .line 3171
    goto/16 :goto_25

    .line 3172
    .line 3173
    :cond_4a
    instance-of v2, v1, La/pgl;

    .line 3174
    .line 3175
    if-eqz v2, :cond_4b

    .line 3176
    .line 3177
    check-cast v1, La/pgl;

    .line 3178
    .line 3179
    iget-object v1, v1, La/pgl;->a:La/ugl;

    .line 3180
    .line 3181
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 3182
    .line 3183
    .line 3184
    move-result-object v0

    .line 3185
    iget-object v2, v0, La/tzq;->c:Landroid/widget/FrameLayout;

    .line 3186
    .line 3187
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3188
    .line 3189
    .line 3190
    iget-object v0, v0, La/tzq;->b:Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    .line 3191
    .line 3192
    invoke-virtual {v0}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->u()V

    .line 3193
    .line 3194
    .line 3195
    invoke-virtual {v0, v1}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->D(La/ugl;)V

    .line 3196
    .line 3197
    .line 3198
    invoke-virtual {v0, v7}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->v(Z)V

    .line 3199
    .line 3200
    .line 3201
    goto/16 :goto_25

    .line 3202
    .line 3203
    :cond_4b
    instance-of v2, v1, La/mgl;

    .line 3204
    .line 3205
    if-eqz v2, :cond_4c

    .line 3206
    .line 3207
    check-cast v1, La/mgl;

    .line 3208
    .line 3209
    iget-object v1, v1, La/mgl;->a:La/ugl;

    .line 3210
    .line 3211
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 3212
    .line 3213
    .line 3214
    move-result-object v0

    .line 3215
    iget-object v2, v0, La/tzq;->c:Landroid/widget/FrameLayout;

    .line 3216
    .line 3217
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3218
    .line 3219
    .line 3220
    iget-object v0, v0, La/tzq;->b:Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    .line 3221
    .line 3222
    iget-object v2, v0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->s:Landroid/widget/Button;

    .line 3223
    .line 3224
    invoke-virtual {v2, v8}, Landroid/view/View;->setEnabled(Z)V

    .line 3225
    .line 3226
    .line 3227
    invoke-virtual {v0, v1}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->z(La/ugl;)V

    .line 3228
    .line 3229
    .line 3230
    goto :goto_25

    .line 3231
    :cond_4c
    instance-of v2, v1, La/ngl;

    .line 3232
    .line 3233
    if-eqz v2, :cond_4d

    .line 3234
    .line 3235
    check-cast v1, La/ngl;

    .line 3236
    .line 3237
    iget-object v1, v1, La/ngl;->a:La/ugl;

    .line 3238
    .line 3239
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 3240
    .line 3241
    .line 3242
    move-result-object v0

    .line 3243
    iget-object v2, v0, La/tzq;->c:Landroid/widget/FrameLayout;

    .line 3244
    .line 3245
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3246
    .line 3247
    .line 3248
    iget-object v0, v0, La/tzq;->b:Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    .line 3249
    .line 3250
    iget-object v2, v0, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->s:Landroid/widget/Button;

    .line 3251
    .line 3252
    invoke-virtual {v2, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 3253
    .line 3254
    .line 3255
    invoke-virtual {v0, v1}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->D(La/ugl;)V

    .line 3256
    .line 3257
    .line 3258
    invoke-virtual {v0, v7}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->v(Z)V

    .line 3259
    .line 3260
    .line 3261
    goto :goto_25

    .line 3262
    :cond_4d
    instance-of v2, v1, La/ogl;

    .line 3263
    .line 3264
    if-eqz v2, :cond_4e

    .line 3265
    .line 3266
    check-cast v1, La/ogl;

    .line 3267
    .line 3268
    iget-object v1, v1, La/ogl;->a:La/ugl;

    .line 3269
    .line 3270
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 3271
    .line 3272
    .line 3273
    move-result-object v2

    .line 3274
    iget-object v2, v2, La/tzq;->c:Landroid/widget/FrameLayout;

    .line 3275
    .line 3276
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3277
    .line 3278
    .line 3279
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 3280
    .line 3281
    .line 3282
    move-result-object v0

    .line 3283
    iget-object v0, v0, La/tzq;->b:Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    .line 3284
    .line 3285
    invoke-virtual {v0, v8}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->C(Z)V

    .line 3286
    .line 3287
    .line 3288
    invoke-virtual {v0, v8}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->v(Z)V

    .line 3289
    .line 3290
    .line 3291
    invoke-virtual {v0, v1}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->A(La/ugl;)V

    .line 3292
    .line 3293
    .line 3294
    goto :goto_25

    .line 3295
    :cond_4e
    instance-of v2, v1, La/rgl;

    .line 3296
    .line 3297
    if-eqz v2, :cond_4f

    .line 3298
    .line 3299
    check-cast v1, La/rgl;

    .line 3300
    .line 3301
    iget-object v1, v1, La/rgl;->a:La/ugl;

    .line 3302
    .line 3303
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 3304
    .line 3305
    .line 3306
    move-result-object v2

    .line 3307
    iget-object v2, v2, La/tzq;->c:Landroid/widget/FrameLayout;

    .line 3308
    .line 3309
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 3310
    .line 3311
    .line 3312
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 3313
    .line 3314
    .line 3315
    move-result-object v0

    .line 3316
    iget-object v0, v0, La/tzq;->b:Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    .line 3317
    .line 3318
    invoke-virtual {v0, v1}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->D(La/ugl;)V

    .line 3319
    .line 3320
    .line 3321
    invoke-virtual {v0, v8}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->C(Z)V

    .line 3322
    .line 3323
    .line 3324
    invoke-virtual {v0, v8}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->v(Z)V

    .line 3325
    .line 3326
    .line 3327
    invoke-virtual {v0}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->B()V

    .line 3328
    .line 3329
    .line 3330
    invoke-virtual {v0, v1}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->A(La/ugl;)V

    .line 3331
    .line 3332
    .line 3333
    :goto_25
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3334
    .line 3335
    goto :goto_26

    .line 3336
    :cond_4f
    invoke-static {}, La/t9f;->b()V

    .line 3337
    .line 3338
    .line 3339
    :goto_26
    return-object v9

    .line 3340
    nop

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
