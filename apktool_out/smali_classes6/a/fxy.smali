.class public final La/fxy;
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

.field public f:La/tdo0;

.field public g:La/ymx;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Lorg/xplatform/uikit/components/counter/DsCounter;

.field public final l:Landroid/widget/ImageView;

.field public final m:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const v1, 0x7f0408c2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, 0x7f0706b7

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, La/fxy;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const v2, 0x7f070660

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, p0, La/fxy;->b:I

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const v2, 0x7f070717

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iput v1, p0, La/fxy;->c:I

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const v2, 0x7f070705

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iput v1, p0, La/fxy;->d:I

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const v2, 0x7f07072d

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iput v1, p0, La/fxy;->e:I

    .line 75
    .line 76
    sget-object v2, La/ivb0;->b:La/ymx;

    .line 77
    .line 78
    iput-object v2, p0, La/fxy;->g:La/ymx;

    .line 79
    .line 80
    if-eqz p2, :cond_0

    .line 81
    .line 82
    const v2, 0x7f0606e0

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v2}, Landroid/content/Context;->getColor(I)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    const v2, 0x7f040b0b

    .line 91
    .line 92
    .line 93
    invoke-static {v2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    :goto_0
    iput v2, p0, La/fxy;->h:I

    .line 98
    .line 99
    if-eqz p2, :cond_1

    .line 100
    .line 101
    const v3, 0x7f0606da

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    goto :goto_1

    .line 109
    :cond_1
    const v3, 0x7f040afc

    .line 110
    .line 111
    .line 112
    invoke-static {v3, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    :goto_1
    iput v3, p0, La/fxy;->i:I

    .line 117
    .line 118
    if-eqz p2, :cond_2

    .line 119
    .line 120
    const v4, 0x7f040b21

    .line 121
    .line 122
    .line 123
    invoke-static {v4, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    goto :goto_2

    .line 128
    :cond_2
    const v4, 0x7f040b03

    .line 129
    .line 130
    .line 131
    invoke-static {v4, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    :goto_2
    iput v4, p0, La/fxy;->j:I

    .line 136
    .line 137
    new-instance v5, Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 138
    .line 139
    const/4 v6, 0x6

    .line 140
    invoke-direct {v5, p1, v0, v6}, Lorg/xplatform/uikit/components/counter/DsCounter;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 141
    .line 142
    .line 143
    sget-object v6, La/r0m;->m:La/r0m;

    .line 144
    .line 145
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit/components/counter/DsCounter;->setComponentStyle(La/r0m;)V

    .line 146
    .line 147
    .line 148
    iput-object v5, p0, La/fxy;->k:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 149
    .line 150
    new-instance v5, Landroid/widget/ImageView;

    .line 151
    .line 152
    invoke-direct {v5, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 153
    .line 154
    .line 155
    const v6, 0x7f0a0730

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5, v6}, Landroid/view/View;->setId(I)V

    .line 159
    .line 160
    .line 161
    const-string v6, "LargeTabIconView"

    .line 162
    .line 163
    invoke-virtual {v5, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 170
    .line 171
    .line 172
    if-eqz p2, :cond_3

    .line 173
    .line 174
    const p2, 0x7f080f24

    .line 175
    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_3
    const p2, 0x7f080f1f

    .line 179
    .line 180
    .line 181
    :goto_3
    invoke-virtual {v5, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 185
    .line 186
    .line 187
    const/4 p2, 0x1

    .line 188
    invoke-virtual {v5, p2}, Landroid/view/View;->setDuplicateParentStateEnabled(Z)V

    .line 189
    .line 190
    .line 191
    iput-object v5, p0, La/fxy;->l:Landroid/widget/ImageView;

    .line 192
    .line 193
    new-instance v0, Landroid/widget/TextView;

    .line 194
    .line 195
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 196
    .line 197
    .line 198
    sget-object p1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 199
    .line 200
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 204
    .line 205
    .line 206
    const p1, 0x7f1403ca

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 210
    .line 211
    .line 212
    const/16 p1, 0x11

    .line 213
    .line 214
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 215
    .line 216
    .line 217
    const/4 p1, 0x3

    .line 218
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, p1}, Landroid/view/View;->setTextDirection(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_4

    .line 229
    .line 230
    move v2, v3

    .line 231
    :cond_4
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 232
    .line 233
    .line 234
    iput-object v0, p0, La/fxy;->m:Landroid/widget/TextView;

    .line 235
    .line 236
    invoke-virtual {p0, p2}, Landroid/view/View;->setClickable(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 246
    .line 247
    .line 248
    return-void
.end method


# virtual methods
.method public getCount()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, La/fxy;->k:Lorg/xplatform/uikit/components/counter/DsCounter;

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
    iget-object p0, p0, La/fxy;->k:Lorg/xplatform/uikit/components/counter/DsCounter;

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
    iget-object p1, p0, La/fxy;->l:Landroid/widget/ImageView;

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
    iget-object p3, p0, La/fxy;->m:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sub-int/2addr p2, v0

    .line 26
    iget v0, p0, La/fxy;->e:I

    .line 27
    .line 28
    sub-int/2addr p2, v0

    .line 29
    iget v1, p0, La/fxy;->d:I

    .line 30
    .line 31
    sub-int/2addr p2, v1

    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, p4

    .line 37
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    sub-int v3, p5, v3

    .line 42
    .line 43
    sub-int/2addr v3, v0

    .line 44
    sub-int/2addr v3, v1

    .line 45
    invoke-virtual {p1, p4, p2, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 46
    .line 47
    .line 48
    iget p1, p0, La/fxy;->b:I

    .line 49
    .line 50
    div-int/lit8 p2, p1, 0x2

    .line 51
    .line 52
    div-int/lit8 p4, p1, 0x3

    .line 53
    .line 54
    sub-int/2addr p2, p4

    .line 55
    sub-int p4, v2, p1

    .line 56
    .line 57
    iget v1, p0, La/fxy;->c:I

    .line 58
    .line 59
    add-int v4, p4, v1

    .line 60
    .line 61
    add-int v6, v2, v1

    .line 62
    .line 63
    sub-int p1, v3, p1

    .line 64
    .line 65
    add-int v5, p1, p2

    .line 66
    .line 67
    add-int v7, v3, p2

    .line 68
    .line 69
    iget-object v8, p0, La/fxy;->k:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 70
    .line 71
    move-object v9, p0

    .line 72
    invoke-static/range {v4 .. v9}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    sub-int p0, p5, p0

    .line 80
    .line 81
    sub-int/2addr p0, v0

    .line 82
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    sub-int/2addr p5, v0

    .line 87
    const/4 p2, 0x0

    .line 88
    invoke-virtual {p3, p2, p0, p1, p5}, Landroid/view/View;->layout(IIII)V

    .line 89
    .line 90
    .line 91
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
    iget p2, p0, La/fxy;->a:I

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
    iget-object v2, p0, La/fxy;->l:Landroid/widget/ImageView;

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
    iget-object v3, p0, La/fxy;->m:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-virtual {v3, p2, v1}, Landroid/view/View;->measure(II)V

    .line 34
    .line 35
    .line 36
    iget p2, p0, La/fxy;->b:I

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
    iget-object v0, p0, La/fxy;->k:Lorg/xplatform/uikit/components/counter/DsCounter;

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
    iget p2, p0, La/fxy;->d:I

    .line 61
    .line 62
    add-int/2addr v0, p2

    .line 63
    iget p2, p0, La/fxy;->e:I

    .line 64
    .line 65
    add-int/2addr v0, p2

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    instance-of v1, p2, La/kao0;

    .line 71
    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    check-cast p2, La/kao0;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const/4 p2, 0x0

    .line 78
    :goto_0
    if-eqz p2, :cond_1

    .line 79
    .line 80
    invoke-interface {p2, v0}, La/kao0;->setMaxItemHeight(I)V

    .line 81
    .line 82
    .line 83
    :cond_1
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final performClick()Z
    .locals 5

    .line 1
    iget-object v0, p0, La/fxy;->g:La/ymx;

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
    if-lez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, La/fxy;->setSelected(Z)V

    .line 22
    .line 23
    .line 24
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public setCount(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/fxy;->k:Lorg/xplatform/uikit/components/counter/DsCounter;

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
    iget-object p0, p0, La/fxy;->l:Landroid/widget/ImageView;

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
    iput-object v0, p0, La/fxy;->g:La/ymx;

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
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget v0, p0, La/fxy;->i:I

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, La/fxy;->h:I

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, La/fxy;->m:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/fxy;->l:Landroid/widget/ImageView;

    .line 14
    .line 15
    iget v1, p0, La/fxy;->j:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, La/fxy;->f:La/tdo0;

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
    iput-object p1, p0, La/fxy;->f:La/tdo0;

    .line 2
    .line 3
    return-void
.end method

.method public final setText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/fxy;->m:Landroid/widget/TextView;

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
