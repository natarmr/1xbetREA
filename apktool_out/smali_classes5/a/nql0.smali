.class public final La/nql0;
.super Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;
.source "SourceFile"

# interfaces
.implements La/wql0;


# instance fields
.field public final o2:La/sql0;

.field public p2:La/pmk0;


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
    invoke-direct {p0, p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    new-instance v0, La/sql0;

    .line 10
    .line 11
    sget-object v2, La/sql0;->h:La/pn20;

    .line 12
    .line 13
    invoke-direct {v0, v2}, La/q4;-><init>(La/dtb;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/nql0;->o2:La/sql0;

    .line 17
    .line 18
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 19
    .line 20
    invoke-direct {v2, p1, v1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 27
    .line 28
    .line 29
    const-string p1, "sportsCollectionSimple"

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const v0, 0x7f070717

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    new-instance v1, La/pmk0;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const v0, 0x7f0704be

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    const/4 v5, 0x0

    .line 59
    const/16 v6, 0x14

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-direct/range {v1 .. v6}, La/pmk0;-><init>(IIIII)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, La/nql0;->p2:La/pmk0;

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final b(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/nql0;->o2:La/sql0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(I)V
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
    const v2, 0x7f0704be

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v4, 0x0

    .line 15
    const/16 v5, 0x14

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move v1, p1

    .line 19
    invoke-direct/range {v0 .. v5}, La/pmk0;-><init>(IIIII)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, La/nql0;->p2:La/pmk0;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->s0(La/fhe0;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iput-object v0, p0, La/nql0;->p2:La/pmk0;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final setSportCollectionActionType(La/xdr;)V
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
    iget-object p0, p0, La/nql0;->o2:La/sql0;

    .line 5
    .line 6
    iput-object p1, p0, La/sql0;->f:La/xdr;

    .line 7
    .line 8
    return-void
.end method

.method public setSportCollectionClickListener(La/xdr;)V
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
    iget-object p0, p0, La/nql0;->o2:La/sql0;

    .line 5
    .line 6
    iput-object p1, p0, La/sql0;->f:La/xdr;

    .line 7
    .line 8
    return-void
.end method

.method public setStyle(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/nql0;->o2:La/sql0;

    .line 2
    .line 3
    iput p1, p0, La/sql0;->g:I

    .line 4
    .line 5
    return-void
.end method

.method public final setViewStyle(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/nql0;->o2:La/sql0;

    .line 2
    .line 3
    iput p1, p0, La/sql0;->g:I

    .line 4
    .line 5
    return-void
.end method
