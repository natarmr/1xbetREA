.class public final Lorg/xplatform/ui_core/layout_managers/PeekingLinearLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/ui_core/layout_managers/PeekingLinearLayoutManager;",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
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


# virtual methods
.method public final b0(Landroid/view/View;)V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const-wide v1, 0x3feccccccccccccdL    # 0.9

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v0, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->S()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget v4, p0, Landroidx/recyclerview/widget/b;->o:I

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-gtz v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingStart()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingEnd()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v1

    .line 39
    invoke-static {v5}, La/sj3;->X(I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    add-int/2addr v1, v2

    .line 44
    sub-int/2addr v4, v1

    .line 45
    iput v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingStart()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingEnd()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    add-int/2addr v6, v3

    .line 57
    invoke-static {v5}, La/sj3;->X(I)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    add-int/2addr v3, v6

    .line 62
    sub-int/2addr v4, v3

    .line 63
    int-to-double v3, v4

    .line 64
    mul-double/2addr v3, v1

    .line 65
    double-to-int v1, v3

    .line 66
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget v3, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 77
    .line 78
    int-to-double v3, v3

    .line 79
    mul-double/2addr v3, v1

    .line 80
    double-to-int v1, v3

    .line 81
    const/16 v2, 0x190

    .line 82
    .line 83
    invoke-static {v2}, La/sj3;->X(I)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 92
    .line 93
    :goto_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/b;->b0(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method
