.class public final La/zw00;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/kdb0;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Landroid/widget/FrameLayout;

.field public final i:La/uil;

.field public final j:Landroid/widget/ImageView;

.field public final k:Landroidx/appcompat/widget/AppCompatImageView;

.field public final l:Lorg/xplatform/uikit/components/separator/DsSeparator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const v1, 0x7f0409db

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
    const v2, 0x7f07072d

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, La/zw00;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const v2, 0x7f070736

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iput v1, p0, La/zw00;->b:I

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const v3, 0x7f07070c

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iput v2, p0, La/zw00;->c:I

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const v3, 0x7f0706c1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    iput v2, p0, La/zw00;->d:I

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    const v3, 0x7f070633

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iput v2, p0, La/zw00;->e:I

    .line 75
    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const v3, 0x7f07067a

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iput v2, p0, La/zw00;->f:I

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const v3, 0x7f0706b7

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    iput v2, p0, La/zw00;->g:I

    .line 101
    .line 102
    new-instance v2, Landroid/widget/FrameLayout;

    .line 103
    .line 104
    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    iput-object v2, p0, La/zw00;->h:Landroid/widget/FrameLayout;

    .line 108
    .line 109
    new-instance v3, La/uil;

    .line 110
    .line 111
    invoke-direct {v3, p1}, La/uil;-><init>(Landroid/content/Context;)V

    .line 112
    .line 113
    .line 114
    const-string v4, "DSNavigationBarPopularAmountView"

    .line 115
    .line 116
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, La/jmu0;->d()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 124
    .line 125
    .line 126
    iput-object v3, p0, La/zw00;->i:La/uil;

    .line 127
    .line 128
    new-instance v4, Landroid/widget/ImageView;

    .line 129
    .line 130
    invoke-direct {v4, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, La/jmu0;->d()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-virtual {v4, v5}, Landroid/view/View;->setId(I)V

    .line 138
    .line 139
    .line 140
    const-string v5, "DSNavigationBarPopularLogoView"

    .line 141
    .line 142
    invoke-virtual {v4, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    .line 146
    .line 147
    .line 148
    iput-object v4, p0, La/zw00;->j:Landroid/widget/ImageView;

    .line 149
    .line 150
    new-instance v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 151
    .line 152
    invoke-direct {v1, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    .line 153
    .line 154
    .line 155
    const-string v5, "DSNavigationBarPopularSearchView"

    .line 156
    .line 157
    invoke-virtual {v1, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-static {}, La/jmu0;->d()I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    invoke-virtual {v1, v5}, Landroid/view/View;->setId(I)V

    .line 165
    .line 166
    .line 167
    const v5, 0x7f0809ee

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 171
    .line 172
    .line 173
    const v5, 0x7f040b0b

    .line 174
    .line 175
    .line 176
    invoke-static {v5, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 181
    .line 182
    .line 183
    iput-object v1, p0, La/zw00;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 184
    .line 185
    new-instance v5, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 186
    .line 187
    const/4 v6, 0x6

    .line 188
    const/4 v7, 0x0

    .line 189
    invoke-direct {v5, p1, v0, v6, v7}, Lorg/xplatform/uikit/components/separator/DsSeparator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 190
    .line 191
    .line 192
    invoke-static {}, La/jmu0;->d()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-virtual {v5, v0}, Landroid/view/View;->setId(I)V

    .line 197
    .line 198
    .line 199
    const v0, 0x7f040b17

    .line 200
    .line 201
    .line 202
    invoke-static {v0, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-virtual {v5, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 207
    .line 208
    .line 209
    iput-object v5, p0, La/zw00;->l:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 210
    .line 211
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 224
    .line 225
    .line 226
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/16 p1, 0x8

    .line 6
    .line 7
    :goto_0
    iget-object p0, p0, La/zw00;->l:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public getVisibleText()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/zw00;->i:La/uil;

    .line 2
    .line 3
    invoke-virtual {p0}, La/uil;->getVisibleAmount()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sub-int v6, p5, p3

    .line 4
    .line 5
    sub-int v7, p4, p2

    .line 6
    .line 7
    iget-object v0, v5, La/zw00;->i:La/uil;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v8, v5, La/zw00;->j:Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    div-int/lit8 v4, v7, 0x2

    .line 28
    .line 29
    move v9, v0

    .line 30
    iget v0, v5, La/zw00;->a:I

    .line 31
    .line 32
    add-int/2addr v1, v0

    .line 33
    sub-int v10, v6, v9

    .line 34
    .line 35
    const/4 v11, 0x2

    .line 36
    div-int/2addr v10, v11

    .line 37
    add-int/2addr v9, v10

    .line 38
    add-int v12, v1, v0

    .line 39
    .line 40
    div-int/lit8 v13, v2, 0x2

    .line 41
    .line 42
    sub-int/2addr v4, v13

    .line 43
    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    .line 44
    .line 45
    .line 46
    move-result v12

    .line 47
    add-int v13, v12, v2

    .line 48
    .line 49
    sub-int v2, v6, v3

    .line 50
    .line 51
    div-int/lit8 v14, v2, 0x2

    .line 52
    .line 53
    add-int v15, v14, v3

    .line 54
    .line 55
    iget-object v4, v5, La/zw00;->i:La/uil;

    .line 56
    .line 57
    move v2, v1

    .line 58
    move v3, v9

    .line 59
    move v1, v10

    .line 60
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 61
    .line 62
    .line 63
    move-object v4, v8

    .line 64
    move v0, v12

    .line 65
    move v2, v13

    .line 66
    move v1, v14

    .line 67
    move v3, v15

    .line 68
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v1, 0x1

    .line 76
    if-ne v0, v1, :cond_0

    .line 77
    .line 78
    const/high16 v0, -0x40800000    # -1.0f

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 82
    .line 83
    :goto_0
    iget-object v8, v5, La/zw00;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 84
    .line 85
    invoke-virtual {v8, v0}, Landroid/view/View;->setScaleX(F)V

    .line 86
    .line 87
    .line 88
    iget-object v4, v5, La/zw00;->h:Landroid/widget/FrameLayout;

    .line 89
    .line 90
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    sub-int v0, v7, v9

    .line 107
    .line 108
    iget v1, v5, La/zw00;->a:I

    .line 109
    .line 110
    sub-int/2addr v0, v1

    .line 111
    add-int v2, v0, v9

    .line 112
    .line 113
    iget v1, v5, La/zw00;->d:I

    .line 114
    .line 115
    sub-int/2addr v1, v10

    .line 116
    div-int/2addr v1, v11

    .line 117
    add-int v3, v1, v10

    .line 118
    .line 119
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    invoke-static {v9, v12, v11, v0}, La/hne;->d(IIII)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    add-int/2addr v12, v0

    .line 131
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-static {v10, v13, v11, v1}, La/hne;->d(IIII)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    add-int/2addr v13, v1

    .line 140
    invoke-virtual {v8, v0, v1, v12, v13}, Landroid/view/View;->layout(IIII)V

    .line 141
    .line 142
    .line 143
    iget v0, v5, La/zw00;->e:I

    .line 144
    .line 145
    sub-int v1, v6, v0

    .line 146
    .line 147
    iget-object v4, v5, La/zw00;->l:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 148
    .line 149
    const/4 v0, 0x0

    .line 150
    move v3, v6

    .line 151
    move v2, v7

    .line 152
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p2, p0, La/zw00;->b:I

    .line 6
    .line 7
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget v1, p0, La/zw00;->c:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, La/zw00;->j:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {v2, p2, v1}, Landroid/view/View;->measure(II)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, La/zw00;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/high16 v3, 0x40000000    # 2.0f

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    iget v1, p0, La/zw00;->g:I

    .line 35
    .line 36
    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget v5, p0, La/zw00;->f:I

    .line 45
    .line 46
    invoke-static {v5, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-static {v5, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    iget-object v7, p0, La/zw00;->h:Landroid/widget/FrameLayout;

    .line 55
    .line 56
    invoke-virtual {v7, v4, v1}, Landroid/view/View;->measure(II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v6, v5}, Landroid/view/View;->measure(II)V

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    div-int/lit8 v1, p1, 0x2

    .line 67
    .line 68
    div-int/lit8 p2, p2, 0x2

    .line 69
    .line 70
    sub-int/2addr v1, p2

    .line 71
    iget p2, p0, La/zw00;->a:I

    .line 72
    .line 73
    sub-int/2addr v1, p2

    .line 74
    const/4 p2, 0x0

    .line 75
    if-gez v1, :cond_1

    .line 76
    .line 77
    move v1, p2

    .line 78
    :cond_1
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iget-object v1, p0, La/zw00;->i:La/uil;

    .line 87
    .line 88
    invoke-virtual {v1, v0, p2}, Landroid/view/View;->measure(II)V

    .line 89
    .line 90
    .line 91
    invoke-static {p1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    iget v0, p0, La/zw00;->e:I

    .line 96
    .line 97
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget-object v1, p0, La/zw00;->l:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 102
    .line 103
    invoke-virtual {v1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 104
    .line 105
    .line 106
    iget p2, p0, La/zw00;->d:I

    .line 107
    .line 108
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public setAccountControlStyle(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/zw00;->i:La/uil;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/uil;->setStyle(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setAmountVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/zw00;->i:La/uil;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x4

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setLogo(La/jx00;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/hx00;

    .line 5
    .line 6
    iget-object p0, p0, La/zw00;->j:Landroid/widget/ImageView;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, La/hx00;

    .line 11
    .line 12
    iget p1, p1, La/hx00;->a:I

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    instance-of v0, p1, La/ix00;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p1, La/ix00;

    .line 23
    .line 24
    iget v0, p1, La/ix00;->b:I

    .line 25
    .line 26
    iget-object p1, p1, La/ix00;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v2, La/k1x;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-direct {v2, v3}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, v2, La/k1x;->c:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v2, p0}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v0}, La/t1x;->f(La/k1x;I)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v0}, La/t1x;->c(La/k1x;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, La/k1x;->a()La/o1x;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v1, p0}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public setModel(La/sd;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/zw00;->i:La/uil;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/uil;->setModel(La/sd;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnAmountClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/c0;

    .line 5
    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-direct {v0, p1, v1}, La/c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/zw00;->i:La/uil;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setOnSearchIconClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/c0;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, p1, v1}, La/c0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/zw00;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setSearchIconVisibility(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La/zw00;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2
    .line 3
    iget-object v1, p0, La/zw00;->h:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    const/16 p0, 0x8

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
