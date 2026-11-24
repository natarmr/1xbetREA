.class public final La/zgn0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:La/n0o0;

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
    const v1, 0x7f07072d

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, La/zgn0;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const v1, 0x7f0706e1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, La/zgn0;->b:I

    .line 34
    .line 35
    new-instance v0, La/hrf0;

    .line 36
    .line 37
    const/16 v1, 0xd

    .line 38
    .line 39
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/zgn0;->c:La/n0o0;

    .line 47
    .line 48
    new-instance v0, La/hrf0;

    .line 49
    .line 50
    const/16 v1, 0xe

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
    iput-object v0, p0, La/zgn0;->d:La/n0o0;

    .line 60
    .line 61
    new-instance v0, La/hrf0;

    .line 62
    .line 63
    const/16 v1, 0xf

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
    iput-object v0, p0, La/zgn0;->e:La/n0o0;

    .line 73
    .line 74
    new-instance v0, La/hrf0;

    .line 75
    .line 76
    const/16 v1, 0x10

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
    iput-object v0, p0, La/zgn0;->f:La/n0o0;

    .line 86
    .line 87
    new-instance v0, La/hrf0;

    .line 88
    .line 89
    const/16 v1, 0x11

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
    iput-object p1, p0, La/zgn0;->g:La/n0o0;

    .line 99
    .line 100
    invoke-direct {p0}, La/zgn0;->getBetType()Landroid/widget/TextView;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0}, La/zgn0;->getBetNumber()Landroid/widget/TextView;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p0}, La/zgn0;->getSeparator()Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method private final getBetNumber()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/zgn0;->e:La/n0o0;

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
    iget-object p0, p0, La/zgn0;->c:La/n0o0;

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
    iget-object p0, p0, La/zgn0;->d:La/n0o0;

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
    iget-object p0, p0, La/zgn0;->g:La/n0o0;

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

.method private final getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;
    .locals 0

    .line 1
    iget-object p0, p0, La/zgn0;->f:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/zgn0;->getBetType()Landroid/widget/TextView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, La/zgn0;->getBetNumber()Landroid/widget/TextView;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1, p3}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object p2, La/ymx;->h:La/ymx;

    .line 30
    .line 31
    new-instance p3, La/vpj0;

    .line 32
    .line 33
    const/4 v0, 0x5

    .line 34
    invoke-direct {p3, p4, v0}, La/vpj0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2, p3}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    sub-int p2, p1, p2

    .line 14
    .line 15
    div-int/lit8 v1, p2, 0x2

    .line 16
    .line 17
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    sub-int p2, p1, p2

    .line 26
    .line 27
    div-int/lit8 p2, p2, 0x2

    .line 28
    .line 29
    invoke-direct {p0}, La/zgn0;->getBetType()Landroid/widget/TextView;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    invoke-direct {p0}, La/zgn0;->getBetNumber()Landroid/widget/TextView;

    .line 38
    .line 39
    .line 40
    move-result-object p4

    .line 41
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    add-int/2addr p4, p3

    .line 46
    sub-int p3, p1, p4

    .line 47
    .line 48
    div-int/lit8 p3, p3, 0x2

    .line 49
    .line 50
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int v3, v0, v1

    .line 59
    .line 60
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    const/4 v0, 0x0

    .line 73
    move-object v5, p0

    .line 74
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const/4 v1, 0x0

    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    add-int/2addr v0, p2

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_0

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    sub-int/2addr v2, v3

    .line 113
    goto :goto_0

    .line 114
    :cond_0
    move v2, v1

    .line 115
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_1

    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    goto :goto_1

    .line 126
    :cond_1
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    :goto_1
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v4, v2, p2, v3, v0}, Landroid/view/View;->layout(IIII)V

    .line 139
    .line 140
    .line 141
    invoke-direct {p0}, La/zgn0;->getBetType()Landroid/widget/TextView;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    add-int v5, p2, p3

    .line 150
    .line 151
    invoke-direct {p0}, La/zgn0;->getBetType()Landroid/widget/TextView;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 160
    .line 161
    .line 162
    move-result p2

    .line 163
    iget v0, p0, La/zgn0;->a:I

    .line 164
    .line 165
    add-int v2, p2, v0

    .line 166
    .line 167
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    add-int/2addr p2, v0

    .line 176
    invoke-direct {p0}, La/zgn0;->getBetType()Landroid/widget/TextView;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    add-int v4, v3, p2

    .line 185
    .line 186
    move-object v7, p0

    .line 187
    move v3, p3

    .line 188
    invoke-static/range {v2 .. v7}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 189
    .line 190
    .line 191
    invoke-direct {p0}, La/zgn0;->getBetType()Landroid/widget/TextView;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    add-int v6, p2, v3

    .line 200
    .line 201
    add-int v8, v3, p4

    .line 202
    .line 203
    invoke-direct {p0}, La/zgn0;->getBetNumber()Landroid/widget/TextView;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    add-int v5, p2, v0

    .line 216
    .line 217
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    add-int/2addr p2, v0

    .line 226
    invoke-direct {p0}, La/zgn0;->getBetNumber()Landroid/widget/TextView;

    .line 227
    .line 228
    .line 229
    move-result-object p3

    .line 230
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 231
    .line 232
    .line 233
    move-result p3

    .line 234
    add-int v7, p3, p2

    .line 235
    .line 236
    move-object v10, p0

    .line 237
    invoke-static/range {v5 .. v10}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 238
    .line 239
    .line 240
    invoke-direct {p0}, La/zgn0;->getBetNumber()Landroid/widget/TextView;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-virtual {p2, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 245
    .line 246
    .line 247
    invoke-direct {p0}, La/zgn0;->getSeparator()Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    add-int v6, p1, v0

    .line 252
    .line 253
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    iget p1, p0, La/zgn0;->b:I

    .line 258
    .line 259
    add-int v8, v6, p1

    .line 260
    .line 261
    const/4 v5, 0x0

    .line 262
    invoke-static/range {v5 .. v10}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 263
    .line 264
    .line 265
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
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {v1, v3, p2}, Landroid/view/View;->measure(II)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {v1, v3, p2}, Landroid/view/View;->measure(II)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    sub-int v1, v0, v1

    .line 38
    .line 39
    iget v3, p0, La/zgn0;->a:I

    .line 40
    .line 41
    sub-int/2addr v1, v3

    .line 42
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    sub-int/2addr v1, v4

    .line 51
    sub-int/2addr v1, v3

    .line 52
    const/4 v4, 0x0

    .line 53
    if-gez v1, :cond_0

    .line 54
    .line 55
    move v1, v4

    .line 56
    :cond_0
    invoke-direct {p0}, La/zgn0;->getBetType()Landroid/widget/TextView;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual {v5, v6, p2}, Landroid/view/View;->measure(II)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, La/zgn0;->getBetNumber()Landroid/widget/TextView;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v5, v1, p2}, Landroid/view/View;->measure(II)V

    .line 76
    .line 77
    .line 78
    invoke-direct {p0}, La/zgn0;->getSeparator()Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-gez v0, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v4, v0

    .line 86
    :goto_0
    invoke-static {v4, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {v1, v2, p2}, Landroid/view/View;->measure(II)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p0}, La/zgn0;->getBetType()Landroid/widget/TextView;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-direct {p0}, La/zgn0;->getBetNumber()Landroid/widget/TextView;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    add-int/2addr v2, v1

    .line 110
    invoke-direct {p0}, La/zgn0;->getCouponImage()Landroid/widget/ImageView;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-direct {p0}, La/zgn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    add-int/2addr v1, v3

    .line 135
    iget v2, p0, La/zgn0;->b:I

    .line 136
    .line 137
    add-int/2addr v1, v2

    .line 138
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
