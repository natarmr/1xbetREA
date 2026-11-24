.class public final La/wr5;
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

.field public final g:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final h:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final i:Landroid/view/View;

.field public final j:Landroid/widget/TextView;

.field public final k:Lorg/xplatform/uikit/components/tag/DsTag;

.field public l:Ljava/lang/String;

.field public final m:La/n0o0;

.field public final n:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 20

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
    const v3, 0x7f0706d9

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iput v2, v0, La/wr5;->a:I

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const v4, 0x7f070644

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    iput v3, v0, La/wr5;->b:I

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const v4, 0x7f07069b

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iput v3, v0, La/wr5;->c:I

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const v4, 0x7f0706b7

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iput v3, v0, La/wr5;->d:I

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const v5, 0x7f07072d

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    iput v4, v0, La/wr5;->e:I

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const v5, 0x7f0706a9

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    iput v4, v0, La/wr5;->f:I

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const v6, 0x7f0705c6

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    new-instance v6, La/daf;

    .line 102
    .line 103
    invoke-direct {v6}, La/daf;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, v5}, La/daf;->S(F)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, La/daf;->c()La/akj0;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    new-instance v7, La/wgg0;

    .line 114
    .line 115
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    new-instance v8, La/wgg0;

    .line 119
    .line 120
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance v9, La/q0;

    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    invoke-direct {v9, v10}, La/q0;-><init>(F)V

    .line 127
    .line 128
    .line 129
    new-instance v11, La/q0;

    .line 130
    .line 131
    invoke-direct {v11, v10}, La/q0;-><init>(F)V

    .line 132
    .line 133
    .line 134
    new-instance v10, La/ujn;

    .line 135
    .line 136
    const/4 v12, 0x0

    .line 137
    invoke-direct {v10, v12}, La/ujn;-><init>(B)V

    .line 138
    .line 139
    .line 140
    new-instance v13, La/ujn;

    .line 141
    .line 142
    invoke-direct {v13, v12}, La/ujn;-><init>(B)V

    .line 143
    .line 144
    .line 145
    new-instance v14, La/ujn;

    .line 146
    .line 147
    invoke-direct {v14, v12}, La/ujn;-><init>(B)V

    .line 148
    .line 149
    .line 150
    new-instance v15, La/ujn;

    .line 151
    .line 152
    invoke-direct {v15, v12}, La/ujn;-><init>(B)V

    .line 153
    .line 154
    .line 155
    move/from16 v16, v12

    .line 156
    .line 157
    invoke-static/range {v16 .. v16}, La/k7x;->A(I)La/qzb;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    move/from16 v17, v3

    .line 162
    .line 163
    new-instance v3, La/q0;

    .line 164
    .line 165
    invoke-direct {v3, v5}, La/q0;-><init>(F)V

    .line 166
    .line 167
    .line 168
    move/from16 v18, v2

    .line 169
    .line 170
    invoke-static/range {v16 .. v16}, La/k7x;->A(I)La/qzb;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    move/from16 v19, v4

    .line 175
    .line 176
    new-instance v4, La/q0;

    .line 177
    .line 178
    invoke-direct {v4, v5}, La/q0;-><init>(F)V

    .line 179
    .line 180
    .line 181
    new-instance v5, La/akj0;

    .line 182
    .line 183
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 184
    .line 185
    .line 186
    iput-object v7, v5, La/akj0;->a:La/qzb;

    .line 187
    .line 188
    iput-object v8, v5, La/akj0;->b:La/qzb;

    .line 189
    .line 190
    iput-object v2, v5, La/akj0;->c:La/qzb;

    .line 191
    .line 192
    iput-object v12, v5, La/akj0;->d:La/qzb;

    .line 193
    .line 194
    iput-object v9, v5, La/akj0;->e:La/dne;

    .line 195
    .line 196
    iput-object v11, v5, La/akj0;->f:La/dne;

    .line 197
    .line 198
    iput-object v4, v5, La/akj0;->g:La/dne;

    .line 199
    .line 200
    iput-object v3, v5, La/akj0;->h:La/dne;

    .line 201
    .line 202
    iput-object v10, v5, La/akj0;->i:La/ujn;

    .line 203
    .line 204
    iput-object v13, v5, La/akj0;->j:La/ujn;

    .line 205
    .line 206
    iput-object v14, v5, La/akj0;->k:La/ujn;

    .line 207
    .line 208
    iput-object v15, v5, La/akj0;->l:La/ujn;

    .line 209
    .line 210
    new-instance v2, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 211
    .line 212
    invoke-direct {v2, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 213
    .line 214
    .line 215
    const-string v3, "BannerRectangleVerticalView"

    .line 216
    .line 217
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v6}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 221
    .line 222
    .line 223
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 224
    .line 225
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 229
    .line 230
    .line 231
    iput-object v2, v0, La/wr5;->g:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 232
    .line 233
    new-instance v2, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 234
    .line 235
    invoke-direct {v2, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 236
    .line 237
    .line 238
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 239
    .line 240
    const/4 v6, 0x1

    .line 241
    move/from16 v7, v18

    .line 242
    .line 243
    move/from16 v8, v19

    .line 244
    .line 245
    invoke-direct {v4, v7, v8, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v5}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 258
    .line 259
    .line 260
    iput-object v2, v0, La/wr5;->h:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 261
    .line 262
    new-instance v2, Landroid/view/View;

    .line 263
    .line 264
    invoke-direct {v2, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 265
    .line 266
    .line 267
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 268
    .line 269
    const/4 v4, -0x1

    .line 270
    move/from16 v5, v17

    .line 271
    .line 272
    invoke-direct {v3, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 276
    .line 277
    .line 278
    const v3, 0x7f080e45

    .line 279
    .line 280
    .line 281
    invoke-static {v3, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 289
    .line 290
    .line 291
    iput-object v2, v0, La/wr5;->i:Landroid/view/View;

    .line 292
    .line 293
    new-instance v2, Landroid/widget/TextView;

    .line 294
    .line 295
    invoke-direct {v2, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 296
    .line 297
    .line 298
    const-string v3, "titleRectangleVerticalTextView"

    .line 299
    .line 300
    invoke-virtual {v2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    const v3, 0x7f14044e

    .line 304
    .line 305
    .line 306
    invoke-static {v3, v2}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 307
    .line 308
    .line 309
    const/4 v3, 0x2

    .line 310
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 311
    .line 312
    .line 313
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 314
    .line 315
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 316
    .line 317
    .line 318
    invoke-static {}, La/by7;->c()La/by7;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    iget-boolean v4, v4, La/by7;->a:Z

    .line 323
    .line 324
    if-eqz v4, :cond_0

    .line 325
    .line 326
    const v4, 0x800005

    .line 327
    .line 328
    .line 329
    goto :goto_0

    .line 330
    :cond_0
    const v4, 0x800003

    .line 331
    .line 332
    .line 333
    :goto_0
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 334
    .line 335
    .line 336
    const/4 v4, 0x3

    .line 337
    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroid/view/View;->setTextDirection(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 344
    .line 345
    .line 346
    iput-object v2, v0, La/wr5;->j:Landroid/widget/TextView;

    .line 347
    .line 348
    sget v2, Lorg/xplatform/uikit/components/tag/DsTag;->l:I

    .line 349
    .line 350
    const v2, 0x7f14080e

    .line 351
    .line 352
    .line 353
    invoke-static {v2, v1}, La/sj3;->W(ILandroid/content/Context;)Lorg/xplatform/uikit/components/tag/DsTag;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 358
    .line 359
    const/4 v5, -0x2

    .line 360
    invoke-direct {v2, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1, v4}, Landroid/view/View;->setTextDirection(I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 379
    .line 380
    .line 381
    iput-object v1, v0, La/wr5;->k:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 382
    .line 383
    new-instance v1, La/vr5;

    .line 384
    .line 385
    move/from16 v2, v16

    .line 386
    .line 387
    invoke-direct {v1, v0, v2}, La/vr5;-><init>(La/wr5;B)V

    .line 388
    .line 389
    .line 390
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    iput-object v1, v0, La/wr5;->m:La/n0o0;

    .line 395
    .line 396
    new-instance v1, La/vr5;

    .line 397
    .line 398
    invoke-direct {v1, v0, v6}, La/vr5;-><init>(La/wr5;B)V

    .line 399
    .line 400
    .line 401
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    iput-object v1, v0, La/wr5;->n:La/n0o0;

    .line 406
    .line 407
    return-void
.end method

.method private final getDecoratorImageHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, La/wr5;->n:La/n0o0;

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
    iget-object p0, p0, La/wr5;->m:La/n0o0;

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
    iput-object v0, p0, La/wr5;->l:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p0}, La/wr5;->getLoadHelper()La/r0x;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v1, p2, La/gp5;

    .line 15
    .line 16
    if-eqz v1, :cond_0

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
    iget v5, p0, La/wr5;->b:I

    .line 28
    .line 29
    iget v6, p0, La/wr5;->c:I

    .line 30
    .line 31
    iget v4, p0, La/wr5;->a:I

    .line 32
    .line 33
    move v7, v6

    .line 34
    invoke-static/range {v2 .. v7}, La/f1t0;->Z(Landroid/content/Context;La/m0x;IIII)La/o0x;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    new-instance v1, La/qo5;

    .line 39
    .line 40
    const/4 v2, 0x3

    .line 41
    invoke-direct {v1, p0, p1, v2}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v2, La/b33;

    .line 45
    .line 46
    const/16 v3, 0x19

    .line 47
    .line 48
    invoke-direct {v2, p0, v3}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1, p2, v1, v2}, La/r0x;->c(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public getLoadedImageUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/wr5;->l:Ljava/lang/String;

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
    iget-object p1, p0, La/wr5;->i:Landroid/view/View;

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
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    sub-int/2addr p2, p3

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

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
    iget-object p1, p0, La/wr5;->j:Landroid/widget/TextView;

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
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iget p3, p0, La/wr5;->e:I

    .line 49
    .line 50
    sub-int/2addr p2, p3

    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 52
    .line 53
    .line 54
    move-result p4

    .line 55
    sub-int/2addr p2, p4

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    sub-int/2addr p4, p3

    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 62
    .line 63
    .line 64
    move-result p5

    .line 65
    add-int/2addr p5, p2

    .line 66
    invoke-virtual {p1, p3, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 67
    .line 68
    .line 69
    :goto_1
    iget-object p4, p0, La/wr5;->k:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 70
    .line 71
    invoke-virtual {p4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-nez p1, :cond_2

    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    move-object p5, p0

    .line 87
    const/4 p0, 0x0

    .line 88
    const/4 p1, 0x0

    .line 89
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    iget p1, p0, La/wr5;->a:I

    .line 2
    .line 3
    const/high16 p2, 0x40000000    # 2.0f

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, La/wr5;->b:I

    .line 10
    .line 11
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, La/wr5;->g:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 16
    .line 17
    invoke-virtual {v3, v0, v2}, Landroid/view/View;->measure(II)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, La/wr5;->f:I

    .line 25
    .line 26
    invoke-static {v2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget-object v3, p0, La/wr5;->h:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 31
    .line 32
    invoke-virtual {v3, v0, v2}, Landroid/view/View;->measure(II)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget v2, p0, La/wr5;->d:I

    .line 40
    .line 41
    invoke-static {v2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iget-object v3, p0, La/wr5;->i:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {v3, v0, v2}, Landroid/view/View;->measure(II)V

    .line 48
    .line 49
    .line 50
    iget v0, p0, La/wr5;->e:I

    .line 51
    .line 52
    mul-int/lit8 v0, v0, 0x2

    .line 53
    .line 54
    sub-int v0, p1, v0

    .line 55
    .line 56
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    iget-object v4, p0, La/wr5;->j:Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {v4, v0, v3}, Landroid/view/View;->measure(II)V

    .line 68
    .line 69
    .line 70
    const/high16 v0, -0x80000000

    .line 71
    .line 72
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iget-object v3, p0, La/wr5;->k:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 81
    .line 82
    invoke-virtual {v3, v0, v2}, Landroid/view/View;->measure(II)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public setDecoratorImage(La/o0x;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/wr5;->h:Lcom/google/android/material/imageview/ShapeableImageView;

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
    invoke-direct {p0}, La/wr5;->getDecoratorImageHelper()La/r0x;

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
    iget-object v0, p0, La/wr5;->k:Lorg/xplatform/uikit/components/tag/DsTag;

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
    iget-object v0, p0, La/wr5;->k:Lorg/xplatform/uikit/components/tag/DsTag;

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
    iget-object v0, p0, La/wr5;->j:Landroid/widget/TextView;

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
