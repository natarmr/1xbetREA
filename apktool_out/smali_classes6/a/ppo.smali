.class public final La/ppo;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/uikit/components/views/LoadableImageView;

.field public final b:Landroid/widget/TextView;

.field public c:I

.field public d:La/n6l0;

.field public final e:Landroid/graphics/Paint;

.field public final f:Landroid/graphics/Paint;

.field public g:I

.field public h:I

.field public i:I

.field public final j:Landroid/graphics/RectF;

.field public final k:F


# direct methods
.method public constructor <init>(Landroid/content/Context;La/n6l0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f07067a

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, La/ppo;->c:I

    .line 19
    .line 20
    sget-object v0, La/n6l0;->a:La/n6l0;

    .line 21
    .line 22
    iput-object v0, p0, La/ppo;->d:La/n6l0;

    .line 23
    .line 24
    new-instance v0, Landroid/graphics/Paint;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const v2, 0x7f040ae1

    .line 31
    .line 32
    .line 33
    invoke-static {v2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/ppo;->e:Landroid/graphics/Paint;

    .line 41
    .line 42
    new-instance v0, Landroid/graphics/Paint;

    .line 43
    .line 44
    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const v2, 0x7f040ae7

    .line 48
    .line 49
    .line 50
    invoke-static {v2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, La/ppo;->f:Landroid/graphics/Paint;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const v2, 0x7f0706c3

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iput v0, p0, La/ppo;->g:I

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const v2, 0x7f07072d

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iput v0, p0, La/ppo;->h:I

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const v2, 0x7f070717

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iput v0, p0, La/ppo;->i:I

    .line 97
    .line 98
    new-instance v0, Landroid/graphics/RectF;

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    invoke-direct {v0, v2, v2, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, La/ppo;->j:Landroid/graphics/RectF;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const v2, 0x7f070634

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    int-to-float v0, v0

    .line 118
    iput v0, p0, La/ppo;->k:F

    .line 119
    .line 120
    new-instance v0, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    const/4 v3, 0x6

    .line 124
    const/4 v4, 0x0

    .line 125
    invoke-direct {v0, p1, v2, v3, v4}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 126
    .line 127
    .line 128
    const-string v2, "sportIconTestTag"

    .line 129
    .line 130
    invoke-virtual {v0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const/4 v2, 0x3

    .line 134
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 135
    .line 136
    .line 137
    const v3, 0x7f040b0b

    .line 138
    .line 139
    .line 140
    invoke-static {v3, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 145
    .line 146
    .line 147
    iput-object v0, p0, La/ppo;->a:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 148
    .line 149
    new-instance v3, Landroid/widget/TextView;

    .line 150
    .line 151
    invoke-direct {v3, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    const-string p1, "eventCoefTestTag"

    .line 155
    .line 156
    invoke-virtual {v3, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    const/16 p1, 0x11

    .line 160
    .line 161
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 162
    .line 163
    .line 164
    const/4 p1, 0x4

    .line 165
    invoke-virtual {v3, p1}, Landroid/view/View;->setTextAlignment(I)V

    .line 166
    .line 167
    .line 168
    const p1, 0x7f14044f

    .line 169
    .line 170
    .line 171
    invoke-static {p1, v3}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 181
    .line 182
    .line 183
    sget-object p1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 184
    .line 185
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 186
    .line 187
    .line 188
    iput-object v3, p0, La/ppo;->b:Landroid/widget/TextView;

    .line 189
    .line 190
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v4}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, p2}, La/ppo;->setStyle(La/n6l0;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ppo;->d:La/n6l0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget v0, p0, La/ppo;->k:F

    .line 18
    .line 19
    iget-object v1, p0, La/ppo;->f:Landroid/graphics/Paint;

    .line 20
    .line 21
    iget-object v2, p0, La/ppo;->j:Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-virtual {p1, v2, v0, v0, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-float v0, v0

    .line 32
    const/high16 v2, 0x40000000    # 2.0f

    .line 33
    .line 34
    div-float/2addr v0, v2

    .line 35
    iget v2, p0, La/ppo;->h:I

    .line 36
    .line 37
    int-to-float v2, v2

    .line 38
    iget v3, p0, La/ppo;->c:I

    .line 39
    .line 40
    div-int/2addr v3, v1

    .line 41
    int-to-float v1, v3

    .line 42
    add-float/2addr v2, v1

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const v3, 0x7f070660

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    int-to-float v1, v1

    .line 55
    iget-object v3, p0, La/ppo;->e:Landroid/graphics/Paint;

    .line 56
    .line 57
    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    div-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iget p2, p0, La/ppo;->c:I

    .line 8
    .line 9
    div-int/lit8 p3, p2, 0x2

    .line 10
    .line 11
    sub-int/2addr p1, p3

    .line 12
    iget p3, p0, La/ppo;->h:I

    .line 13
    .line 14
    add-int p4, p1, p2

    .line 15
    .line 16
    add-int/2addr p2, p3

    .line 17
    iget-object p5, p0, La/ppo;->a:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 18
    .line 19
    invoke-virtual {p5, p1, p3, p4, p2}, Landroid/view/View;->layout(IIII)V

    .line 20
    .line 21
    .line 22
    iget p1, p0, La/ppo;->h:I

    .line 23
    .line 24
    iget p2, p0, La/ppo;->c:I

    .line 25
    .line 26
    add-int/2addr p1, p2

    .line 27
    iget p2, p0, La/ppo;->i:I

    .line 28
    .line 29
    add-int/2addr p1, p2

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iget-object p3, p0, La/ppo;->b:Landroid/widget/TextView;

    .line 35
    .line 36
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result p4

    .line 40
    add-int/2addr p4, p1

    .line 41
    const/4 p5, 0x0

    .line 42
    invoke-virtual {p3, p5, p1, p2, p4}, Landroid/view/View;->layout(IIII)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const p2, 0x7f070717

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    int-to-float p1, p1

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    int-to-float p2, p2

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    const p4, 0x7f0706a3

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    int-to-float p3, p3

    .line 74
    iget-object p0, p0, La/ppo;->j:Landroid/graphics/RectF;

    .line 75
    .line 76
    const/4 p4, 0x0

    .line 77
    invoke-virtual {p0, p4, p1, p2, p3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 78
    .line 79
    .line 80
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
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const v0, 0x7f07066c

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    const/high16 v1, 0x40000000    # 2.0f

    .line 17
    .line 18
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/ppo;->a:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 35
    .line 36
    invoke-virtual {v2, p2, v0}, Landroid/view/View;->measure(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    sub-int p2, p1, p2

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sub-int/2addr p2, v0

    .line 50
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v1, p0, La/ppo;->b:Landroid/widget/TextView;

    .line 60
    .line 61
    invoke-virtual {v1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 62
    .line 63
    .line 64
    iget p2, p0, La/ppo;->g:I

    .line 65
    .line 66
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public setCoef(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ppo;->b:Landroid/widget/TextView;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSportIcon(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ppo;->a:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setStyle(La/n6l0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ppo;->d:La/n6l0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/16 v0, 0xc

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    const v2, 0x7f0706c3

    .line 15
    .line 16
    .line 17
    const v3, 0x7f070717

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    iget-object v5, p0, La/ppo;->b:Landroid/widget/TextView;

    .line 22
    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    const v7, 0x7f140463

    .line 27
    .line 28
    .line 29
    const v8, 0x7f07066c

    .line 30
    .line 31
    .line 32
    if-eq p1, v6, :cond_2

    .line 33
    .line 34
    const v3, 0x7f0706e2

    .line 35
    .line 36
    .line 37
    if-eq p1, v4, :cond_1

    .line 38
    .line 39
    const/4 v6, 0x3

    .line 40
    if-ne p1, v6, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, La/ppo;->g:I

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iput p1, p0, La/ppo;->c:I

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput p1, p0, La/ppo;->h:I

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iput p1, p0, La/ppo;->i:I

    .line 81
    .line 82
    invoke-static {v7, v5}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v5, v1, v0, v4, v4}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const v0, 0x7f0706c5

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iput p1, p0, La/ppo;->g:I

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    iput p1, p0, La/ppo;->c:I

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const v0, 0x7f0706ea

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    iput p1, p0, La/ppo;->h:I

    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    iput p1, p0, La/ppo;->i:I

    .line 138
    .line 139
    const p0, 0x7f140469

    .line 140
    .line 141
    .line 142
    invoke-static {p0, v5}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 143
    .line 144
    .line 145
    const/16 p0, 0xa

    .line 146
    .line 147
    invoke-static {v5, v1, p0, v4, v4}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const v2, 0x7f07071c

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    iput p1, p0, La/ppo;->g:I

    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    iput p1, p0, La/ppo;->c:I

    .line 173
    .line 174
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    iput p1, p0, La/ppo;->h:I

    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    iput p1, p0, La/ppo;->i:I

    .line 193
    .line 194
    invoke-static {v7, v5}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v5, v1, v0, v4, v4}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    iput p1, p0, La/ppo;->g:I

    .line 210
    .line 211
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    const v2, 0x7f07067a

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    iput p1, p0, La/ppo;->c:I

    .line 223
    .line 224
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    const v2, 0x7f07072d

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    iput p1, p0, La/ppo;->h:I

    .line 236
    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    iput p1, p0, La/ppo;->i:I

    .line 246
    .line 247
    const p0, 0x7f14044f

    .line 248
    .line 249
    .line 250
    invoke-static {p0, v5}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v5, v1, v0, v4, v4}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 254
    .line 255
    .line 256
    return-void
.end method
