.class public final Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field public static final synthetic k:I


# instance fields
.field public final a:La/a8z;

.field public b:La/evo0;

.field public c:Ljava/util/List;

.field public final d:S

.field public final e:Landroid/view/animation/PathInterpolator;

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Landroid/widget/LinearLayout$LayoutParams;

.field public final j:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wez;->b:La/wez;

    .line 15
    .line 16
    new-instance v2, La/ywm0;

    .line 17
    .line 18
    const/4 v3, 0x7

    .line 19
    invoke-direct {v2, p0, p0, v3}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->a:La/a8z;

    .line 27
    .line 28
    sget-object v1, La/evo0;->a:La/evo0;

    .line 29
    .line 30
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->b:La/evo0;

    .line 31
    .line 32
    sget-object v1, La/iun;->a:La/iun;

    .line 33
    .line 34
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->c:Ljava/util/List;

    .line 35
    .line 36
    const/16 v1, 0x190

    .line 37
    .line 38
    iput-short v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->d:S

    .line 39
    .line 40
    new-instance v1, Landroid/view/animation/PathInterpolator;

    .line 41
    .line 42
    const v2, 0x3f147ae1    # 0.58f

    .line 43
    .line 44
    .line 45
    const/high16 v3, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-direct {v1, v4, v4, v2, v3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->e:Landroid/view/animation/PathInterpolator;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const v2, 0x7f0705c6

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    iput v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->f:I

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const v2, 0x7f07064b

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const v3, 0x7f070717

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const v4, 0x7f07072d

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    iput v3, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->g:I

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    const v4, 0x7f0706ea

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    iput v3, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->h:I

    .line 113
    .line 114
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 115
    .line 116
    const/4 v4, -0x1

    .line 117
    invoke-direct {v3, v4, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 118
    .line 119
    .line 120
    iput v2, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 121
    .line 122
    iput-object v3, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->i:Landroid/widget/LinearLayout$LayoutParams;

    .line 123
    .line 124
    new-instance v1, Ljava/util/ArrayList;

    .line 125
    .line 126
    const/4 v2, 0x4

    .line 127
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    .line 129
    .line 130
    move v3, p3

    .line 131
    :goto_0
    if-ge v3, v2, :cond_1

    .line 132
    .line 133
    new-instance v5, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    const/4 v7, 0x6

    .line 143
    invoke-direct {v5, v6, v0, v7}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 144
    .line 145
    .line 146
    iget-object v6, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->i:Landroid/widget/LinearLayout$LayoutParams;

    .line 147
    .line 148
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 149
    .line 150
    .line 151
    iget v6, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->f:I

    .line 152
    .line 153
    invoke-static {v5, v6}, La/hxm0;->x(Landroid/view/View;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    add-int/lit8 v3, v3, 0x1

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_1
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->j:Ljava/util/ArrayList;

    .line 163
    .line 164
    const v0, 0x7f0802cd

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 172
    .line 173
    .line 174
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 175
    .line 176
    const v0, 0x7f040ae1

    .line 177
    .line 178
    .line 179
    invoke-static {p1, v0, v0}, La/j5d;->d(Landroid/content/Context;II)Landroid/content/res/ColorStateList;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {p0, v0}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 184
    .line 185
    .line 186
    const/4 v0, 0x1

    .line 187
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 188
    .line 189
    .line 190
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 191
    .line 192
    const/4 v1, -0x2

    .line 193
    invoke-direct {v0, v4, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 194
    .line 195
    .line 196
    iget v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->h:I

    .line 197
    .line 198
    iget v2, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->g:I

    .line 199
    .line 200
    invoke-virtual {p0, v1, v2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 204
    .line 205
    .line 206
    sget-object v0, La/aqd0;->x:[I

    .line 207
    .line 208
    invoke-virtual {p1, p2, v0, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1, p3, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    if-eqz p2, :cond_2

    .line 217
    .line 218
    invoke-virtual {p0, p2}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->setHeaderIcon(I)V

    .line 219
    .line 220
    .line 221
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 222
    .line 223
    .line 224
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget-object p1, p1, La/fvo0;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 229
    .line 230
    new-instance p2, La/ttn0;

    .line 231
    .line 232
    const/16 p3, 0xe

    .line 233
    .line 234
    invoke-direct {p2, p0, p3}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 235
    .line 236
    .line 237
    invoke-static {p1, p2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 238
    .line 239
    .line 240
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    iget-object p1, p1, La/fvo0;->b:Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 245
    .line 246
    new-instance p2, La/jpe0;

    .line 247
    .line 248
    const/16 p3, 0xc

    .line 249
    .line 250
    invoke-direct {p2, p0, p3}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    .line 255
    .line 256
    return-void
.end method

.method public static final synthetic a(Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;)La/fvo0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getBinding()La/fvo0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, La/fvo0;

    .line 11
    .line 12
    return-object p0
.end method

.method private final setHeaderTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/fvo0;->h:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Landroid/widget/LinearLayout;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    filled-new-array {v0, v1}, [I

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-short v2, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->d:S

    .line 15
    .line 16
    int-to-long v2, v2

    .line 17
    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->e:Landroid/view/animation/PathInterpolator;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, La/dvo0;

    .line 26
    .line 27
    invoke-direct {p0, p1, v1}, La/dvo0;-><init>(Landroid/widget/LinearLayout;B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final c(Landroid/widget/LinearLayout;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v1, v2

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sub-int/2addr v1, v0

    .line 24
    const/high16 v0, 0x40000000    # 2.0f

    .line 25
    .line 26
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->measure(II)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    filled-new-array {v1, v0}, [I

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-short v1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->d:S

    .line 55
    .line 56
    int-to-long v1, v1

    .line 57
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->e:Landroid/view/animation/PathInterpolator;

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 63
    .line 64
    .line 65
    new-instance p0, La/dvo0;

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-direct {p0, p1, v1}, La/dvo0;-><init>(Landroid/widget/LinearLayout;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->b:La/evo0;

    .line 14
    .line 15
    sget-object v1, La/evo0;->b:La/evo0;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, La/fvo0;->d:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->c(Landroid/widget/LinearLayout;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, La/fvo0;->b:Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->setExpanded(Z)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v0, v0, La/fvo0;->d:Landroid/widget/LinearLayout;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->b(Landroid/widget/LinearLayout;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object p0, p0, La/fvo0;->b:Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/accordion/DsAccordion;->setExpanded(Z)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    new-instance v0, La/w23;

    .line 60
    .line 61
    const/16 v1, 0x12

    .line 62
    .line 63
    invoke-direct {v0, p0, v1}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/fvo0;->g:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/fvo0;->i:Landroid/widget/TextView;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    sget-object v0, La/iun;->a:La/iun;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->setContent(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    const-string v0, ""

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->setHeaderValue(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->setContent(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La/fvo0;->g:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, La/fvo0;->i:Landroid/widget/TextView;

    .line 24
    .line 25
    const/16 v0, 0x8

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setContent(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->c:Ljava/util/List;

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p1, p1, La/fvo0;->e:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->c:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroid/view/View;

    .line 40
    .line 41
    invoke-static {v0}, La/hxm0;->v(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v1, v1, La/fvo0;->e:Landroid/widget/LinearLayout;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->d()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final setHeaderIcon(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/fvo0;->c:Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setHeaderValue(Ljava/lang/CharSequence;)V
    .locals 1

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
    if-lez v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, La/fvo0;->i:Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p1, p1, La/fvo0;->i:Landroid/widget/TextView;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const v0, 0x7f13149b

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->setHeaderTitle(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object p1, p1, La/fvo0;->i:Landroid/widget/TextView;

    .line 52
    .line 53
    const-string v0, ""

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->getBinding()La/fvo0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p1, p1, La/fvo0;->i:Landroid/widget/TextView;

    .line 63
    .line 64
    const/16 v0, 0x8

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const v0, 0x7f13149c

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->setHeaderTitle(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method
