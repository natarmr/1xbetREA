.class public final La/i2m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:I

.field public final synthetic c:La/j2m0;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public constructor <init>(Landroid/view/View;ILa/j2m0;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/i2m0;->a:Landroid/view/View;

    .line 5
    .line 6
    iput p2, p0, La/i2m0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, La/i2m0;->c:La/j2m0;

    .line 9
    .line 10
    iput p4, p0, La/i2m0;->d:I

    .line 11
    .line 12
    iput p5, p0, La/i2m0;->e:I

    .line 13
    .line 14
    iput p6, p0, La/i2m0;->f:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, La/i2m0;->c:La/j2m0;

    .line 2
    .line 3
    iget v1, p0, La/i2m0;->b:I

    .line 4
    .line 5
    if-lez v1, :cond_2

    .line 6
    .line 7
    iget-object v2, v0, La/j2m0;->a:La/iab;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const-string v4, "binding"

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    iget-object v2, v2, La/iab;->g:Landroid/view/View;

    .line 15
    .line 16
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 17
    .line 18
    invoke-virtual {v2}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget v5, p0, La/i2m0;->d:I

    .line 23
    .line 24
    invoke-virtual {v2, v1, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->w1(II)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/j2m0;->a:La/iab;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    iget-object v2, v2, La/iab;->g:Landroid/view/View;

    .line 32
    .line 33
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 34
    .line 35
    invoke-virtual {v2}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellLayoutManager()Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/CellLayoutManager;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2, v1, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->w1(II)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v3

    .line 47
    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v3

    .line 51
    :cond_2
    :goto_0
    iget v1, p0, La/i2m0;->e:I

    .line 52
    .line 53
    if-lez v1, :cond_3

    .line 54
    .line 55
    iget-object v2, v0, La/j2m0;->f:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iget p0, p0, La/i2m0;->f:I

    .line 60
    .line 61
    invoke-virtual {v2, v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->w1(II)V

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {v0}, La/j2m0;->f()V

    .line 65
    .line 66
    .line 67
    return-void
.end method
