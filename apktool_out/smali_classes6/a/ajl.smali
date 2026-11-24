.class public final La/ajl;
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

.field public final g:I

.field public final h:I

.field public i:Z

.field public j:Ljava/lang/CharSequence;

.field public k:Z

.field public final l:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

.field public final m:Landroidx/appcompat/widget/AppCompatTextView;

.field public final n:Lorg/xplatform/uikit/components/buttons/DsButton;

.field public final o:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;


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
    iput v1, p0, La/ajl;->a:I

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
    iput v1, p0, La/ajl;->b:I

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const v2, 0x7f070706

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iput v1, p0, La/ajl;->c:I

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const v2, 0x7f07069b

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iput v1, p0, La/ajl;->d:I

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const v2, 0x7f0706a6

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iput v1, p0, La/ajl;->e:I

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const v2, 0x7f070644

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iput v1, p0, La/ajl;->f:I

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const v2, 0x7f070657

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    iput v1, p0, La/ajl;->g:I

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const v2, 0x7f0706c1

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    const/high16 v2, 0x40000000    # 2.0f

    .line 111
    .line 112
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    iput v1, p0, La/ajl;->h:I

    .line 117
    .line 118
    const-string v1, ""

    .line 119
    .line 120
    iput-object v1, p0, La/ajl;->j:Ljava/lang/CharSequence;

    .line 121
    .line 122
    const/4 v1, 0x1

    .line 123
    iput-boolean v1, p0, La/ajl;->k:Z

    .line 124
    .line 125
    new-instance v2, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 126
    .line 127
    invoke-direct {v2, p1, v0}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    const v4, 0x7f07074b

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    const v4, 0x7f1404cf

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, p1, v4, v0, v3}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->b(Landroid/content/Context;ILjava/lang/Float;Ljava/lang/Float;)V

    .line 149
    .line 150
    .line 151
    const v3, 0x7f0a0486

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    .line 155
    .line 156
    .line 157
    iput-object v2, p0, La/ajl;->l:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 158
    .line 159
    new-instance v3, Landroidx/appcompat/widget/AppCompatTextView;

    .line 160
    .line 161
    invoke-direct {v3, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 162
    .line 163
    .line 164
    const v4, 0x7f14046f

    .line 165
    .line 166
    .line 167
    invoke-static {v4, v3}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 171
    .line 172
    .line 173
    const v1, 0x800003

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 177
    .line 178
    .line 179
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 180
    .line 181
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 182
    .line 183
    .line 184
    const/4 v1, 0x5

    .line 185
    invoke-virtual {v3, v1}, Landroid/view/View;->setTextAlignment(I)V

    .line 186
    .line 187
    .line 188
    iput-object v3, p0, La/ajl;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 189
    .line 190
    new-instance v1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 191
    .line 192
    const/4 v4, 0x0

    .line 193
    const/4 v5, 0x6

    .line 194
    invoke-direct {v1, p1, v0, v5, v4}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 195
    .line 196
    .line 197
    sget-object v4, La/eul;->h:La/eul;

    .line 198
    .line 199
    invoke-virtual {v1, v4}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonSize(La/eul;)V

    .line 200
    .line 201
    .line 202
    iput-object v1, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 203
    .line 204
    new-instance v4, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 205
    .line 206
    invoke-direct {v4, p1, v0, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    const v6, 0x7f0705c6

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 226
    .line 227
    .line 228
    const v5, 0x7f040b0e

    .line 229
    .line 230
    .line 231
    invoke-static {v5, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 243
    .line 244
    .line 245
    iput-object v4, p0, La/ajl;->o:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 246
    .line 247
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 257
    .line 258
    .line 259
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 260
    .line 261
    .line 262
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 4

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iget-object v1, p0, La/ajl;->l:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/ajl;->o:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

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
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

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
    iget-object p0, p0, La/ajl;->l:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

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
    iget-object v4, p0, La/ajl;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2
    .line 3
    iget v3, p0, La/ajl;->b:I

    .line 4
    .line 5
    move-object v5, p0

    .line 6
    move v0, p2

    .line 7
    move v1, p3

    .line 8
    move v2, p4

    .line 9
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 10
    .line 11
    .line 12
    move p0, v0

    .line 13
    iget-boolean p1, v5, La/ajl;->k:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget p1, v5, La/ajl;->e:I

    .line 18
    .line 19
    sub-int p1, p5, p1

    .line 20
    .line 21
    iget p2, v5, La/ajl;->f:I

    .line 22
    .line 23
    add-int/2addr p2, p0

    .line 24
    iget-object p4, v5, La/ajl;->o:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 25
    .line 26
    move p3, p5

    .line 27
    move-object p5, v5

    .line 28
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 29
    .line 30
    .line 31
    move v0, p3

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, p5

    .line 34
    move-object p5, v5

    .line 35
    iget p1, p5, La/ajl;->c:I

    .line 36
    .line 37
    sub-int p1, v0, p1

    .line 38
    .line 39
    iget-object p4, p5, La/ajl;->l:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 40
    .line 41
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    div-int/lit8 p2, p2, 0x2

    .line 46
    .line 47
    sub-int/2addr p1, p2

    .line 48
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    add-int/2addr p2, p0

    .line 53
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    add-int/2addr p3, p1

    .line 58
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    iget-boolean p0, p5, La/ajl;->i:Z

    .line 62
    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    iget-object p4, p5, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 66
    .line 67
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    sub-int p1, v0, p0

    .line 72
    .line 73
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    sub-int p0, v2, p0

    .line 78
    .line 79
    move p3, v0

    .line 80
    move p2, v2

    .line 81
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-boolean p2, p0, La/ajl;->i:Z

    .line 6
    .line 7
    const/high16 v0, 0x40000000    # 2.0f

    .line 8
    .line 9
    iget-object v1, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget p2, p0, La/ajl;->g:I

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
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->getButtonHeight()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1, p2, v2}, Landroid/view/View;->measure(II)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-boolean p2, p0, La/ajl;->i:Z

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    iget p2, p0, La/ajl;->a:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p2, 0x0

    .line 40
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    sub-int v1, p1, v1

    .line 45
    .line 46
    sub-int/2addr v1, p2

    .line 47
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iget v1, p0, La/ajl;->d:I

    .line 52
    .line 53
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v1, p0, La/ajl;->l:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 58
    .line 59
    invoke-virtual {v1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, La/ajl;->o:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 63
    .line 64
    invoke-virtual {v1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 65
    .line 66
    .line 67
    iget p2, p0, La/ajl;->h:I

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public setAmountCurrencyMargin(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ajl;->l:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

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
    iget-object p0, p0, La/ajl;->l:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

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
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setButtonIconAutoMirrored(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

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
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

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
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

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
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

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
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

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
    iget-boolean v0, p0, La/ajl;->i:Z

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
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

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
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

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
    iput-boolean p1, p0, La/ajl;->i:Z

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
    iget-object p0, p0, La/ajl;->n:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setLabel(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, 0x7f0a0485

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->setId(I)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/ajl;->j:Ljava/lang/CharSequence;

    .line 11
    .line 12
    iget-object v0, p0, La/ajl;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/ajl;->j:Ljava/lang/CharSequence;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
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
    iget-object v1, p0, La/ajl;->l:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

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
    iget-object p1, p0, La/ajl;->o:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

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
    iput-boolean p1, p0, La/ajl;->k:Z

    .line 25
    .line 26
    return-void
.end method
