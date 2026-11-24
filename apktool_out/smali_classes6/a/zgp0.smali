.class public final synthetic La/zgp0;
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
    iput-byte p1, p0, La/zgp0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/zgp0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-byte v1, v1, La/zgp0;->a:B

    .line 6
    .line 7
    const-string v2, "rootView"

    .line 8
    .line 9
    const v3, 0x7f0a1302

    .line 10
    .line 11
    .line 12
    const v4, 0x7f0a12ff

    .line 13
    .line 14
    .line 15
    const v5, 0x7f0a0a33

    .line 16
    .line 17
    .line 18
    const-string v6, "Missing required view with ID: "

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x1

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v0, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-object/from16 v0, p2

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    check-cast v0, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-object/from16 v0, p2

    .line 47
    .line 48
    check-cast v0, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sget v0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->h:I

    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_1
    check-cast v0, La/lcq0;

    .line 59
    .line 60
    move-object/from16 v1, p2

    .line 61
    .line 62
    check-cast v1, Lkotlin/coroutines/CoroutineContext$Element;

    .line 63
    .line 64
    instance-of v2, v1, La/dcq0;

    .line 65
    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    check-cast v1, La/dcq0;

    .line 69
    .line 70
    iget-object v2, v0, La/lcq0;->a:Lkotlin/coroutines/CoroutineContext;

    .line 71
    .line 72
    invoke-interface {v1}, La/dcq0;->n()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iget-object v3, v0, La/lcq0;->b:[Ljava/lang/Object;

    .line 77
    .line 78
    iget v4, v0, La/lcq0;->d:I

    .line 79
    .line 80
    aput-object v2, v3, v4

    .line 81
    .line 82
    iget-object v2, v0, La/lcq0;->c:[La/dcq0;

    .line 83
    .line 84
    add-int/lit8 v3, v4, 0x1

    .line 85
    .line 86
    iput v3, v0, La/lcq0;->d:I

    .line 87
    .line 88
    aput-object v1, v2, v4

    .line 89
    .line 90
    :cond_0
    return-object v0

    .line 91
    :pswitch_2
    check-cast v0, La/dcq0;

    .line 92
    .line 93
    move-object/from16 v1, p2

    .line 94
    .line 95
    check-cast v1, Lkotlin/coroutines/CoroutineContext$Element;

    .line 96
    .line 97
    if-eqz v0, :cond_1

    .line 98
    .line 99
    move-object v8, v0

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    instance-of v0, v1, La/dcq0;

    .line 102
    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    move-object v8, v1

    .line 106
    check-cast v8, La/dcq0;

    .line 107
    .line 108
    :cond_2
    :goto_0
    return-object v8

    .line 109
    :pswitch_3
    move-object/from16 v1, p2

    .line 110
    .line 111
    check-cast v1, Lkotlin/coroutines/CoroutineContext$Element;

    .line 112
    .line 113
    instance-of v2, v1, La/dcq0;

    .line 114
    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    instance-of v2, v0, Ljava/lang/Integer;

    .line 118
    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    move-object v8, v0

    .line 122
    check-cast v8, Ljava/lang/Integer;

    .line 123
    .line 124
    :cond_3
    if-eqz v8, :cond_4

    .line 125
    .line 126
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    goto :goto_1

    .line 131
    :cond_4
    move v0, v9

    .line 132
    :goto_1
    if-nez v0, :cond_5

    .line 133
    .line 134
    move-object v0, v1

    .line 135
    goto :goto_2

    .line 136
    :cond_5
    add-int/2addr v0, v9

    .line 137
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    :cond_6
    :goto_2
    return-object v0

    .line 142
    :pswitch_4
    check-cast v0, Landroid/view/LayoutInflater;

    .line 143
    .line 144
    move-object/from16 v1, p2

    .line 145
    .line 146
    check-cast v1, Landroid/view/ViewGroup;

    .line 147
    .line 148
    const v2, 0x7f0d0129

    .line 149
    .line 150
    .line 151
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const v1, 0x7f0a0783

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    move-object v11, v2

    .line 163
    check-cast v11, Landroid/widget/ImageView;

    .line 164
    .line 165
    if-eqz v11, :cond_9

    .line 166
    .line 167
    const v1, 0x7f0a07a8

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
    check-cast v12, Landroid/widget/ImageView;

    .line 176
    .line 177
    if-eqz v12, :cond_9

    .line 178
    .line 179
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    move-object v13, v1

    .line 184
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 185
    .line 186
    if-eqz v13, :cond_8

    .line 187
    .line 188
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    move-object v14, v1

    .line 193
    check-cast v14, Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 194
    .line 195
    if-eqz v14, :cond_7

    .line 196
    .line 197
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    move-object v15, v1

    .line 202
    check-cast v15, Landroid/widget/TextView;

    .line 203
    .line 204
    if-eqz v15, :cond_a

    .line 205
    .line 206
    new-instance v9, La/d3k;

    .line 207
    .line 208
    move-object v10, v0

    .line 209
    check-cast v10, Landroid/widget/LinearLayout;

    .line 210
    .line 211
    invoke-direct/range {v9 .. v15}, La/d3k;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;Landroid/widget/TextView;)V

    .line 212
    .line 213
    .line 214
    move-object v8, v9

    .line 215
    goto :goto_4

    .line 216
    :cond_7
    move v3, v4

    .line 217
    goto :goto_3

    .line 218
    :cond_8
    move v3, v5

    .line 219
    goto :goto_3

    .line 220
    :cond_9
    move v3, v1

    .line 221
    :cond_a
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    :goto_4
    return-object v8

    .line 237
    :pswitch_5
    check-cast v0, Landroid/view/LayoutInflater;

    .line 238
    .line 239
    move-object/from16 v1, p2

    .line 240
    .line 241
    check-cast v1, Landroid/view/ViewGroup;

    .line 242
    .line 243
    const v2, 0x7f0d0128

    .line 244
    .line 245
    .line 246
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    const v1, 0x7f0a0217

    .line 251
    .line 252
    .line 253
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    move-object v11, v2

    .line 258
    check-cast v11, Landroid/widget/LinearLayout;

    .line 259
    .line 260
    if-eqz v11, :cond_b

    .line 261
    .line 262
    const v1, 0x7f0a0777

    .line 263
    .line 264
    .line 265
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    move-object v12, v2

    .line 270
    check-cast v12, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 271
    .line 272
    if-eqz v12, :cond_b

    .line 273
    .line 274
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    move-object v13, v1

    .line 279
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 280
    .line 281
    if-eqz v13, :cond_d

    .line 282
    .line 283
    const v1, 0x7f0a0c1b

    .line 284
    .line 285
    .line 286
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    move-object v14, v2

    .line 291
    check-cast v14, Landroid/widget/FrameLayout;

    .line 292
    .line 293
    if-eqz v14, :cond_b

    .line 294
    .line 295
    const v1, 0x7f0a0c1c

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    move-object v15, v2

    .line 303
    check-cast v15, Landroidx/constraintlayout/widget/Group;

    .line 304
    .line 305
    if-eqz v15, :cond_b

    .line 306
    .line 307
    const v1, 0x7f0a12f3

    .line 308
    .line 309
    .line 310
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    move-object/from16 v16, v2

    .line 315
    .line 316
    check-cast v16, Landroid/widget/TextView;

    .line 317
    .line 318
    if-eqz v16, :cond_b

    .line 319
    .line 320
    const v1, 0x7f0a12f7

    .line 321
    .line 322
    .line 323
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    move-object/from16 v17, v2

    .line 328
    .line 329
    check-cast v17, Landroid/widget/TextView;

    .line 330
    .line 331
    if-eqz v17, :cond_b

    .line 332
    .line 333
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    move-object/from16 v18, v1

    .line 338
    .line 339
    check-cast v18, Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 340
    .line 341
    if-eqz v18, :cond_c

    .line 342
    .line 343
    const v1, 0x7f0a1301

    .line 344
    .line 345
    .line 346
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    move-object/from16 v19, v2

    .line 351
    .line 352
    check-cast v19, Landroid/widget/TextView;

    .line 353
    .line 354
    if-eqz v19, :cond_b

    .line 355
    .line 356
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    move-object/from16 v20, v1

    .line 361
    .line 362
    check-cast v20, Landroid/widget/TextView;

    .line 363
    .line 364
    if-eqz v20, :cond_e

    .line 365
    .line 366
    const v3, 0x7f0a1409

    .line 367
    .line 368
    .line 369
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 370
    .line 371
    .line 372
    move-result-object v21

    .line 373
    if-eqz v21, :cond_e

    .line 374
    .line 375
    new-instance v9, La/c3k;

    .line 376
    .line 377
    move-object v10, v0

    .line 378
    check-cast v10, Landroid/widget/LinearLayout;

    .line 379
    .line 380
    invoke-direct/range {v9 .. v21}, La/c3k;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Landroidx/constraintlayout/widget/Group;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 381
    .line 382
    .line 383
    move-object v8, v9

    .line 384
    goto :goto_6

    .line 385
    :cond_b
    move v3, v1

    .line 386
    goto :goto_5

    .line 387
    :cond_c
    move v3, v4

    .line 388
    goto :goto_5

    .line 389
    :cond_d
    move v3, v5

    .line 390
    :cond_e
    :goto_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    :goto_6
    return-object v8

    .line 406
    :pswitch_6
    check-cast v0, Landroid/view/LayoutInflater;

    .line 407
    .line 408
    move-object/from16 v1, p2

    .line 409
    .line 410
    check-cast v1, Landroid/view/ViewGroup;

    .line 411
    .line 412
    const v3, 0x7f0d0340

    .line 413
    .line 414
    .line 415
    invoke-static {v0, v1, v3, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    if-eqz v0, :cond_f

    .line 420
    .line 421
    check-cast v0, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 422
    .line 423
    new-instance v8, La/ifx;

    .line 424
    .line 425
    invoke-direct {v8, v0, v0}, La/ifx;-><init>(Lorg/xplatform/uikit/components/text_field/DsTextField;Lorg/xplatform/uikit/components/text_field/DsTextField;)V

    .line 426
    .line 427
    .line 428
    goto :goto_7

    .line 429
    :cond_f
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    :goto_7
    return-object v8

    .line 433
    :pswitch_7
    check-cast v0, La/azg0;

    .line 434
    .line 435
    move-object/from16 v0, p2

    .line 436
    .line 437
    check-cast v0, La/d7q0;

    .line 438
    .line 439
    iget-object v1, v0, La/d7q0;->a:La/agk0;

    .line 440
    .line 441
    invoke-virtual {v1}, La/agk0;->l()F

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    iget-object v0, v0, La/d7q0;->f:La/pz40;

    .line 450
    .line 451
    check-cast v0, La/hgk0;

    .line 452
    .line 453
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    check-cast v0, La/ma80;

    .line 458
    .line 459
    sget-object v2, La/ma80;->a:La/ma80;

    .line 460
    .line 461
    if-ne v0, v2, :cond_10

    .line 462
    .line 463
    move v7, v9

    .line 464
    :cond_10
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    return-object v0

    .line 477
    :pswitch_8
    check-cast v0, La/oyg0;

    .line 478
    .line 479
    move-object/from16 v1, p2

    .line 480
    .line 481
    check-cast v1, La/s3q0;

    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    const/4 v8, 0x0

    .line 490
    const/16 v9, 0x79

    .line 491
    .line 492
    const/4 v2, 0x0

    .line 493
    const/4 v3, 0x0

    .line 494
    const/4 v4, 0x1

    .line 495
    const/4 v5, 0x0

    .line 496
    const/4 v6, 0x0

    .line 497
    const/4 v7, 0x0

    .line 498
    invoke-static/range {v1 .. v9}, La/s3q0;->a(La/s3q0;ZZZILjava/util/List;La/zdm0;La/nc5;I)La/s3q0;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    return-object v0

    .line 503
    :pswitch_9
    check-cast v0, La/fet;

    .line 504
    .line 505
    move-object/from16 v1, p2

    .line 506
    .line 507
    check-cast v1, Ljava/lang/Integer;

    .line 508
    .line 509
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-static {v9}, La/x8x;->L(I)I

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    invoke-static {v1, v0}, La/tke;->D(ILa/fet;)V

    .line 517
    .line 518
    .line 519
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 520
    .line 521
    return-object v0

    .line 522
    :pswitch_a
    check-cast v0, La/oyg0;

    .line 523
    .line 524
    move-object/from16 v1, p2

    .line 525
    .line 526
    check-cast v1, La/fzp0;

    .line 527
    .line 528
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    const/4 v7, 0x0

    .line 535
    const/16 v8, 0x7c

    .line 536
    .line 537
    const/4 v2, 0x0

    .line 538
    const/4 v3, 0x1

    .line 539
    const/4 v4, 0x0

    .line 540
    const/4 v5, 0x0

    .line 541
    const/4 v6, 0x0

    .line 542
    invoke-static/range {v1 .. v8}, La/fzp0;->a(La/fzp0;ZZZLa/uyp0;ZLorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;I)La/fzp0;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    return-object v0

    .line 547
    :pswitch_b
    check-cast v0, La/fet;

    .line 548
    .line 549
    move-object/from16 v1, p2

    .line 550
    .line 551
    check-cast v1, Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    invoke-static {v9}, La/x8x;->L(I)I

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    invoke-static {v1, v0}, La/osm0;->b(ILa/fet;)V

    .line 561
    .line 562
    .line 563
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 564
    .line 565
    return-object v0

    .line 566
    :pswitch_c
    check-cast v0, Ljava/lang/Throwable;

    .line 567
    .line 568
    move-object/from16 v0, p2

    .line 569
    .line 570
    check-cast v0, Ljava/lang/String;

    .line 571
    .line 572
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 573
    .line 574
    return-object v0

    .line 575
    :pswitch_d
    check-cast v0, La/fet;

    .line 576
    .line 577
    move-object/from16 v1, p2

    .line 578
    .line 579
    check-cast v1, Ljava/lang/Integer;

    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-static {v9}, La/x8x;->L(I)I

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    invoke-static {v1, v0}, La/q8a;->t(ILa/fet;)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0

    .line 594
    :pswitch_e
    check-cast v0, Ljava/lang/Throwable;

    .line 595
    .line 596
    move-object/from16 v1, p2

    .line 597
    .line 598
    check-cast v1, Ljava/lang/String;

    .line 599
    .line 600
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 601
    .line 602
    .line 603
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_f
    check-cast v0, Ljava/lang/Throwable;

    .line 607
    .line 608
    move-object/from16 v1, p2

    .line 609
    .line 610
    check-cast v1, Ljava/lang/String;

    .line 611
    .line 612
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 613
    .line 614
    .line 615
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 616
    .line 617
    return-object v0

    .line 618
    :pswitch_10
    check-cast v0, Landroid/view/LayoutInflater;

    .line 619
    .line 620
    move-object/from16 v1, p2

    .line 621
    .line 622
    check-cast v1, Landroid/view/ViewGroup;

    .line 623
    .line 624
    const v2, 0x7f0d0057

    .line 625
    .line 626
    .line 627
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    const v1, 0x7f0a09a7

    .line 632
    .line 633
    .line 634
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    check-cast v2, Landroid/widget/LinearLayout;

    .line 639
    .line 640
    if-eqz v2, :cond_11

    .line 641
    .line 642
    const v1, 0x7f0a0c85

    .line 643
    .line 644
    .line 645
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 650
    .line 651
    if-eqz v2, :cond_11

    .line 652
    .line 653
    const v1, 0x7f0a0c98

    .line 654
    .line 655
    .line 656
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 657
    .line 658
    .line 659
    move-result-object v3

    .line 660
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 661
    .line 662
    if-eqz v3, :cond_11

    .line 663
    .line 664
    new-instance v8, La/fs6;

    .line 665
    .line 666
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 667
    .line 668
    invoke-direct {v8, v0, v2, v3}, La/fs6;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 669
    .line 670
    .line 671
    goto :goto_8

    .line 672
    :cond_11
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    :goto_8
    return-object v8

    .line 688
    :pswitch_11
    check-cast v0, Landroid/view/LayoutInflater;

    .line 689
    .line 690
    move-object/from16 v1, p2

    .line 691
    .line 692
    check-cast v1, Landroid/view/ViewGroup;

    .line 693
    .line 694
    const v2, 0x7f0d0056

    .line 695
    .line 696
    .line 697
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    const v1, 0x7f0a06b9

    .line 702
    .line 703
    .line 704
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 709
    .line 710
    if-eqz v2, :cond_12

    .line 711
    .line 712
    const v1, 0x7f0a0837

    .line 713
    .line 714
    .line 715
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    check-cast v2, Landroid/widget/ImageView;

    .line 720
    .line 721
    if-eqz v2, :cond_12

    .line 722
    .line 723
    const v1, 0x7f0a0852

    .line 724
    .line 725
    .line 726
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 727
    .line 728
    .line 729
    move-result-object v3

    .line 730
    check-cast v3, Landroid/widget/ImageView;

    .line 731
    .line 732
    if-eqz v3, :cond_12

    .line 733
    .line 734
    const v1, 0x7f0a08b3

    .line 735
    .line 736
    .line 737
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    check-cast v3, Landroid/widget/ImageView;

    .line 742
    .line 743
    if-eqz v3, :cond_12

    .line 744
    .line 745
    const v1, 0x7f0a0fed

    .line 746
    .line 747
    .line 748
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    if-eqz v3, :cond_12

    .line 753
    .line 754
    const v1, 0x7f0a1126

    .line 755
    .line 756
    .line 757
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    check-cast v4, Landroid/widget/TextView;

    .line 762
    .line 763
    if-eqz v4, :cond_12

    .line 764
    .line 765
    const v1, 0x7f0a1212

    .line 766
    .line 767
    .line 768
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 769
    .line 770
    .line 771
    move-result-object v4

    .line 772
    check-cast v4, Landroid/widget/TextView;

    .line 773
    .line 774
    if-eqz v4, :cond_12

    .line 775
    .line 776
    new-instance v8, La/es6;

    .line 777
    .line 778
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 779
    .line 780
    invoke-direct {v8, v0, v2, v3}, La/es6;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/view/View;)V

    .line 781
    .line 782
    .line 783
    goto :goto_9

    .line 784
    :cond_12
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    :goto_9
    return-object v8

    .line 800
    :pswitch_12
    check-cast v0, Ljava/lang/Throwable;

    .line 801
    .line 802
    move-object/from16 v0, p2

    .line 803
    .line 804
    check-cast v0, Ljava/lang/String;

    .line 805
    .line 806
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 807
    .line 808
    return-object v0

    .line 809
    :pswitch_13
    check-cast v0, La/fet;

    .line 810
    .line 811
    move-object/from16 v1, p2

    .line 812
    .line 813
    check-cast v1, Ljava/lang/Integer;

    .line 814
    .line 815
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 816
    .line 817
    .line 818
    invoke-static {v9}, La/x8x;->L(I)I

    .line 819
    .line 820
    .line 821
    move-result v1

    .line 822
    invoke-static {v1, v0}, La/ofm0;->b(ILa/fet;)V

    .line 823
    .line 824
    .line 825
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 826
    .line 827
    return-object v0

    .line 828
    :pswitch_14
    check-cast v0, Landroid/view/LayoutInflater;

    .line 829
    .line 830
    move-object/from16 v1, p2

    .line 831
    .line 832
    check-cast v1, Landroid/view/ViewGroup;

    .line 833
    .line 834
    const v2, 0x7f0d0126

    .line 835
    .line 836
    .line 837
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    const v1, 0x7f0a027d

    .line 842
    .line 843
    .line 844
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    check-cast v2, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 849
    .line 850
    if-eqz v2, :cond_13

    .line 851
    .line 852
    const v1, 0x7f0a0283

    .line 853
    .line 854
    .line 855
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    check-cast v3, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 860
    .line 861
    if-eqz v3, :cond_13

    .line 862
    .line 863
    const v1, 0x7f0a0289

    .line 864
    .line 865
    .line 866
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    check-cast v4, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 871
    .line 872
    if-eqz v4, :cond_13

    .line 873
    .line 874
    new-instance v8, La/a3k;

    .line 875
    .line 876
    check-cast v0, Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;

    .line 877
    .line 878
    invoke-direct {v8, v0, v2, v3, v4}, La/a3k;-><init>(Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;)V

    .line 879
    .line 880
    .line 881
    goto :goto_a

    .line 882
    :cond_13
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    :goto_a
    return-object v8

    .line 898
    :pswitch_15
    check-cast v0, Ljava/lang/Throwable;

    .line 899
    .line 900
    move-object/from16 v0, p2

    .line 901
    .line 902
    check-cast v0, Ljava/lang/String;

    .line 903
    .line 904
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 905
    .line 906
    return-object v0

    .line 907
    :pswitch_16
    check-cast v0, La/fet;

    .line 908
    .line 909
    move-object/from16 v1, p2

    .line 910
    .line 911
    check-cast v1, Ljava/lang/Integer;

    .line 912
    .line 913
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    invoke-static {v9}, La/x8x;->L(I)I

    .line 917
    .line 918
    .line 919
    move-result v1

    .line 920
    invoke-static {v1, v0}, La/p8a;->x(ILa/fet;)V

    .line 921
    .line 922
    .line 923
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 924
    .line 925
    return-object v0

    .line 926
    :pswitch_17
    check-cast v0, Ljava/lang/Integer;

    .line 927
    .line 928
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 929
    .line 930
    .line 931
    move-result v0

    .line 932
    move-object/from16 v1, p2

    .line 933
    .line 934
    check-cast v1, La/zhs0;

    .line 935
    .line 936
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    const-class v1, La/zhs0;

    .line 940
    .line 941
    sget-object v2, La/sre0;->a:La/tre0;

    .line 942
    .line 943
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    new-instance v2, Ljava/lang/StringBuilder;

    .line 948
    .line 949
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    return-object v0

    .line 963
    :pswitch_18
    check-cast v0, Landroid/view/LayoutInflater;

    .line 964
    .line 965
    move-object/from16 v1, p2

    .line 966
    .line 967
    check-cast v1, Landroid/view/ViewGroup;

    .line 968
    .line 969
    const v3, 0x7f0d0171

    .line 970
    .line 971
    .line 972
    invoke-static {v0, v1, v3, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    if-eqz v0, :cond_14

    .line 977
    .line 978
    check-cast v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 979
    .line 980
    new-instance v8, La/eal;

    .line 981
    .line 982
    invoke-direct {v8, v0, v0}, La/eal;-><init>(Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;)V

    .line 983
    .line 984
    .line 985
    goto :goto_b

    .line 986
    :cond_14
    invoke-static {v2}, La/hny;->u(Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    :goto_b
    return-object v8

    .line 990
    :pswitch_19
    check-cast v0, Ljava/lang/Throwable;

    .line 991
    .line 992
    move-object/from16 v0, p2

    .line 993
    .line 994
    check-cast v0, Ljava/lang/String;

    .line 995
    .line 996
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 997
    .line 998
    return-object v0

    .line 999
    :pswitch_1a
    check-cast v0, La/fet;

    .line 1000
    .line 1001
    move-object/from16 v1, p2

    .line 1002
    .line 1003
    check-cast v1, Ljava/lang/Integer;

    .line 1004
    .line 1005
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1006
    .line 1007
    .line 1008
    invoke-static {v9}, La/x8x;->L(I)I

    .line 1009
    .line 1010
    .line 1011
    move-result v1

    .line 1012
    invoke-static {v1, v0}, La/ny9;->x(ILa/fet;)V

    .line 1013
    .line 1014
    .line 1015
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1016
    .line 1017
    return-object v0

    .line 1018
    :pswitch_1b
    check-cast v0, La/fet;

    .line 1019
    .line 1020
    move-object/from16 v1, p2

    .line 1021
    .line 1022
    check-cast v1, Ljava/lang/Integer;

    .line 1023
    .line 1024
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    invoke-static {v9}, La/x8x;->L(I)I

    .line 1028
    .line 1029
    .line 1030
    move-result v1

    .line 1031
    invoke-static {v1, v0}, La/u4n0;->g(ILa/fet;)V

    .line 1032
    .line 1033
    .line 1034
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1035
    .line 1036
    return-object v0

    .line 1037
    :pswitch_1c
    check-cast v0, La/fet;

    .line 1038
    .line 1039
    move-object/from16 v1, p2

    .line 1040
    .line 1041
    check-cast v1, Ljava/lang/Integer;

    .line 1042
    .line 1043
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1044
    .line 1045
    .line 1046
    invoke-static {v9}, La/x8x;->L(I)I

    .line 1047
    .line 1048
    .line 1049
    move-result v1

    .line 1050
    invoke-static {v1, v0}, La/uc9;->E(ILa/fet;)V

    .line 1051
    .line 1052
    .line 1053
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1054
    .line 1055
    return-object v0

    .line 1056
    nop

    .line 1057
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
