.class public final La/a3v0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/a5s;


# instance fields
.field public final a:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

.field public final b:La/o4s;

.field public c:La/xdr;

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

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
    new-instance v2, Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 10
    .line 11
    const/4 v3, 0x6

    .line 12
    invoke-direct {v2, p1, v0, v3, v1}, Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 13
    .line 14
    .line 15
    const-string v0, "WebGamesCollection"

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v2, p0, La/a3v0;->a:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const v3, 0x7f07072d

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    iput v5, p0, La/a3v0;->d:I

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const v3, 0x7f0704be

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, p0, La/a3v0;->e:I

    .line 47
    .line 48
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, La/o4s;

    .line 52
    .line 53
    sget-object v3, La/g5s;->i:La/g5s;

    .line 54
    .line 55
    const v4, 0x7f0807c2

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v3, v1, v4}, La/lmc;->G(Landroid/content/Context;La/g5s;II)La/o0x;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget-object v6, p0, La/a3v0;->c:La/xdr;

    .line 63
    .line 64
    invoke-direct {v0, v3, v4, v6}, La/o4s;-><init>(La/g5s;La/o0x;La/xdr;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, La/a3v0;->b:La/o4s;

    .line 68
    .line 69
    const p0, 0x7f080e73

    .line 70
    .line 71
    .line 72
    invoke-static {p0, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {v2, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const v3, 0x7f0706f8

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-static {v2, p0}, La/jmu0;->i(Landroid/view/View;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 97
    .line 98
    .line 99
    new-instance p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 100
    .line 101
    invoke-direct {p0, p1, v1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, p0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 108
    .line 109
    .line 110
    new-instance v4, La/pmk0;

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    const/16 v9, 0x10

    .line 114
    .line 115
    move v6, v5

    .line 116
    move v7, v5

    .line 117
    invoke-direct/range {v4 .. v9}, La/pmk0;-><init>(IIIII)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method


# virtual methods
.method public getCollectionRecycler()Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, La/a3v0;->a:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHeader()Lorg/xplatform/uikit/components/header/DsHeader;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p2, p0, La/a3v0;->e:I

    .line 6
    .line 7
    sub-int v2, p1, p2

    .line 8
    .line 9
    iget p1, p0, La/a3v0;->d:I

    .line 10
    .line 11
    iget-object v4, p0, La/a3v0;->a:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 12
    .line 13
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    add-int v3, p2, p1

    .line 18
    .line 19
    iget v0, p0, La/a3v0;->e:I

    .line 20
    .line 21
    iget v1, p0, La/a3v0;->d:I

    .line 22
    .line 23
    move-object v5, p0

    .line 24
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget-object v1, p0, La/a3v0;->a:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 11
    .line 12
    invoke-virtual {v1, v0, p2}, Landroid/view/View;->measure(II)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget p2, p0, La/a3v0;->d:I

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v0, p2

    .line 26
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/u4s;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/a3v0;->b:La/o4s;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, p1, v0}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final setOnItemClickListener(La/xdr;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/xdr;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, La/a3v0;->b:La/o4s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-object p1, v0, La/o4s;->h:La/xdr;

    .line 6
    .line 7
    :cond_0
    iput-object p1, p0, La/a3v0;->c:La/xdr;

    .line 8
    .line 9
    return-void
.end method
