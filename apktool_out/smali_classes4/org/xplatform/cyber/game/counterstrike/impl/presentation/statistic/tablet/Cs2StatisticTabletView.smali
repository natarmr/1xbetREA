.class public final Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/a8z;

.field public final r:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    const/4 v0, 0x3

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
    iput-object p1, p0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->q:La/a8z;

    .line 20
    .line 21
    const p1, 0x7f0803a1

    .line 22
    .line 23
    .line 24
    iput p1, p0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->r:I

    .line 25
    .line 26
    return-void
.end method

.method private final getBinding()La/fth;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fth;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final setBackground(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/fth;->F0:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, La/fth;->j0:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, La/fth;->l0:Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v0, v0, La/fth;->k0:Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v0, v0, La/fth;->M:Landroid/widget/TextView;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, La/fth;->N:Landroid/widget/TextView;

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-object v0, v0, La/fth;->L:Landroid/widget/TextView;

    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget-object v0, v0, La/fth;->B0:Landroid/widget/TextView;

    .line 146
    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 159
    .line 160
    .line 161
    return-void
.end method

.method public final setExtraMargin(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f070717

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object p0, p0, La/fth;->a:Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1, p1, p1, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final setFirstPlayer(La/srf;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/fth;->U:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/srf;->a:La/ank0;

    .line 11
    .line 12
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/fth;->O:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v1, p1, La/srf;->g:La/ank0;

    .line 22
    .line 23
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/fth;->Q:Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v1, p1, La/srf;->f:La/ank0;

    .line 33
    .line 34
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/fth;->P:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v1, p1, La/srf;->e:La/ank0;

    .line 44
    .line 45
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/fth;->S:Landroid/widget/TextView;

    .line 53
    .line 54
    iget-object v1, p1, La/srf;->d:La/ank0;

    .line 55
    .line 56
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, La/fth;->T:Landroid/widget/TextView;

    .line 64
    .line 65
    iget-object v1, p1, La/srf;->c:La/ank0;

    .line 66
    .line 67
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v0, v0, La/fth;->R:Landroid/widget/TextView;

    .line 75
    .line 76
    iget-object v1, p1, La/srf;->b:La/ank0;

    .line 77
    .line 78
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p1, La/srf;->h:La/oqf;

    .line 82
    .line 83
    iget-object v0, p1, La/oqf;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v1, v1, La/fth;->e:Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->u(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p1, La/oqf;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v1, v1, La/fth;->F:Landroid/widget/ImageView;

    .line 101
    .line 102
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p1, La/oqf;->d:Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, La/fth;->b:Landroid/widget/ImageView;

    .line 112
    .line 113
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, La/oqf;->e:Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v1, v1, La/fth;->f:Landroid/widget/ImageView;

    .line 123
    .line 124
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p1, La/oqf;->f:Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v1, v1, La/fth;->g:Landroid/widget/ImageView;

    .line 134
    .line 135
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p1, La/oqf;->g:Ljava/lang/String;

    .line 139
    .line 140
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v1, v1, La/fth;->d:Landroid/widget/ImageView;

    .line 145
    .line 146
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p1, La/oqf;->h:Ljava/lang/String;

    .line 150
    .line 151
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, La/fth;->c:Landroid/widget/ImageView;

    .line 156
    .line 157
    invoke-virtual {p0, v0, p1}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final setFivePlayer(La/srf;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/fth;->b0:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/srf;->a:La/ank0;

    .line 11
    .line 12
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/fth;->V:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v1, p1, La/srf;->g:La/ank0;

    .line 22
    .line 23
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/fth;->X:Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v1, p1, La/srf;->f:La/ank0;

    .line 33
    .line 34
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/fth;->W:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v1, p1, La/srf;->e:La/ank0;

    .line 44
    .line 45
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/fth;->Z:Landroid/widget/TextView;

    .line 53
    .line 54
    iget-object v1, p1, La/srf;->d:La/ank0;

    .line 55
    .line 56
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, La/fth;->a0:Landroid/widget/TextView;

    .line 64
    .line 65
    iget-object v1, p1, La/srf;->c:La/ank0;

    .line 66
    .line 67
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v0, v0, La/fth;->Y:Landroid/widget/TextView;

    .line 75
    .line 76
    iget-object v1, p1, La/srf;->b:La/ank0;

    .line 77
    .line 78
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p1, La/srf;->h:La/oqf;

    .line 82
    .line 83
    iget-object v0, p1, La/oqf;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v1, v1, La/fth;->k:Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->u(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p1, La/oqf;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v1, v1, La/fth;->G:Landroid/widget/ImageView;

    .line 101
    .line 102
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p1, La/oqf;->d:Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, La/fth;->h:Landroid/widget/ImageView;

    .line 112
    .line 113
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, La/oqf;->e:Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v1, v1, La/fth;->l:Landroid/widget/ImageView;

    .line 123
    .line 124
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p1, La/oqf;->f:Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v1, v1, La/fth;->m:Landroid/widget/ImageView;

    .line 134
    .line 135
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p1, La/oqf;->g:Ljava/lang/String;

    .line 139
    .line 140
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v1, v1, La/fth;->j:Landroid/widget/ImageView;

    .line 145
    .line 146
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p1, La/oqf;->h:Ljava/lang/String;

    .line 150
    .line 151
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, La/fth;->i:Landroid/widget/ImageView;

    .line 156
    .line 157
    invoke-virtual {p0, v0, p1}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final setFourPlayer(La/srf;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/fth;->i0:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/srf;->a:La/ank0;

    .line 11
    .line 12
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/fth;->c0:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v1, p1, La/srf;->g:La/ank0;

    .line 22
    .line 23
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/fth;->e0:Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v1, p1, La/srf;->f:La/ank0;

    .line 33
    .line 34
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/fth;->d0:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v1, p1, La/srf;->e:La/ank0;

    .line 44
    .line 45
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/fth;->g0:Landroid/widget/TextView;

    .line 53
    .line 54
    iget-object v1, p1, La/srf;->d:La/ank0;

    .line 55
    .line 56
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, La/fth;->h0:Landroid/widget/TextView;

    .line 64
    .line 65
    iget-object v1, p1, La/srf;->c:La/ank0;

    .line 66
    .line 67
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v0, v0, La/fth;->f0:Landroid/widget/TextView;

    .line 75
    .line 76
    iget-object v1, p1, La/srf;->b:La/ank0;

    .line 77
    .line 78
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p1, La/srf;->h:La/oqf;

    .line 82
    .line 83
    iget-object v0, p1, La/oqf;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v1, v1, La/fth;->q:Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->u(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p1, La/oqf;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v1, v1, La/fth;->H:Landroid/widget/ImageView;

    .line 101
    .line 102
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p1, La/oqf;->d:Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, La/fth;->n:Landroid/widget/ImageView;

    .line 112
    .line 113
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, La/oqf;->e:Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v1, v1, La/fth;->r:Landroid/widget/ImageView;

    .line 123
    .line 124
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p1, La/oqf;->f:Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v1, v1, La/fth;->s:Landroid/widget/ImageView;

    .line 134
    .line 135
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p1, La/oqf;->g:Ljava/lang/String;

    .line 139
    .line 140
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v1, v1, La/fth;->p:Landroid/widget/ImageView;

    .line 145
    .line 146
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p1, La/oqf;->h:Ljava/lang/String;

    .line 150
    .line 151
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, La/fth;->o:Landroid/widget/ImageView;

    .line 156
    .line 157
    invoke-virtual {p0, v0, p1}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final setSecondPlayer(La/srf;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/fth;->s0:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/srf;->a:La/ank0;

    .line 11
    .line 12
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/fth;->m0:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v1, p1, La/srf;->g:La/ank0;

    .line 22
    .line 23
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/fth;->o0:Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v1, p1, La/srf;->f:La/ank0;

    .line 33
    .line 34
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/fth;->n0:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v1, p1, La/srf;->e:La/ank0;

    .line 44
    .line 45
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/fth;->q0:Landroid/widget/TextView;

    .line 53
    .line 54
    iget-object v1, p1, La/srf;->d:La/ank0;

    .line 55
    .line 56
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, La/fth;->r0:Landroid/widget/TextView;

    .line 64
    .line 65
    iget-object v1, p1, La/srf;->c:La/ank0;

    .line 66
    .line 67
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v0, v0, La/fth;->p0:Landroid/widget/TextView;

    .line 75
    .line 76
    iget-object v1, p1, La/srf;->b:La/ank0;

    .line 77
    .line 78
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p1, La/srf;->h:La/oqf;

    .line 82
    .line 83
    iget-object v0, p1, La/oqf;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v1, v1, La/fth;->w:Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->u(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p1, La/oqf;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v1, v1, La/fth;->I:Landroid/widget/ImageView;

    .line 101
    .line 102
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p1, La/oqf;->d:Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, La/fth;->t:Landroid/widget/ImageView;

    .line 112
    .line 113
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, La/oqf;->e:Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v1, v1, La/fth;->x:Landroid/widget/ImageView;

    .line 123
    .line 124
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p1, La/oqf;->f:Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v1, v1, La/fth;->y:Landroid/widget/ImageView;

    .line 134
    .line 135
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p1, La/oqf;->g:Ljava/lang/String;

    .line 139
    .line 140
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v1, v1, La/fth;->v:Landroid/widget/ImageView;

    .line 145
    .line 146
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p1, La/oqf;->h:Ljava/lang/String;

    .line 150
    .line 151
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, La/fth;->u:Landroid/widget/ImageView;

    .line 156
    .line 157
    invoke-virtual {p0, v0, p1}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final setThirdPlayer(La/srf;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/fth;->A0:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/srf;->a:La/ank0;

    .line 11
    .line 12
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/fth;->u0:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v1, p1, La/srf;->g:La/ank0;

    .line 22
    .line 23
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/fth;->w0:Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v1, p1, La/srf;->f:La/ank0;

    .line 33
    .line 34
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v0, v0, La/fth;->v0:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v1, p1, La/srf;->e:La/ank0;

    .line 44
    .line 45
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/fth;->y0:Landroid/widget/TextView;

    .line 53
    .line 54
    iget-object v1, p1, La/srf;->d:La/ank0;

    .line 55
    .line 56
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v0, v0, La/fth;->z0:Landroid/widget/TextView;

    .line 64
    .line 65
    iget-object v1, p1, La/srf;->c:La/ank0;

    .line 66
    .line 67
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v0, v0, La/fth;->x0:Landroid/widget/TextView;

    .line 75
    .line 76
    iget-object v1, p1, La/srf;->b:La/ank0;

    .line 77
    .line 78
    invoke-static {p0, v1, v0}, La/vqd;->z(Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;La/ank0;Landroid/widget/TextView;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p1, La/srf;->h:La/oqf;

    .line 82
    .line 83
    iget-object v0, p1, La/oqf;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v1, v1, La/fth;->C:Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->u(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p1, La/oqf;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v1, v1, La/fth;->J:Landroid/widget/ImageView;

    .line 101
    .line 102
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p1, La/oqf;->d:Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, La/fth;->z:Landroid/widget/ImageView;

    .line 112
    .line 113
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p1, La/oqf;->e:Ljava/lang/String;

    .line 117
    .line 118
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v1, v1, La/fth;->D:Landroid/widget/ImageView;

    .line 123
    .line 124
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v0, p1, La/oqf;->f:Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v1, v1, La/fth;->E:Landroid/widget/ImageView;

    .line 134
    .line 135
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p1, La/oqf;->g:Ljava/lang/String;

    .line 139
    .line 140
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v1, v1, La/fth;->B:Landroid/widget/ImageView;

    .line 145
    .line 146
    invoke-virtual {p0, v1, v0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p1, La/oqf;->h:Ljava/lang/String;

    .line 150
    .line 151
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, La/fth;->A:Landroid/widget/ImageView;

    .line 156
    .line 157
    invoke-virtual {p0, v0, p1}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->v(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final setTotalCash(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/fth;->B0:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final u(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    const/16 v8, 0x1fc

    .line 15
    .line 16
    iget v3, p0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->r:I

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    move-object v1, p1

    .line 28
    const/16 p0, 0x8

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final v(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 9

    .line 1
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/16 v8, 0x1fc

    .line 5
    .line 6
    iget v3, p0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->r:I

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/fth;->t0:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    sget-object p2, La/u0d;->a:Ljava/util/List;

    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/statistic/tablet/Cs2StatisticTabletView;->getBinding()La/fth;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/fth;->K:Landroid/widget/ImageView;

    .line 20
    .line 21
    const p2, 0x7f080cf8

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-static {p0, p1, p2, v0}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
