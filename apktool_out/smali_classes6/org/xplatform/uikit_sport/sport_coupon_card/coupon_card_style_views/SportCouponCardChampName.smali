.class public final Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/pse;
.implements La/mue;
.implements La/iue;
.implements La/hue;
.implements La/nue;
.implements La/jue;
.implements La/gue;
.implements La/lue;


# static fields
.field public static final synthetic y:I


# instance fields
.field public final a:La/n0o0;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:F

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:La/eue;

.field public final m:La/n0o0;

.field public final n:La/n0o0;

.field public final o:La/n0o0;

.field public final p:La/n0o0;

.field public final q:La/n0o0;

.field public final r:La/n0o0;

.field public final s:La/n0o0;

.field public final t:La/n0o0;

.field public final u:La/htj;

.field public final v:La/j4l0;

.field public final w:Lorg/xplatform/uikit/components/views/LoadableImageView;

.field public final x:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 647
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 646
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 18

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
    new-instance v6, La/g4l0;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    invoke-direct {v6, v0, v7}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->a:La/n0o0;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const v8, 0x7f070656

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->b:I

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
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const v8, 0x7f0706a9

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->c:I

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    const v9, 0x7f0706ea

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->d:I

    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->e:I

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    const v10, 0x7f070717

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->f:I

    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    const v11, 0x7f070641

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, v11}, Landroid/content/res/Resources;->getDimension(I)F

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    float-to-int v6, v6

    .line 120
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->g:I

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimension(I)F

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->h:F

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    invoke-virtual {v6, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->i:I

    .line 141
    .line 142
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    const v9, 0x7f07072d

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->j:I

    .line 154
    .line 155
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v6, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    iput v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->k:I

    .line 164
    .line 165
    new-instance v6, La/eue;

    .line 166
    .line 167
    const v9, 0x7f1404a1

    .line 168
    .line 169
    .line 170
    const/4 v10, 0x3

    .line 171
    invoke-direct {v6, v10, v7, v9, v0}, La/eue;-><init>(IIILandroid/view/View;)V

    .line 172
    .line 173
    .line 174
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->l:La/eue;

    .line 175
    .line 176
    new-instance v6, La/g4l0;

    .line 177
    .line 178
    const/4 v9, 0x1

    .line 179
    invoke-direct {v6, v0, v9}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 180
    .line 181
    .line 182
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->m:La/n0o0;

    .line 187
    .line 188
    new-instance v6, La/g4l0;

    .line 189
    .line 190
    invoke-direct {v6, v0, v2}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 191
    .line 192
    .line 193
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->n:La/n0o0;

    .line 198
    .line 199
    new-instance v6, La/g4l0;

    .line 200
    .line 201
    invoke-direct {v6, v0, v10}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 202
    .line 203
    .line 204
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->o:La/n0o0;

    .line 209
    .line 210
    new-instance v6, La/g4l0;

    .line 211
    .line 212
    const/4 v11, 0x4

    .line 213
    invoke-direct {v6, v0, v11}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 214
    .line 215
    .line 216
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->p:La/n0o0;

    .line 221
    .line 222
    new-instance v6, La/g4l0;

    .line 223
    .line 224
    const/4 v12, 0x5

    .line 225
    invoke-direct {v6, v0, v12}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 226
    .line 227
    .line 228
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->q:La/n0o0;

    .line 233
    .line 234
    new-instance v6, La/g4l0;

    .line 235
    .line 236
    const/4 v13, 0x6

    .line 237
    invoke-direct {v6, v0, v13}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 238
    .line 239
    .line 240
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->r:La/n0o0;

    .line 245
    .line 246
    new-instance v6, La/g4l0;

    .line 247
    .line 248
    const/4 v14, 0x7

    .line 249
    invoke-direct {v6, v0, v14}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 250
    .line 251
    .line 252
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->s:La/n0o0;

    .line 257
    .line 258
    new-instance v6, La/g4l0;

    .line 259
    .line 260
    const/16 v15, 0x8

    .line 261
    .line 262
    invoke-direct {v6, v0, v15}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 263
    .line 264
    .line 265
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->t:La/n0o0;

    .line 270
    .line 271
    new-instance v6, La/htj;

    .line 272
    .line 273
    move/from16 v16, v2

    .line 274
    .line 275
    const v2, 0x7f080800

    .line 276
    .line 277
    .line 278
    move/from16 p2, v10

    .line 279
    .line 280
    const v10, 0x7f0706b7

    .line 281
    .line 282
    .line 283
    invoke-direct {v6, v0, v2, v10, v8}, La/htj;-><init>(Landroid/view/ViewGroup;III)V

    .line 284
    .line 285
    .line 286
    iget-object v2, v6, La/htj;->d:Landroid/widget/ImageView;

    .line 287
    .line 288
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 289
    .line 290
    .line 291
    iget-object v2, v6, La/htj;->c:Landroid/widget/ImageView;

    .line 292
    .line 293
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 294
    .line 295
    .line 296
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->u:La/htj;

    .line 297
    .line 298
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    const v6, 0x7f07074a

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    const v8, 0x7f07074d

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimension(I)F

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    new-instance v8, La/j4l0;

    .line 321
    .line 322
    invoke-direct {v8, v1}, La/j4l0;-><init>(Landroid/content/Context;)V

    .line 323
    .line 324
    .line 325
    sget-object v10, La/xr20;->a:La/xr20;

    .line 326
    .line 327
    invoke-virtual {v8, v10}, La/j4l0;->setMarketBlockedIconPosition(La/xr20;)V

    .line 328
    .line 329
    .line 330
    const v10, 0x7f140463

    .line 331
    .line 332
    .line 333
    invoke-virtual {v8, v10}, La/j4l0;->setDescriptionTextStyle(I)V

    .line 334
    .line 335
    .line 336
    const v10, 0x7f140475

    .line 337
    .line 338
    .line 339
    invoke-virtual {v8, v10}, La/j4l0;->setHeaderTextStyle(I)V

    .line 340
    .line 341
    .line 342
    const v10, 0x7f14048c

    .line 343
    .line 344
    .line 345
    invoke-virtual {v8, v10}, La/j4l0;->setCoefficientTextStyle(I)V

    .line 346
    .line 347
    .line 348
    const v10, 0x7fffffff

    .line 349
    .line 350
    .line 351
    invoke-virtual {v8, v10}, La/j4l0;->setDescriptionMaxLines(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v8, v9}, La/j4l0;->setHeaderMaxLines(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v8, v6}, La/j4l0;->setCoefficientMaxTextSize(F)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v8, v2}, La/j4l0;->setCoefficientMinTextSize(F)V

    .line 361
    .line 362
    .line 363
    iput-object v8, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

    .line 364
    .line 365
    new-instance v2, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 366
    .line 367
    invoke-direct {v2, v1, v4, v13, v7}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 368
    .line 369
    .line 370
    const v6, 0x7f040b0b

    .line 371
    .line 372
    .line 373
    invoke-static {v6, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 374
    .line 375
    .line 376
    move-result v6

    .line 377
    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 378
    .line 379
    .line 380
    iput-object v2, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->w:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 381
    .line 382
    new-instance v6, La/g4l0;

    .line 383
    .line 384
    const/16 v10, 0x9

    .line 385
    .line 386
    invoke-direct {v6, v0, v10}, La/g4l0;-><init>(Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;B)V

    .line 387
    .line 388
    .line 389
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    iput-object v6, v0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->x:La/n0o0;

    .line 394
    .line 395
    sget-object v6, La/cqd0;->i:[I

    .line 396
    .line 397
    invoke-virtual {v1, v3, v6, v5, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    const/16 v17, 0xa

    .line 402
    .line 403
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    invoke-static {v6, v1, v4}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    if-eqz v4, :cond_1

    .line 412
    .line 413
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    goto :goto_1

    .line 418
    :cond_1
    const/4 v4, 0x0

    .line 419
    :goto_1
    const-string v17, ""

    .line 420
    .line 421
    if-nez v4, :cond_2

    .line 422
    .line 423
    move-object/from16 v4, v17

    .line 424
    .line 425
    :cond_2
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setTitle(Ljava/lang/CharSequence;)V

    .line 426
    .line 427
    .line 428
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    invoke-static {v6, v1, v4}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    if-eqz v4, :cond_3

    .line 437
    .line 438
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    goto :goto_2

    .line 443
    :cond_3
    const/4 v4, 0x0

    .line 444
    :goto_2
    if-nez v4, :cond_4

    .line 445
    .line 446
    move-object/from16 v4, v17

    .line 447
    .line 448
    :cond_4
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setCaption(Ljava/lang/CharSequence;)V

    .line 449
    .line 450
    .line 451
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    invoke-static {v6, v1, v4}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    if-eqz v4, :cond_5

    .line 460
    .line 461
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    goto :goto_3

    .line 466
    :cond_5
    const/4 v4, 0x0

    .line 467
    :goto_3
    if-nez v4, :cond_6

    .line 468
    .line 469
    move-object/from16 v4, v17

    .line 470
    .line 471
    :cond_6
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 472
    .line 473
    .line 474
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    invoke-static {v6, v1, v4}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    if-eqz v4, :cond_7

    .line 483
    .line 484
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    goto :goto_4

    .line 489
    :cond_7
    const/4 v4, 0x0

    .line 490
    :goto_4
    if-nez v4, :cond_8

    .line 491
    .line 492
    move-object/from16 v4, v17

    .line 493
    .line 494
    :cond_8
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setTagText(Ljava/lang/CharSequence;)V

    .line 495
    .line 496
    .line 497
    invoke-static {v10, v1, v6}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    if-eqz v4, :cond_9

    .line 502
    .line 503
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setTagColor(Landroid/content/res/ColorStateList;)V

    .line 504
    .line 505
    .line 506
    :cond_9
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v4

    .line 510
    invoke-static {v6, v1, v4}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    if-eqz v4, :cond_a

    .line 515
    .line 516
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v4

    .line 520
    goto :goto_5

    .line 521
    :cond_a
    const/4 v4, 0x0

    .line 522
    :goto_5
    if-nez v4, :cond_b

    .line 523
    .line 524
    move-object/from16 v4, v17

    .line 525
    .line 526
    :cond_b
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setError(Ljava/lang/CharSequence;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v6, v9, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketStyle(Ljava/lang/Integer;)V

    .line 538
    .line 539
    .line 540
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    invoke-static {v6, v1, v4}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    if-eqz v4, :cond_c

    .line 549
    .line 550
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v4

    .line 554
    goto :goto_6

    .line 555
    :cond_c
    const/4 v4, 0x0

    .line 556
    :goto_6
    if-nez v4, :cond_d

    .line 557
    .line 558
    move-object/from16 v4, v17

    .line 559
    .line 560
    :cond_d
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 561
    .line 562
    .line 563
    move-result-object v9

    .line 564
    invoke-static {v6, v1, v9}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v9

    .line 568
    if-eqz v9, :cond_e

    .line 569
    .line 570
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v9

    .line 574
    goto :goto_7

    .line 575
    :cond_e
    const/4 v9, 0x0

    .line 576
    :goto_7
    if-nez v9, :cond_f

    .line 577
    .line 578
    move-object/from16 v9, v17

    .line 579
    .line 580
    :cond_f
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 581
    .line 582
    .line 583
    move-result-object v10

    .line 584
    invoke-static {v6, v1, v10}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    if-eqz v1, :cond_10

    .line 589
    .line 590
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    goto :goto_8

    .line 595
    :cond_10
    const/4 v1, 0x0

    .line 596
    :goto_8
    if-nez v1, :cond_11

    .line 597
    .line 598
    move-object/from16 v1, v17

    .line 599
    .line 600
    :cond_11
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 601
    .line 602
    .line 603
    move-result-object v10

    .line 604
    if-nez v10, :cond_12

    .line 605
    .line 606
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 607
    .line 608
    .line 609
    :cond_12
    invoke-virtual {v0, v9}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0, v4}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v6, v13, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    if-eqz v1, :cond_13

    .line 623
    .line 624
    invoke-virtual {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->a()V

    .line 625
    .line 626
    .line 627
    :cond_13
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 631
    .line 632
    .line 633
    invoke-direct {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getBackgroundTintHelper()La/od5;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    invoke-virtual {v1, v3, v5}, La/od5;->a(Landroid/util/AttributeSet;I)V

    .line 638
    .line 639
    .line 640
    const-string v1, "SportCouponCardChampName"

    .line 641
    .line 642
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    return-void
.end method

.method private final getAutoSubTagDelegate()La/yte;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->q:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->a:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->n:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->s:La/n0o0;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

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
    iget p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->k:I

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->o:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->x:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->r:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->t:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->m:La/n0o0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->p:La/n0o0;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getShimmerDelegate()La/bte;

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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketCoefficientState(La/j0d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

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

.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getBackgroundTintHelper()La/od5;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

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
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->e:I

    .line 5
    .line 6
    int-to-float v0, v0

    .line 7
    iget v1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->b:I

    .line 8
    .line 9
    iget v2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->d:I

    .line 10
    .line 11
    add-int/2addr v1, v2

    .line 12
    iget v3, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->f:I

    .line 13
    .line 14
    add-int/2addr v1, v3

    .line 15
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    int-to-float v1, v1

    .line 20
    invoke-virtual {v4, p1, v1, v0}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget v1, v1, La/eue;->e:I

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    add-float/2addr v0, v1

    .line 31
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v1, v1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v4, 0x0

    .line 42
    iget v5, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->i:I

    .line 43
    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v1, v4

    .line 59
    :goto_0
    iget v6, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->h:F

    .line 60
    .line 61
    add-float/2addr v0, v6

    .line 62
    int-to-float v1, v1

    .line 63
    add-float/2addr v0, v1

    .line 64
    int-to-float v1, v2

    .line 65
    iget-object v6, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->l:La/eue;

    .line 66
    .line 67
    invoke-virtual {v6, p1, v1, v0}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, La/eue;->b()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_1

    .line 75
    .line 76
    iget v1, v6, La/eue;->e:I

    .line 77
    .line 78
    add-int/2addr v1, v5

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move v1, v4

    .line 81
    :goto_1
    int-to-float v1, v1

    .line 82
    add-float/2addr v0, v1

    .line 83
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v1, v1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_2

    .line 94
    .line 95
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v1, v1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    add-int/2addr v1, v2

    .line 106
    add-int/2addr v1, v3

    .line 107
    goto :goto_2

    .line 108
    :cond_2
    move v1, v2

    .line 109
    :goto_2
    int-to-float v1, v1

    .line 110
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getSubTitleDelegate()La/eue;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v3, p1, v1, v0}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, La/eue;->b()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_3

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_3
    move v5, v4

    .line 129
    :goto_3
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getSubTitleDelegate()La/eue;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1}, La/eue;->b()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_4

    .line 138
    .line 139
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getSubTitleDelegate()La/eue;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget v1, v1, La/eue;->e:I

    .line 144
    .line 145
    add-int v4, v1, v5

    .line 146
    .line 147
    :cond_4
    int-to-float v1, v4

    .line 148
    add-float/2addr v0, v1

    .line 149
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    int-to-float v2, v2

    .line 154
    invoke-virtual {v1, p1, v2, v0}, La/eue;->a(Landroid/graphics/Canvas;FF)V

    .line 155
    .line 156
    .line 157
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, La/eue;->b()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-nez p1, :cond_5

    .line 166
    .line 167
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    iget p0, p0, La/eue;->e:I

    .line 172
    .line 173
    :cond_5
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 13

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getShimmerDelegate()La/bte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getShimmerDelegate()La/bte;

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
    iget p2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->j:I

    .line 26
    .line 27
    sub-int/2addr p1, p2

    .line 28
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    sub-int v3, p1, v1

    .line 35
    .line 36
    iget-object v6, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iget v2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->d:I

    .line 43
    .line 44
    add-int v4, p1, v2

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    add-int v5, p1, v3

    .line 51
    .line 52
    move-object v7, p0

    .line 53
    invoke-static/range {v2 .. v7}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget p1, p1, La/eue;->e:I

    .line 61
    .line 62
    div-int/lit8 p1, p1, 0x2

    .line 63
    .line 64
    iget v1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->e:I

    .line 65
    .line 66
    add-int/2addr p1, v1

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    sub-int/2addr v2, p2

    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    div-int/lit8 v3, v3, 0x2

    .line 77
    .line 78
    sub-int/2addr v2, v3

    .line 79
    iget-object v3, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->u:La/htj;

    .line 80
    .line 81
    invoke-virtual {v3, p1, v2}, La/htj;->b(II)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget p1, p1, La/eue;->e:I

    .line 89
    .line 90
    iget-object v11, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->w:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 91
    .line 92
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    add-int/2addr p1, v1

    .line 101
    int-to-float p1, p1

    .line 102
    iget v2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->h:F

    .line 103
    .line 104
    add-float/2addr p1, v2

    .line 105
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    float-to-int p1, p1

    .line 110
    iget v4, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->d:I

    .line 111
    .line 112
    invoke-virtual {v2, v4, v4, p1}, La/yte;->a(III)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getAutoSubTagDelegate()La/yte;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iget-object p1, p1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    iget v2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->c:I

    .line 126
    .line 127
    if-nez p1, :cond_2

    .line 128
    .line 129
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iget p1, p1, La/eue;->e:I

    .line 134
    .line 135
    div-int/lit8 p1, p1, 0x2

    .line 136
    .line 137
    add-int/2addr p1, v1

    .line 138
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getAutoSubTagDelegate()La/yte;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    iget v5, v5, La/yte;->b:I

    .line 143
    .line 144
    div-int/lit8 v5, v5, 0x2

    .line 145
    .line 146
    sub-int/2addr p1, v5

    .line 147
    iget-object v5, v3, La/htj;->c:Landroid/widget/ImageView;

    .line 148
    .line 149
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-nez v5, :cond_1

    .line 154
    .line 155
    move v5, v2

    .line 156
    goto :goto_0

    .line 157
    :cond_1
    move v5, v4

    .line 158
    :goto_0
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getAutoSubTagDelegate()La/yte;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    sub-int/2addr v7, v5

    .line 167
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getAutoSubTagDelegate()La/yte;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    iget-object v8, v8, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 172
    .line 173
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    sub-int/2addr v7, v8

    .line 178
    invoke-virtual {v6, v7, v5, p1}, La/yte;->a(III)V

    .line 179
    .line 180
    .line 181
    :cond_2
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getOptionBetTagDelegate()La/yte;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    iget-object p1, p1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-nez p1, :cond_4

    .line 192
    .line 193
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iget p1, p1, La/eue;->e:I

    .line 198
    .line 199
    div-int/lit8 p1, p1, 0x2

    .line 200
    .line 201
    add-int/2addr p1, v1

    .line 202
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getOptionBetTagDelegate()La/yte;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    iget v5, v5, La/yte;->b:I

    .line 207
    .line 208
    div-int/lit8 v5, v5, 0x2

    .line 209
    .line 210
    sub-int/2addr p1, v5

    .line 211
    iget-object v5, v3, La/htj;->c:Landroid/widget/ImageView;

    .line 212
    .line 213
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    if-nez v5, :cond_3

    .line 218
    .line 219
    move v5, v2

    .line 220
    goto :goto_1

    .line 221
    :cond_3
    move v5, v4

    .line 222
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagWidth()I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    add-int/2addr v5, v6

    .line 227
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getOptionBetTagDelegate()La/yte;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 232
    .line 233
    .line 234
    move-result v7

    .line 235
    sub-int/2addr v7, v5

    .line 236
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getOptionBetTagDelegate()La/yte;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    iget-object v8, v8, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 241
    .line 242
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 243
    .line 244
    .line 245
    move-result v8

    .line 246
    sub-int/2addr v7, v8

    .line 247
    invoke-virtual {v6, v7, v5, p1}, La/yte;->a(III)V

    .line 248
    .line 249
    .line 250
    :cond_4
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    iget-object p1, p1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 255
    .line 256
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    if-nez p1, :cond_6

    .line 261
    .line 262
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    iget p1, p1, La/eue;->e:I

    .line 267
    .line 268
    div-int/lit8 p1, p1, 0x2

    .line 269
    .line 270
    add-int/2addr p1, v1

    .line 271
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    iget v5, v5, La/yte;->b:I

    .line 276
    .line 277
    div-int/lit8 v5, v5, 0x2

    .line 278
    .line 279
    sub-int/2addr p1, v5

    .line 280
    iget-object v3, v3, La/htj;->c:Landroid/widget/ImageView;

    .line 281
    .line 282
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    if-nez v3, :cond_5

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :cond_5
    move v2, v4

    .line 290
    :goto_2
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 295
    .line 296
    .line 297
    move-result v5

    .line 298
    sub-int/2addr v5, v2

    .line 299
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    iget-object v6, v6, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 304
    .line 305
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    sub-int/2addr v5, v6

    .line 310
    invoke-virtual {v3, v5, v2, p1}, La/yte;->a(III)V

    .line 311
    .line 312
    .line 313
    :cond_6
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    if-nez p1, :cond_7

    .line 318
    .line 319
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    iget p1, p1, La/eue;->e:I

    .line 324
    .line 325
    div-int/lit8 p1, p1, 0x2

    .line 326
    .line 327
    add-int/2addr p1, v1

    .line 328
    iget v1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->b:I

    .line 329
    .line 330
    div-int/lit8 v2, v1, 0x2

    .line 331
    .line 332
    sub-int v8, p1, v2

    .line 333
    .line 334
    add-int v10, v2, p1

    .line 335
    .line 336
    iget v7, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->d:I

    .line 337
    .line 338
    add-int v9, v7, v1

    .line 339
    .line 340
    move-object v12, p0

    .line 341
    invoke-static/range {v7 .. v12}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 342
    .line 343
    .line 344
    :cond_7
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    iget-object p1, p1, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 349
    .line 350
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 351
    .line 352
    .line 353
    move-result p1

    .line 354
    if-nez p1, :cond_9

    .line 355
    .line 356
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    mul-int/lit8 p2, p2, 0x2

    .line 361
    .line 362
    add-int/2addr p2, p1

    .line 363
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    invoke-virtual {p1}, La/eue;->b()Z

    .line 368
    .line 369
    .line 370
    move-result p1

    .line 371
    if-nez p1, :cond_8

    .line 372
    .line 373
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    iget p1, p1, La/eue;->e:I

    .line 378
    .line 379
    iget v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->i:I

    .line 380
    .line 381
    add-int/2addr p1, v0

    .line 382
    goto :goto_3

    .line 383
    :cond_8
    const/4 p1, 0x0

    .line 384
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    sub-int/2addr v0, p2

    .line 389
    sub-int/2addr v0, p1

    .line 390
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getSubTitleDelegate()La/eue;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    iget p1, p1, La/eue;->e:I

    .line 395
    .line 396
    div-int/lit8 p1, p1, 0x2

    .line 397
    .line 398
    sub-int/2addr v0, p1

    .line 399
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    iget p1, p1, La/yte;->b:I

    .line 404
    .line 405
    div-int/lit8 p1, p1, 0x2

    .line 406
    .line 407
    sub-int/2addr v0, p1

    .line 408
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    iget-object p0, p0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 417
    .line 418
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 419
    .line 420
    .line 421
    move-result p0

    .line 422
    add-int/2addr p0, v4

    .line 423
    invoke-virtual {p1, v4, p0, v0}, La/yte;->a(III)V

    .line 424
    .line 425
    .line 426
    :cond_9
    return-void
.end method

.method public final onMeasure(II)V
    .locals 13

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getShimmerDelegate()La/bte;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v1, v1, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    iget v3, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->b:I

    .line 17
    .line 18
    iget-object v4, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->l:La/eue;

    .line 19
    .line 20
    iget-object v5, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

    .line 21
    .line 22
    const/high16 v6, 0x40000000    # 2.0f

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getShimmerDelegate()La/bte;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p2, v0}, La/bte;->b(I)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_0
    iget-object v1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->u:La/htj;

    .line 36
    .line 37
    iget-object v7, v1, La/htj;->d:Landroid/widget/ImageView;

    .line 38
    .line 39
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    iget v8, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->c:I

    .line 44
    .line 45
    iget v9, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->d:I

    .line 46
    .line 47
    if-nez v7, :cond_1

    .line 48
    .line 49
    move v7, v8

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v7, v9

    .line 52
    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    sub-int/2addr v10, v9

    .line 57
    sub-int/2addr v10, v7

    .line 58
    invoke-static {v10, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-virtual {v5, v7, p2}, Landroid/view/View;->measure(II)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    mul-int/lit8 v7, v9, 0x2

    .line 70
    .line 71
    sub-int v7, v0, v7

    .line 72
    .line 73
    invoke-virtual {p2, v7}, La/yte;->b(I)V

    .line 74
    .line 75
    .line 76
    mul-int/lit8 p2, v9, 0x2

    .line 77
    .line 78
    sub-int p2, v0, p2

    .line 79
    .line 80
    invoke-virtual {v4, p2}, La/eue;->c(I)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    mul-int/lit8 v7, v9, 0x2

    .line 88
    .line 89
    sub-int v7, v0, v7

    .line 90
    .line 91
    invoke-virtual {p2, v7}, La/eue;->c(I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    iget-object p2, p2, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 99
    .line 100
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-nez p2, :cond_2

    .line 105
    .line 106
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p2, v0}, La/yte;->b(I)V

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    iget-object p2, p2, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 118
    .line 119
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    iget v7, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->f:I

    .line 124
    .line 125
    if-nez p2, :cond_3

    .line 126
    .line 127
    add-int p2, v9, v7

    .line 128
    .line 129
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    iget-object v10, v10, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 134
    .line 135
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    add-int/2addr v10, p2

    .line 140
    goto :goto_1

    .line 141
    :cond_3
    move v10, v9

    .line 142
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getSubTitleDelegate()La/eue;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    sub-int v11, v0, v9

    .line 147
    .line 148
    sub-int/2addr v11, v10

    .line 149
    invoke-virtual {p2, v11}, La/eue;->c(I)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getAutoSubTagDelegate()La/yte;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p2}, La/yte;->c()V

    .line 157
    .line 158
    .line 159
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getOptionBetTagDelegate()La/yte;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p2}, La/yte;->c()V

    .line 164
    .line 165
    .line 166
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p2}, La/yte;->c()V

    .line 171
    .line 172
    .line 173
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getAutoSubTagDelegate()La/yte;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    iget-object p2, p2, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 178
    .line 179
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    iget v10, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->k:I

    .line 184
    .line 185
    if-nez p2, :cond_4

    .line 186
    .line 187
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getAutoSubTagDelegate()La/yte;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    iget-object p2, p2, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 192
    .line 193
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 194
    .line 195
    .line 196
    move-result p2

    .line 197
    add-int/2addr p2, v10

    .line 198
    goto :goto_2

    .line 199
    :cond_4
    move p2, v2

    .line 200
    :goto_2
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getOptionBetTagDelegate()La/yte;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    iget-object v11, v11, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 205
    .line 206
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    if-nez v11, :cond_5

    .line 211
    .line 212
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getOptionBetTagDelegate()La/yte;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    iget-object v11, v11, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 217
    .line 218
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    add-int/2addr v11, v10

    .line 223
    goto :goto_3

    .line 224
    :cond_5
    move v11, v2

    .line 225
    :goto_3
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    iget-object v12, v12, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 230
    .line 231
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    .line 232
    .line 233
    .line 234
    move-result v12

    .line 235
    if-nez v12, :cond_6

    .line 236
    .line 237
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    iget-object v12, v12, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 242
    .line 243
    invoke-virtual {v12}, Landroid/view/View;->getMeasuredWidth()I

    .line 244
    .line 245
    .line 246
    move-result v12

    .line 247
    add-int/2addr v12, v10

    .line 248
    goto :goto_4

    .line 249
    :cond_6
    move v12, v2

    .line 250
    :goto_4
    iget-object v10, v1, La/htj;->c:Landroid/widget/ImageView;

    .line 251
    .line 252
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    if-nez v10, :cond_7

    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_7
    move v8, v9

    .line 260
    :goto_5
    invoke-static {v8, p2, v11, v12}, La/hne;->D(IIII)I

    .line 261
    .line 262
    .line 263
    move-result p2

    .line 264
    iget-object v8, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->w:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 265
    .line 266
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-nez v10, :cond_8

    .line 271
    .line 272
    add-int/2addr v9, v3

    .line 273
    add-int/2addr v9, v7

    .line 274
    :cond_8
    sub-int/2addr v0, v9

    .line 275
    sub-int/2addr v0, p2

    .line 276
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-virtual {p2, v0}, La/eue;->c(I)V

    .line 281
    .line 282
    .line 283
    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    invoke-virtual {v8, p2, v0}, Landroid/view/View;->measure(II)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, La/htj;->c()V

    .line 295
    .line 296
    .line 297
    :goto_6
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    .line 298
    .line 299
    .line 300
    move-result-object p2

    .line 301
    iget p2, p2, La/eue;->e:I

    .line 302
    .line 303
    invoke-static {v3, p2}, Ljava/lang/Math;->max(II)I

    .line 304
    .line 305
    .line 306
    move-result p2

    .line 307
    int-to-float p2, p2

    .line 308
    iget v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->h:F

    .line 309
    .line 310
    add-float/2addr p2, v0

    .line 311
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 316
    .line 317
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    iget v1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->i:I

    .line 322
    .line 323
    if-nez v0, :cond_9

    .line 324
    .line 325
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    iget-object v0, v0, La/yte;->c:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 330
    .line 331
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    add-int/2addr v0, v1

    .line 336
    goto :goto_7

    .line 337
    :cond_9
    move v0, v2

    .line 338
    :goto_7
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-virtual {v3}, La/eue;->b()Z

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    if-nez v3, :cond_a

    .line 347
    .line 348
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    iget v3, v3, La/eue;->e:I

    .line 353
    .line 354
    goto :goto_8

    .line 355
    :cond_a
    move v3, v2

    .line 356
    :goto_8
    if-lez v3, :cond_b

    .line 357
    .line 358
    move v7, v1

    .line 359
    goto :goto_9

    .line 360
    :cond_b
    move v7, v2

    .line 361
    :goto_9
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getSubTitleDelegate()La/eue;

    .line 362
    .line 363
    .line 364
    move-result-object v8

    .line 365
    invoke-virtual {v8}, La/eue;->b()Z

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    if-nez v8, :cond_c

    .line 370
    .line 371
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getSubTitleDelegate()La/eue;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    iget v8, v8, La/eue;->e:I

    .line 376
    .line 377
    add-int/2addr v8, v7

    .line 378
    goto :goto_a

    .line 379
    :cond_c
    move v8, v2

    .line 380
    :goto_a
    if-gtz v8, :cond_e

    .line 381
    .line 382
    if-lez v3, :cond_d

    .line 383
    .line 384
    goto :goto_b

    .line 385
    :cond_d
    move v1, v2

    .line 386
    :cond_e
    :goto_b
    invoke-virtual {v4}, La/eue;->b()Z

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    if-nez v7, :cond_f

    .line 391
    .line 392
    iget v2, v4, La/eue;->e:I

    .line 393
    .line 394
    add-int/2addr v2, v1

    .line 395
    :cond_f
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    iget v4, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->j:I

    .line 400
    .line 401
    mul-int/lit8 v4, v4, 0x2

    .line 402
    .line 403
    add-int/2addr v4, v1

    .line 404
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getShimmerDelegate()La/bte;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    iget-object v1, v1, La/bte;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 409
    .line 410
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-nez v1, :cond_10

    .line 415
    .line 416
    iget p2, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->g:I

    .line 417
    .line 418
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object p2

    .line 422
    goto :goto_c

    .line 423
    :cond_10
    iget v1, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->e:I

    .line 424
    .line 425
    add-int/2addr v1, v4

    .line 426
    add-int/2addr v1, v0

    .line 427
    add-int/2addr v1, v3

    .line 428
    add-int/2addr v1, v2

    .line 429
    add-int/2addr v1, v8

    .line 430
    int-to-float v0, v1

    .line 431
    add-float/2addr v0, p2

    .line 432
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 433
    .line 434
    .line 435
    move-result-object p2

    .line 436
    :goto_c
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 437
    .line 438
    .line 439
    move-result p2

    .line 440
    invoke-static {p2, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 441
    .line 442
    .line 443
    move-result p2

    .line 444
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 445
    .line 446
    .line 447
    return-void
.end method

.method public setAutoSub(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getAutoSubTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getAutoSubTagDelegate()La/yte;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->u:La/htj;

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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setCaption(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setCaption(Ljava/lang/CharSequence;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getCaptionDelegate()La/eue;

    move-result-object v0

    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setCouponBonusTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setCaption(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setEachWay(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getEachWayTagDelegate()La/yte;

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
    .locals 0

    .line 12
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

    move-result-object p0

    invoke-virtual {p0, p1}, La/eue;->d(I)V

    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getErrorDelegate()La/eue;

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
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getLiveTagDelegate()La/yte;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setMarketCoefficient(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

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
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

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
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

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
    iget-object v3, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->w:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 10
    .line 11
    invoke-static {v3, v0, v1, v2}, Lorg/xplatform/uikit/components/views/LoadableImageView;->h(Lorg/xplatform/uikit/components/views/LoadableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p1, La/fue;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setCaption(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, La/fue;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setTagText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    iget v0, p1, La/fue;->c:I

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setTagColor(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, La/fue;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setTitle(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, La/fue;->e:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p1, La/fue;->f:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setError(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p1, La/fue;->i:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/fue;->h:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v2, p1, La/fue;->j:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v3, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->v:La/j4l0;

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-nez v4, :cond_0

    .line 57
    .line 58
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketCoefficient(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    iget v0, p1, La/fue;->m:I

    .line 71
    .line 72
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketStyle(Ljava/lang/Integer;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p1, La/fue;->n:La/j0d;

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketCoefficientState(La/j0d;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    iget-boolean v0, p1, La/fue;->g:Z

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->c(Z)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p1, La/fue;->p:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setLiveTagText(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p1, La/fue;->q:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setAutoSub(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, p1, La/fue;->r:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setOptionBet(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p1, La/fue;->s:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setEachWay(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
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
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->u:La/htj;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getOptionBetTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getOptionBetTagDelegate()La/yte;

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
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->w:Lorg/xplatform/uikit/components/views/LoadableImageView;

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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setSubTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getSubTitleDelegate()La/eue;

    move-result-object v0

    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setTagColor(I)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

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
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, La/yte;->e(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->getTagDelegate()La/yte;

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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->setTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 13
    iget-object v0, p0, Lorg/xplatform/uikit_sport/sport_coupon_card/coupon_card_style_views/SportCouponCardChampName;->l:La/eue;

    invoke-virtual {v0, p1}, La/eue;->e(Ljava/lang/CharSequence;)V

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
