.class public final La/wp5;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

.field public final j:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

.field public final k:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const v2, 0x7f0706d9

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, p0, La/wp5;->a:I

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v3, 0x7f070644

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, p0, La/wp5;->b:I

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, p0, La/wp5;->c:I

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const v2, 0x7f0705c9

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const v3, 0x7f0706d1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iput v2, p0, La/wp5;->d:I

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const v3, 0x7f070640

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iput v2, p0, La/wp5;->e:I

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const v4, 0x7f0705cf

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    const v6, 0x7f0706c7

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    iput v5, p0, La/wp5;->f:I

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v5, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    iput v3, p0, La/wp5;->g:I

    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    const v5, 0x7f070717

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    iput v4, p0, La/wp5;->h:I

    .line 135
    .line 136
    new-instance v4, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 137
    .line 138
    const/4 v5, 0x6

    .line 139
    invoke-direct {v4, p1, v0, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 140
    .line 141
    .line 142
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 143
    .line 144
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 148
    .line 149
    .line 150
    const v1, 0x7f040b62

    .line 151
    .line 152
    .line 153
    invoke-static {v1, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 154
    .line 155
    .line 156
    move-result v7

    .line 157
    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 168
    .line 169
    .line 170
    iput-object v4, p0, La/wp5;->i:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 171
    .line 172
    new-instance v4, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 173
    .line 174
    invoke-direct {v4, p1, v0, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 175
    .line 176
    .line 177
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    .line 178
    .line 179
    invoke-direct {v6}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 183
    .line 184
    .line 185
    invoke-static {v1, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-virtual {v6, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 200
    .line 201
    .line 202
    iput-object v4, p0, La/wp5;->j:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 203
    .line 204
    new-instance v2, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 205
    .line 206
    invoke-direct {v2, p1, v0, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 207
    .line 208
    .line 209
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 210
    .line 211
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 215
    .line 216
    .line 217
    invoke-static {v1, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 232
    .line 233
    .line 234
    iput-object v2, p0, La/wp5;->k:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 235
    .line 236
    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, La/wp5;->c:I

    .line 5
    .line 6
    iget p2, p0, La/wp5;->h:I

    .line 7
    .line 8
    add-int p3, p1, p2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 11
    .line 12
    .line 13
    move-result p4

    .line 14
    iget p5, p0, La/wp5;->d:I

    .line 15
    .line 16
    sub-int/2addr p4, p5

    .line 17
    div-int/lit8 p4, p4, 0x2

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    .line 21
    .line 22
    move-result p5

    .line 23
    sub-int/2addr p5, p4

    .line 24
    add-int/2addr p1, p2

    .line 25
    iget p2, p0, La/wp5;->e:I

    .line 26
    .line 27
    add-int/2addr p1, p2

    .line 28
    iget-object p2, p0, La/wp5;->j:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 29
    .line 30
    invoke-virtual {p2, p4, p3, p5, p1}, Landroid/view/View;->layout(IIII)V

    .line 31
    .line 32
    .line 33
    iget p1, p0, La/wp5;->g:I

    .line 34
    .line 35
    iget p2, p0, La/wp5;->b:I

    .line 36
    .line 37
    sub-int p1, p2, p1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    iget p4, p0, La/wp5;->f:I

    .line 44
    .line 45
    sub-int/2addr p3, p4

    .line 46
    div-int/lit8 p3, p3, 0x2

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 49
    .line 50
    .line 51
    move-result p4

    .line 52
    sub-int/2addr p4, p3

    .line 53
    iget-object p0, p0, La/wp5;->k:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 54
    .line 55
    invoke-virtual {p0, p3, p1, p4, p2}, Landroid/view/View;->layout(IIII)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, La/wp5;->a:I

    .line 5
    .line 6
    const/high16 p2, 0x40000000    # 2.0f

    .line 7
    .line 8
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget v1, p0, La/wp5;->c:I

    .line 13
    .line 14
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, La/wp5;->i:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 19
    .line 20
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, La/wp5;->d:I

    .line 24
    .line 25
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v1, p0, La/wp5;->e:I

    .line 30
    .line 31
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v2, p0, La/wp5;->j:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 36
    .line 37
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    .line 38
    .line 39
    .line 40
    iget v0, p0, La/wp5;->f:I

    .line 41
    .line 42
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v1, p0, La/wp5;->g:I

    .line 47
    .line 48
    invoke-static {v1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    iget-object v2, p0, La/wp5;->k:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 53
    .line 54
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iget v0, p0, La/wp5;->b:I

    .line 62
    .line 63
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
