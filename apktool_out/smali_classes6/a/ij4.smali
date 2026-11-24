.class public final synthetic La/ij4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/ij4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/jo4;)V
    .locals 0

    .line 1
    const/4 p1, 0x5

    iput-byte p1, p0, La/ij4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/ij4;->a:B

    .line 4
    .line 5
    const/high16 v1, 0x40400000    # 3.0f

    .line 6
    .line 7
    const/16 v2, 0x20

    .line 8
    .line 9
    const/high16 v3, 0x41a00000    # 20.0f

    .line 10
    .line 11
    const-wide v4, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x1

    .line 18
    const/4 v8, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v0, p1

    .line 23
    .line 24
    check-cast v0, La/px40;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_0
    move-object/from16 v0, p1

    .line 33
    .line 34
    check-cast v0, Landroid/view/View;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    instance-of v1, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightListCheckBox;

    .line 40
    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    instance-of v0, v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move v7, v8

    .line 49
    :cond_1
    :goto_0
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :pswitch_1
    move-object/from16 v0, p1

    .line 55
    .line 56
    check-cast v0, Ljava/lang/Throwable;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_2
    move-object/from16 v0, p1

    .line 68
    .line 69
    check-cast v0, La/xs5;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget v0, v0, La/xs5;->a:I

    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-object/from16 v0, p1

    .line 85
    .line 86
    check-cast v0, Ljava/util/Set;

    .line 87
    .line 88
    check-cast v0, Ljava/lang/Iterable;

    .line 89
    .line 90
    new-instance v1, La/sx3;

    .line 91
    .line 92
    invoke-direct {v1, v0, v7}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :pswitch_4
    move-object/from16 v0, p1

    .line 97
    .line 98
    check-cast v0, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_5
    move-object/from16 v0, p1

    .line 107
    .line 108
    check-cast v0, La/ko5;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const-class v0, La/ko5;

    .line 114
    .line 115
    sget-object v1, La/sre0;->a:La/tre0;

    .line 116
    .line 117
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0

    .line 122
    :pswitch_6
    move-object/from16 v0, p1

    .line 123
    .line 124
    check-cast v0, La/ko5;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object v0, v0, La/ko5;->a:Ljava/lang/String;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_7
    move-object/from16 v2, p1

    .line 133
    .line 134
    check-cast v2, La/cp;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v0, v2, La/xhe0;->a:Landroid/view/View;

    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-ne v0, v7, :cond_2

    .line 161
    .line 162
    move v0, v7

    .line 163
    goto :goto_1

    .line 164
    :cond_2
    move v0, v8

    .line 165
    :goto_1
    iget-object v1, v2, La/cp;->u:La/yfu0;

    .line 166
    .line 167
    check-cast v1, La/cg3;

    .line 168
    .line 169
    iget-object v1, v1, La/cg3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 170
    .line 171
    sget-object v3, Landroid/view/View;->ROTATION:Landroid/util/Property;

    .line 172
    .line 173
    if-eqz v0, :cond_3

    .line 174
    .line 175
    const/high16 v0, -0x3c4c0000    # -360.0f

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_3
    const/high16 v0, 0x43b40000    # 360.0f

    .line 179
    .line 180
    :goto_2
    const/4 v9, 0x2

    .line 181
    new-array v4, v9, [F

    .line 182
    .line 183
    aput v6, v4, v8

    .line 184
    .line 185
    aput v0, v4, v7

    .line 186
    .line 187
    invoke-static {v1, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    const-wide/16 v0, 0x7d0

    .line 192
    .line 193
    invoke-virtual {v3, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 194
    .line 195
    .line 196
    const/4 v0, -0x1

    .line 197
    invoke-virtual {v3, v0}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 198
    .line 199
    .line 200
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 201
    .line 202
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 206
    .line 207
    .line 208
    new-instance v1, La/go5;

    .line 209
    .line 210
    const/4 v6, 0x0

    .line 211
    move-object v4, v2

    .line 212
    move-object v5, v3

    .line 213
    invoke-direct/range {v1 .. v6}, La/go5;-><init>(La/cp;Landroid/animation/ObjectAnimator;La/cp;Landroid/animation/ObjectAnimator;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 217
    .line 218
    .line 219
    new-instance v0, La/eo5;

    .line 220
    .line 221
    invoke-direct {v0, v2, v3, v8}, La/eo5;-><init>(La/cp;Landroid/animation/ObjectAnimator;B)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v0}, La/cp;->x(Lkotlin/jvm/functions/Function0;)V

    .line 225
    .line 226
    .line 227
    new-instance v0, La/fo5;

    .line 228
    .line 229
    invoke-direct {v0, v3, v8}, La/fo5;-><init>(Landroid/animation/ObjectAnimator;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v0}, La/cp;->y(Lkotlin/jvm/functions/Function0;)V

    .line 233
    .line 234
    .line 235
    new-instance v0, La/fo5;

    .line 236
    .line 237
    invoke-direct {v0, v3, v7}, La/fo5;-><init>(Landroid/animation/ObjectAnimator;B)V

    .line 238
    .line 239
    .line 240
    iget-object v1, v2, La/cp;->z:Lkotlin/jvm/functions/Function0;

    .line 241
    .line 242
    if-nez v1, :cond_4

    .line 243
    .line 244
    iput-object v0, v2, La/cp;->z:Lkotlin/jvm/functions/Function0;

    .line 245
    .line 246
    new-instance v0, La/fo5;

    .line 247
    .line 248
    invoke-direct {v0, v3, v9}, La/fo5;-><init>(Landroid/animation/ObjectAnimator;B)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v0}, La/cp;->z(Lkotlin/jvm/functions/Function0;)V

    .line 252
    .line 253
    .line 254
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_4
    const-string v0, "onFailedToRecycleView { ... } is already defined. Only one onFailedToRecycleView { ... } is allowed."

    .line 258
    .line 259
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const/4 v0, 0x0

    .line 263
    :goto_3
    return-object v0

    .line 264
    :pswitch_8
    move-object/from16 v0, p1

    .line 265
    .line 266
    check-cast v0, La/cp;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance v1, La/rn5;

    .line 272
    .line 273
    invoke-direct {v1, v0, v8}, La/rn5;-><init>(La/cp;B)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 277
    .line 278
    .line 279
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    return-object v0

    .line 282
    :pswitch_9
    move-object/from16 v0, p1

    .line 283
    .line 284
    check-cast v0, La/df5;

    .line 285
    .line 286
    invoke-virtual {v0}, La/df5;->b1()V

    .line 287
    .line 288
    .line 289
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object v0

    .line 292
    :pswitch_a
    move-object/from16 v0, p1

    .line 293
    .line 294
    check-cast v0, La/df5;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-static {v0}, La/vfc;->J(La/ehl;)V

    .line 300
    .line 301
    .line 302
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object v0

    .line 305
    :pswitch_b
    move-object/from16 v0, p1

    .line 306
    .line 307
    check-cast v0, Ljava/lang/Integer;

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    new-instance v1, La/mdm;

    .line 314
    .line 315
    sget-object v2, La/pb10;->c:La/xuz;

    .line 316
    .line 317
    sget-object v3, La/pb10;->e:La/pb10;

    .line 318
    .line 319
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    const-wide/16 v12, 0x0

    .line 327
    .line 328
    const/16 v14, 0x3de

    .line 329
    .line 330
    const/4 v3, 0x0

    .line 331
    const/4 v4, 0x0

    .line 332
    const/4 v5, 0x0

    .line 333
    const/4 v6, 0x0

    .line 334
    const v7, 0x7f130e37

    .line 335
    .line 336
    .line 337
    const/4 v8, 0x0

    .line 338
    const/4 v9, 0x0

    .line 339
    const-wide/16 v10, 0x0

    .line 340
    .line 341
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 342
    .line 343
    .line 344
    return-object v1

    .line 345
    :pswitch_c
    move-object/from16 v0, p1

    .line 346
    .line 347
    check-cast v0, Ljava/lang/Integer;

    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    new-instance v1, La/mdm;

    .line 354
    .line 355
    sget-object v2, La/pb10;->c:La/xuz;

    .line 356
    .line 357
    sget-object v3, La/pb10;->g:La/pb10;

    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    const-wide/16 v12, 0x0

    .line 367
    .line 368
    const/16 v14, 0x25e

    .line 369
    .line 370
    const/4 v3, 0x0

    .line 371
    const/4 v4, 0x0

    .line 372
    const/4 v5, 0x0

    .line 373
    const/4 v6, 0x0

    .line 374
    const v7, 0x7f1307c4

    .line 375
    .line 376
    .line 377
    const/4 v8, 0x0

    .line 378
    const v9, 0x7f131690

    .line 379
    .line 380
    .line 381
    const-wide/16 v10, 0x2710

    .line 382
    .line 383
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 384
    .line 385
    .line 386
    return-object v1

    .line 387
    :pswitch_d
    move-object/from16 v0, p1

    .line 388
    .line 389
    check-cast v0, Ljava/lang/Integer;

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 395
    .line 396
    return-object v0

    .line 397
    :pswitch_e
    move-object/from16 v0, p1

    .line 398
    .line 399
    check-cast v0, La/a9q0;

    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 405
    .line 406
    return-object v0

    .line 407
    :pswitch_f
    move-object/from16 v0, p1

    .line 408
    .line 409
    check-cast v0, La/a9q0;

    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 415
    .line 416
    return-object v0

    .line 417
    :pswitch_10
    move-object/from16 v0, p1

    .line 418
    .line 419
    check-cast v0, Ljava/lang/Throwable;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 425
    .line 426
    .line 427
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_11
    move-object/from16 v0, p1

    .line 431
    .line 432
    check-cast v0, La/q84;

    .line 433
    .line 434
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    const-class v0, La/q84;

    .line 438
    .line 439
    sget-object v1, La/sre0;->a:La/tre0;

    .line 440
    .line 441
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    return-object v0

    .line 446
    :pswitch_12
    move-object/from16 v0, p1

    .line 447
    .line 448
    check-cast v0, La/q84;

    .line 449
    .line 450
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    iget-object v0, v0, La/q84;->a:Ljava/lang/String;

    .line 454
    .line 455
    return-object v0

    .line 456
    :pswitch_13
    move-object/from16 v1, p1

    .line 457
    .line 458
    check-cast v1, La/hcz;

    .line 459
    .line 460
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    sget-object v5, La/aad;->f:La/ugd;

    .line 464
    .line 465
    const/4 v6, 0x6

    .line 466
    const/16 v2, 0x8

    .line 467
    .line 468
    const/4 v3, 0x0

    .line 469
    const/4 v4, 0x0

    .line 470
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 471
    .line 472
    .line 473
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_14
    move-object/from16 v0, p1

    .line 477
    .line 478
    check-cast v0, Ljava/lang/Long;

    .line 479
    .line 480
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 484
    .line 485
    return-object v0

    .line 486
    :pswitch_15
    move-object/from16 v0, p1

    .line 487
    .line 488
    check-cast v0, Ljava/lang/Long;

    .line 489
    .line 490
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 494
    .line 495
    return-object v0

    .line 496
    :pswitch_16
    move-object/from16 v0, p1

    .line 497
    .line 498
    check-cast v0, La/fhl;

    .line 499
    .line 500
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 504
    .line 505
    return-object v0

    .line 506
    :pswitch_17
    move-object/from16 v0, p1

    .line 507
    .line 508
    check-cast v0, Ljava/util/List;

    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    const/4 v2, 0x5

    .line 518
    const/16 v3, 0xa

    .line 519
    .line 520
    if-gt v1, v2, :cond_7

    .line 521
    .line 522
    new-instance v1, Ljava/util/ArrayList;

    .line 523
    .line 524
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 525
    .line 526
    .line 527
    move-result v2

    .line 528
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 529
    .line 530
    .line 531
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    if-eqz v2, :cond_5

    .line 540
    .line 541
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    check-cast v2, La/u54;

    .line 546
    .line 547
    invoke-static {v2}, La/ju70;->V(La/u54;)La/si4;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    goto :goto_4

    .line 555
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 556
    .line 557
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    :cond_6
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    if-eqz v2, :cond_9

    .line 569
    .line 570
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    move-object v3, v2

    .line 575
    check-cast v3, La/si4;

    .line 576
    .line 577
    iget v3, v3, La/si4;->a:I

    .line 578
    .line 579
    if-eqz v3, :cond_6

    .line 580
    .line 581
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    goto :goto_5

    .line 585
    :cond_7
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    const/4 v2, 0x4

    .line 590
    invoke-interface {v0, v8, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    new-instance v2, Ljava/util/ArrayList;

    .line 595
    .line 596
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 601
    .line 602
    .line 603
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    if-eqz v3, :cond_8

    .line 612
    .line 613
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    check-cast v3, La/u54;

    .line 618
    .line 619
    invoke-static {v3}, La/ju70;->V(La/u54;)La/si4;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    goto :goto_6

    .line 627
    :cond_8
    invoke-virtual {v1, v2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 628
    .line 629
    .line 630
    sget-object v0, La/ri4;->a:La/ri4;

    .line 631
    .line 632
    invoke-virtual {v1, v0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    :cond_9
    return-object v0

    .line 640
    :pswitch_18
    move-object/from16 v0, p1

    .line 641
    .line 642
    check-cast v0, Ljava/lang/Integer;

    .line 643
    .line 644
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    new-instance v1, La/bzu;

    .line 649
    .line 650
    const/16 v2, 0x17

    .line 651
    .line 652
    invoke-direct {v1, v2}, La/bzu;-><init>(B)V

    .line 653
    .line 654
    .line 655
    const-string v2, "static"

    .line 656
    .line 657
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    const-string v2, "img"

    .line 661
    .line 662
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    const-string v2, "android"

    .line 666
    .line 667
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    const-string v2, "actions"

    .line 671
    .line 672
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    const-string v2, "alt_design"

    .line 676
    .line 677
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    const-string v2, "authorization"

    .line 681
    .line 682
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    const-string v2, "visual_style"

    .line 686
    .line 687
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    const-string v2, "background_picture"

    .line 691
    .line 692
    invoke-virtual {v1, v2}, La/bzu;->g(Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    new-instance v2, Ljava/lang/StringBuilder;

    .line 696
    .line 697
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    const-string v0, ".svg"

    .line 704
    .line 705
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-virtual {v1, v0}, La/bzu;->g(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    iget-object v0, v1, La/bzu;->b:Ljava/lang/Object;

    .line 716
    .line 717
    check-cast v0, Ljava/lang/StringBuilder;

    .line 718
    .line 719
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    return-object v0

    .line 724
    :pswitch_19
    move-object/from16 v0, p1

    .line 725
    .line 726
    check-cast v0, Ljava/lang/Boolean;

    .line 727
    .line 728
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    xor-int/2addr v0, v7

    .line 733
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    return-object v0

    .line 738
    :pswitch_1a
    move-object/from16 v0, p1

    .line 739
    .line 740
    check-cast v0, La/pi9;

    .line 741
    .line 742
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    iget-object v7, v0, La/pi9;->a:La/y99;

    .line 746
    .line 747
    invoke-interface {v7}, La/y99;->d()J

    .line 748
    .line 749
    .line 750
    move-result-wide v7

    .line 751
    and-long/2addr v7, v4

    .line 752
    long-to-int v7, v7

    .line 753
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 754
    .line 755
    .line 756
    move-result v7

    .line 757
    sget-object v8, La/qmk;->a:La/zcl;

    .line 758
    .line 759
    invoke-virtual {v0}, La/pi9;->getDensity()F

    .line 760
    .line 761
    .line 762
    move-result v8

    .line 763
    mul-float/2addr v8, v3

    .line 764
    sub-float/2addr v7, v8

    .line 765
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 766
    .line 767
    .line 768
    move-result v3

    .line 769
    int-to-long v8, v3

    .line 770
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 771
    .line 772
    .line 773
    move-result v3

    .line 774
    int-to-long v6, v3

    .line 775
    shl-long/2addr v8, v2

    .line 776
    and-long/2addr v6, v4

    .line 777
    or-long v12, v8, v6

    .line 778
    .line 779
    iget-object v3, v0, La/pi9;->a:La/y99;

    .line 780
    .line 781
    invoke-interface {v3}, La/y99;->d()J

    .line 782
    .line 783
    .line 784
    move-result-wide v6

    .line 785
    shr-long/2addr v6, v2

    .line 786
    long-to-int v3, v6

    .line 787
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 788
    .line 789
    .line 790
    move-result v3

    .line 791
    iget-object v6, v0, La/pi9;->a:La/y99;

    .line 792
    .line 793
    invoke-interface {v6}, La/y99;->d()J

    .line 794
    .line 795
    .line 796
    move-result-wide v6

    .line 797
    and-long/2addr v6, v4

    .line 798
    long-to-int v6, v6

    .line 799
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 800
    .line 801
    .line 802
    move-result v6

    .line 803
    div-float/2addr v6, v1

    .line 804
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 805
    .line 806
    .line 807
    move-result v1

    .line 808
    int-to-long v7, v1

    .line 809
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 810
    .line 811
    .line 812
    move-result v1

    .line 813
    int-to-long v9, v1

    .line 814
    shl-long v1, v7, v2

    .line 815
    .line 816
    and-long v3, v9, v4

    .line 817
    .line 818
    or-long v14, v1, v3

    .line 819
    .line 820
    new-instance v10, La/lf4;

    .line 821
    .line 822
    const/4 v11, 0x2

    .line 823
    invoke-direct/range {v10 .. v15}, La/lf4;-><init>(BJJ)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v0, v10}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    return-object v0

    .line 831
    :pswitch_1b
    move-object/from16 v0, p1

    .line 832
    .line 833
    check-cast v0, La/pi9;

    .line 834
    .line 835
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    iget-object v7, v0, La/pi9;->a:La/y99;

    .line 839
    .line 840
    invoke-interface {v7}, La/y99;->d()J

    .line 841
    .line 842
    .line 843
    move-result-wide v7

    .line 844
    and-long/2addr v7, v4

    .line 845
    long-to-int v7, v7

    .line 846
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 847
    .line 848
    .line 849
    move-result v7

    .line 850
    sget-object v8, La/qmk;->a:La/zcl;

    .line 851
    .line 852
    invoke-virtual {v0}, La/pi9;->getDensity()F

    .line 853
    .line 854
    .line 855
    move-result v8

    .line 856
    mul-float/2addr v8, v3

    .line 857
    sub-float/2addr v7, v8

    .line 858
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 859
    .line 860
    .line 861
    move-result v3

    .line 862
    int-to-long v8, v3

    .line 863
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 864
    .line 865
    .line 866
    move-result v3

    .line 867
    int-to-long v6, v3

    .line 868
    shl-long/2addr v8, v2

    .line 869
    and-long/2addr v6, v4

    .line 870
    or-long v12, v8, v6

    .line 871
    .line 872
    iget-object v3, v0, La/pi9;->a:La/y99;

    .line 873
    .line 874
    invoke-interface {v3}, La/y99;->d()J

    .line 875
    .line 876
    .line 877
    move-result-wide v6

    .line 878
    shr-long/2addr v6, v2

    .line 879
    long-to-int v3, v6

    .line 880
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 881
    .line 882
    .line 883
    move-result v3

    .line 884
    iget-object v6, v0, La/pi9;->a:La/y99;

    .line 885
    .line 886
    invoke-interface {v6}, La/y99;->d()J

    .line 887
    .line 888
    .line 889
    move-result-wide v6

    .line 890
    and-long/2addr v6, v4

    .line 891
    long-to-int v6, v6

    .line 892
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 893
    .line 894
    .line 895
    move-result v6

    .line 896
    div-float/2addr v6, v1

    .line 897
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 898
    .line 899
    .line 900
    move-result v1

    .line 901
    int-to-long v7, v1

    .line 902
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 903
    .line 904
    .line 905
    move-result v1

    .line 906
    int-to-long v9, v1

    .line 907
    shl-long v1, v7, v2

    .line 908
    .line 909
    and-long v3, v9, v4

    .line 910
    .line 911
    or-long v14, v1, v3

    .line 912
    .line 913
    new-instance v10, La/lf4;

    .line 914
    .line 915
    const/4 v11, 0x1

    .line 916
    invoke-direct/range {v10 .. v15}, La/lf4;-><init>(BJJ)V

    .line 917
    .line 918
    .line 919
    invoke-virtual {v0, v10}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    return-object v0

    .line 924
    :pswitch_1c
    move-object/from16 v1, p1

    .line 925
    .line 926
    check-cast v1, La/fhl;

    .line 927
    .line 928
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 932
    .line 933
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getOverlayBackground40-0d7_KjU()J

    .line 934
    .line 935
    .line 936
    move-result-wide v2

    .line 937
    const/4 v11, 0x0

    .line 938
    const/16 v12, 0x7e

    .line 939
    .line 940
    const-wide/16 v4, 0x0

    .line 941
    .line 942
    const-wide/16 v6, 0x0

    .line 943
    .line 944
    const/4 v8, 0x0

    .line 945
    const/4 v9, 0x0

    .line 946
    const/4 v10, 0x0

    .line 947
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 948
    .line 949
    .line 950
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 951
    .line 952
    return-object v0

    .line 953
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
