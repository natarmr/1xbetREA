.class public final La/qs5;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final d:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final e:Lorg/xplatform/uikit/components/tag/DsTag;

.field public f:Ljava/lang/String;

.field public final g:La/n0o0;

.field public final h:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 18

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
    iput v2, v0, La/qs5;->a:I

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const v4, 0x7f0706a9

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    iput v3, v0, La/qs5;->b:I

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const v5, 0x7f0705c9

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    new-instance v5, La/daf;

    .line 58
    .line 59
    invoke-direct {v5}, La/daf;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v4}, La/daf;->S(F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, La/daf;->c()La/akj0;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    new-instance v6, La/wgg0;

    .line 70
    .line 71
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    new-instance v7, La/wgg0;

    .line 75
    .line 76
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v8, La/q0;

    .line 80
    .line 81
    const/4 v9, 0x0

    .line 82
    invoke-direct {v8, v9}, La/q0;-><init>(F)V

    .line 83
    .line 84
    .line 85
    new-instance v10, La/q0;

    .line 86
    .line 87
    invoke-direct {v10, v9}, La/q0;-><init>(F)V

    .line 88
    .line 89
    .line 90
    new-instance v9, La/ujn;

    .line 91
    .line 92
    const/4 v11, 0x0

    .line 93
    invoke-direct {v9, v11}, La/ujn;-><init>(B)V

    .line 94
    .line 95
    .line 96
    new-instance v12, La/ujn;

    .line 97
    .line 98
    invoke-direct {v12, v11}, La/ujn;-><init>(B)V

    .line 99
    .line 100
    .line 101
    new-instance v13, La/ujn;

    .line 102
    .line 103
    invoke-direct {v13, v11}, La/ujn;-><init>(B)V

    .line 104
    .line 105
    .line 106
    new-instance v14, La/ujn;

    .line 107
    .line 108
    invoke-direct {v14, v11}, La/ujn;-><init>(B)V

    .line 109
    .line 110
    .line 111
    invoke-static {v11}, La/k7x;->A(I)La/qzb;

    .line 112
    .line 113
    .line 114
    move-result-object v15

    .line 115
    move/from16 v16, v11

    .line 116
    .line 117
    new-instance v11, La/q0;

    .line 118
    .line 119
    invoke-direct {v11, v4}, La/q0;-><init>(F)V

    .line 120
    .line 121
    .line 122
    move/from16 v17, v3

    .line 123
    .line 124
    invoke-static/range {v16 .. v16}, La/k7x;->A(I)La/qzb;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    new-instance v0, La/q0;

    .line 129
    .line 130
    invoke-direct {v0, v4}, La/q0;-><init>(F)V

    .line 131
    .line 132
    .line 133
    new-instance v4, La/akj0;

    .line 134
    .line 135
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 136
    .line 137
    .line 138
    iput-object v6, v4, La/akj0;->a:La/qzb;

    .line 139
    .line 140
    iput-object v7, v4, La/akj0;->b:La/qzb;

    .line 141
    .line 142
    iput-object v3, v4, La/akj0;->c:La/qzb;

    .line 143
    .line 144
    iput-object v15, v4, La/akj0;->d:La/qzb;

    .line 145
    .line 146
    iput-object v8, v4, La/akj0;->e:La/dne;

    .line 147
    .line 148
    iput-object v10, v4, La/akj0;->f:La/dne;

    .line 149
    .line 150
    iput-object v0, v4, La/akj0;->g:La/dne;

    .line 151
    .line 152
    iput-object v11, v4, La/akj0;->h:La/dne;

    .line 153
    .line 154
    iput-object v9, v4, La/akj0;->i:La/ujn;

    .line 155
    .line 156
    iput-object v12, v4, La/akj0;->j:La/ujn;

    .line 157
    .line 158
    iput-object v13, v4, La/akj0;->k:La/ujn;

    .line 159
    .line 160
    iput-object v14, v4, La/akj0;->l:La/ujn;

    .line 161
    .line 162
    new-instance v0, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 163
    .line 164
    invoke-direct {v0, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 165
    .line 166
    .line 167
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 168
    .line 169
    invoke-direct {v3, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v5}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 176
    .line 177
    .line 178
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 179
    .line 180
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 181
    .line 182
    .line 183
    const v5, 0x7f080667

    .line 184
    .line 185
    .line 186
    invoke-static {v5, v1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-virtual {v0, v5}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 191
    .line 192
    .line 193
    move-object/from16 v5, p0

    .line 194
    .line 195
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    iput-object v0, v5, La/qs5;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 199
    .line 200
    new-instance v0, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 201
    .line 202
    invoke-direct {v0, v1}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;)V

    .line 203
    .line 204
    .line 205
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 206
    .line 207
    const/16 v7, 0x51

    .line 208
    .line 209
    move/from16 v8, v17

    .line 210
    .line 211
    invoke-direct {v6, v2, v8, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v4}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 224
    .line 225
    .line 226
    iput-object v0, v5, La/qs5;->d:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 227
    .line 228
    sget v0, Lorg/xplatform/uikit/components/tag/DsTag;->l:I

    .line 229
    .line 230
    const v0, 0x7f14080e

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v1}, La/sj3;->W(ILandroid/content/Context;)Lorg/xplatform/uikit/components/tag/DsTag;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 238
    .line 239
    const/4 v2, -0x2

    .line 240
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 241
    .line 242
    .line 243
    const v2, 0x800033

    .line 244
    .line 245
    .line 246
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 247
    .line 248
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 249
    .line 250
    .line 251
    const/4 v1, 0x3

    .line 252
    invoke-virtual {v0, v1}, Landroid/view/View;->setTextDirection(I)V

    .line 253
    .line 254
    .line 255
    const/4 v1, 0x1

    .line 256
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 257
    .line 258
    .line 259
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 260
    .line 261
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 265
    .line 266
    .line 267
    iput-object v0, v5, La/qs5;->e:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 268
    .line 269
    new-instance v0, La/ps5;

    .line 270
    .line 271
    move/from16 v2, v16

    .line 272
    .line 273
    invoke-direct {v0, v5, v2}, La/ps5;-><init>(La/qs5;B)V

    .line 274
    .line 275
    .line 276
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iput-object v0, v5, La/qs5;->g:La/n0o0;

    .line 281
    .line 282
    new-instance v0, La/ps5;

    .line 283
    .line 284
    invoke-direct {v0, v5, v1}, La/ps5;-><init>(La/qs5;B)V

    .line 285
    .line 286
    .line 287
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    iput-object v0, v5, La/qs5;->h:La/n0o0;

    .line 292
    .line 293
    return-void
.end method

.method private final getBannerImageHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, La/qs5;->g:La/n0o0;

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

.method private final getDecoratorImageHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, La/qs5;->h:La/n0o0;

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
    iput-object v0, p0, La/qs5;->f:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {p0}, La/qs5;->getBannerImageHelper()La/r0x;

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
    iget v4, p0, La/qs5;->a:I

    .line 28
    .line 29
    iget v6, p0, La/qs5;->b:I

    .line 30
    .line 31
    move v5, v4

    .line 32
    move v7, v6

    .line 33
    invoke-static/range {v2 .. v7}, La/f1t0;->Z(Landroid/content/Context;La/m0x;IIII)La/o0x;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    new-instance v1, La/qo5;

    .line 38
    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    invoke-direct {v1, p0, p1, v2}, La/qo5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v2, La/os5;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct {v2, p0, v3}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1, p2, v1, v2}, La/r0x;->c(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    const-string p1, "BannerSquareSView"

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final getLoadedImageUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/qs5;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setDecoratorImage(La/o0x;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/qs5;->d:Lcom/google/android/material/imageview/ShapeableImageView;

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
    invoke-direct {p0}, La/qs5;->getDecoratorImageHelper()La/r0x;

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

.method public final setTag(Ljava/lang/String;)V
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
    iget-object p0, p0, La/qs5;->e:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final setTagColor(La/goo0;)V
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
    iget-object p0, p0, La/qs5;->e:Lorg/xplatform/uikit/components/tag/DsTag;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/tag/DsTag;->setStyle(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
