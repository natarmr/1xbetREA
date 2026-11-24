.class public final Lorg/xplatform/uikit/components/cells/DsShimmerCell;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/x8b;


# instance fields
.field public final q:La/jk3;

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const p3, 0x7f040151

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const v3, 0x7f0d0568

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    const v2, 0x7f0a0730

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move-object v6, v3

    .line 34
    check-cast v6, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    const v2, 0x7f0a09ce

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    move-object v7, v3

    .line 46
    check-cast v7, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 47
    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    const v2, 0x7f0a0d78

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    move-object v8, v3

    .line 58
    check-cast v8, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 59
    .line 60
    if-eqz v8, :cond_1

    .line 61
    .line 62
    const v2, 0x7f0a0fce

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    move-object v9, v3

    .line 70
    check-cast v9, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 71
    .line 72
    if-eqz v9, :cond_1

    .line 73
    .line 74
    new-instance v4, La/jk3;

    .line 75
    .line 76
    const/16 v10, 0xc

    .line 77
    .line 78
    move-object v5, p0

    .line 79
    invoke-direct/range {v4 .. v10}, La/jk3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 80
    .line 81
    .line 82
    iput-object v4, v5, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->q:La/jk3;

    .line 83
    .line 84
    sget-object p0, La/bqd0;->l0:[I

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-virtual {p1, p2, p0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {v1, p1, p0}, La/ktt0;->m(ILandroid/content/Context;Landroid/content/res/TypedArray;)Landroid/content/res/ColorStateList;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {v5, p1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 96
    .line 97
    .line 98
    iget-boolean p1, v5, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->r:Z

    .line 99
    .line 100
    const/4 p2, 0x1

    .line 101
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    iput-boolean p1, v5, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->r:Z

    .line 106
    .line 107
    iget-boolean p1, v5, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->s:Z

    .line 108
    .line 109
    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iput-boolean p1, v5, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->s:Z

    .line 114
    .line 115
    const/4 p1, 0x3

    .line 116
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    invoke-virtual {v5, p1}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->setIconVisible(Z)V

    .line 121
    .line 122
    .line 123
    const/4 p1, 0x7

    .line 124
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-virtual {v5, p1}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->setTitleVisible(Z)V

    .line 129
    .line 130
    .line 131
    const/4 p1, 0x4

    .line 132
    invoke-virtual {p0, p1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    invoke-virtual {v5, p1}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->setLongTitleVisible(Z)V

    .line 137
    .line 138
    .line 139
    const/4 p1, 0x5

    .line 140
    invoke-virtual {p0, p1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    invoke-virtual {v5, p1}, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->setSeparatorVisible(Z)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_1
    move-object v5, p0

    .line 152
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    const-string p1, "Missing required view with ID: "

    .line 161
    .line 162
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v1
.end method


# virtual methods
.method public final onCreateDrawableState(I)[I
    .locals 2

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->r:Z

    .line 8
    .line 9
    const v1, 0x7f04069e

    .line 10
    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    neg-int v1, v1

    .line 16
    :goto_0
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->s:Z

    .line 17
    .line 18
    const v0, 0x7f04069f

    .line 19
    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    neg-int v0, v0

    .line 25
    :goto_1
    filled-new-array {v1, v0}, [I

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p1, p0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    return-object p0
.end method

.method public final onFinishInflate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->q:La/jk3;

    .line 5
    .line 6
    iget-object p0, p0, La/jk3;->e:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setFirst(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->r:Z

    .line 2
    .line 3
    iget-object p1, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->q:La/jk3;

    .line 4
    .line 5
    iget-object p1, p1, La/jk3;->e:Landroid/view/View;

    .line 6
    .line 7
    check-cast p1, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 8
    .line 9
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->s:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v0, 0x8

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final setIconVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->q:La/jk3;

    .line 2
    .line 3
    iget-object p0, p0, La/jk3;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setLast(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->s:Z

    .line 2
    .line 3
    iget-object v0, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->q:La/jk3;

    .line 4
    .line 5
    iget-object v0, v0, La/jk3;->e:Landroid/view/View;

    .line 6
    .line 7
    check-cast v0, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/16 p1, 0x8

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setLongTitleVisible(Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->q:La/jk3;

    .line 2
    .line 3
    iget-object v0, p0, La/jk3;->d:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v1

    .line 14
    :goto_0
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, La/jk3;->f:Landroid/view/View;

    .line 20
    .line 21
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final setSeparatorVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->q:La/jk3;

    .line 2
    .line 3
    iget-object p0, p0, La/jk3;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/separator/DsSeparator;

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
    return-void
.end method

.method public final setTitleVisible(Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;->q:La/jk3;

    .line 2
    .line 3
    iget-object v0, p0, La/jk3;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v1

    .line 14
    :goto_0
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, La/jk3;->d:Landroid/view/View;

    .line 20
    .line 21
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method
