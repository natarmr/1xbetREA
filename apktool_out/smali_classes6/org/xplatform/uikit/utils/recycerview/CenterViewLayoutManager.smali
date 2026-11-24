.class public final Lorg/xplatform/uikit/utils/recycerview/CenterViewLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/uikit/utils/recycerview/CenterViewLayoutManager;",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "uikit"
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
.field public final g1:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, p1, v0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lorg/xplatform/uikit/utils/recycerview/CenterViewLayoutManager;->g1:Ljava/util/List;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final s0(La/msj;La/the0;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->S()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, La/the0;->b()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x1

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    iget-boolean v1, p2, La/the0;->g:Z

    .line 23
    .line 24
    if-ne v1, v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->S()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ne v1, v0, :cond_4

    .line 32
    .line 33
    iget-object v0, p0, Lorg/xplatform/uikit/utils/recycerview/CenterViewLayoutManager;->g1:Ljava/util/List;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ljava/lang/Class;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-virtual {p1, v2}, La/msj;->e(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/b;->C(La/msj;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v2}, La/msj;->e(I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/b;->l(Landroid/view/View;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/b;->b0(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Landroidx/recyclerview/widget/b;->P(Landroid/view/View;)I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    invoke-static {p1}, Landroidx/recyclerview/widget/b;->O(Landroid/view/View;)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget v1, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 96
    .line 97
    sub-int/2addr v1, p2

    .line 98
    div-int/lit8 v1, v1, 0x2

    .line 99
    .line 100
    iget p0, p0, Landroidx/recyclerview/widget/b;->o:I

    .line 101
    .line 102
    sub-int/2addr p0, v0

    .line 103
    div-int/lit8 p0, p0, 0x2

    .line 104
    .line 105
    add-int/2addr p2, v1

    .line 106
    add-int/2addr v0, p0

    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, La/hhe0;

    .line 112
    .line 113
    iget-object v2, v2, La/hhe0;->b:Landroid/graphics/Rect;

    .line 114
    .line 115
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 116
    .line 117
    add-int/2addr v1, v3

    .line 118
    iget v3, v2, Landroid/graphics/Rect;->top:I

    .line 119
    .line 120
    add-int/2addr p0, v3

    .line 121
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 122
    .line 123
    sub-int/2addr p2, v3

    .line 124
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 125
    .line 126
    sub-int/2addr v0, v2

    .line 127
    invoke-virtual {p1, v1, p0, p2, v0}, Landroid/view/View;->layout(IIII)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_4
    :goto_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->s0(La/msj;La/the0;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    :goto_1
    return-void
.end method
