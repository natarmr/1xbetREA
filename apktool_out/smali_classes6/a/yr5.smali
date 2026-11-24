.class public final La/yr5;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/gr5;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final f:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final g:Lorg/xplatform/uikit/components/tag/DsTag;

.field public h:Ljava/lang/String;

.field public final i:La/n0o0;

.field public final j:La/n0o0;


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
    iput v2, v0, La/yr5;->a:I

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
    iput v3, v0, La/yr5;->b:I

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
    iput v3, v0, La/yr5;->c:I

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const v4, 0x7f0706a9

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iput v3, v0, La/yr5;->d:I

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const v5, 0x7f0705c6

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    new-instance v5, La/daf;

    .line 76
    .line 77
    invoke-direct {v5}, La/daf;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v4}, La/daf;->S(F)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5}, La/daf;->c()La/akj0;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    new-instance v6, La/wgg0;

    .line 88
    .line 89
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v7, La/wgg0;

    .line 93
    .line 94
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v8, La/q0;

    .line 98
    .line 99
    const/4 v9, 0x0

    .line 100
    invoke-direct {v8, v9}, La/q0;-><init>(F)V

    .line 101
    .line 102
    .line 103
    new-instance v10, La/q0;

    .line 104
    .line 105
    invoke-direct {v10, v9}, La/q0;-><init>(F)V

    .line 106
    .line 107
    .line 108
    new-instance v9, La/ujn;

    .line 109
    .line 110
    const/4 v11, 0x0

    .line 111
    invoke-direct {v9, v11}, La/ujn;-><init>(B)V

    .line 112
    .line 113
    .line 114
    new-instance v12, La/ujn;

    .line 115
    .line 116
    invoke-direct {v12, v11}, La/ujn;-><init>(B)V

    .line 117
    .line 118
    .line 119
    new-instance v13, La/ujn;

    .line 120
    .line 121
    invoke-direct {v13, v11}, La/ujn;-><init>(B)V

    .line 122
    .line 123
    .line 124
    new-instance v14, La/ujn;

    .line 125
    .line 126
    invoke-direct {v14, v11}, La/ujn;-><init>(B)V

    .line 127
    .line 128
    .line 129
    invoke-static {v11}, La/k7x;->A(I)La/qzb;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    move/from16 v16, v11

    .line 134
    .line 135
    new-instance v11, La/q0;

    .line 136
    .line 137
    invoke-direct {v11, v4}, La/q0;-><init>(F)V

    .line 138
    .line 139
    .line 140
    move/from16 v17, v2

    .line 141
    .line 142
    invoke-static/range {v16 .. v16}, La/k7x;->A(I)La/qzb;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    move/from16 v18, v3

    .line 147
    .line 148
    new-instance v3, La/q0;

    .line 149
    .line 150
    invoke-direct {v3, v4}, La/q0;-><init>(F)V

    .line 151
    .line 152
    .line 153
    new-instance v4, La/akj0;

    .line 154
    .line 155
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v6, v4, La/akj0;->a:La/qzb;

    .line 159
    .line 160
    iput-object v7, v4, La/akj0;->b:La/qzb;

    .line 161
    .line 162
    iput-object v2, v4, La/akj0;->c:La/qzb;

    .line 163
    .line 164
    iput-object v15, v4, La/akj0;->d:La/qzb;

    .line 165
    .line 166
    iput-object v8, v4, La/akj0;->e:La/dne;

    .line 167
    .line 168
    iput-object v10, v4, La/akj0;->f:La/dne;

    .line 169
    .line 170
    iput-object v3, v4, La/akj0;->g:La/dne;

    .line 171
    .line 172
    iput-object v11, v4, La/akj0;->h:La/dne;

    .line 173
    .line 174
    iput-object v9, v4, La/akj0;->i:La/ujn;

    .line 175
    .line 176
    iput-object v12, v4, La/akj0;->j:La/ujn;

    .line 177
    .line 178
    iput-object v13, v4, La/akj0;->k:La/ujn;

    .line 179
    .line 180
    iput-object v14, v4, La/akj0;->l:La/ujn;

    .line 181
    .line 182
    new-instance v2, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 183
    .line 184
    invoke-direct {v2, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v5}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 188
    .line 189
    .line 190
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 191
    .line 192
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    iput-object v2, v0, La/yr5;->e:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 199
    .line 200
    new-instance v2, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 201
    .line 202
    invoke-direct {v2, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 203
    .line 204
    .line 205
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 206
    .line 207
    const/4 v6, 0x1

    .line 208
    move/from16 v7, v17

    .line 209
    .line 210
    move/from16 v8, v18

    .line 211
    .line 212
    invoke-direct {v5, v7, v8, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 225
    .line 226
    .line 227
    iput-object v2, v0, La/yr5;->f:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 228
    .line 229
    sget v2, Lorg/xplatform/uikit/components/tag/DsTag;->l:I

    .line 230
    .line 231
    const v2, 0x7f14080e

    .line 232
    .line 233
    .line 234
    invoke-static {v2, v1}, La/sj3;->W(ILandroid/content/Context;)Lorg/xplatform/uikit/components/tag/DsTag;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 239
    .line 240
    const/4 v3, -0x2

    .line 241
    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 245
    .line 246
    .line 247
    const/4 v2, 0x3

    .line 248
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v2}, Landroid/view/View;->setTextDirection(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 255
    .line 256
    .line 257
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 258
    .line 259
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 263
    .line 264
    .line 265
    iput-object v1, v0, La/yr5;->g:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 266
    .line 267
    new-instance v1, La/xr5;

    .line 268
    .line 269
    move/from16 v2, v16

    .line 270
    .line 271
    invoke-direct {v1, v0, v2}, La/xr5;-><init>(La/yr5;B)V

    .line 272
    .line 273
    .line 274
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    iput-object v1, v0, La/yr5;->i:La/n0o0;

    .line 279
    .line 280
    new-instance v1, La/xr5;

    .line 281
    .line 282
    invoke-direct {v1, v0, v6}, La/xr5;-><init>(La/yr5;B)V

    .line 283
    .line 284
    .line 285
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    iput-object v1, v0, La/yr5;->j:La/n0o0;

    .line 290
    .line 291
    const-string v1, "BannerRectangleVerticalNoTitleItemsView"

    .line 292
    .line 293
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    return-void
.end method

.method private final getDecoratorImageHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, La/yr5;->j:La/n0o0;

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
    iget-object p0, p0, La/yr5;->i:La/n0o0;

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
    iput-object v0, p0, La/yr5;->h:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p0}, La/yr5;->getLoadHelper()La/r0x;

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
    iget v5, p0, La/yr5;->b:I

    .line 28
    .line 29
    iget v6, p0, La/yr5;->c:I

    .line 30
    .line 31
    iget v4, p0, La/yr5;->a:I

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
    const/4 v2, 0x4

    .line 41
    invoke-direct {v1, p0, p1, v2}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v2, La/b33;

    .line 45
    .line 46
    const/16 v3, 0x1a

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
    iget-object p0, p0, La/yr5;->h:Ljava/lang/String;

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
    iget-object p4, p0, La/yr5;->g:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 5
    .line 6
    invoke-virtual {p4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    move-object p5, p0

    .line 22
    const/4 p0, 0x0

    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    iget p1, p0, La/yr5;->a:I

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
    iget v1, p0, La/yr5;->b:I

    .line 10
    .line 11
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v3, p0, La/yr5;->e:Lcom/google/android/material/imageview/ShapeableImageView;

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
    iget v2, p0, La/yr5;->d:I

    .line 25
    .line 26
    invoke-static {v2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget-object v3, p0, La/yr5;->f:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 31
    .line 32
    invoke-virtual {v3, v0, v2}, Landroid/view/View;->measure(II)V

    .line 33
    .line 34
    .line 35
    const/high16 v0, -0x80000000

    .line 36
    .line 37
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iget-object v3, p0, La/yr5;->g:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 47
    .line 48
    invoke-virtual {v3, v0, v2}, Landroid/view/View;->measure(II)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public setDecoratorImage(La/o0x;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/yr5;->f:Lcom/google/android/material/imageview/ShapeableImageView;

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
    invoke-direct {p0}, La/yr5;->getDecoratorImageHelper()La/r0x;

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
    iget-object v0, p0, La/yr5;->g:Lorg/xplatform/uikit/components/tag/DsTag;

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
    iget-object v0, p0, La/yr5;->g:Lorg/xplatform/uikit/components/tag/DsTag;

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
