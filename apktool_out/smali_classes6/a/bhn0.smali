.class public final La/bhn0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:La/n0o0;

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
    iput v0, p0, La/bhn0;->a:I

    .line 21
    .line 22
    new-instance v0, La/hrf0;

    .line 23
    .line 24
    const/16 v1, 0x12

    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/bhn0;->b:La/n0o0;

    .line 34
    .line 35
    new-instance v0, La/hrf0;

    .line 36
    .line 37
    const/16 v1, 0x13

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
    iput-object v0, p0, La/bhn0;->c:La/n0o0;

    .line 47
    .line 48
    new-instance v0, La/hrf0;

    .line 49
    .line 50
    const/16 v1, 0x14

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
    iput-object v0, p0, La/bhn0;->d:La/n0o0;

    .line 60
    .line 61
    new-instance v0, La/hrf0;

    .line 62
    .line 63
    const/16 v1, 0x15

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
    move-result-object p1

    .line 72
    iput-object p1, p0, La/bhn0;->e:La/n0o0;

    .line 73
    .line 74
    invoke-direct {p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0}, La/bhn0;->getBetType()Landroid/widget/TextView;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, La/bhn0;->getBetNumber()Landroid/widget/TextView;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    invoke-direct {p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method private final getBetNumber()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/bhn0;->d:La/n0o0;

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
    iget-object p0, p0, La/bhn0;->c:La/n0o0;

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
    iget-object p0, p0, La/bhn0;->b:La/n0o0;

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

.method private final getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;
    .locals 0

    .line 1
    iget-object p0, p0, La/bhn0;->e:La/n0o0;

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
    invoke-direct {p0}, La/bhn0;->getBetType()Landroid/widget/TextView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, La/bhn0;->getBetNumber()Landroid/widget/TextView;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1, p3}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

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
    const/4 v0, 0x6

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
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct/range {p0 .. p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sub-int v1, v0, v1

    .line 14
    .line 15
    div-int/lit8 v3, v1, 0x2

    .line 16
    .line 17
    invoke-direct/range {p0 .. p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-int v1, v0, v1

    .line 26
    .line 27
    div-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    invoke-direct/range {p0 .. p0}, La/bhn0;->getBetType()Landroid/widget/TextView;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-direct/range {p0 .. p0}, La/bhn0;->getBetNumber()Landroid/widget/TextView;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    add-int v8, v4, v2

    .line 46
    .line 47
    sub-int/2addr v0, v8

    .line 48
    div-int/lit8 v10, v0, 0x2

    .line 49
    .line 50
    invoke-direct/range {p0 .. p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

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
    add-int v5, v0, v3

    .line 59
    .line 60
    invoke-direct/range {p0 .. p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-direct/range {p0 .. p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v2, 0x0

    .line 73
    move-object/from16 v7, p0

    .line 74
    .line 75
    invoke-static/range {v2 .. v7}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 76
    .line 77
    .line 78
    invoke-direct/range {p0 .. p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 83
    .line 84
    .line 85
    invoke-direct/range {p0 .. p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

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
    add-int/2addr v0, v1

    .line 94
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-nez v3, :cond_0

    .line 99
    .line 100
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-direct/range {p0 .. p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

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
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-nez v3, :cond_1

    .line 118
    .line 119
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    goto :goto_0

    .line 124
    :cond_1
    invoke-direct/range {p0 .. p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    :goto_0
    invoke-direct/range {p0 .. p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-virtual {v4, v2, v1, v3, v0}, Landroid/view/View;->layout(IIII)V

    .line 137
    .line 138
    .line 139
    invoke-direct/range {p0 .. p0}, La/bhn0;->getBetType()Landroid/widget/TextView;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    add-int v12, v0, v10

    .line 148
    .line 149
    invoke-direct/range {p0 .. p0}, La/bhn0;->getBetType()Landroid/widget/TextView;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    invoke-direct/range {p0 .. p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    move-object/from16 v14, p0

    .line 162
    .line 163
    iget v1, v14, La/bhn0;->a:I

    .line 164
    .line 165
    add-int v9, v0, v1

    .line 166
    .line 167
    invoke-direct {v14}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    add-int/2addr v0, v1

    .line 176
    invoke-direct {v14}, La/bhn0;->getBetType()Landroid/widget/TextView;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    add-int v11, v2, v0

    .line 185
    .line 186
    invoke-static/range {v9 .. v14}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 187
    .line 188
    .line 189
    invoke-direct/range {p0 .. p0}, La/bhn0;->getBetType()Landroid/widget/TextView;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    add-int v12, v0, v10

    .line 198
    .line 199
    add-int v14, v10, v8

    .line 200
    .line 201
    invoke-direct/range {p0 .. p0}, La/bhn0;->getBetNumber()Landroid/widget/TextView;

    .line 202
    .line 203
    .line 204
    move-result-object v15

    .line 205
    invoke-direct/range {p0 .. p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    add-int v11, v0, v1

    .line 214
    .line 215
    invoke-direct/range {p0 .. p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    add-int/2addr v0, v1

    .line 224
    invoke-direct/range {p0 .. p0}, La/bhn0;->getBetNumber()Landroid/widget/TextView;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    add-int v13, v1, v0

    .line 233
    .line 234
    move-object/from16 v16, p0

    .line 235
    .line 236
    invoke-static/range {v11 .. v16}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 237
    .line 238
    .line 239
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

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
    invoke-direct {p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

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
    invoke-direct {p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

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
    iget v3, p0, La/bhn0;->a:I

    .line 40
    .line 41
    sub-int/2addr v1, v3

    .line 42
    invoke-direct {p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

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
    if-gez v1, :cond_0

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    :cond_0
    invoke-direct {p0}, La/bhn0;->getBetType()Landroid/widget/TextView;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-virtual {v3, v4, p2}, Landroid/view/View;->measure(II)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, La/bhn0;->getBetNumber()Landroid/widget/TextView;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {v3, v1, p2}, Landroid/view/View;->measure(II)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, La/bhn0;->getBetType()Landroid/widget/TextView;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-direct {p0}, La/bhn0;->getBetNumber()Landroid/widget/TextView;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    add-int/2addr v2, v1

    .line 94
    invoke-direct {p0}, La/bhn0;->getCouponImage()Landroid/widget/ImageView;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-direct {p0}, La/bhn0;->getShareButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 127
    .line 128
    .line 129
    return-void
.end method
