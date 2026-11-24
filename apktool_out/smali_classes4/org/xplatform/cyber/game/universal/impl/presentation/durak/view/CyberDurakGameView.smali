.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/a8z;

.field public r:La/qng;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/wez;->b:La/wez;

    .line 8
    .line 9
    new-instance p2, La/lhf;

    .line 10
    .line 11
    const/4 v0, 0x6

    .line 12
    invoke-direct {p2, p0, p0, v0}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->q:La/a8z;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final getBinding()La/m1o0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/m1o0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final synthetic u(Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;)La/m1o0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final setBackground-yKGKXMA(Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, v0, La/m1o0;->g:Landroid/widget/ImageView;

    .line 11
    .line 12
    new-instance v0, La/j2x;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const v2, 0x7f0700a4

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-direct {v0, p0}, La/j2x;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x2

    .line 33
    new-array p0, p0, [La/k2x;

    .line 34
    .line 35
    sget-object v2, La/g2x;->a:La/g2x;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    aput-object v2, p0, v3

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    aput-object v0, p0, v2

    .line 42
    .line 43
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const/4 v7, 0x0

    .line 48
    const/16 v8, 0x1ec

    .line 49
    .line 50
    const v3, 0x7f0803fb

    .line 51
    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    move-object v2, p1

    .line 56
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final setCardDeck(La/ing;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->e:Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;

    .line 9
    .line 10
    iget v0, p1, La/ing;->a:I

    .line 11
    .line 12
    iget v1, p1, La/ing;->b:I

    .line 13
    .line 14
    iget p1, p1, La/ing;->c:I

    .line 15
    .line 16
    iget-object v2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;->a:La/jk3;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/16 v4, 0x8

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v1, v2, La/jk3;->f:Landroid/view/View;

    .line 24
    .line 25
    check-cast v1, Landroid/widget/ImageView;

    .line 26
    .line 27
    iget-object v5, v2, La/jk3;->e:Landroid/view/View;

    .line 28
    .line 29
    check-cast v5, Landroid/widget/ImageView;

    .line 30
    .line 31
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v2, La/jk3;->c:Landroid/view/View;

    .line 35
    .line 36
    check-cast v1, Landroid/widget/ImageView;

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v2, La/jk3;->d:Landroid/view/View;

    .line 42
    .line 43
    check-cast v1, Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_2

    .line 55
    .line 56
    :cond_0
    const/4 p1, 0x1

    .line 57
    if-ne v0, p1, :cond_1

    .line 58
    .line 59
    iget-object p1, v2, La/jk3;->f:Landroid/view/View;

    .line 60
    .line 61
    check-cast p1, Landroid/widget/ImageView;

    .line 62
    .line 63
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object p1, v2, La/jk3;->f:Landroid/view/View;

    .line 67
    .line 68
    check-cast p1, Landroid/widget/ImageView;

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, v2, La/jk3;->c:Landroid/view/View;

    .line 74
    .line 75
    check-cast p1, Landroid/widget/ImageView;

    .line 76
    .line 77
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, v2, La/jk3;->d:Landroid/view/View;

    .line 81
    .line 82
    check-cast p1, Landroid/widget/TextView;

    .line 83
    .line 84
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 85
    .line 86
    .line 87
    iget-object p1, v2, La/jk3;->e:Landroid/view/View;

    .line 88
    .line 89
    check-cast p1, Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_1
    if-le v0, p1, :cond_5

    .line 96
    .line 97
    iget-object v5, v2, La/jk3;->f:Landroid/view/View;

    .line 98
    .line 99
    check-cast v5, Landroid/widget/ImageView;

    .line 100
    .line 101
    iget-object v6, v2, La/jk3;->d:Landroid/view/View;

    .line 102
    .line 103
    check-cast v6, Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;->b:Ljava/lang/Integer;

    .line 112
    .line 113
    if-nez v1, :cond_2

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const/4 v7, -0x1

    .line 121
    if-ne v1, v7, :cond_4

    .line 122
    .line 123
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    instance-of v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 128
    .line 129
    if-eqz v7, :cond_3

    .line 130
    .line 131
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 132
    .line 133
    invoke-virtual {v1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    goto :goto_0

    .line 138
    :cond_3
    move v1, v3

    .line 139
    :goto_0
    int-to-float v1, v1

    .line 140
    const/4 v7, 0x2

    .line 141
    new-array v7, v7, [F

    .line 142
    .line 143
    const/high16 v8, 0x42c80000    # 100.0f

    .line 144
    .line 145
    aput v8, v7, v3

    .line 146
    .line 147
    aput v1, v7, p1

    .line 148
    .line 149
    invoke-static {v7}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const-wide/16 v7, 0x3e8

    .line 154
    .line 155
    invoke-virtual {p1, v7, v8}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 156
    .line 157
    .line 158
    new-instance v1, La/eng;

    .line 159
    .line 160
    invoke-direct {v1, v5, v3}, La/eng;-><init>(Landroid/widget/ImageView;B)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 167
    .line 168
    .line 169
    :cond_4
    :goto_1
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, v2, La/jk3;->c:Landroid/view/View;

    .line 180
    .line 181
    check-cast p1, Landroid/widget/ImageView;

    .line 182
    .line 183
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 184
    .line 185
    .line 186
    iget-object p1, v2, La/jk3;->e:Landroid/view/View;

    .line 187
    .line 188
    check-cast p1, Landroid/widget/ImageView;

    .line 189
    .line 190
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    :cond_5
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakCardDeckView;->b:Ljava/lang/Integer;

    .line 198
    .line 199
    return-void
.end method

.method public final setCardsOnTable(La/jng;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->i:Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;

    .line 9
    .line 10
    iget-object v0, p1, La/jng;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v1, p1, La/jng;->b:La/len;

    .line 13
    .line 14
    iget-boolean p1, p1, La/jng;->c:Z

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1, p1}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayedCardsTableView;->b(Ljava/util/ArrayList;La/len;Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setCountRebound-4eaVOWs(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->b:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setCountStep-4ygb3Fo(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->c:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setCountTaken-xxXNjZw(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->d:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setFirstPlayerCards(La/nng;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->f:La/k1o0;

    .line 9
    .line 10
    iget-object p0, p0, La/k1o0;->c:Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;

    .line 11
    .line 12
    iget-object v0, p1, La/nng;->a:Ljava/util/List;

    .line 13
    .line 14
    iget-object p1, p1, La/nng;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v0, p1, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->c(Ljava/util/List;Ljava/util/ArrayList;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setFirstPlayerName-7hlsDRw(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->f:La/k1o0;

    .line 9
    .line 10
    iget-object p0, p0, La/k1o0;->d:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setFirstPlayerStatus-xj29_n0(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->f:La/k1o0;

    .line 9
    .line 10
    iget-object p0, p0, La/k1o0;->e:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setMatchDescription(La/qng;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/qng;->b:La/len;

    .line 5
    .line 6
    sget-object v1, La/len;->c:La/len;

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    sget-object v1, La/len;->b:La/len;

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->r:La/qng;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/m1o0;->h:Landroid/widget/TextView;

    .line 23
    .line 24
    new-instance v1, La/lfr;

    .line 25
    .line 26
    const/4 v2, 0x6

    .line 27
    invoke-direct {v1, p0, p1, v2}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    const-wide/16 v2, 0xdac

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, La/m1o0;->h:Landroid/widget/TextView;

    .line 41
    .line 42
    iget-object v1, p1, La/qng;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->r:La/qng;

    .line 48
    .line 49
    return-void
.end method

.method public final setSecondPlayerCards(La/rng;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->j:La/k1o0;

    .line 9
    .line 10
    iget-object p0, p0, La/k1o0;->c:Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;

    .line 11
    .line 12
    iget-object v0, p1, La/rng;->a:Ljava/util/List;

    .line 13
    .line 14
    iget-object p1, p1, La/rng;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p0, v0, p1, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberPlayerCardsView;->c(Ljava/util/List;Ljava/util/ArrayList;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setSecondPlayerName-x_7YRRc(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->j:La/k1o0;

    .line 9
    .line 10
    iget-object p0, p0, La/k1o0;->d:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setSecondPlayerStatus-by2wi9I(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/durak/view/CyberDurakGameView;->getBinding()La/m1o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/m1o0;->j:La/k1o0;

    .line 9
    .line 10
    iget-object p0, p0, La/k1o0;->e:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
