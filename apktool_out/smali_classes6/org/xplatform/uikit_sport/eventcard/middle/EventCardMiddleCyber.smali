.class public final Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/cbo;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:La/zkk;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const p3, 0x7f040359

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const p3, 0x7f070717

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iput p2, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->a:I

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const p3, 0x7f07072d

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iput p2, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->b:I

    .line 41
    .line 42
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const p2, 0x7f0d01a8

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    const p1, 0x7f0a0565

    .line 53
    .line 54
    .line 55
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Landroidx/constraintlayout/widget/Barrier;

    .line 60
    .line 61
    if-eqz p2, :cond_1

    .line 62
    .line 63
    const p1, 0x7f0a05ad

    .line 64
    .line 65
    .line 66
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    move-object v3, p2

    .line 71
    check-cast v3, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 72
    .line 73
    if-eqz v3, :cond_1

    .line 74
    .line 75
    const p1, 0x7f0a05af

    .line 76
    .line 77
    .line 78
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    move-object v4, p2

    .line 83
    check-cast v4, Landroid/widget/TextView;

    .line 84
    .line 85
    if-eqz v4, :cond_1

    .line 86
    .line 87
    const p1, 0x7f0a05b2

    .line 88
    .line 89
    .line 90
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    move-object v5, p2

    .line 95
    check-cast v5, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 96
    .line 97
    if-eqz v5, :cond_1

    .line 98
    .line 99
    const p1, 0x7f0a0cd3

    .line 100
    .line 101
    .line 102
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    move-object v6, p2

    .line 107
    check-cast v6, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 108
    .line 109
    if-eqz v6, :cond_1

    .line 110
    .line 111
    const p1, 0x7f0a0cf9

    .line 112
    .line 113
    .line 114
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    check-cast p2, Landroidx/constraintlayout/widget/Barrier;

    .line 119
    .line 120
    if-eqz p2, :cond_1

    .line 121
    .line 122
    const p1, 0x7f0a0d43

    .line 123
    .line 124
    .line 125
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    move-object v7, p2

    .line 130
    check-cast v7, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 131
    .line 132
    if-eqz v7, :cond_1

    .line 133
    .line 134
    const p1, 0x7f0a0d45

    .line 135
    .line 136
    .line 137
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    move-object v8, p2

    .line 142
    check-cast v8, Landroid/widget/TextView;

    .line 143
    .line 144
    if-eqz v8, :cond_1

    .line 145
    .line 146
    const p1, 0x7f0a0d48

    .line 147
    .line 148
    .line 149
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    move-object v9, p2

    .line 154
    check-cast v9, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 155
    .line 156
    if-eqz v9, :cond_1

    .line 157
    .line 158
    new-instance v1, La/zkk;

    .line 159
    .line 160
    move-object v2, p0

    .line 161
    invoke-direct/range {v1 .. v9}, La/zkk;-><init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;Lorg/xplatform/uikit_sport/score/SportScore;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;)V

    .line 162
    .line 163
    .line 164
    iput-object v1, v2, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 165
    .line 166
    const/4 p0, 0x0

    .line 167
    invoke-virtual {v2, p0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_1
    move-object v2, p0

    .line 172
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    const-string p1, "Missing required view with ID: "

    .line 181
    .line 182
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v0
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 4

    .line 1
    sub-int/2addr p4, p2

    .line 2
    sub-int/2addr p5, p3

    .line 3
    iget-object p1, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 4
    .line 5
    iget-object p2, p1, La/zkk;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p2, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object p3, p1, La/zkk;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p3, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 16
    .line 17
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sub-int/2addr p4, p2

    .line 22
    div-int/lit8 p4, p4, 0x2

    .line 23
    .line 24
    sub-int v1, p5, v0

    .line 25
    .line 26
    div-int/lit8 v1, v1, 0x2

    .line 27
    .line 28
    add-int/2addr p2, p4

    .line 29
    add-int/2addr v0, v1

    .line 30
    invoke-virtual {p3, p4, v1, p2, v0}, Landroid/view/View;->layout(IIII)V

    .line 31
    .line 32
    .line 33
    iget-object p3, p1, La/zkk;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p3, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 36
    .line 37
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    sub-int/2addr p4, v0

    .line 46
    iget v2, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->a:I

    .line 47
    .line 48
    sub-int/2addr p4, v2

    .line 49
    sub-int v3, p5, v1

    .line 50
    .line 51
    div-int/lit8 v3, v3, 0x2

    .line 52
    .line 53
    add-int/2addr v0, p4

    .line 54
    add-int/2addr v1, v3

    .line 55
    invoke-virtual {p3, p4, v3, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 56
    .line 57
    .line 58
    iget-object p3, p1, La/zkk;->i:Landroid/view/View;

    .line 59
    .line 60
    check-cast p3, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 61
    .line 62
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/2addr p2, v2

    .line 71
    sub-int v2, p5, v1

    .line 72
    .line 73
    div-int/lit8 v2, v2, 0x2

    .line 74
    .line 75
    add-int/2addr v0, p2

    .line 76
    add-int/2addr v1, v2

    .line 77
    invoke-virtual {p3, p2, v2, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 78
    .line 79
    .line 80
    iget-object p2, p1, La/zkk;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 83
    .line 84
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    sub-int/2addr p4, p3

    .line 93
    iget p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->b:I

    .line 94
    .line 95
    sub-int/2addr p4, p0

    .line 96
    sub-int v2, p5, v1

    .line 97
    .line 98
    div-int/lit8 v2, v2, 0x2

    .line 99
    .line 100
    add-int/2addr p3, p4

    .line 101
    add-int/2addr v1, v2

    .line 102
    invoke-virtual {p2, p4, v2, p3, v1}, Landroid/view/View;->layout(IIII)V

    .line 103
    .line 104
    .line 105
    iget-object p2, p1, La/zkk;->h:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p2, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 108
    .line 109
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    add-int/2addr v0, p0

    .line 118
    sub-int v2, p5, v1

    .line 119
    .line 120
    div-int/lit8 v2, v2, 0x2

    .line 121
    .line 122
    add-int/2addr p3, v0

    .line 123
    add-int/2addr v1, v2

    .line 124
    invoke-virtual {p2, v0, v2, p3, v1}, Landroid/view/View;->layout(IIII)V

    .line 125
    .line 126
    .line 127
    iget-object p2, p1, La/zkk;->d:Landroid/widget/TextView;

    .line 128
    .line 129
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    sub-int/2addr p4, v0

    .line 138
    sub-int/2addr p4, p0

    .line 139
    sub-int v2, p5, v1

    .line 140
    .line 141
    div-int/lit8 v2, v2, 0x2

    .line 142
    .line 143
    add-int/2addr v0, p4

    .line 144
    add-int/2addr v1, v2

    .line 145
    invoke-virtual {p2, p4, v2, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 146
    .line 147
    .line 148
    iget-object p1, p1, La/zkk;->e:Landroid/view/View;

    .line 149
    .line 150
    check-cast p1, Landroid/widget/TextView;

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 157
    .line 158
    .line 159
    move-result p4

    .line 160
    add-int/2addr p3, p0

    .line 161
    sub-int/2addr p5, p4

    .line 162
    div-int/lit8 p5, p5, 0x2

    .line 163
    .line 164
    add-int/2addr p2, p3

    .line 165
    add-int/2addr p4, p5

    .line 166
    invoke-virtual {p1, p3, p5, p2, p4}, Landroid/view/View;->layout(IIII)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->b:I

    .line 5
    .line 6
    mul-int/lit8 p1, p1, 0x6

    .line 7
    .line 8
    iget p2, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->a:I

    .line 9
    .line 10
    mul-int/lit8 p2, p2, 0x2

    .line 11
    .line 12
    add-int/2addr p2, p1

    .line 13
    iget-object p1, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 14
    .line 15
    iget-object v0, p1, La/zkk;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p1, La/zkk;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    add-int/2addr v1, v0

    .line 32
    iget-object v0, p1, La/zkk;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p1, La/zkk;->i:Landroid/view/View;

    .line 41
    .line 42
    check-cast v2, Lorg/xplatform/uikit_sport/victoryindiacator/SportVictoryIndicator;

    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    sub-int/2addr v0, v1

    .line 54
    sub-int/2addr v0, v2

    .line 55
    iget-object v1, p1, La/zkk;->g:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    sub-int/2addr v0, v1

    .line 64
    sub-int/2addr v0, p2

    .line 65
    div-int/lit8 v0, v0, 0x2

    .line 66
    .line 67
    iget-object p2, p1, La/zkk;->d:Landroid/widget/TextView;

    .line 68
    .line 69
    const/high16 v1, 0x40000000    # 2.0f

    .line 70
    .line 71
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {p2, v2, v3}, Landroid/view/View;->measure(II)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p1, La/zkk;->e:Landroid/view/View;

    .line 87
    .line 88
    check-cast p1, Landroid/widget/TextView;

    .line 89
    .line 90
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-static {p0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    invoke-virtual {p1, p2, p0}, Landroid/view/View;->measure(II)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final setFirstTeamLogo(I)V
    .locals 1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->setFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 2
    .line 3
    iget-object v0, p0, La/zkk;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/zkk;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final setFirstTeamLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    iget-object p0, p0, La/zkk;->b:Ljava/lang/Object;

    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final setFirstTeamName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 2
    .line 3
    iget-object p0, p0, La/zkk;->d:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setScore(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 5
    .line 6
    iget-object p0, p0, La/zkk;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setScoreModel(La/p5h0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 5
    .line 6
    iget-object p0, p0, La/zkk;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/score/SportScore;->setScore(La/p5h0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSecondTeamLogo(I)V
    .locals 1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->setSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 2
    .line 3
    iget-object v0, p0, La/zkk;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/zkk;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final setSecondTeamLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    iget-object p0, p0, La/zkk;->h:Ljava/lang/Object;

    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final setSecondTeamName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyber;->c:La/zkk;

    .line 2
    .line 3
    iget-object p0, p0, La/zkk;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
