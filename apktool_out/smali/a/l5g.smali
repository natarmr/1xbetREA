.class public final La/l5g;
.super La/ahe0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l5g;->a:B

    iput-object p1, p0, La/l5g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/l5g;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/l5g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    check-cast p0, La/hhk;

    .line 10
    .line 11
    invoke-virtual {p0}, La/hhk;->g()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_2
    check-cast p0, La/nj50;

    .line 16
    .line 17
    iget-object v0, p0, La/nj50;->c:La/yge0;

    .line 18
    .line 19
    invoke-virtual {v0}, La/yge0;->d()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, La/nj50;->e:I

    .line 24
    .line 25
    iget-object p0, p0, La/nj50;->d:La/xzp;

    .line 26
    .line 27
    iget-object v0, p0, La/xzp;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, La/oqd;

    .line 30
    .line 31
    invoke-virtual {v0}, La/yge0;->g()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/xzp;->f()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    check-cast p0, La/lrd;

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-virtual {p0, v0}, La/lrd;->b(Z)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_4
    check-cast p0, La/uii;

    .line 46
    .line 47
    invoke-virtual {p0}, La/uii;->L()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_5
    check-cast p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;

    .line 52
    .line 53
    iget-object v0, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->p2:Landroidx/viewpager2/widget/ViewPager2;

    .line 54
    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    invoke-virtual {v0}, La/yge0;->d()I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 v0, 0x0

    .line 69
    :goto_0
    iput v0, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->x2:I

    .line 70
    .line 71
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/page_control/DsPageControl;->H0()V

    .line 72
    .line 73
    .line 74
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(II)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/l5g;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/l5g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    check-cast v1, La/hhk;

    .line 10
    .line 11
    invoke-virtual {v1}, La/hhk;->g()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_2
    check-cast v1, La/nj50;

    .line 16
    .line 17
    iget-object p0, v1, La/nj50;->d:La/xzp;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, La/xzp;->m(La/nj50;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object p0, p0, La/xzp;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/oqd;

    .line 26
    .line 27
    add-int/2addr p1, v0

    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, p1, p2, v0}, La/yge0;->j(IILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_3
    invoke-virtual {p0}, La/l5g;->a()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_4
    check-cast v1, La/uii;

    .line 38
    .line 39
    invoke-virtual {v1}, La/uii;->L()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_5
    check-cast v1, La/n5g;

    .line 44
    .line 45
    sget-object p0, La/n5g;->S1:La/qud;

    .line 46
    .line 47
    invoke-virtual {v1}, La/n5g;->G0()La/o5g;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget-object p0, p0, La/o5g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public c(IILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/l5g;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/l5g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2, p3}, La/ahe0;->c(IILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :sswitch_0
    check-cast v1, La/hhk;

    .line 13
    .line 14
    invoke-virtual {v1}, La/hhk;->g()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :sswitch_1
    check-cast v1, La/nj50;

    .line 19
    .line 20
    iget-object p0, v1, La/nj50;->d:La/xzp;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, La/xzp;->m(La/nj50;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object p0, p0, La/xzp;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, La/oqd;

    .line 29
    .line 30
    add-int/2addr p1, v0

    .line 31
    invoke-virtual {p0, p1, p2, p3}, La/yge0;->j(IILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :sswitch_2
    invoke-virtual {p0}, La/l5g;->a()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_2
        0x4 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method public d(II)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/l5g;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/l5g;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_0
    check-cast v3, La/hhk;

    .line 12
    .line 13
    invoke-virtual {v3}, La/hhk;->g()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_1
    check-cast v3, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;

    .line 18
    .line 19
    iget-object p0, v3, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;->g1:Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    new-instance v0, La/zlw;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1, p2, v3}, La/zlw;-><init>(Landroid/view/View;IILorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/StickyHeaderLayoutManager;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    if-ne p2, v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-nez p0, :cond_0

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void

    .line 46
    :pswitch_3
    check-cast v3, La/gl80;

    .line 47
    .line 48
    iget p1, v3, La/yge0;->c:I

    .line 49
    .line 50
    const/4 p2, 0x3

    .line 51
    if-ne p1, p2, :cond_1

    .line 52
    .line 53
    iget-boolean p1, v3, La/gl80;->d:Z

    .line 54
    .line 55
    if-nez p1, :cond_1

    .line 56
    .line 57
    invoke-virtual {v3, v2}, La/gl80;->x(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {v3, p0}, La/yge0;->y(La/ahe0;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_4
    check-cast v3, La/nj50;

    .line 65
    .line 66
    iget p0, v3, La/nj50;->e:I

    .line 67
    .line 68
    add-int/2addr p0, p2

    .line 69
    iput p0, v3, La/nj50;->e:I

    .line 70
    .line 71
    iget-object p0, v3, La/nj50;->d:La/xzp;

    .line 72
    .line 73
    invoke-virtual {p0, v3}, La/xzp;->m(La/nj50;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v1, p0, La/xzp;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, La/oqd;

    .line 80
    .line 81
    add-int/2addr p1, v0

    .line 82
    invoke-virtual {v1, p1, p2}, La/yge0;->k(II)V

    .line 83
    .line 84
    .line 85
    iget p1, v3, La/nj50;->e:I

    .line 86
    .line 87
    if-lez p1, :cond_2

    .line 88
    .line 89
    iget-object p1, v3, La/nj50;->c:La/yge0;

    .line 90
    .line 91
    iget p1, p1, La/yge0;->c:I

    .line 92
    .line 93
    const/4 p2, 0x2

    .line 94
    if-ne p1, p2, :cond_2

    .line 95
    .line 96
    invoke-virtual {p0}, La/xzp;->f()V

    .line 97
    .line 98
    .line 99
    :cond_2
    return-void

    .line 100
    :pswitch_5
    invoke-virtual {p0}, La/l5g;->a()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :pswitch_6
    check-cast v3, La/uii;

    .line 105
    .line 106
    invoke-virtual {v3}, La/uii;->L()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_7
    check-cast v3, Lorg/xplatform/uikit/components/page_control/DsPageControl;

    .line 111
    .line 112
    iget-object p0, v3, Lorg/xplatform/uikit/components/page_control/DsPageControl;->p2:Landroidx/viewpager2/widget/ViewPager2;

    .line 113
    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-eqz p0, :cond_3

    .line 121
    .line 122
    invoke-virtual {p0}, La/yge0;->d()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    :cond_3
    iput v1, v3, Lorg/xplatform/uikit/components/page_control/DsPageControl;->x2:I

    .line 127
    .line 128
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/page_control/DsPageControl;->H0()V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(II)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/l5g;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/l5g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    check-cast v1, La/hhk;

    .line 10
    .line 11
    invoke-virtual {v1}, La/hhk;->g()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_2
    check-cast v1, La/nj50;

    .line 16
    .line 17
    iget-object p0, v1, La/nj50;->d:La/xzp;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, La/xzp;->m(La/nj50;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object p0, p0, La/xzp;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/oqd;

    .line 26
    .line 27
    add-int/2addr p1, v0

    .line 28
    add-int/2addr p2, v0

    .line 29
    invoke-virtual {p0, p1, p2}, La/yge0;->i(II)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_3
    invoke-virtual {p0}, La/l5g;->a()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_4
    check-cast v1, La/uii;

    .line 38
    .line 39
    invoke-virtual {v1}, La/uii;->L()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public f(II)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/l5g;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/l5g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    return-void

    .line 9
    :pswitch_1
    check-cast v1, La/hhk;

    .line 10
    .line 11
    invoke-virtual {v1}, La/hhk;->g()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_2
    check-cast v1, La/nj50;

    .line 16
    .line 17
    iget p0, v1, La/nj50;->e:I

    .line 18
    .line 19
    sub-int/2addr p0, p2

    .line 20
    iput p0, v1, La/nj50;->e:I

    .line 21
    .line 22
    iget-object p0, v1, La/nj50;->d:La/xzp;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, La/xzp;->m(La/nj50;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/xzp;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, La/oqd;

    .line 31
    .line 32
    add-int/2addr p1, v0

    .line 33
    invoke-virtual {v2, p1, p2}, La/yge0;->l(II)V

    .line 34
    .line 35
    .line 36
    iget p1, v1, La/nj50;->e:I

    .line 37
    .line 38
    const/4 p2, 0x1

    .line 39
    if-ge p1, p2, :cond_0

    .line 40
    .line 41
    iget-object p1, v1, La/nj50;->c:La/yge0;

    .line 42
    .line 43
    iget p1, p1, La/yge0;->c:I

    .line 44
    .line 45
    const/4 p2, 0x2

    .line 46
    if-ne p1, p2, :cond_0

    .line 47
    .line 48
    invoke-virtual {p0}, La/xzp;->f()V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void

    .line 52
    :pswitch_3
    invoke-virtual {p0}, La/l5g;->a()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_4
    check-cast v1, La/uii;

    .line 57
    .line 58
    invoke-virtual {v1}, La/uii;->L()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_5
    check-cast v1, Lorg/xplatform/uikit/components/page_control/DsPageControl;

    .line 63
    .line 64
    iget-object p0, v1, Lorg/xplatform/uikit/components/page_control/DsPageControl;->p2:Landroidx/viewpager2/widget/ViewPager2;

    .line 65
    .line 66
    if-eqz p0, :cond_1

    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eqz p0, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0}, La/yge0;->d()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const/4 p0, 0x0

    .line 80
    :goto_0
    iput p0, v1, Lorg/xplatform/uikit/components/page_control/DsPageControl;->x2:I

    .line 81
    .line 82
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/page_control/DsPageControl;->H0()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public g()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/l5g;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/l5g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/nj50;

    .line 10
    .line 11
    iget-object p0, p0, La/nj50;->d:La/xzp;

    .line 12
    .line 13
    invoke-virtual {p0}, La/xzp;->f()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method
