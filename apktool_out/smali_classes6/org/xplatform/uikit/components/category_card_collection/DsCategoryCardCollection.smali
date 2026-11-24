.class public final Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;
.super Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;
.source "SourceFile"


# instance fields
.field public o2:La/o0x;

.field public final p2:La/n3b;

.field public final q2:La/pmk0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/m0x;

    .line 15
    .line 16
    const v2, 0x7f080277

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x6

    .line 20
    invoke-direct {v1, v2, v0, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->o2:La/o0x;

    .line 24
    .line 25
    new-instance v4, La/pmk0;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const v5, 0x7f07072d

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const v6, 0x7f0704be

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    const/4 v8, 0x0

    .line 50
    const/16 v9, 0x14

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    invoke-direct/range {v4 .. v9}, La/pmk0;-><init>(IIIII)V

    .line 54
    .line 55
    .line 56
    iput-object v4, p0, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->q2:La/pmk0;

    .line 57
    .line 58
    sget-object v1, La/bqd0;->l:[I

    .line 59
    .line 60
    invoke-virtual {p1, p2, v1, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    new-instance v1, La/m0x;

    .line 65
    .line 66
    invoke-virtual {p2, p3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-direct {v1, v2, v0, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 71
    .line 72
    .line 73
    iput-object v1, p0, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->o2:La/o0x;

    .line 74
    .line 75
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 76
    .line 77
    .line 78
    new-instance p2, La/n3b;

    .line 79
    .line 80
    new-instance v0, La/ntl;

    .line 81
    .line 82
    const/4 v1, 0x1

    .line 83
    invoke-direct {v0, p0, v1}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p2, v0}, La/n3b;-><init>(La/ntl;)V

    .line 87
    .line 88
    .line 89
    iput-object p2, p0, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->p2:La/n3b;

    .line 90
    .line 91
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 92
    .line 93
    invoke-direct {v0, p1, p3, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final setHorizontalPadding(I)V
    .locals 6

    .line 1
    new-instance v0, La/pmk0;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const v2, 0x7f07072d

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v4, 0x0

    .line 15
    const/16 v5, 0x14

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move v2, p1

    .line 19
    invoke-direct/range {v0 .. v5}, La/pmk0;-><init>(IIIII)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->q2:La/pmk0;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->s0(La/fhe0;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setOnItemClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "La/p3b;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->p2:La/n3b;

    .line 5
    .line 6
    iput-object p1, p0, La/n3b;->g:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
.end method

.method public final setPlaceholder(La/o0x;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/uikit/components/category_card_collection/DsCategoryCardCollection;->o2:La/o0x;

    .line 5
    .line 6
    return-void
.end method
