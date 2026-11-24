.class public final synthetic La/im8;
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
    iput-byte p1, p0, La/im8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/im8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/im8;->a:B

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const v2, 0x7f0a1176

    .line 7
    .line 8
    .line 9
    const v3, 0x7f0a1174

    .line 10
    .line 11
    .line 12
    const-string v4, "rootView"

    .line 13
    .line 14
    const-string v5, "Missing required view with ID: "

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v0, p1

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p2

    .line 29
    .line 30
    check-cast v0, La/eja;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/eja;->a:La/dja;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    move-object/from16 v0, p1

    .line 39
    .line 40
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 41
    .line 42
    move-object/from16 v1, p2

    .line 43
    .line 44
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v2, La/d69;

    .line 53
    .line 54
    const/16 v3, 0x19

    .line 55
    .line 56
    invoke-direct {v2, v3}, La/d69;-><init>(B)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    new-instance v0, La/mn9;

    .line 63
    .line 64
    const/16 v2, 0x1a

    .line 65
    .line 66
    invoke-direct {v0, v2}, La/mn9;-><init>(B)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_1
    move-object/from16 v0, p1

    .line 76
    .line 77
    check-cast v0, Ljava/lang/Throwable;

    .line 78
    .line 79
    move-object/from16 v1, p2

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_2
    move-object/from16 v0, p1

    .line 90
    .line 91
    check-cast v0, Landroid/view/LayoutInflater;

    .line 92
    .line 93
    move-object/from16 v1, p2

    .line 94
    .line 95
    check-cast v1, Landroid/view/ViewGroup;

    .line 96
    .line 97
    const v2, 0x7f0d0378

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_0

    .line 105
    .line 106
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 107
    .line 108
    new-instance v6, La/atx;

    .line 109
    .line 110
    invoke-direct {v6, v0, v0}, La/atx;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    invoke-static {v4}, La/hny;->u(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :goto_0
    return-object v6

    .line 118
    :pswitch_3
    move-object/from16 v0, p1

    .line 119
    .line 120
    check-cast v0, Ljava/lang/Long;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-object/from16 v0, p2

    .line 126
    .line 127
    check-cast v0, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_4
    move-object/from16 v0, p1

    .line 136
    .line 137
    check-cast v0, Ljava/lang/Long;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-object/from16 v0, p2

    .line 143
    .line 144
    check-cast v0, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object v0

    .line 152
    :pswitch_5
    move-object/from16 v0, p1

    .line 153
    .line 154
    check-cast v0, Ljava/lang/Integer;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-object/from16 v0, p2

    .line 160
    .line 161
    check-cast v0, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_6
    move-object/from16 v0, p1

    .line 170
    .line 171
    check-cast v0, Landroid/view/LayoutInflater;

    .line 172
    .line 173
    move-object/from16 v1, p2

    .line 174
    .line 175
    check-cast v1, Landroid/view/ViewGroup;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v1}, La/msx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/msx;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :pswitch_7
    move-object/from16 v0, p1

    .line 189
    .line 190
    check-cast v0, Landroid/view/LayoutInflater;

    .line 191
    .line 192
    move-object/from16 v1, p2

    .line 193
    .line 194
    check-cast v1, Landroid/view/ViewGroup;

    .line 195
    .line 196
    const v4, 0x7f0d036c

    .line 197
    .line 198
    .line 199
    invoke-static {v0, v1, v4, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    const v1, 0x7f0a045d

    .line 204
    .line 205
    .line 206
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Landroidx/constraintlayout/widget/Guideline;

    .line 211
    .line 212
    if-eqz v4, :cond_2

    .line 213
    .line 214
    const v1, 0x7f0a05b1

    .line 215
    .line 216
    .line 217
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    if-eqz v9, :cond_2

    .line 222
    .line 223
    const v1, 0x7f0a05e0

    .line 224
    .line 225
    .line 226
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    check-cast v4, Landroid/widget/FrameLayout;

    .line 231
    .line 232
    if-eqz v4, :cond_2

    .line 233
    .line 234
    const v1, 0x7f0a05eb

    .line 235
    .line 236
    .line 237
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    check-cast v4, Landroid/widget/FrameLayout;

    .line 242
    .line 243
    if-eqz v4, :cond_2

    .line 244
    .line 245
    const v1, 0x7f0a0853

    .line 246
    .line 247
    .line 248
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    move-object v10, v4

    .line 253
    check-cast v10, Landroid/widget/ImageView;

    .line 254
    .line 255
    if-eqz v10, :cond_2

    .line 256
    .line 257
    const v1, 0x7f0a0854

    .line 258
    .line 259
    .line 260
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    move-object v11, v4

    .line 265
    check-cast v11, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 266
    .line 267
    if-eqz v11, :cond_2

    .line 268
    .line 269
    const v1, 0x7f0a08b4

    .line 270
    .line 271
    .line 272
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    move-object v12, v4

    .line 277
    check-cast v12, Landroid/widget/ImageView;

    .line 278
    .line 279
    if-eqz v12, :cond_2

    .line 280
    .line 281
    const v1, 0x7f0a08b5

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    move-object v13, v4

    .line 289
    check-cast v13, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 290
    .line 291
    if-eqz v13, :cond_2

    .line 292
    .line 293
    const v1, 0x7f0a0d47

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    if-eqz v14, :cond_2

    .line 301
    .line 302
    const v1, 0x7f0a0f18

    .line 303
    .line 304
    .line 305
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 306
    .line 307
    .line 308
    move-result-object v15

    .line 309
    if-eqz v15, :cond_2

    .line 310
    .line 311
    const v1, 0x7f0a1121

    .line 312
    .line 313
    .line 314
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    move-object/from16 v16, v4

    .line 319
    .line 320
    check-cast v16, Landroid/widget/TextView;

    .line 321
    .line 322
    if-eqz v16, :cond_2

    .line 323
    .line 324
    const v1, 0x7f0a1125

    .line 325
    .line 326
    .line 327
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    move-object/from16 v17, v4

    .line 332
    .line 333
    check-cast v17, Landroidx/appcompat/widget/AppCompatTextView;

    .line 334
    .line 335
    if-eqz v17, :cond_2

    .line 336
    .line 337
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    move-object/from16 v18, v1

    .line 342
    .line 343
    check-cast v18, Landroid/widget/TextView;

    .line 344
    .line 345
    if-eqz v18, :cond_1

    .line 346
    .line 347
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    move-object/from16 v19, v1

    .line 352
    .line 353
    check-cast v19, Landroidx/appcompat/widget/AppCompatTextView;

    .line 354
    .line 355
    if-eqz v19, :cond_3

    .line 356
    .line 357
    const v2, 0x7f0a120d

    .line 358
    .line 359
    .line 360
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    move-object/from16 v20, v1

    .line 365
    .line 366
    check-cast v20, Landroid/widget/TextView;

    .line 367
    .line 368
    if-eqz v20, :cond_3

    .line 369
    .line 370
    const v2, 0x7f0a1211

    .line 371
    .line 372
    .line 373
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    move-object/from16 v21, v1

    .line 378
    .line 379
    check-cast v21, Landroidx/appcompat/widget/AppCompatTextView;

    .line 380
    .line 381
    if-eqz v21, :cond_3

    .line 382
    .line 383
    new-instance v7, La/osx;

    .line 384
    .line 385
    move-object v8, v0

    .line 386
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 387
    .line 388
    invoke-direct/range {v7 .. v21}, La/osx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/widget/ImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroid/widget/ImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 389
    .line 390
    .line 391
    move-object v6, v7

    .line 392
    goto :goto_2

    .line 393
    :cond_1
    move v2, v3

    .line 394
    goto :goto_1

    .line 395
    :cond_2
    move v2, v1

    .line 396
    :cond_3
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    :goto_2
    return-object v6

    .line 412
    :pswitch_8
    move-object/from16 v0, p1

    .line 413
    .line 414
    check-cast v0, Landroid/view/LayoutInflater;

    .line 415
    .line 416
    move-object/from16 v1, p2

    .line 417
    .line 418
    check-cast v1, Landroid/view/ViewGroup;

    .line 419
    .line 420
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    invoke-static {v0, v1}, La/msx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/msx;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    return-object v0

    .line 431
    :pswitch_9
    move-object/from16 v0, p1

    .line 432
    .line 433
    check-cast v0, Landroid/view/LayoutInflater;

    .line 434
    .line 435
    move-object/from16 v1, p2

    .line 436
    .line 437
    check-cast v1, Landroid/view/ViewGroup;

    .line 438
    .line 439
    const v2, 0x7f0d036d

    .line 440
    .line 441
    .line 442
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    const v1, 0x7f0a10f6

    .line 447
    .line 448
    .line 449
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    check-cast v2, Landroidx/appcompat/widget/AppCompatTextView;

    .line 454
    .line 455
    if-eqz v2, :cond_4

    .line 456
    .line 457
    new-instance v6, La/psx;

    .line 458
    .line 459
    check-cast v0, Landroid/widget/FrameLayout;

    .line 460
    .line 461
    invoke-direct {v6, v0, v2}, La/psx;-><init>(Landroid/widget/FrameLayout;Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 462
    .line 463
    .line 464
    goto :goto_3

    .line 465
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    :goto_3
    return-object v6

    .line 481
    :pswitch_a
    move-object/from16 v0, p1

    .line 482
    .line 483
    check-cast v0, Ljava/lang/Integer;

    .line 484
    .line 485
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    move-object/from16 v0, p2

    .line 489
    .line 490
    check-cast v0, La/tea;

    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    iget-object v0, v0, La/tea;->a:Ljava/lang/String;

    .line 496
    .line 497
    return-object v0

    .line 498
    :pswitch_b
    move-object/from16 v0, p1

    .line 499
    .line 500
    check-cast v0, Landroid/view/LayoutInflater;

    .line 501
    .line 502
    move-object/from16 v1, p2

    .line 503
    .line 504
    check-cast v1, Landroid/view/ViewGroup;

    .line 505
    .line 506
    const v4, 0x7f0d036b

    .line 507
    .line 508
    .line 509
    invoke-static {v0, v1, v4, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    move-object v9, v1

    .line 518
    check-cast v9, Landroid/widget/TextView;

    .line 519
    .line 520
    if-eqz v9, :cond_6

    .line 521
    .line 522
    const v1, 0x7f0a1175

    .line 523
    .line 524
    .line 525
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    move-object v10, v3

    .line 530
    check-cast v10, Landroid/widget/TextView;

    .line 531
    .line 532
    if-eqz v10, :cond_5

    .line 533
    .line 534
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    move-object v11, v1

    .line 539
    check-cast v11, Landroid/widget/TextView;

    .line 540
    .line 541
    if-eqz v11, :cond_7

    .line 542
    .line 543
    const v2, 0x7f0a138d

    .line 544
    .line 545
    .line 546
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    move-object v12, v1

    .line 551
    check-cast v12, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 552
    .line 553
    if-eqz v12, :cond_7

    .line 554
    .line 555
    new-instance v7, La/nsx;

    .line 556
    .line 557
    move-object v8, v0

    .line 558
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 559
    .line 560
    invoke-direct/range {v7 .. v12}, La/nsx;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;)V

    .line 561
    .line 562
    .line 563
    move-object v6, v7

    .line 564
    goto :goto_5

    .line 565
    :cond_5
    move v2, v1

    .line 566
    goto :goto_4

    .line 567
    :cond_6
    move v2, v3

    .line 568
    :cond_7
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    :goto_5
    return-object v6

    .line 584
    :pswitch_c
    move-object/from16 v0, p1

    .line 585
    .line 586
    check-cast v0, Landroid/view/LayoutInflater;

    .line 587
    .line 588
    move-object/from16 v1, p2

    .line 589
    .line 590
    check-cast v1, Landroid/view/ViewGroup;

    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    invoke-static {v0, v1}, La/lsx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/lsx;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    return-object v0

    .line 603
    :pswitch_d
    move-object/from16 v0, p1

    .line 604
    .line 605
    check-cast v0, Landroid/view/LayoutInflater;

    .line 606
    .line 607
    move-object/from16 v1, p2

    .line 608
    .line 609
    check-cast v1, Landroid/view/ViewGroup;

    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    invoke-static {v0, v1}, La/lsx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/lsx;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    return-object v0

    .line 622
    :pswitch_e
    move-object/from16 v0, p1

    .line 623
    .line 624
    check-cast v0, La/fet;

    .line 625
    .line 626
    move-object/from16 v2, p2

    .line 627
    .line 628
    check-cast v2, Ljava/lang/Integer;

    .line 629
    .line 630
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    invoke-static {v1}, La/x8x;->L(I)I

    .line 634
    .line 635
    .line 636
    move-result v1

    .line 637
    invoke-static {v1, v0}, La/nnw0;->r(ILa/fet;)V

    .line 638
    .line 639
    .line 640
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 641
    .line 642
    return-object v0

    .line 643
    :pswitch_f
    move-object/from16 v0, p1

    .line 644
    .line 645
    check-cast v0, Landroid/view/LayoutInflater;

    .line 646
    .line 647
    move-object/from16 v1, p2

    .line 648
    .line 649
    check-cast v1, Landroid/view/ViewGroup;

    .line 650
    .line 651
    const v2, 0x7f0d0367

    .line 652
    .line 653
    .line 654
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    const v1, 0x7f0a0350

    .line 659
    .line 660
    .line 661
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    check-cast v2, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 666
    .line 667
    if-eqz v2, :cond_8

    .line 668
    .line 669
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 670
    .line 671
    new-instance v6, La/ksx;

    .line 672
    .line 673
    invoke-direct {v6, v0, v2, v0}, La/ksx;-><init>(Lorg/xplatform/uikit/components/cells/DsSettingsCell;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;Lorg/xplatform/uikit/components/cells/DsSettingsCell;)V

    .line 674
    .line 675
    .line 676
    goto :goto_6

    .line 677
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    :goto_6
    return-object v6

    .line 693
    :pswitch_10
    move-object/from16 v0, p1

    .line 694
    .line 695
    check-cast v0, Landroid/view/LayoutInflater;

    .line 696
    .line 697
    move-object/from16 v1, p2

    .line 698
    .line 699
    check-cast v1, Landroid/view/ViewGroup;

    .line 700
    .line 701
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    invoke-static {v0, v1}, La/jsx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/jsx;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    return-object v0

    .line 712
    :pswitch_11
    move-object/from16 v0, p1

    .line 713
    .line 714
    check-cast v0, La/fet;

    .line 715
    .line 716
    move-object/from16 v2, p2

    .line 717
    .line 718
    check-cast v2, Ljava/lang/Integer;

    .line 719
    .line 720
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    invoke-static {v1}, La/x8x;->L(I)I

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    invoke-static {v1, v0}, La/ay3;->G(ILa/fet;)V

    .line 728
    .line 729
    .line 730
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 731
    .line 732
    return-object v0

    .line 733
    :pswitch_12
    move-object/from16 v0, p1

    .line 734
    .line 735
    check-cast v0, La/fet;

    .line 736
    .line 737
    move-object/from16 v1, p2

    .line 738
    .line 739
    check-cast v1, Ljava/lang/Integer;

    .line 740
    .line 741
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 742
    .line 743
    .line 744
    const v1, 0x441cadbb

    .line 745
    .line 746
    .line 747
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 748
    .line 749
    .line 750
    const/4 v1, 0x3

    .line 751
    invoke-static {v7, v7, v0, v7, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    invoke-virtual {v0, v7}, La/fet;->r(Z)V

    .line 756
    .line 757
    .line 758
    return-object v1

    .line 759
    :pswitch_13
    move-object/from16 v0, p1

    .line 760
    .line 761
    check-cast v0, Landroid/view/LayoutInflater;

    .line 762
    .line 763
    move-object/from16 v1, p2

    .line 764
    .line 765
    check-cast v1, Landroid/view/ViewGroup;

    .line 766
    .line 767
    const v2, 0x7f0d0365

    .line 768
    .line 769
    .line 770
    invoke-static {v0, v1, v2, v1, v7}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    if-eqz v0, :cond_9

    .line 775
    .line 776
    check-cast v0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 777
    .line 778
    new-instance v6, La/isx;

    .line 779
    .line 780
    invoke-direct {v6, v0, v0}, La/isx;-><init>(Lorg/xplatform/uikit/components/buttons/DsButton;Lorg/xplatform/uikit/components/buttons/DsButton;)V

    .line 781
    .line 782
    .line 783
    goto :goto_7

    .line 784
    :cond_9
    invoke-static {v4}, La/hny;->u(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    :goto_7
    return-object v6

    .line 788
    :pswitch_14
    move-object/from16 v0, p1

    .line 789
    .line 790
    check-cast v0, Ljava/lang/Integer;

    .line 791
    .line 792
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 793
    .line 794
    .line 795
    move-object/from16 v0, p2

    .line 796
    .line 797
    check-cast v0, La/la9;

    .line 798
    .line 799
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    iget-wide v0, v0, La/la9;->a:J

    .line 803
    .line 804
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    return-object v0

    .line 809
    :pswitch_15
    move-object/from16 v0, p1

    .line 810
    .line 811
    check-cast v0, Ljava/lang/Throwable;

    .line 812
    .line 813
    move-object/from16 v1, p2

    .line 814
    .line 815
    check-cast v1, Ljava/lang/String;

    .line 816
    .line 817
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 818
    .line 819
    .line 820
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 821
    .line 822
    return-object v0

    .line 823
    :pswitch_16
    move-object/from16 v0, p1

    .line 824
    .line 825
    check-cast v0, Ljava/lang/Throwable;

    .line 826
    .line 827
    move-object/from16 v1, p2

    .line 828
    .line 829
    check-cast v1, Ljava/lang/String;

    .line 830
    .line 831
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 832
    .line 833
    .line 834
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 835
    .line 836
    return-object v0

    .line 837
    :pswitch_17
    move-object/from16 v0, p1

    .line 838
    .line 839
    check-cast v0, Ljava/lang/Throwable;

    .line 840
    .line 841
    move-object/from16 v0, p2

    .line 842
    .line 843
    check-cast v0, Ljava/lang/String;

    .line 844
    .line 845
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 846
    .line 847
    return-object v0

    .line 848
    :pswitch_18
    move-object/from16 v0, p1

    .line 849
    .line 850
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 851
    .line 852
    move-object/from16 v1, p2

    .line 853
    .line 854
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    new-instance v2, La/cp8;

    .line 863
    .line 864
    const/16 v3, 0x1b

    .line 865
    .line 866
    invoke-direct {v2, v3}, La/cp8;-><init>(B)V

    .line 867
    .line 868
    .line 869
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    new-instance v0, La/ej8;

    .line 873
    .line 874
    const/16 v2, 0x8

    .line 875
    .line 876
    invoke-direct {v0, v2}, La/ej8;-><init>(B)V

    .line 877
    .line 878
    .line 879
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 883
    .line 884
    return-object v0

    .line 885
    :pswitch_19
    move-object/from16 v0, p1

    .line 886
    .line 887
    check-cast v0, La/oyg0;

    .line 888
    .line 889
    move-object/from16 v1, p2

    .line 890
    .line 891
    check-cast v1, La/x19;

    .line 892
    .line 893
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    iget-object v2, v1, La/x19;->c:La/v19;

    .line 900
    .line 901
    const/4 v6, 0x0

    .line 902
    const/16 v7, 0x1d

    .line 903
    .line 904
    const/4 v3, 0x0

    .line 905
    const/4 v4, 0x0

    .line 906
    const/4 v5, 0x0

    .line 907
    invoke-static/range {v2 .. v7}, La/v19;->a(La/v19;ZZZLjava/util/List;I)La/v19;

    .line 908
    .line 909
    .line 910
    move-result-object v4

    .line 911
    iget-object v0, v1, La/x19;->b:La/u19;

    .line 912
    .line 913
    iget-boolean v6, v0, La/u19;->a:Z

    .line 914
    .line 915
    iget-boolean v8, v0, La/u19;->c:Z

    .line 916
    .line 917
    iget-object v9, v0, La/u19;->d:Ljava/util/List;

    .line 918
    .line 919
    iget-object v10, v0, La/u19;->e:La/hr10;

    .line 920
    .line 921
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    new-instance v3, La/u19;

    .line 925
    .line 926
    const/4 v7, 0x0

    .line 927
    move-object v5, v3

    .line 928
    invoke-direct/range {v5 .. v10}, La/u19;-><init>(ZZZLjava/util/List;La/hr10;)V

    .line 929
    .line 930
    .line 931
    const/4 v7, 0x0

    .line 932
    const/16 v8, 0x1f9

    .line 933
    .line 934
    const/4 v2, 0x0

    .line 935
    const/4 v5, 0x0

    .line 936
    const/4 v6, 0x0

    .line 937
    invoke-static/range {v1 .. v8}, La/x19;->a(La/x19;La/w19;La/u19;La/v19;ZLa/ql5;La/uzb0;I)La/x19;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    return-object v0

    .line 942
    :pswitch_1a
    move-object/from16 v0, p1

    .line 943
    .line 944
    check-cast v0, Ljava/lang/Throwable;

    .line 945
    .line 946
    move-object/from16 v0, p2

    .line 947
    .line 948
    check-cast v0, Ljava/lang/String;

    .line 949
    .line 950
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 951
    .line 952
    return-object v0

    .line 953
    :pswitch_1b
    move-object/from16 v0, p1

    .line 954
    .line 955
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 956
    .line 957
    move-object/from16 v1, p2

    .line 958
    .line 959
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 960
    .line 961
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 962
    .line 963
    .line 964
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    new-instance v2, La/cp8;

    .line 968
    .line 969
    const/16 v3, 0x12

    .line 970
    .line 971
    invoke-direct {v2, v3}, La/cp8;-><init>(B)V

    .line 972
    .line 973
    .line 974
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    new-instance v0, La/ej8;

    .line 978
    .line 979
    const/4 v2, 0x6

    .line 980
    invoke-direct {v0, v2}, La/ej8;-><init>(B)V

    .line 981
    .line 982
    .line 983
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 987
    .line 988
    return-object v0

    .line 989
    :pswitch_1c
    move-object/from16 v0, p1

    .line 990
    .line 991
    check-cast v0, Ljava/lang/Throwable;

    .line 992
    .line 993
    move-object/from16 v1, p2

    .line 994
    .line 995
    check-cast v1, Ljava/lang/String;

    .line 996
    .line 997
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 998
    .line 999
    .line 1000
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1001
    .line 1002
    return-object v0

    .line 1003
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
