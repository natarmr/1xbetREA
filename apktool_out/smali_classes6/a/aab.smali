.class public final La/aab;
.super La/q4;
.source "SourceFile"


# instance fields
.field public final f:Landroid/content/Context;

.field public final g:La/nmo0;

.field public final h:Z

.field public final i:La/nhe0;

.field public j:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;La/nmo0;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2, p1}, La/q4;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/aab;->f:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p3, p0, La/aab;->g:La/nmo0;

    .line 13
    .line 14
    iput-boolean p4, p0, La/aab;->h:Z

    .line 15
    .line 16
    new-instance p1, La/nhe0;

    .line 17
    .line 18
    invoke-direct {p1}, La/nhe0;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/aab;->i:La/nhe0;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final n(La/xhe0;I)V
    .locals 1

    .line 1
    check-cast p1, La/w5;

    .line 2
    .line 3
    check-cast p1, La/z9b;

    .line 4
    .line 5
    iget-object p1, p1, La/z9b;->u:La/y9b;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of v0, p1, La/kab;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, La/kab;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    iget-object p0, p0, La/q4;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/util/List;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iput p2, p1, La/kab;->h:I

    .line 32
    .line 33
    :cond_1
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iput-object p0, p1, La/q4;->e:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p1}, La/yge0;->g()V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 2

    .line 1
    new-instance p1, La/y9b;

    .line 2
    .line 3
    iget-object p2, p0, La/aab;->f:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p1, p2}, La/y9b;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/aab;->i:La/nhe0;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setRecycledViewPool(La/nhe0;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/aab;->j:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, La/aab;->g:La/nmo0;

    .line 25
    .line 26
    move-object v1, v0

    .line 27
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 28
    .line 29
    iget-boolean v1, v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->r:Z

    .line 30
    .line 31
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, La/nmo0;->getHorizontalRecyclerViewListener()La/vlw;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->n(La/khe0;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnLayoutManager;

    .line 42
    .line 43
    invoke-direct {v1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnLayoutManager;-><init>(Landroid/content/Context;La/nmo0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, La/kab;

    .line 50
    .line 51
    invoke-interface {v0}, La/nmo0;->getAdapter()La/k5;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-boolean p0, p0, La/aab;->h:Z

    .line 59
    .line 60
    invoke-direct {v1, p2, v0, p0}, La/kab;-><init>(Landroid/content/Context;La/k5;Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, La/z9b;

    .line 67
    .line 68
    invoke-direct {p0, p1}, La/z9b;-><init>(La/y9b;)V

    .line 69
    .line 70
    .line 71
    return-object p0
.end method

.method public final s(La/xhe0;)V
    .locals 2

    .line 1
    check-cast p1, La/w5;

    .line 2
    .line 3
    check-cast p1, La/z9b;

    .line 4
    .line 5
    iget-object p0, p0, La/aab;->g:La/nmo0;

    .line 6
    .line 7
    invoke-interface {p0}, La/nmo0;->getScrollHandler()La/flo0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p1, p1, La/z9b;->u:La/y9b;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast p1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnLayoutManager;

    .line 21
    .line 22
    iget-object v0, p0, La/flo0;->b:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnHeaderLayoutManager;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, La/flo0;->b:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnHeaderLayoutManager;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->D(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p0, 0x0

    .line 46
    :goto_0
    invoke-virtual {p1, v0, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->w1(II)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final u(La/xhe0;)V
    .locals 0

    .line 1
    check-cast p1, La/w5;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of p0, p1, La/z9b;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    check-cast p1, La/z9b;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p0, p1, La/z9b;->u:La/y9b;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput p1, p0, La/y9b;->m2:I

    .line 20
    .line 21
    :cond_1
    return-void
.end method
