.class public final La/ht8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ht8;->a:B

    iput-object p1, p0, La/ht8;->c:Landroid/widget/FrameLayout;

    iput-boolean p2, p0, La/ht8;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/ht8;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/ht8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean v2, p0, La/ht8;->b:Z

    .line 5
    .line 6
    iget-object p0, p0, La/ht8;->c:Landroid/widget/FrameLayout;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/x4d;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    sget-object p1, La/aoo0;->d:La/aoo0;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object p1, La/aoo0;->b:La/aoo0;

    .line 22
    .line 23
    :goto_0
    iput-object p1, p0, La/x4d;->m:La/aoo0;

    .line 24
    .line 25
    iget-object p0, p0, La/x4d;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/16 v1, 0x8

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    check-cast p0, La/it8;

    .line 37
    .line 38
    iget-object p0, p0, La/it8;->n:La/gt8;

    .line 39
    .line 40
    if-eqz p0, :cond_9

    .line 41
    .line 42
    check-cast p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 43
    .line 44
    const/4 p1, 0x1

    .line 45
    iput-boolean p1, p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->o:Z

    .line 46
    .line 47
    iput-boolean v1, p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->l1:Z

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->k1:Landroid/graphics/Rect;

    .line 51
    .line 52
    iget-object v3, p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->p:La/hs8;

    .line 53
    .line 54
    if-eqz v3, :cond_9

    .line 55
    .line 56
    if-nez v2, :cond_2

    .line 57
    .line 58
    iget-object p0, p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->m:La/lk50;

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move-object p0, v0

    .line 62
    :goto_2
    check-cast v3, La/zas0;

    .line 63
    .line 64
    iget-object v2, v3, La/zas0;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, La/vju0;

    .line 67
    .line 68
    iget-object v3, v2, La/vju0;->E:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 69
    .line 70
    iget-object v4, v2, La/vju0;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 71
    .line 72
    if-eqz v3, :cond_3

    .line 73
    .line 74
    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    goto :goto_3

    .line 79
    :cond_3
    move v5, v1

    .line 80
    :goto_3
    if-eqz v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->h1()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    :cond_4
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 87
    .line 88
    invoke-direct {v3, v5, v1, p1}, Lkotlin/ranges/a;-><init>(III)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :cond_5
    :goto_4
    move-object v3, v1

    .line 96
    check-cast v3, La/kkx;

    .line 97
    .line 98
    iget-boolean v3, v3, La/kkx;->c:Z

    .line 99
    .line 100
    if-eqz v3, :cond_8

    .line 101
    .line 102
    move-object v3, v1

    .line 103
    check-cast v3, La/bkx;

    .line 104
    .line 105
    invoke-virtual {v3}, La/bkx;->nextInt()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v4, :cond_6

    .line 110
    .line 111
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->O(I)La/xhe0;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    goto :goto_5

    .line 116
    :cond_6
    move-object v5, v0

    .line 117
    :goto_5
    if-eqz v5, :cond_7

    .line 118
    .line 119
    iget-object v6, v5, La/xhe0;->a:Landroid/view/View;

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_7
    move-object v6, v0

    .line 123
    :goto_6
    instance-of v5, v5, La/vju0;

    .line 124
    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    if-eqz v6, :cond_5

    .line 128
    .line 129
    if-eqz v4, :cond_5

    .line 130
    .line 131
    invoke-static {v6}, La/dc3;->a(Landroid/view/View;)La/dc3;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    iget-object v5, v5, La/dc3;->d:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v5, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 138
    .line 139
    invoke-static {v4, v5, v3}, La/vju0;->v(Landroidx/recyclerview/widget/RecyclerView;Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)V

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_8
    if-eqz p0, :cond_9

    .line 144
    .line 145
    invoke-virtual {v2, p0, p1}, La/vju0;->x(La/lk50;Z)V

    .line 146
    .line 147
    .line 148
    :cond_9
    return-void

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/ht8;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/ht8;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/ht8;->c:Landroid/widget/FrameLayout;

    .line 10
    .line 11
    check-cast p0, La/x4d;

    .line 12
    .line 13
    iget-object p0, p0, La/x4d;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    :pswitch_0
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
