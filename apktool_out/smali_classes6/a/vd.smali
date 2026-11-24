.class public final La/vd;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/fe;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

.field public final i:Landroid/view/View;

.field public final j:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

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
    const v2, 0x7f0706ea

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, p0, La/vd;->a:I

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v2, 0x7f070722

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, p0, La/vd;->b:I

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const v2, 0x7f07072d

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iput v1, p0, La/vd;->c:I

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const v2, 0x7f0706e2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iput v1, p0, La/vd;->d:I

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const v3, 0x7f07066c

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    iput v2, p0, La/vd;->e:I

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const v3, 0x7f0706b7

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    iput v2, p0, La/vd;->f:I

    .line 85
    .line 86
    add-int/2addr v1, v1

    .line 87
    iput v1, p0, La/vd;->g:I

    .line 88
    .line 89
    new-instance v1, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 90
    .line 91
    invoke-direct {v1, p1, v0}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const v2, 0x7f07074b

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    const v3, 0x7f07074a

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const v3, 0x7f140497

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, p1, v3, v0, v2}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->b(Landroid/content/Context;ILjava/lang/Float;Ljava/lang/Float;)V

    .line 128
    .line 129
    .line 130
    iput-object v1, p0, La/vd;->h:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 131
    .line 132
    new-instance v0, Landroid/view/View;

    .line 133
    .line 134
    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, La/jmu0;->d()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    .line 142
    .line 143
    .line 144
    const v2, 0x7f0805ff

    .line 145
    .line 146
    .line 147
    invoke-static {v2, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 152
    .line 153
    .line 154
    iput-object v0, p0, La/vd;->i:Landroid/view/View;

    .line 155
    .line 156
    new-instance v2, Landroid/view/View;

    .line 157
    .line 158
    invoke-direct {v2, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 159
    .line 160
    .line 161
    invoke-static {}, La/jmu0;->d()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    .line 166
    .line 167
    .line 168
    const v3, 0x7f080207

    .line 169
    .line 170
    .line 171
    invoke-static {v3, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 176
    .line 177
    .line 178
    iput-object v2, p0, La/vd;->j:Landroid/view/View;

    .line 179
    .line 180
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 187
    .line 188
    .line 189
    return-void
.end method


# virtual methods
.method public getVisibleText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, La/vd;->h:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->getVisibleText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 8

    .line 1
    iget-object p4, p0, La/vd;->j:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, La/vd;->h:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    div-int/lit8 p3, p3, 0x2

    .line 22
    .line 23
    div-int/lit8 p5, p1, 0x2

    .line 24
    .line 25
    sub-int/2addr p3, p5

    .line 26
    add-int/2addr p1, p3

    .line 27
    move-object v7, p0

    .line 28
    const/4 p0, 0x0

    .line 29
    move p5, p3

    .line 30
    move p3, p1

    .line 31
    move p1, p5

    .line 32
    move-object p5, v7

    .line 33
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    sub-int/2addr p0, v1

    .line 41
    div-int/lit8 v3, p0, 0x2

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    iget v2, v7, La/vd;->d:I

    .line 48
    .line 49
    add-int v4, p0, v2

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    add-int v5, p0, v3

    .line 56
    .line 57
    iget-object v6, v7, La/vd;->h:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 58
    .line 59
    invoke-static/range {v2 .. v7}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 60
    .line 61
    .line 62
    iget p0, v7, La/vd;->a:I

    .line 63
    .line 64
    sub-int v2, p2, p0

    .line 65
    .line 66
    iget p0, v7, La/vd;->b:I

    .line 67
    .line 68
    sub-int v3, p1, p0

    .line 69
    .line 70
    iget-object v6, v7, La/vd;->i:Landroid/view/View;

    .line 71
    .line 72
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    add-int v4, p0, v2

    .line 77
    .line 78
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int v5, p0, v3

    .line 83
    .line 84
    invoke-static/range {v2 .. v7}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, La/vd;->c:I

    .line 6
    .line 7
    sub-int/2addr p1, v0

    .line 8
    iget v1, p0, La/vd;->g:I

    .line 9
    .line 10
    sub-int/2addr p1, v1

    .line 11
    const/high16 v2, 0x40000000    # 2.0f

    .line 12
    .line 13
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v3, p0, La/vd;->h:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 18
    .line 19
    invoke-virtual {v3, p1, p2}, Landroid/view/View;->measure(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/2addr p1, v1

    .line 27
    add-int/2addr p1, v0

    .line 28
    iget p2, p0, La/vd;->e:I

    .line 29
    .line 30
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iget-object v4, p0, La/vd;->i:Landroid/view/View;

    .line 39
    .line 40
    invoke-virtual {v4, v0, p2}, Landroid/view/View;->measure(II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    add-int/2addr p2, v1

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const v1, 0x7f07068c

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    iget-object v1, p0, La/vd;->j:Landroid/view/View;

    .line 68
    .line 69
    invoke-virtual {v1, p2, v0}, Landroid/view/View;->measure(II)V

    .line 70
    .line 71
    .line 72
    iget p2, p0, La/vd;->f:I

    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public setBackground(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/vd;->j:Landroid/view/View;

    .line 5
    .line 6
    invoke-static {p0, p1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setModel(La/sd;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/sd;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-object p1, p1, La/sd;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, La/vd;->h:Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Lorg/xplatform/uikit/components/account_control/AmountCurrencyView;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
