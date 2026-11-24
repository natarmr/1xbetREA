.class public final synthetic La/yc6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/cp;IILa/ao6;La/bo6;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/yc6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yc6;->d:Ljava/lang/Object;

    iput p2, p0, La/yc6;->b:I

    iput p3, p0, La/yc6;->c:I

    iput-object p4, p0, La/yc6;->e:Ljava/lang/Object;

    iput-object p5, p0, La/yc6;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/wqv0;ILa/pu90;ILa/vj30;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/yc6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yc6;->d:Ljava/lang/Object;

    iput p2, p0, La/yc6;->b:I

    iput-object p3, p0, La/yc6;->e:Ljava/lang/Object;

    iput p4, p0, La/yc6;->c:I

    iput-object p5, p0, La/yc6;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>([La/pu90;La/thg0;II[I)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/yc6;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yc6;->d:Ljava/lang/Object;

    iput-object p2, p0, La/yc6;->e:Ljava/lang/Object;

    iput p3, p0, La/yc6;->b:I

    iput p4, p0, La/yc6;->c:I

    iput-object p5, p0, La/yc6;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yc6;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/yc6;->f:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/yc6;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/yc6;->d:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, La/wqv0;

    .line 15
    .line 16
    check-cast v3, La/pu90;

    .line 17
    .line 18
    check-cast v2, La/vj30;

    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/ou90;

    .line 23
    .line 24
    iget-object v4, v4, La/wqv0;->q:Lkotlin/jvm/functions/Function2;

    .line 25
    .line 26
    iget v5, v3, La/pu90;->a:I

    .line 27
    .line 28
    iget v6, v0, La/yc6;->b:I

    .line 29
    .line 30
    sub-int/2addr v6, v5

    .line 31
    iget v5, v3, La/pu90;->b:I

    .line 32
    .line 33
    iget v0, v0, La/yc6;->c:I

    .line 34
    .line 35
    sub-int/2addr v0, v5

    .line 36
    int-to-long v5, v6

    .line 37
    const/16 v7, 0x20

    .line 38
    .line 39
    shl-long/2addr v5, v7

    .line 40
    int-to-long v7, v0

    .line 41
    const-wide v9, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v7, v9

    .line 47
    or-long/2addr v5, v7

    .line 48
    new-instance v0, La/qkx;

    .line 49
    .line 50
    invoke-direct {v0, v5, v6}, La/qkx;-><init>(J)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v2}, La/cnx;->getLayoutDirection()La/k6z;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v4, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, La/ikx;

    .line 62
    .line 63
    iget-wide v4, v0, La/ikx;->a:J

    .line 64
    .line 65
    invoke-static {v1, v3, v4, v5}, La/ou90;->j(La/ou90;La/pu90;J)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_0
    check-cast v4, [La/pu90;

    .line 72
    .line 73
    check-cast v3, La/thg0;

    .line 74
    .line 75
    check-cast v2, [I

    .line 76
    .line 77
    move-object/from16 v1, p1

    .line 78
    .line 79
    check-cast v1, La/ou90;

    .line 80
    .line 81
    array-length v5, v4

    .line 82
    const/4 v6, 0x0

    .line 83
    move v7, v6

    .line 84
    :goto_0
    if-ge v6, v5, :cond_3

    .line 85
    .line 86
    aget-object v12, v4, v6

    .line 87
    .line 88
    add-int/lit8 v14, v7, 0x1

    .line 89
    .line 90
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12}, La/pu90;->n()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    instance-of v9, v8, La/mhg0;

    .line 98
    .line 99
    const/4 v10, 0x0

    .line 100
    if-eqz v9, :cond_0

    .line 101
    .line 102
    check-cast v8, La/mhg0;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_0
    move-object v8, v10

    .line 106
    :goto_1
    if-eqz v8, :cond_1

    .line 107
    .line 108
    iget-object v10, v8, La/mhg0;->c:La/wvb;

    .line 109
    .line 110
    :cond_1
    move-object v8, v10

    .line 111
    iget v9, v0, La/yc6;->b:I

    .line 112
    .line 113
    if-eqz v8, :cond_2

    .line 114
    .line 115
    iget v10, v12, La/pu90;->b:I

    .line 116
    .line 117
    sget-object v11, La/k6z;->a:La/k6z;

    .line 118
    .line 119
    iget v13, v0, La/yc6;->c:I

    .line 120
    .line 121
    invoke-virtual/range {v8 .. v13}, La/wvb;->K(IILa/k6z;La/pu90;I)I

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    goto :goto_2

    .line 126
    :cond_2
    iget-object v8, v3, La/thg0;->b:La/yx7;

    .line 127
    .line 128
    iget v10, v12, La/pu90;->b:I

    .line 129
    .line 130
    invoke-virtual {v8, v10, v9}, La/yx7;->a(II)I

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    :goto_2
    aget v7, v2, v7

    .line 135
    .line 136
    invoke-static {v1, v12, v7, v8}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v6, v6, 0x1

    .line 140
    .line 141
    move v7, v14

    .line 142
    goto :goto_0

    .line 143
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object v0

    .line 146
    :pswitch_1
    move-object v5, v4

    .line 147
    check-cast v5, La/cp;

    .line 148
    .line 149
    move-object v7, v3

    .line 150
    check-cast v7, La/ao6;

    .line 151
    .line 152
    move-object v8, v2

    .line 153
    check-cast v8, La/bo6;

    .line 154
    .line 155
    move-object/from16 v1, p1

    .line 156
    .line 157
    check-cast v1, Ljava/util/List;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object v9, v5, La/xhe0;->a:Landroid/view/View;

    .line 163
    .line 164
    iget-object v10, v5, La/cp;->u:La/yfu0;

    .line 165
    .line 166
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const v2, 0x7f070717

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    const v3, 0x7f070705

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    const v4, 0x7f070719

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    new-instance v11, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;

    .line 212
    .line 213
    invoke-direct {v11, v3, v3}, Lcom/google/android/flexbox/FlexboxLayout$LayoutParams;-><init>(II)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v11, v2, v1, v2, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, La/ah;

    .line 224
    .line 225
    iget-object v1, v1, La/ah;->a:Lorg/xplatform/betting/core/zip/model/zip/bet/ChildBets;

    .line 226
    .line 227
    iget-object v1, v1, Lorg/xplatform/betting/core/zip/model/zip/bet/ChildBets;->b:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_b

    .line 238
    .line 239
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    move-object v6, v1

    .line 244
    check-cast v6, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 245
    .line 246
    new-instance v13, La/ad6;

    .line 247
    .line 248
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-direct {v13, v1}, La/ad6;-><init>(Landroid/content/Context;)V

    .line 256
    .line 257
    .line 258
    iget-wide v1, v6, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 259
    .line 260
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    const-wide/16 v14, 0x11ce

    .line 268
    .line 269
    cmp-long v4, v1, v14

    .line 270
    .line 271
    const-wide/16 v14, 0x1c1f

    .line 272
    .line 273
    if-eqz v4, :cond_6

    .line 274
    .line 275
    const-wide/16 v16, 0x11d6

    .line 276
    .line 277
    cmp-long v4, v1, v16

    .line 278
    .line 279
    if-eqz v4, :cond_6

    .line 280
    .line 281
    cmp-long v4, v1, v14

    .line 282
    .line 283
    if-eqz v4, :cond_6

    .line 284
    .line 285
    const-wide/16 v16, 0x1c21

    .line 286
    .line 287
    cmp-long v4, v1, v16

    .line 288
    .line 289
    if-nez v4, :cond_4

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_4
    const-wide/16 v16, 0x11cf

    .line 293
    .line 294
    cmp-long v4, v1, v16

    .line 295
    .line 296
    if-eqz v4, :cond_5

    .line 297
    .line 298
    const-wide/16 v16, 0x11d7

    .line 299
    .line 300
    cmp-long v4, v1, v16

    .line 301
    .line 302
    if-eqz v4, :cond_5

    .line 303
    .line 304
    const-wide/16 v16, 0x1c20

    .line 305
    .line 306
    cmp-long v4, v1, v16

    .line 307
    .line 308
    if-eqz v4, :cond_5

    .line 309
    .line 310
    const-wide/16 v16, 0x1c22

    .line 311
    .line 312
    cmp-long v1, v1, v16

    .line 313
    .line 314
    if-nez v1, :cond_7

    .line 315
    .line 316
    :cond_5
    const v1, 0x7f130e07

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v13, v1}, La/ad6;->setExtra(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_6
    :goto_4
    const v1, 0x7f131843

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v13, v1}, La/ad6;->setExtra(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    :cond_7
    :goto_5
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    const v2, 0x7f02002f

    .line 348
    .line 349
    .line 350
    invoke-static {v1, v2}, Landroid/animation/AnimatorInflater;->loadStateListAnimator(Landroid/content/Context;I)Landroid/animation/StateListAnimator;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-virtual {v13, v1}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    .line 355
    .line 356
    .line 357
    sget-object v1, La/pn40;->a:La/pn40;

    .line 358
    .line 359
    iget-wide v1, v6, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->d:D

    .line 360
    .line 361
    sget-object v3, La/p3u0;->c:La/p3u0;

    .line 362
    .line 363
    invoke-static {v1, v2, v3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    iget-wide v2, v6, Lorg/xplatform/betting/core/zip/model/zip/BetZip;->a:J

    .line 368
    .line 369
    const-wide/16 v16, 0x11d4

    .line 370
    .line 371
    cmp-long v4, v2, v16

    .line 372
    .line 373
    if-eqz v4, :cond_9

    .line 374
    .line 375
    const-wide/16 v16, 0x11cc

    .line 376
    .line 377
    cmp-long v4, v2, v16

    .line 378
    .line 379
    if-eqz v4, :cond_9

    .line 380
    .line 381
    cmp-long v4, v14, v2

    .line 382
    .line 383
    if-gtz v4, :cond_8

    .line 384
    .line 385
    const-wide/16 v14, 0x1c23

    .line 386
    .line 387
    cmp-long v2, v2, v14

    .line 388
    .line 389
    if-gez v2, :cond_8

    .line 390
    .line 391
    goto :goto_6

    .line 392
    :cond_8
    const-string v2, ""

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_9
    :goto_6
    const-string v2, "+"

    .line 396
    .line 397
    :goto_7
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    invoke-virtual {v13, v1}, La/ad6;->setTitle(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    sget-object v14, La/ymx;->e:La/ymx;

    .line 405
    .line 406
    new-instance v1, La/zc6;

    .line 407
    .line 408
    const/4 v2, 0x0

    .line 409
    iget v3, v0, La/yc6;->b:I

    .line 410
    .line 411
    iget v4, v0, La/yc6;->c:I

    .line 412
    .line 413
    invoke-direct/range {v1 .. v8}, La/zc6;-><init>(BIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    invoke-static {v13, v14, v1}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    const v2, 0x7f080ed4

    .line 424
    .line 425
    .line 426
    invoke-static {v2, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    if-eqz v1, :cond_a

    .line 431
    .line 432
    move-object v2, v10

    .line 433
    check-cast v2, La/nlr;

    .line 434
    .line 435
    iget-object v2, v2, La/nlr;->d:Landroid/widget/TextView;

    .line 436
    .line 437
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    const v3, 0x7f040ae3

    .line 445
    .line 446
    .line 447
    invoke-static {v1, v2, v3}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 448
    .line 449
    .line 450
    :cond_a
    invoke-virtual {v13, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 451
    .line 452
    .line 453
    move-object v1, v10

    .line 454
    check-cast v1, La/nlr;

    .line 455
    .line 456
    iget-object v2, v1, La/nlr;->c:Lcom/google/android/flexbox/FlexboxLayout;

    .line 457
    .line 458
    invoke-virtual {v2, v13, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 459
    .line 460
    .line 461
    iget-object v1, v1, La/nlr;->c:Lcom/google/android/flexbox/FlexboxLayout;

    .line 462
    .line 463
    invoke-virtual {v5}, La/cp;->u()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    check-cast v2, La/ah;

    .line 468
    .line 469
    iget v2, v2, La/ah;->e:I

    .line 470
    .line 471
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-virtual {v1}, Landroid/view/View;->callOnClick()Z

    .line 476
    .line 477
    .line 478
    goto/16 :goto_3

    .line 479
    .line 480
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
