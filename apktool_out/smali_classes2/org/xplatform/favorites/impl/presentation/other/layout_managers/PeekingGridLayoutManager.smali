.class public final Lorg/xplatform/favorites/impl/presentation/other/layout_managers/PeekingGridLayoutManager;
.super Landroidx/recyclerview/widget/GridLayoutManager;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/favorites/impl/presentation/other/layout_managers/PeekingGridLayoutManager;",
        "Landroidx/recyclerview/widget/GridLayoutManager;",
        "impl"
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
.method public final s(La/hhe0;)Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const v1, 0x3f666666    # 0.9f

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->S()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v3, p0, Landroidx/recyclerview/widget/b;->o:I

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-gtz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingStart()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingEnd()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    add-int/2addr p0, v0

    .line 30
    invoke-static {v4}, La/sj3;->X(I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/2addr v0, p0

    .line 35
    sub-int/2addr v3, v0

    .line 36
    iput v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingStart()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingEnd()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    add-int/2addr p0, v0

    .line 48
    invoke-static {v4}, La/sj3;->X(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    add-int/2addr v0, p0

    .line 53
    sub-int/2addr v3, v0

    .line 54
    int-to-float p0, v3

    .line 55
    mul-float/2addr p0, v1

    .line 56
    float-to-int p0, p0

    .line 57
    iput p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 58
    .line 59
    return v2

    .line 60
    :cond_2
    iget p0, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 61
    .line 62
    int-to-float p0, p0

    .line 63
    mul-float/2addr p0, v1

    .line 64
    float-to-int p0, p0

    .line 65
    iput p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 66
    .line 67
    return v2
.end method
