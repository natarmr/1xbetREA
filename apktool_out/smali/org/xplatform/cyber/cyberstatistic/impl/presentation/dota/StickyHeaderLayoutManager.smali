.class public final Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager$SavedState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "a/l5g",
        "SavedState",
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


# instance fields
.field public final g1:Landroidx/recyclerview/widget/RecyclerView;

.field public final h1:La/l5g;

.field public i1:La/yge0;

.field public j1:Ljava/util/ArrayList;

.field public k1:Landroid/graphics/Bitmap;

.field public l1:Landroid/widget/FrameLayout;

.field public m1:I

.field public n1:I

.field public o1:I


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-direct {p0, v0, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->g1:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    new-instance p1, La/l5g;

    .line 13
    .line 14
    const/4 v0, 0x7

    .line 15
    invoke-direct {p1, p0, v0}, La/l5g;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->h1:La/l5g;

    .line 19
    .line 20
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 26
    .line 27
    const/4 p1, -0x1

    .line 28
    iput p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->m1:I

    .line 29
    .line 30
    iput p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->n1:I

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final C1(La/msj;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView;->X(Landroid/view/View;)La/xhe0;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v1, p1, La/msj;->h:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v7, v1

    .line 15
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    iget-object v8, v2, La/xhe0;->a:Landroid/view/View;

    .line 20
    .line 21
    iget-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->e:La/fp;

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    invoke-virtual {v1, p2, v9}, La/fp;->u(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ltz v3, :cond_4

    .line 29
    .line 30
    iget-object v1, v7, Landroidx/recyclerview/widget/RecyclerView;->m:La/yge0;

    .line 31
    .line 32
    invoke-virtual {v1}, La/yge0;->d()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-ge v3, v1, :cond_4

    .line 37
    .line 38
    const-wide v5, 0x7fffffffffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    move-object v1, p1

    .line 44
    move v4, p2

    .line 45
    invoke-virtual/range {v1 .. v6}, La/msj;->n(La/xhe0;IIJ)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, La/hhe0;

    .line 59
    .line 60
    invoke-virtual {v8, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v7, p1}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-nez p2, :cond_1

    .line 69
    .line 70
    invoke-virtual {v7, p1}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, La/hhe0;

    .line 75
    .line 76
    invoke-virtual {v8, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    check-cast p1, La/hhe0;

    .line 81
    .line 82
    :goto_0
    const/4 p2, 0x1

    .line 83
    iput-boolean p2, p1, La/hhe0;->c:Z

    .line 84
    .line 85
    iput-object v2, p1, La/hhe0;->a:La/xhe0;

    .line 86
    .line 87
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-nez v1, :cond_2

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    move p2, v9

    .line 95
    :goto_1
    iput-boolean p2, p1, La/hhe0;->d:Z

    .line 96
    .line 97
    iput v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->m1:I

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/b;->b0(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    iget p1, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    invoke-virtual {v0, v9, v9, p1, p2}, Landroid/view/View;->layout(IIII)V

    .line 109
    .line 110
    .line 111
    iget p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->n1:I

    .line 112
    .line 113
    const/4 p2, -0x1

    .line 114
    if-eq p1, p2, :cond_6

    .line 115
    .line 116
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_3

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_3

    .line 129
    .line 130
    iget p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->n1:I

    .line 131
    .line 132
    if-eq p1, p2, :cond_6

    .line 133
    .line 134
    iget v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->o1:I

    .line 135
    .line 136
    invoke-virtual {p0, p1, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->w1(II)V

    .line 137
    .line 138
    .line 139
    iput p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->n1:I

    .line 140
    .line 141
    const/high16 p1, -0x80000000

    .line 142
    .line 143
    iput p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->o1:I

    .line 144
    .line 145
    return-void

    .line 146
    :cond_3
    new-instance p1, La/w23;

    .line 147
    .line 148
    const/16 p2, 0x10

    .line 149
    .line 150
    invoke-direct {p1, p0, p2}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_4
    move v4, p2

    .line 158
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 159
    .line 160
    const-string p1, "(offset:"

    .line 161
    .line 162
    const-string p2, ").state:"

    .line 163
    .line 164
    const-string v0, "Inconsistency detected. Invalid item position "

    .line 165
    .line 166
    invoke-static {v0, v4, p1, p2, v3}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iget-object p2, v7, Landroidx/recyclerview/widget/RecyclerView;->H1:La/the0;

    .line 171
    .line 172
    invoke-virtual {p2}, La/the0;->b()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p0

    .line 194
    :cond_5
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    const-string p1, "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"

    .line 199
    .line 200
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    :cond_6
    return-void
.end method

.method public final D1(La/msj;IZ)V
    .locals 4

    .line 1
    invoke-virtual {p1, p2}, La/msj;->e(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/widget/FrameLayout;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/widget/FrameLayout;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iput-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/b;->l(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/b;->b0(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    iget v1, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    if-ne v1, v2, :cond_3

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, -0x1

    .line 47
    if-eq v1, v2, :cond_3

    .line 48
    .line 49
    invoke-static {v0}, Landroidx/recyclerview/widget/RecyclerView;->X(Landroid/view/View;)La/xhe0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/16 v1, 0x80

    .line 54
    .line 55
    invoke-virtual {v0, v1}, La/xhe0;->b(I)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 59
    .line 60
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->g:La/trm0;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, La/trm0;->p(La/xhe0;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->F1()V

    .line 66
    .line 67
    .line 68
    iput p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->m1:I

    .line 69
    .line 70
    :goto_1
    if-nez p3, :cond_2

    .line 71
    .line 72
    iget-object p3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 73
    .line 74
    if-eqz p3, :cond_2

    .line 75
    .line 76
    invoke-static {p3}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    if-ne p3, p2, :cond_2

    .line 81
    .line 82
    return-void

    .line 83
    :cond_2
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->C1(La/msj;I)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_3
    iget-object p0, p0, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->H()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string p1, "View should be fully attached to be ignored"

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final E1(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p0, p1}, La/q3d;->f(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ltz p0, :cond_0

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, -0x1

    .line 15
    return p0
.end method

.method public final F1()V
    .locals 9

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->k1:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-float v2, v2

    .line 15
    iget v3, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 16
    .line 17
    int-to-float v3, v3

    .line 18
    div-float/2addr v2, v3

    .line 19
    const/4 v3, 0x2

    .line 20
    new-array v3, v3, [I

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    aget v5, v3, v4

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    aget v3, v3, v6

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-lez v6, :cond_6

    .line 40
    .line 41
    if-gtz v7, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    int-to-float v3, v3

    .line 45
    mul-float/2addr v3, v2

    .line 46
    float-to-int v3, v3

    .line 47
    int-to-float v7, v7

    .line 48
    mul-float/2addr v7, v2

    .line 49
    float-to-int v2, v7

    .line 50
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    invoke-static {v5, v4, v7}, La/l1e0;->d(III)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v3, v4, v8}, La/l1e0;->d(III)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    sub-int/2addr v7, v5

    .line 67
    if-gez v7, :cond_2

    .line 68
    .line 69
    move v7, v4

    .line 70
    :cond_2
    sub-int/2addr v8, v3

    .line 71
    if-gez v8, :cond_3

    .line 72
    .line 73
    move v8, v4

    .line 74
    :cond_3
    invoke-static {v6, v4, v7}, La/l1e0;->d(III)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-static {v2, v4, v8}, La/l1e0;->d(III)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-lez v6, :cond_5

    .line 83
    .line 84
    if-gtz v2, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-static {v1, v5, v3, v6, v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    :cond_5
    :goto_0
    iget-object p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->g1:Landroidx/recyclerview/widget/RecyclerView;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 104
    .line 105
    invoke-direct {v2, p0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 109
    .line 110
    .line 111
    :cond_6
    :goto_1
    return-void
.end method

.method public final G1(La/msj;Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, -0x1

    .line 9
    if-nez v0, :cond_12

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_8

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v3, 0x0

    .line 24
    :goto_0
    const/4 v4, 0x0

    .line 25
    if-ge v3, v0, :cond_3

    .line 26
    .line 27
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-nez v5, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    check-cast v6, La/hhe0;

    .line 42
    .line 43
    iget-object v7, v6, La/hhe0;->a:La/xhe0;

    .line 44
    .line 45
    invoke-virtual {v7}, La/xhe0;->k()Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-nez v7, :cond_2

    .line 50
    .line 51
    iget-object v7, v6, La/hhe0;->a:La/xhe0;

    .line 52
    .line 53
    invoke-virtual {v7}, La/xhe0;->i()Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-nez v7, :cond_2

    .line 58
    .line 59
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    int-to-float v7, v7

    .line 64
    invoke-virtual {v5}, Landroid/view/View;->getTranslationY()F

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    sub-float/2addr v7, v8

    .line 69
    cmpl-float v7, v7, v4

    .line 70
    .line 71
    if-ltz v7, :cond_2

    .line 72
    .line 73
    new-instance v0, La/prs0;

    .line 74
    .line 75
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    iget-object v6, v6, La/hhe0;->a:La/xhe0;

    .line 80
    .line 81
    invoke-virtual {v6}, La/xhe0;->d()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-direct {v0, v5, v3, v6}, La/prs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    move-object v0, v1

    .line 97
    :goto_2
    if-nez v0, :cond_4

    .line 98
    .line 99
    iget-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 100
    .line 101
    if-eqz p1, :cond_13

    .line 102
    .line 103
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->m1:I

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/b;->D0(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    iput-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    iget-object v3, v0, La/prs0;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v3, Landroid/view/View;

    .line 114
    .line 115
    iget-object v5, v0, La/prs0;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v5, Ljava/lang/Number;

    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    iget-object v0, v0, La/prs0;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    iget-object v6, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-static {v6, v7}, La/q3d;->f(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-ltz v6, :cond_5

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 145
    .line 146
    neg-int v6, v6

    .line 147
    if-lez v6, :cond_6

    .line 148
    .line 149
    add-int/lit8 v6, v6, -0x1

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    move v6, v2

    .line 153
    :goto_3
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    if-eq v6, v2, :cond_7

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_7
    move-object v7, v1

    .line 161
    :goto_4
    if-eqz v7, :cond_8

    .line 162
    .line 163
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    iget-object v8, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    check-cast v7, Ljava/lang/Number;

    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    goto :goto_5

    .line 180
    :cond_8
    move v7, v2

    .line 181
    :goto_5
    iget-object v8, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    add-int/lit8 v6, v6, 0x1

    .line 188
    .line 189
    if-le v8, v6, :cond_9

    .line 190
    .line 191
    iget-object v8, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    check-cast v6, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    goto :goto_6

    .line 204
    :cond_9
    move v6, v2

    .line 205
    :goto_6
    if-eq v7, v2, :cond_11

    .line 206
    .line 207
    if-ne v7, v0, :cond_a

    .line 208
    .line 209
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    int-to-float v8, v8

    .line 214
    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    add-float/2addr v3, v8

    .line 219
    cmpg-float v3, v3, v4

    .line 220
    .line 221
    if-gez v3, :cond_11

    .line 222
    .line 223
    :cond_a
    add-int/lit8 v3, v7, 0x1

    .line 224
    .line 225
    if-eq v6, v3, :cond_11

    .line 226
    .line 227
    iget-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 228
    .line 229
    if-eqz v3, :cond_c

    .line 230
    .line 231
    iget-object v8, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->i1:La/yge0;

    .line 232
    .line 233
    if-eqz v8, :cond_b

    .line 234
    .line 235
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->X(Landroid/view/View;)La/xhe0;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    iget v9, v9, La/xhe0;->f:I

    .line 240
    .line 241
    invoke-virtual {v8, v7}, La/yge0;->f(I)I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    if-ne v9, v8, :cond_b

    .line 246
    .line 247
    if-eqz p2, :cond_d

    .line 248
    .line 249
    invoke-static {v3}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 250
    .line 251
    .line 252
    move-result p2

    .line 253
    if-eq p2, v7, :cond_d

    .line 254
    .line 255
    invoke-virtual {p0, p1, v7}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->C1(La/msj;I)V

    .line 256
    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_b
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->m1:I

    .line 260
    .line 261
    iget-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 262
    .line 263
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/b;->D0(Landroid/view/View;)V

    .line 264
    .line 265
    .line 266
    iput-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 267
    .line 268
    invoke-virtual {p0, p1, v7, p2}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->D1(La/msj;IZ)V

    .line 269
    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_c
    invoke-virtual {p0, p1, v7, p2}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->D1(La/msj;IZ)V

    .line 273
    .line 274
    .line 275
    :cond_d
    :goto_7
    if-eq v6, v2, :cond_e

    .line 276
    .line 277
    sub-int/2addr v6, v0

    .line 278
    add-int/2addr v6, v5

    .line 279
    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    :cond_e
    iget-object p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 284
    .line 285
    if-eqz p0, :cond_13

    .line 286
    .line 287
    if-eqz v1, :cond_f

    .line 288
    .line 289
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 293
    .line 294
    .line 295
    :cond_f
    invoke-virtual {p0, v4}, Landroid/view/View;->setTranslationX(F)V

    .line 296
    .line 297
    .line 298
    if-eqz v1, :cond_10

    .line 299
    .line 300
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 304
    .line 305
    .line 306
    :cond_10
    invoke-virtual {p0, v4}, Landroid/view/View;->setTranslationY(F)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_11
    iget-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 311
    .line 312
    if-eqz p1, :cond_13

    .line 313
    .line 314
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->m1:I

    .line 315
    .line 316
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/b;->D0(Landroid/view/View;)V

    .line 317
    .line 318
    .line 319
    iput-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 320
    .line 321
    return-void

    .line 322
    :cond_12
    :goto_8
    iget-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 323
    .line 324
    if-eqz p1, :cond_13

    .line 325
    .line 326
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->m1:I

    .line 327
    .line 328
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/b;->D0(Landroid/view/View;)V

    .line 329
    .line 330
    .line 331
    iput-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 332
    .line 333
    :cond_13
    return-void
.end method

.method public final H0(I)V
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->w1(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final I0(ILa/msj;La/the0;)I
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/b;->a:La/iac;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, La/iac;->j(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/recyclerview/widget/b;->a:La/iac;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, La/iac;->c(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0(ILa/msj;La/the0;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object p3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    if-eqz p3, :cond_1

    .line 31
    .line 32
    const/4 v0, -0x1

    .line 33
    invoke-virtual {p0, p3, v0}, Landroidx/recyclerview/widget/b;->o(Landroid/view/View;I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    if-eqz p1, :cond_2

    .line 37
    .line 38
    const/4 p3, 0x0

    .line 39
    invoke-virtual {p0, p2, p3}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->G1(La/msj;Z)V

    .line 40
    .line 41
    .line 42
    :cond_2
    return p1
.end method

.method public final e0(La/yge0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->i1:La/yge0;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->h1:La/l5g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/yge0;->y(La/ahe0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->i1:La/yge0;

    .line 13
    .line 14
    invoke-virtual {p1, v1}, La/yge0;->v(La/ahe0;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->i1:La/yge0;

    .line 20
    .line 21
    iget-object p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final f0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->i1:La/yge0;

    .line 6
    .line 7
    iget-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->h1:La/l5g;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v1}, La/yge0;->y(La/ahe0;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->i1:La/yge0;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, La/yge0;->v(La/ahe0;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->i1:La/yge0;

    .line 24
    .line 25
    iget-object p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final h0(Landroid/view/View;ILa/msj;La/the0;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/b;->a:La/iac;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, La/iac;->j(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/recyclerview/widget/b;->a:La/iac;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, La/iac;->c(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->h0(Landroid/view/View;ILa/msj;La/the0;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    const/4 p3, -0x1

    .line 33
    invoke-virtual {p0, p2, p3}, Landroidx/recyclerview/widget/b;->o(Landroid/view/View;I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p1
.end method

.method public final s0(La/msj;La/the0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/b;->a:La/iac;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, La/iac;->j(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/recyclerview/widget/b;->a:La/iac;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, La/iac;->c(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->s0(La/msj;La/the0;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    invoke-virtual {p0, v0, v1}, Landroidx/recyclerview/widget/b;->o(Landroid/view/View;I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-boolean p2, p2, La/the0;->g:Z

    .line 36
    .line 37
    if-nez p2, :cond_2

    .line 38
    .line 39
    const/4 p2, 0x1

    .line 40
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->G1(La/msj;Z)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final u0(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager$SavedState;

    .line 6
    .line 7
    iget-object v0, p1, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager$SavedState;->a:Landroid/os/Parcelable;

    .line 8
    .line 9
    invoke-super {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->u0(Landroid/os/Parcelable;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager$SavedState;->b:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final v0()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager$SavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->v0()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, v1, p0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager$SavedState;-><init>(Landroid/os/Parcelable;Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final w1(II)V
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->n1:I

    .line 3
    .line 4
    const/high16 v1, -0x80000000

    .line 5
    .line 6
    iput v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->o1:I

    .line 7
    .line 8
    iget-object v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->j1:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-static {v2, v3}, La/q3d;->f(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ltz v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    neg-int v2, v2

    .line 24
    if-lez v2, :cond_1

    .line 25
    .line 26
    add-int/lit8 v2, v2, -0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move v2, v0

    .line 30
    :goto_0
    if-eq v2, v0, :cond_6

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->E1(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ne v3, v0, :cond_6

    .line 37
    .line 38
    add-int/lit8 v3, p1, -0x1

    .line 39
    .line 40
    invoke-virtual {p0, v3}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->E1(I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eq v3, v0, :cond_2

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_2
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    const/4 v0, 0x0

    .line 61
    :goto_1
    iget-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->l1:Landroid/widget/FrameLayout;

    .line 62
    .line 63
    if-eqz v3, :cond_5

    .line 64
    .line 65
    iget v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->m1:I

    .line 66
    .line 67
    invoke-virtual {p0, v3}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->E1(I)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ne v2, v3, :cond_5

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    if-eq p2, v1, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    const/4 p2, 0x0

    .line 79
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    add-int/2addr v0, p2

    .line 84
    invoke-super {p0, p1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->w1(II)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_5
    iput p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->n1:I

    .line 89
    .line 90
    iput p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->o1:I

    .line 91
    .line 92
    return-void

    .line 93
    :cond_6
    :goto_3
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->w1(II)V

    .line 94
    .line 95
    .line 96
    return-void
.end method
