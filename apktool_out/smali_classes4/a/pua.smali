.class public final synthetic La/pua;
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
    iput-byte p1, p0, La/pua;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/pua;->a:B

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
    iget-byte v0, v0, La/pua;->a:B

    .line 4
    .line 5
    const-string v1, "Missing required view with ID: "

    .line 6
    .line 7
    const v2, 0x7f0a0284

    .line 8
    .line 9
    .line 10
    const v3, 0x7f0a027e

    .line 11
    .line 12
    .line 13
    const/4 v4, 0x3

    .line 14
    const-string v5, "_"

    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x7

    .line 19
    const/4 v9, 0x0

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, Ljava/lang/Throwable;

    .line 26
    .line 27
    move-object/from16 v1, p2

    .line 28
    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    move-object/from16 v0, p1

    .line 38
    .line 39
    check-cast v0, Ljava/lang/Throwable;

    .line 40
    .line 41
    move-object/from16 v1, p2

    .line 42
    .line 43
    check-cast v1, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_1
    move-object/from16 v0, p1

    .line 55
    .line 56
    check-cast v0, La/fet;

    .line 57
    .line 58
    move-object/from16 v1, p2

    .line 59
    .line 60
    check-cast v1, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, La/x8x;->L(I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1, v0}, La/cjx;->t(ILa/fet;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_2
    move-object/from16 v0, p1

    .line 76
    .line 77
    check-cast v0, Landroid/view/LayoutInflater;

    .line 78
    .line 79
    move-object/from16 v1, p2

    .line 80
    .line 81
    check-cast v1, Landroid/view/ViewGroup;

    .line 82
    .line 83
    const v2, 0x7f0d063f

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1, v2, v1, v9}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    check-cast v0, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 93
    .line 94
    new-instance v7, La/xcu0;

    .line 95
    .line 96
    invoke-direct {v7, v0, v0}, La/xcu0;-><init>(Lorg/xplatform/uikit/components/chips/DsChip;Lorg/xplatform/uikit/components/chips/DsChip;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    const-string v0, "rootView"

    .line 101
    .line 102
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :goto_0
    return-object v7

    .line 106
    :pswitch_3
    move-object/from16 v0, p1

    .line 107
    .line 108
    check-cast v0, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    move-object/from16 v1, p2

    .line 115
    .line 116
    check-cast v1, La/ql5;

    .line 117
    .line 118
    sget-object v2, La/xnb;->w2:La/kj5;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-wide v1, v1, La/ql5;->a:J

    .line 124
    .line 125
    new-instance v3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v4, "bonus"

    .line 128
    .line 129
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    return-object v0

    .line 146
    :pswitch_4
    move-object/from16 v0, p1

    .line 147
    .line 148
    check-cast v0, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    move-object/from16 v1, p2

    .line 155
    .line 156
    check-cast v1, La/ql5;

    .line 157
    .line 158
    sget-object v2, La/xnb;->w2:La/kj5;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    iget-wide v1, v1, La/ql5;->a:J

    .line 164
    .line 165
    new-instance v3, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    return-object v0

    .line 184
    :pswitch_5
    move-object/from16 v0, p1

    .line 185
    .line 186
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 187
    .line 188
    move-object/from16 v1, p2

    .line 189
    .line 190
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v2, La/m1b;

    .line 199
    .line 200
    const/16 v3, 0x19

    .line 201
    .line 202
    invoke-direct {v2, v3}, La/m1b;-><init>(B)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    new-instance v0, La/e0b;

    .line 209
    .line 210
    const/16 v2, 0x14

    .line 211
    .line 212
    invoke-direct {v0, v2}, La/e0b;-><init>(B)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_6
    move-object/from16 v0, p1

    .line 222
    .line 223
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 224
    .line 225
    move-object/from16 v1, p2

    .line 226
    .line 227
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    new-instance v2, La/m1b;

    .line 236
    .line 237
    const/16 v3, 0x18

    .line 238
    .line 239
    invoke-direct {v2, v3}, La/m1b;-><init>(B)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    new-instance v0, La/e0b;

    .line 246
    .line 247
    const/16 v2, 0x13

    .line 248
    .line 249
    invoke-direct {v0, v2}, La/e0b;-><init>(B)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_7
    move-object/from16 v0, p1

    .line 259
    .line 260
    check-cast v0, La/fet;

    .line 261
    .line 262
    move-object/from16 v1, p2

    .line 263
    .line 264
    check-cast v1, Ljava/lang/Integer;

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 267
    .line 268
    .line 269
    const v1, -0x6567ed04

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 273
    .line 274
    .line 275
    invoke-static {v9, v9, v0, v9, v4}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 280
    .line 281
    .line 282
    return-object v1

    .line 283
    :pswitch_8
    move-object/from16 v0, p1

    .line 284
    .line 285
    check-cast v0, Ljava/lang/Throwable;

    .line 286
    .line 287
    move-object/from16 v1, p2

    .line 288
    .line 289
    check-cast v1, Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 298
    .line 299
    return-object v0

    .line 300
    :pswitch_9
    move-object/from16 v0, p1

    .line 301
    .line 302
    check-cast v0, La/fet;

    .line 303
    .line 304
    move-object/from16 v1, p2

    .line 305
    .line 306
    check-cast v1, Ljava/lang/Integer;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-static {v6}, La/x8x;->L(I)I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    invoke-static {v1, v0}, La/qjj;->A(ILa/fet;)V

    .line 316
    .line 317
    .line 318
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    return-object v0

    .line 321
    :pswitch_a
    move-object/from16 v0, p1

    .line 322
    .line 323
    check-cast v0, Landroid/view/LayoutInflater;

    .line 324
    .line 325
    move-object/from16 v4, p2

    .line 326
    .line 327
    check-cast v4, Landroid/view/ViewGroup;

    .line 328
    .line 329
    const v5, 0x7f0d050f

    .line 330
    .line 331
    .line 332
    invoke-static {v0, v4, v5, v4, v9}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    check-cast v4, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 341
    .line 342
    if-eqz v4, :cond_1

    .line 343
    .line 344
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    check-cast v3, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 349
    .line 350
    if-eqz v3, :cond_2

    .line 351
    .line 352
    const v2, 0x7f0a028c

    .line 353
    .line 354
    .line 355
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 356
    .line 357
    .line 358
    move-result-object v5

    .line 359
    check-cast v5, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 360
    .line 361
    if-eqz v5, :cond_2

    .line 362
    .line 363
    new-instance v7, La/z3b0;

    .line 364
    .line 365
    check-cast v0, Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;

    .line 366
    .line 367
    invoke-direct {v7, v0, v4, v3, v5}, La/z3b0;-><init>(Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;)V

    .line 368
    .line 369
    .line 370
    goto :goto_1

    .line 371
    :cond_1
    move v2, v3

    .line 372
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    :goto_1
    return-object v7

    .line 388
    :pswitch_b
    move-object/from16 v0, p1

    .line 389
    .line 390
    check-cast v0, Ljava/lang/Integer;

    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    move-object/from16 v1, p2

    .line 397
    .line 398
    check-cast v1, La/p6t0;

    .line 399
    .line 400
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    instance-of v2, v1, La/plp;

    .line 404
    .line 405
    if-eqz v2, :cond_3

    .line 406
    .line 407
    check-cast v1, La/plp;

    .line 408
    .line 409
    iget-object v0, v1, La/plp;->b:Ljava/lang/String;

    .line 410
    .line 411
    const-string v1, "-1 "

    .line 412
    .line 413
    invoke-static {v1, v0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    goto/16 :goto_2

    .line 418
    .line 419
    :cond_3
    instance-of v2, v1, La/ilp;

    .line 420
    .line 421
    const-string v3, " "

    .line 422
    .line 423
    if-eqz v2, :cond_4

    .line 424
    .line 425
    check-cast v1, La/ilp;

    .line 426
    .line 427
    iget-wide v4, v1, La/ilp;->a:J

    .line 428
    .line 429
    iget-object v0, v1, La/ilp;->b:Ljava/lang/String;

    .line 430
    .line 431
    iget-wide v6, v1, La/ilp;->c:J

    .line 432
    .line 433
    iget-object v1, v1, La/ilp;->f:Ljava/lang/String;

    .line 434
    .line 435
    new-instance v2, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    goto/16 :goto_2

    .line 466
    .line 467
    :cond_4
    instance-of v2, v1, La/xkp;

    .line 468
    .line 469
    if-eqz v2, :cond_5

    .line 470
    .line 471
    check-cast v1, La/xkp;

    .line 472
    .line 473
    iget-wide v4, v1, La/xkp;->a:J

    .line 474
    .line 475
    iget-object v0, v1, La/xkp;->b:Ljava/lang/String;

    .line 476
    .line 477
    iget-wide v6, v1, La/xkp;->c:J

    .line 478
    .line 479
    iget-object v1, v1, La/xkp;->e:Ljava/lang/String;

    .line 480
    .line 481
    new-instance v2, Ljava/lang/StringBuilder;

    .line 482
    .line 483
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    goto :goto_2

    .line 512
    :cond_5
    instance-of v2, v1, La/alp;

    .line 513
    .line 514
    const-string v4, "-2 "

    .line 515
    .line 516
    if-eqz v2, :cond_6

    .line 517
    .line 518
    check-cast v1, La/alp;

    .line 519
    .line 520
    iget-object v0, v1, La/alp;->a:Ljava/lang/String;

    .line 521
    .line 522
    const-string v1, " 0"

    .line 523
    .line 524
    invoke-static {v4, v0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    goto :goto_2

    .line 529
    :cond_6
    instance-of v2, v1, La/olp;

    .line 530
    .line 531
    if-eqz v2, :cond_7

    .line 532
    .line 533
    check-cast v1, La/olp;

    .line 534
    .line 535
    iget-wide v4, v1, La/olp;->a:J

    .line 536
    .line 537
    iget-object v0, v1, La/olp;->b:Ljava/lang/String;

    .line 538
    .line 539
    iget-wide v6, v1, La/olp;->c:J

    .line 540
    .line 541
    iget-object v1, v1, La/olp;->e:Ljava/lang/String;

    .line 542
    .line 543
    new-instance v2, Ljava/lang/StringBuilder;

    .line 544
    .line 545
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    goto :goto_2

    .line 574
    :cond_7
    instance-of v2, v1, La/clp;

    .line 575
    .line 576
    if-eqz v2, :cond_8

    .line 577
    .line 578
    check-cast v1, La/clp;

    .line 579
    .line 580
    iget-object v0, v1, La/clp;->a:Ljava/lang/String;

    .line 581
    .line 582
    iget-wide v1, v1, La/clp;->b:J

    .line 583
    .line 584
    new-instance v5, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    goto :goto_2

    .line 603
    :cond_8
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    :goto_2
    return-object v0

    .line 608
    :pswitch_c
    move-object/from16 v0, p1

    .line 609
    .line 610
    check-cast v0, Landroid/view/LayoutInflater;

    .line 611
    .line 612
    move-object/from16 v4, p2

    .line 613
    .line 614
    check-cast v4, Landroid/view/ViewGroup;

    .line 615
    .line 616
    const v5, 0x7f0d0513

    .line 617
    .line 618
    .line 619
    invoke-static {v0, v4, v5, v4, v9}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    check-cast v4, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 628
    .line 629
    if-eqz v4, :cond_9

    .line 630
    .line 631
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    check-cast v3, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 636
    .line 637
    if-eqz v3, :cond_a

    .line 638
    .line 639
    const v2, 0x7f0a028a

    .line 640
    .line 641
    .line 642
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 643
    .line 644
    .line 645
    move-result-object v5

    .line 646
    check-cast v5, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 647
    .line 648
    if-eqz v5, :cond_a

    .line 649
    .line 650
    new-instance v7, La/o7b0;

    .line 651
    .line 652
    check-cast v0, Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;

    .line 653
    .line 654
    invoke-direct {v7, v0, v4, v3, v5}, La/o7b0;-><init>(Lorg/xplatform/uikit_sport/sport_cell/DsSportCell;Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;)V

    .line 655
    .line 656
    .line 657
    goto :goto_3

    .line 658
    :cond_9
    move v2, v3

    .line 659
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    :goto_3
    return-object v7

    .line 675
    :pswitch_d
    move-object/from16 v0, p1

    .line 676
    .line 677
    check-cast v0, La/oyg0;

    .line 678
    .line 679
    move-object/from16 v1, p2

    .line 680
    .line 681
    check-cast v1, La/r6b;

    .line 682
    .line 683
    sget-object v4, La/iun;->a:La/iun;

    .line 684
    .line 685
    const/16 v17, 0x0

    .line 686
    .line 687
    const v18, 0x7fffb

    .line 688
    .line 689
    .line 690
    const/4 v2, 0x0

    .line 691
    const/4 v3, 0x0

    .line 692
    const/4 v5, 0x0

    .line 693
    const/4 v6, 0x0

    .line 694
    const/4 v7, 0x0

    .line 695
    const/4 v8, 0x0

    .line 696
    const/4 v9, 0x0

    .line 697
    const/4 v10, 0x0

    .line 698
    const/4 v11, 0x0

    .line 699
    const/4 v12, 0x0

    .line 700
    const/4 v13, 0x0

    .line 701
    const/4 v14, 0x0

    .line 702
    const/4 v15, 0x0

    .line 703
    const/16 v16, 0x0

    .line 704
    .line 705
    invoke-static/range {v1 .. v18}, La/r6b;->a(La/r6b;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;La/l9s;La/js20;La/js20;Ljava/util/List;La/xvm0;La/xvm0;Ljava/util/List;La/aw20;La/ycs;Ljava/lang/String;ZZI)La/r6b;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    return-object v0

    .line 710
    :pswitch_e
    move-object/from16 v0, p1

    .line 711
    .line 712
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 713
    .line 714
    move-object/from16 v1, p2

    .line 715
    .line 716
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 717
    .line 718
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    new-instance v2, La/m1b;

    .line 725
    .line 726
    invoke-direct {v2, v4}, La/m1b;-><init>(B)V

    .line 727
    .line 728
    .line 729
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    new-instance v0, La/e0b;

    .line 733
    .line 734
    const/4 v2, 0x4

    .line 735
    invoke-direct {v0, v2}, La/e0b;-><init>(B)V

    .line 736
    .line 737
    .line 738
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 742
    .line 743
    return-object v0

    .line 744
    :pswitch_f
    move-object/from16 v0, p1

    .line 745
    .line 746
    check-cast v0, Ljava/lang/Integer;

    .line 747
    .line 748
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    move-object/from16 v0, p2

    .line 752
    .line 753
    check-cast v0, La/y2b;

    .line 754
    .line 755
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    invoke-interface {v0}, La/y2b;->getKey()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    return-object v0

    .line 763
    :pswitch_10
    move-object/from16 v0, p1

    .line 764
    .line 765
    check-cast v0, Ljava/lang/Throwable;

    .line 766
    .line 767
    move-object/from16 v1, p2

    .line 768
    .line 769
    check-cast v1, Ljava/lang/String;

    .line 770
    .line 771
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 772
    .line 773
    .line 774
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 775
    .line 776
    return-object v0

    .line 777
    :pswitch_11
    move-object/from16 v0, p1

    .line 778
    .line 779
    check-cast v0, Ljava/lang/Throwable;

    .line 780
    .line 781
    move-object/from16 v1, p2

    .line 782
    .line 783
    check-cast v1, Ljava/lang/String;

    .line 784
    .line 785
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 786
    .line 787
    .line 788
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 789
    .line 790
    return-object v0

    .line 791
    :pswitch_12
    move-object/from16 v0, p1

    .line 792
    .line 793
    check-cast v0, Ljava/lang/Throwable;

    .line 794
    .line 795
    move-object/from16 v1, p2

    .line 796
    .line 797
    check-cast v1, Ljava/lang/String;

    .line 798
    .line 799
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 800
    .line 801
    .line 802
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 803
    .line 804
    return-object v0

    .line 805
    :pswitch_13
    move-object/from16 v0, p1

    .line 806
    .line 807
    check-cast v0, Ljava/lang/Throwable;

    .line 808
    .line 809
    move-object/from16 v1, p2

    .line 810
    .line 811
    check-cast v1, Ljava/lang/String;

    .line 812
    .line 813
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 814
    .line 815
    .line 816
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 817
    .line 818
    return-object v0

    .line 819
    :pswitch_14
    move-object/from16 v0, p1

    .line 820
    .line 821
    check-cast v0, Ljava/lang/Throwable;

    .line 822
    .line 823
    move-object/from16 v1, p2

    .line 824
    .line 825
    check-cast v1, Ljava/lang/String;

    .line 826
    .line 827
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 828
    .line 829
    .line 830
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 831
    .line 832
    return-object v0

    .line 833
    :pswitch_15
    move-object/from16 v0, p1

    .line 834
    .line 835
    check-cast v0, Ljava/lang/Throwable;

    .line 836
    .line 837
    move-object/from16 v1, p2

    .line 838
    .line 839
    check-cast v1, Ljava/lang/String;

    .line 840
    .line 841
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 848
    .line 849
    return-object v0

    .line 850
    :pswitch_16
    move-object/from16 v0, p1

    .line 851
    .line 852
    check-cast v0, La/fet;

    .line 853
    .line 854
    move-object/from16 v1, p2

    .line 855
    .line 856
    check-cast v1, Ljava/lang/Integer;

    .line 857
    .line 858
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    invoke-static {v8}, La/x8x;->L(I)I

    .line 862
    .line 863
    .line 864
    move-result v1

    .line 865
    invoke-static {v1, v0}, La/ohq0;->u(ILa/fet;)V

    .line 866
    .line 867
    .line 868
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 869
    .line 870
    return-object v0

    .line 871
    :pswitch_17
    move-object/from16 v0, p1

    .line 872
    .line 873
    check-cast v0, La/fet;

    .line 874
    .line 875
    move-object/from16 v1, p2

    .line 876
    .line 877
    check-cast v1, Ljava/lang/Integer;

    .line 878
    .line 879
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    invoke-static {v8}, La/x8x;->L(I)I

    .line 883
    .line 884
    .line 885
    move-result v1

    .line 886
    invoke-static {v1, v0}, La/ccq0;->j(ILa/fet;)V

    .line 887
    .line 888
    .line 889
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 890
    .line 891
    return-object v0

    .line 892
    :pswitch_18
    move-object/from16 v0, p1

    .line 893
    .line 894
    check-cast v0, La/fet;

    .line 895
    .line 896
    move-object/from16 v1, p2

    .line 897
    .line 898
    check-cast v1, Ljava/lang/Integer;

    .line 899
    .line 900
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    invoke-static {v8}, La/x8x;->L(I)I

    .line 904
    .line 905
    .line 906
    move-result v1

    .line 907
    invoke-static {v1, v0}, La/fre0;->r(ILa/fet;)V

    .line 908
    .line 909
    .line 910
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 911
    .line 912
    return-object v0

    .line 913
    :pswitch_19
    move-object/from16 v0, p1

    .line 914
    .line 915
    check-cast v0, La/fet;

    .line 916
    .line 917
    move-object/from16 v1, p2

    .line 918
    .line 919
    check-cast v1, Ljava/lang/Integer;

    .line 920
    .line 921
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 922
    .line 923
    .line 924
    invoke-static {v8}, La/x8x;->L(I)I

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    invoke-static {v1, v0}, La/ro4;->r(ILa/fet;)V

    .line 929
    .line 930
    .line 931
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 932
    .line 933
    return-object v0

    .line 934
    :pswitch_1a
    move-object/from16 v0, p1

    .line 935
    .line 936
    check-cast v0, Ljava/lang/Throwable;

    .line 937
    .line 938
    move-object/from16 v1, p2

    .line 939
    .line 940
    check-cast v1, Ljava/lang/String;

    .line 941
    .line 942
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 946
    .line 947
    .line 948
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 949
    .line 950
    return-object v0

    .line 951
    :pswitch_1b
    move-object/from16 v0, p1

    .line 952
    .line 953
    check-cast v0, Ljava/lang/Integer;

    .line 954
    .line 955
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 956
    .line 957
    .line 958
    move-object/from16 v0, p2

    .line 959
    .line 960
    check-cast v0, La/qic;

    .line 961
    .line 962
    sget v1, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->f:I

    .line 963
    .line 964
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 968
    .line 969
    return-object v0

    .line 970
    :pswitch_1c
    move-object/from16 v0, p1

    .line 971
    .line 972
    check-cast v0, Ljava/lang/Integer;

    .line 973
    .line 974
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 975
    .line 976
    .line 977
    move-object/from16 v0, p2

    .line 978
    .line 979
    check-cast v0, La/cja;

    .line 980
    .line 981
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    invoke-interface {v0}, La/cja;->getType()La/dja;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    return-object v0

    .line 989
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
