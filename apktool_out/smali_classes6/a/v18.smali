.class public final La/v18;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/zse;
.implements La/rkg0;


# instance fields
.field public final a:Lorg/xplatform/uikit_sport/score/SportScore;

.field public b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

.field public c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

.field public final d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

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
    new-instance v1, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    invoke-direct {v1, p1, v0, v2}, Lorg/xplatform/uikit_sport/score/SportScore;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 16
    .line 17
    const/4 v0, -0x2

    .line 18
    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, La/v18;->a:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const v0, 0x7f070717

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, La/v18;->d:I

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    iget-boolean p1, p0, La/v18;->e:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 p2, 0x1

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object v4, p0, La/v18;->b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    iget v1, p0, La/v18;->i:I

    .line 17
    .line 18
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    add-int v2, p1, v1

    .line 23
    .line 24
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v0, 0x0

    .line 29
    move-object v5, p0

    .line 30
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    move-object p5, v5

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object p5, p0

    .line 36
    :goto_0
    iget-object p4, p5, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 37
    .line 38
    if-eqz p4, :cond_3

    .line 39
    .line 40
    iget p0, p5, La/v18;->h:I

    .line 41
    .line 42
    iget p1, p5, La/v18;->j:I

    .line 43
    .line 44
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    add-int/2addr p2, p0

    .line 49
    iget p3, p5, La/v18;->j:I

    .line 50
    .line 51
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr p3, v0

    .line 56
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object p5, p0

    .line 61
    iget-object p0, p5, La/v18;->b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 62
    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    iget p1, p5, La/v18;->i:I

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    add-int/2addr p2, p1

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    const/4 p4, 0x0

    .line 77
    invoke-virtual {p0, p4, p1, p2, p3}, Landroid/view/View;->layout(IIII)V

    .line 78
    .line 79
    .line 80
    :cond_2
    iget-object p0, p5, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 81
    .line 82
    if-eqz p0, :cond_3

    .line 83
    .line 84
    iget p1, p5, La/v18;->h:I

    .line 85
    .line 86
    iget p2, p5, La/v18;->j:I

    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 89
    .line 90
    .line 91
    move-result p3

    .line 92
    add-int/2addr p3, p1

    .line 93
    iget p4, p5, La/v18;->j:I

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    add-int/2addr v0, p4

    .line 100
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/view/View;->layout(IIII)V

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_1
    iget p0, p5, La/v18;->f:I

    .line 104
    .line 105
    iget p1, p5, La/v18;->g:I

    .line 106
    .line 107
    iget-object p2, p5, La/v18;->a:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 108
    .line 109
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    add-int/2addr p3, p0

    .line 114
    iget p4, p5, La/v18;->g:I

    .line 115
    .line 116
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 117
    .line 118
    .line 119
    move-result p5

    .line 120
    add-int/2addr p5, p4

    .line 121
    invoke-virtual {p2, p0, p1, p3, p5}, Landroid/view/View;->layout(IIII)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final onMeasure(II)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, La/v18;->a:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 12
    .line 13
    invoke-virtual {v1, v0, p2}, Landroid/view/View;->measure(II)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/v18;->b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object p1, p0, La/v18;->b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 31
    .line 32
    const/4 p2, 0x0

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move p1, p2

    .line 41
    :goto_0
    iget-object v0, p0, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move v0, p2

    .line 51
    :goto_1
    iget-object v2, p0, La/v18;->b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    move v2, p2

    .line 61
    :goto_2
    iget-object v3, p0, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 62
    .line 63
    if-eqz v3, :cond_5

    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    goto :goto_3

    .line 70
    :cond_5
    move v3, p2

    .line 71
    :goto_3
    iget-object v4, p0, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 72
    .line 73
    if-eqz v4, :cond_6

    .line 74
    .line 75
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    move v4, p2

    .line 81
    :goto_4
    add-int/2addr v4, p1

    .line 82
    iget v5, p0, La/v18;->d:I

    .line 83
    .line 84
    mul-int/lit8 v6, v5, 0x2

    .line 85
    .line 86
    add-int/2addr v6, v4

    .line 87
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    if-lez p1, :cond_7

    .line 92
    .line 93
    if-lez v0, :cond_7

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_7
    const/4 v4, 0x0

    .line 97
    :goto_5
    if-eqz v4, :cond_8

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    add-int/2addr v0, p2

    .line 108
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-static {p2, v4}, Ljava/lang/Math;->max(II)I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    div-int/lit8 v4, v0, 0x2

    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    div-int/lit8 v6, v6, 0x2

    .line 127
    .line 128
    sub-int/2addr v4, v6

    .line 129
    iput v4, p0, La/v18;->f:I

    .line 130
    .line 131
    div-int/lit8 v4, p2, 0x2

    .line 132
    .line 133
    div-int/lit8 v2, v2, 0x2

    .line 134
    .line 135
    sub-int v2, v4, v2

    .line 136
    .line 137
    iput v2, p0, La/v18;->i:I

    .line 138
    .line 139
    div-int/lit8 v3, v3, 0x2

    .line 140
    .line 141
    sub-int v2, v4, v3

    .line 142
    .line 143
    iput v2, p0, La/v18;->j:I

    .line 144
    .line 145
    mul-int/lit8 v5, v5, 0x2

    .line 146
    .line 147
    add-int/2addr v5, p1

    .line 148
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    add-int/2addr p1, v5

    .line 153
    iput p1, p0, La/v18;->h:I

    .line 154
    .line 155
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    div-int/lit8 p1, p1, 0x2

    .line 160
    .line 161
    sub-int/2addr v4, p1

    .line 162
    iput v4, p0, La/v18;->g:I

    .line 163
    .line 164
    const/high16 p1, 0x40000000    # 2.0f

    .line 165
    .line 166
    invoke-static {v0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-static {p2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public setRtlSupportEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, La/v18;->e:Z

    .line 2
    .line 3
    iget-object v0, p0, La/v18;->a:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit_sport/score/SportScore;->setRtlSupportEnabled(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/v18;->b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;->setRtlSupportEnabled(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;->setRtlSupportEnabled(Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setScoreUiModel(La/yse;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/use;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/use;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, v1

    .line 13
    :goto_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-boolean v0, p1, La/use;->g:Z

    .line 17
    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    new-instance v0, La/n5h0;

    .line 21
    .line 22
    iget-object v2, p1, La/use;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, La/use;->d:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p1, La/use;->c:La/pip0;

    .line 27
    .line 28
    sget-object v5, La/pip0;->d:La/pip0;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x1

    .line 32
    if-ne v4, v5, :cond_2

    .line 33
    .line 34
    move v4, v7

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move v4, v6

    .line 37
    :goto_1
    iget-object v8, p1, La/use;->e:La/pip0;

    .line 38
    .line 39
    if-ne v8, v5, :cond_3

    .line 40
    .line 41
    move v6, v7

    .line 42
    :cond_3
    invoke-direct {v0, v2, v3, v4, v6}, La/n5h0;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_4
    sget-object v0, La/o5h0;->a:La/o5h0;

    .line 47
    .line 48
    :goto_2
    iget-object v2, p0, La/v18;->a:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit_sport/score/SportScore;->setScore(La/p5h0;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p1, La/use;->b:La/heu0;

    .line 54
    .line 55
    iget v2, v0, La/heu0;->b:I

    .line 56
    .line 57
    iget v0, v0, La/heu0;->a:I

    .line 58
    .line 59
    iget-object v3, p0, La/v18;->b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 60
    .line 61
    const/4 v4, 0x6

    .line 62
    if-nez v2, :cond_6

    .line 63
    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    :cond_5
    iput-object v1, p0, La/v18;->b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_6
    if-nez v3, :cond_7

    .line 73
    .line 74
    new-instance v3, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 75
    .line 76
    new-instance v5, Landroid/view/ContextThemeWrapper;

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const v7, 0x7f140a8e

    .line 83
    .line 84
    .line 85
    invoke-direct {v5, v6, v7}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v3, v5, v1, v4}, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 89
    .line 90
    .line 91
    iget-boolean v5, p0, La/v18;->e:Z

    .line 92
    .line 93
    invoke-virtual {v3, v5}, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;->setRtlSupportEnabled(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    iput-object v3, p0, La/v18;->b:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 100
    .line 101
    :cond_7
    invoke-virtual {v3, v2, v0}, La/u46;->b(II)V

    .line 102
    .line 103
    .line 104
    :goto_3
    iget-object p1, p1, La/use;->f:La/heu0;

    .line 105
    .line 106
    iget v0, p1, La/heu0;->b:I

    .line 107
    .line 108
    iget p1, p1, La/heu0;->a:I

    .line 109
    .line 110
    iget-object v2, p0, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 111
    .line 112
    if-nez v0, :cond_9

    .line 113
    .line 114
    if-eqz v2, :cond_8

    .line 115
    .line 116
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    :cond_8
    iput-object v1, p0, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 120
    .line 121
    return-void

    .line 122
    :cond_9
    if-nez v2, :cond_a

    .line 123
    .line 124
    new-instance v2, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 125
    .line 126
    new-instance v3, Landroid/view/ContextThemeWrapper;

    .line 127
    .line 128
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    const v6, 0x7f140a90

    .line 133
    .line 134
    .line 135
    invoke-direct {v3, v5, v6}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 136
    .line 137
    .line 138
    invoke-direct {v2, v3, v1, v4}, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 139
    .line 140
    .line 141
    iget-boolean v1, p0, La/v18;->e:Z

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;->setRtlSupportEnabled(Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 147
    .line 148
    .line 149
    iput-object v2, p0, La/v18;->c:Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 150
    .line 151
    :cond_a
    invoke-virtual {v2, v0, p1}, La/u46;->b(II)V

    .line 152
    .line 153
    .line 154
    return-void
.end method
