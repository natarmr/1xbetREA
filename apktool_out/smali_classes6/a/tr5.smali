.class public final La/tr5;
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

.field public final g:F

.field public final h:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final i:Lorg/xplatform/uikit/components/tag/DsTag;

.field public final j:Lcom/google/android/material/imageview/ShapeableImageView;

.field public k:Ljava/lang/String;

.field public final l:La/n0o0;

.field public final m:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 19

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
    iput v2, v0, La/tr5;->a:I

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
    iput v2, v0, La/tr5;->b:I

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
    iput v2, v0, La/tr5;->c:I

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
    iput v3, v0, La/tr5;->d:I

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
    iput v3, v0, La/tr5;->e:I

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    iput v3, v0, La/tr5;->f:I

    .line 86
    .line 87
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 96
    .line 97
    int-to-float v4, v4

    .line 98
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 107
    .line 108
    div-float/2addr v4, v5

    .line 109
    iput v4, v0, La/tr5;->g:F

    .line 110
    .line 111
    new-instance v4, La/daf;

    .line 112
    .line 113
    invoke-direct {v4}, La/daf;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    const v6, 0x7f0705c6

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    invoke-virtual {v4, v5}, La/daf;->S(F)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4}, La/daf;->c()La/akj0;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    new-instance v5, La/wgg0;

    .line 135
    .line 136
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 137
    .line 138
    .line 139
    new-instance v7, La/wgg0;

    .line 140
    .line 141
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 142
    .line 143
    .line 144
    new-instance v8, La/q0;

    .line 145
    .line 146
    const/4 v9, 0x0

    .line 147
    invoke-direct {v8, v9}, La/q0;-><init>(F)V

    .line 148
    .line 149
    .line 150
    new-instance v10, La/q0;

    .line 151
    .line 152
    invoke-direct {v10, v9}, La/q0;-><init>(F)V

    .line 153
    .line 154
    .line 155
    new-instance v9, La/ujn;

    .line 156
    .line 157
    const/4 v11, 0x0

    .line 158
    invoke-direct {v9, v11}, La/ujn;-><init>(B)V

    .line 159
    .line 160
    .line 161
    new-instance v12, La/ujn;

    .line 162
    .line 163
    invoke-direct {v12, v11}, La/ujn;-><init>(B)V

    .line 164
    .line 165
    .line 166
    new-instance v13, La/ujn;

    .line 167
    .line 168
    invoke-direct {v13, v11}, La/ujn;-><init>(B)V

    .line 169
    .line 170
    .line 171
    new-instance v14, La/ujn;

    .line 172
    .line 173
    invoke-direct {v14, v11}, La/ujn;-><init>(B)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    invoke-virtual {v15, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    move/from16 v16, v11

    .line 185
    .line 186
    invoke-static/range {v16 .. v16}, La/k7x;->A(I)La/qzb;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    new-instance v6, La/q0;

    .line 191
    .line 192
    invoke-direct {v6, v15}, La/q0;-><init>(F)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    move/from16 v18, v2

    .line 200
    .line 201
    const v2, 0x7f0705c6

    .line 202
    .line 203
    .line 204
    invoke-virtual {v15, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-static/range {v16 .. v16}, La/k7x;->A(I)La/qzb;

    .line 209
    .line 210
    .line 211
    move-result-object v15

    .line 212
    move/from16 v17, v3

    .line 213
    .line 214
    new-instance v3, La/q0;

    .line 215
    .line 216
    invoke-direct {v3, v2}, La/q0;-><init>(F)V

    .line 217
    .line 218
    .line 219
    new-instance v2, La/akj0;

    .line 220
    .line 221
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 222
    .line 223
    .line 224
    iput-object v5, v2, La/akj0;->a:La/qzb;

    .line 225
    .line 226
    iput-object v7, v2, La/akj0;->b:La/qzb;

    .line 227
    .line 228
    iput-object v15, v2, La/akj0;->c:La/qzb;

    .line 229
    .line 230
    iput-object v11, v2, La/akj0;->d:La/qzb;

    .line 231
    .line 232
    iput-object v8, v2, La/akj0;->e:La/dne;

    .line 233
    .line 234
    iput-object v10, v2, La/akj0;->f:La/dne;

    .line 235
    .line 236
    iput-object v3, v2, La/akj0;->g:La/dne;

    .line 237
    .line 238
    iput-object v6, v2, La/akj0;->h:La/dne;

    .line 239
    .line 240
    iput-object v9, v2, La/akj0;->i:La/ujn;

    .line 241
    .line 242
    iput-object v12, v2, La/akj0;->j:La/ujn;

    .line 243
    .line 244
    iput-object v13, v2, La/akj0;->k:La/ujn;

    .line 245
    .line 246
    iput-object v14, v2, La/akj0;->l:La/ujn;

    .line 247
    .line 248
    new-instance v3, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 249
    .line 250
    invoke-direct {v3, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 251
    .line 252
    .line 253
    const-string v5, "BannerRectangleHorizontalNoTitleItemsView"

    .line 254
    .line 255
    invoke-virtual {v3, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v4}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 259
    .line 260
    .line 261
    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 262
    .line 263
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 267
    .line 268
    .line 269
    iput-object v3, v0, La/tr5;->h:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 270
    .line 271
    sget v3, Lorg/xplatform/uikit/components/tag/DsTag;->l:I

    .line 272
    .line 273
    const v3, 0x7f14080e

    .line 274
    .line 275
    .line 276
    invoke-static {v3, v1}, La/sj3;->W(ILandroid/content/Context;)Lorg/xplatform/uikit/components/tag/DsTag;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 281
    .line 282
    const/4 v7, -0x2

    .line 283
    invoke-direct {v6, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 287
    .line 288
    .line 289
    const/4 v6, 0x3

    .line 290
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutDirection(I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3, v6}, Landroid/view/View;->setTextDirection(I)V

    .line 294
    .line 295
    .line 296
    const/4 v6, 0x1

    .line 297
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 298
    .line 299
    .line 300
    sget-object v7, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 301
    .line 302
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 306
    .line 307
    .line 308
    iput-object v3, v0, La/tr5;->i:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 309
    .line 310
    new-instance v3, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 311
    .line 312
    invoke-direct {v3, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 313
    .line 314
    .line 315
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 316
    .line 317
    move/from16 v8, v17

    .line 318
    .line 319
    move/from16 v7, v18

    .line 320
    .line 321
    invoke-direct {v1, v7, v8, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v3, v2}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 334
    .line 335
    .line 336
    iput-object v3, v0, La/tr5;->j:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 337
    .line 338
    new-instance v1, La/sr5;

    .line 339
    .line 340
    move/from16 v2, v16

    .line 341
    .line 342
    invoke-direct {v1, v0, v2}, La/sr5;-><init>(La/tr5;B)V

    .line 343
    .line 344
    .line 345
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    iput-object v1, v0, La/tr5;->l:La/n0o0;

    .line 350
    .line 351
    new-instance v1, La/sr5;

    .line 352
    .line 353
    invoke-direct {v1, v0, v6}, La/sr5;-><init>(La/tr5;B)V

    .line 354
    .line 355
    .line 356
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    iput-object v1, v0, La/tr5;->m:La/n0o0;

    .line 361
    .line 362
    invoke-virtual {v0, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    return-void
.end method

.method private final getDecoratorImageHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, La/tr5;->m:La/n0o0;

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
    iget-object p0, p0, La/tr5;->l:La/n0o0;

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
    iput-object v0, p0, La/tr5;->k:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p0}, La/tr5;->getLoadHelper()La/r0x;

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
    iget p2, p0, La/tr5;->g:F

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
    iget v1, p0, La/tr5;->c:I

    .line 36
    .line 37
    :goto_0
    move v4, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget v1, p0, La/tr5;->a:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :goto_1
    if-gez p2, :cond_1

    .line 43
    .line 44
    iget p2, p0, La/tr5;->d:I

    .line 45
    .line 46
    :goto_2
    move v5, p2

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    iget p2, p0, La/tr5;->b:I

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :goto_3
    iget v6, p0, La/tr5;->e:I

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
    const/4 v2, 0x2

    .line 61
    invoke-direct {v1, p0, p1, v2}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    new-instance v2, La/b33;

    .line 65
    .line 66
    const/16 v3, 0x18

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
    iget-object p0, p0, La/tr5;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    iget p1, p0, La/tr5;->g:F

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
    iget v0, p0, La/tr5;->c:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v0, p0, La/tr5;->a:I

    .line 13
    .line 14
    :goto_0
    cmpg-float p1, p1, p2

    .line 15
    .line 16
    if-gez p1, :cond_1

    .line 17
    .line 18
    iget p1, p0, La/tr5;->d:I

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget p1, p0, La/tr5;->b:I

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
    iget-object v3, p0, La/tr5;->h:Lcom/google/android/material/imageview/ShapeableImageView;

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
    iget v2, p0, La/tr5;->f:I

    .line 43
    .line 44
    invoke-static {v2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget-object v3, p0, La/tr5;->j:Lcom/google/android/material/imageview/ShapeableImageView;

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
    move-result v0

    .line 57
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public setDecoratorImage(La/o0x;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/tr5;->j:Lcom/google/android/material/imageview/ShapeableImageView;

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
    invoke-direct {p0}, La/tr5;->getDecoratorImageHelper()La/r0x;

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
    iget-object v0, p0, La/tr5;->i:Lorg/xplatform/uikit/components/tag/DsTag;

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
    iget-object v0, p0, La/tr5;->i:Lorg/xplatform/uikit/components/tag/DsTag;

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
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
