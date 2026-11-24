.class public final La/ygn0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;


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
    iput v0, p0, La/ygn0;->a:I

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
    iput v0, p0, La/ygn0;->b:I

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const v1, 0x7f0706e1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, p0, La/ygn0;->c:I

    .line 47
    .line 48
    new-instance v0, La/hrf0;

    .line 49
    .line 50
    const/16 v1, 0x9

    .line 51
    .line 52
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, La/ygn0;->d:La/n0o0;

    .line 60
    .line 61
    new-instance v0, La/hrf0;

    .line 62
    .line 63
    const/16 v1, 0xa

    .line 64
    .line 65
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/ygn0;->e:La/n0o0;

    .line 73
    .line 74
    new-instance v0, La/hrf0;

    .line 75
    .line 76
    const/16 v1, 0xb

    .line 77
    .line 78
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/ygn0;->f:La/n0o0;

    .line 86
    .line 87
    new-instance v0, La/hrf0;

    .line 88
    .line 89
    const/16 v1, 0xc

    .line 90
    .line 91
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, La/ygn0;->g:La/n0o0;

    .line 99
    .line 100
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {p0}, La/ygn0;->getSeparator()Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method private final getBetNumber()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/ygn0;->f:La/n0o0;

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
    iget-object p0, p0, La/ygn0;->d:La/n0o0;

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
    iget-object p0, p0, La/ygn0;->e:La/n0o0;

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

.method private final getSeparator()Lorg/xplatform/uikit/components/separator/DsSeparator;
    .locals 0

    .line 1
    iget-object p0, p0, La/ygn0;->g:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

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
    .locals 11

    .line 1
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    sub-int v0, v6, v0

    .line 42
    .line 43
    div-int/lit8 v1, v0, 0x2

    .line 44
    .line 45
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    sub-int v0, v6, v0

    .line 54
    .line 55
    div-int/lit8 v0, v0, 0x2

    .line 56
    .line 57
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    sub-int v2, v6, v2

    .line 66
    .line 67
    div-int/lit8 v7, v2, 0x2

    .line 68
    .line 69
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    add-int/2addr v2, v0

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    const/4 v8, 0x0

    .line 83
    if-nez v3, :cond_0

    .line 84
    .line 85
    move v3, v8

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    sub-int/2addr v3, v4

    .line 100
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_1

    .line 105
    .line 106
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    goto :goto_1

    .line 115
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    :goto_1
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    invoke-virtual {v9, v3, v0, v4, v2}, Landroid/view/View;->layout(IIII)V

    .line 124
    .line 125
    .line 126
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0, v8}, Landroid/view/View;->setLayoutDirection(I)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    add-int v3, v0, v1

    .line 142
    .line 143
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    iget v9, p0, La/ygn0;->a:I

    .line 156
    .line 157
    add-int/2addr v0, v9

    .line 158
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    add-int/2addr v2, v9

    .line 167
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    add-int/2addr v2, v10

    .line 176
    move-object v5, p0

    .line 177
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 178
    .line 179
    .line 180
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    add-int/2addr v0, v7

    .line 189
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    iget v2, p0, La/ygn0;->b:I

    .line 194
    .line 195
    if-nez v1, :cond_2

    .line 196
    .line 197
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    add-int/2addr v1, v9

    .line 206
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    add-int/2addr v3, v1

    .line 215
    add-int/2addr v3, v2

    .line 216
    goto :goto_2

    .line 217
    :cond_2
    move v3, v8

    .line 218
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-nez v1, :cond_3

    .line 223
    .line 224
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    goto :goto_3

    .line 229
    :cond_3
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    :goto_3
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-virtual {v4, v3, v7, v1, v0}, Landroid/view/View;->layout(IIII)V

    .line 242
    .line 243
    .line 244
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v0, v8}, Landroid/view/View;->setLayoutDirection(I)V

    .line 249
    .line 250
    .line 251
    invoke-direct {p0}, La/ygn0;->getSeparator()Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    add-int v1, v6, v2

    .line 256
    .line 257
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    iget v0, p0, La/ygn0;->c:I

    .line 262
    .line 263
    add-int v3, v1, v0

    .line 264
    .line 265
    const/4 v0, 0x0

    .line 266
    move-object v5, p0

    .line 267
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 268
    .line 269
    .line 270
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
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

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
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

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
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

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
    iget v4, p0, La/ygn0;->a:I

    .line 46
    .line 47
    add-int/2addr v2, v4

    .line 48
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

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
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

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
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

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
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

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
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

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
    iget v4, p0, La/ygn0;->b:I

    .line 106
    .line 107
    sub-int/2addr v1, v4

    .line 108
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    if-gez v1, :cond_2

    .line 113
    .line 114
    move v1, v2

    .line 115
    :cond_2
    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v5, v1, p2}, Landroid/view/View;->measure(II)V

    .line 120
    .line 121
    .line 122
    invoke-direct {p0}, La/ygn0;->getSeparator()Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    if-gez v0, :cond_3

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    move v2, v0

    .line 130
    :goto_1
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-virtual {v1, v2, p2}, Landroid/view/View;->measure(II)V

    .line 135
    .line 136
    .line 137
    invoke-direct {p0}, La/ygn0;->getBetType()Landroid/widget/TextView;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-direct {p0}, La/ygn0;->getCouponImage()Landroid/widget/ImageView;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-direct {p0}, La/ygn0;->getBetNumber()Landroid/widget/TextView;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    add-int/2addr v1, v4

    .line 170
    iget v2, p0, La/ygn0;->c:I

    .line 171
    .line 172
    add-int/2addr v1, v2

    .line 173
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 182
    .line 183
    .line 184
    return-void
.end method
