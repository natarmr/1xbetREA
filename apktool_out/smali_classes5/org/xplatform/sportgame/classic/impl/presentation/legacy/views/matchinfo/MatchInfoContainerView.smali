.class public final Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/xke;


# static fields
.field public static final synthetic t1:I


# instance fields
.field public A:La/lnd;

.field public B:La/hsr;

.field public f1:La/y930;

.field public g1:Z

.field public h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

.field public i1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

.field public j1:La/du20;

.field public k1:La/du20;

.field public l1:La/roi0;

.field public m1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;

.field public n1:La/gbl0;

.field public o1:Ljava/util/List;

.field public final p1:La/pz40;

.field public final q:La/a8z;

.field public q1:Z

.field public final r:La/a8z;

.field public final r1:La/v930;

.field public final s:I

.field public final s1:La/n0o0;

.field public final t:I

.field public final u:I

.field public final v:I

.field public final w:I

.field public final x:I

.field public final y:La/n0o0;

.field public final z:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    sget-object p1, La/wez;->b:La/wez;

    .line 15
    .line 16
    new-instance p2, La/ha30;

    .line 17
    .line 18
    invoke-direct {p2, p0, p0, p3}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iput-object p2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->q:La/a8z;

    .line 26
    .line 27
    new-instance p2, La/n230;

    .line 28
    .line 29
    const/4 p3, 0x5

    .line 30
    invoke-direct {p2, p3}, La/n230;-><init>(B)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->r:La/a8z;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const p2, 0x7f070497

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->s:I

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const p2, 0x7f0700a1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t:I

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const p2, 0x7f0706f8

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iput p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->u:I

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const p2, 0x7f07070c

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    iput p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->v:I

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const p2, 0x7f07072d

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iput p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->w:I

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const p2, 0x7f0706e0

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iput p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->x:I

    .line 116
    .line 117
    new-instance p1, La/z930;

    .line 118
    .line 119
    invoke-direct {p1, p0, v0}, La/z930;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->y:La/n0o0;

    .line 127
    .line 128
    new-instance p1, La/z930;

    .line 129
    .line 130
    const/4 p2, 0x3

    .line 131
    invoke-direct {p1, p0, p2}, La/z930;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;B)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->z:La/n0o0;

    .line 139
    .line 140
    sget-object p1, La/y930;->b:La/y930;

    .line 141
    .line 142
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 143
    .line 144
    new-instance p1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 145
    .line 146
    sget-object p2, La/dja;->c:La/dja;

    .line 147
    .line 148
    const/4 p3, -0x1

    .line 149
    invoke-direct {p1, p2, p3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 150
    .line 151
    .line 152
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 153
    .line 154
    new-instance p1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 155
    .line 156
    invoke-direct {p1, p2, p3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 157
    .line 158
    .line 159
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->i1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 160
    .line 161
    sget-object p1, La/iun;->a:La/iun;

    .line 162
    .line 163
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->o1:Ljava/util/List;

    .line 164
    .line 165
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->p1:La/pz40;

    .line 170
    .line 171
    new-instance p1, La/v930;

    .line 172
    .line 173
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getAnimatorState()La/s930;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-direct {p1, p2}, La/v930;-><init>(La/s930;)V

    .line 178
    .line 179
    .line 180
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->r1:La/v930;

    .line 181
    .line 182
    new-instance p1, La/n230;

    .line 183
    .line 184
    const/4 p2, 0x6

    .line 185
    invoke-direct {p1, p2}, La/n230;-><init>(B)V

    .line 186
    .line 187
    .line 188
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->s1:La/n0o0;

    .line 193
    .line 194
    return-void
.end method

.method public static final C(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->setFirstCard(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final L(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;La/mbz;)Lkotlin/Unit;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->l1:La/roi0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La/roi0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/gbl0;

    .line 8
    .line 9
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/z4r;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->setTouchable(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->setTranslatedContainer(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, La/mbz;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final M(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;)Lkotlin/Unit;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->l1:La/roi0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La/roi0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/gbl0;

    .line 8
    .line 9
    sget-object v1, La/gbl0;->c2:La/lme0;

    .line 10
    .line 11
    invoke-virtual {v0}, La/gbl0;->I0()La/z4r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/z4r;->b:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->setTouchable(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-virtual {p0, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->setTranslatedContainer(Z)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method

.method private final getAnimatorState()La/s930;
    .locals 12

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/zhu0;->h:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 22
    .line 23
    invoke-static {v0}, La/bww;->O(La/y930;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    move v6, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->s:I

    .line 33
    .line 34
    move v6, v0

    .line 35
    :goto_0
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 36
    .line 37
    invoke-static {v0}, La/bww;->O(La/y930;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    iget v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t:I

    .line 44
    .line 45
    move v7, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v7, v1

    .line 48
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/zhu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    instance-of v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const/4 v0, 0x0

    .line 66
    :goto_2
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 69
    .line 70
    :cond_3
    move v8, v1

    .line 71
    new-instance v1, La/s930;

    .line 72
    .line 73
    iget v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->s:I

    .line 74
    .line 75
    iget v3, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t:I

    .line 76
    .line 77
    iget v9, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->x:I

    .line 78
    .line 79
    iget v10, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->w:I

    .line 80
    .line 81
    move-object v11, p0

    .line 82
    invoke-direct/range {v1 .. v11}, La/s930;-><init>(IIFFIIIIILorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;)V

    .line 83
    .line 84
    .line 85
    return-object v1
.end method

.method private final getBinding()La/zhu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, La/zhu0;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getBroadcastCardsScrollListener()La/fa30;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->y:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fa30;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getExpandAnimator()La/x930;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->s1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/x930;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getInformationCardsScrollListener()La/ga30;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->z:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ga30;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getSnapHelper()La/tk80;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->r:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tk80;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setFirstCard(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/ofs;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, La/ofs;

    .line 6
    .line 7
    invoke-virtual {p1}, La/ofs;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 12
    .line 13
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p1, p1, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 20
    .line 21
    iget v0, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->b:I

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->k1:La/du20;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 31
    .line 32
    invoke-virtual {p1, p0}, La/du20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method private final setScrollEnabled(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/ManageHorizontalScrollLinearLayout;

    .line 15
    .line 16
    iput-boolean p1, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/ManageHorizontalScrollLinearLayout;->g1:Z

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic u(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;)La/zhu0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final A(I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    move v3, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v2

    .line 31
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget-object p0, p0, La/zhu0;->d:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v1, v2

    .line 44
    :goto_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 49
    .line 50
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final B()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    new-instance v1, La/b120;

    .line 8
    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    invoke-direct {v1, p0, v2}, La/b120;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, La/wvb;->Z(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function2;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final D(Landroid/view/View;Landroid/view/View;La/mbz;)V
    .locals 19

    .line 1
    new-instance v0, La/qgd;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getPaginationView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getTabsContainerView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getMatchInfoCardsView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getCardsContainer()Landroid/view/ViewGroup;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    const/16 v8, 0xa

    .line 20
    .line 21
    move-object/from16 v3, p0

    .line 22
    .line 23
    move-object/from16 v2, p1

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    invoke-direct/range {v0 .. v8}, La/qgd;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    sget-object v1, La/y930;->b:La/y930;

    .line 31
    .line 32
    iput-object v1, v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 33
    .line 34
    iget-object v2, v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->m1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    new-instance v8, La/mbz;

    .line 39
    .line 40
    const/16 v9, 0x17

    .line 41
    .line 42
    move-object/from16 v10, p3

    .line 43
    .line 44
    invoke-direct {v8, v10, v3, v9}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getExpandAnimator()La/x930;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    new-instance v10, La/z930;

    .line 52
    .line 53
    const/4 v11, 0x1

    .line 54
    invoke-direct {v10, v3, v11}, La/z930;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;B)V

    .line 55
    .line 56
    .line 57
    new-instance v12, La/mbz;

    .line 58
    .line 59
    const/16 v13, 0x15

    .line 60
    .line 61
    invoke-direct {v12, v3, v8, v13}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v8, v9, La/x930;->a:Landroid/animation/AnimatorSet;

    .line 68
    .line 69
    if-eqz v8, :cond_0

    .line 70
    .line 71
    invoke-virtual {v8}, Landroid/animation/AnimatorSet;->cancel()V

    .line 72
    .line 73
    .line 74
    :cond_0
    new-instance v8, Landroid/animation/AnimatorSet;

    .line 75
    .line 76
    invoke-direct {v8}, Landroid/animation/AnimatorSet;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-static/range {p2 .. p2}, La/x930;->a(Landroid/view/View;)Landroid/animation/AnimatorSet;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x2

    .line 87
    new-array v15, v14, [F

    .line 88
    .line 89
    fill-array-data v15, :array_0

    .line 90
    .line 91
    .line 92
    move/from16 p2, v14

    .line 93
    .line 94
    sget-object v14, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 95
    .line 96
    invoke-static {v4, v14, v15}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    const-wide/16 v14, 0x258

    .line 101
    .line 102
    invoke-virtual {v4, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 103
    .line 104
    .line 105
    const/4 v14, 0x0

    .line 106
    invoke-static {v5, v14}, La/iym0;->w(Landroid/view/View;F)Landroid/animation/ObjectAnimator;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v6, v14}, La/iym0;->w(Landroid/view/View;F)Landroid/animation/ObjectAnimator;

    .line 111
    .line 112
    .line 113
    move-result-object v14

    .line 114
    sget-object v15, La/j5d;->a:Landroid/util/TypedValue;

    .line 115
    .line 116
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v15

    .line 120
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    const v11, 0x7f040af3

    .line 124
    .line 125
    .line 126
    move-object/from16 v16, v4

    .line 127
    .line 128
    const/4 v4, 0x0

    .line 129
    invoke-static {v15, v11, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-object/from16 v17, v5

    .line 141
    .line 142
    const v5, 0x7f040af2

    .line 143
    .line 144
    .line 145
    invoke-static {v15, v5, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-static {v7, v11, v5}, La/iym0;->o(Landroid/view/View;II)Landroid/animation/ValueAnimator;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    iget v11, v2, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;->a:I

    .line 154
    .line 155
    const/4 v15, 0x0

    .line 156
    move-object/from16 v4, p1

    .line 157
    .line 158
    invoke-static {v4, v11, v15}, La/x930;->b(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroid/animation/ValueAnimator;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    iget v11, v2, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;->b:I

    .line 163
    .line 164
    new-instance v15, La/w930;

    .line 165
    .line 166
    move-object/from16 p1, v4

    .line 167
    .line 168
    const/4 v4, 0x0

    .line 169
    invoke-direct {v15, v9, v0, v4}, La/w930;-><init>(La/x930;La/qgd;B)V

    .line 170
    .line 171
    .line 172
    invoke-static {v3, v11, v15}, La/x930;->b(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroid/animation/ValueAnimator;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    iget v15, v2, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;->c:I

    .line 177
    .line 178
    move/from16 v18, v4

    .line 179
    .line 180
    const/4 v4, 0x0

    .line 181
    invoke-static {v6, v15, v4}, La/x930;->b(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroid/animation/ValueAnimator;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    iget v2, v2, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;->d:I

    .line 186
    .line 187
    new-instance v6, La/w930;

    .line 188
    .line 189
    const/4 v15, 0x1

    .line 190
    invoke-direct {v6, v9, v0, v15}, La/w930;-><init>(La/x930;La/qgd;B)V

    .line 191
    .line 192
    .line 193
    invoke-static {v7, v2, v6}, La/x930;->b(Landroid/view/View;ILkotlin/jvm/functions/Function0;)Landroid/animation/ValueAnimator;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    const/16 v6, 0x9

    .line 198
    .line 199
    new-array v7, v6, [Landroid/animation/Animator;

    .line 200
    .line 201
    aput-object v13, v7, v18

    .line 202
    .line 203
    aput-object v16, v7, v15

    .line 204
    .line 205
    aput-object v17, v7, p2

    .line 206
    .line 207
    const/4 v13, 0x3

    .line 208
    aput-object v14, v7, v13

    .line 209
    .line 210
    const/4 v13, 0x4

    .line 211
    aput-object v5, v7, v13

    .line 212
    .line 213
    const/4 v5, 0x5

    .line 214
    aput-object p1, v7, v5

    .line 215
    .line 216
    const/4 v5, 0x6

    .line 217
    aput-object v11, v7, v5

    .line 218
    .line 219
    const/4 v5, 0x7

    .line 220
    aput-object v4, v7, v5

    .line 221
    .line 222
    const/16 v4, 0x8

    .line 223
    .line 224
    aput-object v2, v7, v4

    .line 225
    .line 226
    invoke-virtual {v8, v7}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 227
    .line 228
    .line 229
    new-instance v2, La/akc;

    .line 230
    .line 231
    const/16 v4, 0xa

    .line 232
    .line 233
    invoke-direct {v2, v0, v10, v4}, La/akc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 237
    .line 238
    .line 239
    new-instance v2, La/akc;

    .line 240
    .line 241
    invoke-direct {v2, v0, v12, v6}, La/akc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 245
    .line 246
    .line 247
    const-wide/16 v4, 0x258

    .line 248
    .line 249
    invoke-virtual {v8, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8}, Landroid/animation/AnimatorSet;->start()V

    .line 253
    .line 254
    .line 255
    iput-object v8, v9, La/x930;->a:Landroid/animation/AnimatorSet;

    .line 256
    .line 257
    const/4 v15, 0x1

    .line 258
    invoke-direct {v3, v15}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->setScrollEnabled(Z)V

    .line 259
    .line 260
    .line 261
    :cond_1
    iget-object v0, v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->l1:La/roi0;

    .line 262
    .line 263
    if-eqz v0, :cond_2

    .line 264
    .line 265
    invoke-virtual {v0, v1}, La/roi0;->l(La/y930;)V

    .line 266
    .line 267
    .line 268
    :cond_2
    return-void

    .line 269
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final E()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/zhu0;->k:Landroidx/viewpager2/widget/ViewPager2;

    .line 6
    .line 7
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBroadcastCardsScrollListener()La/fa30;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getInformationCardsScrollListener()La/ga30;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->u0(La/lhe0;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, v2, La/zhu0;->d:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 28
    .line 29
    iget-object v4, v3, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    iget-object v4, v4, La/yge0;->a:La/zge0;

    .line 40
    .line 41
    invoke-virtual {v4}, La/zge0;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    iget-object v4, v3, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    iget-object v5, v3, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->d:La/hjc;

    .line 58
    .line 59
    invoke-virtual {v4, v5}, La/yge0;->y(La/ahe0;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    iget-object v4, v3, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    if-eqz v4, :cond_1

    .line 65
    .line 66
    iget-object v3, v3, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->c:La/gz6;

    .line 67
    .line 68
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->u0(La/lhe0;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object v2, v2, La/zhu0;->c:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 72
    .line 73
    invoke-virtual {v2}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->c()V

    .line 74
    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    iput-object v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->k1:La/du20;

    .line 78
    .line 79
    iput-object v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->j1:La/du20;

    .line 80
    .line 81
    iget-object v3, v0, La/zhu0;->k:Landroidx/viewpager2/widget/ViewPager2;

    .line 82
    .line 83
    invoke-virtual {v3, v2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v0, La/zhu0;->h:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 92
    .line 93
    .line 94
    iput-object v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->A:La/lnd;

    .line 95
    .line 96
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 97
    .line 98
    iget-object v1, v0, La/zhu0;->g:Landroid/widget/ImageView;

    .line 99
    .line 100
    invoke-static {v1}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, v0, La/zhu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 104
    .line 105
    invoke-virtual {v0}, La/x1;->e()V

    .line 106
    .line 107
    .line 108
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getExpandAnimator()La/x930;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iget-object v0, v0, La/x930;->a:Landroid/animation/AnimatorSet;

    .line 113
    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 117
    .line 118
    .line 119
    :cond_2
    iput-object v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->l1:La/roi0;

    .line 120
    .line 121
    iput-object v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->n1:La/gbl0;

    .line 122
    .line 123
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->r1:La/v930;

    .line 124
    .line 125
    iget-object v0, p0, La/v930;->h:Landroid/animation/AnimatorSet;

    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 130
    .line 131
    .line 132
    :cond_3
    iget-object p0, p0, La/v930;->g:Landroid/animation/AnimatorSet;

    .line 133
    .line 134
    if-eqz p0, :cond_4

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->cancel()V

    .line 137
    .line 138
    .line 139
    :cond_4
    return-void
.end method

.method public final F(La/qfs;La/lnd;La/ncl0;La/ncl0;La/roi0;La/ncl0;La/gbl0;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v4, v3, La/zhu0;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    invoke-virtual {v4, v5}, Landroid/view/View;->setClipToOutline(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v4, v3, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 36
    .line 37
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getInformationCardsScrollListener()La/ga30;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 42
    .line 43
    .line 44
    iget-object v4, v3, La/zhu0;->k:Landroidx/viewpager2/widget/ViewPager2;

    .line 45
    .line 46
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBroadcastCardsScrollListener()La/fa30;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v4, v6}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget-object v4, v4, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 58
    .line 59
    new-instance v6, La/aa30;

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    invoke-direct {v6, v2, v7}, La/aa30;-><init>(La/ncl0;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v6}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->setInfoTabClickDebounceListener(Lkotlin/jvm/functions/Function0;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object v4, v4, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 73
    .line 74
    new-instance v6, La/aa30;

    .line 75
    .line 76
    invoke-direct {v6, v2, v5}, La/aa30;-><init>(La/ncl0;B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v6}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->setBroadcastingTabClickDebounceListener(Lkotlin/jvm/functions/Function0;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-object v2, v2, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-nez v4, :cond_2

    .line 93
    .line 94
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-eqz v4, :cond_0

    .line 99
    .line 100
    const/4 v6, 0x2

    .line 101
    invoke-virtual {v4, v6}, La/yge0;->x(I)V

    .line 102
    .line 103
    .line 104
    :cond_0
    move-object/from16 v4, p1

    .line 105
    .line 106
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 107
    .line 108
    .line 109
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getSnapHelper()La/tk80;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v4, v2}, La/efk0;->b(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 114
    .line 115
    .line 116
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    iget-object v4, v4, La/zhu0;->d:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 121
    .line 122
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getSnapHelper()La/tk80;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iput-object v2, v4, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 130
    .line 131
    iput-object v6, v4, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->f:La/tk80;

    .line 132
    .line 133
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    if-eqz v6, :cond_1

    .line 138
    .line 139
    iget-object v8, v4, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->d:La/hjc;

    .line 140
    .line 141
    invoke-virtual {v6, v8}, La/yge0;->v(La/ahe0;)V

    .line 142
    .line 143
    .line 144
    const/4 v8, -0x1

    .line 145
    iput v8, v4, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->i:I

    .line 146
    .line 147
    invoke-virtual {v6}, La/yge0;->d()I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    iput v6, v4, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->k:I

    .line 152
    .line 153
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-virtual {v4, v6}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->e(Landroidx/recyclerview/widget/b;)I

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    iput v6, v4, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->j:I

    .line 162
    .line 163
    invoke-virtual {v4}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->d()V

    .line 164
    .line 165
    .line 166
    iget-object v4, v4, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->c:La/gz6;

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->o(La/lhe0;)V

    .line 169
    .line 170
    .line 171
    :cond_1
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 172
    .line 173
    .line 174
    :cond_2
    invoke-direct {v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    iget-object v2, v2, La/zhu0;->h:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 179
    .line 180
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    if-nez v4, :cond_3

    .line 185
    .line 186
    iput-object v1, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->A:La/lnd;

    .line 187
    .line 188
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 192
    .line 193
    .line 194
    :cond_3
    iget-object v1, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->k1:La/du20;

    .line 195
    .line 196
    if-nez v1, :cond_4

    .line 197
    .line 198
    new-instance v8, La/du20;

    .line 199
    .line 200
    const/4 v14, 0x0

    .line 201
    const/16 v15, 0x15

    .line 202
    .line 203
    const/4 v9, 0x1

    .line 204
    const-class v11, La/ca30;

    .line 205
    .line 206
    const-string v12, "onCardChanged"

    .line 207
    .line 208
    const-string v13, "onCardChanged(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;)V"

    .line 209
    .line 210
    move-object/from16 v10, p4

    .line 211
    .line 212
    invoke-direct/range {v8 .. v15}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 213
    .line 214
    .line 215
    iput-object v8, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->k1:La/du20;

    .line 216
    .line 217
    :cond_4
    iget-object v1, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->j1:La/du20;

    .line 218
    .line 219
    if-nez v1, :cond_5

    .line 220
    .line 221
    new-instance v16, La/du20;

    .line 222
    .line 223
    const/16 v22, 0x0

    .line 224
    .line 225
    const/16 v23, 0x16

    .line 226
    .line 227
    const/16 v17, 0x1

    .line 228
    .line 229
    const-class v19, La/ca30;

    .line 230
    .line 231
    const-string v20, "onBroadcastCardsPositionChanged"

    .line 232
    .line 233
    const-string v21, "onBroadcastCardsPositionChanged(I)V"

    .line 234
    .line 235
    move-object/from16 v18, p4

    .line 236
    .line 237
    invoke-direct/range {v16 .. v23}, La/du20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 238
    .line 239
    .line 240
    move-object/from16 v1, v16

    .line 241
    .line 242
    iput-object v1, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->j1:La/du20;

    .line 243
    .line 244
    :cond_5
    iget-object v1, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->l1:La/roi0;

    .line 245
    .line 246
    if-nez v1, :cond_6

    .line 247
    .line 248
    move-object/from16 v1, p5

    .line 249
    .line 250
    iput-object v1, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->l1:La/roi0;

    .line 251
    .line 252
    :cond_6
    iget-object v1, v3, La/zhu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 253
    .line 254
    sget-object v2, La/qek0;->h:La/qek0;

    .line 255
    .line 256
    new-instance v3, La/ba30;

    .line 257
    .line 258
    move-object/from16 v4, p6

    .line 259
    .line 260
    invoke-direct {v3, v0, v4, v7}, La/ba30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 261
    .line 262
    .line 263
    new-instance v4, La/ugd;

    .line 264
    .line 265
    const v6, -0x15ed9367

    .line 266
    .line 267
    .line 268
    invoke-direct {v4, v6, v5, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    const/4 v3, 0x0

    .line 272
    invoke-static {v1, v2, v3, v4}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 273
    .line 274
    .line 275
    move-object/from16 v1, p7

    .line 276
    .line 277
    iput-object v1, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->n1:La/gbl0;

    .line 278
    .line 279
    return-void
.end method

.method public final G()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 6
    .line 7
    iget-boolean p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->a:Z

    .line 8
    .line 9
    return p0
.end method

.method public final H(La/bus;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    sget-object v0, La/ujn;->t:La/ujn;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->Q(La/da30;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, La/zhu0;->k:Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget p1, p1, La/bus;->a:I

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    new-instance v0, La/i14;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-direct {v0, p0, p0, p1, v1}, La/i14;-><init>(Landroid/view/View;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final I(Landroid/view/View;Landroid/view/View;II)V
    .locals 22

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 6
    .line 7
    invoke-static {v0}, La/bww;->Q(La/y930;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v9, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move-object/from16 v1, p2

    .line 15
    .line 16
    invoke-virtual {v3, v2, v1, v9}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->D(Landroid/view/View;Landroid/view/View;La/mbz;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    move-object/from16 v1, p2

    .line 21
    .line 22
    new-instance v0, La/qgd;

    .line 23
    .line 24
    invoke-virtual {v3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getPaginationView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getTabsContainerView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getMatchInfoCardsView()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getCardsContainer()Landroid/view/ViewGroup;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const/16 v8, 0xa

    .line 41
    .line 42
    invoke-direct/range {v0 .. v8}, La/qgd;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    move-object v10, v0

    .line 46
    move-object v8, v2

    .line 47
    move-object v11, v4

    .line 48
    move-object v12, v5

    .line 49
    move-object v13, v6

    .line 50
    move-object v14, v7

    .line 51
    move-object v7, v3

    .line 52
    sget-object v15, La/y930;->c:La/y930;

    .line 53
    .line 54
    iput-object v15, v7, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-direct {v7, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->setScrollEnabled(Z)V

    .line 58
    .line 59
    .line 60
    move v1, v0

    .line 61
    new-instance v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;

    .line 62
    .line 63
    move v2, v1

    .line 64
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    move v3, v2

    .line 69
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    move v4, v3

    .line 74
    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    move v5, v4

    .line 79
    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    move/from16 v6, p4

    .line 84
    .line 85
    move v9, v5

    .line 86
    move/from16 v5, p3

    .line 87
    .line 88
    invoke-direct/range {v0 .. v6}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;-><init>(IIIIII)V

    .line 89
    .line 90
    .line 91
    iput-object v0, v7, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->m1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;

    .line 92
    .line 93
    invoke-direct {v7}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getExpandAnimator()La/x930;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v7}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->G()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    new-instance v2, La/z930;

    .line 102
    .line 103
    const/4 v3, 0x4

    .line 104
    invoke-direct {v2, v7, v3}, La/z930;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;B)V

    .line 105
    .line 106
    .line 107
    new-instance v4, La/z930;

    .line 108
    .line 109
    invoke-direct {v4, v7, v9}, La/z930;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    move/from16 v17, v3

    .line 124
    .line 125
    const v3, 0x7f070712

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    sub-int v3, v5, v3

    .line 133
    .line 134
    if-eqz v1, :cond_3

    .line 135
    .line 136
    invoke-virtual {v12}, Landroid/view/View;->getHeight()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    instance-of v9, v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 145
    .line 146
    if-eqz v9, :cond_1

    .line 147
    .line 148
    move-object v9, v6

    .line 149
    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_1
    const/4 v9, 0x0

    .line 153
    :goto_0
    if-eqz v9, :cond_2

    .line 154
    .line 155
    iget v6, v9, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_2
    const/4 v6, 0x0

    .line 159
    :goto_1
    add-int/2addr v1, v6

    .line 160
    int-to-float v1, v1

    .line 161
    neg-float v1, v1

    .line 162
    goto :goto_2

    .line 163
    :cond_3
    const/4 v1, 0x0

    .line 164
    :goto_2
    iget-object v6, v0, La/x930;->a:Landroid/animation/AnimatorSet;

    .line 165
    .line 166
    if-eqz v6, :cond_4

    .line 167
    .line 168
    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->cancel()V

    .line 169
    .line 170
    .line 171
    :cond_4
    new-instance v6, Landroid/animation/AnimatorSet;

    .line 172
    .line 173
    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-static/range {p2 .. p2}, La/x930;->a(Landroid/view/View;)Landroid/animation/AnimatorSet;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-object/from16 p2, v9

    .line 184
    .line 185
    const/4 v9, 0x2

    .line 186
    move-object/from16 v16, v15

    .line 187
    .line 188
    new-array v15, v9, [F

    .line 189
    .line 190
    fill-array-data v15, :array_0

    .line 191
    .line 192
    .line 193
    sget-object v9, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 194
    .line 195
    invoke-static {v11, v9, v15}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    move-object v15, v10

    .line 200
    const-wide/16 v10, 0x258

    .line 201
    .line 202
    invoke-virtual {v9, v10, v11}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 203
    .line 204
    .line 205
    invoke-static {v12, v1}, La/iym0;->w(Landroid/view/View;F)Landroid/animation/ObjectAnimator;

    .line 206
    .line 207
    .line 208
    move-result-object v12

    .line 209
    invoke-static {v13, v1}, La/iym0;->w(Landroid/view/View;F)Landroid/animation/ObjectAnimator;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    sget-object v19, La/j5d;->a:Landroid/util/TypedValue;

    .line 214
    .line 215
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    const v11, 0x7f040af2

    .line 223
    .line 224
    .line 225
    move-object/from16 v20, v1

    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    invoke-static {v10, v11, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 229
    .line 230
    .line 231
    move-result v10

    .line 232
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-object/from16 v21, v9

    .line 240
    .line 241
    const v9, 0x7f040af3

    .line 242
    .line 243
    .line 244
    invoke-static {v11, v9, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    invoke-static {v14, v10, v9}, La/iym0;->o(Landroid/view/View;II)Landroid/animation/ValueAnimator;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 253
    .line 254
    .line 255
    move-result v9

    .line 256
    filled-new-array {v9, v3}, [I

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    new-instance v9, La/ro10;

    .line 265
    .line 266
    const/4 v10, 0x2

    .line 267
    invoke-direct {v9, v8, v10}, La/ro10;-><init>(Landroid/view/View;B)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3, v9}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 271
    .line 272
    .line 273
    const-wide/16 v8, 0x258

    .line 274
    .line 275
    invoke-virtual {v3, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    move/from16 v8, p4

    .line 283
    .line 284
    filled-new-array {v11, v8}, [I

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    new-instance v9, La/ro10;

    .line 293
    .line 294
    invoke-direct {v9, v7, v10}, La/ro10;-><init>(Landroid/view/View;B)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v8, v9}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 298
    .line 299
    .line 300
    const-wide/16 v10, 0x258

    .line 301
    .line 302
    invoke-virtual {v8, v10, v11}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    filled-new-array {v9, v5}, [I

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    invoke-static {v9}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    new-instance v10, La/ro10;

    .line 318
    .line 319
    const/4 v11, 0x2

    .line 320
    invoke-direct {v10, v13, v11}, La/ro10;-><init>(Landroid/view/View;B)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v9, v10}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 324
    .line 325
    .line 326
    move-object v10, v12

    .line 327
    const-wide/16 v11, 0x258

    .line 328
    .line 329
    invoke-virtual {v9, v11, v12}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    .line 333
    .line 334
    .line 335
    move-result v13

    .line 336
    filled-new-array {v13, v5}, [I

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    new-instance v13, La/ro10;

    .line 345
    .line 346
    const/4 v11, 0x2

    .line 347
    invoke-direct {v13, v14, v11}, La/ro10;-><init>(Landroid/view/View;B)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v5, v13}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 351
    .line 352
    .line 353
    const-wide/16 v12, 0x258

    .line 354
    .line 355
    invoke-virtual {v5, v12, v13}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 356
    .line 357
    .line 358
    const/16 v12, 0x9

    .line 359
    .line 360
    new-array v12, v12, [Landroid/animation/Animator;

    .line 361
    .line 362
    const/16 v18, 0x0

    .line 363
    .line 364
    aput-object p2, v12, v18

    .line 365
    .line 366
    const/4 v13, 0x1

    .line 367
    aput-object v21, v12, v13

    .line 368
    .line 369
    aput-object v10, v12, v11

    .line 370
    .line 371
    const/4 v10, 0x3

    .line 372
    aput-object v20, v12, v10

    .line 373
    .line 374
    aput-object v1, v12, v17

    .line 375
    .line 376
    const/4 v1, 0x5

    .line 377
    aput-object v3, v12, v1

    .line 378
    .line 379
    const/4 v1, 0x6

    .line 380
    aput-object v8, v12, v1

    .line 381
    .line 382
    const/4 v1, 0x7

    .line 383
    aput-object v9, v12, v1

    .line 384
    .line 385
    const/16 v1, 0x8

    .line 386
    .line 387
    aput-object v5, v12, v1

    .line 388
    .line 389
    invoke-virtual {v6, v12}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 390
    .line 391
    .line 392
    new-instance v1, La/akc;

    .line 393
    .line 394
    const/16 v3, 0xc

    .line 395
    .line 396
    invoke-direct {v1, v15, v2, v3}, La/akc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v6, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 400
    .line 401
    .line 402
    new-instance v1, La/akc;

    .line 403
    .line 404
    const/16 v2, 0xb

    .line 405
    .line 406
    invoke-direct {v1, v15, v4, v2}, La/akc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 410
    .line 411
    .line 412
    const-wide/16 v11, 0x258

    .line 413
    .line 414
    invoke-virtual {v6, v11, v12}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->start()V

    .line 418
    .line 419
    .line 420
    iput-object v6, v0, La/x930;->a:Landroid/animation/AnimatorSet;

    .line 421
    .line 422
    iget-object v0, v7, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->l1:La/roi0;

    .line 423
    .line 424
    if-eqz v0, :cond_5

    .line 425
    .line 426
    move-object/from16 v1, v16

    .line 427
    .line 428
    invoke-virtual {v0, v1}, La/roi0;->l(La/y930;)V

    .line 429
    .line 430
    .line 431
    :cond_5
    return-void

    .line 432
    nop

    .line 433
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final J(La/cus;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    sget-object v0, La/jtv;->p:La/jtv;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->Q(La/da30;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 17
    .line 18
    iget-object p1, p1, La/cus;->a:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 19
    .line 20
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    iget v1, p1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->b:I

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 38
    .line 39
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getAnimatorState()La/s930;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->r1:La/v930;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iput-object p1, v0, La/v930;->d:La/s930;

    .line 52
    .line 53
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->A:La/lnd;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iget-object p1, p1, La/zz3;->e:La/yz3;

    .line 59
    .line 60
    iget-object p1, p1, La/yz3;->f:Ljava/util/List;

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    move-object v2, v1

    .line 79
    check-cast v2, La/knd;

    .line 80
    .line 81
    invoke-virtual {v2}, La/knd;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    iget-object v2, v2, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->a:La/dja;

    .line 86
    .line 87
    iget-object v3, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 88
    .line 89
    iget-object v3, v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->a:La/dja;

    .line 90
    .line 91
    if-ne v2, v3, :cond_1

    .line 92
    .line 93
    move-object v0, v1

    .line 94
    :cond_2
    check-cast v0, La/knd;

    .line 95
    .line 96
    :cond_3
    if-eqz v0, :cond_4

    .line 97
    .line 98
    invoke-virtual {v0}, La/knd;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-nez p1, :cond_6

    .line 103
    .line 104
    :cond_4
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->A:La/lnd;

    .line 105
    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    iget-object p1, p1, La/zz3;->e:La/yz3;

    .line 109
    .line 110
    iget-object p1, p1, La/yz3;->f:Ljava/util/List;

    .line 111
    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, La/knd;

    .line 119
    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    invoke-virtual {p1}, La/knd;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-nez p1, :cond_6

    .line 127
    .line 128
    :cond_5
    new-instance p1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 129
    .line 130
    sget-object v0, La/dja;->c:La/dja;

    .line 131
    .line 132
    const/4 v1, -0x1

    .line 133
    invoke-direct {p1, v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;-><init>(La/dja;I)V

    .line 134
    .line 135
    .line 136
    :cond_6
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->i1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 137
    .line 138
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object p1, p1, La/zhu0;->h:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 143
    .line 144
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->i1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 145
    .line 146
    iget p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->b:I

    .line 147
    .line 148
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final K()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, La/qfs;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, La/qfs;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v2

    .line 20
    :goto_0
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iget-object v0, v0, La/zz3;->e:La/yz3;

    .line 24
    .line 25
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    sget-object v0, La/iun;->a:La/iun;

    .line 30
    .line 31
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    move-object v3, v1

    .line 46
    check-cast v3, La/ofs;

    .line 47
    .line 48
    invoke-virtual {v3}, La/ofs;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iget-object v3, v3, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->a:La/dja;

    .line 53
    .line 54
    sget-object v4, La/dja;->b:La/dja;

    .line 55
    .line 56
    if-ne v3, v4, :cond_3

    .line 57
    .line 58
    move-object v2, v1

    .line 59
    :cond_4
    check-cast v2, La/ofs;

    .line 60
    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    invoke-virtual {v2}, La/ofs;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    iput-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 70
    .line 71
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v1, v1, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    .line 77
    iget v2, v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->b:I

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->k1:La/du20;

    .line 83
    .line 84
    if-eqz p0, :cond_5

    .line 85
    .line 86
    invoke-virtual {p0, v0}, La/du20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_5
    :goto_1
    return-void
.end method

.method public final N(Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->k1:La/du20;

    .line 11
    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, La/du20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v0, La/qfs;

    .line 34
    .line 35
    iget-object v0, v0, La/zz3;->e:La/yz3;

    .line 36
    .line 37
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 p1, 0x0

    .line 49
    :goto_0
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, La/ofs;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, La/ofs;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->k1:La/du20;

    .line 64
    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0, p1}, La/du20;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public final O(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, La/zhu0;->j:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 8
    .line 9
    iget-boolean p1, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->c:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->c:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/shimmer/ShimmerFrameLayout;->b()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object p1, p0, La/zhu0;->j:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 22
    .line 23
    iget-boolean v0, p1, Lcom/facebook/shimmer/ShimmerFrameLayout;->c:Z

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/shimmer/ShimmerFrameLayout;->c()V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p1, Lcom/facebook/shimmer/ShimmerFrameLayout;->c:Z

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object p0, p0, La/zhu0;->j:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 38
    .line 39
    const/16 p1, 0x8

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final P(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast v0, La/qfs;

    .line 15
    .line 16
    iget-object v1, v0, La/zz3;->e:La/yz3;

    .line 17
    .line 18
    iget-object v1, v1, La/yz3;->f:Ljava/util/List;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    sget-object v1, La/iun;->a:La/iun;

    .line 23
    .line 24
    :cond_0
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x1

    .line 30
    if-nez v2, :cond_6

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, La/ofs;

    .line 54
    .line 55
    invoke-virtual {v5}, La/ofs;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    iget-object v5, v5, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->a:La/dja;

    .line 60
    .line 61
    sget-object v6, La/dja;->b:La/dja;

    .line 62
    .line 63
    if-ne v5, v6, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_6

    .line 82
    .line 83
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    check-cast v5, La/ofs;

    .line 88
    .line 89
    invoke-virtual {v5}, La/ofs;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iget-object v5, v5, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->a:La/dja;

    .line 94
    .line 95
    sget-object v6, La/dja;->b:La/dja;

    .line 96
    .line 97
    if-ne v5, v6, :cond_5

    .line 98
    .line 99
    move v2, v4

    .line 100
    goto :goto_2

    .line 101
    :cond_6
    :goto_1
    move v2, v3

    .line 102
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_7

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_7

    .line 113
    .line 114
    invoke-virtual {v0, p1}, La/zz3;->A(Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 122
    .line 123
    new-instance v1, La/mx2;

    .line 124
    .line 125
    const/16 v5, 0x15

    .line 126
    .line 127
    invoke-direct {v1, v0, p0, v5}, La/mx2;-><init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    if-eqz v2, :cond_9

    .line 135
    .line 136
    iget-object v1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 137
    .line 138
    invoke-static {v1}, La/bww;->Q(La/y930;)Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-nez v1, :cond_8

    .line 143
    .line 144
    iget-object v1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 145
    .line 146
    invoke-static {v1}, La/bww;->O(La/y930;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_9

    .line 151
    .line 152
    :cond_8
    invoke-virtual {v0, p1}, La/zz3;->A(Ljava/util/List;)V

    .line 153
    .line 154
    .line 155
    iput-boolean v4, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->q1:Z

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_9
    if-eqz v2, :cond_a

    .line 159
    .line 160
    new-instance v1, La/wss;

    .line 161
    .line 162
    const/16 v5, 0x9

    .line 163
    .line 164
    invoke-direct {v1, p0, v5}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p1, v1}, La/zz3;->B(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_a
    invoke-virtual {v0, p1}, La/zz3;->A(Ljava/util/List;)V

    .line 172
    .line 173
    .line 174
    :goto_3
    iget-boolean v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->q1:Z

    .line 175
    .line 176
    if-eqz v0, :cond_e

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-eqz v0, :cond_b

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_b
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_d

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, La/ofs;

    .line 200
    .line 201
    invoke-virtual {v1}, La/ofs;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iget-object v1, v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->a:La/dja;

    .line 206
    .line 207
    sget-object v5, La/dja;->b:La/dja;

    .line 208
    .line 209
    if-ne v1, v5, :cond_c

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_d
    :goto_4
    iput-boolean v3, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->q1:Z

    .line 213
    .line 214
    :cond_e
    :goto_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_10

    .line 219
    .line 220
    :cond_f
    move v3, v4

    .line 221
    goto :goto_6

    .line 222
    :cond_10
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_f

    .line 231
    .line 232
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    check-cast v1, La/ofs;

    .line 237
    .line 238
    invoke-virtual {v1}, La/ofs;->a()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    iget-object v1, v1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->a:La/dja;

    .line 243
    .line 244
    iget-object v5, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->h1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;

    .line 245
    .line 246
    iget-object v5, v5, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/CardIdentity;->a:La/dja;

    .line 247
    .line 248
    if-ne v1, v5, :cond_11

    .line 249
    .line 250
    :goto_6
    if-nez v2, :cond_13

    .line 251
    .line 252
    if-eqz v3, :cond_13

    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-nez v0, :cond_13

    .line 259
    .line 260
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 261
    .line 262
    invoke-static {v0}, La/bww;->Q(La/y930;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_12

    .line 267
    .line 268
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 273
    .line 274
    new-instance v1, La/k110;

    .line 275
    .line 276
    const/16 v2, 0x1d

    .line 277
    .line 278
    invoke-direct {v1, p0, p1, v2}, La/k110;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 279
    .line 280
    .line 281
    invoke-static {v0, v1}, La/wvb;->Z(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function2;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_12
    invoke-direct {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->setFirstCard(Ljava/util/List;)V

    .line 286
    .line 287
    .line 288
    :cond_13
    return-void
.end method

.method public final Q(La/da30;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/jtv;->p:La/jtv;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v1, :cond_10

    .line 17
    .line 18
    iput-boolean v5, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->g1:Z

    .line 19
    .line 20
    iget-object p1, v0, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 21
    .line 22
    invoke-virtual {p1, v4}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->setInfoTabSelected(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p1, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v0, La/zhu0;->d:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 31
    .line 32
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v0, p1, La/zhu0;->k:Landroidx/viewpager2/widget/ViewPager2;

    .line 40
    .line 41
    iget-object p1, p1, La/zhu0;->c:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    instance-of v6, v1, La/hsr;

    .line 48
    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    check-cast v1, La/hsr;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move-object v1, v2

    .line 55
    :goto_0
    if-eqz v1, :cond_3

    .line 56
    .line 57
    iget-object v1, v1, La/hsr;->o:Landroidx/fragment/app/e;

    .line 58
    .line 59
    iget-object v6, v1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 60
    .line 61
    invoke-virtual {v6}, La/pmi;->p()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-static {v6}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    :cond_1
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_2

    .line 78
    .line 79
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    move-object v9, v8

    .line 84
    check-cast v9, Landroidx/fragment/app/Fragment;

    .line 85
    .line 86
    instance-of v9, v9, La/osr;

    .line 87
    .line 88
    if-eqz v9, :cond_1

    .line 89
    .line 90
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    .line 95
    .line 96
    const/16 v8, 0xa

    .line 97
    .line 98
    invoke-static {v7, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_3

    .line 114
    .line 115
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    check-cast v8, Landroidx/fragment/app/Fragment;

    .line 120
    .line 121
    new-instance v9, La/zb5;

    .line 122
    .line 123
    invoke-direct {v9, v1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v8}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9}, La/zb5;->i()V

    .line 130
    .line 131
    .line 132
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->c()V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    const/high16 v0, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/4 v1, 0x0

    .line 159
    if-eqz p1, :cond_f

    .line 160
    .line 161
    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 162
    .line 163
    if-eq p1, v4, :cond_c

    .line 164
    .line 165
    const/4 v0, 0x2

    .line 166
    if-ne p1, v0, :cond_b

    .line 167
    .line 168
    invoke-direct {p0, v5}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->setScrollEnabled(Z)V

    .line 169
    .line 170
    .line 171
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iget-object p1, p1, La/zhu0;->d:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 176
    .line 177
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 178
    .line 179
    .line 180
    const p1, 0x7f040af3

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->w(I)V

    .line 184
    .line 185
    .line 186
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget-object p1, p1, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 191
    .line 192
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_6

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_6

    .line 205
    .line 206
    invoke-virtual {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->G()Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_7

    .line 211
    .line 212
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iget-object p1, p1, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 217
    .line 218
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    instance-of v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 227
    .line 228
    if-eqz v4, :cond_4

    .line 229
    .line 230
    move-object v2, v1

    .line 231
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 232
    .line 233
    :cond_4
    if-eqz v2, :cond_5

    .line 234
    .line 235
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 236
    .line 237
    :cond_5
    add-int/2addr v0, v5

    .line 238
    int-to-float v0, v0

    .line 239
    neg-float v0, v0

    .line 240
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 241
    .line 242
    .line 243
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    iget-object p1, p1, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 248
    .line 249
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_6
    new-instance v0, La/w23;

    .line 254
    .line 255
    const/16 v1, 0x9

    .line 256
    .line 257
    invoke-direct {v0, p0, v1}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 261
    .line 262
    .line 263
    :cond_7
    :goto_3
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->m1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;

    .line 264
    .line 265
    if-eqz p1, :cond_15

    .line 266
    .line 267
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    if-eqz v0, :cond_a

    .line 272
    .line 273
    iget v1, p1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;->f:I

    .line 274
    .line 275
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 276
    .line 277
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 278
    .line 279
    .line 280
    iget p1, p1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;->e:I

    .line 281
    .line 282
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    iget-object v0, v0, La/zhu0;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 287
    .line 288
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    if-eqz v1, :cond_9

    .line 293
    .line 294
    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 297
    .line 298
    .line 299
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    iget-object p0, p0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 304
    .line 305
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-eqz v0, :cond_8

    .line 310
    .line 311
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 312
    .line 313
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :cond_8
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-void

    .line 321
    :cond_9
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :cond_a
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_c
    invoke-virtual {p0, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->z(F)V

    .line 334
    .line 335
    .line 336
    iget p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->s:I

    .line 337
    .line 338
    invoke-virtual {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->A(I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->x(F)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p0, v5}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->y(I)V

    .line 345
    .line 346
    .line 347
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    iget-object v5, p1, La/zhu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 352
    .line 353
    const/4 v9, 0x0

    .line 354
    const/16 v10, 0xd

    .line 355
    .line 356
    const/4 v6, 0x0

    .line 357
    iget v7, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->w:I

    .line 358
    .line 359
    const/4 v8, 0x0

    .line 360
    invoke-static/range {v5 .. v10}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 361
    .line 362
    .line 363
    invoke-direct {p0, v4}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->setScrollEnabled(Z)V

    .line 364
    .line 365
    .line 366
    const p1, 0x7f040af2

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->w(I)V

    .line 370
    .line 371
    .line 372
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    iget-object p1, p1, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 377
    .line 378
    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 379
    .line 380
    .line 381
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    iget-object p1, p1, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 386
    .line 387
    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 388
    .line 389
    .line 390
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    iget-object p1, p1, La/zhu0;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 395
    .line 396
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    if-eqz v0, :cond_e

    .line 401
    .line 402
    const/4 v1, -0x2

    .line 403
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 404
    .line 405
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    if-eqz p1, :cond_d

    .line 413
    .line 414
    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 415
    .line 416
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 417
    .line 418
    .line 419
    return-void

    .line 420
    :cond_d
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :cond_e
    invoke-static {v3}, La/hny;->u(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :cond_f
    invoke-virtual {p0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->z(F)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {p0, v5}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->A(I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {p0, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->x(F)V

    .line 435
    .line 436
    .line 437
    iget p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->t:I

    .line 438
    .line 439
    invoke-virtual {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->y(I)V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :cond_10
    sget-object v1, La/ujn;->t:La/ujn;

    .line 444
    .line 445
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result p1

    .line 449
    if-eqz p1, :cond_16

    .line 450
    .line 451
    iput-boolean v4, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->g1:Z

    .line 452
    .line 453
    sget-object p1, La/y930;->b:La/y930;

    .line 454
    .line 455
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 456
    .line 457
    iget-object p1, v0, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 458
    .line 459
    invoke-virtual {p1, v4}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->setBroadcastTabSelected(Z)V

    .line 460
    .line 461
    .line 462
    iget-object p1, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 463
    .line 464
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 465
    .line 466
    .line 467
    iget-object p1, v0, La/zhu0;->h:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 468
    .line 469
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 470
    .line 471
    .line 472
    iget-object p1, v0, La/zhu0;->d:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 473
    .line 474
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 475
    .line 476
    .line 477
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    iget-object v0, p1, La/zhu0;->k:Landroidx/viewpager2/widget/ViewPager2;

    .line 482
    .line 483
    iget-object v1, p1, La/zhu0;->k:Landroidx/viewpager2/widget/ViewPager2;

    .line 484
    .line 485
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 486
    .line 487
    .line 488
    iget-object p1, p1, La/zhu0;->c:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 489
    .line 490
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    if-nez p1, :cond_13

    .line 498
    .line 499
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->n1:La/gbl0;

    .line 500
    .line 501
    if-eqz p1, :cond_12

    .line 502
    .line 503
    new-instance v0, La/hsr;

    .line 504
    .line 505
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    invoke-virtual {v4}, La/n6r;->b()V

    .line 517
    .line 518
    .line 519
    iget-object v4, v4, La/n6r;->c:La/glz;

    .line 520
    .line 521
    iget-object p1, p1, La/gbl0;->P1:La/ivn;

    .line 522
    .line 523
    if-eqz p1, :cond_11

    .line 524
    .line 525
    new-instance p1, La/sek;

    .line 526
    .line 527
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 528
    .line 529
    .line 530
    new-instance v5, La/bek;

    .line 531
    .line 532
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 533
    .line 534
    .line 535
    invoke-direct {v0, v3, v4, p1, v5}, La/hsr;-><init>(Landroidx/fragment/app/e;La/glz;La/sek;La/bek;)V

    .line 536
    .line 537
    .line 538
    iput-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->B:La/hsr;

    .line 539
    .line 540
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 541
    .line 542
    .line 543
    goto :goto_4

    .line 544
    :cond_11
    const-string p0, "broadcastingFeature"

    .line 545
    .line 546
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    throw v2

    .line 550
    :cond_12
    :goto_4
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    iget-object p1, p1, La/zhu0;->c:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 555
    .line 556
    invoke-virtual {p1, v1}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->setViewPager2(Landroidx/viewpager2/widget/ViewPager2;)V

    .line 557
    .line 558
    .line 559
    :cond_13
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->o1:Ljava/util/List;

    .line 560
    .line 561
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 562
    .line 563
    .line 564
    move-result p1

    .line 565
    if-nez p1, :cond_15

    .line 566
    .line 567
    iget-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->B:La/hsr;

    .line 568
    .line 569
    if-eqz p1, :cond_15

    .line 570
    .line 571
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->o1:Ljava/util/List;

    .line 572
    .line 573
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    iget-object p1, p1, La/zx5;->n:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast p1, La/yz3;

    .line 579
    .line 580
    iget-object v0, p1, La/yz3;->f:Ljava/util/List;

    .line 581
    .line 582
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 586
    .line 587
    .line 588
    move-result v0

    .line 589
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    if-ne v0, v1, :cond_14

    .line 594
    .line 595
    goto :goto_5

    .line 596
    :cond_14
    invoke-virtual {p1, p0, v2}, La/yz3;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 597
    .line 598
    .line 599
    :cond_15
    :goto_5
    return-void

    .line 600
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 601
    .line 602
    .line 603
    return-void
.end method

.method public final R(La/d0k0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget v1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->u:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->v:I

    .line 13
    .line 14
    :goto_0
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v2, v2, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->p1:La/pz40;

    .line 19
    .line 20
    check-cast p0, La/hgk0;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final getBackgroundView()Landroid/widget/ImageView;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->g:Landroid/widget/ImageView;

    .line 6
    .line 7
    return-object p0
.end method

.method public getBehavior()La/yke;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/yke;"
        }
    .end annotation

    .line 1
    new-instance p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerBehavior;

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerBehavior;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final getCardsContainer()Landroid/view/ViewGroup;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getCompressAnimator()La/v930;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->r1:La/v930;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMatchInfoCardsView()Landroid/view/View;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getPaginationView()Landroid/view/View;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->d:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getTabsContainerView()Landroid/view/View;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 6
    .line 7
    return-object p0
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "BUNDLE_KEY_SUPER"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "BUNDLE_KEY_MATCH_INFO_CONTAINER_STATE"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v0, La/y930;

    .line 26
    .line 27
    iput-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 28
    .line 29
    iget-object v1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->l1:La/roi0;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v0}, La/roi0;->l(La/y930;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 37
    .line 38
    invoke-static {v0}, La/bww;->O(La/y930;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->x:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->w:I

    .line 48
    .line 49
    :goto_0
    iget-object v1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->r1:La/v930;

    .line 50
    .line 51
    iget-object v1, v1, La/v930;->d:La/s930;

    .line 52
    .line 53
    iput v0, v1, La/s930;->g:I

    .line 54
    .line 55
    iget-object v1, v1, La/s930;->j:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->v(I)V

    .line 58
    .line 59
    .line 60
    const-string v0, "BUNDLE_KEY_ANIMATED_VIEWS_HEIGHTS"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;

    .line 67
    .line 68
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->m1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;

    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "BUNDLE_KEY_MATCH_INFO_CONTAINER_STATE"

    .line 7
    .line 8
    iget-object v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "BUNDLE_KEY_ANIMATED_VIEWS_HEIGHTS"

    .line 14
    .line 15
    iget-object v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->m1:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/models/AnimatedViewsHeights;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 18
    .line 19
    .line 20
    const-string v1, "BUNDLE_KEY_SUPER"

    .line 21
    .line 22
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public setCompress(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 2
    .line 3
    invoke-static {v0}, La/bww;->O(La/y930;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object v1, La/y930;->a:La/y930;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v1, La/y930;->b:La/y930;

    .line 13
    .line 14
    :goto_0
    iput-object v1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->f1:La/y930;

    .line 15
    .line 16
    iget-object v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->l1:La/roi0;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2, v1}, La/roi0;->l(La/y930;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    if-eqz v0, :cond_2

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    iget-boolean p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->q1:Z

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    iput-boolean p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->q1:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->K()V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final setTabsVisibility(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->setTabsVisibilityWithAnimation(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setupDisableWhenAnim(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->f:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->setClickable(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final v(I)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, La/zhu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/16 v5, 0xd

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    move v2, p1

    .line 13
    invoke-static/range {v0 .. v5}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final w(I)V
    .locals 2

    .line 1
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, p1, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/zhu0;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast p0, Landroid/graphics/drawable/GradientDrawable;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final x(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/zhu0;->h:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final y(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->h:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object p0, p0, La/zhu0;->h:Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 34
    .line 35
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final z(F)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zhu0;->i:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoContainerView;->getBinding()La/zhu0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, La/zhu0;->d:Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
