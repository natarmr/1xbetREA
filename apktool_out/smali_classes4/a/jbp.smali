.class public final synthetic La/jbp;
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
    iput-byte p1, p0, La/jbp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/jbp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/jbp;->a:B

    .line 4
    .line 5
    const/16 v1, 0x11

    .line 6
    .line 7
    const v2, 0x7f0a1302

    .line 8
    .line 9
    .line 10
    const v3, 0x7f0a12ff

    .line 11
    .line 12
    .line 13
    const v4, 0x7f0a0a33

    .line 14
    .line 15
    .line 16
    const v5, 0x7f0a0783

    .line 17
    .line 18
    .line 19
    const v6, 0x7f0a0389

    .line 20
    .line 21
    .line 22
    const v7, 0x7f0a08d4

    .line 23
    .line 24
    .line 25
    const v8, 0x7f0a08cd

    .line 26
    .line 27
    .line 28
    const-string v9, "Missing required view with ID: "

    .line 29
    .line 30
    const/4 v10, 0x1

    .line 31
    const/4 v11, 0x0

    .line 32
    const/4 v12, 0x0

    .line 33
    packed-switch v0, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    move-object/from16 v0, p1

    .line 37
    .line 38
    check-cast v0, Landroid/view/LayoutInflater;

    .line 39
    .line 40
    move-object/from16 v1, p2

    .line 41
    .line 42
    check-cast v1, Landroid/view/ViewGroup;

    .line 43
    .line 44
    const v2, 0x7f0d0636

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1, v2, v1, v12}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const v1, 0x7f0a0370

    .line 52
    .line 53
    .line 54
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    const v1, 0x7f0a1130

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Landroid/widget/TextView;

    .line 68
    .line 69
    if-eqz v3, :cond_0

    .line 70
    .line 71
    new-instance v11, La/ucu0;

    .line 72
    .line 73
    check-cast v0, Landroid/widget/LinearLayout;

    .line 74
    .line 75
    invoke-direct {v11, v0, v2, v3}, La/ucu0;-><init>(Landroid/widget/LinearLayout;Landroid/view/View;Landroid/widget/TextView;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    return-object v11

    .line 95
    :pswitch_0
    move-object/from16 v0, p1

    .line 96
    .line 97
    check-cast v0, Landroid/view/LayoutInflater;

    .line 98
    .line 99
    move-object/from16 v1, p2

    .line 100
    .line 101
    check-cast v1, Landroid/view/ViewGroup;

    .line 102
    .line 103
    const v2, 0x7f0d0637

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1, v2, v1, v12}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_1

    .line 111
    .line 112
    new-instance v11, La/vcu0;

    .line 113
    .line 114
    check-cast v0, Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 115
    .line 116
    invoke-direct {v11, v0}, La/vcu0;-><init>(Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    const-string v0, "rootView"

    .line 121
    .line 122
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_1
    return-object v11

    .line 126
    :pswitch_1
    move-object/from16 v0, p1

    .line 127
    .line 128
    check-cast v0, Landroid/view/LayoutInflater;

    .line 129
    .line 130
    move-object/from16 v1, p2

    .line 131
    .line 132
    check-cast v1, Landroid/view/ViewGroup;

    .line 133
    .line 134
    const v2, 0x7f0d03b1

    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1, v2, v1, v12}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const v1, 0x7f0a0600

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Landroid/widget/ImageView;

    .line 149
    .line 150
    if-eqz v2, :cond_2

    .line 151
    .line 152
    const v1, 0x7f0a0853

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    move-object v14, v2

    .line 160
    check-cast v14, Landroid/widget/ImageView;

    .line 161
    .line 162
    if-eqz v14, :cond_2

    .line 163
    .line 164
    const v1, 0x7f0a08b4

    .line 165
    .line 166
    .line 167
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    move-object v15, v2

    .line 172
    check-cast v15, Landroid/widget/ImageView;

    .line 173
    .line 174
    if-eqz v15, :cond_2

    .line 175
    .line 176
    invoke-static {v0, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    move-object/from16 v16, v1

    .line 181
    .line 182
    check-cast v16, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 183
    .line 184
    if-eqz v16, :cond_3

    .line 185
    .line 186
    const v1, 0x7f0a08ce

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Landroid/widget/FrameLayout;

    .line 194
    .line 195
    if-eqz v2, :cond_2

    .line 196
    .line 197
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    move-object/from16 v17, v1

    .line 202
    .line 203
    check-cast v17, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 204
    .line 205
    if-eqz v17, :cond_4

    .line 206
    .line 207
    const v7, 0x7f0a08d5

    .line 208
    .line 209
    .line 210
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Landroid/widget/FrameLayout;

    .line 215
    .line 216
    if-eqz v1, :cond_4

    .line 217
    .line 218
    const v7, 0x7f0a1043

    .line 219
    .line 220
    .line 221
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    check-cast v1, Landroid/widget/TextView;

    .line 226
    .line 227
    if-eqz v1, :cond_4

    .line 228
    .line 229
    const v7, 0x7f0a1091

    .line 230
    .line 231
    .line 232
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    move-object/from16 v18, v1

    .line 237
    .line 238
    check-cast v18, Landroid/widget/TextView;

    .line 239
    .line 240
    if-eqz v18, :cond_4

    .line 241
    .line 242
    const v7, 0x7f0a1121

    .line 243
    .line 244
    .line 245
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    move-object/from16 v19, v1

    .line 250
    .line 251
    check-cast v19, Landroidx/appcompat/widget/AppCompatTextView;

    .line 252
    .line 253
    if-eqz v19, :cond_4

    .line 254
    .line 255
    const v7, 0x7f0a1166

    .line 256
    .line 257
    .line 258
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    move-object/from16 v20, v1

    .line 263
    .line 264
    check-cast v20, Landroid/widget/TextView;

    .line 265
    .line 266
    if-eqz v20, :cond_4

    .line 267
    .line 268
    const v7, 0x7f0a1176

    .line 269
    .line 270
    .line 271
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    move-object/from16 v21, v1

    .line 276
    .line 277
    check-cast v21, Landroidx/appcompat/widget/AppCompatTextView;

    .line 278
    .line 279
    if-eqz v21, :cond_4

    .line 280
    .line 281
    const v7, 0x7f0a11e6

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    move-object/from16 v22, v1

    .line 289
    .line 290
    check-cast v22, Landroid/widget/TextView;

    .line 291
    .line 292
    if-eqz v22, :cond_4

    .line 293
    .line 294
    const v7, 0x7f0a11ef

    .line 295
    .line 296
    .line 297
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    move-object/from16 v23, v1

    .line 302
    .line 303
    check-cast v23, Landroid/widget/TextView;

    .line 304
    .line 305
    if-eqz v23, :cond_4

    .line 306
    .line 307
    const v7, 0x7f0a120d

    .line 308
    .line 309
    .line 310
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    move-object/from16 v24, v1

    .line 315
    .line 316
    check-cast v24, Landroidx/appcompat/widget/AppCompatTextView;

    .line 317
    .line 318
    if-eqz v24, :cond_4

    .line 319
    .line 320
    new-instance v12, La/nux;

    .line 321
    .line 322
    move-object v13, v0

    .line 323
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 324
    .line 325
    invoke-direct/range {v12 .. v24}, La/nux;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 326
    .line 327
    .line 328
    move-object v11, v12

    .line 329
    goto :goto_3

    .line 330
    :cond_2
    move v7, v1

    .line 331
    goto :goto_2

    .line 332
    :cond_3
    move v7, v8

    .line 333
    :cond_4
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    :goto_3
    return-object v11

    .line 349
    :pswitch_2
    move-object/from16 v0, p1

    .line 350
    .line 351
    check-cast v0, Landroid/view/LayoutInflater;

    .line 352
    .line 353
    move-object/from16 v1, p2

    .line 354
    .line 355
    check-cast v1, Landroid/view/ViewGroup;

    .line 356
    .line 357
    const v2, 0x7f0d036e

    .line 358
    .line 359
    .line 360
    invoke-static {v0, v1, v2, v1, v12}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    const v1, 0x7f0a00f0

    .line 365
    .line 366
    .line 367
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    check-cast v2, Landroidx/constraintlayout/widget/Barrier;

    .line 372
    .line 373
    if-eqz v2, :cond_6

    .line 374
    .line 375
    const v1, 0x7f0a00f1

    .line 376
    .line 377
    .line 378
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    check-cast v2, Landroidx/constraintlayout/widget/Barrier;

    .line 383
    .line 384
    if-eqz v2, :cond_6

    .line 385
    .line 386
    invoke-static {v0, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    move-object v14, v1

    .line 391
    check-cast v14, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 392
    .line 393
    if-eqz v14, :cond_5

    .line 394
    .line 395
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    move-object v15, v1

    .line 400
    check-cast v15, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 401
    .line 402
    if-eqz v15, :cond_7

    .line 403
    .line 404
    const v7, 0x7f0a0c92

    .line 405
    .line 406
    .line 407
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    move-object/from16 v16, v1

    .line 412
    .line 413
    check-cast v16, Landroidx/recyclerview/widget/RecyclerView;

    .line 414
    .line 415
    if-eqz v16, :cond_7

    .line 416
    .line 417
    const v7, 0x7f0a11aa

    .line 418
    .line 419
    .line 420
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    check-cast v1, Landroid/widget/TextView;

    .line 425
    .line 426
    if-eqz v1, :cond_7

    .line 427
    .line 428
    const v7, 0x7f0a123e

    .line 429
    .line 430
    .line 431
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    move-object/from16 v17, v1

    .line 436
    .line 437
    check-cast v17, Landroid/widget/TextView;

    .line 438
    .line 439
    if-eqz v17, :cond_7

    .line 440
    .line 441
    const v7, 0x7f0a1241

    .line 442
    .line 443
    .line 444
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    move-object/from16 v18, v1

    .line 449
    .line 450
    check-cast v18, Landroid/widget/TextView;

    .line 451
    .line 452
    if-eqz v18, :cond_7

    .line 453
    .line 454
    const v7, 0x7f0a1244

    .line 455
    .line 456
    .line 457
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    move-object/from16 v19, v1

    .line 462
    .line 463
    check-cast v19, Landroid/widget/TextView;

    .line 464
    .line 465
    if-eqz v19, :cond_7

    .line 466
    .line 467
    const v7, 0x7f0a1247

    .line 468
    .line 469
    .line 470
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    move-object/from16 v20, v1

    .line 475
    .line 476
    check-cast v20, Landroid/widget/TextView;

    .line 477
    .line 478
    if-eqz v20, :cond_7

    .line 479
    .line 480
    const v7, 0x7f0a126c

    .line 481
    .line 482
    .line 483
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    check-cast v1, Landroid/widget/TextView;

    .line 488
    .line 489
    if-eqz v1, :cond_7

    .line 490
    .line 491
    const v7, 0x7f0a1386

    .line 492
    .line 493
    .line 494
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 495
    .line 496
    .line 497
    move-result-object v21

    .line 498
    if-eqz v21, :cond_7

    .line 499
    .line 500
    const v7, 0x7f0a13ad

    .line 501
    .line 502
    .line 503
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    move-object/from16 v22, v1

    .line 508
    .line 509
    check-cast v22, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;

    .line 510
    .line 511
    if-eqz v22, :cond_7

    .line 512
    .line 513
    const v7, 0x7f0a13ae

    .line 514
    .line 515
    .line 516
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 517
    .line 518
    .line 519
    move-result-object v23

    .line 520
    if-eqz v23, :cond_7

    .line 521
    .line 522
    const v7, 0x7f0a13b0

    .line 523
    .line 524
    .line 525
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    move-object/from16 v24, v1

    .line 530
    .line 531
    check-cast v24, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;

    .line 532
    .line 533
    if-eqz v24, :cond_7

    .line 534
    .line 535
    const v7, 0x7f0a13b1

    .line 536
    .line 537
    .line 538
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 539
    .line 540
    .line 541
    move-result-object v25

    .line 542
    if-eqz v25, :cond_7

    .line 543
    .line 544
    const v7, 0x7f0a13b3

    .line 545
    .line 546
    .line 547
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 548
    .line 549
    .line 550
    move-result-object v26

    .line 551
    if-eqz v26, :cond_7

    .line 552
    .line 553
    const v7, 0x7f0a13b8

    .line 554
    .line 555
    .line 556
    invoke-static {v0, v7}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 557
    .line 558
    .line 559
    move-result-object v27

    .line 560
    if-eqz v27, :cond_7

    .line 561
    .line 562
    new-instance v12, La/qsx;

    .line 563
    .line 564
    move-object v13, v0

    .line 565
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 566
    .line 567
    invoke-direct/range {v12 .. v27}, La/qsx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;Landroid/view/View;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/FootballEventsView;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 568
    .line 569
    .line 570
    move-object v11, v12

    .line 571
    goto :goto_5

    .line 572
    :cond_5
    move v7, v8

    .line 573
    goto :goto_4

    .line 574
    :cond_6
    move v7, v1

    .line 575
    :cond_7
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    :goto_5
    return-object v11

    .line 591
    :pswitch_3
    move-object/from16 v0, p1

    .line 592
    .line 593
    check-cast v0, Landroid/view/LayoutInflater;

    .line 594
    .line 595
    move-object/from16 v1, p2

    .line 596
    .line 597
    check-cast v1, Landroid/view/ViewGroup;

    .line 598
    .line 599
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-static {v0, v1}, La/owx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/owx;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    return-object v0

    .line 610
    :pswitch_4
    invoke-static/range {p1 .. p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v0

    .line 614
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    return-object v0

    .line 619
    :pswitch_5
    move-object/from16 v0, p1

    .line 620
    .line 621
    check-cast v0, Ljava/lang/Throwable;

    .line 622
    .line 623
    move-object/from16 v1, p2

    .line 624
    .line 625
    check-cast v1, Ljava/lang/String;

    .line 626
    .line 627
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 634
    .line 635
    return-object v0

    .line 636
    :pswitch_6
    move-object/from16 v0, p1

    .line 637
    .line 638
    check-cast v0, Ljava/lang/Throwable;

    .line 639
    .line 640
    move-object/from16 v1, p2

    .line 641
    .line 642
    check-cast v1, Ljava/lang/String;

    .line 643
    .line 644
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 651
    .line 652
    return-object v0

    .line 653
    :pswitch_7
    move-object/from16 v0, p1

    .line 654
    .line 655
    check-cast v0, La/fet;

    .line 656
    .line 657
    move-object/from16 v1, p2

    .line 658
    .line 659
    check-cast v1, Ljava/lang/Integer;

    .line 660
    .line 661
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    invoke-static {v10}, La/x8x;->L(I)I

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    invoke-static {v1, v0}, La/mrv;->G(ILa/fet;)V

    .line 669
    .line 670
    .line 671
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 672
    .line 673
    return-object v0

    .line 674
    :pswitch_8
    move-object/from16 v0, p1

    .line 675
    .line 676
    check-cast v0, La/fet;

    .line 677
    .line 678
    move-object/from16 v1, p2

    .line 679
    .line 680
    check-cast v1, Ljava/lang/Integer;

    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    invoke-static {v10}, La/x8x;->L(I)I

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    invoke-static {v1, v0}, La/mrv;->a0(ILa/fet;)V

    .line 690
    .line 691
    .line 692
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 693
    .line 694
    return-object v0

    .line 695
    :pswitch_9
    move-object/from16 v0, p1

    .line 696
    .line 697
    check-cast v0, La/fet;

    .line 698
    .line 699
    move-object/from16 v1, p2

    .line 700
    .line 701
    check-cast v1, Ljava/lang/Integer;

    .line 702
    .line 703
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    invoke-static {v10}, La/x8x;->L(I)I

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    invoke-static {v1, v0}, La/mrv;->L(ILa/fet;)V

    .line 711
    .line 712
    .line 713
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 714
    .line 715
    return-object v0

    .line 716
    :pswitch_a
    move-object/from16 v0, p1

    .line 717
    .line 718
    check-cast v0, La/fet;

    .line 719
    .line 720
    move-object/from16 v1, p2

    .line 721
    .line 722
    check-cast v1, Ljava/lang/Integer;

    .line 723
    .line 724
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    invoke-static {v10}, La/x8x;->L(I)I

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    invoke-static {v1, v0}, La/xbc;->w(ILa/fet;)V

    .line 732
    .line 733
    .line 734
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 735
    .line 736
    return-object v0

    .line 737
    :pswitch_b
    move-object/from16 v1, p1

    .line 738
    .line 739
    check-cast v1, La/fhl;

    .line 740
    .line 741
    move-object/from16 v0, p2

    .line 742
    .line 743
    check-cast v0, La/nu90;

    .line 744
    .line 745
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    sget-object v2, La/qmk;->a:La/zcl;

    .line 752
    .line 753
    const/high16 v2, 0x41e00000    # 28.0f

    .line 754
    .line 755
    invoke-interface {v1, v2}, La/w6k;->w0(F)F

    .line 756
    .line 757
    .line 758
    move-result v2

    .line 759
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    int-to-long v3, v3

    .line 764
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 765
    .line 766
    .line 767
    move-result v2

    .line 768
    int-to-long v5, v2

    .line 769
    const/16 v12, 0x20

    .line 770
    .line 771
    shl-long v2, v3, v12

    .line 772
    .line 773
    const-wide v13, 0xffffffffL

    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    and-long v4, v5, v13

    .line 779
    .line 780
    or-long v15, v2, v4

    .line 781
    .line 782
    invoke-interface {v1}, La/fhl;->d()J

    .line 783
    .line 784
    .line 785
    move-result-wide v2

    .line 786
    shr-long/2addr v2, v12

    .line 787
    long-to-int v2, v2

    .line 788
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    shr-long v3, v15, v12

    .line 793
    .line 794
    long-to-int v3, v3

    .line 795
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 796
    .line 797
    .line 798
    move-result v3

    .line 799
    sub-float/2addr v2, v3

    .line 800
    const/high16 v3, 0x40000000    # 2.0f

    .line 801
    .line 802
    div-float/2addr v2, v3

    .line 803
    invoke-interface {v1}, La/fhl;->d()J

    .line 804
    .line 805
    .line 806
    move-result-wide v4

    .line 807
    and-long/2addr v4, v13

    .line 808
    long-to-int v4, v4

    .line 809
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 810
    .line 811
    .line 812
    move-result v4

    .line 813
    and-long v5, v15, v13

    .line 814
    .line 815
    long-to-int v5, v5

    .line 816
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 817
    .line 818
    .line 819
    move-result v5

    .line 820
    sub-float/2addr v4, v5

    .line 821
    div-float/2addr v4, v3

    .line 822
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 823
    .line 824
    .line 825
    move-result v2

    .line 826
    int-to-long v2, v2

    .line 827
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 828
    .line 829
    .line 830
    move-result v4

    .line 831
    int-to-long v4, v4

    .line 832
    shl-long/2addr v2, v12

    .line 833
    and-long/2addr v4, v13

    .line 834
    or-long v17, v2, v4

    .line 835
    .line 836
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 837
    .line 838
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 843
    .line 844
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 845
    .line 846
    .line 847
    move-result-wide v2

    .line 848
    invoke-interface {v1}, La/fhl;->d()J

    .line 849
    .line 850
    .line 851
    move-result-wide v6

    .line 852
    const/high16 v4, 0x41800000    # 16.0f

    .line 853
    .line 854
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 855
    .line 856
    .line 857
    move-result v4

    .line 858
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 859
    .line 860
    .line 861
    move-result v5

    .line 862
    int-to-long v8, v5

    .line 863
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 864
    .line 865
    .line 866
    move-result v4

    .line 867
    int-to-long v4, v4

    .line 868
    shl-long/2addr v8, v12

    .line 869
    and-long/2addr v4, v13

    .line 870
    or-long/2addr v8, v4

    .line 871
    const/4 v10, 0x0

    .line 872
    const/16 v11, 0xf2

    .line 873
    .line 874
    const-wide/16 v4, 0x0

    .line 875
    .line 876
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 877
    .line 878
    .line 879
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 880
    .line 881
    .line 882
    move-result-object v7

    .line 883
    invoke-virtual {v7}, La/nr;->p()J

    .line 884
    .line 885
    .line 886
    move-result-wide v8

    .line 887
    invoke-virtual {v7}, La/nr;->i()La/x5a;

    .line 888
    .line 889
    .line 890
    move-result-object v2

    .line 891
    invoke-interface {v2}, La/x5a;->l()V

    .line 892
    .line 893
    .line 894
    :try_start_0
    iget-object v2, v7, La/nr;->b:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v2, La/fvt0;

    .line 897
    .line 898
    shr-long v3, v17, v12

    .line 899
    .line 900
    long-to-int v3, v3

    .line 901
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 902
    .line 903
    .line 904
    move-result v3

    .line 905
    and-long v4, v17, v13

    .line 906
    .line 907
    long-to-int v4, v4

    .line 908
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 909
    .line 910
    .line 911
    move-result v4

    .line 912
    invoke-virtual {v2, v3, v4}, La/fvt0;->A(FF)V

    .line 913
    .line 914
    .line 915
    move-object v2, v1

    .line 916
    iget-object v1, v0, La/nu90;->a:La/pm80;

    .line 917
    .line 918
    iget v5, v0, La/nu90;->b:F

    .line 919
    .line 920
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 925
    .line 926
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 927
    .line 928
    .line 929
    move-result-wide v3

    .line 930
    new-instance v6, La/m78;

    .line 931
    .line 932
    const/4 v0, 0x5

    .line 933
    invoke-direct {v6, v3, v4, v0}, La/m78;-><init>(JI)V

    .line 934
    .line 935
    .line 936
    move-wide v3, v15

    .line 937
    invoke-virtual/range {v1 .. v6}, La/pm80;->e(La/fhl;JFLa/a4d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 938
    .line 939
    .line 940
    invoke-static {v7, v8, v9}, Lc;->g(La/nr;J)V

    .line 941
    .line 942
    .line 943
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 944
    .line 945
    return-object v0

    .line 946
    :catchall_0
    move-exception v0

    .line 947
    invoke-static {v7, v8, v9}, Lc;->g(La/nr;J)V

    .line 948
    .line 949
    .line 950
    throw v0

    .line 951
    :pswitch_c
    move-object/from16 v0, p1

    .line 952
    .line 953
    check-cast v0, Landroid/view/LayoutInflater;

    .line 954
    .line 955
    move-object/from16 v1, p2

    .line 956
    .line 957
    check-cast v1, Landroid/view/ViewGroup;

    .line 958
    .line 959
    const v7, 0x7f0d0107

    .line 960
    .line 961
    .line 962
    invoke-static {v0, v1, v7, v1, v12}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    invoke-static {v0, v6}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    move-object v14, v1

    .line 971
    check-cast v14, Landroid/widget/LinearLayout;

    .line 972
    .line 973
    if-eqz v14, :cond_c

    .line 974
    .line 975
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    move-object v15, v1

    .line 980
    check-cast v15, Landroid/widget/ImageView;

    .line 981
    .line 982
    if-eqz v15, :cond_b

    .line 983
    .line 984
    const v1, 0x7f0a07a8

    .line 985
    .line 986
    .line 987
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 988
    .line 989
    .line 990
    move-result-object v5

    .line 991
    move-object/from16 v16, v5

    .line 992
    .line 993
    check-cast v16, Landroid/widget/ImageView;

    .line 994
    .line 995
    if-eqz v16, :cond_a

    .line 996
    .line 997
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    move-object/from16 v17, v1

    .line 1002
    .line 1003
    check-cast v17, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1004
    .line 1005
    if-eqz v17, :cond_9

    .line 1006
    .line 1007
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v1

    .line 1011
    move-object/from16 v18, v1

    .line 1012
    .line 1013
    check-cast v18, Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 1014
    .line 1015
    if-eqz v18, :cond_8

    .line 1016
    .line 1017
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v1

    .line 1021
    move-object/from16 v19, v1

    .line 1022
    .line 1023
    check-cast v19, Landroid/widget/TextView;

    .line 1024
    .line 1025
    if-eqz v19, :cond_d

    .line 1026
    .line 1027
    new-instance v12, La/a2k;

    .line 1028
    .line 1029
    move-object v13, v0

    .line 1030
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1031
    .line 1032
    invoke-direct/range {v12 .. v19}, La/a2k;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;Landroid/widget/TextView;)V

    .line 1033
    .line 1034
    .line 1035
    move-object v11, v12

    .line 1036
    goto :goto_7

    .line 1037
    :cond_8
    move v2, v3

    .line 1038
    goto :goto_6

    .line 1039
    :cond_9
    move v2, v4

    .line 1040
    goto :goto_6

    .line 1041
    :cond_a
    move v2, v1

    .line 1042
    goto :goto_6

    .line 1043
    :cond_b
    move v2, v5

    .line 1044
    goto :goto_6

    .line 1045
    :cond_c
    move v2, v6

    .line 1046
    :cond_d
    :goto_6
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v0

    .line 1054
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    :goto_7
    return-object v11

    .line 1062
    :pswitch_d
    move-object/from16 v0, p1

    .line 1063
    .line 1064
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1065
    .line 1066
    move-object/from16 v1, p2

    .line 1067
    .line 1068
    check-cast v1, Landroid/view/ViewGroup;

    .line 1069
    .line 1070
    const v7, 0x7f0d0106

    .line 1071
    .line 1072
    .line 1073
    invoke-static {v0, v1, v7, v1, v12}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    invoke-static {v0, v6}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v1

    .line 1081
    move-object v14, v1

    .line 1082
    check-cast v14, Landroid/widget/LinearLayout;

    .line 1083
    .line 1084
    if-eqz v14, :cond_12

    .line 1085
    .line 1086
    const v1, 0x7f0a0777

    .line 1087
    .line 1088
    .line 1089
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v6

    .line 1093
    move-object v15, v6

    .line 1094
    check-cast v15, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1095
    .line 1096
    if-eqz v15, :cond_f

    .line 1097
    .line 1098
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v1

    .line 1102
    move-object/from16 v16, v1

    .line 1103
    .line 1104
    check-cast v16, Landroid/widget/ImageView;

    .line 1105
    .line 1106
    if-eqz v16, :cond_11

    .line 1107
    .line 1108
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v1

    .line 1112
    move-object/from16 v17, v1

    .line 1113
    .line 1114
    check-cast v17, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1115
    .line 1116
    if-eqz v17, :cond_10

    .line 1117
    .line 1118
    const v1, 0x7f0a12f3

    .line 1119
    .line 1120
    .line 1121
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v4

    .line 1125
    move-object/from16 v18, v4

    .line 1126
    .line 1127
    check-cast v18, Landroid/widget/TextView;

    .line 1128
    .line 1129
    if-eqz v18, :cond_f

    .line 1130
    .line 1131
    const v1, 0x7f0a12f7

    .line 1132
    .line 1133
    .line 1134
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v4

    .line 1138
    move-object/from16 v19, v4

    .line 1139
    .line 1140
    check-cast v19, Landroid/widget/TextView;

    .line 1141
    .line 1142
    if-eqz v19, :cond_f

    .line 1143
    .line 1144
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v1

    .line 1148
    move-object/from16 v20, v1

    .line 1149
    .line 1150
    check-cast v20, Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;

    .line 1151
    .line 1152
    if-eqz v20, :cond_e

    .line 1153
    .line 1154
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v1

    .line 1158
    move-object/from16 v21, v1

    .line 1159
    .line 1160
    check-cast v21, Landroid/widget/TextView;

    .line 1161
    .line 1162
    if-eqz v21, :cond_13

    .line 1163
    .line 1164
    new-instance v12, La/z1k;

    .line 1165
    .line 1166
    move-object v13, v0

    .line 1167
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1168
    .line 1169
    invoke-direct/range {v12 .. v21}, La/z1k;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/ui_core/viewcomponents/views/FixedSelectionTextView;Landroid/widget/TextView;)V

    .line 1170
    .line 1171
    .line 1172
    move-object v11, v12

    .line 1173
    goto :goto_9

    .line 1174
    :cond_e
    move v2, v3

    .line 1175
    goto :goto_8

    .line 1176
    :cond_f
    move v2, v1

    .line 1177
    goto :goto_8

    .line 1178
    :cond_10
    move v2, v4

    .line 1179
    goto :goto_8

    .line 1180
    :cond_11
    move v2, v5

    .line 1181
    goto :goto_8

    .line 1182
    :cond_12
    move v2, v6

    .line 1183
    :cond_13
    :goto_8
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1196
    .line 1197
    .line 1198
    :goto_9
    return-object v11

    .line 1199
    :pswitch_e
    move-object/from16 v0, p1

    .line 1200
    .line 1201
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1202
    .line 1203
    move-object/from16 v1, p2

    .line 1204
    .line 1205
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1206
    .line 1207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1211
    .line 1212
    .line 1213
    new-instance v2, La/rnp;

    .line 1214
    .line 1215
    const/4 v3, 0x2

    .line 1216
    invoke-direct {v2, v3}, La/rnp;-><init>(B)V

    .line 1217
    .line 1218
    .line 1219
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1220
    .line 1221
    .line 1222
    new-instance v0, La/dfp;

    .line 1223
    .line 1224
    const/16 v2, 0x1c

    .line 1225
    .line 1226
    invoke-direct {v0, v2}, La/dfp;-><init>(B)V

    .line 1227
    .line 1228
    .line 1229
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1233
    .line 1234
    return-object v0

    .line 1235
    :pswitch_f
    move-object/from16 v0, p1

    .line 1236
    .line 1237
    check-cast v0, La/fet;

    .line 1238
    .line 1239
    move-object/from16 v1, p2

    .line 1240
    .line 1241
    check-cast v1, Ljava/lang/Integer;

    .line 1242
    .line 1243
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1244
    .line 1245
    .line 1246
    const v1, -0x25d0ad8d

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 1250
    .line 1251
    .line 1252
    const/4 v1, 0x3

    .line 1253
    invoke-static {v12, v12, v0, v12, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v1

    .line 1257
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 1258
    .line 1259
    .line 1260
    return-object v1

    .line 1261
    :pswitch_10
    move-object/from16 v0, p1

    .line 1262
    .line 1263
    check-cast v0, Ljava/lang/Long;

    .line 1264
    .line 1265
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1266
    .line 1267
    .line 1268
    move-result-wide v0

    .line 1269
    move-object/from16 v2, p2

    .line 1270
    .line 1271
    check-cast v2, La/jfl0;

    .line 1272
    .line 1273
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1274
    .line 1275
    .line 1276
    iget-wide v2, v2, La/jfl0;->a:J

    .line 1277
    .line 1278
    cmp-long v0, v2, v0

    .line 1279
    .line 1280
    if-nez v0, :cond_14

    .line 1281
    .line 1282
    goto :goto_a

    .line 1283
    :cond_14
    move v10, v12

    .line 1284
    :goto_a
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v0

    .line 1288
    return-object v0

    .line 1289
    :pswitch_11
    move-object/from16 v0, p1

    .line 1290
    .line 1291
    check-cast v0, Ljava/lang/Throwable;

    .line 1292
    .line 1293
    move-object/from16 v1, p2

    .line 1294
    .line 1295
    check-cast v1, Ljava/lang/String;

    .line 1296
    .line 1297
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1301
    .line 1302
    .line 1303
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1304
    .line 1305
    return-object v0

    .line 1306
    :pswitch_12
    move-object/from16 v0, p1

    .line 1307
    .line 1308
    check-cast v0, Ljava/lang/Throwable;

    .line 1309
    .line 1310
    move-object/from16 v1, p2

    .line 1311
    .line 1312
    check-cast v1, Ljava/lang/String;

    .line 1313
    .line 1314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1318
    .line 1319
    .line 1320
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1321
    .line 1322
    return-object v0

    .line 1323
    :pswitch_13
    move-object/from16 v0, p1

    .line 1324
    .line 1325
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1326
    .line 1327
    move-object/from16 v1, p2

    .line 1328
    .line 1329
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1330
    .line 1331
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1335
    .line 1336
    .line 1337
    new-instance v2, La/e4p;

    .line 1338
    .line 1339
    const/16 v3, 0x1d

    .line 1340
    .line 1341
    invoke-direct {v2, v3}, La/e4p;-><init>(B)V

    .line 1342
    .line 1343
    .line 1344
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1345
    .line 1346
    .line 1347
    new-instance v0, La/dfp;

    .line 1348
    .line 1349
    const/16 v2, 0x9

    .line 1350
    .line 1351
    invoke-direct {v0, v2}, La/dfp;-><init>(B)V

    .line 1352
    .line 1353
    .line 1354
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1358
    .line 1359
    return-object v0

    .line 1360
    :pswitch_14
    move-object/from16 v0, p1

    .line 1361
    .line 1362
    check-cast v0, Ljava/lang/Long;

    .line 1363
    .line 1364
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1365
    .line 1366
    .line 1367
    move-result-wide v0

    .line 1368
    move-object/from16 v2, p2

    .line 1369
    .line 1370
    check-cast v2, La/rbb;

    .line 1371
    .line 1372
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1373
    .line 1374
    .line 1375
    iget-object v3, v2, La/rbb;->d:Ljava/util/List;

    .line 1376
    .line 1377
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1378
    .line 1379
    .line 1380
    move-result v4

    .line 1381
    if-eqz v4, :cond_16

    .line 1382
    .line 1383
    iget-wide v2, v2, La/rbb;->a:J

    .line 1384
    .line 1385
    cmp-long v0, v2, v0

    .line 1386
    .line 1387
    if-nez v0, :cond_15

    .line 1388
    .line 1389
    goto :goto_c

    .line 1390
    :cond_15
    :goto_b
    move v10, v12

    .line 1391
    goto :goto_c

    .line 1392
    :cond_16
    if-eqz v3, :cond_17

    .line 1393
    .line 1394
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1395
    .line 1396
    .line 1397
    move-result v2

    .line 1398
    if-eqz v2, :cond_17

    .line 1399
    .line 1400
    goto :goto_b

    .line 1401
    :cond_17
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v2

    .line 1405
    :cond_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1406
    .line 1407
    .line 1408
    move-result v3

    .line 1409
    if-eqz v3, :cond_15

    .line 1410
    .line 1411
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v3

    .line 1415
    check-cast v3, La/sum0;

    .line 1416
    .line 1417
    iget-wide v3, v3, La/sum0;->a:J

    .line 1418
    .line 1419
    cmp-long v3, v3, v0

    .line 1420
    .line 1421
    if-nez v3, :cond_18

    .line 1422
    .line 1423
    :goto_c
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v0

    .line 1427
    return-object v0

    .line 1428
    :pswitch_15
    move-object/from16 v0, p1

    .line 1429
    .line 1430
    check-cast v0, Ljava/lang/Integer;

    .line 1431
    .line 1432
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1433
    .line 1434
    .line 1435
    move-object/from16 v0, p2

    .line 1436
    .line 1437
    check-cast v0, La/zgp;

    .line 1438
    .line 1439
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1440
    .line 1441
    .line 1442
    iget v0, v0, La/zgp;->a:I

    .line 1443
    .line 1444
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v0

    .line 1448
    return-object v0

    .line 1449
    :pswitch_16
    move-object/from16 v0, p1

    .line 1450
    .line 1451
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1452
    .line 1453
    move-object/from16 v1, p2

    .line 1454
    .line 1455
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 1456
    .line 1457
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1458
    .line 1459
    .line 1460
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1461
    .line 1462
    .line 1463
    new-instance v2, La/e4p;

    .line 1464
    .line 1465
    const/16 v3, 0x17

    .line 1466
    .line 1467
    invoke-direct {v2, v3}, La/e4p;-><init>(B)V

    .line 1468
    .line 1469
    .line 1470
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    new-instance v0, La/dfp;

    .line 1474
    .line 1475
    invoke-direct {v0, v12}, La/dfp;-><init>(B)V

    .line 1476
    .line 1477
    .line 1478
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1479
    .line 1480
    .line 1481
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1482
    .line 1483
    return-object v0

    .line 1484
    :pswitch_17
    move-object/from16 v0, p1

    .line 1485
    .line 1486
    check-cast v0, Ljava/lang/Throwable;

    .line 1487
    .line 1488
    move-object/from16 v1, p2

    .line 1489
    .line 1490
    check-cast v1, Ljava/lang/String;

    .line 1491
    .line 1492
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1493
    .line 1494
    .line 1495
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1496
    .line 1497
    return-object v0

    .line 1498
    :pswitch_18
    move-object/from16 v0, p1

    .line 1499
    .line 1500
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1501
    .line 1502
    move-object/from16 v2, p2

    .line 1503
    .line 1504
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1505
    .line 1506
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1510
    .line 1511
    .line 1512
    new-instance v3, La/e4p;

    .line 1513
    .line 1514
    const/16 v4, 0xf

    .line 1515
    .line 1516
    invoke-direct {v3, v4}, La/e4p;-><init>(B)V

    .line 1517
    .line 1518
    .line 1519
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    new-instance v0, La/r4p;

    .line 1523
    .line 1524
    invoke-direct {v0, v1}, La/r4p;-><init>(B)V

    .line 1525
    .line 1526
    .line 1527
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1531
    .line 1532
    return-object v0

    .line 1533
    :pswitch_19
    move-object/from16 v0, p1

    .line 1534
    .line 1535
    check-cast v0, Ljava/lang/Throwable;

    .line 1536
    .line 1537
    move-object/from16 v1, p2

    .line 1538
    .line 1539
    check-cast v1, Ljava/lang/String;

    .line 1540
    .line 1541
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1542
    .line 1543
    .line 1544
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1545
    .line 1546
    return-object v0

    .line 1547
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1548
    .line 1549
    check-cast v0, Ljava/lang/Throwable;

    .line 1550
    .line 1551
    move-object/from16 v1, p2

    .line 1552
    .line 1553
    check-cast v1, Ljava/lang/String;

    .line 1554
    .line 1555
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1559
    .line 1560
    .line 1561
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1562
    .line 1563
    return-object v0

    .line 1564
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1565
    .line 1566
    check-cast v0, Ljava/lang/Throwable;

    .line 1567
    .line 1568
    move-object/from16 v1, p2

    .line 1569
    .line 1570
    check-cast v1, Ljava/lang/String;

    .line 1571
    .line 1572
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1573
    .line 1574
    .line 1575
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1576
    .line 1577
    return-object v0

    .line 1578
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1579
    .line 1580
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1581
    .line 1582
    move-object/from16 v2, p2

    .line 1583
    .line 1584
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 1585
    .line 1586
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1590
    .line 1591
    .line 1592
    new-instance v3, La/e4p;

    .line 1593
    .line 1594
    invoke-direct {v3, v1}, La/e4p;-><init>(B)V

    .line 1595
    .line 1596
    .line 1597
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    new-instance v0, La/r4p;

    .line 1601
    .line 1602
    const/16 v1, 0x12

    .line 1603
    .line 1604
    invoke-direct {v0, v1}, La/r4p;-><init>(B)V

    .line 1605
    .line 1606
    .line 1607
    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1611
    .line 1612
    return-object v0

    .line 1613
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
