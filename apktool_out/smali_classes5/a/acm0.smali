.class public final synthetic La/acm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/acm0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    const/4 p1, 0x6

    iput-byte p1, p0, La/acm0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/acm0;->a:B

    .line 4
    .line 5
    const v9, 0x7f0a07ca

    .line 6
    .line 7
    .line 8
    const v10, 0x7f0a07c8

    .line 9
    .line 10
    .line 11
    const v11, 0x7f0a07c5

    .line 12
    .line 13
    .line 14
    const v12, 0x7f0a035c

    .line 15
    .line 16
    .line 17
    const v13, 0x7f0a0359

    .line 18
    .line 19
    .line 20
    const v14, 0x7f0a0358

    .line 21
    .line 22
    .line 23
    const v15, 0x7f0a0355

    .line 24
    .line 25
    .line 26
    const v1, 0x7f0a02c5

    .line 27
    .line 28
    .line 29
    const v2, 0x7f0a024d

    .line 30
    .line 31
    .line 32
    const v3, 0x7f0a017e

    .line 33
    .line 34
    .line 35
    const v4, 0x7f0a00f8

    .line 36
    .line 37
    .line 38
    const-string v5, "Missing required view with ID: "

    .line 39
    .line 40
    const/16 v20, 0x0

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    packed-switch v0, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    move-object/from16 v0, p1

    .line 47
    .line 48
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 49
    .line 50
    move-object/from16 v1, p2

    .line 51
    .line 52
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v2, La/nco0;->a:La/nco0;

    .line 61
    .line 62
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    new-instance v0, La/a7n0;

    .line 66
    .line 67
    const/16 v2, 0x1d

    .line 68
    .line 69
    invoke-direct {v0, v2}, La/a7n0;-><init>(B)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_0
    move-object/from16 v0, p1

    .line 79
    .line 80
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 81
    .line 82
    move-object/from16 v1, p2

    .line 83
    .line 84
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v2, La/rgn0;

    .line 93
    .line 94
    const/16 v3, 0x1b

    .line 95
    .line 96
    invoke-direct {v2, v3}, La/rgn0;-><init>(B)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    new-instance v0, La/dco0;

    .line 103
    .line 104
    const/4 v2, 0x1

    .line 105
    invoke-direct {v0, v2}, La/dco0;-><init>(B)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 117
    .line 118
    move-object/from16 v1, p2

    .line 119
    .line 120
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v2, La/rgn0;

    .line 129
    .line 130
    const/16 v3, 0x1a

    .line 131
    .line 132
    invoke-direct {v2, v3}, La/rgn0;-><init>(B)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    new-instance v0, La/dco0;

    .line 139
    .line 140
    invoke-direct {v0, v6}, La/dco0;-><init>(B)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_2
    move-object/from16 v0, p1

    .line 150
    .line 151
    check-cast v0, La/oyg0;

    .line 152
    .line 153
    move-object/from16 v1, p2

    .line 154
    .line 155
    check-cast v1, La/glb0;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance v10, La/nn00;

    .line 164
    .line 165
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 166
    .line 167
    .line 168
    new-instance v9, La/nn00;

    .line 169
    .line 170
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    new-instance v11, La/nn00;

    .line 174
    .line 175
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    new-instance v12, La/nn00;

    .line 179
    .line 180
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 181
    .line 182
    .line 183
    new-instance v13, La/nn00;

    .line 184
    .line 185
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 186
    .line 187
    .line 188
    new-instance v14, La/nn00;

    .line 189
    .line 190
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 191
    .line 192
    .line 193
    new-instance v15, La/nn00;

    .line 194
    .line 195
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 196
    .line 197
    .line 198
    new-instance v16, La/nn00;

    .line 199
    .line 200
    invoke-direct/range {v16 .. v16}, Ljava/lang/Object;-><init>()V

    .line 201
    .line 202
    .line 203
    new-instance v17, La/nn00;

    .line 204
    .line 205
    invoke-direct/range {v17 .. v17}, Ljava/lang/Object;-><init>()V

    .line 206
    .line 207
    .line 208
    const/16 v20, 0x0

    .line 209
    .line 210
    const v21, 0x1c01fff

    .line 211
    .line 212
    .line 213
    const/4 v2, 0x0

    .line 214
    const/4 v3, 0x0

    .line 215
    const/4 v4, 0x0

    .line 216
    const/4 v5, 0x0

    .line 217
    const/4 v6, 0x0

    .line 218
    const/4 v7, 0x0

    .line 219
    const/4 v8, 0x0

    .line 220
    const/16 v18, 0x0

    .line 221
    .line 222
    const/16 v19, 0x0

    .line 223
    .line 224
    invoke-static/range {v1 .. v21}, La/glb0;->a(La/glb0;ZZLa/trd;La/trd;La/trd;La/trd;La/trd;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;La/rn00;Ljava/util/List;La/skb0;ZI)La/glb0;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    return-object v0

    .line 229
    :pswitch_3
    move-object/from16 v0, p1

    .line 230
    .line 231
    check-cast v0, Landroid/view/LayoutInflater;

    .line 232
    .line 233
    move-object/from16 v1, p2

    .line 234
    .line 235
    check-cast v1, Landroid/view/ViewGroup;

    .line 236
    .line 237
    const v2, 0x7f0d0127

    .line 238
    .line 239
    .line 240
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    const v1, 0x7f0a12ff

    .line 245
    .line 246
    .line 247
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 252
    .line 253
    if-eqz v2, :cond_0

    .line 254
    .line 255
    new-instance v1, La/b3k;

    .line 256
    .line 257
    check-cast v0, Landroid/widget/LinearLayout;

    .line 258
    .line 259
    invoke-direct {v1, v0, v2}, La/b3k;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v20, v1

    .line 263
    .line 264
    goto :goto_0

    .line 265
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :goto_0
    return-object v20

    .line 281
    :pswitch_4
    move-object/from16 v0, p1

    .line 282
    .line 283
    check-cast v0, La/fet;

    .line 284
    .line 285
    move-object/from16 v1, p2

    .line 286
    .line 287
    check-cast v1, Ljava/lang/Integer;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 290
    .line 291
    .line 292
    const v1, 0x593f341

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 296
    .line 297
    .line 298
    const/4 v1, 0x3

    .line 299
    invoke-static {v6, v6, v0, v6, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {v0, v6}, La/fet;->r(Z)V

    .line 304
    .line 305
    .line 306
    return-object v1

    .line 307
    :pswitch_5
    move-object/from16 v0, p1

    .line 308
    .line 309
    check-cast v0, Landroid/view/LayoutInflater;

    .line 310
    .line 311
    move-object/from16 v1, p2

    .line 312
    .line 313
    check-cast v1, Landroid/view/ViewGroup;

    .line 314
    .line 315
    const v2, 0x7f0d045b

    .line 316
    .line 317
    .line 318
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    const v1, 0x7f0a0347

    .line 323
    .line 324
    .line 325
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 330
    .line 331
    if-eqz v2, :cond_1

    .line 332
    .line 333
    const v1, 0x7f0a03cc

    .line 334
    .line 335
    .line 336
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    check-cast v3, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 341
    .line 342
    if-eqz v3, :cond_1

    .line 343
    .line 344
    const v1, 0x7f0a0d78

    .line 345
    .line 346
    .line 347
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    check-cast v4, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 352
    .line 353
    if-eqz v4, :cond_1

    .line 354
    .line 355
    new-instance v1, La/lyx;

    .line 356
    .line 357
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 358
    .line 359
    invoke-direct {v1, v0, v2, v3}, La/lyx;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;)V

    .line 360
    .line 361
    .line 362
    move-object/from16 v20, v1

    .line 363
    .line 364
    goto :goto_1

    .line 365
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    :goto_1
    return-object v20

    .line 381
    :pswitch_6
    move-object/from16 v0, p1

    .line 382
    .line 383
    check-cast v0, La/oyg0;

    .line 384
    .line 385
    move-object/from16 v1, p2

    .line 386
    .line 387
    check-cast v1, La/vxn0;

    .line 388
    .line 389
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    const/16 v18, 0x0

    .line 396
    .line 397
    const v19, 0x17fff

    .line 398
    .line 399
    .line 400
    const/4 v2, 0x0

    .line 401
    const/4 v3, 0x0

    .line 402
    const/4 v4, 0x0

    .line 403
    const/4 v5, 0x0

    .line 404
    const/4 v6, 0x0

    .line 405
    const/4 v7, 0x0

    .line 406
    const/4 v8, 0x0

    .line 407
    const/4 v9, 0x0

    .line 408
    const/4 v10, 0x0

    .line 409
    const/4 v11, 0x0

    .line 410
    const/4 v12, 0x0

    .line 411
    const/4 v13, 0x0

    .line 412
    const/4 v14, 0x0

    .line 413
    const/4 v15, 0x0

    .line 414
    const/16 v16, 0x0

    .line 415
    .line 416
    const/16 v17, 0x1

    .line 417
    .line 418
    invoke-static/range {v1 .. v19}, La/vxn0;->a(La/vxn0;La/a4x;La/a4x;ZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/he;ZZZLa/bpn0;I)La/vxn0;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    return-object v0

    .line 423
    :pswitch_7
    move-object/from16 v0, p1

    .line 424
    .line 425
    check-cast v0, La/oyg0;

    .line 426
    .line 427
    move-object/from16 v1, p2

    .line 428
    .line 429
    check-cast v1, La/vxn0;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    const/16 v18, 0x0

    .line 438
    .line 439
    const v19, 0x1ff0f

    .line 440
    .line 441
    .line 442
    const/4 v2, 0x0

    .line 443
    const/4 v3, 0x0

    .line 444
    const/4 v4, 0x0

    .line 445
    const/4 v5, 0x0

    .line 446
    const/4 v6, 0x0

    .line 447
    const/4 v7, 0x0

    .line 448
    const/4 v8, 0x0

    .line 449
    const/4 v9, 0x1

    .line 450
    const/4 v10, 0x0

    .line 451
    const/4 v11, 0x0

    .line 452
    const/4 v12, 0x0

    .line 453
    const/4 v13, 0x0

    .line 454
    const/4 v14, 0x0

    .line 455
    const/4 v15, 0x0

    .line 456
    const/16 v16, 0x0

    .line 457
    .line 458
    const/16 v17, 0x0

    .line 459
    .line 460
    invoke-static/range {v1 .. v19}, La/vxn0;->a(La/vxn0;La/a4x;La/a4x;ZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/he;ZZZLa/bpn0;I)La/vxn0;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    return-object v0

    .line 465
    :pswitch_8
    move-object/from16 v0, p1

    .line 466
    .line 467
    check-cast v0, Landroid/view/LayoutInflater;

    .line 468
    .line 469
    move-object/from16 v7, p2

    .line 470
    .line 471
    check-cast v7, Landroid/view/ViewGroup;

    .line 472
    .line 473
    const v8, 0x7f0d05a9

    .line 474
    .line 475
    .line 476
    invoke-static {v0, v7, v8, v7, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    move-object/from16 v24, v6

    .line 485
    .line 486
    check-cast v24, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 487
    .line 488
    if-eqz v24, :cond_13

    .line 489
    .line 490
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 491
    .line 492
    .line 493
    move-result-object v25

    .line 494
    if-eqz v25, :cond_12

    .line 495
    .line 496
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 497
    .line 498
    .line 499
    move-result-object v26

    .line 500
    if-eqz v26, :cond_11

    .line 501
    .line 502
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    move-object/from16 v27, v2

    .line 507
    .line 508
    check-cast v27, Landroid/widget/TextView;

    .line 509
    .line 510
    if-eqz v27, :cond_14

    .line 511
    .line 512
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    check-cast v1, Landroid/widget/LinearLayout;

    .line 517
    .line 518
    if-eqz v1, :cond_10

    .line 519
    .line 520
    invoke-static {v0, v14}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    check-cast v1, Landroid/widget/ImageView;

    .line 525
    .line 526
    if-eqz v1, :cond_f

    .line 527
    .line 528
    invoke-static {v0, v13}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    check-cast v1, Landroid/widget/TextView;

    .line 533
    .line 534
    if-eqz v1, :cond_e

    .line 535
    .line 536
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    move-object/from16 v28, v1

    .line 541
    .line 542
    check-cast v28, Landroid/widget/TextView;

    .line 543
    .line 544
    if-eqz v28, :cond_d

    .line 545
    .line 546
    const v1, 0x7f0a05ac

    .line 547
    .line 548
    .line 549
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    move-object/from16 v29, v2

    .line 554
    .line 555
    check-cast v29, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 556
    .line 557
    if-eqz v29, :cond_14

    .line 558
    .line 559
    const v1, 0x7f0a05af

    .line 560
    .line 561
    .line 562
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    move-object/from16 v30, v2

    .line 567
    .line 568
    check-cast v30, Landroid/widget/TextView;

    .line 569
    .line 570
    if-eqz v30, :cond_14

    .line 571
    .line 572
    invoke-static {v0, v11}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    check-cast v1, Landroid/widget/LinearLayout;

    .line 577
    .line 578
    if-eqz v1, :cond_c

    .line 579
    .line 580
    invoke-static {v0, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    check-cast v1, Landroid/widget/ImageView;

    .line 585
    .line 586
    if-eqz v1, :cond_b

    .line 587
    .line 588
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    check-cast v1, Landroid/widget/TextView;

    .line 593
    .line 594
    if-eqz v1, :cond_a

    .line 595
    .line 596
    const v1, 0x7f0a07ce

    .line 597
    .line 598
    .line 599
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    move-object/from16 v31, v2

    .line 604
    .line 605
    check-cast v31, Landroid/widget/TextView;

    .line 606
    .line 607
    if-eqz v31, :cond_9

    .line 608
    .line 609
    const v1, 0x7f0a07d1

    .line 610
    .line 611
    .line 612
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    move-object/from16 v32, v2

    .line 617
    .line 618
    check-cast v32, Landroid/widget/TextView;

    .line 619
    .line 620
    if-eqz v32, :cond_8

    .line 621
    .line 622
    const v1, 0x7f0a09ef

    .line 623
    .line 624
    .line 625
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    check-cast v2, Landroid/widget/LinearLayout;

    .line 630
    .line 631
    if-eqz v2, :cond_7

    .line 632
    .line 633
    const v1, 0x7f0a09f2

    .line 634
    .line 635
    .line 636
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    check-cast v2, Landroid/widget/ImageView;

    .line 641
    .line 642
    if-eqz v2, :cond_6

    .line 643
    .line 644
    const v1, 0x7f0a09f3

    .line 645
    .line 646
    .line 647
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    move-object/from16 v33, v2

    .line 652
    .line 653
    check-cast v33, Landroid/widget/TextView;

    .line 654
    .line 655
    if-eqz v33, :cond_5

    .line 656
    .line 657
    const v1, 0x7f0a09f7

    .line 658
    .line 659
    .line 660
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    move-object/from16 v34, v2

    .line 665
    .line 666
    check-cast v34, Landroid/widget/TextView;

    .line 667
    .line 668
    if-eqz v34, :cond_4

    .line 669
    .line 670
    const v1, 0x7f0a0b75

    .line 671
    .line 672
    .line 673
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    check-cast v2, Landroid/widget/TextView;

    .line 678
    .line 679
    if-eqz v2, :cond_3

    .line 680
    .line 681
    const v1, 0x7f0a0b77

    .line 682
    .line 683
    .line 684
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    check-cast v2, Landroid/widget/LinearLayout;

    .line 689
    .line 690
    if-eqz v2, :cond_2

    .line 691
    .line 692
    const v1, 0x7f0a0b78

    .line 693
    .line 694
    .line 695
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    check-cast v2, Landroid/widget/ImageView;

    .line 700
    .line 701
    if-eqz v2, :cond_14

    .line 702
    .line 703
    const v1, 0x7f0a0b7b

    .line 704
    .line 705
    .line 706
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    move-object/from16 v35, v2

    .line 711
    .line 712
    check-cast v35, Landroid/widget/TextView;

    .line 713
    .line 714
    if-eqz v35, :cond_14

    .line 715
    .line 716
    const v1, 0x7f0a0d42

    .line 717
    .line 718
    .line 719
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    move-object/from16 v36, v2

    .line 724
    .line 725
    check-cast v36, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 726
    .line 727
    if-eqz v36, :cond_14

    .line 728
    .line 729
    const v1, 0x7f0a0d45

    .line 730
    .line 731
    .line 732
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    move-object/from16 v37, v2

    .line 737
    .line 738
    check-cast v37, Landroid/widget/TextView;

    .line 739
    .line 740
    if-eqz v37, :cond_14

    .line 741
    .line 742
    const v1, 0x7f0a0e57

    .line 743
    .line 744
    .line 745
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    move-object/from16 v38, v2

    .line 750
    .line 751
    check-cast v38, Landroid/widget/ImageView;

    .line 752
    .line 753
    if-eqz v38, :cond_14

    .line 754
    .line 755
    const v1, 0x7f0a0e59

    .line 756
    .line 757
    .line 758
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 759
    .line 760
    .line 761
    move-result-object v39

    .line 762
    if-eqz v39, :cond_14

    .line 763
    .line 764
    const v1, 0x7f0a0e5a

    .line 765
    .line 766
    .line 767
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    move-object/from16 v40, v2

    .line 772
    .line 773
    check-cast v40, Landroid/widget/TextView;

    .line 774
    .line 775
    if-eqz v40, :cond_14

    .line 776
    .line 777
    const v1, 0x7f0a0fc6

    .line 778
    .line 779
    .line 780
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    move-object/from16 v41, v2

    .line 785
    .line 786
    check-cast v41, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 787
    .line 788
    if-eqz v41, :cond_14

    .line 789
    .line 790
    const v1, 0x7f0a0fc9

    .line 791
    .line 792
    .line 793
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    check-cast v2, Landroid/widget/TextView;

    .line 798
    .line 799
    if-eqz v2, :cond_14

    .line 800
    .line 801
    const v1, 0x7f0a1432

    .line 802
    .line 803
    .line 804
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    move-object/from16 v42, v2

    .line 809
    .line 810
    check-cast v42, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 811
    .line 812
    if-eqz v42, :cond_14

    .line 813
    .line 814
    new-instance v22, La/own0;

    .line 815
    .line 816
    move-object/from16 v23, v0

    .line 817
    .line 818
    check-cast v23, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 819
    .line 820
    invoke-direct/range {v22 .. v42}, La/own0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Lorg/xplatform/uikit/components/timer/DsTimer;Lorg/xplatform/uikit_sport/score/SportScore;)V

    .line 821
    .line 822
    .line 823
    move-object/from16 v20, v22

    .line 824
    .line 825
    goto :goto_3

    .line 826
    :cond_2
    const v1, 0x7f0a0b77

    .line 827
    .line 828
    .line 829
    goto :goto_2

    .line 830
    :cond_3
    const v1, 0x7f0a0b75

    .line 831
    .line 832
    .line 833
    goto :goto_2

    .line 834
    :cond_4
    const v1, 0x7f0a09f7

    .line 835
    .line 836
    .line 837
    goto :goto_2

    .line 838
    :cond_5
    const v1, 0x7f0a09f3

    .line 839
    .line 840
    .line 841
    goto :goto_2

    .line 842
    :cond_6
    const v1, 0x7f0a09f2

    .line 843
    .line 844
    .line 845
    goto :goto_2

    .line 846
    :cond_7
    const v1, 0x7f0a09ef

    .line 847
    .line 848
    .line 849
    goto :goto_2

    .line 850
    :cond_8
    const v1, 0x7f0a07d1

    .line 851
    .line 852
    .line 853
    goto :goto_2

    .line 854
    :cond_9
    const v1, 0x7f0a07ce

    .line 855
    .line 856
    .line 857
    goto :goto_2

    .line 858
    :cond_a
    move v1, v9

    .line 859
    goto :goto_2

    .line 860
    :cond_b
    move v1, v10

    .line 861
    goto :goto_2

    .line 862
    :cond_c
    move v1, v11

    .line 863
    goto :goto_2

    .line 864
    :cond_d
    move v1, v12

    .line 865
    goto :goto_2

    .line 866
    :cond_e
    move v1, v13

    .line 867
    goto :goto_2

    .line 868
    :cond_f
    move v1, v14

    .line 869
    goto :goto_2

    .line 870
    :cond_10
    move v1, v15

    .line 871
    goto :goto_2

    .line 872
    :cond_11
    move v1, v2

    .line 873
    goto :goto_2

    .line 874
    :cond_12
    move v1, v3

    .line 875
    goto :goto_2

    .line 876
    :cond_13
    move v1, v4

    .line 877
    :cond_14
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    :goto_3
    return-object v20

    .line 893
    :pswitch_9
    move-object/from16 v0, p1

    .line 894
    .line 895
    check-cast v0, Landroid/view/LayoutInflater;

    .line 896
    .line 897
    move-object/from16 v7, p2

    .line 898
    .line 899
    check-cast v7, Landroid/view/ViewGroup;

    .line 900
    .line 901
    const v8, 0x7f0d05a8

    .line 902
    .line 903
    .line 904
    invoke-static {v0, v7, v8, v7, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 909
    .line 910
    .line 911
    move-result-object v6

    .line 912
    move-object/from16 v24, v6

    .line 913
    .line 914
    check-cast v24, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 915
    .line 916
    if-eqz v24, :cond_26

    .line 917
    .line 918
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 919
    .line 920
    .line 921
    move-result-object v25

    .line 922
    if-eqz v25, :cond_25

    .line 923
    .line 924
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 925
    .line 926
    .line 927
    move-result-object v26

    .line 928
    if-eqz v26, :cond_24

    .line 929
    .line 930
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 931
    .line 932
    .line 933
    move-result-object v2

    .line 934
    move-object/from16 v27, v2

    .line 935
    .line 936
    check-cast v27, Landroid/widget/TextView;

    .line 937
    .line 938
    if-eqz v27, :cond_27

    .line 939
    .line 940
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    check-cast v1, Landroid/widget/LinearLayout;

    .line 945
    .line 946
    if-eqz v1, :cond_23

    .line 947
    .line 948
    invoke-static {v0, v14}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    check-cast v1, Landroid/widget/ImageView;

    .line 953
    .line 954
    if-eqz v1, :cond_22

    .line 955
    .line 956
    invoke-static {v0, v13}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    check-cast v1, Landroid/widget/TextView;

    .line 961
    .line 962
    if-eqz v1, :cond_21

    .line 963
    .line 964
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 965
    .line 966
    .line 967
    move-result-object v1

    .line 968
    move-object/from16 v28, v1

    .line 969
    .line 970
    check-cast v28, Landroid/widget/TextView;

    .line 971
    .line 972
    if-eqz v28, :cond_20

    .line 973
    .line 974
    invoke-static {v0, v11}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 975
    .line 976
    .line 977
    move-result-object v1

    .line 978
    check-cast v1, Landroid/widget/LinearLayout;

    .line 979
    .line 980
    if-eqz v1, :cond_1f

    .line 981
    .line 982
    invoke-static {v0, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 983
    .line 984
    .line 985
    move-result-object v1

    .line 986
    check-cast v1, Landroid/widget/ImageView;

    .line 987
    .line 988
    if-eqz v1, :cond_1e

    .line 989
    .line 990
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 991
    .line 992
    .line 993
    move-result-object v1

    .line 994
    check-cast v1, Landroid/widget/TextView;

    .line 995
    .line 996
    if-eqz v1, :cond_1d

    .line 997
    .line 998
    const v1, 0x7f0a07ce

    .line 999
    .line 1000
    .line 1001
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    check-cast v2, Landroid/widget/TextView;

    .line 1006
    .line 1007
    if-eqz v2, :cond_1c

    .line 1008
    .line 1009
    const v1, 0x7f0a07d1

    .line 1010
    .line 1011
    .line 1012
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    move-object/from16 v29, v2

    .line 1017
    .line 1018
    check-cast v29, Landroid/widget/TextView;

    .line 1019
    .line 1020
    if-eqz v29, :cond_1b

    .line 1021
    .line 1022
    const v1, 0x7f0a09ef

    .line 1023
    .line 1024
    .line 1025
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    check-cast v2, Landroid/widget/LinearLayout;

    .line 1030
    .line 1031
    if-eqz v2, :cond_1a

    .line 1032
    .line 1033
    const v1, 0x7f0a09f2

    .line 1034
    .line 1035
    .line 1036
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2

    .line 1040
    check-cast v2, Landroid/widget/ImageView;

    .line 1041
    .line 1042
    if-eqz v2, :cond_19

    .line 1043
    .line 1044
    const v1, 0x7f0a09f3

    .line 1045
    .line 1046
    .line 1047
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v2

    .line 1051
    move-object/from16 v30, v2

    .line 1052
    .line 1053
    check-cast v30, Landroid/widget/TextView;

    .line 1054
    .line 1055
    if-eqz v30, :cond_18

    .line 1056
    .line 1057
    const v1, 0x7f0a09f7

    .line 1058
    .line 1059
    .line 1060
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v2

    .line 1064
    move-object/from16 v31, v2

    .line 1065
    .line 1066
    check-cast v31, Landroid/widget/TextView;

    .line 1067
    .line 1068
    if-eqz v31, :cond_17

    .line 1069
    .line 1070
    const v1, 0x7f0a0b75

    .line 1071
    .line 1072
    .line 1073
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v2

    .line 1077
    check-cast v2, Landroid/widget/TextView;

    .line 1078
    .line 1079
    if-eqz v2, :cond_16

    .line 1080
    .line 1081
    const v1, 0x7f0a0b77

    .line 1082
    .line 1083
    .line 1084
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v2

    .line 1088
    check-cast v2, Landroid/widget/LinearLayout;

    .line 1089
    .line 1090
    if-eqz v2, :cond_15

    .line 1091
    .line 1092
    const v1, 0x7f0a0b78

    .line 1093
    .line 1094
    .line 1095
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    check-cast v2, Landroid/widget/ImageView;

    .line 1100
    .line 1101
    if-eqz v2, :cond_27

    .line 1102
    .line 1103
    const v1, 0x7f0a0b7b

    .line 1104
    .line 1105
    .line 1106
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    move-object/from16 v32, v2

    .line 1111
    .line 1112
    check-cast v32, Landroid/widget/TextView;

    .line 1113
    .line 1114
    if-eqz v32, :cond_27

    .line 1115
    .line 1116
    const v1, 0x7f0a0e57

    .line 1117
    .line 1118
    .line 1119
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v2

    .line 1123
    move-object/from16 v33, v2

    .line 1124
    .line 1125
    check-cast v33, Landroid/widget/ImageView;

    .line 1126
    .line 1127
    if-eqz v33, :cond_27

    .line 1128
    .line 1129
    const v1, 0x7f0a0e59

    .line 1130
    .line 1131
    .line 1132
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v34

    .line 1136
    if-eqz v34, :cond_27

    .line 1137
    .line 1138
    const v1, 0x7f0a0e5a

    .line 1139
    .line 1140
    .line 1141
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v2

    .line 1145
    move-object/from16 v35, v2

    .line 1146
    .line 1147
    check-cast v35, Landroid/widget/TextView;

    .line 1148
    .line 1149
    if-eqz v35, :cond_27

    .line 1150
    .line 1151
    const v1, 0x7f0a0fc6

    .line 1152
    .line 1153
    .line 1154
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    move-object/from16 v36, v2

    .line 1159
    .line 1160
    check-cast v36, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 1161
    .line 1162
    if-eqz v36, :cond_27

    .line 1163
    .line 1164
    const v1, 0x7f0a0fc9

    .line 1165
    .line 1166
    .line 1167
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    check-cast v2, Landroid/widget/TextView;

    .line 1172
    .line 1173
    if-eqz v2, :cond_27

    .line 1174
    .line 1175
    const v1, 0x7f0a1432

    .line 1176
    .line 1177
    .line 1178
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v2

    .line 1182
    move-object/from16 v37, v2

    .line 1183
    .line 1184
    check-cast v37, Landroid/widget/TextView;

    .line 1185
    .line 1186
    if-eqz v37, :cond_27

    .line 1187
    .line 1188
    new-instance v22, La/nwn0;

    .line 1189
    .line 1190
    move-object/from16 v23, v0

    .line 1191
    .line 1192
    check-cast v23, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1193
    .line 1194
    invoke-direct/range {v22 .. v37}, La/nwn0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Lorg/xplatform/uikit/components/timer/DsTimer;Landroid/widget/TextView;)V

    .line 1195
    .line 1196
    .line 1197
    move-object/from16 v20, v22

    .line 1198
    .line 1199
    goto :goto_5

    .line 1200
    :cond_15
    const v1, 0x7f0a0b77

    .line 1201
    .line 1202
    .line 1203
    goto :goto_4

    .line 1204
    :cond_16
    const v1, 0x7f0a0b75

    .line 1205
    .line 1206
    .line 1207
    goto :goto_4

    .line 1208
    :cond_17
    const v1, 0x7f0a09f7

    .line 1209
    .line 1210
    .line 1211
    goto :goto_4

    .line 1212
    :cond_18
    const v1, 0x7f0a09f3

    .line 1213
    .line 1214
    .line 1215
    goto :goto_4

    .line 1216
    :cond_19
    const v1, 0x7f0a09f2

    .line 1217
    .line 1218
    .line 1219
    goto :goto_4

    .line 1220
    :cond_1a
    const v1, 0x7f0a09ef

    .line 1221
    .line 1222
    .line 1223
    goto :goto_4

    .line 1224
    :cond_1b
    const v1, 0x7f0a07d1

    .line 1225
    .line 1226
    .line 1227
    goto :goto_4

    .line 1228
    :cond_1c
    const v1, 0x7f0a07ce

    .line 1229
    .line 1230
    .line 1231
    goto :goto_4

    .line 1232
    :cond_1d
    move v1, v9

    .line 1233
    goto :goto_4

    .line 1234
    :cond_1e
    move v1, v10

    .line 1235
    goto :goto_4

    .line 1236
    :cond_1f
    move v1, v11

    .line 1237
    goto :goto_4

    .line 1238
    :cond_20
    move v1, v12

    .line 1239
    goto :goto_4

    .line 1240
    :cond_21
    move v1, v13

    .line 1241
    goto :goto_4

    .line 1242
    :cond_22
    move v1, v14

    .line 1243
    goto :goto_4

    .line 1244
    :cond_23
    move v1, v15

    .line 1245
    goto :goto_4

    .line 1246
    :cond_24
    move v1, v2

    .line 1247
    goto :goto_4

    .line 1248
    :cond_25
    move v1, v3

    .line 1249
    goto :goto_4

    .line 1250
    :cond_26
    move v1, v4

    .line 1251
    :cond_27
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v0

    .line 1259
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    :goto_5
    return-object v20

    .line 1267
    :pswitch_a
    move-object/from16 v0, p1

    .line 1268
    .line 1269
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1270
    .line 1271
    move-object/from16 v7, p2

    .line 1272
    .line 1273
    check-cast v7, Landroid/view/ViewGroup;

    .line 1274
    .line 1275
    const v8, 0x7f0d05a7

    .line 1276
    .line 1277
    .line 1278
    invoke-static {v0, v7, v8, v7, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v0

    .line 1282
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v6

    .line 1286
    move-object/from16 v24, v6

    .line 1287
    .line 1288
    check-cast v24, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1289
    .line 1290
    if-eqz v24, :cond_39

    .line 1291
    .line 1292
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v25

    .line 1296
    if-eqz v25, :cond_38

    .line 1297
    .line 1298
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v26

    .line 1302
    if-eqz v26, :cond_37

    .line 1303
    .line 1304
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v2

    .line 1308
    move-object/from16 v27, v2

    .line 1309
    .line 1310
    check-cast v27, Landroid/widget/TextView;

    .line 1311
    .line 1312
    if-eqz v27, :cond_3a

    .line 1313
    .line 1314
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v1

    .line 1318
    check-cast v1, Landroid/widget/LinearLayout;

    .line 1319
    .line 1320
    if-eqz v1, :cond_36

    .line 1321
    .line 1322
    invoke-static {v0, v14}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v1

    .line 1326
    check-cast v1, Landroid/widget/ImageView;

    .line 1327
    .line 1328
    if-eqz v1, :cond_35

    .line 1329
    .line 1330
    invoke-static {v0, v13}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v1

    .line 1334
    check-cast v1, Landroid/widget/TextView;

    .line 1335
    .line 1336
    if-eqz v1, :cond_34

    .line 1337
    .line 1338
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v1

    .line 1342
    move-object/from16 v28, v1

    .line 1343
    .line 1344
    check-cast v28, Landroid/widget/TextView;

    .line 1345
    .line 1346
    if-eqz v28, :cond_33

    .line 1347
    .line 1348
    const v1, 0x7f0a05ab

    .line 1349
    .line 1350
    .line 1351
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v2

    .line 1355
    move-object/from16 v29, v2

    .line 1356
    .line 1357
    check-cast v29, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1358
    .line 1359
    if-eqz v29, :cond_3a

    .line 1360
    .line 1361
    const v1, 0x7f0a05af

    .line 1362
    .line 1363
    .line 1364
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v2

    .line 1368
    move-object/from16 v30, v2

    .line 1369
    .line 1370
    check-cast v30, Landroid/widget/TextView;

    .line 1371
    .line 1372
    if-eqz v30, :cond_3a

    .line 1373
    .line 1374
    const v1, 0x7f0a05b0

    .line 1375
    .line 1376
    .line 1377
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v2

    .line 1381
    move-object/from16 v31, v2

    .line 1382
    .line 1383
    check-cast v31, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1384
    .line 1385
    if-eqz v31, :cond_3a

    .line 1386
    .line 1387
    invoke-static {v0, v11}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v1

    .line 1391
    check-cast v1, Landroid/widget/LinearLayout;

    .line 1392
    .line 1393
    if-eqz v1, :cond_32

    .line 1394
    .line 1395
    invoke-static {v0, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v1

    .line 1399
    check-cast v1, Landroid/widget/ImageView;

    .line 1400
    .line 1401
    if-eqz v1, :cond_31

    .line 1402
    .line 1403
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v1

    .line 1407
    check-cast v1, Landroid/widget/TextView;

    .line 1408
    .line 1409
    if-eqz v1, :cond_30

    .line 1410
    .line 1411
    const v1, 0x7f0a07ce

    .line 1412
    .line 1413
    .line 1414
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v2

    .line 1418
    move-object/from16 v32, v2

    .line 1419
    .line 1420
    check-cast v32, Landroid/widget/TextView;

    .line 1421
    .line 1422
    if-eqz v32, :cond_2f

    .line 1423
    .line 1424
    const v1, 0x7f0a07d1

    .line 1425
    .line 1426
    .line 1427
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v2

    .line 1431
    move-object/from16 v33, v2

    .line 1432
    .line 1433
    check-cast v33, Landroid/widget/TextView;

    .line 1434
    .line 1435
    if-eqz v33, :cond_2e

    .line 1436
    .line 1437
    const v1, 0x7f0a09ef

    .line 1438
    .line 1439
    .line 1440
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v2

    .line 1444
    check-cast v2, Landroid/widget/LinearLayout;

    .line 1445
    .line 1446
    if-eqz v2, :cond_2d

    .line 1447
    .line 1448
    const v1, 0x7f0a09f2

    .line 1449
    .line 1450
    .line 1451
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v2

    .line 1455
    check-cast v2, Landroid/widget/ImageView;

    .line 1456
    .line 1457
    if-eqz v2, :cond_2c

    .line 1458
    .line 1459
    const v1, 0x7f0a09f3

    .line 1460
    .line 1461
    .line 1462
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v2

    .line 1466
    move-object/from16 v34, v2

    .line 1467
    .line 1468
    check-cast v34, Landroid/widget/TextView;

    .line 1469
    .line 1470
    if-eqz v34, :cond_2b

    .line 1471
    .line 1472
    const v1, 0x7f0a09f7

    .line 1473
    .line 1474
    .line 1475
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v2

    .line 1479
    move-object/from16 v35, v2

    .line 1480
    .line 1481
    check-cast v35, Landroid/widget/TextView;

    .line 1482
    .line 1483
    if-eqz v35, :cond_2a

    .line 1484
    .line 1485
    const v1, 0x7f0a0b75

    .line 1486
    .line 1487
    .line 1488
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v2

    .line 1492
    check-cast v2, Landroid/widget/TextView;

    .line 1493
    .line 1494
    if-eqz v2, :cond_29

    .line 1495
    .line 1496
    const v1, 0x7f0a0b77

    .line 1497
    .line 1498
    .line 1499
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v2

    .line 1503
    check-cast v2, Landroid/widget/LinearLayout;

    .line 1504
    .line 1505
    if-eqz v2, :cond_28

    .line 1506
    .line 1507
    const v1, 0x7f0a0b78

    .line 1508
    .line 1509
    .line 1510
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v2

    .line 1514
    check-cast v2, Landroid/widget/ImageView;

    .line 1515
    .line 1516
    if-eqz v2, :cond_3a

    .line 1517
    .line 1518
    const v1, 0x7f0a0b7b

    .line 1519
    .line 1520
    .line 1521
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v2

    .line 1525
    move-object/from16 v36, v2

    .line 1526
    .line 1527
    check-cast v36, Landroid/widget/TextView;

    .line 1528
    .line 1529
    if-eqz v36, :cond_3a

    .line 1530
    .line 1531
    const v1, 0x7f0a0d41

    .line 1532
    .line 1533
    .line 1534
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v2

    .line 1538
    move-object/from16 v37, v2

    .line 1539
    .line 1540
    check-cast v37, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1541
    .line 1542
    if-eqz v37, :cond_3a

    .line 1543
    .line 1544
    const v1, 0x7f0a0d45

    .line 1545
    .line 1546
    .line 1547
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v2

    .line 1551
    move-object/from16 v38, v2

    .line 1552
    .line 1553
    check-cast v38, Landroid/widget/TextView;

    .line 1554
    .line 1555
    if-eqz v38, :cond_3a

    .line 1556
    .line 1557
    const v1, 0x7f0a0d46

    .line 1558
    .line 1559
    .line 1560
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v2

    .line 1564
    move-object/from16 v39, v2

    .line 1565
    .line 1566
    check-cast v39, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1567
    .line 1568
    if-eqz v39, :cond_3a

    .line 1569
    .line 1570
    const v1, 0x7f0a0e57

    .line 1571
    .line 1572
    .line 1573
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v2

    .line 1577
    move-object/from16 v40, v2

    .line 1578
    .line 1579
    check-cast v40, Landroid/widget/ImageView;

    .line 1580
    .line 1581
    if-eqz v40, :cond_3a

    .line 1582
    .line 1583
    const v1, 0x7f0a0e59

    .line 1584
    .line 1585
    .line 1586
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v41

    .line 1590
    if-eqz v41, :cond_3a

    .line 1591
    .line 1592
    const v1, 0x7f0a0e5a

    .line 1593
    .line 1594
    .line 1595
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v2

    .line 1599
    move-object/from16 v42, v2

    .line 1600
    .line 1601
    check-cast v42, Landroid/widget/TextView;

    .line 1602
    .line 1603
    if-eqz v42, :cond_3a

    .line 1604
    .line 1605
    const v1, 0x7f0a0fc6

    .line 1606
    .line 1607
    .line 1608
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v2

    .line 1612
    move-object/from16 v43, v2

    .line 1613
    .line 1614
    check-cast v43, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 1615
    .line 1616
    if-eqz v43, :cond_3a

    .line 1617
    .line 1618
    const v1, 0x7f0a0fc9

    .line 1619
    .line 1620
    .line 1621
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v2

    .line 1625
    check-cast v2, Landroid/widget/TextView;

    .line 1626
    .line 1627
    if-eqz v2, :cond_3a

    .line 1628
    .line 1629
    const v1, 0x7f0a1432

    .line 1630
    .line 1631
    .line 1632
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v2

    .line 1636
    move-object/from16 v44, v2

    .line 1637
    .line 1638
    check-cast v44, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 1639
    .line 1640
    if-eqz v44, :cond_3a

    .line 1641
    .line 1642
    new-instance v22, La/zvn0;

    .line 1643
    .line 1644
    move-object/from16 v23, v0

    .line 1645
    .line 1646
    check-cast v23, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1647
    .line 1648
    invoke-direct/range {v22 .. v44}, La/zvn0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Lorg/xplatform/uikit/components/timer/DsTimer;Lorg/xplatform/uikit_sport/score/SportScore;)V

    .line 1649
    .line 1650
    .line 1651
    move-object/from16 v20, v22

    .line 1652
    .line 1653
    goto :goto_7

    .line 1654
    :cond_28
    const v1, 0x7f0a0b77

    .line 1655
    .line 1656
    .line 1657
    goto :goto_6

    .line 1658
    :cond_29
    const v1, 0x7f0a0b75

    .line 1659
    .line 1660
    .line 1661
    goto :goto_6

    .line 1662
    :cond_2a
    const v1, 0x7f0a09f7

    .line 1663
    .line 1664
    .line 1665
    goto :goto_6

    .line 1666
    :cond_2b
    const v1, 0x7f0a09f3

    .line 1667
    .line 1668
    .line 1669
    goto :goto_6

    .line 1670
    :cond_2c
    const v1, 0x7f0a09f2

    .line 1671
    .line 1672
    .line 1673
    goto :goto_6

    .line 1674
    :cond_2d
    const v1, 0x7f0a09ef

    .line 1675
    .line 1676
    .line 1677
    goto :goto_6

    .line 1678
    :cond_2e
    const v1, 0x7f0a07d1

    .line 1679
    .line 1680
    .line 1681
    goto :goto_6

    .line 1682
    :cond_2f
    const v1, 0x7f0a07ce

    .line 1683
    .line 1684
    .line 1685
    goto :goto_6

    .line 1686
    :cond_30
    move v1, v9

    .line 1687
    goto :goto_6

    .line 1688
    :cond_31
    move v1, v10

    .line 1689
    goto :goto_6

    .line 1690
    :cond_32
    move v1, v11

    .line 1691
    goto :goto_6

    .line 1692
    :cond_33
    move v1, v12

    .line 1693
    goto :goto_6

    .line 1694
    :cond_34
    move v1, v13

    .line 1695
    goto :goto_6

    .line 1696
    :cond_35
    move v1, v14

    .line 1697
    goto :goto_6

    .line 1698
    :cond_36
    move v1, v15

    .line 1699
    goto :goto_6

    .line 1700
    :cond_37
    move v1, v2

    .line 1701
    goto :goto_6

    .line 1702
    :cond_38
    move v1, v3

    .line 1703
    goto :goto_6

    .line 1704
    :cond_39
    move v1, v4

    .line 1705
    :cond_3a
    :goto_6
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v0

    .line 1709
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v0

    .line 1713
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v0

    .line 1717
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1718
    .line 1719
    .line 1720
    :goto_7
    return-object v20

    .line 1721
    :pswitch_b
    move-object/from16 v0, p1

    .line 1722
    .line 1723
    check-cast v0, Ljava/lang/Integer;

    .line 1724
    .line 1725
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1726
    .line 1727
    .line 1728
    move-result v0

    .line 1729
    move-object/from16 v1, p2

    .line 1730
    .line 1731
    check-cast v1, La/p6t0;

    .line 1732
    .line 1733
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1734
    .line 1735
    .line 1736
    instance-of v2, v1, La/t3q;

    .line 1737
    .line 1738
    const-string v3, " "

    .line 1739
    .line 1740
    if-eqz v2, :cond_3b

    .line 1741
    .line 1742
    check-cast v1, La/t3q;

    .line 1743
    .line 1744
    iget-wide v4, v1, La/t3q;->a:J

    .line 1745
    .line 1746
    iget-object v0, v1, La/t3q;->b:Ljava/lang/String;

    .line 1747
    .line 1748
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1749
    .line 1750
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1757
    .line 1758
    .line 1759
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1760
    .line 1761
    .line 1762
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v0

    .line 1766
    goto :goto_8

    .line 1767
    :cond_3b
    instance-of v2, v1, La/i3q;

    .line 1768
    .line 1769
    if-eqz v2, :cond_3c

    .line 1770
    .line 1771
    check-cast v1, La/i3q;

    .line 1772
    .line 1773
    iget-object v0, v1, La/i3q;->a:Ljava/lang/String;

    .line 1774
    .line 1775
    goto :goto_8

    .line 1776
    :cond_3c
    instance-of v2, v1, La/b3q;

    .line 1777
    .line 1778
    if-eqz v2, :cond_3d

    .line 1779
    .line 1780
    check-cast v1, La/b3q;

    .line 1781
    .line 1782
    iget v0, v1, La/b3q;->a:I

    .line 1783
    .line 1784
    iget-object v1, v1, La/b3q;->b:Ljava/lang/String;

    .line 1785
    .line 1786
    invoke-static {v0, v3, v1}, La/dw9;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v0

    .line 1790
    goto :goto_8

    .line 1791
    :cond_3d
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v0

    .line 1795
    :goto_8
    return-object v0

    .line 1796
    :pswitch_c
    move-object/from16 v0, p1

    .line 1797
    .line 1798
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1799
    .line 1800
    move-object/from16 v7, p2

    .line 1801
    .line 1802
    check-cast v7, Landroid/view/ViewGroup;

    .line 1803
    .line 1804
    const v8, 0x7f0d05a3

    .line 1805
    .line 1806
    .line 1807
    invoke-static {v0, v7, v8, v7, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v6

    .line 1815
    move-object/from16 v24, v6

    .line 1816
    .line 1817
    check-cast v24, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1818
    .line 1819
    if-eqz v24, :cond_4f

    .line 1820
    .line 1821
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v25

    .line 1825
    if-eqz v25, :cond_4e

    .line 1826
    .line 1827
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v26

    .line 1831
    if-eqz v26, :cond_4d

    .line 1832
    .line 1833
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v2

    .line 1837
    move-object/from16 v27, v2

    .line 1838
    .line 1839
    check-cast v27, Landroid/widget/TextView;

    .line 1840
    .line 1841
    if-eqz v27, :cond_50

    .line 1842
    .line 1843
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v1

    .line 1847
    check-cast v1, Landroid/widget/LinearLayout;

    .line 1848
    .line 1849
    if-eqz v1, :cond_4c

    .line 1850
    .line 1851
    invoke-static {v0, v14}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v1

    .line 1855
    check-cast v1, Landroid/widget/ImageView;

    .line 1856
    .line 1857
    if-eqz v1, :cond_4b

    .line 1858
    .line 1859
    invoke-static {v0, v13}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v1

    .line 1863
    check-cast v1, Landroid/widget/TextView;

    .line 1864
    .line 1865
    if-eqz v1, :cond_4a

    .line 1866
    .line 1867
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v1

    .line 1871
    move-object/from16 v28, v1

    .line 1872
    .line 1873
    check-cast v28, Landroid/widget/TextView;

    .line 1874
    .line 1875
    if-eqz v28, :cond_49

    .line 1876
    .line 1877
    const v1, 0x7f0a05ac

    .line 1878
    .line 1879
    .line 1880
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v2

    .line 1884
    move-object/from16 v29, v2

    .line 1885
    .line 1886
    check-cast v29, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 1887
    .line 1888
    if-eqz v29, :cond_50

    .line 1889
    .line 1890
    const v1, 0x7f0a05af

    .line 1891
    .line 1892
    .line 1893
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v2

    .line 1897
    move-object/from16 v30, v2

    .line 1898
    .line 1899
    check-cast v30, Landroid/widget/TextView;

    .line 1900
    .line 1901
    if-eqz v30, :cond_50

    .line 1902
    .line 1903
    invoke-static {v0, v11}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v1

    .line 1907
    check-cast v1, Landroid/widget/LinearLayout;

    .line 1908
    .line 1909
    if-eqz v1, :cond_48

    .line 1910
    .line 1911
    invoke-static {v0, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v1

    .line 1915
    check-cast v1, Landroid/widget/ImageView;

    .line 1916
    .line 1917
    if-eqz v1, :cond_47

    .line 1918
    .line 1919
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1920
    .line 1921
    .line 1922
    move-result-object v1

    .line 1923
    check-cast v1, Landroid/widget/TextView;

    .line 1924
    .line 1925
    if-eqz v1, :cond_46

    .line 1926
    .line 1927
    const v1, 0x7f0a07ce

    .line 1928
    .line 1929
    .line 1930
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v2

    .line 1934
    move-object/from16 v31, v2

    .line 1935
    .line 1936
    check-cast v31, Landroid/widget/TextView;

    .line 1937
    .line 1938
    if-eqz v31, :cond_45

    .line 1939
    .line 1940
    const v1, 0x7f0a07d1

    .line 1941
    .line 1942
    .line 1943
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v2

    .line 1947
    move-object/from16 v32, v2

    .line 1948
    .line 1949
    check-cast v32, Landroid/widget/TextView;

    .line 1950
    .line 1951
    if-eqz v32, :cond_44

    .line 1952
    .line 1953
    const v1, 0x7f0a09ef

    .line 1954
    .line 1955
    .line 1956
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v2

    .line 1960
    check-cast v2, Landroid/widget/LinearLayout;

    .line 1961
    .line 1962
    if-eqz v2, :cond_43

    .line 1963
    .line 1964
    const v1, 0x7f0a09f2

    .line 1965
    .line 1966
    .line 1967
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v2

    .line 1971
    check-cast v2, Landroid/widget/ImageView;

    .line 1972
    .line 1973
    if-eqz v2, :cond_42

    .line 1974
    .line 1975
    const v1, 0x7f0a09f3

    .line 1976
    .line 1977
    .line 1978
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v2

    .line 1982
    move-object/from16 v33, v2

    .line 1983
    .line 1984
    check-cast v33, Landroid/widget/TextView;

    .line 1985
    .line 1986
    if-eqz v33, :cond_41

    .line 1987
    .line 1988
    const v1, 0x7f0a09f7

    .line 1989
    .line 1990
    .line 1991
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v2

    .line 1995
    move-object/from16 v34, v2

    .line 1996
    .line 1997
    check-cast v34, Landroid/widget/TextView;

    .line 1998
    .line 1999
    if-eqz v34, :cond_40

    .line 2000
    .line 2001
    const v1, 0x7f0a0b75

    .line 2002
    .line 2003
    .line 2004
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v2

    .line 2008
    check-cast v2, Landroid/widget/TextView;

    .line 2009
    .line 2010
    if-eqz v2, :cond_3f

    .line 2011
    .line 2012
    const v1, 0x7f0a0b77

    .line 2013
    .line 2014
    .line 2015
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v2

    .line 2019
    check-cast v2, Landroid/widget/LinearLayout;

    .line 2020
    .line 2021
    if-eqz v2, :cond_3e

    .line 2022
    .line 2023
    const v1, 0x7f0a0b78

    .line 2024
    .line 2025
    .line 2026
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v2

    .line 2030
    check-cast v2, Landroid/widget/ImageView;

    .line 2031
    .line 2032
    if-eqz v2, :cond_50

    .line 2033
    .line 2034
    const v1, 0x7f0a0b7b

    .line 2035
    .line 2036
    .line 2037
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v2

    .line 2041
    move-object/from16 v35, v2

    .line 2042
    .line 2043
    check-cast v35, Landroid/widget/TextView;

    .line 2044
    .line 2045
    if-eqz v35, :cond_50

    .line 2046
    .line 2047
    const v1, 0x7f0a0d42

    .line 2048
    .line 2049
    .line 2050
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2051
    .line 2052
    .line 2053
    move-result-object v2

    .line 2054
    move-object/from16 v36, v2

    .line 2055
    .line 2056
    check-cast v36, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 2057
    .line 2058
    if-eqz v36, :cond_50

    .line 2059
    .line 2060
    const v1, 0x7f0a0d45

    .line 2061
    .line 2062
    .line 2063
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2064
    .line 2065
    .line 2066
    move-result-object v2

    .line 2067
    move-object/from16 v37, v2

    .line 2068
    .line 2069
    check-cast v37, Landroid/widget/TextView;

    .line 2070
    .line 2071
    if-eqz v37, :cond_50

    .line 2072
    .line 2073
    const v1, 0x7f0a0e57

    .line 2074
    .line 2075
    .line 2076
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v2

    .line 2080
    move-object/from16 v38, v2

    .line 2081
    .line 2082
    check-cast v38, Landroid/widget/ImageView;

    .line 2083
    .line 2084
    if-eqz v38, :cond_50

    .line 2085
    .line 2086
    const v1, 0x7f0a0e59

    .line 2087
    .line 2088
    .line 2089
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v39

    .line 2093
    if-eqz v39, :cond_50

    .line 2094
    .line 2095
    const v1, 0x7f0a0e5a

    .line 2096
    .line 2097
    .line 2098
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v2

    .line 2102
    move-object/from16 v40, v2

    .line 2103
    .line 2104
    check-cast v40, Landroid/widget/TextView;

    .line 2105
    .line 2106
    if-eqz v40, :cond_50

    .line 2107
    .line 2108
    const v1, 0x7f0a0fc6

    .line 2109
    .line 2110
    .line 2111
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v2

    .line 2115
    move-object/from16 v41, v2

    .line 2116
    .line 2117
    check-cast v41, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 2118
    .line 2119
    if-eqz v41, :cond_50

    .line 2120
    .line 2121
    const v1, 0x7f0a0fc9

    .line 2122
    .line 2123
    .line 2124
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2125
    .line 2126
    .line 2127
    move-result-object v2

    .line 2128
    check-cast v2, Landroid/widget/TextView;

    .line 2129
    .line 2130
    if-eqz v2, :cond_50

    .line 2131
    .line 2132
    const v1, 0x7f0a1432

    .line 2133
    .line 2134
    .line 2135
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v2

    .line 2139
    move-object/from16 v42, v2

    .line 2140
    .line 2141
    check-cast v42, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 2142
    .line 2143
    if-eqz v42, :cond_50

    .line 2144
    .line 2145
    new-instance v22, La/ktn0;

    .line 2146
    .line 2147
    move-object/from16 v23, v0

    .line 2148
    .line 2149
    check-cast v23, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2150
    .line 2151
    invoke-direct/range {v22 .. v42}, La/ktn0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Lorg/xplatform/uikit/components/timer/DsTimer;Lorg/xplatform/uikit_sport/score/SportScore;)V

    .line 2152
    .line 2153
    .line 2154
    move-object/from16 v20, v22

    .line 2155
    .line 2156
    goto :goto_a

    .line 2157
    :cond_3e
    const v1, 0x7f0a0b77

    .line 2158
    .line 2159
    .line 2160
    goto :goto_9

    .line 2161
    :cond_3f
    const v1, 0x7f0a0b75

    .line 2162
    .line 2163
    .line 2164
    goto :goto_9

    .line 2165
    :cond_40
    const v1, 0x7f0a09f7

    .line 2166
    .line 2167
    .line 2168
    goto :goto_9

    .line 2169
    :cond_41
    const v1, 0x7f0a09f3

    .line 2170
    .line 2171
    .line 2172
    goto :goto_9

    .line 2173
    :cond_42
    const v1, 0x7f0a09f2

    .line 2174
    .line 2175
    .line 2176
    goto :goto_9

    .line 2177
    :cond_43
    const v1, 0x7f0a09ef

    .line 2178
    .line 2179
    .line 2180
    goto :goto_9

    .line 2181
    :cond_44
    const v1, 0x7f0a07d1

    .line 2182
    .line 2183
    .line 2184
    goto :goto_9

    .line 2185
    :cond_45
    const v1, 0x7f0a07ce

    .line 2186
    .line 2187
    .line 2188
    goto :goto_9

    .line 2189
    :cond_46
    move v1, v9

    .line 2190
    goto :goto_9

    .line 2191
    :cond_47
    move v1, v10

    .line 2192
    goto :goto_9

    .line 2193
    :cond_48
    move v1, v11

    .line 2194
    goto :goto_9

    .line 2195
    :cond_49
    move v1, v12

    .line 2196
    goto :goto_9

    .line 2197
    :cond_4a
    move v1, v13

    .line 2198
    goto :goto_9

    .line 2199
    :cond_4b
    move v1, v14

    .line 2200
    goto :goto_9

    .line 2201
    :cond_4c
    move v1, v15

    .line 2202
    goto :goto_9

    .line 2203
    :cond_4d
    move v1, v2

    .line 2204
    goto :goto_9

    .line 2205
    :cond_4e
    move v1, v3

    .line 2206
    goto :goto_9

    .line 2207
    :cond_4f
    move v1, v4

    .line 2208
    :cond_50
    :goto_9
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v0

    .line 2212
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v0

    .line 2216
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v0

    .line 2220
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 2221
    .line 2222
    .line 2223
    :goto_a
    return-object v20

    .line 2224
    :pswitch_d
    move-object/from16 v0, p1

    .line 2225
    .line 2226
    check-cast v0, Landroid/view/LayoutInflater;

    .line 2227
    .line 2228
    move-object/from16 v7, p2

    .line 2229
    .line 2230
    check-cast v7, Landroid/view/ViewGroup;

    .line 2231
    .line 2232
    const v8, 0x7f0d05a2

    .line 2233
    .line 2234
    .line 2235
    invoke-static {v0, v7, v8, v7, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v0

    .line 2239
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v6

    .line 2243
    move-object/from16 v24, v6

    .line 2244
    .line 2245
    check-cast v24, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 2246
    .line 2247
    if-eqz v24, :cond_62

    .line 2248
    .line 2249
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v25

    .line 2253
    if-eqz v25, :cond_61

    .line 2254
    .line 2255
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v26

    .line 2259
    if-eqz v26, :cond_60

    .line 2260
    .line 2261
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v2

    .line 2265
    move-object/from16 v27, v2

    .line 2266
    .line 2267
    check-cast v27, Landroid/widget/TextView;

    .line 2268
    .line 2269
    if-eqz v27, :cond_63

    .line 2270
    .line 2271
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v1

    .line 2275
    check-cast v1, Landroid/widget/LinearLayout;

    .line 2276
    .line 2277
    if-eqz v1, :cond_5f

    .line 2278
    .line 2279
    invoke-static {v0, v14}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v1

    .line 2283
    check-cast v1, Landroid/widget/ImageView;

    .line 2284
    .line 2285
    if-eqz v1, :cond_5e

    .line 2286
    .line 2287
    invoke-static {v0, v13}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v1

    .line 2291
    check-cast v1, Landroid/widget/TextView;

    .line 2292
    .line 2293
    if-eqz v1, :cond_5d

    .line 2294
    .line 2295
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v1

    .line 2299
    move-object/from16 v28, v1

    .line 2300
    .line 2301
    check-cast v28, Landroid/widget/TextView;

    .line 2302
    .line 2303
    if-eqz v28, :cond_5c

    .line 2304
    .line 2305
    invoke-static {v0, v11}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v1

    .line 2309
    check-cast v1, Landroid/widget/LinearLayout;

    .line 2310
    .line 2311
    if-eqz v1, :cond_5b

    .line 2312
    .line 2313
    invoke-static {v0, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2314
    .line 2315
    .line 2316
    move-result-object v1

    .line 2317
    check-cast v1, Landroid/widget/ImageView;

    .line 2318
    .line 2319
    if-eqz v1, :cond_5a

    .line 2320
    .line 2321
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2322
    .line 2323
    .line 2324
    move-result-object v1

    .line 2325
    check-cast v1, Landroid/widget/TextView;

    .line 2326
    .line 2327
    if-eqz v1, :cond_59

    .line 2328
    .line 2329
    const v1, 0x7f0a07ce

    .line 2330
    .line 2331
    .line 2332
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2333
    .line 2334
    .line 2335
    move-result-object v2

    .line 2336
    check-cast v2, Landroid/widget/TextView;

    .line 2337
    .line 2338
    if-eqz v2, :cond_58

    .line 2339
    .line 2340
    const v1, 0x7f0a07d1

    .line 2341
    .line 2342
    .line 2343
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v2

    .line 2347
    move-object/from16 v29, v2

    .line 2348
    .line 2349
    check-cast v29, Landroid/widget/TextView;

    .line 2350
    .line 2351
    if-eqz v29, :cond_57

    .line 2352
    .line 2353
    const v1, 0x7f0a09ef

    .line 2354
    .line 2355
    .line 2356
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2357
    .line 2358
    .line 2359
    move-result-object v2

    .line 2360
    check-cast v2, Landroid/widget/LinearLayout;

    .line 2361
    .line 2362
    if-eqz v2, :cond_56

    .line 2363
    .line 2364
    const v1, 0x7f0a09f2

    .line 2365
    .line 2366
    .line 2367
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2368
    .line 2369
    .line 2370
    move-result-object v2

    .line 2371
    check-cast v2, Landroid/widget/ImageView;

    .line 2372
    .line 2373
    if-eqz v2, :cond_55

    .line 2374
    .line 2375
    const v1, 0x7f0a09f3

    .line 2376
    .line 2377
    .line 2378
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v2

    .line 2382
    move-object/from16 v30, v2

    .line 2383
    .line 2384
    check-cast v30, Landroid/widget/TextView;

    .line 2385
    .line 2386
    if-eqz v30, :cond_54

    .line 2387
    .line 2388
    const v1, 0x7f0a09f7

    .line 2389
    .line 2390
    .line 2391
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2392
    .line 2393
    .line 2394
    move-result-object v2

    .line 2395
    move-object/from16 v31, v2

    .line 2396
    .line 2397
    check-cast v31, Landroid/widget/TextView;

    .line 2398
    .line 2399
    if-eqz v31, :cond_53

    .line 2400
    .line 2401
    const v1, 0x7f0a0b75

    .line 2402
    .line 2403
    .line 2404
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v2

    .line 2408
    check-cast v2, Landroid/widget/TextView;

    .line 2409
    .line 2410
    if-eqz v2, :cond_52

    .line 2411
    .line 2412
    const v1, 0x7f0a0b77

    .line 2413
    .line 2414
    .line 2415
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2416
    .line 2417
    .line 2418
    move-result-object v2

    .line 2419
    check-cast v2, Landroid/widget/LinearLayout;

    .line 2420
    .line 2421
    if-eqz v2, :cond_51

    .line 2422
    .line 2423
    const v1, 0x7f0a0b78

    .line 2424
    .line 2425
    .line 2426
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v2

    .line 2430
    check-cast v2, Landroid/widget/ImageView;

    .line 2431
    .line 2432
    if-eqz v2, :cond_63

    .line 2433
    .line 2434
    const v1, 0x7f0a0b7b

    .line 2435
    .line 2436
    .line 2437
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2438
    .line 2439
    .line 2440
    move-result-object v2

    .line 2441
    move-object/from16 v32, v2

    .line 2442
    .line 2443
    check-cast v32, Landroid/widget/TextView;

    .line 2444
    .line 2445
    if-eqz v32, :cond_63

    .line 2446
    .line 2447
    const v1, 0x7f0a0e57

    .line 2448
    .line 2449
    .line 2450
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v2

    .line 2454
    move-object/from16 v33, v2

    .line 2455
    .line 2456
    check-cast v33, Landroid/widget/ImageView;

    .line 2457
    .line 2458
    if-eqz v33, :cond_63

    .line 2459
    .line 2460
    const v1, 0x7f0a0e59

    .line 2461
    .line 2462
    .line 2463
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2464
    .line 2465
    .line 2466
    move-result-object v34

    .line 2467
    if-eqz v34, :cond_63

    .line 2468
    .line 2469
    const v1, 0x7f0a0e5a

    .line 2470
    .line 2471
    .line 2472
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2473
    .line 2474
    .line 2475
    move-result-object v2

    .line 2476
    move-object/from16 v35, v2

    .line 2477
    .line 2478
    check-cast v35, Landroid/widget/TextView;

    .line 2479
    .line 2480
    if-eqz v35, :cond_63

    .line 2481
    .line 2482
    const v1, 0x7f0a0fc6

    .line 2483
    .line 2484
    .line 2485
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v2

    .line 2489
    move-object/from16 v36, v2

    .line 2490
    .line 2491
    check-cast v36, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 2492
    .line 2493
    if-eqz v36, :cond_63

    .line 2494
    .line 2495
    const v1, 0x7f0a0fc9

    .line 2496
    .line 2497
    .line 2498
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2499
    .line 2500
    .line 2501
    move-result-object v2

    .line 2502
    check-cast v2, Landroid/widget/TextView;

    .line 2503
    .line 2504
    if-eqz v2, :cond_63

    .line 2505
    .line 2506
    const v1, 0x7f0a1432

    .line 2507
    .line 2508
    .line 2509
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2510
    .line 2511
    .line 2512
    move-result-object v2

    .line 2513
    move-object/from16 v37, v2

    .line 2514
    .line 2515
    check-cast v37, Landroid/widget/TextView;

    .line 2516
    .line 2517
    if-eqz v37, :cond_63

    .line 2518
    .line 2519
    new-instance v22, La/jtn0;

    .line 2520
    .line 2521
    move-object/from16 v23, v0

    .line 2522
    .line 2523
    check-cast v23, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2524
    .line 2525
    invoke-direct/range {v22 .. v37}, La/jtn0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Lorg/xplatform/uikit/components/timer/DsTimer;Landroid/widget/TextView;)V

    .line 2526
    .line 2527
    .line 2528
    move-object/from16 v20, v22

    .line 2529
    .line 2530
    goto :goto_c

    .line 2531
    :cond_51
    const v1, 0x7f0a0b77

    .line 2532
    .line 2533
    .line 2534
    goto :goto_b

    .line 2535
    :cond_52
    const v1, 0x7f0a0b75

    .line 2536
    .line 2537
    .line 2538
    goto :goto_b

    .line 2539
    :cond_53
    const v1, 0x7f0a09f7

    .line 2540
    .line 2541
    .line 2542
    goto :goto_b

    .line 2543
    :cond_54
    const v1, 0x7f0a09f3

    .line 2544
    .line 2545
    .line 2546
    goto :goto_b

    .line 2547
    :cond_55
    const v1, 0x7f0a09f2

    .line 2548
    .line 2549
    .line 2550
    goto :goto_b

    .line 2551
    :cond_56
    const v1, 0x7f0a09ef

    .line 2552
    .line 2553
    .line 2554
    goto :goto_b

    .line 2555
    :cond_57
    const v1, 0x7f0a07d1

    .line 2556
    .line 2557
    .line 2558
    goto :goto_b

    .line 2559
    :cond_58
    const v1, 0x7f0a07ce

    .line 2560
    .line 2561
    .line 2562
    goto :goto_b

    .line 2563
    :cond_59
    move v1, v9

    .line 2564
    goto :goto_b

    .line 2565
    :cond_5a
    move v1, v10

    .line 2566
    goto :goto_b

    .line 2567
    :cond_5b
    move v1, v11

    .line 2568
    goto :goto_b

    .line 2569
    :cond_5c
    move v1, v12

    .line 2570
    goto :goto_b

    .line 2571
    :cond_5d
    move v1, v13

    .line 2572
    goto :goto_b

    .line 2573
    :cond_5e
    move v1, v14

    .line 2574
    goto :goto_b

    .line 2575
    :cond_5f
    move v1, v15

    .line 2576
    goto :goto_b

    .line 2577
    :cond_60
    move v1, v2

    .line 2578
    goto :goto_b

    .line 2579
    :cond_61
    move v1, v3

    .line 2580
    goto :goto_b

    .line 2581
    :cond_62
    move v1, v4

    .line 2582
    :cond_63
    :goto_b
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2583
    .line 2584
    .line 2585
    move-result-object v0

    .line 2586
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 2587
    .line 2588
    .line 2589
    move-result-object v0

    .line 2590
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2591
    .line 2592
    .line 2593
    move-result-object v0

    .line 2594
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 2595
    .line 2596
    .line 2597
    :goto_c
    return-object v20

    .line 2598
    :pswitch_e
    move-object/from16 v0, p1

    .line 2599
    .line 2600
    check-cast v0, Landroid/view/LayoutInflater;

    .line 2601
    .line 2602
    move-object/from16 v7, p2

    .line 2603
    .line 2604
    check-cast v7, Landroid/view/ViewGroup;

    .line 2605
    .line 2606
    const v8, 0x7f0d05a1

    .line 2607
    .line 2608
    .line 2609
    invoke-static {v0, v7, v8, v7, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 2610
    .line 2611
    .line 2612
    move-result-object v0

    .line 2613
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2614
    .line 2615
    .line 2616
    move-result-object v6

    .line 2617
    move-object/from16 v24, v6

    .line 2618
    .line 2619
    check-cast v24, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 2620
    .line 2621
    if-eqz v24, :cond_6d

    .line 2622
    .line 2623
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2624
    .line 2625
    .line 2626
    move-result-object v25

    .line 2627
    if-eqz v25, :cond_6c

    .line 2628
    .line 2629
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2630
    .line 2631
    .line 2632
    move-result-object v26

    .line 2633
    if-eqz v26, :cond_64

    .line 2634
    .line 2635
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v2

    .line 2639
    move-object/from16 v27, v2

    .line 2640
    .line 2641
    check-cast v27, Landroid/widget/TextView;

    .line 2642
    .line 2643
    if-eqz v27, :cond_6e

    .line 2644
    .line 2645
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2646
    .line 2647
    .line 2648
    move-result-object v1

    .line 2649
    check-cast v1, Landroid/widget/LinearLayout;

    .line 2650
    .line 2651
    if-eqz v1, :cond_6b

    .line 2652
    .line 2653
    invoke-static {v0, v14}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2654
    .line 2655
    .line 2656
    move-result-object v1

    .line 2657
    check-cast v1, Landroid/widget/ImageView;

    .line 2658
    .line 2659
    if-eqz v1, :cond_6a

    .line 2660
    .line 2661
    invoke-static {v0, v13}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2662
    .line 2663
    .line 2664
    move-result-object v1

    .line 2665
    check-cast v1, Landroid/widget/TextView;

    .line 2666
    .line 2667
    if-eqz v1, :cond_69

    .line 2668
    .line 2669
    invoke-static {v0, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2670
    .line 2671
    .line 2672
    move-result-object v1

    .line 2673
    move-object/from16 v28, v1

    .line 2674
    .line 2675
    check-cast v28, Landroid/widget/TextView;

    .line 2676
    .line 2677
    if-eqz v28, :cond_68

    .line 2678
    .line 2679
    const v1, 0x7f0a05ab

    .line 2680
    .line 2681
    .line 2682
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2683
    .line 2684
    .line 2685
    move-result-object v2

    .line 2686
    move-object/from16 v29, v2

    .line 2687
    .line 2688
    check-cast v29, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 2689
    .line 2690
    if-eqz v29, :cond_6e

    .line 2691
    .line 2692
    const v1, 0x7f0a05af

    .line 2693
    .line 2694
    .line 2695
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2696
    .line 2697
    .line 2698
    move-result-object v2

    .line 2699
    move-object/from16 v30, v2

    .line 2700
    .line 2701
    check-cast v30, Landroid/widget/TextView;

    .line 2702
    .line 2703
    if-eqz v30, :cond_6e

    .line 2704
    .line 2705
    const v1, 0x7f0a05b0

    .line 2706
    .line 2707
    .line 2708
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2709
    .line 2710
    .line 2711
    move-result-object v2

    .line 2712
    move-object/from16 v31, v2

    .line 2713
    .line 2714
    check-cast v31, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 2715
    .line 2716
    if-eqz v31, :cond_6e

    .line 2717
    .line 2718
    invoke-static {v0, v11}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2719
    .line 2720
    .line 2721
    move-result-object v1

    .line 2722
    check-cast v1, Landroid/widget/LinearLayout;

    .line 2723
    .line 2724
    if-eqz v1, :cond_67

    .line 2725
    .line 2726
    invoke-static {v0, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2727
    .line 2728
    .line 2729
    move-result-object v1

    .line 2730
    check-cast v1, Landroid/widget/ImageView;

    .line 2731
    .line 2732
    if-eqz v1, :cond_66

    .line 2733
    .line 2734
    invoke-static {v0, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2735
    .line 2736
    .line 2737
    move-result-object v1

    .line 2738
    check-cast v1, Landroid/widget/TextView;

    .line 2739
    .line 2740
    if-eqz v1, :cond_65

    .line 2741
    .line 2742
    const v1, 0x7f0a07ce

    .line 2743
    .line 2744
    .line 2745
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2746
    .line 2747
    .line 2748
    move-result-object v2

    .line 2749
    move-object/from16 v32, v2

    .line 2750
    .line 2751
    check-cast v32, Landroid/widget/TextView;

    .line 2752
    .line 2753
    if-eqz v32, :cond_6e

    .line 2754
    .line 2755
    const v2, 0x7f0a07d1

    .line 2756
    .line 2757
    .line 2758
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2759
    .line 2760
    .line 2761
    move-result-object v1

    .line 2762
    move-object/from16 v33, v1

    .line 2763
    .line 2764
    check-cast v33, Landroid/widget/TextView;

    .line 2765
    .line 2766
    if-eqz v33, :cond_64

    .line 2767
    .line 2768
    const v1, 0x7f0a09ef

    .line 2769
    .line 2770
    .line 2771
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2772
    .line 2773
    .line 2774
    move-result-object v2

    .line 2775
    check-cast v2, Landroid/widget/LinearLayout;

    .line 2776
    .line 2777
    if-eqz v2, :cond_6e

    .line 2778
    .line 2779
    const v2, 0x7f0a09f2

    .line 2780
    .line 2781
    .line 2782
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2783
    .line 2784
    .line 2785
    move-result-object v1

    .line 2786
    check-cast v1, Landroid/widget/ImageView;

    .line 2787
    .line 2788
    if-eqz v1, :cond_64

    .line 2789
    .line 2790
    const v1, 0x7f0a09f3

    .line 2791
    .line 2792
    .line 2793
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2794
    .line 2795
    .line 2796
    move-result-object v2

    .line 2797
    move-object/from16 v34, v2

    .line 2798
    .line 2799
    check-cast v34, Landroid/widget/TextView;

    .line 2800
    .line 2801
    if-eqz v34, :cond_6e

    .line 2802
    .line 2803
    const v2, 0x7f0a09f7

    .line 2804
    .line 2805
    .line 2806
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v1

    .line 2810
    move-object/from16 v35, v1

    .line 2811
    .line 2812
    check-cast v35, Landroid/widget/TextView;

    .line 2813
    .line 2814
    if-eqz v35, :cond_64

    .line 2815
    .line 2816
    const v1, 0x7f0a0b75

    .line 2817
    .line 2818
    .line 2819
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2820
    .line 2821
    .line 2822
    move-result-object v2

    .line 2823
    check-cast v2, Landroid/widget/TextView;

    .line 2824
    .line 2825
    if-eqz v2, :cond_6e

    .line 2826
    .line 2827
    const v2, 0x7f0a0b77

    .line 2828
    .line 2829
    .line 2830
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2831
    .line 2832
    .line 2833
    move-result-object v1

    .line 2834
    check-cast v1, Landroid/widget/LinearLayout;

    .line 2835
    .line 2836
    if-eqz v1, :cond_64

    .line 2837
    .line 2838
    const v1, 0x7f0a0b78

    .line 2839
    .line 2840
    .line 2841
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2842
    .line 2843
    .line 2844
    move-result-object v2

    .line 2845
    check-cast v2, Landroid/widget/ImageView;

    .line 2846
    .line 2847
    if-eqz v2, :cond_6e

    .line 2848
    .line 2849
    const v1, 0x7f0a0b7b

    .line 2850
    .line 2851
    .line 2852
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2853
    .line 2854
    .line 2855
    move-result-object v2

    .line 2856
    move-object/from16 v36, v2

    .line 2857
    .line 2858
    check-cast v36, Landroid/widget/TextView;

    .line 2859
    .line 2860
    if-eqz v36, :cond_6e

    .line 2861
    .line 2862
    const v1, 0x7f0a0d41

    .line 2863
    .line 2864
    .line 2865
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2866
    .line 2867
    .line 2868
    move-result-object v2

    .line 2869
    move-object/from16 v37, v2

    .line 2870
    .line 2871
    check-cast v37, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 2872
    .line 2873
    if-eqz v37, :cond_6e

    .line 2874
    .line 2875
    const v1, 0x7f0a0d45

    .line 2876
    .line 2877
    .line 2878
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2879
    .line 2880
    .line 2881
    move-result-object v2

    .line 2882
    move-object/from16 v38, v2

    .line 2883
    .line 2884
    check-cast v38, Landroid/widget/TextView;

    .line 2885
    .line 2886
    if-eqz v38, :cond_6e

    .line 2887
    .line 2888
    const v1, 0x7f0a0d46

    .line 2889
    .line 2890
    .line 2891
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2892
    .line 2893
    .line 2894
    move-result-object v2

    .line 2895
    move-object/from16 v39, v2

    .line 2896
    .line 2897
    check-cast v39, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 2898
    .line 2899
    if-eqz v39, :cond_6e

    .line 2900
    .line 2901
    const v1, 0x7f0a0e57

    .line 2902
    .line 2903
    .line 2904
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v2

    .line 2908
    move-object/from16 v40, v2

    .line 2909
    .line 2910
    check-cast v40, Landroid/widget/ImageView;

    .line 2911
    .line 2912
    if-eqz v40, :cond_6e

    .line 2913
    .line 2914
    const v1, 0x7f0a0e59

    .line 2915
    .line 2916
    .line 2917
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v41

    .line 2921
    if-eqz v41, :cond_6e

    .line 2922
    .line 2923
    const v1, 0x7f0a0e5a

    .line 2924
    .line 2925
    .line 2926
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2927
    .line 2928
    .line 2929
    move-result-object v2

    .line 2930
    move-object/from16 v42, v2

    .line 2931
    .line 2932
    check-cast v42, Landroid/widget/TextView;

    .line 2933
    .line 2934
    if-eqz v42, :cond_6e

    .line 2935
    .line 2936
    const v1, 0x7f0a0fc6

    .line 2937
    .line 2938
    .line 2939
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2940
    .line 2941
    .line 2942
    move-result-object v2

    .line 2943
    move-object/from16 v43, v2

    .line 2944
    .line 2945
    check-cast v43, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 2946
    .line 2947
    if-eqz v43, :cond_6e

    .line 2948
    .line 2949
    const v1, 0x7f0a0fc9

    .line 2950
    .line 2951
    .line 2952
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2953
    .line 2954
    .line 2955
    move-result-object v2

    .line 2956
    check-cast v2, Landroid/widget/TextView;

    .line 2957
    .line 2958
    if-eqz v2, :cond_6e

    .line 2959
    .line 2960
    const v1, 0x7f0a1432

    .line 2961
    .line 2962
    .line 2963
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2964
    .line 2965
    .line 2966
    move-result-object v2

    .line 2967
    move-object/from16 v44, v2

    .line 2968
    .line 2969
    check-cast v44, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 2970
    .line 2971
    if-eqz v44, :cond_6e

    .line 2972
    .line 2973
    new-instance v22, La/tsn0;

    .line 2974
    .line 2975
    move-object/from16 v23, v0

    .line 2976
    .line 2977
    check-cast v23, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2978
    .line 2979
    invoke-direct/range {v22 .. v44}, La/tsn0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Lorg/xplatform/uikit/components/timer/DsTimer;Lorg/xplatform/uikit_sport/score/SportScore;)V

    .line 2980
    .line 2981
    .line 2982
    move-object/from16 v20, v22

    .line 2983
    .line 2984
    goto :goto_e

    .line 2985
    :cond_64
    move v1, v2

    .line 2986
    goto :goto_d

    .line 2987
    :cond_65
    move v1, v9

    .line 2988
    goto :goto_d

    .line 2989
    :cond_66
    move v1, v10

    .line 2990
    goto :goto_d

    .line 2991
    :cond_67
    move v1, v11

    .line 2992
    goto :goto_d

    .line 2993
    :cond_68
    move v1, v12

    .line 2994
    goto :goto_d

    .line 2995
    :cond_69
    move v1, v13

    .line 2996
    goto :goto_d

    .line 2997
    :cond_6a
    move v1, v14

    .line 2998
    goto :goto_d

    .line 2999
    :cond_6b
    move v1, v15

    .line 3000
    goto :goto_d

    .line 3001
    :cond_6c
    move v1, v3

    .line 3002
    goto :goto_d

    .line 3003
    :cond_6d
    move v1, v4

    .line 3004
    :cond_6e
    :goto_d
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3005
    .line 3006
    .line 3007
    move-result-object v0

    .line 3008
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 3009
    .line 3010
    .line 3011
    move-result-object v0

    .line 3012
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 3013
    .line 3014
    .line 3015
    move-result-object v0

    .line 3016
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 3017
    .line 3018
    .line 3019
    :goto_e
    return-object v20

    .line 3020
    :pswitch_f
    move-object/from16 v0, p1

    .line 3021
    .line 3022
    check-cast v0, Ljava/lang/Float;

    .line 3023
    .line 3024
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3025
    .line 3026
    .line 3027
    move-object/from16 v0, p2

    .line 3028
    .line 3029
    check-cast v0, Ljava/lang/Float;

    .line 3030
    .line 3031
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3032
    .line 3033
    .line 3034
    sget v0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->q:I

    .line 3035
    .line 3036
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3037
    .line 3038
    return-object v0

    .line 3039
    :pswitch_10
    move-object/from16 v0, p1

    .line 3040
    .line 3041
    check-cast v0, La/oyg0;

    .line 3042
    .line 3043
    move-object/from16 v1, p2

    .line 3044
    .line 3045
    check-cast v1, La/non0;

    .line 3046
    .line 3047
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3048
    .line 3049
    .line 3050
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3051
    .line 3052
    .line 3053
    iget-object v0, v1, La/non0;->b:La/yvl;

    .line 3054
    .line 3055
    iget-object v2, v0, La/yvl;->a:La/evq0;

    .line 3056
    .line 3057
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 3058
    .line 3059
    .line 3060
    move-result v2

    .line 3061
    if-eqz v2, :cond_71

    .line 3062
    .line 3063
    const/4 v3, 0x1

    .line 3064
    if-eq v2, v3, :cond_70

    .line 3065
    .line 3066
    const/4 v3, 0x2

    .line 3067
    if-ne v2, v3, :cond_6f

    .line 3068
    .line 3069
    sget-object v2, La/evq0;->a:La/evq0;

    .line 3070
    .line 3071
    goto :goto_f

    .line 3072
    :cond_6f
    invoke-static {}, La/t9f;->b()V

    .line 3073
    .line 3074
    .line 3075
    goto :goto_10

    .line 3076
    :cond_70
    sget-object v2, La/evq0;->a:La/evq0;

    .line 3077
    .line 3078
    goto :goto_f

    .line 3079
    :cond_71
    sget-object v2, La/evq0;->b:La/evq0;

    .line 3080
    .line 3081
    :goto_f
    iget-boolean v3, v0, La/yvl;->b:Z

    .line 3082
    .line 3083
    iget-boolean v0, v0, La/yvl;->c:Z

    .line 3084
    .line 3085
    new-instance v4, La/yvl;

    .line 3086
    .line 3087
    invoke-direct {v4, v2, v3, v0}, La/yvl;-><init>(La/evq0;ZZ)V

    .line 3088
    .line 3089
    .line 3090
    iget-object v0, v1, La/non0;->a:Ljava/lang/String;

    .line 3091
    .line 3092
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3093
    .line 3094
    .line 3095
    new-instance v1, La/non0;

    .line 3096
    .line 3097
    invoke-direct {v1, v0, v4}, La/non0;-><init>(Ljava/lang/String;La/yvl;)V

    .line 3098
    .line 3099
    .line 3100
    move-object/from16 v20, v1

    .line 3101
    .line 3102
    :goto_10
    return-object v20

    .line 3103
    :pswitch_11
    move-object/from16 v0, p1

    .line 3104
    .line 3105
    check-cast v0, Ljava/lang/Integer;

    .line 3106
    .line 3107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3108
    .line 3109
    .line 3110
    move-object/from16 v0, p2

    .line 3111
    .line 3112
    check-cast v0, La/wnn0;

    .line 3113
    .line 3114
    sget-object v1, La/snn0;->n2:La/j6m0;

    .line 3115
    .line 3116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3117
    .line 3118
    .line 3119
    iget-object v0, v0, La/wnn0;->a:La/rnn0;

    .line 3120
    .line 3121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3122
    .line 3123
    .line 3124
    move-result-object v0

    .line 3125
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 3126
    .line 3127
    .line 3128
    move-result-object v0

    .line 3129
    return-object v0

    .line 3130
    :pswitch_12
    move-object/from16 v0, p1

    .line 3131
    .line 3132
    check-cast v0, Landroid/view/LayoutInflater;

    .line 3133
    .line 3134
    move-object/from16 v1, p2

    .line 3135
    .line 3136
    check-cast v1, Landroid/view/ViewGroup;

    .line 3137
    .line 3138
    const v2, 0x7f0d0459

    .line 3139
    .line 3140
    .line 3141
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 3142
    .line 3143
    .line 3144
    move-result-object v0

    .line 3145
    move-object v1, v0

    .line 3146
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 3147
    .line 3148
    const v2, 0x7f0a03b3

    .line 3149
    .line 3150
    .line 3151
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3152
    .line 3153
    .line 3154
    move-result-object v3

    .line 3155
    check-cast v3, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 3156
    .line 3157
    if-eqz v3, :cond_72

    .line 3158
    .line 3159
    const v2, 0x7f0a0730

    .line 3160
    .line 3161
    .line 3162
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3163
    .line 3164
    .line 3165
    move-result-object v4

    .line 3166
    check-cast v4, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 3167
    .line 3168
    if-eqz v4, :cond_72

    .line 3169
    .line 3170
    const v2, 0x7f0a0fce

    .line 3171
    .line 3172
    .line 3173
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3174
    .line 3175
    .line 3176
    move-result-object v6

    .line 3177
    check-cast v6, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 3178
    .line 3179
    if-eqz v6, :cond_72

    .line 3180
    .line 3181
    new-instance v0, La/jyx;

    .line 3182
    .line 3183
    invoke-direct {v0, v1, v3, v4, v6}, La/jyx;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 3184
    .line 3185
    .line 3186
    move-object/from16 v20, v0

    .line 3187
    .line 3188
    goto :goto_11

    .line 3189
    :cond_72
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3190
    .line 3191
    .line 3192
    move-result-object v0

    .line 3193
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 3194
    .line 3195
    .line 3196
    move-result-object v0

    .line 3197
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 3198
    .line 3199
    .line 3200
    move-result-object v0

    .line 3201
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 3202
    .line 3203
    .line 3204
    :goto_11
    return-object v20

    .line 3205
    :pswitch_13
    move-object/from16 v0, p1

    .line 3206
    .line 3207
    check-cast v0, Landroid/view/LayoutInflater;

    .line 3208
    .line 3209
    move-object/from16 v1, p2

    .line 3210
    .line 3211
    check-cast v1, Landroid/view/ViewGroup;

    .line 3212
    .line 3213
    const v2, 0x7f0d03e6

    .line 3214
    .line 3215
    .line 3216
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 3217
    .line 3218
    .line 3219
    move-result-object v0

    .line 3220
    move-object v1, v0

    .line 3221
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 3222
    .line 3223
    const v2, 0x7f0a03b3

    .line 3224
    .line 3225
    .line 3226
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3227
    .line 3228
    .line 3229
    move-result-object v3

    .line 3230
    check-cast v3, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 3231
    .line 3232
    if-eqz v3, :cond_73

    .line 3233
    .line 3234
    const v2, 0x7f0a0730

    .line 3235
    .line 3236
    .line 3237
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3238
    .line 3239
    .line 3240
    move-result-object v4

    .line 3241
    check-cast v4, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 3242
    .line 3243
    if-eqz v4, :cond_73

    .line 3244
    .line 3245
    const v2, 0x7f0a0fce

    .line 3246
    .line 3247
    .line 3248
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3249
    .line 3250
    .line 3251
    move-result-object v6

    .line 3252
    check-cast v6, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 3253
    .line 3254
    if-eqz v6, :cond_73

    .line 3255
    .line 3256
    new-instance v0, La/kwx;

    .line 3257
    .line 3258
    invoke-direct {v0, v1, v3, v4, v6}, La/kwx;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 3259
    .line 3260
    .line 3261
    move-object/from16 v20, v0

    .line 3262
    .line 3263
    goto :goto_12

    .line 3264
    :cond_73
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3265
    .line 3266
    .line 3267
    move-result-object v0

    .line 3268
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 3269
    .line 3270
    .line 3271
    move-result-object v0

    .line 3272
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 3273
    .line 3274
    .line 3275
    move-result-object v0

    .line 3276
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 3277
    .line 3278
    .line 3279
    :goto_12
    return-object v20

    .line 3280
    :pswitch_14
    move-object/from16 v0, p1

    .line 3281
    .line 3282
    check-cast v0, Landroid/view/LayoutInflater;

    .line 3283
    .line 3284
    move-object/from16 v1, p2

    .line 3285
    .line 3286
    check-cast v1, Landroid/view/ViewGroup;

    .line 3287
    .line 3288
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3289
    .line 3290
    .line 3291
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3292
    .line 3293
    .line 3294
    invoke-static {v0, v1}, La/itx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/itx;

    .line 3295
    .line 3296
    .line 3297
    move-result-object v0

    .line 3298
    return-object v0

    .line 3299
    :pswitch_15
    move-object/from16 v0, p1

    .line 3300
    .line 3301
    check-cast v0, Landroid/view/LayoutInflater;

    .line 3302
    .line 3303
    move-object/from16 v1, p2

    .line 3304
    .line 3305
    check-cast v1, Landroid/view/ViewGroup;

    .line 3306
    .line 3307
    const v2, 0x7f0d045a

    .line 3308
    .line 3309
    .line 3310
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 3311
    .line 3312
    .line 3313
    move-result-object v0

    .line 3314
    if-eqz v0, :cond_74

    .line 3315
    .line 3316
    check-cast v0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 3317
    .line 3318
    new-instance v1, La/kyx;

    .line 3319
    .line 3320
    invoke-direct {v1, v0, v0}, La/kyx;-><init>(Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;)V

    .line 3321
    .line 3322
    .line 3323
    move-object/from16 v20, v1

    .line 3324
    .line 3325
    goto :goto_13

    .line 3326
    :cond_74
    const-string v0, "rootView"

    .line 3327
    .line 3328
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 3329
    .line 3330
    .line 3331
    :goto_13
    return-object v20

    .line 3332
    :pswitch_16
    move-object/from16 v0, p1

    .line 3333
    .line 3334
    check-cast v0, La/fet;

    .line 3335
    .line 3336
    move-object/from16 v1, p2

    .line 3337
    .line 3338
    check-cast v1, Ljava/lang/Integer;

    .line 3339
    .line 3340
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3341
    .line 3342
    .line 3343
    const/4 v1, 0x1

    .line 3344
    invoke-static {v1}, La/x8x;->L(I)I

    .line 3345
    .line 3346
    .line 3347
    move-result v1

    .line 3348
    invoke-static {v1, v0}, La/cem0;->f(ILa/fet;)V

    .line 3349
    .line 3350
    .line 3351
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3352
    .line 3353
    return-object v0

    .line 3354
    :pswitch_17
    move-object/from16 v0, p1

    .line 3355
    .line 3356
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 3357
    .line 3358
    move-object/from16 v1, p2

    .line 3359
    .line 3360
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 3361
    .line 3362
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3363
    .line 3364
    .line 3365
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3366
    .line 3367
    .line 3368
    new-instance v2, La/f8l0;

    .line 3369
    .line 3370
    const/16 v3, 0x1d

    .line 3371
    .line 3372
    invoke-direct {v2, v3}, La/f8l0;-><init>(B)V

    .line 3373
    .line 3374
    .line 3375
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3376
    .line 3377
    .line 3378
    new-instance v0, La/a7n0;

    .line 3379
    .line 3380
    const/16 v2, 0xd

    .line 3381
    .line 3382
    invoke-direct {v0, v2}, La/a7n0;-><init>(B)V

    .line 3383
    .line 3384
    .line 3385
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3386
    .line 3387
    .line 3388
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3389
    .line 3390
    return-object v0

    .line 3391
    :pswitch_18
    move-object/from16 v0, p1

    .line 3392
    .line 3393
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 3394
    .line 3395
    move-object/from16 v1, p2

    .line 3396
    .line 3397
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 3398
    .line 3399
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3400
    .line 3401
    .line 3402
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3403
    .line 3404
    .line 3405
    new-instance v2, La/f8l0;

    .line 3406
    .line 3407
    const/16 v3, 0x1c

    .line 3408
    .line 3409
    invoke-direct {v2, v3}, La/f8l0;-><init>(B)V

    .line 3410
    .line 3411
    .line 3412
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3413
    .line 3414
    .line 3415
    new-instance v0, La/a7n0;

    .line 3416
    .line 3417
    const/16 v2, 0xa

    .line 3418
    .line 3419
    invoke-direct {v0, v2}, La/a7n0;-><init>(B)V

    .line 3420
    .line 3421
    .line 3422
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3423
    .line 3424
    .line 3425
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3426
    .line 3427
    return-object v0

    .line 3428
    :pswitch_19
    move-object/from16 v0, p1

    .line 3429
    .line 3430
    check-cast v0, Ljava/lang/Integer;

    .line 3431
    .line 3432
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 3433
    .line 3434
    .line 3435
    move-object/from16 v0, p2

    .line 3436
    .line 3437
    check-cast v0, La/mxm0;

    .line 3438
    .line 3439
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3440
    .line 3441
    .line 3442
    iget-wide v0, v0, La/mxm0;->a:J

    .line 3443
    .line 3444
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3445
    .line 3446
    .line 3447
    move-result-object v0

    .line 3448
    return-object v0

    .line 3449
    :pswitch_1a
    move-object/from16 v0, p1

    .line 3450
    .line 3451
    check-cast v0, Landroid/view/LayoutInflater;

    .line 3452
    .line 3453
    move-object/from16 v1, p2

    .line 3454
    .line 3455
    check-cast v1, Landroid/view/ViewGroup;

    .line 3456
    .line 3457
    const v2, 0x7f0d0456

    .line 3458
    .line 3459
    .line 3460
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 3461
    .line 3462
    .line 3463
    move-result-object v0

    .line 3464
    if-eqz v0, :cond_75

    .line 3465
    .line 3466
    check-cast v0, Landroid/widget/TextView;

    .line 3467
    .line 3468
    new-instance v1, La/iyx;

    .line 3469
    .line 3470
    invoke-direct {v1, v0, v0}, La/iyx;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 3471
    .line 3472
    .line 3473
    move-object/from16 v20, v1

    .line 3474
    .line 3475
    goto :goto_14

    .line 3476
    :cond_75
    const-string v0, "rootView"

    .line 3477
    .line 3478
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 3479
    .line 3480
    .line 3481
    :goto_14
    return-object v20

    .line 3482
    :pswitch_1b
    move-object/from16 v0, p1

    .line 3483
    .line 3484
    check-cast v0, Landroid/view/LayoutInflater;

    .line 3485
    .line 3486
    move-object/from16 v1, p2

    .line 3487
    .line 3488
    check-cast v1, Landroid/view/ViewGroup;

    .line 3489
    .line 3490
    const v2, 0x7f0d00f0

    .line 3491
    .line 3492
    .line 3493
    invoke-static {v0, v1, v2, v1, v6}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 3494
    .line 3495
    .line 3496
    move-result-object v0

    .line 3497
    const v1, 0x7f0a0564

    .line 3498
    .line 3499
    .line 3500
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3501
    .line 3502
    .line 3503
    move-result-object v2

    .line 3504
    if-eqz v2, :cond_77

    .line 3505
    .line 3506
    const v1, 0x7f0a08c1

    .line 3507
    .line 3508
    .line 3509
    invoke-static {v2, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3510
    .line 3511
    .line 3512
    move-result-object v3

    .line 3513
    check-cast v3, Landroid/widget/ImageView;

    .line 3514
    .line 3515
    if-eqz v3, :cond_76

    .line 3516
    .line 3517
    new-instance v9, La/auh;

    .line 3518
    .line 3519
    check-cast v2, Landroid/widget/FrameLayout;

    .line 3520
    .line 3521
    invoke-direct {v9, v2, v6}, La/auh;-><init>(Landroid/widget/FrameLayout;B)V

    .line 3522
    .line 3523
    .line 3524
    const v1, 0x7f0a0801

    .line 3525
    .line 3526
    .line 3527
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3528
    .line 3529
    .line 3530
    move-result-object v2

    .line 3531
    move-object v10, v2

    .line 3532
    check-cast v10, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 3533
    .line 3534
    if-eqz v10, :cond_77

    .line 3535
    .line 3536
    const v1, 0x7f0a1236

    .line 3537
    .line 3538
    .line 3539
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3540
    .line 3541
    .line 3542
    move-result-object v2

    .line 3543
    move-object v11, v2

    .line 3544
    check-cast v11, Landroid/widget/TextView;

    .line 3545
    .line 3546
    if-eqz v11, :cond_77

    .line 3547
    .line 3548
    const v1, 0x7f0a1260

    .line 3549
    .line 3550
    .line 3551
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 3552
    .line 3553
    .line 3554
    move-result-object v2

    .line 3555
    move-object v12, v2

    .line 3556
    check-cast v12, Landroid/widget/TextView;

    .line 3557
    .line 3558
    if-eqz v12, :cond_77

    .line 3559
    .line 3560
    new-instance v7, La/zth;

    .line 3561
    .line 3562
    move-object v8, v0

    .line 3563
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 3564
    .line 3565
    invoke-direct/range {v7 .. v12}, La/zth;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;La/auh;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 3566
    .line 3567
    .line 3568
    move-object/from16 v20, v7

    .line 3569
    .line 3570
    goto :goto_15

    .line 3571
    :cond_76
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3572
    .line 3573
    .line 3574
    move-result-object v0

    .line 3575
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 3576
    .line 3577
    .line 3578
    move-result-object v0

    .line 3579
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 3580
    .line 3581
    .line 3582
    move-result-object v0

    .line 3583
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 3584
    .line 3585
    .line 3586
    goto :goto_15

    .line 3587
    :cond_77
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3588
    .line 3589
    .line 3590
    move-result-object v0

    .line 3591
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 3592
    .line 3593
    .line 3594
    move-result-object v0

    .line 3595
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 3596
    .line 3597
    .line 3598
    move-result-object v0

    .line 3599
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 3600
    .line 3601
    .line 3602
    :goto_15
    return-object v20

    .line 3603
    :pswitch_1c
    move-object/from16 v0, p1

    .line 3604
    .line 3605
    check-cast v0, Ljava/lang/Integer;

    .line 3606
    .line 3607
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3608
    .line 3609
    .line 3610
    move-object/from16 v0, p2

    .line 3611
    .line 3612
    check-cast v0, La/tdb;

    .line 3613
    .line 3614
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3615
    .line 3616
    .line 3617
    iget-object v0, v0, La/tdb;->a:Lorg/xplatform/statistic/champ_statistic/presentation/models/ChampMenuType;

    .line 3618
    .line 3619
    return-object v0

    .line 3620
    nop

    .line 3621
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
