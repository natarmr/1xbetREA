.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final w:La/r710;


# instance fields
.field public final q:La/a8z;

.field public final r:La/a8z;

.field public final s:Ljava/util/List;

.field public final t:Ljava/util/List;

.field public u:La/c4m0;

.field public v:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/r710;

    .line 2
    .line 3
    const-wide/16 v1, -0xbb8

    .line 4
    .line 5
    const-wide/16 v3, 0xbb8

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, v4}, La/r710;-><init>(JJ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->w:La/r710;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance p2, La/ywm0;

    .line 16
    .line 17
    const/4 p3, 0x3

    .line 18
    invoke-direct {p2, p0, p0, p3}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->q:La/a8z;

    .line 26
    .line 27
    new-instance p2, La/a7n0;

    .line 28
    .line 29
    const/16 p3, 0x17

    .line 30
    .line 31
    invoke-direct {p2, p3}, La/a7n0;-><init>(B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->r:La/a8z;

    .line 39
    .line 40
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object p1, p1, La/c6o0;->c:Landroid/widget/ImageView;

    .line 45
    .line 46
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iget-object p2, p2, La/c6o0;->e:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    iget-object p3, p3, La/c6o0;->d:Landroid/widget/ImageView;

    .line 57
    .line 58
    filled-new-array {p1, p2, p3}, [Landroid/widget/ImageView;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->s:Ljava/util/List;

    .line 67
    .line 68
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iget-object p2, p2, La/c6o0;->g:Landroid/widget/ImageView;

    .line 73
    .line 74
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    iget-object p3, p3, La/c6o0;->i:Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v0, v0, La/c6o0;->h:Landroid/widget/ImageView;

    .line 85
    .line 86
    filled-new-array {p2, p3, v0}, [Landroid/widget/ImageView;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->t:Ljava/util/List;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    const/4 p3, 0x1

    .line 120
    if-ne p2, p3, :cond_2

    .line 121
    .line 122
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_1

    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    check-cast p2, Landroid/widget/ImageView;

    .line 137
    .line 138
    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->t:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_2

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Landroid/widget/ImageView;

    .line 159
    .line 160
    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutDirection(I)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    return-void
.end method

.method private final getBinding()La/c6o0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/c6o0;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getScope()La/vne;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->r:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vne;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setTimerVisibility(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/c6o0;->j:Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final synthetic u(Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;)La/c6o0;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final setFirstPlayerCards(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->s:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/widget/ImageView;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 38
    .line 39
    .line 40
    move v0, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, La/q3d;->p()V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0

    .line 47
    :cond_1
    return-void
.end method

.method public final setFirstPlayerCombination(La/m5x;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/c6o0;->k:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/m5x;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/c6o0;->b:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget p1, p1, La/m5x;->b:I

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final setMatchStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/c6o0;->m:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSecondPlayerCards(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->t:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/widget/ImageView;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 38
    .line 39
    .line 40
    move v0, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, La/q3d;->p()V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0

    .line 47
    :cond_1
    return-void
.end method

.method public final setSecondPlayerCombination(La/m5x;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/c6o0;->l:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/m5x;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getBinding()La/c6o0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/c6o0;->f:Landroid/widget/ImageView;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget p1, p1, La/m5x;->b:I

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final v(La/wnq0;)V
    .locals 14

    .line 1
    iget-boolean v0, p1, La/wnq0;->a:Z

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->setTimerVisibility(Z)V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p1, La/wnq0;->c:Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v3, p1, La/wnq0;->e:Ljava/lang/Long;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v3, v2

    .line 15
    :goto_0
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v8

    .line 27
    sub-long/2addr v6, v8

    .line 28
    cmp-long v8, v6, v4

    .line 29
    .line 30
    if-gez v8, :cond_2

    .line 31
    .line 32
    move-wide v6, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-wide v6, p1, La/wnq0;->b:J

    .line 35
    .line 36
    :cond_2
    :goto_1
    iget p1, p1, La/wnq0;->d:I

    .line 37
    .line 38
    iget-object v8, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->v:Ljava/lang/Long;

    .line 39
    .line 40
    if-eqz v8, :cond_3

    .line 41
    .line 42
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v8

    .line 46
    sub-long/2addr v8, v6

    .line 47
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    move-object v8, v2

    .line 53
    :goto_2
    if-eqz v8, :cond_4

    .line 54
    .line 55
    sget-object v9, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->w:La/r710;

    .line 56
    .line 57
    iget-wide v10, v9, La/o710;->a:J

    .line 58
    .line 59
    iget-wide v12, v9, La/o710;->b:J

    .line 60
    .line 61
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v8

    .line 65
    cmp-long v10, v10, v8

    .line 66
    .line 67
    if-gtz v10, :cond_4

    .line 68
    .line 69
    cmp-long v8, v8, v12

    .line 70
    .line 71
    if-gtz v8, :cond_4

    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_4
    if-eqz v0, :cond_9

    .line 75
    .line 76
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->u:La/c4m0;

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const/4 v8, 0x1

    .line 85
    if-ne v0, v8, :cond_5

    .line 86
    .line 87
    const-wide/16 v8, 0x1f4

    .line 88
    .line 89
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    move-object v0, v2

    .line 95
    :goto_3
    iget-object v8, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->u:La/c4m0;

    .line 96
    .line 97
    if-eqz v8, :cond_6

    .line 98
    .line 99
    invoke-virtual {v8, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    if-nez v1, :cond_7

    .line 103
    .line 104
    new-instance v1, La/doe;

    .line 105
    .line 106
    invoke-direct {v1, v6, v7, p1, v2}, La/doe;-><init>(JILa/yje;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, La/vsg0;

    .line 110
    .line 111
    invoke-direct {p1, v1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_7
    if-eqz v3, :cond_8

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    invoke-static {v3, v4}, La/sac;->M(J)La/vsg0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    goto :goto_4

    .line 126
    :cond_8
    const/4 p1, 0x6

    .line 127
    invoke-static {p1, v6, v7, v4, v5}, La/sac;->L(IJJ)La/vsg0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    :goto_4
    new-instance v1, La/a6o0;

    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    invoke-direct {v1, v0, v2, v3}, La/a6o0;-><init>(Ljava/lang/Long;La/yje;B)V

    .line 135
    .line 136
    .line 137
    new-instance v0, La/fnq;

    .line 138
    .line 139
    invoke-direct {v0, p1, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    new-instance p1, La/b6o0;

    .line 143
    .line 144
    invoke-direct {p1, p0, v2, v3}, La/b6o0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 145
    .line 146
    .line 147
    new-instance v1, La/fnq;

    .line 148
    .line 149
    const/4 v3, 0x4

    .line 150
    invoke-direct {v1, v0, p1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 151
    .line 152
    .line 153
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->getScope()La/vne;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    new-instance v0, La/tri0;

    .line 158
    .line 159
    const/4 v3, 0x2

    .line 160
    const/16 v4, 0x14

    .line 161
    .line 162
    invoke-direct {v0, v3, v2, v4}, La/tri0;-><init>(ILa/yje;B)V

    .line 163
    .line 164
    .line 165
    invoke-static {v1, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;->u:La/c4m0;

    .line 170
    .line 171
    :cond_9
    :goto_5
    return-void
.end method
