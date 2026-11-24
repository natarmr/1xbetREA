.class public final La/wak0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/xoe;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:La/tdo0;

.field public h:La/ymx;

.field public i:Z

.field public final j:F

.field public final k:B

.field public final l:B

.field public final m:Landroid/widget/ImageView;

.field public final n:Landroid/widget/TextView;

.field public final o:Lorg/xplatform/uikit/components/counter/DsCounter;

.field public final p:La/if5;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const v2, 0x7f07067a

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, p0, La/wak0;->a:I

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v2, 0x7f070660

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, p0, La/wak0;->b:I

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const v2, 0x7f0706f1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iput v1, p0, La/wak0;->c:I

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const v2, 0x7f07072d

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iput v1, p0, La/wak0;->d:I

    .line 59
    .line 60
    if-eqz p2, :cond_0

    .line 61
    .line 62
    const v1, 0x7f0606e0

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const v1, 0x7f040b0b

    .line 71
    .line 72
    .line 73
    invoke-static {v1, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :goto_0
    iput v1, p0, La/wak0;->e:I

    .line 78
    .line 79
    if-eqz p2, :cond_1

    .line 80
    .line 81
    const p2, 0x7f0606da

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    const p2, 0x7f040afc

    .line 90
    .line 91
    .line 92
    invoke-static {p2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    :goto_1
    iput p2, p0, La/wak0;->f:I

    .line 97
    .line 98
    sget-object v2, La/ivb0;->b:La/ymx;

    .line 99
    .line 100
    iput-object v2, p0, La/wak0;->h:La/ymx;

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    iput-boolean v2, p0, La/wak0;->i:Z

    .line 104
    .line 105
    const v3, 0x3f99999a    # 1.2f

    .line 106
    .line 107
    .line 108
    iput v3, p0, La/wak0;->j:F

    .line 109
    .line 110
    const/16 v3, 0x64

    .line 111
    .line 112
    iput-byte v3, p0, La/wak0;->k:B

    .line 113
    .line 114
    const/16 v3, 0x1e

    .line 115
    .line 116
    iput-byte v3, p0, La/wak0;->l:B

    .line 117
    .line 118
    new-instance v3, Landroid/widget/ImageView;

    .line 119
    .line 120
    invoke-direct {v3, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 121
    .line 122
    .line 123
    const v4, 0x7f0a0730

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 127
    .line 128
    .line 129
    const-string v4, "SmallTabIconView"

    .line 130
    .line 131
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v2}, Landroid/view/View;->setDuplicateParentStateEnabled(Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3}, Landroid/view/View;->isSelected()Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_2

    .line 145
    .line 146
    move v4, p2

    .line 147
    goto :goto_2

    .line 148
    :cond_2
    move v4, v1

    .line 149
    :goto_2
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 150
    .line 151
    invoke-virtual {v3, v4, v5}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 152
    .line 153
    .line 154
    iput-object v3, p0, La/wak0;->m:Landroid/widget/ImageView;

    .line 155
    .line 156
    new-instance v4, Landroid/widget/TextView;

    .line 157
    .line 158
    invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 159
    .line 160
    .line 161
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 162
    .line 163
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 167
    .line 168
    .line 169
    const/16 v5, 0x11

    .line 170
    .line 171
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 172
    .line 173
    .line 174
    const v5, 0x7f1403ca

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Landroid/view/View;->isSelected()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_3

    .line 185
    .line 186
    move v1, p2

    .line 187
    :cond_3
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 188
    .line 189
    .line 190
    iput-object v4, p0, La/wak0;->n:Landroid/widget/TextView;

    .line 191
    .line 192
    new-instance p2, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 193
    .line 194
    const/4 v1, 0x6

    .line 195
    invoke-direct {p2, p1, v0, v1}, Lorg/xplatform/uikit/components/counter/DsCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 196
    .line 197
    .line 198
    sget-object p1, La/r0m;->m:La/r0m;

    .line 199
    .line 200
    invoke-virtual {p2, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setComponentStyle(La/r0m;)V

    .line 201
    .line 202
    .line 203
    iput-object p2, p0, La/wak0;->o:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 204
    .line 205
    new-instance p1, La/if5;

    .line 206
    .line 207
    new-instance p2, La/goi0;

    .line 208
    .line 209
    const/16 v1, 0x8

    .line 210
    .line 211
    invoke-direct {p2, p0, v1}, La/goi0;-><init>(Ljava/lang/Object;B)V

    .line 212
    .line 213
    .line 214
    invoke-direct {p1, v3, p2}, La/if5;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 215
    .line 216
    .line 217
    iput-object p1, p0, La/wak0;->p:La/if5;

    .line 218
    .line 219
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 229
    .line 230
    .line 231
    const p0, 0x7f0408c2

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v0, p0}, La/if5;->f(Landroid/util/AttributeSet;I)V

    .line 235
    .line 236
    .line 237
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, La/vf5;->b:La/vf5;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    iget-object p0, p0, La/wak0;->p:La/if5;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/if5;->a(La/vf5;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/wak0;->o:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->i(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object p0, p0, La/wak0;->p:La/if5;

    .line 11
    .line 12
    iput-object v0, p0, La/if5;->g:Ljava/lang/Integer;

    .line 13
    .line 14
    iget-object p0, p0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lorg/xplatform/uikit/components/badges/DsBadge;->d:La/k14;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/k14;->e(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public getCount()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, La/wak0;->o:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCount()Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onCreateDrawableState(I)[I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, La/wak0;->o:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/counter/DsCounter;->getCount()Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    const v0, 0x7f04087e

    .line 22
    .line 23
    .line 24
    if-lez p0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    neg-int v0, v0

    .line 28
    :goto_1
    filled-new-array {v0}, [I

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p1, p0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 10

    .line 1
    sub-int/2addr p4, p2

    .line 2
    div-int/lit8 p4, p4, 0x2

    .line 3
    .line 4
    iget-object p1, p0, La/wak0;->m:Landroid/widget/ImageView;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    div-int/lit8 p2, p2, 0x2

    .line 11
    .line 12
    sub-int/2addr p4, p2

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    sub-int p2, p5, p2

    .line 18
    .line 19
    iget-object v0, p0, La/wak0;->n:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-int/2addr p2, v1

    .line 26
    iget v1, p0, La/wak0;->d:I

    .line 27
    .line 28
    sub-int/2addr p2, v1

    .line 29
    sub-int/2addr p2, p3

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, p4

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    sub-int v3, p5, v3

    .line 40
    .line 41
    sub-int/2addr v3, v1

    .line 42
    sub-int/2addr v3, p3

    .line 43
    invoke-virtual {p1, p4, p2, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 44
    .line 45
    .line 46
    iget p1, p0, La/wak0;->c:I

    .line 47
    .line 48
    add-int v2, p4, p1

    .line 49
    .line 50
    iget v3, p0, La/wak0;->b:I

    .line 51
    .line 52
    add-int v6, v2, v3

    .line 53
    .line 54
    add-int v2, p2, v1

    .line 55
    .line 56
    add-int v7, v2, v3

    .line 57
    .line 58
    add-int v4, p4, p1

    .line 59
    .line 60
    add-int v5, p2, v1

    .line 61
    .line 62
    iget-object v8, p0, La/wak0;->o:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 63
    .line 64
    move-object v9, p0

    .line 65
    invoke-static/range {v4 .. v9}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    sub-int p0, p5, p0

    .line 73
    .line 74
    sub-int/2addr p0, v1

    .line 75
    sub-int/2addr p0, p3

    .line 76
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    sub-int/2addr p5, v1

    .line 81
    sub-int/2addr p5, p3

    .line 82
    const/4 p2, 0x0

    .line 83
    invoke-virtual {v0, p2, p0, p1, p5}, Landroid/view/View;->layout(IIII)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p2, p0, La/wak0;->a:I

    .line 6
    .line 7
    const/high16 v0, 0x40000000    # 2.0f

    .line 8
    .line 9
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    iget-object v2, p0, La/wak0;->m:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {v2, v1, p2}, Landroid/view/View;->measure(II)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v3, p0, La/wak0;->n:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {v3, p2, v1}, Landroid/view/View;->measure(II)V

    .line 34
    .line 35
    .line 36
    iget p2, p0, La/wak0;->b:I

    .line 37
    .line 38
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iget-object v0, p0, La/wak0;->o:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 47
    .line 48
    invoke-virtual {v0, v1, p2}, Landroid/view/View;->measure(II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    add-int/2addr v0, p2

    .line 60
    iget p2, p0, La/wak0;->d:I

    .line 61
    .line 62
    add-int/2addr v0, p2

    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    instance-of v1, p2, La/kao0;

    .line 68
    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    check-cast p2, La/kao0;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const/4 p2, 0x0

    .line 75
    :goto_0
    if-eqz p2, :cond_1

    .line 76
    .line 77
    invoke-interface {p2, v0}, La/kao0;->setMaxItemHeight(I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final performClick()Z
    .locals 5

    .line 1
    iget-object v0, p0, La/wak0;->h:La/ymx;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    sget-wide v3, La/ivb0;->c:J

    .line 11
    .line 12
    sub-long/2addr v1, v3

    .line 13
    iget-short v0, v0, La/ymx;->a:S

    .line 14
    .line 15
    int-to-long v3, v0

    .line 16
    cmp-long v0, v1, v3

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p0, v0}, La/wak0;->setSelected(Z)V

    .line 23
    .line 24
    .line 25
    iget-boolean v0, p0, La/wak0;->i:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, La/wak0;->m:Landroid/widget/ImageView;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget v2, p0, La/wak0;->j:F

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-byte v2, p0, La/wak0;->k:B

    .line 46
    .line 47
    int-to-long v2, v2

    .line 48
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    .line 53
    .line 54
    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v2, La/vak0;

    .line 62
    .line 63
    invoke-direct {v2, p0, v1}, La/vak0;-><init>(La/wak0;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 71
    .line 72
    .line 73
    :cond_0
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :cond_1
    return v1
.end method

.method public setCount(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/wak0;->o:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/counter/DsCounter;->setCount(Ljava/lang/Integer;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/wak0;->m:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p1, v0

    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    const/16 v0, 0x8

    .line 16
    .line 17
    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    instance-of v0, p1, La/cjj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/cjj;

    .line 7
    .line 8
    iget-object v0, v0, La/cjj;->d:La/ymx;

    .line 9
    .line 10
    iput-object v0, p0, La/wak0;->h:La/ymx;

    .line 11
    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setSelect(Z)V
    .locals 4

    .line 1
    iget v0, p0, La/wak0;->e:I

    .line 2
    .line 3
    iget v1, p0, La/wak0;->f:I

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    move v2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v2, v0

    .line 10
    :goto_0
    iget-object v3, p0, La/wak0;->n:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    move v0, v1

    .line 18
    :cond_1
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 19
    .line 20
    iget-object v2, p0, La/wak0;->m:Landroid/widget/ImageView;

    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 23
    .line 24
    .line 25
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, La/wak0;->g:La/tdo0;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0}, La/tdo0;->j(Landroid/widget/FrameLayout;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setTabSelectListener(La/tdo0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/wak0;->g:La/tdo0;

    .line 2
    .line 3
    return-void
.end method

.method public final setText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/wak0;->n:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 19
    :goto_1
    if-eqz p1, :cond_2

    .line 20
    .line 21
    const/16 v0, 0x8

    .line 22
    .line 23
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
