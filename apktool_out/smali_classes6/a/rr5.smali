.class public final La/rr5;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/gr5;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:F

.field public final j:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final k:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final l:Landroid/view/View;

.field public final m:Landroid/widget/TextView;

.field public final n:Lorg/xplatform/uikit/components/tag/DsTag;

.field public o:Ljava/lang/String;

.field public final p:La/n0o0;

.field public final q:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const v3, 0x7f07069c

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iput v2, v0, La/rr5;->a:I

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const v3, 0x7f07063e

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    iput v2, v0, La/rr5;->b:I

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const v3, 0x7f070691

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iput v2, v0, La/rr5;->c:I

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const v4, 0x7f070637

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iput v3, v0, La/rr5;->d:I

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const v4, 0x7f0706a9

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iput v3, v0, La/rr5;->e:I

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const v5, 0x7f0706b7

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    iput v3, v0, La/rr5;->f:I

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const v6, 0x7f07072d

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    iput v5, v0, La/rr5;->g:I

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    iput v4, v0, La/rr5;->h:I

    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 122
    .line 123
    int-to-float v5, v5

    .line 124
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 133
    .line 134
    div-float/2addr v5, v6

    .line 135
    iput v5, v0, La/rr5;->i:F

    .line 136
    .line 137
    invoke-static {}, Landroid/text/BidiFormatter;->getInstance()Landroid/text/BidiFormatter;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {v5}, Landroid/text/BidiFormatter;->isRtlContext()Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    new-instance v6, La/daf;

    .line 146
    .line 147
    invoke-direct {v6}, La/daf;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    const v8, 0x7f0705c6

    .line 155
    .line 156
    .line 157
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimension(I)F

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    invoke-virtual {v6, v7}, La/daf;->S(F)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6}, La/daf;->c()La/akj0;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    new-instance v7, La/wgg0;

    .line 169
    .line 170
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    new-instance v9, La/wgg0;

    .line 174
    .line 175
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    new-instance v10, La/q0;

    .line 179
    .line 180
    const/4 v11, 0x0

    .line 181
    invoke-direct {v10, v11}, La/q0;-><init>(F)V

    .line 182
    .line 183
    .line 184
    new-instance v12, La/q0;

    .line 185
    .line 186
    invoke-direct {v12, v11}, La/q0;-><init>(F)V

    .line 187
    .line 188
    .line 189
    new-instance v11, La/ujn;

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    invoke-direct {v11, v13}, La/ujn;-><init>(B)V

    .line 193
    .line 194
    .line 195
    new-instance v14, La/ujn;

    .line 196
    .line 197
    invoke-direct {v14, v13}, La/ujn;-><init>(B)V

    .line 198
    .line 199
    .line 200
    new-instance v15, La/ujn;

    .line 201
    .line 202
    invoke-direct {v15, v13}, La/ujn;-><init>(B)V

    .line 203
    .line 204
    .line 205
    new-instance v8, La/ujn;

    .line 206
    .line 207
    invoke-direct {v8, v13}, La/ujn;-><init>(B)V

    .line 208
    .line 209
    .line 210
    move/from16 v17, v13

    .line 211
    .line 212
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    move/from16 v18, v5

    .line 217
    .line 218
    const v5, 0x7f0705c6

    .line 219
    .line 220
    .line 221
    invoke-virtual {v13, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    invoke-static/range {v17 .. v17}, La/k7x;->A(I)La/qzb;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    move/from16 v19, v3

    .line 230
    .line 231
    new-instance v3, La/q0;

    .line 232
    .line 233
    invoke-direct {v3, v13}, La/q0;-><init>(F)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    move/from16 v20, v2

    .line 241
    .line 242
    const v2, 0x7f0705c6

    .line 243
    .line 244
    .line 245
    invoke-virtual {v13, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    invoke-static/range {v17 .. v17}, La/k7x;->A(I)La/qzb;

    .line 250
    .line 251
    .line 252
    move-result-object v13

    .line 253
    move/from16 v16, v4

    .line 254
    .line 255
    new-instance v4, La/q0;

    .line 256
    .line 257
    invoke-direct {v4, v2}, La/q0;-><init>(F)V

    .line 258
    .line 259
    .line 260
    new-instance v2, La/akj0;

    .line 261
    .line 262
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 263
    .line 264
    .line 265
    iput-object v7, v2, La/akj0;->a:La/qzb;

    .line 266
    .line 267
    iput-object v9, v2, La/akj0;->b:La/qzb;

    .line 268
    .line 269
    iput-object v13, v2, La/akj0;->c:La/qzb;

    .line 270
    .line 271
    iput-object v5, v2, La/akj0;->d:La/qzb;

    .line 272
    .line 273
    iput-object v10, v2, La/akj0;->e:La/dne;

    .line 274
    .line 275
    iput-object v12, v2, La/akj0;->f:La/dne;

    .line 276
    .line 277
    iput-object v4, v2, La/akj0;->g:La/dne;

    .line 278
    .line 279
    iput-object v3, v2, La/akj0;->h:La/dne;

    .line 280
    .line 281
    iput-object v11, v2, La/akj0;->i:La/ujn;

    .line 282
    .line 283
    iput-object v14, v2, La/akj0;->j:La/ujn;

    .line 284
    .line 285
    iput-object v15, v2, La/akj0;->k:La/ujn;

    .line 286
    .line 287
    iput-object v8, v2, La/akj0;->l:La/ujn;

    .line 288
    .line 289
    new-instance v3, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 290
    .line 291
    invoke-direct {v3, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 292
    .line 293
    .line 294
    const-string v4, "BannerRectangleHorizontalView"

    .line 295
    .line 296
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3, v6}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 300
    .line 301
    .line 302
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 303
    .line 304
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 308
    .line 309
    .line 310
    iput-object v3, v0, La/rr5;->j:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 311
    .line 312
    new-instance v3, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 313
    .line 314
    invoke-direct {v3, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 315
    .line 316
    .line 317
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 318
    .line 319
    const/4 v6, 0x1

    .line 320
    move/from16 v8, v16

    .line 321
    .line 322
    move/from16 v7, v20

    .line 323
    .line 324
    invoke-direct {v5, v7, v8, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3, v2}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 337
    .line 338
    .line 339
    iput-object v3, v0, La/rr5;->k:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 340
    .line 341
    new-instance v2, Landroid/view/View;

    .line 342
    .line 343
    invoke-direct {v2, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 344
    .line 345
    .line 346
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 347
    .line 348
    const/4 v4, -0x1

    .line 349
    move/from16 v5, v19

    .line 350
    .line 351
    invoke-direct {v3, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 355
    .line 356
    .line 357
    const v3, 0x7f080e45

    .line 358
    .line 359
    .line 360
    invoke-static {v3, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 368
    .line 369
    .line 370
    iput-object v2, v0, La/rr5;->l:Landroid/view/View;

    .line 371
    .line 372
    new-instance v2, Landroid/widget/TextView;

    .line 373
    .line 374
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 375
    .line 376
    .line 377
    const-string v3, "titleRectangleHorizontalTextView"

    .line 378
    .line 379
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    const v3, 0x7f14044e

    .line 383
    .line 384
    .line 385
    invoke-static {v3, v2}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 386
    .line 387
    .line 388
    const/4 v3, 0x2

    .line 389
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 390
    .line 391
    .line 392
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 393
    .line 394
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 395
    .line 396
    .line 397
    if-eqz v18, :cond_0

    .line 398
    .line 399
    const v4, 0x800005

    .line 400
    .line 401
    .line 402
    goto :goto_0

    .line 403
    :cond_0
    const v4, 0x800003

    .line 404
    .line 405
    .line 406
    :goto_0
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 410
    .line 411
    .line 412
    iput-object v2, v0, La/rr5;->m:Landroid/widget/TextView;

    .line 413
    .line 414
    sget v2, Lorg/xplatform/uikit/components/tag/DsTag;->l:I

    .line 415
    .line 416
    const v2, 0x7f14080e

    .line 417
    .line 418
    .line 419
    invoke-static {v2, v1}, La/sj3;->W(ILandroid/content/Context;)Lorg/xplatform/uikit/components/tag/DsTag;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 424
    .line 425
    const/4 v4, -0x2

    .line 426
    invoke-direct {v2, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 430
    .line 431
    .line 432
    const/4 v2, 0x3

    .line 433
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v2}, Landroid/view/View;->setTextDirection(I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 446
    .line 447
    .line 448
    iput-object v1, v0, La/rr5;->n:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 449
    .line 450
    new-instance v1, La/qr5;

    .line 451
    .line 452
    move/from16 v2, v17

    .line 453
    .line 454
    invoke-direct {v1, v0, v2}, La/qr5;-><init>(La/rr5;B)V

    .line 455
    .line 456
    .line 457
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    iput-object v1, v0, La/rr5;->p:La/n0o0;

    .line 462
    .line 463
    new-instance v1, La/qr5;

    .line 464
    .line 465
    invoke-direct {v1, v0, v6}, La/qr5;-><init>(La/rr5;B)V

    .line 466
    .line 467
    .line 468
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    iput-object v1, v0, La/rr5;->q:La/n0o0;

    .line 473
    .line 474
    return-void
.end method

.method private final getDecoratorImageHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, La/rr5;->q:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/r0x;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getLoadHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, La/rr5;->p:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/r0x;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(La/o0x;La/gp5;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, La/rr5;->o:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p0}, La/rr5;->getLoadHelper()La/r0x;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v1, p2, La/gp5;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v3, p2, La/gp5;->a:La/m0x;

    .line 26
    .line 27
    iget p2, p0, La/rr5;->i:F

    .line 28
    .line 29
    const/high16 v1, 0x43b40000    # 360.0f

    .line 30
    .line 31
    cmpg-float p2, p2, v1

    .line 32
    .line 33
    if-gez p2, :cond_0

    .line 34
    .line 35
    iget v1, p0, La/rr5;->c:I

    .line 36
    .line 37
    :goto_0
    move v4, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget v1, p0, La/rr5;->a:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    if-gez p2, :cond_1

    .line 43
    .line 44
    iget p2, p0, La/rr5;->d:I

    .line 45
    .line 46
    :goto_2
    move v5, p2

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    iget p2, p0, La/rr5;->b:I

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :goto_3
    iget v6, p0, La/rr5;->e:I

    .line 52
    .line 53
    move v7, v6

    .line 54
    invoke-static/range {v2 .. v7}, La/f1t0;->Z(Landroid/content/Context;La/m0x;IIII)La/o0x;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    new-instance v1, La/qo5;

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-direct {v1, p0, p1, v2}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    new-instance v2, La/b33;

    .line 65
    .line 66
    const/16 v3, 0x17

    .line 67
    .line 68
    invoke-direct {v2, p0, v3}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1, p2, v1, v2}, La/r0x;->c(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public getLoadedImageUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/rr5;->o:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/rr5;->l:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    sub-int/2addr p2, p3

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    add-int/2addr p4, p2

    .line 31
    const/4 p5, 0x0

    .line 32
    invoke-virtual {p1, p5, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, La/rr5;->m:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    sub-int/2addr p2, p3

    .line 53
    div-int/lit8 p2, p2, 0x2

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    iget p4, p0, La/rr5;->g:I

    .line 60
    .line 61
    sub-int/2addr p3, p4

    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 63
    .line 64
    .line 65
    move-result p4

    .line 66
    sub-int/2addr p3, p4

    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    add-int/2addr p4, p2

    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 73
    .line 74
    .line 75
    move-result p5

    .line 76
    add-int/2addr p5, p3

    .line 77
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 78
    .line 79
    .line 80
    :goto_1
    iget-object p4, p0, La/rr5;->n:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 81
    .line 82
    invoke-virtual {p4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-nez p1, :cond_2

    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    move-object p5, p0

    .line 98
    const/4 p0, 0x0

    .line 99
    const/4 p1, 0x0

    .line 100
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    iget p1, p0, La/rr5;->i:F

    .line 2
    .line 3
    const/high16 p2, 0x43b40000    # 360.0f

    .line 4
    .line 5
    cmpg-float v0, p1, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, La/rr5;->c:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v0, p0, La/rr5;->a:I

    .line 13
    .line 14
    :goto_0
    cmpg-float p1, p1, p2

    .line 15
    .line 16
    if-gez p1, :cond_1

    .line 17
    .line 18
    iget p1, p0, La/rr5;->d:I

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget p1, p0, La/rr5;->b:I

    .line 22
    .line 23
    :goto_1
    const/high16 p2, 0x40000000    # 2.0f

    .line 24
    .line 25
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, p0, La/rr5;->j:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 34
    .line 35
    invoke-virtual {v3, v1, v2}, Landroid/view/View;->measure(II)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget v2, p0, La/rr5;->h:I

    .line 43
    .line 44
    invoke-static {v2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget-object v3, p0, La/rr5;->k:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 49
    .line 50
    invoke-virtual {v3, v1, v2}, Landroid/view/View;->measure(II)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v2, p0, La/rr5;->f:I

    .line 58
    .line 59
    invoke-static {v2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iget-object v3, p0, La/rr5;->l:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {v3, v1, v2}, Landroid/view/View;->measure(II)V

    .line 66
    .line 67
    .line 68
    iget v1, p0, La/rr5;->g:I

    .line 69
    .line 70
    mul-int/lit8 v1, v1, 0x2

    .line 71
    .line 72
    sub-int v1, v0, v1

    .line 73
    .line 74
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    iget-object v4, p0, La/rr5;->m:Landroid/widget/TextView;

    .line 84
    .line 85
    invoke-virtual {v4, v1, v3}, Landroid/view/View;->measure(II)V

    .line 86
    .line 87
    .line 88
    const/high16 v1, -0x80000000

    .line 89
    .line 90
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    iget-object v3, p0, La/rr5;->n:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 99
    .line 100
    invoke-virtual {v3, v1, v2}, Landroid/view/View;->measure(II)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public setDecoratorImage(La/o0x;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/rr5;->k:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, La/rr5;->getDecoratorImageHelper()La/r0x;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/16 v0, 0xc

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, p1, v1, v1, v0}, La/r0x;->d(La/r0x;La/o0x;La/m0x;Lkotlin/jvm/functions/Function1;I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/16 p0, 0x8

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setTag(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/16 v1, 0x8

    .line 18
    .line 19
    :goto_1
    iget-object v0, p0, La/rr5;->n:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public setTagColor(La/goo0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, La/goo0;->a:La/s2m0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, La/s2m0;->b(La/goo0;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, La/rr5;->n:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/tag/DsTag;->setStyle(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/rr5;->m:Landroid/widget/TextView;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
