.class public final La/ukm;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/xoe;


# instance fields
.field public a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:La/ic50;

.field public final g:Landroidx/appcompat/widget/AppCompatImageView;

.field public final h:La/if5;

.field public final i:La/yoe;


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
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    const-string v2, "generate"

    .line 10
    .line 11
    iput-object v2, p0, La/ukm;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const v3, 0x7f07067a

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iput v2, p0, La/ukm;->b:I

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const v3, 0x7f0706b7

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iput v2, p0, La/ukm;->c:I

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const v3, 0x7f070717

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iput v2, p0, La/ukm;->d:I

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const v4, 0x7f070722

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    iput v2, p0, La/ukm;->e:I

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 70
    .line 71
    .line 72
    sget-object v2, La/ic50;->b:La/ic50;

    .line 73
    .line 74
    iput-object v2, p0, La/ukm;->f:La/ic50;

    .line 75
    .line 76
    new-instance v3, Landroidx/appcompat/widget/AppCompatImageView;

    .line 77
    .line 78
    invoke-direct {v3, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 89
    .line 90
    .line 91
    iput-object v3, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 92
    .line 93
    new-instance v4, La/if5;

    .line 94
    .line 95
    invoke-direct {v4, v3, v0}, La/if5;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 96
    .line 97
    .line 98
    iput-object v4, p0, La/ukm;->h:La/if5;

    .line 99
    .line 100
    new-instance v4, La/yoe;

    .line 101
    .line 102
    invoke-direct {v4, v3, v0}, La/yoe;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 103
    .line 104
    .line 105
    iput-object v4, p0, La/ukm;->i:La/yoe;

    .line 106
    .line 107
    invoke-virtual {v4, v0, v1}, La/yoe;->b(Landroid/util/AttributeSet;I)V

    .line 108
    .line 109
    .line 110
    sget-object v4, La/bqd0;->F:[I

    .line 111
    .line 112
    invoke-virtual {p1, v0, v4, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const/4 v4, 0x2

    .line 117
    const/4 v5, 0x1

    .line 118
    invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v6, :cond_1

    .line 123
    .line 124
    if-eq v6, v5, :cond_2

    .line 125
    .line 126
    if-eq v6, v4, :cond_0

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_0
    sget-object v2, La/ic50;->c:La/ic50;

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_1
    sget-object v2, La/ic50;->a:La/ic50;

    .line 133
    .line 134
    :cond_2
    :goto_0
    iput-object v2, p0, La/ukm;->f:La/ic50;

    .line 135
    .line 136
    const/4 v2, 0x3

    .line 137
    invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-virtual {p0, v2}, La/ukm;->setNavigationBarButtonAlpha(Z)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, La/ukm;->a()V

    .line 145
    .line 146
    .line 147
    const v2, 0x7f08090a

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v5, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-virtual {p0, v2}, La/ukm;->setNavigationBarButtonImageResource(I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1, p1, v0}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p0, p1}, La/ukm;->setNavigationBarButtonTint(Landroid/content/res/ColorStateList;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 168
    .line 169
    .line 170
    const-string p1, "DsNavigationBarButton"

    .line 171
    .line 172
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ukm;->f:La/ic50;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const v1, 0x7f040b0b

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const v1, 0x7f040afc

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const v1, 0x7f040b5f

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_0
    iget-object p0, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final getButtonIconId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ukm;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    iget p1, p0, La/ukm;->c:I

    .line 2
    .line 3
    iget p2, p0, La/ukm;->b:I

    .line 4
    .line 5
    sub-int p3, p1, p2

    .line 6
    .line 7
    div-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    sub-int/2addr p1, p2

    .line 10
    div-int/lit8 p1, p1, 0x2

    .line 11
    .line 12
    add-int p4, p3, p2

    .line 13
    .line 14
    add-int/2addr p2, p1

    .line 15
    iget-object p0, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 16
    .line 17
    invoke-virtual {p0, p3, p1, p4, p2}, Landroid/view/View;->layout(IIII)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    iget p1, p0, La/ukm;->b:I

    .line 2
    .line 3
    const/high16 p2, 0x40000000    # 2.0f

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object p2, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 14
    .line 15
    invoke-virtual {p2, v0, p1}, Landroid/view/View;->measure(II)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, La/ukm;->c:I

    .line 19
    .line 20
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public setBadgeBackgroundTint(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ukm;->h:La/if5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/if5;->j(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBadgeVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ukm;->h:La/if5;

    .line 2
    .line 3
    iget-object p0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setButtonIconId(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ukm;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public setCount(Ljava/lang/Integer;)V
    .locals 2

    .line 1
    iget v0, p0, La/ukm;->e:I

    .line 2
    .line 3
    iget v1, p0, La/ukm;->d:I

    .line 4
    .line 5
    iget-object p0, p0, La/ukm;->i:La/yoe;

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0, v1}, La/yoe;->e(Ljava/lang/Integer;II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setCounterStyle(La/r0m;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ukm;->i:La/yoe;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/yoe;->d:La/r0m;

    .line 10
    .line 11
    return-void
.end method

.method public final setCounterVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ukm;->i:La/yoe;

    .line 2
    .line 3
    iget-object p0, p0, La/yoe;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setNavigationBarButtonAlpha(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La/ukm;->f:La/ic50;

    .line 2
    .line 3
    sget-object v1, La/ic50;->a:La/ic50;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const/high16 p1, 0x3f000000    # 0.5f

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    :goto_0
    iget-object p0, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setNavigationBarButtonClickable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setNavigationBarButtonEnable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setNavigationBarButtonImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setNavigationBarButtonImageResource(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setNavigationBarButtonStyle(La/ic50;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ukm;->f:La/ic50;

    .line 5
    .line 6
    invoke-virtual {p0}, La/ukm;->a()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setNavigationBarButtonTint(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setOnNavigationBarButtonClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/c0;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, p1, v1}, La/c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/ukm;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
