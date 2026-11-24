.class public final La/lyl;
.super Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;
.source "SourceFile"

# interfaces
.implements La/iyl;


# instance fields
.field public final o2:La/oyl;

.field public p2:La/wxl;

.field public q2:La/wyl;

.field public r2:La/uyl;

.field public s2:Ljava/util/List;

.field public final t2:La/pyl;

.field public u2:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-direct {p0, p1, v2, v0, v1}, Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lorg/xplatform/uikit/components/chips/DsChipsLinearLayoutManager;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lorg/xplatform/uikit/components/chips/DsChipsLinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, La/wxl;->j:La/wxl;

    .line 16
    .line 17
    iput-object p1, p0, La/lyl;->p2:La/wxl;

    .line 18
    .line 19
    sget-object p1, La/wyl;->a:La/wyl;

    .line 20
    .line 21
    iput-object p1, p0, La/lyl;->q2:La/wyl;

    .line 22
    .line 23
    sget-object p1, La/uyl;->a:La/uyl;

    .line 24
    .line 25
    iput-object p1, p0, La/lyl;->r2:La/uyl;

    .line 26
    .line 27
    sget-object v1, La/iun;->a:La/iun;

    .line 28
    .line 29
    iput-object v1, p0, La/lyl;->s2:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const v3, 0x7f07015a

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    new-instance v3, La/pyl;

    .line 43
    .line 44
    invoke-direct {v3, v1}, La/pyl;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object v3, p0, La/lyl;->t2:La/pyl;

    .line 48
    .line 49
    const v1, 0x7f0a048b

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1}, Landroid/view/View;->setId(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, La/oyl;

    .line 59
    .line 60
    sget-object v1, La/oyl;->j:La/ek5;

    .line 61
    .line 62
    invoke-direct {v0, v1}, La/q4;-><init>(La/dtb;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, v0, La/oyl;->h:La/uyl;

    .line 66
    .line 67
    const/4 p1, -0x1

    .line 68
    iput p1, v0, La/oyl;->i:I

    .line 69
    .line 70
    iput-object v0, p0, La/lyl;->o2:La/oyl;

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    iput-boolean p1, p0, La/lyl;->u2:Z

    .line 10
    .line 11
    return-void
.end method

.method public setChips(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/mxl;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v6, p0, La/lyl;->p2:La/wxl;

    .line 5
    .line 6
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v8, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v0, 0xa

    .line 12
    .line 13
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-direct {v8, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_e

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/mxl;

    .line 35
    .line 36
    iget-object v1, v0, La/mxl;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, v0, La/mxl;->b:La/fxl;

    .line 39
    .line 40
    if-eqz v2, :cond_d

    .line 41
    .line 42
    instance-of v3, v2, La/exl;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    sget-object v2, La/mwl;->a:La/mwl;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    instance-of v3, v2, La/cxl;

    .line 51
    .line 52
    if-nez v3, :cond_c

    .line 53
    .line 54
    instance-of v3, v2, La/axl;

    .line 55
    .line 56
    if-nez v3, :cond_b

    .line 57
    .line 58
    instance-of v3, v2, La/bxl;

    .line 59
    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    new-instance v2, La/jwl;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    instance-of v3, v2, La/dxl;

    .line 69
    .line 70
    if-eqz v3, :cond_d

    .line 71
    .line 72
    new-instance v3, La/lwl;

    .line 73
    .line 74
    check-cast v2, La/dxl;

    .line 75
    .line 76
    iget-object v2, v2, La/dxl;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-direct {v3, v2}, La/lwl;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    move-object v2, v3

    .line 82
    :goto_1
    iget-object v3, v0, La/mxl;->c:La/kxl;

    .line 83
    .line 84
    if-eqz v3, :cond_a

    .line 85
    .line 86
    instance-of v5, v3, La/jxl;

    .line 87
    .line 88
    if-eqz v5, :cond_6

    .line 89
    .line 90
    iget-object v3, v0, La/mxl;->d:La/zwl;

    .line 91
    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    instance-of v5, v3, La/xwl;

    .line 95
    .line 96
    if-eqz v5, :cond_2

    .line 97
    .line 98
    sget-object v3, La/fwl;->a:La/fwl;

    .line 99
    .line 100
    :goto_2
    move-object v4, v3

    .line 101
    goto :goto_3

    .line 102
    :cond_2
    instance-of v5, v3, La/ywl;

    .line 103
    .line 104
    if-eqz v5, :cond_3

    .line 105
    .line 106
    sget-object v3, La/gwl;->a:La/gwl;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_3
    iget-boolean v5, v0, La/mxl;->e:Z

    .line 110
    .line 111
    new-instance v0, La/twl;

    .line 112
    .line 113
    new-instance v7, La/xjl;

    .line 114
    .line 115
    const/16 v3, 0xc

    .line 116
    .line 117
    invoke-direct {v7, v3}, La/xjl;-><init>(B)V

    .line 118
    .line 119
    .line 120
    sget-object v3, La/rwl;->a:La/rwl;

    .line 121
    .line 122
    invoke-direct/range {v0 .. v7}, La/twl;-><init>(Ljava/lang/String;La/nwl;La/swl;La/hwl;ZLa/wxl;Lkotlin/jvm/functions/Function1;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_3
    instance-of p0, v3, La/wwl;

    .line 130
    .line 131
    if-nez p0, :cond_4

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_4
    throw v4

    .line 135
    :cond_5
    :goto_4
    invoke-static {}, La/t9f;->b()V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_6
    instance-of p0, v3, La/ixl;

    .line 140
    .line 141
    if-nez p0, :cond_9

    .line 142
    .line 143
    instance-of p0, v3, La/gxl;

    .line 144
    .line 145
    if-nez p0, :cond_8

    .line 146
    .line 147
    instance-of p0, v3, La/hxl;

    .line 148
    .line 149
    if-nez p0, :cond_7

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_7
    throw v4

    .line 153
    :cond_8
    throw v4

    .line 154
    :cond_9
    throw v4

    .line 155
    :cond_a
    :goto_5
    invoke-static {}, La/t9f;->b()V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_b
    throw v4

    .line 160
    :cond_c
    throw v4

    .line 161
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_e
    iput-object v8, p0, La/lyl;->s2:Ljava/util/List;

    .line 166
    .line 167
    iget-object p1, p0, La/lyl;->o2:La/oyl;

    .line 168
    .line 169
    iget-object v0, p1, La/q4;->e:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, La/yz3;

    .line 172
    .line 173
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 174
    .line 175
    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_f

    .line 180
    .line 181
    new-instance v0, La/a4e;

    .line 182
    .line 183
    const/16 v1, 0x1a

    .line 184
    .line 185
    invoke-direct {v0, p0, v8, v1}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v8, v0}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 189
    .line 190
    .line 191
    :cond_f
    new-instance v0, La/edl;

    .line 192
    .line 193
    const/16 v1, 0xb

    .line 194
    .line 195
    invoke-direct {v0, p0, v1}, La/edl;-><init>(Ljava/lang/Object;B)V

    .line 196
    .line 197
    .line 198
    iput-object v0, p1, La/oyl;->f:La/edl;

    .line 199
    .line 200
    return-void
.end method

.method public setCustomHorizontalMargin(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/lyl;->t2:La/pyl;

    .line 2
    .line 3
    iput p1, v0, La/pyl;->a:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setLoading(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, La/lyl;->o2:La/oyl;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    new-instance p1, Lkotlin/ranges/IntRange;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {p1, v2, v1, v2}, Lkotlin/ranges/a;-><init>(III)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    move-object v2, p1

    .line 28
    check-cast v2, La/kkx;

    .line 29
    .line 30
    iget-boolean v2, v2, La/kkx;->c:Z

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    move-object v2, p1

    .line 35
    check-cast v2, La/bkx;

    .line 36
    .line 37
    invoke-virtual {v2}, La/bkx;->nextInt()I

    .line 38
    .line 39
    .line 40
    new-instance v2, La/txl;

    .line 41
    .line 42
    iget-object v3, p0, La/lyl;->q2:La/wyl;

    .line 43
    .line 44
    invoke-direct {v2, v3}, La/txl;-><init>(La/wyl;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0, v1}, La/q4;->G(Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    iget-object p1, p0, La/lyl;->s2:Ljava/util/List;

    .line 56
    .line 57
    iget-object v1, v0, La/q4;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, La/yz3;

    .line 60
    .line 61
    iget-object v1, v1, La/yz3;->f:Ljava/util/List;

    .line 62
    .line 63
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    new-instance v1, La/kyl;

    .line 70
    .line 71
    invoke-direct {v1, p0, p1}, La/kyl;-><init>(La/lyl;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1, v1}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void
.end method

.method public setOnChipClickListener(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "La/mxl;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, La/lyl;->o2:La/oyl;

    .line 2
    .line 3
    iput-object p1, p0, La/oyl;->g:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    return-void
.end method

.method public setSelectionMode(La/uyl;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/lyl;->o2:La/oyl;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, La/oyl;->h:La/uyl;

    .line 13
    .line 14
    iput-object p1, p0, La/lyl;->r2:La/uyl;

    .line 15
    .line 16
    return-void
.end method

.method public setSkeletonStyle(La/wyl;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lyl;->q2:La/wyl;

    .line 5
    .line 6
    return-void
.end method

.method public setStyle(La/wxl;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lyl;->p2:La/wxl;

    .line 5
    .line 6
    return-void
.end method
