.class public final La/zlw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;IILorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/zlw;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/zlw;->b:Landroid/view/View;

    .line 8
    .line 9
    iput p2, p0, La/zlw;->c:I

    .line 10
    .line 11
    iput p3, p0, La/zlw;->d:I

    .line 12
    .line 13
    iput-object p4, p0, La/zlw;->e:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/widget/HorizontalScrollView;Landroid/widget/HorizontalScrollView;II)V
    .locals 0

    const/4 p1, 0x0

    iput-byte p1, p0, La/zlw;->a:B

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/zlw;->e:Ljava/lang/Object;

    iput p3, p0, La/zlw;->c:I

    iput p4, p0, La/zlw;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/zlw;->a:B

    .line 2
    .line 3
    iget v1, p0, La/zlw;->d:I

    .line 4
    .line 5
    iget v2, p0, La/zlw;->c:I

    .line 6
    .line 7
    iget-object p0, p0, La/zlw;->e:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;

    .line 13
    .line 14
    add-int/2addr v1, v2

    .line 15
    :goto_0
    if-ge v2, v1, :cond_5

    .line 16
    .line 17
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->g1:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->O(I)La/xhe0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, La/xhe0;->a:Landroid/view/View;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_1
    instance-of v3, v0, Landroid/widget/FrameLayout;

    .line 30
    .line 31
    if-eqz v3, :cond_4

    .line 32
    .line 33
    check-cast v0, Landroid/widget/FrameLayout;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    instance-of v0, v0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v0, v3}, La/q3d;->f(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v3, -0x1

    .line 55
    if-ltz v0, :cond_1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    neg-int v0, v0

    .line 61
    iget-object v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-ge v0, v4, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v0, v3

    .line 71
    :goto_2
    iget-object v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 72
    .line 73
    if-eq v0, v3, :cond_3

    .line 74
    .line 75
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v4, v0, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    return-void

    .line 94
    :pswitch_0
    check-cast p0, Landroid/widget/HorizontalScrollView;

    .line 95
    .line 96
    invoke-virtual {p0, v2, v1}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
