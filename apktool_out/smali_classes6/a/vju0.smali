.class public final La/vju0;
.super La/xhe0;
.source "SourceFile"


# instance fields
.field public final A:Z

.field public final B:Lkotlin/jvm/functions/Function2;

.field public final C:Lkotlin/jvm/functions/Function0;

.field public final D:Z

.field public final E:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public final F:I

.field public final G:Landroid/graphics/Rect;

.field public H:Ljava/lang/ref/WeakReference;

.field public I:Ljava/lang/ref/WeakReference;

.field public final J:I

.field public K:I

.field public final L:La/zas0;

.field public final M:La/gz6;

.field public N:I

.field public final O:La/qmk0;

.field public P:La/ybl;

.field public final u:La/dc3;

.field public final v:Landroidx/recyclerview/widget/RecyclerView;

.field public final w:Ljava/util/HashMap;

.field public final x:Lkotlin/jvm/functions/Function2;

.field public final y:Lkotlin/jvm/functions/Function1;

.field public final z:Z


# direct methods
.method public constructor <init>(La/dc3;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/HashMap;Ljava/util/LinkedHashMap;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p7

    .line 8
    .line 9
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v4, v1, La/dc3;->b:Landroid/view/ViewGroup;

    .line 13
    .line 14
    check-cast v4, Landroid/widget/LinearLayout;

    .line 15
    .line 16
    invoke-direct {v0, v4}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, v0, La/vju0;->u:La/dc3;

    .line 20
    .line 21
    iput-object v2, v0, La/vju0;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    move-object/from16 v5, p3

    .line 24
    .line 25
    iput-object v5, v0, La/vju0;->w:Ljava/util/HashMap;

    .line 26
    .line 27
    move-object/from16 v5, p5

    .line 28
    .line 29
    iput-object v5, v0, La/vju0;->x:Lkotlin/jvm/functions/Function2;

    .line 30
    .line 31
    move-object/from16 v5, p6

    .line 32
    .line 33
    iput-object v5, v0, La/vju0;->y:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    iput-boolean v3, v0, La/vju0;->z:Z

    .line 36
    .line 37
    move/from16 v5, p8

    .line 38
    .line 39
    iput-boolean v5, v0, La/vju0;->A:Z

    .line 40
    .line 41
    move-object/from16 v5, p9

    .line 42
    .line 43
    iput-object v5, v0, La/vju0;->B:Lkotlin/jvm/functions/Function2;

    .line 44
    .line 45
    move-object/from16 v5, p10

    .line 46
    .line 47
    iput-object v5, v0, La/vju0;->C:Lkotlin/jvm/functions/Function0;

    .line 48
    .line 49
    move/from16 v5, p11

    .line 50
    .line 51
    iput-boolean v5, v0, La/vju0;->D:Z

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-object v2, v5

    .line 62
    :goto_0
    instance-of v6, v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 63
    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    move-object v5, v2

    .line 67
    check-cast v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 68
    .line 69
    :cond_1
    iput-object v5, v0, La/vju0;->E:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 70
    .line 71
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const v5, 0x7f0706b6

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    iput v2, v0, La/vju0;->F:I

    .line 87
    .line 88
    new-instance v2, Landroid/graphics/Rect;

    .line 89
    .line 90
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v2, v0, La/vju0;->G:Landroid/graphics/Rect;

    .line 94
    .line 95
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    new-instance v5, La/sz3;

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-direct {v5, v6}, La/sz3;-><init>(B)V

    .line 103
    .line 104
    .line 105
    new-instance v7, La/tz3;

    .line 106
    .line 107
    invoke-direct {v7, v2}, La/tz3;-><init>(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    new-instance v2, Landroid/os/Handler;

    .line 111
    .line 112
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-direct {v2, v7, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 117
    .line 118
    .line 119
    sget v2, La/uz3;->b:I

    .line 120
    .line 121
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    const v5, 0x7f0706d0

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    iput v2, v0, La/vju0;->J:I

    .line 137
    .line 138
    const/4 v2, -0x1

    .line 139
    iput v2, v0, La/vju0;->K:I

    .line 140
    .line 141
    new-instance v2, La/zas0;

    .line 142
    .line 143
    const/16 v5, 0xb

    .line 144
    .line 145
    invoke-direct {v2, v0, v5}, La/zas0;-><init>(Ljava/lang/Object;B)V

    .line 146
    .line 147
    .line 148
    iput-object v2, v0, La/vju0;->L:La/zas0;

    .line 149
    .line 150
    new-instance v2, La/gz6;

    .line 151
    .line 152
    const/4 v5, 0x6

    .line 153
    invoke-direct {v2, v0, v5}, La/gz6;-><init>(Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    iput-object v2, v0, La/vju0;->M:La/gz6;

    .line 157
    .line 158
    invoke-virtual {v0}, La/xhe0;->d()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    iput v2, v0, La/vju0;->N:I

    .line 163
    .line 164
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    const v5, 0x7f07072d

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const v4, 0x7f070722

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    new-instance v7, La/qmk0;

    .line 195
    .line 196
    const/4 v15, 0x0

    .line 197
    const/16 v16, 0x1d4

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    const/4 v12, 0x0

    .line 201
    const/4 v13, 0x0

    .line 202
    const/4 v14, 0x0

    .line 203
    invoke-direct/range {v7 .. v16}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 204
    .line 205
    .line 206
    iput-object v7, v0, La/vju0;->O:La/qmk0;

    .line 207
    .line 208
    iget-object v0, v1, La/dc3;->c:Landroid/view/View;

    .line 209
    .line 210
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 211
    .line 212
    if-nez v3, :cond_2

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_2
    const/16 v6, 0x8

    .line 216
    .line 217
    :goto_1
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 218
    .line 219
    .line 220
    return-void
.end method

.method public static v(Landroidx/recyclerview/widget/RecyclerView;Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v1, p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    const/4 v1, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset;->C1(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p0, v1

    .line 26
    :goto_1
    sub-int/2addr v0, p0

    .line 27
    if-gez v0, :cond_2

    .line 28
    .line 29
    move v0, v1

    .line 30
    :cond_2
    iget-object p0, p1, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->k:Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-virtual {p0, v1, v0}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->i()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->c()V

    .line 39
    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 9

    .line 1
    iget-boolean v0, p0, La/vju0;->z:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget-object v0, p0, La/vju0;->I:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/fsv;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v0, p1, v3}, La/fsv;->t(II)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, La/vju0;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    sub-int/2addr v3, v1

    .line 35
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->O(I)La/xhe0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v0, v2

    .line 41
    :goto_0
    instance-of v1, v0, La/fsv;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    check-cast v0, La/fsv;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object v0, v2

    .line 49
    :goto_1
    if-nez v0, :cond_3

    .line 50
    .line 51
    iget-object v0, p0, La/vju0;->H:Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    move-object v2, v0

    .line 60
    check-cast v2, La/fsv;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object v2, v0

    .line 64
    :cond_4
    :goto_2
    if-eqz v2, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-virtual {v2, p1, p0}, La/fsv;->t(II)V

    .line 71
    .line 72
    .line 73
    :cond_5
    return-void

    .line 74
    :cond_6
    iget-object p0, p0, La/vju0;->u:La/dc3;

    .line 75
    .line 76
    iget-object v0, p0, La/dc3;->c:Landroid/view/View;

    .line 77
    .line 78
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    instance-of v3, v0, La/ybc;

    .line 85
    .line 86
    if-eqz v3, :cond_7

    .line 87
    .line 88
    check-cast v0, La/ybc;

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    move-object v0, v2

    .line 92
    :goto_3
    if-eqz v0, :cond_d

    .line 93
    .line 94
    iget-object v3, v0, La/i26;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Ljava/util/List;

    .line 97
    .line 98
    if-eqz v3, :cond_c

    .line 99
    .line 100
    new-instance v4, Ljava/util/ArrayList;

    .line 101
    .line 102
    const/16 v5, 0xa

    .line 103
    .line 104
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_8

    .line 120
    .line 121
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, La/p6t0;

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    check-cast v6, La/ifo0;

    .line 131
    .line 132
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_8
    new-instance v3, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-static {v4, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    const/4 v5, 0x0

    .line 150
    move v6, v5

    .line 151
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    if-eqz v7, :cond_b

    .line 156
    .line 157
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    add-int/lit8 v8, v6, 0x1

    .line 162
    .line 163
    if-ltz v6, :cond_a

    .line 164
    .line 165
    check-cast v7, La/ifo0;

    .line 166
    .line 167
    if-ne v6, p1, :cond_9

    .line 168
    .line 169
    move v6, v1

    .line 170
    goto :goto_6

    .line 171
    :cond_9
    move v6, v5

    .line 172
    :goto_6
    invoke-static {v7, v6}, La/ifo0;->c(La/ifo0;Z)La/ifo0;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move v6, v8

    .line 180
    goto :goto_5

    .line 181
    :cond_a
    invoke-static {}, La/q3d;->p()V

    .line 182
    .line 183
    .line 184
    throw v2

    .line 185
    :cond_b
    move-object v2, v3

    .line 186
    :cond_c
    iput-object v2, v0, La/i26;->f:Ljava/lang/Object;

    .line 187
    .line 188
    :cond_d
    if-eqz v0, :cond_e

    .line 189
    .line 190
    invoke-virtual {v0}, La/yge0;->g()V

    .line 191
    .line 192
    .line 193
    :cond_e
    iget-object p0, p0, La/dc3;->c:Landroid/view/View;

    .line 194
    .line 195
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 196
    .line 197
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 198
    .line 199
    .line 200
    return-void
.end method

.method public final t(La/a1m0;La/uju0;I)V
    .locals 11

    .line 1
    sget-object v0, La/tju0;->a:La/tju0;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p2, La/sju0;

    .line 16
    .line 17
    if-eqz v0, :cond_c

    .line 18
    .line 19
    move-object v0, p2

    .line 20
    check-cast v0, La/sju0;

    .line 21
    .line 22
    iget-boolean v0, v0, La/sju0;->a:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    add-int/2addr v0, v1

    .line 36
    :goto_0
    iput v0, p0, La/vju0;->N:I

    .line 37
    .line 38
    iput p3, p0, La/vju0;->K:I

    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v2, p0, La/vju0;->w:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const/4 v3, 0x0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    move v0, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v0, v3

    .line 56
    :goto_1
    const/4 v4, -0x1

    .line 57
    if-eq p3, v4, :cond_3

    .line 58
    .line 59
    iget p3, p1, La/a1m0;->e:I

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move p3, v4

    .line 63
    :goto_2
    iget v5, p0, La/vju0;->N:I

    .line 64
    .line 65
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/lang/Integer;

    .line 74
    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    if-eq p3, v4, :cond_5

    .line 83
    .line 84
    move v2, p3

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move v2, v3

    .line 87
    :goto_3
    iget-object v5, p0, La/vju0;->u:La/dc3;

    .line 88
    .line 89
    iget-object v6, v5, La/dc3;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v6, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 92
    .line 93
    iget-object v7, v5, La/dc3;->c:Landroid/view/View;

    .line 94
    .line 95
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 96
    .line 97
    iget-object v5, v5, La/dc3;->d:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v5, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 100
    .line 101
    iget-object v8, p0, La/vju0;->L:La/zas0;

    .line 102
    .line 103
    invoke-virtual {v6, v8}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->setDelegate(La/hs8;)V

    .line 104
    .line 105
    .line 106
    iget-object v6, p0, La/vju0;->C:Lkotlin/jvm/functions/Function0;

    .line 107
    .line 108
    invoke-virtual {v5, v6}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->setAllHighlightedItemsDelegate(Lkotlin/jvm/functions/Function0;)V

    .line 109
    .line 110
    .line 111
    iget-boolean v6, p0, La/vju0;->A:Z

    .line 112
    .line 113
    invoke-virtual {v5, v6}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->setSingleNetOptimizationEnabled(Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, p1, p2, v2}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->n(La/a1m0;La/uju0;I)V

    .line 117
    .line 118
    .line 119
    iget-boolean p2, p0, La/vju0;->z:Z

    .line 120
    .line 121
    if-nez p2, :cond_9

    .line 122
    .line 123
    new-instance p2, La/ybc;

    .line 124
    .line 125
    new-instance p3, La/npt0;

    .line 126
    .line 127
    const/16 v0, 0xc

    .line 128
    .line 129
    invoke-direct {p3, p0, v0}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 130
    .line 131
    .line 132
    invoke-direct {p2, p3}, La/ybc;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 133
    .line 134
    .line 135
    iget-object p1, p1, La/a1m0;->a:Ljava/util/List;

    .line 136
    .line 137
    new-instance p3, Ljava/util/ArrayList;

    .line 138
    .line 139
    const/16 v0, 0xa

    .line 140
    .line 141
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    move v0, v3

    .line 153
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_8

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    add-int/lit8 v8, v0, 0x1

    .line 164
    .line 165
    if-ltz v0, :cond_7

    .line 166
    .line 167
    check-cast v4, Ljava/lang/String;

    .line 168
    .line 169
    new-instance v9, La/ifo0;

    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->getPage()I

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-ne v0, v10, :cond_6

    .line 179
    .line 180
    move v0, v1

    .line 181
    goto :goto_5

    .line 182
    :cond_6
    move v0, v3

    .line 183
    :goto_5
    invoke-direct {v9, v4, v0}, La/ifo0;-><init>(Ljava/lang/String;Z)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move v0, v8

    .line 190
    goto :goto_4

    .line 191
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 192
    .line 193
    .line 194
    const/4 p0, 0x0

    .line 195
    throw p0

    .line 196
    :cond_8
    iput-object p3, p2, La/i26;->f:Ljava/lang/Object;

    .line 197
    .line 198
    invoke-virtual {v7, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 199
    .line 200
    .line 201
    iget-object p1, p0, La/vju0;->O:La/qmk0;

    .line 202
    .line 203
    invoke-virtual {v7, p1}, Landroidx/recyclerview/widget/RecyclerView;->s0(La/fhe0;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7, p1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, v2}, La/vju0;->A(I)V

    .line 210
    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_9
    if-eq p3, v4, :cond_a

    .line 214
    .line 215
    if-nez v0, :cond_a

    .line 216
    .line 217
    invoke-virtual {v8, p3, v1, v1, v3}, La/zas0;->d(IZZZ)V

    .line 218
    .line 219
    .line 220
    :cond_a
    :goto_6
    if-eqz v6, :cond_b

    .line 221
    .line 222
    iget-object p1, p0, La/vju0;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 223
    .line 224
    if-eqz p1, :cond_b

    .line 225
    .line 226
    iget-object p0, p0, La/vju0;->M:La/gz6;

    .line 227
    .line 228
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 229
    .line 230
    .line 231
    :cond_b
    return-void

    .line 232
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 233
    .line 234
    .line 235
    return-void
.end method

.method public final u(La/lk50;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/vju0;->u:La/dc3;

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    iget-object v1, v0, La/dc3;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 8
    .line 9
    iget-object v2, v0, La/dc3;->d:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 13
    .line 14
    invoke-virtual {v1}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->getPage()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, v3, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->i1:Ljava/util/TreeMap;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, -0x1

    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Ljava/lang/Iterable;

    .line 46
    .line 47
    new-instance v7, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v8, 0xa

    .line 50
    .line 51
    invoke-static {v6, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-eqz v8, :cond_2

    .line 67
    .line 68
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, La/rt8;

    .line 73
    .line 74
    iget-object v8, v8, La/rt8;->a:La/ss8;

    .line 75
    .line 76
    iget-object v8, v8, La/ss8;->c:La/pab;

    .line 77
    .line 78
    if-eqz v8, :cond_1

    .line 79
    .line 80
    iget-object v8, v8, La/pab;->a:La/lk50;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const/4 v8, 0x0

    .line 84
    :goto_1
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_0

    .line 93
    .line 94
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    move v2, v5

    .line 106
    :goto_2
    if-ne v2, v5, :cond_4

    .line 107
    .line 108
    return-void

    .line 109
    :cond_4
    if-eq v1, v2, :cond_5

    .line 110
    .line 111
    int-to-float v4, v2

    .line 112
    const/4 v7, 0x0

    .line 113
    const/4 v8, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x1

    .line 116
    invoke-virtual/range {v3 .. v8}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->l(FZZZZ)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    const/4 v1, 0x1

    .line 121
    invoke-virtual {p0, p1, v1}, La/vju0;->x(La/lk50;Z)V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_3
    iget-object p0, v0, La/dc3;->d:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 127
    .line 128
    iput-object p1, p0, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->m:La/lk50;

    .line 129
    .line 130
    invoke-virtual {p0}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->i()V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final w()V
    .locals 4

    .line 1
    iget v0, p0, La/vju0;->N:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/vju0;->u:La/dc3;

    .line 8
    .line 9
    iget-object v2, v1, La/dc3;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 12
    .line 13
    invoke-virtual {v2}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->getPage()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, La/vju0;->w:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, La/vju0;->H:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    iput-object v0, p0, La/vju0;->I:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    iget-object v1, v1, La/dc3;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->setDelegate(La/hs8;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->a()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/vju0;->P:La/ybl;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->setAllHighlightedItemsDelegate(Lkotlin/jvm/functions/Function0;)V

    .line 44
    .line 45
    .line 46
    iget-boolean v0, p0, La/vju0;->A:Z

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, La/vju0;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    iget-object p0, p0, La/vju0;->M:La/gz6;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->u0(La/lhe0;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public final x(La/lk50;Z)V
    .locals 7

    .line 1
    if-eqz p1, :cond_8

    .line 2
    .line 3
    iget-object v0, p0, La/vju0;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v1

    .line 14
    :goto_0
    iget-object v3, p0, La/vju0;->u:La/dc3;

    .line 15
    .line 16
    iget-object v3, v3, La/dc3;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-virtual {v3, p1, v4}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;->h(La/lk50;Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketLineView;)Landroid/graphics/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object v5, v4

    .line 33
    :goto_1
    instance-of v6, v5, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset;

    .line 34
    .line 35
    if-eqz v6, :cond_2

    .line 36
    .line 37
    move-object v4, v5

    .line 38
    check-cast v4, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset;

    .line 39
    .line 40
    :cond_2
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual {v4, v5}, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset;->C1(I)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move v4, v1

    .line 52
    :goto_2
    sub-int/2addr v2, v4

    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_4
    move v3, v1

    .line 59
    :goto_3
    sub-int/2addr v3, v2

    .line 60
    iget v2, p0, La/vju0;->J:I

    .line 61
    .line 62
    sub-int v2, v3, v2

    .line 63
    .line 64
    if-nez v2, :cond_5

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_5
    if-eqz p2, :cond_7

    .line 68
    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    const/high16 v4, -0x80000000

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->A0(IILandroid/view/animation/BaseInterpolator;IZ)V

    .line 76
    .line 77
    .line 78
    :cond_6
    if-eqz v0, :cond_8

    .line 79
    .line 80
    new-instance p2, La/aie0;

    .line 81
    .line 82
    const/4 v1, 0x1

    .line 83
    invoke-direct {p2, p0, p1, v1}, La/aie0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_7
    if-eqz v0, :cond_8

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 93
    .line 94
    .line 95
    :cond_8
    :goto_4
    return-void
.end method

.method public final y(IZ)V
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_9

    .line 3
    .line 4
    new-instance v0, La/kie0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, La/vju0;->z:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 v1, p1, -0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, p1

    .line 17
    :goto_0
    iput v1, v0, La/kie0;->a:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    if-gez v1, :cond_1

    .line 21
    .line 22
    move v1, v2

    .line 23
    :cond_1
    iput v1, v0, La/kie0;->a:I

    .line 24
    .line 25
    iget-object v1, p0, La/vju0;->E:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v3, v2

    .line 35
    :goto_1
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->g1()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    goto :goto_2

    .line 42
    :cond_3
    move v4, v2

    .line 43
    :goto_2
    if-eqz v1, :cond_4

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->D(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    const/4 v5, 0x0

    .line 51
    :goto_3
    iget-object v6, p0, La/vju0;->G:Landroid/graphics/Rect;

    .line 52
    .line 53
    if-eqz v5, :cond_5

    .line 54
    .line 55
    iget-object v7, p0, La/vju0;->v:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    if-eqz v7, :cond_5

    .line 58
    .line 59
    invoke-static {v6, v5}, Landroidx/recyclerview/widget/RecyclerView;->Y(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    :cond_5
    iget v5, v6, Landroid/graphics/Rect;->top:I

    .line 63
    .line 64
    iget v6, p0, La/vju0;->F:I

    .line 65
    .line 66
    sub-int/2addr v5, v6

    .line 67
    if-gez v5, :cond_6

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    :cond_6
    if-gt v3, p1, :cond_7

    .line 71
    .line 72
    if-gt p1, v4, :cond_7

    .line 73
    .line 74
    if-eqz v2, :cond_9

    .line 75
    .line 76
    :cond_7
    if-eqz p2, :cond_8

    .line 77
    .line 78
    iget-object p1, p0, La/vju0;->u:La/dc3;

    .line 79
    .line 80
    iget-object p1, p1, La/dc3;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 83
    .line 84
    new-instance p2, La/djl;

    .line 85
    .line 86
    const/4 v1, 0x5

    .line 87
    invoke-direct {p2, p0, v0, v1}, La/djl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_8
    if-eqz v1, :cond_9

    .line 95
    .line 96
    iget p0, v0, La/kie0;->a:I

    .line 97
    .line 98
    invoke-virtual {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(I)V

    .line 99
    .line 100
    .line 101
    :cond_9
    return-void
.end method

.method public final z(La/fsv;La/fsv;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/vju0;->H:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/fsv;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    iget-object v2, p0, La/vju0;->I:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, La/fsv;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v2, v1

    .line 26
    :goto_1
    if-nez v0, :cond_7

    .line 27
    .line 28
    if-eqz p1, :cond_7

    .line 29
    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, La/vju0;->H:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    if-eqz v2, :cond_7

    .line 38
    .line 39
    iget-object v0, v2, La/fsv;->u:La/nq8;

    .line 40
    .line 41
    iget-object v0, v0, La/nq8;->c:Landroid/view/View;

    .line 42
    .line 43
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    instance-of v2, v0, La/ybc;

    .line 50
    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    move-object v1, v0

    .line 54
    check-cast v1, La/ybc;

    .line 55
    .line 56
    :cond_2
    const/4 v0, 0x0

    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_3
    iget-object v1, v1, La/i26;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Ljava/util/List;

    .line 63
    .line 64
    const/4 v2, -0x1

    .line 65
    if-eqz v1, :cond_6

    .line 66
    .line 67
    new-instance v3, Ljava/util/ArrayList;

    .line 68
    .line 69
    const/16 v4, 0xa

    .line 70
    .line 71
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    check-cast v4, La/p6t0;

    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    check-cast v4, La/ifo0;

    .line 98
    .line 99
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_6

    .line 112
    .line 113
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, La/ifo0;

    .line 118
    .line 119
    iget-boolean v3, v3, La/ifo0;->b:Z

    .line 120
    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    move v0, v2

    .line 128
    :goto_4
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-virtual {p1, v0, v1}, La/fsv;->t(II)V

    .line 133
    .line 134
    .line 135
    :cond_7
    if-eqz p2, :cond_8

    .line 136
    .line 137
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 138
    .line 139
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iput-object p1, p0, La/vju0;->I:Ljava/lang/ref/WeakReference;

    .line 143
    .line 144
    :cond_8
    return-void
.end method
