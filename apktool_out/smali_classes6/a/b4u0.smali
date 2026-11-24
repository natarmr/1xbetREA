.class public final synthetic La/b4u0;
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
    iput-byte p1, p0, La/b4u0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/b4u0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/b4u0;->a:B

    .line 4
    .line 5
    const v1, 0x7f0a0fce

    .line 6
    .line 7
    .line 8
    const v2, 0x7f0a0730

    .line 9
    .line 10
    .line 11
    const-string v3, "rootView"

    .line 12
    .line 13
    const/4 v4, 0x3

    .line 14
    const-string v5, "Missing required view with ID: "

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
    check-cast v0, Ljava/lang/Throwable;

    .line 25
    .line 26
    move-object/from16 v1, p2

    .line 27
    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_0
    move-object/from16 v0, p1

    .line 40
    .line 41
    check-cast v0, La/fet;

    .line 42
    .line 43
    move-object/from16 v1, p2

    .line 44
    .line 45
    check-cast v1, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v7}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v1, v0}, La/knx;->C(ILa/fet;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_1
    move-object/from16 v0, p1

    .line 61
    .line 62
    check-cast v0, Ljava/lang/Throwable;

    .line 63
    .line 64
    move-object/from16 v1, p2

    .line 65
    .line 66
    check-cast v1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_2
    move-object/from16 v0, p1

    .line 78
    .line 79
    check-cast v0, Ljava/lang/Throwable;

    .line 80
    .line 81
    move-object/from16 v1, p2

    .line 82
    .line 83
    check-cast v1, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_3
    move-object/from16 v0, p1

    .line 92
    .line 93
    check-cast v0, Ljava/lang/Throwable;

    .line 94
    .line 95
    move-object/from16 v1, p2

    .line 96
    .line 97
    check-cast v1, Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_4
    move-object/from16 v0, p1

    .line 106
    .line 107
    check-cast v0, Landroid/view/LayoutInflater;

    .line 108
    .line 109
    move-object/from16 v1, p2

    .line 110
    .line 111
    check-cast v1, Landroid/view/ViewGroup;

    .line 112
    .line 113
    const v2, 0x7f0d0377

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1, v2, v1, v8}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const v1, 0x7f0a0532

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    move-object v9, v2

    .line 128
    check-cast v9, Landroidx/constraintlayout/helper/widget/Flow;

    .line 129
    .line 130
    if-eqz v9, :cond_0

    .line 131
    .line 132
    const v1, 0x7f0a0533

    .line 133
    .line 134
    .line 135
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    move-object v10, v2

    .line 140
    check-cast v10, Landroidx/constraintlayout/helper/widget/Flow;

    .line 141
    .line 142
    if-eqz v10, :cond_0

    .line 143
    .line 144
    const v1, 0x7f0a0535

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    move-object v11, v2

    .line 152
    check-cast v11, Landroidx/constraintlayout/helper/widget/Flow;

    .line 153
    .line 154
    if-eqz v11, :cond_0

    .line 155
    .line 156
    const v1, 0x7f0a0537

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Landroidx/constraintlayout/helper/widget/Flow;

    .line 164
    .line 165
    if-eqz v2, :cond_0

    .line 166
    .line 167
    const v1, 0x7f0a0538

    .line 168
    .line 169
    .line 170
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    move-object v12, v2

    .line 175
    check-cast v12, Landroidx/constraintlayout/helper/widget/Flow;

    .line 176
    .line 177
    if-eqz v12, :cond_0

    .line 178
    .line 179
    const v1, 0x7f0a0860

    .line 180
    .line 181
    .line 182
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, Landroid/widget/ImageView;

    .line 187
    .line 188
    if-eqz v2, :cond_0

    .line 189
    .line 190
    const v1, 0x7f0a0893

    .line 191
    .line 192
    .line 193
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, Landroid/widget/ImageView;

    .line 198
    .line 199
    if-eqz v2, :cond_0

    .line 200
    .line 201
    const v1, 0x7f0a08da

    .line 202
    .line 203
    .line 204
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    move-object v13, v2

    .line 209
    check-cast v13, Landroid/widget/ImageView;

    .line 210
    .line 211
    if-eqz v13, :cond_0

    .line 212
    .line 213
    const v1, 0x7f0a08f1

    .line 214
    .line 215
    .line 216
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, Landroid/widget/ImageView;

    .line 221
    .line 222
    if-eqz v2, :cond_0

    .line 223
    .line 224
    const v1, 0x7f0a115b

    .line 225
    .line 226
    .line 227
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    move-object v14, v2

    .line 232
    check-cast v14, Landroid/widget/TextView;

    .line 233
    .line 234
    if-eqz v14, :cond_0

    .line 235
    .line 236
    const v1, 0x7f0a116e

    .line 237
    .line 238
    .line 239
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    move-object v15, v2

    .line 244
    check-cast v15, Landroid/widget/TextView;

    .line 245
    .line 246
    if-eqz v15, :cond_0

    .line 247
    .line 248
    const v1, 0x7f0a11cc

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    move-object/from16 v16, v2

    .line 256
    .line 257
    check-cast v16, Landroid/widget/TextView;

    .line 258
    .line 259
    if-eqz v16, :cond_0

    .line 260
    .line 261
    const v1, 0x7f0a124c

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    move-object/from16 v17, v2

    .line 269
    .line 270
    check-cast v17, Landroid/widget/TextView;

    .line 271
    .line 272
    if-eqz v17, :cond_0

    .line 273
    .line 274
    const v1, 0x7f0a128f

    .line 275
    .line 276
    .line 277
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    move-object/from16 v18, v2

    .line 282
    .line 283
    check-cast v18, Landroid/widget/TextView;

    .line 284
    .line 285
    if-eqz v18, :cond_0

    .line 286
    .line 287
    new-instance v7, La/zsx;

    .line 288
    .line 289
    move-object v8, v0

    .line 290
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 291
    .line 292
    invoke-direct/range {v7 .. v18}, La/zsx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/helper/widget/Flow;Landroidx/constraintlayout/helper/widget/Flow;Landroidx/constraintlayout/helper/widget/Flow;Landroidx/constraintlayout/helper/widget/Flow;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 293
    .line 294
    .line 295
    move-object v6, v7

    .line 296
    goto :goto_0

    .line 297
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    :goto_0
    return-object v6

    .line 313
    :pswitch_5
    move-object/from16 v0, p1

    .line 314
    .line 315
    check-cast v0, Ljava/lang/Throwable;

    .line 316
    .line 317
    move-object/from16 v1, p2

    .line 318
    .line 319
    check-cast v1, Ljava/lang/String;

    .line 320
    .line 321
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 325
    .line 326
    return-object v0

    .line 327
    :pswitch_6
    move-object/from16 v0, p1

    .line 328
    .line 329
    check-cast v0, Landroid/view/LayoutInflater;

    .line 330
    .line 331
    move-object/from16 v1, p2

    .line 332
    .line 333
    check-cast v1, Landroid/view/ViewGroup;

    .line 334
    .line 335
    const v2, 0x7f0d0387

    .line 336
    .line 337
    .line 338
    invoke-static {v0, v1, v2, v1, v8}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    if-eqz v0, :cond_1

    .line 343
    .line 344
    check-cast v0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 345
    .line 346
    new-instance v6, La/jtx;

    .line 347
    .line 348
    invoke-direct {v6, v0, v0}, La/jtx;-><init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;)V

    .line 349
    .line 350
    .line 351
    goto :goto_1

    .line 352
    :cond_1
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    :goto_1
    return-object v6

    .line 356
    :pswitch_7
    move-object/from16 v0, p1

    .line 357
    .line 358
    check-cast v0, Landroid/view/LayoutInflater;

    .line 359
    .line 360
    move-object/from16 v1, p2

    .line 361
    .line 362
    check-cast v1, Landroid/view/ViewGroup;

    .line 363
    .line 364
    const v2, 0x7f0d046a

    .line 365
    .line 366
    .line 367
    invoke-static {v0, v1, v2, v1, v8}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    const v1, 0x7f0a0929

    .line 372
    .line 373
    .line 374
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    check-cast v2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 379
    .line 380
    if-eqz v2, :cond_2

    .line 381
    .line 382
    const v1, 0x7f0a0a39

    .line 383
    .line 384
    .line 385
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    check-cast v3, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 390
    .line 391
    if-eqz v3, :cond_2

    .line 392
    .line 393
    new-instance v6, La/yyx;

    .line 394
    .line 395
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 396
    .line 397
    invoke-direct {v6, v0, v2, v3}, La/yyx;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 398
    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    :goto_2
    return-object v6

    .line 417
    :pswitch_8
    move-object/from16 v0, p1

    .line 418
    .line 419
    check-cast v0, Ljava/lang/Throwable;

    .line 420
    .line 421
    move-object/from16 v1, p2

    .line 422
    .line 423
    check-cast v1, Ljava/lang/String;

    .line 424
    .line 425
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    return-object v0

    .line 431
    :pswitch_9
    move-object/from16 v0, p1

    .line 432
    .line 433
    check-cast v0, La/fet;

    .line 434
    .line 435
    move-object/from16 v1, p2

    .line 436
    .line 437
    check-cast v1, Ljava/lang/Integer;

    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 440
    .line 441
    .line 442
    const v1, -0x18fe6ad9

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 446
    .line 447
    .line 448
    invoke-static {v8, v8, v0, v8, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 453
    .line 454
    .line 455
    return-object v1

    .line 456
    :pswitch_a
    move-object/from16 v0, p1

    .line 457
    .line 458
    check-cast v0, Ljava/lang/Throwable;

    .line 459
    .line 460
    move-object/from16 v1, p2

    .line 461
    .line 462
    check-cast v1, Ljava/lang/String;

    .line 463
    .line 464
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 465
    .line 466
    .line 467
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 468
    .line 469
    return-object v0

    .line 470
    :pswitch_b
    move-object/from16 v0, p1

    .line 471
    .line 472
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 473
    .line 474
    move-object/from16 v1, p2

    .line 475
    .line 476
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 477
    .line 478
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    new-instance v2, La/d4u0;

    .line 485
    .line 486
    const/16 v3, 0xc

    .line 487
    .line 488
    invoke-direct {v2, v3}, La/d4u0;-><init>(B)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    new-instance v0, La/o1u0;

    .line 495
    .line 496
    const/16 v2, 0x11

    .line 497
    .line 498
    invoke-direct {v0, v2}, La/o1u0;-><init>(B)V

    .line 499
    .line 500
    .line 501
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    return-object v0

    .line 507
    :pswitch_c
    move-object/from16 v0, p1

    .line 508
    .line 509
    check-cast v0, La/fet;

    .line 510
    .line 511
    move-object/from16 v1, p2

    .line 512
    .line 513
    check-cast v1, Ljava/lang/Integer;

    .line 514
    .line 515
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 516
    .line 517
    .line 518
    const v1, 0x38455732

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 522
    .line 523
    .line 524
    invoke-static {v8, v8, v0, v8, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 529
    .line 530
    .line 531
    return-object v1

    .line 532
    :pswitch_d
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
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 541
    .line 542
    .line 543
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 544
    .line 545
    return-object v0

    .line 546
    :pswitch_e
    move-object/from16 v0, p1

    .line 547
    .line 548
    check-cast v0, La/fet;

    .line 549
    .line 550
    move-object/from16 v1, p2

    .line 551
    .line 552
    check-cast v1, Ljava/lang/Integer;

    .line 553
    .line 554
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 555
    .line 556
    .line 557
    const v1, 0x2d99c65a

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 561
    .line 562
    .line 563
    invoke-static {v8, v8, v0, v8, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 568
    .line 569
    .line 570
    return-object v1

    .line 571
    :pswitch_f
    move-object/from16 v0, p1

    .line 572
    .line 573
    check-cast v0, Landroid/view/LayoutInflater;

    .line 574
    .line 575
    move-object/from16 v1, p2

    .line 576
    .line 577
    check-cast v1, Landroid/view/ViewGroup;

    .line 578
    .line 579
    const v2, 0x7f0d03a1

    .line 580
    .line 581
    .line 582
    invoke-static {v0, v1, v2, v1, v8}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    if-eqz v0, :cond_3

    .line 587
    .line 588
    check-cast v0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 589
    .line 590
    new-instance v6, La/ztx;

    .line 591
    .line 592
    invoke-direct {v6, v0, v0}, La/ztx;-><init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;)V

    .line 593
    .line 594
    .line 595
    goto :goto_3

    .line 596
    :cond_3
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    :goto_3
    return-object v6

    .line 600
    :pswitch_10
    move-object/from16 v0, p1

    .line 601
    .line 602
    check-cast v0, Landroid/view/LayoutInflater;

    .line 603
    .line 604
    move-object/from16 v3, p2

    .line 605
    .line 606
    check-cast v3, Landroid/view/ViewGroup;

    .line 607
    .line 608
    const v4, 0x7f0d03a2

    .line 609
    .line 610
    .line 611
    invoke-static {v0, v3, v4, v3, v8}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    move-object v8, v0

    .line 616
    check-cast v8, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 617
    .line 618
    const v3, 0x7f0a0427

    .line 619
    .line 620
    .line 621
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 622
    .line 623
    .line 624
    move-result-object v4

    .line 625
    move-object v10, v4

    .line 626
    check-cast v10, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 627
    .line 628
    if-eqz v10, :cond_5

    .line 629
    .line 630
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 631
    .line 632
    .line 633
    move-result-object v3

    .line 634
    move-object v11, v3

    .line 635
    check-cast v11, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 636
    .line 637
    if-eqz v11, :cond_4

    .line 638
    .line 639
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 640
    .line 641
    .line 642
    move-result-object v2

    .line 643
    move-object v12, v2

    .line 644
    check-cast v12, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 645
    .line 646
    if-eqz v12, :cond_6

    .line 647
    .line 648
    new-instance v7, La/aux;

    .line 649
    .line 650
    move-object v9, v8

    .line 651
    invoke-direct/range {v7 .. v12}, La/aux;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 652
    .line 653
    .line 654
    move-object v6, v7

    .line 655
    goto :goto_5

    .line 656
    :cond_4
    move v1, v2

    .line 657
    goto :goto_4

    .line 658
    :cond_5
    move v1, v3

    .line 659
    :cond_6
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    :goto_5
    return-object v6

    .line 675
    :pswitch_11
    move-object/from16 v0, p1

    .line 676
    .line 677
    check-cast v0, Landroid/view/LayoutInflater;

    .line 678
    .line 679
    move-object/from16 v1, p2

    .line 680
    .line 681
    check-cast v1, Landroid/view/ViewGroup;

    .line 682
    .line 683
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    invoke-static {v0, v1}, La/zvx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/zvx;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    return-object v0

    .line 694
    :pswitch_12
    move-object/from16 v0, p1

    .line 695
    .line 696
    check-cast v0, La/fet;

    .line 697
    .line 698
    move-object/from16 v1, p2

    .line 699
    .line 700
    check-cast v1, Ljava/lang/Integer;

    .line 701
    .line 702
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    invoke-static {v7}, La/x8x;->L(I)I

    .line 706
    .line 707
    .line 708
    move-result v1

    .line 709
    invoke-static {v1, v0}, La/jd8;->H(ILa/fet;)V

    .line 710
    .line 711
    .line 712
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 713
    .line 714
    return-object v0

    .line 715
    :pswitch_13
    move-object/from16 v0, p1

    .line 716
    .line 717
    check-cast v0, La/fet;

    .line 718
    .line 719
    move-object/from16 v1, p2

    .line 720
    .line 721
    check-cast v1, Ljava/lang/Integer;

    .line 722
    .line 723
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 724
    .line 725
    .line 726
    sget-object v1, La/gau0;->P1:La/kys0;

    .line 727
    .line 728
    const v1, -0x13e06f82

    .line 729
    .line 730
    .line 731
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 732
    .line 733
    .line 734
    sget-object v1, La/djv0;->w:Ljava/util/WeakHashMap;

    .line 735
    .line 736
    invoke-static {v0}, La/zcm0;->i(La/fet;)La/djv0;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    iget-object v1, v1, La/djv0;->g:La/q33;

    .line 741
    .line 742
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 743
    .line 744
    .line 745
    return-object v1

    .line 746
    :pswitch_14
    move-object/from16 v0, p1

    .line 747
    .line 748
    check-cast v0, La/fet;

    .line 749
    .line 750
    move-object/from16 v1, p2

    .line 751
    .line 752
    check-cast v1, Ljava/lang/Integer;

    .line 753
    .line 754
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    invoke-static {v7}, La/x8x;->L(I)I

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    invoke-static {v1, v0}, La/j47;->Z(ILa/fet;)V

    .line 762
    .line 763
    .line 764
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 765
    .line 766
    return-object v0

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
    const v4, 0x7f0d0620

    .line 776
    .line 777
    .line 778
    invoke-static {v0, v3, v4, v3, v8}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    const v3, 0x7f0a024a

    .line 783
    .line 784
    .line 785
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 786
    .line 787
    .line 788
    move-result-object v4

    .line 789
    move-object v9, v4

    .line 790
    check-cast v9, Landroid/widget/TextView;

    .line 791
    .line 792
    if-eqz v9, :cond_8

    .line 793
    .line 794
    const v3, 0x7f0a045c

    .line 795
    .line 796
    .line 797
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 798
    .line 799
    .line 800
    move-result-object v10

    .line 801
    if-eqz v10, :cond_8

    .line 802
    .line 803
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    move-object v11, v3

    .line 808
    check-cast v11, Landroid/widget/ImageView;

    .line 809
    .line 810
    if-eqz v11, :cond_7

    .line 811
    .line 812
    const v2, 0x7f0a0adc

    .line 813
    .line 814
    .line 815
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 816
    .line 817
    .line 818
    move-result-object v3

    .line 819
    check-cast v3, Landroid/widget/ImageView;

    .line 820
    .line 821
    if-eqz v3, :cond_7

    .line 822
    .line 823
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 824
    .line 825
    .line 826
    move-result-object v2

    .line 827
    move-object v12, v2

    .line 828
    check-cast v12, Landroid/widget/TextView;

    .line 829
    .line 830
    if-eqz v12, :cond_9

    .line 831
    .line 832
    const v1, 0x7f0a0fcf

    .line 833
    .line 834
    .line 835
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 836
    .line 837
    .line 838
    move-result-object v2

    .line 839
    move-object v13, v2

    .line 840
    check-cast v13, Landroid/widget/TextView;

    .line 841
    .line 842
    if-eqz v13, :cond_9

    .line 843
    .line 844
    new-instance v7, La/b8u0;

    .line 845
    .line 846
    move-object v8, v0

    .line 847
    check-cast v8, Lcom/google/android/material/card/MaterialCardView;

    .line 848
    .line 849
    invoke-direct/range {v7 .. v13}, La/b8u0;-><init>(Lcom/google/android/material/card/MaterialCardView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 850
    .line 851
    .line 852
    move-object v6, v7

    .line 853
    goto :goto_7

    .line 854
    :cond_7
    move v1, v2

    .line 855
    goto :goto_6

    .line 856
    :cond_8
    move v1, v3

    .line 857
    :cond_9
    :goto_6
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    :goto_7
    return-object v6

    .line 873
    :pswitch_16
    move-object/from16 v0, p1

    .line 874
    .line 875
    check-cast v0, La/fet;

    .line 876
    .line 877
    move-object/from16 v1, p2

    .line 878
    .line 879
    check-cast v1, Ljava/lang/Integer;

    .line 880
    .line 881
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    invoke-static {v7}, La/x8x;->L(I)I

    .line 885
    .line 886
    .line 887
    move-result v1

    .line 888
    invoke-static {v1, v0}, La/kc5;->c0(ILa/fet;)V

    .line 889
    .line 890
    .line 891
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 892
    .line 893
    return-object v0

    .line 894
    :pswitch_17
    move-object/from16 v0, p1

    .line 895
    .line 896
    check-cast v0, Landroid/view/LayoutInflater;

    .line 897
    .line 898
    move-object/from16 v1, p2

    .line 899
    .line 900
    check-cast v1, Landroid/view/ViewGroup;

    .line 901
    .line 902
    const v2, 0x7f0d061e

    .line 903
    .line 904
    .line 905
    invoke-static {v0, v1, v2, v1, v8}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    const v1, 0x7f0a0165

    .line 910
    .line 911
    .line 912
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    check-cast v2, Lorg/xplatform/uikit/components/password_requirement/DsBulletList;

    .line 917
    .line 918
    if-eqz v2, :cond_a

    .line 919
    .line 920
    const v1, 0x7f0a027d

    .line 921
    .line 922
    .line 923
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    check-cast v3, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 928
    .line 929
    if-eqz v3, :cond_a

    .line 930
    .line 931
    const v1, 0x7f0a0283

    .line 932
    .line 933
    .line 934
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 935
    .line 936
    .line 937
    move-result-object v3

    .line 938
    check-cast v3, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 939
    .line 940
    if-eqz v3, :cond_a

    .line 941
    .line 942
    const v1, 0x7f0a1339

    .line 943
    .line 944
    .line 945
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 946
    .line 947
    .line 948
    move-result-object v4

    .line 949
    if-eqz v4, :cond_a

    .line 950
    .line 951
    const v1, 0x7f0a13bf

    .line 952
    .line 953
    .line 954
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 955
    .line 956
    .line 957
    move-result-object v7

    .line 958
    check-cast v7, Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;

    .line 959
    .line 960
    if-eqz v7, :cond_a

    .line 961
    .line 962
    new-instance v6, La/m6u0;

    .line 963
    .line 964
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 965
    .line 966
    invoke-direct {v6, v0, v2, v3, v4}, La/m6u0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/password_requirement/DsBulletList;Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;Landroid/view/View;)V

    .line 967
    .line 968
    .line 969
    goto :goto_8

    .line 970
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    :goto_8
    return-object v6

    .line 986
    :pswitch_18
    move-object/from16 v0, p1

    .line 987
    .line 988
    check-cast v0, La/wgv;

    .line 989
    .line 990
    move-object/from16 v1, p2

    .line 991
    .line 992
    check-cast v1, Ljava/lang/Float;

    .line 993
    .line 994
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 995
    .line 996
    .line 997
    move-result v1

    .line 998
    iput v1, v0, La/wgv;->r:F

    .line 999
    .line 1000
    iput-boolean v7, v0, La/wgv;->s:Z

    .line 1001
    .line 1002
    invoke-virtual {v0}, La/hwt0;->c()V

    .line 1003
    .line 1004
    .line 1005
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1006
    .line 1007
    return-object v0

    .line 1008
    :pswitch_19
    move-object/from16 v0, p1

    .line 1009
    .line 1010
    check-cast v0, La/wgv;

    .line 1011
    .line 1012
    move-object/from16 v1, p2

    .line 1013
    .line 1014
    check-cast v1, Ljava/lang/Float;

    .line 1015
    .line 1016
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1017
    .line 1018
    .line 1019
    move-result v1

    .line 1020
    iput v1, v0, La/wgv;->q:F

    .line 1021
    .line 1022
    iput-boolean v7, v0, La/wgv;->s:Z

    .line 1023
    .line 1024
    invoke-virtual {v0}, La/hwt0;->c()V

    .line 1025
    .line 1026
    .line 1027
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1028
    .line 1029
    return-object v0

    .line 1030
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1031
    .line 1032
    check-cast v0, La/wgv;

    .line 1033
    .line 1034
    move-object/from16 v1, p2

    .line 1035
    .line 1036
    check-cast v1, Ljava/lang/Float;

    .line 1037
    .line 1038
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1039
    .line 1040
    .line 1041
    move-result v1

    .line 1042
    iput v1, v0, La/wgv;->p:F

    .line 1043
    .line 1044
    iput-boolean v7, v0, La/wgv;->s:Z

    .line 1045
    .line 1046
    invoke-virtual {v0}, La/hwt0;->c()V

    .line 1047
    .line 1048
    .line 1049
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1050
    .line 1051
    return-object v0

    .line 1052
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1053
    .line 1054
    check-cast v0, La/wgv;

    .line 1055
    .line 1056
    move-object/from16 v1, p2

    .line 1057
    .line 1058
    check-cast v1, Ljava/lang/Float;

    .line 1059
    .line 1060
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1061
    .line 1062
    .line 1063
    move-result v1

    .line 1064
    iput v1, v0, La/wgv;->o:F

    .line 1065
    .line 1066
    iput-boolean v7, v0, La/wgv;->s:Z

    .line 1067
    .line 1068
    invoke-virtual {v0}, La/hwt0;->c()V

    .line 1069
    .line 1070
    .line 1071
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1072
    .line 1073
    return-object v0

    .line 1074
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1075
    .line 1076
    check-cast v0, La/wgv;

    .line 1077
    .line 1078
    move-object/from16 v1, p2

    .line 1079
    .line 1080
    check-cast v1, Ljava/lang/Float;

    .line 1081
    .line 1082
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1083
    .line 1084
    .line 1085
    move-result v1

    .line 1086
    iput v1, v0, La/wgv;->n:F

    .line 1087
    .line 1088
    iput-boolean v7, v0, La/wgv;->s:Z

    .line 1089
    .line 1090
    invoke-virtual {v0}, La/hwt0;->c()V

    .line 1091
    .line 1092
    .line 1093
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1094
    .line 1095
    return-object v0

    .line 1096
    nop

    .line 1097
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
