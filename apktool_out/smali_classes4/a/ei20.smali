.class public final synthetic La/ei20;
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
    iput-byte p1, p0, La/ei20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/ei20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/ei20;->a:B

    .line 4
    .line 5
    const/4 v1, 0x5

    .line 6
    const v2, 0x7f0a1260

    .line 7
    .line 8
    .line 9
    const v3, 0x7f0a082e

    .line 10
    .line 11
    .line 12
    const v4, 0x7f0a080a

    .line 13
    .line 14
    .line 15
    const v5, 0x7f0d03ad

    .line 16
    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    const-string v7, "Missing required view with ID: "

    .line 20
    .line 21
    const/4 v8, 0x3

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, La/fet;

    .line 30
    .line 31
    move-object/from16 v1, p2

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v6}, La/x8x;->L(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1, v0}, La/vdx;->h(ILa/fet;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    move-object/from16 v0, p1

    .line 49
    .line 50
    check-cast v0, La/fet;

    .line 51
    .line 52
    move-object/from16 v1, p2

    .line 53
    .line 54
    check-cast v1, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    const v1, 0x68f7c36d

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v10, v10, v0, v10, v8}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :pswitch_1
    move-object/from16 v0, p1

    .line 74
    .line 75
    check-cast v0, La/fet;

    .line 76
    .line 77
    move-object/from16 v1, p2

    .line 78
    .line 79
    check-cast v1, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    const v1, -0x1f4bb3b3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v10, v10, v0, v10, v8}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 95
    .line 96
    .line 97
    return-object v1

    .line 98
    :pswitch_2
    move-object/from16 v0, p1

    .line 99
    .line 100
    check-cast v0, La/fet;

    .line 101
    .line 102
    move-object/from16 v1, p2

    .line 103
    .line 104
    check-cast v1, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    const v1, 0x2b8fa10d

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 113
    .line 114
    .line 115
    invoke-static {v10, v10, v0, v10, v8}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 120
    .line 121
    .line 122
    return-object v1

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
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    const v1, 0x3e9b43d9

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 138
    .line 139
    .line 140
    invoke-static {v10, v10, v0, v10, v8}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 145
    .line 146
    .line 147
    return-object v1

    .line 148
    :pswitch_4
    move-object/from16 v0, p1

    .line 149
    .line 150
    check-cast v0, La/fet;

    .line 151
    .line 152
    move-object/from16 v1, p2

    .line 153
    .line 154
    check-cast v1, Ljava/lang/Integer;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 157
    .line 158
    .line 159
    const v1, -0x4b5da8e7

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 163
    .line 164
    .line 165
    invoke-static {v10, v10, v0, v10, v8}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 170
    .line 171
    .line 172
    return-object v1

    .line 173
    :pswitch_5
    move-object/from16 v0, p1

    .line 174
    .line 175
    check-cast v0, La/fet;

    .line 176
    .line 177
    move-object/from16 v1, p2

    .line 178
    .line 179
    check-cast v1, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    const v1, 0x327c68b9

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 188
    .line 189
    .line 190
    invoke-static {v10, v10, v0, v10, v8}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 195
    .line 196
    .line 197
    return-object v1

    .line 198
    :pswitch_6
    move-object/from16 v0, p1

    .line 199
    .line 200
    check-cast v0, Landroid/view/LayoutInflater;

    .line 201
    .line 202
    move-object/from16 v1, p2

    .line 203
    .line 204
    check-cast v1, Landroid/view/ViewGroup;

    .line 205
    .line 206
    const v2, 0x7f0d04c4

    .line 207
    .line 208
    .line 209
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    const v1, 0x7f0a0819

    .line 214
    .line 215
    .line 216
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    move-object v12, v2

    .line 221
    check-cast v12, Landroid/widget/ImageView;

    .line 222
    .line 223
    if-eqz v12, :cond_0

    .line 224
    .line 225
    const v1, 0x7f0a108a

    .line 226
    .line 227
    .line 228
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    move-object v13, v2

    .line 233
    check-cast v13, Landroid/widget/TextView;

    .line 234
    .line 235
    if-eqz v13, :cond_0

    .line 236
    .line 237
    const v1, 0x7f0a10c6

    .line 238
    .line 239
    .line 240
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    move-object v14, v2

    .line 245
    check-cast v14, Landroid/widget/TextView;

    .line 246
    .line 247
    if-eqz v14, :cond_0

    .line 248
    .line 249
    const v1, 0x7f0a114f

    .line 250
    .line 251
    .line 252
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    move-object v15, v2

    .line 257
    check-cast v15, Landroid/widget/TextView;

    .line 258
    .line 259
    if-eqz v15, :cond_0

    .line 260
    .line 261
    const v1, 0x7f0a11d9

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    move-object/from16 v16, v2

    .line 269
    .line 270
    check-cast v16, Landroid/widget/TextView;

    .line 271
    .line 272
    if-eqz v16, :cond_0

    .line 273
    .line 274
    const v1, 0x7f0a121d

    .line 275
    .line 276
    .line 277
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    move-object/from16 v17, v2

    .line 282
    .line 283
    check-cast v17, Landroid/widget/TextView;

    .line 284
    .line 285
    if-eqz v17, :cond_0

    .line 286
    .line 287
    const v1, 0x7f0a1268

    .line 288
    .line 289
    .line 290
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    move-object/from16 v18, v2

    .line 295
    .line 296
    check-cast v18, Landroid/widget/TextView;

    .line 297
    .line 298
    if-eqz v18, :cond_0

    .line 299
    .line 300
    new-instance v10, La/gl30;

    .line 301
    .line 302
    move-object v11, v0

    .line 303
    check-cast v11, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 304
    .line 305
    invoke-direct/range {v10 .. v18}, La/gl30;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 306
    .line 307
    .line 308
    move-object v9, v10

    .line 309
    goto :goto_0

    .line 310
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    :goto_0
    return-object v9

    .line 326
    :pswitch_7
    move-object/from16 v0, p1

    .line 327
    .line 328
    check-cast v0, Ljava/lang/Throwable;

    .line 329
    .line 330
    move-object/from16 v1, p2

    .line 331
    .line 332
    check-cast v1, Ljava/lang/String;

    .line 333
    .line 334
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 335
    .line 336
    .line 337
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    return-object v0

    .line 340
    :pswitch_8
    move-object/from16 v0, p1

    .line 341
    .line 342
    check-cast v0, Landroid/view/LayoutInflater;

    .line 343
    .line 344
    move-object/from16 v1, p2

    .line 345
    .line 346
    check-cast v1, Landroid/view/ViewGroup;

    .line 347
    .line 348
    const v2, 0x7f0d0373

    .line 349
    .line 350
    .line 351
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    const v1, 0x7f0a01ca

    .line 356
    .line 357
    .line 358
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    check-cast v2, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 363
    .line 364
    if-eqz v2, :cond_1

    .line 365
    .line 366
    const v1, 0x7f0a063a

    .line 367
    .line 368
    .line 369
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    check-cast v3, Landroidx/compose/ui/platform/ComposeView;

    .line 374
    .line 375
    if-eqz v3, :cond_1

    .line 376
    .line 377
    new-instance v9, La/vsx;

    .line 378
    .line 379
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 380
    .line 381
    invoke-direct {v9, v0, v2, v3}, La/vsx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;Landroidx/compose/ui/platform/ComposeView;)V

    .line 382
    .line 383
    .line 384
    goto :goto_1

    .line 385
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    :goto_1
    return-object v9

    .line 401
    :pswitch_9
    move-object/from16 v0, p1

    .line 402
    .line 403
    check-cast v0, Ljava/lang/Throwable;

    .line 404
    .line 405
    move-object/from16 v0, p2

    .line 406
    .line 407
    check-cast v0, Ljava/lang/String;

    .line 408
    .line 409
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    return-object v0

    .line 412
    :pswitch_a
    move-object/from16 v0, p1

    .line 413
    .line 414
    check-cast v0, Ljava/lang/Throwable;

    .line 415
    .line 416
    move-object/from16 v0, p2

    .line 417
    .line 418
    check-cast v0, Ljava/lang/String;

    .line 419
    .line 420
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 421
    .line 422
    return-object v0

    .line 423
    :pswitch_b
    move-object/from16 v0, p1

    .line 424
    .line 425
    check-cast v0, La/fet;

    .line 426
    .line 427
    move-object/from16 v1, p2

    .line 428
    .line 429
    check-cast v1, Ljava/lang/Integer;

    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-static {v6}, La/x8x;->L(I)I

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    invoke-static {v1, v0}, La/aad;->p(ILa/fet;)V

    .line 439
    .line 440
    .line 441
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 442
    .line 443
    return-object v0

    .line 444
    :pswitch_c
    move-object/from16 v0, p1

    .line 445
    .line 446
    check-cast v0, Landroid/view/LayoutInflater;

    .line 447
    .line 448
    move-object/from16 v1, p2

    .line 449
    .line 450
    check-cast v1, Landroid/view/ViewGroup;

    .line 451
    .line 452
    const v2, 0x7f0d04b3

    .line 453
    .line 454
    .line 455
    invoke-static {v0, v1, v2, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    const v1, 0x7f0a0685

    .line 460
    .line 461
    .line 462
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    check-cast v2, Landroid/widget/TextView;

    .line 467
    .line 468
    if-eqz v2, :cond_2

    .line 469
    .line 470
    const v1, 0x7f0a0686

    .line 471
    .line 472
    .line 473
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    check-cast v3, Landroid/widget/TextView;

    .line 478
    .line 479
    if-eqz v3, :cond_2

    .line 480
    .line 481
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 482
    .line 483
    new-instance v9, La/ex20;

    .line 484
    .line 485
    invoke-direct {v9, v0, v2, v3, v0}, La/ex20;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 486
    .line 487
    .line 488
    goto :goto_2

    .line 489
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    :goto_2
    return-object v9

    .line 505
    :pswitch_d
    move-object/from16 v0, p1

    .line 506
    .line 507
    check-cast v0, Ljava/lang/Integer;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    move-object/from16 v0, p2

    .line 513
    .line 514
    check-cast v0, La/gy20;

    .line 515
    .line 516
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    invoke-interface {v0}, La/gy20;->getKey()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    return-object v0

    .line 524
    :pswitch_e
    move-object/from16 v0, p1

    .line 525
    .line 526
    check-cast v0, Landroid/view/LayoutInflater;

    .line 527
    .line 528
    move-object/from16 v1, p2

    .line 529
    .line 530
    check-cast v1, Landroid/view/ViewGroup;

    .line 531
    .line 532
    invoke-static {v0, v1, v5, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    check-cast v1, Landroid/widget/ImageView;

    .line 541
    .line 542
    if-eqz v1, :cond_4

    .line 543
    .line 544
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    check-cast v4, Landroid/widget/ImageView;

    .line 549
    .line 550
    if-eqz v4, :cond_3

    .line 551
    .line 552
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    check-cast v3, Landroid/widget/TextView;

    .line 557
    .line 558
    if-eqz v3, :cond_5

    .line 559
    .line 560
    new-instance v9, La/iux;

    .line 561
    .line 562
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 563
    .line 564
    invoke-direct {v9, v0, v1, v4, v3}, La/iux;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 565
    .line 566
    .line 567
    goto :goto_4

    .line 568
    :cond_3
    move v2, v3

    .line 569
    goto :goto_3

    .line 570
    :cond_4
    move v2, v4

    .line 571
    :cond_5
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    :goto_4
    return-object v9

    .line 587
    :pswitch_f
    move-object/from16 v0, p1

    .line 588
    .line 589
    check-cast v0, Landroid/view/LayoutInflater;

    .line 590
    .line 591
    move-object/from16 v1, p2

    .line 592
    .line 593
    check-cast v1, Landroid/view/ViewGroup;

    .line 594
    .line 595
    invoke-static {v0, v1, v5, v1, v10}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    check-cast v1, Landroid/widget/ImageView;

    .line 604
    .line 605
    if-eqz v1, :cond_7

    .line 606
    .line 607
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 608
    .line 609
    .line 610
    move-result-object v4

    .line 611
    check-cast v4, Landroid/widget/ImageView;

    .line 612
    .line 613
    if-eqz v4, :cond_6

    .line 614
    .line 615
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 616
    .line 617
    .line 618
    move-result-object v3

    .line 619
    check-cast v3, Landroid/widget/TextView;

    .line 620
    .line 621
    if-eqz v3, :cond_8

    .line 622
    .line 623
    new-instance v9, La/hux;

    .line 624
    .line 625
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 626
    .line 627
    invoke-direct {v9, v0, v1, v4, v3}, La/hux;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 628
    .line 629
    .line 630
    goto :goto_6

    .line 631
    :cond_6
    move v2, v3

    .line 632
    goto :goto_5

    .line 633
    :cond_7
    move v2, v4

    .line 634
    :cond_8
    :goto_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    :goto_6
    return-object v9

    .line 650
    :pswitch_10
    move-object/from16 v0, p1

    .line 651
    .line 652
    check-cast v0, La/oyg0;

    .line 653
    .line 654
    move-object/from16 v1, p2

    .line 655
    .line 656
    check-cast v1, La/a820;

    .line 657
    .line 658
    iget-object v2, v1, La/a820;->e:La/pvj0;

    .line 659
    .line 660
    iget-object v3, v2, La/pvj0;->c:La/iwo0;

    .line 661
    .line 662
    const/4 v8, 0x0

    .line 663
    const/16 v9, 0x3c

    .line 664
    .line 665
    const/4 v4, 0x1

    .line 666
    const/4 v5, 0x1

    .line 667
    const-wide/16 v6, 0x0

    .line 668
    .line 669
    invoke-static/range {v3 .. v9}, La/iwo0;->a(La/iwo0;ZZDLjava/util/List;I)La/iwo0;

    .line 670
    .line 671
    .line 672
    move-result-object v5

    .line 673
    const/4 v8, 0x0

    .line 674
    const/16 v9, 0x3b

    .line 675
    .line 676
    const/4 v3, 0x0

    .line 677
    const/4 v4, 0x0

    .line 678
    const/4 v6, 0x0

    .line 679
    const/4 v7, 0x0

    .line 680
    invoke-static/range {v2 .. v9}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    iget-object v6, v1, La/a820;->g:La/hx4;

    .line 685
    .line 686
    iget-object v7, v6, La/hx4;->d:La/iwo0;

    .line 687
    .line 688
    const/4 v12, 0x0

    .line 689
    const/16 v13, 0x3c

    .line 690
    .line 691
    const/4 v8, 0x1

    .line 692
    const/4 v9, 0x1

    .line 693
    const-wide/16 v10, 0x0

    .line 694
    .line 695
    invoke-static/range {v7 .. v13}, La/iwo0;->a(La/iwo0;ZZDLjava/util/List;I)La/iwo0;

    .line 696
    .line 697
    .line 698
    move-result-object v10

    .line 699
    const/4 v12, 0x0

    .line 700
    const/16 v13, 0x37

    .line 701
    .line 702
    const/4 v7, 0x0

    .line 703
    const/4 v8, 0x0

    .line 704
    const/4 v9, 0x0

    .line 705
    const/4 v11, 0x0

    .line 706
    invoke-static/range {v6 .. v13}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    const v18, 0x3ffaf

    .line 713
    .line 714
    .line 715
    const/4 v2, 0x0

    .line 716
    const/4 v6, 0x0

    .line 717
    const/4 v9, 0x0

    .line 718
    const/4 v10, 0x0

    .line 719
    const/4 v11, 0x0

    .line 720
    const/4 v13, 0x0

    .line 721
    const/4 v14, 0x0

    .line 722
    const/4 v15, 0x0

    .line 723
    const/16 v16, 0x0

    .line 724
    .line 725
    invoke-static/range {v1 .. v18}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    return-object v0

    .line 730
    :pswitch_11
    move-object/from16 v0, p1

    .line 731
    .line 732
    check-cast v0, La/oyg0;

    .line 733
    .line 734
    move-object/from16 v10, p2

    .line 735
    .line 736
    check-cast v10, La/b820;

    .line 737
    .line 738
    iget-object v0, v10, La/b820;->d:La/rvj0;

    .line 739
    .line 740
    iget-object v1, v0, La/rvj0;->c:La/kwo0;

    .line 741
    .line 742
    const/4 v6, 0x0

    .line 743
    const/16 v7, 0x3c

    .line 744
    .line 745
    const/4 v2, 0x1

    .line 746
    const/4 v3, 0x1

    .line 747
    const-wide/16 v4, 0x0

    .line 748
    .line 749
    invoke-static/range {v1 .. v7}, La/kwo0;->a(La/kwo0;ZZDLjava/util/List;I)La/kwo0;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    const/4 v5, 0x0

    .line 754
    const/16 v6, 0x1b

    .line 755
    .line 756
    const/4 v1, 0x0

    .line 757
    const/4 v2, 0x0

    .line 758
    const/4 v4, 0x0

    .line 759
    invoke-static/range {v0 .. v6}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 760
    .line 761
    .line 762
    move-result-object v14

    .line 763
    iget-object v0, v10, La/b820;->f:La/gx4;

    .line 764
    .line 765
    if-eqz v0, :cond_9

    .line 766
    .line 767
    iget-object v1, v0, La/gx4;->d:La/kwo0;

    .line 768
    .line 769
    const/4 v6, 0x0

    .line 770
    const/16 v7, 0x3c

    .line 771
    .line 772
    const/4 v2, 0x1

    .line 773
    const/4 v3, 0x1

    .line 774
    const-wide/16 v4, 0x0

    .line 775
    .line 776
    invoke-static/range {v1 .. v7}, La/kwo0;->a(La/kwo0;ZZDLjava/util/List;I)La/kwo0;

    .line 777
    .line 778
    .line 779
    move-result-object v4

    .line 780
    const/4 v5, 0x0

    .line 781
    const/16 v6, 0x17

    .line 782
    .line 783
    const/4 v1, 0x0

    .line 784
    const/4 v2, 0x0

    .line 785
    const/4 v3, 0x0

    .line 786
    invoke-static/range {v0 .. v6}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 787
    .line 788
    .line 789
    move-result-object v9

    .line 790
    :cond_9
    move-object/from16 v16, v9

    .line 791
    .line 792
    const/16 v22, 0x0

    .line 793
    .line 794
    const/16 v23, 0x1fd7

    .line 795
    .line 796
    const/4 v11, 0x0

    .line 797
    const/4 v12, 0x0

    .line 798
    const/4 v13, 0x0

    .line 799
    const/4 v15, 0x0

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
    invoke-static/range {v10 .. v23}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    return-object v0

    .line 815
    :pswitch_12
    move-object/from16 v0, p1

    .line 816
    .line 817
    check-cast v0, Ljava/lang/Throwable;

    .line 818
    .line 819
    move-object/from16 v1, p2

    .line 820
    .line 821
    check-cast v1, Ljava/lang/String;

    .line 822
    .line 823
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 824
    .line 825
    .line 826
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 827
    .line 828
    return-object v0

    .line 829
    :pswitch_13
    move-object/from16 v0, p1

    .line 830
    .line 831
    check-cast v0, Ljava/lang/Throwable;

    .line 832
    .line 833
    move-object/from16 v1, p2

    .line 834
    .line 835
    check-cast v1, Ljava/lang/String;

    .line 836
    .line 837
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 838
    .line 839
    .line 840
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 841
    .line 842
    return-object v0

    .line 843
    :pswitch_14
    move-object/from16 v0, p1

    .line 844
    .line 845
    check-cast v0, Ljava/lang/Throwable;

    .line 846
    .line 847
    move-object/from16 v1, p2

    .line 848
    .line 849
    check-cast v1, Ljava/lang/String;

    .line 850
    .line 851
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 852
    .line 853
    .line 854
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 855
    .line 856
    return-object v0

    .line 857
    :pswitch_15
    move-object/from16 v0, p1

    .line 858
    .line 859
    check-cast v0, Ljava/lang/Throwable;

    .line 860
    .line 861
    move-object/from16 v1, p2

    .line 862
    .line 863
    check-cast v1, Ljava/lang/String;

    .line 864
    .line 865
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 866
    .line 867
    .line 868
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 869
    .line 870
    return-object v0

    .line 871
    :pswitch_16
    move-object/from16 v0, p1

    .line 872
    .line 873
    check-cast v0, La/oyg0;

    .line 874
    .line 875
    move-object/from16 v11, p2

    .line 876
    .line 877
    check-cast v11, La/a820;

    .line 878
    .line 879
    iget-object v12, v11, La/a820;->e:La/pvj0;

    .line 880
    .line 881
    iget-object v0, v12, La/pvj0;->a:La/bx6;

    .line 882
    .line 883
    iget-object v13, v0, La/bx6;->b:La/tw6;

    .line 884
    .line 885
    const/16 v33, 0x0

    .line 886
    .line 887
    const v34, 0xfbff

    .line 888
    .line 889
    .line 890
    const-wide/16 v14, 0x0

    .line 891
    .line 892
    const-wide/16 v16, 0x0

    .line 893
    .line 894
    const-wide/16 v18, 0x0

    .line 895
    .line 896
    const-wide/16 v20, 0x0

    .line 897
    .line 898
    const-wide/16 v22, 0x0

    .line 899
    .line 900
    const/16 v24, 0x0

    .line 901
    .line 902
    const/16 v25, 0x0

    .line 903
    .line 904
    const/16 v26, 0x0

    .line 905
    .line 906
    const/16 v27, 0x0

    .line 907
    .line 908
    const/16 v28, 0x0

    .line 909
    .line 910
    const/16 v29, 0x1

    .line 911
    .line 912
    const/16 v30, 0x0

    .line 913
    .line 914
    const/16 v31, 0x0

    .line 915
    .line 916
    const/16 v32, 0x0

    .line 917
    .line 918
    invoke-static/range {v13 .. v34}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    invoke-static {v0, v9, v2, v10, v1}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 923
    .line 924
    .line 925
    move-result-object v13

    .line 926
    const/16 v18, 0x0

    .line 927
    .line 928
    const/16 v19, 0x1e

    .line 929
    .line 930
    const/4 v14, 0x0

    .line 931
    const/4 v15, 0x0

    .line 932
    const/16 v16, 0x0

    .line 933
    .line 934
    const/16 v17, 0x0

    .line 935
    .line 936
    invoke-static/range {v12 .. v19}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 937
    .line 938
    .line 939
    move-result-object v15

    .line 940
    const/16 v27, 0x0

    .line 941
    .line 942
    const v28, 0x3ffef

    .line 943
    .line 944
    .line 945
    const/4 v12, 0x0

    .line 946
    const/4 v13, 0x0

    .line 947
    const/16 v18, 0x0

    .line 948
    .line 949
    const/16 v19, 0x0

    .line 950
    .line 951
    const/16 v20, 0x0

    .line 952
    .line 953
    const/16 v21, 0x0

    .line 954
    .line 955
    const/16 v22, 0x0

    .line 956
    .line 957
    const/16 v23, 0x0

    .line 958
    .line 959
    const/16 v24, 0x0

    .line 960
    .line 961
    invoke-static/range {v11 .. v28}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    return-object v0

    .line 966
    :pswitch_17
    move-object/from16 v0, p1

    .line 967
    .line 968
    check-cast v0, Ljava/lang/Throwable;

    .line 969
    .line 970
    move-object/from16 v0, p2

    .line 971
    .line 972
    check-cast v0, Ljava/lang/String;

    .line 973
    .line 974
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 975
    .line 976
    return-object v0

    .line 977
    :pswitch_18
    move-object/from16 v0, p1

    .line 978
    .line 979
    check-cast v0, La/oyg0;

    .line 980
    .line 981
    move-object/from16 v11, p2

    .line 982
    .line 983
    check-cast v11, La/b820;

    .line 984
    .line 985
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 989
    .line 990
    .line 991
    iget-object v1, v11, La/b820;->d:La/rvj0;

    .line 992
    .line 993
    iget-object v0, v1, La/rvj0;->b:La/mnb0;

    .line 994
    .line 995
    const-string v2, ""

    .line 996
    .line 997
    const/4 v3, 0x2

    .line 998
    invoke-static {v0, v10, v9, v2, v3}, La/mnb0;->a(La/mnb0;ZLjava/lang/String;Ljava/lang/String;I)La/mnb0;

    .line 999
    .line 1000
    .line 1001
    move-result-object v3

    .line 1002
    const/4 v6, 0x0

    .line 1003
    const/16 v7, 0x1d

    .line 1004
    .line 1005
    const/4 v2, 0x0

    .line 1006
    const/4 v4, 0x0

    .line 1007
    const/4 v5, 0x0

    .line 1008
    invoke-static/range {v1 .. v7}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v15

    .line 1012
    const/16 v23, 0x0

    .line 1013
    .line 1014
    const/16 v24, 0x1ff7

    .line 1015
    .line 1016
    const/4 v12, 0x0

    .line 1017
    const/4 v13, 0x0

    .line 1018
    const/4 v14, 0x0

    .line 1019
    const/16 v16, 0x0

    .line 1020
    .line 1021
    const/16 v17, 0x0

    .line 1022
    .line 1023
    const/16 v18, 0x0

    .line 1024
    .line 1025
    const/16 v19, 0x0

    .line 1026
    .line 1027
    const/16 v20, 0x0

    .line 1028
    .line 1029
    const/16 v21, 0x0

    .line 1030
    .line 1031
    const/16 v22, 0x0

    .line 1032
    .line 1033
    invoke-static/range {v11 .. v24}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    return-object v0

    .line 1038
    :pswitch_19
    move-object/from16 v0, p1

    .line 1039
    .line 1040
    check-cast v0, La/oyg0;

    .line 1041
    .line 1042
    move-object/from16 v1, p2

    .line 1043
    .line 1044
    check-cast v1, La/a820;

    .line 1045
    .line 1046
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1050
    .line 1051
    .line 1052
    iget-object v2, v1, La/a820;->e:La/pvj0;

    .line 1053
    .line 1054
    iget-object v3, v2, La/pvj0;->c:La/iwo0;

    .line 1055
    .line 1056
    sget-object v8, La/iun;->a:La/iun;

    .line 1057
    .line 1058
    const/16 v9, 0x1c

    .line 1059
    .line 1060
    const/4 v4, 0x0

    .line 1061
    const/4 v5, 0x0

    .line 1062
    const-wide/16 v6, 0x0

    .line 1063
    .line 1064
    invoke-static/range {v3 .. v9}, La/iwo0;->a(La/iwo0;ZZDLjava/util/List;I)La/iwo0;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v5

    .line 1068
    const/4 v8, 0x0

    .line 1069
    const/16 v9, 0x3b

    .line 1070
    .line 1071
    const/4 v3, 0x0

    .line 1072
    const/4 v4, 0x0

    .line 1073
    const/4 v6, 0x0

    .line 1074
    const/4 v7, 0x0

    .line 1075
    invoke-static/range {v2 .. v9}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v5

    .line 1079
    const/16 v17, 0x0

    .line 1080
    .line 1081
    const v18, 0x3ffef

    .line 1082
    .line 1083
    .line 1084
    const/4 v2, 0x0

    .line 1085
    const/4 v8, 0x0

    .line 1086
    const/4 v9, 0x0

    .line 1087
    const/4 v10, 0x0

    .line 1088
    const/4 v11, 0x0

    .line 1089
    const/4 v12, 0x0

    .line 1090
    const/4 v13, 0x0

    .line 1091
    const/4 v14, 0x0

    .line 1092
    const/4 v15, 0x0

    .line 1093
    const/16 v16, 0x0

    .line 1094
    .line 1095
    invoke-static/range {v1 .. v18}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    return-object v0

    .line 1100
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1101
    .line 1102
    check-cast v0, La/oyg0;

    .line 1103
    .line 1104
    move-object/from16 v1, p2

    .line 1105
    .line 1106
    check-cast v1, La/a820;

    .line 1107
    .line 1108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    iget-object v2, v1, La/a820;->e:La/pvj0;

    .line 1115
    .line 1116
    iget-object v3, v2, La/pvj0;->d:La/nnd0;

    .line 1117
    .line 1118
    const/4 v11, 0x0

    .line 1119
    const/16 v12, 0x3e

    .line 1120
    .line 1121
    const/4 v4, 0x0

    .line 1122
    const-wide/16 v5, 0x0

    .line 1123
    .line 1124
    const-wide/16 v7, 0x0

    .line 1125
    .line 1126
    const-wide/16 v9, 0x0

    .line 1127
    .line 1128
    invoke-static/range {v3 .. v12}, La/nnd0;->a(La/nnd0;ZDDDZI)La/nnd0;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v6

    .line 1132
    const/4 v8, 0x0

    .line 1133
    const/16 v9, 0x27

    .line 1134
    .line 1135
    const/4 v3, 0x0

    .line 1136
    const/4 v4, 0x0

    .line 1137
    const/4 v5, 0x0

    .line 1138
    const/4 v7, 0x0

    .line 1139
    invoke-static/range {v2 .. v9}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v5

    .line 1143
    const/16 v17, 0x0

    .line 1144
    .line 1145
    const v18, 0x3ffef

    .line 1146
    .line 1147
    .line 1148
    const/4 v2, 0x0

    .line 1149
    const/4 v6, 0x0

    .line 1150
    const/4 v8, 0x0

    .line 1151
    const/4 v9, 0x0

    .line 1152
    const/4 v10, 0x0

    .line 1153
    const/4 v11, 0x0

    .line 1154
    const/4 v12, 0x0

    .line 1155
    const/4 v13, 0x0

    .line 1156
    const/4 v14, 0x0

    .line 1157
    const/4 v15, 0x0

    .line 1158
    const/16 v16, 0x0

    .line 1159
    .line 1160
    invoke-static/range {v1 .. v18}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v0

    .line 1164
    return-object v0

    .line 1165
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1166
    .line 1167
    check-cast v0, La/oyg0;

    .line 1168
    .line 1169
    move-object/from16 v11, p2

    .line 1170
    .line 1171
    check-cast v11, La/a820;

    .line 1172
    .line 1173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1177
    .line 1178
    .line 1179
    iget-object v12, v11, La/a820;->e:La/pvj0;

    .line 1180
    .line 1181
    iget-object v0, v12, La/pvj0;->a:La/bx6;

    .line 1182
    .line 1183
    iget-object v13, v0, La/bx6;->b:La/tw6;

    .line 1184
    .line 1185
    const/16 v33, 0x0

    .line 1186
    .line 1187
    const v34, 0xfbff

    .line 1188
    .line 1189
    .line 1190
    const-wide/16 v14, 0x0

    .line 1191
    .line 1192
    const-wide/16 v16, 0x0

    .line 1193
    .line 1194
    const-wide/16 v18, 0x0

    .line 1195
    .line 1196
    const-wide/16 v20, 0x0

    .line 1197
    .line 1198
    const-wide/16 v22, 0x0

    .line 1199
    .line 1200
    const/16 v24, 0x0

    .line 1201
    .line 1202
    const/16 v25, 0x0

    .line 1203
    .line 1204
    const/16 v26, 0x0

    .line 1205
    .line 1206
    const/16 v27, 0x0

    .line 1207
    .line 1208
    const/16 v28, 0x0

    .line 1209
    .line 1210
    const/16 v29, 0x0

    .line 1211
    .line 1212
    const/16 v30, 0x0

    .line 1213
    .line 1214
    const/16 v31, 0x0

    .line 1215
    .line 1216
    const/16 v32, 0x0

    .line 1217
    .line 1218
    invoke-static/range {v13 .. v34}, La/tw6;->a(La/tw6;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZI)La/tw6;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v2

    .line 1222
    invoke-static {v0, v9, v2, v10, v1}, La/bx6;->a(La/bx6;La/a8q0;La/tw6;ZI)La/bx6;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v13

    .line 1226
    const/16 v18, 0x0

    .line 1227
    .line 1228
    const/16 v19, 0x1e

    .line 1229
    .line 1230
    const/4 v14, 0x0

    .line 1231
    const/4 v15, 0x0

    .line 1232
    const/16 v16, 0x0

    .line 1233
    .line 1234
    const/16 v17, 0x0

    .line 1235
    .line 1236
    invoke-static/range {v12 .. v19}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v15

    .line 1240
    const/16 v27, 0x0

    .line 1241
    .line 1242
    const v28, 0x3ffef

    .line 1243
    .line 1244
    .line 1245
    const/4 v12, 0x0

    .line 1246
    const/4 v13, 0x0

    .line 1247
    const/16 v18, 0x0

    .line 1248
    .line 1249
    const/16 v19, 0x0

    .line 1250
    .line 1251
    const/16 v20, 0x0

    .line 1252
    .line 1253
    const/16 v21, 0x0

    .line 1254
    .line 1255
    const/16 v22, 0x0

    .line 1256
    .line 1257
    const/16 v23, 0x0

    .line 1258
    .line 1259
    const/16 v24, 0x0

    .line 1260
    .line 1261
    invoke-static/range {v11 .. v28}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    return-object v0

    .line 1266
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1267
    .line 1268
    check-cast v0, La/oyg0;

    .line 1269
    .line 1270
    move-object/from16 v10, p2

    .line 1271
    .line 1272
    check-cast v10, La/a820;

    .line 1273
    .line 1274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1278
    .line 1279
    .line 1280
    iget-object v0, v10, La/a820;->c:La/ko7;

    .line 1281
    .line 1282
    sget-object v1, La/jo7;->b:La/jo7;

    .line 1283
    .line 1284
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v1

    .line 1288
    if-eqz v1, :cond_a

    .line 1289
    .line 1290
    iget-object v11, v10, La/a820;->e:La/pvj0;

    .line 1291
    .line 1292
    iget-object v0, v11, La/pvj0;->c:La/iwo0;

    .line 1293
    .line 1294
    sget-object v5, La/iun;->a:La/iun;

    .line 1295
    .line 1296
    const/16 v6, 0x1c

    .line 1297
    .line 1298
    const/4 v1, 0x0

    .line 1299
    const/4 v2, 0x0

    .line 1300
    const-wide/16 v3, 0x0

    .line 1301
    .line 1302
    invoke-static/range {v0 .. v6}, La/iwo0;->a(La/iwo0;ZZDLjava/util/List;I)La/iwo0;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v14

    .line 1306
    const/16 v17, 0x0

    .line 1307
    .line 1308
    const/16 v18, 0x3b

    .line 1309
    .line 1310
    const/4 v12, 0x0

    .line 1311
    const/4 v13, 0x0

    .line 1312
    const/4 v15, 0x0

    .line 1313
    const/16 v16, 0x0

    .line 1314
    .line 1315
    invoke-static/range {v11 .. v18}, La/pvj0;->a(La/pvj0;La/bx6;La/knb0;La/iwo0;La/nnd0;Ljava/lang/String;ZI)La/pvj0;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v14

    .line 1319
    const/16 v26, 0x0

    .line 1320
    .line 1321
    const v27, 0x3ffef

    .line 1322
    .line 1323
    .line 1324
    const/4 v11, 0x0

    .line 1325
    const/16 v17, 0x0

    .line 1326
    .line 1327
    const/16 v18, 0x0

    .line 1328
    .line 1329
    const/16 v19, 0x0

    .line 1330
    .line 1331
    const/16 v20, 0x0

    .line 1332
    .line 1333
    const/16 v21, 0x0

    .line 1334
    .line 1335
    const/16 v22, 0x0

    .line 1336
    .line 1337
    const/16 v23, 0x0

    .line 1338
    .line 1339
    const/16 v24, 0x0

    .line 1340
    .line 1341
    const/16 v25, 0x0

    .line 1342
    .line 1343
    invoke-static/range {v10 .. v27}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v9

    .line 1347
    goto :goto_7

    .line 1348
    :cond_a
    sget-object v1, La/ho7;->b:La/ho7;

    .line 1349
    .line 1350
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1351
    .line 1352
    .line 1353
    move-result v1

    .line 1354
    if-eqz v1, :cond_b

    .line 1355
    .line 1356
    iget-object v11, v10, La/a820;->g:La/hx4;

    .line 1357
    .line 1358
    iget-object v0, v11, La/hx4;->d:La/iwo0;

    .line 1359
    .line 1360
    sget-object v5, La/iun;->a:La/iun;

    .line 1361
    .line 1362
    const/16 v6, 0x1c

    .line 1363
    .line 1364
    const/4 v1, 0x0

    .line 1365
    const/4 v2, 0x0

    .line 1366
    const-wide/16 v3, 0x0

    .line 1367
    .line 1368
    invoke-static/range {v0 .. v6}, La/iwo0;->a(La/iwo0;ZZDLjava/util/List;I)La/iwo0;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v15

    .line 1372
    const/16 v17, 0x0

    .line 1373
    .line 1374
    const/16 v18, 0x37

    .line 1375
    .line 1376
    const/4 v12, 0x0

    .line 1377
    const/4 v13, 0x0

    .line 1378
    const/4 v14, 0x0

    .line 1379
    const/16 v16, 0x0

    .line 1380
    .line 1381
    invoke-static/range {v11 .. v18}, La/hx4;->a(La/hx4;La/a8q0;La/yyc;La/bx6;La/iwo0;La/knb0;ZI)La/hx4;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v16

    .line 1385
    const/16 v26, 0x0

    .line 1386
    .line 1387
    const v27, 0x3ffbf

    .line 1388
    .line 1389
    .line 1390
    const/4 v11, 0x0

    .line 1391
    const/4 v15, 0x0

    .line 1392
    const/16 v17, 0x0

    .line 1393
    .line 1394
    const/16 v18, 0x0

    .line 1395
    .line 1396
    const/16 v19, 0x0

    .line 1397
    .line 1398
    const/16 v20, 0x0

    .line 1399
    .line 1400
    const/16 v21, 0x0

    .line 1401
    .line 1402
    const/16 v22, 0x0

    .line 1403
    .line 1404
    const/16 v23, 0x0

    .line 1405
    .line 1406
    const/16 v24, 0x0

    .line 1407
    .line 1408
    const/16 v25, 0x0

    .line 1409
    .line 1410
    invoke-static/range {v10 .. v27}, La/a820;->a(La/a820;La/txe;La/ko7;La/xm5;La/pvj0;La/dzc0;La/hx4;La/vtb0;ZLa/q4f;FZLa/vf7;IZZZI)La/a820;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v9

    .line 1414
    goto :goto_7

    .line 1415
    :cond_b
    sget-object v1, La/io7;->b:La/io7;

    .line 1416
    .line 1417
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v0

    .line 1421
    if-eqz v0, :cond_c

    .line 1422
    .line 1423
    move-object v9, v10

    .line 1424
    goto :goto_7

    .line 1425
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 1426
    .line 1427
    .line 1428
    :goto_7
    return-object v9

    .line 1429
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
