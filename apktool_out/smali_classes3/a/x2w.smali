.class public final synthetic La/x2w;
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
    iput-byte p1, p0, La/x2w;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    const/16 p1, 0x17

    iput-byte p1, p0, La/x2w;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/x2w;->a:B

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x3

    .line 7
    const-string v3, "Missing required view with ID: "

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v0, p1

    .line 15
    .line 16
    check-cast v0, Landroid/view/LayoutInflater;

    .line 17
    .line 18
    move-object/from16 v1, p2

    .line 19
    .line 20
    check-cast v1, Landroid/view/ViewGroup;

    .line 21
    .line 22
    const v2, 0x7f0d0109

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v2, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const v1, 0x7f0a0777

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    move-object v7, v2

    .line 37
    check-cast v7, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 38
    .line 39
    if-eqz v7, :cond_0

    .line 40
    .line 41
    const v1, 0x7f0a0783

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    move-object v8, v2

    .line 49
    check-cast v8, Landroid/widget/ImageView;

    .line 50
    .line 51
    if-eqz v8, :cond_0

    .line 52
    .line 53
    const v1, 0x7f0a079c

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v9, v2

    .line 61
    check-cast v9, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 62
    .line 63
    if-eqz v9, :cond_0

    .line 64
    .line 65
    const v1, 0x7f0a0a33

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    move-object v10, v2

    .line 73
    check-cast v10, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 74
    .line 75
    if-eqz v10, :cond_0

    .line 76
    .line 77
    const v1, 0x7f0a0a34

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    move-object v11, v2

    .line 85
    check-cast v11, Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 86
    .line 87
    if-eqz v11, :cond_0

    .line 88
    .line 89
    const v1, 0x7f0a0b99

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object v12, v2

    .line 97
    check-cast v12, Landroid/widget/ImageView;

    .line 98
    .line 99
    if-eqz v12, :cond_0

    .line 100
    .line 101
    const v1, 0x7f0a12f3

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v13, v2

    .line 109
    check-cast v13, Landroid/widget/TextView;

    .line 110
    .line 111
    if-eqz v13, :cond_0

    .line 112
    .line 113
    const v1, 0x7f0a12f7

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    move-object v14, v2

    .line 121
    check-cast v14, Landroid/widget/TextView;

    .line 122
    .line 123
    if-eqz v14, :cond_0

    .line 124
    .line 125
    const v1, 0x7f0a1302

    .line 126
    .line 127
    .line 128
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    move-object v15, v2

    .line 133
    check-cast v15, Landroid/widget/TextView;

    .line 134
    .line 135
    if-eqz v15, :cond_0

    .line 136
    .line 137
    new-instance v5, La/b2k;

    .line 138
    .line 139
    move-object v6, v0

    .line 140
    check-cast v6, Landroid/widget/LinearLayout;

    .line 141
    .line 142
    invoke-direct/range {v5 .. v15}, La/b2k;-><init>(Landroid/widget/LinearLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/ImageView;Lcom/google/android/material/imageview/ShapeableImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 143
    .line 144
    .line 145
    move-object v4, v5

    .line 146
    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :goto_0
    return-object v4

    .line 163
    :pswitch_0
    move-object/from16 v0, p1

    .line 164
    .line 165
    check-cast v0, Ljava/lang/Long;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-object/from16 v0, p2

    .line 171
    .line 172
    check-cast v0, Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_1
    move-object/from16 v0, p1

    .line 181
    .line 182
    check-cast v0, Ljava/lang/Long;

    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-object/from16 v0, p2

    .line 188
    .line 189
    check-cast v0, Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object v0

    .line 197
    :pswitch_2
    move-object/from16 v0, p1

    .line 198
    .line 199
    check-cast v0, Landroid/view/LayoutInflater;

    .line 200
    .line 201
    move-object/from16 v1, p2

    .line 202
    .line 203
    check-cast v1, Landroid/view/ViewGroup;

    .line 204
    .line 205
    const v2, 0x7f0d036f

    .line 206
    .line 207
    .line 208
    invoke-static {v0, v1, v2, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    const v1, 0x7f0a01ca

    .line 213
    .line 214
    .line 215
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    move-object v7, v2

    .line 220
    check-cast v7, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;

    .line 221
    .line 222
    if-eqz v7, :cond_1

    .line 223
    .line 224
    const v1, 0x7f0a038b

    .line 225
    .line 226
    .line 227
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    move-object v8, v2

    .line 232
    check-cast v8, Landroid/widget/LinearLayout;

    .line 233
    .line 234
    if-eqz v8, :cond_1

    .line 235
    .line 236
    const v1, 0x7f0a0c89

    .line 237
    .line 238
    .line 239
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    move-object v9, v2

    .line 244
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 245
    .line 246
    if-eqz v9, :cond_1

    .line 247
    .line 248
    const v1, 0x7f0a1150

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    move-object v10, v2

    .line 256
    check-cast v10, Landroid/widget/TextView;

    .line 257
    .line 258
    if-eqz v10, :cond_1

    .line 259
    .line 260
    const v1, 0x7f0a1157

    .line 261
    .line 262
    .line 263
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    move-object v11, v2

    .line 268
    check-cast v11, Landroid/widget/TextView;

    .line 269
    .line 270
    if-eqz v11, :cond_1

    .line 271
    .line 272
    new-instance v5, La/rsx;

    .line 273
    .line 274
    move-object v6, v0

    .line 275
    check-cast v6, Landroid/widget/LinearLayout;

    .line 276
    .line 277
    invoke-direct/range {v5 .. v11}, La/rsx;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/ExpandBtnView;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 278
    .line 279
    .line 280
    move-object v4, v5

    .line 281
    goto :goto_1

    .line 282
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :goto_1
    return-object v4

    .line 298
    :pswitch_3
    move-object/from16 v0, p1

    .line 299
    .line 300
    check-cast v0, Landroid/view/LayoutInflater;

    .line 301
    .line 302
    move-object/from16 v1, p2

    .line 303
    .line 304
    check-cast v1, Landroid/view/ViewGroup;

    .line 305
    .line 306
    const v2, 0x7f0d03cf

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v1, v2, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    const v1, 0x7f0a087f

    .line 314
    .line 315
    .line 316
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    move-object v7, v2

    .line 321
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 322
    .line 323
    if-eqz v7, :cond_2

    .line 324
    .line 325
    const v1, 0x7f0a08eb

    .line 326
    .line 327
    .line 328
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    move-object v8, v2

    .line 333
    check-cast v8, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 334
    .line 335
    if-eqz v8, :cond_2

    .line 336
    .line 337
    const v1, 0x7f0a115f

    .line 338
    .line 339
    .line 340
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    move-object v9, v2

    .line 345
    check-cast v9, Landroid/widget/TextView;

    .line 346
    .line 347
    if-eqz v9, :cond_2

    .line 348
    .line 349
    const v1, 0x7f0a1195

    .line 350
    .line 351
    .line 352
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    move-object v10, v2

    .line 357
    check-cast v10, Landroid/widget/TextView;

    .line 358
    .line 359
    if-eqz v10, :cond_2

    .line 360
    .line 361
    const v1, 0x7f0a1276

    .line 362
    .line 363
    .line 364
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    move-object v11, v2

    .line 369
    check-cast v11, Landroid/widget/TextView;

    .line 370
    .line 371
    if-eqz v11, :cond_2

    .line 372
    .line 373
    new-instance v5, La/nvx;

    .line 374
    .line 375
    move-object v6, v0

    .line 376
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 377
    .line 378
    invoke-direct/range {v5 .. v11}, La/nvx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 379
    .line 380
    .line 381
    move-object v4, v5

    .line 382
    goto :goto_2

    .line 383
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    :goto_2
    return-object v4

    .line 399
    :pswitch_4
    move-object/from16 v0, p1

    .line 400
    .line 401
    check-cast v0, La/oyg0;

    .line 402
    .line 403
    move-object/from16 v2, p2

    .line 404
    .line 405
    check-cast v2, La/crw;

    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    iget-boolean v0, v2, La/crw;->e:Z

    .line 414
    .line 415
    xor-int/lit8 v7, v0, 0x1

    .line 416
    .line 417
    iget-object v0, v2, La/crw;->d:Ljava/util/List;

    .line 418
    .line 419
    new-instance v6, Ljava/util/ArrayList;

    .line 420
    .line 421
    const/16 v1, 0xa

    .line 422
    .line 423
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 428
    .line 429
    .line 430
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    if-eqz v1, :cond_3

    .line 439
    .line 440
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    check-cast v1, La/epw;

    .line 445
    .line 446
    invoke-static {v1, v7}, La/epw;->a(La/epw;Z)La/epw;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    goto :goto_3

    .line 454
    :cond_3
    const/4 v5, 0x0

    .line 455
    const/4 v8, 0x7

    .line 456
    const/4 v3, 0x0

    .line 457
    const/4 v4, 0x0

    .line 458
    invoke-static/range {v2 .. v8}, La/crw;->a(La/crw;ZZZLjava/util/ArrayList;ZI)La/crw;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    return-object v0

    .line 463
    :pswitch_5
    move-object/from16 v0, p1

    .line 464
    .line 465
    check-cast v0, La/fet;

    .line 466
    .line 467
    move-object/from16 v2, p2

    .line 468
    .line 469
    check-cast v2, Ljava/lang/Integer;

    .line 470
    .line 471
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-static {v1}, La/x8x;->L(I)I

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    invoke-static {v1, v0}, La/mbc;->K(ILa/fet;)V

    .line 479
    .line 480
    .line 481
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_6
    move-object/from16 v0, p1

    .line 485
    .line 486
    check-cast v0, Ljava/lang/Throwable;

    .line 487
    .line 488
    move-object/from16 v1, p2

    .line 489
    .line 490
    check-cast v1, Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_7
    move-object/from16 v0, p1

    .line 502
    .line 503
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 504
    .line 505
    move-object/from16 v1, p2

    .line 506
    .line 507
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 508
    .line 509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    new-instance v3, La/h7w;

    .line 516
    .line 517
    const/4 v4, 0x7

    .line 518
    invoke-direct {v3, v4}, La/h7w;-><init>(B)V

    .line 519
    .line 520
    .line 521
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    new-instance v0, La/kdw;

    .line 525
    .line 526
    invoke-direct {v0, v2}, La/kdw;-><init>(B)V

    .line 527
    .line 528
    .line 529
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 533
    .line 534
    return-object v0

    .line 535
    :pswitch_8
    move-object/from16 v0, p1

    .line 536
    .line 537
    check-cast v0, Ljava/lang/Throwable;

    .line 538
    .line 539
    move-object/from16 v1, p2

    .line 540
    .line 541
    check-cast v1, Ljava/lang/String;

    .line 542
    .line 543
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 544
    .line 545
    .line 546
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object v0

    .line 549
    :pswitch_9
    move-object/from16 v0, p1

    .line 550
    .line 551
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 552
    .line 553
    move-object/from16 v1, p2

    .line 554
    .line 555
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 556
    .line 557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    new-instance v2, La/h7w;

    .line 564
    .line 565
    const/16 v3, 0x9

    .line 566
    .line 567
    invoke-direct {v2, v3}, La/h7w;-><init>(B)V

    .line 568
    .line 569
    .line 570
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    new-instance v0, La/kdw;

    .line 574
    .line 575
    const/4 v2, 0x4

    .line 576
    invoke-direct {v0, v2}, La/kdw;-><init>(B)V

    .line 577
    .line 578
    .line 579
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_a
    move-object/from16 v0, p1

    .line 586
    .line 587
    check-cast v0, Ljava/lang/Throwable;

    .line 588
    .line 589
    move-object/from16 v1, p2

    .line 590
    .line 591
    check-cast v1, Ljava/lang/String;

    .line 592
    .line 593
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 600
    .line 601
    return-object v0

    .line 602
    :pswitch_b
    move-object/from16 v0, p1

    .line 603
    .line 604
    check-cast v0, Ljava/lang/Throwable;

    .line 605
    .line 606
    move-object/from16 v1, p2

    .line 607
    .line 608
    check-cast v1, Ljava/lang/String;

    .line 609
    .line 610
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 617
    .line 618
    return-object v0

    .line 619
    :pswitch_c
    move-object/from16 v0, p1

    .line 620
    .line 621
    check-cast v0, Ljava/lang/Integer;

    .line 622
    .line 623
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    move-object/from16 v1, p2

    .line 628
    .line 629
    check-cast v1, La/xjw;

    .line 630
    .line 631
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    iget v1, v1, La/xjw;->a:I

    .line 635
    .line 636
    new-instance v2, Ljava/lang/StringBuilder;

    .line 637
    .line 638
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    return-object v0

    .line 652
    :pswitch_d
    move-object/from16 v0, p1

    .line 653
    .line 654
    check-cast v0, La/fet;

    .line 655
    .line 656
    move-object/from16 v1, p2

    .line 657
    .line 658
    check-cast v1, Ljava/lang/Integer;

    .line 659
    .line 660
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    const v1, 0x438ab730

    .line 664
    .line 665
    .line 666
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 667
    .line 668
    .line 669
    new-instance v1, La/uwq;

    .line 670
    .line 671
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 672
    .line 673
    .line 674
    invoke-static {v1, v0}, La/ddz;->b(La/uwq;La/fet;)La/xcz;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 679
    .line 680
    .line 681
    return-object v1

    .line 682
    :pswitch_e
    move-object/from16 v0, p1

    .line 683
    .line 684
    check-cast v0, La/fet;

    .line 685
    .line 686
    move-object/from16 v1, p2

    .line 687
    .line 688
    check-cast v1, Ljava/lang/Integer;

    .line 689
    .line 690
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 691
    .line 692
    .line 693
    const v1, 0x692d546a

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 697
    .line 698
    .line 699
    invoke-static {v5, v5, v0, v5, v2}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 704
    .line 705
    .line 706
    return-object v1

    .line 707
    :pswitch_f
    move-object/from16 v0, p1

    .line 708
    .line 709
    check-cast v0, La/fet;

    .line 710
    .line 711
    move-object/from16 v1, p2

    .line 712
    .line 713
    check-cast v1, Ljava/lang/Integer;

    .line 714
    .line 715
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 716
    .line 717
    .line 718
    const v1, -0x3100b0a9

    .line 719
    .line 720
    .line 721
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 722
    .line 723
    .line 724
    invoke-static {v5, v5, v0, v5, v2}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 729
    .line 730
    .line 731
    return-object v1

    .line 732
    :pswitch_10
    move-object/from16 v0, p1

    .line 733
    .line 734
    check-cast v0, La/fet;

    .line 735
    .line 736
    move-object/from16 v1, p2

    .line 737
    .line 738
    check-cast v1, Ljava/lang/Integer;

    .line 739
    .line 740
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 741
    .line 742
    .line 743
    const v1, 0x754f032a

    .line 744
    .line 745
    .line 746
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 747
    .line 748
    .line 749
    invoke-static {v5, v5, v0, v5, v2}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 750
    .line 751
    .line 752
    move-result-object v1

    .line 753
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 754
    .line 755
    .line 756
    return-object v1

    .line 757
    :pswitch_11
    move-object/from16 v0, p1

    .line 758
    .line 759
    check-cast v0, Ljava/lang/Throwable;

    .line 760
    .line 761
    move-object/from16 v1, p2

    .line 762
    .line 763
    check-cast v1, Ljava/lang/String;

    .line 764
    .line 765
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 766
    .line 767
    .line 768
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 769
    .line 770
    return-object v0

    .line 771
    :pswitch_12
    move-object/from16 v0, p1

    .line 772
    .line 773
    check-cast v0, Ljava/lang/Integer;

    .line 774
    .line 775
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 776
    .line 777
    .line 778
    move-result v0

    .line 779
    move-object/from16 v1, p2

    .line 780
    .line 781
    check-cast v1, La/hdw;

    .line 782
    .line 783
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    iget-object v1, v1, La/hdw;->a:Ljava/lang/String;

    .line 787
    .line 788
    invoke-static {v0, v1}, La/rz4;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    return-object v0

    .line 793
    :pswitch_13
    move-object/from16 v0, p1

    .line 794
    .line 795
    check-cast v0, Ljava/lang/Throwable;

    .line 796
    .line 797
    move-object/from16 v0, p2

    .line 798
    .line 799
    check-cast v0, Ljava/lang/String;

    .line 800
    .line 801
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 802
    .line 803
    return-object v0

    .line 804
    :pswitch_14
    move-object/from16 v0, p1

    .line 805
    .line 806
    check-cast v0, Ljava/lang/Throwable;

    .line 807
    .line 808
    move-object/from16 v0, p2

    .line 809
    .line 810
    check-cast v0, Ljava/lang/String;

    .line 811
    .line 812
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 813
    .line 814
    return-object v0

    .line 815
    :pswitch_15
    move-object/from16 v0, p1

    .line 816
    .line 817
    check-cast v0, Ljava/lang/Throwable;

    .line 818
    .line 819
    move-object/from16 v0, p2

    .line 820
    .line 821
    check-cast v0, Ljava/lang/String;

    .line 822
    .line 823
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 824
    .line 825
    return-object v0

    .line 826
    :pswitch_16
    move-object/from16 v0, p1

    .line 827
    .line 828
    check-cast v0, Ljava/lang/Throwable;

    .line 829
    .line 830
    move-object/from16 v1, p2

    .line 831
    .line 832
    check-cast v1, Ljava/lang/String;

    .line 833
    .line 834
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 841
    .line 842
    return-object v0

    .line 843
    :pswitch_17
    move-object/from16 v0, p1

    .line 844
    .line 845
    check-cast v0, Landroid/view/LayoutInflater;

    .line 846
    .line 847
    move-object/from16 v1, p2

    .line 848
    .line 849
    check-cast v1, Landroid/view/ViewGroup;

    .line 850
    .line 851
    const v2, 0x7f0d0331

    .line 852
    .line 853
    .line 854
    invoke-static {v0, v1, v2, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    const v1, 0x7f0a02e1

    .line 859
    .line 860
    .line 861
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    check-cast v2, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;

    .line 866
    .line 867
    if-eqz v2, :cond_4

    .line 868
    .line 869
    const v1, 0x7f0a02e2

    .line 870
    .line 871
    .line 872
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 873
    .line 874
    .line 875
    move-result-object v5

    .line 876
    check-cast v5, Landroid/widget/TextView;

    .line 877
    .line 878
    if-eqz v5, :cond_4

    .line 879
    .line 880
    const v1, 0x7f0a045c

    .line 881
    .line 882
    .line 883
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 884
    .line 885
    .line 886
    move-result-object v6

    .line 887
    if-eqz v6, :cond_4

    .line 888
    .line 889
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 890
    .line 891
    new-instance v4, La/j1w;

    .line 892
    .line 893
    invoke-direct {v4, v0, v2, v5, v6}, La/j1w;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;Landroid/widget/TextView;Landroid/view/View;)V

    .line 894
    .line 895
    .line 896
    goto :goto_4

    .line 897
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    :goto_4
    return-object v4

    .line 913
    :pswitch_18
    move-object/from16 v0, p1

    .line 914
    .line 915
    check-cast v0, Landroid/view/LayoutInflater;

    .line 916
    .line 917
    move-object/from16 v1, p2

    .line 918
    .line 919
    check-cast v1, Landroid/view/ViewGroup;

    .line 920
    .line 921
    const v2, 0x7f0d03cd

    .line 922
    .line 923
    .line 924
    invoke-static {v0, v1, v2, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    move-object v1, v0

    .line 929
    check-cast v1, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 930
    .line 931
    const v2, 0x7f0a0730

    .line 932
    .line 933
    .line 934
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 935
    .line 936
    .line 937
    move-result-object v5

    .line 938
    check-cast v5, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 939
    .line 940
    if-eqz v5, :cond_5

    .line 941
    .line 942
    const v2, 0x7f0a0fce

    .line 943
    .line 944
    .line 945
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 946
    .line 947
    .line 948
    move-result-object v6

    .line 949
    check-cast v6, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 950
    .line 951
    if-eqz v6, :cond_5

    .line 952
    .line 953
    new-instance v4, La/mvx;

    .line 954
    .line 955
    invoke-direct {v4, v1, v5, v6}, La/mvx;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 956
    .line 957
    .line 958
    goto :goto_5

    .line 959
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    :goto_5
    return-object v4

    .line 975
    :pswitch_19
    move-object/from16 v0, p1

    .line 976
    .line 977
    check-cast v0, Landroid/view/LayoutInflater;

    .line 978
    .line 979
    move-object/from16 v1, p2

    .line 980
    .line 981
    check-cast v1, Landroid/view/ViewGroup;

    .line 982
    .line 983
    const v2, 0x7f0d01c7

    .line 984
    .line 985
    .line 986
    invoke-static {v0, v1, v2, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    if-eqz v0, :cond_6

    .line 991
    .line 992
    check-cast v0, Landroid/view/ViewStub;

    .line 993
    .line 994
    new-instance v4, La/mzq;

    .line 995
    .line 996
    const/4 v1, 0x2

    .line 997
    invoke-direct {v4, v0, v1}, La/mzq;-><init>(Landroid/view/View;B)V

    .line 998
    .line 999
    .line 1000
    goto :goto_6

    .line 1001
    :cond_6
    const-string v0, "rootView"

    .line 1002
    .line 1003
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    :goto_6
    return-object v4

    .line 1007
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1008
    .line 1009
    check-cast v0, Ljava/lang/Throwable;

    .line 1010
    .line 1011
    move-object/from16 v1, p2

    .line 1012
    .line 1013
    check-cast v1, Ljava/lang/String;

    .line 1014
    .line 1015
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1016
    .line 1017
    .line 1018
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1019
    .line 1020
    return-object v0

    .line 1021
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1022
    .line 1023
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1024
    .line 1025
    move-object/from16 v1, p2

    .line 1026
    .line 1027
    check-cast v1, Landroid/view/ViewGroup;

    .line 1028
    .line 1029
    const v2, 0x7f0d04c6

    .line 1030
    .line 1031
    .line 1032
    invoke-static {v0, v1, v2, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    move-object v1, v0

    .line 1037
    check-cast v1, Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 1038
    .line 1039
    const v2, 0x7f0a07f2

    .line 1040
    .line 1041
    .line 1042
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v5

    .line 1046
    check-cast v5, Landroid/widget/ImageView;

    .line 1047
    .line 1048
    if-eqz v5, :cond_7

    .line 1049
    .line 1050
    const v2, 0x7f0a07f4

    .line 1051
    .line 1052
    .line 1053
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v6

    .line 1057
    check-cast v6, Landroid/widget/TextView;

    .line 1058
    .line 1059
    if-eqz v6, :cond_7

    .line 1060
    .line 1061
    new-instance v4, La/fz30;

    .line 1062
    .line 1063
    invoke-direct {v4, v1, v5, v6}, La/fz30;-><init>(Landroidx/appcompat/widget/LinearLayoutCompat;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_7

    .line 1067
    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1080
    .line 1081
    .line 1082
    :goto_7
    return-object v4

    .line 1083
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1084
    .line 1085
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1086
    .line 1087
    move-object/from16 v1, p2

    .line 1088
    .line 1089
    check-cast v1, Landroid/view/ViewGroup;

    .line 1090
    .line 1091
    const v2, 0x7f0d0333

    .line 1092
    .line 1093
    .line 1094
    invoke-static {v0, v1, v2, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v0

    .line 1098
    const v1, 0x7f0a107e

    .line 1099
    .line 1100
    .line 1101
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v2

    .line 1105
    check-cast v2, Landroid/widget/TextView;

    .line 1106
    .line 1107
    if-eqz v2, :cond_8

    .line 1108
    .line 1109
    const v1, 0x7f0a107f

    .line 1110
    .line 1111
    .line 1112
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v5

    .line 1116
    check-cast v5, Landroid/widget/TextView;

    .line 1117
    .line 1118
    if-eqz v5, :cond_8

    .line 1119
    .line 1120
    const v1, 0x7f0a11a7

    .line 1121
    .line 1122
    .line 1123
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v6

    .line 1127
    check-cast v6, Landroid/widget/TextView;

    .line 1128
    .line 1129
    if-eqz v6, :cond_8

    .line 1130
    .line 1131
    new-instance v4, La/s2w;

    .line 1132
    .line 1133
    check-cast v0, Lcom/google/android/material/card/MaterialCardView;

    .line 1134
    .line 1135
    invoke-direct {v4, v0, v2, v5}, La/s2w;-><init>(Lcom/google/android/material/card/MaterialCardView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1136
    .line 1137
    .line 1138
    goto :goto_8

    .line 1139
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1152
    .line 1153
    .line 1154
    :goto_8
    return-object v4

    .line 1155
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
