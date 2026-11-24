.class public final La/bjl;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/qe;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:Z

.field public h:Z

.field public final i:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

.field public final j:Landroidx/appcompat/widget/AppCompatTextView;

.field public final k:Lorg/xplatform/uikit/components/buttons/DsButton;

.field public final l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

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
    const v2, 0x7f07072d

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, p0, La/bjl;->a:I

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v2, 0x7f0706fe

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, p0, La/bjl;->b:I

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const v2, 0x7f0706f9

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iput v1, p0, La/bjl;->c:I

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const v2, 0x7f070660

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iput v1, p0, La/bjl;->d:I

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const v2, 0x7f0706d7

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iput v1, p0, La/bjl;->e:I

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const v2, 0x7f0706a3

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    const/high16 v2, 0x40000000    # 2.0f

    .line 85
    .line 86
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    iput v1, p0, La/bjl;->f:I

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    iput-boolean v1, p0, La/bjl;->h:Z

    .line 94
    .line 95
    new-instance v2, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 96
    .line 97
    invoke-direct {v2, p1, v0}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 98
    .line 99
    .line 100
    const v3, 0x7f0a00a8

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    const v4, 0x7f07074b

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    const v4, 0x7f14048c

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, p1, v4, v0, v3}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->b(Landroid/content/Context;ILjava/lang/Float;Ljava/lang/Float;)V

    .line 125
    .line 126
    .line 127
    iput-object v2, p0, La/bjl;->i:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 128
    .line 129
    new-instance v3, Landroidx/appcompat/widget/AppCompatTextView;

    .line 130
    .line 131
    invoke-direct {v3, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 139
    .line 140
    .line 141
    const v4, 0x7f14046f

    .line 142
    .line 143
    .line 144
    invoke-static {v4, v3}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 148
    .line 149
    .line 150
    const v1, 0x800003

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 154
    .line 155
    .line 156
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 157
    .line 158
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 159
    .line 160
    .line 161
    const/4 v1, 0x5

    .line 162
    invoke-virtual {v3, v1}, Landroid/view/View;->setTextAlignment(I)V

    .line 163
    .line 164
    .line 165
    const-string v1, "DsAccountInfoSmallLabel"

    .line 166
    .line 167
    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    iput-object v3, p0, La/bjl;->j:Landroidx/appcompat/widget/AppCompatTextView;

    .line 171
    .line 172
    new-instance v1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 173
    .line 174
    const/4 v4, 0x0

    .line 175
    const/4 v5, 0x6

    .line 176
    invoke-direct {v1, p1, v0, v5, v4}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 177
    .line 178
    .line 179
    const-string v4, "DsAccountInfoSmallButton"

    .line 180
    .line 181
    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    sget-object v4, La/eul;->h:La/eul;

    .line 185
    .line 186
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 187
    .line 188
    .line 189
    iput-object v1, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 190
    .line 191
    new-instance v4, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 192
    .line 193
    invoke-direct {v4, p1, v0, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 194
    .line 195
    .line 196
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-virtual {v4, v0}, Landroid/view/View;->setId(I)V

    .line 201
    .line 202
    .line 203
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 204
    .line 205
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    const v6, 0x7f0705cb

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 220
    .line 221
    .line 222
    const v5, 0x7f040b0e

    .line 223
    .line 224
    .line 225
    invoke-static {v5, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 237
    .line 238
    .line 239
    iput-object v4, p0, La/bjl;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 240
    .line 241
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 251
    .line 252
    .line 253
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 254
    .line 255
    .line 256
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iget-object v1, p0, La/bjl;->i:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/bjl;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3, v0}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setLoading(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getVisibleAmount()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, La/bjl;->i:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->getVisibleText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    iget-object v4, p0, La/bjl;->j:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2
    .line 3
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int v2, v0, p2

    .line 8
    .line 9
    iget v3, p0, La/bjl;->b:I

    .line 10
    .line 11
    move-object v5, p0

    .line 12
    move v0, p2

    .line 13
    move v1, p3

    .line 14
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v0, p0, La/bjl;->h:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget v0, p0, La/bjl;->d:I

    .line 22
    .line 23
    sub-int v1, p5, v0

    .line 24
    .line 25
    iget v0, p0, La/bjl;->e:I

    .line 26
    .line 27
    add-int v2, p2, v0

    .line 28
    .line 29
    iget-object v4, p0, La/bjl;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 30
    .line 31
    move-object v5, p0

    .line 32
    move v0, p2

    .line 33
    move v3, p5

    .line 34
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v4, p0, La/bjl;->i:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    sub-int v1, p5, v0

    .line 45
    .line 46
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    add-int v2, v0, p2

    .line 51
    .line 52
    move-object v5, p0

    .line 53
    move v0, p2

    .line 54
    move v3, p5

    .line 55
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    iget-boolean v0, p0, La/bjl;->g:Z

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    iget-object v4, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 63
    .line 64
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    sub-int v0, p4, v0

    .line 69
    .line 70
    move-object v5, p0

    .line 71
    move v1, p3

    .line 72
    move v2, p4

    .line 73
    move v3, p5

    .line 74
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-boolean p2, p0, La/bjl;->g:Z

    .line 6
    .line 7
    iget-object v0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 8
    .line 9
    const/high16 v1, 0x40000000    # 2.0f

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget p2, p0, La/bjl;->c:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->getButtonHeight()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sub-int/2addr v2, v3

    .line 30
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v0, p2, v2}, Landroid/view/View;->measure(II)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-boolean p2, p0, La/bjl;->g:Z

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    iget p2, p0, La/bjl;->a:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 p2, 0x0

    .line 45
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sub-int v0, p1, v0

    .line 50
    .line 51
    sub-int/2addr v0, p2

    .line 52
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iget v3, p0, La/bjl;->b:I

    .line 61
    .line 62
    sub-int v2, v3, v2

    .line 63
    .line 64
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iget-object v4, p0, La/bjl;->i:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 69
    .line 70
    invoke-virtual {v4, p2, v2}, Landroid/view/View;->measure(II)V

    .line 71
    .line 72
    .line 73
    iget-object v4, p0, La/bjl;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 74
    .line 75
    invoke-virtual {v4, p2, v2}, Landroid/view/View;->measure(II)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    sub-int/2addr v3, v0

    .line 87
    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v1, p0, La/bjl;->j:Landroidx/appcompat/widget/AppCompatTextView;

    .line 92
    .line 93
    invoke-virtual {v1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 94
    .line 95
    .line 96
    iget p2, p0, La/bjl;->f:I

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public setAmountCurrencyMargin(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/bjl;->i:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->setAmountCurrencyMargin(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAmountCurrencyVisible(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/16 p1, 0x8

    .line 6
    .line 7
    :goto_0
    iget-object p0, p0, La/bjl;->i:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setButtonEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setButtonIconAutoMirrored(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setIconAutoMirrored(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setButtonIconRes(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->i(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setButtonStyle(La/ful;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setButtonText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setButtonType(La/gul;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 10
    .line 11
    if-ne v0, p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->e:La/gul;

    .line 15
    .line 16
    iget-boolean p1, p1, La/gul;->c:Z

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->a()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Lorg/xplatform/uikit/components/buttons/DsButton;->l:Landroidx/appcompat/widget/AppCompatImageView;

    .line 33
    .line 34
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->g()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public setButtonVisible(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/bjl;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v1

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    const/16 v1, 0x8

    .line 15
    .line 16
    :goto_1
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setHasButton(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/bjl;->g:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/16 p1, 0x8

    .line 8
    .line 9
    :goto_0
    iget-object p0, p0, La/bjl;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setLabel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/bjl;->j:Landroidx/appcompat/widget/AppCompatTextView;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setModel(La/ke;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/ke;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-object p1, p1, La/ke;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, La/bjl;->i:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 9
    .line 10
    invoke-virtual {v1, v0, p1}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, La/bjl;->l:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 17
    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, La/bjl;->h:Z

    .line 25
    .line 26
    return-void
.end method
