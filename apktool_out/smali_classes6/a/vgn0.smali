.class public final La/vgn0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:La/n0o0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f070717

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, La/vgn0;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const v1, 0x7f07072d

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, La/vgn0;->b:I

    .line 34
    .line 35
    new-instance v0, La/hrf0;

    .line 36
    .line 37
    const/4 v1, 0x6

    .line 38
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, La/vgn0;->c:La/n0o0;

    .line 46
    .line 47
    new-instance v0, La/hrf0;

    .line 48
    .line 49
    const/4 v1, 0x7

    .line 50
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/vgn0;->d:La/n0o0;

    .line 58
    .line 59
    new-instance v0, La/hrf0;

    .line 60
    .line 61
    const/16 v1, 0x8

    .line 62
    .line 63
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, La/vgn0;->e:La/n0o0;

    .line 71
    .line 72
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method private final getBetNumber()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/vgn0;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getBetType()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/vgn0;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getCouponImage()Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, La/vgn0;->d:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-direct {p0}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    sub-int p2, p1, p2

    .line 42
    .line 43
    div-int/lit8 v1, p2, 0x2

    .line 44
    .line 45
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    sub-int p2, p1, p2

    .line 54
    .line 55
    div-int/lit8 p2, p2, 0x2

    .line 56
    .line 57
    invoke-direct {p0}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    sub-int/2addr p1, p3

    .line 66
    div-int/lit8 p1, p1, 0x2

    .line 67
    .line 68
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    add-int/2addr p3, p2

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 78
    .line 79
    .line 80
    move-result p4

    .line 81
    const/4 p5, 0x0

    .line 82
    if-nez p4, :cond_0

    .line 83
    .line 84
    move p4, p5

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 87
    .line 88
    .line 89
    move-result p4

    .line 90
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    sub-int/2addr p4, v0

    .line 99
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_1

    .line 104
    .line 105
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    goto :goto_1

    .line 114
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    :goto_1
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2, p4, p2, v0, p3}, Landroid/view/View;->layout(IIII)V

    .line 123
    .line 124
    .line 125
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2, p5}, Landroid/view/View;->setLayoutDirection(I)V

    .line 130
    .line 131
    .line 132
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    add-int v3, p2, v1

    .line 141
    .line 142
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    iget p3, p0, La/vgn0;->a:I

    .line 155
    .line 156
    add-int v0, p2, p3

    .line 157
    .line 158
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    add-int/2addr p2, p3

    .line 167
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 168
    .line 169
    .line 170
    move-result-object p4

    .line 171
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 172
    .line 173
    .line 174
    move-result p4

    .line 175
    add-int v2, p4, p2

    .line 176
    .line 177
    move-object v5, p0

    .line 178
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 179
    .line 180
    .line 181
    invoke-direct {v5}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    add-int/2addr p0, p1

    .line 190
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    if-nez p2, :cond_2

    .line 195
    .line 196
    invoke-direct {v5}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    add-int/2addr p2, p3

    .line 205
    invoke-direct {v5}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 206
    .line 207
    .line 208
    move-result-object p3

    .line 209
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 210
    .line 211
    .line 212
    move-result p3

    .line 213
    add-int/2addr p3, p2

    .line 214
    iget p2, v5, La/vgn0;->b:I

    .line 215
    .line 216
    add-int/2addr p3, p2

    .line 217
    goto :goto_2

    .line 218
    :cond_2
    move p3, p5

    .line 219
    :goto_2
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    if-nez p2, :cond_3

    .line 224
    .line 225
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    goto :goto_3

    .line 230
    :cond_3
    invoke-direct {v5}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    :goto_3
    invoke-direct {v5}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 239
    .line 240
    .line 241
    move-result-object p4

    .line 242
    invoke-virtual {p4, p3, p1, p2, p0}, Landroid/view/View;->layout(IIII)V

    .line 243
    .line 244
    .line 245
    invoke-direct {v5}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-virtual {p0, p5}, Landroid/view/View;->setLayoutDirection(I)V

    .line 250
    .line 251
    .line 252
    return-void
.end method

.method public final onMeasure(II)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v1, v0

    .line 6
    const-wide v3, 0x3fe3333333333333L    # 0.6

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    mul-double/2addr v1, v3

    .line 12
    double-to-int v1, v1

    .line 13
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/high16 v3, -0x80000000

    .line 18
    .line 19
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v2, v4, p2}, Landroid/view/View;->measure(II)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v2, v4, p2}, Landroid/view/View;->measure(II)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    iget v4, p0, La/vgn0;->a:I

    .line 46
    .line 47
    add-int/2addr v2, v4

    .line 48
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    add-int/2addr v5, v2

    .line 57
    if-le v5, v1, :cond_0

    .line 58
    .line 59
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    sub-int/2addr v1, v2

    .line 68
    sub-int/2addr v1, v4

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    :goto_0
    const/4 v2, 0x0

    .line 79
    if-gez v1, :cond_1

    .line 80
    .line 81
    move v1, v2

    .line 82
    :cond_1
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    invoke-virtual {v5, v6, p2}, Landroid/view/View;->measure(II)V

    .line 91
    .line 92
    .line 93
    sub-int v1, v0, v1

    .line 94
    .line 95
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    sub-int/2addr v1, v5

    .line 104
    sub-int/2addr v1, v4

    .line 105
    iget v4, p0, La/vgn0;->b:I

    .line 106
    .line 107
    sub-int/2addr v1, v4

    .line 108
    invoke-direct {p0}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    if-gez v1, :cond_2

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    move v2, v1

    .line 116
    :goto_1
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {v4, v1, p2}, Landroid/view/View;->measure(II)V

    .line 121
    .line 122
    .line 123
    invoke-direct {p0}, La/vgn0;->getBetType()Landroid/widget/TextView;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-direct {p0}, La/vgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    invoke-direct {p0}, La/vgn0;->getBetNumber()Landroid/widget/TextView;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 164
    .line 165
    .line 166
    return-void
.end method
