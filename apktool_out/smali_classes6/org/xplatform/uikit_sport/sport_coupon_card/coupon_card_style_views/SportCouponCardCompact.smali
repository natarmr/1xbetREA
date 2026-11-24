.class public final Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/pse;
.implements La/mue;
.implements La/lue;
.implements La/nue;
.implements La/iue;
.implements La/gue;


# static fields
.field public static final synthetic x:I


# instance fields
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

.field public final k:La/eue;

.field public final l:La/n0o0;

.field public final m:La/eue;

.field public final n:La/n0o0;

.field public final o:La/n0o0;

.field public final p:La/n0o0;

.field public final q:La/n0o0;

.field public final r:La/n0o0;

.field public final s:La/n0o0;

.field public final t:La/htj;

.field public final u:La/j4l0;

.field public final v:Lorg/xplatform/uikit/components/views/LoadableImageView;

.field public w:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 475
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 474
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    and-int/lit8 v3, p3, 0x2

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v3, p2

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const v5, 0x7f04085b

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, v3, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    .line 23
    .line 24
    new-instance v6, La/i4l0;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    invoke-direct {v6, v0, v7}, La/i4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->a:La/n0o0;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const v8, 0x7f0706a8

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->b:I

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    const v8, 0x7f07064b

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->c:I

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const v8, 0x7f0706a9

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->d:I

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const v9, 0x7f070635

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimension(I)F

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    float-to-int v6, v6

    .line 87
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->e:I

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    const v9, 0x7f07074a

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimension(I)F

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    const v10, 0x7f07074b

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimension(I)F

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    const v11, 0x7f070717

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    iput v10, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->f:I

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    const v11, 0x7f070722

    .line 129
    .line 130
    .line 131
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    const v12, 0x7f07072d

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    iput v11, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->g:I

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    const v12, 0x7f0706e2

    .line 153
    .line 154
    .line 155
    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    iput v11, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->h:I

    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object v12

    .line 165
    const v13, 0x7f0706ea

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    iput v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->i:I

    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    const v13, 0x7f070711

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    iput v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->j:I

    .line 186
    .line 187
    new-instance v12, La/eue;

    .line 188
    .line 189
    const v13, 0x7f140463

    .line 190
    .line 191
    .line 192
    const/4 v14, 0x3

    .line 193
    invoke-direct {v12, v14, v7, v13, v0}, La/eue;-><init>(IIILandroid/view/View;)V

    .line 194
    .line 195
    .line 196
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->k:La/eue;

    .line 197
    .line 198
    new-instance v12, La/i4l0;

    .line 199
    .line 200
    const/4 v13, 0x1

    .line 201
    invoke-direct {v12, v0, v13}, La/i4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;B)V

    .line 202
    .line 203
    .line 204
    invoke-static {v12}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->l:La/n0o0;

    .line 209
    .line 210
    new-instance v12, La/eue;

    .line 211
    .line 212
    const v15, 0x7f14045d

    .line 213
    .line 214
    .line 215
    invoke-direct {v12, v13, v7, v15, v0}, La/eue;-><init>(IIILandroid/view/View;)V

    .line 216
    .line 217
    .line 218
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->m:La/eue;

    .line 219
    .line 220
    new-instance v12, La/i4l0;

    .line 221
    .line 222
    invoke-direct {v12, v0, v2}, La/i4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;B)V

    .line 223
    .line 224
    .line 225
    invoke-static {v12}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->n:La/n0o0;

    .line 230
    .line 231
    new-instance v12, La/i4l0;

    .line 232
    .line 233
    invoke-direct {v12, v0, v14}, La/i4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;B)V

    .line 234
    .line 235
    .line 236
    invoke-static {v12}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 237
    .line 238
    .line 239
    move-result-object v12

    .line 240
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->o:La/n0o0;

    .line 241
    .line 242
    new-instance v12, La/i4l0;

    .line 243
    .line 244
    const/4 v15, 0x4

    .line 245
    invoke-direct {v12, v0, v15}, La/i4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;B)V

    .line 246
    .line 247
    .line 248
    invoke-static {v12}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->p:La/n0o0;

    .line 253
    .line 254
    new-instance v12, La/i4l0;

    .line 255
    .line 256
    const/4 v15, 0x5

    .line 257
    invoke-direct {v12, v0, v15}, La/i4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;B)V

    .line 258
    .line 259
    .line 260
    invoke-static {v12}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->q:La/n0o0;

    .line 265
    .line 266
    new-instance v12, La/i4l0;

    .line 267
    .line 268
    const/4 v14, 0x6

    .line 269
    invoke-direct {v12, v0, v14}, La/i4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;B)V

    .line 270
    .line 271
    .line 272
    invoke-static {v12}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 273
    .line 274
    .line 275
    move-result-object v12

    .line 276
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->r:La/n0o0;

    .line 277
    .line 278
    new-instance v12, La/i4l0;

    .line 279
    .line 280
    const/4 v15, 0x7

    .line 281
    invoke-direct {v12, v0, v15}, La/i4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;B)V

    .line 282
    .line 283
    .line 284
    invoke-static {v12}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->s:La/n0o0;

    .line 289
    .line 290
    new-instance v12, La/htj;

    .line 291
    .line 292
    const v13, 0x7f080a30

    .line 293
    .line 294
    .line 295
    const v2, 0x7f07069b

    .line 296
    .line 297
    .line 298
    invoke-direct {v12, v0, v13, v8, v2}, La/htj;-><init>(Landroid/view/ViewGroup;III)V

    .line 299
    .line 300
    .line 301
    iget-object v2, v12, La/htj;->d:Landroid/widget/ImageView;

    .line 302
    .line 303
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 304
    .line 305
    .line 306
    iget-object v2, v12, La/htj;->c:Landroid/widget/ImageView;

    .line 307
    .line 308
    invoke-virtual {v2, v11, v11, v11, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 312
    .line 313
    .line 314
    iput-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->t:La/htj;

    .line 315
    .line 316
    new-instance v2, La/j4l0;

    .line 317
    .line 318
    invoke-direct {v2, v1}, La/j4l0;-><init>(Landroid/content/Context;)V

    .line 319
    .line 320
    .line 321
    sget-object v8, La/xr20;->a:La/xr20;

    .line 322
    .line 323
    invoke-virtual {v2, v8}, La/j4l0;->setMarketBlockedIconPosition(La/xr20;)V

    .line 324
    .line 325
    .line 326
    const v8, 0x7f1404a1

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v8}, La/j4l0;->setDescriptionTextStyle(I)V

    .line 330
    .line 331
    .line 332
    const v8, 0x7f140497

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v8}, La/j4l0;->setCoefficientTextStyle(I)V

    .line 336
    .line 337
    .line 338
    const v8, 0x7fffffff

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v8}, La/j4l0;->setDescriptionMaxLines(I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v9}, La/j4l0;->setCoefficientMaxTextSize(F)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v6}, La/j4l0;->setCoefficientMinTextSize(F)V

    .line 348
    .line 349
    .line 350
    iput-object v2, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

    .line 351
    .line 352
    new-instance v6, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 353
    .line 354
    invoke-direct {v6, v1, v4, v14, v7}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 355
    .line 356
    .line 357
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->v:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 358
    .line 359
    sget-object v4, La/cqd0;->i:[I

    .line 360
    .line 361
    invoke-virtual {v1, v3, v4, v5, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    invoke-virtual {v4, v14, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    if-eqz v8, :cond_1

    .line 370
    .line 371
    invoke-virtual {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->a()V

    .line 372
    .line 373
    .line 374
    :cond_1
    const/16 v8, 0xa

    .line 375
    .line 376
    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v8

    .line 380
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setTitle(Ljava/lang/CharSequence;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v8

    .line 387
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 388
    .line 389
    .line 390
    const/16 v8, 0x8

    .line 391
    .line 392
    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v8

    .line 396
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setTagText(Ljava/lang/CharSequence;)V

    .line 397
    .line 398
    .line 399
    const/16 v8, 0x9

    .line 400
    .line 401
    invoke-static {v8, v1, v4}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    if-eqz v1, :cond_2

    .line 406
    .line 407
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setTagColor(Landroid/content/res/ColorStateList;)V

    .line 408
    .line 409
    .line 410
    :cond_2
    const/4 v1, 0x2

    .line 411
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setError(Ljava/lang/CharSequence;)V

    .line 416
    .line 417
    .line 418
    const/4 v1, 0x1

    .line 419
    invoke-virtual {v4, v1, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setMarketStyle(Ljava/lang/Integer;)V

    .line 428
    .line 429
    .line 430
    const/4 v1, 0x5

    .line 431
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    const/4 v7, 0x3

    .line 436
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    if-nez v8, :cond_3

    .line 445
    .line 446
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 447
    .line 448
    .line 449
    :cond_3
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, v7}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 459
    .line 460
    .line 461
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getBackgroundTintHelper()La/od5;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-virtual {v1, v3, v5}, La/od5;->a(Landroid/util/AttributeSet;I)V

    .line 466
    .line 467
    .line 468
    const-string v1, "SportCouponCardCompactTest"

    .line 469
    .line 470
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    return-void
.end method

.method private final getAutoSubTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->p:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->a:La/n0o0;

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

.method private final getEachWayTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->r:La/n0o0;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->f:I

    .line 24
    .line 25
    add-int/2addr v0, p0

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method private final getErrorDelegate()La/eue;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->n:La/n0o0;

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

.method private final getOptionBetTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->q:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->s:La/n0o0;

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

.method private final getStartSpaceDependsByIndicator()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->w:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->j:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->i:I

    .line 9
    .line 10
    return p0
.end method

.method private final getSubTitleDelegate()La/eue;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->l:La/n0o0;

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

.method private final getTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->o:La/n0o0;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getShimmerDelegate()La/bte;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/j4l0;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p2}, La/j4l0;->setMarketCoefficientState(La/j0d;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const p1, 0x7f040b55

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const p1, 0x7f040b0b

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {p1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->v:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->w:Landroid/graphics/Paint;

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getShimmerDelegate()La/bte;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->d()V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->w:Landroid/graphics/Paint;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const v2, 0x7f040b0b

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->b:I

    .line 24
    .line 25
    int-to-float v1, v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 31
    .line 32
    .line 33
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->w:Landroid/graphics/Paint;

    .line 44
    .line 45
    return-void
.end method

.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getBackgroundTintHelper()La/od5;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getErrorDelegate()La/eue;

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
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->i:I

    .line 5
    .line 6
    int-to-float v1, v0

    .line 7
    iget v2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->c:I

    .line 8
    .line 9
    add-int/2addr v2, v0

    .line 10
    iget v3, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->f:I

    .line 11
    .line 12
    add-int/2addr v2, v3

    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    int-to-float v2, v2

    .line 18
    invoke-virtual {v4, p1, v2, v1}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget v2, v2, La/eue;->e:I

    .line 26
    .line 27
    int-to-float v2, v2

    .line 28
    add-float/2addr v1, v2

    .line 29
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v2, v2, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v2, v2, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/2addr v2, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v2, 0x0

    .line 54
    :goto_0
    add-int/2addr v2, v3

    .line 55
    int-to-float v2, v2

    .line 56
    add-float/2addr v1, v2

    .line 57
    iget v2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->j:I

    .line 58
    .line 59
    int-to-float v4, v2

    .line 60
    iget-object v5, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->m:La/eue;

    .line 61
    .line 62
    invoke-virtual {v5, p1, v4, v1}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 63
    .line 64
    .line 65
    iget v4, v5, La/eue;->e:I

    .line 66
    .line 67
    int-to-float v4, v4

    .line 68
    add-float/2addr v1, v4

    .line 69
    int-to-float v2, v2

    .line 70
    iget-object v4, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->k:La/eue;

    .line 71
    .line 72
    invoke-virtual {v4, p1, v2, v1}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 73
    .line 74
    .line 75
    iget v2, v4, La/eue;->e:I

    .line 76
    .line 77
    int-to-float v2, v2

    .line 78
    add-float/2addr v1, v2

    .line 79
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getErrorDelegate()La/eue;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2}, La/eue;->b()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_1

    .line 88
    .line 89
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getErrorDelegate()La/eue;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getStartSpaceDependsByIndicator()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    int-to-float v4, v4

    .line 98
    invoke-virtual {v2, p1, v4, v1}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getErrorDelegate()La/eue;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget v2, v2, La/eue;->e:I

    .line 106
    .line 107
    int-to-float v2, v2

    .line 108
    add-float/2addr v1, v2

    .line 109
    :cond_1
    int-to-float v2, v0

    .line 110
    iget-object v4, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->v:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 111
    .line 112
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    div-int/lit8 v4, v4, 0x2

    .line 117
    .line 118
    int-to-float v4, v4

    .line 119
    add-float/2addr v2, v4

    .line 120
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-nez v4, :cond_2

    .line 125
    .line 126
    :goto_1
    move v5, v2

    .line 127
    goto :goto_2

    .line 128
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    int-to-float v4, v4

    .line 133
    sub-float v2, v4, v2

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :goto_2
    iget-object v9, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->w:Landroid/graphics/Paint;

    .line 137
    .line 138
    if-eqz v9, :cond_3

    .line 139
    .line 140
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    iget v2, v2, La/eue;->e:I

    .line 145
    .line 146
    add-int/2addr v0, v2

    .line 147
    iget p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->h:I

    .line 148
    .line 149
    add-int/2addr v0, p0

    .line 150
    int-to-float v6, v0

    .line 151
    int-to-float p0, v3

    .line 152
    sub-float v8, v1, p0

    .line 153
    .line 154
    move v7, v5

    .line 155
    move-object v4, p1

    .line 156
    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 11

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getShimmerDelegate()La/bte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getShimmerDelegate()La/bte;

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
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget p2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->i:I

    .line 26
    .line 27
    sub-int/2addr p1, p2

    .line 28
    iget-object p3, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

    .line 29
    .line 30
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 31
    .line 32
    .line 33
    move-result p4

    .line 34
    sub-int v1, p1, p4

    .line 35
    .line 36
    iget-object v4, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

    .line 37
    .line 38
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->i:I

    .line 43
    .line 44
    add-int v2, p1, v0

    .line 45
    .line 46
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    add-int v3, p1, v1

    .line 51
    .line 52
    move-object v5, p0

    .line 53
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget p1, p1, La/eue;->e:I

    .line 61
    .line 62
    add-int/2addr p1, p2

    .line 63
    iget p4, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->g:I

    .line 64
    .line 65
    add-int/2addr p1, p4

    .line 66
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getStartSpaceDependsByIndicator()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {v0, v1, p2, p1}, La/yte;->a(III)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getAutoSubTagDelegate()La/yte;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object p1, p1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    iget v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->d:I

    .line 88
    .line 89
    iget-object v1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->t:La/htj;

    .line 90
    .line 91
    if-nez p1, :cond_2

    .line 92
    .line 93
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iget p1, p1, La/eue;->e:I

    .line 98
    .line 99
    div-int/lit8 p1, p1, 0x2

    .line 100
    .line 101
    add-int/2addr p1, p2

    .line 102
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getAutoSubTagDelegate()La/yte;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget v2, v2, La/yte;->b:I

    .line 107
    .line 108
    div-int/lit8 v2, v2, 0x2

    .line 109
    .line 110
    sub-int/2addr p1, v2

    .line 111
    iget-object v2, v1, La/htj;->c:Landroid/widget/ImageView;

    .line 112
    .line 113
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_1

    .line 118
    .line 119
    move v2, v0

    .line 120
    goto :goto_0

    .line 121
    :cond_1
    move v2, p2

    .line 122
    :goto_0
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getAutoSubTagDelegate()La/yte;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    sub-int/2addr v4, v2

    .line 131
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getAutoSubTagDelegate()La/yte;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    iget-object v5, v5, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 136
    .line 137
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    sub-int/2addr v4, v5

    .line 142
    invoke-virtual {v3, v4, v2, p1}, La/yte;->a(III)V

    .line 143
    .line 144
    .line 145
    :cond_2
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getOptionBetTagDelegate()La/yte;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object p1, p1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-nez p1, :cond_4

    .line 156
    .line 157
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iget p1, p1, La/eue;->e:I

    .line 162
    .line 163
    div-int/lit8 p1, p1, 0x2

    .line 164
    .line 165
    add-int/2addr p1, p2

    .line 166
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getOptionBetTagDelegate()La/yte;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iget v2, v2, La/yte;->b:I

    .line 171
    .line 172
    div-int/lit8 v2, v2, 0x2

    .line 173
    .line 174
    sub-int/2addr p1, v2

    .line 175
    iget-object v2, v1, La/htj;->c:Landroid/widget/ImageView;

    .line 176
    .line 177
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-nez v2, :cond_3

    .line 182
    .line 183
    move v2, v0

    .line 184
    goto :goto_1

    .line 185
    :cond_3
    move v2, p2

    .line 186
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagWidth()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    add-int/2addr v2, v3

    .line 191
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getOptionBetTagDelegate()La/yte;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    sub-int/2addr v4, v2

    .line 200
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getOptionBetTagDelegate()La/yte;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    iget-object v5, v5, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 205
    .line 206
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    sub-int/2addr v4, v5

    .line 211
    invoke-virtual {v3, v4, v2, p1}, La/yte;->a(III)V

    .line 212
    .line 213
    .line 214
    :cond_4
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iget-object p1, p1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-nez p1, :cond_6

    .line 225
    .line 226
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iget p1, p1, La/eue;->e:I

    .line 231
    .line 232
    div-int/lit8 p1, p1, 0x2

    .line 233
    .line 234
    add-int/2addr p1, p2

    .line 235
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    iget v2, v2, La/yte;->b:I

    .line 240
    .line 241
    div-int/lit8 v2, v2, 0x2

    .line 242
    .line 243
    sub-int/2addr p1, v2

    .line 244
    iget-object v2, v1, La/htj;->c:Landroid/widget/ImageView;

    .line 245
    .line 246
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-nez v2, :cond_5

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_5
    move v0, p2

    .line 254
    :goto_2
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    sub-int/2addr v3, v0

    .line 263
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    iget-object v4, v4, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 268
    .line 269
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    sub-int/2addr v3, v4

    .line 274
    invoke-virtual {v2, v3, v0, p1}, La/yte;->a(III)V

    .line 275
    .line 276
    .line 277
    :cond_6
    iget-object v9, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->v:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 278
    .line 279
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    if-nez p1, :cond_7

    .line 284
    .line 285
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    iget p1, p1, La/eue;->e:I

    .line 290
    .line 291
    div-int/lit8 p1, p1, 0x2

    .line 292
    .line 293
    iget v5, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->i:I

    .line 294
    .line 295
    add-int/2addr p1, v5

    .line 296
    iget v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->c:I

    .line 297
    .line 298
    div-int/lit8 v2, v0, 0x2

    .line 299
    .line 300
    sub-int v6, p1, v2

    .line 301
    .line 302
    add-int v8, v2, p1

    .line 303
    .line 304
    add-int v7, v5, v0

    .line 305
    .line 306
    move-object v10, p0

    .line 307
    invoke-static/range {v5 .. v10}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 308
    .line 309
    .line 310
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    add-int/2addr p4, p2

    .line 315
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 316
    .line 317
    .line 318
    move-result p3

    .line 319
    add-int/2addr p3, p4

    .line 320
    div-int/lit8 p3, p3, 0x2

    .line 321
    .line 322
    sub-int/2addr p1, p3

    .line 323
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    iget p0, p0, La/eue;->e:I

    .line 328
    .line 329
    div-int/lit8 p0, p0, 0x2

    .line 330
    .line 331
    add-int/2addr p0, p2

    .line 332
    invoke-virtual {v1, p0, p1}, La/htj;->b(II)V

    .line 333
    .line 334
    .line 335
    return-void
.end method

.method public final onMeasure(II)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getShimmerDelegate()La/bte;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v2, v2, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget v3, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->f:I

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    iget v5, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->c:I

    .line 21
    .line 22
    iget-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->m:La/eue;

    .line 23
    .line 24
    iget-object v7, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->k:La/eue;

    .line 25
    .line 26
    iget-object v8, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

    .line 27
    .line 28
    const/high16 v9, 0x40000000    # 2.0f

    .line 29
    .line 30
    iget v10, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->i:I

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getShimmerDelegate()La/bte;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2, v1}, La/bte;->b(I)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_0
    iget-object v2, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->t:La/htj;

    .line 44
    .line 45
    iget-object v11, v2, La/htj;->d:Landroid/widget/ImageView;

    .line 46
    .line 47
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    iget v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->d:I

    .line 52
    .line 53
    if-nez v11, :cond_1

    .line 54
    .line 55
    move v11, v12

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move v11, v10

    .line 58
    :goto_0
    sub-int v13, v1, v10

    .line 59
    .line 60
    sub-int/2addr v13, v11

    .line 61
    invoke-static {v13, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    move/from16 v13, p2

    .line 66
    .line 67
    invoke-virtual {v8, v11, v13}, Landroid/view/View;->measure(II)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getStartSpaceDependsByIndicator()I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    sub-int v11, v1, v11

    .line 79
    .line 80
    sub-int v14, v11, v10

    .line 81
    .line 82
    invoke-virtual {v13, v14}, La/yte;->b(I)V

    .line 83
    .line 84
    .line 85
    iget v13, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->j:I

    .line 86
    .line 87
    sub-int v14, v1, v13

    .line 88
    .line 89
    sub-int/2addr v14, v10

    .line 90
    invoke-virtual {v7, v14}, La/eue;->c(I)V

    .line 91
    .line 92
    .line 93
    sub-int v13, v1, v13

    .line 94
    .line 95
    sub-int/2addr v13, v10

    .line 96
    invoke-virtual {v6, v13}, La/eue;->c(I)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getErrorDelegate()La/eue;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    sub-int/2addr v11, v10

    .line 104
    invoke-virtual {v13, v11}, La/eue;->c(I)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getAutoSubTagDelegate()La/yte;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-virtual {v11}, La/yte;->c()V

    .line 112
    .line 113
    .line 114
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getOptionBetTagDelegate()La/yte;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-virtual {v11}, La/yte;->c()V

    .line 119
    .line 120
    .line 121
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    invoke-virtual {v11}, La/yte;->c()V

    .line 126
    .line 127
    .line 128
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getAutoSubTagDelegate()La/yte;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    iget-object v11, v11, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 133
    .line 134
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-nez v11, :cond_2

    .line 139
    .line 140
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getAutoSubTagDelegate()La/yte;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    iget-object v11, v11, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 145
    .line 146
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    add-int/2addr v11, v3

    .line 151
    goto :goto_1

    .line 152
    :cond_2
    move v11, v4

    .line 153
    :goto_1
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getOptionBetTagDelegate()La/yte;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    iget-object v13, v13, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 158
    .line 159
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    if-nez v13, :cond_3

    .line 164
    .line 165
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getOptionBetTagDelegate()La/yte;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    iget-object v13, v13, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 170
    .line 171
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    add-int/2addr v13, v3

    .line 176
    goto :goto_2

    .line 177
    :cond_3
    move v13, v4

    .line 178
    :goto_2
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

    .line 179
    .line 180
    .line 181
    move-result-object v14

    .line 182
    iget-object v14, v14, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 183
    .line 184
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    if-nez v14, :cond_4

    .line 189
    .line 190
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    iget-object v14, v14, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 195
    .line 196
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    add-int/2addr v14, v3

    .line 201
    goto :goto_3

    .line 202
    :cond_4
    move v14, v4

    .line 203
    :goto_3
    iget-object v15, v2, La/htj;->c:Landroid/widget/ImageView;

    .line 204
    .line 205
    invoke-virtual {v15}, Landroid/view/View;->getVisibility()I

    .line 206
    .line 207
    .line 208
    move-result v15

    .line 209
    if-nez v15, :cond_5

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_5
    move v12, v10

    .line 213
    :goto_4
    invoke-static {v12, v11, v13, v14}, La/hne;->D(IIII)I

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    iget-object v12, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->v:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 218
    .line 219
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    if-nez v13, :cond_6

    .line 224
    .line 225
    add-int v13, v5, v10

    .line 226
    .line 227
    add-int/2addr v13, v3

    .line 228
    goto :goto_5

    .line 229
    :cond_6
    move v13, v10

    .line 230
    :goto_5
    sub-int/2addr v1, v13

    .line 231
    sub-int/2addr v1, v11

    .line 232
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    invoke-virtual {v11, v1}, La/eue;->c(I)V

    .line 237
    .line 238
    .line 239
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    invoke-virtual {v12, v1, v11}, Landroid/view/View;->measure(II)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2}, La/htj;->c()V

    .line 251
    .line 252
    .line 253
    :goto_6
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    iget v1, v1, La/eue;->e:I

    .line 258
    .line 259
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    iget-object v2, v2, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 268
    .line 269
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-nez v2, :cond_7

    .line 274
    .line 275
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    iget-object v2, v2, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 280
    .line 281
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    add-int/2addr v2, v3

    .line 286
    goto :goto_7

    .line 287
    :cond_7
    move v2, v4

    .line 288
    :goto_7
    invoke-virtual {v6}, La/eue;->b()Z

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    if-nez v5, :cond_8

    .line 293
    .line 294
    iget v5, v6, La/eue;->e:I

    .line 295
    .line 296
    add-int/2addr v5, v3

    .line 297
    goto :goto_8

    .line 298
    :cond_8
    move v5, v4

    .line 299
    :goto_8
    invoke-virtual {v7}, La/eue;->b()Z

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    if-nez v6, :cond_9

    .line 304
    .line 305
    iget v6, v7, La/eue;->e:I

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_9
    move v6, v4

    .line 309
    :goto_9
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getErrorDelegate()La/eue;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    invoke-virtual {v7}, La/eue;->b()Z

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    if-nez v7, :cond_a

    .line 318
    .line 319
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getErrorDelegate()La/eue;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    iget v4, v4, La/eue;->e:I

    .line 324
    .line 325
    add-int/2addr v4, v3

    .line 326
    :cond_a
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getShimmerDelegate()La/bte;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    iget-object v8, v8, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 335
    .line 336
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 337
    .line 338
    .line 339
    move-result v8

    .line 340
    if-nez v8, :cond_b

    .line 341
    .line 342
    iget v1, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->e:I

    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_b
    mul-int/lit8 v10, v10, 0x2

    .line 346
    .line 347
    add-int/2addr v10, v3

    .line 348
    add-int/2addr v10, v1

    .line 349
    add-int/2addr v10, v2

    .line 350
    add-int/2addr v10, v5

    .line 351
    add-int/2addr v10, v6

    .line 352
    add-int/2addr v10, v4

    .line 353
    add-int v1, v10, v7

    .line 354
    .line 355
    :goto_a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    const v3, 0x7f0706d2

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    invoke-static {v1, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    move/from16 v2, p1

    .line 375
    .line 376
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 377
    .line 378
    .line 379
    return-void
.end method

.method public setAutoSub(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getAutoSubTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getAutoSubTagDelegate()La/yte;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->t:La/htj;

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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setCouponBonusTitleStyle(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/eue;->g:La/n0o0;

    .line 6
    .line 7
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroid/text/TextPaint;

    .line 12
    .line 13
    iget-object v0, v0, La/eue;->a:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0, p1}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setEachWay(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getEachWayTagDelegate()La/yte;

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

    return-void
.end method

.method public final setError(I)V
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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setError(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getErrorDelegate()La/eue;

    move-result-object v0

    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final setHeader(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->m:La/eue;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setLiveTagText(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final setMarketCoefficient(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

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
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

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

.method public setMarketStyle(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/j4l0;->setMarketStyle(Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setModel(La/fue;)V
    .locals 4

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
    iget-object v3, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->v:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 10
    .line 11
    invoke-static {v3, v0, v1, v2}, Lorg/xplatform/uikit/components/views/LoadableImageView;->h(Lorg/xplatform/uikit/components/views/LoadableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, La/fue;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setTagText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget v0, p1, La/fue;->c:I

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setTagColor(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p1, La/fue;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setTitle(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, La/fue;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, La/fue;->h:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setHeader(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p1, La/fue;->f:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setError(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p1, La/fue;->i:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/fue;->j:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->u:La/j4l0;

    .line 49
    .line 50
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    if-nez v3, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setMarketCoefficient(Ljava/lang/CharSequence;)V

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
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setMarketStyle(Ljava/lang/Integer;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p1, La/fue;->n:La/j0d;

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setMarketCoefficientState(La/j0d;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->d()V

    .line 80
    .line 81
    .line 82
    iget-boolean v0, p1, La/fue;->g:Z

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->c(Z)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p1, La/fue;->q:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setAutoSub(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p1, La/fue;->r:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setOptionBet(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p1, La/fue;->s:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setEachWay(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public setMoveButtonClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
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
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->t:La/htj;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/htj;->e(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOptionBet(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getOptionBetTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getOptionBetTagDelegate()La/yte;

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

    return-void
.end method

.method public setSportImage(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v1, 0x7f040b0b

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->v:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 21
    .line 22
    .line 23
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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setSubTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getSubTitleDelegate()La/eue;

    move-result-object v0

    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTagColor(I)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->getTagDelegate()La/yte;

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

.method public final setTitle(I)V
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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->setTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 13
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardCompact;->k:La/eue;

    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
