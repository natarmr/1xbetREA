.class public final Lorg/xplatform/uikit/components/page_control/DsPageControl;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# static fields
.field public static final synthetic y2:I


# instance fields
.field public final m2:La/gkz;

.field public final n2:La/xp6;

.field public final o2:La/l5g;

.field public p2:Landroidx/viewpager2/widget/ViewPager2;

.field public q2:I

.field public r2:I

.field public final s2:I

.field public final t2:I

.field public u2:I

.field public final v2:I

.field public final w2:I

.field public x2:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/page_control/DsPageControl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/page_control/DsPageControl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 12

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
    const p3, 0x7f0406b4

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, La/gkz;

    .line 17
    .line 18
    sget-object v3, La/gkz;->g:La/pn20;

    .line 19
    .line 20
    invoke-direct {v2, v3}, La/zz3;-><init>(La/dtb;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, La/zc70;

    .line 24
    .line 25
    const/16 v4, 0x10

    .line 26
    .line 27
    invoke-direct {v3, v4}, La/zc70;-><init>(B)V

    .line 28
    .line 29
    .line 30
    new-instance v5, La/r580;

    .line 31
    .line 32
    invoke-direct {v5, v4}, La/r580;-><init>(B)V

    .line 33
    .line 34
    .line 35
    new-instance v4, La/iv60;

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x1

    .line 39
    invoke-direct {v4, v6, v7}, La/iv60;-><init>(IB)V

    .line 40
    .line 41
    .line 42
    sget-object v8, La/xk60;->d:La/xk60;

    .line 43
    .line 44
    new-instance v9, La/gbn;

    .line 45
    .line 46
    invoke-direct {v9, v3, v4, v5, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 47
    .line 48
    .line 49
    iget-object v3, v2, La/zz3;->d:La/dp;

    .line 50
    .line 51
    invoke-virtual {v3, v9}, La/dp;->b(La/gbn;)V

    .line 52
    .line 53
    .line 54
    iput-object v2, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->m2:La/gkz;

    .line 55
    .line 56
    new-instance v3, La/xp6;

    .line 57
    .line 58
    const/4 v4, 0x5

    .line 59
    invoke-direct {v3, p0, v4}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    iput-object v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->n2:La/xp6;

    .line 63
    .line 64
    new-instance v3, La/l5g;

    .line 65
    .line 66
    invoke-direct {v3, p0, v7}, La/l5g;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    iput-object v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->o2:La/l5g;

    .line 70
    .line 71
    const/4 v3, -0x1

    .line 72
    iput v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->q2:I

    .line 73
    .line 74
    iput v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->r2:I

    .line 75
    .line 76
    iput v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->s2:I

    .line 77
    .line 78
    iput v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->t2:I

    .line 79
    .line 80
    iput v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->u2:I

    .line 81
    .line 82
    iput v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->v2:I

    .line 83
    .line 84
    iput v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->w2:I

    .line 85
    .line 86
    iput v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->x2:I

    .line 87
    .line 88
    sget-object v4, La/bqd0;->V:[I

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-virtual {p1, p2, v4, p3, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    iput p2, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->s2:I

    .line 100
    .line 101
    invoke-virtual {p1, v7, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iput p2, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->t2:I

    .line 106
    .line 107
    invoke-virtual {p1, v6, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    iput p3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->u2:I

    .line 112
    .line 113
    invoke-virtual {p1, v5, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    iput p3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->v2:I

    .line 118
    .line 119
    const/4 p3, 0x4

    .line 120
    invoke-virtual {p1, p3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    iput v5, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->w2:I

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 127
    .line 128
    .line 129
    new-instance v4, La/pmk0;

    .line 130
    .line 131
    const/4 v10, 0x0

    .line 132
    const/16 v11, 0xc0

    .line 133
    .line 134
    const/4 v7, 0x0

    .line 135
    const/4 v9, 0x0

    .line 136
    move v6, v5

    .line 137
    move v8, v5

    .line 138
    invoke-direct/range {v4 .. v11}, La/pmk0;-><init>(IIIIIII)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 149
    .line 150
    .line 151
    move-result p3

    .line 152
    add-int/2addr p3, p1

    .line 153
    add-int/2addr p3, p2

    .line 154
    div-int/2addr p3, v0

    .line 155
    invoke-static {p0, p3}, La/jmu0;->i(Landroid/view/View;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    new-instance p2, Lorg/xplatform/uikit/components/page_control/DsPageControl$obtainLinearLayoutManager$1;

    .line 169
    .line 170
    invoke-direct {p2, p0, v2, p0, p1}, Lorg/xplatform/uikit/components/page_control/DsPageControl$obtainLinearLayoutManager$1;-><init>(Lorg/xplatform/uikit/components/page_control/DsPageControl;La/gkz;Lorg/xplatform/uikit/components/page_control/DsPageControl;Landroid/content/Context;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method


# virtual methods
.method public final H0()V
    .locals 7

    .line 1
    iget v0, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->x2:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 v0, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_3

    .line 24
    .line 25
    iget v1, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->r2:I

    .line 26
    .line 27
    iput v1, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->q2:I

    .line 28
    .line 29
    iget v1, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->x2:I

    .line 30
    .line 31
    move v3, v2

    .line 32
    :goto_1
    if-ge v3, v1, :cond_3

    .line 33
    .line 34
    iget v4, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->r2:I

    .line 35
    .line 36
    if-ne v4, v3, :cond_1

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move v4, v2

    .line 41
    :goto_2
    if-eqz v4, :cond_2

    .line 42
    .line 43
    iget v5, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->u2:I

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    iget v5, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->v2:I

    .line 47
    .line 48
    :goto_3
    new-instance v6, La/wi80;

    .line 49
    .line 50
    invoke-direct {v6, v3, v5, v4}, La/wi80;-><init>(IIZ)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget v2, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->s2:I

    .line 64
    .line 65
    iget v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->x2:I

    .line 66
    .line 67
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    iget v3, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->t2:I

    .line 72
    .line 73
    iget v4, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->w2:I

    .line 74
    .line 75
    add-int/2addr v3, v4

    .line 76
    mul-int/2addr v3, v2

    .line 77
    add-int/2addr v3, v4

    .line 78
    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 79
    .line 80
    new-instance v1, La/ccf;

    .line 81
    .line 82
    const/16 v2, 0xf

    .line 83
    .line 84
    invoke-direct {v1, p0, v2}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->m2:La/gkz;

    .line 88
    .line 89
    invoke-virtual {p0, v0, v1}, La/zz3;->B(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->p2:Landroidx/viewpager2/widget/ViewPager2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->n2:La/xp6;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->onDetachedFromWindow()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final setSelectedIndicatorColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->u2:I

    .line 2
    .line 3
    return-void
.end method

.method public final setViewPager2(Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->p2:Landroidx/viewpager2/widget/ViewPager2;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->o2:La/l5g;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/yge0;->v(La/ahe0;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    iput v1, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->q2:I

    .line 19
    .line 20
    invoke-virtual {v0}, La/yge0;->d()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->x2:I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->r2:I

    .line 31
    .line 32
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/page_control/DsPageControl;->H0()V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->n2:La/xp6;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p0, p1}, La/xp6;->c(I)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method
