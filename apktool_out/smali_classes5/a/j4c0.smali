.class public final La/j4c0;
.super La/q4;
.source "SourceFile"


# instance fields
.field public final f:La/m0x;

.field public g:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(La/m0x;)V
    .locals 1

    .line 1
    sget-object v0, La/ek5;->f:La/ek5;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/q4;-><init>(La/dtb;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/j4c0;->f:La/m0x;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, La/j4c0;->g:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final n(La/xhe0;I)V
    .locals 12

    .line 1
    check-cast p1, La/i4c0;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/hvw;

    .line 8
    .line 9
    iget-object p1, p1, La/i4c0;->u:La/m4c0;

    .line 10
    .line 11
    iget-object v1, p1, La/m4c0;->f:Landroid/view/View;

    .line 12
    .line 13
    iget-object v2, p1, La/m4c0;->d:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, La/j4c0;->f:La/m0x;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    instance-of v4, v0, La/o4c0;

    .line 24
    .line 25
    const/16 v5, 0x8

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    move-object v6, v0

    .line 30
    check-cast v6, La/o4c0;

    .line 31
    .line 32
    iget-object v7, v6, La/o4c0;->c:La/n0x;

    .line 33
    .line 34
    iget-object v8, v6, La/o4c0;->d:Lkotlin/jvm/functions/Function2;

    .line 35
    .line 36
    iget-object v9, v6, La/o4c0;->e:Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    new-instance v10, La/zga0;

    .line 39
    .line 40
    const/16 v11, 0x1a

    .line 41
    .line 42
    invoke-direct {v10, v8, p1, v11}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v7, v3, v10, v9}, Lorg/xplatform/uikit/components/views/LoadableImageView;->a(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 46
    .line 47
    .line 48
    iget-object v3, v6, La/o4c0;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p1, v3}, La/m4c0;->setLabel$impl(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 54
    .line 55
    .line 56
    :cond_0
    instance-of v3, v0, La/bqj0;

    .line 57
    .line 58
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    move v6, v5

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move v6, v1

    .line 67
    :goto_0
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object v2, p1, La/m4c0;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 71
    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    move v6, v5

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    move v6, v1

    .line 77
    :goto_1
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    iget-object v2, p1, La/m4c0;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 81
    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    move v5, v1

    .line 85
    :cond_3
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    if-eqz v3, :cond_4

    .line 89
    .line 90
    invoke-static {p1}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-static {p1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 95
    .line 96
    .line 97
    :goto_2
    if-eqz v4, :cond_5

    .line 98
    .line 99
    new-instance v2, La/h4c0;

    .line 100
    .line 101
    invoke-direct {v2, p0, v0, p2, v1}, La/h4c0;-><init>(La/q4;Ljava/lang/Object;IB)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    .line 106
    .line 107
    :cond_5
    return-void
.end method

.method public final o(La/xhe0;ILjava/util/List;)V
    .locals 6

    .line 1
    check-cast p1, La/i4c0;

    .line 2
    .line 3
    iget-object v0, p1, La/i4c0;->u:La/m4c0;

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_5

    .line 13
    .line 14
    new-instance p1, La/sx3;

    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    invoke-direct {p1, p3, p2}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    new-instance p2, La/wyb0;

    .line 21
    .line 22
    const/4 p3, 0x7

    .line 23
    invoke-direct {p2, p3}, La/wyb0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance p2, La/eoh0;

    .line 31
    .line 32
    const/16 p3, 0x17

    .line 33
    .line 34
    invoke-direct {p2, p3}, La/eoh0;-><init>(B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, La/lgi0;->c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance p2, La/bkq;

    .line 42
    .line 43
    invoke-direct {p2, p1}, La/bkq;-><init>(La/ckq;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    :goto_0
    invoke-virtual {p2}, La/bkq;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p2}, La/bkq;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    instance-of p3, p1, La/q4c0;

    .line 60
    .line 61
    if-eqz p3, :cond_2

    .line 62
    .line 63
    check-cast p1, La/q4c0;

    .line 64
    .line 65
    iget-object p1, p1, La/q4c0;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, La/m4c0;->setLabel$impl(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    instance-of p3, p1, La/r4c0;

    .line 72
    .line 73
    if-eqz p3, :cond_3

    .line 74
    .line 75
    check-cast p1, La/r4c0;

    .line 76
    .line 77
    iget-object p3, p1, La/r4c0;->a:La/n0x;

    .line 78
    .line 79
    iget-object v1, p1, La/r4c0;->b:Lkotlin/jvm/functions/Function2;

    .line 80
    .line 81
    iget-object p1, p1, La/r4c0;->c:Lkotlin/jvm/functions/Function1;

    .line 82
    .line 83
    iget-object v2, p0, La/j4c0;->f:La/m0x;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v3, v0, La/m4c0;->d:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 89
    .line 90
    new-instance v4, La/zga0;

    .line 91
    .line 92
    const/16 v5, 0x1a

    .line 93
    .line 94
    invoke-direct {v4, v1, v0, v5}, La/zga0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, p3, v2, v4, p1}, Lorg/xplatform/uikit/components/views/LoadableImageView;->a(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    instance-of p1, p1, La/p4c0;

    .line 102
    .line 103
    if-eqz p1, :cond_0

    .line 104
    .line 105
    iget-object p1, v0, La/m4c0;->f:Landroid/view/View;

    .line 106
    .line 107
    const/16 p3, 0x8

    .line 108
    .line 109
    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    return-void

    .line 114
    :cond_5
    invoke-virtual {p0, p1, p2}, La/j4c0;->n(La/xhe0;I)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 0

    .line 1
    new-instance p0, La/i4c0;

    .line 2
    .line 3
    new-instance p2, La/m4c0;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p2, p1}, La/m4c0;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p2}, La/i4c0;-><init>(La/m4c0;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method
