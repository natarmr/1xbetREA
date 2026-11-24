.class public final La/j2m0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/iab;

.field public b:Lkotlin/jvm/functions/Function1;

.field public c:La/w7s0;

.field public d:La/spm0;

.field public final e:La/n0o0;

.field public f:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public g:La/fiv;

.field public h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/v6e0;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, p0, v1}, La/v6e0;-><init>(La/j2m0;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/j2m0;->e:La/n0o0;

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    iput v0, p0, La/j2m0;->i:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()La/tjj0;
    .locals 0

    .line 1
    iget-object p0, p0, La/j2m0;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tjj0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b(La/iab;Lkotlin/jvm/functions/Function1;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/j2m0;->a:La/iab;

    .line 5
    .line 6
    iput-object p2, p0, La/j2m0;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, La/j2m0;->g:La/fiv;

    .line 10
    .line 11
    iput-object v1, p0, La/j2m0;->h:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    iput v1, p0, La/j2m0;->i:I

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, La/j2m0;->n:Z

    .line 18
    .line 19
    iget-object v3, p1, La/iab;->f:Landroid/view/View;

    .line 20
    .line 21
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 22
    .line 23
    new-instance v4, La/spm0;

    .line 24
    .line 25
    const v5, 0x7f07074a

    .line 26
    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    invoke-direct {v4, v3, v8, v5, v1}, La/spm0;-><init>(La/nmo0;ZIB)V

    .line 30
    .line 31
    .line 32
    iput-object v3, v4, La/spm0;->m:La/nmo0;

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 35
    .line 36
    .line 37
    iput-object v4, p0, La/j2m0;->d:La/spm0;

    .line 38
    .line 39
    invoke-virtual {v3}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v3, La/ovc;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-direct {v3, v4}, La/ovc;-><init>(B)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p1, La/iab;->g:Landroid/view/View;

    .line 53
    .line 54
    move-object v9, v1

    .line 55
    check-cast v9, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 56
    .line 57
    new-instance v1, La/w7s0;

    .line 58
    .line 59
    new-instance v3, La/elk0;

    .line 60
    .line 61
    const/16 v4, 0x19

    .line 62
    .line 63
    invoke-direct {v3, p2, v4}, La/elk0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, v9, v3}, La/w7s0;-><init>(La/nmo0;La/elk0;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9, v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, La/j2m0;->c:La/w7s0;

    .line 73
    .line 74
    invoke-virtual {v9}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getVerticalRecyclerViewListener()La/mcu0;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    new-instance v0, La/kcl0;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    const/16 v7, 0xe

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    const-class v3, La/j2m0;

    .line 85
    .line 86
    const-string v4, "onVerticalScroll"

    .line 87
    .line 88
    const-string v5, "onVerticalScroll(I)V"

    .line 89
    .line 90
    move-object v2, p0

    .line 91
    invoke-direct/range {v0 .. v7}, La/kcl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iput-object v0, v10, La/mcu0;->b:Lkotlin/jvm/functions/Function1;

    .line 98
    .line 99
    invoke-virtual {v9}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getHorizontalRecyclerViewListener()La/vlw;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    new-instance v0, La/kx2;

    .line 104
    .line 105
    const/4 v7, 0x6

    .line 106
    const/4 v1, 0x3

    .line 107
    const-string v4, "onHorizontalScroll"

    .line 108
    .line 109
    const-string v5, "onHorizontalScroll(IZZ)V"

    .line 110
    .line 111
    invoke-direct/range {v0 .. v7}, La/kx2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iput-object v0, v9, La/vlw;->h:La/xdr;

    .line 118
    .line 119
    iget-object v0, p1, La/iab;->c:Landroid/view/View;

    .line 120
    .line 121
    check-cast v0, Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 122
    .line 123
    invoke-virtual {p0}, La/j2m0;->a()La/tjj0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 128
    .line 129
    .line 130
    new-instance v1, La/rpm0;

    .line 131
    .line 132
    invoke-virtual {p0}, La/j2m0;->a()La/tjj0;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-direct {v1, v3}, La/rpm0;-><init>(La/tjj0;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 143
    .line 144
    .line 145
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-direct {v1, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    iput-object v1, p0, La/j2m0;->f:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public final c(La/c3m0;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 5
    .line 6
    const-string v1, "binding"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    iget-object v0, v0, La/iab;->b:Landroid/view/View;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 18
    .line 19
    if-eqz v0, :cond_a

    .line 20
    .line 21
    iget-object v0, v0, La/iab;->g:Landroid/view/View;

    .line 22
    .line 23
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 29
    .line 30
    if-eqz v0, :cond_9

    .line 31
    .line 32
    iget-object v0, v0, La/iab;->h:Landroid/view/View;

    .line 33
    .line 34
    check-cast v0, Landroid/widget/LinearLayout;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 40
    .line 41
    if-eqz v0, :cond_8

    .line 42
    .line 43
    iget-object v0, v0, La/iab;->c:Landroid/view/View;

    .line 44
    .line 45
    check-cast v0, Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p1, La/c3m0;->e:Ljava/util/ArrayList;

    .line 51
    .line 52
    iget-object v4, p0, La/j2m0;->a:La/iab;

    .line 53
    .line 54
    if-eqz v4, :cond_7

    .line 55
    .line 56
    iget-object v4, v4, La/iab;->e:Landroid/view/View;

    .line 57
    .line 58
    check-cast v4, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v5, 0x1

    .line 65
    if-le v0, v5, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/16 v3, 0x8

    .line 69
    .line 70
    :goto_0
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p1, La/c3m0;->d:La/fiv;

    .line 74
    .line 75
    iget-object v0, p1, La/fiv;->c:Ljava/util/ArrayList;

    .line 76
    .line 77
    iget-object v3, p1, La/fiv;->b:Ljava/util/ArrayList;

    .line 78
    .line 79
    iget-object v4, p1, La/fiv;->a:Ljava/util/ArrayList;

    .line 80
    .line 81
    iget-object v5, p0, La/j2m0;->g:La/fiv;

    .line 82
    .line 83
    invoke-virtual {p1, v5}, La/fiv;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_1

    .line 88
    .line 89
    return-void

    .line 90
    :cond_1
    iput-object p1, p0, La/j2m0;->g:La/fiv;

    .line 91
    .line 92
    iget-object v5, p0, La/j2m0;->c:La/w7s0;

    .line 93
    .line 94
    const/16 v6, 0x1e

    .line 95
    .line 96
    const-string v7, ""

    .line 97
    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    new-instance v8, La/w8b;

    .line 101
    .line 102
    new-instance v9, La/h9b;

    .line 103
    .line 104
    invoke-direct {v9, v7}, La/h9b;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v8, v9, v2, v2, v6}, La/w8b;-><init>(La/h9b;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v4, v3, v0, v8}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    iget-object v5, p0, La/j2m0;->d:La/spm0;

    .line 114
    .line 115
    if-eqz v5, :cond_3

    .line 116
    .line 117
    new-instance v8, La/w8b;

    .line 118
    .line 119
    new-instance v9, La/h9b;

    .line 120
    .line 121
    invoke-direct {v9, v7}, La/h9b;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-direct {v8, v9, v2, v2, v6}, La/w8b;-><init>(La/h9b;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v4, v3, v0, v8}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 128
    .line 129
    .line 130
    :cond_3
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 131
    .line 132
    if-eqz v0, :cond_6

    .line 133
    .line 134
    iget-object v0, v0, La/iab;->g:Landroid/view/View;

    .line 135
    .line 136
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_5

    .line 143
    .line 144
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-nez v3, :cond_5

    .line 149
    .line 150
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 151
    .line 152
    if-eqz v0, :cond_4

    .line 153
    .line 154
    iget-object v0, v0, La/iab;->g:Landroid/view/View;

    .line 155
    .line 156
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 157
    .line 158
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellLayoutManager()Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/CellLayoutManager;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/CellLayoutManager;->C1()V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v2

    .line 170
    :cond_5
    new-instance v1, La/w23;

    .line 171
    .line 172
    const/16 v3, 0xf

    .line 173
    .line 174
    invoke-direct {v1, p0, v3}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 178
    .line 179
    .line 180
    :goto_1
    iput-object v2, p0, La/j2m0;->h:Ljava/lang/String;

    .line 181
    .line 182
    const/4 v0, -0x1

    .line 183
    iput v0, p0, La/j2m0;->i:I

    .line 184
    .line 185
    invoke-virtual {p0}, La/j2m0;->a()La/tjj0;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iget-object p1, p1, La/fiv;->d:Ljava/util/ArrayList;

    .line 190
    .line 191
    iput-object p1, v0, La/i26;->f:Ljava/lang/Object;

    .line 192
    .line 193
    invoke-virtual {p0}, La/j2m0;->a()La/tjj0;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p1}, La/yge0;->g()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, La/j2m0;->d()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, La/j2m0;->f()V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v2

    .line 211
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v2

    .line 215
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw v2

    .line 219
    :cond_9
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw v2

    .line 223
    :cond_a
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v2

    .line 227
    :cond_b
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v2
.end method

.method public final d()V
    .locals 8

    .line 1
    iget-boolean v0, p0, La/j2m0;->n:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, La/j2m0;->g:La/fiv;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v3, p0, La/j2m0;->j:I

    .line 11
    .line 12
    iget v5, p0, La/j2m0;->k:I

    .line 13
    .line 14
    iget v6, p0, La/j2m0;->l:I

    .line 15
    .line 16
    iget v7, p0, La/j2m0;->m:I

    .line 17
    .line 18
    if-gtz v3, :cond_1

    .line 19
    .line 20
    if-gtz v6, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, La/j2m0;->n:Z

    .line 25
    .line 26
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, v0, La/iab;->g:Landroid/view/View;

    .line 31
    .line 32
    move-object v2, v0

    .line 33
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 34
    .line 35
    new-instance v1, La/i2m0;

    .line 36
    .line 37
    move-object v4, p0

    .line 38
    invoke-direct/range {v1 .. v7}, La/i2m0;-><init>(Landroid/view/View;ILa/j2m0;III)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v1}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    const-string p0, "binding"

    .line 46
    .line 47
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    throw p0

    .line 52
    :cond_3
    :goto_0
    return-void
.end method

.method public final e()V
    .locals 6

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 5
    .line 6
    iget-object v2, p0, La/j2m0;->a:La/iab;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-object v2, v2, La/iab;->g:Landroid/view/View;

    .line 11
    .line 12
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :catchall_0
    move-exception v2

    .line 20
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 21
    .line 22
    new-instance v3, La/g0g0;

    .line 23
    .line 24
    invoke-direct {v3, v2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object v2, v3

    .line 28
    :goto_0
    nop

    .line 29
    instance-of v3, v2, La/g0g0;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    move-object v2, v1

    .line 34
    :cond_1
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 35
    .line 36
    :try_start_1
    iget-object v3, p0, La/j2m0;->a:La/iab;

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    iget-object v0, v3, La/iab;->c:Landroid/view/View;

    .line 41
    .line 42
    check-cast v0, Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    :catchall_1
    move-exception v0

    .line 50
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 51
    .line 52
    new-instance v3, La/g0g0;

    .line 53
    .line 54
    invoke-direct {v3, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v3

    .line 58
    :goto_1
    nop

    .line 59
    instance-of v3, v0, La/g0g0;

    .line 60
    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    move-object v0, v1

    .line 64
    :cond_3
    check-cast v0, Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    if-eqz v2, :cond_c

    .line 68
    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_4
    invoke-virtual {v2}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const/4 v5, -0x1

    .line 81
    if-eq v4, v5, :cond_6

    .line 82
    .line 83
    iput v4, p0, La/j2m0;->j:I

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->D(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    goto :goto_2

    .line 96
    :cond_5
    move v2, v3

    .line 97
    :goto_2
    iput v2, p0, La/j2m0;->k:I

    .line 98
    .line 99
    :cond_6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    instance-of v2, v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 104
    .line 105
    if-eqz v2, :cond_7

    .line 106
    .line 107
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_7
    move-object v0, v1

    .line 111
    :goto_3
    if-eqz v0, :cond_8

    .line 112
    .line 113
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    goto :goto_4

    .line 118
    :cond_8
    move v2, v5

    .line 119
    :goto_4
    if-eq v2, v5, :cond_b

    .line 120
    .line 121
    if-ltz v2, :cond_b

    .line 122
    .line 123
    iput v2, p0, La/j2m0;->l:I

    .line 124
    .line 125
    if-eqz v0, :cond_9

    .line 126
    .line 127
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->D(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :cond_9
    if-eqz v1, :cond_a

    .line 132
    .line 133
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    :cond_a
    iput v3, p0, La/j2m0;->m:I

    .line 138
    .line 139
    :cond_b
    return-void

    .line 140
    :cond_c
    :goto_5
    iput v3, p0, La/j2m0;->j:I

    .line 141
    .line 142
    iput v3, p0, La/j2m0;->k:I

    .line 143
    .line 144
    iput v3, p0, La/j2m0;->l:I

    .line 145
    .line 146
    iput v3, p0, La/j2m0;->m:I

    .line 147
    .line 148
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La/iab;->c:Landroid/view/View;

    .line 6
    .line 7
    check-cast v0, Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 8
    .line 9
    new-instance v1, La/apj0;

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    invoke-direct {v1, p0, v2}, La/apj0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "binding"

    .line 20
    .line 21
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0
.end method

.method public final g(IZ)V
    .locals 13

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_7

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    iget v1, p0, La/j2m0;->i:I

    .line 7
    .line 8
    if-eq p1, v1, :cond_7

    .line 9
    .line 10
    :cond_0
    iput p1, p0, La/j2m0;->i:I

    .line 11
    .line 12
    invoke-virtual {p0}, La/j2m0;->a()La/tjj0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_1
    iget-object v2, v1, La/i26;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Ljava/util/List;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, La/sjj0;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move-object v2, v3

    .line 31
    :goto_0
    instance-of v2, v2, La/qjj0;

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    move v0, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_3
    add-int/lit8 p1, p1, -0x1

    .line 38
    .line 39
    if-gez p1, :cond_1

    .line 40
    .line 41
    :goto_1
    invoke-virtual {p0}, La/j2m0;->a()La/tjj0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, v0}, La/tjj0;->H(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-eqz p2, :cond_4

    .line 50
    .line 51
    invoke-static {v5}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_7

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    iget-object p1, p0, La/j2m0;->h:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_7

    .line 65
    .line 66
    :goto_2
    iput-object v5, p0, La/j2m0;->h:Ljava/lang/String;

    .line 67
    .line 68
    iget-object p1, p0, La/j2m0;->a:La/iab;

    .line 69
    .line 70
    const-string p2, "binding"

    .line 71
    .line 72
    if-eqz p1, :cond_6

    .line 73
    .line 74
    iget-object p1, p1, La/iab;->e:Landroid/view/View;

    .line 75
    .line 76
    check-cast p1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 77
    .line 78
    new-instance v4, La/nrv;

    .line 79
    .line 80
    const/4 v11, 0x0

    .line 81
    const/16 v12, 0xfe

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v7, 0x0

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v10, 0x0

    .line 88
    invoke-direct/range {v4 .. v12}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v4}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, La/j2m0;->a:La/iab;

    .line 95
    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    iget-object p0, p0, La/iab;->e:Landroid/view/View;

    .line 99
    .line 100
    check-cast p0, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_5
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v3

    .line 110
    :cond_6
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v3

    .line 114
    :cond_7
    return-void
.end method
