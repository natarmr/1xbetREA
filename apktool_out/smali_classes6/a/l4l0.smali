.class public final La/l4l0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/pse;
.implements La/kue;
.implements La/iue;
.implements La/hue;
.implements La/jue;
.implements La/mue;
.implements La/gue;
.implements La/lue;


# instance fields
.field public A:I

.field public final B:La/j4l0;

.field public final a:La/n0o0;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Lorg/xplatform/uikit/components/views/LoadableImageView;

.field public final l:La/n0o0;

.field public final m:La/n0o0;

.field public final n:La/n0o0;

.field public final o:La/n0o0;

.field public final p:La/n0o0;

.field public final q:La/n0o0;

.field public final r:La/n0o0;

.field public final s:La/n0o0;

.field public final t:La/n0o0;

.field public final u:La/htj;

.field public final v:La/sq8;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 16

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
    const v3, 0x7f04085b

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1, v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance v4, La/k4l0;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-direct {v4, v0, v5}, La/k4l0;-><init>(La/l4l0;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iput-object v4, v0, La/l4l0;->a:La/n0o0;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const v6, 0x7f0706ea

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iput v4, v0, La/l4l0;->b:I

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    iput v4, v0, La/l4l0;->c:I

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const v7, 0x7f070717

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    iput v4, v0, La/l4l0;->d:I

    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const v8, 0x7f070641

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getDimension(I)F

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    float-to-int v4, v4

    .line 75
    iput v4, v0, La/l4l0;->e:I

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    iput v4, v0, La/l4l0;->f:I

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    const v7, 0x7f070640

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    iput v4, v0, La/l4l0;->g:I

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const v7, 0x7f070685

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    iput v4, v0, La/l4l0;->h:I

    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const v7, 0x7f07063b

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    iput v4, v0, La/l4l0;->i:I

    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-virtual {v7, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    iput v6, v0, La/l4l0;->j:I

    .line 135
    .line 136
    new-instance v6, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 137
    .line 138
    const/4 v7, 0x6

    .line 139
    invoke-direct {v6, v1, v2, v7, v5}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 140
    .line 141
    .line 142
    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    .line 143
    .line 144
    invoke-direct {v8, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    .line 149
    .line 150
    const v4, 0x7f040ae7

    .line 151
    .line 152
    .line 153
    invoke-static {v4, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 161
    .line 162
    .line 163
    iput-object v6, v0, La/l4l0;->k:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 164
    .line 165
    new-instance v4, La/k4l0;

    .line 166
    .line 167
    const/4 v6, 0x1

    .line 168
    invoke-direct {v4, v0, v6}, La/k4l0;-><init>(La/l4l0;B)V

    .line 169
    .line 170
    .line 171
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    iput-object v4, v0, La/l4l0;->l:La/n0o0;

    .line 176
    .line 177
    new-instance v4, La/k4l0;

    .line 178
    .line 179
    const/4 v8, 0x2

    .line 180
    invoke-direct {v4, v0, v8}, La/k4l0;-><init>(La/l4l0;B)V

    .line 181
    .line 182
    .line 183
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    iput-object v4, v0, La/l4l0;->m:La/n0o0;

    .line 188
    .line 189
    new-instance v4, La/k4l0;

    .line 190
    .line 191
    const/4 v9, 0x3

    .line 192
    invoke-direct {v4, v0, v9}, La/k4l0;-><init>(La/l4l0;B)V

    .line 193
    .line 194
    .line 195
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    iput-object v4, v0, La/l4l0;->n:La/n0o0;

    .line 200
    .line 201
    new-instance v4, La/k4l0;

    .line 202
    .line 203
    const/4 v10, 0x4

    .line 204
    invoke-direct {v4, v0, v10}, La/k4l0;-><init>(La/l4l0;B)V

    .line 205
    .line 206
    .line 207
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    iput-object v4, v0, La/l4l0;->o:La/n0o0;

    .line 212
    .line 213
    new-instance v4, La/k4l0;

    .line 214
    .line 215
    const/4 v11, 0x5

    .line 216
    invoke-direct {v4, v0, v11}, La/k4l0;-><init>(La/l4l0;B)V

    .line 217
    .line 218
    .line 219
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    iput-object v4, v0, La/l4l0;->p:La/n0o0;

    .line 224
    .line 225
    new-instance v4, La/k4l0;

    .line 226
    .line 227
    invoke-direct {v4, v0, v7}, La/k4l0;-><init>(La/l4l0;B)V

    .line 228
    .line 229
    .line 230
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    iput-object v4, v0, La/l4l0;->q:La/n0o0;

    .line 235
    .line 236
    new-instance v4, La/k4l0;

    .line 237
    .line 238
    const/4 v12, 0x7

    .line 239
    invoke-direct {v4, v0, v12}, La/k4l0;-><init>(La/l4l0;B)V

    .line 240
    .line 241
    .line 242
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    iput-object v4, v0, La/l4l0;->r:La/n0o0;

    .line 247
    .line 248
    new-instance v4, La/k4l0;

    .line 249
    .line 250
    const/16 v13, 0x8

    .line 251
    .line 252
    invoke-direct {v4, v0, v13}, La/k4l0;-><init>(La/l4l0;B)V

    .line 253
    .line 254
    .line 255
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    iput-object v4, v0, La/l4l0;->s:La/n0o0;

    .line 260
    .line 261
    new-instance v4, La/k4l0;

    .line 262
    .line 263
    const/16 v14, 0x9

    .line 264
    .line 265
    invoke-direct {v4, v0, v14}, La/k4l0;-><init>(La/l4l0;B)V

    .line 266
    .line 267
    .line 268
    invoke-static {v4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    iput-object v4, v0, La/l4l0;->t:La/n0o0;

    .line 273
    .line 274
    new-instance v4, La/htj;

    .line 275
    .line 276
    const v15, 0x7f080800

    .line 277
    .line 278
    .line 279
    const v7, 0x7f0706a9

    .line 280
    .line 281
    .line 282
    invoke-direct {v4, v0, v15, v7, v7}, La/htj;-><init>(Landroid/view/ViewGroup;III)V

    .line 283
    .line 284
    .line 285
    iget-object v7, v4, La/htj;->d:Landroid/widget/ImageView;

    .line 286
    .line 287
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 288
    .line 289
    .line 290
    iget-object v7, v4, La/htj;->c:Landroid/widget/ImageView;

    .line 291
    .line 292
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 293
    .line 294
    .line 295
    iput-object v4, v0, La/l4l0;->u:La/htj;

    .line 296
    .line 297
    new-instance v4, La/sq8;

    .line 298
    .line 299
    invoke-direct {v4, v0}, La/sq8;-><init>(La/l4l0;)V

    .line 300
    .line 301
    .line 302
    iput-object v4, v0, La/l4l0;->v:La/sq8;

    .line 303
    .line 304
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    const v7, 0x7f07074a

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4, v7}, Landroid/content/res/Resources;->getDimension(I)F

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    const v15, 0x7f07074c

    .line 320
    .line 321
    .line 322
    invoke-virtual {v7, v15}, Landroid/content/res/Resources;->getDimension(I)F

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    new-instance v15, La/j4l0;

    .line 327
    .line 328
    invoke-direct {v15, v1}, La/j4l0;-><init>(Landroid/content/Context;)V

    .line 329
    .line 330
    .line 331
    sget-object v9, La/xr20;->b:La/xr20;

    .line 332
    .line 333
    invoke-virtual {v15, v9}, La/j4l0;->setMarketBlockedIconPosition(La/xr20;)V

    .line 334
    .line 335
    .line 336
    const v9, 0x7f140466

    .line 337
    .line 338
    .line 339
    invoke-virtual {v15, v9}, La/j4l0;->setDescriptionTextStyle(I)V

    .line 340
    .line 341
    .line 342
    const v9, 0x7f14044f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v15, v9}, La/j4l0;->setHeaderTextStyle(I)V

    .line 346
    .line 347
    .line 348
    const v9, 0x7f140485

    .line 349
    .line 350
    .line 351
    invoke-virtual {v15, v9}, La/j4l0;->setCoefficientTextStyle(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v15, v6}, La/j4l0;->setDescriptionMaxLines(I)V

    .line 355
    .line 356
    .line 357
    const v9, 0x7fffffff

    .line 358
    .line 359
    .line 360
    invoke-virtual {v15, v9}, La/j4l0;->setHeaderMaxLines(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v15, v7}, La/j4l0;->setCoefficientMaxTextSize(F)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v15, v4}, La/j4l0;->setCoefficientMinTextSize(F)V

    .line 367
    .line 368
    .line 369
    iput-object v15, v0, La/l4l0;->B:La/j4l0;

    .line 370
    .line 371
    sget-object v4, La/cqd0;->i:[I

    .line 372
    .line 373
    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    invoke-virtual {v0, v7}, La/l4l0;->setCaption(Ljava/lang/CharSequence;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v4, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    invoke-virtual {v0, v7}, La/l4l0;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v4, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    invoke-virtual {v0, v7}, La/l4l0;->setTagText(Ljava/lang/CharSequence;)V

    .line 396
    .line 397
    .line 398
    invoke-static {v14, v1, v4}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    if-eqz v1, :cond_0

    .line 403
    .line 404
    invoke-virtual {v0, v1}, La/l4l0;->setTagColor(Landroid/content/res/ColorStateList;)V

    .line 405
    .line 406
    .line 407
    :cond_0
    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-virtual {v0, v1}, La/l4l0;->setError(Ljava/lang/CharSequence;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-virtual {v0, v1}, La/l4l0;->setMarketStyle(Ljava/lang/Integer;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v4, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-virtual {v4, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    const/4 v7, 0x3

    .line 434
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    invoke-virtual {v15}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 439
    .line 440
    .line 441
    move-result-object v8

    .line 442
    if-nez v8, :cond_1

    .line 443
    .line 444
    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 445
    .line 446
    .line 447
    :cond_1
    invoke-virtual {v0, v6}, La/l4l0;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v1}, La/l4l0;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v7}, La/l4l0;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 454
    .line 455
    .line 456
    const/4 v1, 0x6

    .line 457
    invoke-virtual {v4, v1, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-eqz v1, :cond_2

    .line 462
    .line 463
    invoke-virtual {v0}, La/l4l0;->a()V

    .line 464
    .line 465
    .line 466
    :cond_2
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 467
    .line 468
    .line 469
    invoke-direct {v0}, La/l4l0;->getBackgroundTintHelper()La/od5;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-virtual {v1, v2, v3}, La/od5;->a(Landroid/util/AttributeSet;I)V

    .line 474
    .line 475
    .line 476
    const-string v1, "SportCouponCardSmallTeamLogoTestTag"

    .line 477
    .line 478
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    return-void
.end method

.method private final getAutoSubTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->q:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yte;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getBackgroundTintHelper()La/od5;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->a:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/od5;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getCaptionDelegate()La/eue;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->m:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/eue;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getEachWayTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->s:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yte;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getEachWayTagWidth()I
    .locals 1

    .line 1
    invoke-direct {p0}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object p0, p0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method private final getErrorDelegate()La/eue;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->n:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/eue;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getLiveTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->p:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yte;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getOptionBetTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->r:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yte;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getShimmerDelegate()La/bte;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->t:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bte;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getSubTitleDelegate()La/eue;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->l:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/eue;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getWarningTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->o:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yte;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    invoke-direct {p0}, La/l4l0;->getShimmerDelegate()La/bte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/bte;->c()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Ljava/lang/CharSequence;La/j0d;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/l4l0;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, La/l4l0;->setMarketCoefficientState(La/j0d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, La/l4l0;->getLiveTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget v0, p0, La/l4l0;->c:I

    .line 8
    .line 9
    int-to-float v0, v0

    .line 10
    invoke-direct {p0}, La/l4l0;->getLiveTagDelegate()La/yte;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget v2, p0, La/l4l0;->d:I

    .line 21
    .line 22
    add-int/2addr v1, v2

    .line 23
    iget v2, p0, La/l4l0;->b:I

    .line 24
    .line 25
    add-int/2addr v1, v2

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {p0}, La/l4l0;->getLiveTagDelegate()La/yte;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v3, v3, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 35
    .line 36
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v1, 0x0

    .line 44
    :goto_0
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v1, v2

    .line 52
    :goto_1
    invoke-direct {p0}, La/l4l0;->getSubTitleDelegate()La/eue;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    int-to-float v1, v1

    .line 57
    invoke-virtual {v3, p1, v1, v0}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 58
    .line 59
    .line 60
    iget v1, p0, La/l4l0;->w:I

    .line 61
    .line 62
    int-to-float v1, v1

    .line 63
    add-float/2addr v0, v1

    .line 64
    invoke-direct {p0}, La/l4l0;->getCaptionDelegate()La/eue;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    int-to-float v3, v2

    .line 69
    invoke-virtual {v1, p1, v3, v0}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 70
    .line 71
    .line 72
    iget v1, p0, La/l4l0;->x:I

    .line 73
    .line 74
    int-to-float v1, v1

    .line 75
    add-float/2addr v0, v1

    .line 76
    iget v1, p0, La/l4l0;->y:I

    .line 77
    .line 78
    int-to-float v1, v1

    .line 79
    add-float/2addr v0, v1

    .line 80
    iget v1, p0, La/l4l0;->z:I

    .line 81
    .line 82
    int-to-float v1, v1

    .line 83
    add-float/2addr v0, v1

    .line 84
    invoke-direct {p0}, La/l4l0;->getErrorDelegate()La/eue;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    int-to-float v1, v2

    .line 89
    invoke-virtual {p0, p1, v1, v0}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-direct {p0}, La/l4l0;->getBackgroundTintHelper()La/od5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/od5;->b:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getCaptionDelegate()Ljava/lang/String;
    .locals 0

    .line 10
    invoke-direct {p0}, La/l4l0;->getCaptionDelegate()La/eue;

    move-result-object p0

    .line 11
    iget-object p0, p0, La/eue;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final getError()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, La/l4l0;->getErrorDelegate()La/eue;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/eue;->d:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getSubTitle()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, La/l4l0;->getSubTitleDelegate()La/eue;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/eue;->d:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 21

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-direct {v5}, La/l4l0;->getShimmerDelegate()La/bte;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-direct {v5}, La/l4l0;->getShimmerDelegate()La/bte;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, La/bte;->a()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-direct {v5}, La/l4l0;->getAutoSubTagDelegate()La/yte;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v6, 0x0

    .line 34
    iget v7, v5, La/l4l0;->b:I

    .line 35
    .line 36
    iget-object v8, v5, La/l4l0;->u:La/htj;

    .line 37
    .line 38
    iget v9, v5, La/l4l0;->c:I

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {v8}, La/htj;->a()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-lez v0, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v1, v6

    .line 54
    :goto_0
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move v0, v7

    .line 62
    :goto_1
    invoke-direct {v5}, La/l4l0;->getAutoSubTagDelegate()La/yte;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    sub-int/2addr v2, v0

    .line 71
    invoke-direct {v5}, La/l4l0;->getAutoSubTagDelegate()La/yte;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget-object v3, v3, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 76
    .line 77
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    sub-int/2addr v2, v3

    .line 82
    invoke-virtual {v1, v2, v0, v9}, La/yte;->a(III)V

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-direct {v5}, La/l4l0;->getOptionBetTagDelegate()La/yte;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_6

    .line 96
    .line 97
    invoke-virtual {v8}, La/htj;->a()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-lez v0, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move-object v1, v6

    .line 109
    :goto_2
    if-eqz v1, :cond_5

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    goto :goto_3

    .line 116
    :cond_5
    move v0, v7

    .line 117
    :goto_3
    invoke-direct {v5}, La/l4l0;->getOptionBetTagDelegate()La/yte;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    sub-int/2addr v2, v0

    .line 126
    invoke-direct {v5}, La/l4l0;->getEachWayTagWidth()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    sub-int/2addr v2, v3

    .line 131
    invoke-direct {v5}, La/l4l0;->getOptionBetTagDelegate()La/yte;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    iget-object v3, v3, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 136
    .line 137
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    sub-int/2addr v2, v3

    .line 142
    invoke-virtual {v1, v2, v0, v9}, La/yte;->a(III)V

    .line 143
    .line 144
    .line 145
    :cond_6
    invoke-direct {v5}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 150
    .line 151
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_9

    .line 156
    .line 157
    invoke-virtual {v8}, La/htj;->a()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    if-lez v0, :cond_7

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    move-object v1, v6

    .line 169
    :goto_4
    if-eqz v1, :cond_8

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    goto :goto_5

    .line 176
    :cond_8
    move v0, v7

    .line 177
    :goto_5
    invoke-direct {v5}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    sub-int/2addr v2, v0

    .line 186
    invoke-direct {v5}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    iget-object v3, v3, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 191
    .line 192
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    sub-int/2addr v2, v3

    .line 197
    invoke-virtual {v1, v2, v0, v9}, La/yte;->a(III)V

    .line 198
    .line 199
    .line 200
    :cond_9
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    iget v1, v5, La/l4l0;->i:I

    .line 205
    .line 206
    sub-int/2addr v0, v1

    .line 207
    iget v2, v5, La/l4l0;->g:I

    .line 208
    .line 209
    add-int/2addr v0, v2

    .line 210
    iget v3, v5, La/l4l0;->h:I

    .line 211
    .line 212
    move v4, v1

    .line 213
    neg-int v1, v3

    .line 214
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    add-int/2addr v2, v10

    .line 219
    sub-int v3, v4, v3

    .line 220
    .line 221
    iget-object v4, v5, La/l4l0;->k:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 222
    .line 223
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    sub-int/2addr v0, v9

    .line 231
    iget-object v4, v5, La/l4l0;->B:La/j4l0;

    .line 232
    .line 233
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    sub-int v1, v0, v1

    .line 238
    .line 239
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    move v2, v0

    .line 244
    iget v0, v5, La/l4l0;->b:I

    .line 245
    .line 246
    add-int/2addr v2, v0

    .line 247
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    add-int/2addr v3, v1

    .line 252
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 253
    .line 254
    .line 255
    iget-object v0, v8, La/htj;->c:Landroid/widget/ImageView;

    .line 256
    .line 257
    iget-object v14, v8, La/htj;->d:Landroid/widget/ImageView;

    .line 258
    .line 259
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    const/4 v1, 0x2

    .line 264
    div-int/2addr v0, v1

    .line 265
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredHeight()I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    div-int/2addr v2, v1

    .line 270
    iget-object v15, v8, La/htj;->a:Landroid/view/ViewGroup;

    .line 271
    .line 272
    iget v3, v8, La/htj;->b:I

    .line 273
    .line 274
    iget-object v4, v8, La/htj;->c:Landroid/widget/ImageView;

    .line 275
    .line 276
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-nez v8, :cond_a

    .line 281
    .line 282
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    sub-int/2addr v8, v3

    .line 287
    div-int/lit8 v10, v3, 0x2

    .line 288
    .line 289
    sub-int v16, v0, v10

    .line 290
    .line 291
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 292
    .line 293
    .line 294
    move-result v17

    .line 295
    add-int v18, v10, v0

    .line 296
    .line 297
    move-object/from16 v19, v4

    .line 298
    .line 299
    move-object/from16 v20, v15

    .line 300
    .line 301
    move v15, v8

    .line 302
    invoke-static/range {v15 .. v20}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 303
    .line 304
    .line 305
    move-object/from16 v15, v20

    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_a
    move-object/from16 v19, v4

    .line 309
    .line 310
    :goto_6
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getVisibility()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-nez v0, :cond_b

    .line 315
    .line 316
    move v0, v3

    .line 317
    goto :goto_7

    .line 318
    :cond_b
    const/4 v0, 0x0

    .line 319
    :goto_7
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    if-nez v4, :cond_c

    .line 324
    .line 325
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    sub-int/2addr v4, v3

    .line 330
    sub-int v10, v4, v0

    .line 331
    .line 332
    div-int/2addr v3, v1

    .line 333
    sub-int v11, v2, v3

    .line 334
    .line 335
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    sub-int v12, v4, v0

    .line 340
    .line 341
    add-int v13, v3, v2

    .line 342
    .line 343
    invoke-static/range {v10 .. v15}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 344
    .line 345
    .line 346
    :cond_c
    iget v0, v5, La/l4l0;->w:I

    .line 347
    .line 348
    add-int/2addr v0, v9

    .line 349
    iget v2, v5, La/l4l0;->x:I

    .line 350
    .line 351
    add-int/2addr v0, v2

    .line 352
    invoke-direct {v5}, La/l4l0;->getWarningTagDelegate()La/yte;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-virtual {v2, v7, v7, v0}, La/yte;->a(III)V

    .line 357
    .line 358
    .line 359
    invoke-direct {v5}, La/l4l0;->getLiveTagDelegate()La/yte;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    iget v2, v5, La/l4l0;->w:I

    .line 364
    .line 365
    iget v3, v5, La/l4l0;->f:I

    .line 366
    .line 367
    invoke-static {v2, v3, v1, v9}, La/hne;->d(IIII)I

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    invoke-direct {v5}, La/l4l0;->getLiveTagDelegate()La/yte;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    iget-object v3, v3, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 376
    .line 377
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    div-int/2addr v3, v1

    .line 382
    sub-int/2addr v2, v3

    .line 383
    invoke-virtual {v0, v7, v7, v2}, La/yte;->a(III)V

    .line 384
    .line 385
    .line 386
    iget v0, v5, La/l4l0;->w:I

    .line 387
    .line 388
    add-int/2addr v9, v0

    .line 389
    iget v0, v5, La/l4l0;->x:I

    .line 390
    .line 391
    add-int/2addr v9, v0

    .line 392
    iget v0, v5, La/l4l0;->y:I

    .line 393
    .line 394
    add-int/2addr v9, v0

    .line 395
    iget-object v0, v5, La/l4l0;->v:La/sq8;

    .line 396
    .line 397
    iget-object v1, v0, La/sq8;->i:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v1, La/due;

    .line 400
    .line 401
    iget-object v2, v0, La/sq8;->e:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v2, La/l4l0;

    .line 404
    .line 405
    if-eqz v1, :cond_d

    .line 406
    .line 407
    check-cast v1, Landroid/view/View;

    .line 408
    .line 409
    goto :goto_8

    .line 410
    :cond_d
    move-object v1, v6

    .line 411
    :goto_8
    if-nez v1, :cond_e

    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_e
    iget v3, v0, La/sq8;->b:I

    .line 415
    .line 416
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    add-int/2addr v4, v3

    .line 421
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    add-int/2addr v5, v9

    .line 426
    move-object/from16 p4, v1

    .line 427
    .line 428
    move-object/from16 p5, v2

    .line 429
    .line 430
    move/from16 p0, v3

    .line 431
    .line 432
    move/from16 p2, v4

    .line 433
    .line 434
    move/from16 p3, v5

    .line 435
    .line 436
    move/from16 p1, v9

    .line 437
    .line 438
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 439
    .line 440
    .line 441
    iget-object v1, v0, La/sq8;->h:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v1, La/zse;

    .line 444
    .line 445
    if-eqz v1, :cond_f

    .line 446
    .line 447
    move-object v6, v1

    .line 448
    check-cast v6, Landroid/view/View;

    .line 449
    .line 450
    :cond_f
    if-nez v6, :cond_10

    .line 451
    .line 452
    :goto_9
    return-void

    .line 453
    :cond_10
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 454
    .line 455
    .line 456
    move-result v1

    .line 457
    iget v0, v0, La/sq8;->b:I

    .line 458
    .line 459
    sub-int/2addr v1, v0

    .line 460
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    sub-int/2addr v1, v0

    .line 465
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    add-int/2addr v0, v1

    .line 470
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    add-int/2addr v3, v9

    .line 475
    move/from16 p2, v0

    .line 476
    .line 477
    move/from16 p0, v1

    .line 478
    .line 479
    move-object/from16 p5, v2

    .line 480
    .line 481
    move/from16 p3, v3

    .line 482
    .line 483
    move-object/from16 p4, v6

    .line 484
    .line 485
    move/from16 p1, v9

    .line 486
    .line 487
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 488
    .line 489
    .line 490
    return-void
.end method

.method public final onMeasure(II)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-direct {v0}, La/l4l0;->getShimmerDelegate()La/bte;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    iget-object v4, v4, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 16
    .line 17
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    iget-object v5, v0, La/l4l0;->v:La/sq8;

    .line 22
    .line 23
    iget-object v6, v0, La/l4l0;->B:La/j4l0;

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/high16 v9, 0x40000000    # 2.0f

    .line 27
    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    invoke-direct {v0}, La/l4l0;->getShimmerDelegate()La/bte;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2, v3}, La/bte;->b(I)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_f

    .line 38
    .line 39
    :cond_0
    invoke-direct {v0}, La/l4l0;->getAutoSubTagDelegate()La/yte;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, La/yte;->c()V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, La/l4l0;->getOptionBetTagDelegate()La/yte;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, La/yte;->c()V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, La/yte;->c()V

    .line 58
    .line 59
    .line 60
    iget v4, v0, La/l4l0;->b:I

    .line 61
    .line 62
    mul-int/lit8 v10, v4, 0x2

    .line 63
    .line 64
    sub-int v10, v3, v10

    .line 65
    .line 66
    invoke-static {v10, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    invoke-virtual {v6, v11, v2}, Landroid/view/View;->measure(II)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v0}, La/l4l0;->getWarningTagDelegate()La/yte;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-virtual {v11, v10}, La/yte;->b(I)V

    .line 78
    .line 79
    .line 80
    invoke-direct {v0}, La/l4l0;->getLiveTagDelegate()La/yte;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    invoke-virtual {v11, v3}, La/yte;->b(I)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v0}, La/l4l0;->getErrorDelegate()La/eue;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    invoke-virtual {v11, v10}, La/eue;->c(I)V

    .line 92
    .line 93
    .line 94
    iget-object v11, v0, La/l4l0;->u:La/htj;

    .line 95
    .line 96
    invoke-virtual {v11}, La/htj;->c()V

    .line 97
    .line 98
    .line 99
    invoke-direct {v0}, La/l4l0;->getAutoSubTagDelegate()La/yte;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    iget-object v12, v12, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 104
    .line 105
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    if-nez v12, :cond_1

    .line 110
    .line 111
    invoke-direct {v0}, La/l4l0;->getAutoSubTagDelegate()La/yte;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    iget-object v12, v12, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 116
    .line 117
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    goto :goto_0

    .line 122
    :cond_1
    const/4 v12, 0x0

    .line 123
    :goto_0
    invoke-direct {v0}, La/l4l0;->getOptionBetTagDelegate()La/yte;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    iget-object v13, v13, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 128
    .line 129
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 130
    .line 131
    .line 132
    move-result v13

    .line 133
    if-nez v13, :cond_2

    .line 134
    .line 135
    invoke-direct {v0}, La/l4l0;->getOptionBetTagDelegate()La/yte;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    iget-object v13, v13, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 140
    .line 141
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    goto :goto_1

    .line 146
    :cond_2
    const/4 v13, 0x0

    .line 147
    :goto_1
    invoke-direct {v0}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    iget-object v14, v14, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 152
    .line 153
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 154
    .line 155
    .line 156
    move-result v14

    .line 157
    if-nez v14, :cond_3

    .line 158
    .line 159
    invoke-direct {v0}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    iget-object v14, v14, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 164
    .line 165
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    goto :goto_2

    .line 170
    :cond_3
    const/4 v14, 0x0

    .line 171
    :goto_2
    invoke-direct {v0}, La/l4l0;->getLiveTagDelegate()La/yte;

    .line 172
    .line 173
    .line 174
    move-result-object v15

    .line 175
    iget-object v15, v15, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 176
    .line 177
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 178
    .line 179
    .line 180
    move-result v15

    .line 181
    add-int/2addr v15, v4

    .line 182
    iget v7, v0, La/l4l0;->d:I

    .line 183
    .line 184
    add-int/2addr v15, v7

    .line 185
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-direct {v0}, La/l4l0;->getLiveTagDelegate()La/yte;

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    iget-object v15, v15, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 194
    .line 195
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    .line 196
    .line 197
    .line 198
    move-result v15

    .line 199
    if-nez v15, :cond_4

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_4
    move-object v7, v8

    .line 203
    :goto_3
    if-eqz v7, :cond_5

    .line 204
    .line 205
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    goto :goto_4

    .line 210
    :cond_5
    move v7, v4

    .line 211
    :goto_4
    add-int/2addr v12, v13

    .line 212
    add-int/2addr v12, v14

    .line 213
    invoke-virtual {v11}, La/htj;->a()I

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v13

    .line 221
    if-lez v11, :cond_6

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_6
    move-object v13, v8

    .line 225
    :goto_5
    if-eqz v13, :cond_7

    .line 226
    .line 227
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    :cond_7
    add-int/2addr v12, v4

    .line 232
    invoke-direct {v0}, La/l4l0;->getSubTitleDelegate()La/eue;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    sub-int/2addr v3, v7

    .line 237
    sub-int/2addr v3, v12

    .line 238
    invoke-virtual {v4, v3}, La/eue;->c(I)V

    .line 239
    .line 240
    .line 241
    invoke-direct {v0}, La/l4l0;->getCaptionDelegate()La/eue;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-virtual {v3, v10}, La/eue;->c(I)V

    .line 246
    .line 247
    .line 248
    iget v3, v5, La/sq8;->b:I

    .line 249
    .line 250
    iget-object v4, v5, La/sq8;->h:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v4, La/zse;

    .line 253
    .line 254
    if-eqz v4, :cond_8

    .line 255
    .line 256
    check-cast v4, Landroid/view/View;

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_8
    move-object v4, v8

    .line 260
    :goto_6
    if-eqz v4, :cond_9

    .line 261
    .line 262
    invoke-virtual {v4, v1, v2}, Landroid/view/View;->measure(II)V

    .line 263
    .line 264
    .line 265
    :cond_9
    iget-object v4, v5, La/sq8;->h:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v4, La/zse;

    .line 268
    .line 269
    if-eqz v4, :cond_a

    .line 270
    .line 271
    check-cast v4, Landroid/view/View;

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_a
    move-object v4, v8

    .line 275
    :goto_7
    if-eqz v4, :cond_b

    .line 276
    .line 277
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    goto :goto_8

    .line 282
    :cond_b
    const/4 v4, 0x0

    .line 283
    :goto_8
    iget-object v7, v5, La/sq8;->h:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v7, La/zse;

    .line 286
    .line 287
    if-nez v7, :cond_c

    .line 288
    .line 289
    move v7, v3

    .line 290
    goto :goto_9

    .line 291
    :cond_c
    iget v7, v5, La/sq8;->d:I

    .line 292
    .line 293
    add-int/2addr v7, v4

    .line 294
    add-int/2addr v7, v3

    .line 295
    :goto_9
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    sub-int/2addr v4, v3

    .line 300
    sub-int/2addr v4, v7

    .line 301
    iget-object v3, v5, La/sq8;->i:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v3, La/due;

    .line 304
    .line 305
    if-eqz v3, :cond_d

    .line 306
    .line 307
    check-cast v3, Landroid/view/View;

    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_d
    move-object v3, v8

    .line 311
    :goto_a
    if-eqz v3, :cond_e

    .line 312
    .line 313
    invoke-static {v4, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    invoke-virtual {v3, v4, v2}, Landroid/view/View;->measure(II)V

    .line 318
    .line 319
    .line 320
    :cond_e
    iget-object v2, v5, La/sq8;->h:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v2, La/zse;

    .line 323
    .line 324
    if-eqz v2, :cond_f

    .line 325
    .line 326
    check-cast v2, Landroid/view/View;

    .line 327
    .line 328
    goto :goto_b

    .line 329
    :cond_f
    move-object v2, v8

    .line 330
    :goto_b
    if-eqz v2, :cond_10

    .line 331
    .line 332
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    goto :goto_c

    .line 337
    :cond_10
    const/4 v2, 0x0

    .line 338
    :goto_c
    iget-object v3, v5, La/sq8;->i:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v3, La/due;

    .line 341
    .line 342
    if-eqz v3, :cond_11

    .line 343
    .line 344
    check-cast v3, Landroid/view/View;

    .line 345
    .line 346
    goto :goto_d

    .line 347
    :cond_11
    move-object v3, v8

    .line 348
    :goto_d
    if-eqz v3, :cond_12

    .line 349
    .line 350
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    goto :goto_e

    .line 355
    :cond_12
    const/4 v3, 0x0

    .line 356
    :goto_e
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    iput v2, v5, La/sq8;->a:I

    .line 361
    .line 362
    :goto_f
    invoke-direct {v0}, La/l4l0;->getSubTitleDelegate()La/eue;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    iget v2, v2, La/eue;->e:I

    .line 367
    .line 368
    iget v3, v0, La/l4l0;->f:I

    .line 369
    .line 370
    add-int/2addr v2, v3

    .line 371
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    invoke-direct {v0}, La/l4l0;->getSubTitleDelegate()La/eue;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    invoke-virtual {v4}, La/eue;->b()Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-nez v4, :cond_13

    .line 384
    .line 385
    goto :goto_10

    .line 386
    :cond_13
    move-object v2, v8

    .line 387
    :goto_10
    if-eqz v2, :cond_14

    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    goto :goto_11

    .line 394
    :cond_14
    const/4 v2, 0x0

    .line 395
    :goto_11
    iput v2, v0, La/l4l0;->w:I

    .line 396
    .line 397
    invoke-direct {v0}, La/l4l0;->getCaptionDelegate()La/eue;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    iget v2, v2, La/eue;->e:I

    .line 402
    .line 403
    add-int/2addr v2, v3

    .line 404
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-direct {v0}, La/l4l0;->getCaptionDelegate()La/eue;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    invoke-virtual {v4}, La/eue;->b()Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-nez v4, :cond_15

    .line 417
    .line 418
    goto :goto_12

    .line 419
    :cond_15
    move-object v2, v8

    .line 420
    :goto_12
    if-eqz v2, :cond_16

    .line 421
    .line 422
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    goto :goto_13

    .line 427
    :cond_16
    const/4 v2, 0x0

    .line 428
    :goto_13
    iput v2, v0, La/l4l0;->x:I

    .line 429
    .line 430
    invoke-direct {v0}, La/l4l0;->getWarningTagDelegate()La/yte;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    iget-object v2, v2, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 435
    .line 436
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    add-int/2addr v2, v3

    .line 441
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-direct {v0}, La/l4l0;->getWarningTagDelegate()La/yte;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    iget-object v4, v4, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 450
    .line 451
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 452
    .line 453
    .line 454
    move-result v4

    .line 455
    if-nez v4, :cond_17

    .line 456
    .line 457
    goto :goto_14

    .line 458
    :cond_17
    move-object v2, v8

    .line 459
    :goto_14
    if-eqz v2, :cond_18

    .line 460
    .line 461
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    goto :goto_15

    .line 466
    :cond_18
    const/4 v2, 0x0

    .line 467
    :goto_15
    iput v2, v0, La/l4l0;->y:I

    .line 468
    .line 469
    iget v2, v5, La/sq8;->a:I

    .line 470
    .line 471
    add-int/2addr v2, v3

    .line 472
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    iget v4, v5, La/sq8;->a:I

    .line 477
    .line 478
    if-lez v4, :cond_19

    .line 479
    .line 480
    goto :goto_16

    .line 481
    :cond_19
    move-object v2, v8

    .line 482
    :goto_16
    if-eqz v2, :cond_1a

    .line 483
    .line 484
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    goto :goto_17

    .line 489
    :cond_1a
    iget v2, v0, La/l4l0;->j:I

    .line 490
    .line 491
    :goto_17
    iput v2, v0, La/l4l0;->z:I

    .line 492
    .line 493
    invoke-direct {v0}, La/l4l0;->getErrorDelegate()La/eue;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    iget v2, v2, La/eue;->e:I

    .line 498
    .line 499
    add-int/2addr v2, v3

    .line 500
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    invoke-direct {v0}, La/l4l0;->getErrorDelegate()La/eue;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    invoke-virtual {v3}, La/eue;->b()Z

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    if-nez v3, :cond_1b

    .line 513
    .line 514
    goto :goto_18

    .line 515
    :cond_1b
    move-object v2, v8

    .line 516
    :goto_18
    if-eqz v2, :cond_1c

    .line 517
    .line 518
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    goto :goto_19

    .line 523
    :cond_1c
    const/4 v7, 0x0

    .line 524
    :goto_19
    iput v7, v0, La/l4l0;->A:I

    .line 525
    .line 526
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    iget v3, v0, La/l4l0;->c:I

    .line 531
    .line 532
    mul-int/lit8 v3, v3, 0x2

    .line 533
    .line 534
    iget v4, v0, La/l4l0;->w:I

    .line 535
    .line 536
    add-int/2addr v3, v4

    .line 537
    iget v4, v0, La/l4l0;->x:I

    .line 538
    .line 539
    add-int/2addr v3, v4

    .line 540
    iget v4, v0, La/l4l0;->y:I

    .line 541
    .line 542
    add-int/2addr v3, v4

    .line 543
    iget v4, v0, La/l4l0;->z:I

    .line 544
    .line 545
    add-int/2addr v3, v4

    .line 546
    iget v4, v0, La/l4l0;->A:I

    .line 547
    .line 548
    add-int/2addr v3, v4

    .line 549
    add-int/2addr v3, v2

    .line 550
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    invoke-direct {v0}, La/l4l0;->getShimmerDelegate()La/bte;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    iget-object v3, v3, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 559
    .line 560
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-nez v3, :cond_1d

    .line 565
    .line 566
    goto :goto_1a

    .line 567
    :cond_1d
    move-object v8, v2

    .line 568
    :goto_1a
    if-eqz v8, :cond_1e

    .line 569
    .line 570
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    goto :goto_1b

    .line 575
    :cond_1e
    iget v2, v0, La/l4l0;->e:I

    .line 576
    .line 577
    :goto_1b
    invoke-static {v2, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 578
    .line 579
    .line 580
    move-result v2

    .line 581
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 582
    .line 583
    .line 584
    return-void
.end method

.method public setAutoSub(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/l4l0;->getAutoSubTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, La/l4l0;->getAutoSubTagDelegate()La/yte;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 27
    :goto_1
    if-nez p1, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/16 v1, 0x8

    .line 31
    .line 32
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setAutoSubClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public setCancelButtonClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, La/l4l0;->u:La/htj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/htj;->d(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCaption(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, La/l4l0;->setCaption(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setCaption(Ljava/lang/CharSequence;)V
    .locals 1

    .line 13
    invoke-direct {p0}, La/l4l0;->getCaptionDelegate()La/eue;

    move-result-object v0

    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setCouponBonusTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/l4l0;->setCaption(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setCouponMarketDescriptionStyle(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/l4l0;->B:La/j4l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/j4l0;->setDescriptionTextStyle(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setEachWay(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, La/l4l0;->getEachWayTagDelegate()La/yte;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 27
    :goto_1
    if-nez p1, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/16 v1, 0x8

    .line 31
    .line 32
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setEachWayClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public final setError(I)V
    .locals 0

    .line 12
    invoke-direct {p0}, La/l4l0;->getErrorDelegate()La/eue;

    move-result-object p0

    invoke-virtual {p0, p1}, La/eue;->d(I)V

    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-direct {p0}, La/l4l0;->getErrorDelegate()La/eue;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setLiveTagText(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/l4l0;->getLiveTagDelegate()La/yte;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setMarketCoefficient(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/l4l0;->B:La/j4l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/j4l0;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setMarketCoefficientState(La/j0d;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/l4l0;->B:La/j4l0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/j4l0;->setMarketCoefficientState(La/j0d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setMarketDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/l4l0;->B:La/j4l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/j4l0;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setMarketHeader(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/l4l0;->B:La/j4l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/j4l0;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setMarketStyle(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->B:La/j4l0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/j4l0;->setMarketStyle(Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setModel(La/fue;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/fue;->o:Ljava/lang/String;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/16 v2, 0xe

    .line 8
    .line 9
    iget-object v3, p0, La/l4l0;->k:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 10
    .line 11
    invoke-static {v3, v0, v1, v2}, Lorg/xplatform/uikit/components/views/LoadableImageView;->h(Lorg/xplatform/uikit/components/views/LoadableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, La/fue;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/l4l0;->setCaption(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, La/fue;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/l4l0;->setTagText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    iget v0, p1, La/fue;->c:I

    .line 25
    .line 26
    invoke-virtual {p0, v0}, La/l4l0;->setTagColor(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, La/fue;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/l4l0;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, La/fue;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, La/l4l0;->setError(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p1, La/fue;->i:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p1, La/fue;->h:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v2, p1, La/fue;->j:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v3, p0, La/l4l0;->B:La/j4l0;

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    if-nez v4, :cond_0

    .line 52
    .line 53
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {p0, v1}, La/l4l0;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, La/l4l0;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v2}, La/l4l0;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 63
    .line 64
    .line 65
    iget v0, p1, La/fue;->m:I

    .line 66
    .line 67
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p0, v0}, La/l4l0;->setMarketStyle(Ljava/lang/Integer;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p1, La/fue;->n:La/j0d;

    .line 75
    .line 76
    invoke-virtual {p0, v0}, La/l4l0;->setMarketCoefficientState(La/j0d;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v1}, La/l4l0;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    iget-boolean v0, p1, La/fue;->g:Z

    .line 83
    .line 84
    invoke-virtual {p0, v0}, La/l4l0;->c(Z)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p1, La/fue;->p:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p0, v0}, La/l4l0;->setLiveTagText(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p1, La/fue;->l:La/cue;

    .line 93
    .line 94
    iget-object v1, p1, La/fue;->k:La/yse;

    .line 95
    .line 96
    iget-object v2, p0, La/l4l0;->v:La/sq8;

    .line 97
    .line 98
    invoke-virtual {v2, v0, v1}, La/sq8;->a(La/cue;La/yse;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p1, La/fue;->q:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {p0, v0}, La/l4l0;->setAutoSub(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p1, La/fue;->r:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, La/l4l0;->setOptionBet(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p1, La/fue;->s:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {p0, p1}, La/l4l0;->setEachWay(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public setMoveButtonClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, La/l4l0;->u:La/htj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/htj;->e(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setOptionBet(I)V
    .locals 1

    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, La/l4l0;->setOptionBet(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setOptionBet(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/l4l0;->getOptionBetTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, La/l4l0;->getOptionBetTagDelegate()La/yte;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 27
    :goto_1
    if-nez p1, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/16 v1, 0x8

    .line 31
    .line 32
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setOptionBetClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public setScoreUiModel(La/yse;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/l4l0;->v:La/sq8;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/sq8;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/cue;

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, La/sq8;->a(La/cue;La/yse;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public setSportImage(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/l4l0;->k:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSubTitle(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, La/l4l0;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setSubTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 13
    invoke-direct {p0}, La/l4l0;->getSubTitleDelegate()La/eue;

    move-result-object v0

    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTagColor(I)V
    .locals 0

    .line 17
    invoke-direct {p0}, La/l4l0;->getWarningTagDelegate()La/yte;

    move-result-object p0

    invoke-virtual {p0, p1}, La/yte;->d(I)V

    return-void
.end method

.method public final setTagColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/l4l0;->getWarningTagDelegate()La/yte;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 12
    .line 13
    invoke-static {p0, p1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setTagText(I)V
    .locals 1

    .line 39
    invoke-direct {p0}, La/l4l0;->getWarningTagDelegate()La/yte;

    move-result-object p0

    .line 40
    iget-object v0, p0, La/yte;->a:Landroid/view/ViewGroup;

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTagText(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/l4l0;->getWarningTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, La/l4l0;->getWarningTagDelegate()La/yte;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 27
    :goto_1
    if-nez p1, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/16 v1, 0x8

    .line 31
    .line 32
    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setTeamsUiModel(La/cue;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/l4l0;->v:La/sq8;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/sq8;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/yse;

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, La/sq8;->a(La/cue;La/yse;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
