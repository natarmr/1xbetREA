.class public final Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/cbo;


# instance fields
.field public final q:La/zkk;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const p2, 0x7f0d01ac

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    const p1, 0x7f0a0183

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    move-object v3, p2

    .line 34
    check-cast v3, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    const p1, 0x7f0a018e

    .line 39
    .line 40
    .line 41
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    move-object v4, p2

    .line 46
    check-cast v4, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 47
    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    const p1, 0x7f0a05ae

    .line 51
    .line 52
    .line 53
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Landroidx/constraintlayout/widget/Barrier;

    .line 58
    .line 59
    if-eqz p2, :cond_1

    .line 60
    .line 61
    const p1, 0x7f0a05af

    .line 62
    .line 63
    .line 64
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    move-object v5, p2

    .line 69
    check-cast v5, Landroid/widget/TextView;

    .line 70
    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    const p1, 0x7f0a0cd3

    .line 74
    .line 75
    .line 76
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    move-object v6, p2

    .line 81
    check-cast v6, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 82
    .line 83
    if-eqz v6, :cond_1

    .line 84
    .line 85
    const p1, 0x7f0a0d44

    .line 86
    .line 87
    .line 88
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    check-cast p2, Landroidx/constraintlayout/widget/Barrier;

    .line 93
    .line 94
    if-eqz p2, :cond_1

    .line 95
    .line 96
    const p1, 0x7f0a0d45

    .line 97
    .line 98
    .line 99
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    move-object v7, p2

    .line 104
    check-cast v7, Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v7, :cond_1

    .line 107
    .line 108
    const p1, 0x7f0a1005

    .line 109
    .line 110
    .line 111
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    move-object v8, p2

    .line 116
    check-cast v8, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 117
    .line 118
    if-eqz v8, :cond_1

    .line 119
    .line 120
    const p1, 0x7f0a1014

    .line 121
    .line 122
    .line 123
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    move-object v9, p2

    .line 128
    check-cast v9, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 129
    .line 130
    if-eqz v9, :cond_1

    .line 131
    .line 132
    new-instance v1, La/zkk;

    .line 133
    .line 134
    move-object v2, p0

    .line 135
    invoke-direct/range {v1 .. v9}, La/zkk;-><init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Lorg/xplatform/uikit_sport/score/SportScore;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;)V

    .line 136
    .line 137
    .line 138
    iput-object v1, v2, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    .line 139
    .line 140
    return-void

    .line 141
    :cond_1
    move-object v2, p0

    .line 142
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    const-string p1, "Missing required view with ID: "

    .line 151
    .line 152
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0
.end method


# virtual methods
.method public final setBotFirstTeamLogo(I)V
    .locals 1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->setBotFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setBotFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

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

.method public final setBotFirstTeamLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    iget-object p0, p0, La/zkk;->b:Ljava/lang/Object;

    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final setBotSecondTeamLogo(I)V
    .locals 1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->setBotSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setBotSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    .line 2
    .line 3
    iget-object v0, p0, La/zkk;->c:Ljava/lang/Object;

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
    iget-object p0, p0, La/zkk;->c:Ljava/lang/Object;

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

.method public final setBotSecondTeamLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    iget-object p0, p0, La/zkk;->c:Ljava/lang/Object;

    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final setFirstTeamsName(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->setFirstTeamsName(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setFirstTeamsName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    iget-object p0, p0, La/zkk;->d:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setScore(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->setScore(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setScore(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    iget-object p0, p0, La/zkk;->g:Ljava/lang/Object;

    check-cast p0, Lorg/xplatform/uikit_sport/score/SportScore;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setScoreModel(La/p5h0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

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

.method public final setSecondTeamsName(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->setSecondTeamsName(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setSecondTeamsName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    iget-object p0, p0, La/zkk;->e:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTopFirstTeamLogo(I)V
    .locals 1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->setTopFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setTopFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

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

.method public final setTopFirstTeamLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    iget-object p0, p0, La/zkk;->h:Ljava/lang/Object;

    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final setTopSecondTeamLogo(I)V
    .locals 1

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->setTopSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setTopSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    .line 2
    .line 3
    iget-object v0, p0, La/zkk;->i:Landroid/view/View;

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
    iget-object p0, p0, La/zkk;->i:Landroid/view/View;

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

.method public final setTopSecondTeamLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddlePairTeams;->q:La/zkk;

    iget-object p0, p0, La/zkk;->i:Landroid/view/View;

    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method
