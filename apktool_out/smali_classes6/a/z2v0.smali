.class public final La/z2v0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/a5s;


# instance fields
.field public final a:Lorg/xplatform/uikit/components/header/DsHeader;

.field public final b:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

.field public final c:La/o4s;

.field public d:La/xdr;

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 10
    .line 11
    new-instance v3, Landroid/view/ContextThemeWrapper;

    .line 12
    .line 13
    const v4, 0x7f1408bc

    .line 14
    .line 15
    .line 16
    invoke-direct {v3, p1, v4}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x6

    .line 20
    invoke-direct {v2, v3, v0, v4}, Lorg/xplatform/uikit/components/header/DsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 24
    .line 25
    new-instance v3, Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 26
    .line 27
    invoke-direct {v3, p1, v0, v4, v1}, Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 28
    .line 29
    .line 30
    const-string v4, "WebGamesCollection"

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v3, p0, La/z2v0;->b:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    const v5, 0x7f07072d

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    const v5, 0x7f0706a9

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    iput v4, p0, La/z2v0;->e:I

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const v5, 0x7f0704be

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    iput v4, p0, La/z2v0;->f:I

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    sget-object v4, La/dqd0;->b:[I

    .line 81
    .line 82
    invoke-virtual {p1, v0, v4, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const/4 v4, 0x4

    .line 87
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v0, p1, v4}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/header/DsHeader;->setTagLabel(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v0, p1, v4}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonLabel(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    const/4 v4, 0x5

    .line 110
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-static {v0, p1, v4}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v2, v4}, Lorg/xplatform/uikit/components/header/DsHeader;->setLabel(Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    .line 121
    new-instance v4, La/l0x;

    .line 122
    .line 123
    const/4 v5, 0x1

    .line 124
    invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-direct {v4, v5}, La/l0x;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 129
    .line 130
    .line 131
    new-instance v5, La/l0x;

    .line 132
    .line 133
    const/4 v6, 0x2

    .line 134
    invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-direct {v5, v6}, La/l0x;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v4}, La/o0x;->c()Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-nez v6, :cond_0

    .line 146
    .line 147
    iget-object v2, v2, Lorg/xplatform/uikit/components/header/DsHeader;->d:La/w0i;

    .line 148
    .line 149
    if-eqz v2, :cond_0

    .line 150
    .line 151
    invoke-interface {v2, v4, v5}, La/w0i;->a(La/o0x;La/l0x;)V

    .line 152
    .line 153
    .line 154
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 155
    .line 156
    .line 157
    new-instance v0, La/o4s;

    .line 158
    .line 159
    sget-object v2, La/g5s;->i:La/g5s;

    .line 160
    .line 161
    const v4, 0x7f0807c2

    .line 162
    .line 163
    .line 164
    invoke-static {p1, v2, v1, v4}, La/lmc;->G(Landroid/content/Context;La/g5s;II)La/o0x;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    iget-object v5, p0, La/z2v0;->d:La/xdr;

    .line 169
    .line 170
    invoke-direct {v0, v2, v4, v5}, La/o4s;-><init>(La/g5s;La/o0x;La/xdr;)V

    .line 171
    .line 172
    .line 173
    iput-object v0, p0, La/z2v0;->c:La/o4s;

    .line 174
    .line 175
    const p0, 0x7f080e73

    .line 176
    .line 177
    .line 178
    invoke-static {p0, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-virtual {v3, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    const v2, 0x7f0706f8

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    invoke-static {v3, p0}, La/jmu0;->i(Landroid/view/View;I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 203
    .line 204
    .line 205
    new-instance p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 206
    .line 207
    invoke-direct {p0, p1, v1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3, p0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 214
    .line 215
    .line 216
    new-instance v6, La/pmk0;

    .line 217
    .line 218
    const/4 v10, 0x0

    .line 219
    const/16 v11, 0x10

    .line 220
    .line 221
    move v8, v7

    .line 222
    move v9, v7

    .line 223
    invoke-direct/range {v6 .. v11}, La/pmk0;-><init>(IIIII)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3, v6}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 227
    .line 228
    .line 229
    return-void
.end method


# virtual methods
.method public getCollectionRecycler()Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    .line 1
    iget-object p0, p0, La/z2v0;->b:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHeader()Lorg/xplatform/uikit/components/header/DsHeader;
    .locals 0

    .line 1
    iget-object p0, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 7

    .line 1
    iget-object p4, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2
    .line 3
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget-object v0, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    move-object p5, p0

    .line 14
    const/4 p0, 0x0

    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iget p1, p5, La/z2v0;->f:I

    .line 28
    .line 29
    sub-int v3, p0, p1

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iget-object v5, p5, La/z2v0;->b:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 36
    .line 37
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    add-int v4, p1, p0

    .line 42
    .line 43
    iget v1, p5, La/z2v0;->f:I

    .line 44
    .line 45
    move-object v6, p5

    .line 46
    invoke-static/range {v1 .. v6}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    iget p2, p0, La/z2v0;->e:I

    .line 2
    .line 3
    const/high16 v0, 0x40000000    # 2.0f

    .line 4
    .line 5
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-object v0, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 12
    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    iget-object v2, p0, La/z2v0;->b:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 24
    .line 25
    invoke-virtual {v2, v1, p2}, Landroid/view/View;->measure(II)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, p2

    .line 41
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final setButtonText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonLabel(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/header/DsHeader;->setLabel(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/u4s;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/z2v0;->c:La/o4s;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, p1, v0}, La/q4;->H(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final setOnButtonClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/header/DsHeader;->setButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setOnItemClickListener(La/xdr;)V
    .locals 0
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
    iput-object p1, p0, La/z2v0;->d:La/xdr;

    .line 5
    .line 6
    iget-object p0, p0, La/z2v0;->c:La/o4s;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, La/o4s;->h:La/xdr;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final setOnTagClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/header/DsHeader;->setTagClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setTagColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/header/DsHeader;->setTagColor(Ljava/lang/Integer;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setTagText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/z2v0;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/header/DsHeader;->setTagLabel(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
