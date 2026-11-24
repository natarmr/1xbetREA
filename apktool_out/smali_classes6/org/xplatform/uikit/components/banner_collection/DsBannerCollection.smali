.class public final Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;
.super Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;
.source "SourceFile"


# static fields
.field public static final synthetic t2:I


# instance fields
.field public final o2:I

.field public final p2:I

.field public final q2:La/dp5;

.field public final r2:La/n0o0;

.field public final s2:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

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
    const p3, 0x7f0400bc

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    const v1, 0x7f0704be

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    iput p3, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->o2:I

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    iput p3, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->p2:I

    .line 38
    .line 39
    sget-object p3, La/dp5;->c:La/dp5;

    .line 40
    .line 41
    iput-object p3, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->q2:La/dp5;

    .line 42
    .line 43
    new-instance p3, La/wsl;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {p3, p0, v1}, La/wsl;-><init>(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    iput-object p3, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->r2:La/n0o0;

    .line 54
    .line 55
    new-instance p3, La/wsl;

    .line 56
    .line 57
    const/4 v2, 0x1

    .line 58
    invoke-direct {p3, p0, v2}, La/wsl;-><init>(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    iput-object p3, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->s2:La/n0o0;

    .line 66
    .line 67
    sget-object p3, La/bqd0;->g:[I

    .line 68
    .line 69
    invoke-virtual {p1, p2, p3, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object p2, La/dp5;->b:La/cl5;

    .line 74
    .line 75
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object p2, La/dp5;->e:La/c0o;

    .line 83
    .line 84
    invoke-virtual {p2}, La/b3;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    move-object v2, v1

    .line 99
    check-cast v2, La/dp5;

    .line 100
    .line 101
    iget-boolean v2, v2, La/dp5;->a:Z

    .line 102
    .line 103
    if-ne v2, p3, :cond_1

    .line 104
    .line 105
    move-object v0, v1

    .line 106
    :cond_2
    check-cast v0, La/dp5;

    .line 107
    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    sget-object v0, La/dp5;->c:La/dp5;

    .line 111
    .line 112
    :cond_3
    iput-object v0, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->q2:La/dp5;

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public static final H0(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->t0()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->getBannerCollectionItemDecorator()La/ep5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final I0(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->t0()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->getBannerCollectionShimmersDecorator()La/tp5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static J0(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;La/bq5;)V
    .locals 7

    .line 1
    new-instance v0, La/knl;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/knl;-><init>(B)V

    .line 6
    .line 7
    .line 8
    instance-of v1, p1, La/aq5;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    check-cast p1, La/aq5;

    .line 14
    .line 15
    iget-object p1, p1, La/aq5;->a:La/up5;

    .line 16
    .line 17
    iget v1, p1, La/up5;->b:I

    .line 18
    .line 19
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    move v4, v2

    .line 25
    :goto_0
    if-ge v4, v1, :cond_0

    .line 26
    .line 27
    iget-object v5, p1, La/up5;->a:La/mq5;

    .line 28
    .line 29
    new-instance v6, La/up5;

    .line 30
    .line 31
    invoke-direct {v6, v5, v1}, La/up5;-><init>(La/mq5;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    instance-of p1, p1, La/sp5;

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {p1, v1, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->getBannerCollectionShimmersAdapter()La/sp5;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->getBannerCollectionShimmersAdapter()La/sp5;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v1, La/xsl;

    .line 72
    .line 73
    const/4 v2, 0x1

    .line 74
    invoke-direct {v1, p0, v0, v2}, La/xsl;-><init>(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;Lkotlin/jvm/functions/Function0;B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v3, v1}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_2
    instance-of v1, p1, La/zp5;

    .line 82
    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    check-cast p1, La/zp5;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    instance-of v1, v1, La/jp5;

    .line 92
    .line 93
    if-nez v1, :cond_3

    .line 94
    .line 95
    invoke-direct {p0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->getBannerCollectionItemsAdapter()La/jp5;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 100
    .line 101
    .line 102
    new-instance v1, Lorg/xplatform/uikit/utils/recycerview/CenterViewLayoutManager;

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const-class v4, La/rr5;

    .line 112
    .line 113
    const-class v5, La/tr5;

    .line 114
    .line 115
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-direct {v1, v3, v4}, Lorg/xplatform/uikit/utils/recycerview/CenterViewLayoutManager;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    invoke-direct {p0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->getBannerCollectionItemsAdapter()La/jp5;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object p1, p1, La/zp5;->a:Ljava/util/List;

    .line 134
    .line 135
    new-instance v3, La/xsl;

    .line 136
    .line 137
    invoke-direct {v3, p0, v0, v2}, La/xsl;-><init>(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;Lkotlin/jvm/functions/Function0;B)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, p1, v3}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method private final getBannerCollectionItemDecorator()La/ep5;
    .locals 3

    .line 1
    new-instance v0, La/ep5;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->o2:I

    .line 11
    .line 12
    iget p0, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->p2:I

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, p0}, La/ep5;-><init>(Landroid/content/res/Resources;II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method private final getBannerCollectionItemsAdapter()La/jp5;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->r2:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jp5;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getBannerCollectionShimmersAdapter()La/sp5;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->s2:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/sp5;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getBannerCollectionShimmersDecorator()La/tp5;
    .locals 3

    .line 1
    new-instance v0, La/tp5;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->o2:I

    .line 11
    .line 12
    iget p0, p0, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->p2:I

    .line 13
    .line 14
    invoke-direct {v0, v1, v2, p0}, La/tp5;-><init>(Landroid/content/res/Resources;II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method


# virtual methods
.method public final setOnItemClickListener(La/xdr;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/xdr;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->getBannerCollectionItemsAdapter()La/jp5;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iput-object p1, p0, La/jp5;->g:La/xdr;

    .line 9
    .line 10
    return-void
.end method
