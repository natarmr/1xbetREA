.class public final Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;
.super Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;
.source "SourceFile"


# instance fields
.field public final o2:I

.field public p2:I

.field public q2:I

.field public r2:I

.field public final s2:I

.field public final t2:I

.field public final u2:I

.field public final v2:I

.field public w2:La/fhe0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 169
    invoke-direct {p0, p1, v0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, p2, v0, v1}, Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 7
    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->p2:I

    .line 11
    .line 12
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->q2:I

    .line 13
    .line 14
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->r2:I

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const v3, 0x7f0704be

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->s2:I

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const v3, 0x7f07072d

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->t2:I

    .line 41
    .line 42
    const-string v2, "TagDsPromoStoreCollection"

    .line 43
    .line 44
    invoke-virtual {p0, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v2, La/bqd0;->g0:[I

    .line 48
    .line 49
    invoke-virtual {p1, p2, v2, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iget p2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->o2:I

    .line 54
    .line 55
    invoke-virtual {p1, v1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iput p2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->o2:I

    .line 60
    .line 61
    const/4 v2, 0x2

    .line 62
    iget v3, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->p2:I

    .line 63
    .line 64
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->p2:I

    .line 69
    .line 70
    const/4 v2, 0x5

    .line 71
    iget v3, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->q2:I

    .line 72
    .line 73
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->q2:I

    .line 78
    .line 79
    iget v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->r2:I

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->r2:I

    .line 87
    .line 88
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const/4 v2, 0x3

    .line 97
    iget v4, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->u2:I

    .line 98
    .line 99
    invoke-virtual {p1, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->u2:I

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 106
    .line 107
    .line 108
    if-nez p2, :cond_0

    .line 109
    .line 110
    move p1, v3

    .line 111
    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const v4, 0x7f0b0060

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getInteger(I)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    :goto_0
    iput p1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->v2:I

    .line 124
    .line 125
    new-instance v4, La/m0x;

    .line 126
    .line 127
    const/4 v5, 0x0

    .line 128
    const/4 v6, 0x6

    .line 129
    invoke-direct {v4, v2, v5, v6}, La/m0x;-><init>(ILa/bzw;I)V

    .line 130
    .line 131
    .line 132
    new-instance v2, La/xtc0;

    .line 133
    .line 134
    invoke-direct {v2, p2, v4, v0}, La/xtc0;-><init>(ILa/m0x;Ljava/lang/Integer;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 138
    .line 139
    .line 140
    if-nez p2, :cond_1

    .line 141
    .line 142
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-direct {p1, p2, v1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_1
    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 153
    .line 154
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-direct {p2, v0, p1, v3, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    .line 159
    .line 160
    .line 161
    move-object p1, p2

    .line 162
    :goto_1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->H0()V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method private final getBottomEdgePadding()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->r2:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->getEdgePadding()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private final getEdgePadding()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->p2:I

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
    const v0, 0x7f0704be

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

.method private final getTopEdgePadding()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->q2:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->getEdgePadding()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method


# virtual methods
.method public final H0()V
    .locals 12

    .line 1
    iget-object v0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->w2:La/fhe0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->s0(La/fhe0;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v5, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->o2:I

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iget v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->t2:I

    .line 12
    .line 13
    if-ne v5, v0, :cond_1

    .line 14
    .line 15
    new-instance v6, La/aqg;

    .line 16
    .line 17
    invoke-direct {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->getTopEdgePadding()I

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    invoke-direct {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->getBottomEdgePadding()I

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    iget v11, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->v2:I

    .line 26
    .line 27
    iget v8, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->s2:I

    .line 28
    .line 29
    move v7, v2

    .line 30
    invoke-direct/range {v6 .. v11}, La/aqg;-><init>(IIIII)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->getEdgePadding()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    new-instance v1, La/pmk0;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/16 v6, 0x14

    .line 42
    .line 43
    invoke-direct/range {v1 .. v6}, La/pmk0;-><init>(IIIII)V

    .line 44
    .line 45
    .line 46
    move-object v6, v1

    .line 47
    :goto_0
    iput-object v6, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->w2:La/fhe0;

    .line 48
    .line 49
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final setBottomEdgeSpace(I)V
    .locals 1

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
    iput p1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->r2:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->H0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setEdgeSpace(I)V
    .locals 1

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
    iput p1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->p2:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->H0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/euc0;",
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
    check-cast p0, La/xtc0;

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
            "La/euc0;",
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
    check-cast p0, La/xtc0;

    .line 12
    .line 13
    iput-object p1, p0, La/xtc0;->i:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    return-void
.end method

.method public final setTopEdgeSpace(I)V
    .locals 1

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
    iput p1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->q2:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/PromoStoreCollection;->H0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method
