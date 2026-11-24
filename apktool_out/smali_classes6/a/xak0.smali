.class public final La/xak0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/zse;


# instance fields
.field public final a:La/f3h0;

.field public final b:La/f3h0;

.field public final c:La/n0o0;

.field public final d:La/n0o0;

.field public e:I

.field public f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I


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
    new-instance v0, La/f3h0;

    .line 10
    .line 11
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 12
    .line 13
    const v2, 0x7f140a6c

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, La/f3h0;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/xak0;->a:La/f3h0;

    .line 23
    .line 24
    new-instance v0, La/f3h0;

    .line 25
    .line 26
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 27
    .line 28
    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, La/f3h0;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/xak0;->b:La/f3h0;

    .line 35
    .line 36
    new-instance v0, La/hrf0;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/xak0;->c:La/n0o0;

    .line 47
    .line 48
    new-instance v0, La/hrf0;

    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    invoke-direct {v0, p1, v1}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, La/xak0;->d:La/n0o0;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const v0, 0x7f07067a

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput p1, p0, La/xak0;->g:I

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    iput p1, p0, La/xak0;->h:I

    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const v0, 0x7f07072d

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iput p1, p0, La/xak0;->i:I

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iput p1, p0, La/xak0;->j:I

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const v0, 0x7f070717

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    iput p1, p0, La/xak0;->k:I

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    iput p1, p0, La/xak0;->l:I

    .line 128
    .line 129
    return-void
.end method

.method private final getFirstTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;
    .locals 0

    .line 1
    iget-object p0, p0, La/xak0;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getSecondTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;
    .locals 0

    .line 1
    iget-object p0, p0, La/xak0;->d:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getTotalWidth()I
    .locals 2

    .line 1
    invoke-direct {p0}, La/xak0;->getFirstTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-direct {p0}, La/xak0;->getSecondTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget v1, p0, La/xak0;->f:I

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    if-lez v1, :cond_0

    .line 25
    .line 26
    iget p0, p0, La/xak0;->k:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    :goto_0
    add-int/2addr v0, p0

    .line 31
    return v0
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, La/xak0;->h:I

    .line 14
    .line 15
    div-int/lit8 v1, v0, 0x2

    .line 16
    .line 17
    iget v6, p0, La/xak0;->l:I

    .line 18
    .line 19
    add-int v2, v1, v6

    .line 20
    .line 21
    iget v7, p0, La/xak0;->j:I

    .line 22
    .line 23
    invoke-static {v6, v0, v7, v1}, La/hne;->D(IIII)I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    invoke-direct {p0}, La/xak0;->getFirstTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    div-int/lit8 v0, v0, 0x2

    .line 36
    .line 37
    sub-int v1, v2, v0

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    div-int/lit8 v0, v0, 0x2

    .line 44
    .line 45
    add-int v3, v0, v2

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    move-object v5, p0

    .line 53
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, La/xak0;->getSecondTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    div-int/lit8 v0, v0, 0x2

    .line 65
    .line 66
    sub-int v1, v8, v0

    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    div-int/lit8 v0, v0, 0x2

    .line 73
    .line 74
    add-int v3, v0, v8

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, La/xak0;->getFirstTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-direct {p0}, La/xak0;->getSecondTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget v1, p0, La/xak0;->k:I

    .line 105
    .line 106
    add-int/2addr v0, v1

    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    iget v1, p0, La/xak0;->l:I

    .line 116
    .line 117
    iget-object v4, p0, La/xak0;->a:La/f3h0;

    .line 118
    .line 119
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 120
    .line 121
    .line 122
    iget-object v1, p0, La/xak0;->a:La/f3h0;

    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    add-int/2addr v2, v6

    .line 129
    add-int/2addr v2, v7

    .line 130
    move-object v3, v1

    .line 131
    move v1, v2

    .line 132
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    add-int/2addr v3, v6

    .line 141
    add-int/2addr v3, v7

    .line 142
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    add-int/2addr v3, v4

    .line 147
    iget-object v4, p0, La/xak0;->b:La/f3h0;

    .line 148
    .line 149
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 150
    .line 151
    .line 152
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    iget v0, p0, La/xak0;->e:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v2, p0, La/xak0;->g:I

    .line 9
    .line 10
    if-gt v0, v1, :cond_1

    .line 11
    .line 12
    move v0, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    sub-int/2addr v0, v1

    .line 15
    iget v3, p0, La/xak0;->i:I

    .line 16
    .line 17
    mul-int/2addr v0, v3

    .line 18
    add-int/2addr v0, v2

    .line 19
    :goto_0
    iput v0, p0, La/xak0;->f:I

    .line 20
    .line 21
    iget-object v2, p0, La/xak0;->a:La/f3h0;

    .line 22
    .line 23
    const/high16 v3, 0x40000000    # 2.0f

    .line 24
    .line 25
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {v2, v0, p2}, Landroid/view/View;->measure(II)V

    .line 30
    .line 31
    .line 32
    iget v0, p0, La/xak0;->f:I

    .line 33
    .line 34
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/xak0;->b:La/f3h0;

    .line 39
    .line 40
    invoke-virtual {v2, v0, p2}, Landroid/view/View;->measure(II)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, La/xak0;->getFirstTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0}, La/xak0;->getSecondTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 55
    .line 56
    .line 57
    iget p1, p0, La/xak0;->h:I

    .line 58
    .line 59
    mul-int/2addr p1, v1

    .line 60
    iget p2, p0, La/xak0;->j:I

    .line 61
    .line 62
    add-int/2addr p1, p2

    .line 63
    iget p2, p0, La/xak0;->l:I

    .line 64
    .line 65
    add-int/2addr p1, p2

    .line 66
    invoke-direct {p0}, La/xak0;->getTotalWidth()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-static {p2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-static {p1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public setScoreUiModel(La/yse;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/use;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, La/use;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v1, v0, La/use;->d:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, v0, La/use;->a:Ljava/lang/String;

    .line 19
    .line 20
    check-cast p1, La/use;

    .line 21
    .line 22
    iget-boolean p1, p1, La/use;->g:Z

    .line 23
    .line 24
    iget-object v3, p0, La/xak0;->b:La/f3h0;

    .line 25
    .line 26
    iget-object v4, p0, La/xak0;->a:La/f3h0;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v4, v2}, La/f3h0;->setTeamScore(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v1}, La/f3h0;->setTeamScore(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, v0, La/use;->c:La/pip0;

    .line 37
    .line 38
    invoke-virtual {v4, p1}, La/f3h0;->setTeamScoreState(La/pip0;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, v0, La/use;->e:La/pip0;

    .line 42
    .line 43
    invoke-virtual {v3, p1}, La/f3h0;->setTeamScoreState(La/pip0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput p1, p0, La/xak0;->e:I

    .line 59
    .line 60
    :cond_2
    invoke-direct {p0}, La/xak0;->getFirstTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v1, v0, La/use;->b:La/heu0;

    .line 65
    .line 66
    iget v2, v1, La/heu0;->b:I

    .line 67
    .line 68
    iget v1, v1, La/heu0;->a:I

    .line 69
    .line 70
    invoke-virtual {p1, v2, v1}, La/u46;->b(II)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, La/xak0;->getSecondTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v0, v0, La/use;->f:La/heu0;

    .line 78
    .line 79
    iget v1, v0, La/heu0;->b:I

    .line 80
    .line 81
    iget v0, v0, La/heu0;->a:I

    .line 82
    .line 83
    invoke-virtual {p1, v1, v0}, La/u46;->b(II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-nez p1, :cond_3

    .line 91
    .line 92
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-nez p1, :cond_4

    .line 100
    .line 101
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    invoke-direct {p0}, La/xak0;->getFirstTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-nez p1, :cond_5

    .line 113
    .line 114
    invoke-direct {p0}, La/xak0;->getFirstTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    invoke-direct {p0}, La/xak0;->getSecondTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-nez p1, :cond_6

    .line 130
    .line 131
    invoke-direct {p0}, La/xak0;->getSecondTeamVictoryIndicatorView()Lorg/xplatform/uikit/components/victory_indicator_compact/DsVictoryIndicatorCompact;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 139
    .line 140
    .line 141
    return-void
.end method
