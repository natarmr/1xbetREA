.class public final Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/cbo;


# instance fields
.field public final q:La/jg;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 14

    .line 1
    and-int/lit8 v0, p3, 0x2

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, v2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object/from16 v0, p2

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const v3, 0x7f040356

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v3, 0x7f0d01ad

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    const v0, 0x7f0a0565

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Landroidx/constraintlayout/widget/Barrier;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    const v0, 0x7f0a05ad

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    const v0, 0x7f0a05af

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Landroid/widget/TextView;

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    const v0, 0x7f0a0cd3

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 70
    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    const v0, 0x7f0a0cf9

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    check-cast v6, Landroidx/constraintlayout/widget/Barrier;

    .line 81
    .line 82
    if-eqz v6, :cond_1

    .line 83
    .line 84
    const v0, 0x7f0a0d43

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 92
    .line 93
    if-eqz v6, :cond_1

    .line 94
    .line 95
    const v0, 0x7f0a0d45

    .line 96
    .line 97
    .line 98
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    check-cast v7, Landroid/widget/TextView;

    .line 103
    .line 104
    if-eqz v7, :cond_1

    .line 105
    .line 106
    const v0, 0x7f0a1146

    .line 107
    .line 108
    .line 109
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    check-cast v8, Landroid/widget/TextView;

    .line 114
    .line 115
    if-eqz v8, :cond_1

    .line 116
    .line 117
    const v0, 0x7f0a13a4

    .line 118
    .line 119
    .line 120
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    check-cast v9, Landroid/widget/TextView;

    .line 125
    .line 126
    if-eqz v9, :cond_1

    .line 127
    .line 128
    const v0, 0x7f0a13a5

    .line 129
    .line 130
    .line 131
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    check-cast v10, Landroid/widget/TextView;

    .line 136
    .line 137
    if-eqz v10, :cond_1

    .line 138
    .line 139
    const v0, 0x7f0a13a6

    .line 140
    .line 141
    .line 142
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v11

    .line 146
    check-cast v11, Landroid/widget/TextView;

    .line 147
    .line 148
    if-eqz v11, :cond_1

    .line 149
    .line 150
    const v0, 0x7f0a13a7

    .line 151
    .line 152
    .line 153
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    check-cast v12, Landroid/widget/TextView;

    .line 158
    .line 159
    if-eqz v12, :cond_1

    .line 160
    .line 161
    const v0, 0x7f0a13a8

    .line 162
    .line 163
    .line 164
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    check-cast v13, Landroid/widget/TextView;

    .line 169
    .line 170
    if-eqz v13, :cond_1

    .line 171
    .line 172
    new-instance v0, La/jg;

    .line 173
    .line 174
    move-object v1, p0

    .line 175
    move-object v2, v3

    .line 176
    move-object v3, v4

    .line 177
    move-object v4, v5

    .line 178
    move-object v5, v6

    .line 179
    move-object v6, v7

    .line 180
    move-object v7, v8

    .line 181
    move-object v8, v9

    .line 182
    move-object v9, v10

    .line 183
    move-object v10, v11

    .line 184
    move-object v11, v12

    .line 185
    move-object v12, v13

    .line 186
    invoke-direct/range {v0 .. v12}, La/jg;-><init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Lorg/xplatform/uikit_sport/score/SportScore;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 187
    .line 188
    .line 189
    iput-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->q:La/jg;

    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    const-string v1, "Missing required view with ID: "

    .line 205
    .line 206
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw v2
.end method


# virtual methods
.method public final setFirstTeamLogo(I)V
    .locals 1

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 32
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->setFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setFirstTeamLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->q:La/jg;

    .line 2
    .line 3
    iget-object v0, p0, La/jg;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 6
    .line 7
    iget-object p0, p0, La/jg;->e:Landroid/view/View;

    .line 8
    .line 9
    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->g(Landroid/widget/ImageView;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setGameLabel(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->q:La/jg;

    .line 2
    .line 3
    iget-object v0, p0, La/jg;->h:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/TextView;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/16 v1, 0x8

    .line 19
    .line 20
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/jg;->h:Landroid/view/View;

    .line 24
    .line 25
    check-cast p0, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setPlayerOneName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->q:La/jg;

    .line 2
    .line 3
    iget-object p0, p0, La/jg;->b:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setPlayerTwoName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->q:La/jg;

    .line 2
    .line 3
    iget-object p0, p0, La/jg;->c:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setScoreModel(La/p5h0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->q:La/jg;

    .line 5
    .line 6
    iget-object p0, p0, La/jg;->f:Landroid/view/View;

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
    .locals 2

    .line 34
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->q:La/jg;

    iget-object v0, v0, La/jg;->g:Landroid/view/View;

    check-cast v0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 37
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->setSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setSecondTeamLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->q:La/jg;

    .line 2
    .line 3
    iget-object v0, p0, La/jg;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 6
    .line 7
    iget-object p0, p0, La/jg;->g:Landroid/view/View;

    .line 8
    .line 9
    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->g(Landroid/widget/ImageView;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setSecondTeamLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleRoulette;->q:La/jg;

    iget-object v0, p0, La/jg;->g:Landroid/view/View;

    check-cast v0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 33
    iget-object p0, p0, La/jg;->g:Landroid/view/View;

    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/16 v0, 0xe

    invoke-static {p0, p1, v1, v0}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method
