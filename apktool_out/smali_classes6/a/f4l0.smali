.class public final La/f4l0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/pse;
.implements La/kue;
.implements La/jue;
.implements La/mue;
.implements La/gue;
.implements La/lue;


# instance fields
.field public A:I

.field public B:I

.field public final a:La/n0o0;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public f1:I

.field public final g:I

.field public g1:I

.field public final h:I

.field public h1:I

.field public final i:I

.field public i1:I

.field public final j:I

.field public j1:I

.field public final k:I

.field public k1:I

.field public final l:I

.field public final l1:La/j4l0;

.field public final m:I

.field public final m1:La/a15;

.field public final n:I

.field public final n1:La/e680;

.field public o:I

.field public final o1:La/tgn;

.field public p:I

.field public q:I

.field public final r:Lorg/xplatform/uikit/components/views/LoadableImageView;

.field public final s:La/n0o0;

.field public final t:La/n0o0;

.field public final u:La/n0o0;

.field public final v:La/n0o0;

.field public final w:La/htj;

.field public final x:La/w18;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const v1, 0x7f04085b

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/e4l0;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, p0, v3}, La/e4l0;-><init>(La/f4l0;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, p0, La/f4l0;->a:La/n0o0;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const v4, 0x7f0706ea

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iput v2, p0, La/f4l0;->b:I

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iput v4, p0, La/f4l0;->c:I

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const v5, 0x7f070717

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    iput v4, p0, La/f4l0;->d:I

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const v6, 0x7f07064a

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    float-to-int v4, v4

    .line 71
    iput v4, p0, La/f4l0;->e:I

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const v6, 0x7f07064b

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    iput v4, p0, La/f4l0;->f:I

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    const v7, 0x7f0706a9

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    iput v6, p0, La/f4l0;->g:I

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    const v7, 0x7f07072d

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    iput v6, p0, La/f4l0;->h:I

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    const v8, 0x7f070705

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    iput v6, p0, La/f4l0;->i:I

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    iput v5, p0, La/f4l0;->j:I

    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    const v8, 0x7f070722

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    iput v6, p0, La/f4l0;->k:I

    .line 147
    .line 148
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    iput v6, p0, La/f4l0;->l:I

    .line 157
    .line 158
    add-int/2addr v2, v4

    .line 159
    add-int/2addr v5, v2

    .line 160
    iput v5, p0, La/f4l0;->m:I

    .line 161
    .line 162
    iput v2, p0, La/f4l0;->n:I

    .line 163
    .line 164
    new-instance v2, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 165
    .line 166
    const/4 v5, 0x6

    .line 167
    invoke-direct {v2, p1, v0, v5, v3}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 168
    .line 169
    .line 170
    new-instance v6, Landroid/view/ViewGroup$LayoutParams;

    .line 171
    .line 172
    invoke-direct {v6, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 176
    .line 177
    .line 178
    const v4, 0x7f040b0b

    .line 179
    .line 180
    .line 181
    invoke-static {v4, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 189
    .line 190
    .line 191
    iput-object v2, p0, La/f4l0;->r:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 192
    .line 193
    new-instance v2, La/e4l0;

    .line 194
    .line 195
    const/4 v4, 0x1

    .line 196
    invoke-direct {v2, p0, v4}, La/e4l0;-><init>(La/f4l0;B)V

    .line 197
    .line 198
    .line 199
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    iput-object v2, p0, La/f4l0;->s:La/n0o0;

    .line 204
    .line 205
    new-instance v2, La/e4l0;

    .line 206
    .line 207
    const/4 v6, 0x2

    .line 208
    invoke-direct {v2, p0, v6}, La/e4l0;-><init>(La/f4l0;B)V

    .line 209
    .line 210
    .line 211
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    iput-object v2, p0, La/f4l0;->t:La/n0o0;

    .line 216
    .line 217
    new-instance v2, La/e4l0;

    .line 218
    .line 219
    const/4 v7, 0x3

    .line 220
    invoke-direct {v2, p0, v7}, La/e4l0;-><init>(La/f4l0;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    iput-object v2, p0, La/f4l0;->u:La/n0o0;

    .line 228
    .line 229
    new-instance v2, La/e4l0;

    .line 230
    .line 231
    const/4 v8, 0x4

    .line 232
    invoke-direct {v2, p0, v8}, La/e4l0;-><init>(La/f4l0;B)V

    .line 233
    .line 234
    .line 235
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    iput-object v2, p0, La/f4l0;->v:La/n0o0;

    .line 240
    .line 241
    new-instance v2, La/htj;

    .line 242
    .line 243
    const v9, 0x7f0706b7

    .line 244
    .line 245
    .line 246
    const v10, 0x7f0706a3

    .line 247
    .line 248
    .line 249
    const v11, 0x7f080800

    .line 250
    .line 251
    .line 252
    invoke-direct {v2, p0, v11, v9, v10}, La/htj;-><init>(Landroid/view/ViewGroup;III)V

    .line 253
    .line 254
    .line 255
    iget-object v9, v2, La/htj;->d:Landroid/widget/ImageView;

    .line 256
    .line 257
    invoke-virtual {p0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 258
    .line 259
    .line 260
    iget-object v9, v2, La/htj;->c:Landroid/widget/ImageView;

    .line 261
    .line 262
    invoke-virtual {p0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 263
    .line 264
    .line 265
    iput-object v2, p0, La/f4l0;->w:La/htj;

    .line 266
    .line 267
    new-instance v2, La/w18;

    .line 268
    .line 269
    invoke-direct {v2, p0}, La/w18;-><init>(La/f4l0;)V

    .line 270
    .line 271
    .line 272
    iput-object v2, p0, La/f4l0;->x:La/w18;

    .line 273
    .line 274
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    const v9, 0x7f07074a

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getDimension(I)F

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    const v10, 0x7f07074b

    .line 290
    .line 291
    .line 292
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimension(I)F

    .line 293
    .line 294
    .line 295
    move-result v9

    .line 296
    new-instance v10, La/j4l0;

    .line 297
    .line 298
    invoke-direct {v10, p1}, La/j4l0;-><init>(Landroid/content/Context;)V

    .line 299
    .line 300
    .line 301
    sget-object v11, La/xr20;->a:La/xr20;

    .line 302
    .line 303
    invoke-virtual {v10, v11}, La/j4l0;->setMarketBlockedIconPosition(La/xr20;)V

    .line 304
    .line 305
    .line 306
    const v11, 0x7f14046f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v10, v11}, La/j4l0;->setDescriptionTextStyle(I)V

    .line 310
    .line 311
    .line 312
    const v11, 0x7f140497

    .line 313
    .line 314
    .line 315
    invoke-virtual {v10, v11}, La/j4l0;->setCoefficientTextStyle(I)V

    .line 316
    .line 317
    .line 318
    const v11, 0x7fffffff

    .line 319
    .line 320
    .line 321
    invoke-virtual {v10, v11}, La/j4l0;->setDescriptionMaxLines(I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v10, v9}, La/j4l0;->setCoefficientMaxTextSize(F)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10, v2}, La/j4l0;->setCoefficientMinTextSize(F)V

    .line 328
    .line 329
    .line 330
    const v2, 0x7f040ae1

    .line 331
    .line 332
    .line 333
    invoke-virtual {v10, v2}, La/j4l0;->setBackgroundTintAttr(I)V

    .line 334
    .line 335
    .line 336
    iput-object v10, p0, La/f4l0;->l1:La/j4l0;

    .line 337
    .line 338
    new-instance v2, La/a15;

    .line 339
    .line 340
    invoke-direct {v2, p1}, La/a15;-><init>(Landroid/content/Context;)V

    .line 341
    .line 342
    .line 343
    iput-object v2, p0, La/f4l0;->m1:La/a15;

    .line 344
    .line 345
    new-instance v2, La/e680;

    .line 346
    .line 347
    invoke-direct {v2, p1}, La/e680;-><init>(Landroid/content/Context;)V

    .line 348
    .line 349
    .line 350
    iput-object v2, p0, La/f4l0;->n1:La/e680;

    .line 351
    .line 352
    new-instance v2, La/tgn;

    .line 353
    .line 354
    invoke-direct {v2, p1}, La/tgn;-><init>(Landroid/content/Context;)V

    .line 355
    .line 356
    .line 357
    iput-object v2, p0, La/f4l0;->o1:La/tgn;

    .line 358
    .line 359
    sget-object v2, La/cqd0;->i:[I

    .line 360
    .line 361
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    const/4 v9, 0x7

    .line 366
    invoke-virtual {v2, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v9

    .line 370
    invoke-virtual {p0, v9}, La/f4l0;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 371
    .line 372
    .line 373
    const/16 v9, 0x8

    .line 374
    .line 375
    invoke-virtual {v2, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    invoke-virtual {p0, v9}, La/f4l0;->setTagText(Ljava/lang/CharSequence;)V

    .line 380
    .line 381
    .line 382
    const/16 v9, 0x9

    .line 383
    .line 384
    invoke-static {v9, p1, v2}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    if-eqz p1, :cond_0

    .line 389
    .line 390
    invoke-virtual {p0, p1}, La/f4l0;->setTagColor(Landroid/content/res/ColorStateList;)V

    .line 391
    .line 392
    .line 393
    :cond_0
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    invoke-virtual {p0, p1}, La/f4l0;->setError(Ljava/lang/CharSequence;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 401
    .line 402
    .line 403
    move-result p1

    .line 404
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    invoke-virtual {p0, p1}, La/f4l0;->setMarketStyle(Ljava/lang/Integer;)V

    .line 409
    .line 410
    .line 411
    const/4 p1, 0x5

    .line 412
    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    invoke-virtual {v2, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v6

    .line 424
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    if-nez v7, :cond_1

    .line 429
    .line 430
    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 431
    .line 432
    .line 433
    :cond_1
    invoke-virtual {p0, v4}, La/f4l0;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {p0, p1}, La/f4l0;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {p0, v6}, La/f4l0;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v5, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 443
    .line 444
    .line 445
    move-result p1

    .line 446
    if-eqz p1, :cond_2

    .line 447
    .line 448
    invoke-virtual {p0}, La/f4l0;->a()V

    .line 449
    .line 450
    .line 451
    :cond_2
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 452
    .line 453
    .line 454
    invoke-direct {p0}, La/f4l0;->getBackgroundTintHelper()La/od5;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-virtual {p1, v0, v1}, La/od5;->a(Landroid/util/AttributeSet;I)V

    .line 459
    .line 460
    .line 461
    const-string p1, "SportCouponCardBigTeamLogoTestTag"

    .line 462
    .line 463
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    return-void
.end method

.method private final getBackgroundTintHelper()La/od5;
    .locals 0

    .line 1
    iget-object p0, p0, La/f4l0;->a:La/n0o0;

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

.method private final getErrorDelegate()La/eue;
    .locals 0

    .line 1
    iget-object p0, p0, La/f4l0;->t:La/n0o0;

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

.method private final getShimmerDelegate()La/bte;
    .locals 0

    .line 1
    iget-object p0, p0, La/f4l0;->v:La/n0o0;

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
    iget-object p0, p0, La/f4l0;->s:La/n0o0;

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
    iget-object p0, p0, La/f4l0;->u:La/n0o0;

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
    invoke-direct {p0}, La/f4l0;->getShimmerDelegate()La/bte;

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
    invoke-virtual {p0, p1}, La/f4l0;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, La/f4l0;->setMarketCoefficientState(La/j0d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int v3, v0, v1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, La/f4l0;->l:I

    .line 16
    .line 17
    sub-int v4, v0, v1

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-int v5, v0, v3

    .line 24
    .line 25
    iget v2, p0, La/f4l0;->l:I

    .line 26
    .line 27
    move-object v7, p0

    .line 28
    move-object v6, p1

    .line 29
    invoke-static/range {v2 .. v7}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final d()I
    .locals 6

    .line 1
    iget-object v0, p0, La/f4l0;->m1:La/a15;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    iget-object v1, p0, La/f4l0;->n1:La/e680;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v2

    .line 30
    :goto_1
    iget-object v3, p0, La/f4l0;->o1:La/tgn;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_2

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v3, v2

    .line 44
    :goto_2
    iget v4, p0, La/f4l0;->c:I

    .line 45
    .line 46
    iget v5, p0, La/f4l0;->y:I

    .line 47
    .line 48
    add-int/2addr v4, v5

    .line 49
    iget v5, p0, La/f4l0;->z:I

    .line 50
    .line 51
    add-int/2addr v4, v5

    .line 52
    iget v5, p0, La/f4l0;->A:I

    .line 53
    .line 54
    add-int/2addr v4, v5

    .line 55
    iget v5, p0, La/f4l0;->B:I

    .line 56
    .line 57
    add-int/2addr v4, v5

    .line 58
    iget v5, p0, La/f4l0;->f1:I

    .line 59
    .line 60
    add-int/2addr v4, v5

    .line 61
    add-int/2addr v4, v0

    .line 62
    add-int/2addr v4, v1

    .line 63
    add-int/2addr v4, v3

    .line 64
    iget v0, p0, La/f4l0;->i:I

    .line 65
    .line 66
    add-int/2addr v4, v0

    .line 67
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p0}, La/f4l0;->getShimmerDelegate()La/bte;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v1, v1, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    :cond_3
    if-nez v2, :cond_4

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_4
    const/4 v0, 0x0

    .line 88
    :goto_3
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    goto :goto_4

    .line 95
    :cond_5
    iget p0, p0, La/f4l0;->e:I

    .line 96
    .line 97
    :goto_4
    const/high16 v0, 0x40000000    # 2.0f

    .line 98
    .line 99
    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0
.end method

.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-direct {p0}, La/f4l0;->getBackgroundTintHelper()La/od5;

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

.method public final getError()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, La/f4l0;->getErrorDelegate()La/eue;

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
    invoke-direct {p0}, La/f4l0;->getSubTitleDelegate()La/eue;

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

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/f4l0;->getSubTitleDelegate()La/eue;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget v1, p0, La/f4l0;->m:I

    .line 9
    .line 10
    int-to-float v1, v1

    .line 11
    iget v2, p0, La/f4l0;->c:I

    .line 12
    .line 13
    int-to-float v2, v2

    .line 14
    invoke-virtual {v0, p1, v1, v2}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, La/f4l0;->getErrorDelegate()La/eue;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v1, p0, La/f4l0;->b:I

    .line 22
    .line 23
    int-to-float v1, v1

    .line 24
    iget p0, p0, La/f4l0;->k1:I

    .line 25
    .line 26
    int-to-float p0, p0

    .line 27
    invoke-virtual {v0, p1, v1, p0}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-direct {p0}, La/f4l0;->getShimmerDelegate()La/bte;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, La/f4l0;->getShimmerDelegate()La/bte;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, La/bte;->a()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget v1, p0, La/f4l0;->g1:I

    .line 22
    .line 23
    iget p1, p0, La/f4l0;->f:I

    .line 24
    .line 25
    add-int v3, v1, p1

    .line 26
    .line 27
    iget v0, p0, La/f4l0;->b:I

    .line 28
    .line 29
    iget v2, p0, La/f4l0;->n:I

    .line 30
    .line 31
    iget-object v4, p0, La/f4l0;->r:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 32
    .line 33
    move-object v5, p0

    .line 34
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 35
    .line 36
    .line 37
    move-object p5, v5

    .line 38
    iget p1, p5, La/f4l0;->i1:I

    .line 39
    .line 40
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    iget p2, p5, La/f4l0;->h1:I

    .line 45
    .line 46
    sub-int p2, p0, p2

    .line 47
    .line 48
    iget p0, p5, La/f4l0;->i1:I

    .line 49
    .line 50
    add-int/2addr p0, p0

    .line 51
    iget-object p3, p5, La/f4l0;->l1:La/j4l0;

    .line 52
    .line 53
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    add-int/2addr p3, p0

    .line 58
    iget p0, p5, La/f4l0;->h:I

    .line 59
    .line 60
    iget-object p4, p5, La/f4l0;->l1:La/j4l0;

    .line 61
    .line 62
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 63
    .line 64
    .line 65
    iget-object p0, p5, La/f4l0;->m1:La/a15;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_1

    .line 72
    .line 73
    invoke-virtual {p5, p0}, La/f4l0;->c(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    iget-object p0, p5, La/f4l0;->n1:La/e680;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_2

    .line 83
    .line 84
    invoke-virtual {p5, p0}, La/f4l0;->c(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    iget-object p0, p5, La/f4l0;->o1:La/tgn;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_3

    .line 94
    .line 95
    invoke-virtual {p5, p0}, La/f4l0;->c(Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    iget p0, p5, La/f4l0;->p:I

    .line 99
    .line 100
    iget p1, p5, La/f4l0;->o:I

    .line 101
    .line 102
    iget-object p2, p5, La/f4l0;->w:La/htj;

    .line 103
    .line 104
    invoke-virtual {p2, p0, p1}, La/htj;->b(II)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p5}, La/f4l0;->getWarningTagDelegate()La/yte;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    iget p1, p5, La/f4l0;->b:I

    .line 112
    .line 113
    iget p2, p5, La/f4l0;->q:I

    .line 114
    .line 115
    invoke-virtual {p0, p1, p1, p2}, La/yte;->a(III)V

    .line 116
    .line 117
    .line 118
    iget p0, p5, La/f4l0;->j1:I

    .line 119
    .line 120
    iget-object p1, p5, La/f4l0;->x:La/w18;

    .line 121
    .line 122
    iget-object p2, p1, La/w18;->p:La/due;

    .line 123
    .line 124
    iget-object v5, p1, La/w18;->a:La/f4l0;

    .line 125
    .line 126
    const/4 p3, 0x0

    .line 127
    if-eqz p2, :cond_4

    .line 128
    .line 129
    check-cast p2, Landroid/view/View;

    .line 130
    .line 131
    move-object v4, p2

    .line 132
    goto :goto_0

    .line 133
    :cond_4
    move-object v4, p3

    .line 134
    :goto_0
    if-nez v4, :cond_5

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    iget v0, p1, La/w18;->f:I

    .line 138
    .line 139
    iget p2, p1, La/w18;->j:I

    .line 140
    .line 141
    add-int v1, p0, p2

    .line 142
    .line 143
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    add-int v2, p2, v0

    .line 148
    .line 149
    iget p2, p1, La/w18;->j:I

    .line 150
    .line 151
    add-int/2addr p2, p0

    .line 152
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 153
    .line 154
    .line 155
    move-result p4

    .line 156
    add-int v3, p4, p2

    .line 157
    .line 158
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 159
    .line 160
    .line 161
    iget-object p2, p1, La/w18;->k:La/zse;

    .line 162
    .line 163
    if-eqz p2, :cond_6

    .line 164
    .line 165
    move-object p3, p2

    .line 166
    check-cast p3, Landroid/view/View;

    .line 167
    .line 168
    :cond_6
    move-object v4, p3

    .line 169
    if-nez v4, :cond_7

    .line 170
    .line 171
    :goto_1
    return-void

    .line 172
    :cond_7
    iget v0, p1, La/w18;->h:I

    .line 173
    .line 174
    iget p2, p1, La/w18;->i:I

    .line 175
    .line 176
    add-int v1, p0, p2

    .line 177
    .line 178
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    add-int v2, p2, v0

    .line 183
    .line 184
    iget p1, p1, La/w18;->i:I

    .line 185
    .line 186
    add-int/2addr p0, p1

    .line 187
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    add-int v3, p1, p0

    .line 192
    .line 193
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 194
    .line 195
    .line 196
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
    invoke-direct {v0}, La/f4l0;->getShimmerDelegate()La/bte;

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
    if-nez v4, :cond_0

    .line 22
    .line 23
    invoke-direct {v0}, La/f4l0;->getShimmerDelegate()La/bte;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, v3}, La/bte;->b(I)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_1a

    .line 31
    .line 32
    :cond_0
    iget v4, v0, La/f4l0;->b:I

    .line 33
    .line 34
    iget v5, v0, La/f4l0;->f:I

    .line 35
    .line 36
    add-int v6, v4, v5

    .line 37
    .line 38
    iget v7, v0, La/f4l0;->d:I

    .line 39
    .line 40
    add-int/2addr v6, v7

    .line 41
    invoke-direct {v0}, La/f4l0;->getSubTitleDelegate()La/eue;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    sub-int v6, v3, v6

    .line 46
    .line 47
    iget v8, v0, La/f4l0;->g:I

    .line 48
    .line 49
    sub-int/2addr v6, v8

    .line 50
    invoke-virtual {v7, v6}, La/eue;->c(I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0}, La/f4l0;->getSubTitleDelegate()La/eue;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget v6, v6, La/eue;->e:I

    .line 58
    .line 59
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    iget v7, v0, La/f4l0;->l:I

    .line 64
    .line 65
    add-int/2addr v6, v7

    .line 66
    iput v6, v0, La/f4l0;->y:I

    .line 67
    .line 68
    invoke-direct {v0}, La/f4l0;->getWarningTagDelegate()La/yte;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    mul-int/lit8 v7, v4, 0x2

    .line 73
    .line 74
    sub-int v7, v3, v7

    .line 75
    .line 76
    invoke-virtual {v6, v7}, La/yte;->b(I)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v0}, La/f4l0;->getWarningTagDelegate()La/yte;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    iget-object v6, v6, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 84
    .line 85
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    iget v7, v0, La/f4l0;->j:I

    .line 90
    .line 91
    add-int/2addr v6, v7

    .line 92
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-direct {v0}, La/f4l0;->getWarningTagDelegate()La/yte;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    iget-object v7, v7, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 101
    .line 102
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-nez v7, :cond_1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    const/4 v6, 0x0

    .line 110
    :goto_0
    if-eqz v6, :cond_2

    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    const/4 v6, 0x0

    .line 118
    :goto_1
    iput v6, v0, La/f4l0;->z:I

    .line 119
    .line 120
    iget v6, v0, La/f4l0;->y:I

    .line 121
    .line 122
    iget v10, v0, La/f4l0;->c:I

    .line 123
    .line 124
    add-int/2addr v6, v10

    .line 125
    iput v6, v0, La/f4l0;->q:I

    .line 126
    .line 127
    iget-object v6, v0, La/f4l0;->x:La/w18;

    .line 128
    .line 129
    iget v11, v6, La/w18;->f:I

    .line 130
    .line 131
    iget-object v12, v6, La/w18;->k:La/zse;

    .line 132
    .line 133
    if-eqz v12, :cond_3

    .line 134
    .line 135
    check-cast v12, Landroid/view/View;

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    const/4 v12, 0x0

    .line 139
    :goto_2
    if-eqz v12, :cond_4

    .line 140
    .line 141
    invoke-virtual {v12, v1, v2}, Landroid/view/View;->measure(II)V

    .line 142
    .line 143
    .line 144
    :cond_4
    iget-object v12, v6, La/w18;->k:La/zse;

    .line 145
    .line 146
    if-eqz v12, :cond_5

    .line 147
    .line 148
    check-cast v12, Landroid/view/View;

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    const/4 v12, 0x0

    .line 152
    :goto_3
    if-eqz v12, :cond_6

    .line 153
    .line 154
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    goto :goto_4

    .line 159
    :cond_6
    const/4 v12, 0x0

    .line 160
    :goto_4
    iget-object v13, v6, La/w18;->p:La/due;

    .line 161
    .line 162
    if-eqz v13, :cond_7

    .line 163
    .line 164
    check-cast v13, Landroid/view/View;

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_7
    const/4 v13, 0x0

    .line 168
    :goto_5
    const/high16 v14, 0x40000000    # 2.0f

    .line 169
    .line 170
    if-nez v13, :cond_8

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_8
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    instance-of v7, v13, La/l5k0;

    .line 178
    .line 179
    if-eqz v7, :cond_9

    .line 180
    .line 181
    mul-int/lit8 v7, v11, 0x2

    .line 182
    .line 183
    sub-int/2addr v15, v7

    .line 184
    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    invoke-virtual {v13, v7, v2}, Landroid/view/View;->measure(II)V

    .line 189
    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_9
    instance-of v7, v13, La/x18;

    .line 193
    .line 194
    if-eqz v7, :cond_a

    .line 195
    .line 196
    mul-int/lit8 v7, v11, 0x2

    .line 197
    .line 198
    sub-int/2addr v15, v7

    .line 199
    move-object v7, v13

    .line 200
    check-cast v7, La/x18;

    .line 201
    .line 202
    invoke-virtual {v7, v12}, La/x18;->setScoreViewOccupiedWidth(I)V

    .line 203
    .line 204
    .line 205
    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    invoke-virtual {v13, v7, v2}, Landroid/view/View;->measure(II)V

    .line 210
    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_a
    iget-object v7, v6, La/w18;->k:La/zse;

    .line 214
    .line 215
    if-nez v7, :cond_b

    .line 216
    .line 217
    move v7, v11

    .line 218
    goto :goto_6

    .line 219
    :cond_b
    iget v7, v6, La/w18;->g:I

    .line 220
    .line 221
    add-int/2addr v7, v12

    .line 222
    add-int/2addr v7, v11

    .line 223
    :goto_6
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    sub-int/2addr v12, v11

    .line 228
    sub-int/2addr v12, v7

    .line 229
    invoke-static {v12, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    invoke-virtual {v13, v7, v2}, Landroid/view/View;->measure(II)V

    .line 234
    .line 235
    .line 236
    :goto_7
    iget-object v7, v6, La/w18;->k:La/zse;

    .line 237
    .line 238
    if-eqz v7, :cond_c

    .line 239
    .line 240
    check-cast v7, Landroid/view/View;

    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_c
    const/4 v7, 0x0

    .line 244
    :goto_8
    if-eqz v7, :cond_d

    .line 245
    .line 246
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    goto :goto_9

    .line 251
    :cond_d
    const/4 v7, 0x0

    .line 252
    :goto_9
    iget-object v12, v6, La/w18;->p:La/due;

    .line 253
    .line 254
    if-eqz v12, :cond_e

    .line 255
    .line 256
    check-cast v12, Landroid/view/View;

    .line 257
    .line 258
    goto :goto_a

    .line 259
    :cond_e
    const/4 v12, 0x0

    .line 260
    :goto_a
    if-eqz v12, :cond_f

    .line 261
    .line 262
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredHeight()I

    .line 263
    .line 264
    .line 265
    move-result v12

    .line 266
    goto :goto_b

    .line 267
    :cond_f
    const/4 v12, 0x0

    .line 268
    :goto_b
    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    iput v7, v6, La/w18;->d:I

    .line 273
    .line 274
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 275
    .line 276
    .line 277
    move-result v7

    .line 278
    iget-object v13, v6, La/w18;->k:La/zse;

    .line 279
    .line 280
    if-eqz v13, :cond_10

    .line 281
    .line 282
    move-object v15, v13

    .line 283
    check-cast v15, Landroid/view/View;

    .line 284
    .line 285
    goto :goto_c

    .line 286
    :cond_10
    const/4 v15, 0x0

    .line 287
    :goto_c
    if-nez v15, :cond_11

    .line 288
    .line 289
    goto :goto_12

    .line 290
    :cond_11
    if-eqz v13, :cond_12

    .line 291
    .line 292
    check-cast v13, Landroid/view/View;

    .line 293
    .line 294
    goto :goto_d

    .line 295
    :cond_12
    const/4 v13, 0x0

    .line 296
    :goto_d
    if-eqz v13, :cond_13

    .line 297
    .line 298
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 299
    .line 300
    .line 301
    move-result v13

    .line 302
    goto :goto_e

    .line 303
    :cond_13
    const/4 v13, 0x0

    .line 304
    :goto_e
    iget-object v9, v6, La/w18;->p:La/due;

    .line 305
    .line 306
    instance-of v9, v9, La/siz;

    .line 307
    .line 308
    if-eqz v9, :cond_14

    .line 309
    .line 310
    sub-int/2addr v7, v11

    .line 311
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    :goto_f
    sub-int/2addr v7, v9

    .line 316
    goto :goto_10

    .line 317
    :cond_14
    mul-int/lit8 v9, v11, 0x2

    .line 318
    .line 319
    sub-int/2addr v7, v9

    .line 320
    div-int/lit8 v7, v7, 0x2

    .line 321
    .line 322
    add-int/2addr v7, v11

    .line 323
    invoke-virtual {v15}, Landroid/view/View;->getMeasuredWidth()I

    .line 324
    .line 325
    .line 326
    move-result v9

    .line 327
    div-int/lit8 v9, v9, 0x2

    .line 328
    .line 329
    goto :goto_f

    .line 330
    :goto_10
    iput v7, v6, La/w18;->h:I

    .line 331
    .line 332
    iget-object v7, v6, La/w18;->p:La/due;

    .line 333
    .line 334
    instance-of v7, v7, La/siz;

    .line 335
    .line 336
    if-eqz v7, :cond_15

    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    goto :goto_11

    .line 340
    :cond_15
    iget v7, v6, La/w18;->d:I

    .line 341
    .line 342
    div-int/lit8 v7, v7, 0x2

    .line 343
    .line 344
    div-int/lit8 v13, v13, 0x2

    .line 345
    .line 346
    sub-int/2addr v7, v13

    .line 347
    :goto_11
    iput v7, v6, La/w18;->i:I

    .line 348
    .line 349
    :goto_12
    iget-object v7, v6, La/w18;->k:La/zse;

    .line 350
    .line 351
    instance-of v7, v7, La/lxp0;

    .line 352
    .line 353
    iget v9, v6, La/w18;->d:I

    .line 354
    .line 355
    if-eqz v7, :cond_16

    .line 356
    .line 357
    sub-int v7, v9, v12

    .line 358
    .line 359
    goto :goto_13

    .line 360
    :cond_16
    div-int/lit8 v7, v9, 0x2

    .line 361
    .line 362
    div-int/lit8 v12, v12, 0x2

    .line 363
    .line 364
    sub-int/2addr v7, v12

    .line 365
    :goto_13
    iput v7, v6, La/w18;->j:I

    .line 366
    .line 367
    iget v6, v0, La/f4l0;->y:I

    .line 368
    .line 369
    add-int/2addr v6, v10

    .line 370
    iget v7, v0, La/f4l0;->z:I

    .line 371
    .line 372
    add-int/2addr v6, v7

    .line 373
    iput v6, v0, La/f4l0;->j1:I

    .line 374
    .line 375
    iput v9, v0, La/f4l0;->A:I

    .line 376
    .line 377
    invoke-direct {v0}, La/f4l0;->getErrorDelegate()La/eue;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    mul-int/lit8 v4, v4, 0x2

    .line 382
    .line 383
    sub-int/2addr v3, v4

    .line 384
    invoke-virtual {v6, v3}, La/eue;->c(I)V

    .line 385
    .line 386
    .line 387
    iget v3, v0, La/f4l0;->y:I

    .line 388
    .line 389
    add-int/2addr v3, v10

    .line 390
    iget v4, v0, La/f4l0;->z:I

    .line 391
    .line 392
    add-int/2addr v3, v4

    .line 393
    iget v4, v0, La/f4l0;->A:I

    .line 394
    .line 395
    add-int/2addr v3, v4

    .line 396
    iput v3, v0, La/f4l0;->k1:I

    .line 397
    .line 398
    invoke-direct {v0}, La/f4l0;->getErrorDelegate()La/eue;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    iget v3, v3, La/eue;->e:I

    .line 403
    .line 404
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-direct {v0}, La/f4l0;->getErrorDelegate()La/eue;

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
    if-nez v4, :cond_17

    .line 417
    .line 418
    move-object v9, v3

    .line 419
    goto :goto_14

    .line 420
    :cond_17
    const/4 v9, 0x0

    .line 421
    :goto_14
    if-eqz v9, :cond_18

    .line 422
    .line 423
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    goto :goto_15

    .line 428
    :cond_18
    const/4 v3, 0x0

    .line 429
    :goto_15
    iput v3, v0, La/f4l0;->B:I

    .line 430
    .line 431
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    iget-object v4, v0, La/f4l0;->w:La/htj;

    .line 436
    .line 437
    iget-object v6, v4, La/htj;->d:Landroid/widget/ImageView;

    .line 438
    .line 439
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 440
    .line 441
    .line 442
    move-result v6

    .line 443
    iget v7, v0, La/f4l0;->h:I

    .line 444
    .line 445
    if-nez v6, :cond_19

    .line 446
    .line 447
    goto :goto_16

    .line 448
    :cond_19
    move v8, v7

    .line 449
    :goto_16
    iput v8, v0, La/f4l0;->h1:I

    .line 450
    .line 451
    iget v6, v0, La/f4l0;->y:I

    .line 452
    .line 453
    add-int/2addr v6, v10

    .line 454
    iget v9, v0, La/f4l0;->z:I

    .line 455
    .line 456
    add-int/2addr v6, v9

    .line 457
    iget v9, v0, La/f4l0;->A:I

    .line 458
    .line 459
    add-int/2addr v6, v9

    .line 460
    iget v9, v0, La/f4l0;->k:I

    .line 461
    .line 462
    add-int/2addr v6, v9

    .line 463
    iget v11, v0, La/f4l0;->B:I

    .line 464
    .line 465
    add-int/2addr v6, v11

    .line 466
    iput v6, v0, La/f4l0;->i1:I

    .line 467
    .line 468
    sub-int/2addr v3, v8

    .line 469
    sub-int/2addr v3, v7

    .line 470
    invoke-static {v3, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    iget-object v6, v0, La/f4l0;->l1:La/j4l0;

    .line 475
    .line 476
    invoke-virtual {v6, v3, v2}, Landroid/view/View;->measure(II)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    mul-int/lit8 v9, v9, 0x2

    .line 484
    .line 485
    add-int/2addr v9, v3

    .line 486
    iput v9, v0, La/f4l0;->f1:I

    .line 487
    .line 488
    iget-object v3, v0, La/f4l0;->m1:La/a15;

    .line 489
    .line 490
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    if-nez v6, :cond_1a

    .line 495
    .line 496
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    mul-int/lit8 v8, v7, 0x2

    .line 501
    .line 502
    sub-int/2addr v6, v8

    .line 503
    invoke-static {v6, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 504
    .line 505
    .line 506
    move-result v6

    .line 507
    invoke-virtual {v3, v6, v2}, Landroid/view/View;->measure(II)V

    .line 508
    .line 509
    .line 510
    :cond_1a
    iget-object v6, v0, La/f4l0;->n1:La/e680;

    .line 511
    .line 512
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    if-nez v8, :cond_1b

    .line 517
    .line 518
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 519
    .line 520
    .line 521
    move-result v8

    .line 522
    mul-int/lit8 v9, v7, 0x2

    .line 523
    .line 524
    sub-int/2addr v8, v9

    .line 525
    invoke-static {v8, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 526
    .line 527
    .line 528
    move-result v8

    .line 529
    invoke-virtual {v6, v8, v2}, Landroid/view/View;->measure(II)V

    .line 530
    .line 531
    .line 532
    :cond_1b
    iget-object v8, v0, La/f4l0;->o1:La/tgn;

    .line 533
    .line 534
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 535
    .line 536
    .line 537
    move-result v9

    .line 538
    if-nez v9, :cond_1c

    .line 539
    .line 540
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 541
    .line 542
    .line 543
    move-result v9

    .line 544
    mul-int/lit8 v7, v7, 0x2

    .line 545
    .line 546
    sub-int/2addr v9, v7

    .line 547
    invoke-static {v9, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 548
    .line 549
    .line 550
    move-result v7

    .line 551
    invoke-virtual {v8, v7, v2}, Landroid/view/View;->measure(II)V

    .line 552
    .line 553
    .line 554
    :cond_1c
    invoke-virtual {v0}, La/f4l0;->d()I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 563
    .line 564
    .line 565
    move-result v7

    .line 566
    if-nez v7, :cond_1d

    .line 567
    .line 568
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    goto :goto_17

    .line 573
    :cond_1d
    const/4 v3, 0x0

    .line 574
    :goto_17
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 575
    .line 576
    .line 577
    move-result v7

    .line 578
    if-nez v7, :cond_1e

    .line 579
    .line 580
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 581
    .line 582
    .line 583
    move-result v6

    .line 584
    goto :goto_18

    .line 585
    :cond_1e
    const/4 v6, 0x0

    .line 586
    :goto_18
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 587
    .line 588
    .line 589
    move-result v7

    .line 590
    if-nez v7, :cond_1f

    .line 591
    .line 592
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 593
    .line 594
    .line 595
    move-result v7

    .line 596
    goto :goto_19

    .line 597
    :cond_1f
    const/4 v7, 0x0

    .line 598
    :goto_19
    add-int/2addr v3, v6

    .line 599
    add-int/2addr v3, v7

    .line 600
    invoke-virtual {v4}, La/htj;->c()V

    .line 601
    .line 602
    .line 603
    sub-int/2addr v2, v3

    .line 604
    iget v3, v0, La/f4l0;->i:I

    .line 605
    .line 606
    sub-int/2addr v2, v3

    .line 607
    iget v3, v0, La/f4l0;->f1:I

    .line 608
    .line 609
    div-int/lit8 v3, v3, 0x2

    .line 610
    .line 611
    sub-int/2addr v2, v3

    .line 612
    iput v2, v0, La/f4l0;->o:I

    .line 613
    .line 614
    iget v2, v0, La/f4l0;->y:I

    .line 615
    .line 616
    add-int/2addr v2, v10

    .line 617
    div-int/lit8 v2, v2, 0x2

    .line 618
    .line 619
    iput v2, v0, La/f4l0;->p:I

    .line 620
    .line 621
    invoke-direct {v0}, La/f4l0;->getSubTitleDelegate()La/eue;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    iget v2, v2, La/eue;->e:I

    .line 626
    .line 627
    div-int/lit8 v2, v2, 0x2

    .line 628
    .line 629
    add-int/2addr v2, v10

    .line 630
    div-int/lit8 v5, v5, 0x2

    .line 631
    .line 632
    sub-int/2addr v2, v5

    .line 633
    iput v2, v0, La/f4l0;->g1:I

    .line 634
    .line 635
    :goto_1a
    invoke-virtual {v0}, La/f4l0;->d()I

    .line 636
    .line 637
    .line 638
    move-result v2

    .line 639
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 640
    .line 641
    .line 642
    return-void
.end method

.method public setAutoSub(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/f4l0;->m1:La/a15;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, La/a15;->setAutoSubText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move p1, v1

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 37
    :goto_2
    if-nez p1, :cond_4

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_4
    const/16 v1, 0x8

    .line 41
    .line 42
    :goto_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 46
    .line 47
    .line 48
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
    iget-object p0, p0, La/f4l0;->m1:La/a15;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/a15;->setOnAutoSubClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
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
    iget-object p0, p0, La/f4l0;->w:La/htj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/htj;->d(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setCouponBonusTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/f4l0;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setEachWay(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/f4l0;->o1:La/tgn;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, La/tgn;->setEachWayText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move p1, v1

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 37
    :goto_2
    if-nez p1, :cond_4

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_4
    const/16 v1, 0x8

    .line 41
    .line 42
    :goto_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 46
    .line 47
    .line 48
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
    iget-object p0, p0, La/f4l0;->o1:La/tgn;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/tgn;->setOnEachWayClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setError(I)V
    .locals 0

    .line 12
    invoke-direct {p0}, La/f4l0;->getErrorDelegate()La/eue;

    move-result-object p0

    invoke-virtual {p0, p1}, La/eue;->d(I)V

    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-direct {p0}, La/f4l0;->getErrorDelegate()La/eue;

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

.method public final setMarketCoefficient(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/f4l0;->l1:La/j4l0;

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
    iget-object p0, p0, La/f4l0;->l1:La/j4l0;

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
    iget-object v0, p0, La/f4l0;->l1:La/j4l0;

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
    iget-object v0, p0, La/f4l0;->l1:La/j4l0;

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
    iget-object p0, p0, La/f4l0;->l1:La/j4l0;

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
    iget-object v3, p0, La/f4l0;->r:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 10
    .line 11
    invoke-static {v3, v0, v1, v2}, Lorg/xplatform/uikit/components/views/LoadableImageView;->h(Lorg/xplatform/uikit/components/views/LoadableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, La/fue;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/f4l0;->setTagText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget v0, p1, La/fue;->c:I

    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/f4l0;->setTagColor(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p1, La/fue;->e:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, La/f4l0;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, La/fue;->f:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/f4l0;->setError(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, La/fue;->i:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p1, La/fue;->h:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, p1, La/fue;->j:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p0, La/f4l0;->l1:La/j4l0;

    .line 41
    .line 42
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    if-nez v4, :cond_0

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p0, v1}, La/f4l0;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, La/f4l0;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v2}, La/f4l0;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    iget v0, p1, La/fue;->m:I

    .line 61
    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p0, v0}, La/f4l0;->setMarketStyle(Ljava/lang/Integer;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p1, La/fue;->n:La/j0d;

    .line 70
    .line 71
    invoke-virtual {p0, v0}, La/f4l0;->setMarketCoefficientState(La/j0d;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, La/f4l0;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p1, La/fue;->l:La/cue;

    .line 78
    .line 79
    iget-object v1, p1, La/fue;->k:La/yse;

    .line 80
    .line 81
    iget-object v2, p0, La/f4l0;->x:La/w18;

    .line 82
    .line 83
    invoke-virtual {v2, v0, v1}, La/w18;->a(La/cue;La/yse;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p1, La/fue;->q:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p0, v0}, La/f4l0;->setAutoSub(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p1, La/fue;->r:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p0, v0}, La/f4l0;->setOptionBet(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, p1, La/fue;->s:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p0, p1}, La/f4l0;->setEachWay(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
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
    iget-object p0, p0, La/f4l0;->w:La/htj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/htj;->e(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOptionBet(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/f4l0;->n1:La/e680;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, La/e680;->setOptionBetText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move p1, v1

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 37
    :goto_2
    if-nez p1, :cond_4

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_4
    const/16 v1, 0x8

    .line 41
    .line 42
    :goto_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 46
    .line 47
    .line 48
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
    iget-object p0, p0, La/f4l0;->n1:La/e680;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/e680;->setOnOptionBetClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setRtlSupportEnabled(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, La/f4l0;->x:La/w18;

    .line 2
    .line 3
    iput-boolean p1, p0, La/w18;->e:Z

    .line 4
    .line 5
    iget-object p1, p0, La/w18;->c:La/cue;

    .line 6
    .line 7
    iget-object v0, p0, La/w18;->b:La/yse;

    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, La/w18;->a(La/cue;La/yse;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setScoreUiModel(La/yse;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/f4l0;->x:La/w18;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/w18;->c:La/cue;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1}, La/w18;->a(La/cue;La/yse;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setSportImage(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/f4l0;->r:Lorg/xplatform/uikit/components/views/LoadableImageView;

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
    invoke-virtual {p0, p1}, La/f4l0;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setSubTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 13
    invoke-direct {p0}, La/f4l0;->getSubTitleDelegate()La/eue;

    move-result-object v0

    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTagColor(I)V
    .locals 0

    .line 17
    invoke-direct {p0}, La/f4l0;->getWarningTagDelegate()La/yte;

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
    invoke-direct {p0}, La/f4l0;->getWarningTagDelegate()La/yte;

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
    invoke-direct {p0}, La/f4l0;->getWarningTagDelegate()La/yte;

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
    invoke-direct {p0}, La/f4l0;->getWarningTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, La/f4l0;->getWarningTagDelegate()La/yte;

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
    iget-object p0, p0, La/f4l0;->x:La/w18;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/w18;->b:La/yse;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, La/w18;->a(La/cue;La/yse;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
