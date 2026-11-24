.class public final La/no8;
.super La/pvm0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/no8;->a:B

    iput-object p1, p0, La/no8;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(Landroid/view/View;FF)V
    .locals 9

    .line 1
    iget-byte v0, p0, La/no8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    iget-object p0, p0, La/no8;->b:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x3

    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 18
    .line 19
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->a:La/ygu0;

    .line 20
    .line 21
    iget v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->e:I

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_10

    .line 26
    .line 27
    :cond_0
    invoke-static {p0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->a(Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    goto/16 :goto_10

    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->getEnableFlingBack()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_12

    .line 40
    .line 41
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v1, -0x1

    .line 48
    const-wide v7, 0x409f400000000000L    # 2000.0

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    if-eqz v0, :cond_c

    .line 54
    .line 55
    if-eq v0, v6, :cond_7

    .line 56
    .line 57
    if-eq v0, v3, :cond_c

    .line 58
    .line 59
    if-ne v0, v2, :cond_6

    .line 60
    .line 61
    cmpl-float v0, p3, v4

    .line 62
    .line 63
    if-lez v0, :cond_2

    .line 64
    .line 65
    goto/16 :goto_a

    .line 66
    .line 67
    :cond_2
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    cmpl-float p2, v0, p2

    .line 76
    .line 77
    if-lez p2, :cond_12

    .line 78
    .line 79
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    float-to-double p2, p2

    .line 84
    cmpl-double p2, p2, v7

    .line 85
    .line 86
    if-lez p2, :cond_12

    .line 87
    .line 88
    iget-object p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 89
    .line 90
    sget-object p3, La/ton0;->b:La/ton0;

    .line 91
    .line 92
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 93
    .line 94
    if-ne p2, p3, :cond_4

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    goto :goto_0

    .line 103
    :cond_3
    move p2, v5

    .line 104
    :goto_0
    if-nez p2, :cond_12

    .line 105
    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_4
    if-eqz v0, :cond_5

    .line 109
    .line 110
    invoke-virtual {v0, v6}, Landroid/view/View;->canScrollVertically(I)Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    goto :goto_1

    .line 115
    :cond_5
    move p2, v5

    .line 116
    :goto_1
    if-nez p2, :cond_12

    .line 117
    .line 118
    goto/16 :goto_6

    .line 119
    .line 120
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_10

    .line 124
    .line 125
    :cond_7
    cmpg-float v0, p3, v4

    .line 126
    .line 127
    if-gez v0, :cond_8

    .line 128
    .line 129
    goto/16 :goto_a

    .line 130
    .line 131
    :cond_8
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    cmpl-float p2, v0, p2

    .line 140
    .line 141
    if-lez p2, :cond_12

    .line 142
    .line 143
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    float-to-double p2, p2

    .line 148
    cmpl-double p2, p2, v7

    .line 149
    .line 150
    if-lez p2, :cond_12

    .line 151
    .line 152
    iget-object p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 153
    .line 154
    sget-object p3, La/ton0;->b:La/ton0;

    .line 155
    .line 156
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 157
    .line 158
    if-ne p2, p3, :cond_a

    .line 159
    .line 160
    if-eqz v0, :cond_9

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    goto :goto_2

    .line 167
    :cond_9
    move p2, v5

    .line 168
    :goto_2
    if-nez p2, :cond_12

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_a
    if-eqz v0, :cond_b

    .line 172
    .line 173
    invoke-virtual {v0, v6}, Landroid/view/View;->canScrollVertically(I)Z

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    goto :goto_3

    .line 178
    :cond_b
    move p2, v5

    .line 179
    :goto_3
    if-nez p2, :cond_12

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_c
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 187
    .line 188
    .line 189
    move-result p3

    .line 190
    cmpl-float p3, v0, p3

    .line 191
    .line 192
    if-lez p3, :cond_12

    .line 193
    .line 194
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    float-to-double p2, p2

    .line 199
    cmpl-double p2, p2, v7

    .line 200
    .line 201
    if-lez p2, :cond_12

    .line 202
    .line 203
    iget-object p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 204
    .line 205
    sget-object p3, La/ton0;->a:La/ton0;

    .line 206
    .line 207
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 208
    .line 209
    if-ne p2, p3, :cond_e

    .line 210
    .line 211
    if-eqz v0, :cond_d

    .line 212
    .line 213
    invoke-virtual {v0, v6}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    goto :goto_4

    .line 218
    :cond_d
    move p2, v5

    .line 219
    :goto_4
    if-nez p2, :cond_12

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_e
    if-eqz v0, :cond_f

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    goto :goto_5

    .line 229
    :cond_f
    move p2, v5

    .line 230
    :goto_5
    if-nez p2, :cond_12

    .line 231
    .line 232
    :goto_6
    iget-object p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 233
    .line 234
    if-eqz p2, :cond_10

    .line 235
    .line 236
    invoke-virtual {p2, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 237
    .line 238
    .line 239
    move-result p2

    .line 240
    goto :goto_7

    .line 241
    :cond_10
    move p2, v5

    .line 242
    :goto_7
    if-nez p2, :cond_11

    .line 243
    .line 244
    :goto_8
    move p2, v6

    .line 245
    goto :goto_b

    .line 246
    :cond_11
    :goto_9
    move p2, v5

    .line 247
    goto :goto_b

    .line 248
    :cond_12
    :goto_a
    iget p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->e:I

    .line 249
    .line 250
    int-to-float p2, p2

    .line 251
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->getFinishAnchor()F

    .line 252
    .line 253
    .line 254
    move-result p3

    .line 255
    cmpl-float p2, p2, p3

    .line 256
    .line 257
    if-ltz p2, :cond_13

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_13
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->getFinishAnchor()F

    .line 261
    .line 262
    .line 263
    goto :goto_9

    .line 264
    :goto_b
    iget-object p3, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 265
    .line 266
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 267
    .line 268
    .line 269
    move-result p3

    .line 270
    if-eqz p3, :cond_1a

    .line 271
    .line 272
    if-eq p3, v6, :cond_18

    .line 273
    .line 274
    if-eq p3, v3, :cond_16

    .line 275
    .line 276
    if-ne p3, v2, :cond_15

    .line 277
    .line 278
    if-eqz p2, :cond_14

    .line 279
    .line 280
    iget p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->b:I

    .line 281
    .line 282
    neg-int p2, p2

    .line 283
    goto :goto_c

    .line 284
    :cond_14
    move p2, v5

    .line 285
    :goto_c
    invoke-virtual {p1, v5, p2}, La/ygu0;->n(II)Z

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    if-eqz p1, :cond_1c

    .line 290
    .line 291
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 292
    .line 293
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 294
    .line 295
    .line 296
    goto :goto_10

    .line 297
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 298
    .line 299
    .line 300
    goto :goto_10

    .line 301
    :cond_16
    if-eqz p2, :cond_17

    .line 302
    .line 303
    iget p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->c:I

    .line 304
    .line 305
    neg-int p2, p2

    .line 306
    goto :goto_d

    .line 307
    :cond_17
    move p2, v5

    .line 308
    :goto_d
    invoke-virtual {p1, p2, v5}, La/ygu0;->n(II)Z

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    if-eqz p1, :cond_1c

    .line 313
    .line 314
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 315
    .line 316
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 317
    .line 318
    .line 319
    goto :goto_10

    .line 320
    :cond_18
    if-eqz p2, :cond_19

    .line 321
    .line 322
    iget p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->b:I

    .line 323
    .line 324
    goto :goto_e

    .line 325
    :cond_19
    move p2, v5

    .line 326
    :goto_e
    invoke-virtual {p1, v5, p2}, La/ygu0;->n(II)Z

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    if-eqz p1, :cond_1c

    .line 331
    .line 332
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 333
    .line 334
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 335
    .line 336
    .line 337
    goto :goto_10

    .line 338
    :cond_1a
    if-eqz p2, :cond_1b

    .line 339
    .line 340
    iget p2, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->c:I

    .line 341
    .line 342
    goto :goto_f

    .line 343
    :cond_1b
    move p2, v5

    .line 344
    :goto_f
    invoke-virtual {p1, p2, v5}, La/ygu0;->n(II)Z

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    if-eqz p1, :cond_1c

    .line 349
    .line 350
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 351
    .line 352
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 353
    .line 354
    .line 355
    :cond_1c
    :goto_10
    return-void

    .line 356
    :pswitch_0
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 357
    .line 358
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 359
    .line 360
    iget-byte v0, v0, La/piz;->a:B

    .line 361
    .line 362
    packed-switch v0, :pswitch_data_1

    .line 363
    .line 364
    .line 365
    cmpg-float v0, p2, v4

    .line 366
    .line 367
    if-gez v0, :cond_1d

    .line 368
    .line 369
    :goto_11
    move v0, v6

    .line 370
    goto :goto_12

    .line 371
    :cond_1d
    move v0, v5

    .line 372
    goto :goto_12

    .line 373
    :pswitch_1
    cmpl-float v0, p2, v4

    .line 374
    .line 375
    if-lez v0, :cond_1d

    .line 376
    .line 377
    goto :goto_11

    .line 378
    :goto_12
    if-eqz v0, :cond_1f

    .line 379
    .line 380
    :cond_1e
    :goto_13
    move v1, v2

    .line 381
    goto/16 :goto_1a

    .line 382
    .line 383
    :cond_1f
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 384
    .line 385
    iget-byte v7, v0, La/piz;->a:B

    .line 386
    .line 387
    const/high16 v8, 0x3f000000    # 0.5f

    .line 388
    .line 389
    packed-switch v7, :pswitch_data_2

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    int-to-float v7, v7

    .line 397
    iget-object v0, v0, La/piz;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 398
    .line 399
    iget v0, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->k:F

    .line 400
    .line 401
    mul-float/2addr v0, p2

    .line 402
    add-float/2addr v0, v7

    .line 403
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    cmpl-float v0, v0, v8

    .line 408
    .line 409
    if-lez v0, :cond_20

    .line 410
    .line 411
    :goto_14
    move v0, v6

    .line 412
    goto :goto_15

    .line 413
    :cond_20
    move v0, v5

    .line 414
    goto :goto_15

    .line 415
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 416
    .line 417
    .line 418
    move-result v7

    .line 419
    int-to-float v7, v7

    .line 420
    iget-object v0, v0, La/piz;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 421
    .line 422
    iget v0, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->k:F

    .line 423
    .line 424
    mul-float/2addr v0, p2

    .line 425
    add-float/2addr v0, v7

    .line 426
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    cmpl-float v0, v0, v8

    .line 431
    .line 432
    if-lez v0, :cond_20

    .line 433
    .line 434
    goto :goto_14

    .line 435
    :goto_15
    if-eqz v0, :cond_23

    .line 436
    .line 437
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 438
    .line 439
    iget-byte v0, v0, La/piz;->a:B

    .line 440
    .line 441
    const/high16 v4, 0x43fa0000    # 500.0f

    .line 442
    .line 443
    packed-switch v0, :pswitch_data_3

    .line 444
    .line 445
    .line 446
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 451
    .line 452
    .line 453
    move-result p3

    .line 454
    cmpl-float p3, v0, p3

    .line 455
    .line 456
    if-lez p3, :cond_21

    .line 457
    .line 458
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 459
    .line 460
    .line 461
    move-result p2

    .line 462
    cmpl-float p2, p2, v4

    .line 463
    .line 464
    if-lez p2, :cond_21

    .line 465
    .line 466
    :goto_16
    move p2, v6

    .line 467
    goto :goto_17

    .line 468
    :cond_21
    move p2, v5

    .line 469
    goto :goto_17

    .line 470
    :pswitch_3
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 475
    .line 476
    .line 477
    move-result p3

    .line 478
    cmpl-float p3, v0, p3

    .line 479
    .line 480
    if-lez p3, :cond_21

    .line 481
    .line 482
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 483
    .line 484
    .line 485
    move-result p2

    .line 486
    cmpl-float p2, p2, v4

    .line 487
    .line 488
    if-lez p2, :cond_21

    .line 489
    .line 490
    goto :goto_16

    .line 491
    :goto_17
    if-nez p2, :cond_25

    .line 492
    .line 493
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 494
    .line 495
    iget-byte p3, p2, La/piz;->a:B

    .line 496
    .line 497
    packed-switch p3, :pswitch_data_4

    .line 498
    .line 499
    .line 500
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 501
    .line 502
    .line 503
    move-result p3

    .line 504
    iget-object v0, p2, La/piz;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 505
    .line 506
    iget v0, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 507
    .line 508
    invoke-virtual {p2}, La/piz;->C()I

    .line 509
    .line 510
    .line 511
    move-result p2

    .line 512
    add-int/2addr p2, v0

    .line 513
    div-int/2addr p2, v3

    .line 514
    if-le p3, p2, :cond_22

    .line 515
    .line 516
    :goto_18
    move v5, v6

    .line 517
    goto :goto_19

    .line 518
    :pswitch_4
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 519
    .line 520
    .line 521
    move-result p3

    .line 522
    invoke-virtual {p2}, La/piz;->C()I

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    invoke-virtual {p2}, La/piz;->D()I

    .line 527
    .line 528
    .line 529
    move-result p2

    .line 530
    sub-int/2addr v0, p2

    .line 531
    div-int/2addr v0, v3

    .line 532
    if-ge p3, v0, :cond_22

    .line 533
    .line 534
    goto :goto_18

    .line 535
    :cond_22
    :goto_19
    if-eqz v5, :cond_1e

    .line 536
    .line 537
    goto :goto_1a

    .line 538
    :cond_23
    cmpl-float v0, p2, v4

    .line 539
    .line 540
    if-eqz v0, :cond_24

    .line 541
    .line 542
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 543
    .line 544
    .line 545
    move-result p2

    .line 546
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 547
    .line 548
    .line 549
    move-result p3

    .line 550
    cmpl-float p2, p2, p3

    .line 551
    .line 552
    if-lez p2, :cond_24

    .line 553
    .line 554
    goto :goto_1a

    .line 555
    :cond_24
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 556
    .line 557
    .line 558
    move-result p2

    .line 559
    iget-object p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 560
    .line 561
    invoke-virtual {p3}, La/piz;->C()I

    .line 562
    .line 563
    .line 564
    move-result p3

    .line 565
    sub-int p3, p2, p3

    .line 566
    .line 567
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 568
    .line 569
    .line 570
    move-result p3

    .line 571
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 572
    .line 573
    invoke-virtual {v0}, La/piz;->D()I

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    sub-int/2addr p2, v0

    .line 578
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 579
    .line 580
    .line 581
    move-result p2

    .line 582
    if-ge p3, p2, :cond_25

    .line 583
    .line 584
    goto/16 :goto_13

    .line 585
    .line 586
    :cond_25
    :goto_1a
    invoke-virtual {p0, p1, v1, v6}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->A(Landroid/view/View;IZ)V

    .line 587
    .line 588
    .line 589
    return-void

    .line 590
    :pswitch_5
    cmpg-float v0, p3, v4

    .line 591
    .line 592
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 593
    .line 594
    const/4 v5, 0x6

    .line 595
    if-gez v0, :cond_28

    .line 596
    .line 597
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 598
    .line 599
    if-eqz p2, :cond_27

    .line 600
    .line 601
    :cond_26
    :goto_1b
    move v1, v2

    .line 602
    goto/16 :goto_1e

    .line 603
    .line 604
    :cond_27
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 605
    .line 606
    .line 607
    move-result p2

    .line 608
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 609
    .line 610
    .line 611
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 612
    .line 613
    if-le p2, p3, :cond_26

    .line 614
    .line 615
    goto :goto_1c

    .line 616
    :cond_28
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 617
    .line 618
    if-eqz v0, :cond_2d

    .line 619
    .line 620
    invoke-virtual {p0, p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P(Landroid/view/View;F)Z

    .line 621
    .line 622
    .line 623
    move-result v0

    .line 624
    if-eqz v0, :cond_2d

    .line 625
    .line 626
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 627
    .line 628
    .line 629
    move-result p2

    .line 630
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    cmpg-float p2, p2, v0

    .line 635
    .line 636
    if-gez p2, :cond_29

    .line 637
    .line 638
    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d:I

    .line 639
    .line 640
    int-to-float p2, p2

    .line 641
    cmpl-float p2, p3, p2

    .line 642
    .line 643
    if-gtz p2, :cond_33

    .line 644
    .line 645
    :cond_29
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 646
    .line 647
    .line 648
    move-result p2

    .line 649
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 650
    .line 651
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    add-int/2addr v0, p3

    .line 656
    div-int/2addr v0, v3

    .line 657
    if-le p2, v0, :cond_2a

    .line 658
    .line 659
    goto/16 :goto_1e

    .line 660
    .line 661
    :cond_2a
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 662
    .line 663
    if-eqz p2, :cond_2b

    .line 664
    .line 665
    goto :goto_1b

    .line 666
    :cond_2b
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 667
    .line 668
    .line 669
    move-result p2

    .line 670
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 671
    .line 672
    .line 673
    move-result p3

    .line 674
    sub-int/2addr p2, p3

    .line 675
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 676
    .line 677
    .line 678
    move-result p2

    .line 679
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 680
    .line 681
    .line 682
    move-result p3

    .line 683
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 684
    .line 685
    sub-int/2addr p3, v0

    .line 686
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 687
    .line 688
    .line 689
    move-result p3

    .line 690
    if-ge p2, p3, :cond_2c

    .line 691
    .line 692
    goto :goto_1b

    .line 693
    :cond_2c
    :goto_1c
    move v1, v5

    .line 694
    goto :goto_1e

    .line 695
    :cond_2d
    cmpl-float v0, p3, v4

    .line 696
    .line 697
    const/4 v1, 0x4

    .line 698
    if-eqz v0, :cond_30

    .line 699
    .line 700
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 701
    .line 702
    .line 703
    move-result p2

    .line 704
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 705
    .line 706
    .line 707
    move-result p3

    .line 708
    cmpl-float p2, p2, p3

    .line 709
    .line 710
    if-lez p2, :cond_2e

    .line 711
    .line 712
    goto :goto_1d

    .line 713
    :cond_2e
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 714
    .line 715
    if-eqz p2, :cond_2f

    .line 716
    .line 717
    goto :goto_1e

    .line 718
    :cond_2f
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 719
    .line 720
    .line 721
    move-result p2

    .line 722
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 723
    .line 724
    sub-int p3, p2, p3

    .line 725
    .line 726
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 727
    .line 728
    .line 729
    move-result p3

    .line 730
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 731
    .line 732
    sub-int/2addr p2, v0

    .line 733
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 734
    .line 735
    .line 736
    move-result p2

    .line 737
    if-ge p3, p2, :cond_33

    .line 738
    .line 739
    goto :goto_1c

    .line 740
    :cond_30
    :goto_1d
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 741
    .line 742
    .line 743
    move-result p2

    .line 744
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:Z

    .line 745
    .line 746
    if-eqz p3, :cond_31

    .line 747
    .line 748
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E:I

    .line 749
    .line 750
    sub-int p3, p2, p3

    .line 751
    .line 752
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 753
    .line 754
    .line 755
    move-result p3

    .line 756
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 757
    .line 758
    sub-int/2addr p2, v0

    .line 759
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 760
    .line 761
    .line 762
    move-result p2

    .line 763
    if-ge p3, p2, :cond_33

    .line 764
    .line 765
    goto/16 :goto_1b

    .line 766
    .line 767
    :cond_31
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->F:I

    .line 768
    .line 769
    if-ge p2, p3, :cond_32

    .line 770
    .line 771
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 772
    .line 773
    sub-int p3, p2, p3

    .line 774
    .line 775
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 776
    .line 777
    .line 778
    move-result p3

    .line 779
    if-ge p2, p3, :cond_2c

    .line 780
    .line 781
    goto/16 :goto_1b

    .line 782
    .line 783
    :cond_32
    sub-int p3, p2, p3

    .line 784
    .line 785
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 786
    .line 787
    .line 788
    move-result p3

    .line 789
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 790
    .line 791
    sub-int/2addr p2, v0

    .line 792
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 793
    .line 794
    .line 795
    move-result p2

    .line 796
    if-ge p3, p2, :cond_33

    .line 797
    .line 798
    goto :goto_1c

    .line 799
    :cond_33
    :goto_1e
    invoke-virtual {p0, p1, v1, v6}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q(Landroid/view/View;IZ)V

    .line 800
    .line 801
    .line 802
    return-void

    .line 803
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
    .end packed-switch

    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch

    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch

    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_4
    .end packed-switch
.end method

.method public final C(Landroid/view/View;I)Z
    .locals 4

    .line 1
    iget-byte v0, p0, La/no8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/no8;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 14
    .line 15
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->j:Landroid/view/View;

    .line 16
    .line 17
    if-ne p1, p0, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_0
    return v1

    .line 21
    :pswitch_0
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 22
    .line 23
    iget p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 24
    .line 25
    if-ne p2, v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-ne p0, p1, :cond_2

    .line 37
    .line 38
    move v1, v2

    .line 39
    :cond_2
    :goto_0
    return v1

    .line 40
    :pswitch_1
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 41
    .line 42
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 43
    .line 44
    if-ne v0, v2, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g0:Z

    .line 48
    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_4
    const/4 v3, 0x3

    .line 53
    if-ne v0, v3, :cond_7

    .line 54
    .line 55
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:I

    .line 56
    .line 57
    if-ne v0, p2, :cond_7

    .line 58
    .line 59
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e:Z

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    if-eqz p2, :cond_5

    .line 63
    .line 64
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f0:Ljava/lang/ref/WeakReference;

    .line 65
    .line 66
    if-eqz p2, :cond_6

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    move-object v0, p2

    .line 73
    check-cast v0, Landroid/view/View;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_6

    .line 83
    .line 84
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    move-object v0, p2

    .line 95
    check-cast v0, Landroid/view/View;

    .line 96
    .line 97
    :cond_6
    :goto_1
    if-eqz v0, :cond_7

    .line 98
    .line 99
    const/4 p2, -0x1

    .line 100
    invoke-virtual {v0, p2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_7

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/lang/ref/WeakReference;

    .line 111
    .line 112
    if-eqz p0, :cond_8

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-ne p0, p1, :cond_8

    .line 119
    .line 120
    move v1, v2

    .line 121
    :cond_8
    :goto_2
    return v1

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Landroid/view/View;I)I
    .locals 4

    .line 1
    iget-byte v0, p0, La/no8;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/no8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 12
    .line 13
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->i:La/son0;

    .line 14
    .line 15
    sget-object v0, La/son0;->c:La/son0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, -0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-ne p1, v0, :cond_3

    .line 21
    .line 22
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v3

    .line 32
    :goto_0
    if-nez p1, :cond_1

    .line 33
    .line 34
    if-lez p2, :cond_1

    .line 35
    .line 36
    sget-object p1, La/ton0;->a:La/ton0;

    .line 37
    .line 38
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move p1, v3

    .line 51
    :goto_1
    if-nez p1, :cond_3

    .line 52
    .line 53
    if-gez p2, :cond_3

    .line 54
    .line 55
    sget-object p1, La/ton0;->c:La/ton0;

    .line 56
    .line 57
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 58
    .line 59
    :cond_3
    :goto_2
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 60
    .line 61
    sget-object v0, La/ton0;->a:La/ton0;

    .line 62
    .line 63
    if-ne p1, v0, :cond_5

    .line 64
    .line 65
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move p1, v3

    .line 75
    :goto_3
    if-nez p1, :cond_5

    .line 76
    .line 77
    if-lez p2, :cond_5

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iget p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->c:I

    .line 84
    .line 85
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    goto :goto_5

    .line 94
    :cond_5
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 95
    .line 96
    sget-object v0, La/ton0;->c:La/ton0;

    .line 97
    .line 98
    if-ne p1, v0, :cond_7

    .line 99
    .line 100
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 101
    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    invoke-virtual {p1, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    goto :goto_4

    .line 109
    :cond_6
    move p1, v3

    .line 110
    :goto_4
    if-nez p1, :cond_7

    .line 111
    .line 112
    if-gez p2, :cond_7

    .line 113
    .line 114
    iget p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->c:I

    .line 115
    .line 116
    neg-int p1, p1

    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    :cond_7
    :goto_5
    return v3

    .line 130
    :pswitch_0
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 131
    .line 132
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 133
    .line 134
    iget-byte v0, p1, La/piz;->a:B

    .line 135
    .line 136
    packed-switch v0, :pswitch_data_1

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, La/piz;->C()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    goto :goto_6

    .line 144
    :pswitch_1
    iget-object p1, p1, La/piz;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 145
    .line 146
    iget p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->l:I

    .line 147
    .line 148
    neg-int p1, p1

    .line 149
    :goto_6
    iget-object p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 150
    .line 151
    iget-byte v0, p0, La/piz;->a:B

    .line 152
    .line 153
    packed-switch v0, :pswitch_data_2

    .line 154
    .line 155
    .line 156
    iget-object p0, p0, La/piz;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 157
    .line 158
    iget p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :pswitch_2
    iget-object p0, p0, La/piz;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 162
    .line 163
    iget p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:I

    .line 164
    .line 165
    :goto_7
    invoke-static {p2, p1, p0}, La/r7x;->u(III)I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    return p0

    .line 170
    :pswitch_3
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    return p0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
    .end packed-switch

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method

.method public final n(Landroid/view/View;I)I
    .locals 4

    .line 1
    iget-byte v0, p0, La/no8;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/no8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 12
    .line 13
    iget-object p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->i:La/son0;

    .line 14
    .line 15
    sget-object p1, La/son0;->b:La/son0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    const/4 v2, -0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-ne p0, p1, :cond_3

    .line 21
    .line 22
    iget-object p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p0, v3

    .line 32
    :goto_0
    if-nez p0, :cond_1

    .line 33
    .line 34
    if-lez p2, :cond_1

    .line 35
    .line 36
    sget-object p0, La/ton0;->b:La/ton0;

    .line 37
    .line 38
    iput-object p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    iget-object p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 42
    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move p0, v3

    .line 51
    :goto_1
    if-nez p0, :cond_3

    .line 52
    .line 53
    if-gez p2, :cond_3

    .line 54
    .line 55
    sget-object p0, La/ton0;->d:La/ton0;

    .line 56
    .line 57
    iput-object p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 58
    .line 59
    :cond_3
    :goto_2
    iget-object p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 60
    .line 61
    sget-object p1, La/ton0;->b:La/ton0;

    .line 62
    .line 63
    if-ne p0, p1, :cond_5

    .line 64
    .line 65
    iget-object p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 66
    .line 67
    if-eqz p0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move p0, v3

    .line 75
    :goto_3
    if-nez p0, :cond_5

    .line 76
    .line 77
    if-lez p2, :cond_5

    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    iget p1, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->b:I

    .line 84
    .line 85
    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    goto :goto_5

    .line 94
    :cond_5
    iget-object p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 95
    .line 96
    sget-object p1, La/ton0;->d:La/ton0;

    .line 97
    .line 98
    if-ne p0, p1, :cond_7

    .line 99
    .line 100
    iget-object p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->k:Landroid/view/View;

    .line 101
    .line 102
    if-eqz p0, :cond_6

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    goto :goto_4

    .line 109
    :cond_6
    move p0, v3

    .line 110
    :goto_4
    if-nez p0, :cond_7

    .line 111
    .line 112
    if-gez p2, :cond_7

    .line 113
    .line 114
    iget p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->b:I

    .line 115
    .line 116
    neg-int p0, p0

    .line 117
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    :cond_7
    :goto_5
    return v3

    .line 130
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    return p0

    .line 135
    :pswitch_1
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p0, p1}, La/no8;->v(Landroid/view/View;)I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    invoke-static {p2, v0, p0}, La/r7x;->u(III)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    return p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public u(Landroid/view/View;)I
    .locals 2

    .line 1
    iget-byte v0, p0, La/no8;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/no8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, La/pvm0;->u(Landroid/view/View;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 17
    .line 18
    iget p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->c:I

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_1
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 22
    .line 23
    iget p0, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->l:I

    .line 24
    .line 25
    iget p1, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:I

    .line 26
    .line 27
    add-int/2addr p0, p1

    .line 28
    return p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public v(Landroid/view/View;)I
    .locals 2

    .line 1
    iget-byte v0, p0, La/no8;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/no8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    invoke-super {p0, p1}, La/pvm0;->v(Landroid/view/View;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 17
    .line 18
    iget p0, v1, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->b:I

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_2
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 22
    .line 23
    iget-boolean p0, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    iget p0, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->X:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget p0, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->H:I

    .line 31
    .line 32
    :goto_0
    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final y(I)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/no8;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/no8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 10
    .line 11
    iget-byte v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->d:B

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    const/4 v2, 0x0

    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-ne v0, v3, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v0, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    :goto_0
    move v0, v1

    .line 26
    :goto_1
    if-nez p1, :cond_3

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_3
    move v1, v2

    .line 30
    :goto_2
    if-eqz v0, :cond_4

    .line 31
    .line 32
    if-eqz v1, :cond_4

    .line 33
    .line 34
    iget v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->e:I

    .line 35
    .line 36
    invoke-static {p0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->a(Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ne v0, v1, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->getDoOnFinish()Lkotlin/jvm/functions/Function0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_4
    iput-byte p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->d:B

    .line 50
    .line 51
    :goto_3
    return-void

    .line 52
    :pswitch_0
    if-ne p1, v1, :cond_5

    .line 53
    .line 54
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 55
    .line 56
    iget-boolean p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->g:Z

    .line 57
    .line 58
    if-eqz p1, :cond_5

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->y(I)V

    .line 61
    .line 62
    .line 63
    :cond_5
    return-void

    .line 64
    :pswitch_1
    if-ne p1, v1, :cond_6

    .line 65
    .line 66
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 67
    .line 68
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 69
    .line 70
    if-eqz p1, :cond_6

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 73
    .line 74
    .line 75
    :cond_6
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z(Landroid/view/View;II)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/no8;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/no8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;

    .line 12
    .line 13
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->l:La/ton0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eq p1, v0, :cond_1

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eq p1, v0, :cond_2

    .line 26
    .line 27
    const/4 p2, 0x3

    .line 28
    if-ne p1, p2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    :goto_0
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    :goto_1
    iput p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->e:I

    .line 45
    .line 46
    int-to-float p1, p1

    .line 47
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->getFinishAnchor()F

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    div-float/2addr p1, p2

    .line 52
    const/high16 p2, 0x3f800000    # 1.0f

    .line 53
    .line 54
    cmpl-float p3, p1, p2

    .line 55
    .line 56
    if-ltz p3, :cond_3

    .line 57
    .line 58
    move p1, p2

    .line 59
    :cond_3
    iget p3, p0, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->e:I

    .line 60
    .line 61
    int-to-float p3, p3

    .line 62
    invoke-static {p0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->a(Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    int-to-float v0, v0

    .line 67
    div-float/2addr p3, v0

    .line 68
    cmpl-float v0, p3, p2

    .line 69
    .line 70
    if-ltz v0, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move p2, p3

    .line 74
    :goto_2
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/SwipeBackLayout;->getDoOnSwipeBack()Lkotlin/jvm/functions/Function2;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :goto_3
    return-void

    .line 90
    :pswitch_0
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 91
    .line 92
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->q:Ljava/lang/ref/WeakReference;

    .line 93
    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Landroid/view/View;

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    const/4 p2, 0x0

    .line 104
    :goto_4
    if-eqz p2, :cond_7

    .line 105
    .line 106
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 111
    .line 112
    if-eqz p3, :cond_7

    .line 113
    .line 114
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iget-byte v2, v0, La/piz;->a:B

    .line 125
    .line 126
    packed-switch v2, :pswitch_data_1

    .line 127
    .line 128
    .line 129
    iget-object p1, v0, La/piz;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 130
    .line 131
    iget p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 132
    .line 133
    if-gt v1, p1, :cond_6

    .line 134
    .line 135
    sub-int/2addr p1, v1

    .line 136
    iput p1, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :pswitch_1
    iget-object v0, v0, La/piz;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 140
    .line 141
    iget v0, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 142
    .line 143
    if-gt v1, v0, :cond_6

    .line 144
    .line 145
    iput p1, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 146
    .line 147
    :cond_6
    :goto_5
    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    .line 149
    .line 150
    :cond_7
    iget-object p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->v:Ljava/util/LinkedHashSet;

    .line 151
    .line 152
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    if-nez p2, :cond_9

    .line 157
    .line 158
    iget-object p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->a:La/piz;

    .line 159
    .line 160
    iget-byte p2, p0, La/piz;->a:B

    .line 161
    .line 162
    packed-switch p2, :pswitch_data_2

    .line 163
    .line 164
    .line 165
    iget-object p2, p0, La/piz;->b:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 166
    .line 167
    iget p2, p2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->m:I

    .line 168
    .line 169
    invoke-virtual {p0}, La/piz;->C()I

    .line 170
    .line 171
    .line 172
    goto :goto_6

    .line 173
    :pswitch_2
    invoke-virtual {p0}, La/piz;->D()I

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, La/piz;->C()I

    .line 177
    .line 178
    .line 179
    :goto_6
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    if-nez p1, :cond_8

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_8
    invoke-static {p0}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    throw p0

    .line 195
    :cond_9
    :goto_7
    return-void

    .line 196
    :pswitch_3
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 197
    .line 198
    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
    .end packed-switch

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
