.class public final synthetic La/qp7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JJLjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/qp7;->a:B

    iput-wide p1, p0, La/qp7;->b:J

    iput-wide p3, p0, La/qp7;->c:J

    iput-object p5, p0, La/qp7;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JJB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/qp7;->a:B

    iput-object p1, p0, La/qp7;->d:Ljava/lang/Object;

    iput-wide p2, p0, La/qp7;->b:J

    iput-wide p4, p0, La/qp7;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qp7;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-wide v3, v0, La/qp7;->b:J

    .line 7
    .line 8
    iget-wide v5, v0, La/qp7;->c:J

    .line 9
    .line 10
    iget-object v7, v0, La/qp7;->d:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v17, v7

    .line 16
    .line 17
    check-cast v17, La/vtm0;

    .line 18
    .line 19
    move-object/from16 v8, p1

    .line 20
    .line 21
    check-cast v8, La/fhl;

    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-wide/16 v13, 0x0

    .line 27
    .line 28
    const/16 v18, 0xe6

    .line 29
    .line 30
    iget-wide v9, v0, La/qp7;->b:J

    .line 31
    .line 32
    const-wide/16 v11, 0x0

    .line 33
    .line 34
    iget-wide v0, v0, La/qp7;->c:J

    .line 35
    .line 36
    move-wide v15, v0

    .line 37
    invoke-static/range {v8 .. v18}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 38
    .line 39
    .line 40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_0
    check-cast v7, La/tjb0;

    .line 44
    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    check-cast v0, La/n1g;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, La/n1g;->b(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-wide v5, v0, La/n1g;->c:J

    .line 60
    .line 61
    invoke-virtual {v7}, La/x2t0;->d()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, La/e5l0;

    .line 66
    .line 67
    iget-object v1, v1, La/e5l0;->g:La/ms2;

    .line 68
    .line 69
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 70
    .line 71
    sget-object v1, La/l1g;->b:La/l1g;

    .line 72
    .line 73
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 74
    .line 75
    sget-object v1, La/k1g;->b:La/k1g;

    .line 76
    .line 77
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_1
    check-cast v7, La/v3b0;

    .line 83
    .line 84
    move-object/from16 v1, p1

    .line 85
    .line 86
    check-cast v1, La/k0w0;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v3, v7, La/v3b0;->t:La/peg0;

    .line 92
    .line 93
    new-instance v4, La/fr1;

    .line 94
    .line 95
    new-instance v7, La/fs80;

    .line 96
    .line 97
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    const/4 v15, 0x0

    .line 106
    const/16 v16, 0x79

    .line 107
    .line 108
    const/4 v8, 0x0

    .line 109
    iget-wide v9, v0, La/qp7;->b:J

    .line 110
    .line 111
    const/4 v12, 0x0

    .line 112
    const-wide/16 v13, 0x0

    .line 113
    .line 114
    invoke-direct/range {v7 .. v16}, La/fs80;-><init>(Ljava/lang/String;JLjava/util/List;Ljava/util/List;JZI)V

    .line 115
    .line 116
    .line 117
    const/4 v0, 0x2

    .line 118
    invoke-direct {v4, v7, v2, v0}, La/fr1;-><init>(La/fs80;La/q91;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v4}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 126
    .line 127
    .line 128
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_2
    check-cast v7, La/o2a0;

    .line 132
    .line 133
    move-object/from16 v1, p1

    .line 134
    .line 135
    check-cast v1, La/pi9;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 141
    .line 142
    invoke-interface {v2}, La/y99;->d()J

    .line 143
    .line 144
    .line 145
    move-result-wide v2

    .line 146
    const/16 v4, 0x20

    .line 147
    .line 148
    shr-long/2addr v2, v4

    .line 149
    long-to-int v2, v2

    .line 150
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    iget-object v3, v1, La/pi9;->a:La/y99;

    .line 155
    .line 156
    invoke-interface {v3}, La/y99;->d()J

    .line 157
    .line 158
    .line 159
    move-result-wide v3

    .line 160
    const-wide v5, 0xffffffffL

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long/2addr v3, v5

    .line 166
    long-to-int v3, v3

    .line 167
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    const/high16 v3, 0x40000000    # 2.0f

    .line 172
    .line 173
    div-float v4, v12, v3

    .line 174
    .line 175
    sget-object v5, La/qmk;->a:La/zcl;

    .line 176
    .line 177
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    mul-float/2addr v5, v3

    .line 182
    iget-boolean v6, v7, La/o2a0;->h:Z

    .line 183
    .line 184
    iget v8, v7, La/o2a0;->a:F

    .line 185
    .line 186
    iget v7, v7, La/o2a0;->b:F

    .line 187
    .line 188
    if-eqz v6, :cond_0

    .line 189
    .line 190
    move v9, v7

    .line 191
    goto :goto_0

    .line 192
    :cond_0
    move v9, v8

    .line 193
    :goto_0
    if-eqz v6, :cond_1

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_1
    move v8, v7

    .line 197
    :goto_1
    add-float/2addr v8, v9

    .line 198
    const/4 v6, 0x0

    .line 199
    cmpg-float v7, v8, v6

    .line 200
    .line 201
    const/high16 v10, 0x3f800000    # 1.0f

    .line 202
    .line 203
    if-gtz v7, :cond_2

    .line 204
    .line 205
    const/high16 v7, 0x3f000000    # 0.5f

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_2
    div-float/2addr v9, v8

    .line 209
    invoke-static {v9, v6, v10}, La/l1e0;->c(FFF)F

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    :goto_2
    sub-float/2addr v10, v7

    .line 214
    mul-float/2addr v7, v2

    .line 215
    div-float/2addr v5, v3

    .line 216
    sub-float/2addr v7, v5

    .line 217
    invoke-static {v7, v6, v2}, La/l1e0;->c(FFF)F

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    mul-float/2addr v10, v2

    .line 222
    sub-float/2addr v10, v5

    .line 223
    invoke-static {v10, v6, v2}, La/l1e0;->c(FFF)F

    .line 224
    .line 225
    .line 226
    move-result v17

    .line 227
    div-float v5, v11, v3

    .line 228
    .line 229
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    div-float v3, v17, v3

    .line 234
    .line 235
    invoke-static {v4, v3}, Ljava/lang/Math;->min(FF)F

    .line 236
    .line 237
    .line 238
    move-result v18

    .line 239
    new-instance v8, La/fna0;

    .line 240
    .line 241
    iget-wide v9, v0, La/qp7;->b:J

    .line 242
    .line 243
    iget-wide v14, v0, La/qp7;->c:J

    .line 244
    .line 245
    move/from16 v16, v2

    .line 246
    .line 247
    invoke-direct/range {v8 .. v18}, La/fna0;-><init>(JFFFJFFF)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v8}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    return-object v0

    .line 255
    :pswitch_3
    check-cast v7, La/s730;

    .line 256
    .line 257
    move-object/from16 v0, p1

    .line 258
    .line 259
    check-cast v0, Ljava/util/List;

    .line 260
    .line 261
    sget-object v1, La/s730;->Q1:La/atz;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    iget-object v1, v1, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 271
    .line 272
    const/4 v8, 0x0

    .line 273
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    iget-object v1, v1, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 281
    .line 282
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    iget-object v9, v9, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 287
    .line 288
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    const/4 v10, 0x1

    .line 293
    sub-int/2addr v9, v10

    .line 294
    invoke-virtual {v1, v10, v9}, Landroid/view/ViewGroup;->removeViews(II)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iget-object v1, v1, La/z1r;->h:Landroid/widget/TextView;

    .line 302
    .line 303
    sget-object v9, La/rdj;->a:La/rdj;

    .line 304
    .line 305
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    invoke-static {v9}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 310
    .line 311
    .line 312
    move-result v9

    .line 313
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v11

    .line 317
    check-cast v11, Lkotlin/Pair;

    .line 318
    .line 319
    iget-object v11, v11, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v11, La/o700;

    .line 322
    .line 323
    iget v11, v11, La/o700;->a:F

    .line 324
    .line 325
    const v12, 0x3e99999a    # 0.3f

    .line 326
    .line 327
    .line 328
    sub-float/2addr v11, v12

    .line 329
    sub-long/2addr v5, v3

    .line 330
    long-to-float v5, v5

    .line 331
    mul-float/2addr v11, v5

    .line 332
    const/high16 v5, 0x42c40000    # 98.0f

    .line 333
    .line 334
    div-float/2addr v11, v5

    .line 335
    float-to-long v5, v11

    .line 336
    add-long/2addr v5, v3

    .line 337
    sget-object v3, La/efj;->e:La/efj;

    .line 338
    .line 339
    new-instance v4, La/ynq0;

    .line 340
    .line 341
    invoke-direct {v4, v5, v6}, La/ynq0;-><init>(J)V

    .line 342
    .line 343
    .line 344
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    const/16 v6, 0x38

    .line 349
    .line 350
    invoke-static {v4, v3, v5, v8, v6}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    const/4 v3, -0x2

    .line 366
    if-eqz v1, :cond_5

    .line 367
    .line 368
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Lkotlin/Pair;

    .line 373
    .line 374
    iget-object v4, v7, Landroidx/fragment/app/Fragment;->q1:Landroid/view/LayoutInflater;

    .line 375
    .line 376
    if-nez v4, :cond_3

    .line 377
    .line 378
    invoke-virtual {v7, v2}, Landroidx/fragment/app/Fragment;->b0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    iput-object v4, v7, Landroidx/fragment/app/Fragment;->q1:Landroid/view/LayoutInflater;

    .line 383
    .line 384
    :cond_3
    const v5, 0x7f0d0082

    .line 385
    .line 386
    .line 387
    invoke-virtual {v4, v5, v2, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    const v5, 0x7f0a0352

    .line 392
    .line 393
    .line 394
    invoke-static {v4, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    check-cast v6, Landroid/widget/TextView;

    .line 399
    .line 400
    if-eqz v6, :cond_4

    .line 401
    .line 402
    const v5, 0x7f0a09f9

    .line 403
    .line 404
    .line 405
    invoke-static {v4, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 406
    .line 407
    .line 408
    move-result-object v9

    .line 409
    check-cast v9, Landroid/widget/TextView;

    .line 410
    .line 411
    if-eqz v9, :cond_4

    .line 412
    .line 413
    check-cast v4, Landroid/widget/LinearLayout;

    .line 414
    .line 415
    iget-object v5, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 416
    .line 417
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    const-string v11, "%s:"

    .line 426
    .line 427
    invoke-static {v11, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 432
    .line 433
    .line 434
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v1, La/o700;

    .line 437
    .line 438
    iget-object v1, v1, La/o700;->c:Ljava/lang/String;

    .line 439
    .line 440
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    iget-object v1, v1, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 448
    .line 449
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 450
    .line 451
    .line 452
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 453
    .line 454
    invoke-direct {v1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 458
    .line 459
    .line 460
    goto :goto_3

    .line 461
    :cond_4
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    const-string v1, "Missing required view with ID: "

    .line 470
    .line 471
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    goto :goto_4

    .line 479
    :cond_5
    invoke-virtual {v7}, La/s730;->G0()La/z1r;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    iget-object v0, v0, La/z1r;->f:Landroid/widget/LinearLayout;

    .line 484
    .line 485
    invoke-virtual {v0, v3, v3}, Landroid/view/View;->measure(II)V

    .line 486
    .line 487
    .line 488
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    :goto_4
    return-object v2

    .line 491
    :pswitch_4
    check-cast v7, La/hfw;

    .line 492
    .line 493
    move-object/from16 v1, p1

    .line 494
    .line 495
    check-cast v1, La/k0w0;

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    iget-object v2, v7, La/hfw;->y:La/vqc;

    .line 501
    .line 502
    new-instance v8, Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;

    .line 503
    .line 504
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    check-cast v3, La/lew;

    .line 509
    .line 510
    iget-wide v9, v3, La/lew;->a:J

    .line 511
    .line 512
    iget-wide v11, v0, La/qp7;->b:J

    .line 513
    .line 514
    iget-wide v13, v0, La/qp7;->c:J

    .line 515
    .line 516
    invoke-direct/range {v8 .. v14}, Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;-><init>(JJJ)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    new-instance v0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$selectAwardsScreen$1;

    .line 523
    .line 524
    invoke-direct {v0, v2, v8}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$selectAwardsScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/championships/hltv/SelectAwardParams;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 528
    .line 529
    .line 530
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 531
    .line 532
    return-object v0

    .line 533
    :pswitch_5
    check-cast v7, La/ems;

    .line 534
    .line 535
    move-object/from16 v1, p1

    .line 536
    .line 537
    check-cast v1, La/ya30;

    .line 538
    .line 539
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    iget-wide v1, v7, La/ems;->a:J

    .line 543
    .line 544
    iget-wide v3, v7, La/ems;->b:J

    .line 545
    .line 546
    iget-object v5, v7, La/ems;->d:La/m9s;

    .line 547
    .line 548
    iget-object v15, v5, La/m9s;->i:Ljava/lang/String;

    .line 549
    .line 550
    iget-object v8, v7, La/ems;->c:Ljava/util/List;

    .line 551
    .line 552
    iget-wide v13, v5, La/m9s;->p:J

    .line 553
    .line 554
    iget-wide v11, v5, La/m9s;->o:J

    .line 555
    .line 556
    iget-wide v9, v0, La/qp7;->b:J

    .line 557
    .line 558
    invoke-static/range {v8 .. v14}, La/jpm0;->i(Ljava/util/List;JJJ)Z

    .line 559
    .line 560
    .line 561
    move-result v6

    .line 562
    iget-object v8, v5, La/m9s;->j:Ljava/lang/String;

    .line 563
    .line 564
    iget-object v7, v7, La/ems;->c:Ljava/util/List;

    .line 565
    .line 566
    iget-wide v11, v5, La/m9s;->p:J

    .line 567
    .line 568
    iget-wide v13, v5, La/m9s;->o:J

    .line 569
    .line 570
    move-wide/from16 v23, v1

    .line 571
    .line 572
    iget-wide v0, v0, La/qp7;->c:J

    .line 573
    .line 574
    move-wide/from16 v17, v0

    .line 575
    .line 576
    move-object/from16 v16, v7

    .line 577
    .line 578
    move-wide/from16 v21, v11

    .line 579
    .line 580
    move-wide/from16 v19, v13

    .line 581
    .line 582
    invoke-static/range {v16 .. v22}, La/jpm0;->i(Ljava/util/List;JJJ)Z

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    iget-boolean v1, v5, La/m9s;->x:Z

    .line 587
    .line 588
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    move-object/from16 v16, v8

    .line 595
    .line 596
    new-instance v8, La/ya30;

    .line 597
    .line 598
    move/from16 v21, v1

    .line 599
    .line 600
    move-wide/from16 v19, v3

    .line 601
    .line 602
    move-wide v11, v9

    .line 603
    move-wide/from16 v13, v17

    .line 604
    .line 605
    move-wide/from16 v17, v23

    .line 606
    .line 607
    move v10, v0

    .line 608
    move v9, v6

    .line 609
    invoke-direct/range {v8 .. v21}, La/ya30;-><init>(ZZJJLjava/lang/String;Ljava/lang/String;JJZ)V

    .line 610
    .line 611
    .line 612
    return-object v8

    .line 613
    :pswitch_6
    check-cast v7, La/uzg;

    .line 614
    .line 615
    move-object/from16 v0, p1

    .line 616
    .line 617
    check-cast v0, La/k0w0;

    .line 618
    .line 619
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    iget-object v1, v7, La/uzg;->e:La/yfm0;

    .line 623
    .line 624
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    check-cast v1, La/zfm0;

    .line 629
    .line 630
    invoke-virtual {v1, v5, v6, v2}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    invoke-virtual {v0, v1}, La/k0w0;->k(La/m7h0;)V

    .line 635
    .line 636
    .line 637
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 638
    .line 639
    return-object v0

    .line 640
    :pswitch_7
    check-cast v7, La/gr00;

    .line 641
    .line 642
    move-object/from16 v0, p1

    .line 643
    .line 644
    check-cast v0, La/k0w0;

    .line 645
    .line 646
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    iget-object v1, v7, La/gr00;->c:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v1, La/yfm0;

    .line 652
    .line 653
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    check-cast v1, La/zfm0;

    .line 658
    .line 659
    invoke-virtual {v1, v5, v6, v2}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 664
    .line 665
    .line 666
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 667
    .line 668
    return-object v0

    .line 669
    :pswitch_data_0
    .packed-switch 0x0
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
