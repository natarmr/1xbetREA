.class public final Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/tbc;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const p2, 0x7f0d0092

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    const p2, 0x7f0a0695

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    move-object v3, p3

    .line 36
    check-cast v3, Landroidx/constraintlayout/widget/Group;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    const p2, 0x7f0a06b9

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    check-cast p3, Landroidx/constraintlayout/widget/Guideline;

    .line 48
    .line 49
    if-eqz p3, :cond_1

    .line 50
    .line 51
    const p2, 0x7f0a0804

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    move-object v4, p3

    .line 59
    check-cast v4, Landroid/widget/ImageView;

    .line 60
    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    const p2, 0x7f0a0c80

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    move-object v5, p3

    .line 71
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    if-eqz v5, :cond_1

    .line 74
    .line 75
    const p2, 0x7f0a0db2

    .line 76
    .line 77
    .line 78
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    move-object v6, p3

    .line 83
    check-cast v6, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 84
    .line 85
    if-eqz v6, :cond_1

    .line 86
    .line 87
    const p2, 0x7f0a1080

    .line 88
    .line 89
    .line 90
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    move-object v7, p3

    .line 95
    check-cast v7, Landroid/widget/TextView;

    .line 96
    .line 97
    if-eqz v7, :cond_1

    .line 98
    .line 99
    const p2, 0x7f0a1081

    .line 100
    .line 101
    .line 102
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    move-object v8, p3

    .line 107
    check-cast v8, Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz v8, :cond_1

    .line 110
    .line 111
    const p2, 0x7f0a1082

    .line 112
    .line 113
    .line 114
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    move-object v9, p3

    .line 119
    check-cast v9, Landroid/widget/TextView;

    .line 120
    .line 121
    if-eqz v9, :cond_1

    .line 122
    .line 123
    const p2, 0x7f0a13ec

    .line 124
    .line 125
    .line 126
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    if-eqz v10, :cond_1

    .line 131
    .line 132
    new-instance v1, La/tbc;

    .line 133
    .line 134
    move-object v2, p1

    .line 135
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 136
    .line 137
    invoke-direct/range {v1 .. v10}, La/tbc;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Group;Landroid/widget/ImageView;Landroidx/recyclerview/widget/RecyclerView;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 138
    .line 139
    .line 140
    iput-object v1, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 141
    .line 142
    return-void

    .line 143
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    const-string p1, "Missing required view with ID: "

    .line 152
    .line 153
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw v0
.end method


# virtual methods
.method public final getItemDecorationsCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final setAdapter(La/ase;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 5
    .line 6
    iget-object p0, p0, La/tbc;->g:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setBlockBetGravity(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->d:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setBlockBetImage(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 2
    .line 3
    iget-object v0, v0, La/tbc;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setBlockBetText(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 5
    .line 6
    iget-object p0, p0, La/tbc;->d:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setBlockBetValueLoading(Z)V
    .locals 4

    .line 1
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 2
    .line 3
    iget-object v0, p0, La/tbc;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroidx/constraintlayout/widget/Group;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v1

    .line 15
    :goto_0
    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/tbc;->h:Landroid/view/View;

    .line 19
    .line 20
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    move v1, v2

    .line 25
    :cond_1
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final setBlockBetVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroidx/constraintlayout/widget/Group;

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
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setBlockErrorText(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 5
    .line 6
    iget-object p0, p0, La/tbc;->e:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setBlockErrorVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->e:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setBlockName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 5
    .line 6
    iget-object p0, p0, La/tbc;->i:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setEventItemsVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

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

.method public final setLayoutManager(Landroidx/recyclerview/widget/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 5
    .line 6
    iget-object p0, p0, La/tbc;->g:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setMakeBetClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/coupon/impl/core/presentation/base/view/CouponCardBlock;->q:La/tbc;

    .line 5
    .line 6
    iget-object p0, p0, La/tbc;->j:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
