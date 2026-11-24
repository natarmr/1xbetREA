.class public final Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;
.super Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;
.source "SourceFile"


# instance fields
.field public o2:I

.field public p2:I

.field public q2:I

.field public final r2:I

.field public final s2:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

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
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const v3, 0x7f07072d

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iput v3, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->p2:I

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const v4, 0x7f0706ea

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    iput v3, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->q2:I

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const v4, 0x7f0b005e

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getInteger(I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const v5, 0x7f0b005d

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getInteger(I)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    iput v4, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->s2:I

    .line 71
    .line 72
    sget-object v4, La/bqd0;->M:[I

    .line 73
    .line 74
    invoke-virtual {p1, p2, v4, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget p2, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->o2:I

    .line 79
    .line 80
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    iput p2, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->o2:I

    .line 85
    .line 86
    const/4 p2, 0x3

    .line 87
    iget v4, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->p2:I

    .line 88
    .line 89
    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    iput p2, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->p2:I

    .line 94
    .line 95
    iget p2, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->q2:I

    .line 96
    .line 97
    const/4 v4, 0x1

    .line 98
    invoke-virtual {p1, v4, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iput p2, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->q2:I

    .line 103
    .line 104
    iget p2, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->r2:I

    .line 105
    .line 106
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    iput p2, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->r2:I

    .line 111
    .line 112
    const-string v0, "PromoAdditionalCardCollection"

    .line 113
    .line 114
    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 118
    .line 119
    .line 120
    new-instance p1, La/j4c0;

    .line 121
    .line 122
    new-instance v0, La/m0x;

    .line 123
    .line 124
    const/4 v5, 0x6

    .line 125
    invoke-direct {v0, p2, v1, v5}, La/m0x;-><init>(ILa/bzw;I)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, v0}, La/j4c0;-><init>(La/m0x;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 132
    .line 133
    .line 134
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-direct {p1, p2, v3, v4, p3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 144
    .line 145
    .line 146
    new-instance p1, La/yrh;

    .line 147
    .line 148
    invoke-direct {p1, v2, v3, v5}, La/yrh;-><init>(IIB)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 152
    .line 153
    .line 154
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getHorizontalEdgeSpace()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getVerticalEdgeSpace()I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getHorizontalEdgeSpace()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getVerticalEdgeSpace()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method private final getEdgeSpace()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->o2:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const v0, 0x7f0706ea

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method private final getHorizontalEdgeSpace()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->q2:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getEdgeSpace()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private final getVerticalEdgeSpace()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->p2:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getEdgeSpace()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method


# virtual methods
.method public final setEdgeSpace(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, La/jmu0;->c(ILandroid/content/Context;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->o2:I

    .line 13
    .line 14
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getHorizontalEdgeSpace()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getVerticalEdgeSpace()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getHorizontalEdgeSpace()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getVerticalEdgeSpace()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final setHorizontalEdgeSpace(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, La/jmu0;->c(ILandroid/content/Context;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->q2:I

    .line 13
    .line 14
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getHorizontalEdgeSpace()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getVerticalEdgeSpace()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getHorizontalEdgeSpace()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getVerticalEdgeSpace()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/o4c0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p0, La/j4c0;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/q4;->G(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setOnItemClickListener(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "La/o4c0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p0, La/j4c0;

    .line 12
    .line 13
    iput-object p1, p0, La/j4c0;->g:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    return-void
.end method

.method public final setVerticalEdgeSpace(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, La/jmu0;->c(ILandroid/content/Context;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->p2:I

    .line 13
    .line 14
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getHorizontalEdgeSpace()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getVerticalEdgeSpace()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getHorizontalEdgeSpace()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {p0}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->getVerticalEdgeSpace()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
