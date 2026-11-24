.class public final La/yql0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/wql0;


# instance fields
.field public a:La/xdr;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Landroid/widget/FrameLayout$LayoutParams;

.field public final k:Lorg/xplatform/uikit/components/header/DsHeader;

.field public final l:La/nql0;

.field public final m:Landroid/widget/ImageView;

.field public final n:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v0, v1, v3, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const v6, 0x7f07015a

    .line 23
    .line 24
    .line 25
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    iput v5, v0, La/yql0;->b:I

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const v7, 0x7f0706e2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iput v5, v0, La/yql0;->c:I

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    const v7, 0x7f07072d

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    iput v5, v0, La/yql0;->d:I

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    iput v5, v0, La/yql0;->e:I

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const v7, 0x7f070717

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    iput v5, v0, La/yql0;->f:I

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    iput v5, v0, La/yql0;->g:I

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const v6, 0x7f0706f8

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    iput v5, v0, La/yql0;->h:I

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const v6, 0x7f0706a9

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    const v7, 0x7f07067a

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    iput v6, v0, La/yql0;->i:I

    .line 126
    .line 127
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 128
    .line 129
    const/4 v7, -0x1

    .line 130
    const/4 v8, -0x2

    .line 131
    invoke-direct {v6, v7, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 132
    .line 133
    .line 134
    iput v5, v6, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 135
    .line 136
    iput-object v6, v0, La/yql0;->j:Landroid/widget/FrameLayout$LayoutParams;

    .line 137
    .line 138
    new-instance v5, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 139
    .line 140
    const/4 v6, 0x6

    .line 141
    invoke-direct {v5, v1, v3, v6}, Lorg/xplatform/uikit/components/header/DsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 142
    .line 143
    .line 144
    iput-object v5, v0, La/yql0;->k:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 145
    .line 146
    new-instance v7, La/nql0;

    .line 147
    .line 148
    invoke-direct {v7, v1}, La/nql0;-><init>(Landroid/content/Context;)V

    .line 149
    .line 150
    .line 151
    iput-object v7, v0, La/yql0;->l:La/nql0;

    .line 152
    .line 153
    new-instance v8, Landroid/widget/ImageView;

    .line 154
    .line 155
    invoke-direct {v8, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    iput-object v8, v0, La/yql0;->m:Landroid/widget/ImageView;

    .line 159
    .line 160
    new-instance v9, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 161
    .line 162
    invoke-direct {v9, v1, v3, v6}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 163
    .line 164
    .line 165
    iput-object v9, v0, La/yql0;->n:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 166
    .line 167
    new-instance v6, La/u5l0;

    .line 168
    .line 169
    const/16 v10, 0xa

    .line 170
    .line 171
    invoke-direct {v6, v0, v1, v10}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 172
    .line 173
    .line 174
    sget-object v10, La/cqd0;->h:[I

    .line 175
    .line 176
    invoke-virtual {v1, v3, v10, v4, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v6, v1}, La/u5l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 196
    .line 197
    .line 198
    new-instance v10, La/nrv;

    .line 199
    .line 200
    const/16 v17, 0x0

    .line 201
    .line 202
    const/16 v18, 0xf6

    .line 203
    .line 204
    const/4 v12, 0x0

    .line 205
    const/4 v13, 0x0

    .line 206
    const/4 v15, 0x0

    .line 207
    const/16 v16, 0x0

    .line 208
    .line 209
    move-object/from16 v11, p2

    .line 210
    .line 211
    move-object/from16 v14, p3

    .line 212
    .line 213
    invoke-direct/range {v10 .. v18}, La/nrv;-><init>(Ljava/lang/CharSequence;ZLjava/lang/String;Ljava/lang/CharSequence;Ljava/lang/Integer;La/l0x;Ljava/lang/Integer;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5, v10}, Lorg/xplatform/uikit/components/header/DsHeader;->setModel(La/prv;)V

    .line 217
    .line 218
    .line 219
    if-eqz v2, :cond_0

    .line 220
    .line 221
    invoke-virtual {v8, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 222
    .line 223
    .line 224
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/yql0;->n:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/yql0;->k:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/yql0;->m:Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, La/yql0;->l:La/nql0;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final b(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/yql0;->l:La/nql0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v0, v0, La/nql0;->o2:La/sql0;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/yql0;->a()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, La/yql0;->n:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/yql0;->k:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/yql0;->m:Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, La/yql0;->l:La/nql0;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final e(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yql0;->l:La/nql0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/nql0;->e(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, La/yql0;->l:La/nql0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setSportCollectionClickListener(La/xdr;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/xdr;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/yql0;->l:La/nql0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, La/nql0;->setSportCollectionActionType(La/xdr;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/yql0;->a:La/xdr;

    .line 10
    .line 11
    return-void
.end method

.method public setStyle(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yql0;->l:La/nql0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/nql0;->setViewStyle(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
