.class public final synthetic La/jak0;
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
    iput-byte p1, p0, La/jak0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/jak0;->a:B

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const-string v2, "Missing required view with ID: "

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v0, p1

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Throwable;

    .line 16
    .line 17
    move-object/from16 v0, p2

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    move-object/from16 v0, p1

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Throwable;

    .line 27
    .line 28
    move-object/from16 v0, p2

    .line 29
    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_1
    move-object/from16 v0, p1

    .line 36
    .line 37
    check-cast v0, Ljava/lang/Throwable;

    .line 38
    .line 39
    move-object/from16 v0, p2

    .line 40
    .line 41
    check-cast v0, Ljava/lang/String;

    .line 42
    .line 43
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_2
    move-object/from16 v0, p1

    .line 47
    .line 48
    check-cast v0, Ljava/lang/Throwable;

    .line 49
    .line 50
    move-object/from16 v0, p2

    .line 51
    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_3
    move-object/from16 v0, p1

    .line 58
    .line 59
    check-cast v0, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-object/from16 v0, p2

    .line 65
    .line 66
    check-cast v0, La/v2n;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, La/v2n;->a:Ljava/lang/String;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_4
    move-object/from16 v0, p1

    .line 75
    .line 76
    check-cast v0, Ljava/lang/Integer;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-object/from16 v0, p2

    .line 82
    .line 83
    check-cast v0, La/v2n;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, La/v2n;->a:Ljava/lang/String;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_5
    move-object/from16 v0, p1

    .line 92
    .line 93
    check-cast v0, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-object/from16 v0, p2

    .line 99
    .line 100
    check-cast v0, La/v2n;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v0, v0, La/v2n;->a:Ljava/lang/String;

    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_6
    move-object/from16 v0, p1

    .line 109
    .line 110
    check-cast v0, Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-object/from16 v0, p2

    .line 116
    .line 117
    check-cast v0, La/usm;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget v0, v0, La/usm;->a:I

    .line 123
    .line 124
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0

    .line 129
    :pswitch_7
    move-object/from16 v0, p1

    .line 130
    .line 131
    check-cast v0, Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-object/from16 v0, p2

    .line 137
    .line 138
    check-cast v0, La/dsm;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-interface {v0}, La/dsm;->getKey()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :pswitch_8
    move-object/from16 v0, p1

    .line 149
    .line 150
    check-cast v0, Ljava/lang/Integer;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 153
    .line 154
    .line 155
    move-object/from16 v0, p2

    .line 156
    .line 157
    check-cast v0, La/dsm;

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-interface {v0}, La/dsm;->getKey()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0

    .line 167
    :pswitch_9
    move-object/from16 v0, p1

    .line 168
    .line 169
    check-cast v0, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-object/from16 v0, p2

    .line 175
    .line 176
    check-cast v0, La/dsm;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-interface {v0}, La/dsm;->getKey()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    return-object v0

    .line 186
    :pswitch_a
    move-object/from16 v0, p1

    .line 187
    .line 188
    check-cast v0, Ljava/lang/Integer;

    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 191
    .line 192
    .line 193
    move-object/from16 v0, p2

    .line 194
    .line 195
    check-cast v0, La/dsm;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-interface {v0}, La/dsm;->getKey()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    return-object v0

    .line 205
    :pswitch_b
    move-object/from16 v0, p1

    .line 206
    .line 207
    check-cast v0, Landroid/view/LayoutInflater;

    .line 208
    .line 209
    move-object/from16 v1, p2

    .line 210
    .line 211
    check-cast v1, Landroid/view/ViewGroup;

    .line 212
    .line 213
    const v2, 0x7f0d0055

    .line 214
    .line 215
    .line 216
    invoke-static {v0, v1, v2, v1, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-eqz v0, :cond_0

    .line 221
    .line 222
    check-cast v0, Lcom/google/android/material/chip/Chip;

    .line 223
    .line 224
    new-instance v3, La/ds6;

    .line 225
    .line 226
    invoke-direct {v3, v0, v0}, La/ds6;-><init>(Lcom/google/android/material/chip/Chip;Lcom/google/android/material/chip/Chip;)V

    .line 227
    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_0
    const-string v0, "rootView"

    .line 231
    .line 232
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :goto_0
    return-object v3

    .line 236
    :pswitch_c
    move-object/from16 v0, p1

    .line 237
    .line 238
    check-cast v0, Landroid/view/LayoutInflater;

    .line 239
    .line 240
    move-object/from16 v1, p2

    .line 241
    .line 242
    check-cast v1, Landroid/view/ViewGroup;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-static {v0, v1}, La/wxx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/wxx;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    return-object v0

    .line 255
    :pswitch_d
    move-object/from16 v0, p1

    .line 256
    .line 257
    check-cast v0, Landroid/view/LayoutInflater;

    .line 258
    .line 259
    move-object/from16 v1, p2

    .line 260
    .line 261
    check-cast v1, Landroid/view/ViewGroup;

    .line 262
    .line 263
    const v5, 0x7f0d0588

    .line 264
    .line 265
    .line 266
    invoke-static {v0, v1, v5, v1, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    const v1, 0x7f0a0116

    .line 271
    .line 272
    .line 273
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    check-cast v4, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 278
    .line 279
    if-eqz v4, :cond_1

    .line 280
    .line 281
    const v1, 0x7f0a0730

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    check-cast v5, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 289
    .line 290
    if-eqz v5, :cond_1

    .line 291
    .line 292
    const v1, 0x7f0a0f62

    .line 293
    .line 294
    .line 295
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    check-cast v6, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 300
    .line 301
    if-eqz v6, :cond_1

    .line 302
    .line 303
    new-instance v3, La/rok0;

    .line 304
    .line 305
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 306
    .line 307
    invoke-direct {v3, v0, v4, v5, v6}, La/rok0;-><init>(Lorg/xplatform/uikit/components/cells/DsMenuCell;Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 308
    .line 309
    .line 310
    goto :goto_1

    .line 311
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    :goto_1
    return-object v3

    .line 327
    :pswitch_e
    move-object/from16 v0, p1

    .line 328
    .line 329
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 330
    .line 331
    move-object/from16 v1, p2

    .line 332
    .line 333
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    sget-object v2, La/ewk0;->a:La/ewk0;

    .line 342
    .line 343
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    new-instance v0, La/pdk0;

    .line 347
    .line 348
    const/16 v2, 0x1a

    .line 349
    .line 350
    invoke-direct {v0, v2}, La/pdk0;-><init>(B)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    return-object v0

    .line 359
    :pswitch_f
    move-object/from16 v0, p1

    .line 360
    .line 361
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 362
    .line 363
    move-object/from16 v1, p2

    .line 364
    .line 365
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    sget-object v2, La/dwk0;->a:La/dwk0;

    .line 374
    .line 375
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    new-instance v0, La/pdk0;

    .line 379
    .line 380
    const/16 v2, 0x19

    .line 381
    .line 382
    invoke-direct {v0, v2}, La/pdk0;-><init>(B)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object v0

    .line 391
    :pswitch_10
    move-object/from16 v0, p1

    .line 392
    .line 393
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 394
    .line 395
    move-object/from16 v1, p2

    .line 396
    .line 397
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    sget-object v2, La/cwk0;->a:La/cwk0;

    .line 406
    .line 407
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    new-instance v0, La/pdk0;

    .line 411
    .line 412
    const/16 v2, 0x18

    .line 413
    .line 414
    invoke-direct {v0, v2}, La/pdk0;-><init>(B)V

    .line 415
    .line 416
    .line 417
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 421
    .line 422
    return-object v0

    .line 423
    :pswitch_11
    move-object/from16 v0, p1

    .line 424
    .line 425
    check-cast v0, Ljava/lang/Throwable;

    .line 426
    .line 427
    move-object/from16 v1, p2

    .line 428
    .line 429
    check-cast v1, Ljava/lang/String;

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
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_12
    move-object/from16 v0, p1

    .line 441
    .line 442
    check-cast v0, La/oyg0;

    .line 443
    .line 444
    move-object/from16 v1, p2

    .line 445
    .line 446
    check-cast v1, La/dvk0;

    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    iget-object v0, v1, La/dvk0;->q:La/gqk0;

    .line 455
    .line 456
    iget-object v2, v0, La/gqk0;->b:La/o0;

    .line 457
    .line 458
    instance-of v3, v2, La/n0;

    .line 459
    .line 460
    if-eqz v3, :cond_2

    .line 461
    .line 462
    check-cast v2, La/n0;

    .line 463
    .line 464
    iget-boolean v3, v2, La/n0;->g:Z

    .line 465
    .line 466
    xor-int/lit8 v11, v3, 0x1

    .line 467
    .line 468
    iget-object v5, v2, La/n0;->a:Ljava/lang/Long;

    .line 469
    .line 470
    iget-object v6, v2, La/n0;->b:Ljava/lang/Long;

    .line 471
    .line 472
    iget-object v7, v2, La/n0;->c:Ljava/lang/String;

    .line 473
    .line 474
    iget-object v8, v2, La/n0;->d:Ljava/lang/String;

    .line 475
    .line 476
    iget-object v9, v2, La/n0;->e:Ljava/lang/String;

    .line 477
    .line 478
    iget-object v10, v2, La/n0;->f:Ljava/lang/String;

    .line 479
    .line 480
    new-instance v4, La/n0;

    .line 481
    .line 482
    invoke-direct/range {v4 .. v11}, La/n0;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 483
    .line 484
    .line 485
    iget-object v0, v0, La/gqk0;->a:La/btk0;

    .line 486
    .line 487
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    new-instance v2, La/gqk0;

    .line 491
    .line 492
    invoke-direct {v2, v0, v4}, La/gqk0;-><init>(La/btk0;La/o0;)V

    .line 493
    .line 494
    .line 495
    const/16 v28, 0x0

    .line 496
    .line 497
    const v29, 0x3ffeffff

    .line 498
    .line 499
    .line 500
    move-object/from16 v17, v2

    .line 501
    .line 502
    const/4 v2, 0x0

    .line 503
    const/4 v3, 0x0

    .line 504
    const/4 v4, 0x0

    .line 505
    const/4 v5, 0x0

    .line 506
    const/4 v6, 0x0

    .line 507
    const/4 v7, 0x0

    .line 508
    const/4 v8, 0x0

    .line 509
    const/4 v9, 0x0

    .line 510
    const/4 v10, 0x0

    .line 511
    const/4 v11, 0x0

    .line 512
    const/4 v12, 0x0

    .line 513
    const/4 v13, 0x0

    .line 514
    const/4 v14, 0x0

    .line 515
    const/4 v15, 0x0

    .line 516
    const/16 v16, 0x0

    .line 517
    .line 518
    const/16 v18, 0x0

    .line 519
    .line 520
    const/16 v19, 0x0

    .line 521
    .line 522
    const/16 v20, 0x0

    .line 523
    .line 524
    const/16 v21, 0x0

    .line 525
    .line 526
    const/16 v22, 0x0

    .line 527
    .line 528
    const/16 v23, 0x0

    .line 529
    .line 530
    const/16 v24, 0x0

    .line 531
    .line 532
    const/16 v25, 0x0

    .line 533
    .line 534
    const/16 v26, 0x0

    .line 535
    .line 536
    const/16 v27, 0x0

    .line 537
    .line 538
    invoke-static/range {v1 .. v29}, La/dvk0;->a(La/dvk0;ZLa/xl9;La/a9l0;La/sdt;La/ptk0;La/cvk0;La/gvk0;La/evk0;La/lpp0;La/pvk0;La/rtk0;La/fvk0;La/bvk0;La/otk0;La/jwk0;La/gqk0;La/gtk0;La/ltk0;La/etk0;La/qtk0;La/ntk0;La/dtk0;La/avk0;La/ctk0;La/stk0;La/wcb;La/mtk0;I)La/dvk0;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    :cond_2
    return-object v1

    .line 543
    :pswitch_13
    move-object/from16 v0, p1

    .line 544
    .line 545
    check-cast v0, La/oyg0;

    .line 546
    .line 547
    move-object/from16 v5, p2

    .line 548
    .line 549
    check-cast v5, La/dvk0;

    .line 550
    .line 551
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    new-instance v0, La/fvk0;

    .line 558
    .line 559
    sget-object v1, La/iun;->a:La/iun;

    .line 560
    .line 561
    sget-object v2, La/atk0;->a:La/atk0;

    .line 562
    .line 563
    invoke-direct {v0, v2, v1, v1, v1}, La/fvk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 564
    .line 565
    .line 566
    new-instance v6, La/bvk0;

    .line 567
    .line 568
    invoke-direct {v6, v2, v1, v1}, La/bvk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;)V

    .line 569
    .line 570
    .line 571
    new-instance v13, La/evk0;

    .line 572
    .line 573
    invoke-direct {v13, v2, v1}, La/evk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 574
    .line 575
    .line 576
    sget-object v7, La/xun;->a:La/xun;

    .line 577
    .line 578
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    new-instance v14, La/lpp0;

    .line 582
    .line 583
    new-instance v8, La/wpp0;

    .line 584
    .line 585
    invoke-direct {v8, v2, v1}, La/wpp0;-><init>(La/btk0;Ljava/util/List;)V

    .line 586
    .line 587
    .line 588
    new-instance v9, La/vpp0;

    .line 589
    .line 590
    invoke-direct {v9, v2, v1}, La/vpp0;-><init>(La/btk0;Ljava/util/List;)V

    .line 591
    .line 592
    .line 593
    new-instance v10, La/opp0;

    .line 594
    .line 595
    invoke-direct {v10, v2, v1, v7}, La/opp0;-><init>(La/btk0;Ljava/util/List;Ljava/util/Set;)V

    .line 596
    .line 597
    .line 598
    invoke-direct {v14, v8, v9, v10}, La/lpp0;-><init>(La/wpp0;La/vpp0;La/opp0;)V

    .line 599
    .line 600
    .line 601
    new-instance v7, La/rtk0;

    .line 602
    .line 603
    invoke-direct {v7, v2, v1}, La/rtk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 604
    .line 605
    .line 606
    new-instance v15, La/pvk0;

    .line 607
    .line 608
    invoke-direct {v15, v2, v1, v1}, La/pvk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;)V

    .line 609
    .line 610
    .line 611
    new-instance v8, La/otk0;

    .line 612
    .line 613
    invoke-direct {v8, v2, v1}, La/otk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 614
    .line 615
    .line 616
    new-instance v9, La/jwk0;

    .line 617
    .line 618
    invoke-direct {v9, v2, v1, v4}, La/jwk0;-><init>(La/btk0;Ljava/util/List;I)V

    .line 619
    .line 620
    .line 621
    new-instance v10, La/gqk0;

    .line 622
    .line 623
    invoke-direct {v10, v2, v3}, La/gqk0;-><init>(La/btk0;La/o0;)V

    .line 624
    .line 625
    .line 626
    new-instance v11, La/etk0;

    .line 627
    .line 628
    invoke-direct {v11, v2, v1}, La/etk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 629
    .line 630
    .line 631
    new-instance v12, La/qtk0;

    .line 632
    .line 633
    invoke-direct {v12, v2, v3}, La/qtk0;-><init>(La/btk0;La/ixb0;)V

    .line 634
    .line 635
    .line 636
    new-instance v3, La/dtk0;

    .line 637
    .line 638
    invoke-direct {v3, v2, v1}, La/dtk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 639
    .line 640
    .line 641
    new-instance v4, La/gtk0;

    .line 642
    .line 643
    invoke-direct {v4, v2, v1}, La/gtk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 644
    .line 645
    .line 646
    move-object/from16 v17, v0

    .line 647
    .line 648
    new-instance v0, La/ltk0;

    .line 649
    .line 650
    invoke-direct {v0, v2, v1}, La/ltk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 651
    .line 652
    .line 653
    move-object/from16 v23, v0

    .line 654
    .line 655
    new-instance v0, La/ntk0;

    .line 656
    .line 657
    invoke-direct {v0, v2, v1}, La/ntk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 658
    .line 659
    .line 660
    move-object/from16 v26, v0

    .line 661
    .line 662
    new-instance v0, La/avk0;

    .line 663
    .line 664
    invoke-direct {v0, v2, v1}, La/avk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 665
    .line 666
    .line 667
    move-object/from16 v28, v0

    .line 668
    .line 669
    new-instance v0, La/ctk0;

    .line 670
    .line 671
    move-object/from16 v27, v3

    .line 672
    .line 673
    const/4 v3, 0x0

    .line 674
    invoke-direct {v0, v2, v1, v3}, La/ctk0;-><init>(La/btk0;Ljava/util/List;I)V

    .line 675
    .line 676
    .line 677
    new-instance v3, La/stk0;

    .line 678
    .line 679
    invoke-direct {v3, v2, v1}, La/stk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 680
    .line 681
    .line 682
    const/16 v32, 0x0

    .line 683
    .line 684
    const v33, 0x3c00001f

    .line 685
    .line 686
    .line 687
    move-object/from16 v18, v6

    .line 688
    .line 689
    const/4 v6, 0x0

    .line 690
    move-object/from16 v16, v7

    .line 691
    .line 692
    const/4 v7, 0x0

    .line 693
    move-object/from16 v19, v8

    .line 694
    .line 695
    const/4 v8, 0x0

    .line 696
    move-object/from16 v20, v9

    .line 697
    .line 698
    const/4 v9, 0x0

    .line 699
    move-object/from16 v21, v10

    .line 700
    .line 701
    const/4 v10, 0x0

    .line 702
    move-object/from16 v24, v11

    .line 703
    .line 704
    const/4 v11, 0x0

    .line 705
    move-object/from16 v25, v12

    .line 706
    .line 707
    const/4 v12, 0x0

    .line 708
    const/16 v31, 0x0

    .line 709
    .line 710
    move-object/from16 v29, v0

    .line 711
    .line 712
    move-object/from16 v30, v3

    .line 713
    .line 714
    move-object/from16 v22, v4

    .line 715
    .line 716
    invoke-static/range {v5 .. v33}, La/dvk0;->a(La/dvk0;ZLa/xl9;La/a9l0;La/sdt;La/ptk0;La/cvk0;La/gvk0;La/evk0;La/lpp0;La/pvk0;La/rtk0;La/fvk0;La/bvk0;La/otk0;La/jwk0;La/gqk0;La/gtk0;La/ltk0;La/etk0;La/qtk0;La/ntk0;La/dtk0;La/avk0;La/ctk0;La/stk0;La/wcb;La/mtk0;I)La/dvk0;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    return-object v0

    .line 721
    :pswitch_14
    move-object/from16 v0, p1

    .line 722
    .line 723
    check-cast v0, La/oyg0;

    .line 724
    .line 725
    move-object/from16 v4, p2

    .line 726
    .line 727
    check-cast v4, La/dvk0;

    .line 728
    .line 729
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    iget-object v0, v4, La/dvk0;->u:La/qtk0;

    .line 736
    .line 737
    iget-object v1, v0, La/qtk0;->b:La/ixb0;

    .line 738
    .line 739
    if-eqz v1, :cond_3

    .line 740
    .line 741
    iget-boolean v2, v1, La/ixb0;->b:Z

    .line 742
    .line 743
    xor-int/lit8 v2, v2, 0x1

    .line 744
    .line 745
    iget-object v1, v1, La/ixb0;->a:Ljava/util/List;

    .line 746
    .line 747
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    new-instance v3, La/ixb0;

    .line 751
    .line 752
    invoke-direct {v3, v1, v2}, La/ixb0;-><init>(Ljava/util/List;Z)V

    .line 753
    .line 754
    .line 755
    :cond_3
    iget-object v0, v0, La/qtk0;->a:La/btk0;

    .line 756
    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    new-instance v1, La/qtk0;

    .line 761
    .line 762
    invoke-direct {v1, v0, v3}, La/qtk0;-><init>(La/btk0;La/ixb0;)V

    .line 763
    .line 764
    .line 765
    const/16 v31, 0x0

    .line 766
    .line 767
    const v32, 0x3fefffff    # 1.8749999f

    .line 768
    .line 769
    .line 770
    const/4 v5, 0x0

    .line 771
    const/4 v6, 0x0

    .line 772
    const/4 v7, 0x0

    .line 773
    const/4 v8, 0x0

    .line 774
    const/4 v9, 0x0

    .line 775
    const/4 v10, 0x0

    .line 776
    const/4 v11, 0x0

    .line 777
    const/4 v12, 0x0

    .line 778
    const/4 v13, 0x0

    .line 779
    const/4 v14, 0x0

    .line 780
    const/4 v15, 0x0

    .line 781
    const/16 v16, 0x0

    .line 782
    .line 783
    const/16 v17, 0x0

    .line 784
    .line 785
    const/16 v18, 0x0

    .line 786
    .line 787
    const/16 v19, 0x0

    .line 788
    .line 789
    const/16 v20, 0x0

    .line 790
    .line 791
    const/16 v21, 0x0

    .line 792
    .line 793
    const/16 v22, 0x0

    .line 794
    .line 795
    const/16 v23, 0x0

    .line 796
    .line 797
    const/16 v25, 0x0

    .line 798
    .line 799
    const/16 v26, 0x0

    .line 800
    .line 801
    const/16 v27, 0x0

    .line 802
    .line 803
    const/16 v28, 0x0

    .line 804
    .line 805
    const/16 v29, 0x0

    .line 806
    .line 807
    const/16 v30, 0x0

    .line 808
    .line 809
    move-object/from16 v24, v1

    .line 810
    .line 811
    invoke-static/range {v4 .. v32}, La/dvk0;->a(La/dvk0;ZLa/xl9;La/a9l0;La/sdt;La/ptk0;La/cvk0;La/gvk0;La/evk0;La/lpp0;La/pvk0;La/rtk0;La/fvk0;La/bvk0;La/otk0;La/jwk0;La/gqk0;La/gtk0;La/ltk0;La/etk0;La/qtk0;La/ntk0;La/dtk0;La/avk0;La/ctk0;La/stk0;La/wcb;La/mtk0;I)La/dvk0;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    return-object v0

    .line 816
    :pswitch_15
    move-object/from16 v0, p1

    .line 817
    .line 818
    check-cast v0, Landroid/view/LayoutInflater;

    .line 819
    .line 820
    move-object/from16 v1, p2

    .line 821
    .line 822
    check-cast v1, Landroid/view/ViewGroup;

    .line 823
    .line 824
    const v4, 0x7f0d058b

    .line 825
    .line 826
    .line 827
    const/4 v5, 0x0

    .line 828
    invoke-static {v0, v1, v4, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    const v1, 0x7f0a04b7

    .line 833
    .line 834
    .line 835
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    check-cast v4, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 840
    .line 841
    if-eqz v4, :cond_4

    .line 842
    .line 843
    check-cast v0, Landroid/widget/FrameLayout;

    .line 844
    .line 845
    new-instance v3, La/exk0;

    .line 846
    .line 847
    invoke-direct {v3, v0, v0}, La/exk0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V

    .line 848
    .line 849
    .line 850
    goto :goto_2

    .line 851
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    :goto_2
    return-object v3

    .line 867
    :pswitch_16
    move-object/from16 v0, p1

    .line 868
    .line 869
    check-cast v0, Landroid/view/LayoutInflater;

    .line 870
    .line 871
    move-object/from16 v1, p2

    .line 872
    .line 873
    check-cast v1, Landroid/view/ViewGroup;

    .line 874
    .line 875
    const v4, 0x7f0d042b

    .line 876
    .line 877
    .line 878
    const/4 v5, 0x0

    .line 879
    invoke-static {v0, v1, v4, v1, v5}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    const v1, 0x7f0a0347

    .line 884
    .line 885
    .line 886
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    check-cast v4, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 891
    .line 892
    if-eqz v4, :cond_5

    .line 893
    .line 894
    const v1, 0x7f0a03cc

    .line 895
    .line 896
    .line 897
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 898
    .line 899
    .line 900
    move-result-object v4

    .line 901
    check-cast v4, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 902
    .line 903
    if-eqz v4, :cond_5

    .line 904
    .line 905
    const v1, 0x7f0a0cd0

    .line 906
    .line 907
    .line 908
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    check-cast v5, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 913
    .line 914
    if-eqz v5, :cond_5

    .line 915
    .line 916
    new-instance v3, La/vxx;

    .line 917
    .line 918
    check-cast v0, Landroid/widget/LinearLayout;

    .line 919
    .line 920
    invoke-direct {v3, v0, v4}, La/vxx;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;)V

    .line 921
    .line 922
    .line 923
    goto :goto_3

    .line 924
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    :goto_3
    return-object v3

    .line 940
    :pswitch_17
    move-object/from16 v0, p1

    .line 941
    .line 942
    check-cast v0, Ljava/lang/Throwable;

    .line 943
    .line 944
    move-object/from16 v1, p2

    .line 945
    .line 946
    check-cast v1, Ljava/lang/String;

    .line 947
    .line 948
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 955
    .line 956
    return-object v0

    .line 957
    :pswitch_18
    move-object/from16 v0, p1

    .line 958
    .line 959
    check-cast v0, Ljava/lang/Throwable;

    .line 960
    .line 961
    move-object/from16 v1, p2

    .line 962
    .line 963
    check-cast v1, Ljava/lang/String;

    .line 964
    .line 965
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 972
    .line 973
    return-object v0

    .line 974
    :pswitch_19
    move-object/from16 v0, p1

    .line 975
    .line 976
    check-cast v0, La/tcz;

    .line 977
    .line 978
    move-object/from16 v1, p2

    .line 979
    .line 980
    check-cast v1, La/ucz;

    .line 981
    .line 982
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    iget-object v0, v0, La/tcz;->a:La/xcz;

    .line 989
    .line 990
    invoke-virtual {v0}, La/xcz;->j()La/mcz;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    iget v2, v0, La/mcz;->n:I

    .line 995
    .line 996
    iget v0, v0, La/mcz;->r:I

    .line 997
    .line 998
    sub-int/2addr v2, v0

    .line 999
    iget-object v0, v1, La/ucz;->a:La/ncz;

    .line 1000
    .line 1001
    iget v0, v0, La/ncz;->q:I

    .line 1002
    .line 1003
    sub-int/2addr v2, v0

    .line 1004
    div-int/lit8 v2, v2, 0x2

    .line 1005
    .line 1006
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    return-object v0

    .line 1011
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1012
    .line 1013
    check-cast v0, La/fet;

    .line 1014
    .line 1015
    move-object/from16 v2, p2

    .line 1016
    .line 1017
    check-cast v2, Ljava/lang/Integer;

    .line 1018
    .line 1019
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1020
    .line 1021
    .line 1022
    const v2, -0xa25a1b8

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 1026
    .line 1027
    .line 1028
    const/4 v5, 0x0

    .line 1029
    invoke-static {v5, v5, v0, v5, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v1

    .line 1033
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 1034
    .line 1035
    .line 1036
    return-object v1

    .line 1037
    :pswitch_1b
    move v5, v4

    .line 1038
    move-object/from16 v0, p1

    .line 1039
    .line 1040
    check-cast v0, La/fet;

    .line 1041
    .line 1042
    move-object/from16 v2, p2

    .line 1043
    .line 1044
    check-cast v2, Ljava/lang/Integer;

    .line 1045
    .line 1046
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1047
    .line 1048
    .line 1049
    const v2, 0x7ea77b08

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 1053
    .line 1054
    .line 1055
    invoke-static {v5, v5, v0, v5, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 1060
    .line 1061
    .line 1062
    return-object v1

    .line 1063
    :pswitch_1c
    move v5, v4

    .line 1064
    move-object/from16 v0, p1

    .line 1065
    .line 1066
    check-cast v0, La/fet;

    .line 1067
    .line 1068
    move-object/from16 v2, p2

    .line 1069
    .line 1070
    check-cast v2, Ljava/lang/Integer;

    .line 1071
    .line 1072
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1073
    .line 1074
    .line 1075
    const v2, 0x484c57e8    # 209247.62f

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 1079
    .line 1080
    .line 1081
    invoke-static {v5, v5, v0, v5, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v1

    .line 1085
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 1086
    .line 1087
    .line 1088
    return-object v1

    .line 1089
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
