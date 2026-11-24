.class public final Lorg/xplatform/ui_core/viewcomponents/recycler/managers/ExpandableLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lorg/xplatform/ui_core/viewcomponents/recycler/managers/ExpandableLayoutManager;",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "defStyleRes",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "a/wmo",
        "ui_core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g1:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/ago;

    .line 8
    .line 9
    const/16 p2, 0x11

    .line 10
    .line 11
    invoke-direct {p1, p2}, La/ago;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lorg/xplatform/ui_core/viewcomponents/recycler/managers/ExpandableLayoutManager;->g1:La/n0o0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final R0(Landroidx/recyclerview/widget/RecyclerView;La/the0;I)V
    .locals 0

    .line 1
    new-instance p2, La/wmo;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p2, p0, p1}, La/wmo;-><init>(Lorg/xplatform/ui_core/viewcomponents/recycler/managers/ExpandableLayoutManager;Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iput p3, p2, La/she0;->a:I

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/b;->S0(La/she0;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final m0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/recycler/managers/ExpandableLayoutManager;->g1:La/n0o0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v1, La/vmo;

    .line 13
    .line 14
    invoke-direct {v1, p0, p2, p3, p1}, La/vmo;-><init>(Lorg/xplatform/ui_core/viewcomponents/recycler/managers/ExpandableLayoutManager;IILandroidx/recyclerview/widget/RecyclerView;)V

    .line 15
    .line 16
    .line 17
    const-wide/16 p0, 0x78

    .line 18
    .line 19
    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method
