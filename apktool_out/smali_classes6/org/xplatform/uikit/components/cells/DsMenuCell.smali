.class public final Lorg/xplatform/uikit/components/cells/DsMenuCell;
.super La/tw5;
.source "SourceFile"


# static fields
.field public static final synthetic g1:I


# instance fields
.field public final A:La/a8z;

.field public final B:I

.field public final f1:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/cells/DsMenuCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/cells/DsMenuCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p3, 0x7f040144

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, La/tw5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/ryl;

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    invoke-direct {v1, p1, v2}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 20
    .line 21
    .line 22
    sget-object v2, La/wez;->b:La/wez;

    .line 23
    .line 24
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Lorg/xplatform/uikit/components/cells/DsMenuCell;->A:La/a8z;

    .line 29
    .line 30
    sget-object v1, La/bqd0;->T:[I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    iput p2, p0, Lorg/xplatform/uikit/components/cells/DsMenuCell;->B:I

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iput p2, p0, Lorg/xplatform/uikit/components/cells/DsMenuCell;->f1:I

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method private final getLoadingPlaceholder()Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/DsMenuCell;->A:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

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
.method public final onFinishInflate()V
    .locals 11

    .line 1
    invoke-super {p0}, La/tw5;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/tw5;->getCellRightView()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    const/4 v9, 0x2

    .line 9
    if-eqz v8, :cond_4

    .line 10
    .line 11
    instance-of v0, v8, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    move-object v10, v8

    .line 16
    check-cast v10, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 17
    .line 18
    iget-boolean v0, v10, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->k:Z

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v10}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget v0, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 32
    .line 33
    const/16 v2, 0x177

    .line 34
    .line 35
    if-le v0, v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance v0, La/ndm;

    .line 39
    .line 40
    const/16 v2, 0xf

    .line 41
    .line 42
    invoke-direct {v0, v2}, La/ndm;-><init>(B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v10, v0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->setOnLoading$uikit(Lkotlin/jvm/functions/Function0;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, La/aim;

    .line 49
    .line 50
    const/4 v2, 0x3

    .line 51
    invoke-direct {v0, v2}, La/aim;-><init>(B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v10, v0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->setOnLoaded$uikit(Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, La/ndm;

    .line 58
    .line 59
    const/16 v2, 0x10

    .line 60
    .line 61
    invoke-direct {v0, v2}, La/ndm;-><init>(B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v10, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setUpdateAfterSetResource(Lkotlin/jvm/functions/Function0;)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x8

    .line 68
    .line 69
    invoke-virtual {v10, v0}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, La/tw5;->getCellMiddleView()Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    check-cast v2, La/a3e;

    .line 85
    .line 86
    iput v1, v2, La/a3e;->v:I

    .line 87
    .line 88
    const/4 v3, -0x1

    .line 89
    iput v3, v2, La/a3e;->u:I

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    const-string v0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    .line 102
    .line 103
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_2
    :goto_0
    invoke-virtual {v10, v1}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    new-instance v0, La/wej;

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    const/16 v7, 0xa

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    const-class v3, Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 117
    .line 118
    const-string v4, "onLoading"

    .line 119
    .line 120
    const-string v5, "onLoading()V"

    .line 121
    .line 122
    move-object v2, p0

    .line 123
    invoke-direct/range {v0 .. v7}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10, v0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->setOnLoading$uikit(Lkotlin/jvm/functions/Function0;)V

    .line 127
    .line 128
    .line 129
    new-instance v0, La/k0l;

    .line 130
    .line 131
    const/16 v7, 0x14

    .line 132
    .line 133
    const/4 v1, 0x1

    .line 134
    const-string v4, "onLoaded"

    .line 135
    .line 136
    const-string v5, "onLoaded(Landroid/graphics/drawable/Drawable;)Z"

    .line 137
    .line 138
    invoke-direct/range {v0 .. v7}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v10, v0}, Lorg/xplatform/uikit/components/views/LoadableImageView;->setOnLoaded$uikit(Lkotlin/jvm/functions/Function1;)V

    .line 142
    .line 143
    .line 144
    new-instance v0, La/lrk;

    .line 145
    .line 146
    const/16 v1, 0x1c

    .line 147
    .line 148
    invoke-direct {v0, p0, v10, v1}, La/lrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v10, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setUpdateAfterSetResource(Lkotlin/jvm/functions/Function0;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v10}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/DsMenuCell;->x(Landroid/graphics/drawable/Drawable;)V

    .line 159
    .line 160
    .line 161
    :cond_3
    :goto_1
    instance-of v0, v8, La/jab;

    .line 162
    .line 163
    if-eqz v0, :cond_4

    .line 164
    .line 165
    check-cast v8, La/jab;

    .line 166
    .line 167
    invoke-interface {v8, v9}, La/jab;->setLabelMaxLines(I)V

    .line 168
    .line 169
    .line 170
    :cond_4
    invoke-virtual {p0}, La/tw5;->getCellMiddleView()Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    instance-of v1, v0, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 175
    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    check-cast v0, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    const/4 v0, 0x0

    .line 182
    :goto_2
    if-eqz v0, :cond_8

    .line 183
    .line 184
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->getSubtitle()Ljava/lang/CharSequence;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-eqz v1, :cond_7

    .line 189
    .line 190
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-nez v1, :cond_6

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_6
    const/4 v9, 0x1

    .line 198
    :cond_7
    :goto_3
    invoke-virtual {v0, v9}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitleMaxLines(I)V

    .line 199
    .line 200
    .line 201
    iget v1, p0, Lorg/xplatform/uikit/components/cells/DsMenuCell;->f1:I

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleMaxLines(I)V

    .line 204
    .line 205
    .line 206
    new-instance v1, La/qkm;

    .line 207
    .line 208
    invoke-direct {v1, v0}, La/qkm;-><init>(Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleTextChangeListener$uikit(Landroid/text/TextWatcher;)V

    .line 212
    .line 213
    .line 214
    :cond_8
    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, La/tw5;->getCellLeftView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of p1, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    check-cast p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    if-eqz p0, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->k:La/if5;

    .line 31
    .line 32
    invoke-virtual {p0}, La/if5;->k()V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    :cond_2
    new-instance p1, La/w23;

    .line 37
    .line 38
    const/4 v0, 0x7

    .line 39
    invoke-direct {p1, p0, v0}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final v(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/cells/DsMenuCell;->getLoadingPlaceholder()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/tw5;->getCellLeftView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, La/tw5;->getCellMiddleView()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, La/tw5;->getCellRightView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/DsMenuCell;->x(Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x7

    .line 40
    invoke-static {p1, v1, v1, v0}, La/hic;->D(Landroid/graphics/drawable/Drawable;III)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/lit8 v1, v1, -0x1

    .line 56
    .line 57
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    div-int/lit8 p1, p1, 0x2

    .line 62
    .line 63
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {p0, p1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final w()V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/tw5;->getCellLeftView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, La/tw5;->getCellMiddleView()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0}, La/tw5;->getCellRightView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const v1, 0x7f0706a9

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-direct {p0}, Lorg/xplatform/uikit/components/cells/DsMenuCell;->getLoadingPlaceholder()Landroid/widget/ImageView;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v2, La/a3e;

    .line 46
    .line 47
    invoke-direct {v2, v0, v0}, La/a3e;-><init>(II)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    iput v0, v2, La/a3e;->i:I

    .line 52
    .line 53
    iput v0, v2, La/a3e;->l:I

    .line 54
    .line 55
    iput v0, v2, La/a3e;->t:I

    .line 56
    .line 57
    iput v0, v2, La/a3e;->v:I

    .line 58
    .line 59
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final x(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/tw5;->getCellMiddleView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    check-cast v1, La/a3e;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    iput v2, v1, La/a3e;->v:I

    .line 17
    .line 18
    const/4 v3, -0x1

    .line 19
    iput v3, v1, La/a3e;->u:I

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_2

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move p1, v2

    .line 35
    :goto_0
    if-lez p1, :cond_1

    .line 36
    .line 37
    iget v2, p0, Lorg/xplatform/uikit/components/cells/DsMenuCell;->B:I

    .line 38
    .line 39
    :cond_1
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    const-string p0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    .line 50
    .line 51
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    return-void
.end method
