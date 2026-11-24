.class public final La/ur5;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:F

.field public final g:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;B)V
    .locals 7

    .line 1
    iput-byte p2, p0, La/ur5;->a:B

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    const v1, 0x7f0705c6

    .line 5
    .line 6
    .line 7
    const v2, 0x7f070637

    .line 8
    .line 9
    .line 10
    const v3, 0x7f070691

    .line 11
    .line 12
    .line 13
    const v4, 0x7f07063e

    .line 14
    .line 15
    .line 16
    const v5, 0x7f07069c

    .line 17
    .line 18
    .line 19
    const/4 v6, 0x0

    .line 20
    packed-switch p2, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1, v6}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iput p2, p0, La/ur5;->b:I

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    iput p2, p0, La/ur5;->c:I

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    iput p2, p0, La/ur5;->d:I

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    iput p2, p0, La/ur5;->e:I

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 86
    .line 87
    int-to-float v1, v1

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 97
    .line 98
    div-float/2addr v1, v2

    .line 99
    iput v1, p0, La/ur5;->f:F

    .line 100
    .line 101
    new-instance v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 102
    .line 103
    invoke-direct {v1, p1, v6, v0}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v1, p2}, La/jmu0;->i(Landroid/view/View;I)V

    .line 110
    .line 111
    .line 112
    iput-object v1, p0, La/ur5;->g:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-direct {p0, p1, v6}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    iput p2, p0, La/ur5;->b:I

    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    iput p2, p0, La/ur5;->c:I

    .line 140
    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    iput p2, p0, La/ur5;->d:I

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    iput p2, p0, La/ur5;->e:I

    .line 160
    .line 161
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 178
    .line 179
    int-to-float v1, v1

    .line 180
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 189
    .line 190
    div-float/2addr v1, v2

    .line 191
    iput v1, p0, La/ur5;->f:F

    .line 192
    .line 193
    new-instance v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 194
    .line 195
    invoke-direct {v1, p1, v6, v0}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v1, p2}, La/jmu0;->i(Landroid/view/View;I)V

    .line 202
    .line 203
    .line 204
    iput-object v1, p0, La/ur5;->g:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 205
    .line 206
    return-void

    .line 207
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/ur5;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/ur5;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    iget-byte p1, p0, La/ur5;->a:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p1, p0, La/ur5;->f:F

    .line 7
    .line 8
    const/high16 p2, 0x43b40000    # 360.0f

    .line 9
    .line 10
    cmpg-float v0, p1, p2

    .line 11
    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    iget v0, p0, La/ur5;->d:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget v0, p0, La/ur5;->b:I

    .line 18
    .line 19
    :goto_0
    cmpg-float p1, p1, p2

    .line 20
    .line 21
    if-gez p1, :cond_1

    .line 22
    .line 23
    iget p1, p0, La/ur5;->e:I

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iget p1, p0, La/ur5;->c:I

    .line 27
    .line 28
    :goto_1
    const/high16 p2, 0x40000000    # 2.0f

    .line 29
    .line 30
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget-object v3, p0, La/ur5;->g:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 39
    .line 40
    invoke-virtual {v3, v1, v2}, Landroid/view/View;->measure(II)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_0
    iget p1, p0, La/ur5;->f:F

    .line 56
    .line 57
    const/high16 p2, 0x43b40000    # 360.0f

    .line 58
    .line 59
    cmpg-float v0, p1, p2

    .line 60
    .line 61
    if-gez v0, :cond_2

    .line 62
    .line 63
    iget v0, p0, La/ur5;->d:I

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget v0, p0, La/ur5;->b:I

    .line 67
    .line 68
    :goto_2
    cmpg-float p1, p1, p2

    .line 69
    .line 70
    if-gez p1, :cond_3

    .line 71
    .line 72
    iget p1, p0, La/ur5;->e:I

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    iget p1, p0, La/ur5;->c:I

    .line 76
    .line 77
    :goto_3
    const/high16 p2, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iget-object v3, p0, La/ur5;->g:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 88
    .line 89
    invoke-virtual {v3, v1, v2}, Landroid/view/View;->measure(II)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
