.class public final synthetic La/huh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/huh0;->a:B

    iput-object p1, p0, La/huh0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/huh0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/huh0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, v0, La/huh0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v0, v0, La/huh0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v0, La/pz40;

    .line 17
    .line 18
    check-cast v6, La/ngk0;

    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/j6z;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    const-wide/16 v4, 0x1

    .line 38
    .line 39
    add-long/2addr v2, v4

    .line 40
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v0, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const-string v0, "Filter"

    .line 48
    .line 49
    invoke-virtual {v6, v0, v1}, La/ngk0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_0
    check-cast v0, La/yj5;

    .line 56
    .line 57
    check-cast v6, La/cp;

    .line 58
    .line 59
    move-object/from16 v1, p1

    .line 60
    .line 61
    check-cast v1, Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, La/p3l0;

    .line 71
    .line 72
    iget v1, v1, La/p3l0;->a:I

    .line 73
    .line 74
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, La/yj5;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_1
    check-cast v0, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 85
    .line 86
    check-cast v6, Landroid/content/Context;

    .line 87
    .line 88
    move-object/from16 v1, p1

    .line 89
    .line 90
    check-cast v1, Landroid/content/res/TypedArray;

    .line 91
    .line 92
    invoke-static {v0, v6, v1}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->a(Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;Landroid/content/Context;Landroid/content/res/TypedArray;)Lkotlin/Unit;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :pswitch_2
    check-cast v0, La/y3d;

    .line 98
    .line 99
    check-cast v6, La/pz40;

    .line 100
    .line 101
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, La/kz3;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    if-eqz v0, :cond_0

    .line 109
    .line 110
    iget-wide v0, v0, La/y3d;->a:J

    .line 111
    .line 112
    new-instance v2, La/m78;

    .line 113
    .line 114
    const/4 v3, 0x5

    .line 115
    invoke-direct {v2, v0, v1, v3}, La/m78;-><init>(JI)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v6, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_3
    check-cast v0, La/hyk0;

    .line 125
    .line 126
    check-cast v6, La/x4r;

    .line 127
    .line 128
    move-object/from16 v1, p1

    .line 129
    .line 130
    check-cast v1, Landroid/view/View;

    .line 131
    .line 132
    sget-object v3, La/hyk0;->U1:[La/iiy;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    if-eqz v1, :cond_1

    .line 146
    .line 147
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iget-object v3, v6, La/x4r;->c:Landroidx/appcompat/widget/AppCompatButton;

    .line 152
    .line 153
    new-instance v6, La/t32;

    .line 154
    .line 155
    const/16 v7, 0x1c

    .line 156
    .line 157
    invoke-direct {v6, v7}, La/t32;-><init>(B)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    new-instance v7, Landroid/os/Handler;

    .line 165
    .line 166
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    invoke-direct {v7, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 171
    .line 172
    .line 173
    new-instance v8, La/b1;

    .line 174
    .line 175
    invoke-direct {v8, v1, v3, v6, v2}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 176
    .line 177
    .line 178
    const-wide/16 v1, 0x0

    .line 179
    .line 180
    invoke-virtual {v7, v8, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 181
    .line 182
    .line 183
    :cond_1
    invoke-virtual {v0}, La/hyk0;->H0()La/tyk0;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    iget-object v0, v11, La/tyk0;->w:La/lzt;

    .line 188
    .line 189
    invoke-virtual {v0}, La/lzt;->a()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_2

    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_2
    iget-object v0, v11, La/tyk0;->t:La/spx;

    .line 197
    .line 198
    invoke-virtual {v0}, La/spx;->a()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_3

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_3
    iget-object v0, v11, La/tyk0;->h:La/fpi0;

    .line 206
    .line 207
    invoke-virtual {v0, v4}, La/fpi0;->a(Z)V

    .line 208
    .line 209
    .line 210
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    new-instance v9, La/gvj0;

    .line 215
    .line 216
    const/4 v15, 0x0

    .line 217
    const/16 v16, 0x1b

    .line 218
    .line 219
    const/4 v10, 0x1

    .line 220
    const-class v12, La/tyk0;

    .line 221
    .line 222
    const-string v13, "handleGameError"

    .line 223
    .line 224
    const-string v14, "handleGameError(Ljava/lang/Throwable;)V"

    .line 225
    .line 226
    invoke-direct/range {v9 .. v16}, La/gvj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 227
    .line 228
    .line 229
    iget-object v1, v11, La/tyk0;->v:La/mne;

    .line 230
    .line 231
    iget-object v15, v1, La/mne;->b:La/dvj;

    .line 232
    .line 233
    new-instance v1, La/syk0;

    .line 234
    .line 235
    invoke-direct {v1, v11, v5, v4}, La/syk0;-><init>(La/tyk0;La/yje;B)V

    .line 236
    .line 237
    .line 238
    const/16 v17, 0xa

    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    move-object v12, v0

    .line 242
    move-object/from16 v16, v1

    .line 243
    .line 244
    move-object v13, v9

    .line 245
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 246
    .line 247
    .line 248
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_4
    check-cast v0, La/wma0;

    .line 252
    .line 253
    check-cast v6, La/cp;

    .line 254
    .line 255
    move-object/from16 v1, p1

    .line 256
    .line 257
    check-cast v1, Landroid/view/View;

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v0, v1}, La/wma0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object v0

    .line 272
    :pswitch_5
    check-cast v0, La/lik0;

    .line 273
    .line 274
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 275
    .line 276
    move-object/from16 v1, p1

    .line 277
    .line 278
    check-cast v1, La/cik0;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget-object v2, v1, La/cik0;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 284
    .line 285
    iget v3, v0, La/lik0;->b:I

    .line 286
    .line 287
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconResource(I)V

    .line 288
    .line 289
    .line 290
    iget-object v2, v1, La/cik0;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 291
    .line 292
    iget-object v3, v0, La/lik0;->a:Ljava/lang/String;

    .line 293
    .line 294
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 295
    .line 296
    .line 297
    iget-object v1, v1, La/cik0;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 298
    .line 299
    new-instance v2, La/bs50;

    .line 300
    .line 301
    const/16 v3, 0x8

    .line 302
    .line 303
    invoke-direct {v2, v6, v0, v3}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 307
    .line 308
    .line 309
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object v0

    .line 312
    :pswitch_6
    check-cast v0, La/qah0;

    .line 313
    .line 314
    check-cast v6, La/jie0;

    .line 315
    .line 316
    move-object/from16 v1, p1

    .line 317
    .line 318
    check-cast v1, La/i73;

    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    iget-object v1, v1, La/i73;->e:La/pz40;

    .line 324
    .line 325
    check-cast v1, La/hgk0;

    .line 326
    .line 327
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    check-cast v2, Ljava/lang/Number;

    .line 332
    .line 333
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    iget v3, v6, La/jie0;->a:F

    .line 338
    .line 339
    sub-float/2addr v2, v3

    .line 340
    invoke-interface {v0, v2}, La/qah0;->a(F)F

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, Ljava/lang/Number;

    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    iput v0, v6, La/jie0;->a:F

    .line 354
    .line 355
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_7
    check-cast v0, La/x3k0;

    .line 359
    .line 360
    check-cast v6, La/ctf0;

    .line 361
    .line 362
    move-object/from16 v1, p1

    .line 363
    .line 364
    check-cast v1, La/z3k0;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iget-object v0, v0, La/x3k0;->b:La/h3m0;

    .line 370
    .line 371
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    sget-object v2, La/g3m0;->a:La/g3m0;

    .line 375
    .line 376
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    if-eqz v2, :cond_4

    .line 381
    .line 382
    const v0, 0x7f131334

    .line 383
    .line 384
    .line 385
    goto :goto_1

    .line 386
    :cond_4
    sget-object v2, La/f3m0;->a:La/f3m0;

    .line 387
    .line 388
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_6

    .line 393
    .line 394
    const v0, 0x7f131330

    .line 395
    .line 396
    .line 397
    :goto_1
    new-instance v2, La/a4k0;

    .line 398
    .line 399
    iget-boolean v1, v1, La/z3k0;->a:Z

    .line 400
    .line 401
    if-eqz v1, :cond_5

    .line 402
    .line 403
    new-instance v7, La/hjm;

    .line 404
    .line 405
    new-array v1, v3, [Ljava/lang/Object;

    .line 406
    .line 407
    iget-object v4, v6, La/ctf0;->b:La/lsm0;

    .line 408
    .line 409
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-virtual {v4, v0, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v8

    .line 417
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 418
    .line 419
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 424
    .line 425
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 426
    .line 427
    .line 428
    move-result-wide v0

    .line 429
    new-instance v10, La/y3d;

    .line 430
    .line 431
    invoke-direct {v10, v0, v1}, La/y3d;-><init>(J)V

    .line 432
    .line 433
    .line 434
    const/16 v19, 0x0

    .line 435
    .line 436
    const/16 v20, 0x1ffa

    .line 437
    .line 438
    const/4 v9, 0x0

    .line 439
    const/4 v11, 0x0

    .line 440
    const/4 v12, 0x0

    .line 441
    const/4 v13, 0x0

    .line 442
    const/4 v14, 0x0

    .line 443
    const/4 v15, 0x0

    .line 444
    const/16 v16, 0x0

    .line 445
    .line 446
    const/16 v17, 0x0

    .line 447
    .line 448
    const/16 v18, 0x0

    .line 449
    .line 450
    invoke-direct/range {v7 .. v20}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 451
    .line 452
    .line 453
    move-object v5, v7

    .line 454
    :cond_5
    invoke-direct {v2, v5}, La/a4k0;-><init>(La/hjm;)V

    .line 455
    .line 456
    .line 457
    move-object v5, v2

    .line 458
    goto :goto_2

    .line 459
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 460
    .line 461
    .line 462
    :goto_2
    return-object v5

    .line 463
    :pswitch_8
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 464
    .line 465
    check-cast v6, La/r370;

    .line 466
    .line 467
    move-object/from16 v1, p1

    .line 468
    .line 469
    check-cast v1, Ljava/lang/String;

    .line 470
    .line 471
    invoke-interface {v0, v6, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 475
    .line 476
    return-object v0

    .line 477
    :pswitch_9
    move-object v2, v0

    .line 478
    check-cast v2, La/pu90;

    .line 479
    .line 480
    check-cast v6, La/gyj0;

    .line 481
    .line 482
    move-object/from16 v1, p1

    .line 483
    .line 484
    check-cast v1, La/ou90;

    .line 485
    .line 486
    iget-object v5, v6, La/gyj0;->j1:La/rai0;

    .line 487
    .line 488
    const/4 v6, 0x4

    .line 489
    const/4 v3, 0x0

    .line 490
    const/4 v4, 0x0

    .line 491
    invoke-static/range {v1 .. v6}, La/ou90;->F(La/ou90;La/pu90;IILkotlin/jvm/functions/Function1;I)V

    .line 492
    .line 493
    .line 494
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 495
    .line 496
    return-object v0

    .line 497
    :pswitch_a
    check-cast v0, La/xxj0;

    .line 498
    .line 499
    move-object v9, v6

    .line 500
    check-cast v9, Ljava/lang/String;

    .line 501
    .line 502
    move-object/from16 v1, p1

    .line 503
    .line 504
    check-cast v1, La/m97;

    .line 505
    .line 506
    iget-object v2, v0, La/xxj0;->I:La/loi0;

    .line 507
    .line 508
    iget-boolean v1, v1, La/m97;->d:Z

    .line 509
    .line 510
    iget-object v2, v2, La/loi0;->a:La/h03;

    .line 511
    .line 512
    iget-object v2, v2, La/h03;->b:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v2, La/nb7;

    .line 515
    .line 516
    iput-boolean v1, v2, La/nb7;->b:Z

    .line 517
    .line 518
    iget-object v0, v0, La/xxj0;->q0:La/ol60;

    .line 519
    .line 520
    new-instance v1, La/tuj0;

    .line 521
    .line 522
    new-instance v7, La/xdk0;

    .line 523
    .line 524
    sget-object v8, La/rek0;->b:La/rek0;

    .line 525
    .line 526
    sget-object v12, La/jdk0;->a:La/jdk0;

    .line 527
    .line 528
    const/4 v13, 0x0

    .line 529
    const/16 v14, 0x6c

    .line 530
    .line 531
    const/4 v10, 0x0

    .line 532
    const/4 v11, 0x0

    .line 533
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 534
    .line 535
    .line 536
    invoke-direct {v1, v7}, La/tuj0;-><init>(La/xdk0;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 543
    .line 544
    return-object v0

    .line 545
    :pswitch_b
    check-cast v0, La/txu;

    .line 546
    .line 547
    check-cast v6, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 548
    .line 549
    move-object/from16 v7, p1

    .line 550
    .line 551
    check-cast v7, La/bnk0;

    .line 552
    .line 553
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    iget-wide v0, v0, La/txu;->i:D

    .line 557
    .line 558
    const-wide/16 v2, 0x0

    .line 559
    .line 560
    cmpl-double v4, v0, v2

    .line 561
    .line 562
    if-lez v4, :cond_7

    .line 563
    .line 564
    sget v2, La/cy7;->a:I

    .line 565
    .line 566
    sget-object v2, La/pn40;->a:La/pn40;

    .line 567
    .line 568
    iget-object v2, v6, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 569
    .line 570
    invoke-static {v2, v0, v1}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-static {v0}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v8

    .line 578
    const/4 v12, 0x0

    .line 579
    const/16 v13, 0x36

    .line 580
    .line 581
    const/4 v9, 0x0

    .line 582
    const v10, 0x7f0606c1

    .line 583
    .line 584
    .line 585
    const/4 v11, 0x0

    .line 586
    invoke-static/range {v7 .. v13}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 587
    .line 588
    .line 589
    goto :goto_3

    .line 590
    :cond_7
    cmpg-double v2, v0, v2

    .line 591
    .line 592
    if-gez v2, :cond_8

    .line 593
    .line 594
    sget v2, La/cy7;->a:I

    .line 595
    .line 596
    sget-object v2, La/pn40;->a:La/pn40;

    .line 597
    .line 598
    iget-object v2, v6, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 599
    .line 600
    invoke-static {v2, v0, v1}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-static {v0}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v8

    .line 608
    const/4 v12, 0x0

    .line 609
    const/16 v13, 0x3e

    .line 610
    .line 611
    const/4 v9, 0x0

    .line 612
    const/4 v10, 0x0

    .line 613
    const/4 v11, 0x0

    .line 614
    invoke-static/range {v7 .. v13}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 615
    .line 616
    .line 617
    :cond_8
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 618
    .line 619
    return-object v0

    .line 620
    :pswitch_c
    check-cast v0, La/goi0;

    .line 621
    .line 622
    check-cast v6, La/nmo0;

    .line 623
    .line 624
    move-object/from16 v1, p1

    .line 625
    .line 626
    check-cast v1, La/cp;

    .line 627
    .line 628
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    new-instance v3, La/nej0;

    .line 632
    .line 633
    invoke-direct {v3, v1, v0, v6, v2}, La/nej0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v1, v3}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 637
    .line 638
    .line 639
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    return-object v0

    .line 642
    :pswitch_d
    check-cast v0, La/ngj0;

    .line 643
    .line 644
    check-cast v6, La/nqh0;

    .line 645
    .line 646
    move-object/from16 v1, p1

    .line 647
    .line 648
    check-cast v1, La/k0w0;

    .line 649
    .line 650
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    iget-object v0, v0, La/ngj0;->D0:La/iw20;

    .line 654
    .line 655
    invoke-static {v0, v6}, La/iw20;->f(La/iw20;La/nqh0;)Lorg/xplatform/security/impl/navigation/SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v0, La/c8d;

    .line 666
    .line 667
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 668
    .line 669
    new-instance v2, La/bjk;

    .line 670
    .line 671
    invoke-direct {v2, v5, v3, v3, v4}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 672
    .line 673
    .line 674
    new-instance v3, La/v7d;

    .line 675
    .line 676
    invoke-direct {v3, v4, v2, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 677
    .line 678
    .line 679
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 680
    .line 681
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 682
    .line 683
    return-object v0

    .line 684
    :pswitch_e
    check-cast v0, La/ngj0;

    .line 685
    .line 686
    check-cast v6, La/swp0;

    .line 687
    .line 688
    move-object/from16 v1, p1

    .line 689
    .line 690
    check-cast v1, La/k0w0;

    .line 691
    .line 692
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    iget-object v0, v0, La/ngj0;->W:La/nh70;

    .line 696
    .line 697
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 698
    .line 699
    .line 700
    new-instance v0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1;

    .line 701
    .line 702
    invoke-direct {v0, v6}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1;-><init>(La/swp0;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 706
    .line 707
    .line 708
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 709
    .line 710
    return-object v0

    .line 711
    :pswitch_f
    check-cast v0, La/ngj0;

    .line 712
    .line 713
    check-cast v6, La/uu4;

    .line 714
    .line 715
    move-object/from16 v1, p1

    .line 716
    .line 717
    check-cast v1, Ljava/lang/Throwable;

    .line 718
    .line 719
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    new-instance v2, La/mej0;

    .line 723
    .line 724
    const/16 v3, 0x19

    .line 725
    .line 726
    invoke-direct {v2, v3}, La/mej0;-><init>(B)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v0, v1, v6}, La/ngj0;->Q(Ljava/lang/Throwable;La/uu4;)V

    .line 733
    .line 734
    .line 735
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 736
    .line 737
    return-object v0

    .line 738
    :pswitch_10
    check-cast v0, Lorg/xplatform/settings/impl/presentation/a;

    .line 739
    .line 740
    check-cast v6, La/swp0;

    .line 741
    .line 742
    move-object/from16 v1, p1

    .line 743
    .line 744
    check-cast v1, La/k0w0;

    .line 745
    .line 746
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->G:La/nh70;

    .line 750
    .line 751
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    new-instance v0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1;

    .line 755
    .line 756
    invoke-direct {v0, v6}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1;-><init>(La/swp0;)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 760
    .line 761
    .line 762
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 763
    .line 764
    return-object v0

    .line 765
    :pswitch_11
    move-object v1, v0

    .line 766
    check-cast v1, Lorg/xplatform/settings/impl/presentation/a;

    .line 767
    .line 768
    move-object v2, v6

    .line 769
    check-cast v2, La/uu4;

    .line 770
    .line 771
    move-object/from16 v7, p1

    .line 772
    .line 773
    check-cast v7, Ljava/lang/Throwable;

    .line 774
    .line 775
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    iget-object v8, v1, Lorg/xplatform/settings/impl/presentation/a;->X0:La/p7m0;

    .line 779
    .line 780
    :cond_9
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    move-object v9, v0

    .line 785
    check-cast v9, La/caj0;

    .line 786
    .line 787
    const/16 v31, 0x0

    .line 788
    .line 789
    const v32, 0x1fffffe

    .line 790
    .line 791
    .line 792
    const/4 v10, 0x0

    .line 793
    const/4 v11, 0x0

    .line 794
    const/4 v12, 0x0

    .line 795
    const/4 v13, 0x0

    .line 796
    const/4 v14, 0x0

    .line 797
    const/4 v15, 0x0

    .line 798
    const/16 v16, 0x0

    .line 799
    .line 800
    const/16 v17, 0x0

    .line 801
    .line 802
    const/16 v18, 0x0

    .line 803
    .line 804
    const/16 v19, 0x0

    .line 805
    .line 806
    const/16 v20, 0x0

    .line 807
    .line 808
    const/16 v21, 0x0

    .line 809
    .line 810
    const/16 v22, 0x0

    .line 811
    .line 812
    const/16 v23, 0x0

    .line 813
    .line 814
    const/16 v24, 0x0

    .line 815
    .line 816
    const/16 v25, 0x0

    .line 817
    .line 818
    const/16 v26, 0x0

    .line 819
    .line 820
    const/16 v27, 0x0

    .line 821
    .line 822
    const/16 v28, 0x0

    .line 823
    .line 824
    const/16 v29, 0x0

    .line 825
    .line 826
    const/16 v30, 0x0

    .line 827
    .line 828
    invoke-static/range {v9 .. v32}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    invoke-virtual {v8, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    move-result v0

    .line 836
    if-eqz v0, :cond_9

    .line 837
    .line 838
    invoke-virtual {v1, v7, v2}, Lorg/xplatform/settings/impl/presentation/a;->B(Ljava/lang/Throwable;La/uu4;)V

    .line 839
    .line 840
    .line 841
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 842
    .line 843
    return-object v0

    .line 844
    :pswitch_12
    check-cast v0, Lorg/xplatform/settings/impl/presentation/a;

    .line 845
    .line 846
    check-cast v6, La/nqh0;

    .line 847
    .line 848
    move-object/from16 v1, p1

    .line 849
    .line 850
    check-cast v1, La/k0w0;

    .line 851
    .line 852
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 853
    .line 854
    .line 855
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->q0:La/iw20;

    .line 856
    .line 857
    invoke-static {v0, v6}, La/iw20;->f(La/iw20;La/nqh0;)Lorg/xplatform/security/impl/navigation/SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v0, La/c8d;

    .line 868
    .line 869
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 870
    .line 871
    new-instance v2, La/bjk;

    .line 872
    .line 873
    invoke-direct {v2, v5, v3, v3, v4}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 874
    .line 875
    .line 876
    new-instance v3, La/v7d;

    .line 877
    .line 878
    invoke-direct {v3, v4, v1, v2}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 879
    .line 880
    .line 881
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 882
    .line 883
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 884
    .line 885
    return-object v0

    .line 886
    :pswitch_13
    check-cast v0, La/odj0;

    .line 887
    .line 888
    check-cast v6, La/swp0;

    .line 889
    .line 890
    move-object/from16 v1, p1

    .line 891
    .line 892
    check-cast v1, La/k0w0;

    .line 893
    .line 894
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    iget-object v0, v0, La/odj0;->U:La/nh70;

    .line 898
    .line 899
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    new-instance v0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1;

    .line 903
    .line 904
    invoke-direct {v0, v6}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1;-><init>(La/swp0;)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 908
    .line 909
    .line 910
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 911
    .line 912
    return-object v0

    .line 913
    :pswitch_14
    check-cast v0, La/odj0;

    .line 914
    .line 915
    check-cast v6, La/uu4;

    .line 916
    .line 917
    move-object/from16 v1, p1

    .line 918
    .line 919
    check-cast v1, Ljava/lang/Throwable;

    .line 920
    .line 921
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    new-instance v2, La/r3j0;

    .line 925
    .line 926
    const/16 v3, 0x16

    .line 927
    .line 928
    invoke-direct {v2, v3}, La/r3j0;-><init>(B)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v0, v1, v6}, La/odj0;->O(Ljava/lang/Throwable;La/uu4;)V

    .line 935
    .line 936
    .line 937
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 938
    .line 939
    return-object v0

    .line 940
    :pswitch_15
    check-cast v0, La/xxi0;

    .line 941
    .line 942
    check-cast v6, La/swp0;

    .line 943
    .line 944
    move-object/from16 v1, p1

    .line 945
    .line 946
    check-cast v1, La/k0w0;

    .line 947
    .line 948
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    iget-object v0, v0, La/xxi0;->V:La/nh70;

    .line 952
    .line 953
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 954
    .line 955
    .line 956
    new-instance v0, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1;

    .line 957
    .line 958
    invoke-direct {v0, v6}, Lorg/xplatform/authqr/impl/qr/navigation/QrAuthScreenFactoryImpl$qrSendConfirmationMailScreen$1;-><init>(La/swp0;)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 962
    .line 963
    .line 964
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 965
    .line 966
    return-object v0

    .line 967
    :pswitch_16
    check-cast v0, La/xxi0;

    .line 968
    .line 969
    check-cast v6, La/uu4;

    .line 970
    .line 971
    move-object/from16 v1, p1

    .line 972
    .line 973
    check-cast v1, Ljava/lang/Throwable;

    .line 974
    .line 975
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    new-instance v2, La/kui0;

    .line 979
    .line 980
    const/16 v3, 0x12

    .line 981
    .line 982
    invoke-direct {v2, v3}, La/kui0;-><init>(B)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v0, v2}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v0, v1, v6}, La/xxi0;->Q(Ljava/lang/Throwable;La/uu4;)V

    .line 989
    .line 990
    .line 991
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 992
    .line 993
    return-object v0

    .line 994
    :pswitch_17
    check-cast v0, La/xxi0;

    .line 995
    .line 996
    check-cast v6, La/nqh0;

    .line 997
    .line 998
    move-object/from16 v1, p1

    .line 999
    .line 1000
    check-cast v1, La/k0w0;

    .line 1001
    .line 1002
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    iget-object v0, v0, La/xxi0;->D0:La/iw20;

    .line 1006
    .line 1007
    invoke-static {v0, v6}, La/iw20;->f(La/iw20;La/nqh0;)Lorg/xplatform/security/impl/navigation/SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1016
    .line 1017
    check-cast v0, La/c8d;

    .line 1018
    .line 1019
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1020
    .line 1021
    new-instance v2, La/bjk;

    .line 1022
    .line 1023
    invoke-direct {v2, v5, v3, v3, v4}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 1024
    .line 1025
    .line 1026
    new-instance v3, La/v7d;

    .line 1027
    .line 1028
    invoke-direct {v3, v4, v1, v2}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1029
    .line 1030
    .line 1031
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 1032
    .line 1033
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1034
    .line 1035
    return-object v0

    .line 1036
    :pswitch_18
    check-cast v0, La/tti0;

    .line 1037
    .line 1038
    check-cast v6, La/vne;

    .line 1039
    .line 1040
    move-object/from16 v1, p1

    .line 1041
    .line 1042
    check-cast v1, Ljava/lang/Throwable;

    .line 1043
    .line 1044
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 1048
    .line 1049
    .line 1050
    iget-object v2, v0, La/tti0;->g:La/p7m0;

    .line 1051
    .line 1052
    sget-object v3, La/i8d;->e:La/i8d;

    .line 1053
    .line 1054
    invoke-virtual {v2, v5, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v0, v1, v6}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 1058
    .line 1059
    .line 1060
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1061
    .line 1062
    return-object v0

    .line 1063
    :pswitch_19
    check-cast v0, La/uki0;

    .line 1064
    .line 1065
    check-cast v6, La/cp;

    .line 1066
    .line 1067
    move-object/from16 v1, p1

    .line 1068
    .line 1069
    check-cast v1, Landroid/view/View;

    .line 1070
    .line 1071
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    check-cast v1, La/qki0;

    .line 1079
    .line 1080
    iget-object v1, v1, La/qki0;->a:La/nki0;

    .line 1081
    .line 1082
    invoke-virtual {v0, v1}, La/uki0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1086
    .line 1087
    return-object v0

    .line 1088
    :pswitch_1a
    check-cast v0, La/v950;

    .line 1089
    .line 1090
    check-cast v6, La/rzg0;

    .line 1091
    .line 1092
    move-object/from16 v1, p1

    .line 1093
    .line 1094
    check-cast v1, Landroid/os/Bundle;

    .line 1095
    .line 1096
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    new-instance v2, La/tzg0;

    .line 1103
    .line 1104
    invoke-direct {v2, v1, v6}, La/tzg0;-><init>(Landroid/os/Bundle;La/rzg0;)V

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v2, v0}, La/tzg0;->w(La/jiy;)Ljava/lang/Object;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v0

    .line 1111
    return-object v0

    .line 1112
    :pswitch_1b
    check-cast v0, La/ldi0;

    .line 1113
    .line 1114
    check-cast v6, Ljava/lang/Throwable;

    .line 1115
    .line 1116
    move-object/from16 v1, p1

    .line 1117
    .line 1118
    check-cast v1, La/k0w0;

    .line 1119
    .line 1120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1121
    .line 1122
    .line 1123
    iget-object v0, v0, La/ldi0;->z:La/rek0;

    .line 1124
    .line 1125
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    if-nez v2, :cond_a

    .line 1130
    .line 1131
    const-string v2, ""

    .line 1132
    .line 1133
    :cond_a
    check-cast v6, La/an4;

    .line 1134
    .line 1135
    iget-object v5, v6, La/zhi0;->c:La/kuw;

    .line 1136
    .line 1137
    sget-object v6, La/i2o;->L2:La/i2o;

    .line 1138
    .line 1139
    if-ne v5, v6, :cond_b

    .line 1140
    .line 1141
    move v3, v4

    .line 1142
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1143
    .line 1144
    .line 1145
    new-instance v0, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationFailScreen$1;

    .line 1146
    .line 1147
    invoke-direct {v0, v2, v3}, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationFailScreen$1;-><init>(Ljava/lang/String;Z)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v1, v0}, La/k0w0;->k(La/m7h0;)V

    .line 1151
    .line 1152
    .line 1153
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1154
    .line 1155
    return-object v0

    .line 1156
    :pswitch_1c
    check-cast v0, La/zuh0;

    .line 1157
    .line 1158
    check-cast v6, La/dth0;

    .line 1159
    .line 1160
    move-object/from16 v1, p1

    .line 1161
    .line 1162
    check-cast v1, Ljava/lang/Throwable;

    .line 1163
    .line 1164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    iget-boolean v2, v0, La/zuh0;->M:Z

    .line 1168
    .line 1169
    invoke-virtual {v0, v6, v2}, La/zuh0;->B(La/dth0;Z)V

    .line 1170
    .line 1171
    .line 1172
    iget-object v2, v0, La/zuh0;->s:La/duj;

    .line 1173
    .line 1174
    new-instance v4, La/fuh0;

    .line 1175
    .line 1176
    invoke-direct {v4, v0, v3}, La/fuh0;-><init>(La/zuh0;B)V

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1180
    .line 1181
    .line 1182
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1183
    .line 1184
    return-object v0

    .line 1185
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
